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
public class ProdLmtNtwrkPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PRDLN_KEY")
    private String prdlnKey;
    @Basic(optional = false)
    @Column(name = "PRODC_ID")
    private int prodcId;

    public ProdLmtNtwrkPK() {
    }

    public ProdLmtNtwrkPK(String prdlnKey, int prodcId) {
        this.prdlnKey = prdlnKey;
        this.prodcId = prodcId;
    }

    public String getPrdlnKey() {
        return prdlnKey;
    }

    public void setPrdlnKey(String prdlnKey) {
        this.prdlnKey = prdlnKey;
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
        hash += (prdlnKey != null ? prdlnKey.hashCode() : 0);
        hash += (int) prodcId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdLmtNtwrkPK)) {
            return false;
        }
        ProdLmtNtwrkPK other = (ProdLmtNtwrkPK) object;
        if ((this.prdlnKey == null && other.prdlnKey != null) || (this.prdlnKey != null && !this.prdlnKey.equals(other.prdlnKey))) {
            return false;
        }
        if (this.prodcId != other.prodcId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProdLmtNtwrkPK[ prdlnKey=" + prdlnKey + ", prodcId=" + prodcId + " ]";
    }
    
}
