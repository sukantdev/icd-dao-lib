package com.corpay.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public abstract class AbstractBaseRepository<T, ID extends Serializable> implements BaseRepository<T, ID> {

    @PersistenceContext(unitName = "dao-lib")
    protected EntityManager entityManager;

    private final Class<T> entityClass;

    protected AbstractBaseRepository(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public T save(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public T saveOrUpdate(T entity) {
        return entityManager.merge(entity);
    }

    @Override
    public Optional<T> findById(ID id) {
        T entity = entityManager.find(entityClass, id);
        return Optional.ofNullable(entity);
    }

    @Override
    public List<T> findAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityClass);
        Root<T> root = cq.from(entityClass);
        cq.select(root);
        return entityManager.createQuery(cq).getResultList();
    }

    @Override
    public List<T> findAll(int offset, int limit) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityClass);
        Root<T> root = cq.from(entityClass);
        cq.select(root);
        TypedQuery<T> query = entityManager.createQuery(cq);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

    @Override
    public long count() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<T> root = cq.from(entityClass);
        cq.select(cb.count(root));
        return entityManager.createQuery(cq).getSingleResult();
    }

    @Override
    public void delete(T entity) {
        if (entityManager.contains(entity)) {
            entityManager.remove(entity);
        } else {
            entityManager.remove(entityManager.merge(entity));
        }
    }

    @Override
    public void deleteById(ID id) {
        findById(id).ifPresent(this::delete);
    }

    @Override
    public boolean existsById(ID id) {
        return findById(id).isPresent();
    }

    @Override
    public void flush() {
        entityManager.flush();
    }

    @Override
    public void refresh(T entity) {
        entityManager.refresh(entity);
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    protected Class<T> getEntityClass() {
        return entityClass;
    }

    protected List<T> executeNamedQuery(String queryName) {
        return entityManager.createNamedQuery(queryName, entityClass).getResultList();
    }

    protected List<T> executeNamedQuery(String queryName, Object... params) {
        TypedQuery<T> query = entityManager.createNamedQuery(queryName, entityClass);
        for (int i = 0; i < params.length; i += 2) {
            query.setParameter((String) params[i], params[i + 1]);
        }
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    protected List<T> executeNativeQuery(String sql) {
        return entityManager.createNativeQuery(sql, entityClass).getResultList();
    }

    @SuppressWarnings("unchecked")
    protected List<T> executeNativeQuery(String sql, Object... params) {
        Query query = entityManager.createNativeQuery(sql, entityClass);
        for (int i = 0; i < params.length; i += 2) {
            query.setParameter((String) params[i], params[i + 1]);
        }
        return query.getResultList();
    }

    protected int executeNativeUpdate(String sql, Object... params) {
        Query query = entityManager.createNativeQuery(sql);
        for (int i = 0; i < params.length; i += 2) {
            query.setParameter((String) params[i], params[i + 1]);
        }
        return query.executeUpdate();
    }
}
