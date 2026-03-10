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
public class ProductContrlRelPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PRODC_ID")
    private int prodcId;
    @Basic(optional = false)
    @Column(name = "PRODC_ID_SUB")
    private int prodcIdSub;

    public ProductContrlRelPK() {
    }

    public ProductContrlRelPK(int prodcId, int prodcIdSub) {
        this.prodcId = prodcId;
        this.prodcIdSub = prodcIdSub;
    }

    public int getProdcId() {
        return prodcId;
    }

    public void setProdcId(int prodcId) {
        this.prodcId = prodcId;
    }

    public int getProdcIdSub() {
        return prodcIdSub;
    }

    public void setProdcIdSub(int prodcIdSub) {
        this.prodcIdSub = prodcIdSub;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prodcId;
        hash += (int) prodcIdSub;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductContrlRelPK)) {
            return false;
        }
        ProductContrlRelPK other = (ProductContrlRelPK) object;
        if (this.prodcId != other.prodcId) {
            return false;
        }
        if (this.prodcIdSub != other.prodcIdSub) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProductContrlRelPK[ prodcId=" + prodcId + ", prodcIdSub=" + prodcIdSub + " ]";
    }
    
}
