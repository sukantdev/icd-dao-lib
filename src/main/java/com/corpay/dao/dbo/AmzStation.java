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
@Table(name = "AMZ_STATION", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "AmzStation.findAll", query = "SELECT a FROM AmzStation a")})
public class AmzStation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AMZ_STATION_CD")
    private String amzStationCd;
    @Basic(optional = false)
    @Column(name = "NM")
    private String nm;
    @Basic(optional = false)
    @Column(name = "ADDR1")
    private String addr1;
    @Basic(optional = false)
    @Column(name = "ADDR2")
    private String addr2;
    @Basic(optional = false)
    @Column(name = "CTY_NM")
    private String ctyNm;
    @Basic(optional = false)
    @Column(name = "ST_CD")
    private String stCd;
    @Basic(optional = false)
    @Column(name = "ZIP_CD")
    private String zipCd;
    @Basic(optional = false)
    @Column(name = "CTRY_CD")
    private String ctryCd;
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

    public AmzStation() {
    }

    public AmzStation(String amzStationCd) {
        this.amzStationCd = amzStationCd;
    }

    public AmzStation(String amzStationCd, String nm, String addr1, String addr2, String ctyNm, String stCd, String zipCd, String ctryCd, BigDecimal latNbr, BigDecimal longNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.amzStationCd = amzStationCd;
        this.nm = nm;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.ctyNm = ctyNm;
        this.stCd = stCd;
        this.zipCd = zipCd;
        this.ctryCd = ctryCd;
        this.latNbr = latNbr;
        this.longNbr = longNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getAmzStationCd() {
        return amzStationCd;
    }

    public void setAmzStationCd(String amzStationCd) {
        this.amzStationCd = amzStationCd;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getCtyNm() {
        return ctyNm;
    }

    public void setCtyNm(String ctyNm) {
        this.ctyNm = ctyNm;
    }

    public String getStCd() {
        return stCd;
    }

    public void setStCd(String stCd) {
        this.stCd = stCd;
    }

    public String getZipCd() {
        return zipCd;
    }

    public void setZipCd(String zipCd) {
        this.zipCd = zipCd;
    }

    public String getCtryCd() {
        return ctryCd;
    }

    public void setCtryCd(String ctryCd) {
        this.ctryCd = ctryCd;
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
        hash += (amzStationCd != null ? amzStationCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AmzStation)) {
            return false;
        }
        AmzStation other = (AmzStation) object;
        if ((this.amzStationCd == null && other.amzStationCd != null) || (this.amzStationCd != null && !this.amzStationCd.equals(other.amzStationCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AmzStation[ amzStationCd=" + amzStationCd + " ]";
    }
    
}
