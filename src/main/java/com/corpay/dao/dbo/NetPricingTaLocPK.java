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
public class NetPricingTaLocPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "KEY_TO_TA_LOC")
    private String keyToTaLoc;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;

    public NetPricingTaLocPK() {
    }

    public NetPricingTaLocPK(String keyToTaLoc, String locCd, String prdCd) {
        this.keyToTaLoc = keyToTaLoc;
        this.locCd = locCd;
        this.prdCd = prdCd;
    }

    public String getKeyToTaLoc() {
        return keyToTaLoc;
    }

    public void setKeyToTaLoc(String keyToTaLoc) {
        this.keyToTaLoc = keyToTaLoc;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyToTaLoc != null ? keyToTaLoc.hashCode() : 0);
        hash += (locCd != null ? locCd.hashCode() : 0);
        hash += (prdCd != null ? prdCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NetPricingTaLocPK)) {
            return false;
        }
        NetPricingTaLocPK other = (NetPricingTaLocPK) object;
        if ((this.keyToTaLoc == null && other.keyToTaLoc != null) || (this.keyToTaLoc != null && !this.keyToTaLoc.equals(other.keyToTaLoc))) {
            return false;
        }
        if ((this.locCd == null && other.locCd != null) || (this.locCd != null && !this.locCd.equals(other.locCd))) {
            return false;
        }
        if ((this.prdCd == null && other.prdCd != null) || (this.prdCd != null && !this.prdCd.equals(other.prdCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NetPricingTaLocPK[ keyToTaLoc=" + keyToTaLoc + ", locCd=" + locCd + ", prdCd=" + prdCd + " ]";
    }
    
}
