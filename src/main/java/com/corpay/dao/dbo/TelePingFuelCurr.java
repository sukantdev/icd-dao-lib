package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TELE_PING_FUEL_CURR", catalog = "", schema = "DBO")
public class TelePingFuelCurr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TelePingFuelCurrPK telePingFuelCurrPK;
    @Basic(optional = false)
    @Column(name = "CDN_RECV_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cdnRecvTs;
    @Basic(optional = false)
    @Column(name = "FUEL_LEVEL")
    private short fuelLevel;
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

    public TelePingFuelCurr() {
    }

    public TelePingFuelCurr(TelePingFuelCurrPK telePingFuelCurrPK) {
        this.telePingFuelCurrPK = telePingFuelCurrPK;
    }

    public TelePingFuelCurr(TelePingFuelCurrPK telePingFuelCurrPK, Date cdnRecvTs, short fuelLevel, String deviceId, String deviceNm, String partnerId, Date telePingTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.telePingFuelCurrPK = telePingFuelCurrPK;
        this.cdnRecvTs = cdnRecvTs;
        this.fuelLevel = fuelLevel;
        this.deviceId = deviceId;
        this.deviceNm = deviceNm;
        this.partnerId = partnerId;
        this.telePingTs = telePingTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public TelePingFuelCurr(String custId, String unitNbr, short seq) {
        this.telePingFuelCurrPK = new TelePingFuelCurrPK(custId, unitNbr, seq);
    }

    public TelePingFuelCurrPK getTelePingFuelCurrPK() {
        return telePingFuelCurrPK;
    }

    public void setTelePingFuelCurrPK(TelePingFuelCurrPK telePingFuelCurrPK) {
        this.telePingFuelCurrPK = telePingFuelCurrPK;
    }

    public Date getCdnRecvTs() {
        return cdnRecvTs;
    }

    public void setCdnRecvTs(Date cdnRecvTs) {
        this.cdnRecvTs = cdnRecvTs;
    }

    public short getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(short fuelLevel) {
        this.fuelLevel = fuelLevel;
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
        hash += (telePingFuelCurrPK != null ? telePingFuelCurrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TelePingFuelCurr)) {
            return false;
        }
        TelePingFuelCurr other = (TelePingFuelCurr) object;
        if ((this.telePingFuelCurrPK == null && other.telePingFuelCurrPK != null) || (this.telePingFuelCurrPK != null && !this.telePingFuelCurrPK.equals(other.telePingFuelCurrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePingFuelCurr[ telePingFuelCurrPK=" + telePingFuelCurrPK + " ]";
    }

}
