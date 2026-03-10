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
public class CrApplFeesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "FEE_NM")
    private String feeNm;

    public CrApplFeesPK() {
    }

    public CrApplFeesPK(String applNbr, String feeNm) {
        this.applNbr = applNbr;
        this.feeNm = feeNm;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getFeeNm() {
        return feeNm;
    }

    public void setFeeNm(String feeNm) {
        this.feeNm = feeNm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (feeNm != null ? feeNm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrApplFeesPK)) {
            return false;
        }
        CrApplFeesPK other = (CrApplFeesPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.feeNm == null && other.feeNm != null) || (this.feeNm != null && !this.feeNm.equals(other.feeNm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplFeesPK[ applNbr=" + applNbr + ", feeNm=" + feeNm + " ]";
    }
    
}
