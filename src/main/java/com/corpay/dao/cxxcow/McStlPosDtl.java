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
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_STL_POS_DTL", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McStlPosDtl.findAll", query = "SELECT m FROM McStlPosDtl m"),
    @NamedQuery(name = "McStlPosDtl.findByP105s1FileTy", query = "SELECT m FROM McStlPosDtl m WHERE m.mcStlPosDtlPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McStlPosDtl.findByP105s2FileRDt", query = "SELECT m FROM McStlPosDtl m WHERE m.mcStlPosDtlPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McStlPosDtl.findByP105s3ProcId", query = "SELECT m FROM McStlPosDtl m WHERE m.mcStlPosDtlPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McStlPosDtl.findByP105s4FileSeqNo", query = "SELECT m FROM McStlPosDtl m WHERE m.mcStlPosDtlPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McStlPosDtl.findByD71MsgNo", query = "SELECT m FROM McStlPosDtl m WHERE m.mcStlPosDtlPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McStlPosDtl.findByMsgTyId", query = "SELECT m FROM McStlPosDtl m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McStlPosDtl.findByBitMapPri", query = "SELECT m FROM McStlPosDtl m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McStlPosDtl.findByD1BitMapSec", query = "SELECT m FROM McStlPosDtl m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McStlPosDtl.findByD24FuncCd", query = "SELECT m FROM McStlPosDtl m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McStlPosDtl.findByD25MsgRsnCd", query = "SELECT m FROM McStlPosDtl m WHERE m.d25MsgRsnCd = :d25MsgRsnCd"),
    @NamedQuery(name = "McStlPosDtl.findByD48AddtlDat", query = "SELECT m FROM McStlPosDtl m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McStlPosDtl.findByP300s1FileTy", query = "SELECT m FROM McStlPosDtl m WHERE m.p300s1FileTy = :p300s1FileTy"),
    @NamedQuery(name = "McStlPosDtl.findByP300s2FileRefDt", query = "SELECT m FROM McStlPosDtl m WHERE m.p300s2FileRefDt = :p300s2FileRefDt"),
    @NamedQuery(name = "McStlPosDtl.findByP300s3ProcId", query = "SELECT m FROM McStlPosDtl m WHERE m.p300s3ProcId = :p300s3ProcId"),
    @NamedQuery(name = "McStlPosDtl.findByP300s4FileSeqNo", query = "SELECT m FROM McStlPosDtl m WHERE m.p300s4FileSeqNo = :p300s4FileSeqNo"),
    @NamedQuery(name = "McStlPosDtl.findByP302MbrActRec", query = "SELECT m FROM McStlPosDtl m WHERE m.p302MbrActRec = :p302MbrActRec"),
    @NamedQuery(name = "McStlPosDtl.findByP359s1StlsrvcTai", query = "SELECT m FROM McStlPosDtl m WHERE m.p359s1StlsrvcTai = :p359s1StlsrvcTai"),
    @NamedQuery(name = "McStlPosDtl.findByP359s2StlsrvcTaa", query = "SELECT m FROM McStlPosDtl m WHERE m.p359s2StlsrvcTaa = :p359s2StlsrvcTaa"),
    @NamedQuery(name = "McStlPosDtl.findByP359s3StlsrvcLvl", query = "SELECT m FROM McStlPosDtl m WHERE m.p359s3StlsrvcLvl = :p359s3StlsrvcLvl"),
    @NamedQuery(name = "McStlPosDtl.findByP359s4StlsrvcId", query = "SELECT m FROM McStlPosDtl m WHERE m.p359s4StlsrvcId = :p359s4StlsrvcId"),
    @NamedQuery(name = "McStlPosDtl.findByP359s5StlfexRtC", query = "SELECT m FROM McStlPosDtl m WHERE m.p359s5StlfexRtC = :p359s5StlfexRtC"),
    @NamedQuery(name = "McStlPosDtl.findByP359s6ReconDt", query = "SELECT m FROM McStlPosDtl m WHERE m.p359s6ReconDt = :p359s6ReconDt"),
    @NamedQuery(name = "McStlPosDtl.findByP359s7ReconCd", query = "SELECT m FROM McStlPosDtl m WHERE m.p359s7ReconCd = :p359s7ReconCd"),
    @NamedQuery(name = "McStlPosDtl.findByP359s8StlDt", query = "SELECT m FROM McStlPosDtl m WHERE m.p359s8StlDt = :p359s8StlDt"),
    @NamedQuery(name = "McStlPosDtl.findByP359s9StlCycle", query = "SELECT m FROM McStlPosDtl m WHERE m.p359s9StlCycle = :p359s9StlCycle"),
    @NamedQuery(name = "McStlPosDtl.findByP367ApBrandId", query = "SELECT m FROM McStlPosDtl m WHERE m.p367ApBrandId = :p367ApBrandId"),
    @NamedQuery(name = "McStlPosDtl.findByP368FuncgrpCd", query = "SELECT m FROM McStlPosDtl m WHERE m.p368FuncgrpCd = :p368FuncgrpCd"),
    @NamedQuery(name = "McStlPosDtl.findByP369AcquirBin", query = "SELECT m FROM McStlPosDtl m WHERE m.p369AcquirBin = :p369AcquirBin"),
    @NamedQuery(name = "McStlPosDtl.findByP370s1BegActRng", query = "SELECT m FROM McStlPosDtl m WHERE m.p370s1BegActRng = :p370s1BegActRng"),
    @NamedQuery(name = "McStlPosDtl.findByP370s2EndActRng", query = "SELECT m FROM McStlPosDtl m WHERE m.p370s2EndActRng = :p370s2EndActRng"),
    @NamedQuery(name = "McStlPosDtl.findByP390s1DbInd", query = "SELECT m FROM McStlPosDtl m WHERE m.p390s1DbInd = :p390s1DbInd"),
    @NamedQuery(name = "McStlPosDtl.findByP390s2TranAmt", query = "SELECT m FROM McStlPosDtl m WHERE m.p390s2TranAmt = :p390s2TranAmt"),
    @NamedQuery(name = "McStlPosDtl.findByP391s1CrInd", query = "SELECT m FROM McStlPosDtl m WHERE m.p391s1CrInd = :p391s1CrInd"),
    @NamedQuery(name = "McStlPosDtl.findByP391s2TranAmt", query = "SELECT m FROM McStlPosDtl m WHERE m.p391s2TranAmt = :p391s2TranAmt"),
    @NamedQuery(name = "McStlPosDtl.findByP394s1NetDbInd", query = "SELECT m FROM McStlPosDtl m WHERE m.p394s1NetDbInd = :p394s1NetDbInd"),
    @NamedQuery(name = "McStlPosDtl.findByP394s2NetTrAmt", query = "SELECT m FROM McStlPosDtl m WHERE m.p394s2NetTrAmt = :p394s2NetTrAmt"),
    @NamedQuery(name = "McStlPosDtl.findByP395s1NetCrInd", query = "SELECT m FROM McStlPosDtl m WHERE m.p395s1NetCrInd = :p395s1NetCrInd"),
    @NamedQuery(name = "McStlPosDtl.findByP395s2NetTrnAmt", query = "SELECT m FROM McStlPosDtl m WHERE m.p395s2NetTrnAmt = :p395s2NetTrnAmt"),
    @NamedQuery(name = "McStlPosDtl.findByP396s1NetInd", query = "SELECT m FROM McStlPosDtl m WHERE m.p396s1NetInd = :p396s1NetInd"),
    @NamedQuery(name = "McStlPosDtl.findByP396s2NetTrnAmt", query = "SELECT m FROM McStlPosDtl m WHERE m.p396s2NetTrnAmt = :p396s2NetTrnAmt"),
    @NamedQuery(name = "McStlPosDtl.findByD49TranCurrCd", query = "SELECT m FROM McStlPosDtl m WHERE m.d49TranCurrCd = :d49TranCurrCd"),
    @NamedQuery(name = "McStlPosDtl.findByD50ReconCurCd", query = "SELECT m FROM McStlPosDtl m WHERE m.d50ReconCurCd = :d50ReconCurCd"),
    @NamedQuery(name = "McStlPosDtl.findByD62AddtlData2", query = "SELECT m FROM McStlPosDtl m WHERE m.d62AddtlData2 = :d62AddtlData2"),
    @NamedQuery(name = "McStlPosDtl.findByD93TrDestInst", query = "SELECT m FROM McStlPosDtl m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McStlPosDtl.findByD100RecvInstId", query = "SELECT m FROM McStlPosDtl m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McStlPosDtl.findByD123AddtlDat3", query = "SELECT m FROM McStlPosDtl m WHERE m.d123AddtlDat3 = :d123AddtlDat3"),
    @NamedQuery(name = "McStlPosDtl.findByD124AddtlDat4", query = "SELECT m FROM McStlPosDtl m WHERE m.d124AddtlDat4 = :d124AddtlDat4"),
    @NamedQuery(name = "McStlPosDtl.findByD125AddtlDat5", query = "SELECT m FROM McStlPosDtl m WHERE m.d125AddtlDat5 = :d125AddtlDat5")})
