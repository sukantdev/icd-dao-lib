package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class VpDataHistPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MAST_ID")
    private String mastId;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public VpDataHistPK() {
    }

    public VpDataHistPK(String mastId, Date crtTs) {
        this.mastId = mastId;
        this.crtTs = crtTs;
    }

    public String getMastId() {
        return mastId;
    }

    public void setMastId(String mastId) {
        this.mastId = mastId;
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
        hash += (mastId != null ? mastId.hashCode() : 0);
        hash += (crtTs != null ? crtTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpDataHistPK)) {
            return false;
        }
        VpDataHistPK other = (VpDataHistPK) object;
        if ((this.mastId == null && other.mastId != null) || (this.mastId != null && !this.mastId.equals(other.mastId))) {
            return false;
        }
        if ((this.crtTs == null && other.crtTs != null) || (this.crtTs != null && !this.crtTs.equals(other.crtTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpDataHistPK[ mastId=" + mastId + ", crtTs=" + crtTs + " ]";
    }

}
