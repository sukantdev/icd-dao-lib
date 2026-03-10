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
public class MarkupPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MKUP_FROM_CURR")
    private String mkupFromCurr;
    @Basic(optional = false)
    @Column(name = "MKUP_TO_CURR")
    private String mkupToCurr;

    public MarkupPK() {
    }

    public MarkupPK(String mkupFromCurr, String mkupToCurr) {
        this.mkupFromCurr = mkupFromCurr;
        this.mkupToCurr = mkupToCurr;
    }

    public String getMkupFromCurr() {
        return mkupFromCurr;
    }

    public void setMkupFromCurr(String mkupFromCurr) {
        this.mkupFromCurr = mkupFromCurr;
    }

    public String getMkupToCurr() {
        return mkupToCurr;
    }

    public void setMkupToCurr(String mkupToCurr) {
        this.mkupToCurr = mkupToCurr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mkupFromCurr != null ? mkupFromCurr.hashCode() : 0);
        hash += (mkupToCurr != null ? mkupToCurr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarkupPK)) {
            return false;
        }
        MarkupPK other = (MarkupPK) object;
        if ((this.mkupFromCurr == null && other.mkupFromCurr != null) || (this.mkupFromCurr != null && !this.mkupFromCurr.equals(other.mkupFromCurr))) {
            return false;
        }
        if ((this.mkupToCurr == null && other.mkupToCurr != null) || (this.mkupToCurr != null && !this.mkupToCurr.equals(other.mkupToCurr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MarkupPK[ mkupFromCurr=" + mkupFromCurr + ", mkupToCurr=" + mkupToCurr + " ]";
    }
    
}
