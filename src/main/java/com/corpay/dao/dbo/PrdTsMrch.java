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
@Table(name = "PRD_TS_MRCH", catalog = "", schema = "DBO")
public class PrdTsMrch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "REQ_TYP")
    private String reqTyp;
    @Basic(optional = false)
    @Column(name = "TRTOY")
    private String trtoy;

    @Basic(optional = false)
    @Column(name = "PRJTD_NET_RVNU")
    private BigDecimal prjtdNetRvnu;
    @Basic(optional = false)
    @Column(name = "REQ_CTL_NBR")
    private String reqCtlNbr;
    @Basic(optional = false)
    @Column(name = "UPD_TELEMAR_FLG")
    private Character updTelemarFlg;
    @Basic(optional = false)
    @Column(name = "BUS_TYP")
    private String busTyp;
    @Basic(optional = false)
    @Column(name = "LOC_TYP")
    private String locTyp;
    @Basic(optional = false)
    @Column(name = "PHYS_SHPNG_FLG")
    private Character physShpngFlg;
    @Basic(optional = false)
    @Column(name = "FULL_SRV_FL_FLG")
    private Character fullSrvFlFlg;
    @Basic(optional = false)
    @Column(name = "MINI_SRV_FL_FLG")
    private Character miniSrvFlFlg;
    @Basic(optional = false)
    @Column(name = "SELF_SRV_FL_FLG")
    private Character selfSrvFlFlg;
    @Basic(optional = false)
    @Column(name = "PAC_PRIDE_LOC_FLG")
    private Character pacPrideLocFlg;
    @Basic(optional = false)
    @Column(name = "TEST_LOC_FLG")
    private Character testLocFlg;
    @Basic(optional = false)
    @Column(name = "FL_BRD")
    private String flBrd;
    @Basic(optional = false)
    @Column(name = "TAX_FLG")
    private Character taxFlg;
    @Basic(optional = false)
    @Column(name = "TAX_ID")
    private String taxId;
    @Basic(optional = false)
    @Column(name = "BUS_HRS")
    private String busHrs;
    @Basic(optional = false)
    @Column(name = "CR_FL_FLG")
    private Character crFlFlg;
    @Basic(optional = false)
    @Column(name = "CR_MKUP_MTHD")
    private String crMkupMthd;
    @Basic(optional = false)
    @Column(name = "CR_MKUP_AMT")
    private BigDecimal crMkupAmt;
    @Basic(optional = false)
    @Column(name = "DRVG_DRCTNS")
    private String drvgDrctns;
    @Basic(optional = false)
    @Column(name = "INTST_HWY_NBR")
    private String intstHwyNbr;
    @Basic(optional = false)
    @Column(name = "MILE_MRKR")
    private String mileMrkr;
    @Basic(optional = false)
    @Column(name = "EXIT_NBR")
    private String exitNbr;
    @Basic(optional = false)
    @Column(name = "AUTMTN_LVL_OVRD")
    private Character autmtnLvlOvrd;
    @Basic(optional = false)
    @Column(name = "MRCH_EQPD_FLG")
    private Character mrchEqpdFlg;
    @Basic(optional = false)
    @Column(name = "EQPMNT_WLCM_PKG")
    private Character eqpmntWlcmPkg;
    @Basic(optional = false)
    @Column(name = "WLCM_PKG_MNL")
    private Character wlcmPkgMnl;
    @Basic(optional = false)
    @Column(name = "STLMNT_LOC")
    private Character stlmntLoc;
    @Basic(optional = false)
    @Column(name = "CR_MRCH_FLG")
    private Character crMrchFlg;
    @Basic(optional = false)
    @Column(name = "PFRD_MRCH_FLG")
    private Character pfrdMrchFlg;
    @Basic(optional = false)
    @Column(name = "PFRD_LVL")
    private Character pfrdLvl;
    @Basic(optional = false)
    @Column(name = "CDFN_MRCH_FLG")
    private Character cdfnMrchFlg;
    @Basic(optional = false)
    @Column(name = "CDFN_RT")
    private BigDecimal cdfnRt;
    @Basic(optional = false)
    @Column(name = "NBR_STLMNT_CARDS")
    private short nbrStlmntCards;
    @Basic(optional = false)
    @Column(name = "NBR_IN_STN_CARDS")
    private short nbrInStnCards;
    @Basic(optional = false)
    @Column(name = "NBR_CO_BRND_CARDS")
    private short nbrCoBrndCards;
    @Basic(optional = false)
    @Column(name = "TRANZ330_FLG")
    private Character tranz330Flg;
    @Basic(optional = false)
    @Column(name = "TRANZ330_NEW_FLG")
    private Character tranz330NewFlg;
    @Basic(optional = false)
    @Column(name = "TRANZ330_DELV_MTHD")
    private Character tranz330DelvMthd;
    @Basic(optional = false)
    @Column(name = "PRTR_FLG")
    private Character prtrFlg;
    @Basic(optional = false)
    @Column(name = "PRTR_NEW_FLG")
    private Character prtrNewFlg;
    @Basic(optional = false)
    @Column(name = "PRTR_DELV_MTHD")
    private Character prtrDelvMthd;
    @Basic(optional = false)
    @Column(name = "CDN_208_FORMS_QTY")
    private short cdn208FormsQty;
    @Basic(optional = false)
    @Column(name = "CDN_102_DFTS_QTY")
    private short cdn102DftsQty;
    @Basic(optional = false)
    @Column(name = "CDN_1005C_DFTS_QTY")
    private short cdn1005cDftsQty;
    @Basic(optional = false)
    @Column(name = "CDN_10NOK_DFTS_QTY")
    private short cdn10nokDftsQty;
    @Basic(optional = false)
    @Column(name = "SHPNG_CMNTS")
    private String shpngCmnts;
    @Basic(optional = false)
    @Column(name = "RCVG_CUST_CD")
    private String rcvgCustCd;
    @Basic(optional = false)
    @Column(name = "RCVG_CUST_TYP")
    private String rcvgCustTyp;
    @Basic(optional = false)
    @Column(name = "RPT_FAX_NBR")
    private String rptFaxNbr;
    @Basic(optional = false)
    @Column(name = "BLCNG_FREQ")
    private Character blcngFreq;
    @Basic(optional = false)
    @Column(name = "BLCNG_INDPDNT_FLG")
    private Character blcngIndpdntFlg;
    @Basic(optional = false)
    @Column(name = "CLSNG_FREQ")
    private Character clsngFreq;
    @Basic(optional = false)
    @Column(name = "CLSNG_INDPDNT_FLG")
    private Character clsngIndpdntFlg;
    @Basic(optional = false)
    @Column(name = "PMT_FREQ")
    private Character pmtFreq;
    @Basic(optional = false)
    @Column(name = "PMT_INDPDNT_FLG")
    private Character pmtIndpdntFlg;
    @Basic(optional = false)
    @Column(name = "PAY_TO_CD")
    private String payToCd;
    @Basic(optional = false)
    @Column(name = "PAY_TO_TYP")
    private String payToTyp;
    @Basic(optional = false)
    @Column(name = "PAY_MTHD")
    private String payMthd;
    @Basic(optional = false)
    @Column(name = "PAY_DELAY")
    private short payDelay;
    @Basic(optional = false)
    @Column(name = "CTRT_SENT_DT")
    @Temporal(TemporalType.DATE)
    private Date ctrtSentDt;
    @Basic(optional = false)
    @Column(name = "CTRT_SENT_INIT_EXT")
    private String ctrtSentInitExt;
    @Basic(optional = false)
    @Column(name = "CTRT_SG_DT")
    @Temporal(TemporalType.DATE)
    private Date ctrtSgDt;
    @Basic(optional = false)
    @Column(name = "CTRT_SG_INIT_EXT")
    private String ctrtSgInitExt;
    @Basic(optional = false)
    @Column(name = "CTRT_RTND_DT")
    @Temporal(TemporalType.DATE)
    private Date ctrtRtndDt;
    @Basic(optional = false)
    @Column(name = "CTRT_RTND_INIT_EXT")
    private String ctrtRtndInitExt;
    @Basic(optional = false)
    @Column(name = "SSI_STA_DT")
    @Temporal(TemporalType.DATE)
    private Date ssiStaDt;
    @Basic(optional = false)
    @Column(name = "SSI_STA_INIT_EXT")
    private String ssiStaInitExt;
    @Basic(optional = false)
    @Column(name = "CR_APRVD_DT")
    @Temporal(TemporalType.DATE)
    private Date crAprvdDt;
    @Basic(optional = false)
    @Column(name = "CR_APRVD_INIT_EXT")
    private String crAprvdInitExt;
    @Basic(optional = false)
    @Column(name = "SSI_CMPLT_DT")
    @Temporal(TemporalType.DATE)
    private Date ssiCmpltDt;
    @Basic(optional = false)
    @Column(name = "SSI_CMPLT_INIT_EXT")
    private String ssiCmpltInitExt;
    @Basic(optional = false)
    @Column(name = "QA_CMPLTD_DT")
    @Temporal(TemporalType.DATE)
    private Date qaCmpltdDt;
    @Basic(optional = false)
    @Column(name = "QA_CMPLTD_INIT_EXT")
    private String qaCmpltdInitExt;
    @Basic(optional = false)
    @Column(name = "CMNTS")
    private String cmnts;
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

    public PrdTsMrch() {
    }

    public PrdTsMrch(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdTsMrch(String applNbr, String reqTyp, String trtoy, BigDecimal prjtdNetRvnu, String reqCtlNbr, Character updTelemarFlg, String busTyp, String locTyp, Character physShpngFlg, Character fullSrvFlFlg, Character miniSrvFlFlg, Character selfSrvFlFlg, Character pacPrideLocFlg, Character testLocFlg, String flBrd, Character taxFlg, String taxId, String busHrs, Character crFlFlg, String crMkupMthd, BigDecimal crMkupAmt, String drvgDrctns, String intstHwyNbr, String mileMrkr, String exitNbr, Character autmtnLvlOvrd, Character mrchEqpdFlg, Character eqpmntWlcmPkg, Character wlcmPkgMnl, Character stlmntLoc, Character crMrchFlg, Character pfrdMrchFlg, Character pfrdLvl, Character cdfnMrchFlg, BigDecimal cdfnRt, short nbrStlmntCards, short nbrInStnCards, short nbrCoBrndCards, Character tranz330Flg, Character tranz330NewFlg, Character tranz330DelvMthd, Character prtrFlg, Character prtrNewFlg, Character prtrDelvMthd, short cdn208FormsQty, short cdn102DftsQty, short cdn1005cDftsQty, short cdn10nokDftsQty, String shpngCmnts, String rcvgCustCd, String rcvgCustTyp, String rptFaxNbr, Character blcngFreq, Character blcngIndpdntFlg, Character clsngFreq, Character clsngIndpdntFlg, Character pmtFreq, Character pmtIndpdntFlg, String payToCd, String payToTyp, String payMthd, short payDelay, Date ctrtSentDt, String ctrtSentInitExt, Date ctrtSgDt, String ctrtSgInitExt, Date ctrtRtndDt, String ctrtRtndInitExt, Date ssiStaDt, String ssiStaInitExt, Date crAprvdDt, String crAprvdInitExt, Date ssiCmpltDt, String ssiCmpltInitExt, Date qaCmpltdDt, String qaCmpltdInitExt, String cmnts, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.reqTyp = reqTyp;
        this.trtoy = trtoy;
        this.prjtdNetRvnu = prjtdNetRvnu;
        this.reqCtlNbr = reqCtlNbr;
        this.updTelemarFlg = updTelemarFlg;
        this.busTyp = busTyp;
        this.locTyp = locTyp;
        this.physShpngFlg = physShpngFlg;
        this.fullSrvFlFlg = fullSrvFlFlg;
        this.miniSrvFlFlg = miniSrvFlFlg;
        this.selfSrvFlFlg = selfSrvFlFlg;
        this.pacPrideLocFlg = pacPrideLocFlg;
        this.testLocFlg = testLocFlg;
        this.flBrd = flBrd;
        this.taxFlg = taxFlg;
        this.taxId = taxId;
        this.busHrs = busHrs;
        this.crFlFlg = crFlFlg;
        this.crMkupMthd = crMkupMthd;
        this.crMkupAmt = crMkupAmt;
        this.drvgDrctns = drvgDrctns;
        this.intstHwyNbr = intstHwyNbr;
        this.mileMrkr = mileMrkr;
        this.exitNbr = exitNbr;
        this.autmtnLvlOvrd = autmtnLvlOvrd;
        this.mrchEqpdFlg = mrchEqpdFlg;
        this.eqpmntWlcmPkg = eqpmntWlcmPkg;
        this.wlcmPkgMnl = wlcmPkgMnl;
        this.stlmntLoc = stlmntLoc;
        this.crMrchFlg = crMrchFlg;
        this.pfrdMrchFlg = pfrdMrchFlg;
        this.pfrdLvl = pfrdLvl;
        this.cdfnMrchFlg = cdfnMrchFlg;
        this.cdfnRt = cdfnRt;
        this.nbrStlmntCards = nbrStlmntCards;
        this.nbrInStnCards = nbrInStnCards;
        this.nbrCoBrndCards = nbrCoBrndCards;
        this.tranz330Flg = tranz330Flg;
        this.tranz330NewFlg = tranz330NewFlg;
        this.tranz330DelvMthd = tranz330DelvMthd;
        this.prtrFlg = prtrFlg;
        this.prtrNewFlg = prtrNewFlg;
        this.prtrDelvMthd = prtrDelvMthd;
        this.cdn208FormsQty = cdn208FormsQty;
        this.cdn102DftsQty = cdn102DftsQty;
        this.cdn1005cDftsQty = cdn1005cDftsQty;
        this.cdn10nokDftsQty = cdn10nokDftsQty;
        this.shpngCmnts = shpngCmnts;
        this.rcvgCustCd = rcvgCustCd;
        this.rcvgCustTyp = rcvgCustTyp;
        this.rptFaxNbr = rptFaxNbr;
        this.blcngFreq = blcngFreq;
        this.blcngIndpdntFlg = blcngIndpdntFlg;
        this.clsngFreq = clsngFreq;
        this.clsngIndpdntFlg = clsngIndpdntFlg;
        this.pmtFreq = pmtFreq;
        this.pmtIndpdntFlg = pmtIndpdntFlg;
        this.payToCd = payToCd;
        this.payToTyp = payToTyp;
        this.payMthd = payMthd;
        this.payDelay = payDelay;
        this.ctrtSentDt = ctrtSentDt;
        this.ctrtSentInitExt = ctrtSentInitExt;
        this.ctrtSgDt = ctrtSgDt;
        this.ctrtSgInitExt = ctrtSgInitExt;
        this.ctrtRtndDt = ctrtRtndDt;
        this.ctrtRtndInitExt = ctrtRtndInitExt;
        this.ssiStaDt = ssiStaDt;
        this.ssiStaInitExt = ssiStaInitExt;
        this.crAprvdDt = crAprvdDt;
        this.crAprvdInitExt = crAprvdInitExt;
        this.ssiCmpltDt = ssiCmpltDt;
        this.ssiCmpltInitExt = ssiCmpltInitExt;
        this.qaCmpltdDt = qaCmpltdDt;
        this.qaCmpltdInitExt = qaCmpltdInitExt;
        this.cmnts = cmnts;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getReqTyp() {
        return reqTyp;
    }

    public void setReqTyp(String reqTyp) {
        this.reqTyp = reqTyp;
    }

    public String getTrtoy() {
        return trtoy;
    }

    public void setTrtoy(String trtoy) {
        this.trtoy = trtoy;
    }

    public BigDecimal getPrjtdNetRvnu() {
        return prjtdNetRvnu;
    }

    public void setPrjtdNetRvnu(BigDecimal prjtdNetRvnu) {
        this.prjtdNetRvnu = prjtdNetRvnu;
    }

    public String getReqCtlNbr() {
        return reqCtlNbr;
    }

    public void setReqCtlNbr(String reqCtlNbr) {
        this.reqCtlNbr = reqCtlNbr;
    }

    public Character getUpdTelemarFlg() {
        return updTelemarFlg;
    }

    public void setUpdTelemarFlg(Character updTelemarFlg) {
        this.updTelemarFlg = updTelemarFlg;
    }

    public String getBusTyp() {
        return busTyp;
    }

    public void setBusTyp(String busTyp) {
        this.busTyp = busTyp;
    }

    public String getLocTyp() {
        return locTyp;
    }

    public void setLocTyp(String locTyp) {
        this.locTyp = locTyp;
    }

    public Character getPhysShpngFlg() {
        return physShpngFlg;
    }

    public void setPhysShpngFlg(Character physShpngFlg) {
        this.physShpngFlg = physShpngFlg;
    }

    public Character getFullSrvFlFlg() {
        return fullSrvFlFlg;
    }

    public void setFullSrvFlFlg(Character fullSrvFlFlg) {
        this.fullSrvFlFlg = fullSrvFlFlg;
    }

    public Character getMiniSrvFlFlg() {
        return miniSrvFlFlg;
    }

    public void setMiniSrvFlFlg(Character miniSrvFlFlg) {
        this.miniSrvFlFlg = miniSrvFlFlg;
    }

    public Character getSelfSrvFlFlg() {
        return selfSrvFlFlg;
    }

    public void setSelfSrvFlFlg(Character selfSrvFlFlg) {
        this.selfSrvFlFlg = selfSrvFlFlg;
    }

    public Character getPacPrideLocFlg() {
        return pacPrideLocFlg;
    }

    public void setPacPrideLocFlg(Character pacPrideLocFlg) {
        this.pacPrideLocFlg = pacPrideLocFlg;
    }

    public Character getTestLocFlg() {
        return testLocFlg;
    }

    public void setTestLocFlg(Character testLocFlg) {
        this.testLocFlg = testLocFlg;
    }

    public String getFlBrd() {
        return flBrd;
    }

    public void setFlBrd(String flBrd) {
        this.flBrd = flBrd;
    }

    public Character getTaxFlg() {
        return taxFlg;
    }

    public void setTaxFlg(Character taxFlg) {
        this.taxFlg = taxFlg;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getBusHrs() {
        return busHrs;
    }

    public void setBusHrs(String busHrs) {
        this.busHrs = busHrs;
    }

    public Character getCrFlFlg() {
        return crFlFlg;
    }

    public void setCrFlFlg(Character crFlFlg) {
        this.crFlFlg = crFlFlg;
    }

    public String getCrMkupMthd() {
        return crMkupMthd;
    }

    public void setCrMkupMthd(String crMkupMthd) {
        this.crMkupMthd = crMkupMthd;
    }

    public BigDecimal getCrMkupAmt() {
        return crMkupAmt;
    }

    public void setCrMkupAmt(BigDecimal crMkupAmt) {
        this.crMkupAmt = crMkupAmt;
    }

    public String getDrvgDrctns() {
        return drvgDrctns;
    }

    public void setDrvgDrctns(String drvgDrctns) {
        this.drvgDrctns = drvgDrctns;
    }

    public String getIntstHwyNbr() {
        return intstHwyNbr;
    }

    public void setIntstHwyNbr(String intstHwyNbr) {
        this.intstHwyNbr = intstHwyNbr;
    }

    public String getMileMrkr() {
        return mileMrkr;
    }

    public void setMileMrkr(String mileMrkr) {
        this.mileMrkr = mileMrkr;
    }

    public String getExitNbr() {
        return exitNbr;
    }

    public void setExitNbr(String exitNbr) {
        this.exitNbr = exitNbr;
    }

    public Character getAutmtnLvlOvrd() {
        return autmtnLvlOvrd;
    }

    public void setAutmtnLvlOvrd(Character autmtnLvlOvrd) {
        this.autmtnLvlOvrd = autmtnLvlOvrd;
    }

    public Character getMrchEqpdFlg() {
        return mrchEqpdFlg;
    }

    public void setMrchEqpdFlg(Character mrchEqpdFlg) {
        this.mrchEqpdFlg = mrchEqpdFlg;
    }

    public Character getEqpmntWlcmPkg() {
        return eqpmntWlcmPkg;
    }

    public void setEqpmntWlcmPkg(Character eqpmntWlcmPkg) {
        this.eqpmntWlcmPkg = eqpmntWlcmPkg;
    }

    public Character getWlcmPkgMnl() {
        return wlcmPkgMnl;
    }

    public void setWlcmPkgMnl(Character wlcmPkgMnl) {
        this.wlcmPkgMnl = wlcmPkgMnl;
    }

    public Character getStlmntLoc() {
        return stlmntLoc;
    }

    public void setStlmntLoc(Character stlmntLoc) {
        this.stlmntLoc = stlmntLoc;
    }

    public Character getCrMrchFlg() {
        return crMrchFlg;
    }

    public void setCrMrchFlg(Character crMrchFlg) {
        this.crMrchFlg = crMrchFlg;
    }

    public Character getPfrdMrchFlg() {
        return pfrdMrchFlg;
    }

    public void setPfrdMrchFlg(Character pfrdMrchFlg) {
        this.pfrdMrchFlg = pfrdMrchFlg;
    }

    public Character getPfrdLvl() {
        return pfrdLvl;
    }

    public void setPfrdLvl(Character pfrdLvl) {
        this.pfrdLvl = pfrdLvl;
    }

    public Character getCdfnMrchFlg() {
        return cdfnMrchFlg;
    }

    public void setCdfnMrchFlg(Character cdfnMrchFlg) {
        this.cdfnMrchFlg = cdfnMrchFlg;
    }

    public BigDecimal getCdfnRt() {
        return cdfnRt;
    }

    public void setCdfnRt(BigDecimal cdfnRt) {
        this.cdfnRt = cdfnRt;
    }

    public short getNbrStlmntCards() {
        return nbrStlmntCards;
    }

    public void setNbrStlmntCards(short nbrStlmntCards) {
        this.nbrStlmntCards = nbrStlmntCards;
    }

    public short getNbrInStnCards() {
        return nbrInStnCards;
    }

    public void setNbrInStnCards(short nbrInStnCards) {
        this.nbrInStnCards = nbrInStnCards;
    }

    public short getNbrCoBrndCards() {
        return nbrCoBrndCards;
    }

    public void setNbrCoBrndCards(short nbrCoBrndCards) {
        this.nbrCoBrndCards = nbrCoBrndCards;
    }

    public Character getTranz330Flg() {
        return tranz330Flg;
    }

    public void setTranz330Flg(Character tranz330Flg) {
        this.tranz330Flg = tranz330Flg;
    }

    public Character getTranz330NewFlg() {
        return tranz330NewFlg;
    }

    public void setTranz330NewFlg(Character tranz330NewFlg) {
        this.tranz330NewFlg = tranz330NewFlg;
    }

    public Character getTranz330DelvMthd() {
        return tranz330DelvMthd;
    }

    public void setTranz330DelvMthd(Character tranz330DelvMthd) {
        this.tranz330DelvMthd = tranz330DelvMthd;
    }

    public Character getPrtrFlg() {
        return prtrFlg;
    }

    public void setPrtrFlg(Character prtrFlg) {
        this.prtrFlg = prtrFlg;
    }

    public Character getPrtrNewFlg() {
        return prtrNewFlg;
    }

    public void setPrtrNewFlg(Character prtrNewFlg) {
        this.prtrNewFlg = prtrNewFlg;
    }

    public Character getPrtrDelvMthd() {
        return prtrDelvMthd;
    }

    public void setPrtrDelvMthd(Character prtrDelvMthd) {
        this.prtrDelvMthd = prtrDelvMthd;
    }

    public short getCdn208FormsQty() {
        return cdn208FormsQty;
    }

    public void setCdn208FormsQty(short cdn208FormsQty) {
        this.cdn208FormsQty = cdn208FormsQty;
    }

    public short getCdn102DftsQty() {
        return cdn102DftsQty;
    }

    public void setCdn102DftsQty(short cdn102DftsQty) {
        this.cdn102DftsQty = cdn102DftsQty;
    }

    public short getCdn1005cDftsQty() {
        return cdn1005cDftsQty;
    }

    public void setCdn1005cDftsQty(short cdn1005cDftsQty) {
        this.cdn1005cDftsQty = cdn1005cDftsQty;
    }

    public short getCdn10nokDftsQty() {
        return cdn10nokDftsQty;
    }

    public void setCdn10nokDftsQty(short cdn10nokDftsQty) {
        this.cdn10nokDftsQty = cdn10nokDftsQty;
    }

    public String getShpngCmnts() {
        return shpngCmnts;
    }

    public void setShpngCmnts(String shpngCmnts) {
        this.shpngCmnts = shpngCmnts;
    }

    public String getRcvgCustCd() {
        return rcvgCustCd;
    }

    public void setRcvgCustCd(String rcvgCustCd) {
        this.rcvgCustCd = rcvgCustCd;
    }

    public String getRcvgCustTyp() {
        return rcvgCustTyp;
    }

    public void setRcvgCustTyp(String rcvgCustTyp) {
        this.rcvgCustTyp = rcvgCustTyp;
    }

    public String getRptFaxNbr() {
        return rptFaxNbr;
    }

    public void setRptFaxNbr(String rptFaxNbr) {
        this.rptFaxNbr = rptFaxNbr;
    }

    public Character getBlcngFreq() {
        return blcngFreq;
    }

    public void setBlcngFreq(Character blcngFreq) {
        this.blcngFreq = blcngFreq;
    }

    public Character getBlcngIndpdntFlg() {
        return blcngIndpdntFlg;
    }

    public void setBlcngIndpdntFlg(Character blcngIndpdntFlg) {
        this.blcngIndpdntFlg = blcngIndpdntFlg;
    }

    public Character getClsngFreq() {
        return clsngFreq;
    }

    public void setClsngFreq(Character clsngFreq) {
        this.clsngFreq = clsngFreq;
    }

    public Character getClsngIndpdntFlg() {
        return clsngIndpdntFlg;
    }

    public void setClsngIndpdntFlg(Character clsngIndpdntFlg) {
        this.clsngIndpdntFlg = clsngIndpdntFlg;
    }

    public Character getPmtFreq() {
        return pmtFreq;
    }

    public void setPmtFreq(Character pmtFreq) {
        this.pmtFreq = pmtFreq;
    }

    public Character getPmtIndpdntFlg() {
        return pmtIndpdntFlg;
    }

    public void setPmtIndpdntFlg(Character pmtIndpdntFlg) {
        this.pmtIndpdntFlg = pmtIndpdntFlg;
    }

    public String getPayToCd() {
        return payToCd;
    }

    public void setPayToCd(String payToCd) {
        this.payToCd = payToCd;
    }

    public String getPayToTyp() {
        return payToTyp;
    }

    public void setPayToTyp(String payToTyp) {
        this.payToTyp = payToTyp;
    }

    public String getPayMthd() {
        return payMthd;
    }

    public void setPayMthd(String payMthd) {
        this.payMthd = payMthd;
    }

    public short getPayDelay() {
        return payDelay;
    }

    public void setPayDelay(short payDelay) {
        this.payDelay = payDelay;
    }

    public Date getCtrtSentDt() {
        return ctrtSentDt;
    }

    public void setCtrtSentDt(Date ctrtSentDt) {
        this.ctrtSentDt = ctrtSentDt;
    }

    public String getCtrtSentInitExt() {
        return ctrtSentInitExt;
    }

    public void setCtrtSentInitExt(String ctrtSentInitExt) {
        this.ctrtSentInitExt = ctrtSentInitExt;
    }

    public Date getCtrtSgDt() {
        return ctrtSgDt;
    }

    public void setCtrtSgDt(Date ctrtSgDt) {
        this.ctrtSgDt = ctrtSgDt;
    }

    public String getCtrtSgInitExt() {
        return ctrtSgInitExt;
    }

    public void setCtrtSgInitExt(String ctrtSgInitExt) {
        this.ctrtSgInitExt = ctrtSgInitExt;
    }

    public Date getCtrtRtndDt() {
        return ctrtRtndDt;
    }

    public void setCtrtRtndDt(Date ctrtRtndDt) {
        this.ctrtRtndDt = ctrtRtndDt;
    }

    public String getCtrtRtndInitExt() {
        return ctrtRtndInitExt;
    }

    public void setCtrtRtndInitExt(String ctrtRtndInitExt) {
        this.ctrtRtndInitExt = ctrtRtndInitExt;
    }

    public Date getSsiStaDt() {
        return ssiStaDt;
    }

    public void setSsiStaDt(Date ssiStaDt) {
        this.ssiStaDt = ssiStaDt;
    }

    public String getSsiStaInitExt() {
        return ssiStaInitExt;
    }

    public void setSsiStaInitExt(String ssiStaInitExt) {
        this.ssiStaInitExt = ssiStaInitExt;
    }

    public Date getCrAprvdDt() {
        return crAprvdDt;
    }

    public void setCrAprvdDt(Date crAprvdDt) {
        this.crAprvdDt = crAprvdDt;
    }

    public String getCrAprvdInitExt() {
        return crAprvdInitExt;
    }

    public void setCrAprvdInitExt(String crAprvdInitExt) {
        this.crAprvdInitExt = crAprvdInitExt;
    }

    public Date getSsiCmpltDt() {
        return ssiCmpltDt;
    }

    public void setSsiCmpltDt(Date ssiCmpltDt) {
        this.ssiCmpltDt = ssiCmpltDt;
    }

    public String getSsiCmpltInitExt() {
        return ssiCmpltInitExt;
    }

    public void setSsiCmpltInitExt(String ssiCmpltInitExt) {
        this.ssiCmpltInitExt = ssiCmpltInitExt;
    }

    public Date getQaCmpltdDt() {
        return qaCmpltdDt;
    }

    public void setQaCmpltdDt(Date qaCmpltdDt) {
        this.qaCmpltdDt = qaCmpltdDt;
    }

    public String getQaCmpltdInitExt() {
        return qaCmpltdInitExt;
    }

    public void setQaCmpltdInitExt(String qaCmpltdInitExt) {
        this.qaCmpltdInitExt = qaCmpltdInitExt;
    }

    public String getCmnts() {
        return cmnts;
    }

    public void setCmnts(String cmnts) {
        this.cmnts = cmnts;
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
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdTsMrch)) {
            return false;
        }
        PrdTsMrch other = (PrdTsMrch) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTsMrch[ applNbr=" + applNbr + " ]";
    }

}
