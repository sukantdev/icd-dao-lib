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
public class FlconsTestPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "FBO_MRCH_CD")
    private String fboMrchCd;
    @Basic(optional = false)
    @Column(name = "FC_MRCH_CD")
    private String fcMrchCd;
    @Basic(optional = false)
    @Column(name = "TIER")
    private int tier;

    public FlconsTestPK() {
    }

    public FlconsTestPK(String fboMrchCd, String fcMrchCd, int tier) {
        this.fboMrchCd = fboMrchCd;
        this.fcMrchCd = fcMrchCd;
        this.tier = tier;
    }

    public String getFboMrchCd() {
        return fboMrchCd;
    }

    public void setFboMrchCd(String fboMrchCd) {
        this.fboMrchCd = fboMrchCd;
    }

    public String getFcMrchCd() {
        return fcMrchCd;
    }

    public void setFcMrchCd(String fcMrchCd) {
        this.fcMrchCd = fcMrchCd;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fboMrchCd != null ? fboMrchCd.hashCode() : 0);
        hash += (fcMrchCd != null ? fcMrchCd.hashCode() : 0);
        hash += (int) tier;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlconsTestPK)) {
            return false;
        }
        FlconsTestPK other = (FlconsTestPK) object;
        if ((this.fboMrchCd == null && other.fboMrchCd != null) || (this.fboMrchCd != null && !this.fboMrchCd.equals(other.fboMrchCd))) {
            return false;
        }
        if ((this.fcMrchCd == null && other.fcMrchCd != null) || (this.fcMrchCd != null && !this.fcMrchCd.equals(other.fcMrchCd))) {
            return false;
        }
        if (this.tier != other.tier) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FlconsTestPK[ fboMrchCd=" + fboMrchCd + ", fcMrchCd=" + fcMrchCd + ", tier=" + tier + " ]";
    }
    
}
