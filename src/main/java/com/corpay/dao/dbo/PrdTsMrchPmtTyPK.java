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
public class PrdTsMrchPmtTyPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "PMT_TYP")
    private String pmtTyp;

    public PrdTsMrchPmtTyPK() {
    }

    public PrdTsMrchPmtTyPK(String applNbr, String pmtTyp) {
        this.applNbr = applNbr;
        this.pmtTyp = pmtTyp;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getPmtTyp() {
        return pmtTyp;
    }

    public void setPmtTyp(String pmtTyp) {
        this.pmtTyp = pmtTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (pmtTyp != null ? pmtTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdTsMrchPmtTyPK)) {
            return false;
        }
        PrdTsMrchPmtTyPK other = (PrdTsMrchPmtTyPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.pmtTyp == null && other.pmtTyp != null) || (this.pmtTyp != null && !this.pmtTyp.equals(other.pmtTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTsMrchPmtTyPK[ applNbr=" + applNbr + ", pmtTyp=" + pmtTyp + " ]";
    }
    
}
