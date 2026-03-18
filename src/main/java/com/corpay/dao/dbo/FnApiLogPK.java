package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class FnApiLogPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRNS_ID")
    private String trnsId;
    @Basic(optional = false)
    @Column(name = "TRNS_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trnsTs;

    public FnApiLogPK() {
    }

    public FnApiLogPK(String trnsId, Date trnsTs) {
        this.trnsId = trnsId;
        this.trnsTs = trnsTs;
    }

    public String getTrnsId() {
        return trnsId;
    }

    public void setTrnsId(String trnsId) {
        this.trnsId = trnsId;
    }

    public Date getTrnsTs() {
        return trnsTs;
    }

    public void setTrnsTs(Date trnsTs) {
        this.trnsTs = trnsTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnsId != null ? trnsId.hashCode() : 0);
        hash += (trnsTs != null ? trnsTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FnApiLogPK)) {
            return false;
        }
        FnApiLogPK other = (FnApiLogPK) object;
        if ((this.trnsId == null && other.trnsId != null) || (this.trnsId != null && !this.trnsId.equals(other.trnsId))) {
            return false;
        }
        if ((this.trnsTs == null && other.trnsTs != null) || (this.trnsTs != null && !this.trnsTs.equals(other.trnsTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnApiLogPK[ trnsId=" + trnsId + ", trnsTs=" + trnsTs + " ]";
    }

}
