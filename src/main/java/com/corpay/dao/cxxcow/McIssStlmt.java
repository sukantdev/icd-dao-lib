package com.corpay.dao.cxxcow;

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
@Table(name = "MC_ISS_STLMT", catalog = "", schema = "CXXCOW")
public class McIssStlmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STLMT_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stlmtId;
    @Basic(optional = false)
    @Column(name = "IS_SEND_ICA")
    private short isSendIca;
    @Basic(optional = false)
    @Column(name = "IS_REC_TYPE")
    private String isRecType;
    @Basic(optional = false)
    @Column(name = "IS_XMIT_IDNO")
    private int isXmitIdno;
    @Basic(optional = false)
    @Column(name = "IS_XMIT_JULIAN")
    private short isXmitJulian;
    @Basic(optional = false)
    @Column(name = "IS_XMIT_SEND_ICA")
    private short isXmitSendIca;
    @Basic(optional = false)
    @Column(name = "IS_XMIT_ID_SEQ_NO")
    private short isXmitIdSeqNo;
    @Basic(optional = false)
    @Column(name = "IS_NO_CASH_DISB")
    private int isNoCashDisb;

    @Basic(optional = false)
    @Column(name = "IS_AMT_CASH_DISB")
    private BigDecimal isAmtCashDisb;
    @Basic(optional = false)
    @Column(name = "IS_CASH_DISB_IND")
    private Character isCashDisbInd;
    @Basic(optional = false)
    @Column(name = "IS_AMT_CASH_FEES")
    private BigDecimal isAmtCashFees;
    @Basic(optional = false)
    @Column(name = "IS_CASH_FEES_IND")
    private Character isCashFeesInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_RTL_SALES")
    private int isNoRtlSales;
    @Basic(optional = false)
    @Column(name = "IS_AMT_RTL_SALES")
    private BigDecimal isAmtRtlSales;
    @Basic(optional = false)
    @Column(name = "IS_RTL_SALES_IND")
    private Character isRtlSalesInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_CRED")
    private int isNoCred;
    @Basic(optional = false)
    @Column(name = "IS_AMT_CRED")
    private BigDecimal isAmtCred;
    @Basic(optional = false)
    @Column(name = "IS_AMT_CRED_IND")
    private Character isAmtCredInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_UNIQ_XACT")
    private int isNoUniqXact;
    @Basic(optional = false)
    @Column(name = "IS_AMT_UNIQ_XACT")
    private long isAmtUniqXact;
    @Basic(optional = false)
    @Column(name = "IS_UNIQ_XACT_IND")
    private Character isUniqXactInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_ATM_CSH_DIS")
    private int isNoAtmCshDis;
    @Basic(optional = false)
    @Column(name = "IS_AMT_ATM_CSH_DI")
    private BigDecimal isAmtAtmCshDi;
    @Basic(optional = false)
    @Column(name = "IS_ATM_CSH_DIS_IND")
    private Character isAtmCshDisInd;
    @Basic(optional = false)
    @Column(name = "IS_AMT_ATM_CSH_FEE")
    private BigDecimal isAmtAtmCshFee;
    @Basic(optional = false)
    @Column(name = "IS_ATM_CSH_FEE_IND")
    private Character isAtmCshFeeInd;
    @Basic(optional = false)
    @Column(name = "IS_INTER_FEES")
    private BigDecimal isInterFees;
    @Basic(optional = false)
    @Column(name = "IS_INTER_FEES_IND")
    private Character isInterFeesInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_NONSTD_XACT")
    private int isNoNonstdXact;
    @Basic(optional = false)
    @Column(name = "IS_AMT_NONSTD_XACT")
    private long isAmtNonstdXact;
    @Basic(optional = false)
    @Column(name = "IS_NONSTD_XACT_IND")
    private Character isNonstdXactInd;
    @Basic(optional = false)
    @Column(name = "IS_NONSTD_INT_FEE")
    private BigDecimal isNonstdIntFee;
    @Basic(optional = false)
    @Column(name = "IS_NSTD_INT_FE_IND")
    private Character isNstdIntFeInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_INTL_CSH_DIS")
    private int isNoIntlCshDis;
    @Basic(optional = false)
    @Column(name = "IS_AMT_INTL_CSH_DI")
    private BigDecimal isAmtIntlCshDi;
    @Basic(optional = false)
    @Column(name = "IS_INTL_CSH_DI_IND")
    private Character isIntlCshDiInd;
    @Basic(optional = false)
    @Column(name = "IS_AMT_CSH_DIS_FEE")
    private BigDecimal isAmtCshDisFee;
    @Basic(optional = false)
    @Column(name = "IS_CSH_DIS_FEE_IND")
    private Character isCshDisFeeInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_INTL_RTL_SA")
    private int isNoIntlRtlSa;
    @Basic(optional = false)
    @Column(name = "IS_AMT_INTL_RTL_SA")
    private BigDecimal isAmtIntlRtlSa;
    @Basic(optional = false)
    @Column(name = "IS_INTL_RTL_IND")
    private Character isIntlRtlInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_INTL_CRD_SA")
    private int isNoIntlCrdSa;
    @Basic(optional = false)
    @Column(name = "IS_AMT_INTL_CRED")
    private BigDecimal isAmtIntlCred;
    @Basic(optional = false)
    @Column(name = "IS_INTL_CRD_IND")
    private Character isIntlCrdInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_INTL_UN_XMIT")
    private int isNoIntlUnXmit;
    @Basic(optional = false)
    @Column(name = "IS_AMT_INTL_UN_XMI")
    private long isAmtIntlUnXmi;
    @Basic(optional = false)
    @Column(name = "IS_INTL_UN_XMI_IND")
    private Character isIntlUnXmiInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_IN_ATM_CA_D")
    private int isNoInAtmCaD;
    @Basic(optional = false)
    @Column(name = "IS_AMT_IN_ATM_CA_D")
    private BigDecimal isAmtInAtmCaD;
    @Basic(optional = false)
    @Column(name = "IS_IN_ATM_CA_D_IND")
    private Character isInAtmCaDInd;
    @Basic(optional = false)
    @Column(name = "IS_INT_ATM_C_D_FEE")
    private int isIntAtmCDFee;
    @Basic(optional = false)
    @Column(name = "IS_IN_ATM_C_D_F_IN")
    private Character isInAtmCDFIn;
    @Basic(optional = false)
    @Column(name = "IS_INTL_INTCHG_FEE")
    private long isIntlIntchgFee;
    @Basic(optional = false)
    @Column(name = "IS_INTL_INTCHG_IND")
    private Character isIntlIntchgInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_REQ_CPY")
    private short isNoReqCpy;
    @Basic(optional = false)
    @Column(name = "IS_NO_HARD_CPY_REQ")
    private short isNoHardCpyReq;
    @Basic(optional = false)
    @Column(name = "IS_NO_ACQU_RTR_CPY")
    private short isNoAcquRtrCpy;
    @Basic(optional = false)
    @Column(name = "IS_NO_ACQU_RTR_SUB")
    private short isNoAcquRtrSub;
    @Basic(optional = false)
    @Column(name = "IS_NO_FULFIL_CPY")
    private short isNoFulfilCpy;
    @Basic(optional = false)
    @Column(name = "IS_AMT_RETR_FF_CPY")
    private int isAmtRetrFfCpy;
    @Basic(optional = false)
    @Column(name = "IS_RETR_FF_CPY_IND")
    private Character isRetrFfCpyInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_RR_FF_HC_SUB")
    private short isNoRrFfHcSub;
    @Basic(optional = false)
    @Column(name = "IS_AMT_CPY_SUB_FEE")
    private BigDecimal isAmtCpySubFee;
    @Basic(optional = false)
    @Column(name = "IS_CPY_SUB_FEE_IND")
    private Character isCpySubFeeInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_1ST_CBACK")
    private short isNo1stCback;
    @Basic(optional = false)
    @Column(name = "IS_AMT_1ST_CBACK")
    private BigDecimal isAmt1stCback;
    @Basic(optional = false)
    @Column(name = "IS_1ST_CBACK_IND")
    private Character is1stCbackInd;
    @Basic(optional = false)
    @Column(name = "IS_AMT_1ST_CBACK_F")
    private BigDecimal isAmt1stCbackF;
    @Basic(optional = false)
    @Column(name = "IS_1ST_CBACK_F_IND")
    private Character is1stCbackFInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_2ND_PRESENT")
    private short isNo2ndPresent;
    @Basic(optional = false)
    @Column(name = "IS_AMT_2ND_PRESENT")
    private BigDecimal isAmt2ndPresent;
    @Basic(optional = false)
    @Column(name = "IS_2ND_PRESENT_IND")
    private Character is2ndPresentInd;
    @Basic(optional = false)
    @Column(name = "IS_AMT_2ND_PR_FEES")
    private BigDecimal isAmt2ndPrFees;
    @Basic(optional = false)
    @Column(name = "IS_2ND_PR_FEES_IND")
    private Character is2ndPrFeesInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_ARBIT_CBACK")
    private short isNoArbitCback;
    @Basic(optional = false)
    @Column(name = "IS_AMT_ARBIT_CBACK")
    private BigDecimal isAmtArbitCback;
    @Basic(optional = false)
    @Column(name = "IS_ARB_CBACK_IND")
    private Character isArbCbackInd;
    @Basic(optional = false)
    @Column(name = "IS_AMT_ARB_CB_FEE")
    private BigDecimal isAmtArbCbFee;
    @Basic(optional = false)
    @Column(name = "IS_ARB_CB_FEE_IND")
    private Character isArbCbFeeInd;
    @Basic(optional = false)
    @Column(name = "IS_AMT_INT_CB_FEE")
    private BigDecimal isAmtIntCbFee;
    @Basic(optional = false)
    @Column(name = "IS_INT_CB_FEE_IND")
    private Character isIntCbFeeInd;
    @Basic(optional = false)
    @Column(name = "IS_AMT_IN_PRES_FEE")
    private BigDecimal isAmtInPresFee;
    @Basic(optional = false)
    @Column(name = "IS_IN_PRES_FEE_IND")
    private Character isInPresFeeInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_MISC_XACT")
    private short isNoMiscXact;
    @Basic(optional = false)
    @Column(name = "IS_AMT_MISC_XACT")
    private BigDecimal isAmtMiscXact;
    @Basic(optional = false)
    @Column(name = "IS_MISC_XACT_IND")
    private Character isMiscXactInd;
    @Basic(optional = false)
    @Column(name = "IS_NET_STLMT_AMT")
    private BigDecimal isNetStlmtAmt;
    @Basic(optional = false)
    @Column(name = "IS_STLMT_AMT_IND")
    private Character isStlmtAmtInd;
    @Basic(optional = false)
    @Column(name = "IS_NET_AM_MON_XACT")
    private BigDecimal isNetAmMonXact;
    @Basic(optional = false)
    @Column(name = "IS_NET_MON_XAC_IND")
    private Character isNetMonXacInd;
    @Basic(optional = false)
    @Column(name = "IS_NO_MON_RCDS")
    private int isNoMonRcds;
    @Basic(optional = false)
    @Column(name = "IS_XMISS_REJ_CD")
    private String isXmissRejCd;
    @Basic(optional = false)
    @Column(name = "NOTEID")
    private int noteid;
    @Basic(optional = false)
    @Column(name = "CLUSTER_KEY")
    private String clusterKey;
    @Basic(optional = false)
    @Column(name = "IS_PROCESSED_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date isProcessedTs;
    @Basic(optional = false)
    @Column(name = "IS_PROCESSED_FLG")
    private Character isProcessedFlg;
    @Basic(optional = false)
    @Column(name = "IS_FILE_NAME")
    private String isFileName;
    @Basic(optional = false)
    @Column(name = "IS_XMIT_JULIAN_YR")
    private short isXmitJulianYr;
    @Basic(optional = false)
    @Column(name = "MC_FILTERED_FLG")
    private Character mcFilteredFlg;

    public McIssStlmt() {
    }

    public McIssStlmt(Date stlmtId) {
        this.stlmtId = stlmtId;
    }

    public McIssStlmt(Date stlmtId, short isSendIca, String isRecType, int isXmitIdno, short isXmitJulian, short isXmitSendIca, short isXmitIdSeqNo, int isNoCashDisb, BigDecimal isAmtCashDisb, Character isCashDisbInd, BigDecimal isAmtCashFees, Character isCashFeesInd, int isNoRtlSales, BigDecimal isAmtRtlSales, Character isRtlSalesInd, int isNoCred, BigDecimal isAmtCred, Character isAmtCredInd, int isNoUniqXact, long isAmtUniqXact, Character isUniqXactInd, int isNoAtmCshDis, BigDecimal isAmtAtmCshDi, Character isAtmCshDisInd, BigDecimal isAmtAtmCshFee, Character isAtmCshFeeInd, BigDecimal isInterFees, Character isInterFeesInd, int isNoNonstdXact, long isAmtNonstdXact, Character isNonstdXactInd, BigDecimal isNonstdIntFee, Character isNstdIntFeInd, int isNoIntlCshDis, BigDecimal isAmtIntlCshDi, Character isIntlCshDiInd, BigDecimal isAmtCshDisFee, Character isCshDisFeeInd, int isNoIntlRtlSa, BigDecimal isAmtIntlRtlSa, Character isIntlRtlInd, int isNoIntlCrdSa, BigDecimal isAmtIntlCred, Character isIntlCrdInd, int isNoIntlUnXmit, long isAmtIntlUnXmi, Character isIntlUnXmiInd, int isNoInAtmCaD, BigDecimal isAmtInAtmCaD, Character isInAtmCaDInd, int isIntAtmCDFee, Character isInAtmCDFIn, long isIntlIntchgFee, Character isIntlIntchgInd, short isNoReqCpy, short isNoHardCpyReq, short isNoAcquRtrCpy, short isNoAcquRtrSub, short isNoFulfilCpy, int isAmtRetrFfCpy, Character isRetrFfCpyInd, short isNoRrFfHcSub, BigDecimal isAmtCpySubFee, Character isCpySubFeeInd, short isNo1stCback, BigDecimal isAmt1stCback, Character is1stCbackInd, BigDecimal isAmt1stCbackF, Character is1stCbackFInd, short isNo2ndPresent, BigDecimal isAmt2ndPresent, Character is2ndPresentInd, BigDecimal isAmt2ndPrFees, Character is2ndPrFeesInd, short isNoArbitCback, BigDecimal isAmtArbitCback, Character isArbCbackInd, BigDecimal isAmtArbCbFee, Character isArbCbFeeInd, BigDecimal isAmtIntCbFee, Character isIntCbFeeInd, BigDecimal isAmtInPresFee, Character isInPresFeeInd, short isNoMiscXact, BigDecimal isAmtMiscXact, Character isMiscXactInd, BigDecimal isNetStlmtAmt, Character isStlmtAmtInd, BigDecimal isNetAmMonXact, Character isNetMonXacInd, int isNoMonRcds, String isXmissRejCd, int noteid, String clusterKey, Date isProcessedTs, Character isProcessedFlg, String isFileName, short isXmitJulianYr, Character mcFilteredFlg) {
        this.stlmtId = stlmtId;
        this.isSendIca = isSendIca;
        this.isRecType = isRecType;
        this.isXmitIdno = isXmitIdno;
        this.isXmitJulian = isXmitJulian;
        this.isXmitSendIca = isXmitSendIca;
        this.isXmitIdSeqNo = isXmitIdSeqNo;
        this.isNoCashDisb = isNoCashDisb;
        this.isAmtCashDisb = isAmtCashDisb;
        this.isCashDisbInd = isCashDisbInd;
        this.isAmtCashFees = isAmtCashFees;
        this.isCashFeesInd = isCashFeesInd;
        this.isNoRtlSales = isNoRtlSales;
        this.isAmtRtlSales = isAmtRtlSales;
        this.isRtlSalesInd = isRtlSalesInd;
        this.isNoCred = isNoCred;
        this.isAmtCred = isAmtCred;
        this.isAmtCredInd = isAmtCredInd;
        this.isNoUniqXact = isNoUniqXact;
        this.isAmtUniqXact = isAmtUniqXact;
        this.isUniqXactInd = isUniqXactInd;
        this.isNoAtmCshDis = isNoAtmCshDis;
        this.isAmtAtmCshDi = isAmtAtmCshDi;
        this.isAtmCshDisInd = isAtmCshDisInd;
        this.isAmtAtmCshFee = isAmtAtmCshFee;
        this.isAtmCshFeeInd = isAtmCshFeeInd;
        this.isInterFees = isInterFees;
        this.isInterFeesInd = isInterFeesInd;
        this.isNoNonstdXact = isNoNonstdXact;
        this.isAmtNonstdXact = isAmtNonstdXact;
        this.isNonstdXactInd = isNonstdXactInd;
        this.isNonstdIntFee = isNonstdIntFee;
        this.isNstdIntFeInd = isNstdIntFeInd;
        this.isNoIntlCshDis = isNoIntlCshDis;
        this.isAmtIntlCshDi = isAmtIntlCshDi;
        this.isIntlCshDiInd = isIntlCshDiInd;
        this.isAmtCshDisFee = isAmtCshDisFee;
        this.isCshDisFeeInd = isCshDisFeeInd;
        this.isNoIntlRtlSa = isNoIntlRtlSa;
        this.isAmtIntlRtlSa = isAmtIntlRtlSa;
        this.isIntlRtlInd = isIntlRtlInd;
        this.isNoIntlCrdSa = isNoIntlCrdSa;
        this.isAmtIntlCred = isAmtIntlCred;
        this.isIntlCrdInd = isIntlCrdInd;
        this.isNoIntlUnXmit = isNoIntlUnXmit;
        this.isAmtIntlUnXmi = isAmtIntlUnXmi;
        this.isIntlUnXmiInd = isIntlUnXmiInd;
        this.isNoInAtmCaD = isNoInAtmCaD;
        this.isAmtInAtmCaD = isAmtInAtmCaD;
        this.isInAtmCaDInd = isInAtmCaDInd;
        this.isIntAtmCDFee = isIntAtmCDFee;
        this.isInAtmCDFIn = isInAtmCDFIn;
        this.isIntlIntchgFee = isIntlIntchgFee;
        this.isIntlIntchgInd = isIntlIntchgInd;
        this.isNoReqCpy = isNoReqCpy;
        this.isNoHardCpyReq = isNoHardCpyReq;
        this.isNoAcquRtrCpy = isNoAcquRtrCpy;
        this.isNoAcquRtrSub = isNoAcquRtrSub;
        this.isNoFulfilCpy = isNoFulfilCpy;
        this.isAmtRetrFfCpy = isAmtRetrFfCpy;
        this.isRetrFfCpyInd = isRetrFfCpyInd;
        this.isNoRrFfHcSub = isNoRrFfHcSub;
        this.isAmtCpySubFee = isAmtCpySubFee;
        this.isCpySubFeeInd = isCpySubFeeInd;
        this.isNo1stCback = isNo1stCback;
        this.isAmt1stCback = isAmt1stCback;
        this.is1stCbackInd = is1stCbackInd;
        this.isAmt1stCbackF = isAmt1stCbackF;
        this.is1stCbackFInd = is1stCbackFInd;
        this.isNo2ndPresent = isNo2ndPresent;
        this.isAmt2ndPresent = isAmt2ndPresent;
        this.is2ndPresentInd = is2ndPresentInd;
        this.isAmt2ndPrFees = isAmt2ndPrFees;
        this.is2ndPrFeesInd = is2ndPrFeesInd;
        this.isNoArbitCback = isNoArbitCback;
        this.isAmtArbitCback = isAmtArbitCback;
        this.isArbCbackInd = isArbCbackInd;
        this.isAmtArbCbFee = isAmtArbCbFee;
        this.isArbCbFeeInd = isArbCbFeeInd;
        this.isAmtIntCbFee = isAmtIntCbFee;
        this.isIntCbFeeInd = isIntCbFeeInd;
        this.isAmtInPresFee = isAmtInPresFee;
        this.isInPresFeeInd = isInPresFeeInd;
        this.isNoMiscXact = isNoMiscXact;
        this.isAmtMiscXact = isAmtMiscXact;
        this.isMiscXactInd = isMiscXactInd;
        this.isNetStlmtAmt = isNetStlmtAmt;
        this.isStlmtAmtInd = isStlmtAmtInd;
        this.isNetAmMonXact = isNetAmMonXact;
        this.isNetMonXacInd = isNetMonXacInd;
        this.isNoMonRcds = isNoMonRcds;
        this.isXmissRejCd = isXmissRejCd;
        this.noteid = noteid;
        this.clusterKey = clusterKey;
        this.isProcessedTs = isProcessedTs;
        this.isProcessedFlg = isProcessedFlg;
        this.isFileName = isFileName;
        this.isXmitJulianYr = isXmitJulianYr;
        this.mcFilteredFlg = mcFilteredFlg;
    }

    public Date getStlmtId() {
        return stlmtId;
    }

    public void setStlmtId(Date stlmtId) {
        this.stlmtId = stlmtId;
    }

    public short getIsSendIca() {
        return isSendIca;
    }

    public void setIsSendIca(short isSendIca) {
        this.isSendIca = isSendIca;
    }

    public String getIsRecType() {
        return isRecType;
    }

    public void setIsRecType(String isRecType) {
        this.isRecType = isRecType;
    }

    public int getIsXmitIdno() {
        return isXmitIdno;
    }

    public void setIsXmitIdno(int isXmitIdno) {
        this.isXmitIdno = isXmitIdno;
    }

    public short getIsXmitJulian() {
        return isXmitJulian;
    }

    public void setIsXmitJulian(short isXmitJulian) {
        this.isXmitJulian = isXmitJulian;
    }

    public short getIsXmitSendIca() {
        return isXmitSendIca;
    }

    public void setIsXmitSendIca(short isXmitSendIca) {
        this.isXmitSendIca = isXmitSendIca;
    }

    public short getIsXmitIdSeqNo() {
        return isXmitIdSeqNo;
    }

    public void setIsXmitIdSeqNo(short isXmitIdSeqNo) {
        this.isXmitIdSeqNo = isXmitIdSeqNo;
    }

    public int getIsNoCashDisb() {
        return isNoCashDisb;
    }

    public void setIsNoCashDisb(int isNoCashDisb) {
        this.isNoCashDisb = isNoCashDisb;
    }

    public BigDecimal getIsAmtCashDisb() {
        return isAmtCashDisb;
    }

    public void setIsAmtCashDisb(BigDecimal isAmtCashDisb) {
        this.isAmtCashDisb = isAmtCashDisb;
    }

    public Character getIsCashDisbInd() {
        return isCashDisbInd;
    }

    public void setIsCashDisbInd(Character isCashDisbInd) {
        this.isCashDisbInd = isCashDisbInd;
    }

    public BigDecimal getIsAmtCashFees() {
        return isAmtCashFees;
    }

    public void setIsAmtCashFees(BigDecimal isAmtCashFees) {
        this.isAmtCashFees = isAmtCashFees;
    }

    public Character getIsCashFeesInd() {
        return isCashFeesInd;
    }

    public void setIsCashFeesInd(Character isCashFeesInd) {
        this.isCashFeesInd = isCashFeesInd;
    }

    public int getIsNoRtlSales() {
        return isNoRtlSales;
    }

    public void setIsNoRtlSales(int isNoRtlSales) {
        this.isNoRtlSales = isNoRtlSales;
    }

    public BigDecimal getIsAmtRtlSales() {
        return isAmtRtlSales;
    }

    public void setIsAmtRtlSales(BigDecimal isAmtRtlSales) {
        this.isAmtRtlSales = isAmtRtlSales;
    }

    public Character getIsRtlSalesInd() {
        return isRtlSalesInd;
    }

    public void setIsRtlSalesInd(Character isRtlSalesInd) {
        this.isRtlSalesInd = isRtlSalesInd;
    }

    public int getIsNoCred() {
        return isNoCred;
    }

    public void setIsNoCred(int isNoCred) {
        this.isNoCred = isNoCred;
    }

    public BigDecimal getIsAmtCred() {
        return isAmtCred;
    }

    public void setIsAmtCred(BigDecimal isAmtCred) {
        this.isAmtCred = isAmtCred;
    }

    public Character getIsAmtCredInd() {
        return isAmtCredInd;
    }

    public void setIsAmtCredInd(Character isAmtCredInd) {
        this.isAmtCredInd = isAmtCredInd;
    }

    public int getIsNoUniqXact() {
        return isNoUniqXact;
    }

    public void setIsNoUniqXact(int isNoUniqXact) {
        this.isNoUniqXact = isNoUniqXact;
    }

    public long getIsAmtUniqXact() {
        return isAmtUniqXact;
    }

    public void setIsAmtUniqXact(long isAmtUniqXact) {
        this.isAmtUniqXact = isAmtUniqXact;
    }

    public Character getIsUniqXactInd() {
        return isUniqXactInd;
    }

    public void setIsUniqXactInd(Character isUniqXactInd) {
        this.isUniqXactInd = isUniqXactInd;
    }

    public int getIsNoAtmCshDis() {
        return isNoAtmCshDis;
    }

    public void setIsNoAtmCshDis(int isNoAtmCshDis) {
        this.isNoAtmCshDis = isNoAtmCshDis;
    }

    public BigDecimal getIsAmtAtmCshDi() {
        return isAmtAtmCshDi;
    }

    public void setIsAmtAtmCshDi(BigDecimal isAmtAtmCshDi) {
        this.isAmtAtmCshDi = isAmtAtmCshDi;
    }

    public Character getIsAtmCshDisInd() {
        return isAtmCshDisInd;
    }

    public void setIsAtmCshDisInd(Character isAtmCshDisInd) {
        this.isAtmCshDisInd = isAtmCshDisInd;
    }

    public BigDecimal getIsAmtAtmCshFee() {
        return isAmtAtmCshFee;
    }

    public void setIsAmtAtmCshFee(BigDecimal isAmtAtmCshFee) {
        this.isAmtAtmCshFee = isAmtAtmCshFee;
    }

    public Character getIsAtmCshFeeInd() {
        return isAtmCshFeeInd;
    }

    public void setIsAtmCshFeeInd(Character isAtmCshFeeInd) {
        this.isAtmCshFeeInd = isAtmCshFeeInd;
    }

    public BigDecimal getIsInterFees() {
        return isInterFees;
    }

    public void setIsInterFees(BigDecimal isInterFees) {
        this.isInterFees = isInterFees;
    }

    public Character getIsInterFeesInd() {
        return isInterFeesInd;
    }

    public void setIsInterFeesInd(Character isInterFeesInd) {
        this.isInterFeesInd = isInterFeesInd;
    }

    public int getIsNoNonstdXact() {
        return isNoNonstdXact;
    }

    public void setIsNoNonstdXact(int isNoNonstdXact) {
        this.isNoNonstdXact = isNoNonstdXact;
    }

    public long getIsAmtNonstdXact() {
        return isAmtNonstdXact;
    }

    public void setIsAmtNonstdXact(long isAmtNonstdXact) {
        this.isAmtNonstdXact = isAmtNonstdXact;
    }

    public Character getIsNonstdXactInd() {
        return isNonstdXactInd;
    }

    public void setIsNonstdXactInd(Character isNonstdXactInd) {
        this.isNonstdXactInd = isNonstdXactInd;
    }

    public BigDecimal getIsNonstdIntFee() {
        return isNonstdIntFee;
    }

    public void setIsNonstdIntFee(BigDecimal isNonstdIntFee) {
        this.isNonstdIntFee = isNonstdIntFee;
    }

    public Character getIsNstdIntFeInd() {
        return isNstdIntFeInd;
    }

    public void setIsNstdIntFeInd(Character isNstdIntFeInd) {
        this.isNstdIntFeInd = isNstdIntFeInd;
    }

    public int getIsNoIntlCshDis() {
        return isNoIntlCshDis;
    }

    public void setIsNoIntlCshDis(int isNoIntlCshDis) {
        this.isNoIntlCshDis = isNoIntlCshDis;
    }

    public BigDecimal getIsAmtIntlCshDi() {
        return isAmtIntlCshDi;
    }

    public void setIsAmtIntlCshDi(BigDecimal isAmtIntlCshDi) {
        this.isAmtIntlCshDi = isAmtIntlCshDi;
    }

    public Character getIsIntlCshDiInd() {
        return isIntlCshDiInd;
    }

    public void setIsIntlCshDiInd(Character isIntlCshDiInd) {
        this.isIntlCshDiInd = isIntlCshDiInd;
    }

    public BigDecimal getIsAmtCshDisFee() {
        return isAmtCshDisFee;
    }

    public void setIsAmtCshDisFee(BigDecimal isAmtCshDisFee) {
        this.isAmtCshDisFee = isAmtCshDisFee;
    }

    public Character getIsCshDisFeeInd() {
        return isCshDisFeeInd;
    }

    public void setIsCshDisFeeInd(Character isCshDisFeeInd) {
        this.isCshDisFeeInd = isCshDisFeeInd;
    }

    public int getIsNoIntlRtlSa() {
        return isNoIntlRtlSa;
    }

    public void setIsNoIntlRtlSa(int isNoIntlRtlSa) {
        this.isNoIntlRtlSa = isNoIntlRtlSa;
    }

    public BigDecimal getIsAmtIntlRtlSa() {
        return isAmtIntlRtlSa;
    }

    public void setIsAmtIntlRtlSa(BigDecimal isAmtIntlRtlSa) {
        this.isAmtIntlRtlSa = isAmtIntlRtlSa;
    }

    public Character getIsIntlRtlInd() {
        return isIntlRtlInd;
    }

    public void setIsIntlRtlInd(Character isIntlRtlInd) {
        this.isIntlRtlInd = isIntlRtlInd;
    }

    public int getIsNoIntlCrdSa() {
        return isNoIntlCrdSa;
    }

    public void setIsNoIntlCrdSa(int isNoIntlCrdSa) {
        this.isNoIntlCrdSa = isNoIntlCrdSa;
    }

    public BigDecimal getIsAmtIntlCred() {
        return isAmtIntlCred;
    }

    public void setIsAmtIntlCred(BigDecimal isAmtIntlCred) {
        this.isAmtIntlCred = isAmtIntlCred;
    }

    public Character getIsIntlCrdInd() {
        return isIntlCrdInd;
    }

    public void setIsIntlCrdInd(Character isIntlCrdInd) {
        this.isIntlCrdInd = isIntlCrdInd;
    }

    public int getIsNoIntlUnXmit() {
        return isNoIntlUnXmit;
    }

    public void setIsNoIntlUnXmit(int isNoIntlUnXmit) {
        this.isNoIntlUnXmit = isNoIntlUnXmit;
    }

    public long getIsAmtIntlUnXmi() {
        return isAmtIntlUnXmi;
    }

    public void setIsAmtIntlUnXmi(long isAmtIntlUnXmi) {
        this.isAmtIntlUnXmi = isAmtIntlUnXmi;
    }

    public Character getIsIntlUnXmiInd() {
        return isIntlUnXmiInd;
    }

    public void setIsIntlUnXmiInd(Character isIntlUnXmiInd) {
        this.isIntlUnXmiInd = isIntlUnXmiInd;
    }

    public int getIsNoInAtmCaD() {
        return isNoInAtmCaD;
    }

    public void setIsNoInAtmCaD(int isNoInAtmCaD) {
        this.isNoInAtmCaD = isNoInAtmCaD;
    }

    public BigDecimal getIsAmtInAtmCaD() {
        return isAmtInAtmCaD;
    }

    public void setIsAmtInAtmCaD(BigDecimal isAmtInAtmCaD) {
        this.isAmtInAtmCaD = isAmtInAtmCaD;
    }

    public Character getIsInAtmCaDInd() {
        return isInAtmCaDInd;
    }

    public void setIsInAtmCaDInd(Character isInAtmCaDInd) {
        this.isInAtmCaDInd = isInAtmCaDInd;
    }

    public int getIsIntAtmCDFee() {
        return isIntAtmCDFee;
    }

    public void setIsIntAtmCDFee(int isIntAtmCDFee) {
        this.isIntAtmCDFee = isIntAtmCDFee;
    }

    public Character getIsInAtmCDFIn() {
        return isInAtmCDFIn;
    }

    public void setIsInAtmCDFIn(Character isInAtmCDFIn) {
        this.isInAtmCDFIn = isInAtmCDFIn;
    }

    public long getIsIntlIntchgFee() {
        return isIntlIntchgFee;
    }

    public void setIsIntlIntchgFee(long isIntlIntchgFee) {
        this.isIntlIntchgFee = isIntlIntchgFee;
    }

    public Character getIsIntlIntchgInd() {
        return isIntlIntchgInd;
    }

    public void setIsIntlIntchgInd(Character isIntlIntchgInd) {
        this.isIntlIntchgInd = isIntlIntchgInd;
    }

    public short getIsNoReqCpy() {
        return isNoReqCpy;
    }

    public void setIsNoReqCpy(short isNoReqCpy) {
        this.isNoReqCpy = isNoReqCpy;
    }

    public short getIsNoHardCpyReq() {
        return isNoHardCpyReq;
    }

    public void setIsNoHardCpyReq(short isNoHardCpyReq) {
        this.isNoHardCpyReq = isNoHardCpyReq;
    }

    public short getIsNoAcquRtrCpy() {
        return isNoAcquRtrCpy;
    }

    public void setIsNoAcquRtrCpy(short isNoAcquRtrCpy) {
        this.isNoAcquRtrCpy = isNoAcquRtrCpy;
    }

    public short getIsNoAcquRtrSub() {
        return isNoAcquRtrSub;
    }

    public void setIsNoAcquRtrSub(short isNoAcquRtrSub) {
        this.isNoAcquRtrSub = isNoAcquRtrSub;
    }

    public short getIsNoFulfilCpy() {
        return isNoFulfilCpy;
    }

    public void setIsNoFulfilCpy(short isNoFulfilCpy) {
        this.isNoFulfilCpy = isNoFulfilCpy;
    }

    public int getIsAmtRetrFfCpy() {
        return isAmtRetrFfCpy;
    }

    public void setIsAmtRetrFfCpy(int isAmtRetrFfCpy) {
        this.isAmtRetrFfCpy = isAmtRetrFfCpy;
    }

    public Character getIsRetrFfCpyInd() {
        return isRetrFfCpyInd;
    }

    public void setIsRetrFfCpyInd(Character isRetrFfCpyInd) {
        this.isRetrFfCpyInd = isRetrFfCpyInd;
    }

    public short getIsNoRrFfHcSub() {
        return isNoRrFfHcSub;
    }

    public void setIsNoRrFfHcSub(short isNoRrFfHcSub) {
        this.isNoRrFfHcSub = isNoRrFfHcSub;
    }

    public BigDecimal getIsAmtCpySubFee() {
        return isAmtCpySubFee;
    }

    public void setIsAmtCpySubFee(BigDecimal isAmtCpySubFee) {
        this.isAmtCpySubFee = isAmtCpySubFee;
    }

    public Character getIsCpySubFeeInd() {
        return isCpySubFeeInd;
    }

    public void setIsCpySubFeeInd(Character isCpySubFeeInd) {
        this.isCpySubFeeInd = isCpySubFeeInd;
    }

    public short getIsNo1stCback() {
        return isNo1stCback;
    }

    public void setIsNo1stCback(short isNo1stCback) {
        this.isNo1stCback = isNo1stCback;
    }

    public BigDecimal getIsAmt1stCback() {
        return isAmt1stCback;
    }

    public void setIsAmt1stCback(BigDecimal isAmt1stCback) {
        this.isAmt1stCback = isAmt1stCback;
    }

    public Character getIs1stCbackInd() {
        return is1stCbackInd;
    }

    public void setIs1stCbackInd(Character is1stCbackInd) {
        this.is1stCbackInd = is1stCbackInd;
    }

    public BigDecimal getIsAmt1stCbackF() {
        return isAmt1stCbackF;
    }

    public void setIsAmt1stCbackF(BigDecimal isAmt1stCbackF) {
        this.isAmt1stCbackF = isAmt1stCbackF;
    }

    public Character getIs1stCbackFInd() {
        return is1stCbackFInd;
    }

    public void setIs1stCbackFInd(Character is1stCbackFInd) {
        this.is1stCbackFInd = is1stCbackFInd;
    }

    public short getIsNo2ndPresent() {
        return isNo2ndPresent;
    }

    public void setIsNo2ndPresent(short isNo2ndPresent) {
        this.isNo2ndPresent = isNo2ndPresent;
    }

    public BigDecimal getIsAmt2ndPresent() {
        return isAmt2ndPresent;
    }

    public void setIsAmt2ndPresent(BigDecimal isAmt2ndPresent) {
        this.isAmt2ndPresent = isAmt2ndPresent;
    }

    public Character getIs2ndPresentInd() {
        return is2ndPresentInd;
    }

    public void setIs2ndPresentInd(Character is2ndPresentInd) {
        this.is2ndPresentInd = is2ndPresentInd;
    }

    public BigDecimal getIsAmt2ndPrFees() {
        return isAmt2ndPrFees;
    }

    public void setIsAmt2ndPrFees(BigDecimal isAmt2ndPrFees) {
        this.isAmt2ndPrFees = isAmt2ndPrFees;
    }

    public Character getIs2ndPrFeesInd() {
        return is2ndPrFeesInd;
    }

    public void setIs2ndPrFeesInd(Character is2ndPrFeesInd) {
        this.is2ndPrFeesInd = is2ndPrFeesInd;
    }

    public short getIsNoArbitCback() {
        return isNoArbitCback;
    }

    public void setIsNoArbitCback(short isNoArbitCback) {
        this.isNoArbitCback = isNoArbitCback;
    }

    public BigDecimal getIsAmtArbitCback() {
        return isAmtArbitCback;
    }

    public void setIsAmtArbitCback(BigDecimal isAmtArbitCback) {
        this.isAmtArbitCback = isAmtArbitCback;
    }

    public Character getIsArbCbackInd() {
        return isArbCbackInd;
    }

    public void setIsArbCbackInd(Character isArbCbackInd) {
        this.isArbCbackInd = isArbCbackInd;
    }

    public BigDecimal getIsAmtArbCbFee() {
        return isAmtArbCbFee;
    }

    public void setIsAmtArbCbFee(BigDecimal isAmtArbCbFee) {
        this.isAmtArbCbFee = isAmtArbCbFee;
    }

    public Character getIsArbCbFeeInd() {
        return isArbCbFeeInd;
    }

    public void setIsArbCbFeeInd(Character isArbCbFeeInd) {
        this.isArbCbFeeInd = isArbCbFeeInd;
    }

    public BigDecimal getIsAmtIntCbFee() {
        return isAmtIntCbFee;
    }

    public void setIsAmtIntCbFee(BigDecimal isAmtIntCbFee) {
        this.isAmtIntCbFee = isAmtIntCbFee;
    }

    public Character getIsIntCbFeeInd() {
        return isIntCbFeeInd;
    }

    public void setIsIntCbFeeInd(Character isIntCbFeeInd) {
        this.isIntCbFeeInd = isIntCbFeeInd;
    }

    public BigDecimal getIsAmtInPresFee() {
        return isAmtInPresFee;
    }

    public void setIsAmtInPresFee(BigDecimal isAmtInPresFee) {
        this.isAmtInPresFee = isAmtInPresFee;
    }

    public Character getIsInPresFeeInd() {
        return isInPresFeeInd;
    }

    public void setIsInPresFeeInd(Character isInPresFeeInd) {
        this.isInPresFeeInd = isInPresFeeInd;
    }

    public short getIsNoMiscXact() {
        return isNoMiscXact;
    }

    public void setIsNoMiscXact(short isNoMiscXact) {
        this.isNoMiscXact = isNoMiscXact;
    }

    public BigDecimal getIsAmtMiscXact() {
        return isAmtMiscXact;
    }

    public void setIsAmtMiscXact(BigDecimal isAmtMiscXact) {
        this.isAmtMiscXact = isAmtMiscXact;
    }

    public Character getIsMiscXactInd() {
        return isMiscXactInd;
    }

    public void setIsMiscXactInd(Character isMiscXactInd) {
        this.isMiscXactInd = isMiscXactInd;
    }

    public BigDecimal getIsNetStlmtAmt() {
        return isNetStlmtAmt;
    }

    public void setIsNetStlmtAmt(BigDecimal isNetStlmtAmt) {
        this.isNetStlmtAmt = isNetStlmtAmt;
    }

    public Character getIsStlmtAmtInd() {
        return isStlmtAmtInd;
    }

    public void setIsStlmtAmtInd(Character isStlmtAmtInd) {
        this.isStlmtAmtInd = isStlmtAmtInd;
    }

    public BigDecimal getIsNetAmMonXact() {
        return isNetAmMonXact;
    }

    public void setIsNetAmMonXact(BigDecimal isNetAmMonXact) {
        this.isNetAmMonXact = isNetAmMonXact;
    }

    public Character getIsNetMonXacInd() {
        return isNetMonXacInd;
    }

    public void setIsNetMonXacInd(Character isNetMonXacInd) {
        this.isNetMonXacInd = isNetMonXacInd;
    }

    public int getIsNoMonRcds() {
        return isNoMonRcds;
    }

    public void setIsNoMonRcds(int isNoMonRcds) {
        this.isNoMonRcds = isNoMonRcds;
    }

    public String getIsXmissRejCd() {
        return isXmissRejCd;
    }

    public void setIsXmissRejCd(String isXmissRejCd) {
        this.isXmissRejCd = isXmissRejCd;
    }

    public int getNoteid() {
        return noteid;
    }

    public void setNoteid(int noteid) {
        this.noteid = noteid;
    }

    public String getClusterKey() {
        return clusterKey;
    }

    public void setClusterKey(String clusterKey) {
        this.clusterKey = clusterKey;
    }

    public Date getIsProcessedTs() {
        return isProcessedTs;
    }

    public void setIsProcessedTs(Date isProcessedTs) {
        this.isProcessedTs = isProcessedTs;
    }

    public Character getIsProcessedFlg() {
        return isProcessedFlg;
    }

    public void setIsProcessedFlg(Character isProcessedFlg) {
        this.isProcessedFlg = isProcessedFlg;
    }

    public String getIsFileName() {
        return isFileName;
    }

    public void setIsFileName(String isFileName) {
        this.isFileName = isFileName;
    }

    public short getIsXmitJulianYr() {
        return isXmitJulianYr;
    }

    public void setIsXmitJulianYr(short isXmitJulianYr) {
        this.isXmitJulianYr = isXmitJulianYr;
    }

    public Character getMcFilteredFlg() {
        return mcFilteredFlg;
    }

    public void setMcFilteredFlg(Character mcFilteredFlg) {
        this.mcFilteredFlg = mcFilteredFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stlmtId != null ? stlmtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McIssStlmt)) {
            return false;
        }
        McIssStlmt other = (McIssStlmt) object;
        if ((this.stlmtId == null && other.stlmtId != null) || (this.stlmtId != null && !this.stlmtId.equals(other.stlmtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McIssStlmt[ stlmtId=" + stlmtId + " ]";
    }

}
