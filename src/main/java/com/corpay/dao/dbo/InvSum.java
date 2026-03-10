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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "INV_SUM", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvSum.findAll", query = "SELECT i FROM InvSum i")})
public class InvSum implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvSumPK invSumPK;
    @Basic(optional = false)
    @Column(name = "PRTN_ID")
    private short prtnId;
    @Basic(optional = false)
    @Column(name = "CTL_NBR")
    private String ctlNbr;
    @Basic(optional = false)
    @Column(name = "CR_OR_DB")
    private Character crOrDb;
    @Basic(optional = false)
    @Column(name = "PSTD_TM")
    @Temporal(TemporalType.TIME)
    private Date pstdTm;
    @Basic(optional = false)
    @Column(name = "TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date trnsDt;
    @Basic(optional = false)
    @Column(name = "TRNS_TM")
    @Temporal(TemporalType.TIME)
    private Date trnsTm;
    @Basic(optional = false)
    @Column(name = "NTWK")
    private Character ntwk;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_NBR")
    private String custNbr;
    @Basic(optional = false)
    @Column(name = "CORP_CD")
    private String corpCd;
    @Basic(optional = false)
    @Column(name = "BLNG_TYP")
    private Character blngTyp;
    @Basic(optional = false)
    @Column(name = "SRCE_CURR_CD")
    private String srceCurrCd;
    @Basic(optional = false)
    @Column(name = "BILL_CURR_CD")
    private String billCurrCd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CNV_RATE")
    private BigDecimal cnvRate;
    @Basic(optional = false)
    @Column(name = "AUTO_TRNS")
    private Character autoTrns;
    @Basic(optional = false)
    @Column(name = "ADJD_TRNS_NBR")
    private int adjdTrnsNbr;
    @Basic(optional = false)
    @Column(name = "ADJD_TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date adjdTrnsDt;
    @Basic(optional = false)
    @Column(name = "INVD")
    private Character invd;
    @Basic(optional = false)
    @Column(name = "CYC_INV_DT")
    @Temporal(TemporalType.DATE)
    private Date cycInvDt;
    @Basic(optional = false)
    @Column(name = "PMT_DUE_DT")
    @Temporal(TemporalType.DATE)
    private Date pmtDueDt;
    @Basic(optional = false)
    @Column(name = "INT_TRNS_NBR")
    private String intTrnsNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_INV_NBR")
    private String mrchInvNbr;
    @Basic(optional = false)
    @Column(name = "AUTH_NBR")
    private String authNbr;
    @Basic(optional = false)
    @Column(name = "BLNG_FLG")
    private Character blngFlg;
    @Basic(optional = false)
    @Column(name = "NET_AMT_DUE")
    private BigDecimal netAmtDue;
    @Basic(optional = false)
    @Column(name = "DISC_AMT")
    private BigDecimal discAmt;
    @Basic(optional = false)
    @Column(name = "TRNS_FEE")
    private BigDecimal trnsFee;
    @Basic(optional = false)
    @Column(name = "RPTNG_LVL")
    private Character rptngLvl;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_CD")
    private String mrchCd;
    @Basic(optional = false)
    @Column(name = "DLY_VLCY_EXC")
    private Character dlyVlcyExc;
    @Basic(optional = false)
    @Column(name = "AFT_HRS_EXC")
    private Character aftHrsExc;
    @Basic(optional = false)
    @Column(name = "DLY_DLR_EXC")
    private Character dlyDlrExc;
    @Basic(optional = false)
    @Column(name = "TRNS_LMT_EXC")
    private Character trnsLmtExc;
    @Basic(optional = false)
    @Column(name = "WEEKEND_SRV")
    private Character weekendSrv;
    @Basic(optional = false)
    @Column(name = "DUP_TRNS")
    private Character dupTrns;
    @Basic(optional = false)
    @Column(name = "PCHS_ORD_NBR")
    private String pchsOrdNbr;
    @Basic(optional = false)
    @Column(name = "RFR_HRS")
    private long rfrHrs;
    @Basic(optional = false)
    @Column(name = "FLT_CRD_PRMG")
    private Character fltCrdPrmg;
    @Basic(optional = false)
    @Column(name = "FLT_CRD_RST_FLG")
    private Character fltCrdRstFlg;
    @Basic(optional = false)
    @Column(name = "IN_NTWK")
    private Character inNtwk;
    @Basic(optional = false)
    @Column(name = "CHPR_FL_AVL")
    private Character chprFlAvl;
    @Basic(optional = false)
    @Column(name = "FTRD")
    private Character ftrd;
    @Basic(optional = false)
    @Column(name = "BCH_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bchTs;
    @Basic(optional = false)
    @Column(name = "EXPS_FLG")
    private Character expsFlg;
    @Basic(optional = false)
    @Column(name = "CRD_ADDR_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdAddrTs;
    @Basic(optional = false)
    @Column(name = "CRD_ADDR_SEQ_NBR")
    private short crdAddrSeqNbr;
    @Basic(optional = false)
    @Column(name = "HIER_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hierTs;
    @Basic(optional = false)
    @Column(name = "HIER_SEQ_NBR")
    private short hierSeqNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_FORCE_POST")
    private Character mrchForcePost;
    @Basic(optional = false)
    @Column(name = "VIRTUAL_AMT_DIFFER")
    private Character virtualAmtDiffer;
    @Basic(optional = false)
    @Column(name = "VC_TOT_PARTS_CST")
    private BigDecimal vcTotPartsCst;
    @Basic(optional = false)
    @Column(name = "VC_TOT_LABOR_CST")
    private BigDecimal vcTotLaborCst;
    @Basic(optional = false)
    @Column(name = "VC_TOT_TAX_CST")
    private BigDecimal vcTotTaxCst;
    @Basic(optional = false)
    @Column(name = "VC_TOT_MISC_CST")
    private BigDecimal vcTotMiscCst;
    @Basic(optional = false)
    @Column(name = "MRCH_ADDR_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mrchAddrTs;
    @Basic(optional = false)
    @Column(name = "MRCH_ADDR_SEQ_NBR")
    private short mrchAddrSeqNbr;
    @Basic(optional = false)
    @Column(name = "PPNE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppneTs;
    @Basic(optional = false)
    @Column(name = "PPNE_SEQ_NBR")
    private short ppneSeqNbr;
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
    @Column(name = "MOBIL_FL_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mobilFlTs;
    @Basic(optional = false)
    @Column(name = "MOBIL_FL_SEQ_NBR")
    private short mobilFlSeqNbr;
    @Basic(optional = false)
    @Column(name = "BYPS_GL_CD_IND")
    private Character bypsGlCdInd;
    @Basic(optional = false)
    @Column(name = "CDN_TRNSACTL_CR_AM")
    private BigDecimal cdnTrnsactlCrAm;
    @Basic(optional = false)
    @Column(name = "AR_INV_NBR")
    private String arInvNbr;
    @Basic(optional = false)
    @Column(name = "SAT_PCHS_EXC_FLG")
    private Character satPchsExcFlg;
    @Basic(optional = false)
    @Column(name = "SUN_PCHS_EXC_FLG")
    private Character sunPchsExcFlg;
    @Basic(optional = false)
    @Column(name = "XBRDR_INTL_FLG")
    private Character xbrdrIntlFlg;
    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;
    @Basic(optional = false)
    @Column(name = "REB_AMT")
    private BigDecimal rebAmt;
    @Basic(optional = false)
    @Column(name = "REB_IND")
    private Character rebInd;
    @Basic(optional = false)
    @Column(name = "DISC_IND")
    private Character discInd;
    @Basic(optional = false)
    @Column(name = "RPT_TIME_IND")
    private String rptTimeInd;
    @Basic(optional = false)
    @Column(name = "XBRDR_FEE_AMT")
    private BigDecimal xbrdrFeeAmt;
    @Basic(optional = false)
    @Column(name = "ICA_CODE")
    private Character icaCode;
    @Basic(optional = false)
    @Column(name = "CRD_TOKEN")
    private String crdToken;
    @Basic(optional = false)
    @Column(name = "AUTH_ID_MTCH_NBR")
    private String authIdMtchNbr;
    @Basic(optional = false)
    @Column(name = "D4_TRAN_AMT")
    private BigDecimal d4TranAmt;
    @Basic(optional = false)
    @Column(name = "TENANT_ID")
    private String tenantId;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;

    public InvSum() {
    }

    public InvSum(InvSumPK invSumPK) {
        this.invSumPK = invSumPK;
    }

    public InvSum(InvSumPK invSumPK, short prtnId, String ctlNbr, Character crOrDb, Date pstdTm, Date trnsDt, Date trnsTm, Character ntwk, String acctNbr, String custNbr, String corpCd, Character blngTyp, String srceCurrCd, String billCurrCd, BigDecimal cnvRate, Character autoTrns, int adjdTrnsNbr, Date adjdTrnsDt, Character invd, Date cycInvDt, Date pmtDueDt, String intTrnsNbr, String mrchInvNbr, String authNbr, Character blngFlg, BigDecimal netAmtDue, BigDecimal discAmt, BigDecimal trnsFee, Character rptngLvl, String crdNbr, String mrchCd, Character dlyVlcyExc, Character aftHrsExc, Character dlyDlrExc, Character trnsLmtExc, Character weekendSrv, Character dupTrns, String pchsOrdNbr, long rfrHrs, Character fltCrdPrmg, Character fltCrdRstFlg, Character inNtwk, Character chprFlAvl, Character ftrd, Date bchTs, Character expsFlg, Date crdAddrTs, short crdAddrSeqNbr, Date hierTs, short hierSeqNbr, Character mrchForcePost, Character virtualAmtDiffer, BigDecimal vcTotPartsCst, BigDecimal vcTotLaborCst, BigDecimal vcTotTaxCst, BigDecimal vcTotMiscCst, Date mrchAddrTs, short mrchAddrSeqNbr, Date ppneTs, short ppneSeqNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Date mobilFlTs, short mobilFlSeqNbr, Character bypsGlCdInd, BigDecimal cdnTrnsactlCrAm, String arInvNbr, Character satPchsExcFlg, Character sunPchsExcFlg, Character xbrdrIntlFlg, String hierId, String nodeId, BigDecimal rebAmt, Character rebInd, Character discInd, String rptTimeInd, BigDecimal xbrdrFeeAmt, Character icaCode, String crdToken, String authIdMtchNbr, BigDecimal d4TranAmt, String tenantId, Date rowChgTs) {
        this.invSumPK = invSumPK;
        this.prtnId = prtnId;
        this.ctlNbr = ctlNbr;
        this.crOrDb = crOrDb;
        this.pstdTm = pstdTm;
        this.trnsDt = trnsDt;
        this.trnsTm = trnsTm;
        this.ntwk = ntwk;
        this.acctNbr = acctNbr;
        this.custNbr = custNbr;
        this.corpCd = corpCd;
        this.blngTyp = blngTyp;
        this.srceCurrCd = srceCurrCd;
        this.billCurrCd = billCurrCd;
        this.cnvRate = cnvRate;
        this.autoTrns = autoTrns;
        this.adjdTrnsNbr = adjdTrnsNbr;
        this.adjdTrnsDt = adjdTrnsDt;
        this.invd = invd;
        this.cycInvDt = cycInvDt;
        this.pmtDueDt = pmtDueDt;
        this.intTrnsNbr = intTrnsNbr;
        this.mrchInvNbr = mrchInvNbr;
        this.authNbr = authNbr;
        this.blngFlg = blngFlg;
        this.netAmtDue = netAmtDue;
        this.discAmt = discAmt;
        this.trnsFee = trnsFee;
        this.rptngLvl = rptngLvl;
        this.crdNbr = crdNbr;
        this.mrchCd = mrchCd;
        this.dlyVlcyExc = dlyVlcyExc;
        this.aftHrsExc = aftHrsExc;
        this.dlyDlrExc = dlyDlrExc;
        this.trnsLmtExc = trnsLmtExc;
        this.weekendSrv = weekendSrv;
        this.dupTrns = dupTrns;
        this.pchsOrdNbr = pchsOrdNbr;
        this.rfrHrs = rfrHrs;
        this.fltCrdPrmg = fltCrdPrmg;
        this.fltCrdRstFlg = fltCrdRstFlg;
        this.inNtwk = inNtwk;
        this.chprFlAvl = chprFlAvl;
        this.ftrd = ftrd;
        this.bchTs = bchTs;
        this.expsFlg = expsFlg;
        this.crdAddrTs = crdAddrTs;
        this.crdAddrSeqNbr = crdAddrSeqNbr;
        this.hierTs = hierTs;
        this.hierSeqNbr = hierSeqNbr;
        this.mrchForcePost = mrchForcePost;
        this.virtualAmtDiffer = virtualAmtDiffer;
        this.vcTotPartsCst = vcTotPartsCst;
        this.vcTotLaborCst = vcTotLaborCst;
        this.vcTotTaxCst = vcTotTaxCst;
        this.vcTotMiscCst = vcTotMiscCst;
        this.mrchAddrTs = mrchAddrTs;
        this.mrchAddrSeqNbr = mrchAddrSeqNbr;
        this.ppneTs = ppneTs;
        this.ppneSeqNbr = ppneSeqNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.mobilFlTs = mobilFlTs;
        this.mobilFlSeqNbr = mobilFlSeqNbr;
        this.bypsGlCdInd = bypsGlCdInd;
        this.cdnTrnsactlCrAm = cdnTrnsactlCrAm;
        this.arInvNbr = arInvNbr;
        this.satPchsExcFlg = satPchsExcFlg;
        this.sunPchsExcFlg = sunPchsExcFlg;
        this.xbrdrIntlFlg = xbrdrIntlFlg;
        this.hierId = hierId;
        this.nodeId = nodeId;
        this.rebAmt = rebAmt;
        this.rebInd = rebInd;
        this.discInd = discInd;
        this.rptTimeInd = rptTimeInd;
        this.xbrdrFeeAmt = xbrdrFeeAmt;
        this.icaCode = icaCode;
        this.crdToken = crdToken;
        this.authIdMtchNbr = authIdMtchNbr;
        this.d4TranAmt = d4TranAmt;
        this.tenantId = tenantId;
        this.rowChgTs = rowChgTs;
    }

    public InvSum(Date pstdDt, int trnsId) {
        this.invSumPK = new InvSumPK(pstdDt, trnsId);
    }

    public InvSumPK getInvSumPK() {
        return invSumPK;
    }

    public void setInvSumPK(InvSumPK invSumPK) {
        this.invSumPK = invSumPK;
    }

    public short getPrtnId() {
        return prtnId;
    }

    public void setPrtnId(short prtnId) {
        this.prtnId = prtnId;
    }

    public String getCtlNbr() {
        return ctlNbr;
    }

    public void setCtlNbr(String ctlNbr) {
        this.ctlNbr = ctlNbr;
    }

    public Character getCrOrDb() {
        return crOrDb;
    }

    public void setCrOrDb(Character crOrDb) {
        this.crOrDb = crOrDb;
    }

    public Date getPstdTm() {
        return pstdTm;
    }

    public void setPstdTm(Date pstdTm) {
        this.pstdTm = pstdTm;
    }

    public Date getTrnsDt() {
        return trnsDt;
    }

    public void setTrnsDt(Date trnsDt) {
        this.trnsDt = trnsDt;
    }

    public Date getTrnsTm() {
        return trnsTm;
    }

    public void setTrnsTm(Date trnsTm) {
        this.trnsTm = trnsTm;
    }

    public Character getNtwk() {
        return ntwk;
    }

    public void setNtwk(Character ntwk) {
        this.ntwk = ntwk;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustNbr() {
        return custNbr;
    }

    public void setCustNbr(String custNbr) {
        this.custNbr = custNbr;
    }

    public String getCorpCd() {
        return corpCd;
    }

    public void setCorpCd(String corpCd) {
        this.corpCd = corpCd;
    }

    public Character getBlngTyp() {
        return blngTyp;
    }

    public void setBlngTyp(Character blngTyp) {
        this.blngTyp = blngTyp;
    }

    public String getSrceCurrCd() {
        return srceCurrCd;
    }

    public void setSrceCurrCd(String srceCurrCd) {
        this.srceCurrCd = srceCurrCd;
    }

    public String getBillCurrCd() {
        return billCurrCd;
    }

    public void setBillCurrCd(String billCurrCd) {
        this.billCurrCd = billCurrCd;
    }

    public BigDecimal getCnvRate() {
        return cnvRate;
    }

    public void setCnvRate(BigDecimal cnvRate) {
        this.cnvRate = cnvRate;
    }

    public Character getAutoTrns() {
        return autoTrns;
    }

    public void setAutoTrns(Character autoTrns) {
        this.autoTrns = autoTrns;
    }

    public int getAdjdTrnsNbr() {
        return adjdTrnsNbr;
    }

    public void setAdjdTrnsNbr(int adjdTrnsNbr) {
        this.adjdTrnsNbr = adjdTrnsNbr;
    }

    public Date getAdjdTrnsDt() {
        return adjdTrnsDt;
    }

    public void setAdjdTrnsDt(Date adjdTrnsDt) {
        this.adjdTrnsDt = adjdTrnsDt;
    }

    public Character getInvd() {
        return invd;
    }

    public void setInvd(Character invd) {
        this.invd = invd;
    }

    public Date getCycInvDt() {
        return cycInvDt;
    }

    public void setCycInvDt(Date cycInvDt) {
        this.cycInvDt = cycInvDt;
    }

    public Date getPmtDueDt() {
        return pmtDueDt;
    }

    public void setPmtDueDt(Date pmtDueDt) {
        this.pmtDueDt = pmtDueDt;
    }

    public String getIntTrnsNbr() {
        return intTrnsNbr;
    }

    public void setIntTrnsNbr(String intTrnsNbr) {
        this.intTrnsNbr = intTrnsNbr;
    }

    public String getMrchInvNbr() {
        return mrchInvNbr;
    }

    public void setMrchInvNbr(String mrchInvNbr) {
        this.mrchInvNbr = mrchInvNbr;
    }

    public String getAuthNbr() {
        return authNbr;
    }

    public void setAuthNbr(String authNbr) {
        this.authNbr = authNbr;
    }

    public Character getBlngFlg() {
        return blngFlg;
    }

    public void setBlngFlg(Character blngFlg) {
        this.blngFlg = blngFlg;
    }

    public BigDecimal getNetAmtDue() {
        return netAmtDue;
    }

    public void setNetAmtDue(BigDecimal netAmtDue) {
        this.netAmtDue = netAmtDue;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
    }

    public BigDecimal getTrnsFee() {
        return trnsFee;
    }

    public void setTrnsFee(BigDecimal trnsFee) {
        this.trnsFee = trnsFee;
    }

    public Character getRptngLvl() {
        return rptngLvl;
    }

    public void setRptngLvl(Character rptngLvl) {
        this.rptngLvl = rptngLvl;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getMrchCd() {
        return mrchCd;
    }

    public void setMrchCd(String mrchCd) {
        this.mrchCd = mrchCd;
    }

    public Character getDlyVlcyExc() {
        return dlyVlcyExc;
    }

    public void setDlyVlcyExc(Character dlyVlcyExc) {
        this.dlyVlcyExc = dlyVlcyExc;
    }

    public Character getAftHrsExc() {
        return aftHrsExc;
    }

    public void setAftHrsExc(Character aftHrsExc) {
        this.aftHrsExc = aftHrsExc;
    }

    public Character getDlyDlrExc() {
        return dlyDlrExc;
    }

    public void setDlyDlrExc(Character dlyDlrExc) {
        this.dlyDlrExc = dlyDlrExc;
    }

    public Character getTrnsLmtExc() {
        return trnsLmtExc;
    }

    public void setTrnsLmtExc(Character trnsLmtExc) {
        this.trnsLmtExc = trnsLmtExc;
    }

    public Character getWeekendSrv() {
        return weekendSrv;
    }

    public void setWeekendSrv(Character weekendSrv) {
        this.weekendSrv = weekendSrv;
    }

    public Character getDupTrns() {
        return dupTrns;
    }

    public void setDupTrns(Character dupTrns) {
        this.dupTrns = dupTrns;
    }

    public String getPchsOrdNbr() {
        return pchsOrdNbr;
    }

    public void setPchsOrdNbr(String pchsOrdNbr) {
        this.pchsOrdNbr = pchsOrdNbr;
    }

    public long getRfrHrs() {
        return rfrHrs;
    }

    public void setRfrHrs(long rfrHrs) {
        this.rfrHrs = rfrHrs;
    }

    public Character getFltCrdPrmg() {
        return fltCrdPrmg;
    }

    public void setFltCrdPrmg(Character fltCrdPrmg) {
        this.fltCrdPrmg = fltCrdPrmg;
    }

    public Character getFltCrdRstFlg() {
        return fltCrdRstFlg;
    }

    public void setFltCrdRstFlg(Character fltCrdRstFlg) {
        this.fltCrdRstFlg = fltCrdRstFlg;
    }

    public Character getInNtwk() {
        return inNtwk;
    }

    public void setInNtwk(Character inNtwk) {
        this.inNtwk = inNtwk;
    }

    public Character getChprFlAvl() {
        return chprFlAvl;
    }

    public void setChprFlAvl(Character chprFlAvl) {
        this.chprFlAvl = chprFlAvl;
    }

    public Character getFtrd() {
        return ftrd;
    }

    public void setFtrd(Character ftrd) {
        this.ftrd = ftrd;
    }

    public Date getBchTs() {
        return bchTs;
    }

    public void setBchTs(Date bchTs) {
        this.bchTs = bchTs;
    }

    public Character getExpsFlg() {
        return expsFlg;
    }

    public void setExpsFlg(Character expsFlg) {
        this.expsFlg = expsFlg;
    }

    public Date getCrdAddrTs() {
        return crdAddrTs;
    }

    public void setCrdAddrTs(Date crdAddrTs) {
        this.crdAddrTs = crdAddrTs;
    }

    public short getCrdAddrSeqNbr() {
        return crdAddrSeqNbr;
    }

    public void setCrdAddrSeqNbr(short crdAddrSeqNbr) {
        this.crdAddrSeqNbr = crdAddrSeqNbr;
    }

    public Date getHierTs() {
        return hierTs;
    }

    public void setHierTs(Date hierTs) {
        this.hierTs = hierTs;
    }

    public short getHierSeqNbr() {
        return hierSeqNbr;
    }

    public void setHierSeqNbr(short hierSeqNbr) {
        this.hierSeqNbr = hierSeqNbr;
    }

    public Character getMrchForcePost() {
        return mrchForcePost;
    }

    public void setMrchForcePost(Character mrchForcePost) {
        this.mrchForcePost = mrchForcePost;
    }

    public Character getVirtualAmtDiffer() {
        return virtualAmtDiffer;
    }

    public void setVirtualAmtDiffer(Character virtualAmtDiffer) {
        this.virtualAmtDiffer = virtualAmtDiffer;
    }

    public BigDecimal getVcTotPartsCst() {
        return vcTotPartsCst;
    }

    public void setVcTotPartsCst(BigDecimal vcTotPartsCst) {
        this.vcTotPartsCst = vcTotPartsCst;
    }

    public BigDecimal getVcTotLaborCst() {
        return vcTotLaborCst;
    }

    public void setVcTotLaborCst(BigDecimal vcTotLaborCst) {
        this.vcTotLaborCst = vcTotLaborCst;
    }

    public BigDecimal getVcTotTaxCst() {
        return vcTotTaxCst;
    }

    public void setVcTotTaxCst(BigDecimal vcTotTaxCst) {
        this.vcTotTaxCst = vcTotTaxCst;
    }

    public BigDecimal getVcTotMiscCst() {
        return vcTotMiscCst;
    }

    public void setVcTotMiscCst(BigDecimal vcTotMiscCst) {
        this.vcTotMiscCst = vcTotMiscCst;
    }

    public Date getMrchAddrTs() {
        return mrchAddrTs;
    }

    public void setMrchAddrTs(Date mrchAddrTs) {
        this.mrchAddrTs = mrchAddrTs;
    }

    public short getMrchAddrSeqNbr() {
        return mrchAddrSeqNbr;
    }

    public void setMrchAddrSeqNbr(short mrchAddrSeqNbr) {
        this.mrchAddrSeqNbr = mrchAddrSeqNbr;
    }

    public Date getPpneTs() {
        return ppneTs;
    }

    public void setPpneTs(Date ppneTs) {
        this.ppneTs = ppneTs;
    }

    public short getPpneSeqNbr() {
        return ppneSeqNbr;
    }

    public void setPpneSeqNbr(short ppneSeqNbr) {
        this.ppneSeqNbr = ppneSeqNbr;
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

    public Date getMobilFlTs() {
        return mobilFlTs;
    }

    public void setMobilFlTs(Date mobilFlTs) {
        this.mobilFlTs = mobilFlTs;
    }

    public short getMobilFlSeqNbr() {
        return mobilFlSeqNbr;
    }

    public void setMobilFlSeqNbr(short mobilFlSeqNbr) {
        this.mobilFlSeqNbr = mobilFlSeqNbr;
    }

    public Character getBypsGlCdInd() {
        return bypsGlCdInd;
    }

    public void setBypsGlCdInd(Character bypsGlCdInd) {
        this.bypsGlCdInd = bypsGlCdInd;
    }

    public BigDecimal getCdnTrnsactlCrAm() {
        return cdnTrnsactlCrAm;
    }

    public void setCdnTrnsactlCrAm(BigDecimal cdnTrnsactlCrAm) {
        this.cdnTrnsactlCrAm = cdnTrnsactlCrAm;
    }

    public String getArInvNbr() {
        return arInvNbr;
    }

    public void setArInvNbr(String arInvNbr) {
        this.arInvNbr = arInvNbr;
    }

    public Character getSatPchsExcFlg() {
        return satPchsExcFlg;
    }

    public void setSatPchsExcFlg(Character satPchsExcFlg) {
        this.satPchsExcFlg = satPchsExcFlg;
    }

    public Character getSunPchsExcFlg() {
        return sunPchsExcFlg;
    }

    public void setSunPchsExcFlg(Character sunPchsExcFlg) {
        this.sunPchsExcFlg = sunPchsExcFlg;
    }

    public Character getXbrdrIntlFlg() {
        return xbrdrIntlFlg;
    }

    public void setXbrdrIntlFlg(Character xbrdrIntlFlg) {
        this.xbrdrIntlFlg = xbrdrIntlFlg;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public BigDecimal getRebAmt() {
        return rebAmt;
    }

    public void setRebAmt(BigDecimal rebAmt) {
        this.rebAmt = rebAmt;
    }

    public Character getRebInd() {
        return rebInd;
    }

    public void setRebInd(Character rebInd) {
        this.rebInd = rebInd;
    }

    public Character getDiscInd() {
        return discInd;
    }

    public void setDiscInd(Character discInd) {
        this.discInd = discInd;
    }

    public String getRptTimeInd() {
        return rptTimeInd;
    }

    public void setRptTimeInd(String rptTimeInd) {
        this.rptTimeInd = rptTimeInd;
    }

    public BigDecimal getXbrdrFeeAmt() {
        return xbrdrFeeAmt;
    }

    public void setXbrdrFeeAmt(BigDecimal xbrdrFeeAmt) {
        this.xbrdrFeeAmt = xbrdrFeeAmt;
    }

    public Character getIcaCode() {
        return icaCode;
    }

    public void setIcaCode(Character icaCode) {
        this.icaCode = icaCode;
    }

    public String getCrdToken() {
        return crdToken;
    }

    public void setCrdToken(String crdToken) {
        this.crdToken = crdToken;
    }

    public String getAuthIdMtchNbr() {
        return authIdMtchNbr;
    }

    public void setAuthIdMtchNbr(String authIdMtchNbr) {
        this.authIdMtchNbr = authIdMtchNbr;
    }

    public BigDecimal getD4TranAmt() {
        return d4TranAmt;
    }

    public void setD4TranAmt(BigDecimal d4TranAmt) {
        this.d4TranAmt = d4TranAmt;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Date getRowChgTs() {
        return rowChgTs;
    }

    public void setRowChgTs(Date rowChgTs) {
        this.rowChgTs = rowChgTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invSumPK != null ? invSumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvSum)) {
            return false;
        }
        InvSum other = (InvSum) object;
        if ((this.invSumPK == null && other.invSumPK != null) || (this.invSumPK != null && !this.invSumPK.equals(other.invSumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvSum[ invSumPK=" + invSumPK + " ]";
    }
    
}
