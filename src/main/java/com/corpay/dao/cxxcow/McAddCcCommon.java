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
@Table(name = "MC_ADD_CC_COMMON", catalog = "", schema = "CXXCOW")
public class McAddCcCommon implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddCcCommonPK mcAddCcCommonPK;
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
    @Column(name = "P595_CRD_ACP_TY")
    private String p595CrdAcpTy;
    @Column(name = "P596_CRD_ACP_TX")
    private String p596CrdAcpTx;

    @Column(name = "P597_TAX_AMT")
    private BigDecimal p597TaxAmt;
    @Column(name = "P598_TAX_COLL_IND")
    private Character p598TaxCollInd;
    @Column(name = "P599_CORP_VAT_NO")
    private String p599CorpVatNo;
    @Column(name = "P600_CRD_ACP_REF")
    private String p600CrdAcpRef;
    @Column(name = "P606_FREIGHT_AMT")
    private BigDecimal p606FreightAmt;
    @Column(name = "P607_DUTY_AMT")
    private BigDecimal p607DutyAmt;
    @Column(name = "P608_DEST_POSTAL")
    private String p608DestPostal;
    @Column(name = "P609_DEST_ST")
    private String p609DestSt;
    @Column(name = "P610_DEST_CNTRY")
    private String p610DestCntry;
    @Column(name = "P611S1_ALTTAX_IND")
    private Character p611s1AlttaxInd;
    @Column(name = "P611S2_ALTTAX_AMT")
    private BigDecimal p611s2AlttaxAmt;
    @Column(name = "P613_SHIP_FRM_PST")
    private String p613ShipFrmPst;
    @Column(name = "P614_ORDER_DT")
    private Integer p614OrderDt;
    @Column(name = "P676_CRD_ACP_VAT")
    private String p676CrdAcpVat;
    @Column(name = "P677_CUST_VAT_NO")
    private String p677CustVatNo;
    @Column(name = "P678_UNIQUE_INV")
    private String p678UniqueInv;
    @Column(name = "P679_COMMODITY")
    private String p679Commodity;
    @Column(name = "P680_AUTH_CON_NM")
    private String p680AuthConNm;
    @Column(name = "P681_AUTH_CON_PH")
    private String p681AuthConPh;
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
    @Column(name = "P515_ADCRD_ACPT_IN")
    private String p515AdcrdAcptIn;
    @Basic(optional = false)
    @Column(name = "P516_ATETRA_NBR")
    private String p516AtetraNbr;
    @Basic(optional = false)
    @Column(name = "P517_NAICS_CD")
    private String p517NaicsCd;
    @Basic(optional = false)
    @Column(name = "P595S1_BUS_TYP")
    private Character p595s1BusTyp;
    @Basic(optional = false)
    @Column(name = "P595S2_BUS_OWNR_TY")
    private Character p595s2BusOwnrTy;
    @Basic(optional = false)
    @Column(name = "P595S3_BUS_CERT_TY")
    private Character p595s3BusCertTy;
    @Basic(optional = false)
    @Column(name = "P595S4_BUS_RACE_TY")
    private Character p595s4BusRaceTy;
    @Basic(optional = false)
    @Column(name = "P595S5_BUSTYP_PRCD")
    private Character p595s5BustypPrcd;
    @Basic(optional = false)
    @Column(name = "P595S6_BUSOWNR_PRC")
    private Character p595s6BusownrPrc;
    @Basic(optional = false)
    @Column(name = "P595S7_BUSCERT_PRC")
    private Character p595s7BuscertPrc;
    @Basic(optional = false)
    @Column(name = "P595S8_BUSRACE_PRC")
    private Character p595s8BusracePrc;
    @Basic(optional = false)
    @Column(name = "P596S1_CRDACP_TXID")
    private String p596s1CrdacpTxid;
    @Basic(optional = false)
    @Column(name = "P596S2_CRDACP_TXPC")
    private Character p596s2CrdacpTxpc;
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
    @Column(name = "P606S1_FRT_AMT")
    private BigDecimal p606s1FrtAmt;
    @Basic(optional = false)
    @Column(name = "P606S2_FRT_AMT_EXP")
    private short p606s2FrtAmtExp;
    @Basic(optional = false)
    @Column(name = "P606S3_FRT_AMT_SIG")
    private Character p606s3FrtAmtSig;
    @Basic(optional = false)
    @Column(name = "P607S1_DUTY_AMT")
    private BigDecimal p607s1DutyAmt;
    @Basic(optional = false)
    @Column(name = "P607S2_DUTY_AMT_EX")
    private short p607s2DutyAmtEx;
    @Basic(optional = false)
    @Column(name = "P607S3_DUTY_AMT_SI")
    private Character p607s3DutyAmtSi;
    @Basic(optional = false)
    @Column(name = "P732S1_DISC_AMT")
    private BigDecimal p732s1DiscAmt;
    @Basic(optional = false)
    @Column(name = "P732S2_DISC_AMT_EX")
    private short p732s2DiscAmtEx;
    @Basic(optional = false)
    @Column(name = "P732S3_DISC_AMT_SI")
    private Character p732s3DiscAmtSi;
    @Basic(optional = false)
    @Column(name = "P732S4_DISC_TP")
    private String p732s4DiscTp;
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
    @Column(name = "P688_CRD_ACP_EMAIL")
    private String p688CrdAcpEmail;
    @Basic(optional = false)
    @Column(name = "A597S1_TTX_AMT")
    private BigDecimal a597s1TtxAmt;
    @Basic(optional = false)
    @Column(name = "A606S1_FRT_AMT")
    private BigDecimal a606s1FrtAmt;
    @Basic(optional = false)
    @Column(name = "A607S1_DUTY_AMT")
    private BigDecimal a607s1DutyAmt;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;

    public McAddCcCommon() {
    }

    public McAddCcCommon(McAddCcCommonPK mcAddCcCommonPK) {
        this.mcAddCcCommonPK = mcAddCcCommonPK;
    }

    public McAddCcCommon(McAddCcCommonPK mcAddCcCommonPK, String p515AdcrdAcptIn, String p516AtetraNbr, String p517NaicsCd, Character p595s1BusTyp, Character p595s2BusOwnrTy, Character p595s3BusCertTy, Character p595s4BusRaceTy, Character p595s5BustypPrcd, Character p595s6BusownrPrc, Character p595s7BuscertPrc, Character p595s8BusracePrc, String p596s1CrdacpTxid, Character p596s2CrdacpTxpc, BigDecimal p597s1TtxAmt, short p597s2TtxAmtExp, Character p597s3TtxAmtSig, BigDecimal p606s1FrtAmt, short p606s2FrtAmtExp, Character p606s3FrtAmtSig, BigDecimal p607s1DutyAmt, short p607s2DutyAmtEx, Character p607s3DutyAmtSi, BigDecimal p732s1DiscAmt, short p732s2DiscAmtEx, Character p732s3DiscAmtSi, String p732s4DiscTp, String taxAmtTs, Character taxAmt682Ind, Character taxAmt683Ind, Character taxAmt684Ind, Character taxAmt751Ind, Character taxAmt752Ind, Character taxAmt753Ind, String p688CrdAcpEmail, BigDecimal a597s1TtxAmt, BigDecimal a606s1FrtAmt, BigDecimal a607s1DutyAmt, Date rowChgTs) {
        this.mcAddCcCommonPK = mcAddCcCommonPK;
        this.p515AdcrdAcptIn = p515AdcrdAcptIn;
        this.p516AtetraNbr = p516AtetraNbr;
        this.p517NaicsCd = p517NaicsCd;
        this.p595s1BusTyp = p595s1BusTyp;
        this.p595s2BusOwnrTy = p595s2BusOwnrTy;
        this.p595s3BusCertTy = p595s3BusCertTy;
        this.p595s4BusRaceTy = p595s4BusRaceTy;
        this.p595s5BustypPrcd = p595s5BustypPrcd;
        this.p595s6BusownrPrc = p595s6BusownrPrc;
        this.p595s7BuscertPrc = p595s7BuscertPrc;
        this.p595s8BusracePrc = p595s8BusracePrc;
        this.p596s1CrdacpTxid = p596s1CrdacpTxid;
        this.p596s2CrdacpTxpc = p596s2CrdacpTxpc;
        this.p597s1TtxAmt = p597s1TtxAmt;
        this.p597s2TtxAmtExp = p597s2TtxAmtExp;
        this.p597s3TtxAmtSig = p597s3TtxAmtSig;
        this.p606s1FrtAmt = p606s1FrtAmt;
        this.p606s2FrtAmtExp = p606s2FrtAmtExp;
        this.p606s3FrtAmtSig = p606s3FrtAmtSig;
        this.p607s1DutyAmt = p607s1DutyAmt;
        this.p607s2DutyAmtEx = p607s2DutyAmtEx;
        this.p607s3DutyAmtSi = p607s3DutyAmtSi;
        this.p732s1DiscAmt = p732s1DiscAmt;
        this.p732s2DiscAmtEx = p732s2DiscAmtEx;
        this.p732s3DiscAmtSi = p732s3DiscAmtSi;
        this.p732s4DiscTp = p732s4DiscTp;
        this.taxAmtTs = taxAmtTs;
        this.taxAmt682Ind = taxAmt682Ind;
        this.taxAmt683Ind = taxAmt683Ind;
        this.taxAmt684Ind = taxAmt684Ind;
        this.taxAmt751Ind = taxAmt751Ind;
        this.taxAmt752Ind = taxAmt752Ind;
        this.taxAmt753Ind = taxAmt753Ind;
        this.p688CrdAcpEmail = p688CrdAcpEmail;
        this.a597s1TtxAmt = a597s1TtxAmt;
        this.a606s1FrtAmt = a606s1FrtAmt;
        this.a607s1DutyAmt = a607s1DutyAmt;
        this.rowChgTs = rowChgTs;
    }

    public McAddCcCommon(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.mcAddCcCommonPK = new McAddCcCommonPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s3OccInd, p501s4MsgNo, d71MsgNo);
    }

    public McAddCcCommonPK getMcAddCcCommonPK() {
        return mcAddCcCommonPK;
    }

    public void setMcAddCcCommonPK(McAddCcCommonPK mcAddCcCommonPK) {
        this.mcAddCcCommonPK = mcAddCcCommonPK;
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

    public String getP595CrdAcpTy() {
        return p595CrdAcpTy;
    }

    public void setP595CrdAcpTy(String p595CrdAcpTy) {
        this.p595CrdAcpTy = p595CrdAcpTy;
    }

    public String getP596CrdAcpTx() {
        return p596CrdAcpTx;
    }

    public void setP596CrdAcpTx(String p596CrdAcpTx) {
        this.p596CrdAcpTx = p596CrdAcpTx;
    }

    public BigDecimal getP597TaxAmt() {
        return p597TaxAmt;
    }

    public void setP597TaxAmt(BigDecimal p597TaxAmt) {
        this.p597TaxAmt = p597TaxAmt;
    }

    public Character getP598TaxCollInd() {
        return p598TaxCollInd;
    }

    public void setP598TaxCollInd(Character p598TaxCollInd) {
        this.p598TaxCollInd = p598TaxCollInd;
    }

    public String getP599CorpVatNo() {
        return p599CorpVatNo;
    }

    public void setP599CorpVatNo(String p599CorpVatNo) {
        this.p599CorpVatNo = p599CorpVatNo;
    }

    public String getP600CrdAcpRef() {
        return p600CrdAcpRef;
    }

    public void setP600CrdAcpRef(String p600CrdAcpRef) {
        this.p600CrdAcpRef = p600CrdAcpRef;
    }

    public BigDecimal getP606FreightAmt() {
        return p606FreightAmt;
    }

    public void setP606FreightAmt(BigDecimal p606FreightAmt) {
        this.p606FreightAmt = p606FreightAmt;
    }

    public BigDecimal getP607DutyAmt() {
        return p607DutyAmt;
    }

    public void setP607DutyAmt(BigDecimal p607DutyAmt) {
        this.p607DutyAmt = p607DutyAmt;
    }

    public String getP608DestPostal() {
        return p608DestPostal;
    }

    public void setP608DestPostal(String p608DestPostal) {
        this.p608DestPostal = p608DestPostal;
    }

    public String getP609DestSt() {
        return p609DestSt;
    }

    public void setP609DestSt(String p609DestSt) {
        this.p609DestSt = p609DestSt;
    }

    public String getP610DestCntry() {
        return p610DestCntry;
    }

    public void setP610DestCntry(String p610DestCntry) {
        this.p610DestCntry = p610DestCntry;
    }

    public Character getP611s1AlttaxInd() {
        return p611s1AlttaxInd;
    }

    public void setP611s1AlttaxInd(Character p611s1AlttaxInd) {
        this.p611s1AlttaxInd = p611s1AlttaxInd;
    }

    public BigDecimal getP611s2AlttaxAmt() {
        return p611s2AlttaxAmt;
    }

    public void setP611s2AlttaxAmt(BigDecimal p611s2AlttaxAmt) {
        this.p611s2AlttaxAmt = p611s2AlttaxAmt;
    }

    public String getP613ShipFrmPst() {
        return p613ShipFrmPst;
    }

    public void setP613ShipFrmPst(String p613ShipFrmPst) {
        this.p613ShipFrmPst = p613ShipFrmPst;
    }

    public Integer getP614OrderDt() {
        return p614OrderDt;
    }

    public void setP614OrderDt(Integer p614OrderDt) {
        this.p614OrderDt = p614OrderDt;
    }

    public String getP676CrdAcpVat() {
        return p676CrdAcpVat;
    }

    public void setP676CrdAcpVat(String p676CrdAcpVat) {
        this.p676CrdAcpVat = p676CrdAcpVat;
    }

    public String getP677CustVatNo() {
        return p677CustVatNo;
    }

    public void setP677CustVatNo(String p677CustVatNo) {
        this.p677CustVatNo = p677CustVatNo;
    }

    public String getP678UniqueInv() {
        return p678UniqueInv;
    }

    public void setP678UniqueInv(String p678UniqueInv) {
        this.p678UniqueInv = p678UniqueInv;
    }

    public String getP679Commodity() {
        return p679Commodity;
    }

    public void setP679Commodity(String p679Commodity) {
        this.p679Commodity = p679Commodity;
    }

    public String getP680AuthConNm() {
        return p680AuthConNm;
    }

    public void setP680AuthConNm(String p680AuthConNm) {
        this.p680AuthConNm = p680AuthConNm;
    }

    public String getP681AuthConPh() {
        return p681AuthConPh;
    }

    public void setP681AuthConPh(String p681AuthConPh) {
        this.p681AuthConPh = p681AuthConPh;
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

    public String getP515AdcrdAcptIn() {
        return p515AdcrdAcptIn;
    }

    public void setP515AdcrdAcptIn(String p515AdcrdAcptIn) {
        this.p515AdcrdAcptIn = p515AdcrdAcptIn;
    }

    public String getP516AtetraNbr() {
        return p516AtetraNbr;
    }

    public void setP516AtetraNbr(String p516AtetraNbr) {
        this.p516AtetraNbr = p516AtetraNbr;
    }

    public String getP517NaicsCd() {
        return p517NaicsCd;
    }

    public void setP517NaicsCd(String p517NaicsCd) {
        this.p517NaicsCd = p517NaicsCd;
    }

    public Character getP595s1BusTyp() {
        return p595s1BusTyp;
    }

    public void setP595s1BusTyp(Character p595s1BusTyp) {
        this.p595s1BusTyp = p595s1BusTyp;
    }

    public Character getP595s2BusOwnrTy() {
        return p595s2BusOwnrTy;
    }

    public void setP595s2BusOwnrTy(Character p595s2BusOwnrTy) {
        this.p595s2BusOwnrTy = p595s2BusOwnrTy;
    }

    public Character getP595s3BusCertTy() {
        return p595s3BusCertTy;
    }

    public void setP595s3BusCertTy(Character p595s3BusCertTy) {
        this.p595s3BusCertTy = p595s3BusCertTy;
    }

    public Character getP595s4BusRaceTy() {
        return p595s4BusRaceTy;
    }

    public void setP595s4BusRaceTy(Character p595s4BusRaceTy) {
        this.p595s4BusRaceTy = p595s4BusRaceTy;
    }

    public Character getP595s5BustypPrcd() {
        return p595s5BustypPrcd;
    }

    public void setP595s5BustypPrcd(Character p595s5BustypPrcd) {
        this.p595s5BustypPrcd = p595s5BustypPrcd;
    }

    public Character getP595s6BusownrPrc() {
        return p595s6BusownrPrc;
    }

    public void setP595s6BusownrPrc(Character p595s6BusownrPrc) {
        this.p595s6BusownrPrc = p595s6BusownrPrc;
    }

    public Character getP595s7BuscertPrc() {
        return p595s7BuscertPrc;
    }

    public void setP595s7BuscertPrc(Character p595s7BuscertPrc) {
        this.p595s7BuscertPrc = p595s7BuscertPrc;
    }

    public Character getP595s8BusracePrc() {
        return p595s8BusracePrc;
    }

    public void setP595s8BusracePrc(Character p595s8BusracePrc) {
        this.p595s8BusracePrc = p595s8BusracePrc;
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

    public BigDecimal getP606s1FrtAmt() {
        return p606s1FrtAmt;
    }

    public void setP606s1FrtAmt(BigDecimal p606s1FrtAmt) {
        this.p606s1FrtAmt = p606s1FrtAmt;
    }

    public short getP606s2FrtAmtExp() {
        return p606s2FrtAmtExp;
    }

    public void setP606s2FrtAmtExp(short p606s2FrtAmtExp) {
        this.p606s2FrtAmtExp = p606s2FrtAmtExp;
    }

    public Character getP606s3FrtAmtSig() {
        return p606s3FrtAmtSig;
    }

    public void setP606s3FrtAmtSig(Character p606s3FrtAmtSig) {
        this.p606s3FrtAmtSig = p606s3FrtAmtSig;
    }

    public BigDecimal getP607s1DutyAmt() {
        return p607s1DutyAmt;
    }

    public void setP607s1DutyAmt(BigDecimal p607s1DutyAmt) {
        this.p607s1DutyAmt = p607s1DutyAmt;
    }

    public short getP607s2DutyAmtEx() {
        return p607s2DutyAmtEx;
    }

    public void setP607s2DutyAmtEx(short p607s2DutyAmtEx) {
        this.p607s2DutyAmtEx = p607s2DutyAmtEx;
    }

    public Character getP607s3DutyAmtSi() {
        return p607s3DutyAmtSi;
    }

    public void setP607s3DutyAmtSi(Character p607s3DutyAmtSi) {
        this.p607s3DutyAmtSi = p607s3DutyAmtSi;
    }

    public BigDecimal getP732s1DiscAmt() {
        return p732s1DiscAmt;
    }

    public void setP732s1DiscAmt(BigDecimal p732s1DiscAmt) {
        this.p732s1DiscAmt = p732s1DiscAmt;
    }

    public short getP732s2DiscAmtEx() {
        return p732s2DiscAmtEx;
    }

    public void setP732s2DiscAmtEx(short p732s2DiscAmtEx) {
        this.p732s2DiscAmtEx = p732s2DiscAmtEx;
    }

    public Character getP732s3DiscAmtSi() {
        return p732s3DiscAmtSi;
    }

    public void setP732s3DiscAmtSi(Character p732s3DiscAmtSi) {
        this.p732s3DiscAmtSi = p732s3DiscAmtSi;
    }

    public String getP732s4DiscTp() {
        return p732s4DiscTp;
    }

    public void setP732s4DiscTp(String p732s4DiscTp) {
        this.p732s4DiscTp = p732s4DiscTp;
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

    public String getP688CrdAcpEmail() {
        return p688CrdAcpEmail;
    }

    public void setP688CrdAcpEmail(String p688CrdAcpEmail) {
        this.p688CrdAcpEmail = p688CrdAcpEmail;
    }

    public BigDecimal getA597s1TtxAmt() {
        return a597s1TtxAmt;
    }

    public void setA597s1TtxAmt(BigDecimal a597s1TtxAmt) {
        this.a597s1TtxAmt = a597s1TtxAmt;
    }

    public BigDecimal getA606s1FrtAmt() {
        return a606s1FrtAmt;
    }

    public void setA606s1FrtAmt(BigDecimal a606s1FrtAmt) {
        this.a606s1FrtAmt = a606s1FrtAmt;
    }

    public BigDecimal getA607s1DutyAmt() {
        return a607s1DutyAmt;
    }

    public void setA607s1DutyAmt(BigDecimal a607s1DutyAmt) {
        this.a607s1DutyAmt = a607s1DutyAmt;
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
        hash += (mcAddCcCommonPK != null ? mcAddCcCommonPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddCcCommon)) {
            return false;
        }
        McAddCcCommon other = (McAddCcCommon) object;
        if ((this.mcAddCcCommonPK == null && other.mcAddCcCommonPK != null) || (this.mcAddCcCommonPK != null && !this.mcAddCcCommonPK.equals(other.mcAddCcCommonPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddCcCommon[ mcAddCcCommonPK=" + mcAddCcCommonPK + " ]";
    }

}
