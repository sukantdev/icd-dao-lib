package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class TrnsIntradayPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "UID")
    private String uid;
    @Basic(optional = false)
    @Column(name = "TRANS_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transTs;
    @Basic(optional = false)
    @Column(name = "TRK_NBR")
    private long trkNbr;

    public TrnsIntradayPK() {
    }

    public TrnsIntradayPK(String uid, Date transTs, long trkNbr) {
        this.uid = uid;
        this.transTs = transTs;
        this.trkNbr = trkNbr;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Date getTransTs() {
        return transTs;
    }

    public void setTransTs(Date transTs) {
        this.transTs = transTs;
    }

    public long getTrkNbr() {
        return trkNbr;
    }

    public void setTrkNbr(long trkNbr) {
        this.trkNbr = trkNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        hash += (transTs != null ? transTs.hashCode() : 0);
        hash += (int) trkNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TrnsIntradayPK)) {
            return false;
        }
        TrnsIntradayPK other = (TrnsIntradayPK) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        if ((this.transTs == null && other.transTs != null) || (this.transTs != null && !this.transTs.equals(other.transTs))) {
            return false;
        }
        if (this.trkNbr != other.trkNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TrnsIntradayPK[ uid=" + uid + ", transTs=" + transTs + ", trkNbr=" + trkNbr + " ]";
    }

}
