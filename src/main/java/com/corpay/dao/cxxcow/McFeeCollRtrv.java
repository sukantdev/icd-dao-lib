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
@Table(name = "MC_FEE_COLL_RTRV", catalog = "", schema = "CXXCOW")
public class McFeeCollRtrv implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McFeeCollRtrvPK mcFeeCollRtrvPK;
    @Column(name = "MSG_TY_ID")
    private Short msgTyId;
    @Column(name = "BIT_MAP_PRI")
    private String bitMapPri;
    @Column(name = "D1_BIT_MAP_SEC")
    private String d1BitMapSec;
    @Column(name = "D2_PRI_ACCNT_NO")
    private String d2PriAccntNo;
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
    @Column(name = "D9_RECON_CONV_RT")
    private BigDecimal d9ReconConvRt;
    @Column(name = "D14_EXP_DT")
    private Short d14ExpDt;
    @Column(name = "D23_CARD_SEQ_NO")
    private Short d23CardSeqNo;
    @Column(name = "D24_FUNC_CD")
    private Short d24FuncCd;
    @Column(name = "D25_MSG_RSN_CD")
    private Short d25MsgRsnCd;
    @Column(name = "D30S1_TR_ORIG_AMT")
    private BigDecimal d30s1TrOrigAmt;
    @Column(name = "D30S2_RN_ORIG_AMT")
    private BigDecimal d30s2RnOrigAmt;
    @Column(name = "D26_CRD_ACPTRBUS")
    private Short d26CrdAcptrbus;
    @Column(name = "D31S1_IC_RT_DSGTR")
    private Short d31s1IcRtDsgtr;
    @Column(name = "D31S2_ACQUIR_BIN")
    private Integer d31s2AcquirBin;
    @Column(name = "D31S3_JUL_PRC_DT")
    private Short d31s3JulPrcDt;
    @Column(name = "D31S4_ACQ_SEQ_NO")
    private Long d31s4AcqSeqNo;
    @Column(name = "D31S5_CHECK_DIGIT")
    private Short d31s5CheckDigit;
    @Column(name = "D33_FWDNG_INST_CD")
    private Long d33FwdngInstCd;
    @Column(name = "D37_RETR_REF_NO")
    private String d37RetrRefNo;
    @Column(name = "D38_APPRVL_CD")
    private String d38ApprvlCd;
    @Column(name = "D41_CRD_ACPR_TRM")
    private String d41CrdAcprTrm;
    @Column(name = "D42_CRD_ACPR_ID")
    private String d42CrdAcprId;
    @Basic(optional = false)
    @Column(name = "MC_MERCH_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mcMerchId;
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
    @Column(name = "P025S1_MSG_REV")
    private Character p025s1MsgRev;
    @Column(name = "P025S2_CPRDTORIG")
    private Integer p025s2Cprdtorig;
    @Column(name = "P137_FEE_COL_CNTL")
    private String p137FeeColCntl;
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
    @Column(name = "P262_DOC_INDCTR")
    private Short p262DocIndctr;
    @Column(name = "P264_OR_RETR_RSN")
    private Short p264OrRetrRsn;
    @Column(name = "P375_MBR_RCN_IND")
    private String p375MbrRcnInd;
    @Column(name = "P376_MBR_RCN_IND")
    private String p376MbrRcnInd;
    @Column(name = "D49_TRAN_CURR_CD")
    private Short d49TranCurrCd;
    @Column(name = "D50_RECON_CUR_CD")
    private Short d50ReconCurCd;
    @Column(name = "D51_CH_BL_CUR_CD")
    private Short d51ChBlCurCd;
    @Column(name = "D55_INTD_CIR_SYS")
    private String d55IntdCirSys;
    @Column(name = "D62_ADDTL_DATA_2")
    private String d62AddtlData2;
    @Column(name = "D63S1_LFCYC_SP_IND")
    private Character d63s1LfcycSpInd;
    @Column(name = "D63S2_TRACE_ID")
    private String d63s2TraceId;
    @Column(name = "D63S3_VALIDN_CD")
    private String d63s3ValidnCd;
    @Column(name = "D63S4_LFCYCTR_SEQ")
    private String d63s4LfcyctrSeq;
    @Column(name = "D63S5_LFCYCTR_TOT")
    private String d63s5LfcyctrTot;
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
    @Column(name = "P3_PROD_ID")
    private String p3ProdId;
    @Basic(optional = false)
    @Column(name = "P158S11_MCMRCH_OVR")
    private Character p158s11McmrchOvr;

    public McFeeCollRtrv() {
    }

    public McFeeCollRtrv(McFeeCollRtrvPK mcFeeCollRtrvPK) {
        this.mcFeeCollRtrvPK = mcFeeCollRtrvPK;
    }

    public McFeeCollRtrv(McFeeCollRtrvPK mcFeeCollRtrvPK, Date mcMerchId, Character p158s11McmrchOvr) {
        this.mcFeeCollRtrvPK = mcFeeCollRtrvPK;
        this.mcMerchId = mcMerchId;
        this.p158s11McmrchOvr = p158s11McmrchOvr;
    }

    public McFeeCollRtrv(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcFeeCollRtrvPK = new McFeeCollRtrvPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McFeeCollRtrvPK getMcFeeCollRtrvPK() {
        return mcFeeCollRtrvPK;
    }

    public void setMcFeeCollRtrvPK(McFeeCollRtrvPK mcFeeCollRtrvPK) {
        this.mcFeeCollRtrvPK = mcFeeCollRtrvPK;
    }

    public Short getMsgTyId() {
        return msgTyId;
    }

    public void setMsgTyId(Short msgTyId) {
        this.msgTyId = msgTyId;
    }

    public String getBitMapPri() {
        return bitMapPri;
    }

    public void setBitMapPri(String bitMapPri) {
        this.bitMapPri = bitMapPri;
    }

    public String getD1BitMapSec() {
        return d1BitMapSec;
    }

    public void setD1BitMapSec(String d1BitMapSec) {
        this.d1BitMapSec = d1BitMapSec;
    }

    public String getD2PriAccntNo() {
        return d2PriAccntNo;
    }

    public void setD2PriAccntNo(String d2PriAccntNo) {
        this.d2PriAccntNo = d2PriAccntNo;
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

    public BigDecimal getD9ReconConvRt() {
        return d9ReconConvRt;
    }

    public void setD9ReconConvRt(BigDecimal d9ReconConvRt) {
        this.d9ReconConvRt = d9ReconConvRt;
    }

    public Short getD14ExpDt() {
        return d14ExpDt;
    }

    public void setD14ExpDt(Short d14ExpDt) {
        this.d14ExpDt = d14ExpDt;
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

    public BigDecimal getD30s1TrOrigAmt() {
        return d30s1TrOrigAmt;
    }

    public void setD30s1TrOrigAmt(BigDecimal d30s1TrOrigAmt) {
        this.d30s1TrOrigAmt = d30s1TrOrigAmt;
    }

    public BigDecimal getD30s2RnOrigAmt() {
        return d30s2RnOrigAmt;
    }

    public void setD30s2RnOrigAmt(BigDecimal d30s2RnOrigAmt) {
        this.d30s2RnOrigAmt = d30s2RnOrigAmt;
    }

    public Short getD26CrdAcptrbus() {
        return d26CrdAcptrbus;
    }

    public void setD26CrdAcptrbus(Short d26CrdAcptrbus) {
        this.d26CrdAcptrbus = d26CrdAcptrbus;
    }

    public Short getD31s1IcRtDsgtr() {
        return d31s1IcRtDsgtr;
    }

    public void setD31s1IcRtDsgtr(Short d31s1IcRtDsgtr) {
        this.d31s1IcRtDsgtr = d31s1IcRtDsgtr;
    }

    public Integer getD31s2AcquirBin() {
        return d31s2AcquirBin;
    }

    public void setD31s2AcquirBin(Integer d31s2AcquirBin) {
        this.d31s2AcquirBin = d31s2AcquirBin;
    }

    public Short getD31s3JulPrcDt() {
        return d31s3JulPrcDt;
    }

    public void setD31s3JulPrcDt(Short d31s3JulPrcDt) {
        this.d31s3JulPrcDt = d31s3JulPrcDt;
    }

    public Long getD31s4AcqSeqNo() {
        return d31s4AcqSeqNo;
    }

    public void setD31s4AcqSeqNo(Long d31s4AcqSeqNo) {
        this.d31s4AcqSeqNo = d31s4AcqSeqNo;
    }

    public Short getD31s5CheckDigit() {
        return d31s5CheckDigit;
    }

    public void setD31s5CheckDigit(Short d31s5CheckDigit) {
        this.d31s5CheckDigit = d31s5CheckDigit;
    }

    public Long getD33FwdngInstCd() {
        return d33FwdngInstCd;
    }

    public void setD33FwdngInstCd(Long d33FwdngInstCd) {
        this.d33FwdngInstCd = d33FwdngInstCd;
    }

    public String getD37RetrRefNo() {
        return d37RetrRefNo;
    }

    public void setD37RetrRefNo(String d37RetrRefNo) {
        this.d37RetrRefNo = d37RetrRefNo;
    }

    public String getD38ApprvlCd() {
        return d38ApprvlCd;
    }

    public void setD38ApprvlCd(String d38ApprvlCd) {
        this.d38ApprvlCd = d38ApprvlCd;
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

    public Date getMcMerchId() {
        return mcMerchId;
    }

    public void setMcMerchId(Date mcMerchId) {
        this.mcMerchId = mcMerchId;
    }

    public String getD48AddtlDat() {
        return d48AddtlDat;
    }

    public void setD48AddtlDat(String d48AddtlDat) {
        this.d48AddtlDat = d48AddtlDat;
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

    public String getP137FeeColCntl() {
        return p137FeeColCntl;
    }

    public void setP137FeeColCntl(String p137FeeColCntl) {
        this.p137FeeColCntl = p137FeeColCntl;
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

    public Short getD51ChBlCurCd() {
        return d51ChBlCurCd;
    }

    public void setD51ChBlCurCd(Short d51ChBlCurCd) {
        this.d51ChBlCurCd = d51ChBlCurCd;
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

    public String getD63s3ValidnCd() {
        return d63s3ValidnCd;
    }

    public void setD63s3ValidnCd(String d63s3ValidnCd) {
        this.d63s3ValidnCd = d63s3ValidnCd;
    }

    public String getD63s4LfcyctrSeq() {
        return d63s4LfcyctrSeq;
    }

    public void setD63s4LfcyctrSeq(String d63s4LfcyctrSeq) {
        this.d63s4LfcyctrSeq = d63s4LfcyctrSeq;
    }

    public String getD63s5LfcyctrTot() {
        return d63s5LfcyctrTot;
    }

    public void setD63s5LfcyctrTot(String d63s5LfcyctrTot) {
        this.d63s5LfcyctrTot = d63s5LfcyctrTot;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcFeeCollRtrvPK != null ? mcFeeCollRtrvPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McFeeCollRtrv)) {
            return false;
        }
        McFeeCollRtrv other = (McFeeCollRtrv) object;
        if ((this.mcFeeCollRtrvPK == null && other.mcFeeCollRtrvPK != null) || (this.mcFeeCollRtrvPK != null && !this.mcFeeCollRtrvPK.equals(other.mcFeeCollRtrvPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McFeeCollRtrv[ mcFeeCollRtrvPK=" + mcFeeCollRtrvPK + " ]";
    }

}
