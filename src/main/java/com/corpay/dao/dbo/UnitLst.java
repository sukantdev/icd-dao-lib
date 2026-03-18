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
@Table(name = "UNIT_LST", catalog = "", schema = "DBO")
public class UnitLst implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UnitLstPK unitLstPK;
    @Basic(optional = false)
    @Column(name = "VIN")
    private String vin;
    @Basic(optional = false)
    @Column(name = "VEHS_DESC")
    private String vehsDesc;
    @Basic(optional = false)
    @Column(name = "LIC_NBR")
    private String licNbr;
    @Basic(optional = false)
    @Column(name = "EXPR_DT")
    @Temporal(TemporalType.DATE)
    private Date exprDt;
    @Basic(optional = false)
    @Column(name = "UNIT_LST_MISC1")
    private String unitLstMisc1;
    @Basic(optional = false)
    @Column(name = "UNIT_LST_MISC2")
    private String unitLstMisc2;

    @Basic(optional = false)
    @Column(name = "STRTNG_HUB")
    private BigDecimal strtngHub;
    @Basic(optional = false)
    @Column(name = "LST_HUB")
    private BigDecimal lstHub;
    @Basic(optional = false)
    @Column(name = "CURR_DAY_NR_GALS")
    private BigDecimal currDayNrGals;
    @Basic(optional = false)
    @Column(name = "PREV_DAY_NR_GALS")
    private BigDecimal prevDayNrGals;
    @Basic(optional = false)
    @Column(name = "PTD_NR_GALS")
    private BigDecimal ptdNrGals;
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
    @Column(name = "UNIT_ADHERE_TO_PROFILES")
    private Character unitAdhereToProfiles;
    @Basic(optional = false)
    @Column(name = "UNIT_PROFILE_ID")
    private String unitProfileId;
    @Basic(optional = false)
    @Column(name = "UNIT_DEVICE_ID")
    private String unitDeviceId;
    @Basic(optional = false)
    @Column(name = "DRVR_NM")
    private String drvrNm;
    @Basic(optional = false)
    @Column(name = "MAX_DLY_FUEL_PURC_QTY")
    private BigDecimal maxDlyFuelPurcQty;
    @Basic(optional = false)
    @Column(name = "LAST_TS_CD")
    private String lastTsCd;
    @Basic(optional = false)
    @Column(name = "LAST_XTN_DT")
    @Temporal(TemporalType.DATE)
    private Date lastXtnDt;
    @Basic(optional = false)
    @Column(name = "LAST_XTN_TM")
    @Temporal(TemporalType.TIME)
    private Date lastXtnTm;
    @Basic(optional = false)
    @Column(name = "REC_STAT_CD")
    private Character recStatCd;
    @Basic(optional = false)
    @Column(name = "UNIT_LST_MISC3")
    private String unitLstMisc3;
    @Basic(optional = false)
    @Column(name = "VEH_TANK_CAP")
    private String vehTankCap;
    @Basic(optional = false)
    @Column(name = "THRD_PAC_EXEMPT_FLG")
    private Character thrdPacExemptFlg;
    @Basic(optional = false)
    @Column(name = "FUEL_TYP_CD")
    private Character fuelTypCd;

    public UnitLst() {
    }

    public UnitLst(UnitLstPK unitLstPK) {
        this.unitLstPK = unitLstPK;
    }

    public UnitLst(UnitLstPK unitLstPK, String vin, String vehsDesc, String licNbr, Date exprDt, String unitLstMisc1, String unitLstMisc2, BigDecimal strtngHub, BigDecimal lstHub, BigDecimal currDayNrGals, BigDecimal prevDayNrGals, BigDecimal ptdNrGals, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character unitAdhereToProfiles, String unitProfileId, String unitDeviceId, String drvrNm, BigDecimal maxDlyFuelPurcQty, String lastTsCd, Date lastXtnDt, Date lastXtnTm, Character recStatCd, String unitLstMisc3, String vehTankCap, Character thrdPacExemptFlg, Character fuelTypCd) {
        this.unitLstPK = unitLstPK;
        this.vin = vin;
        this.vehsDesc = vehsDesc;
        this.licNbr = licNbr;
        this.exprDt = exprDt;
        this.unitLstMisc1 = unitLstMisc1;
        this.unitLstMisc2 = unitLstMisc2;
        this.strtngHub = strtngHub;
        this.lstHub = lstHub;
        this.currDayNrGals = currDayNrGals;
        this.prevDayNrGals = prevDayNrGals;
        this.ptdNrGals = ptdNrGals;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.unitAdhereToProfiles = unitAdhereToProfiles;
        this.unitProfileId = unitProfileId;
        this.unitDeviceId = unitDeviceId;
        this.drvrNm = drvrNm;
        this.maxDlyFuelPurcQty = maxDlyFuelPurcQty;
        this.lastTsCd = lastTsCd;
        this.lastXtnDt = lastXtnDt;
        this.lastXtnTm = lastXtnTm;
        this.recStatCd = recStatCd;
        this.unitLstMisc3 = unitLstMisc3;
        this.vehTankCap = vehTankCap;
        this.thrdPacExemptFlg = thrdPacExemptFlg;
        this.fuelTypCd = fuelTypCd;
    }

    public UnitLst(String custHierId, String unitNbr, String grpId, Character recId) {
        this.unitLstPK = new UnitLstPK(custHierId, unitNbr, grpId, recId);
    }

    public UnitLstPK getUnitLstPK() {
        return unitLstPK;
    }

    public void setUnitLstPK(UnitLstPK unitLstPK) {
        this.unitLstPK = unitLstPK;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVehsDesc() {
        return vehsDesc;
    }

    public void setVehsDesc(String vehsDesc) {
        this.vehsDesc = vehsDesc;
    }

    public String getLicNbr() {
        return licNbr;
    }

    public void setLicNbr(String licNbr) {
        this.licNbr = licNbr;
    }

    public Date getExprDt() {
        return exprDt;
    }

    public void setExprDt(Date exprDt) {
        this.exprDt = exprDt;
    }

    public String getUnitLstMisc1() {
        return unitLstMisc1;
    }

    public void setUnitLstMisc1(String unitLstMisc1) {
        this.unitLstMisc1 = unitLstMisc1;
    }

    public String getUnitLstMisc2() {
        return unitLstMisc2;
    }

    public void setUnitLstMisc2(String unitLstMisc2) {
        this.unitLstMisc2 = unitLstMisc2;
    }

    public BigDecimal getStrtngHub() {
        return strtngHub;
    }

    public void setStrtngHub(BigDecimal strtngHub) {
        this.strtngHub = strtngHub;
    }

    public BigDecimal getLstHub() {
        return lstHub;
    }

    public void setLstHub(BigDecimal lstHub) {
        this.lstHub = lstHub;
    }

    public BigDecimal getCurrDayNrGals() {
        return currDayNrGals;
    }

    public void setCurrDayNrGals(BigDecimal currDayNrGals) {
        this.currDayNrGals = currDayNrGals;
    }

    public BigDecimal getPrevDayNrGals() {
        return prevDayNrGals;
    }

    public void setPrevDayNrGals(BigDecimal prevDayNrGals) {
        this.prevDayNrGals = prevDayNrGals;
    }

    public BigDecimal getPtdNrGals() {
        return ptdNrGals;
    }

    public void setPtdNrGals(BigDecimal ptdNrGals) {
        this.ptdNrGals = ptdNrGals;
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

    public Character getUnitAdhereToProfiles() {
        return unitAdhereToProfiles;
    }

    public void setUnitAdhereToProfiles(Character unitAdhereToProfiles) {
        this.unitAdhereToProfiles = unitAdhereToProfiles;
    }

    public String getUnitProfileId() {
        return unitProfileId;
    }

    public void setUnitProfileId(String unitProfileId) {
        this.unitProfileId = unitProfileId;
    }

    public String getUnitDeviceId() {
        return unitDeviceId;
    }

    public void setUnitDeviceId(String unitDeviceId) {
        this.unitDeviceId = unitDeviceId;
    }

    public String getDrvrNm() {
        return drvrNm;
    }

    public void setDrvrNm(String drvrNm) {
        this.drvrNm = drvrNm;
    }

    public BigDecimal getMaxDlyFuelPurcQty() {
        return maxDlyFuelPurcQty;
    }

    public void setMaxDlyFuelPurcQty(BigDecimal maxDlyFuelPurcQty) {
        this.maxDlyFuelPurcQty = maxDlyFuelPurcQty;
    }

    public String getLastTsCd() {
        return lastTsCd;
    }

    public void setLastTsCd(String lastTsCd) {
        this.lastTsCd = lastTsCd;
    }

    public Date getLastXtnDt() {
        return lastXtnDt;
    }

    public void setLastXtnDt(Date lastXtnDt) {
        this.lastXtnDt = lastXtnDt;
    }

    public Date getLastXtnTm() {
        return lastXtnTm;
    }

    public void setLastXtnTm(Date lastXtnTm) {
        this.lastXtnTm = lastXtnTm;
    }

    public Character getRecStatCd() {
        return recStatCd;
    }

    public void setRecStatCd(Character recStatCd) {
        this.recStatCd = recStatCd;
    }

    public String getUnitLstMisc3() {
        return unitLstMisc3;
    }

    public void setUnitLstMisc3(String unitLstMisc3) {
        this.unitLstMisc3 = unitLstMisc3;
    }

    public String getVehTankCap() {
        return vehTankCap;
    }

    public void setVehTankCap(String vehTankCap) {
        this.vehTankCap = vehTankCap;
    }

    public Character getThrdPacExemptFlg() {
        return thrdPacExemptFlg;
    }

    public void setThrdPacExemptFlg(Character thrdPacExemptFlg) {
        this.thrdPacExemptFlg = thrdPacExemptFlg;
    }

    public Character getFuelTypCd() {
        return fuelTypCd;
    }

    public void setFuelTypCd(Character fuelTypCd) {
        this.fuelTypCd = fuelTypCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unitLstPK != null ? unitLstPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UnitLst)) {
            return false;
        }
        UnitLst other = (UnitLst) object;
        if ((this.unitLstPK == null && other.unitLstPK != null) || (this.unitLstPK != null && !this.unitLstPK.equals(other.unitLstPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UnitLst[ unitLstPK=" + unitLstPK + " ]";
    }

}
