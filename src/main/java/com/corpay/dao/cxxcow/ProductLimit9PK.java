/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class ProductLimit9PK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PRDL_CUST_ID")
    private String prdlCustId;
    @Basic(optional = false)
    @Column(name = "PRDL_CC_TYPE")
    private Character prdlCcType;
    @Basic(optional = false)
    @Column(name = "PRDL_PROFILE_ID")
    private long prdlProfileId;
    @Basic(optional = false)
    @Column(name = "PRODC_ID")
    private int prodcId;

    public ProductLimit9PK() {
    }

    public ProductLimit9PK(String prdlCustId, Character prdlCcType, long prdlProfileId, int prodcId) {
        this.prdlCustId = prdlCustId;
        this.prdlCcType = prdlCcType;
        this.prdlProfileId = prdlProfileId;
        this.prodcId = prodcId;
    }

    public String getPrdlCustId() {
        return prdlCustId;
    }

    public void setPrdlCustId(String prdlCustId) {
        this.prdlCustId = prdlCustId;
    }

    public Character getPrdlCcType() {
        return prdlCcType;
    }

    public void setPrdlCcType(Character prdlCcType) {
        this.prdlCcType = prdlCcType;
    }

    public long getPrdlProfileId() {
        return prdlProfileId;
    }

    public void setPrdlProfileId(long prdlProfileId) {
        this.prdlProfileId = prdlProfileId;
    }

    public int getProdcId() {
        return prodcId;
    }

    public void setProdcId(int prodcId) {
        this.prodcId = prodcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdlCustId != null ? prdlCustId.hashCode() : 0);
        hash += (prdlCcType != null ? prdlCcType.hashCode() : 0);
        hash += (int) prdlProfileId;
        hash += (int) prodcId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductLimit9PK)) {
            return false;
        }
        ProductLimit9PK other = (ProductLimit9PK) object;
        if ((this.prdlCustId == null && other.prdlCustId != null) || (this.prdlCustId != null && !this.prdlCustId.equals(other.prdlCustId))) {
            return false;
        }
        if ((this.prdlCcType == null && other.prdlCcType != null) || (this.prdlCcType != null && !this.prdlCcType.equals(other.prdlCcType))) {
            return false;
        }
        if (this.prdlProfileId != other.prdlProfileId) {
            return false;
        }
        if (this.prodcId != other.prodcId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProductLimit9PK[ prdlCustId=" + prdlCustId + ", prdlCcType=" + prdlCcType + ", prdlProfileId=" + prdlProfileId + ", prodcId=" + prodcId + " ]";
    }
    
}
