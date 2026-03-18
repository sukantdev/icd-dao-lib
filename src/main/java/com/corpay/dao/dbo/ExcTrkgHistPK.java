package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ExcTrkgHistPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PSTD_DT")
    @Temporal(TemporalType.DATE)
    private Date pstdDt;
    @Basic(optional = false)
    @Column(name = "TRNS_ID")
    private int trnsId;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private short seqNbr;

    public ExcTrkgHistPK() {
    }

    public ExcTrkgHistPK(Date pstdDt, int trnsId, short seqNbr) {
        this.pstdDt = pstdDt;
        this.trnsId = trnsId;
        this.seqNbr = seqNbr;
    }

    public Date getPstdDt() {
        return pstdDt;
    }

    public void setPstdDt(Date pstdDt) {
        this.pstdDt = pstdDt;
    }

    public int getTrnsId() {
        return trnsId;
    }

    public void setTrnsId(int trnsId) {
        this.trnsId = trnsId;
    }

    public short getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(short seqNbr) {
        this.seqNbr = seqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pstdDt != null ? pstdDt.hashCode() : 0);
        hash += (int) trnsId;
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ExcTrkgHistPK)) {
            return false;
        }
        ExcTrkgHistPK other = (ExcTrkgHistPK) object;
        if ((this.pstdDt == null && other.pstdDt != null) || (this.pstdDt != null && !this.pstdDt.equals(other.pstdDt))) {
            return false;
        }
        if (this.trnsId != other.trnsId) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ExcTrkgHistPK[ pstdDt=" + pstdDt + ", trnsId=" + trnsId + ", seqNbr=" + seqNbr + " ]";
    }

}
