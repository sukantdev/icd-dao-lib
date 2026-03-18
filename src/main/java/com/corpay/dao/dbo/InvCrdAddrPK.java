package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class InvCrdAddrPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_ADDR_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdAddrTs;
    @Basic(optional = false)
    @Column(name = "CRD_ADDR_SEQ_NBR")
    private short crdAddrSeqNbr;

    public InvCrdAddrPK() {
    }

    public InvCrdAddrPK(Date crdAddrTs, short crdAddrSeqNbr) {
        this.crdAddrTs = crdAddrTs;
        this.crdAddrSeqNbr = crdAddrSeqNbr;
    }

    public Date getCrdAddrTs() {
        return crdAddrTs;
    }

    public void setCrdAddrTs(Date crdAddrTs) {
        this.crdAddrTs = crdAddrTs;
    }

    public short getCrdAddrSeqNbr() {
        return crdAddrSeqNbr;
    }

    public void setCrdAddrSeqNbr(short crdAddrSeqNbr) {
        this.crdAddrSeqNbr = crdAddrSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdAddrTs != null ? crdAddrTs.hashCode() : 0);
        hash += (int) crdAddrSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvCrdAddrPK)) {
            return false;
        }
        InvCrdAddrPK other = (InvCrdAddrPK) object;
        if ((this.crdAddrTs == null && other.crdAddrTs != null) || (this.crdAddrTs != null && !this.crdAddrTs.equals(other.crdAddrTs))) {
            return false;
        }
        if (this.crdAddrSeqNbr != other.crdAddrSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvCrdAddrPK[ crdAddrTs=" + crdAddrTs + ", crdAddrSeqNbr=" + crdAddrSeqNbr + " ]";
    }

}
