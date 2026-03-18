package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class InvDiscPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PSTD_DT")
    @Temporal(TemporalType.DATE)
    private Date pstdDt;
    @Basic(optional = false)
    @Column(name = "TRNS_ID")
    private int trnsId;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private int seqNbr;
    @Basic(optional = false)
    @Column(name = "DISC_TYP")
    private Character discTyp;
    @Basic(optional = false)
    @Column(name = "SUB_SEQ_NBR")
    private int subSeqNbr;

    public InvDiscPK() {
    }

    public InvDiscPK(Date pstdDt, int trnsId, int seqNbr, Character discTyp, int subSeqNbr) {
        this.pstdDt = pstdDt;
        this.trnsId = trnsId;
        this.seqNbr = seqNbr;
        this.discTyp = discTyp;
        this.subSeqNbr = subSeqNbr;
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

    public int getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(int seqNbr) {
        this.seqNbr = seqNbr;
    }

    public Character getDiscTyp() {
        return discTyp;
    }

    public void setDiscTyp(Character discTyp) {
        this.discTyp = discTyp;
    }

    public int getSubSeqNbr() {
        return subSeqNbr;
    }

    public void setSubSeqNbr(int subSeqNbr) {
        this.subSeqNbr = subSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pstdDt != null ? pstdDt.hashCode() : 0);
        hash += (int) trnsId;
        hash += (int) seqNbr;
        hash += (discTyp != null ? discTyp.hashCode() : 0);
        hash += (int) subSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvDiscPK)) {
            return false;
        }
        InvDiscPK other = (InvDiscPK) object;
        if ((this.pstdDt == null && other.pstdDt != null) || (this.pstdDt != null && !this.pstdDt.equals(other.pstdDt))) {
            return false;
        }
        if (this.trnsId != other.trnsId) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        if ((this.discTyp == null && other.discTyp != null) || (this.discTyp != null && !this.discTyp.equals(other.discTyp))) {
            return false;
        }
        if (this.subSeqNbr != other.subSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvDiscPK[ pstdDt=" + pstdDt + ", trnsId=" + trnsId + ", seqNbr=" + seqNbr + ", discTyp=" + discTyp + ", subSeqNbr=" + subSeqNbr + " ]";
    }

}
