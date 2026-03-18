package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_ADD_VEHRENT", catalog = "", schema = "CXXCOW")
public class McAddVehrent implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddVehrentPK mcAddVehrentPK;
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
    @Column(name = "P544_REN_AGR_NO")
    private String p544RenAgrNo;
    @Column(name = "P545_RENR_NM")
    private String p545RenrNm;
    @Column(name = "P546_REN_RTN_CTY")
    private String p546RenRtnCty;
    @Column(name = "P547_REN_RTN_ST")
    private String p547RenRtnSt;
    @Column(name = "P548_REN_RTN_C")
    private String p548RenRtnC;
    @Column(name = "P549_REN_RTN_LOC")
    private String p549RenRtnLoc;
    @Column(name = "P550_REN_RTN_DT")
    private Integer p550RenRtnDt;
    @Column(name = "P551_REN_CO_DT")
    private Integer p551RenCoDt;
    @Column(name = "P552_CUSTSRVC_TF")
    private String p552CustsrvcTf;
    @Column(name = "P553S1_REN_RT_IND")
    private Character p553s1RenRtInd;

    @Column(name = "P553S2_REN_RT")
    private BigDecimal p553s2RenRt;
    @Column(name = "P555_RT_PER_ML")
    private BigDecimal p555RtPerMl;
    @Column(name = "P556_TOT_MLS")
    private String p556TotMls;
    @Column(name = "P557_MAXFREE_MLS")
    private String p557MaxfreeMls;
    @Column(name = "P558_MILES_IND")
    private Character p558MilesInd;
    @Column(name = "P559S2_INS_CHRG")
    private BigDecimal p559s2InsChrg;
    @Column(name = "P559S1_INSE_IND")
    private Character p559s1InseInd;
    @Column(name = "P561S1_ADJ_AMT_IND")
    private Character p561s1AdjAmtInd;
    @Column(name = "P561S2_ADJ_AMT")
    private BigDecimal p561s2AdjAmt;
    @Column(name = "P563_PGM_CD")
    private String p563PgmCd;
    @Column(name = "P564_REN_LOC_CTY")
    private String p564RenLocCty;
    @Column(name = "P565_REN_LOC_ST")
    private String p565RenLocSt;
    @Column(name = "P567_REN_LOC_ID")
    private String p567RenLocId;
    @Column(name = "P568_REN_CL_ID")
    private String p568RenClId;
    @Column(name = "P566_REN_LOC_C")
    private String p566RenLocC;
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
    @Column(name = "P689_CORP_ID")
    private String p689CorpId;
    @Column(name = "P690_NO_SHOW_IND")
    private Character p690NoShowInd;
    @Column(name = "P691_DAYS_RENTED")
    private Short p691DaysRented;
    @Column(name = "P692_WK_REN_AMT")
    private BigDecimal p692WkRenAmt;
    @Column(name = "P693_TOTAUTH_AMT")
    private BigDecimal p693TotauthAmt;
    @Column(name = "P694_OWAYDRPCHRG")
    private BigDecimal p694Owaydrpchrg;
    @Column(name = "P695_REGMLGCHRG")
    private BigDecimal p695Regmlgchrg;
    @Column(name = "P696_EXTMLG_CHRG")
    private BigDecimal p696ExtmlgChrg;
    @Column(name = "P697_LATE_CHARGE")
    private BigDecimal p697LateCharge;
    @Column(name = "P698_FUEL_CHARGE")
    private BigDecimal p698FuelCharge;
    @Column(name = "P700_TOWING_CHARGE")
    private BigDecimal p700TowingCharge;
    @Column(name = "P701_EXT_CHRG")
    private BigDecimal p701ExtChrg;
    @Column(name = "P702_OTHER_CHRG")
    private BigDecimal p702OtherChrg;
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
    @Column(name = "P693S1_TOTAUTH_AMT")
    private BigDecimal p693s1TotauthAmt;
    @Basic(optional = false)
    @Column(name = "P693S2_TOTAUTH_EXP")
    private short p693s2TotauthExp;
    @Basic(optional = false)
    @Column(name = "P693S3_TOTAUTH_SIG")
    private Character p693s3TotauthSig;
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
    @Column(name = "A693S1_TOTAUTH_AMT")
    private BigDecimal a693s1TotauthAmt;

    public McAddVehrent() {
    }

    public McAddVehrent(McAddVehrentPK mcAddVehrentPK) {
        this.mcAddVehrentPK = mcAddVehrentPK;
    }

    public McAddVehrent(McAddVehrentPK mcAddVehrentPK, BigDecimal p597s1TtxAmt, short p597s2TtxAmtExp, Character p597s3TtxAmtSig, Character p598TaxCltnInd, BigDecimal p693s1TotauthAmt, short p693s2TotauthExp, Character p693s3TotauthSig, String taxAmtTs, Character taxAmt682Ind, Character taxAmt683Ind, Character taxAmt684Ind, Character taxAmt751Ind, Character taxAmt752Ind, Character taxAmt753Ind, BigDecimal a597s1TtxAmt, BigDecimal a693s1TotauthAmt) {
        this.mcAddVehrentPK = mcAddVehrentPK;
        this.p597s1TtxAmt = p597s1TtxAmt;
        this.p597s2TtxAmtExp = p597s2TtxAmtExp;
        this.p597s3TtxAmtSig = p597s3TtxAmtSig;
        this.p598TaxCltnInd = p598TaxCltnInd;
        this.p693s1TotauthAmt = p693s1TotauthAmt;
        this.p693s2TotauthExp = p693s2TotauthExp;
        this.p693s3TotauthSig = p693s3TotauthSig;
        this.taxAmtTs = taxAmtTs;
        this.taxAmt682Ind = taxAmt682Ind;
        this.taxAmt683Ind = taxAmt683Ind;
        this.taxAmt684Ind = taxAmt684Ind;
        this.taxAmt751Ind = taxAmt751Ind;
        this.taxAmt752Ind = taxAmt752Ind;
        this.taxAmt753Ind = taxAmt753Ind;
        this.a597s1TtxAmt = a597s1TtxAmt;
        this.a693s1TotauthAmt = a693s1TotauthAmt;
    }

    public McAddVehrent(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.mcAddVehrentPK = new McAddVehrentPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s3OccInd, p501s4MsgNo, d71MsgNo);
    }

    public McAddVehrentPK getMcAddVehrentPK() {
        return mcAddVehrentPK;
    }

    public void setMcAddVehrentPK(McAddVehrentPK mcAddVehrentPK) {
        this.mcAddVehrentPK = mcAddVehrentPK;
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

    public String getP544RenAgrNo() {
        return p544RenAgrNo;
    }

    public void setP544RenAgrNo(String p544RenAgrNo) {
        this.p544RenAgrNo = p544RenAgrNo;
    }

    public String getP545RenrNm() {
        return p545RenrNm;
    }

    public void setP545RenrNm(String p545RenrNm) {
        this.p545RenrNm = p545RenrNm;
    }

    public String getP546RenRtnCty() {
        return p546RenRtnCty;
    }

    public void setP546RenRtnCty(String p546RenRtnCty) {
        this.p546RenRtnCty = p546RenRtnCty;
    }

    public String getP547RenRtnSt() {
        return p547RenRtnSt;
    }

    public void setP547RenRtnSt(String p547RenRtnSt) {
        this.p547RenRtnSt = p547RenRtnSt;
    }

    public String getP548RenRtnC() {
        return p548RenRtnC;
    }

    public void setP548RenRtnC(String p548RenRtnC) {
        this.p548RenRtnC = p548RenRtnC;
    }

    public String getP549RenRtnLoc() {
        return p549RenRtnLoc;
    }

    public void setP549RenRtnLoc(String p549RenRtnLoc) {
        this.p549RenRtnLoc = p549RenRtnLoc;
    }

    public Integer getP550RenRtnDt() {
        return p550RenRtnDt;
    }

    public void setP550RenRtnDt(Integer p550RenRtnDt) {
        this.p550RenRtnDt = p550RenRtnDt;
    }

    public Integer getP551RenCoDt() {
        return p551RenCoDt;
    }

    public void setP551RenCoDt(Integer p551RenCoDt) {
        this.p551RenCoDt = p551RenCoDt;
    }

    public String getP552CustsrvcTf() {
        return p552CustsrvcTf;
    }

    public void setP552CustsrvcTf(String p552CustsrvcTf) {
        this.p552CustsrvcTf = p552CustsrvcTf;
    }

    public Character getP553s1RenRtInd() {
        return p553s1RenRtInd;
    }

    public void setP553s1RenRtInd(Character p553s1RenRtInd) {
        this.p553s1RenRtInd = p553s1RenRtInd;
    }

    public BigDecimal getP553s2RenRt() {
        return p553s2RenRt;
    }

    public void setP553s2RenRt(BigDecimal p553s2RenRt) {
        this.p553s2RenRt = p553s2RenRt;
    }

    public BigDecimal getP555RtPerMl() {
        return p555RtPerMl;
    }

    public void setP555RtPerMl(BigDecimal p555RtPerMl) {
        this.p555RtPerMl = p555RtPerMl;
    }

    public String getP556TotMls() {
        return p556TotMls;
    }

    public void setP556TotMls(String p556TotMls) {
        this.p556TotMls = p556TotMls;
    }

    public String getP557MaxfreeMls() {
        return p557MaxfreeMls;
    }

    public void setP557MaxfreeMls(String p557MaxfreeMls) {
        this.p557MaxfreeMls = p557MaxfreeMls;
    }

    public Character getP558MilesInd() {
        return p558MilesInd;
    }

    public void setP558MilesInd(Character p558MilesInd) {
        this.p558MilesInd = p558MilesInd;
    }

    public BigDecimal getP559s2InsChrg() {
        return p559s2InsChrg;
    }

    public void setP559s2InsChrg(BigDecimal p559s2InsChrg) {
        this.p559s2InsChrg = p559s2InsChrg;
    }

    public Character getP559s1InseInd() {
        return p559s1InseInd;
    }

    public void setP559s1InseInd(Character p559s1InseInd) {
        this.p559s1InseInd = p559s1InseInd;
    }

    public Character getP561s1AdjAmtInd() {
        return p561s1AdjAmtInd;
    }

    public void setP561s1AdjAmtInd(Character p561s1AdjAmtInd) {
        this.p561s1AdjAmtInd = p561s1AdjAmtInd;
    }

    public BigDecimal getP561s2AdjAmt() {
        return p561s2AdjAmt;
    }

    public void setP561s2AdjAmt(BigDecimal p561s2AdjAmt) {
        this.p561s2AdjAmt = p561s2AdjAmt;
    }

    public String getP563PgmCd() {
        return p563PgmCd;
    }

    public void setP563PgmCd(String p563PgmCd) {
        this.p563PgmCd = p563PgmCd;
    }

    public String getP564RenLocCty() {
        return p564RenLocCty;
    }

    public void setP564RenLocCty(String p564RenLocCty) {
        this.p564RenLocCty = p564RenLocCty;
    }

    public String getP565RenLocSt() {
        return p565RenLocSt;
    }

    public void setP565RenLocSt(String p565RenLocSt) {
        this.p565RenLocSt = p565RenLocSt;
    }

    public String getP567RenLocId() {
        return p567RenLocId;
    }

    public void setP567RenLocId(String p567RenLocId) {
        this.p567RenLocId = p567RenLocId;
    }

    public String getP568RenClId() {
        return p568RenClId;
    }

    public void setP568RenClId(String p568RenClId) {
        this.p568RenClId = p568RenClId;
    }

    public String getP566RenLocC() {
        return p566RenLocC;
    }

    public void setP566RenLocC(String p566RenLocC) {
        this.p566RenLocC = p566RenLocC;
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

    public String getP689CorpId() {
        return p689CorpId;
    }

    public void setP689CorpId(String p689CorpId) {
        this.p689CorpId = p689CorpId;
    }

    public Character getP690NoShowInd() {
        return p690NoShowInd;
    }

    public void setP690NoShowInd(Character p690NoShowInd) {
        this.p690NoShowInd = p690NoShowInd;
    }

    public Short getP691DaysRented() {
        return p691DaysRented;
    }

    public void setP691DaysRented(Short p691DaysRented) {
        this.p691DaysRented = p691DaysRented;
    }

    public BigDecimal getP692WkRenAmt() {
        return p692WkRenAmt;
    }

    public void setP692WkRenAmt(BigDecimal p692WkRenAmt) {
        this.p692WkRenAmt = p692WkRenAmt;
    }

    public BigDecimal getP693TotauthAmt() {
        return p693TotauthAmt;
    }

    public void setP693TotauthAmt(BigDecimal p693TotauthAmt) {
        this.p693TotauthAmt = p693TotauthAmt;
    }

    public BigDecimal getP694Owaydrpchrg() {
        return p694Owaydrpchrg;
    }

    public void setP694Owaydrpchrg(BigDecimal p694Owaydrpchrg) {
        this.p694Owaydrpchrg = p694Owaydrpchrg;
    }

    public BigDecimal getP695Regmlgchrg() {
        return p695Regmlgchrg;
    }

    public void setP695Regmlgchrg(BigDecimal p695Regmlgchrg) {
        this.p695Regmlgchrg = p695Regmlgchrg;
    }

    public BigDecimal getP696ExtmlgChrg() {
        return p696ExtmlgChrg;
    }

    public void setP696ExtmlgChrg(BigDecimal p696ExtmlgChrg) {
        this.p696ExtmlgChrg = p696ExtmlgChrg;
    }

    public BigDecimal getP697LateCharge() {
        return p697LateCharge;
    }

    public void setP697LateCharge(BigDecimal p697LateCharge) {
        this.p697LateCharge = p697LateCharge;
    }

    public BigDecimal getP698FuelCharge() {
        return p698FuelCharge;
    }

    public void setP698FuelCharge(BigDecimal p698FuelCharge) {
        this.p698FuelCharge = p698FuelCharge;
    }

    public BigDecimal getP700TowingCharge() {
        return p700TowingCharge;
    }

    public void setP700TowingCharge(BigDecimal p700TowingCharge) {
        this.p700TowingCharge = p700TowingCharge;
    }

    public BigDecimal getP701ExtChrg() {
        return p701ExtChrg;
    }

    public void setP701ExtChrg(BigDecimal p701ExtChrg) {
        this.p701ExtChrg = p701ExtChrg;
    }

    public BigDecimal getP702OtherChrg() {
        return p702OtherChrg;
    }

    public void setP702OtherChrg(BigDecimal p702OtherChrg) {
        this.p702OtherChrg = p702OtherChrg;
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

    public BigDecimal getP693s1TotauthAmt() {
        return p693s1TotauthAmt;
    }

    public void setP693s1TotauthAmt(BigDecimal p693s1TotauthAmt) {
        this.p693s1TotauthAmt = p693s1TotauthAmt;
    }

    public short getP693s2TotauthExp() {
        return p693s2TotauthExp;
    }

    public void setP693s2TotauthExp(short p693s2TotauthExp) {
        this.p693s2TotauthExp = p693s2TotauthExp;
    }

    public Character getP693s3TotauthSig() {
        return p693s3TotauthSig;
    }

    public void setP693s3TotauthSig(Character p693s3TotauthSig) {
        this.p693s3TotauthSig = p693s3TotauthSig;
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

    public BigDecimal getA693s1TotauthAmt() {
        return a693s1TotauthAmt;
    }

    public void setA693s1TotauthAmt(BigDecimal a693s1TotauthAmt) {
        this.a693s1TotauthAmt = a693s1TotauthAmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddVehrentPK != null ? mcAddVehrentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddVehrent)) {
            return false;
        }
        McAddVehrent other = (McAddVehrent) object;
        if ((this.mcAddVehrentPK == null && other.mcAddVehrentPK != null) || (this.mcAddVehrentPK != null && !this.mcAddVehrentPK.equals(other.mcAddVehrentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddVehrent[ mcAddVehrentPK=" + mcAddVehrentPK + " ]";
    }

}
