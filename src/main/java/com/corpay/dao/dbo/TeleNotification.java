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
@Table(name = "TELE_NOTIFICATION", catalog = "", schema = "DBO")
public class TeleNotification implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TeleNotificationPK teleNotificationPK;
    @Basic(optional = false)
    @Column(name = "PING_RETRIEVE_TIME_JAVA")
    private int pingRetrieveTimeJava;
    @Basic(optional = false)
    @Column(name = "PING_RETRIEVE_TIME_HOST")
    private int pingRetrieveTimeHost;
    @Basic(optional = false)
    @Column(name = "EVAL_PROCESS_TIME")
    private int evalProcessTime;
    @Basic(optional = false)
    @Column(name = "TRANS_STATUS")
    private Character transStatus;
    @Basic(optional = false)
    @Column(name = "REASON_CODE")
    private short reasonCode;
    @Basic(optional = false)
    @Column(name = "REASON_CDE_DESCR")
    private String reasonCdeDescr;
    @Basic(optional = false)
    @Column(name = "CALC_DISTANCE")
    private int calcDistance;
    @Basic(optional = false)
    @Column(name = "ACTUAL_FUEL_LEVEL")
    private short actualFuelLevel;
    @Basic(optional = false)
    @Column(name = "ACTUAL_PING_AGE_PROX")
    private short actualPingAgeProx;
    @Basic(optional = false)
    @Column(name = "ACTUAL_PING_AGE_FUEL")
    private short actualPingAgeFuel;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "PROFILE_ID")
    private String profileId;
    @Basic(optional = false)
    @Column(name = "PROFILE_NAME")
    private String profileName;
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
    private short fuelTankLimit;
    @Basic(optional = false)
    @Column(name = "PING_AGE_LIMIT")
    private short pingAgeLimit;
    @Basic(optional = false)
    @Column(name = "SPEND_AMOUNT")
    private BigDecimal spendAmount;
    @Basic(optional = false)
    @Column(name = "FUEL_QTY_LMT")
    private int fuelQtyLmt;
    @Basic(optional = false)
    @Column(name = "DEVICE_ID")
    private String deviceId;
    @Basic(optional = false)
    @Column(name = "DEVICE_NM")
    private String deviceNm;
    @Basic(optional = false)
    @Column(name = "PARTNER_NAME")
    private String partnerName;
    @Basic(optional = false)
    @Column(name = "MRCH_NAME")
    private String mrchName;
    @Basic(optional = false)
    @Column(name = "MRCH_ADDR")
    private String mrchAddr;
    @Basic(optional = false)
    @Column(name = "MRCH_CTY")
    private String mrchCty;
    @Basic(optional = false)
    @Column(name = "MRCH_ST")
    private String mrchSt;
    @Basic(optional = false)
    @Column(name = "MRCH_ZIP")
    private String mrchZip;
    @Basic(optional = false)
    @Column(name = "MRCH_CRTY_CD")
    private int mrchCrtyCd;
    @Basic(optional = false)
    @Column(name = "MRCH_ACQ_INST_ID_CD")
    private long mrchAcqInstIdCd;
    @Basic(optional = false)
    @Column(name = "MRCH_ACPT_ID")
    private String mrchAcptId;
    @Basic(optional = false)
    @Column(name = "MRCH_TERM_ID")
    private String mrchTermId;
    @Basic(optional = false)
    @Column(name = "MRCH_LOC_ID")
    private String mrchLocId;
    @Basic(optional = false)
    @Column(name = "MRCH_LAT")
    private BigDecimal mrchLat;
    @Basic(optional = false)
    @Column(name = "MRCH_LONG")
    private BigDecimal mrchLong;
    @Basic(optional = false)
    @Column(name = "VEH_LAT")
    private BigDecimal vehLat;
    @Basic(optional = false)
    @Column(name = "VEH_LONG")
    private BigDecimal vehLong;
    @Basic(optional = false)
    @Column(name = "EMAIL_SENT")
    private Character emailSent;
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
    @Column(name = "PROXIMITY_DECL_FLG")
    private Character proximityDeclFlg;
    @Basic(optional = false)
    @Column(name = "EMAIL_TXN_NOTIF_IND_FLG")
    private Character emailTxnNotifIndFlg;
    @Basic(optional = false)
    @Column(name = "FUEL_TANK_MAX_AGE_CNT")
    private short fuelTankMaxAgeCnt;
    @Basic(optional = false)
    @Column(name = "FUEL_TANK_RSTC_FLG")
    private Character fuelTankRstcFlg;
    @Basic(optional = false)
    @Column(name = "FUEL_AUTHED_AMT")
    private BigDecimal fuelAuthedAmt;
    @Basic(optional = false)
    @Column(name = "FUEL_TANK_EMAIL_FLG")
    private Character fuelTankEmailFlg;
    @Basic(optional = false)
    @Column(name = "FUEL_EMAIL_SENT_FLG")
    private Character fuelEmailSentFlg;
    @Basic(optional = false)
    @Column(name = "FUEL_DECL_FLG")
    private Character fuelDeclFlg;
    @Basic(optional = false)
    @Column(name = "FUEL_AUTH_DECISION_FLG")
    private Character fuelAuthDecisionFlg;
    @Basic(optional = false)
    @Column(name = "MC_LST_PURCH_PRD")
    private String mcLstPurchPrd;
    @Basic(optional = false)
    @Column(name = "AVG_PPG_USED")
    private BigDecimal avgPpgUsed;
    @Basic(optional = false)
    @Column(name = "PRE_AUTH_AMT")
    private BigDecimal preAuthAmt;
    @Basic(optional = false)
    @Column(name = "PRE_AUTH_CALC_AMT")
    private BigDecimal preAuthCalcAmt;
    @Basic(optional = false)
    @Column(name = "MRCH_ACCPT_LESSOR_FLG")
    private Character mrchAccptLessorFlg;
    @Basic(optional = false)
    @Column(name = "PREAUTH_POSTING_FLG")
    private Character preauthPostingFlg;
    @Basic(optional = false)
    @Column(name = "PROX_STLE_DECL_FLG")
    private Character proxStleDeclFlg;
    @Basic(optional = false)
    @Column(name = "DRIVER_NAME")
    private String driverName;

    public TeleNotification() {
    }

    public TeleNotification(TeleNotificationPK teleNotificationPK) {
        this.teleNotificationPK = teleNotificationPK;
    }

    public TeleNotification(TeleNotificationPK teleNotificationPK, int pingRetrieveTimeJava, int pingRetrieveTimeHost, int evalProcessTime, Character transStatus, short reasonCode, String reasonCdeDescr, int calcDistance, short actualFuelLevel, short actualPingAgeProx, short actualPingAgeFuel, String unitNbr, String crdNbr, String profileId, String profileName, Character proximityInd, BigDecimal proximityLimit, Character fuelTankInd, short fuelTankLimit, short pingAgeLimit, BigDecimal spendAmount, int fuelQtyLmt, String deviceId, String deviceNm, String partnerName, String mrchName, String mrchAddr, String mrchCty, String mrchSt, String mrchZip, int mrchCrtyCd, long mrchAcqInstIdCd, String mrchAcptId, String mrchTermId, String mrchLocId, BigDecimal mrchLat, BigDecimal mrchLong, BigDecimal vehLat, BigDecimal vehLong, Character emailSent, Character authDecision, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character proximityDeclFlg, Character emailTxnNotifIndFlg, short fuelTankMaxAgeCnt, Character fuelTankRstcFlg, BigDecimal fuelAuthedAmt, Character fuelTankEmailFlg, Character fuelEmailSentFlg, Character fuelDeclFlg, Character fuelAuthDecisionFlg, String mcLstPurchPrd, BigDecimal avgPpgUsed, BigDecimal preAuthAmt, BigDecimal preAuthCalcAmt, Character mrchAccptLessorFlg, Character preauthPostingFlg, Character proxStleDeclFlg, String driverName) {
        this.teleNotificationPK = teleNotificationPK;
        this.pingRetrieveTimeJava = pingRetrieveTimeJava;
        this.pingRetrieveTimeHost = pingRetrieveTimeHost;
        this.evalProcessTime = evalProcessTime;
        this.transStatus = transStatus;
        this.reasonCode = reasonCode;
        this.reasonCdeDescr = reasonCdeDescr;
        this.calcDistance = calcDistance;
        this.actualFuelLevel = actualFuelLevel;
        this.actualPingAgeProx = actualPingAgeProx;
        this.actualPingAgeFuel = actualPingAgeFuel;
        this.unitNbr = unitNbr;
        this.crdNbr = crdNbr;
        this.profileId = profileId;
        this.profileName = profileName;
        this.proximityInd = proximityInd;
        this.proximityLimit = proximityLimit;
        this.fuelTankInd = fuelTankInd;
        this.fuelTankLimit = fuelTankLimit;
        this.pingAgeLimit = pingAgeLimit;
        this.spendAmount = spendAmount;
        this.fuelQtyLmt = fuelQtyLmt;
        this.deviceId = deviceId;
        this.deviceNm = deviceNm;
        this.partnerName = partnerName;
        this.mrchName = mrchName;
        this.mrchAddr = mrchAddr;
        this.mrchCty = mrchCty;
        this.mrchSt = mrchSt;
        this.mrchZip = mrchZip;
        this.mrchCrtyCd = mrchCrtyCd;
        this.mrchAcqInstIdCd = mrchAcqInstIdCd;
        this.mrchAcptId = mrchAcptId;
        this.mrchTermId = mrchTermId;
        this.mrchLocId = mrchLocId;
        this.mrchLat = mrchLat;
        this.mrchLong = mrchLong;
        this.vehLat = vehLat;
        this.vehLong = vehLong;
        this.emailSent = emailSent;
        this.authDecision = authDecision;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.proximityDeclFlg = proximityDeclFlg;
        this.emailTxnNotifIndFlg = emailTxnNotifIndFlg;
        this.fuelTankMaxAgeCnt = fuelTankMaxAgeCnt;
        this.fuelTankRstcFlg = fuelTankRstcFlg;
        this.fuelAuthedAmt = fuelAuthedAmt;
        this.fuelTankEmailFlg = fuelTankEmailFlg;
        this.fuelEmailSentFlg = fuelEmailSentFlg;
        this.fuelDeclFlg = fuelDeclFlg;
        this.fuelAuthDecisionFlg = fuelAuthDecisionFlg;
        this.mcLstPurchPrd = mcLstPurchPrd;
        this.avgPpgUsed = avgPpgUsed;
        this.preAuthAmt = preAuthAmt;
        this.preAuthCalcAmt = preAuthCalcAmt;
        this.mrchAccptLessorFlg = mrchAccptLessorFlg;
        this.preauthPostingFlg = preauthPostingFlg;
        this.proxStleDeclFlg = proxStleDeclFlg;
        this.driverName = driverName;
    }

    public TeleNotification(String acctCd, String custId, Date transTs) {
        this.teleNotificationPK = new TeleNotificationPK(acctCd, custId, transTs);
    }

    public TeleNotificationPK getTeleNotificationPK() {
        return teleNotificationPK;
    }

    public void setTeleNotificationPK(TeleNotificationPK teleNotificationPK) {
        this.teleNotificationPK = teleNotificationPK;
    }

    public int getPingRetrieveTimeJava() {
        return pingRetrieveTimeJava;
    }

    public void setPingRetrieveTimeJava(int pingRetrieveTimeJava) {
        this.pingRetrieveTimeJava = pingRetrieveTimeJava;
    }

    public int getPingRetrieveTimeHost() {
        return pingRetrieveTimeHost;
    }

    public void setPingRetrieveTimeHost(int pingRetrieveTimeHost) {
        this.pingRetrieveTimeHost = pingRetrieveTimeHost;
    }

    public int getEvalProcessTime() {
        return evalProcessTime;
    }

    public void setEvalProcessTime(int evalProcessTime) {
        this.evalProcessTime = evalProcessTime;
    }

    public Character getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(Character transStatus) {
        this.transStatus = transStatus;
    }

    public short getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(short reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonCdeDescr() {
        return reasonCdeDescr;
    }

    public void setReasonCdeDescr(String reasonCdeDescr) {
        this.reasonCdeDescr = reasonCdeDescr;
    }

    public int getCalcDistance() {
        return calcDistance;
    }

    public void setCalcDistance(int calcDistance) {
        this.calcDistance = calcDistance;
    }

    public short getActualFuelLevel() {
        return actualFuelLevel;
    }

    public void setActualFuelLevel(short actualFuelLevel) {
        this.actualFuelLevel = actualFuelLevel;
    }

    public short getActualPingAgeProx() {
        return actualPingAgeProx;
    }

    public void setActualPingAgeProx(short actualPingAgeProx) {
        this.actualPingAgeProx = actualPingAgeProx;
    }

    public short getActualPingAgeFuel() {
        return actualPingAgeFuel;
    }

    public void setActualPingAgeFuel(short actualPingAgeFuel) {
        this.actualPingAgeFuel = actualPingAgeFuel;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
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

    public short getFuelTankLimit() {
        return fuelTankLimit;
    }

    public void setFuelTankLimit(short fuelTankLimit) {
        this.fuelTankLimit = fuelTankLimit;
    }

    public short getPingAgeLimit() {
        return pingAgeLimit;
    }

    public void setPingAgeLimit(short pingAgeLimit) {
        this.pingAgeLimit = pingAgeLimit;
    }

    public BigDecimal getSpendAmount() {
        return spendAmount;
    }

    public void setSpendAmount(BigDecimal spendAmount) {
        this.spendAmount = spendAmount;
    }

    public int getFuelQtyLmt() {
        return fuelQtyLmt;
    }

    public void setFuelQtyLmt(int fuelQtyLmt) {
        this.fuelQtyLmt = fuelQtyLmt;
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

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getMrchName() {
        return mrchName;
    }

    public void setMrchName(String mrchName) {
        this.mrchName = mrchName;
    }

    public String getMrchAddr() {
        return mrchAddr;
    }

    public void setMrchAddr(String mrchAddr) {
        this.mrchAddr = mrchAddr;
    }

    public String getMrchCty() {
        return mrchCty;
    }

    public void setMrchCty(String mrchCty) {
        this.mrchCty = mrchCty;
    }

    public String getMrchSt() {
        return mrchSt;
    }

    public void setMrchSt(String mrchSt) {
        this.mrchSt = mrchSt;
    }

    public String getMrchZip() {
        return mrchZip;
    }

    public void setMrchZip(String mrchZip) {
        this.mrchZip = mrchZip;
    }

    public int getMrchCrtyCd() {
        return mrchCrtyCd;
    }

    public void setMrchCrtyCd(int mrchCrtyCd) {
        this.mrchCrtyCd = mrchCrtyCd;
    }

    public long getMrchAcqInstIdCd() {
        return mrchAcqInstIdCd;
    }

    public void setMrchAcqInstIdCd(long mrchAcqInstIdCd) {
        this.mrchAcqInstIdCd = mrchAcqInstIdCd;
    }

    public String getMrchAcptId() {
        return mrchAcptId;
    }

    public void setMrchAcptId(String mrchAcptId) {
        this.mrchAcptId = mrchAcptId;
    }

    public String getMrchTermId() {
        return mrchTermId;
    }

    public void setMrchTermId(String mrchTermId) {
        this.mrchTermId = mrchTermId;
    }

    public String getMrchLocId() {
        return mrchLocId;
    }

    public void setMrchLocId(String mrchLocId) {
        this.mrchLocId = mrchLocId;
    }

    public BigDecimal getMrchLat() {
        return mrchLat;
    }

    public void setMrchLat(BigDecimal mrchLat) {
        this.mrchLat = mrchLat;
    }

    public BigDecimal getMrchLong() {
        return mrchLong;
    }

    public void setMrchLong(BigDecimal mrchLong) {
        this.mrchLong = mrchLong;
    }

    public BigDecimal getVehLat() {
        return vehLat;
    }

    public void setVehLat(BigDecimal vehLat) {
        this.vehLat = vehLat;
    }

    public BigDecimal getVehLong() {
        return vehLong;
    }

    public void setVehLong(BigDecimal vehLong) {
        this.vehLong = vehLong;
    }

    public Character getEmailSent() {
        return emailSent;
    }

    public void setEmailSent(Character emailSent) {
        this.emailSent = emailSent;
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

    public Character getProximityDeclFlg() {
        return proximityDeclFlg;
    }

    public void setProximityDeclFlg(Character proximityDeclFlg) {
        this.proximityDeclFlg = proximityDeclFlg;
    }

    public Character getEmailTxnNotifIndFlg() {
        return emailTxnNotifIndFlg;
    }

    public void setEmailTxnNotifIndFlg(Character emailTxnNotifIndFlg) {
        this.emailTxnNotifIndFlg = emailTxnNotifIndFlg;
    }

    public short getFuelTankMaxAgeCnt() {
        return fuelTankMaxAgeCnt;
    }

    public void setFuelTankMaxAgeCnt(short fuelTankMaxAgeCnt) {
        this.fuelTankMaxAgeCnt = fuelTankMaxAgeCnt;
    }

    public Character getFuelTankRstcFlg() {
        return fuelTankRstcFlg;
    }

    public void setFuelTankRstcFlg(Character fuelTankRstcFlg) {
        this.fuelTankRstcFlg = fuelTankRstcFlg;
    }

    public BigDecimal getFuelAuthedAmt() {
        return fuelAuthedAmt;
    }

    public void setFuelAuthedAmt(BigDecimal fuelAuthedAmt) {
        this.fuelAuthedAmt = fuelAuthedAmt;
    }

    public Character getFuelTankEmailFlg() {
        return fuelTankEmailFlg;
    }

    public void setFuelTankEmailFlg(Character fuelTankEmailFlg) {
        this.fuelTankEmailFlg = fuelTankEmailFlg;
    }

    public Character getFuelEmailSentFlg() {
        return fuelEmailSentFlg;
    }

    public void setFuelEmailSentFlg(Character fuelEmailSentFlg) {
        this.fuelEmailSentFlg = fuelEmailSentFlg;
    }

    public Character getFuelDeclFlg() {
        return fuelDeclFlg;
    }

    public void setFuelDeclFlg(Character fuelDeclFlg) {
        this.fuelDeclFlg = fuelDeclFlg;
    }

    public Character getFuelAuthDecisionFlg() {
        return fuelAuthDecisionFlg;
    }

    public void setFuelAuthDecisionFlg(Character fuelAuthDecisionFlg) {
        this.fuelAuthDecisionFlg = fuelAuthDecisionFlg;
    }

    public String getMcLstPurchPrd() {
        return mcLstPurchPrd;
    }

    public void setMcLstPurchPrd(String mcLstPurchPrd) {
        this.mcLstPurchPrd = mcLstPurchPrd;
    }

    public BigDecimal getAvgPpgUsed() {
        return avgPpgUsed;
    }

    public void setAvgPpgUsed(BigDecimal avgPpgUsed) {
        this.avgPpgUsed = avgPpgUsed;
    }

    public BigDecimal getPreAuthAmt() {
        return preAuthAmt;
    }

    public void setPreAuthAmt(BigDecimal preAuthAmt) {
        this.preAuthAmt = preAuthAmt;
    }

    public BigDecimal getPreAuthCalcAmt() {
        return preAuthCalcAmt;
    }

    public void setPreAuthCalcAmt(BigDecimal preAuthCalcAmt) {
        this.preAuthCalcAmt = preAuthCalcAmt;
    }

    public Character getMrchAccptLessorFlg() {
        return mrchAccptLessorFlg;
    }

    public void setMrchAccptLessorFlg(Character mrchAccptLessorFlg) {
        this.mrchAccptLessorFlg = mrchAccptLessorFlg;
    }

    public Character getPreauthPostingFlg() {
        return preauthPostingFlg;
    }

    public void setPreauthPostingFlg(Character preauthPostingFlg) {
        this.preauthPostingFlg = preauthPostingFlg;
    }

    public Character getProxStleDeclFlg() {
        return proxStleDeclFlg;
    }

    public void setProxStleDeclFlg(Character proxStleDeclFlg) {
        this.proxStleDeclFlg = proxStleDeclFlg;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teleNotificationPK != null ? teleNotificationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TeleNotification)) {
            return false;
        }
        TeleNotification other = (TeleNotification) object;
        if ((this.teleNotificationPK == null && other.teleNotificationPK != null) || (this.teleNotificationPK != null && !this.teleNotificationPK.equals(other.teleNotificationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TeleNotification[ teleNotificationPK=" + teleNotificationPK + " ]";
    }

}
