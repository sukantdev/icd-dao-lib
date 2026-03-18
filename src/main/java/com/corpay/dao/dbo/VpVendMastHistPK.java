package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class VpVendMastHistPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "VEND_MAST_ID")
    private String vendMastId;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public VpVendMastHistPK() {
    }

    public VpVendMastHistPK(String vendMastId, Date crtTs) {
        this.vendMastId = vendMastId;
        this.crtTs = crtTs;
    }

    public String getVendMastId() {
        return vendMastId;
    }

    public void setVendMastId(String vendMastId) {
        this.vendMastId = vendMastId;
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
        hash += (vendMastId != null ? vendMastId.hashCode() : 0);
        hash += (crtTs != null ? crtTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpVendMastHistPK)) {
            return false;
        }
        VpVendMastHistPK other = (VpVendMastHistPK) object;
        if ((this.vendMastId == null && other.vendMastId != null) || (this.vendMastId != null && !this.vendMastId.equals(other.vendMastId))) {
            return false;
        }
        if ((this.crtTs == null && other.crtTs != null) || (this.crtTs != null && !this.crtTs.equals(other.crtTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpVendMastHistPK[ vendMastId=" + vendMastId + ", crtTs=" + crtTs + " ]";
    }

}
