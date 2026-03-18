package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_ADD_CF_XTN", catalog = "", schema = "CXXCOW")
public class McAddCfXtn implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddCfXtnPK mcAddCfXtnPK;
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
    @Column(name = "P620_OIL_CO_BNM")
    private Short p620OilCoBnm;
    @Column(name = "P621_PURCHASE_TM")
    private Short p621PurchaseTm;
    @Column(name = "P622_MTR_FSRVC_TY")
    private Character p622MtrFsrvcTy;
    @Column(name = "A622_MTR_FSRVC_TY")
    private Character a622MtrFsrvcTy;
    @Column(name = "P623S1_MTR_FPRD_CD")
    private Short p623s1MtrFprdCd;
    @Column(name = "A623S1_MTR_FPRD_CD")
    private Short a623s1MtrFprdCd;

    @Column(name = "P623S2_MTR_FUNITPR")
    private BigDecimal p623s2MtrFunitpr;
    @Column(name = "A623S2_MTR_FUNITPR")
    private BigDecimal a623s2MtrFunitpr;
    @Column(name = "P623S3_MTR_FUNITMS")
    private Character p623s3MtrFunitms;
    @Column(name = "P623S4_MTR_FQTY")
    private BigDecimal p623s4MtrFqty;
    @Column(name = "A623S4_MTR_FQTY")
    private BigDecimal a623s4MtrFqty;
    @Column(name = "P623S5_MTR_FQTYEXP")
    private Character p623s5MtrFqtyexp;
    @Column(name = "P623S6_MTRFSALEAMT")
    private BigDecimal p623s6Mtrfsaleamt;
    @Column(name = "A623S6_MTRFSALEAMT")
    private BigDecimal a623s6Mtrfsaleamt;
    @Column(name = "P629_OD_READING")
    private String p629OdReading;
    @Column(name = "P630_VEHICLE_NO")
    private String p630VehicleNo;
    @Column(name = "P631_DRV_ID_NO")
    private String p631DrvIdNo;
    @Column(name = "P632_PROD_TY_CD")
    private Short p632ProdTyCd;
    @Column(name = "P633_COUP_D_AMT")
    private BigDecimal p633CoupDAmt;
    @Column(name = "A633_COUP_D_AMT")
    private BigDecimal a633CoupDAmt;
    @Column(name = "P634_TAX_AMT")
    private BigDecimal p634TaxAmt;
    @Column(name = "A634_TAX_AMT")
    private BigDecimal a634TaxAmt;
    @Column(name = "P635_TAX_AMT")
    private BigDecimal p635TaxAmt;
    @Column(name = "A635_TAX_AMT")
    private BigDecimal a635TaxAmt;
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
    @Column(name = "P712S1_NETFPRC")
    private BigDecimal p712s1Netfprc;
    @Column(name = "P712S2_NETFPRC_EXP")
    private Short p712s2NetfprcExp;
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
    @Column(name = "FILTERED_FLAGS")
    private String filteredFlags;
    @Basic(optional = false)
    @Column(name = "P519S1_AVL_24HR")
    private Character p519s1Avl24hr;
    @Basic(optional = false)
    @Column(name = "P519S3_DIESEL_AVAI")
    private Character p519s3DieselAvai;
    @Basic(optional = false)
    @Column(name = "P519S2_18WHEEL_ACC")
    private Character p519s218wheelAcc;
    @Basic(optional = false)
    @Column(name = "P519S4_DRCTN_AVBLT")
    private Character p519s4DrctnAvblt;
    @Basic(optional = false)
    @Column(name = "P519S5_CNVNCE_STRA")
    private Character p519s5CnvnceStra;
    @Basic(optional = false)
    @Column(name = "P519S6_RST_AVBLTY")
    private Character p519s6RstAvblty;
    @Basic(optional = false)
    @Column(name = "P519S7_HTL_AVBLTY")
    private Character p519s7HtlAvblty;
    @Basic(optional = false)
    @Column(name = "P519S8_SHOWER_AVBL")
    private Character p519s8ShowerAvbl;
    @Basic(optional = false)
    @Column(name = "P519S9_RPAIR_AVAIL")
    private Character p519s9RpairAvail;
    @Basic(optional = false)
    @Column(name = "P519S10_CARWASH_AV")
    private Character p519s10CarwashAv;
    @Basic(optional = false)
    @Column(name = "P519S11_AVN_AVBLTY")
    private Character p519s11AvnAvblty;
    @Basic(optional = false)
    @Column(name = "P519S12_MARINA_AVB")
    private Character p519s12MarinaAvb;
    @Basic(optional = false)
    @Column(name = "P519S13_ALT_FUEL_A")
    private Character p519s13AltFuelA;
    @Basic(optional = false)
    @Column(name = "P519S14_PAYATPUM_A")
    private Character p519s14PayatpumA;
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
    @Column(name = "P781_FLT_SPND_CNTL_ENF")
    private String p781FltSpndCntlEnf;
    @Basic(optional = false)
    @Column(name = "P782S1_FLT_FUEL_PRD_CD")
    private short p782s1FltFuelPrdCd;
    @Basic(optional = false)
    @Column(name = "P782S2_FLT_FUEL_UNT_PRC")
    private BigDecimal p782s2FltFuelUntPrc;
    @Basic(optional = false)
    @Column(name = "P782S3_FLT_FUEL_UNT_MSR")
    private Character p782s3FltFuelUntMsr;
    @Basic(optional = false)
    @Column(name = "P782S4_FLT_FUEL_QTY")
    private BigDecimal p782s4FltFuelQty;
    @Basic(optional = false)
    @Column(name = "P782S5_FLT_FUEL_QTY_E")
    private short p782s5FltFuelQtyE;
    @Basic(optional = false)
    @Column(name = "P782S6_FLT_FUEL_SALE_AMT")
    private BigDecimal p782s6FltFuelSaleAmt;
    @Basic(optional = false)
    @Column(name = "P790S1_PRMPT1_CD")
    private short p790s1Prmpt1Cd;
    @Basic(optional = false)
    @Column(name = "P790S2_PRMPT1_DATA")
    private String p790s2Prmpt1Data;
    @Basic(optional = false)
    @Column(name = "P791S1_PRMPT2_CD")
    private short p791s1Prmpt2Cd;
    @Basic(optional = false)
    @Column(name = "P791S2_PRMPT2_DATA")
    private String p791s2Prmpt2Data;
    @Basic(optional = false)
    @Column(name = "P792S1_PRMPT3_CD")
    private short p792s1Prmpt3Cd;
    @Basic(optional = false)
    @Column(name = "P792S2_PRMPT3_DATA")
    private String p792s2Prmpt3Data;
    @Basic(optional = false)
    @Column(name = "P793S1_PRMPT4_CD")
    private short p793s1Prmpt4Cd;
    @Basic(optional = false)
    @Column(name = "P793S2_PRMPT4_DATA")
    private String p793s2Prmpt4Data;
    @Basic(optional = false)
    @Column(name = "P794S1_PRMPT5_CD")
    private short p794s1Prmpt5Cd;
    @Basic(optional = false)
    @Column(name = "P794S2_PRMPT5_DATA")
    private String p794s2Prmpt5Data;
    @Basic(optional = false)
    @Column(name = "A623S1_MTR_FPRD_CD_TYP")
    private Character a623s1MtrFprdCdTyp;

    public McAddCfXtn() {
    }

    public McAddCfXtn(McAddCfXtnPK mcAddCfXtnPK) {
        this.mcAddCfXtnPK = mcAddCfXtnPK;
    }

    public McAddCfXtn(McAddCfXtnPK mcAddCfXtnPK, Character p519s1Avl24hr, Character p519s3DieselAvai, Character p519s218wheelAcc, Character p519s4DrctnAvblt, Character p519s5CnvnceStra, Character p519s6RstAvblty, Character p519s7HtlAvblty, Character p519s8ShowerAvbl, Character p519s9RpairAvail, Character p519s10CarwashAv, Character p519s11AvnAvblty, Character p519s12MarinaAvb, Character p519s13AltFuelA, Character p519s14PayatpumA, BigDecimal p597s1TtxAmt, short p597s2TtxAmtExp, Character p597s3TtxAmtSig, Character p598TaxCltnInd, String taxAmtTs, Character taxAmt682Ind, Character taxAmt683Ind, Character taxAmt684Ind, Character taxAmt751Ind, Character taxAmt752Ind, Character taxAmt753Ind, BigDecimal a597s1TtxAmt, String p781FltSpndCntlEnf, short p782s1FltFuelPrdCd, BigDecimal p782s2FltFuelUntPrc, Character p782s3FltFuelUntMsr, BigDecimal p782s4FltFuelQty, short p782s5FltFuelQtyE, BigDecimal p782s6FltFuelSaleAmt, short p790s1Prmpt1Cd, String p790s2Prmpt1Data, short p791s1Prmpt2Cd, String p791s2Prmpt2Data, short p792s1Prmpt3Cd, String p792s2Prmpt3Data, short p793s1Prmpt4Cd, String p793s2Prmpt4Data, short p794s1Prmpt5Cd, String p794s2Prmpt5Data, Character a623s1MtrFprdCdTyp) {
        this.mcAddCfXtnPK = mcAddCfXtnPK;
        this.p519s1Avl24hr = p519s1Avl24hr;
        this.p519s3DieselAvai = p519s3DieselAvai;
        this.p519s218wheelAcc = p519s218wheelAcc;
        this.p519s4DrctnAvblt = p519s4DrctnAvblt;
        this.p519s5CnvnceStra = p519s5CnvnceStra;
        this.p519s6RstAvblty = p519s6RstAvblty;
        this.p519s7HtlAvblty = p519s7HtlAvblty;
        this.p519s8ShowerAvbl = p519s8ShowerAvbl;
        this.p519s9RpairAvail = p519s9RpairAvail;
        this.p519s10CarwashAv = p519s10CarwashAv;
        this.p519s11AvnAvblty = p519s11AvnAvblty;
        this.p519s12MarinaAvb = p519s12MarinaAvb;
        this.p519s13AltFuelA = p519s13AltFuelA;
        this.p519s14PayatpumA = p519s14PayatpumA;
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
        this.p781FltSpndCntlEnf = p781FltSpndCntlEnf;
        this.p782s1FltFuelPrdCd = p782s1FltFuelPrdCd;
        this.p782s2FltFuelUntPrc = p782s2FltFuelUntPrc;
        this.p782s3FltFuelUntMsr = p782s3FltFuelUntMsr;
        this.p782s4FltFuelQty = p782s4FltFuelQty;
        this.p782s5FltFuelQtyE = p782s5FltFuelQtyE;
        this.p782s6FltFuelSaleAmt = p782s6FltFuelSaleAmt;
        this.p790s1Prmpt1Cd = p790s1Prmpt1Cd;
        this.p790s2Prmpt1Data = p790s2Prmpt1Data;
        this.p791s1Prmpt2Cd = p791s1Prmpt2Cd;
        this.p791s2Prmpt2Data = p791s2Prmpt2Data;
        this.p792s1Prmpt3Cd = p792s1Prmpt3Cd;
        this.p792s2Prmpt3Data = p792s2Prmpt3Data;
        this.p793s1Prmpt4Cd = p793s1Prmpt4Cd;
        this.p793s2Prmpt4Data = p793s2Prmpt4Data;
        this.p794s1Prmpt5Cd = p794s1Prmpt5Cd;
        this.p794s2Prmpt5Data = p794s2Prmpt5Data;
        this.a623s1MtrFprdCdTyp = a623s1MtrFprdCdTyp;
    }

    public McAddCfXtn(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.mcAddCfXtnPK = new McAddCfXtnPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s3OccInd, p501s4MsgNo, d71MsgNo);
    }

    public McAddCfXtnPK getMcAddCfXtnPK() {
        return mcAddCfXtnPK;
    }

    public void setMcAddCfXtnPK(McAddCfXtnPK mcAddCfXtnPK) {
        this.mcAddCfXtnPK = mcAddCfXtnPK;
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

    public Short getP620OilCoBnm() {
        return p620OilCoBnm;
    }

    public void setP620OilCoBnm(Short p620OilCoBnm) {
        this.p620OilCoBnm = p620OilCoBnm;
    }

    public Short getP621PurchaseTm() {
        return p621PurchaseTm;
    }

    public void setP621PurchaseTm(Short p621PurchaseTm) {
        this.p621PurchaseTm = p621PurchaseTm;
    }

    public Character getP622MtrFsrvcTy() {
        return p622MtrFsrvcTy;
    }

    public void setP622MtrFsrvcTy(Character p622MtrFsrvcTy) {
        this.p622MtrFsrvcTy = p622MtrFsrvcTy;
    }

    public Character getA622MtrFsrvcTy() {
        return a622MtrFsrvcTy;
    }

    public void setA622MtrFsrvcTy(Character a622MtrFsrvcTy) {
        this.a622MtrFsrvcTy = a622MtrFsrvcTy;
    }

    public Short getP623s1MtrFprdCd() {
        return p623s1MtrFprdCd;
    }

    public void setP623s1MtrFprdCd(Short p623s1MtrFprdCd) {
        this.p623s1MtrFprdCd = p623s1MtrFprdCd;
    }

    public Short getA623s1MtrFprdCd() {
        return a623s1MtrFprdCd;
    }

    public void setA623s1MtrFprdCd(Short a623s1MtrFprdCd) {
        this.a623s1MtrFprdCd = a623s1MtrFprdCd;
    }

    public BigDecimal getP623s2MtrFunitpr() {
        return p623s2MtrFunitpr;
    }

    public void setP623s2MtrFunitpr(BigDecimal p623s2MtrFunitpr) {
        this.p623s2MtrFunitpr = p623s2MtrFunitpr;
    }

    public BigDecimal getA623s2MtrFunitpr() {
        return a623s2MtrFunitpr;
    }

    public void setA623s2MtrFunitpr(BigDecimal a623s2MtrFunitpr) {
        this.a623s2MtrFunitpr = a623s2MtrFunitpr;
    }

    public Character getP623s3MtrFunitms() {
        return p623s3MtrFunitms;
    }

    public void setP623s3MtrFunitms(Character p623s3MtrFunitms) {
        this.p623s3MtrFunitms = p623s3MtrFunitms;
    }

    public BigDecimal getP623s4MtrFqty() {
        return p623s4MtrFqty;
    }

    public void setP623s4MtrFqty(BigDecimal p623s4MtrFqty) {
        this.p623s4MtrFqty = p623s4MtrFqty;
    }

    public BigDecimal getA623s4MtrFqty() {
        return a623s4MtrFqty;
    }

    public void setA623s4MtrFqty(BigDecimal a623s4MtrFqty) {
        this.a623s4MtrFqty = a623s4MtrFqty;
    }

    public Character getP623s5MtrFqtyexp() {
        return p623s5MtrFqtyexp;
    }

    public void setP623s5MtrFqtyexp(Character p623s5MtrFqtyexp) {
        this.p623s5MtrFqtyexp = p623s5MtrFqtyexp;
    }

    public BigDecimal getP623s6Mtrfsaleamt() {
        return p623s6Mtrfsaleamt;
    }

    public void setP623s6Mtrfsaleamt(BigDecimal p623s6Mtrfsaleamt) {
        this.p623s6Mtrfsaleamt = p623s6Mtrfsaleamt;
    }

    public BigDecimal getA623s6Mtrfsaleamt() {
        return a623s6Mtrfsaleamt;
    }

    public void setA623s6Mtrfsaleamt(BigDecimal a623s6Mtrfsaleamt) {
        this.a623s6Mtrfsaleamt = a623s6Mtrfsaleamt;
    }

    public String getP629OdReading() {
        return p629OdReading;
    }

    public void setP629OdReading(String p629OdReading) {
        this.p629OdReading = p629OdReading;
    }

    public String getP630VehicleNo() {
        return p630VehicleNo;
    }

    public void setP630VehicleNo(String p630VehicleNo) {
        this.p630VehicleNo = p630VehicleNo;
    }

    public String getP631DrvIdNo() {
        return p631DrvIdNo;
    }

    public void setP631DrvIdNo(String p631DrvIdNo) {
        this.p631DrvIdNo = p631DrvIdNo;
    }

    public Short getP632ProdTyCd() {
        return p632ProdTyCd;
    }

    public void setP632ProdTyCd(Short p632ProdTyCd) {
        this.p632ProdTyCd = p632ProdTyCd;
    }

    public BigDecimal getP633CoupDAmt() {
        return p633CoupDAmt;
    }

    public void setP633CoupDAmt(BigDecimal p633CoupDAmt) {
        this.p633CoupDAmt = p633CoupDAmt;
    }

    public BigDecimal getA633CoupDAmt() {
        return a633CoupDAmt;
    }

    public void setA633CoupDAmt(BigDecimal a633CoupDAmt) {
        this.a633CoupDAmt = a633CoupDAmt;
    }

    public BigDecimal getP634TaxAmt() {
        return p634TaxAmt;
    }

    public void setP634TaxAmt(BigDecimal p634TaxAmt) {
        this.p634TaxAmt = p634TaxAmt;
    }

    public BigDecimal getA634TaxAmt() {
        return a634TaxAmt;
    }

    public void setA634TaxAmt(BigDecimal a634TaxAmt) {
        this.a634TaxAmt = a634TaxAmt;
    }

    public BigDecimal getP635TaxAmt() {
        return p635TaxAmt;
    }

    public void setP635TaxAmt(BigDecimal p635TaxAmt) {
        this.p635TaxAmt = p635TaxAmt;
    }

    public BigDecimal getA635TaxAmt() {
        return a635TaxAmt;
    }

    public void setA635TaxAmt(BigDecimal a635TaxAmt) {
        this.a635TaxAmt = a635TaxAmt;
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

    public BigDecimal getP712s1Netfprc() {
        return p712s1Netfprc;
    }

    public void setP712s1Netfprc(BigDecimal p712s1Netfprc) {
        this.p712s1Netfprc = p712s1Netfprc;
    }

    public Short getP712s2NetfprcExp() {
        return p712s2NetfprcExp;
    }

    public void setP712s2NetfprcExp(Short p712s2NetfprcExp) {
        this.p712s2NetfprcExp = p712s2NetfprcExp;
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

    public String getFilteredFlags() {
        return filteredFlags;
    }

    public void setFilteredFlags(String filteredFlags) {
        this.filteredFlags = filteredFlags;
    }

    public Character getP519s1Avl24hr() {
        return p519s1Avl24hr;
    }

    public void setP519s1Avl24hr(Character p519s1Avl24hr) {
        this.p519s1Avl24hr = p519s1Avl24hr;
    }

    public Character getP519s3DieselAvai() {
        return p519s3DieselAvai;
    }

    public void setP519s3DieselAvai(Character p519s3DieselAvai) {
        this.p519s3DieselAvai = p519s3DieselAvai;
    }

    public Character getP519s218wheelAcc() {
        return p519s218wheelAcc;
    }

    public void setP519s218wheelAcc(Character p519s218wheelAcc) {
        this.p519s218wheelAcc = p519s218wheelAcc;
    }

    public Character getP519s4DrctnAvblt() {
        return p519s4DrctnAvblt;
    }

    public void setP519s4DrctnAvblt(Character p519s4DrctnAvblt) {
        this.p519s4DrctnAvblt = p519s4DrctnAvblt;
    }

    public Character getP519s5CnvnceStra() {
        return p519s5CnvnceStra;
    }

    public void setP519s5CnvnceStra(Character p519s5CnvnceStra) {
        this.p519s5CnvnceStra = p519s5CnvnceStra;
    }

    public Character getP519s6RstAvblty() {
        return p519s6RstAvblty;
    }

    public void setP519s6RstAvblty(Character p519s6RstAvblty) {
        this.p519s6RstAvblty = p519s6RstAvblty;
    }

    public Character getP519s7HtlAvblty() {
        return p519s7HtlAvblty;
    }

    public void setP519s7HtlAvblty(Character p519s7HtlAvblty) {
        this.p519s7HtlAvblty = p519s7HtlAvblty;
    }

    public Character getP519s8ShowerAvbl() {
        return p519s8ShowerAvbl;
    }

    public void setP519s8ShowerAvbl(Character p519s8ShowerAvbl) {
        this.p519s8ShowerAvbl = p519s8ShowerAvbl;
    }

    public Character getP519s9RpairAvail() {
        return p519s9RpairAvail;
    }

    public void setP519s9RpairAvail(Character p519s9RpairAvail) {
        this.p519s9RpairAvail = p519s9RpairAvail;
    }

    public Character getP519s10CarwashAv() {
        return p519s10CarwashAv;
    }

    public void setP519s10CarwashAv(Character p519s10CarwashAv) {
        this.p519s10CarwashAv = p519s10CarwashAv;
    }

    public Character getP519s11AvnAvblty() {
        return p519s11AvnAvblty;
    }

    public void setP519s11AvnAvblty(Character p519s11AvnAvblty) {
        this.p519s11AvnAvblty = p519s11AvnAvblty;
    }

    public Character getP519s12MarinaAvb() {
        return p519s12MarinaAvb;
    }

    public void setP519s12MarinaAvb(Character p519s12MarinaAvb) {
        this.p519s12MarinaAvb = p519s12MarinaAvb;
    }

    public Character getP519s13AltFuelA() {
        return p519s13AltFuelA;
    }

    public void setP519s13AltFuelA(Character p519s13AltFuelA) {
        this.p519s13AltFuelA = p519s13AltFuelA;
    }

    public Character getP519s14PayatpumA() {
        return p519s14PayatpumA;
    }

    public void setP519s14PayatpumA(Character p519s14PayatpumA) {
        this.p519s14PayatpumA = p519s14PayatpumA;
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

    public String getP781FltSpndCntlEnf() {
        return p781FltSpndCntlEnf;
    }

    public void setP781FltSpndCntlEnf(String p781FltSpndCntlEnf) {
        this.p781FltSpndCntlEnf = p781FltSpndCntlEnf;
    }

    public short getP782s1FltFuelPrdCd() {
        return p782s1FltFuelPrdCd;
    }

    public void setP782s1FltFuelPrdCd(short p782s1FltFuelPrdCd) {
        this.p782s1FltFuelPrdCd = p782s1FltFuelPrdCd;
    }

    public BigDecimal getP782s2FltFuelUntPrc() {
        return p782s2FltFuelUntPrc;
    }

    public void setP782s2FltFuelUntPrc(BigDecimal p782s2FltFuelUntPrc) {
        this.p782s2FltFuelUntPrc = p782s2FltFuelUntPrc;
    }

    public Character getP782s3FltFuelUntMsr() {
        return p782s3FltFuelUntMsr;
    }

    public void setP782s3FltFuelUntMsr(Character p782s3FltFuelUntMsr) {
        this.p782s3FltFuelUntMsr = p782s3FltFuelUntMsr;
    }

    public BigDecimal getP782s4FltFuelQty() {
        return p782s4FltFuelQty;
    }

    public void setP782s4FltFuelQty(BigDecimal p782s4FltFuelQty) {
        this.p782s4FltFuelQty = p782s4FltFuelQty;
    }

    public short getP782s5FltFuelQtyE() {
        return p782s5FltFuelQtyE;
    }

    public void setP782s5FltFuelQtyE(short p782s5FltFuelQtyE) {
        this.p782s5FltFuelQtyE = p782s5FltFuelQtyE;
    }

    public BigDecimal getP782s6FltFuelSaleAmt() {
        return p782s6FltFuelSaleAmt;
    }

    public void setP782s6FltFuelSaleAmt(BigDecimal p782s6FltFuelSaleAmt) {
        this.p782s6FltFuelSaleAmt = p782s6FltFuelSaleAmt;
    }

    public short getP790s1Prmpt1Cd() {
        return p790s1Prmpt1Cd;
    }

    public void setP790s1Prmpt1Cd(short p790s1Prmpt1Cd) {
        this.p790s1Prmpt1Cd = p790s1Prmpt1Cd;
    }

    public String getP790s2Prmpt1Data() {
        return p790s2Prmpt1Data;
    }

    public void setP790s2Prmpt1Data(String p790s2Prmpt1Data) {
        this.p790s2Prmpt1Data = p790s2Prmpt1Data;
    }

    public short getP791s1Prmpt2Cd() {
        return p791s1Prmpt2Cd;
    }

    public void setP791s1Prmpt2Cd(short p791s1Prmpt2Cd) {
        this.p791s1Prmpt2Cd = p791s1Prmpt2Cd;
    }

    public String getP791s2Prmpt2Data() {
        return p791s2Prmpt2Data;
    }

    public void setP791s2Prmpt2Data(String p791s2Prmpt2Data) {
        this.p791s2Prmpt2Data = p791s2Prmpt2Data;
    }

    public short getP792s1Prmpt3Cd() {
        return p792s1Prmpt3Cd;
    }

    public void setP792s1Prmpt3Cd(short p792s1Prmpt3Cd) {
        this.p792s1Prmpt3Cd = p792s1Prmpt3Cd;
    }

    public String getP792s2Prmpt3Data() {
        return p792s2Prmpt3Data;
    }

    public void setP792s2Prmpt3Data(String p792s2Prmpt3Data) {
        this.p792s2Prmpt3Data = p792s2Prmpt3Data;
    }

    public short getP793s1Prmpt4Cd() {
        return p793s1Prmpt4Cd;
    }

    public void setP793s1Prmpt4Cd(short p793s1Prmpt4Cd) {
        this.p793s1Prmpt4Cd = p793s1Prmpt4Cd;
    }

    public String getP793s2Prmpt4Data() {
        return p793s2Prmpt4Data;
    }

    public void setP793s2Prmpt4Data(String p793s2Prmpt4Data) {
        this.p793s2Prmpt4Data = p793s2Prmpt4Data;
    }

    public short getP794s1Prmpt5Cd() {
        return p794s1Prmpt5Cd;
    }

    public void setP794s1Prmpt5Cd(short p794s1Prmpt5Cd) {
        this.p794s1Prmpt5Cd = p794s1Prmpt5Cd;
    }

    public String getP794s2Prmpt5Data() {
        return p794s2Prmpt5Data;
    }

    public void setP794s2Prmpt5Data(String p794s2Prmpt5Data) {
        this.p794s2Prmpt5Data = p794s2Prmpt5Data;
    }

    public Character getA623s1MtrFprdCdTyp() {
        return a623s1MtrFprdCdTyp;
    }

    public void setA623s1MtrFprdCdTyp(Character a623s1MtrFprdCdTyp) {
        this.a623s1MtrFprdCdTyp = a623s1MtrFprdCdTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddCfXtnPK != null ? mcAddCfXtnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddCfXtn)) {
            return false;
        }
        McAddCfXtn other = (McAddCfXtn) object;
        if ((this.mcAddCfXtnPK == null && other.mcAddCfXtnPK != null) || (this.mcAddCfXtnPK != null && !this.mcAddCfXtnPK.equals(other.mcAddCfXtnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddCfXtn[ mcAddCfXtnPK=" + mcAddCfXtnPK + " ]";
    }

}
