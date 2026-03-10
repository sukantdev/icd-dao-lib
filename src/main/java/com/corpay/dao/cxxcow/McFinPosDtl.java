/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_FIN_POS_DTL", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McFinPosDtl.findAll", query = "SELECT m FROM McFinPosDtl m"),
    @NamedQuery(name = "McFinPosDtl.findByP105s1FileTy", query = "SELECT m FROM McFinPosDtl m WHERE m.mcFinPosDtlPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McFinPosDtl.findByP105s2FileRDt", query = "SELECT m FROM McFinPosDtl m WHERE m.mcFinPosDtlPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McFinPosDtl.findByP105s3ProcId", query = "SELECT m FROM McFinPosDtl m WHERE m.mcFinPosDtlPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McFinPosDtl.findByP105s4FileSeqNo", query = "SELECT m FROM McFinPosDtl m WHERE m.mcFinPosDtlPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McFinPosDtl.findByMsgTyId", query = "SELECT m FROM McFinPosDtl m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McFinPosDtl.findByBitMapPri", query = "SELECT m FROM McFinPosDtl m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McFinPosDtl.findByD1BitMapSec", query = "SELECT m FROM McFinPosDtl m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McFinPosDtl.findByD24FuncCd", query = "SELECT m FROM McFinPosDtl m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McFinPosDtl.findByD25MsgRsnCd", query = "SELECT m FROM McFinPosDtl m WHERE m.d25MsgRsnCd = :d25MsgRsnCd"),
    @NamedQuery(name = "McFinPosDtl.findByD32AcqInstIdCd", query = "SELECT m FROM McFinPosDtl m WHERE m.d32AcqInstIdCd = :d32AcqInstIdCd"),
    @NamedQuery(name = "McFinPosDtl.findByD48AddtlDat", query = "SELECT m FROM McFinPosDtl m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McFinPosDtl.findByP165s1StlInd", query = "SELECT m FROM McFinPosDtl m WHERE m.p165s1StlInd = :p165s1StlInd"),
    @NamedQuery(name = "McFinPosDtl.findByP165s2StlInfo", query = "SELECT m FROM McFinPosDtl m WHERE m.p165s2StlInfo = :p165s2StlInfo"),
    @NamedQuery(name = "McFinPosDtl.findByP298s1TranmsnTy", query = "SELECT m FROM McFinPosDtl m WHERE m.p298s1TranmsnTy = :p298s1TranmsnTy"),
    @NamedQuery(name = "McFinPosDtl.findByP298s2TrRefDt", query = "SELECT m FROM McFinPosDtl m WHERE m.p298s2TrRefDt = :p298s2TrRefDt"),
    @NamedQuery(name = "McFinPosDtl.findByP298s3ProcId", query = "SELECT m FROM McFinPosDtl m WHERE m.p298s3ProcId = :p298s3ProcId"),
    @NamedQuery(name = "McFinPosDtl.findByP298s4TrSeqNo", query = "SELECT m FROM McFinPosDtl m WHERE m.p298s4TrSeqNo = :p298s4TrSeqNo"),
    @NamedQuery(name = "McFinPosDtl.findByP300s1FileTy", query = "SELECT m FROM McFinPosDtl m WHERE m.p300s1FileTy = :p300s1FileTy"),
    @NamedQuery(name = "McFinPosDtl.findByP300s2FileRefDt", query = "SELECT m FROM McFinPosDtl m WHERE m.p300s2FileRefDt = :p300s2FileRefDt"),
    @NamedQuery(name = "McFinPosDtl.findByP300s3ProcId", query = "SELECT m FROM McFinPosDtl m WHERE m.p300s3ProcId = :p300s3ProcId"),
    @NamedQuery(name = "McFinPosDtl.findByP300s4FileSeqNo", query = "SELECT m FROM McFinPosDtl m WHERE m.p300s4FileSeqNo = :p300s4FileSeqNo"),
    @NamedQuery(name = "McFinPosDtl.findByP302MbrActRec", query = "SELECT m FROM McFinPosDtl m WHERE m.p302MbrActRec = :p302MbrActRec"),
    @NamedQuery(name = "McFinPosDtl.findByP358s1AcpBrand", query = "SELECT m FROM McFinPosDtl m WHERE m.p358s1AcpBrand = :p358s1AcpBrand"),
    @NamedQuery(name = "McFinPosDtl.findByP358s2BusSrvcLv", query = "SELECT m FROM McFinPosDtl m WHERE m.p358s2BusSrvcLv = :p358s2BusSrvcLv"),
    @NamedQuery(name = "McFinPosDtl.findByP358s3BusSrvcId", query = "SELECT m FROM McFinPosDtl m WHERE m.p358s3BusSrvcId = :p358s3BusSrvcId"),
    @NamedQuery(name = "McFinPosDtl.findByP358s4IRtDsgntr", query = "SELECT m FROM McFinPosDtl m WHERE m.p358s4IRtDsgntr = :p358s4IRtDsgntr"),
    @NamedQuery(name = "McFinPosDtl.findByP358s5BusDt", query = "SELECT m FROM McFinPosDtl m WHERE m.p358s5BusDt = :p358s5BusDt"),
    @NamedQuery(name = "McFinPosDtl.findByP358s6BusCycle", query = "SELECT m FROM McFinPosDtl m WHERE m.p358s6BusCycle = :p358s6BusCycle"),
    @NamedQuery(name = "McFinPosDtl.findByP358s7MccOvr", query = "SELECT m FROM McFinPosDtl m WHERE m.p358s7MccOvr = :p358s7MccOvr"),
    @NamedQuery(name = "McFinPosDtl.findByP358s8ProdOvr", query = "SELECT m FROM McFinPosDtl m WHERE m.p358s8ProdOvr = :p358s8ProdOvr"),
    @NamedQuery(name = "McFinPosDtl.findByP358s9CorpIncrt", query = "SELECT m FROM McFinPosDtl m WHERE m.p358s9CorpIncrt = :p358s9CorpIncrt"),
    @NamedQuery(name = "McFinPosDtl.findByP358s10QualLvl", query = "SELECT m FROM McFinPosDtl m WHERE m.p358s10QualLvl = :p358s10QualLvl"),
    @NamedQuery(name = "McFinPosDtl.findByP359s1StlsrvcTai", query = "SELECT m FROM McFinPosDtl m WHERE m.p359s1StlsrvcTai = :p359s1StlsrvcTai"),
    @NamedQuery(name = "McFinPosDtl.findByP359s2StlsrvcTaa", query = "SELECT m FROM McFinPosDtl m WHERE m.p359s2StlsrvcTaa = :p359s2StlsrvcTaa"),
    @NamedQuery(name = "McFinPosDtl.findByP359s3StlsrvcLvl", query = "SELECT m FROM McFinPosDtl m WHERE m.p359s3StlsrvcLvl = :p359s3StlsrvcLvl"),
    @NamedQuery(name = "McFinPosDtl.findByP359s4StlsrvcId", query = "SELECT m FROM McFinPosDtl m WHERE m.p359s4StlsrvcId = :p359s4StlsrvcId"),
    @NamedQuery(name = "McFinPosDtl.findByP359s5StlfexRtC", query = "SELECT m FROM McFinPosDtl m WHERE m.p359s5StlfexRtC = :p359s5StlfexRtC"),
    @NamedQuery(name = "McFinPosDtl.findByP359s6ReconDt", query = "SELECT m FROM McFinPosDtl m WHERE m.p359s6ReconDt = :p359s6ReconDt"),
    @NamedQuery(name = "McFinPosDtl.findByP359s7ReconCd", query = "SELECT m FROM McFinPosDtl m WHERE m.p359s7ReconCd = :p359s7ReconCd"),
    @NamedQuery(name = "McFinPosDtl.findByP359s8StlDt", query = "SELECT m FROM McFinPosDtl m WHERE m.p359s8StlDt = :p359s8StlDt"),
    @NamedQuery(name = "McFinPosDtl.findByP359s9StlCycle", query = "SELECT m FROM McFinPosDtl m WHERE m.p359s9StlCycle = :p359s9StlCycle"),
    @NamedQuery(name = "McFinPosDtl.findByP370s1BegActRng", query = "SELECT m FROM McFinPosDtl m WHERE m.p370s1BegActRng = :p370s1BegActRng"),
    @NamedQuery(name = "McFinPosDtl.findByP370s2EndActRng", query = "SELECT m FROM McFinPosDtl m WHERE m.p370s2EndActRng = :p370s2EndActRng"),
    @NamedQuery(name = "McFinPosDtl.findByP371MsgRsnCdR", query = "SELECT m FROM McFinPosDtl m WHERE m.p371MsgRsnCdR = :p371MsgRsnCdR"),
    @NamedQuery(name = "McFinPosDtl.findByP372s1MsgTyId", query = "SELECT m FROM McFinPosDtl m WHERE m.p372s1MsgTyId = :p372s1MsgTyId"),
    @NamedQuery(name = "McFinPosDtl.findByP372s2FuncCd", query = "SELECT m FROM McFinPosDtl m WHERE m.p372s2FuncCd = :p372s2FuncCd"),
    @NamedQuery(name = "McFinPosDtl.findByP373CrdaidRcn", query = "SELECT m FROM McFinPosDtl m WHERE m.p373CrdaidRcn = :p373CrdaidRcn"),
    @NamedQuery(name = "McFinPosDtl.findByP374PrccdRcn", query = "SELECT m FROM McFinPosDtl m WHERE m.p374PrccdRcn = :p374PrccdRcn"),
    @NamedQuery(name = "McFinPosDtl.findByP375MbrRcnInd", query = "SELECT m FROM McFinPosDtl m WHERE m.p375MbrRcnInd = :p375MbrRcnInd"),
    @NamedQuery(name = "McFinPosDtl.findByP376MbrRcnInd", query = "SELECT m FROM McFinPosDtl m WHERE m.p376MbrRcnInd = :p376MbrRcnInd"),
    @NamedQuery(name = "McFinPosDtl.findByP378OrgRevTot", query = "SELECT m FROM McFinPosDtl m WHERE m.p378OrgRevTot = :p378OrgRevTot"),
    @NamedQuery(name = "McFinPosDtl.findByP380s1DbCrInd", query = "SELECT m FROM McFinPosDtl m WHERE m.p380s1DbCrInd = :p380s1DbCrInd"),
    @NamedQuery(name = "McFinPosDtl.findByP380s2TranAmt", query = "SELECT m FROM McFinPosDtl m WHERE m.p380s2TranAmt = :p380s2TranAmt"),
    @NamedQuery(name = "McFinPosDtl.findByP381s1DbCrInd", query = "SELECT m FROM McFinPosDtl m WHERE m.p381s1DbCrInd = :p381s1DbCrInd"),
    @NamedQuery(name = "McFinPosDtl.findByP381s2TranAmt", query = "SELECT m FROM McFinPosDtl m WHERE m.p381s2TranAmt = :p381s2TranAmt"),
    @NamedQuery(name = "McFinPosDtl.findByP384s1DbCrInd", query = "SELECT m FROM McFinPosDtl m WHERE m.p384s1DbCrInd = :p384s1DbCrInd"),
    @NamedQuery(name = "McFinPosDtl.findByP384s2NetAmt", query = "SELECT m FROM McFinPosDtl m WHERE m.p384s2NetAmt = :p384s2NetAmt"),
    @NamedQuery(name = "McFinPosDtl.findByP390s1DbInd", query = "SELECT m FROM McFinPosDtl m WHERE m.p390s1DbInd = :p390s1DbInd"),
    @NamedQuery(name = "McFinPosDtl.findByP390s2TranAmt", query = "SELECT m FROM McFinPosDtl m WHERE m.p390s2TranAmt = :p390s2TranAmt"),
    @NamedQuery(name = "McFinPosDtl.findByP391s1CrInd", query = "SELECT m FROM McFinPosDtl m WHERE m.p391s1CrInd = :p391s1CrInd"),
    @NamedQuery(name = "McFinPosDtl.findByP391s2TranAmt", query = "SELECT m FROM McFinPosDtl m WHERE m.p391s2TranAmt = :p391s2TranAmt"),
    @NamedQuery(name = "McFinPosDtl.findByP394s1NetDbInd", query = "SELECT m FROM McFinPosDtl m WHERE m.p394s1NetDbInd = :p394s1NetDbInd"),
    @NamedQuery(name = "McFinPosDtl.findByP394s2NetTrAmt", query = "SELECT m FROM McFinPosDtl m WHERE m.p394s2NetTrAmt = :p394s2NetTrAmt"),
    @NamedQuery(name = "McFinPosDtl.findByP395s1NetCrInd", query = "SELECT m FROM McFinPosDtl m WHERE m.p395s1NetCrInd = :p395s1NetCrInd"),
    @NamedQuery(name = "McFinPosDtl.findByP395s2NetTrnAmt", query = "SELECT m FROM McFinPosDtl m WHERE m.p395s2NetTrnAmt = :p395s2NetTrnAmt"),
    @NamedQuery(name = "McFinPosDtl.findByP396s1NetInd", query = "SELECT m FROM McFinPosDtl m WHERE m.p396s1NetInd = :p396s1NetInd"),
    @NamedQuery(name = "McFinPosDtl.findByP396s2NetTrnAmt", query = "SELECT m FROM McFinPosDtl m WHERE m.p396s2NetTrnAmt = :p396s2NetTrnAmt"),
    @NamedQuery(name = "McFinPosDtl.findByP400TranNoDbs", query = "SELECT m FROM McFinPosDtl m WHERE m.p400TranNoDbs = :p400TranNoDbs"),
    @NamedQuery(name = "McFinPosDtl.findByP401TranNoCrs", query = "SELECT m FROM McFinPosDtl m WHERE m.p401TranNoCrs = :p401TranNoCrs"),
    @NamedQuery(name = "McFinPosDtl.findByP402TranNoTot", query = "SELECT m FROM McFinPosDtl m WHERE m.p402TranNoTot = :p402TranNoTot"),
    @NamedQuery(name = "McFinPosDtl.findByD49TranCurrCd", query = "SELECT m FROM McFinPosDtl m WHERE m.d49TranCurrCd = :d49TranCurrCd"),
    @NamedQuery(name = "McFinPosDtl.findByD50ReconCurCd", query = "SELECT m FROM McFinPosDtl m WHERE m.d50ReconCurCd = :d50ReconCurCd"),
    @NamedQuery(name = "McFinPosDtl.findByD62AddtlData2", query = "SELECT m FROM McFinPosDtl m WHERE m.d62AddtlData2 = :d62AddtlData2"),
    @NamedQuery(name = "McFinPosDtl.findByD71MsgNo", query = "SELECT m FROM McFinPosDtl m WHERE m.mcFinPosDtlPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McFinPosDtl.findByD93TrDestInst", query = "SELECT m FROM McFinPosDtl m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McFinPosDtl.findByD100RecvInstId", query = "SELECT m FROM McFinPosDtl m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McFinPosDtl.findByD123AddtlDat3", query = "SELECT m FROM McFinPosDtl m WHERE m.d123AddtlDat3 = :d123AddtlDat3"),
    @NamedQuery(name = "McFinPosDtl.findByD124AddtlDat4", query = "SELECT m FROM McFinPosDtl m WHERE m.d124AddtlDat4 = :d124AddtlDat4"),
    @NamedQuery(name = "McFinPosDtl.findByD125AddtlDat5", query = "SELECT m FROM McFinPosDtl m WHERE m.d125AddtlDat5 = :d125AddtlDat5"),
    @NamedQuery(name = "McFinPosDtl.findByP358s11McmrchOvr", query = "SELECT m FROM McFinPosDtl m WHERE m.p358s11McmrchOvr = :p358s11McmrchOvr")})
