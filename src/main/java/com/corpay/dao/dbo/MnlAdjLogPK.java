package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class MnlAdjLogPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "ENTRY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryTs;

    public MnlAdjLogPK() {
    }

    public MnlAdjLogPK(String crdNbr, Date entryTs) {
        this.crdNbr = crdNbr;
        this.entryTs = entryTs;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Date getEntryTs() {
        return entryTs;
    }

    public void setEntryTs(Date entryTs) {
        this.entryTs = entryTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        hash += (entryTs != null ? entryTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MnlAdjLogPK)) {
            return false;
        }
        MnlAdjLogPK other = (MnlAdjLogPK) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        if ((this.entryTs == null && other.entryTs != null) || (this.entryTs != null && !this.entryTs.equals(other.entryTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MnlAdjLogPK[ crdNbr=" + crdNbr + ", entryTs=" + entryTs + " ]";
    }

}
