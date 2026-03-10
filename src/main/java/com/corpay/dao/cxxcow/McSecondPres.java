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
@Table(name = "MC_SECOND_PRES", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McSecondPres.findAll", query = "SELECT m FROM McSecondPres m"),
    @NamedQuery(name = "McSecondPres.findByP105s1FileTy", query = "SELECT m FROM McSecondPres m WHERE m.mcSecondPresPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McSecondPres.findByP105s2FileRDt", query = "SELECT m FROM McSecondPres m WHERE m.mcSecondPresPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McSecondPres.findByP105s3ProcId", query = "SELECT m FROM McSecondPres m WHERE m.mcSecondPresPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McSecondPres.findByP105s4FileSeqNo", query = "SELECT m FROM McSecondPres m WHERE m.mcSecondPresPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McSecondPres.findByMsgTyId", query = "SELECT m FROM McSecondPres m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McSecondPres.findByBitMapPri", query = "SELECT m FROM McSecondPres m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McSecondPres.findByD1BitMapSec", query = "SELECT m FROM McSecondPres m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McSecondPres.findByD2PriAccntNo", query = "SELECT m FROM McSecondPres m WHERE m.d2PriAccntNo = :d2PriAccntNo"),
    @NamedQuery(name = "McSecondPres.findByD3s1ChTranTy", query = "SELECT m FROM McSecondPres m WHERE m.d3s1ChTranTy = :d3s1ChTranTy"),
    @NamedQuery(name = "McSecondPres.findByD3s2ChFraccntty", query = "SELECT m FROM McSecondPres m WHERE m.d3s2ChFraccntty = :d3s2ChFraccntty"),
    @NamedQuery(name = "McSecondPres.findByD3s3ChToaccntty", query = "SELECT m FROM McSecondPres m WHERE m.d3s3ChToaccntty = :d3s3ChToaccntty"),
    @NamedQuery(name = "McSecondPres.findByD4TranAmt", query = "SELECT m FROM McSecondPres m WHERE m.d4TranAmt = :d4TranAmt"),
    @NamedQuery(name = "McSecondPres.findByD5ReconAmt", query = "SELECT m FROM McSecondPres m WHERE m.d5ReconAmt = :d5ReconAmt"),
    @NamedQuery(name = "McSecondPres.findByD6ChBillingAmt", query = "SELECT m FROM McSecondPres m WHERE m.d6ChBillingAmt = :d6ChBillingAmt"),
    @NamedQuery(name = "McSecondPres.findByD9ReconConvRt", query = "SELECT m FROM McSecondPres m WHERE m.d9ReconConvRt = :d9ReconConvRt"),
    @NamedQuery(name = "McSecondPres.findByD10ChBlngcnvRt", query = "SELECT m FROM McSecondPres m WHERE m.d10ChBlngcnvRt = :d10ChBlngcnvRt"),
    @NamedQuery(name = "McSecondPres.findByD12s1LocalTrDt", query = "SELECT m FROM McSecondPres m WHERE m.d12s1LocalTrDt = :d12s1LocalTrDt"),
    @NamedQuery(name = "McSecondPres.findByD12s2LocalTrTm", query = "SELECT m FROM McSecondPres m WHERE m.d12s2LocalTrTm = :d12s2LocalTrTm"),
    @NamedQuery(name = "McSecondPres.findByD14ExpDt", query = "SELECT m FROM McSecondPres m WHERE m.d14ExpDt = :d14ExpDt"),
    @NamedQuery(name = "McSecondPres.findByD22s1Crddatincp", query = "SELECT m FROM McSecondPres m WHERE m.d22s1Crddatincp = :d22s1Crddatincp"),
    @NamedQuery(name = "McSecondPres.findByD22s2ChAthCap", query = "SELECT m FROM McSecondPres m WHERE m.d22s2ChAthCap = :d22s2ChAthCap"),
    @NamedQuery(name = "McSecondPres.findByD22s3CrdcapCpblt", query = "SELECT m FROM McSecondPres m WHERE m.d22s3CrdcapCpblt = :d22s3CrdcapCpblt"),
    @NamedQuery(name = "McSecondPres.findByD22s4TermopEnv", query = "SELECT m FROM McSecondPres m WHERE m.d22s4TermopEnv = :d22s4TermopEnv"),
    @NamedQuery(name = "McSecondPres.findByD22s5ChPsntDat", query = "SELECT m FROM McSecondPres m WHERE m.d22s5ChPsntDat = :d22s5ChPsntDat"),
    @NamedQuery(name = "McSecondPres.findByD22s6CrdPsntDat", query = "SELECT m FROM McSecondPres m WHERE m.d22s6CrdPsntDat = :d22s6CrdPsntDat"),
    @NamedQuery(name = "McSecondPres.findByD22s7CrdDatMd", query = "SELECT m FROM McSecondPres m WHERE m.d22s7CrdDatMd = :d22s7CrdDatMd"),
    @NamedQuery(name = "McSecondPres.findByD22s8ChAthmtd", query = "SELECT m FROM McSecondPres m WHERE m.d22s8ChAthmtd = :d22s8ChAthmtd"),
    @NamedQuery(name = "McSecondPres.findByD22s9ChAthent", query = "SELECT m FROM McSecondPres m WHERE m.d22s9ChAthent = :d22s9ChAthent"),
    @NamedQuery(name = "McSecondPres.findByD22s10Crddatocap", query = "SELECT m FROM McSecondPres m WHERE m.d22s10Crddatocap = :d22s10Crddatocap"),
    @NamedQuery(name = "McSecondPres.findByD22s11Trmocpblt", query = "SELECT m FROM McSecondPres m WHERE m.d22s11Trmocpblt = :d22s11Trmocpblt"),
    @NamedQuery(name = "McSecondPres.findByD22s12PinCapCap", query = "SELECT m FROM McSecondPres m WHERE m.d22s12PinCapCap = :d22s12PinCapCap"),
    @NamedQuery(name = "McSecondPres.findByD23CardSeqNo", query = "SELECT m FROM McSecondPres m WHERE m.d23CardSeqNo = :d23CardSeqNo"),
    @NamedQuery(name = "McSecondPres.findByD24FuncCd", query = "SELECT m FROM McSecondPres m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McSecondPres.findByD25MsgRsnCd", query = "SELECT m FROM McSecondPres m WHERE m.d25MsgRsnCd = :d25MsgRsnCd"),
    @NamedQuery(name = "McSecondPres.findByD26CrdAcptrbus", query = "SELECT m FROM McSecondPres m WHERE m.d26CrdAcptrbus = :d26CrdAcptrbus"),
    @NamedQuery(name = "McSecondPres.findByD30s1TrOrigAmt", query = "SELECT m FROM McSecondPres m WHERE m.d30s1TrOrigAmt = :d30s1TrOrigAmt"),
    @NamedQuery(name = "McSecondPres.findByD30s2RnOrigAmt", query = "SELECT m FROM McSecondPres m WHERE m.d30s2RnOrigAmt = :d30s2RnOrigAmt"),
    @NamedQuery(name = "McSecondPres.findByD31s1IcRtDsgtr", query = "SELECT m FROM McSecondPres m WHERE m.d31s1IcRtDsgtr = :d31s1IcRtDsgtr"),
    @NamedQuery(name = "McSecondPres.findByD31s2AcquirBin", query = "SELECT m FROM McSecondPres m WHERE m.d31s2AcquirBin = :d31s2AcquirBin"),
    @NamedQuery(name = "McSecondPres.findByD31s3JulPrcDt", query = "SELECT m FROM McSecondPres m WHERE m.d31s3JulPrcDt = :d31s3JulPrcDt"),
    @NamedQuery(name = "McSecondPres.findByD31s4AcqSeqNo", query = "SELECT m FROM McSecondPres m WHERE m.d31s4AcqSeqNo = :d31s4AcqSeqNo"),
    @NamedQuery(name = "McSecondPres.findByD31s5CheckDigit", query = "SELECT m FROM McSecondPres m WHERE m.d31s5CheckDigit = :d31s5CheckDigit"),
    @NamedQuery(name = "McSecondPres.findByD32AcqInstIdCd", query = "SELECT m FROM McSecondPres m WHERE m.d32AcqInstIdCd = :d32AcqInstIdCd"),
    @NamedQuery(name = "McSecondPres.findByD33FwdngInstCd", query = "SELECT m FROM McSecondPres m WHERE m.d33FwdngInstCd = :d33FwdngInstCd"),
    @NamedQuery(name = "McSecondPres.findByD37RetrRefNo", query = "SELECT m FROM McSecondPres m WHERE m.d37RetrRefNo = :d37RetrRefNo"),
    @NamedQuery(name = "McSecondPres.findByD38ApprvlCd", query = "SELECT m FROM McSecondPres m WHERE m.d38ApprvlCd = :d38ApprvlCd"),
    @NamedQuery(name = "McSecondPres.findByD41CrdAcprTrm", query = "SELECT m FROM McSecondPres m WHERE m.d41CrdAcprTrm = :d41CrdAcprTrm"),
    @NamedQuery(name = "McSecondPres.findByD42CrdAcprId", query = "SELECT m FROM McSecondPres m WHERE m.d42CrdAcprId = :d42CrdAcprId"),
    @NamedQuery(name = "McSecondPres.findByMcMerchId", query = "SELECT m FROM McSecondPres m WHERE m.mcMerchId = :mcMerchId"),
    @NamedQuery(name = "McSecondPres.findByD48AddtlDat", query = "SELECT m FROM McSecondPres m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McSecondPres.findByP023TermTy", query = "SELECT m FROM McSecondPres m WHERE m.p023TermTy = :p023TermTy"),
    @NamedQuery(name = "McSecondPres.findByP025s1MsgRev", query = "SELECT m FROM McSecondPres m WHERE m.p025s1MsgRev = :p025s1MsgRev"),
    @NamedQuery(name = "McSecondPres.findByP025s2Cprdtorig", query = "SELECT m FROM McSecondPres m WHERE m.p025s2Cprdtorig = :p025s2Cprdtorig"),
    @NamedQuery(name = "McSecondPres.findByP043PgmRegstn", query = "SELECT m FROM McSecondPres m WHERE m.p043PgmRegstn = :p043PgmRegstn"),
    @NamedQuery(name = "McSecondPres.findByP149s1OrTaCur", query = "SELECT m FROM McSecondPres m WHERE m.p149s1OrTaCur = :p149s1OrTaCur"),
    @NamedQuery(name = "McSecondPres.findByP149s2OrRcncur", query = "SELECT m FROM McSecondPres m WHERE m.p149s2OrRcncur = :p149s2OrRcncur"),
    @NamedQuery(name = "McSecondPres.findByP158s1ApBrandId", query = "SELECT m FROM McSecondPres m WHERE m.p158s1ApBrandId = :p158s1ApBrandId"),
    @NamedQuery(name = "McSecondPres.findByP158s2BusSrvcLv", query = "SELECT m FROM McSecondPres m WHERE m.p158s2BusSrvcLv = :p158s2BusSrvcLv"),
    @NamedQuery(name = "McSecondPres.findByP158s3BusSrvcId", query = "SELECT m FROM McSecondPres m WHERE m.p158s3BusSrvcId = :p158s3BusSrvcId"),
    @NamedQuery(name = "McSecondPres.findByP158s4IcgRtDsgn", query = "SELECT m FROM McSecondPres m WHERE m.p158s4IcgRtDsgn = :p158s4IcgRtDsgn"),
    @NamedQuery(name = "McSecondPres.findByP158s5BusDt", query = "SELECT m FROM McSecondPres m WHERE m.p158s5BusDt = :p158s5BusDt"),
    @NamedQuery(name = "McSecondPres.findByP158s6BusCycle", query = "SELECT m FROM McSecondPres m WHERE m.p158s6BusCycle = :p158s6BusCycle"),
    @NamedQuery(name = "McSecondPres.findByP158s7MccOvr", query = "SELECT m FROM McSecondPres m WHERE m.p158s7MccOvr = :p158s7MccOvr"),
    @NamedQuery(name = "McSecondPres.findByP158s8ProdOvr", query = "SELECT m FROM McSecondPres m WHERE m.p158s8ProdOvr = :p158s8ProdOvr"),
    @NamedQuery(name = "McSecondPres.findByP158s9CorpIncrt", query = "SELECT m FROM McSecondPres m WHERE m.p158s9CorpIncrt = :p158s9CorpIncrt"),
    @NamedQuery(name = "McSecondPres.findByP158s10QualLvl", query = "SELECT m FROM McSecondPres m WHERE m.p158s10QualLvl = :p158s10QualLvl"),
    @NamedQuery(name = "McSecondPres.findByP159s1SSrvcTai", query = "SELECT m FROM McSecondPres m WHERE m.p159s1SSrvcTai = :p159s1SSrvcTai"),
    @NamedQuery(name = "McSecondPres.findByP159s2SSrvctaa", query = "SELECT m FROM McSecondPres m WHERE m.p159s2SSrvctaa = :p159s2SSrvctaa"),
    @NamedQuery(name = "McSecondPres.findByP159s3SSrvcLvl", query = "SELECT m FROM McSecondPres m WHERE m.p159s3SSrvcLvl = :p159s3SSrvcLvl"),
    @NamedQuery(name = "McSecondPres.findByP159s4SSrvcId", query = "SELECT m FROM McSecondPres m WHERE m.p159s4SSrvcId = :p159s4SSrvcId"),
    @NamedQuery(name = "McSecondPres.findByP159s5SFrnexCl", query = "SELECT m FROM McSecondPres m WHERE m.p159s5SFrnexCl = :p159s5SFrnexCl"),
    @NamedQuery(name = "McSecondPres.findByP159s6ReconDt", query = "SELECT m FROM McSecondPres m WHERE m.p159s6ReconDt = :p159s6ReconDt"),
    @NamedQuery(name = "McSecondPres.findByP159s7ReconCycle", query = "SELECT m FROM McSecondPres m WHERE m.p159s7ReconCycle = :p159s7ReconCycle"),
    @NamedQuery(name = "McSecondPres.findByP159s8StlDt", query = "SELECT m FROM McSecondPres m WHERE m.p159s8StlDt = :p159s8StlDt"),
    @NamedQuery(name = "McSecondPres.findByP159s9StlCycle", query = "SELECT m FROM McSecondPres m WHERE m.p159s9StlCycle = :p159s9StlCycle"),
    @NamedQuery(name = "McSecondPres.findByP165s1StlInd", query = "SELECT m FROM McSecondPres m WHERE m.p165s1StlInd = :p165s1StlInd"),
    @NamedQuery(name = "McSecondPres.findByP165s2StlInfo", query = "SELECT m FROM McSecondPres m WHERE m.p165s2StlInfo = :p165s2StlInfo"),
    @NamedQuery(name = "McSecondPres.findByP170s1CustsvcPh", query = "SELECT m FROM McSecondPres m WHERE m.p170s1CustsvcPh = :p170s1CustsvcPh"),
    @NamedQuery(name = "McSecondPres.findByP170s2CrdAcpPh", query = "SELECT m FROM McSecondPres m WHERE m.p170s2CrdAcpPh = :p170s2CrdAcpPh"),
    @NamedQuery(name = "McSecondPres.findByP170s3AdtlCtInf", query = "SELECT m FROM McSecondPres m WHERE m.p170s3AdtlCtInf = :p170s3AdtlCtInf"),
    @NamedQuery(name = "McSecondPres.findByP171s1ChrSetInd", query = "SELECT m FROM McSecondPres m WHERE m.p171s1ChrSetInd = :p171s1ChrSetInd"),
    @NamedQuery(name = "McSecondPres.findByP171s2CrdAcpdsc", query = "SELECT m FROM McSecondPres m WHERE m.p171s2CrdAcpdsc = :p171s2CrdAcpdsc"),
    @NamedQuery(name = "McSecondPres.findByP172SoleProNm", query = "SELECT m FROM McSecondPres m WHERE m.p172SoleProNm = :p172SoleProNm"),
    @NamedQuery(name = "McSecondPres.findByP173LegCorpNm", query = "SELECT m FROM McSecondPres m WHERE m.p173LegCorpNm = :p173LegCorpNm"),
    @NamedQuery(name = "McSecondPres.findByP174DunBradNo", query = "SELECT m FROM McSecondPres m WHERE m.p174DunBradNo = :p174DunBradNo"),
    @NamedQuery(name = "McSecondPres.findByP175CrdAcpUrl", query = "SELECT m FROM McSecondPres m WHERE m.p175CrdAcpUrl = :p175CrdAcpUrl"),
    @NamedQuery(name = "McSecondPres.findByP189s1FormatNo", query = "SELECT m FROM McSecondPres m WHERE m.p189s1FormatNo = :p189s1FormatNo"),
    @NamedQuery(name = "McSecondPres.findByP189s2PhoneDat", query = "SELECT m FROM McSecondPres m WHERE m.p189s2PhoneDat = :p189s2PhoneDat"),
    @NamedQuery(name = "McSecondPres.findByP190PartIdCd", query = "SELECT m FROM McSecondPres m WHERE m.p190PartIdCd = :p190PartIdCd"),
    @NamedQuery(name = "McSecondPres.findByP191OrMsgFmt", query = "SELECT m FROM McSecondPres m WHERE m.p191OrMsgFmt = :p191OrMsgFmt"),
    @NamedQuery(name = "McSecondPres.findByP241MstcCntl", query = "SELECT m FROM McSecondPres m WHERE m.p241MstcCntl = :p241MstcCntl"),
    @NamedQuery(name = "McSecondPres.findByP243s1McomIRdt", query = "SELECT m FROM McSecondPres m WHERE m.p243s1McomIRdt = :p243s1McomIRdt"),
    @NamedQuery(name = "McSecondPres.findByP243s2McomAcqRs", query = "SELECT m FROM McSecondPres m WHERE m.p243s2McomAcqRs = :p243s2McomAcqRs"),
    @NamedQuery(name = "McSecondPres.findByP243s3McomARdt", query = "SELECT m FROM McSecondPres m WHERE m.p243s3McomARdt = :p243s3McomARdt"),
    @NamedQuery(name = "McSecondPres.findByP243s4McomIRc", query = "SELECT m FROM McSecondPres m WHERE m.p243s4McomIRc = :p243s4McomIRc"),
    @NamedQuery(name = "McSecondPres.findByP243s5McomIRDt", query = "SELECT m FROM McSecondPres m WHERE m.p243s5McomIRDt = :p243s5McomIRDt"),
    @NamedQuery(name = "McSecondPres.findByP243s6McomIRejr", query = "SELECT m FROM McSecondPres m WHERE m.p243s6McomIRejr = :p243s6McomIRejr"),
    @NamedQuery(name = "McSecondPres.findByP243s7McomImRv", query = "SELECT m FROM McSecondPres m WHERE m.p243s7McomImRv = :p243s7McomImRv"),
    @NamedQuery(name = "McSecondPres.findByP243s8McomImRdt", query = "SELECT m FROM McSecondPres m WHERE m.p243s8McomImRdt = :p243s8McomImRdt"),
    @NamedQuery(name = "McSecondPres.findByP244s1McomCbDt", query = "SELECT m FROM McSecondPres m WHERE m.p244s1McomCbDt = :p244s1McomCbDt"),
    @NamedQuery(name = "McSecondPres.findByP244s2McomCbDt2", query = "SELECT m FROM McSecondPres m WHERE m.p244s2McomCbDt2 = :p244s2McomCbDt2"),
    @NamedQuery(name = "McSecondPres.findByP260s1ExcReqCd", query = "SELECT m FROM McSecondPres m WHERE m.p260s1ExcReqCd = :p260s1ExcReqCd"),
    @NamedQuery(name = "McSecondPres.findByP260s2ExcRsnCd", query = "SELECT m FROM McSecondPres m WHERE m.p260s2ExcRsnCd = :p260s2ExcRsnCd"),
    @NamedQuery(name = "McSecondPres.findByP260s3ExcResCd", query = "SELECT m FROM McSecondPres m WHERE m.p260s3ExcResCd = :p260s3ExcResCd"),
    @NamedQuery(name = "McSecondPres.findByP262DocIndctr", query = "SELECT m FROM McSecondPres m WHERE m.p262DocIndctr = :p262DocIndctr"),
    @NamedQuery(name = "McSecondPres.findByP266s1MsgRsnCd", query = "SELECT m FROM McSecondPres m WHERE m.p266s1MsgRsnCd = :p266s1MsgRsnCd"),
    @NamedQuery(name = "McSecondPres.findByP266s2FstrtnDt", query = "SELECT m FROM McSecondPres m WHERE m.p266s2FstrtnDt = :p266s2FstrtnDt"),
    @NamedQuery(name = "McSecondPres.findByP266s3EditExRsn", query = "SELECT m FROM McSecondPres m WHERE m.p266s3EditExRsn = :p266s3EditExRsn"),
    @NamedQuery(name = "McSecondPres.findByP266s4EditExRes", query = "SELECT m FROM McSecondPres m WHERE m.p266s4EditExRes = :p266s4EditExRes"),
    @NamedQuery(name = "McSecondPres.findByP266s5FstrtnAmt", query = "SELECT m FROM McSecondPres m WHERE m.p266s5FstrtnAmt = :p266s5FstrtnAmt"),
    @NamedQuery(name = "McSecondPres.findByP266s6FstRtnCur", query = "SELECT m FROM McSecondPres m WHERE m.p266s6FstRtnCur = :p266s6FstRtnCur"),
    @NamedQuery(name = "McSecondPres.findByP266s7FstRtnDat", query = "SELECT m FROM McSecondPres m WHERE m.p266s7FstRtnDat = :p266s7FstRtnDat"),
    @NamedQuery(name = "McSecondPres.findByP268s1PrtTrnAmt", query = "SELECT m FROM McSecondPres m WHERE m.p268s1PrtTrnAmt = :p268s1PrtTrnAmt"),
    @NamedQuery(name = "McSecondPres.findByP268s2PrtTranCc", query = "SELECT m FROM McSecondPres m WHERE m.p268s2PrtTranCc = :p268s2PrtTranCc"),
    @NamedQuery(name = "McSecondPres.findByD49TranCurrCd", query = "SELECT m FROM McSecondPres m WHERE m.d49TranCurrCd = :d49TranCurrCd"),
    @NamedQuery(name = "McSecondPres.findByD50ReconCurCd", query = "SELECT m FROM McSecondPres m WHERE m.d50ReconCurCd = :d50ReconCurCd"),
    @NamedQuery(name = "McSecondPres.findByD51ChBlCurCd", query = "SELECT m FROM McSecondPres m WHERE m.d51ChBlCurCd = :d51ChBlCurCd"),
    @NamedQuery(name = "McSecondPres.findByD55IntdCirSys", query = "SELECT m FROM McSecondPres m WHERE m.d55IntdCirSys = :d55IntdCirSys"),
    @NamedQuery(name = "McSecondPres.findByD62AddtlData2", query = "SELECT m FROM McSecondPres m WHERE m.d62AddtlData2 = :d62AddtlData2"),
    @NamedQuery(name = "McSecondPres.findByD63s1LfcycSpInd", query = "SELECT m FROM McSecondPres m WHERE m.d63s1LfcycSpInd = :d63s1LfcycSpInd"),
    @NamedQuery(name = "McSecondPres.findByD63s2TraceId", query = "SELECT m FROM McSecondPres m WHERE m.d63s2TraceId = :d63s2TraceId"),
    @NamedQuery(name = "McSecondPres.findByD63s3ValidnCd", query = "SELECT m FROM McSecondPres m WHERE m.d63s3ValidnCd = :d63s3ValidnCd"),
    @NamedQuery(name = "McSecondPres.findByD63s4LfcyctrSeq", query = "SELECT m FROM McSecondPres m WHERE m.d63s4LfcyctrSeq = :d63s4LfcyctrSeq"),
    @NamedQuery(name = "McSecondPres.findByD63s5LfcyctrTot", query = "SELECT m FROM McSecondPres m WHERE m.d63s5LfcyctrTot = :d63s5LfcyctrTot"),
    @NamedQuery(name = "McSecondPres.findByD71MsgNo", query = "SELECT m FROM McSecondPres m WHERE m.mcSecondPresPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McSecondPres.findByD72DataRec", query = "SELECT m FROM McSecondPres m WHERE m.d72DataRec = :d72DataRec"),
    @NamedQuery(name = "McSecondPres.findByD93TrDestInst", query = "SELECT m FROM McSecondPres m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McSecondPres.findByD94TrOrgInst", query = "SELECT m FROM McSecondPres m WHERE m.d94TrOrgInst = :d94TrOrgInst"),
    @NamedQuery(name = "McSecondPres.findByD95CrdIssuerRef", query = "SELECT m FROM McSecondPres m WHERE m.d95CrdIssuerRef = :d95CrdIssuerRef"),
    @NamedQuery(name = "McSecondPres.findByD100RecvInstId", query = "SELECT m FROM McSecondPres m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McSecondPres.findByD123AddtlDat3", query = "SELECT m FROM McSecondPres m WHERE m.d123AddtlDat3 = :d123AddtlDat3"),
    @NamedQuery(name = "McSecondPres.findByD124AddtlDat4", query = "SELECT m FROM McSecondPres m WHERE m.d124AddtlDat4 = :d124AddtlDat4"),
    @NamedQuery(name = "McSecondPres.findByD125AddtlDat5", query = "SELECT m FROM McSecondPres m WHERE m.d125AddtlDat5 = :d125AddtlDat5"),
    @NamedQuery(name = "McSecondPres.findByU0001Status", query = "SELECT m FROM McSecondPres m WHERE m.u0001Status = :u0001Status"),
    @NamedQuery(name = "McSecondPres.findByU0002DocInd", query = "SELECT m FROM McSecondPres m WHERE m.u0002DocInd = :u0002DocInd"),
    @NamedQuery(name = "McSecondPres.findByFpProcDt", query = "SELECT m FROM McSecondPres m WHERE m.fpProcDt = :fpProcDt"),
    @NamedQuery(name = "McSecondPres.findByD40ExtSrvCd", query = "SELECT m FROM McSecondPres m WHERE m.d40ExtSrvCd = :d40ExtSrvCd"),
    @NamedQuery(name = "McSecondPres.findByP263LfcycCd", query = "SELECT m FROM McSecondPres m WHERE m.p263LfcycCd = :p263LfcycCd"),
    @NamedQuery(name = "McSecondPres.findByP3ProdId", query = "SELECT m FROM McSecondPres m WHERE m.p3ProdId = :p3ProdId"),
    @NamedQuery(name = "McSecondPres.findByP158s11McmrchOvr", query = "SELECT m FROM McSecondPres m WHERE m.p158s11McmrchOvr = :p158s11McmrchOvr"),
    @NamedQuery(name = "McSecondPres.findByP176Mcmrch", query = "SELECT m FROM McSecondPres m WHERE m.p176Mcmrch = :p176Mcmrch"),
    @NamedQuery(name = "McSecondPres.findByP208s1PayFacilId", query = "SELECT m FROM McSecondPres m WHERE m.p208s1PayFacilId = :p208s1PayFacilId"),
    @NamedQuery(name = "McSecondPres.findByP208s2SubMerchId", query = "SELECT m FROM McSecondPres m WHERE m.p208s2SubMerchId = :p208s2SubMerchId"),
    @NamedQuery(name = "McSecondPres.findByP209IndepSalOrgId", query = "SELECT m FROM McSecondPres m WHERE m.p209IndepSalOrgId = :p209IndepSalOrgId"),
    @NamedQuery(name = "McSecondPres.findByMcMerchIdSloc", query = "SELECT m FROM McSecondPres m WHERE m.mcMerchIdSloc = :mcMerchIdSloc")})
