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
public class VpVlbTransactionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CDN_ACCT_NBR")
    private String cdnAcctNbr;
    @Basic(optional = false)
    @Column(name = "CNFRM_NBR")
    private String cnfrmNbr;
    @Basic(optional = false)
    @Column(name = "PYMNT_DT")
    @Temporal(TemporalType.DATE)
    private Date pymntDt;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private int seqNbr;

    public VpVlbTransactionPK() {
    }

    public VpVlbTransactionPK(String cdnAcctNbr, String cnfrmNbr, Date pymntDt, int seqNbr) {
        this.cdnAcctNbr = cdnAcctNbr;
        this.cnfrmNbr = cnfrmNbr;
        this.pymntDt = pymntDt;
        this.seqNbr = seqNbr;
    }

    public String getCdnAcctNbr() {
        return cdnAcctNbr;
    }

    public void setCdnAcctNbr(String cdnAcctNbr) {
        this.cdnAcctNbr = cdnAcctNbr;
    }

    public String getCnfrmNbr() {
        return cnfrmNbr;
    }

    public void setCnfrmNbr(String cnfrmNbr) {
        this.cnfrmNbr = cnfrmNbr;
    }

    public Date getPymntDt() {
        return pymntDt;
    }

    public void setPymntDt(Date pymntDt) {
        this.pymntDt = pymntDt;
    }

    public int getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(int seqNbr) {
        this.seqNbr = seqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdnAcctNbr != null ? cdnAcctNbr.hashCode() : 0);
        hash += (cnfrmNbr != null ? cnfrmNbr.hashCode() : 0);
        hash += (pymntDt != null ? pymntDt.hashCode() : 0);
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpVlbTransactionPK)) {
            return false;
        }
        VpVlbTransactionPK other = (VpVlbTransactionPK) object;
        if ((this.cdnAcctNbr == null && other.cdnAcctNbr != null) || (this.cdnAcctNbr != null && !this.cdnAcctNbr.equals(other.cdnAcctNbr))) {
            return false;
        }
        if ((this.cnfrmNbr == null && other.cnfrmNbr != null) || (this.cnfrmNbr != null && !this.cnfrmNbr.equals(other.cnfrmNbr))) {
            return false;
        }
        if ((this.pymntDt == null && other.pymntDt != null) || (this.pymntDt != null && !this.pymntDt.equals(other.pymntDt))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpVlbTransactionPK[ cdnAcctNbr=" + cdnAcctNbr + ", cnfrmNbr=" + cnfrmNbr + ", pymntDt=" + pymntDt + ", seqNbr=" + seqNbr + " ]";
    }
    
}
