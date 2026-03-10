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
@Table(name = "MC_ADD_PASS_TRNSP", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McAddPassTrnsp.findAll", query = "SELECT m FROM McAddPassTrnsp m"),
    @NamedQuery(name = "McAddPassTrnsp.findByP105s1FileTy", query = "SELECT m FROM McAddPassTrnsp m WHERE m.mcAddPassTrnspPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McAddPassTrnsp.findByP105s2FileRDt", query = "SELECT m FROM McAddPassTrnsp m WHERE m.mcAddPassTrnspPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McAddPassTrnsp.findByP105s3ProcId", query = "SELECT m FROM McAddPassTrnsp m WHERE m.mcAddPassTrnspPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McAddPassTrnsp.findByP105s4FileSeqNo", query = "SELECT m FROM McAddPassTrnsp m WHERE m.mcAddPassTrnspPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McAddPassTrnsp.findByMsgTyId", query = "SELECT m FROM McAddPassTrnsp m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McAddPassTrnsp.findByBitMapPri", query = "SELECT m FROM McAddPassTrnsp m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McAddPassTrnsp.findByD1BitMapSec", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McAddPassTrnsp.findByD24FuncCd", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McAddPassTrnsp.findByD32AcqInstIdCd", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d32AcqInstIdCd = :d32AcqInstIdCd"),
    @NamedQuery(name = "McAddPassTrnsp.findByD33FwdngInstCd", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d33FwdngInstCd = :d33FwdngInstCd"),
    @NamedQuery(name = "McAddPassTrnsp.findByD48AddtlDat", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McAddPassTrnsp.findByP191OrMsgFmt", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p191OrMsgFmt = :p191OrMsgFmt"),
    @NamedQuery(name = "McAddPassTrnsp.findByP501s1UsageCd", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p501s1UsageCd = :p501s1UsageCd"),
    @NamedQuery(name = "McAddPassTrnsp.findByP501s2IndstyRec", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p501s2IndstyRec = :p501s2IndstyRec"),
    @NamedQuery(name = "McAddPassTrnsp.findByP501s3OccInd", query = "SELECT m FROM McAddPassTrnsp m WHERE m.mcAddPassTrnspPK.p501s3OccInd = :p501s3OccInd"),
    @NamedQuery(name = "McAddPassTrnsp.findByP501s4MsgNo", query = "SELECT m FROM McAddPassTrnsp m WHERE m.mcAddPassTrnspPK.p501s4MsgNo = :p501s4MsgNo"),
    @NamedQuery(name = "McAddPassTrnsp.findByP520TravelDt", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p520TravelDt = :p520TravelDt"),
    @NamedQuery(name = "McAddPassTrnsp.findByP521CarrierCd", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p521CarrierCd = :p521CarrierCd"),
    @NamedQuery(name = "McAddPassTrnsp.findByP522SrvcClCd", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p522SrvcClCd = :p522SrvcClCd"),
    @NamedQuery(name = "McAddPassTrnsp.findByP523CtyOrigAp", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p523CtyOrigAp = :p523CtyOrigAp"),
    @NamedQuery(name = "McAddPassTrnsp.findByP537Taxes", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p537Taxes = :p537Taxes"),
    @NamedQuery(name = "McAddPassTrnsp.findByD71MsgNo", query = "SELECT m FROM McAddPassTrnsp m WHERE m.mcAddPassTrnspPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McAddPassTrnsp.findByP524CtyDestAp", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p524CtyDestAp = :p524CtyDestAp"),
    @NamedQuery(name = "McAddPassTrnsp.findByP525StopOver", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p525StopOver = :p525StopOver"),
    @NamedQuery(name = "McAddPassTrnsp.findByP526ConjTicket", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p526ConjTicket = :p526ConjTicket"),
    @NamedQuery(name = "McAddPassTrnsp.findByP527ExchgTicket", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p527ExchgTicket = :p527ExchgTicket"),
    @NamedQuery(name = "McAddPassTrnsp.findByP528CouponNo", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p528CouponNo = :p528CouponNo"),
    @NamedQuery(name = "McAddPassTrnsp.findByP529FareBasis", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p529FareBasis = :p529FareBasis"),
    @NamedQuery(name = "McAddPassTrnsp.findByP530FlightNo", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p530FlightNo = :p530FlightNo"),
    @NamedQuery(name = "McAddPassTrnsp.findByP531s1DepTm", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p531s1DepTm = :p531s1DepTm"),
    @NamedQuery(name = "McAddPassTrnsp.findByP531s2DepTmSg", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p531s2DepTmSg = :p531s2DepTmSg"),
    @NamedQuery(name = "McAddPassTrnsp.findByP533s1ArrTm", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p533s1ArrTm = :p533s1ArrTm"),
    @NamedQuery(name = "McAddPassTrnsp.findByP533s2ArrTmSg", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p533s2ArrTmSg = :p533s2ArrTmSg"),
    @NamedQuery(name = "McAddPassTrnsp.findByP535Fare", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p535Fare = :p535Fare"),
    @NamedQuery(name = "McAddPassTrnsp.findByP536Fee", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p536Fee = :p536Fee"),
    @NamedQuery(name = "McAddPassTrnsp.findByP538EndRest", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p538EndRest = :p538EndRest"),
    @NamedQuery(name = "McAddPassTrnsp.findByD62AddtlData2", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d62AddtlData2 = :d62AddtlData2"),
    @NamedQuery(name = "McAddPassTrnsp.findByD63s1LfcycSpInd", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d63s1LfcycSpInd = :d63s1LfcycSpInd"),
    @NamedQuery(name = "McAddPassTrnsp.findByD63s2TraceId", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d63s2TraceId = :d63s2TraceId"),
    @NamedQuery(name = "McAddPassTrnsp.findByD63s3ValidnCd", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d63s3ValidnCd = :d63s3ValidnCd"),
    @NamedQuery(name = "McAddPassTrnsp.findByD63s4LfcyctrSeq", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d63s4LfcyctrSeq = :d63s4LfcyctrSeq"),
    @NamedQuery(name = "McAddPassTrnsp.findByD63s5LfcyctrTot", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d63s5LfcyctrTot = :d63s5LfcyctrTot"),
    @NamedQuery(name = "McAddPassTrnsp.findByD93TrDestInst", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McAddPassTrnsp.findByD94TrOrgInst", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d94TrOrgInst = :d94TrOrgInst"),
    @NamedQuery(name = "McAddPassTrnsp.findByD100RecvInstId", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McAddPassTrnsp.findByD123AddtlDat3", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d123AddtlDat3 = :d123AddtlDat3"),
    @NamedQuery(name = "McAddPassTrnsp.findByD124AddtlDat4", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d124AddtlDat4 = :d124AddtlDat4"),
    @NamedQuery(name = "McAddPassTrnsp.findByD125AddtlDat5", query = "SELECT m FROM McAddPassTrnsp m WHERE m.d125AddtlDat5 = :d125AddtlDat5"),
    @NamedQuery(name = "McAddPassTrnsp.findByP597s1TtxAmt", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p597s1TtxAmt = :p597s1TtxAmt"),
    @NamedQuery(name = "McAddPassTrnsp.findByP597s2TtxAmtExp", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p597s2TtxAmtExp = :p597s2TtxAmtExp"),
    @NamedQuery(name = "McAddPassTrnsp.findByP597s3TtxAmtSig", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p597s3TtxAmtSig = :p597s3TtxAmtSig"),
    @NamedQuery(name = "McAddPassTrnsp.findByP598TaxCltnInd", query = "SELECT m FROM McAddPassTrnsp m WHERE m.p598TaxCltnInd = :p598TaxCltnInd"),
    @NamedQuery(name = "McAddPassTrnsp.findByTaxAmtTs", query = "SELECT m FROM McAddPassTrnsp m WHERE m.taxAmtTs = :taxAmtTs"),
    @NamedQuery(name = "McAddPassTrnsp.findByTaxAmt682Ind", query = "SELECT m FROM McAddPassTrnsp m WHERE m.taxAmt682Ind = :taxAmt682Ind"),
    @NamedQuery(name = "McAddPassTrnsp.findByTaxAmt683Ind", query = "SELECT m FROM McAddPassTrnsp m WHERE m.taxAmt683Ind = :taxAmt683Ind"),
    @NamedQuery(name = "McAddPassTrnsp.findByTaxAmt684Ind", query = "SELECT m FROM McAddPassTrnsp m WHERE m.taxAmt684Ind = :taxAmt684Ind"),
    @NamedQuery(name = "McAddPassTrnsp.findByTaxAmt751Ind", query = "SELECT m FROM McAddPassTrnsp m WHERE m.taxAmt751Ind = :taxAmt751Ind"),
    @NamedQuery(name = "McAddPassTrnsp.findByTaxAmt752Ind", query = "SELECT m FROM McAddPassTrnsp m WHERE m.taxAmt752Ind = :taxAmt752Ind"),
    @NamedQuery(name = "McAddPassTrnsp.findByTaxAmt753Ind", query = "SELECT m FROM McAddPassTrnsp m WHERE m.taxAmt753Ind = :taxAmt753Ind"),
    @NamedQuery(name = "McAddPassTrnsp.findByA597s1TtxAmt", query = "SELECT m FROM McAddPassTrnsp m WHERE m.a597s1TtxAmt = :a597s1TtxAmt"),
    @NamedQuery(name = "McAddPassTrnsp.findByA535Fare", query = "SELECT m FROM McAddPassTrnsp m WHERE m.a535Fare = :a535Fare")})
public class McAddPassTrnsp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddPassTrnspPK mcAddPassTrnspPK;
    @Column(name = "MSG_TY_ID")
    private Short msgTyId;
    @Column(name = "BIT_MAP_PRI")
    private String bitMapPri;
    @Column(name = "D1_BIT_MAP_SEC")
    private String d1BitMapSec;
    @Column(name = "D24_FUNC_CD")
    private Short d24FuncCd;
    @Column(name = "D32_ACQ_INST_ID_CD")
    private Long d32AcqInstIdCd;
    @Column(name = "D33_FWDNG_INST_CD")
    private Long d33FwdngInstCd;
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
    @Column(name = "P191_OR_MSG_FMT")
    private Short p191OrMsgFmt;
    @Column(name = "P501S1_USAGE_CD")
    private Short p501s1UsageCd;
    @Column(name = "P501S2_INDSTY_REC")
    private Short p501s2IndstyRec;
    @Column(name = "P520_TRAVEL_DT")
    private Integer p520TravelDt;
    @Column(name = "P521_CARRIER_CD")
    private String p521CarrierCd;
    @Column(name = "P522_SRVC_CL_CD")
    private String p522SrvcClCd;
    @Column(name = "P523_CTY_ORIG_AP")
    private String p523CtyOrigAp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "P537_TAXES")
    private BigDecimal p537Taxes;
    @Column(name = "P524_CTY_DEST_AP")
    private String p524CtyDestAp;
    @Column(name = "P525_STOP_OVER")
    private Character p525StopOver;
    @Column(name = "P526_CONJ_TICKET")
    private String p526ConjTicket;
    @Column(name = "P527_EXCHG_TICKET")
    private String p527ExchgTicket;
    @Column(name = "P528_COUPON_NO")
    private Character p528CouponNo;
    @Column(name = "P529_FARE_BASIS")
    private String p529FareBasis;
    @Column(name = "P530_FLIGHT_NO")
    private String p530FlightNo;
    @Column(name = "P531S1_DEP_TM")
    private Short p531s1DepTm;
    @Column(name = "P531S2_DEP_TM_SG")
    private Character p531s2DepTmSg;
    @Column(name = "P533S1_ARR_TM")
    private Short p533s1ArrTm;
    @Column(name = "P533S2_ARR_TM_SG")
    private Character p533s2ArrTmSg;
    @Column(name = "P535_FARE")
    private BigDecimal p535Fare;
    @Column(name = "P536_FEE")
    private BigDecimal p536Fee;
    @Column(name = "P538_END_REST")
    private String p538EndRest;
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
    @Basic(optional = false)
    @Column(name = "P597S1_TTX_AMT")
    private BigDecimal p597s1TtxAmt;
    @Basic(optional = false)
    @Column(name = "P597S2_TTX_AMT_EXP")
    private short p597s2TtxAmtExp;
    @Basic(optional = false)
    @Column(name = "P597S3_TTX_AMT_SIG")
    private Character p597s3TtxAmtSig;
    @Basic(optional = false)
    @Column(name = "P598_TAX_CLTN_IND")
    private Character p598TaxCltnInd;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_TS")
    private String taxAmtTs;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_682_IND")
    private Character taxAmt682Ind;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_683_IND")
    private Character taxAmt683Ind;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_684_IND")
    private Character taxAmt684Ind;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_751_IND")
    private Character taxAmt751Ind;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_752_IND")
    private Character taxAmt752Ind;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_753_IND")
    private Character taxAmt753Ind;
    @Basic(optional = false)
    @Column(name = "A597S1_TTX_AMT")
    private BigDecimal a597s1TtxAmt;
    @Basic(optional = false)
    @Column(name = "A535_FARE")
    private BigDecimal a535Fare;

    public McAddPassTrnsp() {
    }

    public McAddPassTrnsp(McAddPassTrnspPK mcAddPassTrnspPK) {
        this.mcAddPassTrnspPK = mcAddPassTrnspPK;
    }

    public McAddPassTrnsp(McAddPassTrnspPK mcAddPassTrnspPK, BigDecimal p597s1TtxAmt, short p597s2TtxAmtExp, Character p597s3TtxAmtSig, Character p598TaxCltnInd, String taxAmtTs, Character taxAmt682Ind, Character taxAmt683Ind, Character taxAmt684Ind, Character taxAmt751Ind, Character taxAmt752Ind, Character taxAmt753Ind, BigDecimal a597s1TtxAmt, BigDecimal a535Fare) {
        this.mcAddPassTrnspPK = mcAddPassTrnspPK;
        this.p597s1TtxAmt = p597s1TtxAmt;
        this.p597s2TtxAmtExp = p597s2TtxAmtExp;
        this.p597s3TtxAmtSig = p597s3TtxAmtSig;
        this.p598TaxCltnInd = p598TaxCltnInd;
        this.taxAmtTs = taxAmtTs;
        this.taxAmt682Ind = taxAmt682Ind;
        this.taxAmt683Ind = taxAmt683Ind;
        this.taxAmt684Ind = taxAmt684Ind;
        this.taxAmt751Ind = taxAmt751Ind;
        this.taxAmt752Ind = taxAmt752Ind;
        this.taxAmt753Ind = taxAmt753Ind;
        this.a597s1TtxAmt = a597s1TtxAmt;
        this.a535Fare = a535Fare;
    }

    public McAddPassTrnsp(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.mcAddPassTrnspPK = new McAddPassTrnspPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s3OccInd, p501s4MsgNo, d71MsgNo);
    }

    public McAddPassTrnspPK getMcAddPassTrnspPK() {
        return mcAddPassTrnspPK;
    }

    public void setMcAddPassTrnspPK(McAddPassTrnspPK mcAddPassTrnspPK) {
        this.mcAddPassTrnspPK = mcAddPassTrnspPK;
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

    public String getD48AddtlDat() {
        return d48AddtlDat;
    }

    public void setD48AddtlDat(String d48AddtlDat) {
        this.d48AddtlDat = d48AddtlDat;
    }

    public Short getP191OrMsgFmt() {
        return p191OrMsgFmt;
    }

    public void setP191OrMsgFmt(Short p191OrMsgFmt) {
        this.p191OrMsgFmt = p191OrMsgFmt;
    }

    public Short getP501s1UsageCd() {
        return p501s1UsageCd;
    }

    public void setP501s1UsageCd(Short p501s1UsageCd) {
        this.p501s1UsageCd = p501s1UsageCd;
    }

    public Short getP501s2IndstyRec() {
        return p501s2IndstyRec;
    }

    public void setP501s2IndstyRec(Short p501s2IndstyRec) {
        this.p501s2IndstyRec = p501s2IndstyRec;
    }

    public Integer getP520TravelDt() {
        return p520TravelDt;
    }

    public void setP520TravelDt(Integer p520TravelDt) {
        this.p520TravelDt = p520TravelDt;
    }

    public String getP521CarrierCd() {
        return p521CarrierCd;
    }

    public void setP521CarrierCd(String p521CarrierCd) {
        this.p521CarrierCd = p521CarrierCd;
    }

    public String getP522SrvcClCd() {
        return p522SrvcClCd;
    }

    public void setP522SrvcClCd(String p522SrvcClCd) {
        this.p522SrvcClCd = p522SrvcClCd;
    }

    public String getP523CtyOrigAp() {
        return p523CtyOrigAp;
    }

    public void setP523CtyOrigAp(String p523CtyOrigAp) {
        this.p523CtyOrigAp = p523CtyOrigAp;
    }

    public BigDecimal getP537Taxes() {
        return p537Taxes;
    }

    public void setP537Taxes(BigDecimal p537Taxes) {
        this.p537Taxes = p537Taxes;
    }

    public String getP524CtyDestAp() {
        return p524CtyDestAp;
    }

    public void setP524CtyDestAp(String p524CtyDestAp) {
        this.p524CtyDestAp = p524CtyDestAp;
    }

    public Character getP525StopOver() {
        return p525StopOver;
    }

    public void setP525StopOver(Character p525StopOver) {
        this.p525StopOver = p525StopOver;
    }

    public String getP526ConjTicket() {
        return p526ConjTicket;
    }

    public void setP526ConjTicket(String p526ConjTicket) {
        this.p526ConjTicket = p526ConjTicket;
    }

    public String getP527ExchgTicket() {
        return p527ExchgTicket;
    }

    public void setP527ExchgTicket(String p527ExchgTicket) {
        this.p527ExchgTicket = p527ExchgTicket;
    }

    public Character getP528CouponNo() {
        return p528CouponNo;
    }

    public void setP528CouponNo(Character p528CouponNo) {
        this.p528CouponNo = p528CouponNo;
    }

    public String getP529FareBasis() {
        return p529FareBasis;
    }

    public void setP529FareBasis(String p529FareBasis) {
        this.p529FareBasis = p529FareBasis;
    }

    public String getP530FlightNo() {
        return p530FlightNo;
    }

    public void setP530FlightNo(String p530FlightNo) {
        this.p530FlightNo = p530FlightNo;
    }

    public Short getP531s1DepTm() {
        return p531s1DepTm;
    }

    public void setP531s1DepTm(Short p531s1DepTm) {
        this.p531s1DepTm = p531s1DepTm;
    }

    public Character getP531s2DepTmSg() {
        return p531s2DepTmSg;
    }

    public void setP531s2DepTmSg(Character p531s2DepTmSg) {
        this.p531s2DepTmSg = p531s2DepTmSg;
    }

    public Short getP533s1ArrTm() {
        return p533s1ArrTm;
    }

    public void setP533s1ArrTm(Short p533s1ArrTm) {
        this.p533s1ArrTm = p533s1ArrTm;
    }

    public Character getP533s2ArrTmSg() {
        return p533s2ArrTmSg;
    }

    public void setP533s2ArrTmSg(Character p533s2ArrTmSg) {
        this.p533s2ArrTmSg = p533s2ArrTmSg;
    }

    public BigDecimal getP535Fare() {
        return p535Fare;
    }

    public void setP535Fare(BigDecimal p535Fare) {
        this.p535Fare = p535Fare;
    }

    public BigDecimal getP536Fee() {
        return p536Fee;
    }

    public void setP536Fee(BigDecimal p536Fee) {
        this.p536Fee = p536Fee;
    }

    public String getP538EndRest() {
        return p538EndRest;
    }

    public void setP538EndRest(String p538EndRest) {
        this.p538EndRest = p538EndRest;
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

    public BigDecimal getP597s1TtxAmt() {
        return p597s1TtxAmt;
    }

    public void setP597s1TtxAmt(BigDecimal p597s1TtxAmt) {
        this.p597s1TtxAmt = p597s1TtxAmt;
    }

    public short getP597s2TtxAmtExp() {
        return p597s2TtxAmtExp;
    }

    public void setP597s2TtxAmtExp(short p597s2TtxAmtExp) {
        this.p597s2TtxAmtExp = p597s2TtxAmtExp;
    }

    public Character getP597s3TtxAmtSig() {
        return p597s3TtxAmtSig;
    }

    public void setP597s3TtxAmtSig(Character p597s3TtxAmtSig) {
        this.p597s3TtxAmtSig = p597s3TtxAmtSig;
    }

    public Character getP598TaxCltnInd() {
        return p598TaxCltnInd;
    }

    public void setP598TaxCltnInd(Character p598TaxCltnInd) {
        this.p598TaxCltnInd = p598TaxCltnInd;
    }

    public String getTaxAmtTs() {
        return taxAmtTs;
    }

    public void setTaxAmtTs(String taxAmtTs) {
        this.taxAmtTs = taxAmtTs;
    }

    public Character getTaxAmt682Ind() {
        return taxAmt682Ind;
    }

    public void setTaxAmt682Ind(Character taxAmt682Ind) {
        this.taxAmt682Ind = taxAmt682Ind;
    }

    public Character getTaxAmt683Ind() {
        return taxAmt683Ind;
    }

    public void setTaxAmt683Ind(Character taxAmt683Ind) {
        this.taxAmt683Ind = taxAmt683Ind;
    }

    public Character getTaxAmt684Ind() {
        return taxAmt684Ind;
    }

    public void setTaxAmt684Ind(Character taxAmt684Ind) {
        this.taxAmt684Ind = taxAmt684Ind;
    }

    public Character getTaxAmt751Ind() {
        return taxAmt751Ind;
    }

    public void setTaxAmt751Ind(Character taxAmt751Ind) {
        this.taxAmt751Ind = taxAmt751Ind;
    }

    public Character getTaxAmt752Ind() {
        return taxAmt752Ind;
    }

    public void setTaxAmt752Ind(Character taxAmt752Ind) {
        this.taxAmt752Ind = taxAmt752Ind;
    }

    public Character getTaxAmt753Ind() {
        return taxAmt753Ind;
    }

    public void setTaxAmt753Ind(Character taxAmt753Ind) {
        this.taxAmt753Ind = taxAmt753Ind;
    }

    public BigDecimal getA597s1TtxAmt() {
        return a597s1TtxAmt;
    }

    public void setA597s1TtxAmt(BigDecimal a597s1TtxAmt) {
        this.a597s1TtxAmt = a597s1TtxAmt;
    }

    public BigDecimal getA535Fare() {
        return a535Fare;
    }

    public void setA535Fare(BigDecimal a535Fare) {
        this.a535Fare = a535Fare;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddPassTrnspPK != null ? mcAddPassTrnspPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McAddPassTrnsp)) {
            return false;
        }
        McAddPassTrnsp other = (McAddPassTrnsp) object;
        if ((this.mcAddPassTrnspPK == null && other.mcAddPassTrnspPK != null) || (this.mcAddPassTrnspPK != null && !this.mcAddPassTrnspPK.equals(other.mcAddPassTrnspPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddPassTrnsp[ mcAddPassTrnspPK=" + mcAddPassTrnspPK + " ]";
    }
    
}
