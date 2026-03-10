/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CR_APPL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrAppl.findAll", query = "SELECT c FROM CrAppl c")})
public class CrAppl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "MMS_NBR")
    private String mmsNbr;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "SBMTD_STAT")
    private Character sbmtdStat;
    @Basic(optional = false)
    @Column(name = "APPL_TYP")
    private String applTyp;
    @Basic(optional = false)
    @Column(name = "PRE_APRVL_STAT")
    private Character preAprvlStat;
    @Basic(optional = false)
    @Column(name = "CLATRL_STAT")
    private Character clatrlStat;
    @Basic(optional = false)
    @Column(name = "UNSCRD_CR_STAT")
    private Character unscrdCrStat;
    @Basic(optional = false)
    @Column(name = "EXP_CASH_PROL_STAT")
    private Character expCashProlStat;
    @Basic(optional = false)
    @Column(name = "PP_PAYROLL_STAT")
    private Character ppPayrollStat;
    @Basic(optional = false)
    @Column(name = "PRSNL_CR_STAT")
    private Character prsnlCrStat;
    @Basic(optional = false)
    @Column(name = "OWNR_GRTY_STAT")
    private Character ownrGrtyStat;
    @Basic(optional = false)
    @Column(name = "PREV_APPL_STAT")
    private Character prevApplStat;
    @Basic(optional = false)
    @Column(name = "ULT_COMP_NM")
    private String ultCompNm;
    @Basic(optional = false)
    @Column(name = "ULT_COMP_ST")
    private String ultCompSt;
    @Basic(optional = false)
    @Column(name = "ULT_COMP_CRTY")
    private String ultCompCrty;
    @Basic(optional = false)
    @Column(name = "ULT_ACCT_NBR")
    private String ultAcctNbr;
    @Basic(optional = false)
    @Column(name = "ULT_CUST_NBR")
    private String ultCustNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ACCT_CR_LMT")
    private BigDecimal acctCrLmt;
    @Basic(optional = false)
    @Column(name = "TOT_RQSTD_CR_LMT")
    private BigDecimal totRqstdCrLmt;
    @Basic(optional = false)
    @Column(name = "WKLY_SPEND")
    private BigDecimal wklySpend;
    @Basic(optional = false)
    @Column(name = "NBR_CARDS")
    private short nbrCards;
    @Basic(optional = false)
    @Column(name = "COMP_NM")
    private String compNm;
    @Basic(optional = false)
    @Column(name = "INDS")
    private String inds;
    @Basic(optional = false)
    @Column(name = "TAX_ID")
    private String taxId;
    @Basic(optional = false)
    @Column(name = "COMP_TYP")
    private String compTyp;
    @Basic(optional = false)
    @Column(name = "ANNUAL_REVENUE")
    private BigDecimal annualRevenue;
    @Basic(optional = false)
    @Column(name = "LEGAL_STRU")
    private String legalStru;
    @Basic(optional = false)
    @Column(name = "IN_BUS_SINCE")
    @Temporal(TemporalType.DATE)
    private Date inBusSince;
    @Basic(optional = false)
    @Column(name = "YEARS_IN_CTL")
    private short yearsInCtl;
    @Basic(optional = false)
    @Column(name = "TICKER_SYMBOL")
    private String tickerSymbol;
    @Basic(optional = false)
    @Column(name = "NBR_VEHICLES")
    private int nbrVehicles;
    @Basic(optional = false)
    @Column(name = "NBR_EMPLOYEES")
    private int nbrEmployees;
    @Basic(optional = false)
    @Column(name = "NBR_DRIVERS")
    private int nbrDrivers;
    @Basic(optional = false)
    @Column(name = "CURR")
    private String curr;
    @Basic(optional = false)
    @Column(name = "WEB_ADDR")
    private String webAddr;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR")
    private String emailAddr;
    @Basic(optional = false)
    @Column(name = "MC_FAA_NBR")
    private String mcFaaNbr;
    @Basic(optional = false)
    @Column(name = "PRES_FST_NM")
    private String presFstNm;
    @Basic(optional = false)
    @Column(name = "PRES_LST_NM")
    private String presLstNm;
    @Basic(optional = false)
    @Column(name = "CTLLR_FST_NM")
    private String ctllrFstNm;
    @Basic(optional = false)
    @Column(name = "CTLLR_LST_NM")
    private String ctllrLstNm;
    @Basic(optional = false)
    @Column(name = "INC_ST")
    private String incSt;
    @Basic(optional = false)
    @Column(name = "INC_YR")
    private String incYr;
    @Basic(optional = false)
    @Column(name = "BANK_NM")
    private String bankNm;
    @Basic(optional = false)
    @Column(name = "BANK_CNTCT_FST_NM")
    private String bankCntctFstNm;
    @Basic(optional = false)
    @Column(name = "BANK_CNTCT_LST_NM")
    private String bankCntctLstNm;
    @Basic(optional = false)
    @Column(name = "BANK_ACCT_TYP")
    private String bankAcctTyp;
    @Basic(optional = false)
    @Column(name = "BANK_ACCT_NBR")
    private String bankAcctNbr;
    @Basic(optional = false)
    @Column(name = "BANK_ABA_MICR_NBR")
    private String bankAbaMicrNbr;
    @Basic(optional = false)
    @Column(name = "BUS_LN")
    private String busLn;
    @Basic(optional = false)
    @Column(name = "SLS_REP")
    private String slsRep;
    @Basic(optional = false)
    @Column(name = "TRTOY")
    private String trtoy;
    @Basic(optional = false)
    @Column(name = "RESELLER")
    private String reseller;
    @Basic(optional = false)
    @Column(name = "NOTES")
    private String notes;
    @Basic(optional = false)
    @Column(name = "CR_CNTCT_FST_NM")
    private String crCntctFstNm;
    @Basic(optional = false)
    @Column(name = "CR_CNTCT_LST_NM")
    private String crCntctLstNm;
    @Basic(optional = false)
    @Column(name = "EC_APPL_NBR")
    private String ecApplNbr;
    @Basic(optional = false)
    @Column(name = "EC_CUST_NBR")
    private String ecCustNbr;
    @Basic(optional = false)
    @Column(name = "EC_CUST_NM")
    private String ecCustNm;
    @Basic(optional = false)
    @Column(name = "PGM")
    private String pgm;
    @Basic(optional = false)
    @Column(name = "FUNDING_MTHD")
    private String fundingMthd;
    @Basic(optional = false)
    @Column(name = "USE_GLBL_LMT_FLG")
    private Character useGlblLmtFlg;
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
    @Column(name = "RDY_FOR_STUP_IND")
    private Character rdyForStupInd;
    @Basic(optional = false)
    @Column(name = "CMTMNT_INCL_IND")
    private Character cmtmntInclInd;
    @Basic(optional = false)
    @Column(name = "CMCSH_PP_IND")
    private Character cmcshPpInd;

    public CrAppl() {
    }

    public CrAppl(String applNbr) {
        this.applNbr = applNbr;
    }

    public CrAppl(String applNbr, String mmsNbr, String usrId, Character sbmtdStat, String applTyp, Character preAprvlStat, Character clatrlStat, Character unscrdCrStat, Character expCashProlStat, Character ppPayrollStat, Character prsnlCrStat, Character ownrGrtyStat, Character prevApplStat, String ultCompNm, String ultCompSt, String ultCompCrty, String ultAcctNbr, String ultCustNbr, BigDecimal acctCrLmt, BigDecimal totRqstdCrLmt, BigDecimal wklySpend, short nbrCards, String compNm, String inds, String taxId, String compTyp, BigDecimal annualRevenue, String legalStru, Date inBusSince, short yearsInCtl, String tickerSymbol, int nbrVehicles, int nbrEmployees, int nbrDrivers, String curr, String webAddr, String emailAddr, String mcFaaNbr, String presFstNm, String presLstNm, String ctllrFstNm, String ctllrLstNm, String incSt, String incYr, String bankNm, String bankCntctFstNm, String bankCntctLstNm, String bankAcctTyp, String bankAcctNbr, String bankAbaMicrNbr, String busLn, String slsRep, String trtoy, String reseller, String notes, String crCntctFstNm, String crCntctLstNm, String ecApplNbr, String ecCustNbr, String ecCustNm, String pgm, String fundingMthd, Character useGlblLmtFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character rdyForStupInd, Character cmtmntInclInd, Character cmcshPpInd) {
        this.applNbr = applNbr;
        this.mmsNbr = mmsNbr;
        this.usrId = usrId;
        this.sbmtdStat = sbmtdStat;
        this.applTyp = applTyp;
        this.preAprvlStat = preAprvlStat;
        this.clatrlStat = clatrlStat;
        this.unscrdCrStat = unscrdCrStat;
        this.expCashProlStat = expCashProlStat;
        this.ppPayrollStat = ppPayrollStat;
        this.prsnlCrStat = prsnlCrStat;
        this.ownrGrtyStat = ownrGrtyStat;
        this.prevApplStat = prevApplStat;
        this.ultCompNm = ultCompNm;
        this.ultCompSt = ultCompSt;
        this.ultCompCrty = ultCompCrty;
        this.ultAcctNbr = ultAcctNbr;
        this.ultCustNbr = ultCustNbr;
        this.acctCrLmt = acctCrLmt;
        this.totRqstdCrLmt = totRqstdCrLmt;
        this.wklySpend = wklySpend;
        this.nbrCards = nbrCards;
        this.compNm = compNm;
        this.inds = inds;
        this.taxId = taxId;
        this.compTyp = compTyp;
        this.annualRevenue = annualRevenue;
        this.legalStru = legalStru;
        this.inBusSince = inBusSince;
        this.yearsInCtl = yearsInCtl;
        this.tickerSymbol = tickerSymbol;
        this.nbrVehicles = nbrVehicles;
        this.nbrEmployees = nbrEmployees;
        this.nbrDrivers = nbrDrivers;
        this.curr = curr;
        this.webAddr = webAddr;
        this.emailAddr = emailAddr;
        this.mcFaaNbr = mcFaaNbr;
        this.presFstNm = presFstNm;
        this.presLstNm = presLstNm;
        this.ctllrFstNm = ctllrFstNm;
        this.ctllrLstNm = ctllrLstNm;
        this.incSt = incSt;
        this.incYr = incYr;
        this.bankNm = bankNm;
        this.bankCntctFstNm = bankCntctFstNm;
        this.bankCntctLstNm = bankCntctLstNm;
        this.bankAcctTyp = bankAcctTyp;
        this.bankAcctNbr = bankAcctNbr;
        this.bankAbaMicrNbr = bankAbaMicrNbr;
        this.busLn = busLn;
        this.slsRep = slsRep;
        this.trtoy = trtoy;
        this.reseller = reseller;
        this.notes = notes;
        this.crCntctFstNm = crCntctFstNm;
        this.crCntctLstNm = crCntctLstNm;
        this.ecApplNbr = ecApplNbr;
        this.ecCustNbr = ecCustNbr;
        this.ecCustNm = ecCustNm;
        this.pgm = pgm;
        this.fundingMthd = fundingMthd;
        this.useGlblLmtFlg = useGlblLmtFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.rdyForStupInd = rdyForStupInd;
        this.cmtmntInclInd = cmtmntInclInd;
        this.cmcshPpInd = cmcshPpInd;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getMmsNbr() {
        return mmsNbr;
    }

    public void setMmsNbr(String mmsNbr) {
        this.mmsNbr = mmsNbr;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public Character getSbmtdStat() {
        return sbmtdStat;
    }

    public void setSbmtdStat(Character sbmtdStat) {
        this.sbmtdStat = sbmtdStat;
    }

    public String getApplTyp() {
        return applTyp;
    }

    public void setApplTyp(String applTyp) {
        this.applTyp = applTyp;
    }

    public Character getPreAprvlStat() {
        return preAprvlStat;
    }

    public void setPreAprvlStat(Character preAprvlStat) {
        this.preAprvlStat = preAprvlStat;
    }

    public Character getClatrlStat() {
        return clatrlStat;
    }

    public void setClatrlStat(Character clatrlStat) {
        this.clatrlStat = clatrlStat;
    }

    public Character getUnscrdCrStat() {
        return unscrdCrStat;
    }

    public void setUnscrdCrStat(Character unscrdCrStat) {
        this.unscrdCrStat = unscrdCrStat;
    }

    public Character getExpCashProlStat() {
        return expCashProlStat;
    }

    public void setExpCashProlStat(Character expCashProlStat) {
        this.expCashProlStat = expCashProlStat;
    }

    public Character getPpPayrollStat() {
        return ppPayrollStat;
    }

    public void setPpPayrollStat(Character ppPayrollStat) {
        this.ppPayrollStat = ppPayrollStat;
    }

    public Character getPrsnlCrStat() {
        return prsnlCrStat;
    }

    public void setPrsnlCrStat(Character prsnlCrStat) {
        this.prsnlCrStat = prsnlCrStat;
    }

    public Character getOwnrGrtyStat() {
        return ownrGrtyStat;
    }

    public void setOwnrGrtyStat(Character ownrGrtyStat) {
        this.ownrGrtyStat = ownrGrtyStat;
    }

    public Character getPrevApplStat() {
        return prevApplStat;
    }

    public void setPrevApplStat(Character prevApplStat) {
        this.prevApplStat = prevApplStat;
    }

    public String getUltCompNm() {
        return ultCompNm;
    }

    public void setUltCompNm(String ultCompNm) {
        this.ultCompNm = ultCompNm;
    }

    public String getUltCompSt() {
        return ultCompSt;
    }

    public void setUltCompSt(String ultCompSt) {
        this.ultCompSt = ultCompSt;
    }

    public String getUltCompCrty() {
        return ultCompCrty;
    }

    public void setUltCompCrty(String ultCompCrty) {
        this.ultCompCrty = ultCompCrty;
    }

    public String getUltAcctNbr() {
        return ultAcctNbr;
    }

    public void setUltAcctNbr(String ultAcctNbr) {
        this.ultAcctNbr = ultAcctNbr;
    }

    public String getUltCustNbr() {
        return ultCustNbr;
    }

    public void setUltCustNbr(String ultCustNbr) {
        this.ultCustNbr = ultCustNbr;
    }

    public BigDecimal getAcctCrLmt() {
        return acctCrLmt;
    }

    public void setAcctCrLmt(BigDecimal acctCrLmt) {
        this.acctCrLmt = acctCrLmt;
    }

    public BigDecimal getTotRqstdCrLmt() {
        return totRqstdCrLmt;
    }

    public void setTotRqstdCrLmt(BigDecimal totRqstdCrLmt) {
        this.totRqstdCrLmt = totRqstdCrLmt;
    }

    public BigDecimal getWklySpend() {
        return wklySpend;
    }

    public void setWklySpend(BigDecimal wklySpend) {
        this.wklySpend = wklySpend;
    }

    public short getNbrCards() {
        return nbrCards;
    }

    public void setNbrCards(short nbrCards) {
        this.nbrCards = nbrCards;
    }

    public String getCompNm() {
        return compNm;
    }

    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    public String getInds() {
        return inds;
    }

    public void setInds(String inds) {
        this.inds = inds;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getCompTyp() {
        return compTyp;
    }

    public void setCompTyp(String compTyp) {
        this.compTyp = compTyp;
    }

    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getLegalStru() {
        return legalStru;
    }

    public void setLegalStru(String legalStru) {
        this.legalStru = legalStru;
    }

    public Date getInBusSince() {
        return inBusSince;
    }

    public void setInBusSince(Date inBusSince) {
        this.inBusSince = inBusSince;
    }

    public short getYearsInCtl() {
        return yearsInCtl;
    }

    public void setYearsInCtl(short yearsInCtl) {
        this.yearsInCtl = yearsInCtl;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public int getNbrVehicles() {
        return nbrVehicles;
    }

    public void setNbrVehicles(int nbrVehicles) {
        this.nbrVehicles = nbrVehicles;
    }

    public int getNbrEmployees() {
        return nbrEmployees;
    }

    public void setNbrEmployees(int nbrEmployees) {
        this.nbrEmployees = nbrEmployees;
    }

    public int getNbrDrivers() {
        return nbrDrivers;
    }

    public void setNbrDrivers(int nbrDrivers) {
        this.nbrDrivers = nbrDrivers;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public String getWebAddr() {
        return webAddr;
    }

    public void setWebAddr(String webAddr) {
        this.webAddr = webAddr;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getMcFaaNbr() {
        return mcFaaNbr;
    }

    public void setMcFaaNbr(String mcFaaNbr) {
        this.mcFaaNbr = mcFaaNbr;
    }

    public String getPresFstNm() {
        return presFstNm;
    }

    public void setPresFstNm(String presFstNm) {
        this.presFstNm = presFstNm;
    }

    public String getPresLstNm() {
        return presLstNm;
    }

    public void setPresLstNm(String presLstNm) {
        this.presLstNm = presLstNm;
    }

    public String getCtllrFstNm() {
        return ctllrFstNm;
    }

    public void setCtllrFstNm(String ctllrFstNm) {
        this.ctllrFstNm = ctllrFstNm;
    }

    public String getCtllrLstNm() {
        return ctllrLstNm;
    }

    public void setCtllrLstNm(String ctllrLstNm) {
        this.ctllrLstNm = ctllrLstNm;
    }

    public String getIncSt() {
        return incSt;
    }

    public void setIncSt(String incSt) {
        this.incSt = incSt;
    }

    public String getIncYr() {
        return incYr;
    }

    public void setIncYr(String incYr) {
        this.incYr = incYr;
    }

    public String getBankNm() {
        return bankNm;
    }

    public void setBankNm(String bankNm) {
        this.bankNm = bankNm;
    }

    public String getBankCntctFstNm() {
        return bankCntctFstNm;
    }

    public void setBankCntctFstNm(String bankCntctFstNm) {
        this.bankCntctFstNm = bankCntctFstNm;
    }

    public String getBankCntctLstNm() {
        return bankCntctLstNm;
    }

    public void setBankCntctLstNm(String bankCntctLstNm) {
        this.bankCntctLstNm = bankCntctLstNm;
    }

    public String getBankAcctTyp() {
        return bankAcctTyp;
    }

    public void setBankAcctTyp(String bankAcctTyp) {
        this.bankAcctTyp = bankAcctTyp;
    }

    public String getBankAcctNbr() {
        return bankAcctNbr;
    }

    public void setBankAcctNbr(String bankAcctNbr) {
        this.bankAcctNbr = bankAcctNbr;
    }

    public String getBankAbaMicrNbr() {
        return bankAbaMicrNbr;
    }

    public void setBankAbaMicrNbr(String bankAbaMicrNbr) {
        this.bankAbaMicrNbr = bankAbaMicrNbr;
    }

    public String getBusLn() {
        return busLn;
    }

    public void setBusLn(String busLn) {
        this.busLn = busLn;
    }

    public String getSlsRep() {
        return slsRep;
    }

    public void setSlsRep(String slsRep) {
        this.slsRep = slsRep;
    }

    public String getTrtoy() {
        return trtoy;
    }

    public void setTrtoy(String trtoy) {
        this.trtoy = trtoy;
    }

    public String getReseller() {
        return reseller;
    }

    public void setReseller(String reseller) {
        this.reseller = reseller;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCrCntctFstNm() {
        return crCntctFstNm;
    }

    public void setCrCntctFstNm(String crCntctFstNm) {
        this.crCntctFstNm = crCntctFstNm;
    }

    public String getCrCntctLstNm() {
        return crCntctLstNm;
    }

    public void setCrCntctLstNm(String crCntctLstNm) {
        this.crCntctLstNm = crCntctLstNm;
    }

    public String getEcApplNbr() {
        return ecApplNbr;
    }

    public void setEcApplNbr(String ecApplNbr) {
        this.ecApplNbr = ecApplNbr;
    }

    public String getEcCustNbr() {
        return ecCustNbr;
    }

    public void setEcCustNbr(String ecCustNbr) {
        this.ecCustNbr = ecCustNbr;
    }

    public String getEcCustNm() {
        return ecCustNm;
    }

    public void setEcCustNm(String ecCustNm) {
        this.ecCustNm = ecCustNm;
    }

    public String getPgm() {
        return pgm;
    }

    public void setPgm(String pgm) {
        this.pgm = pgm;
    }

    public String getFundingMthd() {
        return fundingMthd;
    }

    public void setFundingMthd(String fundingMthd) {
        this.fundingMthd = fundingMthd;
    }

    public Character getUseGlblLmtFlg() {
        return useGlblLmtFlg;
    }

    public void setUseGlblLmtFlg(Character useGlblLmtFlg) {
        this.useGlblLmtFlg = useGlblLmtFlg;
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

    public Character getRdyForStupInd() {
        return rdyForStupInd;
    }

    public void setRdyForStupInd(Character rdyForStupInd) {
        this.rdyForStupInd = rdyForStupInd;
    }

    public Character getCmtmntInclInd() {
        return cmtmntInclInd;
    }

    public void setCmtmntInclInd(Character cmtmntInclInd) {
        this.cmtmntInclInd = cmtmntInclInd;
    }

    public Character getCmcshPpInd() {
        return cmcshPpInd;
    }

    public void setCmcshPpInd(Character cmcshPpInd) {
        this.cmcshPpInd = cmcshPpInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrAppl)) {
            return false;
        }
        CrAppl other = (CrAppl) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrAppl[ applNbr=" + applNbr + " ]";
    }
    
}
