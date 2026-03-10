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
@Table(name = "FUEL_RESTRICT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FuelRestrict.findAll", query = "SELECT f FROM FuelRestrict f")})
public class FuelRestrict implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FuelRestrictPK fuelRestrictPK;
    @Basic(optional = false)
    @Column(name = "FUEL_GAS_GRADE_IND")
    private Character fuelGasGradeInd;
    @Basic(optional = false)
    @Column(name = "ALLOW_BULK_FUEL_IND")
    private Character allowBulkFuelInd;
    @Basic(optional = false)
    @Column(name = "DISP_GAS_IND")
    private Character dispGasInd;
    @Basic(optional = false)
    @Column(name = "DISP_DIESEL_IND")
    private Character dispDieselInd;
    @Basic(optional = false)
    @Column(name = "DISP_OFF_ROAD_IND")
    private Character dispOffRoadInd;
    @Basic(optional = false)
    @Column(name = "DISP_ELECTRIC_IND")
    private Character dispElectricInd;
    @Basic(optional = false)
    @Column(name = "DISP_CNG_IND")
    private Character dispCngInd;
    @Basic(optional = false)
    @Column(name = "DISP_KEROSENE_IND")
    private Character dispKeroseneInd;
    @Basic(optional = false)
    @Column(name = "AVIATION_FUEL_IND")
    private Character aviationFuelInd;
    @Basic(optional = false)
    @Column(name = "MARINE_FUEL_IND")
    private Character marineFuelInd;
    @Basic(optional = false)
    @Column(name = "REG_GAS_IND")
    private Character regGasInd;
    @Basic(optional = false)
    @Column(name = "MID_PLUS_GAS_IND")
    private Character midPlusGasInd;
    @Basic(optional = false)
    @Column(name = "PREMIUM_GAS_IND")
    private Character premiumGasInd;
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

    public FuelRestrict() {
    }

    public FuelRestrict(FuelRestrictPK fuelRestrictPK) {
        this.fuelRestrictPK = fuelRestrictPK;
    }

    public FuelRestrict(FuelRestrictPK fuelRestrictPK, Character fuelGasGradeInd, Character allowBulkFuelInd, Character dispGasInd, Character dispDieselInd, Character dispOffRoadInd, Character dispElectricInd, Character dispCngInd, Character dispKeroseneInd, Character aviationFuelInd, Character marineFuelInd, Character regGasInd, Character midPlusGasInd, Character premiumGasInd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fuelRestrictPK = fuelRestrictPK;
        this.fuelGasGradeInd = fuelGasGradeInd;
        this.allowBulkFuelInd = allowBulkFuelInd;
        this.dispGasInd = dispGasInd;
        this.dispDieselInd = dispDieselInd;
        this.dispOffRoadInd = dispOffRoadInd;
        this.dispElectricInd = dispElectricInd;
        this.dispCngInd = dispCngInd;
        this.dispKeroseneInd = dispKeroseneInd;
        this.aviationFuelInd = aviationFuelInd;
        this.marineFuelInd = marineFuelInd;
        this.regGasInd = regGasInd;
        this.midPlusGasInd = midPlusGasInd;
        this.premiumGasInd = premiumGasInd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FuelRestrict(String custId, Character typCd, String identNbr) {
        this.fuelRestrictPK = new FuelRestrictPK(custId, typCd, identNbr);
    }

    public FuelRestrictPK getFuelRestrictPK() {
        return fuelRestrictPK;
    }

    public void setFuelRestrictPK(FuelRestrictPK fuelRestrictPK) {
        this.fuelRestrictPK = fuelRestrictPK;
    }

    public Character getFuelGasGradeInd() {
        return fuelGasGradeInd;
    }

    public void setFuelGasGradeInd(Character fuelGasGradeInd) {
        this.fuelGasGradeInd = fuelGasGradeInd;
    }

    public Character getAllowBulkFuelInd() {
        return allowBulkFuelInd;
    }

    public void setAllowBulkFuelInd(Character allowBulkFuelInd) {
        this.allowBulkFuelInd = allowBulkFuelInd;
    }

    public Character getDispGasInd() {
        return dispGasInd;
    }

    public void setDispGasInd(Character dispGasInd) {
        this.dispGasInd = dispGasInd;
    }

    public Character getDispDieselInd() {
        return dispDieselInd;
    }

    public void setDispDieselInd(Character dispDieselInd) {
        this.dispDieselInd = dispDieselInd;
    }

    public Character getDispOffRoadInd() {
        return dispOffRoadInd;
    }

    public void setDispOffRoadInd(Character dispOffRoadInd) {
        this.dispOffRoadInd = dispOffRoadInd;
    }

    public Character getDispElectricInd() {
        return dispElectricInd;
    }

    public void setDispElectricInd(Character dispElectricInd) {
        this.dispElectricInd = dispElectricInd;
    }

    public Character getDispCngInd() {
        return dispCngInd;
    }

    public void setDispCngInd(Character dispCngInd) {
        this.dispCngInd = dispCngInd;
    }

    public Character getDispKeroseneInd() {
        return dispKeroseneInd;
    }

    public void setDispKeroseneInd(Character dispKeroseneInd) {
        this.dispKeroseneInd = dispKeroseneInd;
    }

    public Character getAviationFuelInd() {
        return aviationFuelInd;
    }

    public void setAviationFuelInd(Character aviationFuelInd) {
        this.aviationFuelInd = aviationFuelInd;
    }

    public Character getMarineFuelInd() {
        return marineFuelInd;
    }

    public void setMarineFuelInd(Character marineFuelInd) {
        this.marineFuelInd = marineFuelInd;
    }

    public Character getRegGasInd() {
        return regGasInd;
    }

    public void setRegGasInd(Character regGasInd) {
        this.regGasInd = regGasInd;
    }

    public Character getMidPlusGasInd() {
        return midPlusGasInd;
    }

    public void setMidPlusGasInd(Character midPlusGasInd) {
        this.midPlusGasInd = midPlusGasInd;
    }

    public Character getPremiumGasInd() {
        return premiumGasInd;
    }

    public void setPremiumGasInd(Character premiumGasInd) {
        this.premiumGasInd = premiumGasInd;
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
        hash += (fuelRestrictPK != null ? fuelRestrictPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FuelRestrict)) {
            return false;
        }
        FuelRestrict other = (FuelRestrict) object;
        if ((this.fuelRestrictPK == null && other.fuelRestrictPK != null) || (this.fuelRestrictPK != null && !this.fuelRestrictPK.equals(other.fuelRestrictPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FuelRestrict[ fuelRestrictPK=" + fuelRestrictPK + " ]";
    }
    
}
