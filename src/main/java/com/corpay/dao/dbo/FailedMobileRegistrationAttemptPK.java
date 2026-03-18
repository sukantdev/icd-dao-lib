package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class FailedMobileRegistrationAttemptPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DVC_ID")
    private String dvcId;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public FailedMobileRegistrationAttemptPK() {
    }

    public FailedMobileRegistrationAttemptPK(String dvcId, Date crtTs) {
        this.dvcId = dvcId;
        this.crtTs = crtTs;
    }

    public String getDvcId() {
        return dvcId;
    }

    public void setDvcId(String dvcId) {
        this.dvcId = dvcId;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dvcId != null ? dvcId.hashCode() : 0);
        hash += (crtTs != null ? crtTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FailedMobileRegistrationAttemptPK)) {
            return false;
        }
        FailedMobileRegistrationAttemptPK other = (FailedMobileRegistrationAttemptPK) object;
        if ((this.dvcId == null && other.dvcId != null) || (this.dvcId != null && !this.dvcId.equals(other.dvcId))) {
            return false;
        }
        if ((this.crtTs == null && other.crtTs != null) || (this.crtTs != null && !this.crtTs.equals(other.crtTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FailedMobileRegistrationAttemptPK[ dvcId=" + dvcId + ", crtTs=" + crtTs + " ]";
    }

}
