package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_ADD_LODG_DTL", catalog = "", schema = "CXXCOW")
public class McAddLodgDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddLodgDtlPK mcAddLodgDtlPK;
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
    @Column(name = "P552_CUSTSRVC_TF")
    private String p552CustsrvcTf;
    @Column(name = "P574_ARR_DT")
    private Integer p574ArrDt;
    @Column(name = "P575_DEP_DT")
    private Integer p575DepDt;
    @Column(name = "P576_FOLIO_NO")
    private String p576FolioNo;
    @Column(name = "P577_PROPERTY_PH")
    private String p577PropertyPh;
    @Column(name = "P578S1_BL_ADJ_IND")
    private Character p578s1BlAdjInd;

    @Column(name = "P578S2_BL_ADJ_AMT")
    private BigDecimal p578s2BlAdjAmt;
    @Column(name = "P580_ROOM_RT")
    private BigDecimal p580RoomRt;
    @Column(name = "P581_ROOM_TAX")
    private BigDecimal p581RoomTax;
    @Column(name = "P582_PGM_CD")
    private String p582PgmCd;
    @Column(name = "P583_PH_CHRG")
    private BigDecimal p583PhChrg;
    @Column(name = "P584_RESTRM_CHRG")
    private BigDecimal p584RestrmChrg;
    @Column(name = "P585_BAR_CHRG")
    private BigDecimal p585BarChrg;
    @Column(name = "P586_GIFTSHP_CHRG")
    private BigDecimal p586GiftshpChrg;
    @Column(name = "P587_LAUND_CHRG")
    private BigDecimal p587LaundChrg;
    @Column(name = "P588S1_O_SRV_CD")
    private String p588s1OSrvCd;
    @Column(name = "P588S2_O_SRV_CHRG")
    private BigDecimal p588s2OSrvChrg;
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
    @Column(name = "P690_NO_SHOW_IND")
    private Character p690NoShowInd;
    @Column(name = "P693_TOTAUTH_AMT")
    private BigDecimal p693TotauthAmt;
    @Column(name = "P699_TOT_TAX_AMT")
    private BigDecimal p699TotTaxAmt;
    @Column(name = "P701_EXT_CHRG")
    private BigDecimal p701ExtChrg;
    @Column(name = "P702_OTHER_CHRG")
    private BigDecimal p702OtherChrg;
    @Column(name = "P703_TOTRMNIGHTS")
    private Short p703Totrmnights;
    @Column(name = "P704_PPD_EXPNS")
    private BigDecimal p704PpdExpns;
    @Column(name = "P705_TOTNRAXAMT")
    private BigDecimal p705Totnraxamt;
    @Column(name = "P706_CASH_ADV")
    private BigDecimal p706CashAdv;
    @Column(name = "P707_VALET_CHRG")
    private BigDecimal p707ValetChrg;
    @Column(name = "P708_MOVE_CHRG")
    private BigDecimal p708MoveChrg;
    @Column(name = "P709_BUS_CNT_CHRG")
    private BigDecimal p709BusCntChrg;
    @Column(name = "P710_HEALTH_CHRG")
    private BigDecimal p710HealthChrg;
    @Column(name = "P711_FIRESAF_ACT_I")
    private Character p711FiresafActI;
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
    @Column(name = "P521_CARRIER_CODE")
    private String p521CarrierCode;
    @Basic(optional = false)
    @Column(name = "P530_FLIGHT_NBR")
    private String p530FlightNbr;
    @Basic(optional = false)
    @Column(name = "P532S1_TOT_CHGS_AM")
    private BigDecimal p532s1TotChgsAm;
    @Basic(optional = false)
    @Column(name = "P532S2_TOT_CHGS_EX")
    private short p532s2TotChgsEx;
    @Basic(optional = false)
    @Column(name = "P532S3_TOT_CHGS_SI")
    private Character p532s3TotChgsSi;
    @Basic(optional = false)
    @Column(name = "P534S1_TOT_NRCHG_A")
    private BigDecimal p534s1TotNrchgA;
    @Basic(optional = false)
    @Column(name = "P534S2_TOT_NRCHG_E")
    private short p534s2TotNrchgE;
    @Basic(optional = false)
    @Column(name = "P534S3_TOT_NRCHG_S")
    private Character p534s3TotNrchgS;
    @Basic(optional = false)
    @Column(name = "P539S1_TOT_CHRG_CA")
    private BigDecimal p539s1TotChrgCa;
    @Basic(optional = false)
    @Column(name = "P539S2_TOT_CHRG_CE")
    private short p539s2TotChrgCe;
    @Basic(optional = false)
    @Column(name = "P539S3_TOT_CHRG_CS")
    private Character p539s3TotChrgCs;
    @Basic(optional = false)
    @Column(name = "P540S1_RMSRV_CHG_A")
    private BigDecimal p540s1RmsrvChgA;
    @Basic(optional = false)
    @Column(name = "P540S2_RMSRV_CHG_E")
    private short p540s2RmsrvChgE;
    @Basic(optional = false)
    @Column(name = "P540S3_RMSRV_CHG_S")
    private Character p540s3RmsrvChgS;
    @Basic(optional = false)
    @Column(name = "P541S1_BAR_CHRG_A")
    private BigDecimal p541s1BarChrgA;
    @Basic(optional = false)
    @Column(name = "P541S2_BAR_CHRG_E")
    private short p541s2BarChrgE;
    @Basic(optional = false)
    @Column(name = "P541S3_BAR_CHRG_S")
    private Character p541s3BarChrgS;
    @Basic(optional = false)
    @Column(name = "P542S1_TRNSP_CHG_A")
    private BigDecimal p542s1TrnspChgA;
    @Basic(optional = false)
    @Column(name = "P542S2_TRNSP_CHG_E")
    private short p542s2TrnspChgE;
    @Basic(optional = false)
    @Column(name = "P542S3_TRNSP_CHG_S")
    private Character p542s3TrnspChgS;
    @Basic(optional = false)
    @Column(name = "P543S1_GRTY_CHRG_A")
    private BigDecimal p543s1GrtyChrgA;
    @Basic(optional = false)
    @Column(name = "P543S2_GRTY_CHRG_E")
    private short p543s2GrtyChrgE;
    @Basic(optional = false)
    @Column(name = "P543S3_GRTY_CHRG_S")
    private Character p543s3GrtyChrgS;
    @Basic(optional = false)
    @Column(name = "P554S1_CFRM_CHRG_A")
    private BigDecimal p554s1CfrmChrgA;
    @Basic(optional = false)
    @Column(name = "P554S2_CFRM_CHRG_E")
    private short p554s2CfrmChrgE;
    @Basic(optional = false)
    @Column(name = "P554S3_CFRM_CHRG_S")
    private Character p554s3CfrmChrgS;
    @Basic(optional = false)
    @Column(name = "P560S1_AUVIS_CHG_A")
    private BigDecimal p560s1AuvisChgA;
    @Basic(optional = false)
    @Column(name = "P560S2_AUVIS_CHG_E")
    private short p560s2AuvisChgE;
    @Basic(optional = false)
    @Column(name = "P560S3_AUVIS_CHG_S")
    private Character p560s3AuvisChgS;
    @Basic(optional = false)
    @Column(name = "P562S1_BQUT_CHG_A")
    private BigDecimal p562s1BqutChgA;
    @Basic(optional = false)
    @Column(name = "P562S2_BQUT_CHG_E")
    private short p562s2BqutChgE;
    @Basic(optional = false)
    @Column(name = "P562S3_BQUT_CHG_S")
    private Character p562s3BqutChgS;
    @Basic(optional = false)
    @Column(name = "P569S1_INTNT_CHG_A")
    private BigDecimal p569s1IntntChgA;
    @Basic(optional = false)
    @Column(name = "P569S2_INTNT_CHG_E")
    private short p569s2IntntChgE;
    @Basic(optional = false)
    @Column(name = "P569S3_INTNT_CHG_S")
    private Character p569s3IntntChgS;
    @Basic(optional = false)
    @Column(name = "P570S1_ELY_DEPR_CA")
    private BigDecimal p570s1ElyDeprCa;
    @Basic(optional = false)
    @Column(name = "P570S2_ELY_DEPR_CE")
    private short p570s2ElyDeprCe;
    @Basic(optional = false)
    @Column(name = "P570S3_ELY_DEPR_CS")
    private Character p570s3ElyDeprCs;
    @Basic(optional = false)
    @Column(name = "P571_GUEST_NM")
    private String p571GuestNm;
    @Basic(optional = false)
    @Column(name = "P572_GUEST_NBR")
    private String p572GuestNbr;
    @Basic(optional = false)
    @Column(name = "P578S3_BL_ADJ_EXP")
    private short p578s3BlAdjExp;
    @Basic(optional = false)
    @Column(name = "P578S4_BL_ADJ_SIGN")
    private Character p578s4BlAdjSign;
    @Basic(optional = false)
    @Column(name = "P580S1_RM_RT_AMT")
    private BigDecimal p580s1RmRtAmt;
    @Basic(optional = false)
    @Column(name = "P580S2_RM_RT_EXP")
    private short p580s2RmRtExp;
    @Basic(optional = false)
    @Column(name = "P581S1_TOT_RM_TAXA")
    private BigDecimal p581s1TotRmTaxa;
    @Basic(optional = false)
    @Column(name = "P581S2_TOT_RM_TAXE")
    private short p581s2TotRmTaxe;
    @Basic(optional = false)
    @Column(name = "P581S3_TOT_RM_TAXS")
    private Character p581s3TotRmTaxs;
    @Basic(optional = false)
    @Column(name = "P583S1_PH_CHRG_AMT")
    private BigDecimal p583s1PhChrgAmt;
    @Basic(optional = false)
    @Column(name = "P583S2_PH_CHRG_EXP")
    private short p583s2PhChrgExp;
    @Basic(optional = false)
    @Column(name = "P583S3_PH_CHRG_SIG")
    private Character p583s3PhChrgSig;
    @Basic(optional = false)
    @Column(name = "P584S1_RST_CHRG_AM")
    private BigDecimal p584s1RstChrgAm;
    @Basic(optional = false)
    @Column(name = "P584S2_RST_CHRG_EX")
    private short p584s2RstChrgEx;
    @Basic(optional = false)
    @Column(name = "P584S3_RST_CHRG_SI")
    private Character p584s3RstChrgSi;
    @Basic(optional = false)
    @Column(name = "P585S1_MINIBAR_CHA")
    private BigDecimal p585s1MinibarCha;
    @Basic(optional = false)
    @Column(name = "P585S2_MINIBAR_CHE")
    private short p585s2MinibarChe;
    @Basic(optional = false)
    @Column(name = "P585S3_MINIBAR_CHS")
    private Character p585s3MinibarChs;
    @Basic(optional = false)
    @Column(name = "P586S1_GIFTSHOP_CA")
    private BigDecimal p586s1GiftshopCa;
    @Basic(optional = false)
    @Column(name = "P586S2_GIFTSHOP_CE")
    private short p586s2GiftshopCe;
    @Basic(optional = false)
    @Column(name = "P586S3_GIFTSHOP_CS")
    private Character p586s3GiftshopCs;
    @Basic(optional = false)
    @Column(name = "P587S1_LNDY_CHRG_A")
    private BigDecimal p587s1LndyChrgA;
    @Basic(optional = false)
    @Column(name = "P587S2_LNDY_CHRG_E")
    private short p587s2LndyChrgE;
    @Basic(optional = false)
    @Column(name = "P587S3_LNDY_CHRG_S")
    private Character p587s3LndyChrgS;
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
    @Column(name = "P699S1_LDG_TOT_TXA")
    private BigDecimal p699s1LdgTotTxa;
    @Basic(optional = false)
    @Column(name = "P699S2_LDG_TOT_TXE")
    private short p699s2LdgTotTxe;
    @Basic(optional = false)
    @Column(name = "P699S3_LDG_TOT_TXS")
    private Character p699s3LdgTotTxs;
    @Basic(optional = false)
    @Column(name = "P704S1_PPD_EXPS_AM")
    private BigDecimal p704s1PpdExpsAm;
    @Basic(optional = false)
    @Column(name = "P704S2_PPD_EXPS_EX")
    private short p704s2PpdExpsEx;
    @Basic(optional = false)
    @Column(name = "P704S3_PPD_EXPS_SI")
    private Character p704s3PpdExpsSi;
    @Basic(optional = false)
    @Column(name = "P705S1_TOT_NRTAX_A")
    private BigDecimal p705s1TotNrtaxA;
    @Basic(optional = false)
    @Column(name = "P705S2_TOT_NRTAX_E")
    private short p705s2TotNrtaxE;
    @Basic(optional = false)
    @Column(name = "P705S3_TOT_NRTAX_S")
    private Character p705s3TotNrtaxS;
    @Basic(optional = false)
    @Column(name = "P706S1_CASH_ADV_AM")
    private BigDecimal p706s1CashAdvAm;
    @Basic(optional = false)
    @Column(name = "P706S2_CASH_ADV_EX")
    private short p706s2CashAdvEx;
    @Basic(optional = false)
    @Column(name = "P706S3_CASH_ADV_SI")
    private Character p706s3CashAdvSi;
    @Basic(optional = false)
    @Column(name = "P707S1_VLET_CHRG_A")
    private BigDecimal p707s1VletChrgA;
    @Basic(optional = false)
    @Column(name = "P707S2_VLET_CHRG_E")
    private short p707s2VletChrgE;
    @Basic(optional = false)
    @Column(name = "P707S3_VLET_CHRG_S")
    private Character p707s3VletChrgS;
    @Basic(optional = false)
    @Column(name = "P708S1_MVIE_CHRG_A")
    private BigDecimal p708s1MvieChrgA;
    @Basic(optional = false)
    @Column(name = "P708S2_MVIE_CHRG_E")
    private short p708s2MvieChrgE;
    @Basic(optional = false)
    @Column(name = "P708S3_MVIE_CHRG_S")
    private Character p708s3MvieChrgS;
    @Basic(optional = false)
    @Column(name = "P709S1_BUSCNT_CHGA")
    private BigDecimal p709s1BuscntChga;
    @Basic(optional = false)
    @Column(name = "P709S2_BUSCNT_CHGE")
    private short p709s2BuscntChge;
    @Basic(optional = false)
    @Column(name = "P709S3_BUSCNT_CHGS")
    private Character p709s3BuscntChgs;
    @Basic(optional = false)
    @Column(name = "P710S1_HLTH_CHRG_A")
    private BigDecimal p710s1HlthChrgA;
    @Basic(optional = false)
    @Column(name = "P710S2_HLTH_CHRG_E")
    private short p710s2HlthChrgE;
    @Basic(optional = false)
    @Column(name = "P710S3_HLTH_CHRG_S")
    private Character p710s3HlthChrgS;
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
    @Column(name = "A693S1_TOTAUTH")
    private BigDecimal a693s1Totauth;

    public McAddLodgDtl() {
    }

    public McAddLodgDtl(McAddLodgDtlPK mcAddLodgDtlPK) {
        this.mcAddLodgDtlPK = mcAddLodgDtlPK;
    }

    public McAddLodgDtl(McAddLodgDtlPK mcAddLodgDtlPK, String p521CarrierCode, String p530FlightNbr, BigDecimal p532s1TotChgsAm, short p532s2TotChgsEx, Character p532s3TotChgsSi, BigDecimal p534s1TotNrchgA, short p534s2TotNrchgE, Character p534s3TotNrchgS, BigDecimal p539s1TotChrgCa, short p539s2TotChrgCe, Character p539s3TotChrgCs, BigDecimal p540s1RmsrvChgA, short p540s2RmsrvChgE, Character p540s3RmsrvChgS, BigDecimal p541s1BarChrgA, short p541s2BarChrgE, Character p541s3BarChrgS, BigDecimal p542s1TrnspChgA, short p542s2TrnspChgE, Character p542s3TrnspChgS, BigDecimal p543s1GrtyChrgA, short p543s2GrtyChrgE, Character p543s3GrtyChrgS, BigDecimal p554s1CfrmChrgA, short p554s2CfrmChrgE, Character p554s3CfrmChrgS, BigDecimal p560s1AuvisChgA, short p560s2AuvisChgE, Character p560s3AuvisChgS, BigDecimal p562s1BqutChgA, short p562s2BqutChgE, Character p562s3BqutChgS, BigDecimal p569s1IntntChgA, short p569s2IntntChgE, Character p569s3IntntChgS, BigDecimal p570s1ElyDeprCa, short p570s2ElyDeprCe, Character p570s3ElyDeprCs, String p571GuestNm, String p572GuestNbr, short p578s3BlAdjExp, Character p578s4BlAdjSign, BigDecimal p580s1RmRtAmt, short p580s2RmRtExp, BigDecimal p581s1TotRmTaxa, short p581s2TotRmTaxe, Character p581s3TotRmTaxs, BigDecimal p583s1PhChrgAmt, short p583s2PhChrgExp, Character p583s3PhChrgSig, BigDecimal p584s1RstChrgAm, short p584s2RstChrgEx, Character p584s3RstChrgSi, BigDecimal p585s1MinibarCha, short p585s2MinibarChe, Character p585s3MinibarChs, BigDecimal p586s1GiftshopCa, short p586s2GiftshopCe, Character p586s3GiftshopCs, BigDecimal p587s1LndyChrgA, short p587s2LndyChrgE, Character p587s3LndyChrgS, BigDecimal p597s1TtxAmt, short p597s2TtxAmtExp, Character p597s3TtxAmtSig, Character p598TaxCltnInd, BigDecimal p693s1TotauthAmt, short p693s2TotauthExp, Character p693s3TotauthSig, BigDecimal p699s1LdgTotTxa, short p699s2LdgTotTxe, Character p699s3LdgTotTxs, BigDecimal p704s1PpdExpsAm, short p704s2PpdExpsEx, Character p704s3PpdExpsSi, BigDecimal p705s1TotNrtaxA, short p705s2TotNrtaxE, Character p705s3TotNrtaxS, BigDecimal p706s1CashAdvAm, short p706s2CashAdvEx, Character p706s3CashAdvSi, BigDecimal p707s1VletChrgA, short p707s2VletChrgE, Character p707s3VletChrgS, BigDecimal p708s1MvieChrgA, short p708s2MvieChrgE, Character p708s3MvieChrgS, BigDecimal p709s1BuscntChga, short p709s2BuscntChge, Character p709s3BuscntChgs, BigDecimal p710s1HlthChrgA, short p710s2HlthChrgE, Character p710s3HlthChrgS, String taxAmtTs, Character taxAmt682Ind, Character taxAmt683Ind, Character taxAmt684Ind, Character taxAmt751Ind, Character taxAmt752Ind, Character taxAmt753Ind, BigDecimal a597s1TtxAmt, BigDecimal a693s1Totauth) {
        this.mcAddLodgDtlPK = mcAddLodgDtlPK;
        this.p521CarrierCode = p521CarrierCode;
        this.p530FlightNbr = p530FlightNbr;
        this.p532s1TotChgsAm = p532s1TotChgsAm;
        this.p532s2TotChgsEx = p532s2TotChgsEx;
        this.p532s3TotChgsSi = p532s3TotChgsSi;
        this.p534s1TotNrchgA = p534s1TotNrchgA;
        this.p534s2TotNrchgE = p534s2TotNrchgE;
        this.p534s3TotNrchgS = p534s3TotNrchgS;
        this.p539s1TotChrgCa = p539s1TotChrgCa;
        this.p539s2TotChrgCe = p539s2TotChrgCe;
        this.p539s3TotChrgCs = p539s3TotChrgCs;
        this.p540s1RmsrvChgA = p540s1RmsrvChgA;
        this.p540s2RmsrvChgE = p540s2RmsrvChgE;
        this.p540s3RmsrvChgS = p540s3RmsrvChgS;
        this.p541s1BarChrgA = p541s1BarChrgA;
        this.p541s2BarChrgE = p541s2BarChrgE;
        this.p541s3BarChrgS = p541s3BarChrgS;
        this.p542s1TrnspChgA = p542s1TrnspChgA;
        this.p542s2TrnspChgE = p542s2TrnspChgE;
        this.p542s3TrnspChgS = p542s3TrnspChgS;
        this.p543s1GrtyChrgA = p543s1GrtyChrgA;
        this.p543s2GrtyChrgE = p543s2GrtyChrgE;
        this.p543s3GrtyChrgS = p543s3GrtyChrgS;
        this.p554s1CfrmChrgA = p554s1CfrmChrgA;
        this.p554s2CfrmChrgE = p554s2CfrmChrgE;
        this.p554s3CfrmChrgS = p554s3CfrmChrgS;
        this.p560s1AuvisChgA = p560s1AuvisChgA;
        this.p560s2AuvisChgE = p560s2AuvisChgE;
        this.p560s3AuvisChgS = p560s3AuvisChgS;
        this.p562s1BqutChgA = p562s1BqutChgA;
        this.p562s2BqutChgE = p562s2BqutChgE;
        this.p562s3BqutChgS = p562s3BqutChgS;
        this.p569s1IntntChgA = p569s1IntntChgA;
        this.p569s2IntntChgE = p569s2IntntChgE;
        this.p569s3IntntChgS = p569s3IntntChgS;
        this.p570s1ElyDeprCa = p570s1ElyDeprCa;
        this.p570s2ElyDeprCe = p570s2ElyDeprCe;
        this.p570s3ElyDeprCs = p570s3ElyDeprCs;
        this.p571GuestNm = p571GuestNm;
        this.p572GuestNbr = p572GuestNbr;
        this.p578s3BlAdjExp = p578s3BlAdjExp;
        this.p578s4BlAdjSign = p578s4BlAdjSign;
        this.p580s1RmRtAmt = p580s1RmRtAmt;
        this.p580s2RmRtExp = p580s2RmRtExp;
        this.p581s1TotRmTaxa = p581s1TotRmTaxa;
        this.p581s2TotRmTaxe = p581s2TotRmTaxe;
        this.p581s3TotRmTaxs = p581s3TotRmTaxs;
        this.p583s1PhChrgAmt = p583s1PhChrgAmt;
        this.p583s2PhChrgExp = p583s2PhChrgExp;
        this.p583s3PhChrgSig = p583s3PhChrgSig;
        this.p584s1RstChrgAm = p584s1RstChrgAm;
        this.p584s2RstChrgEx = p584s2RstChrgEx;
        this.p584s3RstChrgSi = p584s3RstChrgSi;
        this.p585s1MinibarCha = p585s1MinibarCha;
        this.p585s2MinibarChe = p585s2MinibarChe;
        this.p585s3MinibarChs = p585s3MinibarChs;
        this.p586s1GiftshopCa = p586s1GiftshopCa;
        this.p586s2GiftshopCe = p586s2GiftshopCe;
        this.p586s3GiftshopCs = p586s3GiftshopCs;
        this.p587s1LndyChrgA = p587s1LndyChrgA;
        this.p587s2LndyChrgE = p587s2LndyChrgE;
        this.p587s3LndyChrgS = p587s3LndyChrgS;
        this.p597s1TtxAmt = p597s1TtxAmt;
        this.p597s2TtxAmtExp = p597s2TtxAmtExp;
        this.p597s3TtxAmtSig = p597s3TtxAmtSig;
        this.p598TaxCltnInd = p598TaxCltnInd;
        this.p693s1TotauthAmt = p693s1TotauthAmt;
        this.p693s2TotauthExp = p693s2TotauthExp;
        this.p693s3TotauthSig = p693s3TotauthSig;
        this.p699s1LdgTotTxa = p699s1LdgTotTxa;
        this.p699s2LdgTotTxe = p699s2LdgTotTxe;
        this.p699s3LdgTotTxs = p699s3LdgTotTxs;
        this.p704s1PpdExpsAm = p704s1PpdExpsAm;
        this.p704s2PpdExpsEx = p704s2PpdExpsEx;
        this.p704s3PpdExpsSi = p704s3PpdExpsSi;
        this.p705s1TotNrtaxA = p705s1TotNrtaxA;
        this.p705s2TotNrtaxE = p705s2TotNrtaxE;
        this.p705s3TotNrtaxS = p705s3TotNrtaxS;
        this.p706s1CashAdvAm = p706s1CashAdvAm;
        this.p706s2CashAdvEx = p706s2CashAdvEx;
        this.p706s3CashAdvSi = p706s3CashAdvSi;
        this.p707s1VletChrgA = p707s1VletChrgA;
        this.p707s2VletChrgE = p707s2VletChrgE;
        this.p707s3VletChrgS = p707s3VletChrgS;
        this.p708s1MvieChrgA = p708s1MvieChrgA;
        this.p708s2MvieChrgE = p708s2MvieChrgE;
        this.p708s3MvieChrgS = p708s3MvieChrgS;
        this.p709s1BuscntChga = p709s1BuscntChga;
        this.p709s2BuscntChge = p709s2BuscntChge;
        this.p709s3BuscntChgs = p709s3BuscntChgs;
        this.p710s1HlthChrgA = p710s1HlthChrgA;
        this.p710s2HlthChrgE = p710s2HlthChrgE;
        this.p710s3HlthChrgS = p710s3HlthChrgS;
        this.taxAmtTs = taxAmtTs;
        this.taxAmt682Ind = taxAmt682Ind;
        this.taxAmt683Ind = taxAmt683Ind;
        this.taxAmt684Ind = taxAmt684Ind;
        this.taxAmt751Ind = taxAmt751Ind;
        this.taxAmt752Ind = taxAmt752Ind;
        this.taxAmt753Ind = taxAmt753Ind;
        this.a597s1TtxAmt = a597s1TtxAmt;
        this.a693s1Totauth = a693s1Totauth;
    }

    public McAddLodgDtl(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.mcAddLodgDtlPK = new McAddLodgDtlPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s3OccInd, p501s4MsgNo, d71MsgNo);
    }

    public McAddLodgDtlPK getMcAddLodgDtlPK() {
        return mcAddLodgDtlPK;
    }

    public void setMcAddLodgDtlPK(McAddLodgDtlPK mcAddLodgDtlPK) {
        this.mcAddLodgDtlPK = mcAddLodgDtlPK;
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

    public String getP552CustsrvcTf() {
        return p552CustsrvcTf;
    }

    public void setP552CustsrvcTf(String p552CustsrvcTf) {
        this.p552CustsrvcTf = p552CustsrvcTf;
    }

    public Integer getP574ArrDt() {
        return p574ArrDt;
    }

    public void setP574ArrDt(Integer p574ArrDt) {
        this.p574ArrDt = p574ArrDt;
    }

    public Integer getP575DepDt() {
        return p575DepDt;
    }

    public void setP575DepDt(Integer p575DepDt) {
        this.p575DepDt = p575DepDt;
    }

    public String getP576FolioNo() {
        return p576FolioNo;
    }

    public void setP576FolioNo(String p576FolioNo) {
        this.p576FolioNo = p576FolioNo;
    }

    public String getP577PropertyPh() {
        return p577PropertyPh;
    }

    public void setP577PropertyPh(String p577PropertyPh) {
        this.p577PropertyPh = p577PropertyPh;
    }

    public Character getP578s1BlAdjInd() {
        return p578s1BlAdjInd;
    }

    public void setP578s1BlAdjInd(Character p578s1BlAdjInd) {
        this.p578s1BlAdjInd = p578s1BlAdjInd;
    }

    public BigDecimal getP578s2BlAdjAmt() {
        return p578s2BlAdjAmt;
    }

    public void setP578s2BlAdjAmt(BigDecimal p578s2BlAdjAmt) {
        this.p578s2BlAdjAmt = p578s2BlAdjAmt;
    }

    public BigDecimal getP580RoomRt() {
        return p580RoomRt;
    }

    public void setP580RoomRt(BigDecimal p580RoomRt) {
        this.p580RoomRt = p580RoomRt;
    }

    public BigDecimal getP581RoomTax() {
        return p581RoomTax;
    }

    public void setP581RoomTax(BigDecimal p581RoomTax) {
        this.p581RoomTax = p581RoomTax;
    }

    public String getP582PgmCd() {
        return p582PgmCd;
    }

    public void setP582PgmCd(String p582PgmCd) {
        this.p582PgmCd = p582PgmCd;
    }

    public BigDecimal getP583PhChrg() {
        return p583PhChrg;
    }

    public void setP583PhChrg(BigDecimal p583PhChrg) {
        this.p583PhChrg = p583PhChrg;
    }

    public BigDecimal getP584RestrmChrg() {
        return p584RestrmChrg;
    }

    public void setP584RestrmChrg(BigDecimal p584RestrmChrg) {
        this.p584RestrmChrg = p584RestrmChrg;
    }

    public BigDecimal getP585BarChrg() {
        return p585BarChrg;
    }

    public void setP585BarChrg(BigDecimal p585BarChrg) {
        this.p585BarChrg = p585BarChrg;
    }

    public BigDecimal getP586GiftshpChrg() {
        return p586GiftshpChrg;
    }

    public void setP586GiftshpChrg(BigDecimal p586GiftshpChrg) {
        this.p586GiftshpChrg = p586GiftshpChrg;
    }

    public BigDecimal getP587LaundChrg() {
        return p587LaundChrg;
    }

    public void setP587LaundChrg(BigDecimal p587LaundChrg) {
        this.p587LaundChrg = p587LaundChrg;
    }

    public String getP588s1OSrvCd() {
        return p588s1OSrvCd;
    }

    public void setP588s1OSrvCd(String p588s1OSrvCd) {
        this.p588s1OSrvCd = p588s1OSrvCd;
    }

    public BigDecimal getP588s2OSrvChrg() {
        return p588s2OSrvChrg;
    }

    public void setP588s2OSrvChrg(BigDecimal p588s2OSrvChrg) {
        this.p588s2OSrvChrg = p588s2OSrvChrg;
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

    public Character getP690NoShowInd() {
        return p690NoShowInd;
    }

    public void setP690NoShowInd(Character p690NoShowInd) {
        this.p690NoShowInd = p690NoShowInd;
    }

    public BigDecimal getP693TotauthAmt() {
        return p693TotauthAmt;
    }

    public void setP693TotauthAmt(BigDecimal p693TotauthAmt) {
        this.p693TotauthAmt = p693TotauthAmt;
    }

    public BigDecimal getP699TotTaxAmt() {
        return p699TotTaxAmt;
    }

    public void setP699TotTaxAmt(BigDecimal p699TotTaxAmt) {
        this.p699TotTaxAmt = p699TotTaxAmt;
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

    public Short getP703Totrmnights() {
        return p703Totrmnights;
    }

    public void setP703Totrmnights(Short p703Totrmnights) {
        this.p703Totrmnights = p703Totrmnights;
    }

    public BigDecimal getP704PpdExpns() {
        return p704PpdExpns;
    }

    public void setP704PpdExpns(BigDecimal p704PpdExpns) {
        this.p704PpdExpns = p704PpdExpns;
    }

    public BigDecimal getP705Totnraxamt() {
        return p705Totnraxamt;
    }

    public void setP705Totnraxamt(BigDecimal p705Totnraxamt) {
        this.p705Totnraxamt = p705Totnraxamt;
    }

    public BigDecimal getP706CashAdv() {
        return p706CashAdv;
    }

    public void setP706CashAdv(BigDecimal p706CashAdv) {
        this.p706CashAdv = p706CashAdv;
    }

    public BigDecimal getP707ValetChrg() {
        return p707ValetChrg;
    }

    public void setP707ValetChrg(BigDecimal p707ValetChrg) {
        this.p707ValetChrg = p707ValetChrg;
    }

    public BigDecimal getP708MoveChrg() {
        return p708MoveChrg;
    }

    public void setP708MoveChrg(BigDecimal p708MoveChrg) {
        this.p708MoveChrg = p708MoveChrg;
    }

    public BigDecimal getP709BusCntChrg() {
        return p709BusCntChrg;
    }

    public void setP709BusCntChrg(BigDecimal p709BusCntChrg) {
        this.p709BusCntChrg = p709BusCntChrg;
    }

    public BigDecimal getP710HealthChrg() {
        return p710HealthChrg;
    }

    public void setP710HealthChrg(BigDecimal p710HealthChrg) {
        this.p710HealthChrg = p710HealthChrg;
    }

    public Character getP711FiresafActI() {
        return p711FiresafActI;
    }

    public void setP711FiresafActI(Character p711FiresafActI) {
        this.p711FiresafActI = p711FiresafActI;
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

    public String getP521CarrierCode() {
        return p521CarrierCode;
    }

    public void setP521CarrierCode(String p521CarrierCode) {
        this.p521CarrierCode = p521CarrierCode;
    }

    public String getP530FlightNbr() {
        return p530FlightNbr;
    }

    public void setP530FlightNbr(String p530FlightNbr) {
        this.p530FlightNbr = p530FlightNbr;
    }

    public BigDecimal getP532s1TotChgsAm() {
        return p532s1TotChgsAm;
    }

    public void setP532s1TotChgsAm(BigDecimal p532s1TotChgsAm) {
        this.p532s1TotChgsAm = p532s1TotChgsAm;
    }

    public short getP532s2TotChgsEx() {
        return p532s2TotChgsEx;
    }

    public void setP532s2TotChgsEx(short p532s2TotChgsEx) {
        this.p532s2TotChgsEx = p532s2TotChgsEx;
    }

    public Character getP532s3TotChgsSi() {
        return p532s3TotChgsSi;
    }

    public void setP532s3TotChgsSi(Character p532s3TotChgsSi) {
        this.p532s3TotChgsSi = p532s3TotChgsSi;
    }

    public BigDecimal getP534s1TotNrchgA() {
        return p534s1TotNrchgA;
    }

    public void setP534s1TotNrchgA(BigDecimal p534s1TotNrchgA) {
        this.p534s1TotNrchgA = p534s1TotNrchgA;
    }

    public short getP534s2TotNrchgE() {
        return p534s2TotNrchgE;
    }

    public void setP534s2TotNrchgE(short p534s2TotNrchgE) {
        this.p534s2TotNrchgE = p534s2TotNrchgE;
    }

    public Character getP534s3TotNrchgS() {
        return p534s3TotNrchgS;
    }

    public void setP534s3TotNrchgS(Character p534s3TotNrchgS) {
        this.p534s3TotNrchgS = p534s3TotNrchgS;
    }

    public BigDecimal getP539s1TotChrgCa() {
        return p539s1TotChrgCa;
    }

    public void setP539s1TotChrgCa(BigDecimal p539s1TotChrgCa) {
        this.p539s1TotChrgCa = p539s1TotChrgCa;
    }

    public short getP539s2TotChrgCe() {
        return p539s2TotChrgCe;
    }

    public void setP539s2TotChrgCe(short p539s2TotChrgCe) {
        this.p539s2TotChrgCe = p539s2TotChrgCe;
    }

    public Character getP539s3TotChrgCs() {
        return p539s3TotChrgCs;
    }

    public void setP539s3TotChrgCs(Character p539s3TotChrgCs) {
        this.p539s3TotChrgCs = p539s3TotChrgCs;
    }

    public BigDecimal getP540s1RmsrvChgA() {
        return p540s1RmsrvChgA;
    }

    public void setP540s1RmsrvChgA(BigDecimal p540s1RmsrvChgA) {
        this.p540s1RmsrvChgA = p540s1RmsrvChgA;
    }

    public short getP540s2RmsrvChgE() {
        return p540s2RmsrvChgE;
    }

    public void setP540s2RmsrvChgE(short p540s2RmsrvChgE) {
        this.p540s2RmsrvChgE = p540s2RmsrvChgE;
    }

    public Character getP540s3RmsrvChgS() {
        return p540s3RmsrvChgS;
    }

    public void setP540s3RmsrvChgS(Character p540s3RmsrvChgS) {
        this.p540s3RmsrvChgS = p540s3RmsrvChgS;
    }

    public BigDecimal getP541s1BarChrgA() {
        return p541s1BarChrgA;
    }

    public void setP541s1BarChrgA(BigDecimal p541s1BarChrgA) {
        this.p541s1BarChrgA = p541s1BarChrgA;
    }

    public short getP541s2BarChrgE() {
        return p541s2BarChrgE;
    }

    public void setP541s2BarChrgE(short p541s2BarChrgE) {
        this.p541s2BarChrgE = p541s2BarChrgE;
    }

    public Character getP541s3BarChrgS() {
        return p541s3BarChrgS;
    }

    public void setP541s3BarChrgS(Character p541s3BarChrgS) {
        this.p541s3BarChrgS = p541s3BarChrgS;
    }

    public BigDecimal getP542s1TrnspChgA() {
        return p542s1TrnspChgA;
    }

    public void setP542s1TrnspChgA(BigDecimal p542s1TrnspChgA) {
        this.p542s1TrnspChgA = p542s1TrnspChgA;
    }

    public short getP542s2TrnspChgE() {
        return p542s2TrnspChgE;
    }

    public void setP542s2TrnspChgE(short p542s2TrnspChgE) {
        this.p542s2TrnspChgE = p542s2TrnspChgE;
    }

    public Character getP542s3TrnspChgS() {
        return p542s3TrnspChgS;
    }

    public void setP542s3TrnspChgS(Character p542s3TrnspChgS) {
        this.p542s3TrnspChgS = p542s3TrnspChgS;
    }

    public BigDecimal getP543s1GrtyChrgA() {
        return p543s1GrtyChrgA;
    }

    public void setP543s1GrtyChrgA(BigDecimal p543s1GrtyChrgA) {
        this.p543s1GrtyChrgA = p543s1GrtyChrgA;
    }

    public short getP543s2GrtyChrgE() {
        return p543s2GrtyChrgE;
    }

    public void setP543s2GrtyChrgE(short p543s2GrtyChrgE) {
        this.p543s2GrtyChrgE = p543s2GrtyChrgE;
    }

    public Character getP543s3GrtyChrgS() {
        return p543s3GrtyChrgS;
    }

    public void setP543s3GrtyChrgS(Character p543s3GrtyChrgS) {
        this.p543s3GrtyChrgS = p543s3GrtyChrgS;
    }

    public BigDecimal getP554s1CfrmChrgA() {
        return p554s1CfrmChrgA;
    }

    public void setP554s1CfrmChrgA(BigDecimal p554s1CfrmChrgA) {
        this.p554s1CfrmChrgA = p554s1CfrmChrgA;
    }

    public short getP554s2CfrmChrgE() {
        return p554s2CfrmChrgE;
    }

    public void setP554s2CfrmChrgE(short p554s2CfrmChrgE) {
        this.p554s2CfrmChrgE = p554s2CfrmChrgE;
    }

    public Character getP554s3CfrmChrgS() {
        return p554s3CfrmChrgS;
    }

    public void setP554s3CfrmChrgS(Character p554s3CfrmChrgS) {
        this.p554s3CfrmChrgS = p554s3CfrmChrgS;
    }

    public BigDecimal getP560s1AuvisChgA() {
        return p560s1AuvisChgA;
    }

    public void setP560s1AuvisChgA(BigDecimal p560s1AuvisChgA) {
        this.p560s1AuvisChgA = p560s1AuvisChgA;
    }

    public short getP560s2AuvisChgE() {
        return p560s2AuvisChgE;
    }

    public void setP560s2AuvisChgE(short p560s2AuvisChgE) {
        this.p560s2AuvisChgE = p560s2AuvisChgE;
    }

    public Character getP560s3AuvisChgS() {
        return p560s3AuvisChgS;
    }

    public void setP560s3AuvisChgS(Character p560s3AuvisChgS) {
        this.p560s3AuvisChgS = p560s3AuvisChgS;
    }

    public BigDecimal getP562s1BqutChgA() {
        return p562s1BqutChgA;
    }

    public void setP562s1BqutChgA(BigDecimal p562s1BqutChgA) {
        this.p562s1BqutChgA = p562s1BqutChgA;
    }

    public short getP562s2BqutChgE() {
        return p562s2BqutChgE;
    }

    public void setP562s2BqutChgE(short p562s2BqutChgE) {
        this.p562s2BqutChgE = p562s2BqutChgE;
    }

    public Character getP562s3BqutChgS() {
        return p562s3BqutChgS;
    }

    public void setP562s3BqutChgS(Character p562s3BqutChgS) {
        this.p562s3BqutChgS = p562s3BqutChgS;
    }

    public BigDecimal getP569s1IntntChgA() {
        return p569s1IntntChgA;
    }

    public void setP569s1IntntChgA(BigDecimal p569s1IntntChgA) {
        this.p569s1IntntChgA = p569s1IntntChgA;
    }

    public short getP569s2IntntChgE() {
        return p569s2IntntChgE;
    }

    public void setP569s2IntntChgE(short p569s2IntntChgE) {
        this.p569s2IntntChgE = p569s2IntntChgE;
    }

    public Character getP569s3IntntChgS() {
        return p569s3IntntChgS;
    }

    public void setP569s3IntntChgS(Character p569s3IntntChgS) {
        this.p569s3IntntChgS = p569s3IntntChgS;
    }

    public BigDecimal getP570s1ElyDeprCa() {
        return p570s1ElyDeprCa;
    }

    public void setP570s1ElyDeprCa(BigDecimal p570s1ElyDeprCa) {
        this.p570s1ElyDeprCa = p570s1ElyDeprCa;
    }

    public short getP570s2ElyDeprCe() {
        return p570s2ElyDeprCe;
    }

    public void setP570s2ElyDeprCe(short p570s2ElyDeprCe) {
        this.p570s2ElyDeprCe = p570s2ElyDeprCe;
    }

    public Character getP570s3ElyDeprCs() {
        return p570s3ElyDeprCs;
    }

    public void setP570s3ElyDeprCs(Character p570s3ElyDeprCs) {
        this.p570s3ElyDeprCs = p570s3ElyDeprCs;
    }

    public String getP571GuestNm() {
        return p571GuestNm;
    }

    public void setP571GuestNm(String p571GuestNm) {
        this.p571GuestNm = p571GuestNm;
    }

    public String getP572GuestNbr() {
        return p572GuestNbr;
    }

    public void setP572GuestNbr(String p572GuestNbr) {
        this.p572GuestNbr = p572GuestNbr;
    }

    public short getP578s3BlAdjExp() {
        return p578s3BlAdjExp;
    }

    public void setP578s3BlAdjExp(short p578s3BlAdjExp) {
        this.p578s3BlAdjExp = p578s3BlAdjExp;
    }

    public Character getP578s4BlAdjSign() {
        return p578s4BlAdjSign;
    }

    public void setP578s4BlAdjSign(Character p578s4BlAdjSign) {
        this.p578s4BlAdjSign = p578s4BlAdjSign;
    }

    public BigDecimal getP580s1RmRtAmt() {
        return p580s1RmRtAmt;
    }

    public void setP580s1RmRtAmt(BigDecimal p580s1RmRtAmt) {
        this.p580s1RmRtAmt = p580s1RmRtAmt;
    }

    public short getP580s2RmRtExp() {
        return p580s2RmRtExp;
    }

    public void setP580s2RmRtExp(short p580s2RmRtExp) {
        this.p580s2RmRtExp = p580s2RmRtExp;
    }

    public BigDecimal getP581s1TotRmTaxa() {
        return p581s1TotRmTaxa;
    }

    public void setP581s1TotRmTaxa(BigDecimal p581s1TotRmTaxa) {
        this.p581s1TotRmTaxa = p581s1TotRmTaxa;
    }

    public short getP581s2TotRmTaxe() {
        return p581s2TotRmTaxe;
    }

    public void setP581s2TotRmTaxe(short p581s2TotRmTaxe) {
        this.p581s2TotRmTaxe = p581s2TotRmTaxe;
    }

    public Character getP581s3TotRmTaxs() {
        return p581s3TotRmTaxs;
    }

    public void setP581s3TotRmTaxs(Character p581s3TotRmTaxs) {
        this.p581s3TotRmTaxs = p581s3TotRmTaxs;
    }

    public BigDecimal getP583s1PhChrgAmt() {
        return p583s1PhChrgAmt;
    }

    public void setP583s1PhChrgAmt(BigDecimal p583s1PhChrgAmt) {
        this.p583s1PhChrgAmt = p583s1PhChrgAmt;
    }

    public short getP583s2PhChrgExp() {
        return p583s2PhChrgExp;
    }

    public void setP583s2PhChrgExp(short p583s2PhChrgExp) {
        this.p583s2PhChrgExp = p583s2PhChrgExp;
    }

    public Character getP583s3PhChrgSig() {
        return p583s3PhChrgSig;
    }

    public void setP583s3PhChrgSig(Character p583s3PhChrgSig) {
        this.p583s3PhChrgSig = p583s3PhChrgSig;
    }

    public BigDecimal getP584s1RstChrgAm() {
        return p584s1RstChrgAm;
    }

    public void setP584s1RstChrgAm(BigDecimal p584s1RstChrgAm) {
        this.p584s1RstChrgAm = p584s1RstChrgAm;
    }

    public short getP584s2RstChrgEx() {
        return p584s2RstChrgEx;
    }

    public void setP584s2RstChrgEx(short p584s2RstChrgEx) {
        this.p584s2RstChrgEx = p584s2RstChrgEx;
    }

    public Character getP584s3RstChrgSi() {
        return p584s3RstChrgSi;
    }

    public void setP584s3RstChrgSi(Character p584s3RstChrgSi) {
        this.p584s3RstChrgSi = p584s3RstChrgSi;
    }

    public BigDecimal getP585s1MinibarCha() {
        return p585s1MinibarCha;
    }

    public void setP585s1MinibarCha(BigDecimal p585s1MinibarCha) {
        this.p585s1MinibarCha = p585s1MinibarCha;
    }

    public short getP585s2MinibarChe() {
        return p585s2MinibarChe;
    }

    public void setP585s2MinibarChe(short p585s2MinibarChe) {
        this.p585s2MinibarChe = p585s2MinibarChe;
    }

    public Character getP585s3MinibarChs() {
        return p585s3MinibarChs;
    }

    public void setP585s3MinibarChs(Character p585s3MinibarChs) {
        this.p585s3MinibarChs = p585s3MinibarChs;
    }

    public BigDecimal getP586s1GiftshopCa() {
        return p586s1GiftshopCa;
    }

    public void setP586s1GiftshopCa(BigDecimal p586s1GiftshopCa) {
        this.p586s1GiftshopCa = p586s1GiftshopCa;
    }

    public short getP586s2GiftshopCe() {
        return p586s2GiftshopCe;
    }

    public void setP586s2GiftshopCe(short p586s2GiftshopCe) {
        this.p586s2GiftshopCe = p586s2GiftshopCe;
    }

    public Character getP586s3GiftshopCs() {
        return p586s3GiftshopCs;
    }

    public void setP586s3GiftshopCs(Character p586s3GiftshopCs) {
        this.p586s3GiftshopCs = p586s3GiftshopCs;
    }

    public BigDecimal getP587s1LndyChrgA() {
        return p587s1LndyChrgA;
    }

    public void setP587s1LndyChrgA(BigDecimal p587s1LndyChrgA) {
        this.p587s1LndyChrgA = p587s1LndyChrgA;
    }

    public short getP587s2LndyChrgE() {
        return p587s2LndyChrgE;
    }

    public void setP587s2LndyChrgE(short p587s2LndyChrgE) {
        this.p587s2LndyChrgE = p587s2LndyChrgE;
    }

    public Character getP587s3LndyChrgS() {
        return p587s3LndyChrgS;
    }

    public void setP587s3LndyChrgS(Character p587s3LndyChrgS) {
        this.p587s3LndyChrgS = p587s3LndyChrgS;
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

    public BigDecimal getP699s1LdgTotTxa() {
        return p699s1LdgTotTxa;
    }

    public void setP699s1LdgTotTxa(BigDecimal p699s1LdgTotTxa) {
        this.p699s1LdgTotTxa = p699s1LdgTotTxa;
    }

    public short getP699s2LdgTotTxe() {
        return p699s2LdgTotTxe;
    }

    public void setP699s2LdgTotTxe(short p699s2LdgTotTxe) {
        this.p699s2LdgTotTxe = p699s2LdgTotTxe;
    }

    public Character getP699s3LdgTotTxs() {
        return p699s3LdgTotTxs;
    }

    public void setP699s3LdgTotTxs(Character p699s3LdgTotTxs) {
        this.p699s3LdgTotTxs = p699s3LdgTotTxs;
    }

    public BigDecimal getP704s1PpdExpsAm() {
        return p704s1PpdExpsAm;
    }

    public void setP704s1PpdExpsAm(BigDecimal p704s1PpdExpsAm) {
        this.p704s1PpdExpsAm = p704s1PpdExpsAm;
    }

    public short getP704s2PpdExpsEx() {
        return p704s2PpdExpsEx;
    }

    public void setP704s2PpdExpsEx(short p704s2PpdExpsEx) {
        this.p704s2PpdExpsEx = p704s2PpdExpsEx;
    }

    public Character getP704s3PpdExpsSi() {
        return p704s3PpdExpsSi;
    }

    public void setP704s3PpdExpsSi(Character p704s3PpdExpsSi) {
        this.p704s3PpdExpsSi = p704s3PpdExpsSi;
    }

    public BigDecimal getP705s1TotNrtaxA() {
        return p705s1TotNrtaxA;
    }

    public void setP705s1TotNrtaxA(BigDecimal p705s1TotNrtaxA) {
        this.p705s1TotNrtaxA = p705s1TotNrtaxA;
    }

    public short getP705s2TotNrtaxE() {
        return p705s2TotNrtaxE;
    }

    public void setP705s2TotNrtaxE(short p705s2TotNrtaxE) {
        this.p705s2TotNrtaxE = p705s2TotNrtaxE;
    }

    public Character getP705s3TotNrtaxS() {
        return p705s3TotNrtaxS;
    }

    public void setP705s3TotNrtaxS(Character p705s3TotNrtaxS) {
        this.p705s3TotNrtaxS = p705s3TotNrtaxS;
    }

    public BigDecimal getP706s1CashAdvAm() {
        return p706s1CashAdvAm;
    }

    public void setP706s1CashAdvAm(BigDecimal p706s1CashAdvAm) {
        this.p706s1CashAdvAm = p706s1CashAdvAm;
    }

    public short getP706s2CashAdvEx() {
        return p706s2CashAdvEx;
    }

    public void setP706s2CashAdvEx(short p706s2CashAdvEx) {
        this.p706s2CashAdvEx = p706s2CashAdvEx;
    }

    public Character getP706s3CashAdvSi() {
        return p706s3CashAdvSi;
    }

    public void setP706s3CashAdvSi(Character p706s3CashAdvSi) {
        this.p706s3CashAdvSi = p706s3CashAdvSi;
    }

    public BigDecimal getP707s1VletChrgA() {
        return p707s1VletChrgA;
    }

    public void setP707s1VletChrgA(BigDecimal p707s1VletChrgA) {
        this.p707s1VletChrgA = p707s1VletChrgA;
    }

    public short getP707s2VletChrgE() {
        return p707s2VletChrgE;
    }

    public void setP707s2VletChrgE(short p707s2VletChrgE) {
        this.p707s2VletChrgE = p707s2VletChrgE;
    }

    public Character getP707s3VletChrgS() {
        return p707s3VletChrgS;
    }

    public void setP707s3VletChrgS(Character p707s3VletChrgS) {
        this.p707s3VletChrgS = p707s3VletChrgS;
    }

    public BigDecimal getP708s1MvieChrgA() {
        return p708s1MvieChrgA;
    }

    public void setP708s1MvieChrgA(BigDecimal p708s1MvieChrgA) {
        this.p708s1MvieChrgA = p708s1MvieChrgA;
    }

    public short getP708s2MvieChrgE() {
        return p708s2MvieChrgE;
    }

    public void setP708s2MvieChrgE(short p708s2MvieChrgE) {
        this.p708s2MvieChrgE = p708s2MvieChrgE;
    }

    public Character getP708s3MvieChrgS() {
        return p708s3MvieChrgS;
    }

    public void setP708s3MvieChrgS(Character p708s3MvieChrgS) {
        this.p708s3MvieChrgS = p708s3MvieChrgS;
    }

    public BigDecimal getP709s1BuscntChga() {
        return p709s1BuscntChga;
    }

    public void setP709s1BuscntChga(BigDecimal p709s1BuscntChga) {
        this.p709s1BuscntChga = p709s1BuscntChga;
    }

    public short getP709s2BuscntChge() {
        return p709s2BuscntChge;
    }

    public void setP709s2BuscntChge(short p709s2BuscntChge) {
        this.p709s2BuscntChge = p709s2BuscntChge;
    }

    public Character getP709s3BuscntChgs() {
        return p709s3BuscntChgs;
    }

    public void setP709s3BuscntChgs(Character p709s3BuscntChgs) {
        this.p709s3BuscntChgs = p709s3BuscntChgs;
    }

    public BigDecimal getP710s1HlthChrgA() {
        return p710s1HlthChrgA;
    }

    public void setP710s1HlthChrgA(BigDecimal p710s1HlthChrgA) {
        this.p710s1HlthChrgA = p710s1HlthChrgA;
    }

    public short getP710s2HlthChrgE() {
        return p710s2HlthChrgE;
    }

    public void setP710s2HlthChrgE(short p710s2HlthChrgE) {
        this.p710s2HlthChrgE = p710s2HlthChrgE;
    }

    public Character getP710s3HlthChrgS() {
        return p710s3HlthChrgS;
    }

    public void setP710s3HlthChrgS(Character p710s3HlthChrgS) {
        this.p710s3HlthChrgS = p710s3HlthChrgS;
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

    public BigDecimal getA693s1Totauth() {
        return a693s1Totauth;
    }

    public void setA693s1Totauth(BigDecimal a693s1Totauth) {
        this.a693s1Totauth = a693s1Totauth;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddLodgDtlPK != null ? mcAddLodgDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddLodgDtl)) {
            return false;
        }
        McAddLodgDtl other = (McAddLodgDtl) object;
        if ((this.mcAddLodgDtlPK == null && other.mcAddLodgDtlPK != null) || (this.mcAddLodgDtlPK != null && !this.mcAddLodgDtlPK.equals(other.mcAddLodgDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddLodgDtl[ mcAddLodgDtlPK=" + mcAddLodgDtlPK + " ]";
    }

}
