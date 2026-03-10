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
public class PrdTsMrchRptsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "RPT_CD")
    private String rptCd;

    public PrdTsMrchRptsPK() {
    }

    public PrdTsMrchRptsPK(String applNbr, String rptCd) {
        this.applNbr = applNbr;
        this.rptCd = rptCd;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getRptCd() {
        return rptCd;
    }

    public void setRptCd(String rptCd) {
        this.rptCd = rptCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (rptCd != null ? rptCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdTsMrchRptsPK)) {
            return false;
        }
        PrdTsMrchRptsPK other = (PrdTsMrchRptsPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.rptCd == null && other.rptCd != null) || (this.rptCd != null && !this.rptCd.equals(other.rptCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTsMrchRptsPK[ applNbr=" + applNbr + ", rptCd=" + rptCd + " ]";
    }
    
}
