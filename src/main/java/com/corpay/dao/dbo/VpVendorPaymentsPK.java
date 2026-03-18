package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class VpVendorPaymentsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BATCH_ID")
    private String batchId;
    @Basic(optional = false)
    @Column(name = "BATCH_SEQ_NBR")
    private int batchSeqNbr;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_NBR")
    private String accountNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;

    public VpVendorPaymentsPK() {
    }

    public VpVendorPaymentsPK(String batchId, int batchSeqNbr, String accountNbr, String custId) {
        this.batchId = batchId;
        this.batchSeqNbr = batchSeqNbr;
        this.accountNbr = accountNbr;
        this.custId = custId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public int getBatchSeqNbr() {
        return batchSeqNbr;
    }

    public void setBatchSeqNbr(int batchSeqNbr) {
        this.batchSeqNbr = batchSeqNbr;
    }

    public String getAccountNbr() {
        return accountNbr;
    }

    public void setAccountNbr(String accountNbr) {
        this.accountNbr = accountNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (batchId != null ? batchId.hashCode() : 0);
        hash += (int) batchSeqNbr;
        hash += (accountNbr != null ? accountNbr.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpVendorPaymentsPK)) {
            return false;
        }
        VpVendorPaymentsPK other = (VpVendorPaymentsPK) object;
        if ((this.batchId == null && other.batchId != null) || (this.batchId != null && !this.batchId.equals(other.batchId))) {
            return false;
        }
        if (this.batchSeqNbr != other.batchSeqNbr) {
            return false;
        }
        if ((this.accountNbr == null && other.accountNbr != null) || (this.accountNbr != null && !this.accountNbr.equals(other.accountNbr))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpVendorPaymentsPK[ batchId=" + batchId + ", batchSeqNbr=" + batchSeqNbr + ", accountNbr=" + accountNbr + ", custId=" + custId + " ]";
    }

}
