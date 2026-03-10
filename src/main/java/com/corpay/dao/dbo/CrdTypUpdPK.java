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
public class CrdTypUpdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "NEW_EXP_DT")
    private short newExpDt;

    public CrdTypUpdPK() {
    }

    public CrdTypUpdPK(String crdNbr, short newExpDt) {
        this.crdNbr = crdNbr;
        this.newExpDt = newExpDt;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public short getNewExpDt() {
        return newExpDt;
    }

    public void setNewExpDt(short newExpDt) {
        this.newExpDt = newExpDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        hash += (int) newExpDt;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdTypUpdPK)) {
            return false;
        }
        CrdTypUpdPK other = (CrdTypUpdPK) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        if (this.newExpDt != other.newExpDt) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdTypUpdPK[ crdNbr=" + crdNbr + ", newExpDt=" + newExpDt + " ]";
    }
    
}
