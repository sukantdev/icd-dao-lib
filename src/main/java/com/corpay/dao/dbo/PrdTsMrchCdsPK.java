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
public class PrdTsMrchCdsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CD_TYP")
    private String cdTyp;

    public PrdTsMrchCdsPK() {
    }

    public PrdTsMrchCdsPK(String applNbr, String cdTyp) {
        this.applNbr = applNbr;
        this.cdTyp = cdTyp;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getCdTyp() {
        return cdTyp;
    }

    public void setCdTyp(String cdTyp) {
        this.cdTyp = cdTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (cdTyp != null ? cdTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdTsMrchCdsPK)) {
            return false;
        }
        PrdTsMrchCdsPK other = (PrdTsMrchCdsPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.cdTyp == null && other.cdTyp != null) || (this.cdTyp != null && !this.cdTyp.equals(other.cdTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTsMrchCdsPK[ applNbr=" + applNbr + ", cdTyp=" + cdTyp + " ]";
    }
    
}
