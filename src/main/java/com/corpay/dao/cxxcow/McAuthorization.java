package com.corpay.dao.cxxcow;

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
@Table(name = "MC_AUTHORIZATION", catalog = "", schema = "CXXCOW")
public class McAuthorization implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAuthorizationPK mcAuthorizationPK;
    @Basic(optional = false)
    @Column(name = "AUTH_LOCAL_DT")
    @Temporal(TemporalType.DATE)
    private Date authLocalDt;
    @Basic(optional = false)
    @Column(name = "STLMT_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stlmtId;
    @Basic(optional = false)
    @Column(name = "BTCH_ID")
    private short btchId;
    @Basic(optional = false)
    @Column(name = "MRCH_ID")
    private short mrchId;
    @Basic(optional = false)
    @Column(name = "DTL_STLMT_ID")
    private short dtlStlmtId;
    @Basic(optional = false)
    @Column(name = "AUTH_UT_TM")
    @Temporal(TemporalType.TIME)
    private Date authUtTm;
    @Basic(optional = false)
    @Column(name = "AUTH_LOCAL_TM")
    @Temporal(TemporalType.TIME)
    private Date authLocalTm;
    @Basic(optional = false)
    @Column(name = "AUTH_ACCT_NO")
    private String authAcctNo;
    @Basic(optional = false)
    @Column(name = "AUTH_CUST_ID")
    private String authCustId;

    @Basic(optional = false)
    @Column(name = "AUTH_TRAN_AMT")
    private BigDecimal authTranAmt;
    @Basic(optional = false)
    @Column(name = "AUTH_TRAN_AMT_ACT")
    private BigDecimal authTranAmtAct;
    @Basic(optional = false)
    @Column(name = "AUTH_EXP_DT")
    private String authExpDt;
    @Basic(optional = false)
    @Column(name = "AUTH_MCC")
    private String authMcc;
    @Basic(optional = false)
    @Column(name = "AUTH_MCC_ORIG")
    private String authMccOrig;
    @Basic(optional = false)
    @Column(name = "AUTH_PROC_CD")
    private int authProcCd;
    @Basic(optional = false)
    @Column(name = "AUTH_POS_ENT_MODE")
    private short authPosEntMode;
    @Basic(optional = false)
    @Column(name = "AUTH_ACQ_INST_ID")
    private String authAcqInstId;
    @Basic(optional = false)
    @Column(name = "AUTH_TERM_ID")
    private String authTermId;
    @Basic(optional = false)
    @Column(name = "AUTH_ACCEPT_ID")
    private String authAcceptId;
    @Basic(optional = false)
    @Column(name = "AUTH_ACCEPT_LOC")
    private String authAcceptLoc;
    @Basic(optional = false)
    @Column(name = "AUTH_TRAN_CNTRY_CD")
    private short authTranCntryCd;
    @Basic(optional = false)
    @Column(name = "AUTH_RESPONSE_CD")
    private short authResponseCd;
    @Basic(optional = false)
    @Column(name = "AUTH_CBACK_STAT")
    private Character authCbackStat;
    @Basic(optional = false)
    @Column(name = "AUTH_RETR_STAT")
    private Character authRetrStat;
    @Basic(optional = false)
    @Column(name = "AUTH_POSTED_DT")
    @Temporal(TemporalType.DATE)
    private Date authPostedDt;
    @Basic(optional = false)
    @Column(name = "AUTH_METH")
    private Character authMeth;
    @Basic(optional = false)
    @Column(name = "AUTH_WARN_FLG")
    private Character authWarnFlg;
    @Basic(optional = false)
    @Column(name = "AUTH_STAN")
    private String authStan;
    @Basic(optional = false)
    @Column(name = "AUTH_REVERSAL_FLG")
    private Character authReversalFlg;
    @Basic(optional = false)
    @Column(name = "AUTH_REVERSAL_RSN")
    private Character authReversalRsn;
    @Basic(optional = false)
    @Column(name = "AUTH_STAND_IN_FLG")
    private Character authStandInFlg;
    @Basic(optional = false)
    @Column(name = "CLUSTER_KEY")
    private String clusterKey;
    @Basic(optional = false)
    @Column(name = "AUTH_MSG_NO")
    private int authMsgNo;
    @Basic(optional = false)
    @Column(name = "AUTH_POST_CNTL_NO")
    private int authPostCntlNo;
    @Basic(optional = false)
    @Column(name = "AUTH_POST_MSG_NO")
    private int authPostMsgNo;
    @Basic(optional = false)
    @Column(name = "AUTH_PROMPTED_ID")
    private String authPromptedId;
    @Basic(optional = false)
    @Column(name = "AUTH_POSTED_TM")
    @Temporal(TemporalType.TIME)
    private Date authPostedTm;
    @Basic(optional = false)
    @Column(name = "AUTH_POSTED_AMT")
    private BigDecimal authPostedAmt;
    @Basic(optional = false)
    @Column(name = "AUTH_SYSTEM_FLG")
    private Character authSystemFlg;
    @Basic(optional = false)
    @Column(name = "AUTH_REJECT_DESC")
    private String authRejectDesc;
    @Basic(optional = false)
    @Column(name = "AUTH_INSERT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authInsertTs;
    @Basic(optional = false)
    @Column(name = "AUTH_POS_DATA")
    private String authPosData;
    @Basic(optional = false)
    @Column(name = "P105S1_FILE_TY")
    private short p105s1FileTy;
    @Basic(optional = false)
    @Column(name = "P105S2_FILE_R_DT")
    private int p105s2FileRDt;
    @Basic(optional = false)
    @Column(name = "P105S3_PROC_ID")
    private long p105s3ProcId;
    @Basic(optional = false)
    @Column(name = "P105S4_FILE_SEQ_NO")
    private int p105s4FileSeqNo;
    @Basic(optional = false)
    @Column(name = "D71_MSG_NO")
    private int d71MsgNo;
    @Basic(optional = false)
    @Column(name = "D63S2_TRACE_ID")
    private String d63s2TraceId;
    @Basic(optional = false)
    @Column(name = "AUTH_UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authUpdateTs;
    @Basic(optional = false)
    @Column(name = "AUTH_UCAF_IND")
    private Character authUcafInd;
    @Basic(optional = false)
    @Column(name = "AUTH_AVS_RESP")
    private Character authAvsResp;
    @Basic(optional = false)
    @Column(name = "AUTH_MRCH_ADV_CD")
    private String authMrchAdvCd;
    @Basic(optional = false)
    @Column(name = "AUTH_UCAF_DATA")
    private String authUcafData;
    @Basic(optional = false)
    @Column(name = "AUTH_AVS_DATA")
    private String authAvsData;
    @Basic(optional = false)
    @Column(name = "AUTH_IRIS_FLG")
    private String authIrisFlg;
    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;
    @Basic(optional = false)
    @Column(name = "D48S87_CVC_IND")
    private Character d48s87CvcInd;
    @Basic(optional = false)
    @Column(name = "E_CMRC_CD")
    private String eCmrcCd;
    @Basic(optional = false)
    @Column(name = "AUTH_TRAN_AMT_ACT_ORIG")
    private BigDecimal authTranAmtActOrig;
    @Basic(optional = false)
    @Column(name = "AUTH_CMPLT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authCmpltTs;
    @Basic(optional = false)
    @Column(name = "AUTH_ADV_DT")
    @Temporal(TemporalType.DATE)
    private Date authAdvDt;
    @Basic(optional = false)
    @Column(name = "AUTH_ADV_TM")
    @Temporal(TemporalType.TIME)
    private Date authAdvTm;
    @Basic(optional = false)
    @Column(name = "AUTH_TRAN_DT")
    @Temporal(TemporalType.DATE)
    private Date authTranDt;
    @Basic(optional = false)
    @Column(name = "AUTH_TRAN_TM")
    @Temporal(TemporalType.TIME)
    private Date authTranTm;
    @Basic(optional = false)
    @Column(name = "TRNS_TRKG_NBR")
    private int trnsTrkgNbr;
    @Basic(optional = false)
    @Column(name = "D63S2_TRACE_ID_CMPLT")
    private String d63s2TraceIdCmplt;
    @Basic(optional = false)
    @Column(name = "AUTH_ASI_FLG")
    private Character authAsiFlg;
    @Basic(optional = false)
    @Column(name = "AUTH_RECUR_PMT_FLG")
    private Character authRecurPmtFlg;
    @Basic(optional = false)
    @Column(name = "XPND_CTL_NBR")
    private int xpndCtlNbr;
    @Basic(optional = false)
    @Column(name = "AUTH_TRAN_FEE_AMT")
    private BigDecimal authTranFeeAmt;
    @Basic(optional = false)
    @Column(name = "AUTH_ID_MTCH_NBR")
    private String authIdMtchNbr;
    @Basic(optional = false)
    @Column(name = "AUTH_D48S63_TRACE_ID")
    private String authD48s63TraceId;
    @Basic(optional = false)
    @Column(name = "D48S61_EXTND_COND_CD")
    private int d48s61ExtndCondCd;
    @Basic(optional = false)
    @Column(name = "D48S71_ON_BEHALF_CD")
    private String d48s71OnBehalfCd;
    @Basic(optional = false)
    @Column(name = "D48S33_PAN_MAPPING_CD")
    private String d48s33PanMappingCd;
    @Basic(optional = false)
    @Column(name = "D48S26_WALLET_ID")
    private String d48s26WalletId;
    @Basic(optional = false)
    @Column(name = "D48S77_PMT_XTN_TYP_CD")
    private String d48s77PmtXtnTypCd;
    @Basic(optional = false)
    @Column(name = "D48S72_ISS_CHIP_AUTH")
    private String d48s72IssChipAuth;
    @Basic(optional = false)
    @Column(name = "D48S79_CVR_TVR_BIT_ERR")
    private String d48s79CvrTvrBitErr;
    @Basic(optional = false)
    @Column(name = "AUTH_MULTI_POST_FLG")
    private Character authMultiPostFlg;
    @Basic(optional = false)
    @Column(name = "AUTH_2ND_XTN_CHK")
    private Character auth2ndXtnChk;
    @Basic(optional = false)
    @Column(name = "XBORDER_FEE_AMT")
    private BigDecimal xborderFeeAmt;
    @Basic(optional = false)
    @Column(name = "D48S42_ELEC_COMM_IND")
    private String d48s42ElecCommInd;
    @Basic(optional = false)
    @Column(name = "D48S43_UCAF")
    private String d48s43Ucaf;
    @Basic(optional = false)
    @Column(name = "D48S83_AVS_RESP")
    private Character d48s83AvsResp;
    @Basic(optional = false)
    @Column(name = "SERV_CD")
    private String servCd;
    @Basic(optional = false)
    @Column(name = "UNQ_ID")
    private String unqId;
    @Basic(optional = false)
    @Column(name = "D4_TRAN_AMT")
    private BigDecimal d4TranAmt;
    @Basic(optional = false)
    @Column(name = "IN_AUTH_PROC")
    private Character inAuthProc;
    @Basic(optional = false)
    @Column(name = "IN_AUTH_APPR_STAT")
    private Character inAuthApprStat;
    @Basic(optional = false)
    @Column(name = "THRD_PRTY_APPR_CD")
    private int thrdPrtyApprCd;
    @Basic(optional = false)
    @Column(name = "THRD_PRTY_RSN_CD")
    private int thrdPrtyRsnCd;
    @Basic(optional = false)
    @Column(name = "D48S75_FRD_SCR")
    private short d48s75FrdScr;
    @Basic(optional = false)
    @Column(name = "D48S75_FRD_SCR_RSN_CD")
    private String d48s75FrdScrRsnCd;
    @Basic(optional = false)
    @Column(name = "D48S75_RLS_SCR")
    private short d48s75RlsScr;
    @Basic(optional = false)
    @Column(name = "D48S75_RLS_RSN_CD_1")
    private String d48s75RlsRsnCd1;
    @Basic(optional = false)
    @Column(name = "D48S75_RLS_RSN_CD_2")
    private String d48s75RlsRsnCd2;
    @Basic(optional = false)
    @Column(name = "FN_MRCH_DT")
    @Temporal(TemporalType.DATE)
    private Date fnMrchDt;
    @Basic(optional = false)
    @Column(name = "FN_MRCH_TM")
    @Temporal(TemporalType.TIME)
    private Date fnMrchTm;
    @Basic(optional = false)
    @Column(name = "LOC_ID")
    private String locId;
    @Basic(optional = false)
    @Column(name = "TRX_NO")
    private String trxNo;
    @Basic(optional = false)
    @Column(name = "TRX_DT")
    @Temporal(TemporalType.DATE)
    private Date trxDt;
    @Basic(optional = false)
    @Column(name = "MRCH_STLMT_DT")
    @Temporal(TemporalType.DATE)
    private Date mrchStlmtDt;
    @Basic(optional = false)
    @Column(name = "ODM_RDNG_NBR")
    private BigDecimal odmRdngNbr;
    @Basic(optional = false)
    @Column(name = "AUTH_D48S38_ACCT_CAT")
    private Character authD48s38AcctCat;
    @Basic(optional = false)
    @Column(name = "AUTH_ALM_APPROV_CD")
    private String authAlmApprovCd;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF1_ACPT_ST_ADDR")
    private String de122S01Sf1AcptStAddr;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF2_ACPT_ST_CD")
    private String de122S01Sf2AcptStCd;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF4_ACPT_SERV_PHN")
    private String de122S01Sf4AcptServPhn;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF5_ACPT_PHN")
    private String de122S01Sf5AcptPhn;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF6_ACPT_CNTCT")
    private String de122S01Sf6AcptCntct;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF7_ACPT_TAX_ID")
    private String de122S01Sf7AcptTaxId;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF8_ACPT_PRTNR_ID")
    private String de122S01Sf8AcptPrtnrId;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF9_SLOC_CTY")
    private String de122S01Sf9SlocCty;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF10_SLOC_ST_CD")
    private String de122S01Sf10SlocStCd;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF11_SLOC_CNTRY_CD")
    private String de122S01Sf11SlocCntryCd;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF12_SLOC_ZIP")
    private String de122S01Sf12SlocZip;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;
    @Basic(optional = false)
    @Column(name = "MULTI_TRNS_ID")
    private String multiTrnsId;
    @Basic(optional = false)
    @Column(name = "MISC1_NBR")
    private String misc1Nbr;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF13_ACPT_GEO")
    private String de122S01Sf13AcptGeo;
    @Basic(optional = false)
    @Column(name = "DE122_S01_SF14_SLOC_GEO")
    private String de122S01Sf14SlocGeo;
    @Basic(optional = false)
    @Column(name = "ACPT_LAT_NBR")
    private BigDecimal acptLatNbr;
    @Basic(optional = false)
    @Column(name = "ACPT_LONG_NBR")
    private BigDecimal acptLongNbr;
    @Basic(optional = false)
    @Column(name = "SLOC_LAT_NBR")
    private BigDecimal slocLatNbr;
    @Basic(optional = false)
    @Column(name = "SLOC_LONG_NBR")
    private BigDecimal slocLongNbr;
    @Basic(optional = false)
    @Column(name = "DF32_SPND_CNTL_OVR")
    private Character df32SpndCntlOvr;
    @Basic(optional = false)
    @Column(name = "DF32_CODES")
    private String df32Codes;
    @Basic(optional = false)
    @Column(name = "DF32_LVL_TYP_CD")
    private Character df32LvlTypCd;
    @Basic(optional = false)
    @Column(name = "LMT_NETW_USED_FLG")
    private Character lmtNetwUsedFlg;

    public McAuthorization() {
    }

    public McAuthorization(McAuthorizationPK mcAuthorizationPK) {
        this.mcAuthorizationPK = mcAuthorizationPK;
    }

    public McAuthorization(McAuthorizationPK mcAuthorizationPK, Date authLocalDt, Date stlmtId, short btchId, short mrchId, short dtlStlmtId, Date authUtTm, Date authLocalTm, String authAcctNo, String authCustId, BigDecimal authTranAmt, BigDecimal authTranAmtAct, String authExpDt, String authMcc, String authMccOrig, int authProcCd, short authPosEntMode, String authAcqInstId, String authTermId, String authAcceptId, String authAcceptLoc, short authTranCntryCd, short authResponseCd, Character authCbackStat, Character authRetrStat, Date authPostedDt, Character authMeth, Character authWarnFlg, String authStan, Character authReversalFlg, Character authReversalRsn, Character authStandInFlg, String clusterKey, int authMsgNo, int authPostCntlNo, int authPostMsgNo, String authPromptedId, Date authPostedTm, BigDecimal authPostedAmt, Character authSystemFlg, String authRejectDesc, Date authInsertTs, String authPosData, short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, String d63s2TraceId, Date authUpdateTs, Character authUcafInd, Character authAvsResp, String authMrchAdvCd, String authUcafData, String authAvsData, String authIrisFlg, String hierId, String nodeId, Character d48s87CvcInd, String eCmrcCd, BigDecimal authTranAmtActOrig, Date authCmpltTs, Date authAdvDt, Date authAdvTm, Date authTranDt, Date authTranTm, int trnsTrkgNbr, String d63s2TraceIdCmplt, Character authAsiFlg, Character authRecurPmtFlg, int xpndCtlNbr, BigDecimal authTranFeeAmt, String authIdMtchNbr, String authD48s63TraceId, int d48s61ExtndCondCd, String d48s71OnBehalfCd, String d48s33PanMappingCd, String d48s26WalletId, String d48s77PmtXtnTypCd, String d48s72IssChipAuth, String d48s79CvrTvrBitErr, Character authMultiPostFlg, Character auth2ndXtnChk, BigDecimal xborderFeeAmt, String d48s42ElecCommInd, String d48s43Ucaf, Character d48s83AvsResp, String servCd, String unqId, BigDecimal d4TranAmt, Character inAuthProc, Character inAuthApprStat, int thrdPrtyApprCd, int thrdPrtyRsnCd, short d48s75FrdScr, String d48s75FrdScrRsnCd, short d48s75RlsScr, String d48s75RlsRsnCd1, String d48s75RlsRsnCd2, Date fnMrchDt, Date fnMrchTm, String locId, String trxNo, Date trxDt, Date mrchStlmtDt, BigDecimal odmRdngNbr, Character authD48s38AcctCat, String authAlmApprovCd, String de122S01Sf1AcptStAddr, String de122S01Sf2AcptStCd, String de122S01Sf4AcptServPhn, String de122S01Sf5AcptPhn, String de122S01Sf6AcptCntct, String de122S01Sf7AcptTaxId, String de122S01Sf8AcptPrtnrId, String de122S01Sf9SlocCty, String de122S01Sf10SlocStCd, String de122S01Sf11SlocCntryCd, String de122S01Sf12SlocZip, Date rowChgTs, String multiTrnsId, String misc1Nbr, String unitNbr, String de122S01Sf13AcptGeo, String de122S01Sf14SlocGeo, BigDecimal acptLatNbr, BigDecimal acptLongNbr, BigDecimal slocLatNbr, BigDecimal slocLongNbr, Character df32SpndCntlOvr, String df32Codes, Character df32LvlTypCd, Character lmtNetwUsedFlg) {
        this.mcAuthorizationPK = mcAuthorizationPK;
        this.authLocalDt = authLocalDt;
        this.stlmtId = stlmtId;
        this.btchId = btchId;
        this.mrchId = mrchId;
        this.dtlStlmtId = dtlStlmtId;
        this.authUtTm = authUtTm;
        this.authLocalTm = authLocalTm;
        this.authAcctNo = authAcctNo;
        this.authCustId = authCustId;
        this.authTranAmt = authTranAmt;
        this.authTranAmtAct = authTranAmtAct;
        this.authExpDt = authExpDt;
        this.authMcc = authMcc;
        this.authMccOrig = authMccOrig;
        this.authProcCd = authProcCd;
        this.authPosEntMode = authPosEntMode;
        this.authAcqInstId = authAcqInstId;
        this.authTermId = authTermId;
        this.authAcceptId = authAcceptId;
        this.authAcceptLoc = authAcceptLoc;
        this.authTranCntryCd = authTranCntryCd;
        this.authResponseCd = authResponseCd;
        this.authCbackStat = authCbackStat;
        this.authRetrStat = authRetrStat;
        this.authPostedDt = authPostedDt;
        this.authMeth = authMeth;
        this.authWarnFlg = authWarnFlg;
        this.authStan = authStan;
        this.authReversalFlg = authReversalFlg;
        this.authReversalRsn = authReversalRsn;
        this.authStandInFlg = authStandInFlg;
        this.clusterKey = clusterKey;
        this.authMsgNo = authMsgNo;
        this.authPostCntlNo = authPostCntlNo;
        this.authPostMsgNo = authPostMsgNo;
        this.authPromptedId = authPromptedId;
        this.authPostedTm = authPostedTm;
        this.authPostedAmt = authPostedAmt;
        this.authSystemFlg = authSystemFlg;
        this.authRejectDesc = authRejectDesc;
        this.authInsertTs = authInsertTs;
        this.authPosData = authPosData;
        this.p105s1FileTy = p105s1FileTy;
        this.p105s2FileRDt = p105s2FileRDt;
        this.p105s3ProcId = p105s3ProcId;
        this.p105s4FileSeqNo = p105s4FileSeqNo;
        this.d71MsgNo = d71MsgNo;
        this.d63s2TraceId = d63s2TraceId;
        this.authUpdateTs = authUpdateTs;
        this.authUcafInd = authUcafInd;
        this.authAvsResp = authAvsResp;
        this.authMrchAdvCd = authMrchAdvCd;
        this.authUcafData = authUcafData;
        this.authAvsData = authAvsData;
        this.authIrisFlg = authIrisFlg;
        this.hierId = hierId;
        this.nodeId = nodeId;
        this.d48s87CvcInd = d48s87CvcInd;
        this.eCmrcCd = eCmrcCd;
        this.authTranAmtActOrig = authTranAmtActOrig;
        this.authCmpltTs = authCmpltTs;
        this.authAdvDt = authAdvDt;
        this.authAdvTm = authAdvTm;
        this.authTranDt = authTranDt;
        this.authTranTm = authTranTm;
        this.trnsTrkgNbr = trnsTrkgNbr;
        this.d63s2TraceIdCmplt = d63s2TraceIdCmplt;
        this.authAsiFlg = authAsiFlg;
        this.authRecurPmtFlg = authRecurPmtFlg;
        this.xpndCtlNbr = xpndCtlNbr;
        this.authTranFeeAmt = authTranFeeAmt;
        this.authIdMtchNbr = authIdMtchNbr;
        this.authD48s63TraceId = authD48s63TraceId;
        this.d48s61ExtndCondCd = d48s61ExtndCondCd;
        this.d48s71OnBehalfCd = d48s71OnBehalfCd;
        this.d48s33PanMappingCd = d48s33PanMappingCd;
        this.d48s26WalletId = d48s26WalletId;
        this.d48s77PmtXtnTypCd = d48s77PmtXtnTypCd;
        this.d48s72IssChipAuth = d48s72IssChipAuth;
        this.d48s79CvrTvrBitErr = d48s79CvrTvrBitErr;
        this.authMultiPostFlg = authMultiPostFlg;
        this.auth2ndXtnChk = auth2ndXtnChk;
        this.xborderFeeAmt = xborderFeeAmt;
        this.d48s42ElecCommInd = d48s42ElecCommInd;
        this.d48s43Ucaf = d48s43Ucaf;
        this.d48s83AvsResp = d48s83AvsResp;
        this.servCd = servCd;
        this.unqId = unqId;
        this.d4TranAmt = d4TranAmt;
        this.inAuthProc = inAuthProc;
        this.inAuthApprStat = inAuthApprStat;
        this.thrdPrtyApprCd = thrdPrtyApprCd;
        this.thrdPrtyRsnCd = thrdPrtyRsnCd;
        this.d48s75FrdScr = d48s75FrdScr;
        this.d48s75FrdScrRsnCd = d48s75FrdScrRsnCd;
        this.d48s75RlsScr = d48s75RlsScr;
        this.d48s75RlsRsnCd1 = d48s75RlsRsnCd1;
        this.d48s75RlsRsnCd2 = d48s75RlsRsnCd2;
        this.fnMrchDt = fnMrchDt;
        this.fnMrchTm = fnMrchTm;
        this.locId = locId;
        this.trxNo = trxNo;
        this.trxDt = trxDt;
        this.mrchStlmtDt = mrchStlmtDt;
        this.odmRdngNbr = odmRdngNbr;
        this.authD48s38AcctCat = authD48s38AcctCat;
        this.authAlmApprovCd = authAlmApprovCd;
        this.de122S01Sf1AcptStAddr = de122S01Sf1AcptStAddr;
        this.de122S01Sf2AcptStCd = de122S01Sf2AcptStCd;
        this.de122S01Sf4AcptServPhn = de122S01Sf4AcptServPhn;
        this.de122S01Sf5AcptPhn = de122S01Sf5AcptPhn;
        this.de122S01Sf6AcptCntct = de122S01Sf6AcptCntct;
        this.de122S01Sf7AcptTaxId = de122S01Sf7AcptTaxId;
        this.de122S01Sf8AcptPrtnrId = de122S01Sf8AcptPrtnrId;
        this.de122S01Sf9SlocCty = de122S01Sf9SlocCty;
        this.de122S01Sf10SlocStCd = de122S01Sf10SlocStCd;
        this.de122S01Sf11SlocCntryCd = de122S01Sf11SlocCntryCd;
        this.de122S01Sf12SlocZip = de122S01Sf12SlocZip;
        this.rowChgTs = rowChgTs;
        this.multiTrnsId = multiTrnsId;
        this.misc1Nbr = misc1Nbr;
        this.unitNbr = unitNbr;
        this.de122S01Sf13AcptGeo = de122S01Sf13AcptGeo;
        this.de122S01Sf14SlocGeo = de122S01Sf14SlocGeo;
        this.acptLatNbr = acptLatNbr;
        this.acptLongNbr = acptLongNbr;
        this.slocLatNbr = slocLatNbr;
        this.slocLongNbr = slocLongNbr;
        this.df32SpndCntlOvr = df32SpndCntlOvr;
        this.df32Codes = df32Codes;
        this.df32LvlTypCd = df32LvlTypCd;
        this.lmtNetwUsedFlg = lmtNetwUsedFlg;
    }

    public McAuthorization(String authPan, int authApprovCd, Date authUtDt, Date authLocalTs) {
        this.mcAuthorizationPK = new McAuthorizationPK(authPan, authApprovCd, authUtDt, authLocalTs);
    }

    public McAuthorizationPK getMcAuthorizationPK() {
        return mcAuthorizationPK;
    }

    public void setMcAuthorizationPK(McAuthorizationPK mcAuthorizationPK) {
        this.mcAuthorizationPK = mcAuthorizationPK;
    }

    public Date getAuthLocalDt() {
        return authLocalDt;
    }

    public void setAuthLocalDt(Date authLocalDt) {
        this.authLocalDt = authLocalDt;
    }

    public Date getStlmtId() {
        return stlmtId;
    }

    public void setStlmtId(Date stlmtId) {
        this.stlmtId = stlmtId;
    }

    public short getBtchId() {
        return btchId;
    }

    public void setBtchId(short btchId) {
        this.btchId = btchId;
    }

    public short getMrchId() {
        return mrchId;
    }

    public void setMrchId(short mrchId) {
        this.mrchId = mrchId;
    }

    public short getDtlStlmtId() {
        return dtlStlmtId;
    }

    public void setDtlStlmtId(short dtlStlmtId) {
        this.dtlStlmtId = dtlStlmtId;
    }

    public Date getAuthUtTm() {
        return authUtTm;
    }

    public void setAuthUtTm(Date authUtTm) {
        this.authUtTm = authUtTm;
    }

    public Date getAuthLocalTm() {
        return authLocalTm;
    }

    public void setAuthLocalTm(Date authLocalTm) {
        this.authLocalTm = authLocalTm;
    }

    public String getAuthAcctNo() {
        return authAcctNo;
    }

    public void setAuthAcctNo(String authAcctNo) {
        this.authAcctNo = authAcctNo;
    }

    public String getAuthCustId() {
        return authCustId;
    }

    public void setAuthCustId(String authCustId) {
        this.authCustId = authCustId;
    }

    public BigDecimal getAuthTranAmt() {
        return authTranAmt;
    }

    public void setAuthTranAmt(BigDecimal authTranAmt) {
        this.authTranAmt = authTranAmt;
    }

    public BigDecimal getAuthTranAmtAct() {
        return authTranAmtAct;
    }

    public void setAuthTranAmtAct(BigDecimal authTranAmtAct) {
        this.authTranAmtAct = authTranAmtAct;
    }

    public String getAuthExpDt() {
        return authExpDt;
    }

    public void setAuthExpDt(String authExpDt) {
        this.authExpDt = authExpDt;
    }

    public String getAuthMcc() {
        return authMcc;
    }

    public void setAuthMcc(String authMcc) {
        this.authMcc = authMcc;
    }

    public String getAuthMccOrig() {
        return authMccOrig;
    }

    public void setAuthMccOrig(String authMccOrig) {
        this.authMccOrig = authMccOrig;
    }

    public int getAuthProcCd() {
        return authProcCd;
    }

    public void setAuthProcCd(int authProcCd) {
        this.authProcCd = authProcCd;
    }

    public short getAuthPosEntMode() {
        return authPosEntMode;
    }

    public void setAuthPosEntMode(short authPosEntMode) {
        this.authPosEntMode = authPosEntMode;
    }

    public String getAuthAcqInstId() {
        return authAcqInstId;
    }

    public void setAuthAcqInstId(String authAcqInstId) {
        this.authAcqInstId = authAcqInstId;
    }

    public String getAuthTermId() {
        return authTermId;
    }

    public void setAuthTermId(String authTermId) {
        this.authTermId = authTermId;
    }

    public String getAuthAcceptId() {
        return authAcceptId;
    }

    public void setAuthAcceptId(String authAcceptId) {
        this.authAcceptId = authAcceptId;
    }

    public String getAuthAcceptLoc() {
        return authAcceptLoc;
    }

    public void setAuthAcceptLoc(String authAcceptLoc) {
        this.authAcceptLoc = authAcceptLoc;
    }

    public short getAuthTranCntryCd() {
        return authTranCntryCd;
    }

    public void setAuthTranCntryCd(short authTranCntryCd) {
        this.authTranCntryCd = authTranCntryCd;
    }

    public short getAuthResponseCd() {
        return authResponseCd;
    }

    public void setAuthResponseCd(short authResponseCd) {
        this.authResponseCd = authResponseCd;
    }

    public Character getAuthCbackStat() {
        return authCbackStat;
    }

    public void setAuthCbackStat(Character authCbackStat) {
        this.authCbackStat = authCbackStat;
    }

    public Character getAuthRetrStat() {
        return authRetrStat;
    }

    public void setAuthRetrStat(Character authRetrStat) {
        this.authRetrStat = authRetrStat;
    }

    public Date getAuthPostedDt() {
        return authPostedDt;
    }

    public void setAuthPostedDt(Date authPostedDt) {
        this.authPostedDt = authPostedDt;
    }

    public Character getAuthMeth() {
        return authMeth;
    }

    public void setAuthMeth(Character authMeth) {
        this.authMeth = authMeth;
    }

    public Character getAuthWarnFlg() {
        return authWarnFlg;
    }

    public void setAuthWarnFlg(Character authWarnFlg) {
        this.authWarnFlg = authWarnFlg;
    }

    public String getAuthStan() {
        return authStan;
    }

    public void setAuthStan(String authStan) {
        this.authStan = authStan;
    }

    public Character getAuthReversalFlg() {
        return authReversalFlg;
    }

    public void setAuthReversalFlg(Character authReversalFlg) {
        this.authReversalFlg = authReversalFlg;
    }

    public Character getAuthReversalRsn() {
        return authReversalRsn;
    }

    public void setAuthReversalRsn(Character authReversalRsn) {
        this.authReversalRsn = authReversalRsn;
    }

    public Character getAuthStandInFlg() {
        return authStandInFlg;
    }

    public void setAuthStandInFlg(Character authStandInFlg) {
        this.authStandInFlg = authStandInFlg;
    }

    public String getClusterKey() {
        return clusterKey;
    }

    public void setClusterKey(String clusterKey) {
        this.clusterKey = clusterKey;
    }

    public int getAuthMsgNo() {
        return authMsgNo;
    }

    public void setAuthMsgNo(int authMsgNo) {
        this.authMsgNo = authMsgNo;
    }

    public int getAuthPostCntlNo() {
        return authPostCntlNo;
    }

    public void setAuthPostCntlNo(int authPostCntlNo) {
        this.authPostCntlNo = authPostCntlNo;
    }

    public int getAuthPostMsgNo() {
        return authPostMsgNo;
    }

    public void setAuthPostMsgNo(int authPostMsgNo) {
        this.authPostMsgNo = authPostMsgNo;
    }

    public String getAuthPromptedId() {
        return authPromptedId;
    }

    public void setAuthPromptedId(String authPromptedId) {
        this.authPromptedId = authPromptedId;
    }

    public Date getAuthPostedTm() {
        return authPostedTm;
    }

    public void setAuthPostedTm(Date authPostedTm) {
        this.authPostedTm = authPostedTm;
    }

    public BigDecimal getAuthPostedAmt() {
        return authPostedAmt;
    }

    public void setAuthPostedAmt(BigDecimal authPostedAmt) {
        this.authPostedAmt = authPostedAmt;
    }

    public Character getAuthSystemFlg() {
        return authSystemFlg;
    }

    public void setAuthSystemFlg(Character authSystemFlg) {
        this.authSystemFlg = authSystemFlg;
    }

    public String getAuthRejectDesc() {
        return authRejectDesc;
    }

    public void setAuthRejectDesc(String authRejectDesc) {
        this.authRejectDesc = authRejectDesc;
    }

    public Date getAuthInsertTs() {
        return authInsertTs;
    }

    public void setAuthInsertTs(Date authInsertTs) {
        this.authInsertTs = authInsertTs;
    }

    public String getAuthPosData() {
        return authPosData;
    }

    public void setAuthPosData(String authPosData) {
        this.authPosData = authPosData;
    }

    public short getP105s1FileTy() {
        return p105s1FileTy;
    }

    public void setP105s1FileTy(short p105s1FileTy) {
        this.p105s1FileTy = p105s1FileTy;
    }

    public int getP105s2FileRDt() {
        return p105s2FileRDt;
    }

    public void setP105s2FileRDt(int p105s2FileRDt) {
        this.p105s2FileRDt = p105s2FileRDt;
    }

    public long getP105s3ProcId() {
        return p105s3ProcId;
    }

    public void setP105s3ProcId(long p105s3ProcId) {
        this.p105s3ProcId = p105s3ProcId;
    }

    public int getP105s4FileSeqNo() {
        return p105s4FileSeqNo;
    }

    public void setP105s4FileSeqNo(int p105s4FileSeqNo) {
        this.p105s4FileSeqNo = p105s4FileSeqNo;
    }

    public int getD71MsgNo() {
        return d71MsgNo;
    }

    public void setD71MsgNo(int d71MsgNo) {
        this.d71MsgNo = d71MsgNo;
    }

    public String getD63s2TraceId() {
        return d63s2TraceId;
    }

    public void setD63s2TraceId(String d63s2TraceId) {
        this.d63s2TraceId = d63s2TraceId;
    }

    public Date getAuthUpdateTs() {
        return authUpdateTs;
    }

    public void setAuthUpdateTs(Date authUpdateTs) {
        this.authUpdateTs = authUpdateTs;
    }

    public Character getAuthUcafInd() {
        return authUcafInd;
    }

    public void setAuthUcafInd(Character authUcafInd) {
        this.authUcafInd = authUcafInd;
    }

    public Character getAuthAvsResp() {
        return authAvsResp;
    }

    public void setAuthAvsResp(Character authAvsResp) {
        this.authAvsResp = authAvsResp;
    }

    public String getAuthMrchAdvCd() {
        return authMrchAdvCd;
    }

    public void setAuthMrchAdvCd(String authMrchAdvCd) {
        this.authMrchAdvCd = authMrchAdvCd;
    }

    public String getAuthUcafData() {
        return authUcafData;
    }

    public void setAuthUcafData(String authUcafData) {
        this.authUcafData = authUcafData;
    }

    public String getAuthAvsData() {
        return authAvsData;
    }

    public void setAuthAvsData(String authAvsData) {
        this.authAvsData = authAvsData;
    }

    public String getAuthIrisFlg() {
        return authIrisFlg;
    }

    public void setAuthIrisFlg(String authIrisFlg) {
        this.authIrisFlg = authIrisFlg;
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

    public Character getD48s87CvcInd() {
        return d48s87CvcInd;
    }

    public void setD48s87CvcInd(Character d48s87CvcInd) {
        this.d48s87CvcInd = d48s87CvcInd;
    }

    public String getECmrcCd() {
        return eCmrcCd;
    }

    public void setECmrcCd(String eCmrcCd) {
        this.eCmrcCd = eCmrcCd;
    }

    public BigDecimal getAuthTranAmtActOrig() {
        return authTranAmtActOrig;
    }

    public void setAuthTranAmtActOrig(BigDecimal authTranAmtActOrig) {
        this.authTranAmtActOrig = authTranAmtActOrig;
    }

    public Date getAuthCmpltTs() {
        return authCmpltTs;
    }

    public void setAuthCmpltTs(Date authCmpltTs) {
        this.authCmpltTs = authCmpltTs;
    }

    public Date getAuthAdvDt() {
        return authAdvDt;
    }

    public void setAuthAdvDt(Date authAdvDt) {
        this.authAdvDt = authAdvDt;
    }

    public Date getAuthAdvTm() {
        return authAdvTm;
    }

    public void setAuthAdvTm(Date authAdvTm) {
        this.authAdvTm = authAdvTm;
    }

    public Date getAuthTranDt() {
        return authTranDt;
    }

    public void setAuthTranDt(Date authTranDt) {
        this.authTranDt = authTranDt;
    }

    public Date getAuthTranTm() {
        return authTranTm;
    }

    public void setAuthTranTm(Date authTranTm) {
        this.authTranTm = authTranTm;
    }

    public int getTrnsTrkgNbr() {
        return trnsTrkgNbr;
    }

    public void setTrnsTrkgNbr(int trnsTrkgNbr) {
        this.trnsTrkgNbr = trnsTrkgNbr;
    }

    public String getD63s2TraceIdCmplt() {
        return d63s2TraceIdCmplt;
    }

    public void setD63s2TraceIdCmplt(String d63s2TraceIdCmplt) {
        this.d63s2TraceIdCmplt = d63s2TraceIdCmplt;
    }

    public Character getAuthAsiFlg() {
        return authAsiFlg;
    }

    public void setAuthAsiFlg(Character authAsiFlg) {
        this.authAsiFlg = authAsiFlg;
    }

    public Character getAuthRecurPmtFlg() {
        return authRecurPmtFlg;
    }

    public void setAuthRecurPmtFlg(Character authRecurPmtFlg) {
        this.authRecurPmtFlg = authRecurPmtFlg;
    }

    public int getXpndCtlNbr() {
        return xpndCtlNbr;
    }

    public void setXpndCtlNbr(int xpndCtlNbr) {
        this.xpndCtlNbr = xpndCtlNbr;
    }

    public BigDecimal getAuthTranFeeAmt() {
        return authTranFeeAmt;
    }

    public void setAuthTranFeeAmt(BigDecimal authTranFeeAmt) {
        this.authTranFeeAmt = authTranFeeAmt;
    }

    public String getAuthIdMtchNbr() {
        return authIdMtchNbr;
    }

    public void setAuthIdMtchNbr(String authIdMtchNbr) {
        this.authIdMtchNbr = authIdMtchNbr;
    }

    public String getAuthD48s63TraceId() {
        return authD48s63TraceId;
    }

    public void setAuthD48s63TraceId(String authD48s63TraceId) {
        this.authD48s63TraceId = authD48s63TraceId;
    }

    public int getD48s61ExtndCondCd() {
        return d48s61ExtndCondCd;
    }

    public void setD48s61ExtndCondCd(int d48s61ExtndCondCd) {
        this.d48s61ExtndCondCd = d48s61ExtndCondCd;
    }

    public String getD48s71OnBehalfCd() {
        return d48s71OnBehalfCd;
    }

    public void setD48s71OnBehalfCd(String d48s71OnBehalfCd) {
        this.d48s71OnBehalfCd = d48s71OnBehalfCd;
    }

    public String getD48s33PanMappingCd() {
        return d48s33PanMappingCd;
    }

    public void setD48s33PanMappingCd(String d48s33PanMappingCd) {
        this.d48s33PanMappingCd = d48s33PanMappingCd;
    }

    public String getD48s26WalletId() {
        return d48s26WalletId;
    }

    public void setD48s26WalletId(String d48s26WalletId) {
        this.d48s26WalletId = d48s26WalletId;
    }

    public String getD48s77PmtXtnTypCd() {
        return d48s77PmtXtnTypCd;
    }

    public void setD48s77PmtXtnTypCd(String d48s77PmtXtnTypCd) {
        this.d48s77PmtXtnTypCd = d48s77PmtXtnTypCd;
    }

    public String getD48s72IssChipAuth() {
        return d48s72IssChipAuth;
    }

    public void setD48s72IssChipAuth(String d48s72IssChipAuth) {
        this.d48s72IssChipAuth = d48s72IssChipAuth;
    }

    public String getD48s79CvrTvrBitErr() {
        return d48s79CvrTvrBitErr;
    }

    public void setD48s79CvrTvrBitErr(String d48s79CvrTvrBitErr) {
        this.d48s79CvrTvrBitErr = d48s79CvrTvrBitErr;
    }

    public Character getAuthMultiPostFlg() {
        return authMultiPostFlg;
    }

    public void setAuthMultiPostFlg(Character authMultiPostFlg) {
        this.authMultiPostFlg = authMultiPostFlg;
    }

    public Character getAuth2ndXtnChk() {
        return auth2ndXtnChk;
    }

    public void setAuth2ndXtnChk(Character auth2ndXtnChk) {
        this.auth2ndXtnChk = auth2ndXtnChk;
    }

    public BigDecimal getXborderFeeAmt() {
        return xborderFeeAmt;
    }

    public void setXborderFeeAmt(BigDecimal xborderFeeAmt) {
        this.xborderFeeAmt = xborderFeeAmt;
    }

    public String getD48s42ElecCommInd() {
        return d48s42ElecCommInd;
    }

    public void setD48s42ElecCommInd(String d48s42ElecCommInd) {
        this.d48s42ElecCommInd = d48s42ElecCommInd;
    }

    public String getD48s43Ucaf() {
        return d48s43Ucaf;
    }

    public void setD48s43Ucaf(String d48s43Ucaf) {
        this.d48s43Ucaf = d48s43Ucaf;
    }

    public Character getD48s83AvsResp() {
        return d48s83AvsResp;
    }

    public void setD48s83AvsResp(Character d48s83AvsResp) {
        this.d48s83AvsResp = d48s83AvsResp;
    }

    public String getServCd() {
        return servCd;
    }

    public void setServCd(String servCd) {
        this.servCd = servCd;
    }

    public String getUnqId() {
        return unqId;
    }

    public void setUnqId(String unqId) {
        this.unqId = unqId;
    }

    public BigDecimal getD4TranAmt() {
        return d4TranAmt;
    }

    public void setD4TranAmt(BigDecimal d4TranAmt) {
        this.d4TranAmt = d4TranAmt;
    }

    public Character getInAuthProc() {
        return inAuthProc;
    }

    public void setInAuthProc(Character inAuthProc) {
        this.inAuthProc = inAuthProc;
    }

    public Character getInAuthApprStat() {
        return inAuthApprStat;
    }

    public void setInAuthApprStat(Character inAuthApprStat) {
        this.inAuthApprStat = inAuthApprStat;
    }

    public int getThrdPrtyApprCd() {
        return thrdPrtyApprCd;
    }

    public void setThrdPrtyApprCd(int thrdPrtyApprCd) {
        this.thrdPrtyApprCd = thrdPrtyApprCd;
    }

    public int getThrdPrtyRsnCd() {
        return thrdPrtyRsnCd;
    }

    public void setThrdPrtyRsnCd(int thrdPrtyRsnCd) {
        this.thrdPrtyRsnCd = thrdPrtyRsnCd;
    }

    public short getD48s75FrdScr() {
        return d48s75FrdScr;
    }

    public void setD48s75FrdScr(short d48s75FrdScr) {
        this.d48s75FrdScr = d48s75FrdScr;
    }

    public String getD48s75FrdScrRsnCd() {
        return d48s75FrdScrRsnCd;
    }

    public void setD48s75FrdScrRsnCd(String d48s75FrdScrRsnCd) {
        this.d48s75FrdScrRsnCd = d48s75FrdScrRsnCd;
    }

    public short getD48s75RlsScr() {
        return d48s75RlsScr;
    }

    public void setD48s75RlsScr(short d48s75RlsScr) {
        this.d48s75RlsScr = d48s75RlsScr;
    }

    public String getD48s75RlsRsnCd1() {
        return d48s75RlsRsnCd1;
    }

    public void setD48s75RlsRsnCd1(String d48s75RlsRsnCd1) {
        this.d48s75RlsRsnCd1 = d48s75RlsRsnCd1;
    }

    public String getD48s75RlsRsnCd2() {
        return d48s75RlsRsnCd2;
    }

    public void setD48s75RlsRsnCd2(String d48s75RlsRsnCd2) {
        this.d48s75RlsRsnCd2 = d48s75RlsRsnCd2;
    }

    public Date getFnMrchDt() {
        return fnMrchDt;
    }

    public void setFnMrchDt(Date fnMrchDt) {
        this.fnMrchDt = fnMrchDt;
    }

    public Date getFnMrchTm() {
        return fnMrchTm;
    }

    public void setFnMrchTm(Date fnMrchTm) {
        this.fnMrchTm = fnMrchTm;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public String getTrxNo() {
        return trxNo;
    }

    public void setTrxNo(String trxNo) {
        this.trxNo = trxNo;
    }

    public Date getTrxDt() {
        return trxDt;
    }

    public void setTrxDt(Date trxDt) {
        this.trxDt = trxDt;
    }

    public Date getMrchStlmtDt() {
        return mrchStlmtDt;
    }

    public void setMrchStlmtDt(Date mrchStlmtDt) {
        this.mrchStlmtDt = mrchStlmtDt;
    }

    public BigDecimal getOdmRdngNbr() {
        return odmRdngNbr;
    }

    public void setOdmRdngNbr(BigDecimal odmRdngNbr) {
        this.odmRdngNbr = odmRdngNbr;
    }

    public Character getAuthD48s38AcctCat() {
        return authD48s38AcctCat;
    }

    public void setAuthD48s38AcctCat(Character authD48s38AcctCat) {
        this.authD48s38AcctCat = authD48s38AcctCat;
    }

    public String getAuthAlmApprovCd() {
        return authAlmApprovCd;
    }

    public void setAuthAlmApprovCd(String authAlmApprovCd) {
        this.authAlmApprovCd = authAlmApprovCd;
    }

    public String getDe122S01Sf1AcptStAddr() {
        return de122S01Sf1AcptStAddr;
    }

    public void setDe122S01Sf1AcptStAddr(String de122S01Sf1AcptStAddr) {
        this.de122S01Sf1AcptStAddr = de122S01Sf1AcptStAddr;
    }

    public String getDe122S01Sf2AcptStCd() {
        return de122S01Sf2AcptStCd;
    }

    public void setDe122S01Sf2AcptStCd(String de122S01Sf2AcptStCd) {
        this.de122S01Sf2AcptStCd = de122S01Sf2AcptStCd;
    }

    public String getDe122S01Sf4AcptServPhn() {
        return de122S01Sf4AcptServPhn;
    }

    public void setDe122S01Sf4AcptServPhn(String de122S01Sf4AcptServPhn) {
        this.de122S01Sf4AcptServPhn = de122S01Sf4AcptServPhn;
    }

    public String getDe122S01Sf5AcptPhn() {
        return de122S01Sf5AcptPhn;
    }

    public void setDe122S01Sf5AcptPhn(String de122S01Sf5AcptPhn) {
        this.de122S01Sf5AcptPhn = de122S01Sf5AcptPhn;
    }

    public String getDe122S01Sf6AcptCntct() {
        return de122S01Sf6AcptCntct;
    }

    public void setDe122S01Sf6AcptCntct(String de122S01Sf6AcptCntct) {
        this.de122S01Sf6AcptCntct = de122S01Sf6AcptCntct;
    }

    public String getDe122S01Sf7AcptTaxId() {
        return de122S01Sf7AcptTaxId;
    }

    public void setDe122S01Sf7AcptTaxId(String de122S01Sf7AcptTaxId) {
        this.de122S01Sf7AcptTaxId = de122S01Sf7AcptTaxId;
    }

    public String getDe122S01Sf8AcptPrtnrId() {
        return de122S01Sf8AcptPrtnrId;
    }

    public void setDe122S01Sf8AcptPrtnrId(String de122S01Sf8AcptPrtnrId) {
        this.de122S01Sf8AcptPrtnrId = de122S01Sf8AcptPrtnrId;
    }

    public String getDe122S01Sf9SlocCty() {
        return de122S01Sf9SlocCty;
    }

    public void setDe122S01Sf9SlocCty(String de122S01Sf9SlocCty) {
        this.de122S01Sf9SlocCty = de122S01Sf9SlocCty;
    }

    public String getDe122S01Sf10SlocStCd() {
        return de122S01Sf10SlocStCd;
    }

    public void setDe122S01Sf10SlocStCd(String de122S01Sf10SlocStCd) {
        this.de122S01Sf10SlocStCd = de122S01Sf10SlocStCd;
    }

    public String getDe122S01Sf11SlocCntryCd() {
        return de122S01Sf11SlocCntryCd;
    }

    public void setDe122S01Sf11SlocCntryCd(String de122S01Sf11SlocCntryCd) {
        this.de122S01Sf11SlocCntryCd = de122S01Sf11SlocCntryCd;
    }

    public String getDe122S01Sf12SlocZip() {
        return de122S01Sf12SlocZip;
    }

    public void setDe122S01Sf12SlocZip(String de122S01Sf12SlocZip) {
        this.de122S01Sf12SlocZip = de122S01Sf12SlocZip;
    }

    public Date getRowChgTs() {
        return rowChgTs;
    }

    public void setRowChgTs(Date rowChgTs) {
        this.rowChgTs = rowChgTs;
    }

    public String getMultiTrnsId() {
        return multiTrnsId;
    }

    public void setMultiTrnsId(String multiTrnsId) {
        this.multiTrnsId = multiTrnsId;
    }

    public String getMisc1Nbr() {
        return misc1Nbr;
    }

    public void setMisc1Nbr(String misc1Nbr) {
        this.misc1Nbr = misc1Nbr;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public String getDe122S01Sf13AcptGeo() {
        return de122S01Sf13AcptGeo;
    }

    public void setDe122S01Sf13AcptGeo(String de122S01Sf13AcptGeo) {
        this.de122S01Sf13AcptGeo = de122S01Sf13AcptGeo;
    }

    public String getDe122S01Sf14SlocGeo() {
        return de122S01Sf14SlocGeo;
    }

    public void setDe122S01Sf14SlocGeo(String de122S01Sf14SlocGeo) {
        this.de122S01Sf14SlocGeo = de122S01Sf14SlocGeo;
    }

    public BigDecimal getAcptLatNbr() {
        return acptLatNbr;
    }

    public void setAcptLatNbr(BigDecimal acptLatNbr) {
        this.acptLatNbr = acptLatNbr;
    }

    public BigDecimal getAcptLongNbr() {
        return acptLongNbr;
    }

    public void setAcptLongNbr(BigDecimal acptLongNbr) {
        this.acptLongNbr = acptLongNbr;
    }

    public BigDecimal getSlocLatNbr() {
        return slocLatNbr;
    }

    public void setSlocLatNbr(BigDecimal slocLatNbr) {
        this.slocLatNbr = slocLatNbr;
    }

    public BigDecimal getSlocLongNbr() {
        return slocLongNbr;
    }

    public void setSlocLongNbr(BigDecimal slocLongNbr) {
        this.slocLongNbr = slocLongNbr;
    }

    public Character getDf32SpndCntlOvr() {
        return df32SpndCntlOvr;
    }

    public void setDf32SpndCntlOvr(Character df32SpndCntlOvr) {
        this.df32SpndCntlOvr = df32SpndCntlOvr;
    }

    public String getDf32Codes() {
        return df32Codes;
    }

    public void setDf32Codes(String df32Codes) {
        this.df32Codes = df32Codes;
    }

    public Character getDf32LvlTypCd() {
        return df32LvlTypCd;
    }

    public void setDf32LvlTypCd(Character df32LvlTypCd) {
        this.df32LvlTypCd = df32LvlTypCd;
    }

    public Character getLmtNetwUsedFlg() {
        return lmtNetwUsedFlg;
    }

    public void setLmtNetwUsedFlg(Character lmtNetwUsedFlg) {
        this.lmtNetwUsedFlg = lmtNetwUsedFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAuthorizationPK != null ? mcAuthorizationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAuthorization)) {
            return false;
        }
        McAuthorization other = (McAuthorization) object;
        if ((this.mcAuthorizationPK == null && other.mcAuthorizationPK != null) || (this.mcAuthorizationPK != null && !this.mcAuthorizationPK.equals(other.mcAuthorizationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAuthorization[ mcAuthorizationPK=" + mcAuthorizationPK + " ]";
    }

}
