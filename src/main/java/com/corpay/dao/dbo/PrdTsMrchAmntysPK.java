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
public class PrdTsMrchAmntysPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "AMNTY")
    private String amnty;

    public PrdTsMrchAmntysPK() {
    }

    public PrdTsMrchAmntysPK(String applNbr, String amnty) {
        this.applNbr = applNbr;
        this.amnty = amnty;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getAmnty() {
        return amnty;
    }

    public void setAmnty(String amnty) {
        this.amnty = amnty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (amnty != null ? amnty.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdTsMrchAmntysPK)) {
            return false;
        }
        PrdTsMrchAmntysPK other = (PrdTsMrchAmntysPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.amnty == null && other.amnty != null) || (this.amnty != null && !this.amnty.equals(other.amnty))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTsMrchAmntysPK[ applNbr=" + applNbr + ", amnty=" + amnty + " ]";
    }
    
}
