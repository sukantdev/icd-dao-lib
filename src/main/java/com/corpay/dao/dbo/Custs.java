/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CUSTS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Custs.findAll", query = "SELECT c FROM Custs c")})
public class Custs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CUST_STAT")
    private Character custStat;
    @Basic(optional = false)
    @Column(name = "CUST_NM")
    private String custNm;
    @Basic(optional = false)
    @Column(name = "CRD_TYP")
    private String crdTyp;
    @Basic(optional = false)
    @Column(name = "DRV_ID_MST")
    private String drvIdMst;
    @Basic(optional = false)
    @Column(name = "UNIT_MST")
    private String unitMst;
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
    @Column(name = "VOICE_EMAIL_IND")
    private Character voiceEmailInd;
    @Basic(optional = false)
    @Column(name = "FAX_MAIL_IND")
    private Character faxMailInd;
    @Basic(optional = false)
    @Column(name = "PH_SRV_IND")
    private Character phSrvInd;
    @Basic(optional = false)
    @Column(name = "EXP_CASH_IND")
    private Character expCashInd;
    @Basic(optional = false)
    @Column(name = "PMT_SRVS_IND")
    private Character pmtSrvsInd;
    @Basic(optional = false)
    @Column(name = "EXP_CASH_LDFEE_IND")
    private Character expCashLdfeeInd;
    @Basic(optional = false)
    @Column(name = "DDPOS_PRE_NOTE_IND")
    private Character ddposPreNoteInd;
    @Basic(optional = false)
    @Column(name = "DDPOS_METHOD_IND")
    private Character ddposMethodInd;
    @Basic(optional = false)
    @Column(name = "FLT_CUST_ID")
    private Character fltCustId;
    @Basic(optional = false)
    @Column(name = "SCNDY_CRD_IND")
    private Character scndyCrdInd;
    @Basic(optional = false)
    @Column(name = "FL_CUST_IND")
    private Character flCustInd;
    @Basic(optional = false)
    @Column(name = "EXP_CHK_IND")
    private Character expChkInd;
    @Basic(optional = false)
    @Column(name = "BAL_LMT_IND")
    private Character balLmtInd;
    @Basic(optional = false)
    @Column(name = "FLT_LMT_FLG")
    private Character fltLmtFlg;
    @Basic(optional = false)
    @Column(name = "CRD_STYLE_CD")
    private String crdStyleCd;
    @Basic(optional = false)
    @Column(name = "FUEL_PROX_FLG")
    private Character fuelProxFlg;
    @Basic(optional = false)
    @Column(name = "DIGITAL_WALLET_FLG")
    private Character digitalWalletFlg;
    @Basic(optional = false)
    @Column(name = "IN_AUTH_FLG")
    private Character inAuthFlg;
    @Basic(optional = false)
    @Column(name = "CNFG_ID")
    private String cnfgId;
    @Basic(optional = false)
    @Column(name = "ERECEIPT_PROGRAM_FLG")
    private Character ereceiptProgramFlg;
    @Basic(optional = false)
    @Column(name = "ERECEIPT_EMAIL_FLG")
    private Character ereceiptEmailFlg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ERECEIPT_FEE_AMT")
    private BigDecimal ereceiptFeeAmt;
    @Basic(optional = false)
    @Column(name = "CUST_EV_FLG")
    private Character custEvFlg;
    @Basic(optional = false)
    @Column(name = "ERECEIPT_NPF1_AMT")
    private BigDecimal ereceiptNpf1Amt;
    @Basic(optional = false)
    @Column(name = "ERECEIPT_NPF2_AMT")
    private BigDecimal ereceiptNpf2Amt;
    @Basic(optional = false)
    @Column(name = "AUTO_LOCK_ENROLLMENT_FLG")
    private Character autoLockEnrollmentFlg;
    @Basic(optional = false)
    @Column(name = "AUTO_LOCK_EXPIRY_MINS")
    private short autoLockExpiryMins;
    @Basic(optional = false)
    @Column(name = "DW_EXCL_YELLOW_PATH_FLG")
    private Character dwExclYellowPathFlg;
    @Basic(optional = false)
    @Column(name = "THRD_PAC_FLG")
    private Character thrdPacFlg;
    @Basic(optional = false)
    @Column(name = "MC_LIMITED_NETW_FLG")
    private Character mcLimitedNetwFlg;
    @Basic(optional = false)
    @Column(name = "MC_NETW_MASTER_ID")
    private String mcNetwMasterId;
    @Basic(optional = false)
    @Column(name = "CDN_RELAT_FLG")
    private Character cdnRelatFlg;
    @Basic(optional = false)
    @Column(name = "CDN_RELAT_MASTER_ID")
    private String cdnRelatMasterId;
    @Basic(optional = false)
    @Column(name = "MOB_DIR_DEP_FLG")
    private Character mobDirDepFlg;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custs", fetch = FetchType.LAZY)
    private Set<AlertCusts> alertCustsSet;

    public Custs() {
    }

    public Custs(String custId) {
        this.custId = custId;
    }

    public Custs(String custId, Character custStat, String custNm, String crdTyp, String drvIdMst, String unitMst, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character voiceEmailInd, Character faxMailInd, Character phSrvInd, Character expCashInd, Character pmtSrvsInd, Character expCashLdfeeInd, Character ddposPreNoteInd, Character ddposMethodInd, Character fltCustId, Character scndyCrdInd, Character flCustInd, Character expChkInd, Character balLmtInd, Character fltLmtFlg, String crdStyleCd, Character fuelProxFlg, Character digitalWalletFlg, Character inAuthFlg, String cnfgId, Character ereceiptProgramFlg, Character ereceiptEmailFlg, BigDecimal ereceiptFeeAmt, Character custEvFlg, BigDecimal ereceiptNpf1Amt, BigDecimal ereceiptNpf2Amt, Character autoLockEnrollmentFlg, short autoLockExpiryMins, Character dwExclYellowPathFlg, Character thrdPacFlg, Character mcLimitedNetwFlg, String mcNetwMasterId, Character cdnRelatFlg, String cdnRelatMasterId, Character mobDirDepFlg) {
        this.custId = custId;
        this.custStat = custStat;
        this.custNm = custNm;
        this.crdTyp = crdTyp;
        this.drvIdMst = drvIdMst;
        this.unitMst = unitMst;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.voiceEmailInd = voiceEmailInd;
        this.faxMailInd = faxMailInd;
        this.phSrvInd = phSrvInd;
        this.expCashInd = expCashInd;
        this.pmtSrvsInd = pmtSrvsInd;
        this.expCashLdfeeInd = expCashLdfeeInd;
        this.ddposPreNoteInd = ddposPreNoteInd;
        this.ddposMethodInd = ddposMethodInd;
        this.fltCustId = fltCustId;
        this.scndyCrdInd = scndyCrdInd;
        this.flCustInd = flCustInd;
        this.expChkInd = expChkInd;
        this.balLmtInd = balLmtInd;
        this.fltLmtFlg = fltLmtFlg;
        this.crdStyleCd = crdStyleCd;
        this.fuelProxFlg = fuelProxFlg;
        this.digitalWalletFlg = digitalWalletFlg;
        this.inAuthFlg = inAuthFlg;
        this.cnfgId = cnfgId;
        this.ereceiptProgramFlg = ereceiptProgramFlg;
        this.ereceiptEmailFlg = ereceiptEmailFlg;
        this.ereceiptFeeAmt = ereceiptFeeAmt;
        this.custEvFlg = custEvFlg;
        this.ereceiptNpf1Amt = ereceiptNpf1Amt;
        this.ereceiptNpf2Amt = ereceiptNpf2Amt;
        this.autoLockEnrollmentFlg = autoLockEnrollmentFlg;
        this.autoLockExpiryMins = autoLockExpiryMins;
        this.dwExclYellowPathFlg = dwExclYellowPathFlg;
        this.thrdPacFlg = thrdPacFlg;
        this.mcLimitedNetwFlg = mcLimitedNetwFlg;
        this.mcNetwMasterId = mcNetwMasterId;
        this.cdnRelatFlg = cdnRelatFlg;
        this.cdnRelatMasterId = cdnRelatMasterId;
        this.mobDirDepFlg = mobDirDepFlg;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Character getCustStat() {
        return custStat;
    }

    public void setCustStat(Character custStat) {
        this.custStat = custStat;
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getCrdTyp() {
        return crdTyp;
    }

    public void setCrdTyp(String crdTyp) {
        this.crdTyp = crdTyp;
    }

    public String getDrvIdMst() {
        return drvIdMst;
    }

    public void setDrvIdMst(String drvIdMst) {
        this.drvIdMst = drvIdMst;
    }

    public String getUnitMst() {
        return unitMst;
    }

    public void setUnitMst(String unitMst) {
        this.unitMst = unitMst;
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

    public Character getVoiceEmailInd() {
        return voiceEmailInd;
    }

    public void setVoiceEmailInd(Character voiceEmailInd) {
        this.voiceEmailInd = voiceEmailInd;
    }

    public Character getFaxMailInd() {
        return faxMailInd;
    }

    public void setFaxMailInd(Character faxMailInd) {
        this.faxMailInd = faxMailInd;
    }

    public Character getPhSrvInd() {
        return phSrvInd;
    }

    public void setPhSrvInd(Character phSrvInd) {
        this.phSrvInd = phSrvInd;
    }

    public Character getExpCashInd() {
        return expCashInd;
    }

    public void setExpCashInd(Character expCashInd) {
        this.expCashInd = expCashInd;
    }

    public Character getPmtSrvsInd() {
        return pmtSrvsInd;
    }

    public void setPmtSrvsInd(Character pmtSrvsInd) {
        this.pmtSrvsInd = pmtSrvsInd;
    }

    public Character getExpCashLdfeeInd() {
        return expCashLdfeeInd;
    }

    public void setExpCashLdfeeInd(Character expCashLdfeeInd) {
        this.expCashLdfeeInd = expCashLdfeeInd;
    }

    public Character getDdposPreNoteInd() {
        return ddposPreNoteInd;
    }

    public void setDdposPreNoteInd(Character ddposPreNoteInd) {
        this.ddposPreNoteInd = ddposPreNoteInd;
    }

    public Character getDdposMethodInd() {
        return ddposMethodInd;
    }

    public void setDdposMethodInd(Character ddposMethodInd) {
        this.ddposMethodInd = ddposMethodInd;
    }

    public Character getFltCustId() {
        return fltCustId;
    }

    public void setFltCustId(Character fltCustId) {
        this.fltCustId = fltCustId;
    }

    public Character getScndyCrdInd() {
        return scndyCrdInd;
    }

    public void setScndyCrdInd(Character scndyCrdInd) {
        this.scndyCrdInd = scndyCrdInd;
    }

    public Character getFlCustInd() {
        return flCustInd;
    }

    public void setFlCustInd(Character flCustInd) {
        this.flCustInd = flCustInd;
    }

    public Character getExpChkInd() {
        return expChkInd;
    }

    public void setExpChkInd(Character expChkInd) {
        this.expChkInd = expChkInd;
    }

    public Character getBalLmtInd() {
        return balLmtInd;
    }

    public void setBalLmtInd(Character balLmtInd) {
        this.balLmtInd = balLmtInd;
    }

    public Character getFltLmtFlg() {
        return fltLmtFlg;
    }

    public void setFltLmtFlg(Character fltLmtFlg) {
        this.fltLmtFlg = fltLmtFlg;
    }

    public String getCrdStyleCd() {
        return crdStyleCd;
    }

    public void setCrdStyleCd(String crdStyleCd) {
        this.crdStyleCd = crdStyleCd;
    }

    public Character getFuelProxFlg() {
        return fuelProxFlg;
    }

    public void setFuelProxFlg(Character fuelProxFlg) {
        this.fuelProxFlg = fuelProxFlg;
    }

    public Character getDigitalWalletFlg() {
        return digitalWalletFlg;
    }

    public void setDigitalWalletFlg(Character digitalWalletFlg) {
        this.digitalWalletFlg = digitalWalletFlg;
    }

    public Character getInAuthFlg() {
        return inAuthFlg;
    }

    public void setInAuthFlg(Character inAuthFlg) {
        this.inAuthFlg = inAuthFlg;
    }

    public String getCnfgId() {
        return cnfgId;
    }

    public void setCnfgId(String cnfgId) {
        this.cnfgId = cnfgId;
    }

    public Character getEreceiptProgramFlg() {
        return ereceiptProgramFlg;
    }

    public void setEreceiptProgramFlg(Character ereceiptProgramFlg) {
        this.ereceiptProgramFlg = ereceiptProgramFlg;
    }

    public Character getEreceiptEmailFlg() {
        return ereceiptEmailFlg;
    }

    public void setEreceiptEmailFlg(Character ereceiptEmailFlg) {
        this.ereceiptEmailFlg = ereceiptEmailFlg;
    }

    public BigDecimal getEreceiptFeeAmt() {
        return ereceiptFeeAmt;
    }

    public void setEreceiptFeeAmt(BigDecimal ereceiptFeeAmt) {
        this.ereceiptFeeAmt = ereceiptFeeAmt;
    }

    public Character getCustEvFlg() {
        return custEvFlg;
    }

    public void setCustEvFlg(Character custEvFlg) {
        this.custEvFlg = custEvFlg;
    }

    public BigDecimal getEreceiptNpf1Amt() {
        return ereceiptNpf1Amt;
    }

    public void setEreceiptNpf1Amt(BigDecimal ereceiptNpf1Amt) {
        this.ereceiptNpf1Amt = ereceiptNpf1Amt;
    }

    public BigDecimal getEreceiptNpf2Amt() {
        return ereceiptNpf2Amt;
    }

    public void setEreceiptNpf2Amt(BigDecimal ereceiptNpf2Amt) {
        this.ereceiptNpf2Amt = ereceiptNpf2Amt;
    }

    public Character getAutoLockEnrollmentFlg() {
        return autoLockEnrollmentFlg;
    }

    public void setAutoLockEnrollmentFlg(Character autoLockEnrollmentFlg) {
        this.autoLockEnrollmentFlg = autoLockEnrollmentFlg;
    }

    public short getAutoLockExpiryMins() {
        return autoLockExpiryMins;
    }

    public void setAutoLockExpiryMins(short autoLockExpiryMins) {
        this.autoLockExpiryMins = autoLockExpiryMins;
    }

    public Character getDwExclYellowPathFlg() {
        return dwExclYellowPathFlg;
    }

    public void setDwExclYellowPathFlg(Character dwExclYellowPathFlg) {
        this.dwExclYellowPathFlg = dwExclYellowPathFlg;
    }

    public Character getThrdPacFlg() {
        return thrdPacFlg;
    }

    public void setThrdPacFlg(Character thrdPacFlg) {
        this.thrdPacFlg = thrdPacFlg;
    }

    public Character getMcLimitedNetwFlg() {
        return mcLimitedNetwFlg;
    }

    public void setMcLimitedNetwFlg(Character mcLimitedNetwFlg) {
        this.mcLimitedNetwFlg = mcLimitedNetwFlg;
    }

    public String getMcNetwMasterId() {
        return mcNetwMasterId;
    }

    public void setMcNetwMasterId(String mcNetwMasterId) {
        this.mcNetwMasterId = mcNetwMasterId;
    }

    public Character getCdnRelatFlg() {
        return cdnRelatFlg;
    }

    public void setCdnRelatFlg(Character cdnRelatFlg) {
        this.cdnRelatFlg = cdnRelatFlg;
    }

    public String getCdnRelatMasterId() {
        return cdnRelatMasterId;
    }

    public void setCdnRelatMasterId(String cdnRelatMasterId) {
        this.cdnRelatMasterId = cdnRelatMasterId;
    }

    public Character getMobDirDepFlg() {
        return mobDirDepFlg;
    }

    public void setMobDirDepFlg(Character mobDirDepFlg) {
        this.mobDirDepFlg = mobDirDepFlg;
    }

    public Set<AlertCusts> getAlertCustsSet() {
        return alertCustsSet;
    }

    public void setAlertCustsSet(Set<AlertCusts> alertCustsSet) {
        this.alertCustsSet = alertCustsSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Custs)) {
            return false;
        }
        Custs other = (Custs) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Custs[ custId=" + custId + " ]";
    }
    
}
