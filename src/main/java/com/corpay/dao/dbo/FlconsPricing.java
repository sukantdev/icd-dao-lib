package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "FLCONS_PRICING", catalog = "", schema = "DBO")
public class FlconsPricing implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FlconsPricingPK flconsPricingPK;

    @Basic(optional = false)
    @Column(name = "PRC")
    private BigDecimal prc;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public FlconsPricing() {
    }

    public FlconsPricing(FlconsPricingPK flconsPricingPK) {
        this.flconsPricingPK = flconsPricingPK;
    }

    public FlconsPricing(FlconsPricingPK flconsPricingPK, BigDecimal prc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.flconsPricingPK = flconsPricingPK;
        this.prc = prc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FlconsPricing(String fboMrchCd, String fcMrchCd, int tier) {
        this.flconsPricingPK = new FlconsPricingPK(fboMrchCd, fcMrchCd, tier);
    }

    public FlconsPricingPK getFlconsPricingPK() {
        return flconsPricingPK;
    }

    public void setFlconsPricingPK(FlconsPricingPK flconsPricingPK) {
        this.flconsPricingPK = flconsPricingPK;
    }

    public BigDecimal getPrc() {
        return prc;
    }

    public void setPrc(BigDecimal prc) {
        this.prc = prc;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (flconsPricingPK != null ? flconsPricingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FlconsPricing)) {
            return false;
        }
        FlconsPricing other = (FlconsPricing) object;
        if ((this.flconsPricingPK == null && other.flconsPricingPK != null) || (this.flconsPricingPK != null && !this.flconsPricingPK.equals(other.flconsPricingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FlconsPricing[ flconsPricingPK=" + flconsPricingPK + " ]";
    }

}
