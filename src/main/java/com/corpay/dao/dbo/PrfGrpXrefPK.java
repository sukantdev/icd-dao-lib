package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class PrfGrpXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PRF_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prfId;
    @Basic(optional = false)
    @Column(name = "GRP_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date grpId;

    public PrfGrpXrefPK() {
    }

    public PrfGrpXrefPK(Date prfId, Date grpId) {
        this.prfId = prfId;
        this.grpId = grpId;
    }

    public Date getPrfId() {
        return prfId;
    }

    public void setPrfId(Date prfId) {
        this.prfId = prfId;
    }

    public Date getGrpId() {
        return grpId;
    }

    public void setGrpId(Date grpId) {
        this.grpId = grpId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prfId != null ? prfId.hashCode() : 0);
        hash += (grpId != null ? grpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrfGrpXrefPK)) {
            return false;
        }
        PrfGrpXrefPK other = (PrfGrpXrefPK) object;
        if ((this.prfId == null && other.prfId != null) || (this.prfId != null && !this.prfId.equals(other.prfId))) {
            return false;
        }
        if ((this.grpId == null && other.grpId != null) || (this.grpId != null && !this.grpId.equals(other.grpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrfGrpXrefPK[ prfId=" + prfId + ", grpId=" + grpId + " ]";
    }

}
