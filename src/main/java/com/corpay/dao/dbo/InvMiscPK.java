package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class InvMiscPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MISC_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date miscTs;
    @Basic(optional = false)
    @Column(name = "MISC_SEQ_NBR")
    private short miscSeqNbr;

    public InvMiscPK() {
    }

    public InvMiscPK(Date miscTs, short miscSeqNbr) {
        this.miscTs = miscTs;
        this.miscSeqNbr = miscSeqNbr;
    }

    public Date getMiscTs() {
        return miscTs;
    }

    public void setMiscTs(Date miscTs) {
        this.miscTs = miscTs;
    }

    public short getMiscSeqNbr() {
        return miscSeqNbr;
    }

    public void setMiscSeqNbr(short miscSeqNbr) {
        this.miscSeqNbr = miscSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (miscTs != null ? miscTs.hashCode() : 0);
        hash += (int) miscSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvMiscPK)) {
            return false;
        }
        InvMiscPK other = (InvMiscPK) object;
        if ((this.miscTs == null && other.miscTs != null) || (this.miscTs != null && !this.miscTs.equals(other.miscTs))) {
            return false;
        }
        if (this.miscSeqNbr != other.miscSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvMiscPK[ miscTs=" + miscTs + ", miscSeqNbr=" + miscSeqNbr + " ]";
    }

}
