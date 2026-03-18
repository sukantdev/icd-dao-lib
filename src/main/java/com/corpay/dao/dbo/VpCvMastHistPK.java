package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class VpCvMastHistPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CV_MAST_ID")
    private String cvMastId;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public VpCvMastHistPK() {
    }

    public VpCvMastHistPK(String cvMastId, Date crtTs) {
        this.cvMastId = cvMastId;
        this.crtTs = crtTs;
    }

    public String getCvMastId() {
        return cvMastId;
    }

    public void setCvMastId(String cvMastId) {
        this.cvMastId = cvMastId;
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
        hash += (cvMastId != null ? cvMastId.hashCode() : 0);
        hash += (crtTs != null ? crtTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpCvMastHistPK)) {
            return false;
        }
        VpCvMastHistPK other = (VpCvMastHistPK) object;
        if ((this.cvMastId == null && other.cvMastId != null) || (this.cvMastId != null && !this.cvMastId.equals(other.cvMastId))) {
            return false;
        }
        if ((this.crtTs == null && other.crtTs != null) || (this.crtTs != null && !this.crtTs.equals(other.crtTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCvMastHistPK[ cvMastId=" + cvMastId + ", crtTs=" + crtTs + " ]";
    }

}
