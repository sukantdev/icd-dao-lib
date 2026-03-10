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
public class VmcBatchPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_NBR")
    private String custNbr;
    @Basic(optional = false)
    @Column(name = "CUST_BATCH_NBR")
    private String custBatchNbr;
    @Basic(optional = false)
    @Column(name = "BATCH_ID")
    private String batchId;

    public VmcBatchPK() {
    }

    public VmcBatchPK(String acctNbr, String custNbr, String custBatchNbr, String batchId) {
        this.acctNbr = acctNbr;
        this.custNbr = custNbr;
        this.custBatchNbr = custBatchNbr;
        this.batchId = batchId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustNbr() {
        return custNbr;
    }

    public void setCustNbr(String custNbr) {
        this.custNbr = custNbr;
    }

    public String getCustBatchNbr() {
        return custBatchNbr;
    }

    public void setCustBatchNbr(String custBatchNbr) {
        this.custBatchNbr = custBatchNbr;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custNbr != null ? custNbr.hashCode() : 0);
        hash += (custBatchNbr != null ? custBatchNbr.hashCode() : 0);
        hash += (batchId != null ? batchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VmcBatchPK)) {
            return false;
        }
        VmcBatchPK other = (VmcBatchPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custNbr == null && other.custNbr != null) || (this.custNbr != null && !this.custNbr.equals(other.custNbr))) {
            return false;
        }
        if ((this.custBatchNbr == null && other.custBatchNbr != null) || (this.custBatchNbr != null && !this.custBatchNbr.equals(other.custBatchNbr))) {
            return false;
        }
        if ((this.batchId == null && other.batchId != null) || (this.batchId != null && !this.batchId.equals(other.batchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VmcBatchPK[ acctNbr=" + acctNbr + ", custNbr=" + custNbr + ", custBatchNbr=" + custBatchNbr + ", batchId=" + batchId + " ]";
    }
    
}
