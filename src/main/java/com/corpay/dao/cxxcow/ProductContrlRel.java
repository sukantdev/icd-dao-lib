/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PRODUCT_CONTRL_REL", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "ProductContrlRel.findAll", query = "SELECT p FROM ProductContrlRel p"),
    @NamedQuery(name = "ProductContrlRel.findByProdcId", query = "SELECT p FROM ProductContrlRel p WHERE p.productContrlRelPK.prodcId = :prodcId"),
    @NamedQuery(name = "ProductContrlRel.findByProdcIdSub", query = "SELECT p FROM ProductContrlRel p WHERE p.productContrlRelPK.prodcIdSub = :prodcIdSub")})
public class ProductContrlRel implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductContrlRelPK productContrlRelPK;

    public ProductContrlRel() {
    }

    public ProductContrlRel(ProductContrlRelPK productContrlRelPK) {
        this.productContrlRelPK = productContrlRelPK;
    }

    public ProductContrlRel(int prodcId, int prodcIdSub) {
        this.productContrlRelPK = new ProductContrlRelPK(prodcId, prodcIdSub);
    }

    public ProductContrlRelPK getProductContrlRelPK() {
        return productContrlRelPK;
    }

    public void setProductContrlRelPK(ProductContrlRelPK productContrlRelPK) {
        this.productContrlRelPK = productContrlRelPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productContrlRelPK != null ? productContrlRelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductContrlRel)) {
            return false;
        }
        ProductContrlRel other = (ProductContrlRel) object;
        if ((this.productContrlRelPK == null && other.productContrlRelPK != null) || (this.productContrlRelPK != null && !this.productContrlRelPK.equals(other.productContrlRelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProductContrlRel[ productContrlRelPK=" + productContrlRelPK + " ]";
    }
    
}
