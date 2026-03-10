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
public class CrdTypFrmtFlgsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_TYP")
    private String crdTyp;
    @Basic(optional = false)
    @Column(name = "CRD_FRMT")
    private String crdFrmt;

    public CrdTypFrmtFlgsPK() {
    }

    public CrdTypFrmtFlgsPK(String crdTyp, String crdFrmt) {
        this.crdTyp = crdTyp;
        this.crdFrmt = crdFrmt;
    }

    public String getCrdTyp() {
        return crdTyp;
    }

    public void setCrdTyp(String crdTyp) {
        this.crdTyp = crdTyp;
    }

    public String getCrdFrmt() {
        return crdFrmt;
    }

    public void setCrdFrmt(String crdFrmt) {
        this.crdFrmt = crdFrmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdTyp != null ? crdTyp.hashCode() : 0);
        hash += (crdFrmt != null ? crdFrmt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdTypFrmtFlgsPK)) {
            return false;
        }
        CrdTypFrmtFlgsPK other = (CrdTypFrmtFlgsPK) object;
        if ((this.crdTyp == null && other.crdTyp != null) || (this.crdTyp != null && !this.crdTyp.equals(other.crdTyp))) {
            return false;
        }
        if ((this.crdFrmt == null && other.crdFrmt != null) || (this.crdFrmt != null && !this.crdFrmt.equals(other.crdFrmt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdTypFrmtFlgsPK[ crdTyp=" + crdTyp + ", crdFrmt=" + crdFrmt + " ]";
    }
    
}
