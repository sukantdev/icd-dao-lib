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
public class AcctAcctXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "AA_PRNT_ACCT_CD")
    private String aaPrntAcctCd;
    @Basic(optional = false)
    @Column(name = "AA_CHLD_ACCT_CD")
    private String aaChldAcctCd;
    @Basic(optional = false)
    @Column(name = "AA_TYP_CD")
    private String aaTypCd;

    public AcctAcctXrefPK() {
    }

    public AcctAcctXrefPK(String aaPrntAcctCd, String aaChldAcctCd, String aaTypCd) {
        this.aaPrntAcctCd = aaPrntAcctCd;
        this.aaChldAcctCd = aaChldAcctCd;
        this.aaTypCd = aaTypCd;
    }

    public String getAaPrntAcctCd() {
        return aaPrntAcctCd;
    }

    public void setAaPrntAcctCd(String aaPrntAcctCd) {
        this.aaPrntAcctCd = aaPrntAcctCd;
    }

    public String getAaChldAcctCd() {
        return aaChldAcctCd;
    }

    public void setAaChldAcctCd(String aaChldAcctCd) {
        this.aaChldAcctCd = aaChldAcctCd;
    }

    public String getAaTypCd() {
        return aaTypCd;
    }

    public void setAaTypCd(String aaTypCd) {
        this.aaTypCd = aaTypCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aaPrntAcctCd != null ? aaPrntAcctCd.hashCode() : 0);
        hash += (aaChldAcctCd != null ? aaChldAcctCd.hashCode() : 0);
        hash += (aaTypCd != null ? aaTypCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctAcctXrefPK)) {
            return false;
        }
        AcctAcctXrefPK other = (AcctAcctXrefPK) object;
        if ((this.aaPrntAcctCd == null && other.aaPrntAcctCd != null) || (this.aaPrntAcctCd != null && !this.aaPrntAcctCd.equals(other.aaPrntAcctCd))) {
            return false;
        }
        if ((this.aaChldAcctCd == null && other.aaChldAcctCd != null) || (this.aaChldAcctCd != null && !this.aaChldAcctCd.equals(other.aaChldAcctCd))) {
            return false;
        }
        if ((this.aaTypCd == null && other.aaTypCd != null) || (this.aaTypCd != null && !this.aaTypCd.equals(other.aaTypCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctAcctXrefPK[ aaPrntAcctCd=" + aaPrntAcctCd + ", aaChldAcctCd=" + aaChldAcctCd + ", aaTypCd=" + aaTypCd + " ]";
    }
    
}
