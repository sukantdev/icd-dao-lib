package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DsptTransDtlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DSPT_ID")
    private String dsptId;
    @Basic(optional = false)
    @Column(name = "TRNS_SEQ_NBR")
    private int trnsSeqNbr;

    public DsptTransDtlPK() {
    }

    public DsptTransDtlPK(String dsptId, int trnsSeqNbr) {
        this.dsptId = dsptId;
        this.trnsSeqNbr = trnsSeqNbr;
    }

    public String getDsptId() {
        return dsptId;
    }

    public void setDsptId(String dsptId) {
        this.dsptId = dsptId;
    }

    public int getTrnsSeqNbr() {
        return trnsSeqNbr;
    }

    public void setTrnsSeqNbr(int trnsSeqNbr) {
        this.trnsSeqNbr = trnsSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dsptId != null ? dsptId.hashCode() : 0);
        hash += (int) trnsSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DsptTransDtlPK)) {
            return false;
        }
        DsptTransDtlPK other = (DsptTransDtlPK) object;
        if ((this.dsptId == null && other.dsptId != null) || (this.dsptId != null && !this.dsptId.equals(other.dsptId))) {
            return false;
        }
        if (this.trnsSeqNbr != other.trnsSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DsptTransDtlPK[ dsptId=" + dsptId + ", trnsSeqNbr=" + trnsSeqNbr + " ]";
    }

}
