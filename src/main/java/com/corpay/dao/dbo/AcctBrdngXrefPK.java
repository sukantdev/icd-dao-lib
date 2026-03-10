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
public class AcctBrdngXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BRDNG_CD")
    private String brdngCd;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;

    public AcctBrdngXrefPK() {
    }

    public AcctBrdngXrefPK(String brdngCd, String acctNbr) {
        this.brdngCd = brdngCd;
        this.acctNbr = acctNbr;
    }

    public String getBrdngCd() {
        return brdngCd;
    }

    public void setBrdngCd(String brdngCd) {
        this.brdngCd = brdngCd;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brdngCd != null ? brdngCd.hashCode() : 0);
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctBrdngXrefPK)) {
            return false;
        }
        AcctBrdngXrefPK other = (AcctBrdngXrefPK) object;
        if ((this.brdngCd == null && other.brdngCd != null) || (this.brdngCd != null && !this.brdngCd.equals(other.brdngCd))) {
            return false;
        }
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctBrdngXrefPK[ brdngCd=" + brdngCd + ", acctNbr=" + acctNbr + " ]";
    }
    
}
