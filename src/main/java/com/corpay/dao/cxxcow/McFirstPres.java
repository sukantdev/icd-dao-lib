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
@Table(name = "MC_FIRST_PRES", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McFirstPres.findAll", query = "SELECT m FROM McFirstPres m"),
    @NamedQuery(name = "McFirstPres.findByP105s1FileTy", query = "SELECT m FROM McFirstPres m WHERE m.mcFirstPresPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McFirstPres.findByP105s2FileRDt", query = "SELECT m FROM McFirstPres m WHERE m.mcFirstPresPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McFirstPres.findByP105s3ProcId", query = "SELECT m FROM McFirstPres m WHERE m.mcFirstPresPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McFirstPres.findByP105s4FileSeqNo", query = "SELECT m FROM McFirstPres m WHERE m.mcFirstPresPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McFirstPres.findByMsgTyId", query = "SELECT m FROM McFirstPres m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McFirstPres.findByBitMapPri", query = "SELECT m FROM McFirstPres m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McFirstPres.findByD1BitMapSec", query = "SELECT m FROM McFirstPres m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McFirstPres.findByD2PriAccntNo", query = "SELECT m FROM McFirstPres m WHERE m.d2PriAccntNo = :d2PriAccntNo"),
    @NamedQuery(name = "McFirstPres.findByD3s1ChTranTy", query = "SELECT m FROM McFirstPres m WHERE m.d3s1ChTranTy = :d3s1ChTranTy"),
    @NamedQuery(name = "McFirstPres.findByD3s2ChFraccntty", query = "SELECT m FROM McFirstPres m WHERE m.d3s2ChFraccntty = :d3s2ChFraccntty"),
    @NamedQuery(name = "McFirstPres.findByD3s3ChToaccntty", query = "SELECT m FROM McFirstPres m WHERE m.d3s3ChToaccntty = :d3s3ChToaccntty"),
    @NamedQuery(name = "McFirstPres.findByD4TranAmt", query = "SELECT m FROM McFirstPres m WHERE m.d4TranAmt = :d4TranAmt"),
    @NamedQuery(name = "McFirstPres.findByD5ReconAmt", query = "SELECT m FROM McFirstPres m WHERE m.d5ReconAmt = :d5ReconAmt"),
    @NamedQuery(name = "McFirstPres.findByD6ChBillingAmt", query = "SELECT m FROM McFirstPres m WHERE m.d6ChBillingAmt = :d6ChBillingAmt"),
    @NamedQuery(name = "McFirstPres.findByD9ReconConvRt", query = "SELECT m FROM McFirstPres m WHERE m.d9ReconConvRt = :d9ReconConvRt"),
    @NamedQuery(name = "McFirstPres.findByD10ChBlngcnvRt", query = "SELECT m FROM McFirstPres m WHERE m.d10ChBlngcnvRt = :d10ChBlngcnvRt"),
    @NamedQuery(name = "McFirstPres.findByD12s1LocalTrDt", query = "SELECT m FROM McFirstPres m WHERE m.d12s1LocalTrDt = :d12s1LocalTrDt"),
    @NamedQuery(name = "McFirstPres.findByD12s2LocalTrTm", query = "SELECT m FROM McFirstPres m WHERE m.d12s2LocalTrTm = :d12s2LocalTrTm"),
    @NamedQuery(name = "McFirstPres.findByD22s1Crddatincp", query = "SELECT m FROM McFirstPres m WHERE m.d22s1Crddatincp = :d22s1Crddatincp"),
    @NamedQuery(name = "McFirstPres.findByD22s2ChAthCap", query = "SELECT m FROM McFirstPres m WHERE m.d22s2ChAthCap = :d22s2ChAthCap"),
    @NamedQuery(name = "McFirstPres.findByD22s3CrdcapCpblt", query = "SELECT m FROM McFirstPres m WHERE m.d22s3CrdcapCpblt = :d22s3CrdcapCpblt"),
    @NamedQuery(name = "McFirstPres.findByD22s4TermopEnv", query = "SELECT m FROM McFirstPres m WHERE m.d22s4TermopEnv = :d22s4TermopEnv"),
    @NamedQuery(name = "McFirstPres.findByD22s5ChPsntDat", query = "SELECT m FROM McFirstPres m WHERE m.d22s5ChPsntDat = :d22s5ChPsntDat"),
    @NamedQuery(name = "McFirstPres.findByD22s6CrdPsntDat", query = "SELECT m FROM McFirstPres m WHERE m.d22s6CrdPsntDat = :d22s6CrdPsntDat"),
    @NamedQuery(name = "McFirstPres.findByD22s7CrdDatMd", query = "SELECT m FROM McFirstPres m WHERE m.d22s7CrdDatMd = :d22s7CrdDatMd"),
    @NamedQuery(name = "McFirstPres.findByD22s8ChAthmtd", query = "SELECT m FROM McFirstPres m WHERE m.d22s8ChAthmtd = :d22s8ChAthmtd"),
    @NamedQuery(name = "McFirstPres.findByD22s9ChAthent", query = "SELECT m FROM McFirstPres m WHERE m.d22s9ChAthent = :d22s9ChAthent"),
    @NamedQuery(name = "McFirstPres.findByD22s10Crddatocap", query = "SELECT m FROM McFirstPres m WHERE m.d22s10Crddatocap = :d22s10Crddatocap"),
    @NamedQuery(name = "McFirstPres.findByD22s11Trmocpblt", query = "SELECT m FROM McFirstPres m WHERE m.d22s11Trmocpblt = :d22s11Trmocpblt"),
    @NamedQuery(name = "McFirstPres.findByD22s12PinCapCap", query = "SELECT m FROM McFirstPres m WHERE m.d22s12PinCapCap = :d22s12PinCapCap"),
    @NamedQuery(name = "McFirstPres.findByD23CardSeqNo", query = "SELECT m FROM McFirstPres m WHERE m.d23CardSeqNo = :d23CardSeqNo"),
    @NamedQuery(name = "McFirstPres.findByD24FuncCd", query = "SELECT m FROM McFirstPres m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McFirstPres.findByD25MsgRsnCd", query = "SELECT m FROM McFirstPres m WHERE m.d25MsgRsnCd = :d25MsgRsnCd"),
    @NamedQuery(name = "McFirstPres.findByD26CrdAcptrbus", query = "SELECT m FROM McFirstPres m WHERE m.d26CrdAcptrbus = :d26CrdAcptrbus"),
    @NamedQuery(name = "McFirstPres.findByD31s1IcRtDsgtr", query = "SELECT m FROM McFirstPres m WHERE m.d31s1IcRtDsgtr = :d31s1IcRtDsgtr"),
    @NamedQuery(name = "McFirstPres.findByD31s2AcquirBin", query = "SELECT m FROM McFirstPres m WHERE m.d31s2AcquirBin = :d31s2AcquirBin"),
    @NamedQuery(name = "McFirstPres.findByD31s3JulPrcDt", query = "SELECT m FROM McFirstPres m WHERE m.d31s3JulPrcDt = :d31s3JulPrcDt"),
    @NamedQuery(name = "McFirstPres.findByD31s4AcqSeqNo", query = "SELECT m FROM McFirstPres m WHERE m.d31s4AcqSeqNo = :d31s4AcqSeqNo"),
    @NamedQuery(name = "McFirstPres.findByD31s5CheckDigit", query = "SELECT m FROM McFirstPres m WHERE m.d31s5CheckDigit = :d31s5CheckDigit"),
    @NamedQuery(name = "McFirstPres.findByD32AcqInstIdCd", query = "SELECT m FROM McFirstPres m WHERE m.d32AcqInstIdCd = :d32AcqInstIdCd"),
    @NamedQuery(name = "McFirstPres.findByD33FwdngInstCd", query = "SELECT m FROM McFirstPres m WHERE m.d33FwdngInstCd = :d33FwdngInstCd"),
    @NamedQuery(name = "McFirstPres.findByD37RetrRefNo", query = "SELECT m FROM McFirstPres m WHERE m.d37RetrRefNo = :d37RetrRefNo"),
    @NamedQuery(name = "McFirstPres.findByD38ApprvlCd", query = "SELECT m FROM McFirstPres m WHERE m.d38ApprvlCd = :d38ApprvlCd"),
    @NamedQuery(name = "McFirstPres.findByD41CrdAcprTrm", query = "SELECT m FROM McFirstPres m WHERE m.d41CrdAcprTrm = :d41CrdAcprTrm"),
    @NamedQuery(name = "McFirstPres.findByD42CrdAcprId", query = "SELECT m FROM McFirstPres m WHERE m.d42CrdAcprId = :d42CrdAcprId"),
    @NamedQuery(name = "McFirstPres.findByMcMerchId", query = "SELECT m FROM McFirstPres m WHERE m.mcMerchId = :mcMerchId"),
    @NamedQuery(name = "McFirstPres.findByD48AddtlDat", query = "SELECT m FROM McFirstPres m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McFirstPres.findByP023TermTy", query = "SELECT m FROM McFirstPres m WHERE m.p023TermTy = :p023TermTy"),
    @NamedQuery(name = "McFirstPres.findByP025s1MsgRev", query = "SELECT m FROM McFirstPres m WHERE m.p025s1MsgRev = :p025s1MsgRev"),
    @NamedQuery(name = "McFirstPres.findByP025s2Cprdtorig", query = "SELECT m FROM McFirstPres m WHERE m.p025s2Cprdtorig = :p025s2Cprdtorig"),
    @NamedQuery(name = "McFirstPres.findByP158s1ApBrandId", query = "SELECT m FROM McFirstPres m WHERE m.p158s1ApBrandId = :p158s1ApBrandId"),
    @NamedQuery(name = "McFirstPres.findByP158s2BusSrvcLv", query = "SELECT m FROM McFirstPres m WHERE m.p158s2BusSrvcLv = :p158s2BusSrvcLv"),
    @NamedQuery(name = "McFirstPres.findByP158s3BusSrvcId", query = "SELECT m FROM McFirstPres m WHERE m.p158s3BusSrvcId = :p158s3BusSrvcId"),
    @NamedQuery(name = "McFirstPres.findByP158s4IcgRtDsgn", query = "SELECT m FROM McFirstPres m WHERE m.p158s4IcgRtDsgn = :p158s4IcgRtDsgn"),
    @NamedQuery(name = "McFirstPres.findByP158s5BusDt", query = "SELECT m FROM McFirstPres m WHERE m.p158s5BusDt = :p158s5BusDt"),
    @NamedQuery(name = "McFirstPres.findByP158s6BusCycle", query = "SELECT m FROM McFirstPres m WHERE m.p158s6BusCycle = :p158s6BusCycle"),
    @NamedQuery(name = "McFirstPres.findByP158s7MccOvr", query = "SELECT m FROM McFirstPres m WHERE m.p158s7MccOvr = :p158s7MccOvr"),
    @NamedQuery(name = "McFirstPres.findByP158s8ProdOvr", query = "SELECT m FROM McFirstPres m WHERE m.p158s8ProdOvr = :p158s8ProdOvr"),
    @NamedQuery(name = "McFirstPres.findByP158s9CorpIncrt", query = "SELECT m FROM McFirstPres m WHERE m.p158s9CorpIncrt = :p158s9CorpIncrt"),
    @NamedQuery(name = "McFirstPres.findByP158s10QualLvl", query = "SELECT m FROM McFirstPres m WHERE m.p158s10QualLvl = :p158s10QualLvl"),
    @NamedQuery(name = "McFirstPres.findByP159s1SSrvcTai", query = "SELECT m FROM McFirstPres m WHERE m.p159s1SSrvcTai = :p159s1SSrvcTai"),
    @NamedQuery(name = "McFirstPres.findByP159s2SSrvctaa", query = "SELECT m FROM McFirstPres m WHERE m.p159s2SSrvctaa = :p159s2SSrvctaa"),
    @NamedQuery(name = "McFirstPres.findByP159s3SSrvcLvl", query = "SELECT m FROM McFirstPres m WHERE m.p159s3SSrvcLvl = :p159s3SSrvcLvl"),
    @NamedQuery(name = "McFirstPres.findByP159s4SSrvcId", query = "SELECT m FROM McFirstPres m WHERE m.p159s4SSrvcId = :p159s4SSrvcId"),
    @NamedQuery(name = "McFirstPres.findByP159s5SFrnexCl", query = "SELECT m FROM McFirstPres m WHERE m.p159s5SFrnexCl = :p159s5SFrnexCl"),
    @NamedQuery(name = "McFirstPres.findByP159s6ReconDt", query = "SELECT m FROM McFirstPres m WHERE m.p159s6ReconDt = :p159s6ReconDt"),
    @NamedQuery(name = "McFirstPres.findByP159s7ReconCycle", query = "SELECT m FROM McFirstPres m WHERE m.p159s7ReconCycle = :p159s7ReconCycle"),
    @NamedQuery(name = "McFirstPres.findByP159s8StlDt", query = "SELECT m FROM McFirstPres m WHERE m.p159s8StlDt = :p159s8StlDt"),
    @NamedQuery(name = "McFirstPres.findByP159s9StlCycle", query = "SELECT m FROM McFirstPres m WHERE m.p159s9StlCycle = :p159s9StlCycle"),
    @NamedQuery(name = "McFirstPres.findByP165s1StlInd", query = "SELECT m FROM McFirstPres m WHERE m.p165s1StlInd = :p165s1StlInd"),
    @NamedQuery(name = "McFirstPres.findByP165s2StlInfo", query = "SELECT m FROM McFirstPres m WHERE m.p165s2StlInfo = :p165s2StlInfo"),
    @NamedQuery(name = "McFirstPres.findByP170s1CustsvcPh", query = "SELECT m FROM McFirstPres m WHERE m.p170s1CustsvcPh = :p170s1CustsvcPh"),
    @NamedQuery(name = "McFirstPres.findByP170s2CrdAcpPh", query = "SELECT m FROM McFirstPres m WHERE m.p170s2CrdAcpPh = :p170s2CrdAcpPh"),
    @NamedQuery(name = "McFirstPres.findByP170s3AdtlCtInf", query = "SELECT m FROM McFirstPres m WHERE m.p170s3AdtlCtInf = :p170s3AdtlCtInf"),
    @NamedQuery(name = "McFirstPres.findByP173LegCorpNm", query = "SELECT m FROM McFirstPres m WHERE m.p173LegCorpNm = :p173LegCorpNm"),
    @NamedQuery(name = "McFirstPres.findByP174DunBradNo", query = "SELECT m FROM McFirstPres m WHERE m.p174DunBradNo = :p174DunBradNo"),
    @NamedQuery(name = "McFirstPres.findByP191OrMsgFmt", query = "SELECT m FROM McFirstPres m WHERE m.p191OrMsgFmt = :p191OrMsgFmt"),
    @NamedQuery(name = "McFirstPres.findByD49TranCurrCd", query = "SELECT m FROM McFirstPres m WHERE m.d49TranCurrCd = :d49TranCurrCd"),
    @NamedQuery(name = "McFirstPres.findByD50ReconCurCd", query = "SELECT m FROM McFirstPres m WHERE m.d50ReconCurCd = :d50ReconCurCd"),
    @NamedQuery(name = "McFirstPres.findByD51ChBlCurCd", query = "SELECT m FROM McFirstPres m WHERE m.d51ChBlCurCd = :d51ChBlCurCd"),
    @NamedQuery(name = "McFirstPres.findByD63s1LfcycSpInd", query = "SELECT m FROM McFirstPres m WHERE m.d63s1LfcycSpInd = :d63s1LfcycSpInd"),
    @NamedQuery(name = "McFirstPres.findByD63s2TraceId", query = "SELECT m FROM McFirstPres m WHERE m.d63s2TraceId = :d63s2TraceId"),
    @NamedQuery(name = "McFirstPres.findByD63s3ValidnCd", query = "SELECT m FROM McFirstPres m WHERE m.d63s3ValidnCd = :d63s3ValidnCd"),
    @NamedQuery(name = "McFirstPres.findByD63s4LfcyctrSeq", query = "SELECT m FROM McFirstPres m WHERE m.d63s4LfcyctrSeq = :d63s4LfcyctrSeq"),
    @NamedQuery(name = "McFirstPres.findByD63s5LfcyctrTot", query = "SELECT m FROM McFirstPres m WHERE m.d63s5LfcyctrTot = :d63s5LfcyctrTot"),
    @NamedQuery(name = "McFirstPres.findByD71MsgNo", query = "SELECT m FROM McFirstPres m WHERE m.mcFirstPresPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McFirstPres.findByD93TrDestInst", query = "SELECT m FROM McFirstPres m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McFirstPres.findByD94TrOrgInst", query = "SELECT m FROM McFirstPres m WHERE m.d94TrOrgInst = :d94TrOrgInst"),
    @NamedQuery(name = "McFirstPres.findByD100RecvInstId", query = "SELECT m FROM McFirstPres m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McFirstPres.findByFpProcFlag", query = "SELECT m FROM McFirstPres m WHERE m.fpProcFlag = :fpProcFlag"),
    @NamedQuery(name = "McFirstPres.findByFpProcDt", query = "SELECT m FROM McFirstPres m WHERE m.fpProcDt = :fpProcDt"),
    @NamedQuery(name = "McFirstPres.findByFilteredFlags", query = "SELECT m FROM McFirstPres m WHERE m.filteredFlags = :filteredFlags"),
    @NamedQuery(name = "McFirstPres.findByD71MsgNoInet", query = "SELECT m FROM McFirstPres m WHERE m.d71MsgNoInet = :d71MsgNoInet"),
    @NamedQuery(name = "McFirstPres.findByD30s1TrOrigAmt", query = "SELECT m FROM McFirstPres m WHERE m.d30s1TrOrigAmt = :d30s1TrOrigAmt"),
    @NamedQuery(name = "McFirstPres.findByD30s2RnOrigAmt", query = "SELECT m FROM McFirstPres m WHERE m.d30s2RnOrigAmt = :d30s2RnOrigAmt"),
    @NamedQuery(name = "McFirstPres.findByD40ExtSrvCd", query = "SELECT m FROM McFirstPres m WHERE m.d40ExtSrvCd = :d40ExtSrvCd"),
    @NamedQuery(name = "McFirstPres.findByP149s1OrTaCur", query = "SELECT m FROM McFirstPres m WHERE m.p149s1OrTaCur = :p149s1OrTaCur"),
    @NamedQuery(name = "McFirstPres.findByP149s2OrRcncur", query = "SELECT m FROM McFirstPres m WHERE m.p149s2OrRcncur = :p149s2OrRcncur"),
    @NamedQuery(name = "McFirstPres.findByP263LfcycCd", query = "SELECT m FROM McFirstPres m WHERE m.p263LfcycCd = :p263LfcycCd"),
    @NamedQuery(name = "McFirstPres.findByP2ProdId", query = "SELECT m FROM McFirstPres m WHERE m.p2ProdId = :p2ProdId"),
    @NamedQuery(name = "McFirstPres.findByP177s1XborderInd", query = "SELECT m FROM McFirstPres m WHERE m.p177s1XborderInd = :p177s1XborderInd"),
    @NamedQuery(name = "McFirstPres.findByP177s2CurrInd", query = "SELECT m FROM McFirstPres m WHERE m.p177s2CurrInd = :p177s2CurrInd"),
    @NamedQuery(name = "McFirstPres.findByP3ProdId", query = "SELECT m FROM McFirstPres m WHERE m.p3ProdId = :p3ProdId"),
    @NamedQuery(name = "McFirstPres.findByP502s1CustIdTyp", query = "SELECT m FROM McFirstPres m WHERE m.p502s1CustIdTyp = :p502s1CustIdTyp"),
    @NamedQuery(name = "McFirstPres.findByP502s2CustIdDtl", query = "SELECT m FROM McFirstPres m WHERE m.p502s2CustIdDtl = :p502s2CustIdDtl"),
    @NamedQuery(name = "McFirstPres.findByAddendumFlags", query = "SELECT m FROM McFirstPres m WHERE m.addendumFlags = :addendumFlags"),
    @NamedQuery(name = "McFirstPres.findByP158s11McmrchOvr", query = "SELECT m FROM McFirstPres m WHERE m.p158s11McmrchOvr = :p158s11McmrchOvr"),
    @NamedQuery(name = "McFirstPres.findByP176Mcmrch", query = "SELECT m FROM McFirstPres m WHERE m.p176Mcmrch = :p176Mcmrch"),
    @NamedQuery(name = "McFirstPres.findByP596s1CrdacpTxid", query = "SELECT m FROM McFirstPres m WHERE m.p596s1CrdacpTxid = :p596s1CrdacpTxid"),
    @NamedQuery(name = "McFirstPres.findByP596s2CrdacpTxpc", query = "SELECT m FROM McFirstPres m WHERE m.p596s2CrdacpTxpc = :p596s2CrdacpTxpc"),
    @NamedQuery(name = "McFirstPres.findByP208s1PayFacilId", query = "SELECT m FROM McFirstPres m WHERE m.p208s1PayFacilId = :p208s1PayFacilId"),
    @NamedQuery(name = "McFirstPres.findByP208s2SubMerchId", query = "SELECT m FROM McFirstPres m WHERE m.p208s2SubMerchId = :p208s2SubMerchId"),
    @NamedQuery(name = "McFirstPres.findByP209IndepSalOrgId", query = "SELECT m FROM McFirstPres m WHERE m.p209IndepSalOrgId = :p209IndepSalOrgId"),
    @NamedQuery(name = "McFirstPres.findByP17TrnsIntgCls", query = "SELECT m FROM McFirstPres m WHERE m.p17TrnsIntgCls = :p17TrnsIntgCls"),
    @NamedQuery(name = "McFirstPres.findByRowChgTs", query = "SELECT m FROM McFirstPres m WHERE m.rowChgTs = :rowChgTs"),
    @NamedQuery(name = "McFirstPres.findByMcMerchIdSloc", query = "SELECT m FROM McFirstPres m WHERE m.mcMerchIdSloc = :mcMerchIdSloc")})
