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
@Table(name = "MC_ADD_GEN_TK", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McAddGenTk.findAll", query = "SELECT m FROM McAddGenTk m"),
    @NamedQuery(name = "McAddGenTk.findByP105s1FileTy", query = "SELECT m FROM McAddGenTk m WHERE m.mcAddGenTkPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McAddGenTk.findByP105s2FileRDt", query = "SELECT m FROM McAddGenTk m WHERE m.mcAddGenTkPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McAddGenTk.findByP105s3ProcId", query = "SELECT m FROM McAddGenTk m WHERE m.mcAddGenTkPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McAddGenTk.findByP105s4FileSeqNo", query = "SELECT m FROM McAddGenTk m WHERE m.mcAddGenTkPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McAddGenTk.findByMsgTyId", query = "SELECT m FROM McAddGenTk m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McAddGenTk.findByBitMapPri", query = "SELECT m FROM McAddGenTk m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McAddGenTk.findByD1BitMapSec", query = "SELECT m FROM McAddGenTk m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McAddGenTk.findByD24FuncCd", query = "SELECT m FROM McAddGenTk m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McAddGenTk.findByD32AcqInstIdCd", query = "SELECT m FROM McAddGenTk m WHERE m.d32AcqInstIdCd = :d32AcqInstIdCd"),
    @NamedQuery(name = "McAddGenTk.findByD33FwdngInstCd", query = "SELECT m FROM McAddGenTk m WHERE m.d33FwdngInstCd = :d33FwdngInstCd"),
    @NamedQuery(name = "McAddGenTk.findByD48AddtlDat", query = "SELECT m FROM McAddGenTk m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McAddGenTk.findByP191OrMsgFmt", query = "SELECT m FROM McAddGenTk m WHERE m.p191OrMsgFmt = :p191OrMsgFmt"),
    @NamedQuery(name = "McAddGenTk.findByP501s1UsageCd", query = "SELECT m FROM McAddGenTk m WHERE m.p501s1UsageCd = :p501s1UsageCd"),
    @NamedQuery(name = "McAddGenTk.findByP501s2IndstyRec", query = "SELECT m FROM McAddGenTk m WHERE m.p501s2IndstyRec = :p501s2IndstyRec"),
    @NamedQuery(name = "McAddGenTk.findByP501s3OccInd", query = "SELECT m FROM McAddGenTk m WHERE m.mcAddGenTkPK.p501s3OccInd = :p501s3OccInd"),
    @NamedQuery(name = "McAddGenTk.findByP501s4MsgNo", query = "SELECT m FROM McAddGenTk m WHERE m.mcAddGenTkPK.p501s4MsgNo = :p501s4MsgNo"),
    @NamedQuery(name = "McAddGenTk.findByP505PsgrNm", query = "SELECT m FROM McAddGenTk m WHERE m.p505PsgrNm = :p505PsgrNm"),
    @NamedQuery(name = "McAddGenTk.findByP506TicketNo", query = "SELECT m FROM McAddGenTk m WHERE m.p506TicketNo = :p506TicketNo"),
    @NamedQuery(name = "McAddGenTk.findByP507IssCarrier", query = "SELECT m FROM McAddGenTk m WHERE m.p507IssCarrier = :p507IssCarrier"),
    @NamedQuery(name = "McAddGenTk.findByP508CustCd", query = "SELECT m FROM McAddGenTk m WHERE m.p508CustCd = :p508CustCd"),
    @NamedQuery(name = "McAddGenTk.findByP509IssueDt", query = "SELECT m FROM McAddGenTk m WHERE m.p509IssueDt = :p509IssueDt"),
    @NamedQuery(name = "McAddGenTk.findByP510TravAgncy", query = "SELECT m FROM McAddGenTk m WHERE m.p510TravAgncy = :p510TravAgncy"),
    @NamedQuery(name = "McAddGenTk.findByP511TravAgNm", query = "SELECT m FROM McAddGenTk m WHERE m.p511TravAgNm = :p511TravAgNm"),
    @NamedQuery(name = "McAddGenTk.findByP512TotFare", query = "SELECT m FROM McAddGenTk m WHERE m.p512TotFare = :p512TotFare"),
    @NamedQuery(name = "McAddGenTk.findByP513TotFees", query = "SELECT m FROM McAddGenTk m WHERE m.p513TotFees = :p513TotFees"),
    @NamedQuery(name = "McAddGenTk.findByP514TotTaxes", query = "SELECT m FROM McAddGenTk m WHERE m.p514TotTaxes = :p514TotTaxes"),
    @NamedQuery(name = "McAddGenTk.findByP679Commodity", query = "SELECT m FROM McAddGenTk m WHERE m.p679Commodity = :p679Commodity"),
    @NamedQuery(name = "McAddGenTk.findByP682s1TxAmtInd", query = "SELECT m FROM McAddGenTk m WHERE m.p682s1TxAmtInd = :p682s1TxAmtInd"),
    @NamedQuery(name = "McAddGenTk.findByP682s2TxAmt", query = "SELECT m FROM McAddGenTk m WHERE m.p682s2TxAmt = :p682s2TxAmt"),
    @NamedQuery(name = "McAddGenTk.findByP682s3TxRt", query = "SELECT m FROM McAddGenTk m WHERE m.p682s3TxRt = :p682s3TxRt"),
    @NamedQuery(name = "McAddGenTk.findByP682s4TxRtExp", query = "SELECT m FROM McAddGenTk m WHERE m.p682s4TxRtExp = :p682s4TxRtExp"),
    @NamedQuery(name = "McAddGenTk.findByP682s5TxTyApp", query = "SELECT m FROM McAddGenTk m WHERE m.p682s5TxTyApp = :p682s5TxTyApp"),
    @NamedQuery(name = "McAddGenTk.findByP682s6TxTyId", query = "SELECT m FROM McAddGenTk m WHERE m.p682s6TxTyId = :p682s6TxTyId"),
    @NamedQuery(name = "McAddGenTk.findByP682s7CrdAcptx", query = "SELECT m FROM McAddGenTk m WHERE m.p682s7CrdAcptx = :p682s7CrdAcptx"),
    @NamedQuery(name = "McAddGenTk.findByP683s1TxAmtInd", query = "SELECT m FROM McAddGenTk m WHERE m.p683s1TxAmtInd = :p683s1TxAmtInd"),
    @NamedQuery(name = "McAddGenTk.findByP683s2TxAmt", query = "SELECT m FROM McAddGenTk m WHERE m.p683s2TxAmt = :p683s2TxAmt"),
    @NamedQuery(name = "McAddGenTk.findByP683s3TxRt", query = "SELECT m FROM McAddGenTk m WHERE m.p683s3TxRt = :p683s3TxRt"),
    @NamedQuery(name = "McAddGenTk.findByP683s4TxRtExp", query = "SELECT m FROM McAddGenTk m WHERE m.p683s4TxRtExp = :p683s4TxRtExp"),
    @NamedQuery(name = "McAddGenTk.findByP683s5TxTyApp", query = "SELECT m FROM McAddGenTk m WHERE m.p683s5TxTyApp = :p683s5TxTyApp"),
    @NamedQuery(name = "McAddGenTk.findByP683s6TaxTyId", query = "SELECT m FROM McAddGenTk m WHERE m.p683s6TaxTyId = :p683s6TaxTyId"),
    @NamedQuery(name = "McAddGenTk.findByP683s7CrdAcptx", query = "SELECT m FROM McAddGenTk m WHERE m.p683s7CrdAcptx = :p683s7CrdAcptx"),
    @NamedQuery(name = "McAddGenTk.findByP684s1TxAmtInd", query = "SELECT m FROM McAddGenTk m WHERE m.p684s1TxAmtInd = :p684s1TxAmtInd"),
    @NamedQuery(name = "McAddGenTk.findByP684s2TxAmt", query = "SELECT m FROM McAddGenTk m WHERE m.p684s2TxAmt = :p684s2TxAmt"),
    @NamedQuery(name = "McAddGenTk.findByP684s3TxRt", query = "SELECT m FROM McAddGenTk m WHERE m.p684s3TxRt = :p684s3TxRt"),
    @NamedQuery(name = "McAddGenTk.findByP684s4TxRtExp", query = "SELECT m FROM McAddGenTk m WHERE m.p684s4TxRtExp = :p684s4TxRtExp"),
    @NamedQuery(name = "McAddGenTk.findByP684s5TxTyApp", query = "SELECT m FROM McAddGenTk m WHERE m.p684s5TxTyApp = :p684s5TxTyApp"),
    @NamedQuery(name = "McAddGenTk.findByP684s6TaxTyId", query = "SELECT m FROM McAddGenTk m WHERE m.p684s6TaxTyId = :p684s6TaxTyId"),
    @NamedQuery(name = "McAddGenTk.findByP684s7CrdAcptx", query = "SELECT m FROM McAddGenTk m WHERE m.p684s7CrdAcptx = :p684s7CrdAcptx"),
    @NamedQuery(name = "McAddGenTk.findByP686TaxExempt", query = "SELECT m FROM McAddGenTk m WHERE m.p686TaxExempt = :p686TaxExempt"),
    @NamedQuery(name = "McAddGenTk.findByP714ExchgtkAmt", query = "SELECT m FROM McAddGenTk m WHERE m.p714ExchgtkAmt = :p714ExchgtkAmt"),
    @NamedQuery(name = "McAddGenTk.findByP715ExchgfeAmt", query = "SELECT m FROM McAddGenTk m WHERE m.p715ExchgfeAmt = :p715ExchgfeAmt"),
    @NamedQuery(name = "McAddGenTk.findByP716TravelAuth", query = "SELECT m FROM McAddGenTk m WHERE m.p716TravelAuth = :p716TravelAuth"),
    @NamedQuery(name = "McAddGenTk.findByP717IataClient", query = "SELECT m FROM McAddGenTk m WHERE m.p717IataClient = :p717IataClient"),
    @NamedQuery(name = "McAddGenTk.findByP713RestTkInd", query = "SELECT m FROM McAddGenTk m WHERE m.p713RestTkInd = :p713RestTkInd"),
    @NamedQuery(name = "McAddGenTk.findByD62AddtlData2", query = "SELECT m FROM McAddGenTk m WHERE m.d62AddtlData2 = :d62AddtlData2"),
    @NamedQuery(name = "McAddGenTk.findByD63s1LfcycSpInd", query = "SELECT m FROM McAddGenTk m WHERE m.d63s1LfcycSpInd = :d63s1LfcycSpInd"),
    @NamedQuery(name = "McAddGenTk.findByD63s2TraceId", query = "SELECT m FROM McAddGenTk m WHERE m.d63s2TraceId = :d63s2TraceId"),
    @NamedQuery(name = "McAddGenTk.findByD63s3ValidnCd", query = "SELECT m FROM McAddGenTk m WHERE m.d63s3ValidnCd = :d63s3ValidnCd"),
    @NamedQuery(name = "McAddGenTk.findByD63s4LfcyctrSeq", query = "SELECT m FROM McAddGenTk m WHERE m.d63s4LfcyctrSeq = :d63s4LfcyctrSeq"),
    @NamedQuery(name = "McAddGenTk.findByD63s5LfcyctrTot", query = "SELECT m FROM McAddGenTk m WHERE m.d63s5LfcyctrTot = :d63s5LfcyctrTot"),
    @NamedQuery(name = "McAddGenTk.findByD71MsgNo", query = "SELECT m FROM McAddGenTk m WHERE m.mcAddGenTkPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McAddGenTk.findByD93TrDestInst", query = "SELECT m FROM McAddGenTk m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McAddGenTk.findByD94TrOrgInst", query = "SELECT m FROM McAddGenTk m WHERE m.d94TrOrgInst = :d94TrOrgInst"),
    @NamedQuery(name = "McAddGenTk.findByD100RecvInstId", query = "SELECT m FROM McAddGenTk m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McAddGenTk.findByD123AddtlDat3", query = "SELECT m FROM McAddGenTk m WHERE m.d123AddtlDat3 = :d123AddtlDat3"),
    @NamedQuery(name = "McAddGenTk.findByD124AddtlDat4", query = "SELECT m FROM McAddGenTk m WHERE m.d124AddtlDat4 = :d124AddtlDat4"),
    @NamedQuery(name = "McAddGenTk.findByD125AddtlDat5", query = "SELECT m FROM McAddGenTk m WHERE m.d125AddtlDat5 = :d125AddtlDat5"),
    @NamedQuery(name = "McAddGenTk.findByP597s1TtxAmt", query = "SELECT m FROM McAddGenTk m WHERE m.p597s1TtxAmt = :p597s1TtxAmt"),
    @NamedQuery(name = "McAddGenTk.findByP597s2TtxAmtExp", query = "SELECT m FROM McAddGenTk m WHERE m.p597s2TtxAmtExp = :p597s2TtxAmtExp"),
    @NamedQuery(name = "McAddGenTk.findByP597s3TtxAmtSig", query = "SELECT m FROM McAddGenTk m WHERE m.p597s3TtxAmtSig = :p597s3TtxAmtSig"),
    @NamedQuery(name = "McAddGenTk.findByP598TaxCltnInd", query = "SELECT m FROM McAddGenTk m WHERE m.p598TaxCltnInd = :p598TaxCltnInd"),
    @NamedQuery(name = "McAddGenTk.findByTaxAmtTs", query = "SELECT m FROM McAddGenTk m WHERE m.taxAmtTs = :taxAmtTs"),
    @NamedQuery(name = "McAddGenTk.findByTaxAmt682Ind", query = "SELECT m FROM McAddGenTk m WHERE m.taxAmt682Ind = :taxAmt682Ind"),
    @NamedQuery(name = "McAddGenTk.findByTaxAmt683Ind", query = "SELECT m FROM McAddGenTk m WHERE m.taxAmt683Ind = :taxAmt683Ind"),
    @NamedQuery(name = "McAddGenTk.findByTaxAmt684Ind", query = "SELECT m FROM McAddGenTk m WHERE m.taxAmt684Ind = :taxAmt684Ind"),
    @NamedQuery(name = "McAddGenTk.findByTaxAmt751Ind", query = "SELECT m FROM McAddGenTk m WHERE m.taxAmt751Ind = :taxAmt751Ind"),
    @NamedQuery(name = "McAddGenTk.findByTaxAmt752Ind", query = "SELECT m FROM McAddGenTk m WHERE m.taxAmt752Ind = :taxAmt752Ind"),
    @NamedQuery(name = "McAddGenTk.findByTaxAmt753Ind", query = "SELECT m FROM McAddGenTk m WHERE m.taxAmt753Ind = :taxAmt753Ind"),
    @NamedQuery(name = "McAddGenTk.findByA597s1TtxAmt", query = "SELECT m FROM McAddGenTk m WHERE m.a597s1TtxAmt = :a597s1TtxAmt"),
    @NamedQuery(name = "McAddGenTk.findByA512TotFare", query = "SELECT m FROM McAddGenTk m WHERE m.a512TotFare = :a512TotFare"),
    @NamedQuery(name = "McAddGenTk.findByRowChgTs", query = "SELECT m FROM McAddGenTk m WHERE m.rowChgTs = :rowChgTs")})
