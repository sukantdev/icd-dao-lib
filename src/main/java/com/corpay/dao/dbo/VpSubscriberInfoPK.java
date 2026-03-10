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
public class VpSubscriberInfoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BATCH_ID")
    private String batchId;
    @Basic(optional = false)
    @Column(name = "BATCH_SEQ_NBR")
    private long batchSeqNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;

    public VpSubscriberInfoPK() {
    }

    public VpSubscriberInfoPK(String batchId, long batchSeqNbr, String custId, String acctNbr) {
        this.batchId = batchId;
        this.batchSeqNbr = batchSeqNbr;
        this.custId = custId;
        this.acctNbr = acctNbr;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public long getBatchSeqNbr() {
        return batchSeqNbr;
    }

    public void setBatchSeqNbr(long batchSeqNbr) {
        this.batchSeqNbr = batchSeqNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
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
        hash += (batchId != null ? batchId.hashCode() : 0);
        hash += (int) batchSeqNbr;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpSubscriberInfoPK)) {
            return false;
        }
        VpSubscriberInfoPK other = (VpSubscriberInfoPK) object;
        if ((this.batchId == null && other.batchId != null) || (this.batchId != null && !this.batchId.equals(other.batchId))) {
            return false;
        }
        if (this.batchSeqNbr != other.batchSeqNbr) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpSubscriberInfoPK[ batchId=" + batchId + ", batchSeqNbr=" + batchSeqNbr + ", custId=" + custId + ", acctNbr=" + acctNbr + " ]";
    }
    
}
