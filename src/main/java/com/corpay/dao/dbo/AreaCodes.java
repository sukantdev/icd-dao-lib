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
@Table(name = "AREA_CODES", catalog = "", schema = "DBO")
public class AreaCodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AreaCodesPK areaCodesPK;
    @Basic(optional = false)
    @Column(name = "RATE_AREA")
    private Character rateArea;
    @Basic(optional = false)
    @Column(name = "RATE_CITY")
    private String rateCity;
    @Basic(optional = false)
    @Column(name = "RATE_STATE")
    private String rateState;
    @Basic(optional = false)
    @Column(name = "CAN_PROV")
    private String canProv;
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

    public AreaCodes() {
    }

    public AreaCodes(AreaCodesPK areaCodesPK) {
        this.areaCodesPK = areaCodesPK;
    }

    public AreaCodes(AreaCodesPK areaCodesPK, Character rateArea, String rateCity, String rateState, String canProv, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.areaCodesPK = areaCodesPK;
        this.rateArea = rateArea;
        this.rateCity = rateCity;
        this.rateState = rateState;
        this.canProv = canProv;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AreaCodes(short areaCode, short exchange, String extension) {
        this.areaCodesPK = new AreaCodesPK(areaCode, exchange, extension);
    }

    public AreaCodesPK getAreaCodesPK() {
        return areaCodesPK;
    }

    public void setAreaCodesPK(AreaCodesPK areaCodesPK) {
        this.areaCodesPK = areaCodesPK;
    }

    public Character getRateArea() {
        return rateArea;
    }

    public void setRateArea(Character rateArea) {
        this.rateArea = rateArea;
    }

    public String getRateCity() {
        return rateCity;
    }

    public void setRateCity(String rateCity) {
        this.rateCity = rateCity;
    }

    public String getRateState() {
        return rateState;
    }

    public void setRateState(String rateState) {
        this.rateState = rateState;
    }

    public String getCanProv() {
        return canProv;
    }

    public void setCanProv(String canProv) {
        this.canProv = canProv;
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
        hash += (areaCodesPK != null ? areaCodesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AreaCodes)) {
            return false;
        }
        AreaCodes other = (AreaCodes) object;
        if ((this.areaCodesPK == null && other.areaCodesPK != null) || (this.areaCodesPK != null && !this.areaCodesPK.equals(other.areaCodesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AreaCodes[ areaCodesPK=" + areaCodesPK + " ]";
    }

}
