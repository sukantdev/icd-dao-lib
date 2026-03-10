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
public class CrdTypStylePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_TYP_CD")
    private String crdTypCd;
    @Basic(optional = false)
    @Column(name = "CRD_STYLE_CD")
    private String crdStyleCd;

    public CrdTypStylePK() {
    }

    public CrdTypStylePK(String crdTypCd, String crdStyleCd) {
        this.crdTypCd = crdTypCd;
        this.crdStyleCd = crdStyleCd;
    }

    public String getCrdTypCd() {
        return crdTypCd;
    }

    public void setCrdTypCd(String crdTypCd) {
        this.crdTypCd = crdTypCd;
    }

    public String getCrdStyleCd() {
        return crdStyleCd;
    }

    public void setCrdStyleCd(String crdStyleCd) {
        this.crdStyleCd = crdStyleCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdTypCd != null ? crdTypCd.hashCode() : 0);
        hash += (crdStyleCd != null ? crdStyleCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdTypStylePK)) {
            return false;
        }
        CrdTypStylePK other = (CrdTypStylePK) object;
        if ((this.crdTypCd == null && other.crdTypCd != null) || (this.crdTypCd != null && !this.crdTypCd.equals(other.crdTypCd))) {
            return false;
        }
        if ((this.crdStyleCd == null && other.crdStyleCd != null) || (this.crdStyleCd != null && !this.crdStyleCd.equals(other.crdStyleCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdTypStylePK[ crdTypCd=" + crdTypCd + ", crdStyleCd=" + crdStyleCd + " ]";
    }
    
}
