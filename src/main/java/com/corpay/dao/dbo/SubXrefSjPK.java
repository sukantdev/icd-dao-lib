/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class SubXrefSjPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PROD_CD")
    private int prodCd;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_1")
    private int subProd1;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_2")
    private int subProd2;

    public SubXrefSjPK() {
    }

    public SubXrefSjPK(int prodCd, int subProd1, int subProd2) {
        this.prodCd = prodCd;
        this.subProd1 = subProd1;
        this.subProd2 = subProd2;
    }

    public int getProdCd() {
        return prodCd;
    }

    public void setProdCd(int prodCd) {
        this.prodCd = prodCd;
    }

    public int getSubProd1() {
        return subProd1;
    }

    public void setSubProd1(int subProd1) {
        this.subProd1 = subProd1;
    }

    public int getSubProd2() {
        return subProd2;
    }

    public void setSubProd2(int subProd2) {
        this.subProd2 = subProd2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prodCd;
        hash += (int) subProd1;
        hash += (int) subProd2;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubXrefSjPK)) {
            return false;
        }
        SubXrefSjPK other = (SubXrefSjPK) object;
        if (this.prodCd != other.prodCd) {
            return false;
        }
        if (this.subProd1 != other.subProd1) {
            return false;
        }
        if (this.subProd2 != other.subProd2) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SubXrefSjPK[ prodCd=" + prodCd + ", subProd1=" + subProd1 + ", subProd2=" + subProd2 + " ]";
    }
    
}
