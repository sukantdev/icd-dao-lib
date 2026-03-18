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
@Table(name = "TELE_PING_PROXIMITY", catalog = "", schema = "DBO")
public class TelePingProximity implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TelePingProximityPK telePingProximityPK;

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

    public TelePingProximity() {
    }

    public TelePingProximity(TelePingProximityPK telePingProximityPK) {
        this.telePingProximityPK = telePingProximityPK;
    }

    public TelePingProximity(TelePingProximityPK telePingProximityPK, BigDecimal currLat, BigDecimal currLong, String deviceId, String deviceNm, String partnerId, Date telePingTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.telePingProximityPK = telePingProximityPK;
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

    public TelePingProximity(String custId, String unitNbr, Date cdnRecvTs) {
        this.telePingProximityPK = new TelePingProximityPK(custId, unitNbr, cdnRecvTs);
    }

    public TelePingProximityPK getTelePingProximityPK() {
        return telePingProximityPK;
    }

    public void setTelePingProximityPK(TelePingProximityPK telePingProximityPK) {
        this.telePingProximityPK = telePingProximityPK;
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
        hash += (telePingProximityPK != null ? telePingProximityPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TelePingProximity)) {
            return false;
        }
        TelePingProximity other = (TelePingProximity) object;
        if ((this.telePingProximityPK == null && other.telePingProximityPK != null) || (this.telePingProximityPK != null && !this.telePingProximityPK.equals(other.telePingProximityPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePingProximity[ telePingProximityPK=" + telePingProximityPK + " ]";
    }

}
