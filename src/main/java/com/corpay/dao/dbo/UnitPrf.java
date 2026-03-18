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
@Table(name = "UNIT_PRF", catalog = "", schema = "DBO")
public class UnitPrf implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UnitPrfPK unitPrfPK;
    @Basic(optional = false)
    @Column(name = "PROFILE_NAME")
    private String profileName;
    @Basic(optional = false)
    @Column(name = "PROFILE_STATUS")
    private Character profileStatus;
    @Basic(optional = false)
    @Column(name = "PARTNER_ID")
    private String partnerId;
    @Basic(optional = false)
    @Column(name = "PROXIMITY_IND")
    private Character proximityInd;

    @Basic(optional = false)
    @Column(name = "PROXIMITY_LIMIT")
    private BigDecimal proximityLimit;
    @Basic(optional = false)
    @Column(name = "FUEL_TANK_IND")
    private Character fuelTankInd;
    @Basic(optional = false)
    @Column(name = "FUEL_TANK_LIMIT")
    private int fuelTankLimit;
    @Basic(optional = false)
    @Column(name = "PING_AGE_LIMIT")
    private int pingAgeLimit;
    @Basic(optional = false)
    @Column(name = "EMAIL_TXN_NOTIF_IND")
    private Character emailTxnNotifInd;
    @Basic(optional = false)
    @Column(name = "EMAIL_TXN_NOTIF_1")
    private String emailTxnNotif1;
    @Basic(optional = false)
    @Column(name = "EMAIL_TXN_NOTIF_2")
    private String emailTxnNotif2;
    @Basic(optional = false)
    @Column(name = "EMAIL_TXN_NOTIF_3")
    private String emailTxnNotif3;
    @Basic(optional = false)
    @Column(name = "EMAIL_TXN_NOTIF_4")
    private String emailTxnNotif4;
    @Basic(optional = false)
    @Column(name = "EMAIL_TXN_NOTIF_5")
    private String emailTxnNotif5;
    @Basic(optional = false)
    @Column(name = "EMAIL_DEVICE_NOTIF_IND")
    private Character emailDeviceNotifInd;
    @Basic(optional = false)
    @Column(name = "EMAIL_DEVICE_NOTIF_1")
    private String emailDeviceNotif1;
    @Basic(optional = false)
    @Column(name = "EMAIL_DEVICE_NOTIF_2")
    private String emailDeviceNotif2;
    @Basic(optional = false)
    @Column(name = "EMAIL_DEVICE_NOTIF_3")
    private String emailDeviceNotif3;
    @Basic(optional = false)
    @Column(name = "EMAIL_DEVICE_NOTIF_4")
    private String emailDeviceNotif4;
    @Basic(optional = false)
    @Column(name = "EMAIL_DEVICE_NOTIF_5")
    private String emailDeviceNotif5;
    @Basic(optional = false)
    @Column(name = "AUTH_DECISION")
    private Character authDecision;
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
    @Column(name = "FUEL_TANK_RSTC_FLG")
    private Character fuelTankRstcFlg;
    @Basic(optional = false)
    @Column(name = "FUEL_TANK_VAR_PCT")
    private BigDecimal fuelTankVarPct;
    @Basic(optional = false)
    @Column(name = "FUEL_TANK_MAX_AGE_CNT")
    private int fuelTankMaxAgeCnt;
    @Basic(optional = false)
    @Column(name = "PROXIMITY_DECL_FLG")
    private Character proximityDeclFlg;
    @Basic(optional = false)
    @Column(name = "FUEL_TANK_EMAIL_FLG")
    private Character fuelTankEmailFlg;
    @Basic(optional = false)
    @Column(name = "EMAIL_FUEL_NOTIF_1")
    private String emailFuelNotif1;
    @Basic(optional = false)
    @Column(name = "EMAIL_FUEL_NOTIF_2")
    private String emailFuelNotif2;
    @Basic(optional = false)
    @Column(name = "EMAIL_FUEL_NOTIF_3")
    private String emailFuelNotif3;
    @Basic(optional = false)
    @Column(name = "EMAIL_FUEL_NOTIF_4")
    private String emailFuelNotif4;
    @Basic(optional = false)
    @Column(name = "EMAIL_FUEL_NOTIF_5")
    private String emailFuelNotif5;
    @Basic(optional = false)
    @Column(name = "FUEL_DECL_FLG")
    private Character fuelDeclFlg;
    @Basic(optional = false)
    @Column(name = "PROX_STLE_DECL_FLG")
    private Character proxStleDeclFlg;

    public UnitPrf() {
    }

    public UnitPrf(UnitPrfPK unitPrfPK) {
        this.unitPrfPK = unitPrfPK;
    }

    public UnitPrf(UnitPrfPK unitPrfPK, String profileName, Character profileStatus, String partnerId, Character proximityInd, BigDecimal proximityLimit, Character fuelTankInd, int fuelTankLimit, int pingAgeLimit, Character emailTxnNotifInd, String emailTxnNotif1, String emailTxnNotif2, String emailTxnNotif3, String emailTxnNotif4, String emailTxnNotif5, Character emailDeviceNotifInd, String emailDeviceNotif1, String emailDeviceNotif2, String emailDeviceNotif3, String emailDeviceNotif4, String emailDeviceNotif5, Character authDecision, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character fuelTankRstcFlg, BigDecimal fuelTankVarPct, int fuelTankMaxAgeCnt, Character proximityDeclFlg, Character fuelTankEmailFlg, String emailFuelNotif1, String emailFuelNotif2, String emailFuelNotif3, String emailFuelNotif4, String emailFuelNotif5, Character fuelDeclFlg, Character proxStleDeclFlg) {
        this.unitPrfPK = unitPrfPK;
        this.profileName = profileName;
        this.profileStatus = profileStatus;
        this.partnerId = partnerId;
        this.proximityInd = proximityInd;
        this.proximityLimit = proximityLimit;
        this.fuelTankInd = fuelTankInd;
        this.fuelTankLimit = fuelTankLimit;
        this.pingAgeLimit = pingAgeLimit;
        this.emailTxnNotifInd = emailTxnNotifInd;
        this.emailTxnNotif1 = emailTxnNotif1;
        this.emailTxnNotif2 = emailTxnNotif2;
        this.emailTxnNotif3 = emailTxnNotif3;
        this.emailTxnNotif4 = emailTxnNotif4;
        this.emailTxnNotif5 = emailTxnNotif5;
        this.emailDeviceNotifInd = emailDeviceNotifInd;
        this.emailDeviceNotif1 = emailDeviceNotif1;
        this.emailDeviceNotif2 = emailDeviceNotif2;
        this.emailDeviceNotif3 = emailDeviceNotif3;
        this.emailDeviceNotif4 = emailDeviceNotif4;
        this.emailDeviceNotif5 = emailDeviceNotif5;
        this.authDecision = authDecision;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.fuelTankRstcFlg = fuelTankRstcFlg;
        this.fuelTankVarPct = fuelTankVarPct;
        this.fuelTankMaxAgeCnt = fuelTankMaxAgeCnt;
        this.proximityDeclFlg = proximityDeclFlg;
        this.fuelTankEmailFlg = fuelTankEmailFlg;
        this.emailFuelNotif1 = emailFuelNotif1;
        this.emailFuelNotif2 = emailFuelNotif2;
        this.emailFuelNotif3 = emailFuelNotif3;
        this.emailFuelNotif4 = emailFuelNotif4;
        this.emailFuelNotif5 = emailFuelNotif5;
        this.fuelDeclFlg = fuelDeclFlg;
        this.proxStleDeclFlg = proxStleDeclFlg;
    }

    public UnitPrf(String custId, Character profileType, String profileId) {
        this.unitPrfPK = new UnitPrfPK(custId, profileType, profileId);
    }

    public UnitPrfPK getUnitPrfPK() {
        return unitPrfPK;
    }

    public void setUnitPrfPK(UnitPrfPK unitPrfPK) {
        this.unitPrfPK = unitPrfPK;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public Character getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(Character profileStatus) {
        this.profileStatus = profileStatus;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public Character getProximityInd() {
        return proximityInd;
    }

    public void setProximityInd(Character proximityInd) {
        this.proximityInd = proximityInd;
    }

    public BigDecimal getProximityLimit() {
        return proximityLimit;
    }

    public void setProximityLimit(BigDecimal proximityLimit) {
        this.proximityLimit = proximityLimit;
    }

    public Character getFuelTankInd() {
        return fuelTankInd;
    }

    public void setFuelTankInd(Character fuelTankInd) {
        this.fuelTankInd = fuelTankInd;
    }

    public int getFuelTankLimit() {
        return fuelTankLimit;
    }

    public void setFuelTankLimit(int fuelTankLimit) {
        this.fuelTankLimit = fuelTankLimit;
    }

    public int getPingAgeLimit() {
        return pingAgeLimit;
    }

    public void setPingAgeLimit(int pingAgeLimit) {
        this.pingAgeLimit = pingAgeLimit;
    }

    public Character getEmailTxnNotifInd() {
        return emailTxnNotifInd;
    }

    public void setEmailTxnNotifInd(Character emailTxnNotifInd) {
        this.emailTxnNotifInd = emailTxnNotifInd;
    }

    public String getEmailTxnNotif1() {
        return emailTxnNotif1;
    }

    public void setEmailTxnNotif1(String emailTxnNotif1) {
        this.emailTxnNotif1 = emailTxnNotif1;
    }

    public String getEmailTxnNotif2() {
        return emailTxnNotif2;
    }

    public void setEmailTxnNotif2(String emailTxnNotif2) {
        this.emailTxnNotif2 = emailTxnNotif2;
    }

    public String getEmailTxnNotif3() {
        return emailTxnNotif3;
    }

    public void setEmailTxnNotif3(String emailTxnNotif3) {
        this.emailTxnNotif3 = emailTxnNotif3;
    }

    public String getEmailTxnNotif4() {
        return emailTxnNotif4;
    }

    public void setEmailTxnNotif4(String emailTxnNotif4) {
        this.emailTxnNotif4 = emailTxnNotif4;
    }

    public String getEmailTxnNotif5() {
        return emailTxnNotif5;
    }

    public void setEmailTxnNotif5(String emailTxnNotif5) {
        this.emailTxnNotif5 = emailTxnNotif5;
    }

    public Character getEmailDeviceNotifInd() {
        return emailDeviceNotifInd;
    }

    public void setEmailDeviceNotifInd(Character emailDeviceNotifInd) {
        this.emailDeviceNotifInd = emailDeviceNotifInd;
    }

    public String getEmailDeviceNotif1() {
        return emailDeviceNotif1;
    }

    public void setEmailDeviceNotif1(String emailDeviceNotif1) {
        this.emailDeviceNotif1 = emailDeviceNotif1;
    }

    public String getEmailDeviceNotif2() {
        return emailDeviceNotif2;
    }

    public void setEmailDeviceNotif2(String emailDeviceNotif2) {
        this.emailDeviceNotif2 = emailDeviceNotif2;
    }

    public String getEmailDeviceNotif3() {
        return emailDeviceNotif3;
    }

    public void setEmailDeviceNotif3(String emailDeviceNotif3) {
        this.emailDeviceNotif3 = emailDeviceNotif3;
    }

    public String getEmailDeviceNotif4() {
        return emailDeviceNotif4;
    }

    public void setEmailDeviceNotif4(String emailDeviceNotif4) {
        this.emailDeviceNotif4 = emailDeviceNotif4;
    }

    public String getEmailDeviceNotif5() {
        return emailDeviceNotif5;
    }

    public void setEmailDeviceNotif5(String emailDeviceNotif5) {
        this.emailDeviceNotif5 = emailDeviceNotif5;
    }

    public Character getAuthDecision() {
        return authDecision;
    }

    public void setAuthDecision(Character authDecision) {
        this.authDecision = authDecision;
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

    public Character getFuelTankRstcFlg() {
        return fuelTankRstcFlg;
    }

    public void setFuelTankRstcFlg(Character fuelTankRstcFlg) {
        this.fuelTankRstcFlg = fuelTankRstcFlg;
    }

    public BigDecimal getFuelTankVarPct() {
        return fuelTankVarPct;
    }

    public void setFuelTankVarPct(BigDecimal fuelTankVarPct) {
        this.fuelTankVarPct = fuelTankVarPct;
    }

    public int getFuelTankMaxAgeCnt() {
        return fuelTankMaxAgeCnt;
    }

    public void setFuelTankMaxAgeCnt(int fuelTankMaxAgeCnt) {
        this.fuelTankMaxAgeCnt = fuelTankMaxAgeCnt;
    }

    public Character getProximityDeclFlg() {
        return proximityDeclFlg;
    }

    public void setProximityDeclFlg(Character proximityDeclFlg) {
        this.proximityDeclFlg = proximityDeclFlg;
    }

    public Character getFuelTankEmailFlg() {
        return fuelTankEmailFlg;
    }

    public void setFuelTankEmailFlg(Character fuelTankEmailFlg) {
        this.fuelTankEmailFlg = fuelTankEmailFlg;
    }

    public String getEmailFuelNotif1() {
        return emailFuelNotif1;
    }

    public void setEmailFuelNotif1(String emailFuelNotif1) {
        this.emailFuelNotif1 = emailFuelNotif1;
    }

    public String getEmailFuelNotif2() {
        return emailFuelNotif2;
    }

    public void setEmailFuelNotif2(String emailFuelNotif2) {
        this.emailFuelNotif2 = emailFuelNotif2;
    }

    public String getEmailFuelNotif3() {
        return emailFuelNotif3;
    }

    public void setEmailFuelNotif3(String emailFuelNotif3) {
        this.emailFuelNotif3 = emailFuelNotif3;
    }

    public String getEmailFuelNotif4() {
        return emailFuelNotif4;
    }

    public void setEmailFuelNotif4(String emailFuelNotif4) {
        this.emailFuelNotif4 = emailFuelNotif4;
    }

    public String getEmailFuelNotif5() {
        return emailFuelNotif5;
    }

    public void setEmailFuelNotif5(String emailFuelNotif5) {
        this.emailFuelNotif5 = emailFuelNotif5;
    }

    public Character getFuelDeclFlg() {
        return fuelDeclFlg;
    }

    public void setFuelDeclFlg(Character fuelDeclFlg) {
        this.fuelDeclFlg = fuelDeclFlg;
    }

    public Character getProxStleDeclFlg() {
        return proxStleDeclFlg;
    }

    public void setProxStleDeclFlg(Character proxStleDeclFlg) {
        this.proxStleDeclFlg = proxStleDeclFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unitPrfPK != null ? unitPrfPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UnitPrf)) {
            return false;
        }
        UnitPrf other = (UnitPrf) object;
        if ((this.unitPrfPK == null && other.unitPrfPK != null) || (this.unitPrfPK != null && !this.unitPrfPK.equals(other.unitPrfPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UnitPrf[ unitPrfPK=" + unitPrfPK + " ]";
    }

}
