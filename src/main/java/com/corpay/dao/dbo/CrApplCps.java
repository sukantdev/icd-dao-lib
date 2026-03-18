package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "CR_APPL_CPS", catalog = "", schema = "DBO")
public class CrApplCps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "DBA_BUS_NM")
    private String dbaBusNm;
    @Basic(optional = false)
    @Column(name = "CORP_BUS_NM")
    private String corpBusNm;
    @Basic(optional = false)
    @Column(name = "PRD_TYP")
    private String prdTyp;
    @Basic(optional = false)
    @Column(name = "YEARS_IN_BUS")
    private short yearsInBus;
    @Basic(optional = false)
    @Column(name = "MONTHS_IN_BUS")
    private short monthsInBus;
    @Basic(optional = false)
    @Column(name = "REFUND_POLICY")
    private String refundPolicy;
    @Basic(optional = false)
    @Column(name = "INTRCHG_TYP")
    private String intrchgTyp;
    @Basic(optional = false)
    @Column(name = "CUR_SRV_PRVDR")
    private String curSrvPrvdr;
    @Basic(optional = false)
    @Column(name = "TR_BANK_NM")
    private String trBankNm;
    @Basic(optional = false)
    @Column(name = "TR_CNTCT_FST_NM")
    private String trCntctFstNm;
    @Basic(optional = false)
    @Column(name = "TR_CNTCT_LST_NM")
    private String trCntctLstNm;

    @Basic(optional = false)
    @Column(name = "INTRCHG_PLUS_PRCG")
    private BigDecimal intrchgPlusPrcg;
    @Basic(optional = false)
    @Column(name = "MC_QLFD_TRNS_RT")
    private BigDecimal mcQlfdTrnsRt;
    @Basic(optional = false)
    @Column(name = "MC_NON_QLFD_TRNS_R")
    private BigDecimal mcNonQlfdTrnsR;
    @Basic(optional = false)
    @Column(name = "MC_MID_QLFD_TRNS_R")
    private BigDecimal mcMidQlfdTrnsR;
    @Basic(optional = false)
    @Column(name = "MC_CHKCRD_DISC_RT")
    private BigDecimal mcChkcrdDiscRt;
    @Basic(optional = false)
    @Column(name = "MC_AUTH_FEE")
    private BigDecimal mcAuthFee;
    @Basic(optional = false)
    @Column(name = "VISA_QLFD_TRNS_RT")
    private BigDecimal visaQlfdTrnsRt;
    @Basic(optional = false)
    @Column(name = "VISA_NON_QLFD_TRNS")
    private BigDecimal visaNonQlfdTrns;
    @Basic(optional = false)
    @Column(name = "VISA_MID_QLFD_TRNS")
    private BigDecimal visaMidQlfdTrns;
    @Basic(optional = false)
    @Column(name = "VISA_CHKCRD_DISC_R")
    private BigDecimal visaChkcrdDiscR;
    @Basic(optional = false)
    @Column(name = "VISA_AUTH_FEE")
    private BigDecimal visaAuthFee;
    @Basic(optional = false)
    @Column(name = "DB_TRNS_FEE")
    private BigDecimal dbTrnsFee;
    @Basic(optional = false)
    @Column(name = "AMEX_DISC_AUTH_FEE")
    private BigDecimal amexDiscAuthFee;
    @Basic(optional = false)
    @Column(name = "VOICE_AUTH_FEE")
    private BigDecimal voiceAuthFee;
    @Basic(optional = false)
    @Column(name = "MTHLY_ACS_FEE")
    private BigDecimal mthlyAcsFee;
    @Basic(optional = false)
    @Column(name = "TRNS_FEE")
    private BigDecimal trnsFee;
    @Basic(optional = false)
    @Column(name = "RETRIEVAL_FEE_PER_")
    private BigDecimal retrievalFeePer;
    @Basic(optional = false)
    @Column(name = "MIN_PER_MO")
    private BigDecimal minPerMo;
    @Basic(optional = false)
    @Column(name = "STMT_FEE")
    private BigDecimal stmtFee;
    @Basic(optional = false)
    @Column(name = "CHRGBK_FEE_PER_ITM")
    private BigDecimal chrgbkFeePerItm;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_FEE")
    private BigDecimal custSrvFee;
    @Basic(optional = false)
    @Column(name = "APPL_FEE")
    private BigDecimal applFee;
    @Basic(optional = false)
    @Column(name = "SPCL_FEE_TERMS")
    private String spclFeeTerms;
    @Basic(optional = false)
    @Column(name = "AVG_TKT")
    private BigDecimal avgTkt;
    @Basic(optional = false)
    @Column(name = "MAX_TKT")
    private BigDecimal maxTkt;
    @Basic(optional = false)
    @Column(name = "AVG_MC_VISA_MTHLY_")
    private BigDecimal avgMcVisaMthly;
    @Basic(optional = false)
    @Column(name = "MAX_MC_VISA_MTHLY_")
    private BigDecimal maxMcVisaMthly;
    @Basic(optional = false)
    @Column(name = "PCT_NSWP_XTNS")
    private BigDecimal pctNswpXtns;
    @Basic(optional = false)
    @Column(name = "DSCVR_ACCT")
    private String dscvrAcct;
    @Basic(optional = false)
    @Column(name = "AMEX_ACCT")
    private String amexAcct;
    @Basic(optional = false)
    @Column(name = "DINERS_ACCT")
    private String dinersAcct;
    @Basic(optional = false)
    @Column(name = "OTH_ACCT")
    private String othAcct;
    @Basic(optional = false)
    @Column(name = "NEW_ACCT_DISC")
    private Character newAcctDisc;
    @Basic(optional = false)
    @Column(name = "NEW_ACCT_AMEX")
    private Character newAcctAmex;
    @Basic(optional = false)
    @Column(name = "MRCH_LOC_OWNRSHP")
    private Character mrchLocOwnrshp;
    @Basic(optional = false)
    @Column(name = "LLRD_NM")
    private String llrdNm;
    @Basic(optional = false)
    @Column(name = "LLRD_PH")
    private String llrdPh;
    @Basic(optional = false)
    @Column(name = "MRCH_BUS_AS_RPTD")
    private Character mrchBusAsRptd;
    @Basic(optional = false)
    @Column(name = "MRCH_ADQTLY_STFD")
    private Character mrchAdqtlyStfd;
    @Basic(optional = false)
    @Column(name = "MRCH_BUS_LIC_PSTD")
    private Character mrchBusLicPstd;
    @Basic(optional = false)
    @Column(name = "MRCH_PIC_SBMTD")
    private Character mrchPicSbmtd;
    @Basic(optional = false)
    @Column(name = "MRCH_PRNCPL_ID_CNF")
    private Character mrchPrncplIdCnf;
    @Basic(optional = false)
    @Column(name = "MRCH_SIGNER_ID_CNF")
    private Character mrchSignerIdCnf;
    @Basic(optional = false)
    @Column(name = "MRCH_SITE_SURVEY_C")
    private String mrchSiteSurveyC;
    @Basic(optional = false)
    @Column(name = "MRCH_ID_NBR")
    private String mrchIdNbr;
    @Basic(optional = false)
    @Column(name = "TERM_ID_NBR")
    private String termIdNbr;
    @Basic(optional = false)
    @Column(name = "INTRCHG_PLAN")
    private String intrchgPlan;
    @Basic(optional = false)
    @Column(name = "DISC_TYP")
    private Character discTyp;
    @Basic(optional = false)
    @Column(name = "AUTH_PLAN")
    private String authPlan;
    @Basic(optional = false)
    @Column(name = "ASGND_NBR")
    private String asgndNbr;
    @Basic(optional = false)
    @Column(name = "AGENT_NBR")
    private String agentNbr;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
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

    public CrApplCps() {
    }

    public CrApplCps(String applNbr) {
        this.applNbr = applNbr;
    }

    public CrApplCps(String applNbr, String dbaBusNm, String corpBusNm, String prdTyp, short yearsInBus, short monthsInBus, String refundPolicy, String intrchgTyp, String curSrvPrvdr, String trBankNm, String trCntctFstNm, String trCntctLstNm, BigDecimal intrchgPlusPrcg, BigDecimal mcQlfdTrnsRt, BigDecimal mcNonQlfdTrnsR, BigDecimal mcMidQlfdTrnsR, BigDecimal mcChkcrdDiscRt, BigDecimal mcAuthFee, BigDecimal visaQlfdTrnsRt, BigDecimal visaNonQlfdTrns, BigDecimal visaMidQlfdTrns, BigDecimal visaChkcrdDiscR, BigDecimal visaAuthFee, BigDecimal dbTrnsFee, BigDecimal amexDiscAuthFee, BigDecimal voiceAuthFee, BigDecimal mthlyAcsFee, BigDecimal trnsFee, BigDecimal retrievalFeePer, BigDecimal minPerMo, BigDecimal stmtFee, BigDecimal chrgbkFeePerItm, BigDecimal custSrvFee, BigDecimal applFee, String spclFeeTerms, BigDecimal avgTkt, BigDecimal maxTkt, BigDecimal avgMcVisaMthly, BigDecimal maxMcVisaMthly, BigDecimal pctNswpXtns, String dscvrAcct, String amexAcct, String dinersAcct, String othAcct, Character newAcctDisc, Character newAcctAmex, Character mrchLocOwnrshp, String llrdNm, String llrdPh, Character mrchBusAsRptd, Character mrchAdqtlyStfd, Character mrchBusLicPstd, Character mrchPicSbmtd, Character mrchPrncplIdCnf, Character mrchSignerIdCnf, String mrchSiteSurveyC, String mrchIdNbr, String termIdNbr, String intrchgPlan, Character discTyp, String authPlan, String asgndNbr, String agentNbr, String mdyUsr, Date crtTs, String crtUsr, Date mdyTs) {
        this.applNbr = applNbr;
        this.dbaBusNm = dbaBusNm;
        this.corpBusNm = corpBusNm;
        this.prdTyp = prdTyp;
        this.yearsInBus = yearsInBus;
        this.monthsInBus = monthsInBus;
        this.refundPolicy = refundPolicy;
        this.intrchgTyp = intrchgTyp;
        this.curSrvPrvdr = curSrvPrvdr;
        this.trBankNm = trBankNm;
        this.trCntctFstNm = trCntctFstNm;
        this.trCntctLstNm = trCntctLstNm;
        this.intrchgPlusPrcg = intrchgPlusPrcg;
        this.mcQlfdTrnsRt = mcQlfdTrnsRt;
        this.mcNonQlfdTrnsR = mcNonQlfdTrnsR;
        this.mcMidQlfdTrnsR = mcMidQlfdTrnsR;
        this.mcChkcrdDiscRt = mcChkcrdDiscRt;
        this.mcAuthFee = mcAuthFee;
        this.visaQlfdTrnsRt = visaQlfdTrnsRt;
        this.visaNonQlfdTrns = visaNonQlfdTrns;
        this.visaMidQlfdTrns = visaMidQlfdTrns;
        this.visaChkcrdDiscR = visaChkcrdDiscR;
        this.visaAuthFee = visaAuthFee;
        this.dbTrnsFee = dbTrnsFee;
        this.amexDiscAuthFee = amexDiscAuthFee;
        this.voiceAuthFee = voiceAuthFee;
        this.mthlyAcsFee = mthlyAcsFee;
        this.trnsFee = trnsFee;
        this.retrievalFeePer = retrievalFeePer;
        this.minPerMo = minPerMo;
        this.stmtFee = stmtFee;
        this.chrgbkFeePerItm = chrgbkFeePerItm;
        this.custSrvFee = custSrvFee;
        this.applFee = applFee;
        this.spclFeeTerms = spclFeeTerms;
        this.avgTkt = avgTkt;
        this.maxTkt = maxTkt;
        this.avgMcVisaMthly = avgMcVisaMthly;
        this.maxMcVisaMthly = maxMcVisaMthly;
        this.pctNswpXtns = pctNswpXtns;
        this.dscvrAcct = dscvrAcct;
        this.amexAcct = amexAcct;
        this.dinersAcct = dinersAcct;
        this.othAcct = othAcct;
        this.newAcctDisc = newAcctDisc;
        this.newAcctAmex = newAcctAmex;
        this.mrchLocOwnrshp = mrchLocOwnrshp;
        this.llrdNm = llrdNm;
        this.llrdPh = llrdPh;
        this.mrchBusAsRptd = mrchBusAsRptd;
        this.mrchAdqtlyStfd = mrchAdqtlyStfd;
        this.mrchBusLicPstd = mrchBusLicPstd;
        this.mrchPicSbmtd = mrchPicSbmtd;
        this.mrchPrncplIdCnf = mrchPrncplIdCnf;
        this.mrchSignerIdCnf = mrchSignerIdCnf;
        this.mrchSiteSurveyC = mrchSiteSurveyC;
        this.mrchIdNbr = mrchIdNbr;
        this.termIdNbr = termIdNbr;
        this.intrchgPlan = intrchgPlan;
        this.discTyp = discTyp;
        this.authPlan = authPlan;
        this.asgndNbr = asgndNbr;
        this.agentNbr = agentNbr;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getDbaBusNm() {
        return dbaBusNm;
    }

    public void setDbaBusNm(String dbaBusNm) {
        this.dbaBusNm = dbaBusNm;
    }

    public String getCorpBusNm() {
        return corpBusNm;
    }

    public void setCorpBusNm(String corpBusNm) {
        this.corpBusNm = corpBusNm;
    }

    public String getPrdTyp() {
        return prdTyp;
    }

    public void setPrdTyp(String prdTyp) {
        this.prdTyp = prdTyp;
    }

    public short getYearsInBus() {
        return yearsInBus;
    }

    public void setYearsInBus(short yearsInBus) {
        this.yearsInBus = yearsInBus;
    }

    public short getMonthsInBus() {
        return monthsInBus;
    }

    public void setMonthsInBus(short monthsInBus) {
        this.monthsInBus = monthsInBus;
    }

    public String getRefundPolicy() {
        return refundPolicy;
    }

    public void setRefundPolicy(String refundPolicy) {
        this.refundPolicy = refundPolicy;
    }

    public String getIntrchgTyp() {
        return intrchgTyp;
    }

    public void setIntrchgTyp(String intrchgTyp) {
        this.intrchgTyp = intrchgTyp;
    }

    public String getCurSrvPrvdr() {
        return curSrvPrvdr;
    }

    public void setCurSrvPrvdr(String curSrvPrvdr) {
        this.curSrvPrvdr = curSrvPrvdr;
    }

    public String getTrBankNm() {
        return trBankNm;
    }

    public void setTrBankNm(String trBankNm) {
        this.trBankNm = trBankNm;
    }

    public String getTrCntctFstNm() {
        return trCntctFstNm;
    }

    public void setTrCntctFstNm(String trCntctFstNm) {
        this.trCntctFstNm = trCntctFstNm;
    }

    public String getTrCntctLstNm() {
        return trCntctLstNm;
    }

    public void setTrCntctLstNm(String trCntctLstNm) {
        this.trCntctLstNm = trCntctLstNm;
    }

    public BigDecimal getIntrchgPlusPrcg() {
        return intrchgPlusPrcg;
    }

    public void setIntrchgPlusPrcg(BigDecimal intrchgPlusPrcg) {
        this.intrchgPlusPrcg = intrchgPlusPrcg;
    }

    public BigDecimal getMcQlfdTrnsRt() {
        return mcQlfdTrnsRt;
    }

    public void setMcQlfdTrnsRt(BigDecimal mcQlfdTrnsRt) {
        this.mcQlfdTrnsRt = mcQlfdTrnsRt;
    }

    public BigDecimal getMcNonQlfdTrnsR() {
        return mcNonQlfdTrnsR;
    }

    public void setMcNonQlfdTrnsR(BigDecimal mcNonQlfdTrnsR) {
        this.mcNonQlfdTrnsR = mcNonQlfdTrnsR;
    }

    public BigDecimal getMcMidQlfdTrnsR() {
        return mcMidQlfdTrnsR;
    }

    public void setMcMidQlfdTrnsR(BigDecimal mcMidQlfdTrnsR) {
        this.mcMidQlfdTrnsR = mcMidQlfdTrnsR;
    }

    public BigDecimal getMcChkcrdDiscRt() {
        return mcChkcrdDiscRt;
    }

    public void setMcChkcrdDiscRt(BigDecimal mcChkcrdDiscRt) {
        this.mcChkcrdDiscRt = mcChkcrdDiscRt;
    }

    public BigDecimal getMcAuthFee() {
        return mcAuthFee;
    }

    public void setMcAuthFee(BigDecimal mcAuthFee) {
        this.mcAuthFee = mcAuthFee;
    }

    public BigDecimal getVisaQlfdTrnsRt() {
        return visaQlfdTrnsRt;
    }

    public void setVisaQlfdTrnsRt(BigDecimal visaQlfdTrnsRt) {
        this.visaQlfdTrnsRt = visaQlfdTrnsRt;
    }

    public BigDecimal getVisaNonQlfdTrns() {
        return visaNonQlfdTrns;
    }

    public void setVisaNonQlfdTrns(BigDecimal visaNonQlfdTrns) {
        this.visaNonQlfdTrns = visaNonQlfdTrns;
    }

    public BigDecimal getVisaMidQlfdTrns() {
        return visaMidQlfdTrns;
    }

    public void setVisaMidQlfdTrns(BigDecimal visaMidQlfdTrns) {
        this.visaMidQlfdTrns = visaMidQlfdTrns;
    }

    public BigDecimal getVisaChkcrdDiscR() {
        return visaChkcrdDiscR;
    }

    public void setVisaChkcrdDiscR(BigDecimal visaChkcrdDiscR) {
        this.visaChkcrdDiscR = visaChkcrdDiscR;
    }

    public BigDecimal getVisaAuthFee() {
        return visaAuthFee;
    }

    public void setVisaAuthFee(BigDecimal visaAuthFee) {
        this.visaAuthFee = visaAuthFee;
    }

    public BigDecimal getDbTrnsFee() {
        return dbTrnsFee;
    }

    public void setDbTrnsFee(BigDecimal dbTrnsFee) {
        this.dbTrnsFee = dbTrnsFee;
    }

    public BigDecimal getAmexDiscAuthFee() {
        return amexDiscAuthFee;
    }

    public void setAmexDiscAuthFee(BigDecimal amexDiscAuthFee) {
        this.amexDiscAuthFee = amexDiscAuthFee;
    }

    public BigDecimal getVoiceAuthFee() {
        return voiceAuthFee;
    }

    public void setVoiceAuthFee(BigDecimal voiceAuthFee) {
        this.voiceAuthFee = voiceAuthFee;
    }

    public BigDecimal getMthlyAcsFee() {
        return mthlyAcsFee;
    }

    public void setMthlyAcsFee(BigDecimal mthlyAcsFee) {
        this.mthlyAcsFee = mthlyAcsFee;
    }

    public BigDecimal getTrnsFee() {
        return trnsFee;
    }

    public void setTrnsFee(BigDecimal trnsFee) {
        this.trnsFee = trnsFee;
    }

    public BigDecimal getRetrievalFeePer() {
        return retrievalFeePer;
    }

    public void setRetrievalFeePer(BigDecimal retrievalFeePer) {
        this.retrievalFeePer = retrievalFeePer;
    }

    public BigDecimal getMinPerMo() {
        return minPerMo;
    }

    public void setMinPerMo(BigDecimal minPerMo) {
        this.minPerMo = minPerMo;
    }

    public BigDecimal getStmtFee() {
        return stmtFee;
    }

    public void setStmtFee(BigDecimal stmtFee) {
        this.stmtFee = stmtFee;
    }

    public BigDecimal getChrgbkFeePerItm() {
        return chrgbkFeePerItm;
    }

    public void setChrgbkFeePerItm(BigDecimal chrgbkFeePerItm) {
        this.chrgbkFeePerItm = chrgbkFeePerItm;
    }

    public BigDecimal getCustSrvFee() {
        return custSrvFee;
    }

    public void setCustSrvFee(BigDecimal custSrvFee) {
        this.custSrvFee = custSrvFee;
    }

    public BigDecimal getApplFee() {
        return applFee;
    }

    public void setApplFee(BigDecimal applFee) {
        this.applFee = applFee;
    }

    public String getSpclFeeTerms() {
        return spclFeeTerms;
    }

    public void setSpclFeeTerms(String spclFeeTerms) {
        this.spclFeeTerms = spclFeeTerms;
    }

    public BigDecimal getAvgTkt() {
        return avgTkt;
    }

    public void setAvgTkt(BigDecimal avgTkt) {
        this.avgTkt = avgTkt;
    }

    public BigDecimal getMaxTkt() {
        return maxTkt;
    }

    public void setMaxTkt(BigDecimal maxTkt) {
        this.maxTkt = maxTkt;
    }

    public BigDecimal getAvgMcVisaMthly() {
        return avgMcVisaMthly;
    }

    public void setAvgMcVisaMthly(BigDecimal avgMcVisaMthly) {
        this.avgMcVisaMthly = avgMcVisaMthly;
    }

    public BigDecimal getMaxMcVisaMthly() {
        return maxMcVisaMthly;
    }

    public void setMaxMcVisaMthly(BigDecimal maxMcVisaMthly) {
        this.maxMcVisaMthly = maxMcVisaMthly;
    }

    public BigDecimal getPctNswpXtns() {
        return pctNswpXtns;
    }

    public void setPctNswpXtns(BigDecimal pctNswpXtns) {
        this.pctNswpXtns = pctNswpXtns;
    }

    public String getDscvrAcct() {
        return dscvrAcct;
    }

    public void setDscvrAcct(String dscvrAcct) {
        this.dscvrAcct = dscvrAcct;
    }

    public String getAmexAcct() {
        return amexAcct;
    }

    public void setAmexAcct(String amexAcct) {
        this.amexAcct = amexAcct;
    }

    public String getDinersAcct() {
        return dinersAcct;
    }

    public void setDinersAcct(String dinersAcct) {
        this.dinersAcct = dinersAcct;
    }

    public String getOthAcct() {
        return othAcct;
    }

    public void setOthAcct(String othAcct) {
        this.othAcct = othAcct;
    }

    public Character getNewAcctDisc() {
        return newAcctDisc;
    }

    public void setNewAcctDisc(Character newAcctDisc) {
        this.newAcctDisc = newAcctDisc;
    }

    public Character getNewAcctAmex() {
        return newAcctAmex;
    }

    public void setNewAcctAmex(Character newAcctAmex) {
        this.newAcctAmex = newAcctAmex;
    }

    public Character getMrchLocOwnrshp() {
        return mrchLocOwnrshp;
    }

    public void setMrchLocOwnrshp(Character mrchLocOwnrshp) {
        this.mrchLocOwnrshp = mrchLocOwnrshp;
    }

    public String getLlrdNm() {
        return llrdNm;
    }

    public void setLlrdNm(String llrdNm) {
        this.llrdNm = llrdNm;
    }

    public String getLlrdPh() {
        return llrdPh;
    }

    public void setLlrdPh(String llrdPh) {
        this.llrdPh = llrdPh;
    }

    public Character getMrchBusAsRptd() {
        return mrchBusAsRptd;
    }

    public void setMrchBusAsRptd(Character mrchBusAsRptd) {
        this.mrchBusAsRptd = mrchBusAsRptd;
    }

    public Character getMrchAdqtlyStfd() {
        return mrchAdqtlyStfd;
    }

    public void setMrchAdqtlyStfd(Character mrchAdqtlyStfd) {
        this.mrchAdqtlyStfd = mrchAdqtlyStfd;
    }

    public Character getMrchBusLicPstd() {
        return mrchBusLicPstd;
    }

    public void setMrchBusLicPstd(Character mrchBusLicPstd) {
        this.mrchBusLicPstd = mrchBusLicPstd;
    }

    public Character getMrchPicSbmtd() {
        return mrchPicSbmtd;
    }

    public void setMrchPicSbmtd(Character mrchPicSbmtd) {
        this.mrchPicSbmtd = mrchPicSbmtd;
    }

    public Character getMrchPrncplIdCnf() {
        return mrchPrncplIdCnf;
    }

    public void setMrchPrncplIdCnf(Character mrchPrncplIdCnf) {
        this.mrchPrncplIdCnf = mrchPrncplIdCnf;
    }

    public Character getMrchSignerIdCnf() {
        return mrchSignerIdCnf;
    }

    public void setMrchSignerIdCnf(Character mrchSignerIdCnf) {
        this.mrchSignerIdCnf = mrchSignerIdCnf;
    }

    public String getMrchSiteSurveyC() {
        return mrchSiteSurveyC;
    }

    public void setMrchSiteSurveyC(String mrchSiteSurveyC) {
        this.mrchSiteSurveyC = mrchSiteSurveyC;
    }

    public String getMrchIdNbr() {
        return mrchIdNbr;
    }

    public void setMrchIdNbr(String mrchIdNbr) {
        this.mrchIdNbr = mrchIdNbr;
    }

    public String getTermIdNbr() {
        return termIdNbr;
    }

    public void setTermIdNbr(String termIdNbr) {
        this.termIdNbr = termIdNbr;
    }

    public String getIntrchgPlan() {
        return intrchgPlan;
    }

    public void setIntrchgPlan(String intrchgPlan) {
        this.intrchgPlan = intrchgPlan;
    }

    public Character getDiscTyp() {
        return discTyp;
    }

    public void setDiscTyp(Character discTyp) {
        this.discTyp = discTyp;
    }

    public String getAuthPlan() {
        return authPlan;
    }

    public void setAuthPlan(String authPlan) {
        this.authPlan = authPlan;
    }

    public String getAsgndNbr() {
        return asgndNbr;
    }

    public void setAsgndNbr(String asgndNbr) {
        this.asgndNbr = asgndNbr;
    }

    public String getAgentNbr() {
        return agentNbr;
    }

    public void setAgentNbr(String agentNbr) {
        this.agentNbr = agentNbr;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplCps)) {
            return false;
        }
        CrApplCps other = (CrApplCps) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplCps[ applNbr=" + applNbr + " ]";
    }

}
