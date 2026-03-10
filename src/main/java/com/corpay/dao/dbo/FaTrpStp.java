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
@Table(name = "FA_TRP_STP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FaTrpStp.findAll", query = "SELECT f FROM FaTrpStp f")})
public class FaTrpStp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FaTrpStpPK faTrpStpPK;
    @Basic(optional = false)
    @Column(name = "LOC_NM")
    private String locNm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LOC_LAT")
    private BigDecimal locLat;
    @Basic(optional = false)
    @Column(name = "LOC_LON")
    private BigDecimal locLon;
    @Basic(optional = false)
    @Column(name = "PFRD")
    private Character pfrd;
    @Basic(optional = false)
    @Column(name = "LOC_ADDR")
    private String locAddr;
    @Basic(optional = false)
    @Column(name = "LOC_CTY")
    private String locCty;
    @Basic(optional = false)
    @Column(name = "LOC_ST")
    private String locSt;
    @Basic(optional = false)
    @Column(name = "LOC_POST_CD")
    private String locPostCd;
    @Basic(optional = false)
    @Column(name = "NET_PPG")
    private BigDecimal netPpg;
    @Basic(optional = false)
    @Column(name = "RTL_PPG")
    private BigDecimal rtlPpg;
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
    @Basic(optional = false)
    @Column(name = "LOC_FUEL_SCORE")
    private BigDecimal locFuelScore;

    public FaTrpStp() {
    }

    public FaTrpStp(FaTrpStpPK faTrpStpPK) {
        this.faTrpStpPK = faTrpStpPK;
    }

    public FaTrpStp(FaTrpStpPK faTrpStpPK, String locNm, BigDecimal locLat, BigDecimal locLon, Character pfrd, String locAddr, String locCty, String locSt, String locPostCd, BigDecimal netPpg, BigDecimal rtlPpg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, BigDecimal locFuelScore) {
        this.faTrpStpPK = faTrpStpPK;
        this.locNm = locNm;
        this.locLat = locLat;
        this.locLon = locLon;
        this.pfrd = pfrd;
        this.locAddr = locAddr;
        this.locCty = locCty;
        this.locSt = locSt;
        this.locPostCd = locPostCd;
        this.netPpg = netPpg;
        this.rtlPpg = rtlPpg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.locFuelScore = locFuelScore;
    }

    public FaTrpStp(long trpId, short legNbr, short stpNbr, String locId) {
        this.faTrpStpPK = new FaTrpStpPK(trpId, legNbr, stpNbr, locId);
    }

    public FaTrpStpPK getFaTrpStpPK() {
        return faTrpStpPK;
    }

    public void setFaTrpStpPK(FaTrpStpPK faTrpStpPK) {
        this.faTrpStpPK = faTrpStpPK;
    }

    public String getLocNm() {
        return locNm;
    }

    public void setLocNm(String locNm) {
        this.locNm = locNm;
    }

    public BigDecimal getLocLat() {
        return locLat;
    }

    public void setLocLat(BigDecimal locLat) {
        this.locLat = locLat;
    }

    public BigDecimal getLocLon() {
        return locLon;
    }

    public void setLocLon(BigDecimal locLon) {
        this.locLon = locLon;
    }

    public Character getPfrd() {
        return pfrd;
    }

    public void setPfrd(Character pfrd) {
        this.pfrd = pfrd;
    }

    public String getLocAddr() {
        return locAddr;
    }

    public void setLocAddr(String locAddr) {
        this.locAddr = locAddr;
    }

    public String getLocCty() {
        return locCty;
    }

    public void setLocCty(String locCty) {
        this.locCty = locCty;
    }

    public String getLocSt() {
        return locSt;
    }

    public void setLocSt(String locSt) {
        this.locSt = locSt;
    }

    public String getLocPostCd() {
        return locPostCd;
    }

    public void setLocPostCd(String locPostCd) {
        this.locPostCd = locPostCd;
    }

    public BigDecimal getNetPpg() {
        return netPpg;
    }

    public void setNetPpg(BigDecimal netPpg) {
        this.netPpg = netPpg;
    }

    public BigDecimal getRtlPpg() {
        return rtlPpg;
    }

    public void setRtlPpg(BigDecimal rtlPpg) {
        this.rtlPpg = rtlPpg;
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

    public BigDecimal getLocFuelScore() {
        return locFuelScore;
    }

    public void setLocFuelScore(BigDecimal locFuelScore) {
        this.locFuelScore = locFuelScore;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (faTrpStpPK != null ? faTrpStpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaTrpStp)) {
            return false;
        }
        FaTrpStp other = (FaTrpStp) object;
        if ((this.faTrpStpPK == null && other.faTrpStpPK != null) || (this.faTrpStpPK != null && !this.faTrpStpPK.equals(other.faTrpStpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaTrpStp[ faTrpStpPK=" + faTrpStpPK + " ]";
    }
    
}
