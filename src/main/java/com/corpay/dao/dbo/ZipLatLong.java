/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "ZIP_LAT_LONG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ZipLatLong.findAll", query = "SELECT z FROM ZipLatLong z")})
public class ZipLatLong implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ZipLatLongPK zipLatLongPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
