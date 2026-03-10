/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "OPIS_PPG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "OpisPpg.findAll", query = "SELECT o FROM OpisPpg o")})
public class OpisPpg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OPIS_NBR")
    private Long opisNbr;
    @Basic(optional = false)
    @Column(name = "SRV_CNTR_CD")
    private String srvCntrCd;
    @Basic(optional = false)
    @Column(name = "TS_NM")
    private String tsNm;
    @Basic(optional = false)
    @Column(name = "STREET_NM")
    private String streetNm;
    @Basic(optional = false)
    @Column(name = "CITY_NM")
    private String cityNm;
    @Basic(optional = false)
    @Column(name = "ST_NM")
    private String stNm;
    @Basic(optional = false)
    @Column(name = "ZIP_CD")
    private String zipCd;
    @Basic(optional = false)
    @Column(name = "BRAND_NM")
    private String brandNm;
    @Basic(optional = false)
    @Column(name = "FUEL_MAN_CD")
    private Character fuelManCd;
    @Basic(optional = false)
    @Column(name = "CONSORTIUM_CD")
    private Character consortiumCd;
    @Basic(optional = false)
    @Column(name = "REG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regTs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "REGL_RTL_AMT")
    private BigDecimal reglRtlAmt;
    @Basic(optional = false)
    @Column(name = "REGL_WHSL_PPG_AMT")
    private BigDecimal reglWhslPpgAmt;
    @Basic(optional = false)
    @Column(name = "REGL_NET_PPG_AMT")
    private BigDecimal reglNetPpgAmt;
    @Basic(optional = false)
    @Column(name = "REGL_MRGN_AMT")
    private BigDecimal reglMrgnAmt;
    @Basic(optional = false)
    @Column(name = "DSL_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dslTs;
    @Basic(optional = false)
    @Column(name = "DSL_RTL_AMT")
    private BigDecimal dslRtlAmt;
    @Basic(optional = false)
    @Column(name = "DSL_WHSL_PPG_AMT")
    private BigDecimal dslWhslPpgAmt;
    @Basic(optional = false)
    @Column(name = "DSL_NET_PPG_AMT")
    private BigDecimal dslNetPpgAmt;
    @Basic(optional = false)
    @Column(name = "DSL_MRGN_AMT")
    private BigDecimal dslMrgnAmt;
    @Basic(optional = false)
    @Column(name = "LAT_NBR")
    private BigDecimal latNbr;
    @Basic(optional = false)
    @Column(name = "LONG_NBR")
    private BigDecimal longNbr;
    @Basic(optional = false)
    @Column(name = "CFC_GAS_DISC_AMT")
    private BigDecimal cfcGasDiscAmt;
    @Basic(optional = false)
    @Column(name = "CFC_DSL_DISC_AMT")
    private BigDecimal cfcDslDiscAmt;
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

    public OpisPpg() {
    }

    public OpisPpg(Long opisNbr) {
        this.opisNbr = opisNbr;
    }

    public OpisPpg(Long opisNbr, String srvCntrCd, String tsNm, String streetNm, String cityNm, String stNm, String zipCd, String brandNm, Character fuelManCd, Character consortiumCd, Date regTs, BigDecimal reglRtlAmt, BigDecimal reglWhslPpgAmt, BigDecimal reglNetPpgAmt, BigDecimal reglMrgnAmt, Date dslTs, BigDecimal dslRtlAmt, BigDecimal dslWhslPpgAmt, BigDecimal dslNetPpgAmt, BigDecimal dslMrgnAmt, BigDecimal latNbr, BigDecimal longNbr, BigDecimal cfcGasDiscAmt, BigDecimal cfcDslDiscAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.opisNbr = opisNbr;
        this.srvCntrCd = srvCntrCd;
        this.tsNm = tsNm;
        this.streetNm = streetNm;
        this.cityNm = cityNm;
        this.stNm = stNm;
        this.zipCd = zipCd;
        this.brandNm = brandNm;
        this.fuelManCd = fuelManCd;
        this.consortiumCd = consortiumCd;
        this.regTs = regTs;
        this.reglRtlAmt = reglRtlAmt;
        this.reglWhslPpgAmt = reglWhslPpgAmt;
        this.reglNetPpgAmt = reglNetPpgAmt;
        this.reglMrgnAmt = reglMrgnAmt;
        this.dslTs = dslTs;
        this.dslRtlAmt = dslRtlAmt;
        this.dslWhslPpgAmt = dslWhslPpgAmt;
        this.dslNetPpgAmt = dslNetPpgAmt;
        this.dslMrgnAmt = dslMrgnAmt;
        this.latNbr = latNbr;
        this.longNbr = longNbr;
        this.cfcGasDiscAmt = cfcGasDiscAmt;
        this.cfcDslDiscAmt = cfcDslDiscAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getOpisNbr() {
        return opisNbr;
    }

    public void setOpisNbr(Long opisNbr) {
        this.opisNbr = opisNbr;
    }

    public String getSrvCntrCd() {
        return srvCntrCd;
    }

    public void setSrvCntrCd(String srvCntrCd) {
        this.srvCntrCd = srvCntrCd;
    }

    public String getTsNm() {
        return tsNm;
    }

    public void setTsNm(String tsNm) {
        this.tsNm = tsNm;
    }

    public String getStreetNm() {
        return streetNm;
    }

    public void setStreetNm(String streetNm) {
        this.streetNm = streetNm;
    }

    public String getCityNm() {
        return cityNm;
    }

    public void setCityNm(String cityNm) {
        this.cityNm = cityNm;
    }

    public String getStNm() {
        return stNm;
    }

    public void setStNm(String stNm) {
        this.stNm = stNm;
    }

    public String getZipCd() {
        return zipCd;
    }

    public void setZipCd(String zipCd) {
        this.zipCd = zipCd;
    }

    public String getBrandNm() {
        return brandNm;
    }

    public void setBrandNm(String brandNm) {
        this.brandNm = brandNm;
    }

    public Character getFuelManCd() {
        return fuelManCd;
    }

    public void setFuelManCd(Character fuelManCd) {
        this.fuelManCd = fuelManCd;
    }

    public Character getConsortiumCd() {
        return consortiumCd;
    }

    public void setConsortiumCd(Character consortiumCd) {
        this.consortiumCd = consortiumCd;
    }

    public Date getRegTs() {
        return regTs;
    }

    public void setRegTs(Date regTs) {
        this.regTs = regTs;
    }

    public BigDecimal getReglRtlAmt() {
        return reglRtlAmt;
    }

    public void setReglRtlAmt(BigDecimal reglRtlAmt) {
        this.reglRtlAmt = reglRtlAmt;
    }

    public BigDecimal getReglWhslPpgAmt() {
        return reglWhslPpgAmt;
    }

    public void setReglWhslPpgAmt(BigDecimal reglWhslPpgAmt) {
        this.reglWhslPpgAmt = reglWhslPpgAmt;
    }

    public BigDecimal getReglNetPpgAmt() {
        return reglNetPpgAmt;
    }

    public void setReglNetPpgAmt(BigDecimal reglNetPpgAmt) {
        this.reglNetPpgAmt = reglNetPpgAmt;
    }

    public BigDecimal getReglMrgnAmt() {
        return reglMrgnAmt;
    }

    public void setReglMrgnAmt(BigDecimal reglMrgnAmt) {
        this.reglMrgnAmt = reglMrgnAmt;
    }

    public Date getDslTs() {
        return dslTs;
    }

    public void setDslTs(Date dslTs) {
        this.dslTs = dslTs;
    }

    public BigDecimal getDslRtlAmt() {
        return dslRtlAmt;
    }

    public void setDslRtlAmt(BigDecimal dslRtlAmt) {
        this.dslRtlAmt = dslRtlAmt;
    }

    public BigDecimal getDslWhslPpgAmt() {
        return dslWhslPpgAmt;
    }

    public void setDslWhslPpgAmt(BigDecimal dslWhslPpgAmt) {
        this.dslWhslPpgAmt = dslWhslPpgAmt;
    }

    public BigDecimal getDslNetPpgAmt() {
        return dslNetPpgAmt;
    }

    public void setDslNetPpgAmt(BigDecimal dslNetPpgAmt) {
        this.dslNetPpgAmt = dslNetPpgAmt;
    }

    public BigDecimal getDslMrgnAmt() {
        return dslMrgnAmt;
    }

    public void setDslMrgnAmt(BigDecimal dslMrgnAmt) {
        this.dslMrgnAmt = dslMrgnAmt;
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

    public BigDecimal getCfcGasDiscAmt() {
        return cfcGasDiscAmt;
    }

    public void setCfcGasDiscAmt(BigDecimal cfcGasDiscAmt) {
        this.cfcGasDiscAmt = cfcGasDiscAmt;
    }

    public BigDecimal getCfcDslDiscAmt() {
        return cfcDslDiscAmt;
    }

    public void setCfcDslDiscAmt(BigDecimal cfcDslDiscAmt) {
        this.cfcDslDiscAmt = cfcDslDiscAmt;
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
        hash += (opisNbr != null ? opisNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpisPpg)) {
            return false;
        }
        OpisPpg other = (OpisPpg) object;
        if ((this.opisNbr == null && other.opisNbr != null) || (this.opisNbr != null && !this.opisNbr.equals(other.opisNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.OpisPpg[ opisNbr=" + opisNbr + " ]";
    }
    
}
