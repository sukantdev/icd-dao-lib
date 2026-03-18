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
@Table(name = "MC_CBERT", catalog = "", schema = "CXXCOW")
public class McCbert implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McCbertPK mcCbertPK;
    @Column(name = "D3S1_CH_TRAN_TY")
    private Short d3s1ChTranTy;
    @Column(name = "D3S2_CH_FRACCNTTY")
    private Short d3s2ChFraccntty;
    @Column(name = "D3S3_CH_TOACCNTTY")
    private Short d3s3ChToaccntty;

    @Column(name = "D4_TRAN_AMT")
    private BigDecimal d4TranAmt;
    @Column(name = "D5_RECON_AMT")
    private BigDecimal d5ReconAmt;
    @Column(name = "D6_CH_BILLING_AMT")
    private BigDecimal d6ChBillingAmt;
    @Column(name = "D9_RECON_CONV_RT")
    private BigDecimal d9ReconConvRt;
    @Column(name = "D12S2_LOCAL_TR_TM")
    private Integer d12s2LocalTrTm;
    @Column(name = "D14_EXP_DT")
    private Short d14ExpDt;
    @Column(name = "D22S1_CRDDATINCP")
    private Character d22s1Crddatincp;
    @Column(name = "D22S2_CH_ATH_CAP")
    private Short d22s2ChAthCap;
    @Column(name = "D22S3_CRDCAP_CPBLT")
    private Short d22s3CrdcapCpblt;
    @Column(name = "D22S4_TERMOP_ENV")
    private Short d22s4TermopEnv;
    @Column(name = "D22S5_CH_PSNT_DAT")
    private Character d22s5ChPsntDat;
    @Column(name = "D22S6_CRD_PSNT_DAT")
    private Short d22s6CrdPsntDat;
    @Column(name = "D22S7_CRD_DAT_MD")
    private Character d22s7CrdDatMd;
    @Column(name = "D22S8_CH_ATHMTD")
    private Character d22s8ChAthmtd;
    @Column(name = "D22S9_CH_ATHENT")
    private Short d22s9ChAthent;
    @Column(name = "D22S10_CRDDATOCAP")
    private Character d22s10Crddatocap;
    @Column(name = "D22S11_TRMOCPBLT")
    private Short d22s11Trmocpblt;
    @Column(name = "D22S12_PIN_CAP_CAP")
    private Character d22s12PinCapCap;
    @Column(name = "D23_CARD_SEQ_NO")
    private Short d23CardSeqNo;
    @Column(name = "D24_FUNC_CD")
    private Short d24FuncCd;
    @Column(name = "D25_MSG_RSN_CD")
    private Short d25MsgRsnCd;
    @Column(name = "D26_CRD_ACPTRBUS")
    private Short d26CrdAcptrbus;
    @Column(name = "D30S2_RN_ORIG_AMT")
    private BigDecimal d30s2RnOrigAmt;
    @Column(name = "D32_ACQ_INST_ID_CD")
    private Long d32AcqInstIdCd;
    @Column(name = "D33_FWDNG_INST_CD")
    private Long d33FwdngInstCd;
    @Column(name = "D35_TRACK_2_DATA")
    private String d35Track2Data;
    @Column(name = "D37_RETR_REF_NO")
    private String d37RetrRefNo;
    @Column(name = "D41_CRD_ACPR_TRM")
    private String d41CrdAcprTrm;
    @Column(name = "D42_CRD_ACPR_ID")
    private String d42CrdAcprId;
    @Column(name = "D43S1_CRD_ACP_NM")
    private String d43s1CrdAcpNm;
    @Column(name = "D43S2_CRD_ACP_STR")
    private String d43s2CrdAcpStr;
    @Column(name = "D43S3_CRD_ACP_CTY")
    private String d43s3CrdAcpCty;
    @Column(name = "D43S4_CRD_ACP_ZIP")
    private String d43s4CrdAcpZip;
    @Column(name = "D43S5_CRD_ACP_ST")
    private String d43s5CrdAcpSt;
    @Column(name = "D43S6_CRD_ACP_CTRY")
    private String d43s6CrdAcpCtry;
    @Column(name = "D45_TRACK_1_DAT")
    private String d45Track1Dat;
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
    @Column(name = "D49_TRAN_CURR_CD")
    private Short d49TranCurrCd;
    @Column(name = "D50_RECON_CUR_CD")
    private Short d50ReconCurCd;
    @Column(name = "D55_INTD_CIR_SYS")
    private String d55IntdCirSys;
    @Column(name = "D62_ADDTL_DATA_2")
    private String d62AddtlData2;
    @Basic(optional = false)
    @Column(name = "D63S1_LFCYC_SP_IND")
    private Character d63s1LfcycSpInd;
    @Basic(optional = false)
    @Column(name = "D63S2_TRACE_ID")
    private String d63s2TraceId;
    @Column(name = "D72_DATA_REC")
    private String d72DataRec;
    @Column(name = "D73_ACTION_DT")
    private Integer d73ActionDt;
    @Column(name = "D93_TR_DEST_INST")
    private Long d93TrDestInst;
    @Column(name = "D94_TR_ORG_INST")
    private Long d94TrOrgInst;
    @Column(name = "D95_CRD_ISSUER_REF")
    private Long d95CrdIssuerRef;
    @Column(name = "D100_RECV_INST_ID")
    private Long d100RecvInstId;
    @Column(name = "D123_ADDTL_DAT_3")
    private String d123AddtlDat3;
    @Column(name = "D124_ADDTL_DAT_4")
    private String d124AddtlDat4;
    @Column(name = "D125_ADDTL_DAT_5")
    private String d125AddtlDat5;
    @Column(name = "P2_PROD_ID")
    private String p2ProdId;
    @Column(name = "P020_ICCR_EFF_DT")
    private Integer p020IccrEffDt;
    @Column(name = "P023_TERM_TY")
    private String p023TermTy;
    @Column(name = "P025S1_MSG_REV")
    private Character p025s1MsgRev;
    @Column(name = "P025S2_CPRDTORIG")
    private Integer p025s2Cprdtorig;
    @Column(name = "P043_PGM_REGSTN")
    private String p043PgmRegstn;
    @Column(name = "P52S1_SECU_PROT")
    private Short p52s1SecuProt;
    @Column(name = "P52S2_CH_AUTH")
    private Short p52s2ChAuth;
    @Column(name = "P52S3_UCAF_COLIND")
    private Short p52s3UcafColind;
    @Column(name = "P137_FEE_COL_CNTL")
    private String p137FeeColCntl;
    @Column(name = "P146S1_TRNFEE_TY")
    private Short p146s1TrnfeeTy;
    @Column(name = "P146S2_TRNFEE_PRC")
    private Short p146s2TrnfeePrc;
    @Column(name = "P146S3_TRNFEE_STL")
    private Short p146s3TrnfeeStl;
    @Column(name = "P146S4_TRNFEE_CURR")
    private Short p146s4TrnfeeCurr;
    @Column(name = "P146S5_TRNFEE_AMT")
    private BigDecimal p146s5TrnfeeAmt;
    @Column(name = "P146S6_TRNFEERCUR")
    private Short p146s6Trnfeercur;
    @Column(name = "P146S7_TRNFEER_AMT")
    private BigDecimal p146s7TrnfeerAmt;
    @Column(name = "P148S1_CURR_CD")
    private Integer p148s1CurrCd;
    @Column(name = "P148S2_CURR_EXP")
    private Character p148s2CurrExp;
    @Column(name = "P149S1_OR_TA_CUR")
    private Short p149s1OrTaCur;
    @Column(name = "P149S2_OR_RCNCUR")
    private Short p149s2OrRcncur;
    @Column(name = "P158S1_AP_BRAND_ID")
    private String p158s1ApBrandId;
    @Column(name = "P158S2_BUS_SRVC_LV")
    private Character p158s2BusSrvcLv;
    @Column(name = "P158S3_BUS_SRVC_ID")
    private String p158s3BusSrvcId;
    @Column(name = "P158S4_ICG_RT_DSGN")
    private String p158s4IcgRtDsgn;
    @Column(name = "P158S5_BUS_DT")
    private Integer p158s5BusDt;
    @Column(name = "P158S6_BUS_CYCLE")
    private Short p158s6BusCycle;
    @Column(name = "P158S7_MCC_OVR")
    private Character p158s7MccOvr;
    @Column(name = "P158S8_PROD_OVR")
    private String p158s8ProdOvr;
    @Column(name = "P158S9_CORP_INCRT")
    private Character p158s9CorpIncrt;
    @Column(name = "P158S10_QUAL_LVL")
    private String p158s10QualLvl;
    @Column(name = "P159S1_S_SRVC_TAI")
    private String p159s1SSrvcTai;
    @Column(name = "P159S2_S_SRVCTAA")
    private String p159s2SSrvctaa;
    @Column(name = "P159S3_S_SRVC_LVL")
    private Short p159s3SSrvcLvl;
    @Column(name = "P159S4_S_SRVC_ID")
    private String p159s4SSrvcId;
    @Column(name = "P159S5_S_FRNEX_CL")
    private Character p159s5SFrnexCl;
    @Column(name = "P159S6_RECON_DT")
    private Integer p159s6ReconDt;
    @Column(name = "P159S7_RECON_CYCLE")
    private Short p159s7ReconCycle;
    @Column(name = "P159S8_STL_DT")
    private Integer p159s8StlDt;
    @Column(name = "P159S9_STL_CYCLE")
    private Short p159s9StlCycle;
    @Column(name = "P161S1_S_SRVC_TAI")
    private String p161s1SSrvcTai;
    @Column(name = "P161S2_S_SRVC_TAA")
    private String p161s2SSrvcTaa;
    @Column(name = "P161S3_S_SRVC_LVL")
    private Short p161s3SSrvcLvl;
    @Column(name = "P161S4_S_SRVC_ID")
    private String p161s4SSrvcId;
    @Column(name = "P161S5_S_FE_RT_CL")
    private Character p161s5SFeRtCl;
    @Column(name = "P161S6_RECON_DT")
    private Integer p161s6ReconDt;
    @Column(name = "P161S7_RECON_CYCLE")
    private Short p161s7ReconCycle;
    @Column(name = "P161S8_S_DT")
    private Integer p161s8SDt;
    @Column(name = "P161S9_S_CYCLE")
    private Short p161s9SCycle;
    @Column(name = "P165S1_STL_IND")
    private Character p165s1StlInd;
    @Column(name = "P165S2_STL_INFO")
    private String p165s2StlInfo;
    @Column(name = "P170S1_CUSTSVC_PH")
    private String p170s1CustsvcPh;
    @Column(name = "P170S2_CRD_ACP_PH")
    private String p170s2CrdAcpPh;
    @Column(name = "P170S3_ADTL_CT_INF")
    private String p170s3AdtlCtInf;
    @Column(name = "P171S1_CHR_SET_IND")
    private String p171s1ChrSetInd;
    @Column(name = "P171S2_CRD_ACPDSC")
    private String p171s2CrdAcpdsc;
    @Column(name = "P172_SOLE_PRO_NM")
    private String p172SoleProNm;
    @Column(name = "P173_LEG_CORP_NM")
    private String p173LegCorpNm;
    @Column(name = "P174_DUN_BRAD_NO")
    private String p174DunBradNo;
    @Column(name = "P175_CRD_ACP_URL")
    private String p175CrdAcpUrl;
    @Column(name = "P189S1_FORMAT_NO")
    private Character p189s1FormatNo;
    @Column(name = "P189S2_PHONE_DAT")
    private String p189s2PhoneDat;
    @Column(name = "P190_PART_ID_CD")
    private String p190PartIdCd;
    @Column(name = "P191_OR_MSG_FMT")
    private Short p191OrMsgFmt;
    @Column(name = "P228_RETR_DOC")
    private Short p228RetrDoc;
    @Column(name = "P230_FUL_DOC_CD")
    private Short p230FulDocCd;
    @Column(name = "P241_MSTC_CNTL")
    private String p241MstcCntl;
    @Column(name = "P242_MSTC_SRVC_I")
    private Character p242MstcSrvcI;
    @Column(name = "P243S1_MCOM_I_RDT")
    private Integer p243s1McomIRdt;
    @Column(name = "P243S2_MCOM_ACQ_RS")
    private Character p243s2McomAcqRs;
    @Column(name = "P243S3_MCOM_A_RDT")
    private Integer p243s3McomARdt;
    @Column(name = "P243S4_MCOM_I_RC")
    private String p243s4McomIRc;
    @Column(name = "P243S5_MCOM_I_R_DT")
    private Integer p243s5McomIRDt;
    @Column(name = "P243S6_MCOM_I_REJR")
    private String p243s6McomIRejr;
    @Column(name = "P243S7_MCOM_IM_RV")
    private Character p243s7McomImRv;
    @Column(name = "P243S8_MCOM_IM_RDT")
    private Integer p243s8McomImRdt;
    @Column(name = "P244S1_MCOM_CB_DT")
    private Integer p244s1McomCbDt;
    @Column(name = "P244S2_MCOM_CB_DT2")
    private Integer p244s2McomCbDt2;
    @Column(name = "P260S1_EXC_REQ_CD")
    private String p260s1ExcReqCd;
    @Column(name = "P260S2_EXC_RSN_CD")
    private Character p260s2ExcRsnCd;
    @Column(name = "P260S3_EXC_RES_CD")
    private Character p260s3ExcResCd;
    @Column(name = "P262_DOC_INDCTR")
    private Short p262DocIndctr;
    @Column(name = "P264_OR_RETR_RSN")
    private Short p264OrRetrRsn;
    @Column(name = "P265S1_I_MSG_RSN")
    private Short p265s1IMsgRsn;
    @Column(name = "P265S2_I_PSNT_BUS")
    private Integer p265s2IPsntBus;
    @Column(name = "P265S3_I_DAT_REC")
    private String p265s3IDatRec;
    @Column(name = "P266S1_MSG_RSN_CD")
    private Short p266s1MsgRsnCd;
    @Column(name = "P266S2_FSTRTN_DT")
    private Integer p266s2FstrtnDt;
    @Column(name = "P266S3_EDIT_EX_RSN")
    private Character p266s3EditExRsn;
    @Column(name = "P266S4_EDIT_EX_RES")
    private Character p266s4EditExRes;
    @Column(name = "P266S5_FSTRTN_AMT")
    private BigDecimal p266s5FstrtnAmt;
    @Column(name = "P266S6_FST_RTN_CUR")
    private Short p266s6FstRtnCur;
    @Column(name = "P266S7_FST_RTN_DAT")
    private String p266s7FstRtnDat;
    @Column(name = "P267S1_MSG_RSN_CD")
    private Short p267s1MsgRsnCd;
    @Column(name = "P267S2_SEC_RTN_DT")
    private Integer p267s2SecRtnDt;
    @Column(name = "P267S3_EDIT_EX_RSN")
    private Character p267s3EditExRsn;
    @Column(name = "P267S4_EDIT_EX_RES")
    private Character p267s4EditExRes;
    @Column(name = "P267S5_SEC_RTN_AMT")
    private BigDecimal p267s5SecRtnAmt;
    @Column(name = "P267S6_SEC_RTN_CUR")
    private Short p267s6SecRtnCur;
    @Column(name = "P267S7_SEC_RTN_DAT")
    private String p267s7SecRtnDat;
    @Column(name = "P268S1_PRT_TRN_AMT")
    private BigDecimal p268s1PrtTrnAmt;
    @Column(name = "P268S2_PRT_TRAN_CC")
    private Short p268s2PrtTranCc;
    @Column(name = "P375_MBR_RCN_IND")
    private String p375MbrRcnInd;
    @Column(name = "P376_MBR_RCN_IND")
    private String p376MbrRcnInd;
    @Column(name = "P1000_MBR_TO_MBR")
    private String p1000MbrToMbr;
    @Column(name = "U0001_STATUS")
    private Short u0001Status;
    @Column(name = "U0002_STATUS_MSG")
    private String u0002StatusMsg;
    @Column(name = "U0003_CREATED_ID")
    private String u0003CreatedId;
    @Basic(optional = false)
    @Column(name = "U0004_CREATED_DT")
    @Temporal(TemporalType.DATE)
    private Date u0004CreatedDt;
    @Basic(optional = false)
    @Column(name = "U0005_CREATED_RM")
    @Temporal(TemporalType.TIME)
    private Date u0005CreatedRm;
    @Column(name = "U0006_LASTUPD_ID")
    private String u0006LastupdId;
    @Column(name = "U0007_LASTUPD_DT")
    @Temporal(TemporalType.DATE)
    private Date u0007LastupdDt;
    @Column(name = "U0008_LASTUPD_TM")
    @Temporal(TemporalType.TIME)
    private Date u0008LastupdTm;
    @Column(name = "U0009_FULFIL_STAT")
    private Character u0009FulfilStat;
    @Column(name = "U0010_FULFIL_DT")
    @Temporal(TemporalType.DATE)
    private Date u0010FulfilDt;
    @Column(name = "U0011_NO_ACT_STAT")
    private Character u0011NoActStat;
    @Column(name = "U0012_NO_ACT_DT")
    @Temporal(TemporalType.DATE)
    private Date u0012NoActDt;
    @Column(name = "U0013_CB_INIT_DT")
    @Temporal(TemporalType.DATE)
    private Date u0013CbInitDt;
    @Column(name = "U0014_GEAC_REF")
    private String u0014GeacRef;
    @Column(name = "U0015_ACCT_CDE")
    private String u0015AcctCde;
    @Column(name = "U0016_DATE_SENT")
    private Integer u0016DateSent;
    @Column(name = "U0017_DATE_IN_Q")
    private Integer u0017DateInQ;
    @Column(name = "U0018_2ND_DOC_IND")
    private Character u00182ndDocInd;
    @Column(name = "U0019_CAME_FROM")
    private Character u0019CameFrom;
    @Column(name = "U0100_NOTE_DETAIL")
    private String u0100NoteDetail;
    @Basic(optional = false)
    @Column(name = "U0020_FUL_DATE")
    private String u0020FulDate;
    @Basic(optional = false)
    @Column(name = "U0021_ACT_DATE")
    private String u0021ActDate;
    @Basic(optional = false)
    @Column(name = "U0022_IN_PROCESS")
    private Character u0022InProcess;
    @Basic(optional = false)
    @Column(name = "P263_LFCYC_CD")
    private long p263LfcycCd;
    @Basic(optional = false)
    @Column(name = "P3_PROD_ID")
    private String p3ProdId;
    @Basic(optional = false)
    @Column(name = "P158S11_MCMRCH_OVR")
    private Character p158s11McmrchOvr;
    @Basic(optional = false)
    @Column(name = "P176_MCMRCH")
    private String p176Mcmrch;
    @Basic(optional = false)
    @Column(name = "P208S1_PAY_FACIL_ID")
    private long p208s1PayFacilId;
    @Basic(optional = false)
    @Column(name = "P208S2_SUB_MERCH_ID")
    private String p208s2SubMerchId;
    @Basic(optional = false)
    @Column(name = "P209_INDEP_SAL_ORG_ID")
    private long p209IndepSalOrgId;

    public McCbert() {
    }

    public McCbert(McCbertPK mcCbertPK) {
        this.mcCbertPK = mcCbertPK;
    }

    public McCbert(McCbertPK mcCbertPK, Character d63s1LfcycSpInd, String d63s2TraceId, Date u0004CreatedDt, Date u0005CreatedRm, String u0020FulDate, String u0021ActDate, Character u0022InProcess, long p263LfcycCd, String p3ProdId, Character p158s11McmrchOvr, String p176Mcmrch, long p208s1PayFacilId, String p208s2SubMerchId, long p209IndepSalOrgId) {
        this.mcCbertPK = mcCbertPK;
        this.d63s1LfcycSpInd = d63s1LfcycSpInd;
        this.d63s2TraceId = d63s2TraceId;
        this.u0004CreatedDt = u0004CreatedDt;
        this.u0005CreatedRm = u0005CreatedRm;
        this.u0020FulDate = u0020FulDate;
        this.u0021ActDate = u0021ActDate;
        this.u0022InProcess = u0022InProcess;
        this.p263LfcycCd = p263LfcycCd;
        this.p3ProdId = p3ProdId;
        this.p158s11McmrchOvr = p158s11McmrchOvr;
        this.p176Mcmrch = p176Mcmrch;
        this.p208s1PayFacilId = p208s1PayFacilId;
        this.p208s2SubMerchId = p208s2SubMerchId;
        this.p209IndepSalOrgId = p209IndepSalOrgId;
    }

    public McCbert(String d2PriAccntNo, int d12s1LocalTrDt, BigDecimal d30s1TrOrigAmt, short d31s1IcRtDsgtr, int d31s2AcquirBin, short d31s3JulPrcDt, long d31s4AcqSeqNo, short d31s5CheckDigit, String d38ApprvlCd, int d71MsgNo, short u0000RecordType) {
        this.mcCbertPK = new McCbertPK(d2PriAccntNo, d12s1LocalTrDt, d30s1TrOrigAmt, d31s1IcRtDsgtr, d31s2AcquirBin, d31s3JulPrcDt, d31s4AcqSeqNo, d31s5CheckDigit, d38ApprvlCd, d71MsgNo, u0000RecordType);
    }

    public McCbertPK getMcCbertPK() {
        return mcCbertPK;
    }

    public void setMcCbertPK(McCbertPK mcCbertPK) {
        this.mcCbertPK = mcCbertPK;
    }

    public Short getD3s1ChTranTy() {
        return d3s1ChTranTy;
    }

    public void setD3s1ChTranTy(Short d3s1ChTranTy) {
        this.d3s1ChTranTy = d3s1ChTranTy;
    }

    public Short getD3s2ChFraccntty() {
        return d3s2ChFraccntty;
    }

    public void setD3s2ChFraccntty(Short d3s2ChFraccntty) {
        this.d3s2ChFraccntty = d3s2ChFraccntty;
    }

    public Short getD3s3ChToaccntty() {
        return d3s3ChToaccntty;
    }

    public void setD3s3ChToaccntty(Short d3s3ChToaccntty) {
        this.d3s3ChToaccntty = d3s3ChToaccntty;
    }

    public BigDecimal getD4TranAmt() {
        return d4TranAmt;
    }

    public void setD4TranAmt(BigDecimal d4TranAmt) {
        this.d4TranAmt = d4TranAmt;
    }

    public BigDecimal getD5ReconAmt() {
        return d5ReconAmt;
    }

    public void setD5ReconAmt(BigDecimal d5ReconAmt) {
        this.d5ReconAmt = d5ReconAmt;
    }

    public BigDecimal getD6ChBillingAmt() {
        return d6ChBillingAmt;
    }

    public void setD6ChBillingAmt(BigDecimal d6ChBillingAmt) {
        this.d6ChBillingAmt = d6ChBillingAmt;
    }

    public BigDecimal getD9ReconConvRt() {
        return d9ReconConvRt;
    }

    public void setD9ReconConvRt(BigDecimal d9ReconConvRt) {
        this.d9ReconConvRt = d9ReconConvRt;
    }

    public Integer getD12s2LocalTrTm() {
        return d12s2LocalTrTm;
    }

    public void setD12s2LocalTrTm(Integer d12s2LocalTrTm) {
        this.d12s2LocalTrTm = d12s2LocalTrTm;
    }

    public Short getD14ExpDt() {
        return d14ExpDt;
    }

    public void setD14ExpDt(Short d14ExpDt) {
        this.d14ExpDt = d14ExpDt;
    }

    public Character getD22s1Crddatincp() {
        return d22s1Crddatincp;
    }

    public void setD22s1Crddatincp(Character d22s1Crddatincp) {
        this.d22s1Crddatincp = d22s1Crddatincp;
    }

    public Short getD22s2ChAthCap() {
        return d22s2ChAthCap;
    }

    public void setD22s2ChAthCap(Short d22s2ChAthCap) {
        this.d22s2ChAthCap = d22s2ChAthCap;
    }

    public Short getD22s3CrdcapCpblt() {
        return d22s3CrdcapCpblt;
    }

    public void setD22s3CrdcapCpblt(Short d22s3CrdcapCpblt) {
        this.d22s3CrdcapCpblt = d22s3CrdcapCpblt;
    }

    public Short getD22s4TermopEnv() {
        return d22s4TermopEnv;
    }

    public void setD22s4TermopEnv(Short d22s4TermopEnv) {
        this.d22s4TermopEnv = d22s4TermopEnv;
    }

    public Character getD22s5ChPsntDat() {
        return d22s5ChPsntDat;
    }

    public void setD22s5ChPsntDat(Character d22s5ChPsntDat) {
        this.d22s5ChPsntDat = d22s5ChPsntDat;
    }

    public Short getD22s6CrdPsntDat() {
        return d22s6CrdPsntDat;
    }

    public void setD22s6CrdPsntDat(Short d22s6CrdPsntDat) {
        this.d22s6CrdPsntDat = d22s6CrdPsntDat;
    }

    public Character getD22s7CrdDatMd() {
        return d22s7CrdDatMd;
    }

    public void setD22s7CrdDatMd(Character d22s7CrdDatMd) {
        this.d22s7CrdDatMd = d22s7CrdDatMd;
    }

    public Character getD22s8ChAthmtd() {
        return d22s8ChAthmtd;
    }

    public void setD22s8ChAthmtd(Character d22s8ChAthmtd) {
        this.d22s8ChAthmtd = d22s8ChAthmtd;
    }

    public Short getD22s9ChAthent() {
        return d22s9ChAthent;
    }

    public void setD22s9ChAthent(Short d22s9ChAthent) {
        this.d22s9ChAthent = d22s9ChAthent;
    }

    public Character getD22s10Crddatocap() {
        return d22s10Crddatocap;
    }

    public void setD22s10Crddatocap(Character d22s10Crddatocap) {
        this.d22s10Crddatocap = d22s10Crddatocap;
    }

    public Short getD22s11Trmocpblt() {
        return d22s11Trmocpblt;
    }

    public void setD22s11Trmocpblt(Short d22s11Trmocpblt) {
        this.d22s11Trmocpblt = d22s11Trmocpblt;
    }

    public Character getD22s12PinCapCap() {
        return d22s12PinCapCap;
    }

    public void setD22s12PinCapCap(Character d22s12PinCapCap) {
        this.d22s12PinCapCap = d22s12PinCapCap;
    }

    public Short getD23CardSeqNo() {
        return d23CardSeqNo;
    }

    public void setD23CardSeqNo(Short d23CardSeqNo) {
        this.d23CardSeqNo = d23CardSeqNo;
    }

    public Short getD24FuncCd() {
        return d24FuncCd;
    }

    public void setD24FuncCd(Short d24FuncCd) {
        this.d24FuncCd = d24FuncCd;
    }

    public Short getD25MsgRsnCd() {
        return d25MsgRsnCd;
    }

    public void setD25MsgRsnCd(Short d25MsgRsnCd) {
        this.d25MsgRsnCd = d25MsgRsnCd;
    }

    public Short getD26CrdAcptrbus() {
        return d26CrdAcptrbus;
    }

    public void setD26CrdAcptrbus(Short d26CrdAcptrbus) {
        this.d26CrdAcptrbus = d26CrdAcptrbus;
    }

    public BigDecimal getD30s2RnOrigAmt() {
        return d30s2RnOrigAmt;
    }

    public void setD30s2RnOrigAmt(BigDecimal d30s2RnOrigAmt) {
        this.d30s2RnOrigAmt = d30s2RnOrigAmt;
    }

    public Long getD32AcqInstIdCd() {
        return d32AcqInstIdCd;
    }

    public void setD32AcqInstIdCd(Long d32AcqInstIdCd) {
        this.d32AcqInstIdCd = d32AcqInstIdCd;
    }

    public Long getD33FwdngInstCd() {
        return d33FwdngInstCd;
    }

    public void setD33FwdngInstCd(Long d33FwdngInstCd) {
        this.d33FwdngInstCd = d33FwdngInstCd;
    }

    public String getD35Track2Data() {
        return d35Track2Data;
    }

    public void setD35Track2Data(String d35Track2Data) {
        this.d35Track2Data = d35Track2Data;
    }

    public String getD37RetrRefNo() {
        return d37RetrRefNo;
    }

    public void setD37RetrRefNo(String d37RetrRefNo) {
        this.d37RetrRefNo = d37RetrRefNo;
    }

    public String getD41CrdAcprTrm() {
        return d41CrdAcprTrm;
    }

    public void setD41CrdAcprTrm(String d41CrdAcprTrm) {
        this.d41CrdAcprTrm = d41CrdAcprTrm;
    }

    public String getD42CrdAcprId() {
        return d42CrdAcprId;
    }

    public void setD42CrdAcprId(String d42CrdAcprId) {
        this.d42CrdAcprId = d42CrdAcprId;
    }

    public String getD43s1CrdAcpNm() {
        return d43s1CrdAcpNm;
    }

    public void setD43s1CrdAcpNm(String d43s1CrdAcpNm) {
        this.d43s1CrdAcpNm = d43s1CrdAcpNm;
    }

    public String getD43s2CrdAcpStr() {
        return d43s2CrdAcpStr;
    }

    public void setD43s2CrdAcpStr(String d43s2CrdAcpStr) {
        this.d43s2CrdAcpStr = d43s2CrdAcpStr;
    }

    public String getD43s3CrdAcpCty() {
        return d43s3CrdAcpCty;
    }

    public void setD43s3CrdAcpCty(String d43s3CrdAcpCty) {
        this.d43s3CrdAcpCty = d43s3CrdAcpCty;
    }

    public String getD43s4CrdAcpZip() {
        return d43s4CrdAcpZip;
    }

    public void setD43s4CrdAcpZip(String d43s4CrdAcpZip) {
        this.d43s4CrdAcpZip = d43s4CrdAcpZip;
    }

    public String getD43s5CrdAcpSt() {
        return d43s5CrdAcpSt;
    }

    public void setD43s5CrdAcpSt(String d43s5CrdAcpSt) {
        this.d43s5CrdAcpSt = d43s5CrdAcpSt;
    }

    public String getD43s6CrdAcpCtry() {
        return d43s6CrdAcpCtry;
    }

    public void setD43s6CrdAcpCtry(String d43s6CrdAcpCtry) {
        this.d43s6CrdAcpCtry = d43s6CrdAcpCtry;
    }

    public String getD45Track1Dat() {
        return d45Track1Dat;
    }

    public void setD45Track1Dat(String d45Track1Dat) {
        this.d45Track1Dat = d45Track1Dat;
    }

    public String getD48AddtlDat() {
        return d48AddtlDat;
    }

    public void setD48AddtlDat(String d48AddtlDat) {
        this.d48AddtlDat = d48AddtlDat;
    }

    public Short getD49TranCurrCd() {
        return d49TranCurrCd;
    }

    public void setD49TranCurrCd(Short d49TranCurrCd) {
        this.d49TranCurrCd = d49TranCurrCd;
    }

    public Short getD50ReconCurCd() {
        return d50ReconCurCd;
    }

    public void setD50ReconCurCd(Short d50ReconCurCd) {
        this.d50ReconCurCd = d50ReconCurCd;
    }

    public String getD55IntdCirSys() {
        return d55IntdCirSys;
    }

    public void setD55IntdCirSys(String d55IntdCirSys) {
        this.d55IntdCirSys = d55IntdCirSys;
    }

    public String getD62AddtlData2() {
        return d62AddtlData2;
    }

    public void setD62AddtlData2(String d62AddtlData2) {
        this.d62AddtlData2 = d62AddtlData2;
    }

    public Character getD63s1LfcycSpInd() {
        return d63s1LfcycSpInd;
    }

    public void setD63s1LfcycSpInd(Character d63s1LfcycSpInd) {
        this.d63s1LfcycSpInd = d63s1LfcycSpInd;
    }

    public String getD63s2TraceId() {
        return d63s2TraceId;
    }

    public void setD63s2TraceId(String d63s2TraceId) {
        this.d63s2TraceId = d63s2TraceId;
    }

    public String getD72DataRec() {
        return d72DataRec;
    }

    public void setD72DataRec(String d72DataRec) {
        this.d72DataRec = d72DataRec;
    }

    public Integer getD73ActionDt() {
        return d73ActionDt;
    }

    public void setD73ActionDt(Integer d73ActionDt) {
        this.d73ActionDt = d73ActionDt;
    }

    public Long getD93TrDestInst() {
        return d93TrDestInst;
    }

    public void setD93TrDestInst(Long d93TrDestInst) {
        this.d93TrDestInst = d93TrDestInst;
    }

    public Long getD94TrOrgInst() {
        return d94TrOrgInst;
    }

    public void setD94TrOrgInst(Long d94TrOrgInst) {
        this.d94TrOrgInst = d94TrOrgInst;
    }

    public Long getD95CrdIssuerRef() {
        return d95CrdIssuerRef;
    }

    public void setD95CrdIssuerRef(Long d95CrdIssuerRef) {
        this.d95CrdIssuerRef = d95CrdIssuerRef;
    }

    public Long getD100RecvInstId() {
        return d100RecvInstId;
    }

    public void setD100RecvInstId(Long d100RecvInstId) {
        this.d100RecvInstId = d100RecvInstId;
    }

    public String getD123AddtlDat3() {
        return d123AddtlDat3;
    }

    public void setD123AddtlDat3(String d123AddtlDat3) {
        this.d123AddtlDat3 = d123AddtlDat3;
    }

    public String getD124AddtlDat4() {
        return d124AddtlDat4;
    }

    public void setD124AddtlDat4(String d124AddtlDat4) {
        this.d124AddtlDat4 = d124AddtlDat4;
    }

    public String getD125AddtlDat5() {
        return d125AddtlDat5;
    }

    public void setD125AddtlDat5(String d125AddtlDat5) {
        this.d125AddtlDat5 = d125AddtlDat5;
    }

    public String getP2ProdId() {
        return p2ProdId;
    }

    public void setP2ProdId(String p2ProdId) {
        this.p2ProdId = p2ProdId;
    }

    public Integer getP020IccrEffDt() {
        return p020IccrEffDt;
    }

    public void setP020IccrEffDt(Integer p020IccrEffDt) {
        this.p020IccrEffDt = p020IccrEffDt;
    }

    public String getP023TermTy() {
        return p023TermTy;
    }

    public void setP023TermTy(String p023TermTy) {
        this.p023TermTy = p023TermTy;
    }

    public Character getP025s1MsgRev() {
        return p025s1MsgRev;
    }

    public void setP025s1MsgRev(Character p025s1MsgRev) {
        this.p025s1MsgRev = p025s1MsgRev;
    }

    public Integer getP025s2Cprdtorig() {
        return p025s2Cprdtorig;
    }

    public void setP025s2Cprdtorig(Integer p025s2Cprdtorig) {
        this.p025s2Cprdtorig = p025s2Cprdtorig;
    }

    public String getP043PgmRegstn() {
        return p043PgmRegstn;
    }

    public void setP043PgmRegstn(String p043PgmRegstn) {
        this.p043PgmRegstn = p043PgmRegstn;
    }

    public Short getP52s1SecuProt() {
        return p52s1SecuProt;
    }

    public void setP52s1SecuProt(Short p52s1SecuProt) {
        this.p52s1SecuProt = p52s1SecuProt;
    }

    public Short getP52s2ChAuth() {
        return p52s2ChAuth;
    }

    public void setP52s2ChAuth(Short p52s2ChAuth) {
        this.p52s2ChAuth = p52s2ChAuth;
    }

    public Short getP52s3UcafColind() {
        return p52s3UcafColind;
    }

    public void setP52s3UcafColind(Short p52s3UcafColind) {
        this.p52s3UcafColind = p52s3UcafColind;
    }

    public String getP137FeeColCntl() {
        return p137FeeColCntl;
    }

    public void setP137FeeColCntl(String p137FeeColCntl) {
        this.p137FeeColCntl = p137FeeColCntl;
    }

    public Short getP146s1TrnfeeTy() {
        return p146s1TrnfeeTy;
    }

    public void setP146s1TrnfeeTy(Short p146s1TrnfeeTy) {
        this.p146s1TrnfeeTy = p146s1TrnfeeTy;
    }

    public Short getP146s2TrnfeePrc() {
        return p146s2TrnfeePrc;
    }

    public void setP146s2TrnfeePrc(Short p146s2TrnfeePrc) {
        this.p146s2TrnfeePrc = p146s2TrnfeePrc;
    }

    public Short getP146s3TrnfeeStl() {
        return p146s3TrnfeeStl;
    }

    public void setP146s3TrnfeeStl(Short p146s3TrnfeeStl) {
        this.p146s3TrnfeeStl = p146s3TrnfeeStl;
    }

    public Short getP146s4TrnfeeCurr() {
        return p146s4TrnfeeCurr;
    }

    public void setP146s4TrnfeeCurr(Short p146s4TrnfeeCurr) {
        this.p146s4TrnfeeCurr = p146s4TrnfeeCurr;
    }

    public BigDecimal getP146s5TrnfeeAmt() {
        return p146s5TrnfeeAmt;
    }

    public void setP146s5TrnfeeAmt(BigDecimal p146s5TrnfeeAmt) {
        this.p146s5TrnfeeAmt = p146s5TrnfeeAmt;
    }

    public Short getP146s6Trnfeercur() {
        return p146s6Trnfeercur;
    }

    public void setP146s6Trnfeercur(Short p146s6Trnfeercur) {
        this.p146s6Trnfeercur = p146s6Trnfeercur;
    }

    public BigDecimal getP146s7TrnfeerAmt() {
        return p146s7TrnfeerAmt;
    }

    public void setP146s7TrnfeerAmt(BigDecimal p146s7TrnfeerAmt) {
        this.p146s7TrnfeerAmt = p146s7TrnfeerAmt;
    }

    public Integer getP148s1CurrCd() {
        return p148s1CurrCd;
    }

    public void setP148s1CurrCd(Integer p148s1CurrCd) {
        this.p148s1CurrCd = p148s1CurrCd;
    }

    public Character getP148s2CurrExp() {
        return p148s2CurrExp;
    }

    public void setP148s2CurrExp(Character p148s2CurrExp) {
        this.p148s2CurrExp = p148s2CurrExp;
    }

    public Short getP149s1OrTaCur() {
        return p149s1OrTaCur;
    }

    public void setP149s1OrTaCur(Short p149s1OrTaCur) {
        this.p149s1OrTaCur = p149s1OrTaCur;
    }

    public Short getP149s2OrRcncur() {
        return p149s2OrRcncur;
    }

    public void setP149s2OrRcncur(Short p149s2OrRcncur) {
        this.p149s2OrRcncur = p149s2OrRcncur;
    }

    public String getP158s1ApBrandId() {
        return p158s1ApBrandId;
    }

    public void setP158s1ApBrandId(String p158s1ApBrandId) {
        this.p158s1ApBrandId = p158s1ApBrandId;
    }

    public Character getP158s2BusSrvcLv() {
        return p158s2BusSrvcLv;
    }

    public void setP158s2BusSrvcLv(Character p158s2BusSrvcLv) {
        this.p158s2BusSrvcLv = p158s2BusSrvcLv;
    }

    public String getP158s3BusSrvcId() {
        return p158s3BusSrvcId;
    }

    public void setP158s3BusSrvcId(String p158s3BusSrvcId) {
        this.p158s3BusSrvcId = p158s3BusSrvcId;
    }

    public String getP158s4IcgRtDsgn() {
        return p158s4IcgRtDsgn;
    }

    public void setP158s4IcgRtDsgn(String p158s4IcgRtDsgn) {
        this.p158s4IcgRtDsgn = p158s4IcgRtDsgn;
    }

    public Integer getP158s5BusDt() {
        return p158s5BusDt;
    }

    public void setP158s5BusDt(Integer p158s5BusDt) {
        this.p158s5BusDt = p158s5BusDt;
    }

    public Short getP158s6BusCycle() {
        return p158s6BusCycle;
    }

    public void setP158s6BusCycle(Short p158s6BusCycle) {
        this.p158s6BusCycle = p158s6BusCycle;
    }

    public Character getP158s7MccOvr() {
        return p158s7MccOvr;
    }

    public void setP158s7MccOvr(Character p158s7MccOvr) {
        this.p158s7MccOvr = p158s7MccOvr;
    }

    public String getP158s8ProdOvr() {
        return p158s8ProdOvr;
    }

    public void setP158s8ProdOvr(String p158s8ProdOvr) {
        this.p158s8ProdOvr = p158s8ProdOvr;
    }

    public Character getP158s9CorpIncrt() {
        return p158s9CorpIncrt;
    }

    public void setP158s9CorpIncrt(Character p158s9CorpIncrt) {
        this.p158s9CorpIncrt = p158s9CorpIncrt;
    }

    public String getP158s10QualLvl() {
        return p158s10QualLvl;
    }

    public void setP158s10QualLvl(String p158s10QualLvl) {
        this.p158s10QualLvl = p158s10QualLvl;
    }

    public String getP159s1SSrvcTai() {
        return p159s1SSrvcTai;
    }

    public void setP159s1SSrvcTai(String p159s1SSrvcTai) {
        this.p159s1SSrvcTai = p159s1SSrvcTai;
    }

    public String getP159s2SSrvctaa() {
        return p159s2SSrvctaa;
    }

    public void setP159s2SSrvctaa(String p159s2SSrvctaa) {
        this.p159s2SSrvctaa = p159s2SSrvctaa;
    }

    public Short getP159s3SSrvcLvl() {
        return p159s3SSrvcLvl;
    }

    public void setP159s3SSrvcLvl(Short p159s3SSrvcLvl) {
        this.p159s3SSrvcLvl = p159s3SSrvcLvl;
    }

    public String getP159s4SSrvcId() {
        return p159s4SSrvcId;
    }

    public void setP159s4SSrvcId(String p159s4SSrvcId) {
        this.p159s4SSrvcId = p159s4SSrvcId;
    }

    public Character getP159s5SFrnexCl() {
        return p159s5SFrnexCl;
    }

    public void setP159s5SFrnexCl(Character p159s5SFrnexCl) {
        this.p159s5SFrnexCl = p159s5SFrnexCl;
    }

    public Integer getP159s6ReconDt() {
        return p159s6ReconDt;
    }

    public void setP159s6ReconDt(Integer p159s6ReconDt) {
        this.p159s6ReconDt = p159s6ReconDt;
    }

    public Short getP159s7ReconCycle() {
        return p159s7ReconCycle;
    }

    public void setP159s7ReconCycle(Short p159s7ReconCycle) {
        this.p159s7ReconCycle = p159s7ReconCycle;
    }

    public Integer getP159s8StlDt() {
        return p159s8StlDt;
    }

    public void setP159s8StlDt(Integer p159s8StlDt) {
        this.p159s8StlDt = p159s8StlDt;
    }

    public Short getP159s9StlCycle() {
        return p159s9StlCycle;
    }

    public void setP159s9StlCycle(Short p159s9StlCycle) {
        this.p159s9StlCycle = p159s9StlCycle;
    }

    public String getP161s1SSrvcTai() {
        return p161s1SSrvcTai;
    }

    public void setP161s1SSrvcTai(String p161s1SSrvcTai) {
        this.p161s1SSrvcTai = p161s1SSrvcTai;
    }

    public String getP161s2SSrvcTaa() {
        return p161s2SSrvcTaa;
    }

    public void setP161s2SSrvcTaa(String p161s2SSrvcTaa) {
        this.p161s2SSrvcTaa = p161s2SSrvcTaa;
    }

    public Short getP161s3SSrvcLvl() {
        return p161s3SSrvcLvl;
    }

    public void setP161s3SSrvcLvl(Short p161s3SSrvcLvl) {
        this.p161s3SSrvcLvl = p161s3SSrvcLvl;
    }

    public String getP161s4SSrvcId() {
        return p161s4SSrvcId;
    }

    public void setP161s4SSrvcId(String p161s4SSrvcId) {
        this.p161s4SSrvcId = p161s4SSrvcId;
    }

    public Character getP161s5SFeRtCl() {
        return p161s5SFeRtCl;
    }

    public void setP161s5SFeRtCl(Character p161s5SFeRtCl) {
        this.p161s5SFeRtCl = p161s5SFeRtCl;
    }

    public Integer getP161s6ReconDt() {
        return p161s6ReconDt;
    }

    public void setP161s6ReconDt(Integer p161s6ReconDt) {
        this.p161s6ReconDt = p161s6ReconDt;
    }

    public Short getP161s7ReconCycle() {
        return p161s7ReconCycle;
    }

    public void setP161s7ReconCycle(Short p161s7ReconCycle) {
        this.p161s7ReconCycle = p161s7ReconCycle;
    }

    public Integer getP161s8SDt() {
        return p161s8SDt;
    }

    public void setP161s8SDt(Integer p161s8SDt) {
        this.p161s8SDt = p161s8SDt;
    }

    public Short getP161s9SCycle() {
        return p161s9SCycle;
    }

    public void setP161s9SCycle(Short p161s9SCycle) {
        this.p161s9SCycle = p161s9SCycle;
    }

    public Character getP165s1StlInd() {
        return p165s1StlInd;
    }

    public void setP165s1StlInd(Character p165s1StlInd) {
        this.p165s1StlInd = p165s1StlInd;
    }

    public String getP165s2StlInfo() {
        return p165s2StlInfo;
    }

    public void setP165s2StlInfo(String p165s2StlInfo) {
        this.p165s2StlInfo = p165s2StlInfo;
    }

    public String getP170s1CustsvcPh() {
        return p170s1CustsvcPh;
    }

    public void setP170s1CustsvcPh(String p170s1CustsvcPh) {
        this.p170s1CustsvcPh = p170s1CustsvcPh;
    }

    public String getP170s2CrdAcpPh() {
        return p170s2CrdAcpPh;
    }

    public void setP170s2CrdAcpPh(String p170s2CrdAcpPh) {
        this.p170s2CrdAcpPh = p170s2CrdAcpPh;
    }

    public String getP170s3AdtlCtInf() {
        return p170s3AdtlCtInf;
    }

    public void setP170s3AdtlCtInf(String p170s3AdtlCtInf) {
        this.p170s3AdtlCtInf = p170s3AdtlCtInf;
    }

    public String getP171s1ChrSetInd() {
        return p171s1ChrSetInd;
    }

    public void setP171s1ChrSetInd(String p171s1ChrSetInd) {
        this.p171s1ChrSetInd = p171s1ChrSetInd;
    }

    public String getP171s2CrdAcpdsc() {
        return p171s2CrdAcpdsc;
    }

    public void setP171s2CrdAcpdsc(String p171s2CrdAcpdsc) {
        this.p171s2CrdAcpdsc = p171s2CrdAcpdsc;
    }

    public String getP172SoleProNm() {
        return p172SoleProNm;
    }

    public void setP172SoleProNm(String p172SoleProNm) {
        this.p172SoleProNm = p172SoleProNm;
    }

    public String getP173LegCorpNm() {
        return p173LegCorpNm;
    }

    public void setP173LegCorpNm(String p173LegCorpNm) {
        this.p173LegCorpNm = p173LegCorpNm;
    }

    public String getP174DunBradNo() {
        return p174DunBradNo;
    }

    public void setP174DunBradNo(String p174DunBradNo) {
        this.p174DunBradNo = p174DunBradNo;
    }

    public String getP175CrdAcpUrl() {
        return p175CrdAcpUrl;
    }

    public void setP175CrdAcpUrl(String p175CrdAcpUrl) {
        this.p175CrdAcpUrl = p175CrdAcpUrl;
    }

    public Character getP189s1FormatNo() {
        return p189s1FormatNo;
    }

    public void setP189s1FormatNo(Character p189s1FormatNo) {
        this.p189s1FormatNo = p189s1FormatNo;
    }

    public String getP189s2PhoneDat() {
        return p189s2PhoneDat;
    }

    public void setP189s2PhoneDat(String p189s2PhoneDat) {
        this.p189s2PhoneDat = p189s2PhoneDat;
    }

    public String getP190PartIdCd() {
        return p190PartIdCd;
    }

    public void setP190PartIdCd(String p190PartIdCd) {
        this.p190PartIdCd = p190PartIdCd;
    }

    public Short getP191OrMsgFmt() {
        return p191OrMsgFmt;
    }

    public void setP191OrMsgFmt(Short p191OrMsgFmt) {
        this.p191OrMsgFmt = p191OrMsgFmt;
    }

    public Short getP228RetrDoc() {
        return p228RetrDoc;
    }

    public void setP228RetrDoc(Short p228RetrDoc) {
        this.p228RetrDoc = p228RetrDoc;
    }

    public Short getP230FulDocCd() {
        return p230FulDocCd;
    }

    public void setP230FulDocCd(Short p230FulDocCd) {
        this.p230FulDocCd = p230FulDocCd;
    }

    public String getP241MstcCntl() {
        return p241MstcCntl;
    }

    public void setP241MstcCntl(String p241MstcCntl) {
        this.p241MstcCntl = p241MstcCntl;
    }

    public Character getP242MstcSrvcI() {
        return p242MstcSrvcI;
    }

    public void setP242MstcSrvcI(Character p242MstcSrvcI) {
        this.p242MstcSrvcI = p242MstcSrvcI;
    }

    public Integer getP243s1McomIRdt() {
        return p243s1McomIRdt;
    }

    public void setP243s1McomIRdt(Integer p243s1McomIRdt) {
        this.p243s1McomIRdt = p243s1McomIRdt;
    }

    public Character getP243s2McomAcqRs() {
        return p243s2McomAcqRs;
    }

    public void setP243s2McomAcqRs(Character p243s2McomAcqRs) {
        this.p243s2McomAcqRs = p243s2McomAcqRs;
    }

    public Integer getP243s3McomARdt() {
        return p243s3McomARdt;
    }

    public void setP243s3McomARdt(Integer p243s3McomARdt) {
        this.p243s3McomARdt = p243s3McomARdt;
    }

    public String getP243s4McomIRc() {
        return p243s4McomIRc;
    }

    public void setP243s4McomIRc(String p243s4McomIRc) {
        this.p243s4McomIRc = p243s4McomIRc;
    }

    public Integer getP243s5McomIRDt() {
        return p243s5McomIRDt;
    }

    public void setP243s5McomIRDt(Integer p243s5McomIRDt) {
        this.p243s5McomIRDt = p243s5McomIRDt;
    }

    public String getP243s6McomIRejr() {
        return p243s6McomIRejr;
    }

    public void setP243s6McomIRejr(String p243s6McomIRejr) {
        this.p243s6McomIRejr = p243s6McomIRejr;
    }

    public Character getP243s7McomImRv() {
        return p243s7McomImRv;
    }

    public void setP243s7McomImRv(Character p243s7McomImRv) {
        this.p243s7McomImRv = p243s7McomImRv;
    }

    public Integer getP243s8McomImRdt() {
        return p243s8McomImRdt;
    }

    public void setP243s8McomImRdt(Integer p243s8McomImRdt) {
        this.p243s8McomImRdt = p243s8McomImRdt;
    }

    public Integer getP244s1McomCbDt() {
        return p244s1McomCbDt;
    }

    public void setP244s1McomCbDt(Integer p244s1McomCbDt) {
        this.p244s1McomCbDt = p244s1McomCbDt;
    }

    public Integer getP244s2McomCbDt2() {
        return p244s2McomCbDt2;
    }

    public void setP244s2McomCbDt2(Integer p244s2McomCbDt2) {
        this.p244s2McomCbDt2 = p244s2McomCbDt2;
    }

    public String getP260s1ExcReqCd() {
        return p260s1ExcReqCd;
    }

    public void setP260s1ExcReqCd(String p260s1ExcReqCd) {
        this.p260s1ExcReqCd = p260s1ExcReqCd;
    }

    public Character getP260s2ExcRsnCd() {
        return p260s2ExcRsnCd;
    }

    public void setP260s2ExcRsnCd(Character p260s2ExcRsnCd) {
        this.p260s2ExcRsnCd = p260s2ExcRsnCd;
    }

    public Character getP260s3ExcResCd() {
        return p260s3ExcResCd;
    }

    public void setP260s3ExcResCd(Character p260s3ExcResCd) {
        this.p260s3ExcResCd = p260s3ExcResCd;
    }

    public Short getP262DocIndctr() {
        return p262DocIndctr;
    }

    public void setP262DocIndctr(Short p262DocIndctr) {
        this.p262DocIndctr = p262DocIndctr;
    }

    public Short getP264OrRetrRsn() {
        return p264OrRetrRsn;
    }

    public void setP264OrRetrRsn(Short p264OrRetrRsn) {
        this.p264OrRetrRsn = p264OrRetrRsn;
    }

    public Short getP265s1IMsgRsn() {
        return p265s1IMsgRsn;
    }

    public void setP265s1IMsgRsn(Short p265s1IMsgRsn) {
        this.p265s1IMsgRsn = p265s1IMsgRsn;
    }

    public Integer getP265s2IPsntBus() {
        return p265s2IPsntBus;
    }

    public void setP265s2IPsntBus(Integer p265s2IPsntBus) {
        this.p265s2IPsntBus = p265s2IPsntBus;
    }

    public String getP265s3IDatRec() {
        return p265s3IDatRec;
    }

    public void setP265s3IDatRec(String p265s3IDatRec) {
        this.p265s3IDatRec = p265s3IDatRec;
    }

    public Short getP266s1MsgRsnCd() {
        return p266s1MsgRsnCd;
    }

    public void setP266s1MsgRsnCd(Short p266s1MsgRsnCd) {
        this.p266s1MsgRsnCd = p266s1MsgRsnCd;
    }

    public Integer getP266s2FstrtnDt() {
        return p266s2FstrtnDt;
    }

    public void setP266s2FstrtnDt(Integer p266s2FstrtnDt) {
        this.p266s2FstrtnDt = p266s2FstrtnDt;
    }

    public Character getP266s3EditExRsn() {
        return p266s3EditExRsn;
    }

    public void setP266s3EditExRsn(Character p266s3EditExRsn) {
        this.p266s3EditExRsn = p266s3EditExRsn;
    }

    public Character getP266s4EditExRes() {
        return p266s4EditExRes;
    }

    public void setP266s4EditExRes(Character p266s4EditExRes) {
        this.p266s4EditExRes = p266s4EditExRes;
    }

    public BigDecimal getP266s5FstrtnAmt() {
        return p266s5FstrtnAmt;
    }

    public void setP266s5FstrtnAmt(BigDecimal p266s5FstrtnAmt) {
        this.p266s5FstrtnAmt = p266s5FstrtnAmt;
    }

    public Short getP266s6FstRtnCur() {
        return p266s6FstRtnCur;
    }

    public void setP266s6FstRtnCur(Short p266s6FstRtnCur) {
        this.p266s6FstRtnCur = p266s6FstRtnCur;
    }

    public String getP266s7FstRtnDat() {
        return p266s7FstRtnDat;
    }

    public void setP266s7FstRtnDat(String p266s7FstRtnDat) {
        this.p266s7FstRtnDat = p266s7FstRtnDat;
    }

    public Short getP267s1MsgRsnCd() {
        return p267s1MsgRsnCd;
    }

    public void setP267s1MsgRsnCd(Short p267s1MsgRsnCd) {
        this.p267s1MsgRsnCd = p267s1MsgRsnCd;
    }

    public Integer getP267s2SecRtnDt() {
        return p267s2SecRtnDt;
    }

    public void setP267s2SecRtnDt(Integer p267s2SecRtnDt) {
        this.p267s2SecRtnDt = p267s2SecRtnDt;
    }

    public Character getP267s3EditExRsn() {
        return p267s3EditExRsn;
    }

    public void setP267s3EditExRsn(Character p267s3EditExRsn) {
        this.p267s3EditExRsn = p267s3EditExRsn;
    }

    public Character getP267s4EditExRes() {
        return p267s4EditExRes;
    }

    public void setP267s4EditExRes(Character p267s4EditExRes) {
        this.p267s4EditExRes = p267s4EditExRes;
    }

    public BigDecimal getP267s5SecRtnAmt() {
        return p267s5SecRtnAmt;
    }

    public void setP267s5SecRtnAmt(BigDecimal p267s5SecRtnAmt) {
        this.p267s5SecRtnAmt = p267s5SecRtnAmt;
    }

    public Short getP267s6SecRtnCur() {
        return p267s6SecRtnCur;
    }

    public void setP267s6SecRtnCur(Short p267s6SecRtnCur) {
        this.p267s6SecRtnCur = p267s6SecRtnCur;
    }

    public String getP267s7SecRtnDat() {
        return p267s7SecRtnDat;
    }

    public void setP267s7SecRtnDat(String p267s7SecRtnDat) {
        this.p267s7SecRtnDat = p267s7SecRtnDat;
    }

    public BigDecimal getP268s1PrtTrnAmt() {
        return p268s1PrtTrnAmt;
    }

    public void setP268s1PrtTrnAmt(BigDecimal p268s1PrtTrnAmt) {
        this.p268s1PrtTrnAmt = p268s1PrtTrnAmt;
    }

    public Short getP268s2PrtTranCc() {
        return p268s2PrtTranCc;
    }

    public void setP268s2PrtTranCc(Short p268s2PrtTranCc) {
        this.p268s2PrtTranCc = p268s2PrtTranCc;
    }

    public String getP375MbrRcnInd() {
        return p375MbrRcnInd;
    }

    public void setP375MbrRcnInd(String p375MbrRcnInd) {
        this.p375MbrRcnInd = p375MbrRcnInd;
    }

    public String getP376MbrRcnInd() {
        return p376MbrRcnInd;
    }

    public void setP376MbrRcnInd(String p376MbrRcnInd) {
        this.p376MbrRcnInd = p376MbrRcnInd;
    }

    public String getP1000MbrToMbr() {
        return p1000MbrToMbr;
    }

    public void setP1000MbrToMbr(String p1000MbrToMbr) {
        this.p1000MbrToMbr = p1000MbrToMbr;
    }

    public Short getU0001Status() {
        return u0001Status;
    }

    public void setU0001Status(Short u0001Status) {
        this.u0001Status = u0001Status;
    }

    public String getU0002StatusMsg() {
        return u0002StatusMsg;
    }

    public void setU0002StatusMsg(String u0002StatusMsg) {
        this.u0002StatusMsg = u0002StatusMsg;
    }

    public String getU0003CreatedId() {
        return u0003CreatedId;
    }

    public void setU0003CreatedId(String u0003CreatedId) {
        this.u0003CreatedId = u0003CreatedId;
    }

    public Date getU0004CreatedDt() {
        return u0004CreatedDt;
    }

    public void setU0004CreatedDt(Date u0004CreatedDt) {
        this.u0004CreatedDt = u0004CreatedDt;
    }

    public Date getU0005CreatedRm() {
        return u0005CreatedRm;
    }

    public void setU0005CreatedRm(Date u0005CreatedRm) {
        this.u0005CreatedRm = u0005CreatedRm;
    }

    public String getU0006LastupdId() {
        return u0006LastupdId;
    }

    public void setU0006LastupdId(String u0006LastupdId) {
        this.u0006LastupdId = u0006LastupdId;
    }

    public Date getU0007LastupdDt() {
        return u0007LastupdDt;
    }

    public void setU0007LastupdDt(Date u0007LastupdDt) {
        this.u0007LastupdDt = u0007LastupdDt;
    }

    public Date getU0008LastupdTm() {
        return u0008LastupdTm;
    }

    public void setU0008LastupdTm(Date u0008LastupdTm) {
        this.u0008LastupdTm = u0008LastupdTm;
    }

    public Character getU0009FulfilStat() {
        return u0009FulfilStat;
    }

    public void setU0009FulfilStat(Character u0009FulfilStat) {
        this.u0009FulfilStat = u0009FulfilStat;
    }

    public Date getU0010FulfilDt() {
        return u0010FulfilDt;
    }

    public void setU0010FulfilDt(Date u0010FulfilDt) {
        this.u0010FulfilDt = u0010FulfilDt;
    }

    public Character getU0011NoActStat() {
        return u0011NoActStat;
    }

    public void setU0011NoActStat(Character u0011NoActStat) {
        this.u0011NoActStat = u0011NoActStat;
    }

    public Date getU0012NoActDt() {
        return u0012NoActDt;
    }

    public void setU0012NoActDt(Date u0012NoActDt) {
        this.u0012NoActDt = u0012NoActDt;
    }

    public Date getU0013CbInitDt() {
        return u0013CbInitDt;
    }

    public void setU0013CbInitDt(Date u0013CbInitDt) {
        this.u0013CbInitDt = u0013CbInitDt;
    }

    public String getU0014GeacRef() {
        return u0014GeacRef;
    }

    public void setU0014GeacRef(String u0014GeacRef) {
        this.u0014GeacRef = u0014GeacRef;
    }

    public String getU0015AcctCde() {
        return u0015AcctCde;
    }

    public void setU0015AcctCde(String u0015AcctCde) {
        this.u0015AcctCde = u0015AcctCde;
    }

    public Integer getU0016DateSent() {
        return u0016DateSent;
    }

    public void setU0016DateSent(Integer u0016DateSent) {
        this.u0016DateSent = u0016DateSent;
    }

    public Integer getU0017DateInQ() {
        return u0017DateInQ;
    }

    public void setU0017DateInQ(Integer u0017DateInQ) {
        this.u0017DateInQ = u0017DateInQ;
    }

    public Character getU00182ndDocInd() {
        return u00182ndDocInd;
    }

    public void setU00182ndDocInd(Character u00182ndDocInd) {
        this.u00182ndDocInd = u00182ndDocInd;
    }

    public Character getU0019CameFrom() {
        return u0019CameFrom;
    }

    public void setU0019CameFrom(Character u0019CameFrom) {
        this.u0019CameFrom = u0019CameFrom;
    }

    public String getU0100NoteDetail() {
        return u0100NoteDetail;
    }

    public void setU0100NoteDetail(String u0100NoteDetail) {
        this.u0100NoteDetail = u0100NoteDetail;
    }

    public String getU0020FulDate() {
        return u0020FulDate;
    }

    public void setU0020FulDate(String u0020FulDate) {
        this.u0020FulDate = u0020FulDate;
    }

    public String getU0021ActDate() {
        return u0021ActDate;
    }

    public void setU0021ActDate(String u0021ActDate) {
        this.u0021ActDate = u0021ActDate;
    }

    public Character getU0022InProcess() {
        return u0022InProcess;
    }

    public void setU0022InProcess(Character u0022InProcess) {
        this.u0022InProcess = u0022InProcess;
    }

    public long getP263LfcycCd() {
        return p263LfcycCd;
    }

    public void setP263LfcycCd(long p263LfcycCd) {
        this.p263LfcycCd = p263LfcycCd;
    }

    public String getP3ProdId() {
        return p3ProdId;
    }

    public void setP3ProdId(String p3ProdId) {
        this.p3ProdId = p3ProdId;
    }

    public Character getP158s11McmrchOvr() {
        return p158s11McmrchOvr;
    }

    public void setP158s11McmrchOvr(Character p158s11McmrchOvr) {
        this.p158s11McmrchOvr = p158s11McmrchOvr;
    }

    public String getP176Mcmrch() {
        return p176Mcmrch;
    }

    public void setP176Mcmrch(String p176Mcmrch) {
        this.p176Mcmrch = p176Mcmrch;
    }

    public long getP208s1PayFacilId() {
        return p208s1PayFacilId;
    }

    public void setP208s1PayFacilId(long p208s1PayFacilId) {
        this.p208s1PayFacilId = p208s1PayFacilId;
    }

    public String getP208s2SubMerchId() {
        return p208s2SubMerchId;
    }

    public void setP208s2SubMerchId(String p208s2SubMerchId) {
        this.p208s2SubMerchId = p208s2SubMerchId;
    }

    public long getP209IndepSalOrgId() {
        return p209IndepSalOrgId;
    }

    public void setP209IndepSalOrgId(long p209IndepSalOrgId) {
        this.p209IndepSalOrgId = p209IndepSalOrgId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcCbertPK != null ? mcCbertPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McCbert)) {
            return false;
        }
        McCbert other = (McCbert) object;
        if ((this.mcCbertPK == null && other.mcCbertPK != null) || (this.mcCbertPK != null && !this.mcCbertPK.equals(other.mcCbertPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McCbert[ mcCbertPK=" + mcCbertPK + " ]";
    }

}