public class McStlPosDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McStlPosDtlPK mcStlPosDtlPK;
    @Basic(optional = false)
    @Column(name = "MSG_TY_ID")
    private short msgTyId;
    @Basic(optional = false)
    @Column(name = "BIT_MAP_PRI")
    private String bitMapPri;
    @Basic(optional = false)
    @Column(name = "D1_BIT_MAP_SEC")
    private String d1BitMapSec;
    @Basic(optional = false)
    @Column(name = "D24_FUNC_CD")
    private short d24FuncCd;
    @Basic(optional = false)
    @Column(name = "D25_MSG_RSN_CD")
    private short d25MsgRsnCd;
    @Basic(optional = false)
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
    @Basic(optional = false)
    @Column(name = "P300S1_FILE_TY")
    private short p300s1FileTy;
    @Basic(optional = false)
    @Column(name = "P300S2_FILE_REF_DT")
    private int p300s2FileRefDt;
    @Basic(optional = false)
    @Column(name = "P300S3_PROC_ID")
    private long p300s3ProcId;
    @Basic(optional = false)
    @Column(name = "P300S4_FILE_SEQ_NO")
    private int p300s4FileSeqNo;
    @Basic(optional = false)
    @Column(name = "P302_MBR_ACT_REC")
    private Character p302MbrActRec;
    @Basic(optional = false)
    @Column(name = "P359S1_STLSRVC_TAI")
    private String p359s1StlsrvcTai;
    @Basic(optional = false)
    @Column(name = "P359S2_STLSRVC_TAA")
    private String p359s2StlsrvcTaa;
    @Basic(optional = false)
    @Column(name = "P359S3_STLSRVC_LVL")
    private int p359s3StlsrvcLvl;
    @Basic(optional = false)
    @Column(name = "P359S4_STLSRVC_ID")
    private String p359s4StlsrvcId;
    @Basic(optional = false)
    @Column(name = "P359S5_STLFEX_RT_C")
    private Character p359s5StlfexRtC;
    @Basic(optional = false)
    @Column(name = "P359S6_RECON_DT")
    private int p359s6ReconDt;
    @Basic(optional = false)
    @Column(name = "P359S7_RECON_CD")
    private int p359s7ReconCd;
    @Basic(optional = false)
    @Column(name = "P359S8_STL_DT")
    private int p359s8StlDt;
    @Basic(optional = false)
    @Column(name = "P359S9_STL_CYCLE")
    private int p359s9StlCycle;
    @Basic(optional = false)
    @Column(name = "P367_AP_BRAND_ID")
    private String p367ApBrandId;
    @Basic(optional = false)
    @Column(name = "P368_FUNCGRP_CD")
    private String p368FuncgrpCd;
    @Basic(optional = false)
    @Column(name = "P369_ACQUIR_BIN")
    private int p369AcquirBin;
    @Basic(optional = false)
    @Column(name = "P370S1_BEG_ACT_RNG")
    private String p370s1BegActRng;
    @Basic(optional = false)
    @Column(name = "P370S2_END_ACT_RNG")
    private String p370s2EndActRng;
    @Basic(optional = false)
    @Column(name = "P390S1_DB_IND")
    private Character p390s1DbInd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "P390S2_TRAN_AMT")
    private BigDecimal p390s2TranAmt;
    @Basic(optional = false)
    @Column(name = "P391S1_CR_IND")
    private Character p391s1CrInd;
    @Basic(optional = false)
    @Column(name = "P391S2_TRAN_AMT")
    private BigDecimal p391s2TranAmt;
    @Basic(optional = false)
    @Column(name = "P394S1_NET_DB_IND")
    private Character p394s1NetDbInd;
    @Basic(optional = false)
    @Column(name = "P394S2_NET_TR_AMT")
    private BigDecimal p394s2NetTrAmt;
    @Basic(optional = false)
    @Column(name = "P395S1_NET_CR_IND")
    private Character p395s1NetCrInd;
    @Basic(optional = false)
    @Column(name = "P395S2_NET_TRN_AMT")
    private BigDecimal p395s2NetTrnAmt;
    @Basic(optional = false)
    @Column(name = "P396S1_NET_IND")
    private Character p396s1NetInd;
    @Basic(optional = false)
    @Column(name = "P396S2_NET_TRN_AMT")
    private BigDecimal p396s2NetTrnAmt;
    @Basic(optional = false)
    @Column(name = "D49_TRAN_CURR_CD")
    private short d49TranCurrCd;
    @Basic(optional = false)
    @Column(name = "D50_RECON_CUR_CD")
    private short d50ReconCurCd;
    @Basic(optional = false)
    @Column(name = "D62_ADDTL_DATA_2")
    private String d62AddtlData2;
    @Basic(optional = false)
    @Column(name = "D93_TR_DEST_INST")
    private long d93TrDestInst;
    @Basic(optional = false)
    @Column(name = "D100_RECV_INST_ID")
    private long d100RecvInstId;
    @Basic(optional = false)
    @Column(name = "D123_ADDTL_DAT_3")
    private String d123AddtlDat3;
    @Basic(optional = false)
    @Column(name = "D124_ADDTL_DAT_4")
    private String d124AddtlDat4;
    @Basic(optional = false)
    @Column(name = "D125_ADDTL_DAT_5")
    private String d125AddtlDat5;

    public McStlPosDtl() {
    }

    public McStlPosDtl(McStlPosDtlPK mcStlPosDtlPK) {
        this.mcStlPosDtlPK = mcStlPosDtlPK;
    }

    public McStlPosDtl(McStlPosDtlPK mcStlPosDtlPK, short msgTyId, String bitMapPri, String d1BitMapSec, short d24FuncCd, short d25MsgRsnCd, String d48AddtlDat, short p300s1FileTy, int p300s2FileRefDt, long p300s3ProcId, int p300s4FileSeqNo, Character p302MbrActRec, String p359s1StlsrvcTai, String p359s2StlsrvcTaa, int p359s3StlsrvcLvl, String p359s4StlsrvcId, Character p359s5StlfexRtC, int p359s6ReconDt, int p359s7ReconCd, int p359s8StlDt, int p359s9StlCycle, String p367ApBrandId, String p368FuncgrpCd, int p369AcquirBin, String p370s1BegActRng, String p370s2EndActRng, Character p390s1DbInd, BigDecimal p390s2TranAmt, Character p391s1CrInd, BigDecimal p391s2TranAmt, Character p394s1NetDbInd, BigDecimal p394s2NetTrAmt, Character p395s1NetCrInd, BigDecimal p395s2NetTrnAmt, Character p396s1NetInd, BigDecimal p396s2NetTrnAmt, short d49TranCurrCd, short d50ReconCurCd, String d62AddtlData2, long d93TrDestInst, long d100RecvInstId, String d123AddtlDat3, String d124AddtlDat4, String d125AddtlDat5) {
        this.mcStlPosDtlPK = mcStlPosDtlPK;
        this.msgTyId = msgTyId;
        this.bitMapPri = bitMapPri;
        this.d1BitMapSec = d1BitMapSec;
        this.d24FuncCd = d24FuncCd;
        this.d25MsgRsnCd = d25MsgRsnCd;
        this.d48AddtlDat = d48AddtlDat;
        this.p300s1FileTy = p300s1FileTy;
        this.p300s2FileRefDt = p300s2FileRefDt;
        this.p300s3ProcId = p300s3ProcId;
        this.p300s4FileSeqNo = p300s4FileSeqNo;
        this.p302MbrActRec = p302MbrActRec;
        this.p359s1StlsrvcTai = p359s1StlsrvcTai;
        this.p359s2StlsrvcTaa = p359s2StlsrvcTaa;
        this.p359s3StlsrvcLvl = p359s3StlsrvcLvl;
        this.p359s4StlsrvcId = p359s4StlsrvcId;
        this.p359s5StlfexRtC = p359s5StlfexRtC;
        this.p359s6ReconDt = p359s6ReconDt;
        this.p359s7ReconCd = p359s7ReconCd;
        this.p359s8StlDt = p359s8StlDt;
        this.p359s9StlCycle = p359s9StlCycle;
        this.p367ApBrandId = p367ApBrandId;
        this.p368FuncgrpCd = p368FuncgrpCd;
        this.p369AcquirBin = p369AcquirBin;
        this.p370s1BegActRng = p370s1BegActRng;
        this.p370s2EndActRng = p370s2EndActRng;
        this.p390s1DbInd = p390s1DbInd;
        this.p390s2TranAmt = p390s2TranAmt;
        this.p391s1CrInd = p391s1CrInd;
        this.p391s2TranAmt = p391s2TranAmt;
        this.p394s1NetDbInd = p394s1NetDbInd;
        this.p394s2NetTrAmt = p394s2NetTrAmt;
        this.p395s1NetCrInd = p395s1NetCrInd;
        this.p395s2NetTrnAmt = p395s2NetTrnAmt;
        this.p396s1NetInd = p396s1NetInd;
        this.p396s2NetTrnAmt = p396s2NetTrnAmt;
        this.d49TranCurrCd = d49TranCurrCd;
        this.d50ReconCurCd = d50ReconCurCd;
        this.d62AddtlData2 = d62AddtlData2;
        this.d93TrDestInst = d93TrDestInst;
        this.d100RecvInstId = d100RecvInstId;
        this.d123AddtlDat3 = d123AddtlDat3;
        this.d124AddtlDat4 = d124AddtlDat4;
        this.d125AddtlDat5 = d125AddtlDat5;
    }

    public McStlPosDtl(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcStlPosDtlPK = new McStlPosDtlPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McStlPosDtlPK getMcStlPosDtlPK() {
        return mcStlPosDtlPK;
    }

    public void setMcStlPosDtlPK(McStlPosDtlPK mcStlPosDtlPK) {
        this.mcStlPosDtlPK = mcStlPosDtlPK;
    }

    public short getMsgTyId() {
        return msgTyId;
    }

    public void setMsgTyId(short msgTyId) {
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

    public short getD24FuncCd() {
        return d24FuncCd;
    }

    public void setD24FuncCd(short d24FuncCd) {
        this.d24FuncCd = d24FuncCd;
    }

    public short getD25MsgRsnCd() {
        return d25MsgRsnCd;
    }

    public void setD25MsgRsnCd(short d25MsgRsnCd) {
        this.d25MsgRsnCd = d25MsgRsnCd;
    }

    public String getD48AddtlDat() {
        return d48AddtlDat;
    }

    public void setD48AddtlDat(String d48AddtlDat) {
        this.d48AddtlDat = d48AddtlDat;
    }

    public short getP300s1FileTy() {
        return p300s1FileTy;
    }

    public void setP300s1FileTy(short p300s1FileTy) {
        this.p300s1FileTy = p300s1FileTy;
    }

    public int getP300s2FileRefDt() {
        return p300s2FileRefDt;
    }

    public void setP300s2FileRefDt(int p300s2FileRefDt) {
        this.p300s2FileRefDt = p300s2FileRefDt;
    }

    public long getP300s3ProcId() {
        return p300s3ProcId;
    }

    public void setP300s3ProcId(long p300s3ProcId) {
        this.p300s3ProcId = p300s3ProcId;
    }

    public int getP300s4FileSeqNo() {
        return p300s4FileSeqNo;
    }

    public void setP300s4FileSeqNo(int p300s4FileSeqNo) {
        this.p300s4FileSeqNo = p300s4FileSeqNo;
    }

    public Character getP302MbrActRec() {
        return p302MbrActRec;
    }

    public void setP302MbrActRec(Character p302MbrActRec) {
        this.p302MbrActRec = p302MbrActRec;
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

    public int getP359s3StlsrvcLvl() {
        return p359s3StlsrvcLvl;
    }

    public void setP359s3StlsrvcLvl(int p359s3StlsrvcLvl) {
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

    public int getP359s6ReconDt() {
        return p359s6ReconDt;
    }

    public void setP359s6ReconDt(int p359s6ReconDt) {
        this.p359s6ReconDt = p359s6ReconDt;
    }

    public int getP359s7ReconCd() {
        return p359s7ReconCd;
    }

    public void setP359s7ReconCd(int p359s7ReconCd) {
        this.p359s7ReconCd = p359s7ReconCd;
    }

    public int getP359s8StlDt() {
        return p359s8StlDt;
    }

    public void setP359s8StlDt(int p359s8StlDt) {
        this.p359s8StlDt = p359s8StlDt;
    }

    public int getP359s9StlCycle() {
        return p359s9StlCycle;
    }

    public void setP359s9StlCycle(int p359s9StlCycle) {
        this.p359s9StlCycle = p359s9StlCycle;
    }

    public String getP367ApBrandId() {
        return p367ApBrandId;
    }

    public void setP367ApBrandId(String p367ApBrandId) {
        this.p367ApBrandId = p367ApBrandId;
    }

    public String getP368FuncgrpCd() {
        return p368FuncgrpCd;
    }

    public void setP368FuncgrpCd(String p368FuncgrpCd) {
        this.p368FuncgrpCd = p368FuncgrpCd;
    }

    public int getP369AcquirBin() {
        return p369AcquirBin;
    }

    public void setP369AcquirBin(int p369AcquirBin) {
        this.p369AcquirBin = p369AcquirBin;
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

    public short getD49TranCurrCd() {
        return d49TranCurrCd;
    }

    public void setD49TranCurrCd(short d49TranCurrCd) {
        this.d49TranCurrCd = d49TranCurrCd;
    }

    public short getD50ReconCurCd() {
        return d50ReconCurCd;
    }

    public void setD50ReconCurCd(short d50ReconCurCd) {
        this.d50ReconCurCd = d50ReconCurCd;
    }

    public String getD62AddtlData2() {
        return d62AddtlData2;
    }

    public void setD62AddtlData2(String d62AddtlData2) {
        this.d62AddtlData2 = d62AddtlData2;
    }

    public long getD93TrDestInst() {
        return d93TrDestInst;
    }

    public void setD93TrDestInst(long d93TrDestInst) {
        this.d93TrDestInst = d93TrDestInst;
    }

    public long getD100RecvInstId() {
        return d100RecvInstId;
    }

    public void setD100RecvInstId(long d100RecvInstId) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcStlPosDtlPK != null ? mcStlPosDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McStlPosDtl)) {
            return false;
        }
        McStlPosDtl other = (McStlPosDtl) object;
        if ((this.mcStlPosDtlPK == null && other.mcStlPosDtlPK != null) || (this.mcStlPosDtlPK != null && !this.mcStlPosDtlPK.equals(other.mcStlPosDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McStlPosDtl[ mcStlPosDtlPK=" + mcStlPosDtlPK + " ]";
    }
    
}