public class McSecondPres implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McSecondPresPK mcSecondPresPK;
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
    @Column(name = "P043_PGM_REGSTN")
    private String p043PgmRegstn;
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
    @Column(name = "P241_MSTC_CNTL")
    private String p241MstcCntl;
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
    @Column(name = "P268S1_PRT_TRN_AMT")
    private BigDecimal p268s1PrtTrnAmt;
    @Column(name = "P268S2_PRT_TRAN_CC")
    private Short p268s2PrtTranCc;
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
    @Basic(optional = false)
    @Column(name = "U0001_STATUS")
    private Character u0001Status;
    @Basic(optional = false)
    @Column(name = "U0002_DOC_IND")
    private Character u0002DocInd;
    @Basic(optional = false)
    @Column(name = "FP_PROC_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fpProcDt;
    @Basic(optional = false)
    @Column(name = "D40_EXT_SRV_CD")
    private short d40ExtSrvCd;
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
    @Basic(optional = false)
    @Column(name = "MC_MERCH_ID_SLOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mcMerchIdSloc;

    public McSecondPres() {
    }

    public McSecondPres(McSecondPresPK mcSecondPresPK) {
        this.mcSecondPresPK = mcSecondPresPK;
    }

    public McSecondPres(McSecondPresPK mcSecondPresPK, Date mcMerchId, Character u0001Status, Character u0002DocInd, Date fpProcDt, short d40ExtSrvCd, long p263LfcycCd, String p3ProdId, Character p158s11McmrchOvr, String p176Mcmrch, long p208s1PayFacilId, String p208s2SubMerchId, long p209IndepSalOrgId, Date mcMerchIdSloc) {
        this.mcSecondPresPK = mcSecondPresPK;
        this.mcMerchId = mcMerchId;
        this.u0001Status = u0001Status;
        this.u0002DocInd = u0002DocInd;
        this.fpProcDt = fpProcDt;
        this.d40ExtSrvCd = d40ExtSrvCd;
        this.p263LfcycCd = p263LfcycCd;
        this.p3ProdId = p3ProdId;
        this.p158s11McmrchOvr = p158s11McmrchOvr;
        this.p176Mcmrch = p176Mcmrch;
        this.p208s1PayFacilId = p208s1PayFacilId;
        this.p208s2SubMerchId = p208s2SubMerchId;
        this.p209IndepSalOrgId = p209IndepSalOrgId;
        this.mcMerchIdSloc = mcMerchIdSloc;
    }

    public McSecondPres(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcSecondPresPK = new McSecondPresPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McSecondPresPK getMcSecondPresPK() {
        return mcSecondPresPK;
    }

    public void setMcSecondPresPK(McSecondPresPK mcSecondPresPK) {
        this.mcSecondPresPK = mcSecondPresPK;
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

    public String getP043PgmRegstn() {
        return p043PgmRegstn;
    }

    public void setP043PgmRegstn(String p043PgmRegstn) {
        this.p043PgmRegstn = p043PgmRegstn;
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

    public String getP241MstcCntl() {
        return p241MstcCntl;
    }

    public void setP241MstcCntl(String p241MstcCntl) {
        this.p241MstcCntl = p241MstcCntl;
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

    public Character getU0001Status() {
        return u0001Status;
    }

    public void setU0001Status(Character u0001Status) {
        this.u0001Status = u0001Status;
    }

    public Character getU0002DocInd() {
        return u0002DocInd;
    }

    public void setU0002DocInd(Character u0002DocInd) {
        this.u0002DocInd = u0002DocInd;
    }

    public Date getFpProcDt() {
        return fpProcDt;
    }

    public void setFpProcDt(Date fpProcDt) {
        this.fpProcDt = fpProcDt;
    }

    public short getD40ExtSrvCd() {
        return d40ExtSrvCd;
    }

    public void setD40ExtSrvCd(short d40ExtSrvCd) {
        this.d40ExtSrvCd = d40ExtSrvCd;
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

    public Date getMcMerchIdSloc() {
        return mcMerchIdSloc;
    }

    public void setMcMerchIdSloc(Date mcMerchIdSloc) {
        this.mcMerchIdSloc = mcMerchIdSloc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcSecondPresPK != null ? mcSecondPresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McSecondPres)) {
            return false;
        }
        McSecondPres other = (McSecondPres) object;
        if ((this.mcSecondPresPK == null && other.mcSecondPresPK != null) || (this.mcSecondPresPK != null && !this.mcSecondPresPK.equals(other.mcSecondPresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McSecondPres[ mcSecondPresPK=" + mcSecondPresPK + " ]";
    }
    
}
