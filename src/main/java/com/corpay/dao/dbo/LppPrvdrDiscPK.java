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
public class LppPrvdrDiscPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "LPP_ABBRV_NM")
    private String lppAbbrvNm;
    @Basic(optional = false)
    @Column(name = "LPP_PRVDR_PRD")
    private short lppPrvdrPrd;

    public LppPrvdrDiscPK() {
    }

    public LppPrvdrDiscPK(String lppAbbrvNm, short lppPrvdrPrd) {
        this.lppAbbrvNm = lppAbbrvNm;
        this.lppPrvdrPrd = lppPrvdrPrd;
    }

    public String getLppAbbrvNm() {
        return lppAbbrvNm;
    }

    public void setLppAbbrvNm(String lppAbbrvNm) {
        this.lppAbbrvNm = lppAbbrvNm;
    }

    public short getLppPrvdrPrd() {
        return lppPrvdrPrd;
    }

    public void setLppPrvdrPrd(short lppPrvdrPrd) {
        this.lppPrvdrPrd = lppPrvdrPrd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lppAbbrvNm != null ? lppAbbrvNm.hashCode() : 0);
        hash += (int) lppPrvdrPrd;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LppPrvdrDiscPK)) {
            return false;
        }
        LppPrvdrDiscPK other = (LppPrvdrDiscPK) object;
        if ((this.lppAbbrvNm == null && other.lppAbbrvNm != null) || (this.lppAbbrvNm != null && !this.lppAbbrvNm.equals(other.lppAbbrvNm))) {
            return false;
        }
        if (this.lppPrvdrPrd != other.lppPrvdrPrd) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.LppPrvdrDiscPK[ lppAbbrvNm=" + lppAbbrvNm + ", lppPrvdrPrd=" + lppPrvdrPrd + " ]";
    }
    
}
