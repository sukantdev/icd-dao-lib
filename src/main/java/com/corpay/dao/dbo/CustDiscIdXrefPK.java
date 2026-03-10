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
public class CustDiscIdXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "DISC_ID")
    private String discId;

    public CustDiscIdXrefPK() {
    }

    public CustDiscIdXrefPK(String acctCd, String discId) {
        this.acctCd = acctCd;
        this.discId = discId;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getDiscId() {
        return discId;
    }

    public void setDiscId(String discId) {
        this.discId = discId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctCd != null ? acctCd.hashCode() : 0);
        hash += (discId != null ? discId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustDiscIdXrefPK)) {
            return false;
        }
        CustDiscIdXrefPK other = (CustDiscIdXrefPK) object;
        if ((this.acctCd == null && other.acctCd != null) || (this.acctCd != null && !this.acctCd.equals(other.acctCd))) {
            return false;
        }
        if ((this.discId == null && other.discId != null) || (this.discId != null && !this.discId.equals(other.discId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustDiscIdXrefPK[ acctCd=" + acctCd + ", discId=" + discId + " ]";
    }
    
}
