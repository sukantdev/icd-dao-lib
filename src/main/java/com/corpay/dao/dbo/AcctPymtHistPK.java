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
public class AcctPymtHistPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PH_ACCT_CD")
    private String phAcctCd;
    @Basic(optional = false)
    @Column(name = "PH_PYMT_DT")
    @Temporal(TemporalType.DATE)
    private Date phPymtDt;
    @Basic(optional = false)
    @Column(name = "PH_PYMT_DT_SEQ_NBR")
    private int phPymtDtSeqNbr;

    public AcctPymtHistPK() {
    }

    public AcctPymtHistPK(String phAcctCd, Date phPymtDt, int phPymtDtSeqNbr) {
        this.phAcctCd = phAcctCd;
        this.phPymtDt = phPymtDt;
        this.phPymtDtSeqNbr = phPymtDtSeqNbr;
    }

    public String getPhAcctCd() {
        return phAcctCd;
    }

    public void setPhAcctCd(String phAcctCd) {
        this.phAcctCd = phAcctCd;
    }

    public Date getPhPymtDt() {
        return phPymtDt;
    }

    public void setPhPymtDt(Date phPymtDt) {
        this.phPymtDt = phPymtDt;
    }

    public int getPhPymtDtSeqNbr() {
        return phPymtDtSeqNbr;
    }

    public void setPhPymtDtSeqNbr(int phPymtDtSeqNbr) {
        this.phPymtDtSeqNbr = phPymtDtSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phAcctCd != null ? phAcctCd.hashCode() : 0);
        hash += (phPymtDt != null ? phPymtDt.hashCode() : 0);
        hash += (int) phPymtDtSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctPymtHistPK)) {
            return false;
        }
        AcctPymtHistPK other = (AcctPymtHistPK) object;
        if ((this.phAcctCd == null && other.phAcctCd != null) || (this.phAcctCd != null && !this.phAcctCd.equals(other.phAcctCd))) {
            return false;
        }
        if ((this.phPymtDt == null && other.phPymtDt != null) || (this.phPymtDt != null && !this.phPymtDt.equals(other.phPymtDt))) {
            return false;
        }
        if (this.phPymtDtSeqNbr != other.phPymtDtSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctPymtHistPK[ phAcctCd=" + phAcctCd + ", phPymtDt=" + phPymtDt + ", phPymtDtSeqNbr=" + phPymtDtSeqNbr + " ]";
    }
    
}
