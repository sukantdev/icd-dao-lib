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
public class SubProdXlatePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CD_TYP")
    private Character cdTyp;
    @Basic(optional = false)
    @Column(name = "IN_SUB_PROD_CD")
    private String inSubProdCd;

    public SubProdXlatePK() {
    }

    public SubProdXlatePK(Character cdTyp, String inSubProdCd) {
        this.cdTyp = cdTyp;
        this.inSubProdCd = inSubProdCd;
    }

    public Character getCdTyp() {
        return cdTyp;
    }

    public void setCdTyp(Character cdTyp) {
        this.cdTyp = cdTyp;
    }

    public String getInSubProdCd() {
        return inSubProdCd;
    }

    public void setInSubProdCd(String inSubProdCd) {
        this.inSubProdCd = inSubProdCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdTyp != null ? cdTyp.hashCode() : 0);
        hash += (inSubProdCd != null ? inSubProdCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubProdXlatePK)) {
            return false;
        }
        SubProdXlatePK other = (SubProdXlatePK) object;
        if ((this.cdTyp == null && other.cdTyp != null) || (this.cdTyp != null && !this.cdTyp.equals(other.cdTyp))) {
            return false;
        }
        if ((this.inSubProdCd == null && other.inSubProdCd != null) || (this.inSubProdCd != null && !this.inSubProdCd.equals(other.inSubProdCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SubProdXlatePK[ cdTyp=" + cdTyp + ", inSubProdCd=" + inSubProdCd + " ]";
    }
    
}