public class McAddGenTk implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddGenTkPK mcAddGenTkPK;
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
    @Column(name = "P505_PSGR_NM")
    private String p505PsgrNm;
    @Column(name = "P506_TICKET_NO")
    private String p506TicketNo;
    @Column(name = "P507_ISS_CARRIER")
    private String p507IssCarrier;
    @Column(name = "P508_CUST_CD")
    private String p508CustCd;
    @Column(name = "P509_ISSUE_DT")
    private Integer p509IssueDt;
    @Column(name = "P510_TRAV_AGNCY")
    private String p510TravAgncy;
    @Column(name = "P511_TRAV_AG_NM")
    private String p511TravAgNm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "P512_TOT_FARE")
    private BigDecimal p512TotFare;
    @Column(name = "P513_TOT_FEES")
    private BigDecimal p513TotFees;
    @Column(name = "P514_TOT_TAXES")
    private BigDecimal p514TotTaxes;
    @Column(name = "P679_COMMODITY")
    private String p679Commodity;
    @Column(name = "P682S1_TX_AMT_IND")
    private Character p682s1TxAmtInd;
    @Column(name = "P682S2_TX_AMT")
    private BigDecimal p682s2TxAmt;
    @Column(name = "P682S3_TX_RT")
    private BigDecimal p682s3TxRt;
    @Column(name = "P682S4_TX_RT_EXP")
    private Short p682s4TxRtExp;
    @Column(name = "P682S5_TX_TY_APP")
    private String p682s5TxTyApp;
    @Column(name = "P682S6_TX_TY_ID")
    private String p682s6TxTyId;
    @Column(name = "P682S7_CRD_ACPTX")
    private String p682s7CrdAcptx;
    @Column(name = "P683S1_TX_AMT_IND")
    private Character p683s1TxAmtInd;
    @Column(name = "P683S2_TX_AMT")
    private BigDecimal p683s2TxAmt;
    @Column(name = "P683S3_TX_RT")
    private BigDecimal p683s3TxRt;
    @Column(name = "P683S4_TX_RT_EXP")
    private Short p683s4TxRtExp;
    @Column(name = "P683S5_TX_TY_APP")
    private String p683s5TxTyApp;
    @Column(name = "P683S6_TAX_TY_ID")
    private String p683s6TaxTyId;
    @Column(name = "P683S7_CRD_ACPTX")
    private String p683s7CrdAcptx;
    @Column(name = "P684S1_TX_AMT_IND")
    private Character p684s1TxAmtInd;
    @Column(name = "P684S2_TX_AMT")
    private BigDecimal p684s2TxAmt;
    @Column(name = "P684S3_TX_RT")
    private BigDecimal p684s3TxRt;
    @Column(name = "P684S4_TX_RT_EXP")
    private Short p684s4TxRtExp;
    @Column(name = "P684S5_TX_TY_APP")
    private String p684s5TxTyApp;
    @Column(name = "P684S6_TAX_TY_ID")
    private String p684s6TaxTyId;
    @Column(name = "P684S7_CRD_ACPTX")
    private String p684s7CrdAcptx;
    @Column(name = "P686_TAX_EXEMPT")
    private Character p686TaxExempt;
    @Column(name = "P714_EXCHGTK_AMT")
    private BigDecimal p714ExchgtkAmt;
    @Column(name = "P715_EXCHGFE_AMT")
    private BigDecimal p715ExchgfeAmt;
    @Column(name = "P716_TRAVEL_AUTH")
    private String p716TravelAuth;
    @Column(name = "P717_IATA_CLIENT")
    private String p717IataClient;
    @Column(name = "P713_REST_TK_IND")
    private Character p713RestTkInd;
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
    @Column(name = "A512_TOT_FARE")
    private BigDecimal a512TotFare;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;

    public McAddGenTk() {
    }

    public McAddGenTk(McAddGenTkPK mcAddGenTkPK) {
        this.mcAddGenTkPK = mcAddGenTkPK;
    }

    public McAddGenTk(McAddGenTkPK mcAddGenTkPK, BigDecimal p597s1TtxAmt, short p597s2TtxAmtExp, Character p597s3TtxAmtSig, Character p598TaxCltnInd, String taxAmtTs, Character taxAmt682Ind, Character taxAmt683Ind, Character taxAmt684Ind, Character taxAmt751Ind, Character taxAmt752Ind, Character taxAmt753Ind, BigDecimal a597s1TtxAmt, BigDecimal a512TotFare, Date rowChgTs) {
        this.mcAddGenTkPK = mcAddGenTkPK;
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
        this.a512TotFare = a512TotFare;
        this.rowChgTs = rowChgTs;
    }

    public McAddGenTk(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.mcAddGenTkPK = new McAddGenTkPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s3OccInd, p501s4MsgNo, d71MsgNo);
    }

    public McAddGenTkPK getMcAddGenTkPK() {
        return mcAddGenTkPK;
    }

    public void setMcAddGenTkPK(McAddGenTkPK mcAddGenTkPK) {
        this.mcAddGenTkPK = mcAddGenTkPK;
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

    public String getP505PsgrNm() {
        return p505PsgrNm;
    }

    public void setP505PsgrNm(String p505PsgrNm) {
        this.p505PsgrNm = p505PsgrNm;
    }

    public String getP506TicketNo() {
        return p506TicketNo;
    }

    public void setP506TicketNo(String p506TicketNo) {
        this.p506TicketNo = p506TicketNo;
    }

    public String getP507IssCarrier() {
        return p507IssCarrier;
    }

    public void setP507IssCarrier(String p507IssCarrier) {
        this.p507IssCarrier = p507IssCarrier;
    }

    public String getP508CustCd() {
        return p508CustCd;
    }

    public void setP508CustCd(String p508CustCd) {
        this.p508CustCd = p508CustCd;
    }

    public Integer getP509IssueDt() {
        return p509IssueDt;
    }

    public void setP509IssueDt(Integer p509IssueDt) {
        this.p509IssueDt = p509IssueDt;
    }

    public String getP510TravAgncy() {
        return p510TravAgncy;
    }

    public void setP510TravAgncy(String p510TravAgncy) {
        this.p510TravAgncy = p510TravAgncy;
    }

    public String getP511TravAgNm() {
        return p511TravAgNm;
    }

    public void setP511TravAgNm(String p511TravAgNm) {
        this.p511TravAgNm = p511TravAgNm;
    }

    public BigDecimal getP512TotFare() {
        return p512TotFare;
    }

    public void setP512TotFare(BigDecimal p512TotFare) {
        this.p512TotFare = p512TotFare;
    }

    public BigDecimal getP513TotFees() {
        return p513TotFees;
    }

    public void setP513TotFees(BigDecimal p513TotFees) {
        this.p513TotFees = p513TotFees;
    }

    public BigDecimal getP514TotTaxes() {
        return p514TotTaxes;
    }

    public void setP514TotTaxes(BigDecimal p514TotTaxes) {
        this.p514TotTaxes = p514TotTaxes;
    }

    public String getP679Commodity() {
        return p679Commodity;
    }

    public void setP679Commodity(String p679Commodity) {
        this.p679Commodity = p679Commodity;
    }

    public Character getP682s1TxAmtInd() {
        return p682s1TxAmtInd;
    }

    public void setP682s1TxAmtInd(Character p682s1TxAmtInd) {
        this.p682s1TxAmtInd = p682s1TxAmtInd;
    }

    public BigDecimal getP682s2TxAmt() {
        return p682s2TxAmt;
    }

    public void setP682s2TxAmt(BigDecimal p682s2TxAmt) {
        this.p682s2TxAmt = p682s2TxAmt;
    }

    public BigDecimal getP682s3TxRt() {
        return p682s3TxRt;
    }

    public void setP682s3TxRt(BigDecimal p682s3TxRt) {
        this.p682s3TxRt = p682s3TxRt;
    }

    public Short getP682s4TxRtExp() {
        return p682s4TxRtExp;
    }

    public void setP682s4TxRtExp(Short p682s4TxRtExp) {
        this.p682s4TxRtExp = p682s4TxRtExp;
    }

    public String getP682s5TxTyApp() {
        return p682s5TxTyApp;
    }

    public void setP682s5TxTyApp(String p682s5TxTyApp) {
        this.p682s5TxTyApp = p682s5TxTyApp;
    }

    public String getP682s6TxTyId() {
        return p682s6TxTyId;
    }

    public void setP682s6TxTyId(String p682s6TxTyId) {
        this.p682s6TxTyId = p682s6TxTyId;
    }

    public String getP682s7CrdAcptx() {
        return p682s7CrdAcptx;
    }

    public void setP682s7CrdAcptx(String p682s7CrdAcptx) {
        this.p682s7CrdAcptx = p682s7CrdAcptx;
    }

    public Character getP683s1TxAmtInd() {
        return p683s1TxAmtInd;
    }

    public void setP683s1TxAmtInd(Character p683s1TxAmtInd) {
        this.p683s1TxAmtInd = p683s1TxAmtInd;
    }

    public BigDecimal getP683s2TxAmt() {
        return p683s2TxAmt;
    }

    public void setP683s2TxAmt(BigDecimal p683s2TxAmt) {
        this.p683s2TxAmt = p683s2TxAmt;
    }

    public BigDecimal getP683s3TxRt() {
        return p683s3TxRt;
    }

    public void setP683s3TxRt(BigDecimal p683s3TxRt) {
        this.p683s3TxRt = p683s3TxRt;
    }

    public Short getP683s4TxRtExp() {
        return p683s4TxRtExp;
    }

    public void setP683s4TxRtExp(Short p683s4TxRtExp) {
        this.p683s4TxRtExp = p683s4TxRtExp;
    }

    public String getP683s5TxTyApp() {
        return p683s5TxTyApp;
    }

    public void setP683s5TxTyApp(String p683s5TxTyApp) {
        this.p683s5TxTyApp = p683s5TxTyApp;
    }

    public String getP683s6TaxTyId() {
        return p683s6TaxTyId;
    }

    public void setP683s6TaxTyId(String p683s6TaxTyId) {
        this.p683s6TaxTyId = p683s6TaxTyId;
    }

    public String getP683s7CrdAcptx() {
        return p683s7CrdAcptx;
    }

    public void setP683s7CrdAcptx(String p683s7CrdAcptx) {
        this.p683s7CrdAcptx = p683s7CrdAcptx;
    }

    public Character getP684s1TxAmtInd() {
        return p684s1TxAmtInd;
    }

    public void setP684s1TxAmtInd(Character p684s1TxAmtInd) {
        this.p684s1TxAmtInd = p684s1TxAmtInd;
    }

    public BigDecimal getP684s2TxAmt() {
        return p684s2TxAmt;
    }

    public void setP684s2TxAmt(BigDecimal p684s2TxAmt) {
        this.p684s2TxAmt = p684s2TxAmt;
    }

    public BigDecimal getP684s3TxRt() {
        return p684s3TxRt;
    }

    public void setP684s3TxRt(BigDecimal p684s3TxRt) {
        this.p684s3TxRt = p684s3TxRt;
    }

    public Short getP684s4TxRtExp() {
        return p684s4TxRtExp;
    }

    public void setP684s4TxRtExp(Short p684s4TxRtExp) {
        this.p684s4TxRtExp = p684s4TxRtExp;
    }

    public String getP684s5TxTyApp() {
        return p684s5TxTyApp;
    }

    public void setP684s5TxTyApp(String p684s5TxTyApp) {
        this.p684s5TxTyApp = p684s5TxTyApp;
    }

    public String getP684s6TaxTyId() {
        return p684s6TaxTyId;
    }

    public void setP684s6TaxTyId(String p684s6TaxTyId) {
        this.p684s6TaxTyId = p684s6TaxTyId;
    }

    public String getP684s7CrdAcptx() {
        return p684s7CrdAcptx;
    }

    public void setP684s7CrdAcptx(String p684s7CrdAcptx) {
        this.p684s7CrdAcptx = p684s7CrdAcptx;
    }

    public Character getP686TaxExempt() {
        return p686TaxExempt;
    }

    public void setP686TaxExempt(Character p686TaxExempt) {
        this.p686TaxExempt = p686TaxExempt;
    }

    public BigDecimal getP714ExchgtkAmt() {
        return p714ExchgtkAmt;
    }

    public void setP714ExchgtkAmt(BigDecimal p714ExchgtkAmt) {
        this.p714ExchgtkAmt = p714ExchgtkAmt;
    }

    public BigDecimal getP715ExchgfeAmt() {
        return p715ExchgfeAmt;
    }

    public void setP715ExchgfeAmt(BigDecimal p715ExchgfeAmt) {
        this.p715ExchgfeAmt = p715ExchgfeAmt;
    }

    public String getP716TravelAuth() {
        return p716TravelAuth;
    }

    public void setP716TravelAuth(String p716TravelAuth) {
        this.p716TravelAuth = p716TravelAuth;
    }

    public String getP717IataClient() {
        return p717IataClient;
    }

    public void setP717IataClient(String p717IataClient) {
        this.p717IataClient = p717IataClient;
    }

    public Character getP713RestTkInd() {
        return p713RestTkInd;
    }

    public void setP713RestTkInd(Character p713RestTkInd) {
        this.p713RestTkInd = p713RestTkInd;
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

    public BigDecimal getA512TotFare() {
        return a512TotFare;
    }

    public void setA512TotFare(BigDecimal a512TotFare) {
        this.a512TotFare = a512TotFare;
    }

    public Date getRowChgTs() {
        return rowChgTs;
    }

    public void setRowChgTs(Date rowChgTs) {
        this.rowChgTs = rowChgTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddGenTkPK != null ? mcAddGenTkPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McAddGenTk)) {
            return false;
        }
        McAddGenTk other = (McAddGenTk) object;
        if ((this.mcAddGenTkPK == null && other.mcAddGenTkPK != null) || (this.mcAddGenTkPK != null && !this.mcAddGenTkPK.equals(other.mcAddGenTkPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddGenTk[ mcAddGenTkPK=" + mcAddGenTkPK + " ]";
    }
    
}
