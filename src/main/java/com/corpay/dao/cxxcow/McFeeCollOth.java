/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "MC_FEE_COLL_OTH", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McFeeCollOth.findAll", query = "SELECT m FROM McFeeCollOth m"),
    @NamedQuery(name = "McFeeCollOth.findByP105s1FileTy", query = "SELECT m FROM McFeeCollOth m WHERE m.mcFeeCollOthPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McFeeCollOth.findByP105s2FileRDt", query = "SELECT m FROM McFeeCollOth m WHERE m.mcFeeCollOthPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McFeeCollOth.findByP105s3ProcId", query = "SELECT m FROM McFeeCollOth m WHERE m.mcFeeCollOthPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McFeeCollOth.findByP105s4FileSeqNo", query = "SELECT m FROM McFeeCollOth m WHERE m.mcFeeCollOthPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McFeeCollOth.findByMsgTyId", query = "SELECT m FROM McFeeCollOth m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McFeeCollOth.findByBitMapPri", query = "SELECT m FROM McFeeCollOth m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McFeeCollOth.findByD1BitMapSec", query = "SELECT m FROM McFeeCollOth m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McFeeCollOth.findByD2PriAccntNo", query = "SELECT m FROM McFeeCollOth m WHERE m.d2PriAccntNo = :d2PriAccntNo"),
    @NamedQuery(name = "McFeeCollOth.findByD3s1ChTranTy", query = "SELECT m FROM McFeeCollOth m WHERE m.d3s1ChTranTy = :d3s1ChTranTy"),
    @NamedQuery(name = "McFeeCollOth.findByD3s2ChFraccntty", query = "SELECT m FROM McFeeCollOth m WHERE m.d3s2ChFraccntty = :d3s2ChFraccntty"),
    @NamedQuery(name = "McFeeCollOth.findByD3s3ChToaccntty", query = "SELECT m FROM McFeeCollOth m WHERE m.d3s3ChToaccntty = :d3s3ChToaccntty"),
    @NamedQuery(name = "McFeeCollOth.findByD4TranAmt", query = "SELECT m FROM McFeeCollOth m WHERE m.d4TranAmt = :d4TranAmt"),
    @NamedQuery(name = "McFeeCollOth.findByD5ReconAmt", query = "SELECT m FROM McFeeCollOth m WHERE m.d5ReconAmt = :d5ReconAmt"),
    @NamedQuery(name = "McFeeCollOth.findByD9ReconConvRt", query = "SELECT m FROM McFeeCollOth m WHERE m.d9ReconConvRt = :d9ReconConvRt"),
    @NamedQuery(name = "McFeeCollOth.findByD24FuncCd", query = "SELECT m FROM McFeeCollOth m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McFeeCollOth.findByD25MsgRsnCd", query = "SELECT m FROM McFeeCollOth m WHERE m.d25MsgRsnCd = :d25MsgRsnCd"),
    @NamedQuery(name = "McFeeCollOth.findByD26CrdAcptrbus", query = "SELECT m FROM McFeeCollOth m WHERE m.d26CrdAcptrbus = :d26CrdAcptrbus"),
    @NamedQuery(name = "McFeeCollOth.findByD30s1TrOrigAmt", query = "SELECT m FROM McFeeCollOth m WHERE m.d30s1TrOrigAmt = :d30s1TrOrigAmt"),
    @NamedQuery(name = "McFeeCollOth.findByD30s2RnOrigAmt", query = "SELECT m FROM McFeeCollOth m WHERE m.d30s2RnOrigAmt = :d30s2RnOrigAmt"),
    @NamedQuery(name = "McFeeCollOth.findByD31s1IcRtDsgtr", query = "SELECT m FROM McFeeCollOth m WHERE m.d31s1IcRtDsgtr = :d31s1IcRtDsgtr"),
    @NamedQuery(name = "McFeeCollOth.findByD31s2AcquirBin", query = "SELECT m FROM McFeeCollOth m WHERE m.d31s2AcquirBin = :d31s2AcquirBin"),
    @NamedQuery(name = "McFeeCollOth.findByD31s3JulPrcDt", query = "SELECT m FROM McFeeCollOth m WHERE m.d31s3JulPrcDt = :d31s3JulPrcDt"),
    @NamedQuery(name = "McFeeCollOth.findByD31s4AcqSeqNo", query = "SELECT m FROM McFeeCollOth m WHERE m.d31s4AcqSeqNo = :d31s4AcqSeqNo"),
    @NamedQuery(name = "McFeeCollOth.findByD31s5CheckDigit", query = "SELECT m FROM McFeeCollOth m WHERE m.d31s5CheckDigit = :d31s5CheckDigit"),
    @NamedQuery(name = "McFeeCollOth.findByD33FwdngInstCd", query = "SELECT m FROM McFeeCollOth m WHERE m.d33FwdngInstCd = :d33FwdngInstCd"),
    @NamedQuery(name = "McFeeCollOth.findByD38ApprvlCd", query = "SELECT m FROM McFeeCollOth m WHERE m.d38ApprvlCd = :d38ApprvlCd"),
    @NamedQuery(name = "McFeeCollOth.findByD41CrdAcprTrm", query = "SELECT m FROM McFeeCollOth m WHERE m.d41CrdAcprTrm = :d41CrdAcprTrm"),
    @NamedQuery(name = "McFeeCollOth.findByD42CrdAcprId", query = "SELECT m FROM McFeeCollOth m WHERE m.d42CrdAcprId = :d42CrdAcprId"),
    @NamedQuery(name = "McFeeCollOth.findByMcMerchId", query = "SELECT m FROM McFeeCollOth m WHERE m.mcMerchId = :mcMerchId"),
    @NamedQuery(name = "McFeeCollOth.findByD48AddtlDat", query = "SELECT m FROM McFeeCollOth m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McFeeCollOth.findByP025s1MsgRev", query = "SELECT m FROM McFeeCollOth m WHERE m.p025s1MsgRev = :p025s1MsgRev"),
    @NamedQuery(name = "McFeeCollOth.findByP025s2Cprdtorig", query = "SELECT m FROM McFeeCollOth m WHERE m.p025s2Cprdtorig = :p025s2Cprdtorig"),
    @NamedQuery(name = "McFeeCollOth.findByP137FeeColCntl", query = "SELECT m FROM McFeeCollOth m WHERE m.p137FeeColCntl = :p137FeeColCntl"),
    @NamedQuery(name = "McFeeCollOth.findByP149s1OrTaCur", query = "SELECT m FROM McFeeCollOth m WHERE m.p149s1OrTaCur = :p149s1OrTaCur"),
    @NamedQuery(name = "McFeeCollOth.findByP149s2OrRcncur", query = "SELECT m FROM McFeeCollOth m WHERE m.p149s2OrRcncur = :p149s2OrRcncur"),
    @NamedQuery(name = "McFeeCollOth.findByP158s1ApBrandId", query = "SELECT m FROM McFeeCollOth m WHERE m.p158s1ApBrandId = :p158s1ApBrandId"),
    @NamedQuery(name = "McFeeCollOth.findByP158s2BusSrvcLv", query = "SELECT m FROM McFeeCollOth m WHERE m.p158s2BusSrvcLv = :p158s2BusSrvcLv"),
    @NamedQuery(name = "McFeeCollOth.findByP158s3BusSrvcId", query = "SELECT m FROM McFeeCollOth m WHERE m.p158s3BusSrvcId = :p158s3BusSrvcId"),
    @NamedQuery(name = "McFeeCollOth.findByP158s4IcgRtDsgn", query = "SELECT m FROM McFeeCollOth m WHERE m.p158s4IcgRtDsgn = :p158s4IcgRtDsgn"),
    @NamedQuery(name = "McFeeCollOth.findByP158s5BusDt", query = "SELECT m FROM McFeeCollOth m WHERE m.p158s5BusDt = :p158s5BusDt"),
    @NamedQuery(name = "McFeeCollOth.findByP158s6BusCycle", query = "SELECT m FROM McFeeCollOth m WHERE m.p158s6BusCycle = :p158s6BusCycle"),
    @NamedQuery(name = "McFeeCollOth.findByP158s7MccOvr", query = "SELECT m FROM McFeeCollOth m WHERE m.p158s7MccOvr = :p158s7MccOvr"),
    @NamedQuery(name = "McFeeCollOth.findByP158s8ProdOvr", query = "SELECT m FROM McFeeCollOth m WHERE m.p158s8ProdOvr = :p158s8ProdOvr"),
    @NamedQuery(name = "McFeeCollOth.findByP158s9CorpIncrt", query = "SELECT m FROM McFeeCollOth m WHERE m.p158s9CorpIncrt = :p158s9CorpIncrt"),
    @NamedQuery(name = "McFeeCollOth.findByP158s10QualLvl", query = "SELECT m FROM McFeeCollOth m WHERE m.p158s10QualLvl = :p158s10QualLvl"),
    @NamedQuery(name = "McFeeCollOth.findByP159s1SSrvcTai", query = "SELECT m FROM McFeeCollOth m WHERE m.p159s1SSrvcTai = :p159s1SSrvcTai"),
    @NamedQuery(name = "McFeeCollOth.findByP159s2SSrvctaa", query = "SELECT m FROM McFeeCollOth m WHERE m.p159s2SSrvctaa = :p159s2SSrvctaa"),
    @NamedQuery(name = "McFeeCollOth.findByP159s3SSrvcLvl", query = "SELECT m FROM McFeeCollOth m WHERE m.p159s3SSrvcLvl = :p159s3SSrvcLvl"),
    @NamedQuery(name = "McFeeCollOth.findByP159s4SSrvcId", query = "SELECT m FROM McFeeCollOth m WHERE m.p159s4SSrvcId = :p159s4SSrvcId"),
    @NamedQuery(name = "McFeeCollOth.findByP159s5SFrnexCl", query = "SELECT m FROM McFeeCollOth m WHERE m.p159s5SFrnexCl = :p159s5SFrnexCl"),
    @NamedQuery(name = "McFeeCollOth.findByP159s6ReconDt", query = "SELECT m FROM McFeeCollOth m WHERE m.p159s6ReconDt = :p159s6ReconDt"),
    @NamedQuery(name = "McFeeCollOth.findByP159s7ReconCycle", query = "SELECT m FROM McFeeCollOth m WHERE m.p159s7ReconCycle = :p159s7ReconCycle"),
    @NamedQuery(name = "McFeeCollOth.findByP159s8StlDt", query = "SELECT m FROM McFeeCollOth m WHERE m.p159s8StlDt = :p159s8StlDt"),
    @NamedQuery(name = "McFeeCollOth.findByP159s9StlCycle", query = "SELECT m FROM McFeeCollOth m WHERE m.p159s9StlCycle = :p159s9StlCycle"),
    @NamedQuery(name = "McFeeCollOth.findByP161s1SSrvcTai", query = "SELECT m FROM McFeeCollOth m WHERE m.p161s1SSrvcTai = :p161s1SSrvcTai"),
    @NamedQuery(name = "McFeeCollOth.findByP161s2SSrvcTaa", query = "SELECT m FROM McFeeCollOth m WHERE m.p161s2SSrvcTaa = :p161s2SSrvcTaa"),
    @NamedQuery(name = "McFeeCollOth.findByP161s3SSrvcLvl", query = "SELECT m FROM McFeeCollOth m WHERE m.p161s3SSrvcLvl = :p161s3SSrvcLvl"),
    @NamedQuery(name = "McFeeCollOth.findByP161s4SSrvcId", query = "SELECT m FROM McFeeCollOth m WHERE m.p161s4SSrvcId = :p161s4SSrvcId"),
    @NamedQuery(name = "McFeeCollOth.findByP161s5SFeRtCl", query = "SELECT m FROM McFeeCollOth m WHERE m.p161s5SFeRtCl = :p161s5SFeRtCl"),
    @NamedQuery(name = "McFeeCollOth.findByP161s6ReconDt", query = "SELECT m FROM McFeeCollOth m WHERE m.p161s6ReconDt = :p161s6ReconDt"),
    @NamedQuery(name = "McFeeCollOth.findByP161s7ReconCycle", query = "SELECT m FROM McFeeCollOth m WHERE m.p161s7ReconCycle = :p161s7ReconCycle"),
    @NamedQuery(name = "McFeeCollOth.findByP161s8SDt", query = "SELECT m FROM McFeeCollOth m WHERE m.p161s8SDt = :p161s8SDt"),
    @NamedQuery(name = "McFeeCollOth.findByP161s9SCycle", query = "SELECT m FROM McFeeCollOth m WHERE m.p161s9SCycle = :p161s9SCycle"),
    @NamedQuery(name = "McFeeCollOth.findByP165s1StlInd", query = "SELECT m FROM McFeeCollOth m WHERE m.p165s1StlInd = :p165s1StlInd"),
    @NamedQuery(name = "McFeeCollOth.findByP165s2StlInfo", query = "SELECT m FROM McFeeCollOth m WHERE m.p165s2StlInfo = :p165s2StlInfo"),
    @NamedQuery(name = "McFeeCollOth.findByP175CrdAcpUrl", query = "SELECT m FROM McFeeCollOth m WHERE m.p175CrdAcpUrl = :p175CrdAcpUrl"),
    @NamedQuery(name = "McFeeCollOth.findByP191OrMsgFmt", query = "SELECT m FROM McFeeCollOth m WHERE m.p191OrMsgFmt = :p191OrMsgFmt"),
    @NamedQuery(name = "McFeeCollOth.findByP262DocIndctr", query = "SELECT m FROM McFeeCollOth m WHERE m.p262DocIndctr = :p262DocIndctr"),
    @NamedQuery(name = "McFeeCollOth.findByP265s1IMsgRsn", query = "SELECT m FROM McFeeCollOth m WHERE m.p265s1IMsgRsn = :p265s1IMsgRsn"),
    @NamedQuery(name = "McFeeCollOth.findByP265s2IPsntBus", query = "SELECT m FROM McFeeCollOth m WHERE m.p265s2IPsntBus = :p265s2IPsntBus"),
    @NamedQuery(name = "McFeeCollOth.findByP265s3IDatRec", query = "SELECT m FROM McFeeCollOth m WHERE m.p265s3IDatRec = :p265s3IDatRec"),
    @NamedQuery(name = "McFeeCollOth.findByP266s1MsgRsnCd", query = "SELECT m FROM McFeeCollOth m WHERE m.p266s1MsgRsnCd = :p266s1MsgRsnCd"),
    @NamedQuery(name = "McFeeCollOth.findByP266s2FstrtnDt", query = "SELECT m FROM McFeeCollOth m WHERE m.p266s2FstrtnDt = :p266s2FstrtnDt"),
    @NamedQuery(name = "McFeeCollOth.findByP266s3EditExRsn", query = "SELECT m FROM McFeeCollOth m WHERE m.p266s3EditExRsn = :p266s3EditExRsn"),
    @NamedQuery(name = "McFeeCollOth.findByP266s4EditExRes", query = "SELECT m FROM McFeeCollOth m WHERE m.p266s4EditExRes = :p266s4EditExRes"),
    @NamedQuery(name = "McFeeCollOth.findByP266s5FstrtnAmt", query = "SELECT m FROM McFeeCollOth m WHERE m.p266s5FstrtnAmt = :p266s5FstrtnAmt"),
    @NamedQuery(name = "McFeeCollOth.findByP266s6FstRtnCur", query = "SELECT m FROM McFeeCollOth m WHERE m.p266s6FstRtnCur = :p266s6FstRtnCur"),
    @NamedQuery(name = "McFeeCollOth.findByP266s7FstRtnDat", query = "SELECT m FROM McFeeCollOth m WHERE m.p266s7FstRtnDat = :p266s7FstRtnDat"),
    @NamedQuery(name = "McFeeCollOth.findByP267s1MsgRsnCd", query = "SELECT m FROM McFeeCollOth m WHERE m.p267s1MsgRsnCd = :p267s1MsgRsnCd"),
    @NamedQuery(name = "McFeeCollOth.findByP267s2SecRtnDt", query = "SELECT m FROM McFeeCollOth m WHERE m.p267s2SecRtnDt = :p267s2SecRtnDt"),
    @NamedQuery(name = "McFeeCollOth.findByP267s3EditExRsn", query = "SELECT m FROM McFeeCollOth m WHERE m.p267s3EditExRsn = :p267s3EditExRsn"),
    @NamedQuery(name = "McFeeCollOth.findByP267s4EditExRes", query = "SELECT m FROM McFeeCollOth m WHERE m.p267s4EditExRes = :p267s4EditExRes"),
    @NamedQuery(name = "McFeeCollOth.findByP267s5SecRtnAmt", query = "SELECT m FROM McFeeCollOth m WHERE m.p267s5SecRtnAmt = :p267s5SecRtnAmt"),
    @NamedQuery(name = "McFeeCollOth.findByP267s6SecRtnCur", query = "SELECT m FROM McFeeCollOth m WHERE m.p267s6SecRtnCur = :p267s6SecRtnCur"),
    @NamedQuery(name = "McFeeCollOth.findByP267s7SecRtnDat", query = "SELECT m FROM McFeeCollOth m WHERE m.p267s7SecRtnDat = :p267s7SecRtnDat"),
    @NamedQuery(name = "McFeeCollOth.findByP375MbrRcnInd", query = "SELECT m FROM McFeeCollOth m WHERE m.p375MbrRcnInd = :p375MbrRcnInd"),
    @NamedQuery(name = "McFeeCollOth.findByP376MbrRcnInd", query = "SELECT m FROM McFeeCollOth m WHERE m.p376MbrRcnInd = :p376MbrRcnInd"),
    @NamedQuery(name = "McFeeCollOth.findByD49TranCurrCd", query = "SELECT m FROM McFeeCollOth m WHERE m.d49TranCurrCd = :d49TranCurrCd"),
    @NamedQuery(name = "McFeeCollOth.findByD50ReconCurCd", query = "SELECT m FROM McFeeCollOth m WHERE m.d50ReconCurCd = :d50ReconCurCd"),
    @NamedQuery(name = "McFeeCollOth.findByD62AddtlData2", query = "SELECT m FROM McFeeCollOth m WHERE m.d62AddtlData2 = :d62AddtlData2"),
    @NamedQuery(name = "McFeeCollOth.findByD63s1LfcycSpInd", query = "SELECT m FROM McFeeCollOth m WHERE m.d63s1LfcycSpInd = :d63s1LfcycSpInd"),
    @NamedQuery(name = "McFeeCollOth.findByD63s2TraceId", query = "SELECT m FROM McFeeCollOth m WHERE m.d63s2TraceId = :d63s2TraceId"),
    @NamedQuery(name = "McFeeCollOth.findByD63s3ValidnCd", query = "SELECT m FROM McFeeCollOth m WHERE m.d63s3ValidnCd = :d63s3ValidnCd"),
    @NamedQuery(name = "McFeeCollOth.findByD63s4LfcyctrSeq", query = "SELECT m FROM McFeeCollOth m WHERE m.d63s4LfcyctrSeq = :d63s4LfcyctrSeq"),
    @NamedQuery(name = "McFeeCollOth.findByD63s5LfcyctrTot", query = "SELECT m FROM McFeeCollOth m WHERE m.d63s5LfcyctrTot = :d63s5LfcyctrTot"),
    @NamedQuery(name = "McFeeCollOth.findByD71MsgNo", query = "SELECT m FROM McFeeCollOth m WHERE m.mcFeeCollOthPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McFeeCollOth.findByD72DataRec", query = "SELECT m FROM McFeeCollOth m WHERE m.d72DataRec = :d72DataRec"),
    @NamedQuery(name = "McFeeCollOth.findByD73ActionDt", query = "SELECT m FROM McFeeCollOth m WHERE m.d73ActionDt = :d73ActionDt"),
    @NamedQuery(name = "McFeeCollOth.findByD93TrDestInst", query = "SELECT m FROM McFeeCollOth m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McFeeCollOth.findByD94TrOrgInst", query = "SELECT m FROM McFeeCollOth m WHERE m.d94TrOrgInst = :d94TrOrgInst"),
    @NamedQuery(name = "McFeeCollOth.findByD100RecvInstId", query = "SELECT m FROM McFeeCollOth m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McFeeCollOth.findByD123AddtlDat3", query = "SELECT m FROM McFeeCollOth m WHERE m.d123AddtlDat3 = :d123AddtlDat3"),
    @NamedQuery(name = "McFeeCollOth.findByD124AddtlDat4", query = "SELECT m FROM McFeeCollOth m WHERE m.d124AddtlDat4 = :d124AddtlDat4"),
    @NamedQuery(name = "McFeeCollOth.findByD125AddtlDat5", query = "SELECT m FROM McFeeCollOth m WHERE m.d125AddtlDat5 = :d125AddtlDat5"),
    @NamedQuery(name = "McFeeCollOth.findByP2ProdId", query = "SELECT m FROM McFeeCollOth m WHERE m.p2ProdId = :p2ProdId"),
    @NamedQuery(name = "McFeeCollOth.findByP3ProdId", query = "SELECT m FROM McFeeCollOth m WHERE m.p3ProdId = :p3ProdId"),
    @NamedQuery(name = "McFeeCollOth.findByP158s11McmrchOvr", query = "SELECT m FROM McFeeCollOth m WHERE m.p158s11McmrchOvr = :p158s11McmrchOvr")})
