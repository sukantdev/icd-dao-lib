package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class InvHierPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "HIER_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hierTs;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private short seqNbr;

    public InvHierPK() {
    }

    public InvHierPK(Date hierTs, short seqNbr) {
        this.hierTs = hierTs;
        this.seqNbr = seqNbr;
    }

    public Date getHierTs() {
        return hierTs;
    }

    public void setHierTs(Date hierTs) {
        this.hierTs = hierTs;
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
        hash += (hierTs != null ? hierTs.hashCode() : 0);
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvHierPK)) {
            return false;
        }
        InvHierPK other = (InvHierPK) object;
        if ((this.hierTs == null && other.hierTs != null) || (this.hierTs != null && !this.hierTs.equals(other.hierTs))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvHierPK[ hierTs=" + hierTs + ", seqNbr=" + seqNbr + " ]";
    }

}
