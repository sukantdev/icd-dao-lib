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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "TELE_PING_FUEL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "TelePingFuel.findAll", query = "SELECT t FROM TelePingFuel t")})
public class TelePingFuel implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TelePingFuelPK telePingFuelPK;
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

    public TelePingFuel() {
    }

    public TelePingFuel(TelePingFuelPK telePingFuelPK) {
        this.telePingFuelPK = telePingFuelPK;
    }

    public TelePingFuel(TelePingFuelPK telePingFuelPK, short fuelLevel, String deviceId, String deviceNm, String partnerId, Date telePingTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.telePingFuelPK = telePingFuelPK;
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

    public TelePingFuel(String custId, String unitNbr, Date cdnRecvTs) {
        this.telePingFuelPK = new TelePingFuelPK(custId, unitNbr, cdnRecvTs);
    }

    public TelePingFuelPK getTelePingFuelPK() {
        return telePingFuelPK;
    }

    public void setTelePingFuelPK(TelePingFuelPK telePingFuelPK) {
        this.telePingFuelPK = telePingFuelPK;
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
        hash += (telePingFuelPK != null ? telePingFuelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelePingFuel)) {
            return false;
        }
        TelePingFuel other = (TelePingFuel) object;
        if ((this.telePingFuelPK == null && other.telePingFuelPK != null) || (this.telePingFuelPK != null && !this.telePingFuelPK.equals(other.telePingFuelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePingFuel[ telePingFuelPK=" + telePingFuelPK + " ]";
    }
    
}
