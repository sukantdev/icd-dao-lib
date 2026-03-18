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
@Table(name = "ZIP_LAT_LONG", catalog = "", schema = "DBO")
public class ZipLatLong implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ZipLatLongPK zipLatLongPK;

    @Basic(optional = false)
    @Column(name = "LAT_NBR")
    private BigDecimal latNbr;
    @Basic(optional = false)
    @Column(name = "LONG_NBR")
    private BigDecimal longNbr;
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

    public ZipLatLong() {
    }

    public ZipLatLong(ZipLatLongPK zipLatLongPK) {
        this.zipLatLongPK = zipLatLongPK;
    }

    public ZipLatLong(ZipLatLongPK zipLatLongPK, BigDecimal latNbr, BigDecimal longNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.zipLatLongPK = zipLatLongPK;
        this.latNbr = latNbr;
        this.longNbr = longNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ZipLatLong(String cityNm, String stNm, String zipCd) {
        this.zipLatLongPK = new ZipLatLongPK(cityNm, stNm, zipCd);
    }

    public ZipLatLongPK getZipLatLongPK() {
        return zipLatLongPK;
    }

    public void setZipLatLongPK(ZipLatLongPK zipLatLongPK) {
        this.zipLatLongPK = zipLatLongPK;
    }

    public BigDecimal getLatNbr() {
        return latNbr;
    }

    public void setLatNbr(BigDecimal latNbr) {
        this.latNbr = latNbr;
    }

    public BigDecimal getLongNbr() {
        return longNbr;
    }

    public void setLongNbr(BigDecimal longNbr) {
        this.longNbr = longNbr;
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
        hash += (zipLatLongPK != null ? zipLatLongPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ZipLatLong)) {
            return false;
        }
        ZipLatLong other = (ZipLatLong) object;
        if ((this.zipLatLongPK == null && other.zipLatLongPK != null) || (this.zipLatLongPK != null && !this.zipLatLongPK.equals(other.zipLatLongPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ZipLatLong[ zipLatLongPK=" + zipLatLongPK + " ]";
    }

}
