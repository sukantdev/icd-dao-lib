package com.corpay.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseRepository<T, ID extends Serializable> {
    
    T save(T entity);
    
    T saveOrUpdate(T entity);
    
    Optional<T> findById(ID id);
    
    List<T> findAll();
    
    List<T> findAll(int offset, int limit);
    
    long count();
    
    void delete(T entity);
    
    void deleteById(ID id);
    
    boolean existsById(ID id);
    
    void flush();
    
    void refresh(T entity);
}
