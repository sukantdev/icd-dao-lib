/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class CrdHldConsentPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "CONSENT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date consentTs;

    public CrdHldConsentPK() {
    }

    public CrdHldConsentPK(String crdTknNbr, Date consentTs) {
        this.crdTknNbr = crdTknNbr;
        this.consentTs = consentTs;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public Date getConsentTs() {
        return consentTs;
    }

    public void setConsentTs(Date consentTs) {
        this.consentTs = consentTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdTknNbr != null ? crdTknNbr.hashCode() : 0);
        hash += (consentTs != null ? consentTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdHldConsentPK)) {
            return false;
        }
        CrdHldConsentPK other = (CrdHldConsentPK) object;
        if ((this.crdTknNbr == null && other.crdTknNbr != null) || (this.crdTknNbr != null && !this.crdTknNbr.equals(other.crdTknNbr))) {
            return false;
        }
        if ((this.consentTs == null && other.consentTs != null) || (this.consentTs != null && !this.consentTs.equals(other.consentTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdHldConsentPK[ crdTknNbr=" + crdTknNbr + ", consentTs=" + consentTs + " ]";
    }
    
}