public class McFeeCollOth implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McFeeCollOthPK mcFeeCollOthPK;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "D4_TRAN_AMT")
    private BigDecimal d4TranAmt;
    @Column(name = "D5_RECON_AMT")
    private BigDecimal d5ReconAmt;
    @Column(name = "D9_RECON_CONV_RT")
    private BigDecimal d9ReconConvRt;
    @Column(name = "D24_FUNC_CD")
    private Short d24FuncCd;
    @Column(name = "D25_MSG_RSN_CD")
    private Short d25MsgRsnCd;
    @Column(name = "D26_CRD_ACPTRBUS")
    private Short d26CrdAcptrbus;
    @Column(name = "D30S1_TR_ORIG_AMT")
    private BigDecimal d30s1TrOrigAmt;
    @Column(name = "D30S2_RN_ORIG_AMT")
    private BigDecimal d30s2RnOrigAmt;
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
    @Column(name = "P175_CRD_ACP_URL")
    private String p175CrdAcpUrl;
    @Column(name = "P191_OR_MSG_FMT")
    private Short p191OrMsgFmt;
    @Column(name = "P262_DOC_INDCTR")
    private Short p262DocIndctr;
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
    @Column(name = "P375_MBR_RCN_IND")
    private String p375MbrRcnInd;
    @Column(name = "P376_MBR_RCN_IND")
    private String p376MbrRcnInd;
    @Column(name = "D49_TRAN_CURR_CD")
    private Short d49TranCurrCd;
    @Column(name = "D50_RECON_CUR_CD")
    private Short d50ReconCurCd;
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

    public McFeeCollOth() {
    }

    public McFeeCollOth(McFeeCollOthPK mcFeeCollOthPK) {
        this.mcFeeCollOthPK = mcFeeCollOthPK;
    }

    public McFeeCollOth(McFeeCollOthPK mcFeeCollOthPK, Date mcMerchId, Character p158s11McmrchOvr) {
        this.mcFeeCollOthPK = mcFeeCollOthPK;
        this.mcMerchId = mcMerchId;
        this.p158s11McmrchOvr = p158s11McmrchOvr;
    }

    public McFeeCollOth(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcFeeCollOthPK = new McFeeCollOthPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McFeeCollOthPK getMcFeeCollOthPK() {
        return mcFeeCollOthPK;
    }

    public void setMcFeeCollOthPK(McFeeCollOthPK mcFeeCollOthPK) {
        this.mcFeeCollOthPK = mcFeeCollOthPK;
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

    public String getP175CrdAcpUrl() {
        return p175CrdAcpUrl;
    }

    public void setP175CrdAcpUrl(String p175CrdAcpUrl) {
        this.p175CrdAcpUrl = p175CrdAcpUrl;
    }

    public Short getP191OrMsgFmt() {
        return p191OrMsgFmt;
    }

    public void setP191OrMsgFmt(Short p191OrMsgFmt) {
        this.p191OrMsgFmt = p191OrMsgFmt;
    }

    public Short getP262DocIndctr() {
        return p262DocIndctr;
    }

    public void setP262DocIndctr(Short p262DocIndctr) {
        this.p262DocIndctr = p262DocIndctr;
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
        hash += (mcFeeCollOthPK != null ? mcFeeCollOthPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McFeeCollOth)) {
            return false;
        }
        McFeeCollOth other = (McFeeCollOth) object;
        if ((this.mcFeeCollOthPK == null && other.mcFeeCollOthPK != null) || (this.mcFeeCollOthPK != null && !this.mcFeeCollOthPK.equals(other.mcFeeCollOthPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McFeeCollOth[ mcFeeCollOthPK=" + mcFeeCollOthPK + " ]";
    }
    
}
