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
@Table(name = "LOCATION_DISC_HDR", catalog = "", schema = "DBO")
public class LocationDiscHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LocationDiscHdrPK locationDiscHdrPK;
    @Basic(optional = false)
    @Column(name = "GL_CD")
    private String glCd;
    @Basic(optional = false)
    @Column(name = "MARGIN_DISC_FLG")
    private Character marginDiscFlg;

    @Basic(optional = false)
    @Column(name = "MARGIN_PCT")
    private BigDecimal marginPct;
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

    public LocationDiscHdr() {
    }

    public LocationDiscHdr(LocationDiscHdrPK locationDiscHdrPK) {
        this.locationDiscHdrPK = locationDiscHdrPK;
    }

    public LocationDiscHdr(LocationDiscHdrPK locationDiscHdrPK, String glCd, Character marginDiscFlg, BigDecimal marginPct, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.locationDiscHdrPK = locationDiscHdrPK;
        this.glCd = glCd;
        this.marginDiscFlg = marginDiscFlg;
        this.marginPct = marginPct;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public LocationDiscHdr(String locCd, String locTyp, String discId) {
        this.locationDiscHdrPK = new LocationDiscHdrPK(locCd, locTyp, discId);
    }

    public LocationDiscHdrPK getLocationDiscHdrPK() {
        return locationDiscHdrPK;
    }

    public void setLocationDiscHdrPK(LocationDiscHdrPK locationDiscHdrPK) {
        this.locationDiscHdrPK = locationDiscHdrPK;
    }

    public String getGlCd() {
        return glCd;
    }

    public void setGlCd(String glCd) {
        this.glCd = glCd;
    }

    public Character getMarginDiscFlg() {
        return marginDiscFlg;
    }

    public void setMarginDiscFlg(Character marginDiscFlg) {
        this.marginDiscFlg = marginDiscFlg;
    }

    public BigDecimal getMarginPct() {
        return marginPct;
    }

    public void setMarginPct(BigDecimal marginPct) {
        this.marginPct = marginPct;
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
        hash += (locationDiscHdrPK != null ? locationDiscHdrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof LocationDiscHdr)) {
            return false;
        }
        LocationDiscHdr other = (LocationDiscHdr) object;
        if ((this.locationDiscHdrPK == null && other.locationDiscHdrPK != null) || (this.locationDiscHdrPK != null && !this.locationDiscHdrPK.equals(other.locationDiscHdrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.LocationDiscHdr[ locationDiscHdrPK=" + locationDiscHdrPK + " ]";
    }

}
