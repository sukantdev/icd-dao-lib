package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class TelePollStatsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PROVIDER_ID")
    private String providerId;
    @Basic(optional = false)
    @Column(name = "START_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTs;

    public TelePollStatsPK() {
    }

    public TelePollStatsPK(String providerId, Date startTs) {
        this.providerId = providerId;
        this.startTs = startTs;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public Date getStartTs() {
        return startTs;
    }

    public void setStartTs(Date startTs) {
        this.startTs = startTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (providerId != null ? providerId.hashCode() : 0);
        hash += (startTs != null ? startTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TelePollStatsPK)) {
            return false;
        }
        TelePollStatsPK other = (TelePollStatsPK) object;
        if ((this.providerId == null && other.providerId != null) || (this.providerId != null && !this.providerId.equals(other.providerId))) {
            return false;
        }
        if ((this.startTs == null && other.startTs != null) || (this.startTs != null && !this.startTs.equals(other.startTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePollStatsPK[ providerId=" + providerId + ", startTs=" + startTs + " ]";
    }

}
