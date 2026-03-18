package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class VcapPaymentsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BATCH_ID")
    private String batchId;
    @Basic(optional = false)
    @Column(name = "FILE_NBR")
    private long fileNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;

    public VcapPaymentsPK() {
    }

    public VcapPaymentsPK(String batchId, long fileNbr, String custId, String acctNbr) {
        this.batchId = batchId;
        this.fileNbr = fileNbr;
        this.custId = custId;
        this.acctNbr = acctNbr;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public long getFileNbr() {
        return fileNbr;
    }

    public void setFileNbr(long fileNbr) {
        this.fileNbr = fileNbr;
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
        hash += (int) fileNbr;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VcapPaymentsPK)) {
            return false;
        }
        VcapPaymentsPK other = (VcapPaymentsPK) object;
        if ((this.batchId == null && other.batchId != null) || (this.batchId != null && !this.batchId.equals(other.batchId))) {
            return false;
        }
        if (this.fileNbr != other.fileNbr) {
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
        return "com.corpay.dao.dbo.VcapPaymentsPK[ batchId=" + batchId + ", fileNbr=" + fileNbr + ", custId=" + custId + ", acctNbr=" + acctNbr + " ]";
    }

}