public class McFinPosDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McFinPosDtlPK mcFinPosDtlPK;
    @Column(name = "MSG_TY_ID")
    private Short msgTyId;
    @Column(name = "BIT_MAP_PRI")
    private String bitMapPri;
    @Column(name = "D1_BIT_MAP_SEC")
    private String d1BitMapSec;
    @Column(name = "D24_FUNC_CD")
    private Short d24FuncCd;
    @Column(name = "D25_MSG_RSN_CD")
    private Short d25MsgRsnCd;
    @Column(name = "D32_ACQ_INST_ID_CD")
    private Long d32AcqInstIdCd;
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
    @Column(name = "P165S1_STL_IND")
    private Character p165s1StlInd;
    @Column(name = "P165S2_STL_INFO")
    private String p165s2StlInfo;
    @Column(name = "P298S1_TRANMSN_TY")
    private Integer p298s1TranmsnTy;
    @Column(name = "P298S2_TR_REF_DT")
    private Integer p298s2TrRefDt;
    @Column(name = "P298S3_PROC_ID")
    private Long p298s3ProcId;
    @Column(name = "P298S4_TR_SEQ_NO")
    private Integer p298s4TrSeqNo;
    @Column(name = "P300S1_FILE_TY")
    private Short p300s1FileTy;
    @Column(name = "P300S2_FILE_REF_DT")
    private Integer p300s2FileRefDt;
    @Column(name = "P300S3_PROC_ID")
    private Long p300s3ProcId;
    @Column(name = "P300S4_FILE_SEQ_NO")
    private Integer p300s4FileSeqNo;
    @Column(name = "P302_MBR_ACT_REC")
    private Character p302MbrActRec;
    @Column(name = "P358S1_ACP_BRAND")
    private String p358s1AcpBrand;
    @Column(name = "P358S2_BUS_SRVC_LV")
    private Integer p358s2BusSrvcLv;
    @Column(name = "P358S3_BUS_SRVC_ID")
    private Integer p358s3BusSrvcId;
    @Column(name = "P358S4_I_RT_DSGNTR")
    private String p358s4IRtDsgntr;
    @Column(name = "P358S5_BUS_DT")
    private Integer p358s5BusDt;
    @Column(name = "P358S6_BUS_CYCLE")
    private Integer p358s6BusCycle;
    @Column(name = "P358S7_MCC_OVR")
    private Character p358s7MccOvr;
    @Column(name = "P358S8_PROD_OVR")
    private String p358s8ProdOvr;
    @Column(name = "P358S9_CORP_INCRT")
    private Character p358s9CorpIncrt;
    @Column(name = "P358S10_QUAL_LVL")
    private String p358s10QualLvl;
    @Column(name = "P359S1_STLSRVC_TAI")
    private String p359s1StlsrvcTai;
    @Column(name = "P359S2_STLSRVC_TAA")
    private String p359s2StlsrvcTaa;
    @Column(name = "P359S3_STLSRVC_LVL")
    private Integer p359s3StlsrvcLvl;
    @Column(name = "P359S4_STLSRVC_ID")
    private String p359s4StlsrvcId;
    @Column(name = "P359S5_STLFEX_RT_C")
    private Character p359s5StlfexRtC;
    @Column(name = "P359S6_RECON_DT")
    private Integer p359s6ReconDt;
    @Column(name = "P359S7_RECON_CD")
    private Integer p359s7ReconCd;
    @Column(name = "P359S8_STL_DT")
    private Integer p359s8StlDt;
    @Column(name = "P359S9_STL_CYCLE")
    private Integer p359s9StlCycle;
    @Column(name = "P370S1_BEG_ACT_RNG")
    private String p370s1BegActRng;
    @Column(name = "P370S2_END_ACT_RNG")
    private String p370s2EndActRng;
    @Column(name = "P371_MSG_RSN_CD_R")
    private Integer p371MsgRsnCdR;
    @Column(name = "P372S1_MSG_TY_ID")
    private Integer p372s1MsgTyId;
    @Column(name = "P372S2_FUNC_CD")
    private Integer p372s2FuncCd;
    @Column(name = "P373_CRDAID_RCN")
    private String p373CrdaidRcn;
    @Column(name = "P374_PRCCD_RCN")
    private Integer p374PrccdRcn;
    @Column(name = "P375_MBR_RCN_IND")
    private String p375MbrRcnInd;
    @Column(name = "P376_MBR_RCN_IND")
    private String p376MbrRcnInd;
    @Column(name = "P378_ORG_REV_TOT")
    private Character p378OrgRevTot;
    @Column(name = "P380S1_DB_CR_IND")
    private Character p380s1DbCrInd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "P380S2_TRAN_AMT")
    private BigDecimal p380s2TranAmt;
    @Column(name = "P381S1_DB_CR_IND")
    private Character p381s1DbCrInd;
    @Column(name = "P381S2_TRAN_AMT")
    private BigDecimal p381s2TranAmt;
    @Column(name = "P384S1_DB_CR_IND")
    private Character p384s1DbCrInd;
    @Column(name = "P384S2_NET_AMT")
    private BigDecimal p384s2NetAmt;
    @Column(name = "P390S1_DB_IND")
    private Character p390s1DbInd;
    @Column(name = "P390S2_TRAN_AMT")
    private BigDecimal p390s2TranAmt;
    @Column(name = "P391S1_CR_IND")
    private Character p391s1CrInd;
    @Column(name = "P391S2_TRAN_AMT")
    private BigDecimal p391s2TranAmt;
    @Column(name = "P394S1_NET_DB_IND")
    private Character p394s1NetDbInd;
    @Column(name = "P394S2_NET_TR_AMT")
    private BigDecimal p394s2NetTrAmt;
    @Column(name = "P395S1_NET_CR_IND")
    private Character p395s1NetCrInd;
    @Column(name = "P395S2_NET_TRN_AMT")
    private BigDecimal p395s2NetTrnAmt;
    @Column(name = "P396S1_NET_IND")
    private Character p396s1NetInd;
    @Column(name = "P396S2_NET_TRN_AMT")
    private BigDecimal p396s2NetTrnAmt;
    @Column(name = "P400_TRAN_NO_DBS")
    private Long p400TranNoDbs;
    @Column(name = "P401_TRAN_NO_CRS")
    private Long p401TranNoCrs;
    @Column(name = "P402_TRAN_NO_TOT")
    private Long p402TranNoTot;
    @Column(name = "D49_TRAN_CURR_CD")
    private Short d49TranCurrCd;
    @Column(name = "D50_RECON_CUR_CD")
    private Short d50ReconCurCd;
    @Column(name = "D62_ADDTL_DATA_2")
    private String d62AddtlData2;
    @Column(name = "D93_TR_DEST_INST")
    private Long d93TrDestInst;
    @Column(name = "D100_RECV_INST_ID")
    private Long d100RecvInstId;
    @Column(name = "D123_ADDTL_DAT_3")
    private String d123AddtlDat3;
    @Column(name = "D124_ADDTL_DAT_4")
    private String d124AddtlDat4;
    @Column(name = "D125_ADDTL_DAT_5")
    private String d125AddtlDat5;
    @Column(name = "P358S11_MCMRCH_OVR")
    private Character p358s11McmrchOvr;

    public McFinPosDtl() {
    }

    public McFinPosDtl(McFinPosDtlPK mcFinPosDtlPK) {
        this.mcFinPosDtlPK = mcFinPosDtlPK;
    }

    public McFinPosDtl(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcFinPosDtlPK = new McFinPosDtlPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McFinPosDtlPK getMcFinPosDtlPK() {
        return mcFinPosDtlPK;
    }

    public void setMcFinPosDtlPK(McFinPosDtlPK mcFinPosDtlPK) {
        this.mcFinPosDtlPK = mcFinPosDtlPK;
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

    public Long getD32AcqInstIdCd() {
        return d32AcqInstIdCd;
    }

    public void setD32AcqInstIdCd(Long d32AcqInstIdCd) {
        this.d32AcqInstIdCd = d32AcqInstIdCd;
    }

    public String getD48AddtlDat() {
        return d48AddtlDat;
    }

    public void setD48AddtlDat(String d48AddtlDat) {
        this.d48AddtlDat = d48AddtlDat;
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

    public Integer getP298s1TranmsnTy() {
        return p298s1TranmsnTy;
    }

    public void setP298s1TranmsnTy(Integer p298s1TranmsnTy) {
        this.p298s1TranmsnTy = p298s1TranmsnTy;
    }

    public Integer getP298s2TrRefDt() {
        return p298s2TrRefDt;
    }

    public void setP298s2TrRefDt(Integer p298s2TrRefDt) {
        this.p298s2TrRefDt = p298s2TrRefDt;
    }

    public Long getP298s3ProcId() {
        return p298s3ProcId;
    }

    public void setP298s3ProcId(Long p298s3ProcId) {
        this.p298s3ProcId = p298s3ProcId;
    }

    public Integer getP298s4TrSeqNo() {
        return p298s4TrSeqNo;
    }

    public void setP298s4TrSeqNo(Integer p298s4TrSeqNo) {
        this.p298s4TrSeqNo = p298s4TrSeqNo;
    }

    public Short getP300s1FileTy() {
        return p300s1FileTy;
    }

    public void setP300s1FileTy(Short p300s1FileTy) {
        this.p300s1FileTy = p300s1FileTy;
    }

    public Integer getP300s2FileRefDt() {
        return p300s2FileRefDt;
    }

    public void setP300s2FileRefDt(Integer p300s2FileRefDt) {
        this.p300s2FileRefDt = p300s2FileRefDt;
    }

    public Long getP300s3ProcId() {
        return p300s3ProcId;
    }

    public void setP300s3ProcId(Long p300s3ProcId) {
        this.p300s3ProcId = p300s3ProcId;
    }

    public Integer getP300s4FileSeqNo() {
        return p300s4FileSeqNo;
    }

    public void setP300s4FileSeqNo(Integer p300s4FileSeqNo) {
        this.p300s4FileSeqNo = p300s4FileSeqNo;
    }

    public Character getP302MbrActRec() {
        return p302MbrActRec;
    }

    public void setP302MbrActRec(Character p302MbrActRec) {
        this.p302MbrActRec = p302MbrActRec;
    }

    public String getP358s1AcpBrand() {
        return p358s1AcpBrand;
    }

    public void setP358s1AcpBrand(String p358s1AcpBrand) {
        this.p358s1AcpBrand = p358s1AcpBrand;
    }

    public Integer getP358s2BusSrvcLv() {
        return p358s2BusSrvcLv;
    }

    public void setP358s2BusSrvcLv(Integer p358s2BusSrvcLv) {
        this.p358s2BusSrvcLv = p358s2BusSrvcLv;
    }

    public Integer getP358s3BusSrvcId() {
        return p358s3BusSrvcId;
    }

    public void setP358s3BusSrvcId(Integer p358s3BusSrvcId) {
        this.p358s3BusSrvcId = p358s3BusSrvcId;
    }

    public String getP358s4IRtDsgntr() {
        return p358s4IRtDsgntr;
    }

    public void setP358s4IRtDsgntr(String p358s4IRtDsgntr) {
        this.p358s4IRtDsgntr = p358s4IRtDsgntr;
    }

    public Integer getP358s5BusDt() {
        return p358s5BusDt;
    }

    public void setP358s5BusDt(Integer p358s5BusDt) {
        this.p358s5BusDt = p358s5BusDt;
    }

    public Integer getP358s6BusCycle() {
        return p358s6BusCycle;
    }

    public void setP358s6BusCycle(Integer p358s6BusCycle) {
        this.p358s6BusCycle = p358s6BusCycle;
    }

    public Character getP358s7MccOvr() {
        return p358s7MccOvr;
    }

    public void setP358s7MccOvr(Character p358s7MccOvr) {
        this.p358s7MccOvr = p358s7MccOvr;
    }

    public String getP358s8ProdOvr() {
        return p358s8ProdOvr;
    }

    public void setP358s8ProdOvr(String p358s8ProdOvr) {
        this.p358s8ProdOvr = p358s8ProdOvr;
    }

    public Character getP358s9CorpIncrt() {
        return p358s9CorpIncrt;
    }

    public void setP358s9CorpIncrt(Character p358s9CorpIncrt) {
        this.p358s9CorpIncrt = p358s9CorpIncrt;
    }

    public String getP358s10QualLvl() {
        return p358s10QualLvl;
    }

    public void setP358s10QualLvl(String p358s10QualLvl) {
        this.p358s10QualLvl = p358s10QualLvl;
    }

    public String getP359s1StlsrvcTai() {
        return p359s1StlsrvcTai;
    }

    public void setP359s1StlsrvcTai(String p359s1StlsrvcTai) {
        this.p359s1StlsrvcTai = p359s1StlsrvcTai;
    }

    public String getP359s2StlsrvcTaa() {
        return p359s2StlsrvcTaa;
    }

    public void setP359s2StlsrvcTaa(String p359s2StlsrvcTaa) {
        this.p359s2StlsrvcTaa = p359s2StlsrvcTaa;
    }

    public Integer getP359s3StlsrvcLvl() {
        return p359s3StlsrvcLvl;
    }

    public void setP359s3StlsrvcLvl(Integer p359s3StlsrvcLvl) {
        this.p359s3StlsrvcLvl = p359s3StlsrvcLvl;
    }

    public String getP359s4StlsrvcId() {
        return p359s4StlsrvcId;
    }

    public void setP359s4StlsrvcId(String p359s4StlsrvcId) {
        this.p359s4StlsrvcId = p359s4StlsrvcId;
    }

    public Character getP359s5StlfexRtC() {
        return p359s5StlfexRtC;
    }

    public void setP359s5StlfexRtC(Character p359s5StlfexRtC) {
        this.p359s5StlfexRtC = p359s5StlfexRtC;
    }

    public Integer getP359s6ReconDt() {
        return p359s6ReconDt;
    }

    public void setP359s6ReconDt(Integer p359s6ReconDt) {
        this.p359s6ReconDt = p359s6ReconDt;
    }

    public Integer getP359s7ReconCd() {
        return p359s7ReconCd;
    }

    public void setP359s7ReconCd(Integer p359s7ReconCd) {
        this.p359s7ReconCd = p359s7ReconCd;
    }

    public Integer getP359s8StlDt() {
        return p359s8StlDt;
    }

    public void setP359s8StlDt(Integer p359s8StlDt) {
        this.p359s8StlDt = p359s8StlDt;
    }

    public Integer getP359s9StlCycle() {
        return p359s9StlCycle;
    }

    public void setP359s9StlCycle(Integer p359s9StlCycle) {
        this.p359s9StlCycle = p359s9StlCycle;
    }

    public String getP370s1BegActRng() {
        return p370s1BegActRng;
    }

    public void setP370s1BegActRng(String p370s1BegActRng) {
        this.p370s1BegActRng = p370s1BegActRng;
    }

    public String getP370s2EndActRng() {
        return p370s2EndActRng;
    }

    public void setP370s2EndActRng(String p370s2EndActRng) {
        this.p370s2EndActRng = p370s2EndActRng;
    }

    public Integer getP371MsgRsnCdR() {
        return p371MsgRsnCdR;
    }

    public void setP371MsgRsnCdR(Integer p371MsgRsnCdR) {
        this.p371MsgRsnCdR = p371MsgRsnCdR;
    }

    public Integer getP372s1MsgTyId() {
        return p372s1MsgTyId;
    }

    public void setP372s1MsgTyId(Integer p372s1MsgTyId) {
        this.p372s1MsgTyId = p372s1MsgTyId;
    }

    public Integer getP372s2FuncCd() {
        return p372s2FuncCd;
    }

    public void setP372s2FuncCd(Integer p372s2FuncCd) {
        this.p372s2FuncCd = p372s2FuncCd;
    }

    public String getP373CrdaidRcn() {
        return p373CrdaidRcn;
    }

    public void setP373CrdaidRcn(String p373CrdaidRcn) {
        this.p373CrdaidRcn = p373CrdaidRcn;
    }

    public Integer getP374PrccdRcn() {
        return p374PrccdRcn;
    }

    public void setP374PrccdRcn(Integer p374PrccdRcn) {
        this.p374PrccdRcn = p374PrccdRcn;
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

    public Character getP378OrgRevTot() {
        return p378OrgRevTot;
    }

    public void setP378OrgRevTot(Character p378OrgRevTot) {
        this.p378OrgRevTot = p378OrgRevTot;
    }

    public Character getP380s1DbCrInd() {
        return p380s1DbCrInd;
    }

    public void setP380s1DbCrInd(Character p380s1DbCrInd) {
        this.p380s1DbCrInd = p380s1DbCrInd;
    }

    public BigDecimal getP380s2TranAmt() {
        return p380s2TranAmt;
    }

    public void setP380s2TranAmt(BigDecimal p380s2TranAmt) {
        this.p380s2TranAmt = p380s2TranAmt;
    }

    public Character getP381s1DbCrInd() {
        return p381s1DbCrInd;
    }

    public void setP381s1DbCrInd(Character p381s1DbCrInd) {
        this.p381s1DbCrInd = p381s1DbCrInd;
    }

    public BigDecimal getP381s2TranAmt() {
        return p381s2TranAmt;
    }

    public void setP381s2TranAmt(BigDecimal p381s2TranAmt) {
        this.p381s2TranAmt = p381s2TranAmt;
    }

    public Character getP384s1DbCrInd() {
        return p384s1DbCrInd;
    }

    public void setP384s1DbCrInd(Character p384s1DbCrInd) {
        this.p384s1DbCrInd = p384s1DbCrInd;
    }

    public BigDecimal getP384s2NetAmt() {
        return p384s2NetAmt;
    }

    public void setP384s2NetAmt(BigDecimal p384s2NetAmt) {
        this.p384s2NetAmt = p384s2NetAmt;
    }

    public Character getP390s1DbInd() {
        return p390s1DbInd;
    }

    public void setP390s1DbInd(Character p390s1DbInd) {
        this.p390s1DbInd = p390s1DbInd;
    }

    public BigDecimal getP390s2TranAmt() {
        return p390s2TranAmt;
    }

    public void setP390s2TranAmt(BigDecimal p390s2TranAmt) {
        this.p390s2TranAmt = p390s2TranAmt;
    }

    public Character getP391s1CrInd() {
        return p391s1CrInd;
    }

    public void setP391s1CrInd(Character p391s1CrInd) {
        this.p391s1CrInd = p391s1CrInd;
    }

    public BigDecimal getP391s2TranAmt() {
        return p391s2TranAmt;
    }

    public void setP391s2TranAmt(BigDecimal p391s2TranAmt) {
        this.p391s2TranAmt = p391s2TranAmt;
    }

    public Character getP394s1NetDbInd() {
        return p394s1NetDbInd;
    }

    public void setP394s1NetDbInd(Character p394s1NetDbInd) {
        this.p394s1NetDbInd = p394s1NetDbInd;
    }

    public BigDecimal getP394s2NetTrAmt() {
        return p394s2NetTrAmt;
    }

    public void setP394s2NetTrAmt(BigDecimal p394s2NetTrAmt) {
        this.p394s2NetTrAmt = p394s2NetTrAmt;
    }

    public Character getP395s1NetCrInd() {
        return p395s1NetCrInd;
    }

    public void setP395s1NetCrInd(Character p395s1NetCrInd) {
        this.p395s1NetCrInd = p395s1NetCrInd;
    }

    public BigDecimal getP395s2NetTrnAmt() {
        return p395s2NetTrnAmt;
    }

    public void setP395s2NetTrnAmt(BigDecimal p395s2NetTrnAmt) {
        this.p395s2NetTrnAmt = p395s2NetTrnAmt;
    }

    public Character getP396s1NetInd() {
        return p396s1NetInd;
    }

    public void setP396s1NetInd(Character p396s1NetInd) {
        this.p396s1NetInd = p396s1NetInd;
    }

    public BigDecimal getP396s2NetTrnAmt() {
        return p396s2NetTrnAmt;
    }

    public void setP396s2NetTrnAmt(BigDecimal p396s2NetTrnAmt) {
        this.p396s2NetTrnAmt = p396s2NetTrnAmt;
    }

    public Long getP400TranNoDbs() {
        return p400TranNoDbs;
    }

    public void setP400TranNoDbs(Long p400TranNoDbs) {
        this.p400TranNoDbs = p400TranNoDbs;
    }

    public Long getP401TranNoCrs() {
        return p401TranNoCrs;
    }

    public void setP401TranNoCrs(Long p401TranNoCrs) {
        this.p401TranNoCrs = p401TranNoCrs;
    }

    public Long getP402TranNoTot() {
        return p402TranNoTot;
    }

    public void setP402TranNoTot(Long p402TranNoTot) {
        this.p402TranNoTot = p402TranNoTot;
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

    public String getD62AddtlData2() {
        return d62AddtlData2;
    }

    public void setD62AddtlData2(String d62AddtlData2) {
        this.d62AddtlData2 = d62AddtlData2;
    }

    public Long getD93TrDestInst() {
        return d93TrDestInst;
    }

    public void setD93TrDestInst(Long d93TrDestInst) {
        this.d93TrDestInst = d93TrDestInst;
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

    public Character getP358s11McmrchOvr() {
        return p358s11McmrchOvr;
    }

    public void setP358s11McmrchOvr(Character p358s11McmrchOvr) {
        this.p358s11McmrchOvr = p358s11McmrchOvr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcFinPosDtlPK != null ? mcFinPosDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McFinPosDtl)) {
            return false;
        }
        McFinPosDtl other = (McFinPosDtl) object;
        if ((this.mcFinPosDtlPK == null && other.mcFinPosDtlPK != null) || (this.mcFinPosDtlPK != null && !this.mcFinPosDtlPK.equals(other.mcFinPosDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McFinPosDtl[ mcFinPosDtlPK=" + mcFinPosDtlPK + " ]";
    }
    
}
