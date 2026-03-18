package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EnrlClrDataInitPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BATCH_ID")
    private String batchId;
    @Basic(optional = false)
    @Column(name = "BATCH_SEQ_NBR")
    private int batchSeqNbr;

    public EnrlClrDataInitPK() {
    }

    public EnrlClrDataInitPK(String batchId, int batchSeqNbr) {
        this.batchId = batchId;
        this.batchSeqNbr = batchSeqNbr;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (batchId != null ? batchId.hashCode() : 0);
        hash += (int) batchSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof EnrlClrDataInitPK)) {
            return false;
        }
        EnrlClrDataInitPK other = (EnrlClrDataInitPK) object;
        if ((this.batchId == null && other.batchId != null) || (this.batchId != null && !this.batchId.equals(other.batchId))) {
            return false;
        }
        if (this.batchSeqNbr != other.batchSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EnrlClrDataInitPK[ batchId=" + batchId + ", batchSeqNbr=" + batchSeqNbr + " ]";
    }

}
