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
@Table(name = "TELE_PING_PROX_CURR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "TelePingProxCurr.findAll", query = "SELECT t FROM TelePingProxCurr t")})
public class TelePingProxCurr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TelePingProxCurrPK telePingProxCurrPK;
    @Basic(optional = false)
    @Column(name = "CDN_RECV_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cdnRecvTs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CURR_LAT")
    private BigDecimal currLat;
    @Basic(optional = false)
    @Column(name = "CURR_LONG")
    private BigDecimal currLong;
    @Basic(optional = false)
    @Column(name = "DEVICE_ID")
    private String deviceId;
    @Basic(optional = false)
    @Column(name = "DEVICE_NM")
    private String deviceNm;
    @Basic(optional = false)
    @Column(name = "PARTNER_ID")
    private String partnerId;
    @Basic(optional = false)
    @Column(name = "TELE_PING_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date telePingTs;
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

    public TelePingProxCurr() {
    }

    public TelePingProxCurr(TelePingProxCurrPK telePingProxCurrPK) {
        this.telePingProxCurrPK = telePingProxCurrPK;
    }

    public TelePingProxCurr(TelePingProxCurrPK telePingProxCurrPK, Date cdnRecvTs, BigDecimal currLat, BigDecimal currLong, String deviceId, String deviceNm, String partnerId, Date telePingTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.telePingProxCurrPK = telePingProxCurrPK;
        this.cdnRecvTs = cdnRecvTs;
        this.currLat = currLat;
        this.currLong = currLong;
        this.deviceId = deviceId;
        this.deviceNm = deviceNm;
        this.partnerId = partnerId;
        this.telePingTs = telePingTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public TelePingProxCurr(String custId, String unitNbr) {
        this.telePingProxCurrPK = new TelePingProxCurrPK(custId, unitNbr);
    }

    public TelePingProxCurrPK getTelePingProxCurrPK() {
        return telePingProxCurrPK;
    }

    public void setTelePingProxCurrPK(TelePingProxCurrPK telePingProxCurrPK) {
        this.telePingProxCurrPK = telePingProxCurrPK;
    }

    public Date getCdnRecvTs() {
        return cdnRecvTs;
    }

    public void setCdnRecvTs(Date cdnRecvTs) {
        this.cdnRecvTs = cdnRecvTs;
    }

    public BigDecimal getCurrLat() {
        return currLat;
    }

    public void setCurrLat(BigDecimal currLat) {
        this.currLat = currLat;
    }

    public BigDecimal getCurrLong() {
        return currLong;
    }

    public void setCurrLong(BigDecimal currLong) {
        this.currLong = currLong;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceNm() {
        return deviceNm;
    }

    public void setDeviceNm(String deviceNm) {
        this.deviceNm = deviceNm;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public Date getTelePingTs() {
        return telePingTs;
    }

    public void setTelePingTs(Date telePingTs) {
        this.telePingTs = telePingTs;
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
        hash += (telePingProxCurrPK != null ? telePingProxCurrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelePingProxCurr)) {
            return false;
        }
        TelePingProxCurr other = (TelePingProxCurr) object;
        if ((this.telePingProxCurrPK == null && other.telePingProxCurrPK != null) || (this.telePingProxCurrPK != null && !this.telePingProxCurrPK.equals(other.telePingProxCurrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePingProxCurr[ telePingProxCurrPK=" + telePingProxCurrPK + " ]";
    }
    
}
