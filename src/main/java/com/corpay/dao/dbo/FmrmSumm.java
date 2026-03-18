package com.corpay.dao.dbo;

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
@Table(name = "FMRM_SUMM", catalog = "", schema = "DBO")
public class FmrmSumm implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FmrmSummPK fmrmSummPK;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_FLG")
    private Character lmtdNetwFlg;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_FUEL")
    private Character lmtdNetwPrdFuel;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_OIL")
    private Character lmtdNetwPrdOil;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_CASH")
    private Character lmtdNetwPrdCash;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_0")
    private Character lmtdNetwPrd0;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_1")
    private Character lmtdNetwPrd1;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_2")
    private Character lmtdNetwPrd2;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_3")
    private Character lmtdNetwPrd3;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_4")
    private Character lmtdNetwPrd4;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_5")
    private Character lmtdNetwPrd5;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_6")
    private Character lmtdNetwPrd6;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_7")
    private Character lmtdNetwPrd7;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_8")
    private Character lmtdNetwPrd8;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_9")
    private Character lmtdNetwPrd9;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_A")
    private Character lmtdNetwPrdA;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_B")
    private Character lmtdNetwPrdB;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_C")
    private Character lmtdNetwPrdC;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_D")
    private Character lmtdNetwPrdD;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_E")
    private Character lmtdNetwPrdE;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_F")
    private Character lmtdNetwPrdF;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_G")
    private Character lmtdNetwPrdG;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_H")
    private Character lmtdNetwPrdH;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_I")
    private Character lmtdNetwPrdI;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_J")
    private Character lmtdNetwPrdJ;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_K")
    private Character lmtdNetwPrdK;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_L")
    private Character lmtdNetwPrdL;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_M")
    private Character lmtdNetwPrdM;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_N")
    private Character lmtdNetwPrdN;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_O")
    private Character lmtdNetwPrdO;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_P")
    private Character lmtdNetwPrdP;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_Q")
    private Character lmtdNetwPrdQ;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_R")
    private Character lmtdNetwPrdR;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_S")
    private Character lmtdNetwPrdS;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_T")
    private Character lmtdNetwPrdT;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_U")
    private Character lmtdNetwPrdU;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_V")
    private Character lmtdNetwPrdV;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_W")
    private Character lmtdNetwPrdW;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_X")
    private Character lmtdNetwPrdX;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_Y")
    private Character lmtdNetwPrdY;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_PRD_Z")
    private Character lmtdNetwPrdZ;
    @Basic(optional = false)
    @Column(name = "DB_FLG")
    private Character dbFlg;
    @Basic(optional = false)
    @Column(name = "DB_PRD_FUEL")
    private Character dbPrdFuel;
    @Basic(optional = false)
    @Column(name = "DB_PRD_OIL")
    private Character dbPrdOil;
    @Basic(optional = false)
    @Column(name = "DB_PRD_CASH")
    private Character dbPrdCash;
    @Basic(optional = false)
    @Column(name = "DB_PRD_0")
    private Character dbPrd0;
    @Basic(optional = false)
    @Column(name = "DB_PRD_1")
    private Character dbPrd1;
    @Basic(optional = false)
    @Column(name = "DB_PRD_2")
    private Character dbPrd2;
    @Basic(optional = false)
    @Column(name = "DB_PRD_3")
    private Character dbPrd3;
    @Basic(optional = false)
    @Column(name = "DB_PRD_4")
    private Character dbPrd4;
    @Basic(optional = false)
    @Column(name = "DB_PRD_5")
    private Character dbPrd5;
    @Basic(optional = false)
    @Column(name = "DB_PRD_6")
    private Character dbPrd6;
    @Basic(optional = false)
    @Column(name = "DB_PRD_7")
    private Character dbPrd7;
    @Basic(optional = false)
    @Column(name = "DB_PRD_8")
    private Character dbPrd8;
    @Basic(optional = false)
    @Column(name = "DB_PRD_9")
    private Character dbPrd9;
    @Basic(optional = false)
    @Column(name = "DB_PRD_A")
    private Character dbPrdA;
    @Basic(optional = false)
    @Column(name = "DB_PRD_B")
    private Character dbPrdB;
    @Basic(optional = false)
    @Column(name = "DB_PRD_C")
    private Character dbPrdC;
    @Basic(optional = false)
    @Column(name = "DB_PRD_D")
    private Character dbPrdD;
    @Basic(optional = false)
    @Column(name = "DB_PRD_E")
    private Character dbPrdE;
    @Basic(optional = false)
    @Column(name = "DB_PRD_F")
    private Character dbPrdF;
    @Basic(optional = false)
    @Column(name = "DB_PRD_G")
    private Character dbPrdG;
    @Basic(optional = false)
    @Column(name = "DB_PRD_H")
    private Character dbPrdH;
    @Basic(optional = false)
    @Column(name = "DB_PRD_I")
    private Character dbPrdI;
    @Basic(optional = false)
    @Column(name = "DB_PRD_J")
    private Character dbPrdJ;
    @Basic(optional = false)
    @Column(name = "DB_PRD_K")
    private Character dbPrdK;
    @Basic(optional = false)
    @Column(name = "DB_PRD_L")
    private Character dbPrdL;
    @Basic(optional = false)
    @Column(name = "DB_PRD_M")
    private Character dbPrdM;
    @Basic(optional = false)
    @Column(name = "DB_PRD_N")
    private Character dbPrdN;
    @Basic(optional = false)
    @Column(name = "DB_PRD_O")
    private Character dbPrdO;
    @Basic(optional = false)
    @Column(name = "DB_PRD_P")
    private Character dbPrdP;
    @Basic(optional = false)
    @Column(name = "DB_PRD_Q")
    private Character dbPrdQ;
    @Basic(optional = false)
    @Column(name = "DB_PRD_R")
    private Character dbPrdR;
    @Basic(optional = false)
    @Column(name = "DB_PRD_S")
    private Character dbPrdS;
    @Basic(optional = false)
    @Column(name = "DB_PRD_T")
    private Character dbPrdT;
    @Basic(optional = false)
    @Column(name = "DB_PRD_U")
    private Character dbPrdU;
    @Basic(optional = false)
    @Column(name = "DB_PRD_V")
    private Character dbPrdV;
    @Basic(optional = false)
    @Column(name = "DB_PRD_W")
    private Character dbPrdW;
    @Basic(optional = false)
    @Column(name = "DB_PRD_X")
    private Character dbPrdX;
    @Basic(optional = false)
    @Column(name = "DB_PRD_Y")
    private Character dbPrdY;
    @Basic(optional = false)
    @Column(name = "DB_PRD_Z")
    private Character dbPrdZ;
    @Basic(optional = false)
    @Column(name = "FOCUS_DISC_TYP")
    private Character focusDiscTyp;

    @Basic(optional = false)
    @Column(name = "FOCUS_CPG_TOT_DISC")
    private BigDecimal focusCpgTotDisc;
    @Basic(optional = false)
    @Column(name = "FOCUS_CPG_NET")
    private BigDecimal focusCpgNet;
    @Basic(optional = false)
    @Column(name = "FOCUS_CPG_REBATE")
    private BigDecimal focusCpgRebate;
    @Basic(optional = false)
    @Column(name = "FOCUS_CPG_RETAINED")
    private BigDecimal focusCpgRetained;
    @Basic(optional = false)
    @Column(name = "FOCUS_CPG_USE_CD")
    private String focusCpgUseCd;
    @Basic(optional = false)
    @Column(name = "FOCUS_POF_TOT_DISC")
    private BigDecimal focusPofTotDisc;
    @Basic(optional = false)
    @Column(name = "FOCUS_POF_NET")
    private BigDecimal focusPofNet;
    @Basic(optional = false)
    @Column(name = "FOCUS_POF_REBATE")
    private BigDecimal focusPofRebate;
    @Basic(optional = false)
    @Column(name = "FOCUS_POF_RETAINED")
    private BigDecimal focusPofRetained;
    @Basic(optional = false)
    @Column(name = "FOCUS_POF_USE_CD")
    private String focusPofUseCd;
    @Basic(optional = false)
    @Column(name = "FOCUS_FLAT_TOT_DISC")
    private BigDecimal focusFlatTotDisc;
    @Basic(optional = false)
    @Column(name = "FOCUS_FLAT_NET")
    private BigDecimal focusFlatNet;
    @Basic(optional = false)
    @Column(name = "FOCUS_FLAT_REBATE")
    private BigDecimal focusFlatRebate;
    @Basic(optional = false)
    @Column(name = "FOCUS_FLAT_RETAINED")
    private BigDecimal focusFlatRetained;
    @Basic(optional = false)
    @Column(name = "FOCUS_FLAT_USE_CD")
    private String focusFlatUseCd;
    @Basic(optional = false)
    @Column(name = "CO_CUSTOM_FEE_FND_FUEL")
    private BigDecimal coCustomFeeFndFuel;
    @Basic(optional = false)
    @Column(name = "CO_CUSTOM_FEE_FND_CASH")
    private BigDecimal coCustomFeeFndCash;
    @Basic(optional = false)
    @Column(name = "CO_CUSTOM_FEE_FND_BOTH")
    private BigDecimal coCustomFeeFndBoth;
    @Basic(optional = false)
    @Column(name = "CO_CUSTOM_FEE_DB_FUEL")
    private BigDecimal coCustomFeeDbFuel;
    @Basic(optional = false)
    @Column(name = "CO_CUSTOM_FEE_DB_CASH")
    private BigDecimal coCustomFeeDbCash;
    @Basic(optional = false)
    @Column(name = "CO_CUSTOM_FEE_DB_BOTH")
    private BigDecimal coCustomFeeDbBoth;
    @Basic(optional = false)
    @Column(name = "SC_CUSTOM_FEE_FND_FUEL")
    private BigDecimal scCustomFeeFndFuel;
    @Basic(optional = false)
    @Column(name = "SC_CUSTOM_FEE_FND_CASH")
    private BigDecimal scCustomFeeFndCash;
    @Basic(optional = false)
    @Column(name = "SC_CUSTOM_FEE_FND_BOTH")
    private BigDecimal scCustomFeeFndBoth;
    @Basic(optional = false)
    @Column(name = "SC_CUSTOM_FEE_DB_FUEL")
    private BigDecimal scCustomFeeDbFuel;
    @Basic(optional = false)
    @Column(name = "SC_CUSTOM_FEE_DB_CASH")
    private BigDecimal scCustomFeeDbCash;
    @Basic(optional = false)
    @Column(name = "SC_CUSTOM_FEE_DB_BOTH")
    private BigDecimal scCustomFeeDbBoth;
    @Basic(optional = false)
    @Column(name = "SC_CUSTOM_FEE_VOICE_CHG")
    private BigDecimal scCustomFeeVoiceChg;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TYP")
    private Character volumeRebateTyp;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM1_QTY")
    private int volumeRebateFrom1Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO1_QTY")
    private int volumeRebateTo1Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS1")
    private BigDecimal volumeRebateCents1;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM2_QTY")
    private int volumeRebateFrom2Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO2_QTY")
    private int volumeRebateTo2Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS2")
    private BigDecimal volumeRebateCents2;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM3_QTY")
    private int volumeRebateFrom3Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO3_QTY")
    private int volumeRebateTo3Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS3")
    private BigDecimal volumeRebateCents3;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM4_QTY")
    private int volumeRebateFrom4Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO4_QTY")
    private int volumeRebateTo4Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS4")
    private BigDecimal volumeRebateCents4;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM5_QTY")
    private int volumeRebateFrom5Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO5_QTY")
    private int volumeRebateTo5Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS5")
    private BigDecimal volumeRebateCents5;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM6_QTY")
    private int volumeRebateFrom6Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO6_QTY")
    private int volumeRebateTo6Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS6")
    private BigDecimal volumeRebateCents6;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM7_QTY")
    private int volumeRebateFrom7Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO7_QTY")
    private int volumeRebateTo7Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS7")
    private BigDecimal volumeRebateCents7;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM8_QTY")
    private int volumeRebateFrom8Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO8_QTY")
    private int volumeRebateTo8Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS8")
    private BigDecimal volumeRebateCents8;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM9_QTY")
    private int volumeRebateFrom9Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO9_QTY")
    private int volumeRebateTo9Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS9")
    private BigDecimal volumeRebateCents9;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM10_QTY")
    private int volumeRebateFrom10Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO10_QTY")
    private int volumeRebateTo10Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS10")
    private BigDecimal volumeRebateCents10;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM11_QTY")
    private int volumeRebateFrom11Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO11_QTY")
    private int volumeRebateTo11Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS11")
    private BigDecimal volumeRebateCents11;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM12_QTY")
    private int volumeRebateFrom12Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO12_QTY")
    private int volumeRebateTo12Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS12")
    private BigDecimal volumeRebateCents12;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM13_QTY")
    private int volumeRebateFrom13Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO13_QTY")
    private int volumeRebateTo13Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS13")
    private BigDecimal volumeRebateCents13;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM14_QTY")
    private int volumeRebateFrom14Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO14_QTY")
    private int volumeRebateTo14Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS14")
    private BigDecimal volumeRebateCents14;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM15_QTY")
    private int volumeRebateFrom15Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO15_QTY")
    private int volumeRebateTo15Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS15")
    private BigDecimal volumeRebateCents15;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_FROM16_QTY")
    private int volumeRebateFrom16Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_TO16_QTY")
    private int volumeRebateTo16Qty;
    @Basic(optional = false)
    @Column(name = "VOLUME_REBATE_CENTS16")
    private BigDecimal volumeRebateCents16;
    @Basic(optional = false)
    @Column(name = "TRUCKSTOP_MARKUP")
    private BigDecimal truckstopMarkup;
    @Basic(optional = false)
    @Column(name = "COMDATA_MARKUP")
    private BigDecimal comdataMarkup;
    @Basic(optional = false)
    @Column(name = "CP_STTAX_RATE_FLG")
    private Character cpSttaxRateFlg;
    @Basic(optional = false)
    @Column(name = "CP_STTAX_RATE_TRACTOR")
    private BigDecimal cpSttaxRateTractor;
    @Basic(optional = false)
    @Column(name = "CP_STTAX_RATE_REEFER")
    private BigDecimal cpSttaxRateReefer;
    @Basic(optional = false)
    @Column(name = "CP_MAX_ALLOW_PRICE_FLG")
    private Character cpMaxAllowPriceFlg;
    @Basic(optional = false)
    @Column(name = "COST_PLUS_ACTIVE_CD")
    private Character costPlusActiveCd;
    @Basic(optional = false)
    @Column(name = "CP_RACK_CITY_NBR")
    private String cpRackCityNbr;
    @Basic(optional = false)
    @Column(name = "CP_RACK_SUPPLIER_NBR")
    private String cpRackSupplierNbr;
    @Basic(optional = false)
    @Column(name = "CP_RACK_TYPE_FLG")
    private Character cpRackTypeFlg;
    @Basic(optional = false)
    @Column(name = "CP_RACK_UPDATE_SU")
    private Character cpRackUpdateSu;
    @Basic(optional = false)
    @Column(name = "CP_RACK_UPDATE_MO")
    private Character cpRackUpdateMo;
    @Basic(optional = false)
    @Column(name = "CP_RACK_UPDATE_TU")
    private Character cpRackUpdateTu;
    @Basic(optional = false)
    @Column(name = "CP_RACK_UPDATE_WE")
    private Character cpRackUpdateWe;
    @Basic(optional = false)
    @Column(name = "CP_RACK_UPDATE_TH")
    private Character cpRackUpdateTh;
    @Basic(optional = false)
    @Column(name = "CP_RACK_UPDATE_FR")
    private Character cpRackUpdateFr;
    @Basic(optional = false)
    @Column(name = "CP_RACK_UPDATE_SA")
    private Character cpRackUpdateSa;
    @Basic(optional = false)
    @Column(name = "CP_FIRST_PPG_FLG")
    private Character cpFirstPpgFlg;
    @Basic(optional = false)
    @Column(name = "CP_FIRST_PPG_AMT")
    private BigDecimal cpFirstPpgAmt;
    @Basic(optional = false)
    @Column(name = "CP_REMAIN_PPG_FLG")
    private Character cpRemainPpgFlg;
    @Basic(optional = false)
    @Column(name = "CREDIT_LIMIT_DAILY")
    private int creditLimitDaily;
    @Basic(optional = false)
    @Column(name = "CREDIT_LIMIT_TEMP")
    private int creditLimitTemp;
    @Basic(optional = false)
    @Column(name = "CREDIT_LIMIT_USED")
    private int creditLimitUsed;
    @Basic(optional = false)
    @Column(name = "CC_COMDATA_COMPLETE_CD")
    private Character ccComdataCompleteCd;
    @Basic(optional = false)
    @Column(name = "CC_STATUS_CD")
    private Character ccStatusCd;
    @Basic(optional = false)
    @Column(name = "CC_CREDIT_LIMIT")
    private int ccCreditLimit;
    @Basic(optional = false)
    @Column(name = "CC_CREDIT_USED_DAILY")
    private BigDecimal ccCreditUsedDaily;
    @Basic(optional = false)
    @Column(name = "CC_CREDIT_USED")
    private BigDecimal ccCreditUsed;
    @Basic(optional = false)
    @Column(name = "CC_LAST_PAY_DT")
    @Temporal(TemporalType.DATE)
    private Date ccLastPayDt;
    @Basic(optional = false)
    @Column(name = "CC_STATUS_NEW_CD")
    private Character ccStatusNewCd;
    @Basic(optional = false)
    @Column(name = "CC_STATUS_NEW_DT")
    @Temporal(TemporalType.DATE)
    private Date ccStatusNewDt;
    @Basic(optional = false)
    @Column(name = "SETTLE_PAYCYL_CD")
    private Character settlePaycylCd;
    @Basic(optional = false)
    @Column(name = "SETTLE_DAYCYL_CD")
    private String settleDaycylCd;
    @Basic(optional = false)
    @Column(name = "SETTLE_DELAY_CYCLE_CD")
    private String settleDelayCycleCd;
    @Basic(optional = false)
    @Column(name = "NEGOTIATED_PRICE_FLG")
    private Character negotiatedPriceFlg;
    @Basic(optional = false)
    @Column(name = "BULK_FUEL_FLG")
    private Character bulkFuelFlg;
    @Basic(optional = false)
    @Column(name = "COMDATA_TEMP_CD")
    private Character comdataTempCd;
    @Basic(optional = false)
    @Column(name = "BRIDGE_FLG")
    private Character bridgeFlg;
    @Basic(optional = false)
    @Column(name = "MAX_ALLOWED_QTY")
    private String maxAllowedQty;
    @Basic(optional = false)
    @Column(name = "TERM_FUEL_FLG")
    private Character termFuelFlg;
    @Basic(optional = false)
    @Column(name = "PREFER_LEVEL_FLG")
    private Character preferLevelFlg;
    @Basic(optional = false)
    @Column(name = "IN_NETW_FLG")
    private Character inNetwFlg;
    @Basic(optional = false)
    @Column(name = "ALLOW_KEYED_CARD_FLG")
    private Character allowKeyedCardFlg;
    @Basic(optional = false)
    @Column(name = "COMFUEL_FLG")
    private Character comfuelFlg;
    @Basic(optional = false)
    @Column(name = "DISC_UPDATE_CD")
    private Character discUpdateCd;
    @Basic(optional = false)
    @Column(name = "CREDIT_PRICED_FLG")
    private Character creditPricedFlg;
    @Basic(optional = false)
    @Column(name = "SEND_NET_AMT_MSG_FLG")
    private Character sendNetAmtMsgFlg;
    @Basic(optional = false)
    @Column(name = "CO_FEE_PERCENT_DISC")
    private BigDecimal coFeePercentDisc;
    @Basic(optional = false)
    @Column(name = "CO_FEE_FLAT_DISC")
    private BigDecimal coFeeFlatDisc;
    @Basic(optional = false)
    @Column(name = "CO_FEE_DISC_CUTOFF")
    private int coFeeDiscCutoff;
    @Basic(optional = false)
    @Column(name = "NATS_CD")
    private Character natsCd;
    @Basic(optional = false)
    @Column(name = "CP_FTTAX_RATE_FLG")
    private Character cpFttaxRateFlg;
    @Basic(optional = false)
    @Column(name = "CP_FTTAX_RATE_TRACTOR")
    private BigDecimal cpFttaxRateTractor;
    @Basic(optional = false)
    @Column(name = "CP_FTTAX_RATE_REEFER")
    private BigDecimal cpFttaxRateReefer;
    @Basic(optional = false)
    @Column(name = "CP_SSTAX_RATE_FLG")
    private Character cpSstaxRateFlg;
    @Basic(optional = false)
    @Column(name = "CP_SSTAX_RATE_TRACTOR")
    private BigDecimal cpSstaxRateTractor;
    @Basic(optional = false)
    @Column(name = "CP_SSTAX_RATE_REEFER")
    private BigDecimal cpSstaxRateReefer;
    @Basic(optional = false)
    @Column(name = "CP_LTTAX_RATE_FLG")
    private Character cpLttaxRateFlg;
    @Basic(optional = false)
    @Column(name = "CP_LTTAX_RATE_TRACTOR")
    private BigDecimal cpLttaxRateTractor;
    @Basic(optional = false)
    @Column(name = "CP_LTTAX_RATE_REEFER")
    private BigDecimal cpLttaxRateReefer;
    @Basic(optional = false)
    @Column(name = "CP_TPTAX_RATE_FLG")
    private Character cpTptaxRateFlg;
    @Basic(optional = false)
    @Column(name = "CP_TPTAX_RATE_TRACTOR")
    private BigDecimal cpTptaxRateTractor;
    @Basic(optional = false)
    @Column(name = "CP_TPTAX_RATE_REEFER")
    private BigDecimal cpTptaxRateReefer;
    @Basic(optional = false)
    @Column(name = "CP_MSTAX_RATE_FLG")
    private Character cpMstaxRateFlg;
    @Basic(optional = false)
    @Column(name = "CP_MSTAX_RATE_TRACTOR")
    private BigDecimal cpMstaxRateTractor;
    @Basic(optional = false)
    @Column(name = "CP_MSTAX_RATE_REEFER")
    private BigDecimal cpMstaxRateReefer;
    @Basic(optional = false)
    @Column(name = "CP_SATAX_RATE_FLG")
    private Character cpSataxRateFlg;
    @Basic(optional = false)
    @Column(name = "CP_SATAX_RATE_TRACTOR")
    private BigDecimal cpSataxRateTractor;
    @Basic(optional = false)
    @Column(name = "CP_SATAX_RATE_REEFER")
    private BigDecimal cpSataxRateReefer;
    @Basic(optional = false)
    @Column(name = "CP_MISCELLANEOUS_TEXT")
    private String cpMiscellaneousText;
    @Basic(optional = false)
    @Column(name = "RMF_FLG")
    private Character rmfFlg;
    @Basic(optional = false)
    @Column(name = "RMF_CUR_PPG")
    private BigDecimal rmfCurPpg;
    @Basic(optional = false)
    @Column(name = "RMF_PEN_PPG")
    private BigDecimal rmfPenPpg;
    @Basic(optional = false)
    @Column(name = "RMF_PPG_ACTIVE_DT")
    @Temporal(TemporalType.DATE)
    private Date rmfPpgActiveDt;
    @Basic(optional = false)
    @Column(name = "ONETIME_NETW_FLG")
    private Character onetimeNetwFlg;
    @Basic(optional = false)
    @Column(name = "ONETIME_FUEL_FLG")
    private Character onetimeFuelFlg;
    @Basic(optional = false)
    @Column(name = "SETTLE_PAY_TO")
    private String settlePayTo;
    @Basic(optional = false)
    @Column(name = "PASSAGE_PLUS_FLG")
    private Character passagePlusFlg;
    @Basic(optional = false)
    @Column(name = "PRDFMRM_LOC_TYP")
    private String prdfmrmLocTyp;
    @Basic(optional = false)
    @Column(name = "FOCUS_CPG_G999_REDC")
    private BigDecimal focusCpgG999Redc;
    @Basic(optional = false)
    @Column(name = "FOCUS_POF_G999_REDC")
    private BigDecimal focusPofG999Redc;
    @Basic(optional = false)
    @Column(name = "FOCUS_FLAT_G999_REDC")
    private BigDecimal focusFlatG999Redc;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_0")
    private Character customFeePrdCode0;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_1")
    private Character customFeePrdCode1;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_2")
    private Character customFeePrdCode2;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_3")
    private Character customFeePrdCode3;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_4")
    private Character customFeePrdCode4;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_5")
    private Character customFeePrdCode5;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_6")
    private Character customFeePrdCode6;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_7")
    private Character customFeePrdCode7;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_8")
    private Character customFeePrdCode8;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_9")
    private Character customFeePrdCode9;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_A")
    private Character customFeePrdCodeA;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_B")
    private Character customFeePrdCodeB;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_C")
    private Character customFeePrdCodeC;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_D")
    private Character customFeePrdCodeD;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_E")
    private Character customFeePrdCodeE;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_F")
    private Character customFeePrdCodeF;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_G")
    private Character customFeePrdCodeG;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_H")
    private Character customFeePrdCodeH;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_I")
    private Character customFeePrdCodeI;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_J")
    private Character customFeePrdCodeJ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_K")
    private Character customFeePrdCodeK;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_L")
    private Character customFeePrdCodeL;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_M")
    private Character customFeePrdCodeM;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_N")
    private Character customFeePrdCodeN;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_O")
    private Character customFeePrdCodeO;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_P")
    private Character customFeePrdCodeP;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_Q")
    private Character customFeePrdCodeQ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_R")
    private Character customFeePrdCodeR;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_S")
    private Character customFeePrdCodeS;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_T")
    private Character customFeePrdCodeT;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_U")
    private Character customFeePrdCodeU;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_V")
    private Character customFeePrdCodeV;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_W")
    private Character customFeePrdCodeW;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_X")
    private Character customFeePrdCodeX;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_Y")
    private Character customFeePrdCodeY;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CODE_Z")
    private Character customFeePrdCodeZ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_0")
    private Character customFeePrdTyp0;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_1")
    private Character customFeePrdTyp1;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_2")
    private Character customFeePrdTyp2;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_3")
    private Character customFeePrdTyp3;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_4")
    private Character customFeePrdTyp4;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_5")
    private Character customFeePrdTyp5;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_6")
    private Character customFeePrdTyp6;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_7")
    private Character customFeePrdTyp7;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_8")
    private Character customFeePrdTyp8;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_9")
    private Character customFeePrdTyp9;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_A")
    private Character customFeePrdTypA;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_B")
    private Character customFeePrdTypB;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_C")
    private Character customFeePrdTypC;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_D")
    private Character customFeePrdTypD;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_E")
    private Character customFeePrdTypE;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_F")
    private Character customFeePrdTypF;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_G")
    private Character customFeePrdTypG;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_H")
    private Character customFeePrdTypH;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_I")
    private Character customFeePrdTypI;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_J")
    private Character customFeePrdTypJ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_K")
    private Character customFeePrdTypK;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_L")
    private Character customFeePrdTypL;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_M")
    private Character customFeePrdTypM;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_N")
    private Character customFeePrdTypN;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_O")
    private Character customFeePrdTypO;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_P")
    private Character customFeePrdTypP;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_Q")
    private Character customFeePrdTypQ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_R")
    private Character customFeePrdTypR;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_S")
    private Character customFeePrdTypS;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_T")
    private Character customFeePrdTypT;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_U")
    private Character customFeePrdTypU;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_V")
    private Character customFeePrdTypV;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_W")
    private Character customFeePrdTypW;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_X")
    private Character customFeePrdTypX;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_Y")
    private Character customFeePrdTypY;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_TYP_Z")
    private Character customFeePrdTypZ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_0")
    private BigDecimal customFeePrdCoFnd0;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_1")
    private BigDecimal customFeePrdCoFnd1;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_2")
    private BigDecimal customFeePrdCoFnd2;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_3")
    private BigDecimal customFeePrdCoFnd3;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_4")
    private BigDecimal customFeePrdCoFnd4;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_5")
    private BigDecimal customFeePrdCoFnd5;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_6")
    private BigDecimal customFeePrdCoFnd6;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_7")
    private BigDecimal customFeePrdCoFnd7;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_8")
    private BigDecimal customFeePrdCoFnd8;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_9")
    private BigDecimal customFeePrdCoFnd9;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_A")
    private BigDecimal customFeePrdCoFndA;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_B")
    private BigDecimal customFeePrdCoFndB;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_C")
    private BigDecimal customFeePrdCoFndC;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_D")
    private BigDecimal customFeePrdCoFndD;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_E")
    private BigDecimal customFeePrdCoFndE;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_F")
    private BigDecimal customFeePrdCoFndF;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_G")
    private BigDecimal customFeePrdCoFndG;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_H")
    private BigDecimal customFeePrdCoFndH;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_I")
    private BigDecimal customFeePrdCoFndI;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_J")
    private BigDecimal customFeePrdCoFndJ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_K")
    private BigDecimal customFeePrdCoFndK;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_L")
    private BigDecimal customFeePrdCoFndL;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_M")
    private BigDecimal customFeePrdCoFndM;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_N")
    private BigDecimal customFeePrdCoFndN;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_O")
    private BigDecimal customFeePrdCoFndO;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_P")
    private BigDecimal customFeePrdCoFndP;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_Q")
    private BigDecimal customFeePrdCoFndQ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_R")
    private BigDecimal customFeePrdCoFndR;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_S")
    private BigDecimal customFeePrdCoFndS;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_T")
    private BigDecimal customFeePrdCoFndT;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_U")
    private BigDecimal customFeePrdCoFndU;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_V")
    private BigDecimal customFeePrdCoFndV;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_W")
    private BigDecimal customFeePrdCoFndW;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_X")
    private BigDecimal customFeePrdCoFndX;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_Y")
    private BigDecimal customFeePrdCoFndY;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_FND_Z")
    private BigDecimal customFeePrdCoFndZ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_0")
    private BigDecimal customFeePrdCoDb0;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_1")
    private BigDecimal customFeePrdCoDb1;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_2")
    private BigDecimal customFeePrdCoDb2;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_3")
    private BigDecimal customFeePrdCoDb3;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_4")
    private BigDecimal customFeePrdCoDb4;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_5")
    private BigDecimal customFeePrdCoDb5;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_6")
    private BigDecimal customFeePrdCoDb6;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_7")
    private BigDecimal customFeePrdCoDb7;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_8")
    private BigDecimal customFeePrdCoDb8;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_9")
    private BigDecimal customFeePrdCoDb9;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_A")
    private BigDecimal customFeePrdCoDbA;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_B")
    private BigDecimal customFeePrdCoDbB;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_C")
    private BigDecimal customFeePrdCoDbC;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_D")
    private BigDecimal customFeePrdCoDbD;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_E")
    private BigDecimal customFeePrdCoDbE;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_F")
    private BigDecimal customFeePrdCoDbF;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_G")
    private BigDecimal customFeePrdCoDbG;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_H")
    private BigDecimal customFeePrdCoDbH;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_I")
    private BigDecimal customFeePrdCoDbI;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_J")
    private BigDecimal customFeePrdCoDbJ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_K")
    private BigDecimal customFeePrdCoDbK;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_L")
    private BigDecimal customFeePrdCoDbL;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_M")
    private BigDecimal customFeePrdCoDbM;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_N")
    private BigDecimal customFeePrdCoDbN;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_O")
    private BigDecimal customFeePrdCoDbO;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_P")
    private BigDecimal customFeePrdCoDbP;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_Q")
    private BigDecimal customFeePrdCoDbQ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_R")
    private BigDecimal customFeePrdCoDbR;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_S")
    private BigDecimal customFeePrdCoDbS;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_T")
    private BigDecimal customFeePrdCoDbT;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_U")
    private BigDecimal customFeePrdCoDbU;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_V")
    private BigDecimal customFeePrdCoDbV;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_W")
    private BigDecimal customFeePrdCoDbW;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_X")
    private BigDecimal customFeePrdCoDbX;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_Y")
    private BigDecimal customFeePrdCoDbY;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_PRD_CO_DB_Z")
    private BigDecimal customFeePrdCoDbZ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_0")
    private BigDecimal customFeeScRate0;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_1")
    private BigDecimal customFeeScRate1;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_2")
    private BigDecimal customFeeScRate2;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_3")
    private BigDecimal customFeeScRate3;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_4")
    private BigDecimal customFeeScRate4;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_5")
    private BigDecimal customFeeScRate5;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_6")
    private BigDecimal customFeeScRate6;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_7")
    private BigDecimal customFeeScRate7;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_8")
    private BigDecimal customFeeScRate8;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_9")
    private BigDecimal customFeeScRate9;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_A")
    private BigDecimal customFeeScRateA;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_B")
    private BigDecimal customFeeScRateB;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_C")
    private BigDecimal customFeeScRateC;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_D")
    private BigDecimal customFeeScRateD;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_E")
    private BigDecimal customFeeScRateE;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_F")
    private BigDecimal customFeeScRateF;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_G")
    private BigDecimal customFeeScRateG;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_H")
    private BigDecimal customFeeScRateH;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_I")
    private BigDecimal customFeeScRateI;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_J")
    private BigDecimal customFeeScRateJ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_K")
    private BigDecimal customFeeScRateK;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_L")
    private BigDecimal customFeeScRateL;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_M")
    private BigDecimal customFeeScRateM;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_N")
    private BigDecimal customFeeScRateN;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_O")
    private BigDecimal customFeeScRateO;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_P")
    private BigDecimal customFeeScRateP;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_Q")
    private BigDecimal customFeeScRateQ;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_R")
    private BigDecimal customFeeScRateR;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_S")
    private BigDecimal customFeeScRateS;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_T")
    private BigDecimal customFeeScRateT;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_U")
    private BigDecimal customFeeScRateU;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_V")
    private BigDecimal customFeeScRateV;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_W")
    private BigDecimal customFeeScRateW;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_X")
    private BigDecimal customFeeScRateX;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_Y")
    private BigDecimal customFeeScRateY;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_SC_RATE_Z")
    private BigDecimal customFeeScRateZ;
    @Basic(optional = false)
    @Column(name = "ALLOW_CUSTOM_PROD_FEE_CD")
    private Character allowCustomProdFeeCd;
    @Basic(optional = false)
    @Column(name = "MAX_ALLOWED_RFR_QTY")
    private String maxAllowedRfrQty;
    @Basic(optional = false)
    @Column(name = "MAX_ALLOWED_OTH_QTY")
    private String maxAllowedOthQty;
    @Basic(optional = false)
    @Column(name = "MAX_ALLOWED_HOLD_RFR_QTY")
    private String maxAllowedHoldRfrQty;
    @Basic(optional = false)
    @Column(name = "MAX_ALLOWED_HOLD_OTH_QTY")
    private String maxAllowedHoldOthQty;
    @Basic(optional = false)
    @Column(name = "CP_SATAX_CPG_FLG")
    private Character cpSataxCpgFlg;
    @Basic(optional = false)
    @Column(name = "CP_SATAX_CPG_TRACTOR")
    private BigDecimal cpSataxCpgTractor;
    @Basic(optional = false)
    @Column(name = "CP_SATAX_CPG_REEFER")
    private BigDecimal cpSataxCpgReefer;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_FND_FUEL_FEE_TYP")
    private Character customFeeFndFuelFeeTyp;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_FND_CASH_FEE_TYP")
    private Character customFeeFndCashFeeTyp;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_FND_BOTH_FEE_TYP")
    private Character customFeeFndBothFeeTyp;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_FND_DB_FUEL_FEE_TYP")
    private Character customFeeFndDbFuelFeeTyp;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_FND_DB_CASH_FEE_TYP")
    private Character customFeeFndDbCashFeeTyp;
    @Basic(optional = false)
    @Column(name = "CUSTOM_FEE_FND_DB_BOTH_FEE_TYP")
    private Character customFeeFndDbBothFeeTyp;
    @Basic(optional = false)
    @Column(name = "CP_ALT_TA_FEE")
    private BigDecimal cpAltTaFee;
    @Basic(optional = false)
    @Column(name = "SMFL_GL_CD")
    private String smflGlCd;
    @Basic(optional = false)
    @Column(name = "SCMM17_FEE_FLG")
    private String scmm17FeeFlg;
    @Basic(optional = false)
    @Column(name = "SCMM17_DISC_FEE")
    private BigDecimal scmm17DiscFee;
    @Basic(optional = false)
    @Column(name = "SCMM17_RETL_FEE")
    private BigDecimal scmm17RetlFee;
    @Basic(optional = false)
    @Column(name = "LOC_RECOMD_FLG")
    private Character locRecomdFlg;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public FmrmSumm() {
    }

    public FmrmSumm(FmrmSummPK fmrmSummPK) {
        this.fmrmSummPK = fmrmSummPK;
    }

    public FmrmSummPK getFmrmSummPK() {
        return fmrmSummPK;
    }

    public void setFmrmSummPK(FmrmSummPK fmrmSummPK) {
        this.fmrmSummPK = fmrmSummPK;
    }

    public Character getLmtdNetwFlg() {
        return lmtdNetwFlg;
    }

    public void setLmtdNetwFlg(Character lmtdNetwFlg) {
        this.lmtdNetwFlg = lmtdNetwFlg;
    }

    public Character getLmtdNetwPrdFuel() {
        return lmtdNetwPrdFuel;
    }

    public void setLmtdNetwPrdFuel(Character lmtdNetwPrdFuel) {
        this.lmtdNetwPrdFuel = lmtdNetwPrdFuel;
    }

    public Character getLmtdNetwPrdOil() {
        return lmtdNetwPrdOil;
    }

    public void setLmtdNetwPrdOil(Character lmtdNetwPrdOil) {
        this.lmtdNetwPrdOil = lmtdNetwPrdOil;
    }

    public Character getLmtdNetwPrdCash() {
        return lmtdNetwPrdCash;
    }

    public void setLmtdNetwPrdCash(Character lmtdNetwPrdCash) {
        this.lmtdNetwPrdCash = lmtdNetwPrdCash;
    }

    public Character getLmtdNetwPrd0() {
        return lmtdNetwPrd0;
    }

    public void setLmtdNetwPrd0(Character lmtdNetwPrd0) {
        this.lmtdNetwPrd0 = lmtdNetwPrd0;
    }

    public Character getLmtdNetwPrd1() {
        return lmtdNetwPrd1;
    }

    public void setLmtdNetwPrd1(Character lmtdNetwPrd1) {
        this.lmtdNetwPrd1 = lmtdNetwPrd1;
    }

    public Character getLmtdNetwPrd2() {
        return lmtdNetwPrd2;
    }

    public void setLmtdNetwPrd2(Character lmtdNetwPrd2) {
        this.lmtdNetwPrd2 = lmtdNetwPrd2;
    }

    public Character getLmtdNetwPrd3() {
        return lmtdNetwPrd3;
    }

    public void setLmtdNetwPrd3(Character lmtdNetwPrd3) {
        this.lmtdNetwPrd3 = lmtdNetwPrd3;
    }

    public Character getLmtdNetwPrd4() {
        return lmtdNetwPrd4;
    }

    public void setLmtdNetwPrd4(Character lmtdNetwPrd4) {
        this.lmtdNetwPrd4 = lmtdNetwPrd4;
    }

    public Character getLmtdNetwPrd5() {
        return lmtdNetwPrd5;
    }

    public void setLmtdNetwPrd5(Character lmtdNetwPrd5) {
        this.lmtdNetwPrd5 = lmtdNetwPrd5;
    }

    public Character getLmtdNetwPrd6() {
        return lmtdNetwPrd6;
    }

    public void setLmtdNetwPrd6(Character lmtdNetwPrd6) {
        this.lmtdNetwPrd6 = lmtdNetwPrd6;
    }

    public Character getLmtdNetwPrd7() {
        return lmtdNetwPrd7;
    }

    public void setLmtdNetwPrd7(Character lmtdNetwPrd7) {
        this.lmtdNetwPrd7 = lmtdNetwPrd7;
    }

    public Character getLmtdNetwPrd8() {
        return lmtdNetwPrd8;
    }

    public void setLmtdNetwPrd8(Character lmtdNetwPrd8) {
        this.lmtdNetwPrd8 = lmtdNetwPrd8;
    }

    public Character getLmtdNetwPrd9() {
        return lmtdNetwPrd9;
    }

    public void setLmtdNetwPrd9(Character lmtdNetwPrd9) {
        this.lmtdNetwPrd9 = lmtdNetwPrd9;
    }

    public Character getLmtdNetwPrdA() {
        return lmtdNetwPrdA;
    }

    public void setLmtdNetwPrdA(Character lmtdNetwPrdA) {
        this.lmtdNetwPrdA = lmtdNetwPrdA;
    }

    public Character getLmtdNetwPrdB() {
        return lmtdNetwPrdB;
    }

    public void setLmtdNetwPrdB(Character lmtdNetwPrdB) {
        this.lmtdNetwPrdB = lmtdNetwPrdB;
    }

    public Character getLmtdNetwPrdC() {
        return lmtdNetwPrdC;
    }

    public void setLmtdNetwPrdC(Character lmtdNetwPrdC) {
        this.lmtdNetwPrdC = lmtdNetwPrdC;
    }

    public Character getLmtdNetwPrdD() {
        return lmtdNetwPrdD;
    }

    public void setLmtdNetwPrdD(Character lmtdNetwPrdD) {
        this.lmtdNetwPrdD = lmtdNetwPrdD;
    }

    public Character getLmtdNetwPrdE() {
        return lmtdNetwPrdE;
    }

    public void setLmtdNetwPrdE(Character lmtdNetwPrdE) {
        this.lmtdNetwPrdE = lmtdNetwPrdE;
    }

    public Character getLmtdNetwPrdF() {
        return lmtdNetwPrdF;
    }

    public void setLmtdNetwPrdF(Character lmtdNetwPrdF) {
        this.lmtdNetwPrdF = lmtdNetwPrdF;
    }

    public Character getLmtdNetwPrdG() {
        return lmtdNetwPrdG;
    }

    public void setLmtdNetwPrdG(Character lmtdNetwPrdG) {
        this.lmtdNetwPrdG = lmtdNetwPrdG;
    }

    public Character getLmtdNetwPrdH() {
        return lmtdNetwPrdH;
    }

    public void setLmtdNetwPrdH(Character lmtdNetwPrdH) {
        this.lmtdNetwPrdH = lmtdNetwPrdH;
    }

    public Character getLmtdNetwPrdI() {
        return lmtdNetwPrdI;
    }

    public void setLmtdNetwPrdI(Character lmtdNetwPrdI) {
        this.lmtdNetwPrdI = lmtdNetwPrdI;
    }

    public Character getLmtdNetwPrdJ() {
        return lmtdNetwPrdJ;
    }

    public void setLmtdNetwPrdJ(Character lmtdNetwPrdJ) {
        this.lmtdNetwPrdJ = lmtdNetwPrdJ;
    }

    public Character getLmtdNetwPrdK() {
        return lmtdNetwPrdK;
    }

    public void setLmtdNetwPrdK(Character lmtdNetwPrdK) {
        this.lmtdNetwPrdK = lmtdNetwPrdK;
    }

    public Character getLmtdNetwPrdL() {
        return lmtdNetwPrdL;
    }

    public void setLmtdNetwPrdL(Character lmtdNetwPrdL) {
        this.lmtdNetwPrdL = lmtdNetwPrdL;
    }

    public Character getLmtdNetwPrdM() {
        return lmtdNetwPrdM;
    }

    public void setLmtdNetwPrdM(Character lmtdNetwPrdM) {
        this.lmtdNetwPrdM = lmtdNetwPrdM;
    }

    public Character getLmtdNetwPrdN() {
        return lmtdNetwPrdN;
    }

    public void setLmtdNetwPrdN(Character lmtdNetwPrdN) {
        this.lmtdNetwPrdN = lmtdNetwPrdN;
    }

    public Character getLmtdNetwPrdO() {
        return lmtdNetwPrdO;
    }

    public void setLmtdNetwPrdO(Character lmtdNetwPrdO) {
        this.lmtdNetwPrdO = lmtdNetwPrdO;
    }

    public Character getLmtdNetwPrdP() {
        return lmtdNetwPrdP;
    }

    public void setLmtdNetwPrdP(Character lmtdNetwPrdP) {
        this.lmtdNetwPrdP = lmtdNetwPrdP;
    }

    public Character getLmtdNetwPrdQ() {
        return lmtdNetwPrdQ;
    }

    public void setLmtdNetwPrdQ(Character lmtdNetwPrdQ) {
        this.lmtdNetwPrdQ = lmtdNetwPrdQ;
    }

    public Character getLmtdNetwPrdR() {
        return lmtdNetwPrdR;
    }

    public void setLmtdNetwPrdR(Character lmtdNetwPrdR) {
        this.lmtdNetwPrdR = lmtdNetwPrdR;
    }

    public Character getLmtdNetwPrdS() {
        return lmtdNetwPrdS;
    }

    public void setLmtdNetwPrdS(Character lmtdNetwPrdS) {
        this.lmtdNetwPrdS = lmtdNetwPrdS;
    }

    public Character getLmtdNetwPrdT() {
        return lmtdNetwPrdT;
    }

    public void setLmtdNetwPrdT(Character lmtdNetwPrdT) {
        this.lmtdNetwPrdT = lmtdNetwPrdT;
    }

    public Character getLmtdNetwPrdU() {
        return lmtdNetwPrdU;
    }

    public void setLmtdNetwPrdU(Character lmtdNetwPrdU) {
        this.lmtdNetwPrdU = lmtdNetwPrdU;
    }

    public Character getLmtdNetwPrdV() {
        return lmtdNetwPrdV;
    }

    public void setLmtdNetwPrdV(Character lmtdNetwPrdV) {
        this.lmtdNetwPrdV = lmtdNetwPrdV;
    }

    public Character getLmtdNetwPrdW() {
        return lmtdNetwPrdW;
    }

    public void setLmtdNetwPrdW(Character lmtdNetwPrdW) {
        this.lmtdNetwPrdW = lmtdNetwPrdW;
    }

    public Character getLmtdNetwPrdX() {
        return lmtdNetwPrdX;
    }

    public void setLmtdNetwPrdX(Character lmtdNetwPrdX) {
        this.lmtdNetwPrdX = lmtdNetwPrdX;
    }

    public Character getLmtdNetwPrdY() {
        return lmtdNetwPrdY;
    }

    public void setLmtdNetwPrdY(Character lmtdNetwPrdY) {
        this.lmtdNetwPrdY = lmtdNetwPrdY;
    }

    public Character getLmtdNetwPrdZ() {
        return lmtdNetwPrdZ;
    }

    public void setLmtdNetwPrdZ(Character lmtdNetwPrdZ) {
        this.lmtdNetwPrdZ = lmtdNetwPrdZ;
    }

    public Character getDbFlg() {
        return dbFlg;
    }

    public void setDbFlg(Character dbFlg) {
        this.dbFlg = dbFlg;
    }

    public Character getDbPrdFuel() {
        return dbPrdFuel;
    }

    public void setDbPrdFuel(Character dbPrdFuel) {
        this.dbPrdFuel = dbPrdFuel;
    }

    public Character getDbPrdOil() {
        return dbPrdOil;
    }

    public void setDbPrdOil(Character dbPrdOil) {
        this.dbPrdOil = dbPrdOil;
    }

    public Character getDbPrdCash() {
        return dbPrdCash;
    }

    public void setDbPrdCash(Character dbPrdCash) {
        this.dbPrdCash = dbPrdCash;
    }

    public Character getDbPrd0() {
        return dbPrd0;
    }

    public void setDbPrd0(Character dbPrd0) {
        this.dbPrd0 = dbPrd0;
    }

    public Character getDbPrd1() {
        return dbPrd1;
    }

    public void setDbPrd1(Character dbPrd1) {
        this.dbPrd1 = dbPrd1;
    }

    public Character getDbPrd2() {
        return dbPrd2;
    }

    public void setDbPrd2(Character dbPrd2) {
        this.dbPrd2 = dbPrd2;
    }

    public Character getDbPrd3() {
        return dbPrd3;
    }

    public void setDbPrd3(Character dbPrd3) {
        this.dbPrd3 = dbPrd3;
    }

    public Character getDbPrd4() {
        return dbPrd4;
    }

    public void setDbPrd4(Character dbPrd4) {
        this.dbPrd4 = dbPrd4;
    }

    public Character getDbPrd5() {
        return dbPrd5;
    }

    public void setDbPrd5(Character dbPrd5) {
        this.dbPrd5 = dbPrd5;
    }

    public Character getDbPrd6() {
        return dbPrd6;
    }

    public void setDbPrd6(Character dbPrd6) {
        this.dbPrd6 = dbPrd6;
    }

    public Character getDbPrd7() {
        return dbPrd7;
    }

    public void setDbPrd7(Character dbPrd7) {
        this.dbPrd7 = dbPrd7;
    }

    public Character getDbPrd8() {
        return dbPrd8;
    }

    public void setDbPrd8(Character dbPrd8) {
        this.dbPrd8 = dbPrd8;
    }

    public Character getDbPrd9() {
        return dbPrd9;
    }

    public void setDbPrd9(Character dbPrd9) {
        this.dbPrd9 = dbPrd9;
    }

    public Character getDbPrdA() {
        return dbPrdA;
    }

    public void setDbPrdA(Character dbPrdA) {
        this.dbPrdA = dbPrdA;
    }

    public Character getDbPrdB() {
        return dbPrdB;
    }

    public void setDbPrdB(Character dbPrdB) {
        this.dbPrdB = dbPrdB;
    }

    public Character getDbPrdC() {
        return dbPrdC;
    }

    public void setDbPrdC(Character dbPrdC) {
        this.dbPrdC = dbPrdC;
    }

    public Character getDbPrdD() {
        return dbPrdD;
    }

    public void setDbPrdD(Character dbPrdD) {
        this.dbPrdD = dbPrdD;
    }

    public Character getDbPrdE() {
        return dbPrdE;
    }

    public void setDbPrdE(Character dbPrdE) {
        this.dbPrdE = dbPrdE;
    }

    public Character getDbPrdF() {
        return dbPrdF;
    }

    public void setDbPrdF(Character dbPrdF) {
        this.dbPrdF = dbPrdF;
    }

    public Character getDbPrdG() {
        return dbPrdG;
    }

    public void setDbPrdG(Character dbPrdG) {
        this.dbPrdG = dbPrdG;
    }

    public Character getDbPrdH() {
        return dbPrdH;
    }

    public void setDbPrdH(Character dbPrdH) {
        this.dbPrdH = dbPrdH;
    }

    public Character getDbPrdI() {
        return dbPrdI;
    }

    public void setDbPrdI(Character dbPrdI) {
        this.dbPrdI = dbPrdI;
    }

    public Character getDbPrdJ() {
        return dbPrdJ;
    }

    public void setDbPrdJ(Character dbPrdJ) {
        this.dbPrdJ = dbPrdJ;
    }

    public Character getDbPrdK() {
        return dbPrdK;
    }

    public void setDbPrdK(Character dbPrdK) {
        this.dbPrdK = dbPrdK;
    }

    public Character getDbPrdL() {
        return dbPrdL;
    }

    public void setDbPrdL(Character dbPrdL) {
        this.dbPrdL = dbPrdL;
    }

    public Character getDbPrdM() {
        return dbPrdM;
    }

    public void setDbPrdM(Character dbPrdM) {
        this.dbPrdM = dbPrdM;
    }

    public Character getDbPrdN() {
        return dbPrdN;
    }

    public void setDbPrdN(Character dbPrdN) {
        this.dbPrdN = dbPrdN;
    }

    public Character getDbPrdO() {
        return dbPrdO;
    }

    public void setDbPrdO(Character dbPrdO) {
        this.dbPrdO = dbPrdO;
    }

    public Character getDbPrdP() {
        return dbPrdP;
    }

    public void setDbPrdP(Character dbPrdP) {
        this.dbPrdP = dbPrdP;
    }

    public Character getDbPrdQ() {
        return dbPrdQ;
    }

    public void setDbPrdQ(Character dbPrdQ) {
        this.dbPrdQ = dbPrdQ;
    }

    public Character getDbPrdR() {
        return dbPrdR;
    }

    public void setDbPrdR(Character dbPrdR) {
        this.dbPrdR = dbPrdR;
    }

    public Character getDbPrdS() {
        return dbPrdS;
    }

    public void setDbPrdS(Character dbPrdS) {
        this.dbPrdS = dbPrdS;
    }

    public Character getDbPrdT() {
        return dbPrdT;
    }

    public void setDbPrdT(Character dbPrdT) {
        this.dbPrdT = dbPrdT;
    }

    public Character getDbPrdU() {
        return dbPrdU;
    }

    public void setDbPrdU(Character dbPrdU) {
        this.dbPrdU = dbPrdU;
    }

    public Character getDbPrdV() {
        return dbPrdV;
    }

    public void setDbPrdV(Character dbPrdV) {
        this.dbPrdV = dbPrdV;
    }

    public Character getDbPrdW() {
        return dbPrdW;
    }

    public void setDbPrdW(Character dbPrdW) {
        this.dbPrdW = dbPrdW;
    }

    public Character getDbPrdX() {
        return dbPrdX;
    }

    public void setDbPrdX(Character dbPrdX) {
        this.dbPrdX = dbPrdX;
    }

    public Character getDbPrdY() {
        return dbPrdY;
    }

    public void setDbPrdY(Character dbPrdY) {
        this.dbPrdY = dbPrdY;
    }

    public Character getDbPrdZ() {
        return dbPrdZ;
    }

    public void setDbPrdZ(Character dbPrdZ) {
        this.dbPrdZ = dbPrdZ;
    }

    public Character getFocusDiscTyp() {
        return focusDiscTyp;
    }

    public void setFocusDiscTyp(Character focusDiscTyp) {
        this.focusDiscTyp = focusDiscTyp;
    }

    public BigDecimal getFocusCpgTotDisc() {
        return focusCpgTotDisc;
    }

    public void setFocusCpgTotDisc(BigDecimal focusCpgTotDisc) {
        this.focusCpgTotDisc = focusCpgTotDisc;
    }

    public BigDecimal getFocusCpgNet() {
        return focusCpgNet;
    }

    public void setFocusCpgNet(BigDecimal focusCpgNet) {
        this.focusCpgNet = focusCpgNet;
    }

    public BigDecimal getFocusCpgRebate() {
        return focusCpgRebate;
    }

    public void setFocusCpgRebate(BigDecimal focusCpgRebate) {
        this.focusCpgRebate = focusCpgRebate;
    }

    public BigDecimal getFocusCpgRetained() {
        return focusCpgRetained;
    }

    public void setFocusCpgRetained(BigDecimal focusCpgRetained) {
        this.focusCpgRetained = focusCpgRetained;
    }

    public String getFocusCpgUseCd() {
        return focusCpgUseCd;
    }

    public void setFocusCpgUseCd(String focusCpgUseCd) {
        this.focusCpgUseCd = focusCpgUseCd;
    }

    public BigDecimal getFocusPofTotDisc() {
        return focusPofTotDisc;
    }

    public void setFocusPofTotDisc(BigDecimal focusPofTotDisc) {
        this.focusPofTotDisc = focusPofTotDisc;
    }

    public BigDecimal getFocusPofNet() {
        return focusPofNet;
    }

    public void setFocusPofNet(BigDecimal focusPofNet) {
        this.focusPofNet = focusPofNet;
    }

    public BigDecimal getFocusPofRebate() {
        return focusPofRebate;
    }

    public void setFocusPofRebate(BigDecimal focusPofRebate) {
        this.focusPofRebate = focusPofRebate;
    }

    public BigDecimal getFocusPofRetained() {
        return focusPofRetained;
    }

    public void setFocusPofRetained(BigDecimal focusPofRetained) {
        this.focusPofRetained = focusPofRetained;
    }

    public String getFocusPofUseCd() {
        return focusPofUseCd;
    }

    public void setFocusPofUseCd(String focusPofUseCd) {
        this.focusPofUseCd = focusPofUseCd;
    }

    public BigDecimal getFocusFlatTotDisc() {
        return focusFlatTotDisc;
    }

    public void setFocusFlatTotDisc(BigDecimal focusFlatTotDisc) {
        this.focusFlatTotDisc = focusFlatTotDisc;
    }

    public BigDecimal getFocusFlatNet() {
        return focusFlatNet;
    }

    public void setFocusFlatNet(BigDecimal focusFlatNet) {
        this.focusFlatNet = focusFlatNet;
    }

    public BigDecimal getFocusFlatRebate() {
        return focusFlatRebate;
    }

    public void setFocusFlatRebate(BigDecimal focusFlatRebate) {
        this.focusFlatRebate = focusFlatRebate;
    }

    public BigDecimal getFocusFlatRetained() {
        return focusFlatRetained;
    }

    public void setFocusFlatRetained(BigDecimal focusFlatRetained) {
        this.focusFlatRetained = focusFlatRetained;
    }

    public String getFocusFlatUseCd() {
        return focusFlatUseCd;
    }

    public void setFocusFlatUseCd(String focusFlatUseCd) {
        this.focusFlatUseCd = focusFlatUseCd;
    }

    public BigDecimal getCoCustomFeeFndFuel() {
        return coCustomFeeFndFuel;
    }

    public void setCoCustomFeeFndFuel(BigDecimal coCustomFeeFndFuel) {
        this.coCustomFeeFndFuel = coCustomFeeFndFuel;
    }

    public BigDecimal getCoCustomFeeFndCash() {
        return coCustomFeeFndCash;
    }

    public void setCoCustomFeeFndCash(BigDecimal coCustomFeeFndCash) {
        this.coCustomFeeFndCash = coCustomFeeFndCash;
    }

    public BigDecimal getCoCustomFeeFndBoth() {
        return coCustomFeeFndBoth;
    }

    public void setCoCustomFeeFndBoth(BigDecimal coCustomFeeFndBoth) {
        this.coCustomFeeFndBoth = coCustomFeeFndBoth;
    }

    public BigDecimal getCoCustomFeeDbFuel() {
        return coCustomFeeDbFuel;
    }

    public void setCoCustomFeeDbFuel(BigDecimal coCustomFeeDbFuel) {
        this.coCustomFeeDbFuel = coCustomFeeDbFuel;
    }

    public BigDecimal getCoCustomFeeDbCash() {
        return coCustomFeeDbCash;
    }

    public void setCoCustomFeeDbCash(BigDecimal coCustomFeeDbCash) {
        this.coCustomFeeDbCash = coCustomFeeDbCash;
    }

    public BigDecimal getCoCustomFeeDbBoth() {
        return coCustomFeeDbBoth;
    }

    public void setCoCustomFeeDbBoth(BigDecimal coCustomFeeDbBoth) {
        this.coCustomFeeDbBoth = coCustomFeeDbBoth;
    }

    public BigDecimal getScCustomFeeFndFuel() {
        return scCustomFeeFndFuel;
    }

    public void setScCustomFeeFndFuel(BigDecimal scCustomFeeFndFuel) {
        this.scCustomFeeFndFuel = scCustomFeeFndFuel;
    }

    public BigDecimal getScCustomFeeFndCash() {
        return scCustomFeeFndCash;
    }

    public void setScCustomFeeFndCash(BigDecimal scCustomFeeFndCash) {
        this.scCustomFeeFndCash = scCustomFeeFndCash;
    }

    public BigDecimal getScCustomFeeFndBoth() {
        return scCustomFeeFndBoth;
    }

    public void setScCustomFeeFndBoth(BigDecimal scCustomFeeFndBoth) {
        this.scCustomFeeFndBoth = scCustomFeeFndBoth;
    }

    public BigDecimal getScCustomFeeDbFuel() {
        return scCustomFeeDbFuel;
    }

    public void setScCustomFeeDbFuel(BigDecimal scCustomFeeDbFuel) {
        this.scCustomFeeDbFuel = scCustomFeeDbFuel;
    }

    public BigDecimal getScCustomFeeDbCash() {
        return scCustomFeeDbCash;
    }

    public void setScCustomFeeDbCash(BigDecimal scCustomFeeDbCash) {
        this.scCustomFeeDbCash = scCustomFeeDbCash;
    }

    public BigDecimal getScCustomFeeDbBoth() {
        return scCustomFeeDbBoth;
    }

    public void setScCustomFeeDbBoth(BigDecimal scCustomFeeDbBoth) {
        this.scCustomFeeDbBoth = scCustomFeeDbBoth;
    }

    public BigDecimal getScCustomFeeVoiceChg() {
        return scCustomFeeVoiceChg;
    }

    public void setScCustomFeeVoiceChg(BigDecimal scCustomFeeVoiceChg) {
        this.scCustomFeeVoiceChg = scCustomFeeVoiceChg;
    }

    public Character getVolumeRebateTyp() {
        return volumeRebateTyp;
    }

    public void setVolumeRebateTyp(Character volumeRebateTyp) {
        this.volumeRebateTyp = volumeRebateTyp;
    }

    public int getVolumeRebateFrom1Qty() {
        return volumeRebateFrom1Qty;
    }

    public void setVolumeRebateFrom1Qty(int volumeRebateFrom1Qty) {
        this.volumeRebateFrom1Qty = volumeRebateFrom1Qty;
    }

    public int getVolumeRebateTo1Qty() {
        return volumeRebateTo1Qty;
    }

    public void setVolumeRebateTo1Qty(int volumeRebateTo1Qty) {
        this.volumeRebateTo1Qty = volumeRebateTo1Qty;
    }

    public BigDecimal getVolumeRebateCents1() {
        return volumeRebateCents1;
    }

    public void setVolumeRebateCents1(BigDecimal volumeRebateCents1) {
        this.volumeRebateCents1 = volumeRebateCents1;
    }

    public int getVolumeRebateFrom2Qty() {
        return volumeRebateFrom2Qty;
    }

    public void setVolumeRebateFrom2Qty(int volumeRebateFrom2Qty) {
        this.volumeRebateFrom2Qty = volumeRebateFrom2Qty;
    }

    public int getVolumeRebateTo2Qty() {
        return volumeRebateTo2Qty;
    }

    public void setVolumeRebateTo2Qty(int volumeRebateTo2Qty) {
        this.volumeRebateTo2Qty = volumeRebateTo2Qty;
    }

    public BigDecimal getVolumeRebateCents2() {
        return volumeRebateCents2;
    }

    public void setVolumeRebateCents2(BigDecimal volumeRebateCents2) {
        this.volumeRebateCents2 = volumeRebateCents2;
    }

    public int getVolumeRebateFrom3Qty() {
        return volumeRebateFrom3Qty;
    }

    public void setVolumeRebateFrom3Qty(int volumeRebateFrom3Qty) {
        this.volumeRebateFrom3Qty = volumeRebateFrom3Qty;
    }

    public int getVolumeRebateTo3Qty() {
        return volumeRebateTo3Qty;
    }

    public void setVolumeRebateTo3Qty(int volumeRebateTo3Qty) {
        this.volumeRebateTo3Qty = volumeRebateTo3Qty;
    }

    public BigDecimal getVolumeRebateCents3() {
        return volumeRebateCents3;
    }

    public void setVolumeRebateCents3(BigDecimal volumeRebateCents3) {
        this.volumeRebateCents3 = volumeRebateCents3;
    }

    public int getVolumeRebateFrom4Qty() {
        return volumeRebateFrom4Qty;
    }

    public void setVolumeRebateFrom4Qty(int volumeRebateFrom4Qty) {
        this.volumeRebateFrom4Qty = volumeRebateFrom4Qty;
    }

    public int getVolumeRebateTo4Qty() {
        return volumeRebateTo4Qty;
    }

    public void setVolumeRebateTo4Qty(int volumeRebateTo4Qty) {
        this.volumeRebateTo4Qty = volumeRebateTo4Qty;
    }

    public BigDecimal getVolumeRebateCents4() {
        return volumeRebateCents4;
    }

    public void setVolumeRebateCents4(BigDecimal volumeRebateCents4) {
        this.volumeRebateCents4 = volumeRebateCents4;
    }

    public int getVolumeRebateFrom5Qty() {
        return volumeRebateFrom5Qty;
    }

    public void setVolumeRebateFrom5Qty(int volumeRebateFrom5Qty) {
        this.volumeRebateFrom5Qty = volumeRebateFrom5Qty;
    }

    public int getVolumeRebateTo5Qty() {
        return volumeRebateTo5Qty;
    }

    public void setVolumeRebateTo5Qty(int volumeRebateTo5Qty) {
        this.volumeRebateTo5Qty = volumeRebateTo5Qty;
    }

    public BigDecimal getVolumeRebateCents5() {
        return volumeRebateCents5;
    }

    public void setVolumeRebateCents5(BigDecimal volumeRebateCents5) {
        this.volumeRebateCents5 = volumeRebateCents5;
    }

    public int getVolumeRebateFrom6Qty() {
        return volumeRebateFrom6Qty;
    }

    public void setVolumeRebateFrom6Qty(int volumeRebateFrom6Qty) {
        this.volumeRebateFrom6Qty = volumeRebateFrom6Qty;
    }

    public int getVolumeRebateTo6Qty() {
        return volumeRebateTo6Qty;
    }

    public void setVolumeRebateTo6Qty(int volumeRebateTo6Qty) {
        this.volumeRebateTo6Qty = volumeRebateTo6Qty;
    }

    public BigDecimal getVolumeRebateCents6() {
        return volumeRebateCents6;
    }

    public void setVolumeRebateCents6(BigDecimal volumeRebateCents6) {
        this.volumeRebateCents6 = volumeRebateCents6;
    }

    public int getVolumeRebateFrom7Qty() {
        return volumeRebateFrom7Qty;
    }

    public void setVolumeRebateFrom7Qty(int volumeRebateFrom7Qty) {
        this.volumeRebateFrom7Qty = volumeRebateFrom7Qty;
    }

    public int getVolumeRebateTo7Qty() {
        return volumeRebateTo7Qty;
    }

    public void setVolumeRebateTo7Qty(int volumeRebateTo7Qty) {
        this.volumeRebateTo7Qty = volumeRebateTo7Qty;
    }

    public BigDecimal getVolumeRebateCents7() {
        return volumeRebateCents7;
    }

    public void setVolumeRebateCents7(BigDecimal volumeRebateCents7) {
        this.volumeRebateCents7 = volumeRebateCents7;
    }

    public int getVolumeRebateFrom8Qty() {
        return volumeRebateFrom8Qty;
    }

    public void setVolumeRebateFrom8Qty(int volumeRebateFrom8Qty) {
        this.volumeRebateFrom8Qty = volumeRebateFrom8Qty;
    }

    public int getVolumeRebateTo8Qty() {
        return volumeRebateTo8Qty;
    }

    public void setVolumeRebateTo8Qty(int volumeRebateTo8Qty) {
        this.volumeRebateTo8Qty = volumeRebateTo8Qty;
    }

    public BigDecimal getVolumeRebateCents8() {
        return volumeRebateCents8;
    }

    public void setVolumeRebateCents8(BigDecimal volumeRebateCents8) {
        this.volumeRebateCents8 = volumeRebateCents8;
    }

    public int getVolumeRebateFrom9Qty() {
        return volumeRebateFrom9Qty;
    }

    public void setVolumeRebateFrom9Qty(int volumeRebateFrom9Qty) {
        this.volumeRebateFrom9Qty = volumeRebateFrom9Qty;
    }

    public int getVolumeRebateTo9Qty() {
        return volumeRebateTo9Qty;
    }

    public void setVolumeRebateTo9Qty(int volumeRebateTo9Qty) {
        this.volumeRebateTo9Qty = volumeRebateTo9Qty;
    }

    public BigDecimal getVolumeRebateCents9() {
        return volumeRebateCents9;
    }

    public void setVolumeRebateCents9(BigDecimal volumeRebateCents9) {
        this.volumeRebateCents9 = volumeRebateCents9;
    }

    public int getVolumeRebateFrom10Qty() {
        return volumeRebateFrom10Qty;
    }

    public void setVolumeRebateFrom10Qty(int volumeRebateFrom10Qty) {
        this.volumeRebateFrom10Qty = volumeRebateFrom10Qty;
    }

    public int getVolumeRebateTo10Qty() {
        return volumeRebateTo10Qty;
    }

    public void setVolumeRebateTo10Qty(int volumeRebateTo10Qty) {
        this.volumeRebateTo10Qty = volumeRebateTo10Qty;
    }

    public BigDecimal getVolumeRebateCents10() {
        return volumeRebateCents10;
    }

    public void setVolumeRebateCents10(BigDecimal volumeRebateCents10) {
        this.volumeRebateCents10 = volumeRebateCents10;
    }

    public int getVolumeRebateFrom11Qty() {
        return volumeRebateFrom11Qty;
    }

    public void setVolumeRebateFrom11Qty(int volumeRebateFrom11Qty) {
        this.volumeRebateFrom11Qty = volumeRebateFrom11Qty;
    }

    public int getVolumeRebateTo11Qty() {
        return volumeRebateTo11Qty;
    }

    public void setVolumeRebateTo11Qty(int volumeRebateTo11Qty) {
        this.volumeRebateTo11Qty = volumeRebateTo11Qty;
    }

    public BigDecimal getVolumeRebateCents11() {
        return volumeRebateCents11;
    }

    public void setVolumeRebateCents11(BigDecimal volumeRebateCents11) {
        this.volumeRebateCents11 = volumeRebateCents11;
    }

    public int getVolumeRebateFrom12Qty() {
        return volumeRebateFrom12Qty;
    }

    public void setVolumeRebateFrom12Qty(int volumeRebateFrom12Qty) {
        this.volumeRebateFrom12Qty = volumeRebateFrom12Qty;
    }

    public int getVolumeRebateTo12Qty() {
        return volumeRebateTo12Qty;
    }

    public void setVolumeRebateTo12Qty(int volumeRebateTo12Qty) {
        this.volumeRebateTo12Qty = volumeRebateTo12Qty;
    }

    public BigDecimal getVolumeRebateCents12() {
        return volumeRebateCents12;
    }

    public void setVolumeRebateCents12(BigDecimal volumeRebateCents12) {
        this.volumeRebateCents12 = volumeRebateCents12;
    }

    public int getVolumeRebateFrom13Qty() {
        return volumeRebateFrom13Qty;
    }

    public void setVolumeRebateFrom13Qty(int volumeRebateFrom13Qty) {
        this.volumeRebateFrom13Qty = volumeRebateFrom13Qty;
    }

    public int getVolumeRebateTo13Qty() {
        return volumeRebateTo13Qty;
    }

    public void setVolumeRebateTo13Qty(int volumeRebateTo13Qty) {
        this.volumeRebateTo13Qty = volumeRebateTo13Qty;
    }

    public BigDecimal getVolumeRebateCents13() {
        return volumeRebateCents13;
    }

    public void setVolumeRebateCents13(BigDecimal volumeRebateCents13) {
        this.volumeRebateCents13 = volumeRebateCents13;
    }

    public int getVolumeRebateFrom14Qty() {
        return volumeRebateFrom14Qty;
    }

    public void setVolumeRebateFrom14Qty(int volumeRebateFrom14Qty) {
        this.volumeRebateFrom14Qty = volumeRebateFrom14Qty;
    }

    public int getVolumeRebateTo14Qty() {
        return volumeRebateTo14Qty;
    }

    public void setVolumeRebateTo14Qty(int volumeRebateTo14Qty) {
        this.volumeRebateTo14Qty = volumeRebateTo14Qty;
    }

    public BigDecimal getVolumeRebateCents14() {
        return volumeRebateCents14;
    }

    public void setVolumeRebateCents14(BigDecimal volumeRebateCents14) {
        this.volumeRebateCents14 = volumeRebateCents14;
    }

    public int getVolumeRebateFrom15Qty() {
        return volumeRebateFrom15Qty;
    }

    public void setVolumeRebateFrom15Qty(int volumeRebateFrom15Qty) {
        this.volumeRebateFrom15Qty = volumeRebateFrom15Qty;
    }

    public int getVolumeRebateTo15Qty() {
        return volumeRebateTo15Qty;
    }

    public void setVolumeRebateTo15Qty(int volumeRebateTo15Qty) {
        this.volumeRebateTo15Qty = volumeRebateTo15Qty;
    }

    public BigDecimal getVolumeRebateCents15() {
        return volumeRebateCents15;
    }

    public void setVolumeRebateCents15(BigDecimal volumeRebateCents15) {
        this.volumeRebateCents15 = volumeRebateCents15;
    }

    public int getVolumeRebateFrom16Qty() {
        return volumeRebateFrom16Qty;
    }

    public void setVolumeRebateFrom16Qty(int volumeRebateFrom16Qty) {
        this.volumeRebateFrom16Qty = volumeRebateFrom16Qty;
    }

    public int getVolumeRebateTo16Qty() {
        return volumeRebateTo16Qty;
    }

    public void setVolumeRebateTo16Qty(int volumeRebateTo16Qty) {
        this.volumeRebateTo16Qty = volumeRebateTo16Qty;
    }

    public BigDecimal getVolumeRebateCents16() {
        return volumeRebateCents16;
    }

    public void setVolumeRebateCents16(BigDecimal volumeRebateCents16) {
        this.volumeRebateCents16 = volumeRebateCents16;
    }

    public BigDecimal getTruckstopMarkup() {
        return truckstopMarkup;
    }

    public void setTruckstopMarkup(BigDecimal truckstopMarkup) {
        this.truckstopMarkup = truckstopMarkup;
    }

    public BigDecimal getComdataMarkup() {
        return comdataMarkup;
    }

    public void setComdataMarkup(BigDecimal comdataMarkup) {
        this.comdataMarkup = comdataMarkup;
    }

    public Character getCpSttaxRateFlg() {
        return cpSttaxRateFlg;
    }

    public void setCpSttaxRateFlg(Character cpSttaxRateFlg) {
        this.cpSttaxRateFlg = cpSttaxRateFlg;
    }

    public BigDecimal getCpSttaxRateTractor() {
        return cpSttaxRateTractor;
    }

    public void setCpSttaxRateTractor(BigDecimal cpSttaxRateTractor) {
        this.cpSttaxRateTractor = cpSttaxRateTractor;
    }

    public BigDecimal getCpSttaxRateReefer() {
        return cpSttaxRateReefer;
    }

    public void setCpSttaxRateReefer(BigDecimal cpSttaxRateReefer) {
        this.cpSttaxRateReefer = cpSttaxRateReefer;
    }

    public Character getCpMaxAllowPriceFlg() {
        return cpMaxAllowPriceFlg;
    }

    public void setCpMaxAllowPriceFlg(Character cpMaxAllowPriceFlg) {
        this.cpMaxAllowPriceFlg = cpMaxAllowPriceFlg;
    }

    public Character getCostPlusActiveCd() {
        return costPlusActiveCd;
    }

    public void setCostPlusActiveCd(Character costPlusActiveCd) {
        this.costPlusActiveCd = costPlusActiveCd;
    }

    public String getCpRackCityNbr() {
        return cpRackCityNbr;
    }

    public void setCpRackCityNbr(String cpRackCityNbr) {
        this.cpRackCityNbr = cpRackCityNbr;
    }

    public String getCpRackSupplierNbr() {
        return cpRackSupplierNbr;
    }

    public void setCpRackSupplierNbr(String cpRackSupplierNbr) {
        this.cpRackSupplierNbr = cpRackSupplierNbr;
    }

    public Character getCpRackTypeFlg() {
        return cpRackTypeFlg;
    }

    public void setCpRackTypeFlg(Character cpRackTypeFlg) {
        this.cpRackTypeFlg = cpRackTypeFlg;
    }

    public Character getCpRackUpdateSu() {
        return cpRackUpdateSu;
    }

    public void setCpRackUpdateSu(Character cpRackUpdateSu) {
        this.cpRackUpdateSu = cpRackUpdateSu;
    }

    public Character getCpRackUpdateMo() {
        return cpRackUpdateMo;
    }

    public void setCpRackUpdateMo(Character cpRackUpdateMo) {
        this.cpRackUpdateMo = cpRackUpdateMo;
    }

    public Character getCpRackUpdateTu() {
        return cpRackUpdateTu;
    }

    public void setCpRackUpdateTu(Character cpRackUpdateTu) {
        this.cpRackUpdateTu = cpRackUpdateTu;
    }

    public Character getCpRackUpdateWe() {
        return cpRackUpdateWe;
    }

    public void setCpRackUpdateWe(Character cpRackUpdateWe) {
        this.cpRackUpdateWe = cpRackUpdateWe;
    }

    public Character getCpRackUpdateTh() {
        return cpRackUpdateTh;
    }

    public void setCpRackUpdateTh(Character cpRackUpdateTh) {
        this.cpRackUpdateTh = cpRackUpdateTh;
    }

    public Character getCpRackUpdateFr() {
        return cpRackUpdateFr;
    }

    public void setCpRackUpdateFr(Character cpRackUpdateFr) {
        this.cpRackUpdateFr = cpRackUpdateFr;
    }

    public Character getCpRackUpdateSa() {
        return cpRackUpdateSa;
    }

    public void setCpRackUpdateSa(Character cpRackUpdateSa) {
        this.cpRackUpdateSa = cpRackUpdateSa;
    }

    public Character getCpFirstPpgFlg() {
        return cpFirstPpgFlg;
    }

    public void setCpFirstPpgFlg(Character cpFirstPpgFlg) {
        this.cpFirstPpgFlg = cpFirstPpgFlg;
    }

    public BigDecimal getCpFirstPpgAmt() {
        return cpFirstPpgAmt;
    }

    public void setCpFirstPpgAmt(BigDecimal cpFirstPpgAmt) {
        this.cpFirstPpgAmt = cpFirstPpgAmt;
    }

    public Character getCpRemainPpgFlg() {
        return cpRemainPpgFlg;
    }

    public void setCpRemainPpgFlg(Character cpRemainPpgFlg) {
        this.cpRemainPpgFlg = cpRemainPpgFlg;
    }

    public int getCreditLimitDaily() {
        return creditLimitDaily;
    }

    public void setCreditLimitDaily(int creditLimitDaily) {
        this.creditLimitDaily = creditLimitDaily;
    }

    public int getCreditLimitTemp() {
        return creditLimitTemp;
    }

    public void setCreditLimitTemp(int creditLimitTemp) {
        this.creditLimitTemp = creditLimitTemp;
    }

    public int getCreditLimitUsed() {
        return creditLimitUsed;
    }

    public void setCreditLimitUsed(int creditLimitUsed) {
        this.creditLimitUsed = creditLimitUsed;
    }

    public Character getCcComdataCompleteCd() {
        return ccComdataCompleteCd;
    }

    public void setCcComdataCompleteCd(Character ccComdataCompleteCd) {
        this.ccComdataCompleteCd = ccComdataCompleteCd;
    }

    public Character getCcStatusCd() {
        return ccStatusCd;
    }

    public void setCcStatusCd(Character ccStatusCd) {
        this.ccStatusCd = ccStatusCd;
    }

    public int getCcCreditLimit() {
        return ccCreditLimit;
    }

    public void setCcCreditLimit(int ccCreditLimit) {
        this.ccCreditLimit = ccCreditLimit;
    }

    public BigDecimal getCcCreditUsedDaily() {
        return ccCreditUsedDaily;
    }

    public void setCcCreditUsedDaily(BigDecimal ccCreditUsedDaily) {
        this.ccCreditUsedDaily = ccCreditUsedDaily;
    }

    public BigDecimal getCcCreditUsed() {
        return ccCreditUsed;
    }

    public void setCcCreditUsed(BigDecimal ccCreditUsed) {
        this.ccCreditUsed = ccCreditUsed;
    }

    public Date getCcLastPayDt() {
        return ccLastPayDt;
    }

    public void setCcLastPayDt(Date ccLastPayDt) {
        this.ccLastPayDt = ccLastPayDt;
    }

    public Character getCcStatusNewCd() {
        return ccStatusNewCd;
    }

    public void setCcStatusNewCd(Character ccStatusNewCd) {
        this.ccStatusNewCd = ccStatusNewCd;
    }

    public Date getCcStatusNewDt() {
        return ccStatusNewDt;
    }

    public void setCcStatusNewDt(Date ccStatusNewDt) {
        this.ccStatusNewDt = ccStatusNewDt;
    }

    public Character getSettlePaycylCd() {
        return settlePaycylCd;
    }

    public void setSettlePaycylCd(Character settlePaycylCd) {
        this.settlePaycylCd = settlePaycylCd;
    }

    public String getSettleDaycylCd() {
        return settleDaycylCd;
    }

    public void setSettleDaycylCd(String settleDaycylCd) {
        this.settleDaycylCd = settleDaycylCd;
    }

    public String getSettleDelayCycleCd() {
        return settleDelayCycleCd;
    }

    public void setSettleDelayCycleCd(String settleDelayCycleCd) {
        this.settleDelayCycleCd = settleDelayCycleCd;
    }

    public Character getNegotiatedPriceFlg() {
        return negotiatedPriceFlg;
    }

    public void setNegotiatedPriceFlg(Character negotiatedPriceFlg) {
        this.negotiatedPriceFlg = negotiatedPriceFlg;
    }

    public Character getBulkFuelFlg() {
        return bulkFuelFlg;
    }

    public void setBulkFuelFlg(Character bulkFuelFlg) {
        this.bulkFuelFlg = bulkFuelFlg;
    }

    public Character getComdataTempCd() {
        return comdataTempCd;
    }

    public void setComdataTempCd(Character comdataTempCd) {
        this.comdataTempCd = comdataTempCd;
    }

    public Character getBridgeFlg() {
        return bridgeFlg;
    }

    public void setBridgeFlg(Character bridgeFlg) {
        this.bridgeFlg = bridgeFlg;
    }

    public String getMaxAllowedQty() {
        return maxAllowedQty;
    }

    public void setMaxAllowedQty(String maxAllowedQty) {
        this.maxAllowedQty = maxAllowedQty;
    }

    public Character getTermFuelFlg() {
        return termFuelFlg;
    }

    public void setTermFuelFlg(Character termFuelFlg) {
        this.termFuelFlg = termFuelFlg;
    }

    public Character getPreferLevelFlg() {
        return preferLevelFlg;
    }

    public void setPreferLevelFlg(Character preferLevelFlg) {
        this.preferLevelFlg = preferLevelFlg;
    }

    public Character getInNetwFlg() {
        return inNetwFlg;
    }

    public void setInNetwFlg(Character inNetwFlg) {
        this.inNetwFlg = inNetwFlg;
    }

    public Character getAllowKeyedCardFlg() {
        return allowKeyedCardFlg;
    }

    public void setAllowKeyedCardFlg(Character allowKeyedCardFlg) {
        this.allowKeyedCardFlg = allowKeyedCardFlg;
    }

    public Character getComfuelFlg() {
        return comfuelFlg;
    }

    public void setComfuelFlg(Character comfuelFlg) {
        this.comfuelFlg = comfuelFlg;
    }

    public Character getDiscUpdateCd() {
        return discUpdateCd;
    }

    public void setDiscUpdateCd(Character discUpdateCd) {
        this.discUpdateCd = discUpdateCd;
    }

    public Character getCreditPricedFlg() {
        return creditPricedFlg;
    }

    public void setCreditPricedFlg(Character creditPricedFlg) {
        this.creditPricedFlg = creditPricedFlg;
    }

    public Character getSendNetAmtMsgFlg() {
        return sendNetAmtMsgFlg;
    }

    public void setSendNetAmtMsgFlg(Character sendNetAmtMsgFlg) {
        this.sendNetAmtMsgFlg = sendNetAmtMsgFlg;
    }

    public BigDecimal getCoFeePercentDisc() {
        return coFeePercentDisc;
    }

    public void setCoFeePercentDisc(BigDecimal coFeePercentDisc) {
        this.coFeePercentDisc = coFeePercentDisc;
    }

    public BigDecimal getCoFeeFlatDisc() {
        return coFeeFlatDisc;
    }

    public void setCoFeeFlatDisc(BigDecimal coFeeFlatDisc) {
        this.coFeeFlatDisc = coFeeFlatDisc;
    }

    public int getCoFeeDiscCutoff() {
        return coFeeDiscCutoff;
    }

    public void setCoFeeDiscCutoff(int coFeeDiscCutoff) {
        this.coFeeDiscCutoff = coFeeDiscCutoff;
    }

    public Character getNatsCd() {
        return natsCd;
    }

    public void setNatsCd(Character natsCd) {
        this.natsCd = natsCd;
    }

    public Character getCpFttaxRateFlg() {
        return cpFttaxRateFlg;
    }

    public void setCpFttaxRateFlg(Character cpFttaxRateFlg) {
        this.cpFttaxRateFlg = cpFttaxRateFlg;
    }

    public BigDecimal getCpFttaxRateTractor() {
        return cpFttaxRateTractor;
    }

    public void setCpFttaxRateTractor(BigDecimal cpFttaxRateTractor) {
        this.cpFttaxRateTractor = cpFttaxRateTractor;
    }

    public BigDecimal getCpFttaxRateReefer() {
        return cpFttaxRateReefer;
    }

    public void setCpFttaxRateReefer(BigDecimal cpFttaxRateReefer) {
        this.cpFttaxRateReefer = cpFttaxRateReefer;
    }

    public Character getCpSstaxRateFlg() {
        return cpSstaxRateFlg;
    }

    public void setCpSstaxRateFlg(Character cpSstaxRateFlg) {
        this.cpSstaxRateFlg = cpSstaxRateFlg;
    }

    public BigDecimal getCpSstaxRateTractor() {
        return cpSstaxRateTractor;
    }

    public void setCpSstaxRateTractor(BigDecimal cpSstaxRateTractor) {
        this.cpSstaxRateTractor = cpSstaxRateTractor;
    }

    public BigDecimal getCpSstaxRateReefer() {
        return cpSstaxRateReefer;
    }

    public void setCpSstaxRateReefer(BigDecimal cpSstaxRateReefer) {
        this.cpSstaxRateReefer = cpSstaxRateReefer;
    }

    public Character getCpLttaxRateFlg() {
        return cpLttaxRateFlg;
    }

    public void setCpLttaxRateFlg(Character cpLttaxRateFlg) {
        this.cpLttaxRateFlg = cpLttaxRateFlg;
    }

    public BigDecimal getCpLttaxRateTractor() {
        return cpLttaxRateTractor;
    }

    public void setCpLttaxRateTractor(BigDecimal cpLttaxRateTractor) {
        this.cpLttaxRateTractor = cpLttaxRateTractor;
    }

    public BigDecimal getCpLttaxRateReefer() {
        return cpLttaxRateReefer;
    }

    public void setCpLttaxRateReefer(BigDecimal cpLttaxRateReefer) {
        this.cpLttaxRateReefer = cpLttaxRateReefer;
    }

    public Character getCpTptaxRateFlg() {
        return cpTptaxRateFlg;
    }

    public void setCpTptaxRateFlg(Character cpTptaxRateFlg) {
        this.cpTptaxRateFlg = cpTptaxRateFlg;
    }

    public BigDecimal getCpTptaxRateTractor() {
        return cpTptaxRateTractor;
    }

    public void setCpTptaxRateTractor(BigDecimal cpTptaxRateTractor) {
        this.cpTptaxRateTractor = cpTptaxRateTractor;
    }

    public BigDecimal getCpTptaxRateReefer() {
        return cpTptaxRateReefer;
    }

    public void setCpTptaxRateReefer(BigDecimal cpTptaxRateReefer) {
        this.cpTptaxRateReefer = cpTptaxRateReefer;
    }

    public Character getCpMstaxRateFlg() {
        return cpMstaxRateFlg;
    }

    public void setCpMstaxRateFlg(Character cpMstaxRateFlg) {
        this.cpMstaxRateFlg = cpMstaxRateFlg;
    }

    public BigDecimal getCpMstaxRateTractor() {
        return cpMstaxRateTractor;
    }

    public void setCpMstaxRateTractor(BigDecimal cpMstaxRateTractor) {
        this.cpMstaxRateTractor = cpMstaxRateTractor;
    }

    public BigDecimal getCpMstaxRateReefer() {
        return cpMstaxRateReefer;
    }

    public void setCpMstaxRateReefer(BigDecimal cpMstaxRateReefer) {
        this.cpMstaxRateReefer = cpMstaxRateReefer;
    }

    public Character getCpSataxRateFlg() {
        return cpSataxRateFlg;
    }

    public void setCpSataxRateFlg(Character cpSataxRateFlg) {
        this.cpSataxRateFlg = cpSataxRateFlg;
    }

    public BigDecimal getCpSataxRateTractor() {
        return cpSataxRateTractor;
    }

    public void setCpSataxRateTractor(BigDecimal cpSataxRateTractor) {
        this.cpSataxRateTractor = cpSataxRateTractor;
    }

    public BigDecimal getCpSataxRateReefer() {
        return cpSataxRateReefer;
    }

    public void setCpSataxRateReefer(BigDecimal cpSataxRateReefer) {
        this.cpSataxRateReefer = cpSataxRateReefer;
    }

    public String getCpMiscellaneousText() {
        return cpMiscellaneousText;
    }

    public void setCpMiscellaneousText(String cpMiscellaneousText) {
        this.cpMiscellaneousText = cpMiscellaneousText;
    }

    public Character getRmfFlg() {
        return rmfFlg;
    }

    public void setRmfFlg(Character rmfFlg) {
        this.rmfFlg = rmfFlg;
    }

    public BigDecimal getRmfCurPpg() {
        return rmfCurPpg;
    }

    public void setRmfCurPpg(BigDecimal rmfCurPpg) {
        this.rmfCurPpg = rmfCurPpg;
    }

    public BigDecimal getRmfPenPpg() {
        return rmfPenPpg;
    }

    public void setRmfPenPpg(BigDecimal rmfPenPpg) {
        this.rmfPenPpg = rmfPenPpg;
    }

    public Date getRmfPpgActiveDt() {
        return rmfPpgActiveDt;
    }

    public void setRmfPpgActiveDt(Date rmfPpgActiveDt) {
        this.rmfPpgActiveDt = rmfPpgActiveDt;
    }

    public Character getOnetimeNetwFlg() {
        return onetimeNetwFlg;
    }

    public void setOnetimeNetwFlg(Character onetimeNetwFlg) {
        this.onetimeNetwFlg = onetimeNetwFlg;
    }

    public Character getOnetimeFuelFlg() {
        return onetimeFuelFlg;
    }

    public void setOnetimeFuelFlg(Character onetimeFuelFlg) {
        this.onetimeFuelFlg = onetimeFuelFlg;
    }

    public String getSettlePayTo() {
        return settlePayTo;
    }

    public void setSettlePayTo(String settlePayTo) {
        this.settlePayTo = settlePayTo;
    }

    public Character getPassagePlusFlg() {
        return passagePlusFlg;
    }

    public void setPassagePlusFlg(Character passagePlusFlg) {
        this.passagePlusFlg = passagePlusFlg;
    }

    public String getPrdfmrmLocTyp() {
        return prdfmrmLocTyp;
    }

    public void setPrdfmrmLocTyp(String prdfmrmLocTyp) {
        this.prdfmrmLocTyp = prdfmrmLocTyp;
    }

    public BigDecimal getFocusCpgG999Redc() {
        return focusCpgG999Redc;
    }

    public void setFocusCpgG999Redc(BigDecimal focusCpgG999Redc) {
        this.focusCpgG999Redc = focusCpgG999Redc;
    }

    public BigDecimal getFocusPofG999Redc() {
        return focusPofG999Redc;
    }

    public void setFocusPofG999Redc(BigDecimal focusPofG999Redc) {
        this.focusPofG999Redc = focusPofG999Redc;
    }

    public BigDecimal getFocusFlatG999Redc() {
        return focusFlatG999Redc;
    }

    public void setFocusFlatG999Redc(BigDecimal focusFlatG999Redc) {
        this.focusFlatG999Redc = focusFlatG999Redc;
    }

    public Character getCustomFeePrdCode0() {
        return customFeePrdCode0;
    }

    public void setCustomFeePrdCode0(Character customFeePrdCode0) {
        this.customFeePrdCode0 = customFeePrdCode0;
    }

    public Character getCustomFeePrdCode1() {
        return customFeePrdCode1;
    }

    public void setCustomFeePrdCode1(Character customFeePrdCode1) {
        this.customFeePrdCode1 = customFeePrdCode1;
    }

    public Character getCustomFeePrdCode2() {
        return customFeePrdCode2;
    }

    public void setCustomFeePrdCode2(Character customFeePrdCode2) {
        this.customFeePrdCode2 = customFeePrdCode2;
    }

    public Character getCustomFeePrdCode3() {
        return customFeePrdCode3;
    }

    public void setCustomFeePrdCode3(Character customFeePrdCode3) {
        this.customFeePrdCode3 = customFeePrdCode3;
    }

    public Character getCustomFeePrdCode4() {
        return customFeePrdCode4;
    }

    public void setCustomFeePrdCode4(Character customFeePrdCode4) {
        this.customFeePrdCode4 = customFeePrdCode4;
    }

    public Character getCustomFeePrdCode5() {
        return customFeePrdCode5;
    }

    public void setCustomFeePrdCode5(Character customFeePrdCode5) {
        this.customFeePrdCode5 = customFeePrdCode5;
    }

    public Character getCustomFeePrdCode6() {
        return customFeePrdCode6;
    }

    public void setCustomFeePrdCode6(Character customFeePrdCode6) {
        this.customFeePrdCode6 = customFeePrdCode6;
    }

    public Character getCustomFeePrdCode7() {
        return customFeePrdCode7;
    }

    public void setCustomFeePrdCode7(Character customFeePrdCode7) {
        this.customFeePrdCode7 = customFeePrdCode7;
    }

    public Character getCustomFeePrdCode8() {
        return customFeePrdCode8;
    }

    public void setCustomFeePrdCode8(Character customFeePrdCode8) {
        this.customFeePrdCode8 = customFeePrdCode8;
    }

    public Character getCustomFeePrdCode9() {
        return customFeePrdCode9;
    }

    public void setCustomFeePrdCode9(Character customFeePrdCode9) {
        this.customFeePrdCode9 = customFeePrdCode9;
    }

    public Character getCustomFeePrdCodeA() {
        return customFeePrdCodeA;
    }

    public void setCustomFeePrdCodeA(Character customFeePrdCodeA) {
        this.customFeePrdCodeA = customFeePrdCodeA;
    }

    public Character getCustomFeePrdCodeB() {
        return customFeePrdCodeB;
    }

    public void setCustomFeePrdCodeB(Character customFeePrdCodeB) {
        this.customFeePrdCodeB = customFeePrdCodeB;
    }

    public Character getCustomFeePrdCodeC() {
        return customFeePrdCodeC;
    }

    public void setCustomFeePrdCodeC(Character customFeePrdCodeC) {
        this.customFeePrdCodeC = customFeePrdCodeC;
    }

    public Character getCustomFeePrdCodeD() {
        return customFeePrdCodeD;
    }

    public void setCustomFeePrdCodeD(Character customFeePrdCodeD) {
        this.customFeePrdCodeD = customFeePrdCodeD;
    }

    public Character getCustomFeePrdCodeE() {
        return customFeePrdCodeE;
    }

    public void setCustomFeePrdCodeE(Character customFeePrdCodeE) {
        this.customFeePrdCodeE = customFeePrdCodeE;
    }

    public Character getCustomFeePrdCodeF() {
        return customFeePrdCodeF;
    }

    public void setCustomFeePrdCodeF(Character customFeePrdCodeF) {
        this.customFeePrdCodeF = customFeePrdCodeF;
    }

    public Character getCustomFeePrdCodeG() {
        return customFeePrdCodeG;
    }

    public void setCustomFeePrdCodeG(Character customFeePrdCodeG) {
        this.customFeePrdCodeG = customFeePrdCodeG;
    }

    public Character getCustomFeePrdCodeH() {
        return customFeePrdCodeH;
    }

    public void setCustomFeePrdCodeH(Character customFeePrdCodeH) {
        this.customFeePrdCodeH = customFeePrdCodeH;
    }

    public Character getCustomFeePrdCodeI() {
        return customFeePrdCodeI;
    }

    public void setCustomFeePrdCodeI(Character customFeePrdCodeI) {
        this.customFeePrdCodeI = customFeePrdCodeI;
    }

    public Character getCustomFeePrdCodeJ() {
        return customFeePrdCodeJ;
    }

    public void setCustomFeePrdCodeJ(Character customFeePrdCodeJ) {
        this.customFeePrdCodeJ = customFeePrdCodeJ;
    }

    public Character getCustomFeePrdCodeK() {
        return customFeePrdCodeK;
    }

    public void setCustomFeePrdCodeK(Character customFeePrdCodeK) {
        this.customFeePrdCodeK = customFeePrdCodeK;
    }

    public Character getCustomFeePrdCodeL() {
        return customFeePrdCodeL;
    }

    public void setCustomFeePrdCodeL(Character customFeePrdCodeL) {
        this.customFeePrdCodeL = customFeePrdCodeL;
    }

    public Character getCustomFeePrdCodeM() {
        return customFeePrdCodeM;
    }

    public void setCustomFeePrdCodeM(Character customFeePrdCodeM) {
        this.customFeePrdCodeM = customFeePrdCodeM;
    }

    public Character getCustomFeePrdCodeN() {
        return customFeePrdCodeN;
    }

    public void setCustomFeePrdCodeN(Character customFeePrdCodeN) {
        this.customFeePrdCodeN = customFeePrdCodeN;
    }

    public Character getCustomFeePrdCodeO() {
        return customFeePrdCodeO;
    }

    public void setCustomFeePrdCodeO(Character customFeePrdCodeO) {
        this.customFeePrdCodeO = customFeePrdCodeO;
    }

    public Character getCustomFeePrdCodeP() {
        return customFeePrdCodeP;
    }

    public void setCustomFeePrdCodeP(Character customFeePrdCodeP) {
        this.customFeePrdCodeP = customFeePrdCodeP;
    }

    public Character getCustomFeePrdCodeQ() {
        return customFeePrdCodeQ;
    }

    public void setCustomFeePrdCodeQ(Character customFeePrdCodeQ) {
        this.customFeePrdCodeQ = customFeePrdCodeQ;
    }

    public Character getCustomFeePrdCodeR() {
        return customFeePrdCodeR;
    }

    public void setCustomFeePrdCodeR(Character customFeePrdCodeR) {
        this.customFeePrdCodeR = customFeePrdCodeR;
    }

    public Character getCustomFeePrdCodeS() {
        return customFeePrdCodeS;
    }

    public void setCustomFeePrdCodeS(Character customFeePrdCodeS) {
        this.customFeePrdCodeS = customFeePrdCodeS;
    }

    public Character getCustomFeePrdCodeT() {
        return customFeePrdCodeT;
    }

    public void setCustomFeePrdCodeT(Character customFeePrdCodeT) {
        this.customFeePrdCodeT = customFeePrdCodeT;
    }

    public Character getCustomFeePrdCodeU() {
        return customFeePrdCodeU;
    }

    public void setCustomFeePrdCodeU(Character customFeePrdCodeU) {
        this.customFeePrdCodeU = customFeePrdCodeU;
    }

    public Character getCustomFeePrdCodeV() {
        return customFeePrdCodeV;
    }

    public void setCustomFeePrdCodeV(Character customFeePrdCodeV) {
        this.customFeePrdCodeV = customFeePrdCodeV;
    }

    public Character getCustomFeePrdCodeW() {
        return customFeePrdCodeW;
    }

    public void setCustomFeePrdCodeW(Character customFeePrdCodeW) {
        this.customFeePrdCodeW = customFeePrdCodeW;
    }

    public Character getCustomFeePrdCodeX() {
        return customFeePrdCodeX;
    }

    public void setCustomFeePrdCodeX(Character customFeePrdCodeX) {
        this.customFeePrdCodeX = customFeePrdCodeX;
    }

    public Character getCustomFeePrdCodeY() {
        return customFeePrdCodeY;
    }

    public void setCustomFeePrdCodeY(Character customFeePrdCodeY) {
        this.customFeePrdCodeY = customFeePrdCodeY;
    }

    public Character getCustomFeePrdCodeZ() {
        return customFeePrdCodeZ;
    }

    public void setCustomFeePrdCodeZ(Character customFeePrdCodeZ) {
        this.customFeePrdCodeZ = customFeePrdCodeZ;
    }

    public Character getCustomFeePrdTyp0() {
        return customFeePrdTyp0;
    }

    public void setCustomFeePrdTyp0(Character customFeePrdTyp0) {
        this.customFeePrdTyp0 = customFeePrdTyp0;
    }

    public Character getCustomFeePrdTyp1() {
        return customFeePrdTyp1;
    }

    public void setCustomFeePrdTyp1(Character customFeePrdTyp1) {
        this.customFeePrdTyp1 = customFeePrdTyp1;
    }

    public Character getCustomFeePrdTyp2() {
        return customFeePrdTyp2;
    }

    public void setCustomFeePrdTyp2(Character customFeePrdTyp2) {
        this.customFeePrdTyp2 = customFeePrdTyp2;
    }

    public Character getCustomFeePrdTyp3() {
        return customFeePrdTyp3;
    }

    public void setCustomFeePrdTyp3(Character customFeePrdTyp3) {
        this.customFeePrdTyp3 = customFeePrdTyp3;
    }

    public Character getCustomFeePrdTyp4() {
        return customFeePrdTyp4;
    }

    public void setCustomFeePrdTyp4(Character customFeePrdTyp4) {
        this.customFeePrdTyp4 = customFeePrdTyp4;
    }

    public Character getCustomFeePrdTyp5() {
        return customFeePrdTyp5;
    }

    public void setCustomFeePrdTyp5(Character customFeePrdTyp5) {
        this.customFeePrdTyp5 = customFeePrdTyp5;
    }

    public Character getCustomFeePrdTyp6() {
        return customFeePrdTyp6;
    }

    public void setCustomFeePrdTyp6(Character customFeePrdTyp6) {
        this.customFeePrdTyp6 = customFeePrdTyp6;
    }

    public Character getCustomFeePrdTyp7() {
        return customFeePrdTyp7;
    }

    public void setCustomFeePrdTyp7(Character customFeePrdTyp7) {
        this.customFeePrdTyp7 = customFeePrdTyp7;
    }

    public Character getCustomFeePrdTyp8() {
        return customFeePrdTyp8;
    }

    public void setCustomFeePrdTyp8(Character customFeePrdTyp8) {
        this.customFeePrdTyp8 = customFeePrdTyp8;
    }

    public Character getCustomFeePrdTyp9() {
        return customFeePrdTyp9;
    }

    public void setCustomFeePrdTyp9(Character customFeePrdTyp9) {
        this.customFeePrdTyp9 = customFeePrdTyp9;
    }

    public Character getCustomFeePrdTypA() {
        return customFeePrdTypA;
    }

    public void setCustomFeePrdTypA(Character customFeePrdTypA) {
        this.customFeePrdTypA = customFeePrdTypA;
    }

    public Character getCustomFeePrdTypB() {
        return customFeePrdTypB;
    }

    public void setCustomFeePrdTypB(Character customFeePrdTypB) {
        this.customFeePrdTypB = customFeePrdTypB;
    }

    public Character getCustomFeePrdTypC() {
        return customFeePrdTypC;
    }

    public void setCustomFeePrdTypC(Character customFeePrdTypC) {
        this.customFeePrdTypC = customFeePrdTypC;
    }

    public Character getCustomFeePrdTypD() {
        return customFeePrdTypD;
    }

    public void setCustomFeePrdTypD(Character customFeePrdTypD) {
        this.customFeePrdTypD = customFeePrdTypD;
    }

    public Character getCustomFeePrdTypE() {
        return customFeePrdTypE;
    }

    public void setCustomFeePrdTypE(Character customFeePrdTypE) {
        this.customFeePrdTypE = customFeePrdTypE;
    }

    public Character getCustomFeePrdTypF() {
        return customFeePrdTypF;
    }

    public void setCustomFeePrdTypF(Character customFeePrdTypF) {
        this.customFeePrdTypF = customFeePrdTypF;
    }

    public Character getCustomFeePrdTypG() {
        return customFeePrdTypG;
    }

    public void setCustomFeePrdTypG(Character customFeePrdTypG) {
        this.customFeePrdTypG = customFeePrdTypG;
    }

    public Character getCustomFeePrdTypH() {
        return customFeePrdTypH;
    }

    public void setCustomFeePrdTypH(Character customFeePrdTypH) {
        this.customFeePrdTypH = customFeePrdTypH;
    }

    public Character getCustomFeePrdTypI() {
        return customFeePrdTypI;
    }

    public void setCustomFeePrdTypI(Character customFeePrdTypI) {
        this.customFeePrdTypI = customFeePrdTypI;
    }

    public Character getCustomFeePrdTypJ() {
        return customFeePrdTypJ;
    }

    public void setCustomFeePrdTypJ(Character customFeePrdTypJ) {
        this.customFeePrdTypJ = customFeePrdTypJ;
    }

    public Character getCustomFeePrdTypK() {
        return customFeePrdTypK;
    }

    public void setCustomFeePrdTypK(Character customFeePrdTypK) {
        this.customFeePrdTypK = customFeePrdTypK;
    }

    public Character getCustomFeePrdTypL() {
        return customFeePrdTypL;
    }

    public void setCustomFeePrdTypL(Character customFeePrdTypL) {
        this.customFeePrdTypL = customFeePrdTypL;
    }

    public Character getCustomFeePrdTypM() {
        return customFeePrdTypM;
    }

    public void setCustomFeePrdTypM(Character customFeePrdTypM) {
        this.customFeePrdTypM = customFeePrdTypM;
    }

    public Character getCustomFeePrdTypN() {
        return customFeePrdTypN;
    }

    public void setCustomFeePrdTypN(Character customFeePrdTypN) {
        this.customFeePrdTypN = customFeePrdTypN;
    }

    public Character getCustomFeePrdTypO() {
        return customFeePrdTypO;
    }

    public void setCustomFeePrdTypO(Character customFeePrdTypO) {
        this.customFeePrdTypO = customFeePrdTypO;
    }

    public Character getCustomFeePrdTypP() {
        return customFeePrdTypP;
    }

    public void setCustomFeePrdTypP(Character customFeePrdTypP) {
        this.customFeePrdTypP = customFeePrdTypP;
    }

    public Character getCustomFeePrdTypQ() {
        return customFeePrdTypQ;
    }

    public void setCustomFeePrdTypQ(Character customFeePrdTypQ) {
        this.customFeePrdTypQ = customFeePrdTypQ;
    }

    public Character getCustomFeePrdTypR() {
        return customFeePrdTypR;
    }

    public void setCustomFeePrdTypR(Character customFeePrdTypR) {
        this.customFeePrdTypR = customFeePrdTypR;
    }

    public Character getCustomFeePrdTypS() {
        return customFeePrdTypS;
    }

    public void setCustomFeePrdTypS(Character customFeePrdTypS) {
        this.customFeePrdTypS = customFeePrdTypS;
    }

    public Character getCustomFeePrdTypT() {
        return customFeePrdTypT;
    }

    public void setCustomFeePrdTypT(Character customFeePrdTypT) {
        this.customFeePrdTypT = customFeePrdTypT;
    }

    public Character getCustomFeePrdTypU() {
        return customFeePrdTypU;
    }

    public void setCustomFeePrdTypU(Character customFeePrdTypU) {
        this.customFeePrdTypU = customFeePrdTypU;
    }

    public Character getCustomFeePrdTypV() {
        return customFeePrdTypV;
    }

    public void setCustomFeePrdTypV(Character customFeePrdTypV) {
        this.customFeePrdTypV = customFeePrdTypV;
    }

    public Character getCustomFeePrdTypW() {
        return customFeePrdTypW;
    }

    public void setCustomFeePrdTypW(Character customFeePrdTypW) {
        this.customFeePrdTypW = customFeePrdTypW;
    }

    public Character getCustomFeePrdTypX() {
        return customFeePrdTypX;
    }

    public void setCustomFeePrdTypX(Character customFeePrdTypX) {
        this.customFeePrdTypX = customFeePrdTypX;
    }

    public Character getCustomFeePrdTypY() {
        return customFeePrdTypY;
    }

    public void setCustomFeePrdTypY(Character customFeePrdTypY) {
        this.customFeePrdTypY = customFeePrdTypY;
    }

    public Character getCustomFeePrdTypZ() {
        return customFeePrdTypZ;
    }

    public void setCustomFeePrdTypZ(Character customFeePrdTypZ) {
        this.customFeePrdTypZ = customFeePrdTypZ;
    }

    public BigDecimal getCustomFeePrdCoFnd0() {
        return customFeePrdCoFnd0;
    }

    public void setCustomFeePrdCoFnd0(BigDecimal customFeePrdCoFnd0) {
        this.customFeePrdCoFnd0 = customFeePrdCoFnd0;
    }

    public BigDecimal getCustomFeePrdCoFnd1() {
        return customFeePrdCoFnd1;
    }

    public void setCustomFeePrdCoFnd1(BigDecimal customFeePrdCoFnd1) {
        this.customFeePrdCoFnd1 = customFeePrdCoFnd1;
    }

    public BigDecimal getCustomFeePrdCoFnd2() {
        return customFeePrdCoFnd2;
    }

    public void setCustomFeePrdCoFnd2(BigDecimal customFeePrdCoFnd2) {
        this.customFeePrdCoFnd2 = customFeePrdCoFnd2;
    }

    public BigDecimal getCustomFeePrdCoFnd3() {
        return customFeePrdCoFnd3;
    }

    public void setCustomFeePrdCoFnd3(BigDecimal customFeePrdCoFnd3) {
        this.customFeePrdCoFnd3 = customFeePrdCoFnd3;
    }

    public BigDecimal getCustomFeePrdCoFnd4() {
        return customFeePrdCoFnd4;
    }

    public void setCustomFeePrdCoFnd4(BigDecimal customFeePrdCoFnd4) {
        this.customFeePrdCoFnd4 = customFeePrdCoFnd4;
    }

    public BigDecimal getCustomFeePrdCoFnd5() {
        return customFeePrdCoFnd5;
    }

    public void setCustomFeePrdCoFnd5(BigDecimal customFeePrdCoFnd5) {
        this.customFeePrdCoFnd5 = customFeePrdCoFnd5;
    }

    public BigDecimal getCustomFeePrdCoFnd6() {
        return customFeePrdCoFnd6;
    }

    public void setCustomFeePrdCoFnd6(BigDecimal customFeePrdCoFnd6) {
        this.customFeePrdCoFnd6 = customFeePrdCoFnd6;
    }

    public BigDecimal getCustomFeePrdCoFnd7() {
        return customFeePrdCoFnd7;
    }

    public void setCustomFeePrdCoFnd7(BigDecimal customFeePrdCoFnd7) {
        this.customFeePrdCoFnd7 = customFeePrdCoFnd7;
    }

    public BigDecimal getCustomFeePrdCoFnd8() {
        return customFeePrdCoFnd8;
    }

    public void setCustomFeePrdCoFnd8(BigDecimal customFeePrdCoFnd8) {
        this.customFeePrdCoFnd8 = customFeePrdCoFnd8;
    }

    public BigDecimal getCustomFeePrdCoFnd9() {
        return customFeePrdCoFnd9;
    }

    public void setCustomFeePrdCoFnd9(BigDecimal customFeePrdCoFnd9) {
        this.customFeePrdCoFnd9 = customFeePrdCoFnd9;
    }

    public BigDecimal getCustomFeePrdCoFndA() {
        return customFeePrdCoFndA;
    }

    public void setCustomFeePrdCoFndA(BigDecimal customFeePrdCoFndA) {
        this.customFeePrdCoFndA = customFeePrdCoFndA;
    }

    public BigDecimal getCustomFeePrdCoFndB() {
        return customFeePrdCoFndB;
    }

    public void setCustomFeePrdCoFndB(BigDecimal customFeePrdCoFndB) {
        this.customFeePrdCoFndB = customFeePrdCoFndB;
    }

    public BigDecimal getCustomFeePrdCoFndC() {
        return customFeePrdCoFndC;
    }

    public void setCustomFeePrdCoFndC(BigDecimal customFeePrdCoFndC) {
        this.customFeePrdCoFndC = customFeePrdCoFndC;
    }

    public BigDecimal getCustomFeePrdCoFndD() {
        return customFeePrdCoFndD;
    }

    public void setCustomFeePrdCoFndD(BigDecimal customFeePrdCoFndD) {
        this.customFeePrdCoFndD = customFeePrdCoFndD;
    }

    public BigDecimal getCustomFeePrdCoFndE() {
        return customFeePrdCoFndE;
    }

    public void setCustomFeePrdCoFndE(BigDecimal customFeePrdCoFndE) {
        this.customFeePrdCoFndE = customFeePrdCoFndE;
    }

    public BigDecimal getCustomFeePrdCoFndF() {
        return customFeePrdCoFndF;
    }

    public void setCustomFeePrdCoFndF(BigDecimal customFeePrdCoFndF) {
        this.customFeePrdCoFndF = customFeePrdCoFndF;
    }

    public BigDecimal getCustomFeePrdCoFndG() {
        return customFeePrdCoFndG;
    }

    public void setCustomFeePrdCoFndG(BigDecimal customFeePrdCoFndG) {
        this.customFeePrdCoFndG = customFeePrdCoFndG;
    }

    public BigDecimal getCustomFeePrdCoFndH() {
        return customFeePrdCoFndH;
    }

    public void setCustomFeePrdCoFndH(BigDecimal customFeePrdCoFndH) {
        this.customFeePrdCoFndH = customFeePrdCoFndH;
    }

    public BigDecimal getCustomFeePrdCoFndI() {
        return customFeePrdCoFndI;
    }

    public void setCustomFeePrdCoFndI(BigDecimal customFeePrdCoFndI) {
        this.customFeePrdCoFndI = customFeePrdCoFndI;
    }

    public BigDecimal getCustomFeePrdCoFndJ() {
        return customFeePrdCoFndJ;
    }

    public void setCustomFeePrdCoFndJ(BigDecimal customFeePrdCoFndJ) {
        this.customFeePrdCoFndJ = customFeePrdCoFndJ;
    }

    public BigDecimal getCustomFeePrdCoFndK() {
        return customFeePrdCoFndK;
    }

    public void setCustomFeePrdCoFndK(BigDecimal customFeePrdCoFndK) {
        this.customFeePrdCoFndK = customFeePrdCoFndK;
    }

    public BigDecimal getCustomFeePrdCoFndL() {
        return customFeePrdCoFndL;
    }

    public void setCustomFeePrdCoFndL(BigDecimal customFeePrdCoFndL) {
        this.customFeePrdCoFndL = customFeePrdCoFndL;
    }

    public BigDecimal getCustomFeePrdCoFndM() {
        return customFeePrdCoFndM;
    }

    public void setCustomFeePrdCoFndM(BigDecimal customFeePrdCoFndM) {
        this.customFeePrdCoFndM = customFeePrdCoFndM;
    }

    public BigDecimal getCustomFeePrdCoFndN() {
        return customFeePrdCoFndN;
    }

    public void setCustomFeePrdCoFndN(BigDecimal customFeePrdCoFndN) {
        this.customFeePrdCoFndN = customFeePrdCoFndN;
    }

    public BigDecimal getCustomFeePrdCoFndO() {
        return customFeePrdCoFndO;
    }

    public void setCustomFeePrdCoFndO(BigDecimal customFeePrdCoFndO) {
        this.customFeePrdCoFndO = customFeePrdCoFndO;
    }

    public BigDecimal getCustomFeePrdCoFndP() {
        return customFeePrdCoFndP;
    }

    public void setCustomFeePrdCoFndP(BigDecimal customFeePrdCoFndP) {
        this.customFeePrdCoFndP = customFeePrdCoFndP;
    }

    public BigDecimal getCustomFeePrdCoFndQ() {
        return customFeePrdCoFndQ;
    }

    public void setCustomFeePrdCoFndQ(BigDecimal customFeePrdCoFndQ) {
        this.customFeePrdCoFndQ = customFeePrdCoFndQ;
    }

    public BigDecimal getCustomFeePrdCoFndR() {
        return customFeePrdCoFndR;
    }

    public void setCustomFeePrdCoFndR(BigDecimal customFeePrdCoFndR) {
        this.customFeePrdCoFndR = customFeePrdCoFndR;
    }

    public BigDecimal getCustomFeePrdCoFndS() {
        return customFeePrdCoFndS;
    }

    public void setCustomFeePrdCoFndS(BigDecimal customFeePrdCoFndS) {
        this.customFeePrdCoFndS = customFeePrdCoFndS;
    }

    public BigDecimal getCustomFeePrdCoFndT() {
        return customFeePrdCoFndT;
    }

    public void setCustomFeePrdCoFndT(BigDecimal customFeePrdCoFndT) {
        this.customFeePrdCoFndT = customFeePrdCoFndT;
    }

    public BigDecimal getCustomFeePrdCoFndU() {
        return customFeePrdCoFndU;
    }

    public void setCustomFeePrdCoFndU(BigDecimal customFeePrdCoFndU) {
        this.customFeePrdCoFndU = customFeePrdCoFndU;
    }

    public BigDecimal getCustomFeePrdCoFndV() {
        return customFeePrdCoFndV;
    }

    public void setCustomFeePrdCoFndV(BigDecimal customFeePrdCoFndV) {
        this.customFeePrdCoFndV = customFeePrdCoFndV;
    }

    public BigDecimal getCustomFeePrdCoFndW() {
        return customFeePrdCoFndW;
    }

    public void setCustomFeePrdCoFndW(BigDecimal customFeePrdCoFndW) {
        this.customFeePrdCoFndW = customFeePrdCoFndW;
    }

    public BigDecimal getCustomFeePrdCoFndX() {
        return customFeePrdCoFndX;
    }

    public void setCustomFeePrdCoFndX(BigDecimal customFeePrdCoFndX) {
        this.customFeePrdCoFndX = customFeePrdCoFndX;
    }

    public BigDecimal getCustomFeePrdCoFndY() {
        return customFeePrdCoFndY;
    }

    public void setCustomFeePrdCoFndY(BigDecimal customFeePrdCoFndY) {
        this.customFeePrdCoFndY = customFeePrdCoFndY;
    }

    public BigDecimal getCustomFeePrdCoFndZ() {
        return customFeePrdCoFndZ;
    }

    public void setCustomFeePrdCoFndZ(BigDecimal customFeePrdCoFndZ) {
        this.customFeePrdCoFndZ = customFeePrdCoFndZ;
    }

    public BigDecimal getCustomFeePrdCoDb0() {
        return customFeePrdCoDb0;
    }

    public void setCustomFeePrdCoDb0(BigDecimal customFeePrdCoDb0) {
        this.customFeePrdCoDb0 = customFeePrdCoDb0;
    }

    public BigDecimal getCustomFeePrdCoDb1() {
        return customFeePrdCoDb1;
    }

    public void setCustomFeePrdCoDb1(BigDecimal customFeePrdCoDb1) {
        this.customFeePrdCoDb1 = customFeePrdCoDb1;
    }

    public BigDecimal getCustomFeePrdCoDb2() {
        return customFeePrdCoDb2;
    }

    public void setCustomFeePrdCoDb2(BigDecimal customFeePrdCoDb2) {
        this.customFeePrdCoDb2 = customFeePrdCoDb2;
    }

    public BigDecimal getCustomFeePrdCoDb3() {
        return customFeePrdCoDb3;
    }

    public void setCustomFeePrdCoDb3(BigDecimal customFeePrdCoDb3) {
        this.customFeePrdCoDb3 = customFeePrdCoDb3;
    }

    public BigDecimal getCustomFeePrdCoDb4() {
        return customFeePrdCoDb4;
    }

    public void setCustomFeePrdCoDb4(BigDecimal customFeePrdCoDb4) {
        this.customFeePrdCoDb4 = customFeePrdCoDb4;
    }

    public BigDecimal getCustomFeePrdCoDb5() {
        return customFeePrdCoDb5;
    }

    public void setCustomFeePrdCoDb5(BigDecimal customFeePrdCoDb5) {
        this.customFeePrdCoDb5 = customFeePrdCoDb5;
    }

    public BigDecimal getCustomFeePrdCoDb6() {
        return customFeePrdCoDb6;
    }

    public void setCustomFeePrdCoDb6(BigDecimal customFeePrdCoDb6) {
        this.customFeePrdCoDb6 = customFeePrdCoDb6;
    }

    public BigDecimal getCustomFeePrdCoDb7() {
        return customFeePrdCoDb7;
    }

    public void setCustomFeePrdCoDb7(BigDecimal customFeePrdCoDb7) {
        this.customFeePrdCoDb7 = customFeePrdCoDb7;
    }

    public BigDecimal getCustomFeePrdCoDb8() {
        return customFeePrdCoDb8;
    }

    public void setCustomFeePrdCoDb8(BigDecimal customFeePrdCoDb8) {
        this.customFeePrdCoDb8 = customFeePrdCoDb8;
    }

    public BigDecimal getCustomFeePrdCoDb9() {
        return customFeePrdCoDb9;
    }

    public void setCustomFeePrdCoDb9(BigDecimal customFeePrdCoDb9) {
        this.customFeePrdCoDb9 = customFeePrdCoDb9;
    }

    public BigDecimal getCustomFeePrdCoDbA() {
        return customFeePrdCoDbA;
    }

    public void setCustomFeePrdCoDbA(BigDecimal customFeePrdCoDbA) {
        this.customFeePrdCoDbA = customFeePrdCoDbA;
    }

    public BigDecimal getCustomFeePrdCoDbB() {
        return customFeePrdCoDbB;
    }

    public void setCustomFeePrdCoDbB(BigDecimal customFeePrdCoDbB) {
        this.customFeePrdCoDbB = customFeePrdCoDbB;
    }

    public BigDecimal getCustomFeePrdCoDbC() {
        return customFeePrdCoDbC;
    }

    public void setCustomFeePrdCoDbC(BigDecimal customFeePrdCoDbC) {
        this.customFeePrdCoDbC = customFeePrdCoDbC;
    }

    public BigDecimal getCustomFeePrdCoDbD() {
        return customFeePrdCoDbD;
    }

    public void setCustomFeePrdCoDbD(BigDecimal customFeePrdCoDbD) {
        this.customFeePrdCoDbD = customFeePrdCoDbD;
    }

    public BigDecimal getCustomFeePrdCoDbE() {
        return customFeePrdCoDbE;
    }

    public void setCustomFeePrdCoDbE(BigDecimal customFeePrdCoDbE) {
        this.customFeePrdCoDbE = customFeePrdCoDbE;
    }

    public BigDecimal getCustomFeePrdCoDbF() {
        return customFeePrdCoDbF;
    }

    public void setCustomFeePrdCoDbF(BigDecimal customFeePrdCoDbF) {
        this.customFeePrdCoDbF = customFeePrdCoDbF;
    }

    public BigDecimal getCustomFeePrdCoDbG() {
        return customFeePrdCoDbG;
    }

    public void setCustomFeePrdCoDbG(BigDecimal customFeePrdCoDbG) {
        this.customFeePrdCoDbG = customFeePrdCoDbG;
    }

    public BigDecimal getCustomFeePrdCoDbH() {
        return customFeePrdCoDbH;
    }

    public void setCustomFeePrdCoDbH(BigDecimal customFeePrdCoDbH) {
        this.customFeePrdCoDbH = customFeePrdCoDbH;
    }

    public BigDecimal getCustomFeePrdCoDbI() {
        return customFeePrdCoDbI;
    }

    public void setCustomFeePrdCoDbI(BigDecimal customFeePrdCoDbI) {
        this.customFeePrdCoDbI = customFeePrdCoDbI;
    }

    public BigDecimal getCustomFeePrdCoDbJ() {
        return customFeePrdCoDbJ;
    }

    public void setCustomFeePrdCoDbJ(BigDecimal customFeePrdCoDbJ) {
        this.customFeePrdCoDbJ = customFeePrdCoDbJ;
    }

    public BigDecimal getCustomFeePrdCoDbK() {
        return customFeePrdCoDbK;
    }

    public void setCustomFeePrdCoDbK(BigDecimal customFeePrdCoDbK) {
        this.customFeePrdCoDbK = customFeePrdCoDbK;
    }

    public BigDecimal getCustomFeePrdCoDbL() {
        return customFeePrdCoDbL;
    }

    public void setCustomFeePrdCoDbL(BigDecimal customFeePrdCoDbL) {
        this.customFeePrdCoDbL = customFeePrdCoDbL;
    }

    public BigDecimal getCustomFeePrdCoDbM() {
        return customFeePrdCoDbM;
    }

    public void setCustomFeePrdCoDbM(BigDecimal customFeePrdCoDbM) {
        this.customFeePrdCoDbM = customFeePrdCoDbM;
    }

    public BigDecimal getCustomFeePrdCoDbN() {
        return customFeePrdCoDbN;
    }

    public void setCustomFeePrdCoDbN(BigDecimal customFeePrdCoDbN) {
        this.customFeePrdCoDbN = customFeePrdCoDbN;
    }

    public BigDecimal getCustomFeePrdCoDbO() {
        return customFeePrdCoDbO;
    }

    public void setCustomFeePrdCoDbO(BigDecimal customFeePrdCoDbO) {
        this.customFeePrdCoDbO = customFeePrdCoDbO;
    }

    public BigDecimal getCustomFeePrdCoDbP() {
        return customFeePrdCoDbP;
    }

    public void setCustomFeePrdCoDbP(BigDecimal customFeePrdCoDbP) {
        this.customFeePrdCoDbP = customFeePrdCoDbP;
    }

    public BigDecimal getCustomFeePrdCoDbQ() {
        return customFeePrdCoDbQ;
    }

    public void setCustomFeePrdCoDbQ(BigDecimal customFeePrdCoDbQ) {
        this.customFeePrdCoDbQ = customFeePrdCoDbQ;
    }

    public BigDecimal getCustomFeePrdCoDbR() {
        return customFeePrdCoDbR;
    }

    public void setCustomFeePrdCoDbR(BigDecimal customFeePrdCoDbR) {
        this.customFeePrdCoDbR = customFeePrdCoDbR;
    }

    public BigDecimal getCustomFeePrdCoDbS() {
        return customFeePrdCoDbS;
    }

    public void setCustomFeePrdCoDbS(BigDecimal customFeePrdCoDbS) {
        this.customFeePrdCoDbS = customFeePrdCoDbS;
    }

    public BigDecimal getCustomFeePrdCoDbT() {
        return customFeePrdCoDbT;
    }

    public void setCustomFeePrdCoDbT(BigDecimal customFeePrdCoDbT) {
        this.customFeePrdCoDbT = customFeePrdCoDbT;
    }

    public BigDecimal getCustomFeePrdCoDbU() {
        return customFeePrdCoDbU;
    }

    public void setCustomFeePrdCoDbU(BigDecimal customFeePrdCoDbU) {
        this.customFeePrdCoDbU = customFeePrdCoDbU;
    }

    public BigDecimal getCustomFeePrdCoDbV() {
        return customFeePrdCoDbV;
    }

    public void setCustomFeePrdCoDbV(BigDecimal customFeePrdCoDbV) {
        this.customFeePrdCoDbV = customFeePrdCoDbV;
    }

    public BigDecimal getCustomFeePrdCoDbW() {
        return customFeePrdCoDbW;
    }

    public void setCustomFeePrdCoDbW(BigDecimal customFeePrdCoDbW) {
        this.customFeePrdCoDbW = customFeePrdCoDbW;
    }

    public BigDecimal getCustomFeePrdCoDbX() {
        return customFeePrdCoDbX;
    }

    public void setCustomFeePrdCoDbX(BigDecimal customFeePrdCoDbX) {
        this.customFeePrdCoDbX = customFeePrdCoDbX;
    }

    public BigDecimal getCustomFeePrdCoDbY() {
        return customFeePrdCoDbY;
    }

    public void setCustomFeePrdCoDbY(BigDecimal customFeePrdCoDbY) {
        this.customFeePrdCoDbY = customFeePrdCoDbY;
    }

    public BigDecimal getCustomFeePrdCoDbZ() {
        return customFeePrdCoDbZ;
    }

    public void setCustomFeePrdCoDbZ(BigDecimal customFeePrdCoDbZ) {
        this.customFeePrdCoDbZ = customFeePrdCoDbZ;
    }

    public BigDecimal getCustomFeeScRate0() {
        return customFeeScRate0;
    }

    public void setCustomFeeScRate0(BigDecimal customFeeScRate0) {
        this.customFeeScRate0 = customFeeScRate0;
    }

    public BigDecimal getCustomFeeScRate1() {
        return customFeeScRate1;
    }

    public void setCustomFeeScRate1(BigDecimal customFeeScRate1) {
        this.customFeeScRate1 = customFeeScRate1;
    }

    public BigDecimal getCustomFeeScRate2() {
        return customFeeScRate2;
    }

    public void setCustomFeeScRate2(BigDecimal customFeeScRate2) {
        this.customFeeScRate2 = customFeeScRate2;
    }

    public BigDecimal getCustomFeeScRate3() {
        return customFeeScRate3;
    }

    public void setCustomFeeScRate3(BigDecimal customFeeScRate3) {
        this.customFeeScRate3 = customFeeScRate3;
    }

    public BigDecimal getCustomFeeScRate4() {
        return customFeeScRate4;
    }

    public void setCustomFeeScRate4(BigDecimal customFeeScRate4) {
        this.customFeeScRate4 = customFeeScRate4;
    }

    public BigDecimal getCustomFeeScRate5() {
        return customFeeScRate5;
    }

    public void setCustomFeeScRate5(BigDecimal customFeeScRate5) {
        this.customFeeScRate5 = customFeeScRate5;
    }

    public BigDecimal getCustomFeeScRate6() {
        return customFeeScRate6;
    }

    public void setCustomFeeScRate6(BigDecimal customFeeScRate6) {
        this.customFeeScRate6 = customFeeScRate6;
    }

    public BigDecimal getCustomFeeScRate7() {
        return customFeeScRate7;
    }

    public void setCustomFeeScRate7(BigDecimal customFeeScRate7) {
        this.customFeeScRate7 = customFeeScRate7;
    }

    public BigDecimal getCustomFeeScRate8() {
        return customFeeScRate8;
    }

    public void setCustomFeeScRate8(BigDecimal customFeeScRate8) {
        this.customFeeScRate8 = customFeeScRate8;
    }

    public BigDecimal getCustomFeeScRate9() {
        return customFeeScRate9;
    }

    public void setCustomFeeScRate9(BigDecimal customFeeScRate9) {
        this.customFeeScRate9 = customFeeScRate9;
    }

    public BigDecimal getCustomFeeScRateA() {
        return customFeeScRateA;
    }

    public void setCustomFeeScRateA(BigDecimal customFeeScRateA) {
        this.customFeeScRateA = customFeeScRateA;
    }

    public BigDecimal getCustomFeeScRateB() {
        return customFeeScRateB;
    }

    public void setCustomFeeScRateB(BigDecimal customFeeScRateB) {
        this.customFeeScRateB = customFeeScRateB;
    }

    public BigDecimal getCustomFeeScRateC() {
        return customFeeScRateC;
    }

    public void setCustomFeeScRateC(BigDecimal customFeeScRateC) {
        this.customFeeScRateC = customFeeScRateC;
    }

    public BigDecimal getCustomFeeScRateD() {
        return customFeeScRateD;
    }

    public void setCustomFeeScRateD(BigDecimal customFeeScRateD) {
        this.customFeeScRateD = customFeeScRateD;
    }

    public BigDecimal getCustomFeeScRateE() {
        return customFeeScRateE;
    }

    public void setCustomFeeScRateE(BigDecimal customFeeScRateE) {
        this.customFeeScRateE = customFeeScRateE;
    }

    public BigDecimal getCustomFeeScRateF() {
        return customFeeScRateF;
    }

    public void setCustomFeeScRateF(BigDecimal customFeeScRateF) {
        this.customFeeScRateF = customFeeScRateF;
    }

    public BigDecimal getCustomFeeScRateG() {
        return customFeeScRateG;
    }

    public void setCustomFeeScRateG(BigDecimal customFeeScRateG) {
        this.customFeeScRateG = customFeeScRateG;
    }

    public BigDecimal getCustomFeeScRateH() {
        return customFeeScRateH;
    }

    public void setCustomFeeScRateH(BigDecimal customFeeScRateH) {
        this.customFeeScRateH = customFeeScRateH;
    }

    public BigDecimal getCustomFeeScRateI() {
        return customFeeScRateI;
    }

    public void setCustomFeeScRateI(BigDecimal customFeeScRateI) {
        this.customFeeScRateI = customFeeScRateI;
    }

    public BigDecimal getCustomFeeScRateJ() {
        return customFeeScRateJ;
    }

    public void setCustomFeeScRateJ(BigDecimal customFeeScRateJ) {
        this.customFeeScRateJ = customFeeScRateJ;
    }

    public BigDecimal getCustomFeeScRateK() {
        return customFeeScRateK;
    }

    public void setCustomFeeScRateK(BigDecimal customFeeScRateK) {
        this.customFeeScRateK = customFeeScRateK;
    }

    public BigDecimal getCustomFeeScRateL() {
        return customFeeScRateL;
    }

    public void setCustomFeeScRateL(BigDecimal customFeeScRateL) {
        this.customFeeScRateL = customFeeScRateL;
    }

    public BigDecimal getCustomFeeScRateM() {
        return customFeeScRateM;
    }

    public void setCustomFeeScRateM(BigDecimal customFeeScRateM) {
        this.customFeeScRateM = customFeeScRateM;
    }

    public BigDecimal getCustomFeeScRateN() {
        return customFeeScRateN;
    }

    public void setCustomFeeScRateN(BigDecimal customFeeScRateN) {
        this.customFeeScRateN = customFeeScRateN;
    }

    public BigDecimal getCustomFeeScRateO() {
        return customFeeScRateO;
    }

    public void setCustomFeeScRateO(BigDecimal customFeeScRateO) {
        this.customFeeScRateO = customFeeScRateO;
    }

    public BigDecimal getCustomFeeScRateP() {
        return customFeeScRateP;
    }

    public void setCustomFeeScRateP(BigDecimal customFeeScRateP) {
        this.customFeeScRateP = customFeeScRateP;
    }

    public BigDecimal getCustomFeeScRateQ() {
        return customFeeScRateQ;
    }

    public void setCustomFeeScRateQ(BigDecimal customFeeScRateQ) {
        this.customFeeScRateQ = customFeeScRateQ;
    }

    public BigDecimal getCustomFeeScRateR() {
        return customFeeScRateR;
    }

    public void setCustomFeeScRateR(BigDecimal customFeeScRateR) {
        this.customFeeScRateR = customFeeScRateR;
    }

    public BigDecimal getCustomFeeScRateS() {
        return customFeeScRateS;
    }

    public void setCustomFeeScRateS(BigDecimal customFeeScRateS) {
        this.customFeeScRateS = customFeeScRateS;
    }

    public BigDecimal getCustomFeeScRateT() {
        return customFeeScRateT;
    }

    public void setCustomFeeScRateT(BigDecimal customFeeScRateT) {
        this.customFeeScRateT = customFeeScRateT;
    }

    public BigDecimal getCustomFeeScRateU() {
        return customFeeScRateU;
    }

    public void setCustomFeeScRateU(BigDecimal customFeeScRateU) {
        this.customFeeScRateU = customFeeScRateU;
    }

    public BigDecimal getCustomFeeScRateV() {
        return customFeeScRateV;
    }

    public void setCustomFeeScRateV(BigDecimal customFeeScRateV) {
        this.customFeeScRateV = customFeeScRateV;
    }

    public BigDecimal getCustomFeeScRateW() {
        return customFeeScRateW;
    }

    public void setCustomFeeScRateW(BigDecimal customFeeScRateW) {
        this.customFeeScRateW = customFeeScRateW;
    }

    public BigDecimal getCustomFeeScRateX() {
        return customFeeScRateX;
    }

    public void setCustomFeeScRateX(BigDecimal customFeeScRateX) {
        this.customFeeScRateX = customFeeScRateX;
    }

    public BigDecimal getCustomFeeScRateY() {
        return customFeeScRateY;
    }

    public void setCustomFeeScRateY(BigDecimal customFeeScRateY) {
        this.customFeeScRateY = customFeeScRateY;
    }

    public BigDecimal getCustomFeeScRateZ() {
        return customFeeScRateZ;
    }

    public void setCustomFeeScRateZ(BigDecimal customFeeScRateZ) {
        this.customFeeScRateZ = customFeeScRateZ;
    }

    public Character getAllowCustomProdFeeCd() {
        return allowCustomProdFeeCd;
    }

    public void setAllowCustomProdFeeCd(Character allowCustomProdFeeCd) {
        this.allowCustomProdFeeCd = allowCustomProdFeeCd;
    }

    public String getMaxAllowedRfrQty() {
        return maxAllowedRfrQty;
    }

    public void setMaxAllowedRfrQty(String maxAllowedRfrQty) {
        this.maxAllowedRfrQty = maxAllowedRfrQty;
    }

    public String getMaxAllowedOthQty() {
        return maxAllowedOthQty;
    }

    public void setMaxAllowedOthQty(String maxAllowedOthQty) {
        this.maxAllowedOthQty = maxAllowedOthQty;
    }

    public String getMaxAllowedHoldRfrQty() {
        return maxAllowedHoldRfrQty;
    }

    public void setMaxAllowedHoldRfrQty(String maxAllowedHoldRfrQty) {
        this.maxAllowedHoldRfrQty = maxAllowedHoldRfrQty;
    }

    public String getMaxAllowedHoldOthQty() {
        return maxAllowedHoldOthQty;
    }

    public void setMaxAllowedHoldOthQty(String maxAllowedHoldOthQty) {
        this.maxAllowedHoldOthQty = maxAllowedHoldOthQty;
    }

    public Character getCpSataxCpgFlg() {
        return cpSataxCpgFlg;
    }

    public void setCpSataxCpgFlg(Character cpSataxCpgFlg) {
        this.cpSataxCpgFlg = cpSataxCpgFlg;
    }

    public BigDecimal getCpSataxCpgTractor() {
        return cpSataxCpgTractor;
    }

    public void setCpSataxCpgTractor(BigDecimal cpSataxCpgTractor) {
        this.cpSataxCpgTractor = cpSataxCpgTractor;
    }

    public BigDecimal getCpSataxCpgReefer() {
        return cpSataxCpgReefer;
    }

    public void setCpSataxCpgReefer(BigDecimal cpSataxCpgReefer) {
        this.cpSataxCpgReefer = cpSataxCpgReefer;
    }

    public Character getCustomFeeFndFuelFeeTyp() {
        return customFeeFndFuelFeeTyp;
    }

    public void setCustomFeeFndFuelFeeTyp(Character customFeeFndFuelFeeTyp) {
        this.customFeeFndFuelFeeTyp = customFeeFndFuelFeeTyp;
    }

    public Character getCustomFeeFndCashFeeTyp() {
        return customFeeFndCashFeeTyp;
    }

    public void setCustomFeeFndCashFeeTyp(Character customFeeFndCashFeeTyp) {
        this.customFeeFndCashFeeTyp = customFeeFndCashFeeTyp;
    }

    public Character getCustomFeeFndBothFeeTyp() {
        return customFeeFndBothFeeTyp;
    }

    public void setCustomFeeFndBothFeeTyp(Character customFeeFndBothFeeTyp) {
        this.customFeeFndBothFeeTyp = customFeeFndBothFeeTyp;
    }

    public Character getCustomFeeFndDbFuelFeeTyp() {
        return customFeeFndDbFuelFeeTyp;
    }

    public void setCustomFeeFndDbFuelFeeTyp(Character customFeeFndDbFuelFeeTyp) {
        this.customFeeFndDbFuelFeeTyp = customFeeFndDbFuelFeeTyp;
    }

    public Character getCustomFeeFndDbCashFeeTyp() {
        return customFeeFndDbCashFeeTyp;
    }

    public void setCustomFeeFndDbCashFeeTyp(Character customFeeFndDbCashFeeTyp) {
        this.customFeeFndDbCashFeeTyp = customFeeFndDbCashFeeTyp;
    }

    public Character getCustomFeeFndDbBothFeeTyp() {
        return customFeeFndDbBothFeeTyp;
    }

    public void setCustomFeeFndDbBothFeeTyp(Character customFeeFndDbBothFeeTyp) {
        this.customFeeFndDbBothFeeTyp = customFeeFndDbBothFeeTyp;
    }

    public BigDecimal getCpAltTaFee() {
        return cpAltTaFee;
    }

    public void setCpAltTaFee(BigDecimal cpAltTaFee) {
        this.cpAltTaFee = cpAltTaFee;
    }

    public String getSmflGlCd() {
        return smflGlCd;
    }

    public void setSmflGlCd(String smflGlCd) {
        this.smflGlCd = smflGlCd;
    }

    public String getScmm17FeeFlg() {
        return scmm17FeeFlg;
    }

    public void setScmm17FeeFlg(String scmm17FeeFlg) {
        this.scmm17FeeFlg = scmm17FeeFlg;
    }

    public BigDecimal getScmm17DiscFee() {
        return scmm17DiscFee;
    }

    public void setScmm17DiscFee(BigDecimal scmm17DiscFee) {
        this.scmm17DiscFee = scmm17DiscFee;
    }

    public BigDecimal getScmm17RetlFee() {
        return scmm17RetlFee;
    }

    public void setScmm17RetlFee(BigDecimal scmm17RetlFee) {
        this.scmm17RetlFee = scmm17RetlFee;
    }

    public Character getLocRecomdFlg() {
        return locRecomdFlg;
    }

    public void setLocRecomdFlg(Character locRecomdFlg) {
        this.locRecomdFlg = locRecomdFlg;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fmrmSummPK != null ? fmrmSummPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FmrmSumm)) {
            return false;
        }
        FmrmSumm other = (FmrmSumm) object;
        if ((this.fmrmSummPK == null && other.fmrmSummPK != null) || (this.fmrmSummPK != null && !this.fmrmSummPK.equals(other.fmrmSummPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FmrmSumm[ fmrmSummPK=" + fmrmSummPK + " ]";
    }

}
