/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class ThrdPacPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "THRD_PAC_ID")
    private String thrdPacId;
    @Basic(optional = false)
    @Column(name = "THRD_PAC_XREF_NBR")
    private String thrdPacXrefNbr;

    public ThrdPacPK() {
    }

    public ThrdPacPK(String thrdPacId, String thrdPacXrefNbr) {
        this.thrdPacId = thrdPacId;
        this.thrdPacXrefNbr = thrdPacXrefNbr;
    }

    public String getThrdPacId() {
        return thrdPacId;
    }

    public void setThrdPacId(String thrdPacId) {
        this.thrdPacId = thrdPacId;
    }

    public String getThrdPacXrefNbr() {
        return thrdPacXrefNbr;
    }

    public void setThrdPacXrefNbr(String thrdPacXrefNbr) {
        this.thrdPacXrefNbr = thrdPacXrefNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (thrdPacId != null ? thrdPacId.hashCode() : 0);
        hash += (thrdPacXrefNbr != null ? thrdPacXrefNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ThrdPacPK)) {
            return false;
        }
        ThrdPacPK other = (ThrdPacPK) object;
        if ((this.thrdPacId == null && other.thrdPacId != null) || (this.thrdPacId != null && !this.thrdPacId.equals(other.thrdPacId))) {
            return false;
        }
        if ((this.thrdPacXrefNbr == null && other.thrdPacXrefNbr != null) || (this.thrdPacXrefNbr != null && !this.thrdPacXrefNbr.equals(other.thrdPacXrefNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ThrdPacPK[ thrdPacId=" + thrdPacId + ", thrdPacXrefNbr=" + thrdPacXrefNbr + " ]";
    }
    
}