public class McFirstPres implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McFirstPresPK mcFirstPresPK;
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
    @Column(name = "D6_CH_BILLING_AMT")
    private BigDecimal d6ChBillingAmt;
    @Column(name = "D9_RECON_CONV_RT")
    private BigDecimal d9ReconConvRt;
    @Column(name = "D10_CH_BLNGCNV_RT")
    private BigDecimal d10ChBlngcnvRt;
    @Column(name = "D12S1_LOCAL_TR_DT")
    private Integer d12s1LocalTrDt;
    @Column(name = "D12S2_LOCAL_TR_TM")
    private Integer d12s2LocalTrTm;
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
    @Column(name = "D32_ACQ_INST_ID_CD")
    private Long d32AcqInstIdCd;
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
    @Column(name = "P023_TERM_TY")
    private String p023TermTy;
    @Column(name = "P025S1_MSG_REV")
    private Character p025s1MsgRev;
    @Column(name = "P025S2_CPRDTORIG")
    private Integer p025s2Cprdtorig;
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
    @Column(name = "P173_LEG_CORP_NM")
    private String p173LegCorpNm;
    @Column(name = "P174_DUN_BRAD_NO")
    private String p174DunBradNo;
    @Column(name = "P191_OR_MSG_FMT")
    private Short p191OrMsgFmt;
    @Column(name = "D49_TRAN_CURR_CD")
    private Short d49TranCurrCd;
    @Column(name = "D50_RECON_CUR_CD")
    private Short d50ReconCurCd;
    @Column(name = "D51_CH_BL_CUR_CD")
    private Short d51ChBlCurCd;
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
    @Column(name = "D93_TR_DEST_INST")
    private Long d93TrDestInst;
    @Column(name = "D94_TR_ORG_INST")
    private Long d94TrOrgInst;
    @Column(name = "D100_RECV_INST_ID")
    private Long d100RecvInstId;
    @Column(name = "FP_PROC_FLAG")
    private Character fpProcFlag;
    @Column(name = "FP_PROC_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fpProcDt;
    @Column(name = "FILTERED_FLAGS")
    private String filteredFlags;
    @Basic(optional = false)
    @Column(name = "D71_MSG_NO_INET")
    private int d71MsgNoInet;
    @Basic(optional = false)
    @Column(name = "D30S1_TR_ORIG_AMT")
    private BigDecimal d30s1TrOrigAmt;
    @Basic(optional = false)
    @Column(name = "D30S2_RN_ORIG_AMT")
    private BigDecimal d30s2RnOrigAmt;
    @Basic(optional = false)
    @Column(name = "D40_EXT_SRV_CD")
    private short d40ExtSrvCd;
    @Basic(optional = false)
    @Column(name = "P149S1_OR_TA_CUR")
    private short p149s1OrTaCur;
    @Basic(optional = false)
    @Column(name = "P149S2_OR_RCNCUR")
    private short p149s2OrRcncur;
    @Basic(optional = false)
    @Column(name = "P263_LFCYC_CD")
    private long p263LfcycCd;
    @Basic(optional = false)
    @Column(name = "P2_PROD_ID")
    private String p2ProdId;
    @Basic(optional = false)
    @Column(name = "P177S1_XBORDER_IND")
    private Character p177s1XborderInd;
    @Basic(optional = false)
    @Column(name = "P177S2_CURR_IND")
    private Character p177s2CurrInd;
    @Basic(optional = false)
    @Column(name = "P3_PROD_ID")
    private String p3ProdId;
    @Basic(optional = false)
    @Column(name = "P502S1_CUST_ID_TYP")
    private String p502s1CustIdTyp;
    @Basic(optional = false)
    @Column(name = "P502S2_CUST_ID_DTL")
    private String p502s2CustIdDtl;
    @Basic(optional = false)
    @Column(name = "ADDENDUM_FLAGS")
    private String addendumFlags;
    @Basic(optional = false)
    @Column(name = "P158S11_MCMRCH_OVR")
    private Character p158s11McmrchOvr;
    @Basic(optional = false)
    @Column(name = "P176_MCMRCH")
    private String p176Mcmrch;
    @Basic(optional = false)
    @Column(name = "P596S1_CRDACP_TXID")
    private String p596s1CrdacpTxid;
    @Basic(optional = false)
    @Column(name = "P596S2_CRDACP_TXPC")
    private Character p596s2CrdacpTxpc;
    @Basic(optional = false)
    @Column(name = "P208S1_PAY_FACIL_ID")
    private long p208s1PayFacilId;
    @Basic(optional = false)
    @Column(name = "P208S2_SUB_MERCH_ID")
    private String p208s2SubMerchId;
    @Basic(optional = false)
    @Column(name = "P209_INDEP_SAL_ORG_ID")
    private long p209IndepSalOrgId;
    @Basic(optional = false)
    @Column(name = "P17_TRNS_INTG_CLS")
    private String p17TrnsIntgCls;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;
    @Basic(optional = false)
    @Column(name = "MC_MERCH_ID_SLOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mcMerchIdSloc;

    public McFirstPres() {
    }

    public McFirstPres(McFirstPresPK mcFirstPresPK) {
        this.mcFirstPresPK = mcFirstPresPK;
    }

    public McFirstPres(McFirstPresPK mcFirstPresPK, Date mcMerchId, int d71MsgNoInet, BigDecimal d30s1TrOrigAmt, BigDecimal d30s2RnOrigAmt, short d40ExtSrvCd, short p149s1OrTaCur, short p149s2OrRcncur, long p263LfcycCd, String p2ProdId, Character p177s1XborderInd, Character p177s2CurrInd, String p3ProdId, String p502s1CustIdTyp, String p502s2CustIdDtl, String addendumFlags, Character p158s11McmrchOvr, String p176Mcmrch, String p596s1CrdacpTxid, Character p596s2CrdacpTxpc, long p208s1PayFacilId, String p208s2SubMerchId, long p209IndepSalOrgId, String p17TrnsIntgCls, Date rowChgTs, Date mcMerchIdSloc) {
        this.mcFirstPresPK = mcFirstPresPK;
        this.mcMerchId = mcMerchId;
        this.d71MsgNoInet = d71MsgNoInet;
        this.d30s1TrOrigAmt = d30s1TrOrigAmt;
        this.d30s2RnOrigAmt = d30s2RnOrigAmt;
        this.d40ExtSrvCd = d40ExtSrvCd;
        this.p149s1OrTaCur = p149s1OrTaCur;
        this.p149s2OrRcncur = p149s2OrRcncur;
        this.p263LfcycCd = p263LfcycCd;
        this.p2ProdId = p2ProdId;
        this.p177s1XborderInd = p177s1XborderInd;
        this.p177s2CurrInd = p177s2CurrInd;
        this.p3ProdId = p3ProdId;
        this.p502s1CustIdTyp = p502s1CustIdTyp;
        this.p502s2CustIdDtl = p502s2CustIdDtl;
        this.addendumFlags = addendumFlags;
        this.p158s11McmrchOvr = p158s11McmrchOvr;
        this.p176Mcmrch = p176Mcmrch;
        this.p596s1CrdacpTxid = p596s1CrdacpTxid;
        this.p596s2CrdacpTxpc = p596s2CrdacpTxpc;
        this.p208s1PayFacilId = p208s1PayFacilId;
        this.p208s2SubMerchId = p208s2SubMerchId;
        this.p209IndepSalOrgId = p209IndepSalOrgId;
        this.p17TrnsIntgCls = p17TrnsIntgCls;
        this.rowChgTs = rowChgTs;
        this.mcMerchIdSloc = mcMerchIdSloc;
    }

    public McFirstPres(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcFirstPresPK = new McFirstPresPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McFirstPresPK getMcFirstPresPK() {
        return mcFirstPresPK;
    }

    public void setMcFirstPresPK(McFirstPresPK mcFirstPresPK) {
        this.mcFirstPresPK = mcFirstPresPK;
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

    public BigDecimal getD10ChBlngcnvRt() {
        return d10ChBlngcnvRt;
    }

    public void setD10ChBlngcnvRt(BigDecimal d10ChBlngcnvRt) {
        this.d10ChBlngcnvRt = d10ChBlngcnvRt;
    }

    public Integer getD12s1LocalTrDt() {
        return d12s1LocalTrDt;
    }

    public void setD12s1LocalTrDt(Integer d12s1LocalTrDt) {
        this.d12s1LocalTrDt = d12s1LocalTrDt;
    }

    public Integer getD12s2LocalTrTm() {
        return d12s2LocalTrTm;
    }

    public void setD12s2LocalTrTm(Integer d12s2LocalTrTm) {
        this.d12s2LocalTrTm = d12s2LocalTrTm;
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

    public Short getP191OrMsgFmt() {
        return p191OrMsgFmt;
    }

    public void setP191OrMsgFmt(Short p191OrMsgFmt) {
        this.p191OrMsgFmt = p191OrMsgFmt;
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

    public Character getFpProcFlag() {
        return fpProcFlag;
    }

    public void setFpProcFlag(Character fpProcFlag) {
        this.fpProcFlag = fpProcFlag;
    }

    public Date getFpProcDt() {
        return fpProcDt;
    }

    public void setFpProcDt(Date fpProcDt) {
        this.fpProcDt = fpProcDt;
    }

    public String getFilteredFlags() {
        return filteredFlags;
    }

    public void setFilteredFlags(String filteredFlags) {
        this.filteredFlags = filteredFlags;
    }

    public int getD71MsgNoInet() {
        return d71MsgNoInet;
    }

    public void setD71MsgNoInet(int d71MsgNoInet) {
        this.d71MsgNoInet = d71MsgNoInet;
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

    public short getD40ExtSrvCd() {
        return d40ExtSrvCd;
    }

    public void setD40ExtSrvCd(short d40ExtSrvCd) {
        this.d40ExtSrvCd = d40ExtSrvCd;
    }

    public short getP149s1OrTaCur() {
        return p149s1OrTaCur;
    }

    public void setP149s1OrTaCur(short p149s1OrTaCur) {
        this.p149s1OrTaCur = p149s1OrTaCur;
    }

    public short getP149s2OrRcncur() {
        return p149s2OrRcncur;
    }

    public void setP149s2OrRcncur(short p149s2OrRcncur) {
        this.p149s2OrRcncur = p149s2OrRcncur;
    }

    public long getP263LfcycCd() {
        return p263LfcycCd;
    }

    public void setP263LfcycCd(long p263LfcycCd) {
        this.p263LfcycCd = p263LfcycCd;
    }

    public String getP2ProdId() {
        return p2ProdId;
    }

    public void setP2ProdId(String p2ProdId) {
        this.p2ProdId = p2ProdId;
    }

    public Character getP177s1XborderInd() {
        return p177s1XborderInd;
    }

    public void setP177s1XborderInd(Character p177s1XborderInd) {
        this.p177s1XborderInd = p177s1XborderInd;
    }

    public Character getP177s2CurrInd() {
        return p177s2CurrInd;
    }

    public void setP177s2CurrInd(Character p177s2CurrInd) {
        this.p177s2CurrInd = p177s2CurrInd;
    }

    public String getP3ProdId() {
        return p3ProdId;
    }

    public void setP3ProdId(String p3ProdId) {
        this.p3ProdId = p3ProdId;
    }

    public String getP502s1CustIdTyp() {
        return p502s1CustIdTyp;
    }

    public void setP502s1CustIdTyp(String p502s1CustIdTyp) {
        this.p502s1CustIdTyp = p502s1CustIdTyp;
    }

    public String getP502s2CustIdDtl() {
        return p502s2CustIdDtl;
    }

    public void setP502s2CustIdDtl(String p502s2CustIdDtl) {
        this.p502s2CustIdDtl = p502s2CustIdDtl;
    }

    public String getAddendumFlags() {
        return addendumFlags;
    }

    public void setAddendumFlags(String addendumFlags) {
        this.addendumFlags = addendumFlags;
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

    public String getP596s1CrdacpTxid() {
        return p596s1CrdacpTxid;
    }

    public void setP596s1CrdacpTxid(String p596s1CrdacpTxid) {
        this.p596s1CrdacpTxid = p596s1CrdacpTxid;
    }

    public Character getP596s2CrdacpTxpc() {
        return p596s2CrdacpTxpc;
    }

    public void setP596s2CrdacpTxpc(Character p596s2CrdacpTxpc) {
        this.p596s2CrdacpTxpc = p596s2CrdacpTxpc;
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

    public String getP17TrnsIntgCls() {
        return p17TrnsIntgCls;
    }

    public void setP17TrnsIntgCls(String p17TrnsIntgCls) {
        this.p17TrnsIntgCls = p17TrnsIntgCls;
    }

    public Date getRowChgTs() {
        return rowChgTs;
    }

    public void setRowChgTs(Date rowChgTs) {
        this.rowChgTs = rowChgTs;
    }

    public Date getMcMerchIdSloc() {
        return mcMerchIdSloc;
    }

    public void setMcMerchIdSloc(Date mcMerchIdSloc) {
        this.mcMerchIdSloc = mcMerchIdSloc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcFirstPresPK != null ? mcFirstPresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McFirstPres)) {
            return false;
        }
        McFirstPres other = (McFirstPres) object;
        if ((this.mcFirstPresPK == null && other.mcFirstPresPK != null) || (this.mcFirstPresPK != null && !this.mcFirstPresPK.equals(other.mcFirstPresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McFirstPres[ mcFirstPresPK=" + mcFirstPresPK + " ]";
    }
    
}
