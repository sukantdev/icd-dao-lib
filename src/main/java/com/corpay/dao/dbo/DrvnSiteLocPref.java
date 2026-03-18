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
@Table(name = "DRVN_SITE_LOC_PREF", catalog = "", schema = "DBO")
public class DrvnSiteLocPref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DrvnSiteLocPrefPK drvnSiteLocPrefPK;
    @Basic(optional = false)
    @Column(name = "FUEL_ONLY_LOC_FLG")
    private Character fuelOnlyLocFlg;
    @Basic(optional = false)
    @Column(name = "FUEL_TYP_FLG")
    private Character fuelTypFlg;
    @Basic(optional = false)
    @Column(name = "DIESEL_FLG")
    private Character dieselFlg;
    @Basic(optional = false)
    @Column(name = "UNLEADED_FLG")
    private Character unleadedFlg;
    @Basic(optional = false)
    @Column(name = "CNG_FLG")
    private Character cngFlg;
    @Basic(optional = false)
    @Column(name = "RECOM_FLG")
    private Character recomFlg;
    @Basic(optional = false)
    @Column(name = "NOT_RECOM_WARN_FLG")
    private Character notRecomWarnFlg;
    @Basic(optional = false)
    @Column(name = "NOT_RECOM_WARN_MSG")
    private String notRecomWarnMsg;
    @Basic(optional = false)
    @Column(name = "GALLON_UP_FLG")
    private Character gallonUpFlg;
    @Basic(optional = false)
    @Column(name = "NET_PRICE_FLG")
    private Character netPriceFlg;
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
    @Column(name = "LNG_FLG")
    private Character lngFlg;
    @Basic(optional = false)
    @Column(name = "DEF_FLG")
    private Character defFlg;
    @Basic(optional = false)
    @Column(name = "REEFER_FLG")
    private Character reeferFlg;
    @Basic(optional = false)
    @Column(name = "MAINTENANCE_TYP_FLG")
    private Character maintenanceTypFlg;
    @Basic(optional = false)
    @Column(name = "TRUCK_WASH_FLG")
    private Character truckWashFlg;
    @Basic(optional = false)
    @Column(name = "TRUCK_REPAIR_FLG")
    private Character truckRepairFlg;
    @Basic(optional = false)
    @Column(name = "TIRE_REPAIR_FLG")
    private Character tireRepairFlg;
    @Basic(optional = false)
    @Column(name = "MERCHANT_TYP_FLG")
    private Character merchantTypFlg;
    @Basic(optional = false)
    @Column(name = "TRUCK_STOP_FLG")
    private Character truckStopFlg;
    @Basic(optional = false)
    @Column(name = "GAS_STATION_FLG")
    private Character gasStationFlg;
    @Basic(optional = false)
    @Column(name = "TRUCK_AND_GAS_ST_FLG")
    private Character truckAndGasStFlg;
    @Basic(optional = false)
    @Column(name = "CONVENIENCE_STORE_FLG")
    private Character convenienceStoreFlg;
    @Basic(optional = false)
    @Column(name = "LUMPER_SERVICE_FLG")
    private Character lumperServiceFlg;
    @Basic(optional = false)
    @Column(name = "VEHICLE_MAINTENANCE_FLG")
    private Character vehicleMaintenanceFlg;
    @Basic(optional = false)
    @Column(name = "OTHER_FLG")
    private Character otherFlg;
    @Basic(optional = false)
    @Column(name = "BRAND_TYP_FLG")
    private Character brandTypFlg;
    @Basic(optional = false)
    @Column(name = "TA_FLG")
    private Character taFlg;
    @Basic(optional = false)
    @Column(name = "SPEEDWAY_FLG")
    private Character speedwayFlg;
    @Basic(optional = false)
    @Column(name = "LOVE_FLG")
    private Character loveFlg;
    @Basic(optional = false)
    @Column(name = "SEVEN_ELEVEN_FLG")
    private Character sevenElevenFlg;
    @Basic(optional = false)
    @Column(name = "PILOT_FLG")
    private Character pilotFlg;
    @Basic(optional = false)
    @Column(name = "FLYING_J_FLG")
    private Character flyingJFlg;
    @Basic(optional = false)
    @Column(name = "SHEETZ_FLG")
    private Character sheetzFlg;
    @Basic(optional = false)
    @Column(name = "CASEY_FLG")
    private Character caseyFlg;
    @Basic(optional = false)
    @Column(name = "ALL_OTHER_FLG")
    private Character allOtherFlg;

    public DrvnSiteLocPref() {
    }

    public DrvnSiteLocPref(DrvnSiteLocPrefPK drvnSiteLocPrefPK) {
        this.drvnSiteLocPrefPK = drvnSiteLocPrefPK;
    }

    public DrvnSiteLocPref(DrvnSiteLocPrefPK drvnSiteLocPrefPK, Character fuelOnlyLocFlg, Character fuelTypFlg, Character dieselFlg, Character unleadedFlg, Character cngFlg, Character recomFlg, Character notRecomWarnFlg, String notRecomWarnMsg, Character gallonUpFlg, Character netPriceFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character lngFlg, Character defFlg, Character reeferFlg, Character maintenanceTypFlg, Character truckWashFlg, Character truckRepairFlg, Character tireRepairFlg, Character merchantTypFlg, Character truckStopFlg, Character gasStationFlg, Character truckAndGasStFlg, Character convenienceStoreFlg, Character lumperServiceFlg, Character vehicleMaintenanceFlg, Character otherFlg, Character brandTypFlg, Character taFlg, Character speedwayFlg, Character loveFlg, Character sevenElevenFlg, Character pilotFlg, Character flyingJFlg, Character sheetzFlg, Character caseyFlg, Character allOtherFlg) {
        this.drvnSiteLocPrefPK = drvnSiteLocPrefPK;
        this.fuelOnlyLocFlg = fuelOnlyLocFlg;
        this.fuelTypFlg = fuelTypFlg;
        this.dieselFlg = dieselFlg;
        this.unleadedFlg = unleadedFlg;
        this.cngFlg = cngFlg;
        this.recomFlg = recomFlg;
        this.notRecomWarnFlg = notRecomWarnFlg;
        this.notRecomWarnMsg = notRecomWarnMsg;
        this.gallonUpFlg = gallonUpFlg;
        this.netPriceFlg = netPriceFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.lngFlg = lngFlg;
        this.defFlg = defFlg;
        this.reeferFlg = reeferFlg;
        this.maintenanceTypFlg = maintenanceTypFlg;
        this.truckWashFlg = truckWashFlg;
        this.truckRepairFlg = truckRepairFlg;
        this.tireRepairFlg = tireRepairFlg;
        this.merchantTypFlg = merchantTypFlg;
        this.truckStopFlg = truckStopFlg;
        this.gasStationFlg = gasStationFlg;
        this.truckAndGasStFlg = truckAndGasStFlg;
        this.convenienceStoreFlg = convenienceStoreFlg;
        this.lumperServiceFlg = lumperServiceFlg;
        this.vehicleMaintenanceFlg = vehicleMaintenanceFlg;
        this.otherFlg = otherFlg;
        this.brandTypFlg = brandTypFlg;
        this.taFlg = taFlg;
        this.speedwayFlg = speedwayFlg;
        this.loveFlg = loveFlg;
        this.sevenElevenFlg = sevenElevenFlg;
        this.pilotFlg = pilotFlg;
        this.flyingJFlg = flyingJFlg;
        this.sheetzFlg = sheetzFlg;
        this.caseyFlg = caseyFlg;
        this.allOtherFlg = allOtherFlg;
    }

    public DrvnSiteLocPref(String acctNbr, String custId) {
        this.drvnSiteLocPrefPK = new DrvnSiteLocPrefPK(acctNbr, custId);
    }

    public DrvnSiteLocPrefPK getDrvnSiteLocPrefPK() {
        return drvnSiteLocPrefPK;
    }

    public void setDrvnSiteLocPrefPK(DrvnSiteLocPrefPK drvnSiteLocPrefPK) {
        this.drvnSiteLocPrefPK = drvnSiteLocPrefPK;
    }

    public Character getFuelOnlyLocFlg() {
        return fuelOnlyLocFlg;
    }

    public void setFuelOnlyLocFlg(Character fuelOnlyLocFlg) {
        this.fuelOnlyLocFlg = fuelOnlyLocFlg;
    }

    public Character getFuelTypFlg() {
        return fuelTypFlg;
    }

    public void setFuelTypFlg(Character fuelTypFlg) {
        this.fuelTypFlg = fuelTypFlg;
    }

    public Character getDieselFlg() {
        return dieselFlg;
    }

    public void setDieselFlg(Character dieselFlg) {
        this.dieselFlg = dieselFlg;
    }

    public Character getUnleadedFlg() {
        return unleadedFlg;
    }

    public void setUnleadedFlg(Character unleadedFlg) {
        this.unleadedFlg = unleadedFlg;
    }

    public Character getCngFlg() {
        return cngFlg;
    }

    public void setCngFlg(Character cngFlg) {
        this.cngFlg = cngFlg;
    }

    public Character getRecomFlg() {
        return recomFlg;
    }

    public void setRecomFlg(Character recomFlg) {
        this.recomFlg = recomFlg;
    }

    public Character getNotRecomWarnFlg() {
        return notRecomWarnFlg;
    }

    public void setNotRecomWarnFlg(Character notRecomWarnFlg) {
        this.notRecomWarnFlg = notRecomWarnFlg;
    }

    public String getNotRecomWarnMsg() {
        return notRecomWarnMsg;
    }

    public void setNotRecomWarnMsg(String notRecomWarnMsg) {
        this.notRecomWarnMsg = notRecomWarnMsg;
    }

    public Character getGallonUpFlg() {
        return gallonUpFlg;
    }

    public void setGallonUpFlg(Character gallonUpFlg) {
        this.gallonUpFlg = gallonUpFlg;
    }

    public Character getNetPriceFlg() {
        return netPriceFlg;
    }

    public void setNetPriceFlg(Character netPriceFlg) {
        this.netPriceFlg = netPriceFlg;
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

    public Character getLngFlg() {
        return lngFlg;
    }

    public void setLngFlg(Character lngFlg) {
        this.lngFlg = lngFlg;
    }

    public Character getDefFlg() {
        return defFlg;
    }

    public void setDefFlg(Character defFlg) {
        this.defFlg = defFlg;
    }

    public Character getReeferFlg() {
        return reeferFlg;
    }

    public void setReeferFlg(Character reeferFlg) {
        this.reeferFlg = reeferFlg;
    }

    public Character getMaintenanceTypFlg() {
        return maintenanceTypFlg;
    }

    public void setMaintenanceTypFlg(Character maintenanceTypFlg) {
        this.maintenanceTypFlg = maintenanceTypFlg;
    }

    public Character getTruckWashFlg() {
        return truckWashFlg;
    }

    public void setTruckWashFlg(Character truckWashFlg) {
        this.truckWashFlg = truckWashFlg;
    }

    public Character getTruckRepairFlg() {
        return truckRepairFlg;
    }

    public void setTruckRepairFlg(Character truckRepairFlg) {
        this.truckRepairFlg = truckRepairFlg;
    }

    public Character getTireRepairFlg() {
        return tireRepairFlg;
    }

    public void setTireRepairFlg(Character tireRepairFlg) {
        this.tireRepairFlg = tireRepairFlg;
    }

    public Character getMerchantTypFlg() {
        return merchantTypFlg;
    }

    public void setMerchantTypFlg(Character merchantTypFlg) {
        this.merchantTypFlg = merchantTypFlg;
    }

    public Character getTruckStopFlg() {
        return truckStopFlg;
    }

    public void setTruckStopFlg(Character truckStopFlg) {
        this.truckStopFlg = truckStopFlg;
    }

    public Character getGasStationFlg() {
        return gasStationFlg;
    }

    public void setGasStationFlg(Character gasStationFlg) {
        this.gasStationFlg = gasStationFlg;
    }

    public Character getTruckAndGasStFlg() {
        return truckAndGasStFlg;
    }

    public void setTruckAndGasStFlg(Character truckAndGasStFlg) {
        this.truckAndGasStFlg = truckAndGasStFlg;
    }

    public Character getConvenienceStoreFlg() {
        return convenienceStoreFlg;
    }

    public void setConvenienceStoreFlg(Character convenienceStoreFlg) {
        this.convenienceStoreFlg = convenienceStoreFlg;
    }

    public Character getLumperServiceFlg() {
        return lumperServiceFlg;
    }

    public void setLumperServiceFlg(Character lumperServiceFlg) {
        this.lumperServiceFlg = lumperServiceFlg;
    }

    public Character getVehicleMaintenanceFlg() {
        return vehicleMaintenanceFlg;
    }

    public void setVehicleMaintenanceFlg(Character vehicleMaintenanceFlg) {
        this.vehicleMaintenanceFlg = vehicleMaintenanceFlg;
    }

    public Character getOtherFlg() {
        return otherFlg;
    }

    public void setOtherFlg(Character otherFlg) {
        this.otherFlg = otherFlg;
    }

    public Character getBrandTypFlg() {
        return brandTypFlg;
    }

    public void setBrandTypFlg(Character brandTypFlg) {
        this.brandTypFlg = brandTypFlg;
    }

    public Character getTaFlg() {
        return taFlg;
    }

    public void setTaFlg(Character taFlg) {
        this.taFlg = taFlg;
    }

    public Character getSpeedwayFlg() {
        return speedwayFlg;
    }

    public void setSpeedwayFlg(Character speedwayFlg) {
        this.speedwayFlg = speedwayFlg;
    }

    public Character getLoveFlg() {
        return loveFlg;
    }

    public void setLoveFlg(Character loveFlg) {
        this.loveFlg = loveFlg;
    }

    public Character getSevenElevenFlg() {
        return sevenElevenFlg;
    }

    public void setSevenElevenFlg(Character sevenElevenFlg) {
        this.sevenElevenFlg = sevenElevenFlg;
    }

    public Character getPilotFlg() {
        return pilotFlg;
    }

    public void setPilotFlg(Character pilotFlg) {
        this.pilotFlg = pilotFlg;
    }

    public Character getFlyingJFlg() {
        return flyingJFlg;
    }

    public void setFlyingJFlg(Character flyingJFlg) {
        this.flyingJFlg = flyingJFlg;
    }

    public Character getSheetzFlg() {
        return sheetzFlg;
    }

    public void setSheetzFlg(Character sheetzFlg) {
        this.sheetzFlg = sheetzFlg;
    }

    public Character getCaseyFlg() {
        return caseyFlg;
    }

    public void setCaseyFlg(Character caseyFlg) {
        this.caseyFlg = caseyFlg;
    }

    public Character getAllOtherFlg() {
        return allOtherFlg;
    }

    public void setAllOtherFlg(Character allOtherFlg) {
        this.allOtherFlg = allOtherFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (drvnSiteLocPrefPK != null ? drvnSiteLocPrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DrvnSiteLocPref)) {
            return false;
        }
        DrvnSiteLocPref other = (DrvnSiteLocPref) object;
        if ((this.drvnSiteLocPrefPK == null && other.drvnSiteLocPrefPK != null) || (this.drvnSiteLocPrefPK != null && !this.drvnSiteLocPrefPK.equals(other.drvnSiteLocPrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DrvnSiteLocPref[ drvnSiteLocPrefPK=" + drvnSiteLocPrefPK + " ]";
    }

}
