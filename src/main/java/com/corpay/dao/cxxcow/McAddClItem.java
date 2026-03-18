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
@Table(name = "MC_ADD_CL_ITEM", catalog = "", schema = "CXXCOW")
public class McAddClItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddClItemPK mcAddClItemPK;
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
    @Column(name = "P508_CUST_CD")
    private String p508CustCd;
    @Column(name = "P641_PROD_CD")
    private String p641ProdCd;
    @Column(name = "A641_PROD_CD")
    private String a641ProdCd;
    @Column(name = "P642_ITM_DESC")
    private String p642ItmDesc;
    @Column(name = "A642_ITM_DESC")
    private String a642ItmDesc;

    @Column(name = "P643S1_ITM_QTY")
    private BigDecimal p643s1ItmQty;
    @Column(name = "A643S1_ITM_QTY")
    private BigDecimal a643s1ItmQty;
    @Column(name = "P643S2_ITM_QTY_EXP")
    private Character p643s2ItmQtyExp;
    @Column(name = "P645_ITM_UNITMSR")
    private String p645ItmUnitmsr;
    @Column(name = "P646_UNIT_PRC")
    private BigDecimal p646UnitPrc;
    @Column(name = "A646_UNIT_PRC")
    private BigDecimal a646UnitPrc;
    @Column(name = "P647_EXTD_ITM_AMT")
    private BigDecimal p647ExtdItmAmt;
    @Column(name = "A647_EXTD_ITM_AMT")
    private BigDecimal a647ExtdItmAmt;
    @Column(name = "P648S1_DISC_IND")
    private Character p648s1DiscInd;
    @Column(name = "P648S2_DISC_AMT")
    private BigDecimal p648s2DiscAmt;
    @Column(name = "A648S2_DISC_AMT")
    private BigDecimal a648s2DiscAmt;
    @Column(name = "P650_NET_GR_AMT")
    private Character p650NetGrAmt;
    @Column(name = "A650_NET_GR_AMT")
    private Character a650NetGrAmt;
    @Column(name = "P651_TAX_RT_APP")
    private BigDecimal p651TaxRtApp;
    @Column(name = "P652_TAX_TY_APP")
    private String p652TaxTyApp;
    @Column(name = "P653_TAX_AMT")
    private BigDecimal p653TaxAmt;
    @Column(name = "A653_TAX_AMT")
    private BigDecimal a653TaxAmt;
    @Column(name = "P654_DB_CR_IND")
    private Character p654DbCrInd;
    @Column(name = "A654_DB_CR_IND")
    private Character a654DbCrInd;
    @Column(name = "P656_ALT_TAX_ID")
    private String p656AltTaxId;
    @Column(name = "P657_ITM_DISC_RT")
    private BigDecimal p657ItmDiscRt;
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
    @Column(name = "P685_TY_OF_SUPP")
    private Character p685TyOfSupp;
    @Column(name = "P686_TAX_EXEMPT")
    private Character p686TaxExempt;
    @Column(name = "P687_UNVATINVOICE")
    private String p687Unvatinvoice;
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
    @Column(name = "FILTERED_FLAGS")
    private String filteredFlags;
    @Basic(optional = false)
    @Column(name = "P518_LN_ITM_DTL")
    private int p518LnItmDtl;
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
    @Column(name = "P612_SHIP_DT")
    private int p612ShipDt;
    @Basic(optional = false)
    @Column(name = "P614_ORD_DT")
    private int p614OrdDt;
    @Basic(optional = false)
    @Column(name = "P615_MEDSRV_SHIPTO")
    private String p615MedsrvShipto;
    @Basic(optional = false)
    @Column(name = "P616_CONTRACT_NBR")
    private String p616ContractNbr;
    @Basic(optional = false)
    @Column(name = "P617_MEDSRV_PRC_AD")
    private Character p617MedsrvPrcAd;
    @Basic(optional = false)
    @Column(name = "P618_MEDSRV_PRD_NB")
    private String p618MedsrvPrdNb;
    @Basic(optional = false)
    @Column(name = "P646S1_UNIT_PRC")
    private BigDecimal p646s1UnitPrc;
    @Basic(optional = false)
    @Column(name = "P646S2_UPRC_EXP")
    private short p646s2UprcExp;
    @Basic(optional = false)
    @Column(name = "P647S1_XTND_ITM_AM")
    private BigDecimal p647s1XtndItmAm;
    @Basic(optional = false)
    @Column(name = "P647S2_XTND_ITM_EX")
    private short p647s2XtndItmEx;
    @Basic(optional = false)
    @Column(name = "P647S3_XTND_ITM_SG")
    private Character p647s3XtndItmSg;
    @Basic(optional = false)
    @Column(name = "P648S3_ITM_DESC_AM")
    private BigDecimal p648s3ItmDescAm;
    @Basic(optional = false)
    @Column(name = "P648S4_ITM_DESC_EX")
    private short p648s4ItmDescEx;
    @Basic(optional = false)
    @Column(name = "P648S5_ITM_DESC_SG")
    private Character p648s5ItmDescSg;
    @Basic(optional = false)
    @Column(name = "P755S1_LITM_TOT_AM")
    private BigDecimal p755s1LitmTotAm;
    @Basic(optional = false)
    @Column(name = "P755S2_LITM_TOT_EX")
    private short p755s2LitmTotEx;
    @Basic(optional = false)
    @Column(name = "P755S3_LITM_TOT_SG")
    private Character p755s3LitmTotSg;
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
    @Column(name = "P650_ZERO_COST_IND")
    private Character p650ZeroCostInd;
    @Basic(optional = false)
    @Column(name = "A597S1_TTX_AMT")
    private BigDecimal a597s1TtxAmt;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;
    @Basic(optional = false)
    @Column(name = "P783_FLT_PRD_CD")
    private String p783FltPrdCd;
    @Basic(optional = false)
    @Column(name = "P784_FLT_ITEM_DESC")
    private String p784FltItemDesc;
    @Basic(optional = false)
    @Column(name = "P785S1_FLT_ITEM_QTY")
    private BigDecimal p785s1FltItemQty;
    @Basic(optional = false)
    @Column(name = "P785S2_FLT_ITEM_QTY_E")
    private short p785s2FltItemQtyE;
    @Basic(optional = false)
    @Column(name = "P786_FLT_ITEM_UNT_MSR")
    private String p786FltItemUntMsr;
    @Basic(optional = false)
    @Column(name = "P787S1_FLT_ITEM_AMT")
    private BigDecimal p787s1FltItemAmt;
    @Basic(optional = false)
    @Column(name = "P787S2_FLT_ITEM_AMT_E")
    private short p787s2FltItemAmtE;
    @Basic(optional = false)
    @Column(name = "P787S3_FLT_ITEM_AMT_SGN")
    private Character p787s3FltItemAmtSgn;
    @Basic(optional = false)
    @Column(name = "A641_PROD_CD_TYP")
    private Character a641ProdCdTyp;

    public McAddClItem() {
    }

    public McAddClItem(McAddClItemPK mcAddClItemPK) {
        this.mcAddClItemPK = mcAddClItemPK;
    }

    public McAddClItem(McAddClItemPK mcAddClItemPK, int p518LnItmDtl, BigDecimal p597s1TtxAmt, short p597s2TtxAmtExp, Character p597s3TtxAmtSig, Character p598TaxCltnInd, int p612ShipDt, int p614OrdDt, String p615MedsrvShipto, String p616ContractNbr, Character p617MedsrvPrcAd, String p618MedsrvPrdNb, BigDecimal p646s1UnitPrc, short p646s2UprcExp, BigDecimal p647s1XtndItmAm, short p647s2XtndItmEx, Character p647s3XtndItmSg, BigDecimal p648s3ItmDescAm, short p648s4ItmDescEx, Character p648s5ItmDescSg, BigDecimal p755s1LitmTotAm, short p755s2LitmTotEx, Character p755s3LitmTotSg, String taxAmtTs, Character taxAmt682Ind, Character taxAmt683Ind, Character taxAmt684Ind, Character taxAmt751Ind, Character taxAmt752Ind, Character taxAmt753Ind, Character p650ZeroCostInd, BigDecimal a597s1TtxAmt, Date rowChgTs, String p783FltPrdCd, String p784FltItemDesc, BigDecimal p785s1FltItemQty, short p785s2FltItemQtyE, String p786FltItemUntMsr, BigDecimal p787s1FltItemAmt, short p787s2FltItemAmtE, Character p787s3FltItemAmtSgn, Character a641ProdCdTyp) {
        this.mcAddClItemPK = mcAddClItemPK;
        this.p518LnItmDtl = p518LnItmDtl;
        this.p597s1TtxAmt = p597s1TtxAmt;
        this.p597s2TtxAmtExp = p597s2TtxAmtExp;
        this.p597s3TtxAmtSig = p597s3TtxAmtSig;
        this.p598TaxCltnInd = p598TaxCltnInd;
        this.p612ShipDt = p612ShipDt;
        this.p614OrdDt = p614OrdDt;
        this.p615MedsrvShipto = p615MedsrvShipto;
        this.p616ContractNbr = p616ContractNbr;
        this.p617MedsrvPrcAd = p617MedsrvPrcAd;
        this.p618MedsrvPrdNb = p618MedsrvPrdNb;
        this.p646s1UnitPrc = p646s1UnitPrc;
        this.p646s2UprcExp = p646s2UprcExp;
        this.p647s1XtndItmAm = p647s1XtndItmAm;
        this.p647s2XtndItmEx = p647s2XtndItmEx;
        this.p647s3XtndItmSg = p647s3XtndItmSg;
        this.p648s3ItmDescAm = p648s3ItmDescAm;
        this.p648s4ItmDescEx = p648s4ItmDescEx;
        this.p648s5ItmDescSg = p648s5ItmDescSg;
        this.p755s1LitmTotAm = p755s1LitmTotAm;
        this.p755s2LitmTotEx = p755s2LitmTotEx;
        this.p755s3LitmTotSg = p755s3LitmTotSg;
        this.taxAmtTs = taxAmtTs;
        this.taxAmt682Ind = taxAmt682Ind;
        this.taxAmt683Ind = taxAmt683Ind;
        this.taxAmt684Ind = taxAmt684Ind;
        this.taxAmt751Ind = taxAmt751Ind;
        this.taxAmt752Ind = taxAmt752Ind;
        this.taxAmt753Ind = taxAmt753Ind;
        this.p650ZeroCostInd = p650ZeroCostInd;
        this.a597s1TtxAmt = a597s1TtxAmt;
        this.rowChgTs = rowChgTs;
        this.p783FltPrdCd = p783FltPrdCd;
        this.p784FltItemDesc = p784FltItemDesc;
        this.p785s1FltItemQty = p785s1FltItemQty;
        this.p785s2FltItemQtyE = p785s2FltItemQtyE;
        this.p786FltItemUntMsr = p786FltItemUntMsr;
        this.p787s1FltItemAmt = p787s1FltItemAmt;
        this.p787s2FltItemAmtE = p787s2FltItemAmtE;
        this.p787s3FltItemAmtSgn = p787s3FltItemAmtSgn;
        this.a641ProdCdTyp = a641ProdCdTyp;
    }

    public McAddClItem(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.mcAddClItemPK = new McAddClItemPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s3OccInd, p501s4MsgNo, d71MsgNo);
    }

    public McAddClItemPK getMcAddClItemPK() {
        return mcAddClItemPK;
    }

    public void setMcAddClItemPK(McAddClItemPK mcAddClItemPK) {
        this.mcAddClItemPK = mcAddClItemPK;
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

    public String getP508CustCd() {
        return p508CustCd;
    }

    public void setP508CustCd(String p508CustCd) {
        this.p508CustCd = p508CustCd;
    }

    public String getP641ProdCd() {
        return p641ProdCd;
    }

    public void setP641ProdCd(String p641ProdCd) {
        this.p641ProdCd = p641ProdCd;
    }

    public String getA641ProdCd() {
        return a641ProdCd;
    }

    public void setA641ProdCd(String a641ProdCd) {
        this.a641ProdCd = a641ProdCd;
    }

    public String getP642ItmDesc() {
        return p642ItmDesc;
    }

    public void setP642ItmDesc(String p642ItmDesc) {
        this.p642ItmDesc = p642ItmDesc;
    }

    public String getA642ItmDesc() {
        return a642ItmDesc;
    }

    public void setA642ItmDesc(String a642ItmDesc) {
        this.a642ItmDesc = a642ItmDesc;
    }

    public BigDecimal getP643s1ItmQty() {
        return p643s1ItmQty;
    }

    public void setP643s1ItmQty(BigDecimal p643s1ItmQty) {
        this.p643s1ItmQty = p643s1ItmQty;
    }

    public BigDecimal getA643s1ItmQty() {
        return a643s1ItmQty;
    }

    public void setA643s1ItmQty(BigDecimal a643s1ItmQty) {
        this.a643s1ItmQty = a643s1ItmQty;
    }

    public Character getP643s2ItmQtyExp() {
        return p643s2ItmQtyExp;
    }

    public void setP643s2ItmQtyExp(Character p643s2ItmQtyExp) {
        this.p643s2ItmQtyExp = p643s2ItmQtyExp;
    }

    public String getP645ItmUnitmsr() {
        return p645ItmUnitmsr;
    }

    public void setP645ItmUnitmsr(String p645ItmUnitmsr) {
        this.p645ItmUnitmsr = p645ItmUnitmsr;
    }

    public BigDecimal getP646UnitPrc() {
        return p646UnitPrc;
    }

    public void setP646UnitPrc(BigDecimal p646UnitPrc) {
        this.p646UnitPrc = p646UnitPrc;
    }

    public BigDecimal getA646UnitPrc() {
        return a646UnitPrc;
    }

    public void setA646UnitPrc(BigDecimal a646UnitPrc) {
        this.a646UnitPrc = a646UnitPrc;
    }

    public BigDecimal getP647ExtdItmAmt() {
        return p647ExtdItmAmt;
    }

    public void setP647ExtdItmAmt(BigDecimal p647ExtdItmAmt) {
        this.p647ExtdItmAmt = p647ExtdItmAmt;
    }

    public BigDecimal getA647ExtdItmAmt() {
        return a647ExtdItmAmt;
    }

    public void setA647ExtdItmAmt(BigDecimal a647ExtdItmAmt) {
        this.a647ExtdItmAmt = a647ExtdItmAmt;
    }

    public Character getP648s1DiscInd() {
        return p648s1DiscInd;
    }

    public void setP648s1DiscInd(Character p648s1DiscInd) {
        this.p648s1DiscInd = p648s1DiscInd;
    }

    public BigDecimal getP648s2DiscAmt() {
        return p648s2DiscAmt;
    }

    public void setP648s2DiscAmt(BigDecimal p648s2DiscAmt) {
        this.p648s2DiscAmt = p648s2DiscAmt;
    }

    public BigDecimal getA648s2DiscAmt() {
        return a648s2DiscAmt;
    }

    public void setA648s2DiscAmt(BigDecimal a648s2DiscAmt) {
        this.a648s2DiscAmt = a648s2DiscAmt;
    }

    public Character getP650NetGrAmt() {
        return p650NetGrAmt;
    }

    public void setP650NetGrAmt(Character p650NetGrAmt) {
        this.p650NetGrAmt = p650NetGrAmt;
    }

    public Character getA650NetGrAmt() {
        return a650NetGrAmt;
    }

    public void setA650NetGrAmt(Character a650NetGrAmt) {
        this.a650NetGrAmt = a650NetGrAmt;
    }

    public BigDecimal getP651TaxRtApp() {
        return p651TaxRtApp;
    }

    public void setP651TaxRtApp(BigDecimal p651TaxRtApp) {
        this.p651TaxRtApp = p651TaxRtApp;
    }

    public String getP652TaxTyApp() {
        return p652TaxTyApp;
    }

    public void setP652TaxTyApp(String p652TaxTyApp) {
        this.p652TaxTyApp = p652TaxTyApp;
    }

    public BigDecimal getP653TaxAmt() {
        return p653TaxAmt;
    }

    public void setP653TaxAmt(BigDecimal p653TaxAmt) {
        this.p653TaxAmt = p653TaxAmt;
    }

    public BigDecimal getA653TaxAmt() {
        return a653TaxAmt;
    }

    public void setA653TaxAmt(BigDecimal a653TaxAmt) {
        this.a653TaxAmt = a653TaxAmt;
    }

    public Character getP654DbCrInd() {
        return p654DbCrInd;
    }

    public void setP654DbCrInd(Character p654DbCrInd) {
        this.p654DbCrInd = p654DbCrInd;
    }

    public Character getA654DbCrInd() {
        return a654DbCrInd;
    }

    public void setA654DbCrInd(Character a654DbCrInd) {
        this.a654DbCrInd = a654DbCrInd;
    }

    public String getP656AltTaxId() {
        return p656AltTaxId;
    }

    public void setP656AltTaxId(String p656AltTaxId) {
        this.p656AltTaxId = p656AltTaxId;
    }

    public BigDecimal getP657ItmDiscRt() {
        return p657ItmDiscRt;
    }

    public void setP657ItmDiscRt(BigDecimal p657ItmDiscRt) {
        this.p657ItmDiscRt = p657ItmDiscRt;
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

    public Character getP685TyOfSupp() {
        return p685TyOfSupp;
    }

    public void setP685TyOfSupp(Character p685TyOfSupp) {
        this.p685TyOfSupp = p685TyOfSupp;
    }

    public Character getP686TaxExempt() {
        return p686TaxExempt;
    }

    public void setP686TaxExempt(Character p686TaxExempt) {
        this.p686TaxExempt = p686TaxExempt;
    }

    public String getP687Unvatinvoice() {
        return p687Unvatinvoice;
    }

    public void setP687Unvatinvoice(String p687Unvatinvoice) {
        this.p687Unvatinvoice = p687Unvatinvoice;
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

    public String getFilteredFlags() {
        return filteredFlags;
    }

    public void setFilteredFlags(String filteredFlags) {
        this.filteredFlags = filteredFlags;
    }

    public int getP518LnItmDtl() {
        return p518LnItmDtl;
    }

    public void setP518LnItmDtl(int p518LnItmDtl) {
        this.p518LnItmDtl = p518LnItmDtl;
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

    public int getP612ShipDt() {
        return p612ShipDt;
    }

    public void setP612ShipDt(int p612ShipDt) {
        this.p612ShipDt = p612ShipDt;
    }

    public int getP614OrdDt() {
        return p614OrdDt;
    }

    public void setP614OrdDt(int p614OrdDt) {
        this.p614OrdDt = p614OrdDt;
    }

    public String getP615MedsrvShipto() {
        return p615MedsrvShipto;
    }

    public void setP615MedsrvShipto(String p615MedsrvShipto) {
        this.p615MedsrvShipto = p615MedsrvShipto;
    }

    public String getP616ContractNbr() {
        return p616ContractNbr;
    }

    public void setP616ContractNbr(String p616ContractNbr) {
        this.p616ContractNbr = p616ContractNbr;
    }

    public Character getP617MedsrvPrcAd() {
        return p617MedsrvPrcAd;
    }

    public void setP617MedsrvPrcAd(Character p617MedsrvPrcAd) {
        this.p617MedsrvPrcAd = p617MedsrvPrcAd;
    }

    public String getP618MedsrvPrdNb() {
        return p618MedsrvPrdNb;
    }

    public void setP618MedsrvPrdNb(String p618MedsrvPrdNb) {
        this.p618MedsrvPrdNb = p618MedsrvPrdNb;
    }

    public BigDecimal getP646s1UnitPrc() {
        return p646s1UnitPrc;
    }

    public void setP646s1UnitPrc(BigDecimal p646s1UnitPrc) {
        this.p646s1UnitPrc = p646s1UnitPrc;
    }

    public short getP646s2UprcExp() {
        return p646s2UprcExp;
    }

    public void setP646s2UprcExp(short p646s2UprcExp) {
        this.p646s2UprcExp = p646s2UprcExp;
    }

    public BigDecimal getP647s1XtndItmAm() {
        return p647s1XtndItmAm;
    }

    public void setP647s1XtndItmAm(BigDecimal p647s1XtndItmAm) {
        this.p647s1XtndItmAm = p647s1XtndItmAm;
    }

    public short getP647s2XtndItmEx() {
        return p647s2XtndItmEx;
    }

    public void setP647s2XtndItmEx(short p647s2XtndItmEx) {
        this.p647s2XtndItmEx = p647s2XtndItmEx;
    }

    public Character getP647s3XtndItmSg() {
        return p647s3XtndItmSg;
    }

    public void setP647s3XtndItmSg(Character p647s3XtndItmSg) {
        this.p647s3XtndItmSg = p647s3XtndItmSg;
    }

    public BigDecimal getP648s3ItmDescAm() {
        return p648s3ItmDescAm;
    }

    public void setP648s3ItmDescAm(BigDecimal p648s3ItmDescAm) {
        this.p648s3ItmDescAm = p648s3ItmDescAm;
    }

    public short getP648s4ItmDescEx() {
        return p648s4ItmDescEx;
    }

    public void setP648s4ItmDescEx(short p648s4ItmDescEx) {
        this.p648s4ItmDescEx = p648s4ItmDescEx;
    }

    public Character getP648s5ItmDescSg() {
        return p648s5ItmDescSg;
    }

    public void setP648s5ItmDescSg(Character p648s5ItmDescSg) {
        this.p648s5ItmDescSg = p648s5ItmDescSg;
    }

    public BigDecimal getP755s1LitmTotAm() {
        return p755s1LitmTotAm;
    }

    public void setP755s1LitmTotAm(BigDecimal p755s1LitmTotAm) {
        this.p755s1LitmTotAm = p755s1LitmTotAm;
    }

    public short getP755s2LitmTotEx() {
        return p755s2LitmTotEx;
    }

    public void setP755s2LitmTotEx(short p755s2LitmTotEx) {
        this.p755s2LitmTotEx = p755s2LitmTotEx;
    }

    public Character getP755s3LitmTotSg() {
        return p755s3LitmTotSg;
    }

    public void setP755s3LitmTotSg(Character p755s3LitmTotSg) {
        this.p755s3LitmTotSg = p755s3LitmTotSg;
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

    public Character getP650ZeroCostInd() {
        return p650ZeroCostInd;
    }

    public void setP650ZeroCostInd(Character p650ZeroCostInd) {
        this.p650ZeroCostInd = p650ZeroCostInd;
    }

    public BigDecimal getA597s1TtxAmt() {
        return a597s1TtxAmt;
    }

    public void setA597s1TtxAmt(BigDecimal a597s1TtxAmt) {
        this.a597s1TtxAmt = a597s1TtxAmt;
    }

    public Date getRowChgTs() {
        return rowChgTs;
    }

    public void setRowChgTs(Date rowChgTs) {
        this.rowChgTs = rowChgTs;
    }

    public String getP783FltPrdCd() {
        return p783FltPrdCd;
    }

    public void setP783FltPrdCd(String p783FltPrdCd) {
        this.p783FltPrdCd = p783FltPrdCd;
    }

    public String getP784FltItemDesc() {
        return p784FltItemDesc;
    }

    public void setP784FltItemDesc(String p784FltItemDesc) {
        this.p784FltItemDesc = p784FltItemDesc;
    }

    public BigDecimal getP785s1FltItemQty() {
        return p785s1FltItemQty;
    }

    public void setP785s1FltItemQty(BigDecimal p785s1FltItemQty) {
        this.p785s1FltItemQty = p785s1FltItemQty;
    }

    public short getP785s2FltItemQtyE() {
        return p785s2FltItemQtyE;
    }

    public void setP785s2FltItemQtyE(short p785s2FltItemQtyE) {
        this.p785s2FltItemQtyE = p785s2FltItemQtyE;
    }

    public String getP786FltItemUntMsr() {
        return p786FltItemUntMsr;
    }

    public void setP786FltItemUntMsr(String p786FltItemUntMsr) {
        this.p786FltItemUntMsr = p786FltItemUntMsr;
    }

    public BigDecimal getP787s1FltItemAmt() {
        return p787s1FltItemAmt;
    }

    public void setP787s1FltItemAmt(BigDecimal p787s1FltItemAmt) {
        this.p787s1FltItemAmt = p787s1FltItemAmt;
    }

    public short getP787s2FltItemAmtE() {
        return p787s2FltItemAmtE;
    }

    public void setP787s2FltItemAmtE(short p787s2FltItemAmtE) {
        this.p787s2FltItemAmtE = p787s2FltItemAmtE;
    }

    public Character getP787s3FltItemAmtSgn() {
        return p787s3FltItemAmtSgn;
    }

    public void setP787s3FltItemAmtSgn(Character p787s3FltItemAmtSgn) {
        this.p787s3FltItemAmtSgn = p787s3FltItemAmtSgn;
    }

    public Character getA641ProdCdTyp() {
        return a641ProdCdTyp;
    }

    public void setA641ProdCdTyp(Character a641ProdCdTyp) {
        this.a641ProdCdTyp = a641ProdCdTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddClItemPK != null ? mcAddClItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddClItem)) {
            return false;
        }
        McAddClItem other = (McAddClItem) object;
        if ((this.mcAddClItemPK == null && other.mcAddClItemPK != null) || (this.mcAddClItemPK != null && !this.mcAddClItemPK.equals(other.mcAddClItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddClItem[ mcAddClItemPK=" + mcAddClItemPK + " ]";
    }

}
