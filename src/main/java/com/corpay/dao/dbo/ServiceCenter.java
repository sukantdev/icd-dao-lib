package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "SERVICE_CENTER", catalog = "", schema = "DBO")
public class ServiceCenter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STATION_CODE")
    private String stationCode;
    @Basic(optional = false)
    @Column(name = "ACQUIRER_ID")
    private String acquirerId;
    @Basic(optional = false)
    @Column(name = "ACCEPTOR_ID")
    private String acceptorId;
    @Basic(optional = false)
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Basic(optional = false)
    @Column(name = "LOCATION_NAME")
    private String locationName;
    @Basic(optional = false)
    @Column(name = "LOCATION_ADDRESS")
    private String locationAddress;
    @Basic(optional = false)
    @Column(name = "LOCATION_CITY")
    private String locationCity;
    @Basic(optional = false)
    @Column(name = "LOCATION_STATE_PROVINCE")
    private String locationStateProvince;
    @Basic(optional = false)
    @Column(name = "LOCATION_POSTAL_CODE")
    private String locationPostalCode;
    @Basic(optional = false)
    @Column(name = "LOCATION_COUNTRY_CODE")
    private String locationCountryCode;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Character status;
    @Basic(optional = false)
    @Column(name = "CORPORATE_CODE")
    private String corporateCode;
    @Basic(optional = false)
    @Column(name = "CHAIN_CODE")
    private String chainCode;
    @Basic(optional = false)
    @Column(name = "IN_STATION_FLAG")
    private Character inStationFlag;
    @Basic(optional = false)
    @Column(name = "TERMINAL_FUEL_FLAG")
    private Character terminalFuelFlag;

    @Basic(optional = false)
    @Column(name = "SELF_SERV_CASH_PPU")
    private BigDecimal selfServCashPpu;
    @Basic(optional = false)
    @Column(name = "BYPASS_2HR_CHECK")
    private Character bypass2hrCheck;
    @Basic(optional = false)
    @Column(name = "POS_ADDRESS_FLAG")
    private Character posAddressFlag;
    @Basic(optional = false)
    @Column(name = "UNATTENDED_RTN_VALUE")
    private Character unattendedRtnValue;
    @Basic(optional = false)
    @Column(name = "LAST_CRC")
    private long lastCrc;
    @Basic(optional = false)
    @Column(name = "LAST_UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateTs;
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
    @Basic(optional = false)
    @Column(name = "NR2_DEF_CODE")
    private String nr2DefCode;
    @Basic(optional = false)
    @Column(name = "NR1_DEF_CODE")
    private String nr1DefCode;
    @Basic(optional = false)
    @Column(name = "RFR_DEF_CODE")
    private String rfrDefCode;
    @Basic(optional = false)
    @Column(name = "OTH_DEF_CODE")
    private String othDefCode;
    @Basic(optional = false)
    @Column(name = "LAT_NBR")
    private BigDecimal latNbr;
    @Basic(optional = false)
    @Column(name = "LONG_NBR")
    private BigDecimal longNbr;
    @Basic(optional = false)
    @Column(name = "RFID_ENABLED_FL")
    private Character rfidEnabledFl;
    @Basic(optional = false)
    @Column(name = "LIMIT_RFID_PROMPTS_FL")
    private Character limitRfidPromptsFl;
    @Basic(optional = false)
    @Column(name = "SCM_LAST_UPDATE")
    private Character scmLastUpdate;
    @Basic(optional = false)
    @Column(name = "SCM_ACCOUNT_CODE")
    private String scmAccountCode;
    @Basic(optional = false)
    @Column(name = "SCM_BUSINESS_TYPE_CODE")
    private String scmBusinessTypeCode;
    @Basic(optional = false)
    @Column(name = "SCM_PREMIER_LEVEL")
    private Character scmPremierLevel;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLEMENT_FLAG")
    private Character scmSettlementFlag;
    @Basic(optional = false)
    @Column(name = "SCM_LAST_CHECK_NUMBER")
    private int scmLastCheckNumber;
    @Basic(optional = false)
    @Column(name = "SCM_PMT_LOCATION_FLAG")
    private Character scmPmtLocationFlag;
    @Basic(optional = false)
    @Column(name = "SCM_RELATIONSHIP_FLAG")
    private Character scmRelationshipFlag;
    @Basic(optional = false)
    @Column(name = "SCM_HOURS_OF_OPERATION")
    private String scmHoursOfOperation;
    @Basic(optional = false)
    @Column(name = "SCM_DIRECTIONS")
    private String scmDirections;
    @Basic(optional = false)
    @Column(name = "SCM_FAX_FLAG")
    private Character scmFaxFlag;
    @Basic(optional = false)
    @Column(name = "SCM_FAX_CDN_PERCENT")
    private short scmFaxCdnPercent;
    @Basic(optional = false)
    @Column(name = "SCM_FAX_TS_PERCENT")
    private short scmFaxTsPercent;
    @Basic(optional = false)
    @Column(name = "SCM_FUEL_BRAND_1ST_5")
    private String scmFuelBrand1st5;
    @Basic(optional = false)
    @Column(name = "SCM_AUTOMATION_INPUT_STATUS")
    private Character scmAutomationInputStatus;
    @Basic(optional = false)
    @Column(name = "SCM_AUTOMATION_OUTPUT_STATUS")
    private Character scmAutomationOutputStatus;
    @Basic(optional = false)
    @Column(name = "SCM_CASH_FUEL_PRICE_FLAG")
    private Character scmCashFuelPriceFlag;
    @Basic(optional = false)
    @Column(name = "SCM_FULL_SERV_CASH_FLAG")
    private Character scmFullServCashFlag;
    @Basic(optional = false)
    @Column(name = "SCM_MINI_SERV_CASH_FLAG")
    private Character scmMiniServCashFlag;
    @Basic(optional = false)
    @Column(name = "SCM_SELF_SERV_CASH_FLAG")
    private Character scmSelfServCashFlag;
    @Basic(optional = false)
    @Column(name = "SCM_FULL_SERV_CASH_PRICE")
    private BigDecimal scmFullServCashPrice;
    @Basic(optional = false)
    @Column(name = "SCM_MINI_SERV_CASH_PRICE")
    private BigDecimal scmMiniServCashPrice;
    @Basic(optional = false)
    @Column(name = "SCM_SELF_SERV_CASH_PRICE")
    private BigDecimal scmSelfServCashPrice;
    @Basic(optional = false)
    @Column(name = "SCM_CREDIT_FUEL_PRICE_FLAG")
    private Character scmCreditFuelPriceFlag;
    @Basic(optional = false)
    @Column(name = "SCM_FULL_SERV_CREDIT_FLAG")
    private Character scmFullServCreditFlag;
    @Basic(optional = false)
    @Column(name = "SCM_MINI_SERV_CREDIT_FLAG")
    private Character scmMiniServCreditFlag;
    @Basic(optional = false)
    @Column(name = "SCM_SELF_SERV_CREDIT_FLAG")
    private Character scmSelfServCreditFlag;
    @Basic(optional = false)
    @Column(name = "SCM_FULL_SERV_CREDIT_PRICE")
    private BigDecimal scmFullServCreditPrice;
    @Basic(optional = false)
    @Column(name = "SCM_MINI_SERV_CREDIT_PRICE")
    private BigDecimal scmMiniServCreditPrice;
    @Basic(optional = false)
    @Column(name = "SCM_SELF_SERV_CREDIT_PRICE")
    private BigDecimal scmSelfServCreditPrice;
    @Basic(optional = false)
    @Column(name = "SCM_DISCOUNT_BASIS")
    private Character scmDiscountBasis;
    @Basic(optional = false)
    @Column(name = "SCM_VOLUME_REBATE_TYPE")
    private Character scmVolumeRebateType;
    @Basic(optional = false)
    @Column(name = "SCM_COMDATA_COMPLETE_FLAG")
    private Character scmComdataCompleteFlag;
    @Basic(optional = false)
    @Column(name = "SCM_TERMINAL_FUEL_TYPE")
    private Character scmTerminalFuelType;
    @Basic(optional = false)
    @Column(name = "SCM_CASH_ADVANCE_LIMIT")
    private BigDecimal scmCashAdvanceLimit;
    @Basic(optional = false)
    @Column(name = "SCM_COST_PLUS_FLAG")
    private Character scmCostPlusFlag;
    @Basic(optional = false)
    @Column(name = "SCM_COMDATA_COMPLETE_ACCT")
    private String scmComdataCompleteAcct;
    @Basic(optional = false)
    @Column(name = "SCM_OVER_RIDE_RATE")
    private int scmOverRideRate;
    @Basic(optional = false)
    @Column(name = "SCM_PREMIER_2_FLAG")
    private Character scmPremier2Flag;
    @Basic(optional = false)
    @Column(name = "SCM_P2_DISC_BASIS")
    private Character scmP2DiscBasis;
    @Basic(optional = false)
    @Column(name = "SCM_P2_SELF_DISC")
    private BigDecimal scmP2SelfDisc;
    @Basic(optional = false)
    @Column(name = "SCM_P2_MINI_DISC")
    private BigDecimal scmP2MiniDisc;
    @Basic(optional = false)
    @Column(name = "SCM_P2_FULL_DISC")
    private BigDecimal scmP2FullDisc;
    @Basic(optional = false)
    @Column(name = "SCM_P2_OTHER_DISC_FLAG")
    private Character scmP2OtherDiscFlag;
    @Basic(optional = false)
    @Column(name = "SCM_P2_OTHER_DISC_BASIS")
    private Character scmP2OtherDiscBasis;
    @Basic(optional = false)
    @Column(name = "SCM_P2_OTHER_DISC")
    private BigDecimal scmP2OtherDisc;
    @Basic(optional = false)
    @Column(name = "SCM_P2_DISC_START_DATE")
    @Temporal(TemporalType.DATE)
    private Date scmP2DiscStartDate;
    @Basic(optional = false)
    @Column(name = "SCM_P2_DISC_END_DATE")
    @Temporal(TemporalType.DATE)
    private Date scmP2DiscEndDate;
    @Basic(optional = false)
    @Column(name = "SCM_P2_DISC_SET_UP_CHARGE")
    private BigDecimal scmP2DiscSetUpCharge;
    @Basic(optional = false)
    @Column(name = "SCM_P2_DISC_REVISION_DATE")
    @Temporal(TemporalType.DATE)
    private Date scmP2DiscRevisionDate;
    @Basic(optional = false)
    @Column(name = "SCM_P2_DISC_REVISION_CHARGE")
    private BigDecimal scmP2DiscRevisionCharge;
    @Basic(optional = false)
    @Column(name = "SCM_RMS_ALLIANCE_FLAG")
    private Character scmRmsAllianceFlag;
    @Basic(optional = false)
    @Column(name = "SCM_AUTOMATED_XTN_RATE")
    private BigDecimal scmAutomatedXtnRate;
    @Basic(optional = false)
    @Column(name = "SCM_AUTO_UP_MANUAL_XTN_RATE")
    private BigDecimal scmAutoUpManualXtnRate;
    @Basic(optional = false)
    @Column(name = "SCM_AUTO_EXPRESS_XTN_RATE")
    private BigDecimal scmAutoExpressXtnRate;
    @Basic(optional = false)
    @Column(name = "SCM_ELECT_AD_REFERENCE_NR")
    private int scmElectAdReferenceNr;
    @Basic(optional = false)
    @Column(name = "SCM_ELECT_AD_CHARGE")
    private BigDecimal scmElectAdCharge;
    @Basic(optional = false)
    @Column(name = "SCM_AUTOMATED_CALL_FEE")
    private BigDecimal scmAutomatedCallFee;
    @Basic(optional = false)
    @Column(name = "SCM_LIMITED_NETWORK_FLAG")
    private Character scmLimitedNetworkFlag;
    @Basic(optional = false)
    @Column(name = "SCM_DIALIN_PICKUP")
    private Character scmDialinPickup;
    @Basic(optional = false)
    @Column(name = "SCM_MC_FLAG")
    private Character scmMcFlag;
    @Basic(optional = false)
    @Column(name = "SCM_VISA_FLAG")
    private Character scmVisaFlag;
    @Basic(optional = false)
    @Column(name = "SCM_ALLIANCE_PLUS_FLAG")
    private Character scmAlliancePlusFlag;
    @Basic(optional = false)
    @Column(name = "SCM_POS_ADDRESS_FLAG")
    private Character scmPosAddressFlag;
    @Basic(optional = false)
    @Column(name = "SCM_MCP_FLAG")
    private Character scmMcpFlag;
    @Basic(optional = false)
    @Column(name = "SCM_MCP_CODE")
    private String scmMcpCode;
    @Basic(optional = false)
    @Column(name = "SCM_DISCOVER_FLAG")
    private Character scmDiscoverFlag;
    @Basic(optional = false)
    @Column(name = "SCM_SECURITY_FLAG")
    private Character scmSecurityFlag;
    @Basic(optional = false)
    @Column(name = "SCM_MANUAL_EXPRESS_XTN_RATE")
    private BigDecimal scmManualExpressXtnRate;
    @Basic(optional = false)
    @Column(name = "SCM_LAST_SETTLE_DATE")
    @Temporal(TemporalType.DATE)
    private Date scmLastSettleDate;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_COUNT")
    private short scmSettleCount;
    @Basic(optional = false)
    @Column(name = "SCM_EQUIP_BILL_AMT")
    private BigDecimal scmEquipBillAmt;
    @Basic(optional = false)
    @Column(name = "SCM_EQUIP_BILL_DATE")
    @Temporal(TemporalType.DATE)
    private Date scmEquipBillDate;
    @Basic(optional = false)
    @Column(name = "SCM_EQUIP_SETTLE_DATE")
    @Temporal(TemporalType.DATE)
    private Date scmEquipSettleDate;
    @Basic(optional = false)
    @Column(name = "SCM_TRANS_FEE_FLAG_1")
    private Character scmTransFeeFlag1;
    @Basic(optional = false)
    @Column(name = "SCM_AUTOMATION_LEVEL_1")
    private BigDecimal scmAutomationLevel1;
    @Basic(optional = false)
    @Column(name = "SCM_TRANS_FEE_FLAG_2")
    private Character scmTransFeeFlag2;
    @Basic(optional = false)
    @Column(name = "SCM_AUTOMATION_LEVEL_2")
    private BigDecimal scmAutomationLevel2;
    @Basic(optional = false)
    @Column(name = "SCM_LAST_FP_DATE")
    @Temporal(TemporalType.DATE)
    private Date scmLastFpDate;
    @Basic(optional = false)
    @Column(name = "SCM_COUNTRY_CODE")
    private Character scmCountryCode;
    @Basic(optional = false)
    @Column(name = "SCM_BRIDGE_LOCATION_FLAG")
    private Character scmBridgeLocationFlag;
    @Basic(optional = false)
    @Column(name = "SCM_VENDOR_CODE")
    private String scmVendorCode;
    @Basic(optional = false)
    @Column(name = "SCM_TRENDAR_ID")
    private String scmTrendarId;
    @Basic(optional = false)
    @Column(name = "SCM_PAC_PRIDE_FLAG")
    private Character scmPacPrideFlag;
    @Basic(optional = false)
    @Column(name = "SCM_LAST_USE_PPG")
    private BigDecimal scmLastUsePpg;
    @Basic(optional = false)
    @Column(name = "SCM_FOCUS_DISCOUNT_FLAG")
    private Character scmFocusDiscountFlag;
    @Basic(optional = false)
    @Column(name = "SCM_ACH_SETTLEMENT_FLAG")
    private Character scmAchSettlementFlag;
    @Basic(optional = false)
    @Column(name = "SCM_TAX_APPLICATION")
    private Character scmTaxApplication;
    @Basic(optional = false)
    @Column(name = "SCM_MANUAL_CALL_FEE")
    private BigDecimal scmManualCallFee;
    @Basic(optional = false)
    @Column(name = "SCM_MASTER_SVC_CTR_CODE")
    private String scmMasterSvcCtrCode;
    @Basic(optional = false)
    @Column(name = "SCM_5000_CC_FLAG")
    private Character scm5000CcFlag;
    @Basic(optional = false)
    @Column(name = "SCM_CASINO_FLAG")
    private Character scmCasinoFlag;
    @Basic(optional = false)
    @Column(name = "SCM_RETAIL_FLAG")
    private Character scmRetailFlag;
    @Basic(optional = false)
    @Column(name = "SCM_TMP_FLAG")
    private Character scmTmpFlag;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_LOC_STATUS")
    private Character scmSettleLocStatus;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_BALANCE_CYCLE")
    private Character scmSettleBalanceCycle;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_BALANCE_DAY")
    private short scmSettleBalanceDay;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_BALANCE_INDEP")
    private Character scmSettleBalanceIndep;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_CLOSING_CYCLE")
    private Character scmSettleClosingCycle;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_CLOSING_DAY")
    private short scmSettleClosingDay;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_CLOSING_INDPNT")
    private Character scmSettleClosingIndpnt;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_PAYMENT_CYCLE")
    private Character scmSettlePaymentCycle;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_PAYMENT_INDPNT")
    private Character scmSettlePaymentIndpnt;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_PAYMENT_DAY_R")
    private String scmSettlePaymentDayR;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_PAYMENT_TO_LOC")
    private String scmSettlePaymentToLoc;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_PAYMENT_LOC_TYPE")
    private String scmSettlePaymentLocType;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_PAYMENT_METHOD")
    private String scmSettlePaymentMethod;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_PAYMENT_DELAY")
    private short scmSettlePaymentDelay;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_PAYMENT_STYLE")
    private Character scmSettlePaymentStyle;
    @Basic(optional = false)
    @Column(name = "SCM_MAXIMUM_LITERAL")
    private String scmMaximumLiteral;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_SP_PAYMENT_METHOD")
    private String scmSettleSpPaymentMethod;
    @Basic(optional = false)
    @Column(name = "SCM_PREFERRED_FEE")
    private BigDecimal scmPreferredFee;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_PAY_BY_TICKETS")
    private Character scmSettlePayByTickets;
    @Basic(optional = false)
    @Column(name = "SCM_RECOURSE_FLAG")
    private Character scmRecourseFlag;
    @Basic(optional = false)
    @Column(name = "SCM_IOL_XREF_LOCATION")
    private String scmIolXrefLocation;
    @Basic(optional = false)
    @Column(name = "SCM_NATS_FLAG")
    private Character scmNatsFlag;
    @Basic(optional = false)
    @Column(name = "SCM_NATS_ACCT_CODE")
    private int scmNatsAcctCode;
    @Basic(optional = false)
    @Column(name = "SCM_DIRECTIONS_II")
    private String scmDirectionsIi;
    @Basic(optional = false)
    @Column(name = "SCM_BOM_MCHNT_NR")
    private String scmBomMchntNr;
    @Basic(optional = false)
    @Column(name = "SCM_IOL_RCP")
    private BigDecimal scmIolRcp;
    @Basic(optional = false)
    @Column(name = "SCM_VRU_EXPRESS_XTN_RATE")
    private BigDecimal scmVruExpressXtnRate;
    @Basic(optional = false)
    @Column(name = "SCM_VRU_FUEL_XTN_RATE")
    private BigDecimal scmVruFuelXtnRate;
    @Basic(optional = false)
    @Column(name = "SCM_MANUAL_PREFERRED_FEE")
    private BigDecimal scmManualPreferredFee;
    @Basic(optional = false)
    @Column(name = "SCM_MISC_FEE")
    private BigDecimal scmMiscFee;
    @Basic(optional = false)
    @Column(name = "SCM_MAN_FUEL_FEE_TYPE")
    private Character scmManFuelFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_AUTO_FUEL_FEE_TYPE")
    private Character scmAutoFuelFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_MAN_EXP_FEE_TYPE")
    private Character scmManExpFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_AUTO_EXP_FEE_TYPE")
    private Character scmAutoExpFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_MAN_PREF_FEE_TYPE")
    private Character scmManPrefFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_AUTO_PREF_FEE_TYPE")
    private Character scmAutoPrefFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_VRU_FUEL_FEE_TYPE")
    private Character scmVruFuelFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_VRU_EXP_FEE_TYPE")
    private Character scmVruExpFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_MISC_FEE_TYPE")
    private Character scmMiscFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_EQUIP_FEE")
    private BigDecimal scmEquipFee;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLEMENT_MASTER")
    private String scmSettlementMaster;
    @Basic(optional = false)
    @Column(name = "SCM_PTP_ACCOUNT_CODE")
    private String scmPtpAccountCode;
    @Basic(optional = false)
    @Column(name = "SCM_PTP_CUSTOMER_ID")
    private int scmPtpCustomerId;
    @Basic(optional = false)
    @Column(name = "SCM_FDIS_TRANS_FEE")
    private BigDecimal scmFdisTransFee;
    @Basic(optional = false)
    @Column(name = "SCM_USE_CREDIT_MARKUP_FLAG")
    private Character scmUseCreditMarkupFlag;
    @Basic(optional = false)
    @Column(name = "SCM_CREDIT_MARKUP")
    private int scmCreditMarkup;
    @Basic(optional = false)
    @Column(name = "SCM_LAST_DELETE_DATE")
    private int scmLastDeleteDate;
    @Basic(optional = false)
    @Column(name = "SCM_JCB_FLAG")
    private Character scmJcbFlag;
    @Basic(optional = false)
    @Column(name = "SCM_SF_BALANCE_FEE")
    private short scmSfBalanceFee;
    @Basic(optional = false)
    @Column(name = "SCM_SF_BAL_FEE_DEF")
    private Character scmSfBalFeeDef;
    @Basic(optional = false)
    @Column(name = "SCM_SF_BALANCE_NR_FREE")
    private int scmSfBalanceNrFree;
    @Basic(optional = false)
    @Column(name = "SCM_SF_BAL_NR_FREE_DEF")
    private Character scmSfBalNrFreeDef;
    @Basic(optional = false)
    @Column(name = "SCM_SF_BALANCE_COUNT")
    private int scmSfBalanceCount;
    @Basic(optional = false)
    @Column(name = "SCM_SF_LAST_BAL_DATE")
    @Temporal(TemporalType.DATE)
    private Date scmSfLastBalDate;
    @Basic(optional = false)
    @Column(name = "SCM_SF_CLOSING_FEE")
    private BigDecimal scmSfClosingFee;
    @Basic(optional = false)
    @Column(name = "SCM_SF_CLO_FEE_DEF")
    private Character scmSfCloFeeDef;
    @Basic(optional = false)
    @Column(name = "SCM_SF_CLOSING_NR_FREE")
    private int scmSfClosingNrFree;
    @Basic(optional = false)
    @Column(name = "SCM_SF_CLO_NR_FREE_DEF")
    private Character scmSfCloNrFreeDef;
    @Basic(optional = false)
    @Column(name = "SCM_SF_CLOSING_COUNT")
    private int scmSfClosingCount;
    @Basic(optional = false)
    @Column(name = "SCM_SF_LAST_CLO_DATE")
    @Temporal(TemporalType.DATE)
    private Date scmSfLastCloDate;
    @Basic(optional = false)
    @Column(name = "SCM_SF_PAYMENT_FEE")
    private BigDecimal scmSfPaymentFee;
    @Basic(optional = false)
    @Column(name = "SCM_SF_PAY_FEE_DEF")
    private Character scmSfPayFeeDef;
    @Basic(optional = false)
    @Column(name = "SCM_SF_PAYMENT_NR_FREE")
    private int scmSfPaymentNrFree;
    @Basic(optional = false)
    @Column(name = "SCM_SF_PAY_NR_FREE_DEF")
    private Character scmSfPayNrFreeDef;
    @Basic(optional = false)
    @Column(name = "SCM_RMF_FLAG")
    private Character scmRmfFlag;
    @Basic(optional = false)
    @Column(name = "SCM_ITP_FLAG")
    private Character scmItpFlag;
    @Basic(optional = false)
    @Column(name = "SCM_FIELD_REP")
    private String scmFieldRep;
    @Basic(optional = false)
    @Column(name = "SCM_DUP_CHECK")
    private short scmDupCheck;
    @Basic(optional = false)
    @Column(name = "SCM_TB_DAILY_MAX_AMT")
    private BigDecimal scmTbDailyMaxAmt;
    @Basic(optional = false)
    @Column(name = "SCM_TB_CUMMULATIVE_AMT")
    private BigDecimal scmTbCummulativeAmt;
    @Basic(optional = false)
    @Column(name = "SCM_TB_CUTOFF_AMT")
    private BigDecimal scmTbCutoffAmt;
    @Basic(optional = false)
    @Column(name = "SCM_TB_PREFERRED_RATE_FLAG")
    private Character scmTbPreferredRateFlag;
    @Basic(optional = false)
    @Column(name = "SCM_TB_APPLY_CHECK_NEGATION")
    private Character scmTbApplyCheckNegation;
    @Basic(optional = false)
    @Column(name = "SCM_CREDIT_RATE")
    private int scmCreditRate;
    @Basic(optional = false)
    @Column(name = "SCM_DEBIT_RATE")
    private int scmDebitRate;
    @Basic(optional = false)
    @Column(name = "SCM_DEBIT_FLAG")
    private Character scmDebitFlag;
    @Basic(optional = false)
    @Column(name = "SCM_AMEX_FLAG")
    private Character scmAmexFlag;
    @Basic(optional = false)
    @Column(name = "SCM_CREDIT_PROGRAM_FLAG")
    private Character scmCreditProgramFlag;
    @Basic(optional = false)
    @Column(name = "SCM_TEXACO_FLAG")
    private Character scmTexacoFlag;
    @Basic(optional = false)
    @Column(name = "SCM_AUTO_CALC_TAX")
    private Character scmAutoCalcTax;
    @Basic(optional = false)
    @Column(name = "SCM_CORP_REBATE_FLAG")
    private Character scmCorpRebateFlag;
    @Basic(optional = false)
    @Column(name = "SCM_CORP_REBATE_TYPE")
    private Character scmCorpRebateType;
    @Basic(optional = false)
    @Column(name = "SCM_CORP_REBATE_AMOUNT")
    private BigDecimal scmCorpRebateAmount;
    @Basic(optional = false)
    @Column(name = "SCM_CORP_REBATE_LOCATION")
    private String scmCorpRebateLocation;
    @Basic(optional = false)
    @Column(name = "SCM_MAN_CASH_ADD_ON_FEE")
    private BigDecimal scmManCashAddOnFee;
    @Basic(optional = false)
    @Column(name = "SCM_MAN_CASH_FEE_TYPE")
    private Character scmManCashFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_AUTO_CASH_ADD_ON_FEE")
    private BigDecimal scmAutoCashAddOnFee;
    @Basic(optional = false)
    @Column(name = "SCM_AUTO_CASH_FEE_TYPE")
    private Character scmAutoCashFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_AUTO_DRAFT_XTN_RATE")
    private BigDecimal scmAutoDraftXtnRate;
    @Basic(optional = false)
    @Column(name = "SCM_AUTO_DFT_FEE_TYPE")
    private Character scmAutoDftFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_MANUAL_DRAFT_XTN_RATE")
    private BigDecimal scmManualDraftXtnRate;
    @Basic(optional = false)
    @Column(name = "SCM_MAN_DFT_FEE_TYPE")
    private Character scmManDftFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_VRU_DRAFT_XTN_RATE")
    private BigDecimal scmVruDraftXtnRate;
    @Basic(optional = false)
    @Column(name = "SCM_VRU_DFT_FEE_TYPE")
    private Character scmVruDftFeeType;
    @Basic(optional = false)
    @Column(name = "SCM_AUTOMATION_LEVEL_OVERRIDE")
    private Character scmAutomationLevelOverride;
    @Basic(optional = false)
    @Column(name = "SCM_TEST_LOCATION_FLAG")
    private Character scmTestLocationFlag;
    @Basic(optional = false)
    @Column(name = "SCM_CASH_OUT_COST")
    private BigDecimal scmCashOutCost;
    @Basic(optional = false)
    @Column(name = "SCM_SETTLE_CODEWORD")
    private String scmSettleCodeword;
    @Basic(optional = false)
    @Column(name = "SCM_TRENDAR_ID_1")
    private String scmTrendarId1;
    @Basic(optional = false)
    @Column(name = "SCM_NET_PRICING_FL")
    private Character scmNetPricingFl;
    @Basic(optional = false)
    @Column(name = "SCM_PRICING_FLE_ID")
    private String scmPricingFleId;
    @Basic(optional = false)
    @Column(name = "SCM_MERCH_SUR_CHG_PCT")
    private BigDecimal scmMerchSurChgPct;
    @Basic(optional = false)
    @Column(name = "SCM_MIN_FEE_FLAG")
    private Character scmMinFeeFlag;
    @Basic(optional = false)
    @Column(name = "SCM_MIN_FEE_CPG")
    private BigDecimal scmMinFeeCpg;
    @Basic(optional = false)
    @Column(name = "SCM_GALUP_FEE_FLAG")
    private Character scmGalupFeeFlag;
    @Basic(optional = false)
    @Column(name = "SCM_GALUP_FEE_CPG")
    private BigDecimal scmGalupFeeCpg;
    @Basic(optional = false)
    @Column(name = "RETRY_FLG")
    private Character retryFlg;
    @Basic(optional = false)
    @Column(name = "MANUAL_FLG")
    private Character manualFlg;
    @Basic(optional = false)
    @Column(name = "GEO_PRCSN_NM")
    private String geoPrcsnNm;
    @Basic(optional = false)
    @Column(name = "HWY_NBR")
    private String hwyNbr;
    @Basic(optional = false)
    @Column(name = "EXIT_NBR")
    private String exitNbr;
    @Basic(optional = false)
    @Column(name = "FUEL_BRAND_NM")
    private String fuelBrandNm;
    @Basic(optional = false)
    @Column(name = "ATM_FLG")
    private Character atmFlg;
    @Basic(optional = false)
    @Column(name = "CASH_ADV_FLG")
    private Character cashAdvFlg;
    @Basic(optional = false)
    @Column(name = "DELI_FLG")
    private Character deliFlg;
    @Basic(optional = false)
    @Column(name = "FULL_SERV_FUEL_FLG")
    private Character fullServFuelFlg;
    @Basic(optional = false)
    @Column(name = "LOUNGE_FLG")
    private Character loungeFlg;
    @Basic(optional = false)
    @Column(name = "MINI_FLG")
    private Character miniFlg;
    @Basic(optional = false)
    @Column(name = "MOTEL_FLG")
    private Character motelFlg;
    @Basic(optional = false)
    @Column(name = "PERMITS_AVAL_FLG")
    private Character permitsAvalFlg;
    @Basic(optional = false)
    @Column(name = "PAVED_TRUCK_PARK_FLG")
    private Character pavedTruckParkFlg;
    @Basic(optional = false)
    @Column(name = "SAFE_HAVEN_FLG")
    private Character safeHavenFlg;
    @Basic(optional = false)
    @Column(name = "SELF_SERV_FUEL_FLG")
    private Character selfServFuelFlg;
    @Basic(optional = false)
    @Column(name = "FMALE_SHOWERS_FLG")
    private Character fmaleShowersFlg;
    @Basic(optional = false)
    @Column(name = "TV_GM_RM_FLG")
    private Character tvGmRmFlg;
    @Basic(optional = false)
    @Column(name = "LAUNDRY_FLG")
    private Character laundryFlg;
    @Basic(optional = false)
    @Column(name = "MAJOR_REPAIR_FLG")
    private Character majorRepairFlg;
    @Basic(optional = false)
    @Column(name = "MINOR_REPAIR_FLG")
    private Character minorRepairFlg;
    @Basic(optional = false)
    @Column(name = "MALE_SHOWERS_FLG")
    private Character maleShowersFlg;
    @Basic(optional = false)
    @Column(name = "RESTAURANT_FLG")
    private Character restaurantFlg;
    @Basic(optional = false)
    @Column(name = "SCALES_AVAL_FLG")
    private Character scalesAvalFlg;
    @Basic(optional = false)
    @Column(name = "TRUCK_STORE_FLG")
    private Character truckStoreFlg;
    @Basic(optional = false)
    @Column(name = "TIRE_REPAIR_FLG")
    private Character tireRepairFlg;
    @Basic(optional = false)
    @Column(name = "WRECKER_SERV_FLG")
    private Character wreckerServFlg;
    @Basic(optional = false)
    @Column(name = "TRUCK_WASH_FLG")
    private Character truckWashFlg;
    @Basic(optional = false)
    @Column(name = "FEDEX_DROP_OFF_BOX_FLG")
    private Character fedexDropOffBoxFlg;
    @Basic(optional = false)
    @Column(name = "UPS_DROP_OFF_BOX_FLG")
    private Character upsDropOffBoxFlg;
    @Basic(optional = false)
    @Column(name = "AIRBORN_DROP_OFF_BOX_FLG")
    private Character airbornDropOffBoxFlg;
    @Basic(optional = false)
    @Column(name = "OVER_NIGHT_PARK_FLG")
    private Character overNightParkFlg;
    @Basic(optional = false)
    @Column(name = "PAYCODE_FLAG")
    private Character paycodeFlag;

    public ServiceCenter() {
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getAcquirerId() {
        return acquirerId;
    }

    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    public String getAcceptorId() {
        return acceptorId;
    }

    public void setAcceptorId(String acceptorId) {
        this.acceptorId = acceptorId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationStateProvince() {
        return locationStateProvince;
    }

    public void setLocationStateProvince(String locationStateProvince) {
        this.locationStateProvince = locationStateProvince;
    }

    public String getLocationPostalCode() {
        return locationPostalCode;
    }

    public void setLocationPostalCode(String locationPostalCode) {
        this.locationPostalCode = locationPostalCode;
    }

    public String getLocationCountryCode() {
        return locationCountryCode;
    }

    public void setLocationCountryCode(String locationCountryCode) {
        this.locationCountryCode = locationCountryCode;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getCorporateCode() {
        return corporateCode;
    }

    public void setCorporateCode(String corporateCode) {
        this.corporateCode = corporateCode;
    }

    public String getChainCode() {
        return chainCode;
    }

    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    public Character getInStationFlag() {
        return inStationFlag;
    }

    public void setInStationFlag(Character inStationFlag) {
        this.inStationFlag = inStationFlag;
    }

    public Character getTerminalFuelFlag() {
        return terminalFuelFlag;
    }

    public void setTerminalFuelFlag(Character terminalFuelFlag) {
        this.terminalFuelFlag = terminalFuelFlag;
    }

    public BigDecimal getSelfServCashPpu() {
        return selfServCashPpu;
    }

    public void setSelfServCashPpu(BigDecimal selfServCashPpu) {
        this.selfServCashPpu = selfServCashPpu;
    }

    public Character getBypass2hrCheck() {
        return bypass2hrCheck;
    }

    public void setBypass2hrCheck(Character bypass2hrCheck) {
        this.bypass2hrCheck = bypass2hrCheck;
    }

    public Character getPosAddressFlag() {
        return posAddressFlag;
    }

    public void setPosAddressFlag(Character posAddressFlag) {
        this.posAddressFlag = posAddressFlag;
    }

    public Character getUnattendedRtnValue() {
        return unattendedRtnValue;
    }

    public void setUnattendedRtnValue(Character unattendedRtnValue) {
        this.unattendedRtnValue = unattendedRtnValue;
    }

    public long getLastCrc() {
        return lastCrc;
    }

    public void setLastCrc(long lastCrc) {
        this.lastCrc = lastCrc;
    }

    public Date getLastUpdateTs() {
        return lastUpdateTs;
    }

    public void setLastUpdateTs(Date lastUpdateTs) {
        this.lastUpdateTs = lastUpdateTs;
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

    public String getNr2DefCode() {
        return nr2DefCode;
    }

    public void setNr2DefCode(String nr2DefCode) {
        this.nr2DefCode = nr2DefCode;
    }

    public String getNr1DefCode() {
        return nr1DefCode;
    }

    public void setNr1DefCode(String nr1DefCode) {
        this.nr1DefCode = nr1DefCode;
    }

    public String getRfrDefCode() {
        return rfrDefCode;
    }

    public void setRfrDefCode(String rfrDefCode) {
        this.rfrDefCode = rfrDefCode;
    }

    public String getOthDefCode() {
        return othDefCode;
    }

    public void setOthDefCode(String othDefCode) {
        this.othDefCode = othDefCode;
    }

    public BigDecimal getLatNbr() {
        return latNbr;
    }

    public void setLatNbr(BigDecimal latNbr) {
        this.latNbr = latNbr;
    }

    public BigDecimal getLongNbr() {
        return longNbr;
    }

    public void setLongNbr(BigDecimal longNbr) {
        this.longNbr = longNbr;
    }

    public Character getRfidEnabledFl() {
        return rfidEnabledFl;
    }

    public void setRfidEnabledFl(Character rfidEnabledFl) {
        this.rfidEnabledFl = rfidEnabledFl;
    }

    public Character getLimitRfidPromptsFl() {
        return limitRfidPromptsFl;
    }

    public void setLimitRfidPromptsFl(Character limitRfidPromptsFl) {
        this.limitRfidPromptsFl = limitRfidPromptsFl;
    }

    public Character getScmLastUpdate() {
        return scmLastUpdate;
    }

    public void setScmLastUpdate(Character scmLastUpdate) {
        this.scmLastUpdate = scmLastUpdate;
    }

    public String getScmAccountCode() {
        return scmAccountCode;
    }

    public void setScmAccountCode(String scmAccountCode) {
        this.scmAccountCode = scmAccountCode;
    }

    public String getScmBusinessTypeCode() {
        return scmBusinessTypeCode;
    }

    public void setScmBusinessTypeCode(String scmBusinessTypeCode) {
        this.scmBusinessTypeCode = scmBusinessTypeCode;
    }

    public Character getScmPremierLevel() {
        return scmPremierLevel;
    }

    public void setScmPremierLevel(Character scmPremierLevel) {
        this.scmPremierLevel = scmPremierLevel;
    }

    public Character getScmSettlementFlag() {
        return scmSettlementFlag;
    }

    public void setScmSettlementFlag(Character scmSettlementFlag) {
        this.scmSettlementFlag = scmSettlementFlag;
    }

    public int getScmLastCheckNumber() {
        return scmLastCheckNumber;
    }

    public void setScmLastCheckNumber(int scmLastCheckNumber) {
        this.scmLastCheckNumber = scmLastCheckNumber;
    }

    public Character getScmPmtLocationFlag() {
        return scmPmtLocationFlag;
    }

    public void setScmPmtLocationFlag(Character scmPmtLocationFlag) {
        this.scmPmtLocationFlag = scmPmtLocationFlag;
    }

    public Character getScmRelationshipFlag() {
        return scmRelationshipFlag;
    }

    public void setScmRelationshipFlag(Character scmRelationshipFlag) {
        this.scmRelationshipFlag = scmRelationshipFlag;
    }

    public String getScmHoursOfOperation() {
        return scmHoursOfOperation;
    }

    public void setScmHoursOfOperation(String scmHoursOfOperation) {
        this.scmHoursOfOperation = scmHoursOfOperation;
    }

    public String getScmDirections() {
        return scmDirections;
    }

    public void setScmDirections(String scmDirections) {
        this.scmDirections = scmDirections;
    }

    public Character getScmFaxFlag() {
        return scmFaxFlag;
    }

    public void setScmFaxFlag(Character scmFaxFlag) {
        this.scmFaxFlag = scmFaxFlag;
    }

    public short getScmFaxCdnPercent() {
        return scmFaxCdnPercent;
    }

    public void setScmFaxCdnPercent(short scmFaxCdnPercent) {
        this.scmFaxCdnPercent = scmFaxCdnPercent;
    }

    public short getScmFaxTsPercent() {
        return scmFaxTsPercent;
    }

    public void setScmFaxTsPercent(short scmFaxTsPercent) {
        this.scmFaxTsPercent = scmFaxTsPercent;
    }

    public String getScmFuelBrand1st5() {
        return scmFuelBrand1st5;
    }

    public void setScmFuelBrand1st5(String scmFuelBrand1st5) {
        this.scmFuelBrand1st5 = scmFuelBrand1st5;
    }

    public Character getScmAutomationInputStatus() {
        return scmAutomationInputStatus;
    }

    public void setScmAutomationInputStatus(Character scmAutomationInputStatus) {
        this.scmAutomationInputStatus = scmAutomationInputStatus;
    }

    public Character getScmAutomationOutputStatus() {
        return scmAutomationOutputStatus;
    }

    public void setScmAutomationOutputStatus(Character scmAutomationOutputStatus) {
        this.scmAutomationOutputStatus = scmAutomationOutputStatus;
    }

    public Character getScmCashFuelPriceFlag() {
        return scmCashFuelPriceFlag;
    }

    public void setScmCashFuelPriceFlag(Character scmCashFuelPriceFlag) {
        this.scmCashFuelPriceFlag = scmCashFuelPriceFlag;
    }

    public Character getScmFullServCashFlag() {
        return scmFullServCashFlag;
    }

    public void setScmFullServCashFlag(Character scmFullServCashFlag) {
        this.scmFullServCashFlag = scmFullServCashFlag;
    }

    public Character getScmMiniServCashFlag() {
        return scmMiniServCashFlag;
    }

    public void setScmMiniServCashFlag(Character scmMiniServCashFlag) {
        this.scmMiniServCashFlag = scmMiniServCashFlag;
    }

    public Character getScmSelfServCashFlag() {
        return scmSelfServCashFlag;
    }

    public void setScmSelfServCashFlag(Character scmSelfServCashFlag) {
        this.scmSelfServCashFlag = scmSelfServCashFlag;
    }

    public BigDecimal getScmFullServCashPrice() {
        return scmFullServCashPrice;
    }

    public void setScmFullServCashPrice(BigDecimal scmFullServCashPrice) {
        this.scmFullServCashPrice = scmFullServCashPrice;
    }

    public BigDecimal getScmMiniServCashPrice() {
        return scmMiniServCashPrice;
    }

    public void setScmMiniServCashPrice(BigDecimal scmMiniServCashPrice) {
        this.scmMiniServCashPrice = scmMiniServCashPrice;
    }

    public BigDecimal getScmSelfServCashPrice() {
        return scmSelfServCashPrice;
    }

    public void setScmSelfServCashPrice(BigDecimal scmSelfServCashPrice) {
        this.scmSelfServCashPrice = scmSelfServCashPrice;
    }

    public Character getScmCreditFuelPriceFlag() {
        return scmCreditFuelPriceFlag;
    }

    public void setScmCreditFuelPriceFlag(Character scmCreditFuelPriceFlag) {
        this.scmCreditFuelPriceFlag = scmCreditFuelPriceFlag;
    }

    public Character getScmFullServCreditFlag() {
        return scmFullServCreditFlag;
    }

    public void setScmFullServCreditFlag(Character scmFullServCreditFlag) {
        this.scmFullServCreditFlag = scmFullServCreditFlag;
    }

    public Character getScmMiniServCreditFlag() {
        return scmMiniServCreditFlag;
    }

    public void setScmMiniServCreditFlag(Character scmMiniServCreditFlag) {
        this.scmMiniServCreditFlag = scmMiniServCreditFlag;
    }

    public Character getScmSelfServCreditFlag() {
        return scmSelfServCreditFlag;
    }

    public void setScmSelfServCreditFlag(Character scmSelfServCreditFlag) {
        this.scmSelfServCreditFlag = scmSelfServCreditFlag;
    }

    public BigDecimal getScmFullServCreditPrice() {
        return scmFullServCreditPrice;
    }

    public void setScmFullServCreditPrice(BigDecimal scmFullServCreditPrice) {
        this.scmFullServCreditPrice = scmFullServCreditPrice;
    }

    public BigDecimal getScmMiniServCreditPrice() {
        return scmMiniServCreditPrice;
    }

    public void setScmMiniServCreditPrice(BigDecimal scmMiniServCreditPrice) {
        this.scmMiniServCreditPrice = scmMiniServCreditPrice;
    }

    public BigDecimal getScmSelfServCreditPrice() {
        return scmSelfServCreditPrice;
    }

    public void setScmSelfServCreditPrice(BigDecimal scmSelfServCreditPrice) {
        this.scmSelfServCreditPrice = scmSelfServCreditPrice;
    }

    public Character getScmDiscountBasis() {
        return scmDiscountBasis;
    }

    public void setScmDiscountBasis(Character scmDiscountBasis) {
        this.scmDiscountBasis = scmDiscountBasis;
    }

    public Character getScmVolumeRebateType() {
        return scmVolumeRebateType;
    }

    public void setScmVolumeRebateType(Character scmVolumeRebateType) {
        this.scmVolumeRebateType = scmVolumeRebateType;
    }

    public Character getScmComdataCompleteFlag() {
        return scmComdataCompleteFlag;
    }

    public void setScmComdataCompleteFlag(Character scmComdataCompleteFlag) {
        this.scmComdataCompleteFlag = scmComdataCompleteFlag;
    }

    public Character getScmTerminalFuelType() {
        return scmTerminalFuelType;
    }

    public void setScmTerminalFuelType(Character scmTerminalFuelType) {
        this.scmTerminalFuelType = scmTerminalFuelType;
    }

    public BigDecimal getScmCashAdvanceLimit() {
        return scmCashAdvanceLimit;
    }

    public void setScmCashAdvanceLimit(BigDecimal scmCashAdvanceLimit) {
        this.scmCashAdvanceLimit = scmCashAdvanceLimit;
    }

    public Character getScmCostPlusFlag() {
        return scmCostPlusFlag;
    }

    public void setScmCostPlusFlag(Character scmCostPlusFlag) {
        this.scmCostPlusFlag = scmCostPlusFlag;
    }

    public String getScmComdataCompleteAcct() {
        return scmComdataCompleteAcct;
    }

    public void setScmComdataCompleteAcct(String scmComdataCompleteAcct) {
        this.scmComdataCompleteAcct = scmComdataCompleteAcct;
    }

    public int getScmOverRideRate() {
        return scmOverRideRate;
    }

    public void setScmOverRideRate(int scmOverRideRate) {
        this.scmOverRideRate = scmOverRideRate;
    }

    public Character getScmPremier2Flag() {
        return scmPremier2Flag;
    }

    public void setScmPremier2Flag(Character scmPremier2Flag) {
        this.scmPremier2Flag = scmPremier2Flag;
    }

    public Character getScmP2DiscBasis() {
        return scmP2DiscBasis;
    }

    public void setScmP2DiscBasis(Character scmP2DiscBasis) {
        this.scmP2DiscBasis = scmP2DiscBasis;
    }

    public BigDecimal getScmP2SelfDisc() {
        return scmP2SelfDisc;
    }

    public void setScmP2SelfDisc(BigDecimal scmP2SelfDisc) {
        this.scmP2SelfDisc = scmP2SelfDisc;
    }

    public BigDecimal getScmP2MiniDisc() {
        return scmP2MiniDisc;
    }

    public void setScmP2MiniDisc(BigDecimal scmP2MiniDisc) {
        this.scmP2MiniDisc = scmP2MiniDisc;
    }

    public BigDecimal getScmP2FullDisc() {
        return scmP2FullDisc;
    }

    public void setScmP2FullDisc(BigDecimal scmP2FullDisc) {
        this.scmP2FullDisc = scmP2FullDisc;
    }

    public Character getScmP2OtherDiscFlag() {
        return scmP2OtherDiscFlag;
    }

    public void setScmP2OtherDiscFlag(Character scmP2OtherDiscFlag) {
        this.scmP2OtherDiscFlag = scmP2OtherDiscFlag;
    }

    public Character getScmP2OtherDiscBasis() {
        return scmP2OtherDiscBasis;
    }

    public void setScmP2OtherDiscBasis(Character scmP2OtherDiscBasis) {
        this.scmP2OtherDiscBasis = scmP2OtherDiscBasis;
    }

    public BigDecimal getScmP2OtherDisc() {
        return scmP2OtherDisc;
    }

    public void setScmP2OtherDisc(BigDecimal scmP2OtherDisc) {
        this.scmP2OtherDisc = scmP2OtherDisc;
    }

    public Date getScmP2DiscStartDate() {
        return scmP2DiscStartDate;
    }

    public void setScmP2DiscStartDate(Date scmP2DiscStartDate) {
        this.scmP2DiscStartDate = scmP2DiscStartDate;
    }

    public Date getScmP2DiscEndDate() {
        return scmP2DiscEndDate;
    }

    public void setScmP2DiscEndDate(Date scmP2DiscEndDate) {
        this.scmP2DiscEndDate = scmP2DiscEndDate;
    }

    public BigDecimal getScmP2DiscSetUpCharge() {
        return scmP2DiscSetUpCharge;
    }

    public void setScmP2DiscSetUpCharge(BigDecimal scmP2DiscSetUpCharge) {
        this.scmP2DiscSetUpCharge = scmP2DiscSetUpCharge;
    }

    public Date getScmP2DiscRevisionDate() {
        return scmP2DiscRevisionDate;
    }

    public void setScmP2DiscRevisionDate(Date scmP2DiscRevisionDate) {
        this.scmP2DiscRevisionDate = scmP2DiscRevisionDate;
    }

    public BigDecimal getScmP2DiscRevisionCharge() {
        return scmP2DiscRevisionCharge;
    }

    public void setScmP2DiscRevisionCharge(BigDecimal scmP2DiscRevisionCharge) {
        this.scmP2DiscRevisionCharge = scmP2DiscRevisionCharge;
    }

    public Character getScmRmsAllianceFlag() {
        return scmRmsAllianceFlag;
    }

    public void setScmRmsAllianceFlag(Character scmRmsAllianceFlag) {
        this.scmRmsAllianceFlag = scmRmsAllianceFlag;
    }

    public BigDecimal getScmAutomatedXtnRate() {
        return scmAutomatedXtnRate;
    }

    public void setScmAutomatedXtnRate(BigDecimal scmAutomatedXtnRate) {
        this.scmAutomatedXtnRate = scmAutomatedXtnRate;
    }

    public BigDecimal getScmAutoUpManualXtnRate() {
        return scmAutoUpManualXtnRate;
    }

    public void setScmAutoUpManualXtnRate(BigDecimal scmAutoUpManualXtnRate) {
        this.scmAutoUpManualXtnRate = scmAutoUpManualXtnRate;
    }

    public BigDecimal getScmAutoExpressXtnRate() {
        return scmAutoExpressXtnRate;
    }

    public void setScmAutoExpressXtnRate(BigDecimal scmAutoExpressXtnRate) {
        this.scmAutoExpressXtnRate = scmAutoExpressXtnRate;
    }

    public int getScmElectAdReferenceNr() {
        return scmElectAdReferenceNr;
    }

    public void setScmElectAdReferenceNr(int scmElectAdReferenceNr) {
        this.scmElectAdReferenceNr = scmElectAdReferenceNr;
    }

    public BigDecimal getScmElectAdCharge() {
        return scmElectAdCharge;
    }

    public void setScmElectAdCharge(BigDecimal scmElectAdCharge) {
        this.scmElectAdCharge = scmElectAdCharge;
    }

    public BigDecimal getScmAutomatedCallFee() {
        return scmAutomatedCallFee;
    }

    public void setScmAutomatedCallFee(BigDecimal scmAutomatedCallFee) {
        this.scmAutomatedCallFee = scmAutomatedCallFee;
    }

    public Character getScmLimitedNetworkFlag() {
        return scmLimitedNetworkFlag;
    }

    public void setScmLimitedNetworkFlag(Character scmLimitedNetworkFlag) {
        this.scmLimitedNetworkFlag = scmLimitedNetworkFlag;
    }

    public Character getScmDialinPickup() {
        return scmDialinPickup;
    }

    public void setScmDialinPickup(Character scmDialinPickup) {
        this.scmDialinPickup = scmDialinPickup;
    }

    public Character getScmMcFlag() {
        return scmMcFlag;
    }

    public void setScmMcFlag(Character scmMcFlag) {
        this.scmMcFlag = scmMcFlag;
    }

    public Character getScmVisaFlag() {
        return scmVisaFlag;
    }

    public void setScmVisaFlag(Character scmVisaFlag) {
        this.scmVisaFlag = scmVisaFlag;
    }

    public Character getScmAlliancePlusFlag() {
        return scmAlliancePlusFlag;
    }

    public void setScmAlliancePlusFlag(Character scmAlliancePlusFlag) {
        this.scmAlliancePlusFlag = scmAlliancePlusFlag;
    }

    public Character getScmPosAddressFlag() {
        return scmPosAddressFlag;
    }

    public void setScmPosAddressFlag(Character scmPosAddressFlag) {
        this.scmPosAddressFlag = scmPosAddressFlag;
    }

    public Character getScmMcpFlag() {
        return scmMcpFlag;
    }

    public void setScmMcpFlag(Character scmMcpFlag) {
        this.scmMcpFlag = scmMcpFlag;
    }

    public String getScmMcpCode() {
        return scmMcpCode;
    }

    public void setScmMcpCode(String scmMcpCode) {
        this.scmMcpCode = scmMcpCode;
    }

    public Character getScmDiscoverFlag() {
        return scmDiscoverFlag;
    }

    public void setScmDiscoverFlag(Character scmDiscoverFlag) {
        this.scmDiscoverFlag = scmDiscoverFlag;
    }

    public Character getScmSecurityFlag() {
        return scmSecurityFlag;
    }

    public void setScmSecurityFlag(Character scmSecurityFlag) {
        this.scmSecurityFlag = scmSecurityFlag;
    }

    public BigDecimal getScmManualExpressXtnRate() {
        return scmManualExpressXtnRate;
    }

    public void setScmManualExpressXtnRate(BigDecimal scmManualExpressXtnRate) {
        this.scmManualExpressXtnRate = scmManualExpressXtnRate;
    }

    public Date getScmLastSettleDate() {
        return scmLastSettleDate;
    }

    public void setScmLastSettleDate(Date scmLastSettleDate) {
        this.scmLastSettleDate = scmLastSettleDate;
    }

    public short getScmSettleCount() {
        return scmSettleCount;
    }

    public void setScmSettleCount(short scmSettleCount) {
        this.scmSettleCount = scmSettleCount;
    }

    public BigDecimal getScmEquipBillAmt() {
        return scmEquipBillAmt;
    }

    public void setScmEquipBillAmt(BigDecimal scmEquipBillAmt) {
        this.scmEquipBillAmt = scmEquipBillAmt;
    }

    public Date getScmEquipBillDate() {
        return scmEquipBillDate;
    }

    public void setScmEquipBillDate(Date scmEquipBillDate) {
        this.scmEquipBillDate = scmEquipBillDate;
    }

    public Date getScmEquipSettleDate() {
        return scmEquipSettleDate;
    }

    public void setScmEquipSettleDate(Date scmEquipSettleDate) {
        this.scmEquipSettleDate = scmEquipSettleDate;
    }

    public Character getScmTransFeeFlag1() {
        return scmTransFeeFlag1;
    }

    public void setScmTransFeeFlag1(Character scmTransFeeFlag1) {
        this.scmTransFeeFlag1 = scmTransFeeFlag1;
    }

    public BigDecimal getScmAutomationLevel1() {
        return scmAutomationLevel1;
    }

    public void setScmAutomationLevel1(BigDecimal scmAutomationLevel1) {
        this.scmAutomationLevel1 = scmAutomationLevel1;
    }

    public Character getScmTransFeeFlag2() {
        return scmTransFeeFlag2;
    }

    public void setScmTransFeeFlag2(Character scmTransFeeFlag2) {
        this.scmTransFeeFlag2 = scmTransFeeFlag2;
    }

    public BigDecimal getScmAutomationLevel2() {
        return scmAutomationLevel2;
    }

    public void setScmAutomationLevel2(BigDecimal scmAutomationLevel2) {
        this.scmAutomationLevel2 = scmAutomationLevel2;
    }

    public Date getScmLastFpDate() {
        return scmLastFpDate;
    }

    public void setScmLastFpDate(Date scmLastFpDate) {
        this.scmLastFpDate = scmLastFpDate;
    }

    public Character getScmCountryCode() {
        return scmCountryCode;
    }

    public void setScmCountryCode(Character scmCountryCode) {
        this.scmCountryCode = scmCountryCode;
    }

    public Character getScmBridgeLocationFlag() {
        return scmBridgeLocationFlag;
    }

    public void setScmBridgeLocationFlag(Character scmBridgeLocationFlag) {
        this.scmBridgeLocationFlag = scmBridgeLocationFlag;
    }

    public String getScmVendorCode() {
        return scmVendorCode;
    }

    public void setScmVendorCode(String scmVendorCode) {
        this.scmVendorCode = scmVendorCode;
    }

    public String getScmTrendarId() {
        return scmTrendarId;
    }

    public void setScmTrendarId(String scmTrendarId) {
        this.scmTrendarId = scmTrendarId;
    }

    public Character getScmPacPrideFlag() {
        return scmPacPrideFlag;
    }

    public void setScmPacPrideFlag(Character scmPacPrideFlag) {
        this.scmPacPrideFlag = scmPacPrideFlag;
    }

    public BigDecimal getScmLastUsePpg() {
        return scmLastUsePpg;
    }

    public void setScmLastUsePpg(BigDecimal scmLastUsePpg) {
        this.scmLastUsePpg = scmLastUsePpg;
    }

    public Character getScmFocusDiscountFlag() {
        return scmFocusDiscountFlag;
    }

    public void setScmFocusDiscountFlag(Character scmFocusDiscountFlag) {
        this.scmFocusDiscountFlag = scmFocusDiscountFlag;
    }

    public Character getScmAchSettlementFlag() {
        return scmAchSettlementFlag;
    }

    public void setScmAchSettlementFlag(Character scmAchSettlementFlag) {
        this.scmAchSettlementFlag = scmAchSettlementFlag;
    }

    public Character getScmTaxApplication() {
        return scmTaxApplication;
    }

    public void setScmTaxApplication(Character scmTaxApplication) {
        this.scmTaxApplication = scmTaxApplication;
    }

    public BigDecimal getScmManualCallFee() {
        return scmManualCallFee;
    }

    public void setScmManualCallFee(BigDecimal scmManualCallFee) {
        this.scmManualCallFee = scmManualCallFee;
    }

    public String getScmMasterSvcCtrCode() {
        return scmMasterSvcCtrCode;
    }

    public void setScmMasterSvcCtrCode(String scmMasterSvcCtrCode) {
        this.scmMasterSvcCtrCode = scmMasterSvcCtrCode;
    }

    public Character getScm5000CcFlag() {
        return scm5000CcFlag;
    }

    public void setScm5000CcFlag(Character scm5000CcFlag) {
        this.scm5000CcFlag = scm5000CcFlag;
    }

    public Character getScmCasinoFlag() {
        return scmCasinoFlag;
    }

    public void setScmCasinoFlag(Character scmCasinoFlag) {
        this.scmCasinoFlag = scmCasinoFlag;
    }

    public Character getScmRetailFlag() {
        return scmRetailFlag;
    }

    public void setScmRetailFlag(Character scmRetailFlag) {
        this.scmRetailFlag = scmRetailFlag;
    }

    public Character getScmTmpFlag() {
        return scmTmpFlag;
    }

    public void setScmTmpFlag(Character scmTmpFlag) {
        this.scmTmpFlag = scmTmpFlag;
    }

    public Character getScmSettleLocStatus() {
        return scmSettleLocStatus;
    }

    public void setScmSettleLocStatus(Character scmSettleLocStatus) {
        this.scmSettleLocStatus = scmSettleLocStatus;
    }

    public Character getScmSettleBalanceCycle() {
        return scmSettleBalanceCycle;
    }

    public void setScmSettleBalanceCycle(Character scmSettleBalanceCycle) {
        this.scmSettleBalanceCycle = scmSettleBalanceCycle;
    }

    public short getScmSettleBalanceDay() {
        return scmSettleBalanceDay;
    }

    public void setScmSettleBalanceDay(short scmSettleBalanceDay) {
        this.scmSettleBalanceDay = scmSettleBalanceDay;
    }

    public Character getScmSettleBalanceIndep() {
        return scmSettleBalanceIndep;
    }

    public void setScmSettleBalanceIndep(Character scmSettleBalanceIndep) {
        this.scmSettleBalanceIndep = scmSettleBalanceIndep;
    }

    public Character getScmSettleClosingCycle() {
        return scmSettleClosingCycle;
    }

    public void setScmSettleClosingCycle(Character scmSettleClosingCycle) {
        this.scmSettleClosingCycle = scmSettleClosingCycle;
    }

    public short getScmSettleClosingDay() {
        return scmSettleClosingDay;
    }

    public void setScmSettleClosingDay(short scmSettleClosingDay) {
        this.scmSettleClosingDay = scmSettleClosingDay;
    }

    public Character getScmSettleClosingIndpnt() {
        return scmSettleClosingIndpnt;
    }

    public void setScmSettleClosingIndpnt(Character scmSettleClosingIndpnt) {
        this.scmSettleClosingIndpnt = scmSettleClosingIndpnt;
    }

    public Character getScmSettlePaymentCycle() {
        return scmSettlePaymentCycle;
    }

    public void setScmSettlePaymentCycle(Character scmSettlePaymentCycle) {
        this.scmSettlePaymentCycle = scmSettlePaymentCycle;
    }

    public Character getScmSettlePaymentIndpnt() {
        return scmSettlePaymentIndpnt;
    }

    public void setScmSettlePaymentIndpnt(Character scmSettlePaymentIndpnt) {
        this.scmSettlePaymentIndpnt = scmSettlePaymentIndpnt;
    }

    public String getScmSettlePaymentDayR() {
        return scmSettlePaymentDayR;
    }

    public void setScmSettlePaymentDayR(String scmSettlePaymentDayR) {
        this.scmSettlePaymentDayR = scmSettlePaymentDayR;
    }

    public String getScmSettlePaymentToLoc() {
        return scmSettlePaymentToLoc;
    }

    public void setScmSettlePaymentToLoc(String scmSettlePaymentToLoc) {
        this.scmSettlePaymentToLoc = scmSettlePaymentToLoc;
    }

    public String getScmSettlePaymentLocType() {
        return scmSettlePaymentLocType;
    }

    public void setScmSettlePaymentLocType(String scmSettlePaymentLocType) {
        this.scmSettlePaymentLocType = scmSettlePaymentLocType;
    }

    public String getScmSettlePaymentMethod() {
        return scmSettlePaymentMethod;
    }

    public void setScmSettlePaymentMethod(String scmSettlePaymentMethod) {
        this.scmSettlePaymentMethod = scmSettlePaymentMethod;
    }

    public short getScmSettlePaymentDelay() {
        return scmSettlePaymentDelay;
    }

    public void setScmSettlePaymentDelay(short scmSettlePaymentDelay) {
        this.scmSettlePaymentDelay = scmSettlePaymentDelay;
    }

    public Character getScmSettlePaymentStyle() {
        return scmSettlePaymentStyle;
    }

    public void setScmSettlePaymentStyle(Character scmSettlePaymentStyle) {
        this.scmSettlePaymentStyle = scmSettlePaymentStyle;
    }

    public String getScmMaximumLiteral() {
        return scmMaximumLiteral;
    }

    public void setScmMaximumLiteral(String scmMaximumLiteral) {
        this.scmMaximumLiteral = scmMaximumLiteral;
    }

    public String getScmSettleSpPaymentMethod() {
        return scmSettleSpPaymentMethod;
    }

    public void setScmSettleSpPaymentMethod(String scmSettleSpPaymentMethod) {
        this.scmSettleSpPaymentMethod = scmSettleSpPaymentMethod;
    }

    public BigDecimal getScmPreferredFee() {
        return scmPreferredFee;
    }

    public void setScmPreferredFee(BigDecimal scmPreferredFee) {
        this.scmPreferredFee = scmPreferredFee;
    }

    public Character getScmSettlePayByTickets() {
        return scmSettlePayByTickets;
    }

    public void setScmSettlePayByTickets(Character scmSettlePayByTickets) {
        this.scmSettlePayByTickets = scmSettlePayByTickets;
    }

    public Character getScmRecourseFlag() {
        return scmRecourseFlag;
    }

    public void setScmRecourseFlag(Character scmRecourseFlag) {
        this.scmRecourseFlag = scmRecourseFlag;
    }

    public String getScmIolXrefLocation() {
        return scmIolXrefLocation;
    }

    public void setScmIolXrefLocation(String scmIolXrefLocation) {
        this.scmIolXrefLocation = scmIolXrefLocation;
    }

    public Character getScmNatsFlag() {
        return scmNatsFlag;
    }

    public void setScmNatsFlag(Character scmNatsFlag) {
        this.scmNatsFlag = scmNatsFlag;
    }

    public int getScmNatsAcctCode() {
        return scmNatsAcctCode;
    }

    public void setScmNatsAcctCode(int scmNatsAcctCode) {
        this.scmNatsAcctCode = scmNatsAcctCode;
    }

    public String getScmDirectionsIi() {
        return scmDirectionsIi;
    }

    public void setScmDirectionsIi(String scmDirectionsIi) {
        this.scmDirectionsIi = scmDirectionsIi;
    }

    public String getScmBomMchntNr() {
        return scmBomMchntNr;
    }

    public void setScmBomMchntNr(String scmBomMchntNr) {
        this.scmBomMchntNr = scmBomMchntNr;
    }

    public BigDecimal getScmIolRcp() {
        return scmIolRcp;
    }

    public void setScmIolRcp(BigDecimal scmIolRcp) {
        this.scmIolRcp = scmIolRcp;
    }

    public BigDecimal getScmVruExpressXtnRate() {
        return scmVruExpressXtnRate;
    }

    public void setScmVruExpressXtnRate(BigDecimal scmVruExpressXtnRate) {
        this.scmVruExpressXtnRate = scmVruExpressXtnRate;
    }

    public BigDecimal getScmVruFuelXtnRate() {
        return scmVruFuelXtnRate;
    }

    public void setScmVruFuelXtnRate(BigDecimal scmVruFuelXtnRate) {
        this.scmVruFuelXtnRate = scmVruFuelXtnRate;
    }

    public BigDecimal getScmManualPreferredFee() {
        return scmManualPreferredFee;
    }

    public void setScmManualPreferredFee(BigDecimal scmManualPreferredFee) {
        this.scmManualPreferredFee = scmManualPreferredFee;
    }

    public BigDecimal getScmMiscFee() {
        return scmMiscFee;
    }

    public void setScmMiscFee(BigDecimal scmMiscFee) {
        this.scmMiscFee = scmMiscFee;
    }

    public Character getScmManFuelFeeType() {
        return scmManFuelFeeType;
    }

    public void setScmManFuelFeeType(Character scmManFuelFeeType) {
        this.scmManFuelFeeType = scmManFuelFeeType;
    }

    public Character getScmAutoFuelFeeType() {
        return scmAutoFuelFeeType;
    }

    public void setScmAutoFuelFeeType(Character scmAutoFuelFeeType) {
        this.scmAutoFuelFeeType = scmAutoFuelFeeType;
    }

    public Character getScmManExpFeeType() {
        return scmManExpFeeType;
    }

    public void setScmManExpFeeType(Character scmManExpFeeType) {
        this.scmManExpFeeType = scmManExpFeeType;
    }

    public Character getScmAutoExpFeeType() {
        return scmAutoExpFeeType;
    }

    public void setScmAutoExpFeeType(Character scmAutoExpFeeType) {
        this.scmAutoExpFeeType = scmAutoExpFeeType;
    }

    public Character getScmManPrefFeeType() {
        return scmManPrefFeeType;
    }

    public void setScmManPrefFeeType(Character scmManPrefFeeType) {
        this.scmManPrefFeeType = scmManPrefFeeType;
    }

    public Character getScmAutoPrefFeeType() {
        return scmAutoPrefFeeType;
    }

    public void setScmAutoPrefFeeType(Character scmAutoPrefFeeType) {
        this.scmAutoPrefFeeType = scmAutoPrefFeeType;
    }

    public Character getScmVruFuelFeeType() {
        return scmVruFuelFeeType;
    }

    public void setScmVruFuelFeeType(Character scmVruFuelFeeType) {
        this.scmVruFuelFeeType = scmVruFuelFeeType;
    }

    public Character getScmVruExpFeeType() {
        return scmVruExpFeeType;
    }

    public void setScmVruExpFeeType(Character scmVruExpFeeType) {
        this.scmVruExpFeeType = scmVruExpFeeType;
    }

    public Character getScmMiscFeeType() {
        return scmMiscFeeType;
    }

    public void setScmMiscFeeType(Character scmMiscFeeType) {
        this.scmMiscFeeType = scmMiscFeeType;
    }

    public BigDecimal getScmEquipFee() {
        return scmEquipFee;
    }

    public void setScmEquipFee(BigDecimal scmEquipFee) {
        this.scmEquipFee = scmEquipFee;
    }

    public String getScmSettlementMaster() {
        return scmSettlementMaster;
    }

    public void setScmSettlementMaster(String scmSettlementMaster) {
        this.scmSettlementMaster = scmSettlementMaster;
    }

    public String getScmPtpAccountCode() {
        return scmPtpAccountCode;
    }

    public void setScmPtpAccountCode(String scmPtpAccountCode) {
        this.scmPtpAccountCode = scmPtpAccountCode;
    }

    public int getScmPtpCustomerId() {
        return scmPtpCustomerId;
    }

    public void setScmPtpCustomerId(int scmPtpCustomerId) {
        this.scmPtpCustomerId = scmPtpCustomerId;
    }

    public BigDecimal getScmFdisTransFee() {
        return scmFdisTransFee;
    }

    public void setScmFdisTransFee(BigDecimal scmFdisTransFee) {
        this.scmFdisTransFee = scmFdisTransFee;
    }

    public Character getScmUseCreditMarkupFlag() {
        return scmUseCreditMarkupFlag;
    }

    public void setScmUseCreditMarkupFlag(Character scmUseCreditMarkupFlag) {
        this.scmUseCreditMarkupFlag = scmUseCreditMarkupFlag;
    }

    public int getScmCreditMarkup() {
        return scmCreditMarkup;
    }

    public void setScmCreditMarkup(int scmCreditMarkup) {
        this.scmCreditMarkup = scmCreditMarkup;
    }

    public int getScmLastDeleteDate() {
        return scmLastDeleteDate;
    }

    public void setScmLastDeleteDate(int scmLastDeleteDate) {
        this.scmLastDeleteDate = scmLastDeleteDate;
    }

    public Character getScmJcbFlag() {
        return scmJcbFlag;
    }

    public void setScmJcbFlag(Character scmJcbFlag) {
        this.scmJcbFlag = scmJcbFlag;
    }

    public short getScmSfBalanceFee() {
        return scmSfBalanceFee;
    }

    public void setScmSfBalanceFee(short scmSfBalanceFee) {
        this.scmSfBalanceFee = scmSfBalanceFee;
    }

    public Character getScmSfBalFeeDef() {
        return scmSfBalFeeDef;
    }

    public void setScmSfBalFeeDef(Character scmSfBalFeeDef) {
        this.scmSfBalFeeDef = scmSfBalFeeDef;
    }

    public int getScmSfBalanceNrFree() {
        return scmSfBalanceNrFree;
    }

    public void setScmSfBalanceNrFree(int scmSfBalanceNrFree) {
        this.scmSfBalanceNrFree = scmSfBalanceNrFree;
    }

    public Character getScmSfBalNrFreeDef() {
        return scmSfBalNrFreeDef;
    }

    public void setScmSfBalNrFreeDef(Character scmSfBalNrFreeDef) {
        this.scmSfBalNrFreeDef = scmSfBalNrFreeDef;
    }

    public int getScmSfBalanceCount() {
        return scmSfBalanceCount;
    }

    public void setScmSfBalanceCount(int scmSfBalanceCount) {
        this.scmSfBalanceCount = scmSfBalanceCount;
    }

    public Date getScmSfLastBalDate() {
        return scmSfLastBalDate;
    }

    public void setScmSfLastBalDate(Date scmSfLastBalDate) {
        this.scmSfLastBalDate = scmSfLastBalDate;
    }

    public BigDecimal getScmSfClosingFee() {
        return scmSfClosingFee;
    }

    public void setScmSfClosingFee(BigDecimal scmSfClosingFee) {
        this.scmSfClosingFee = scmSfClosingFee;
    }

    public Character getScmSfCloFeeDef() {
        return scmSfCloFeeDef;
    }

    public void setScmSfCloFeeDef(Character scmSfCloFeeDef) {
        this.scmSfCloFeeDef = scmSfCloFeeDef;
    }

    public int getScmSfClosingNrFree() {
        return scmSfClosingNrFree;
    }

    public void setScmSfClosingNrFree(int scmSfClosingNrFree) {
        this.scmSfClosingNrFree = scmSfClosingNrFree;
    }

    public Character getScmSfCloNrFreeDef() {
        return scmSfCloNrFreeDef;
    }

    public void setScmSfCloNrFreeDef(Character scmSfCloNrFreeDef) {
        this.scmSfCloNrFreeDef = scmSfCloNrFreeDef;
    }

    public int getScmSfClosingCount() {
        return scmSfClosingCount;
    }

    public void setScmSfClosingCount(int scmSfClosingCount) {
        this.scmSfClosingCount = scmSfClosingCount;
    }

    public Date getScmSfLastCloDate() {
        return scmSfLastCloDate;
    }

    public void setScmSfLastCloDate(Date scmSfLastCloDate) {
        this.scmSfLastCloDate = scmSfLastCloDate;
    }

    public BigDecimal getScmSfPaymentFee() {
        return scmSfPaymentFee;
    }

    public void setScmSfPaymentFee(BigDecimal scmSfPaymentFee) {
        this.scmSfPaymentFee = scmSfPaymentFee;
    }

    public Character getScmSfPayFeeDef() {
        return scmSfPayFeeDef;
    }

    public void setScmSfPayFeeDef(Character scmSfPayFeeDef) {
        this.scmSfPayFeeDef = scmSfPayFeeDef;
    }

    public int getScmSfPaymentNrFree() {
        return scmSfPaymentNrFree;
    }

    public void setScmSfPaymentNrFree(int scmSfPaymentNrFree) {
        this.scmSfPaymentNrFree = scmSfPaymentNrFree;
    }

    public Character getScmSfPayNrFreeDef() {
        return scmSfPayNrFreeDef;
    }

    public void setScmSfPayNrFreeDef(Character scmSfPayNrFreeDef) {
        this.scmSfPayNrFreeDef = scmSfPayNrFreeDef;
    }

    public Character getScmRmfFlag() {
        return scmRmfFlag;
    }

    public void setScmRmfFlag(Character scmRmfFlag) {
        this.scmRmfFlag = scmRmfFlag;
    }

    public Character getScmItpFlag() {
        return scmItpFlag;
    }

    public void setScmItpFlag(Character scmItpFlag) {
        this.scmItpFlag = scmItpFlag;
    }

    public String getScmFieldRep() {
        return scmFieldRep;
    }

    public void setScmFieldRep(String scmFieldRep) {
        this.scmFieldRep = scmFieldRep;
    }

    public short getScmDupCheck() {
        return scmDupCheck;
    }

    public void setScmDupCheck(short scmDupCheck) {
        this.scmDupCheck = scmDupCheck;
    }

    public BigDecimal getScmTbDailyMaxAmt() {
        return scmTbDailyMaxAmt;
    }

    public void setScmTbDailyMaxAmt(BigDecimal scmTbDailyMaxAmt) {
        this.scmTbDailyMaxAmt = scmTbDailyMaxAmt;
    }

    public BigDecimal getScmTbCummulativeAmt() {
        return scmTbCummulativeAmt;
    }

    public void setScmTbCummulativeAmt(BigDecimal scmTbCummulativeAmt) {
        this.scmTbCummulativeAmt = scmTbCummulativeAmt;
    }

    public BigDecimal getScmTbCutoffAmt() {
        return scmTbCutoffAmt;
    }

    public void setScmTbCutoffAmt(BigDecimal scmTbCutoffAmt) {
        this.scmTbCutoffAmt = scmTbCutoffAmt;
    }

    public Character getScmTbPreferredRateFlag() {
        return scmTbPreferredRateFlag;
    }

    public void setScmTbPreferredRateFlag(Character scmTbPreferredRateFlag) {
        this.scmTbPreferredRateFlag = scmTbPreferredRateFlag;
    }

    public Character getScmTbApplyCheckNegation() {
        return scmTbApplyCheckNegation;
    }

    public void setScmTbApplyCheckNegation(Character scmTbApplyCheckNegation) {
        this.scmTbApplyCheckNegation = scmTbApplyCheckNegation;
    }

    public int getScmCreditRate() {
        return scmCreditRate;
    }

    public void setScmCreditRate(int scmCreditRate) {
        this.scmCreditRate = scmCreditRate;
    }

    public int getScmDebitRate() {
        return scmDebitRate;
    }

    public void setScmDebitRate(int scmDebitRate) {
        this.scmDebitRate = scmDebitRate;
    }

    public Character getScmDebitFlag() {
        return scmDebitFlag;
    }

    public void setScmDebitFlag(Character scmDebitFlag) {
        this.scmDebitFlag = scmDebitFlag;
    }

    public Character getScmAmexFlag() {
        return scmAmexFlag;
    }

    public void setScmAmexFlag(Character scmAmexFlag) {
        this.scmAmexFlag = scmAmexFlag;
    }

    public Character getScmCreditProgramFlag() {
        return scmCreditProgramFlag;
    }

    public void setScmCreditProgramFlag(Character scmCreditProgramFlag) {
        this.scmCreditProgramFlag = scmCreditProgramFlag;
    }

    public Character getScmTexacoFlag() {
        return scmTexacoFlag;
    }

    public void setScmTexacoFlag(Character scmTexacoFlag) {
        this.scmTexacoFlag = scmTexacoFlag;
    }

    public Character getScmAutoCalcTax() {
        return scmAutoCalcTax;
    }

    public void setScmAutoCalcTax(Character scmAutoCalcTax) {
        this.scmAutoCalcTax = scmAutoCalcTax;
    }

    public Character getScmCorpRebateFlag() {
        return scmCorpRebateFlag;
    }

    public void setScmCorpRebateFlag(Character scmCorpRebateFlag) {
        this.scmCorpRebateFlag = scmCorpRebateFlag;
    }

    public Character getScmCorpRebateType() {
        return scmCorpRebateType;
    }

    public void setScmCorpRebateType(Character scmCorpRebateType) {
        this.scmCorpRebateType = scmCorpRebateType;
    }

    public BigDecimal getScmCorpRebateAmount() {
        return scmCorpRebateAmount;
    }

    public void setScmCorpRebateAmount(BigDecimal scmCorpRebateAmount) {
        this.scmCorpRebateAmount = scmCorpRebateAmount;
    }

    public String getScmCorpRebateLocation() {
        return scmCorpRebateLocation;
    }

    public void setScmCorpRebateLocation(String scmCorpRebateLocation) {
        this.scmCorpRebateLocation = scmCorpRebateLocation;
    }

    public BigDecimal getScmManCashAddOnFee() {
        return scmManCashAddOnFee;
    }

    public void setScmManCashAddOnFee(BigDecimal scmManCashAddOnFee) {
        this.scmManCashAddOnFee = scmManCashAddOnFee;
    }

    public Character getScmManCashFeeType() {
        return scmManCashFeeType;
    }

    public void setScmManCashFeeType(Character scmManCashFeeType) {
        this.scmManCashFeeType = scmManCashFeeType;
    }

    public BigDecimal getScmAutoCashAddOnFee() {
        return scmAutoCashAddOnFee;
    }

    public void setScmAutoCashAddOnFee(BigDecimal scmAutoCashAddOnFee) {
        this.scmAutoCashAddOnFee = scmAutoCashAddOnFee;
    }

    public Character getScmAutoCashFeeType() {
        return scmAutoCashFeeType;
    }

    public void setScmAutoCashFeeType(Character scmAutoCashFeeType) {
        this.scmAutoCashFeeType = scmAutoCashFeeType;
    }

    public BigDecimal getScmAutoDraftXtnRate() {
        return scmAutoDraftXtnRate;
    }

    public void setScmAutoDraftXtnRate(BigDecimal scmAutoDraftXtnRate) {
        this.scmAutoDraftXtnRate = scmAutoDraftXtnRate;
    }

    public Character getScmAutoDftFeeType() {
        return scmAutoDftFeeType;
    }

    public void setScmAutoDftFeeType(Character scmAutoDftFeeType) {
        this.scmAutoDftFeeType = scmAutoDftFeeType;
    }

    public BigDecimal getScmManualDraftXtnRate() {
        return scmManualDraftXtnRate;
    }

    public void setScmManualDraftXtnRate(BigDecimal scmManualDraftXtnRate) {
        this.scmManualDraftXtnRate = scmManualDraftXtnRate;
    }

    public Character getScmManDftFeeType() {
        return scmManDftFeeType;
    }

    public void setScmManDftFeeType(Character scmManDftFeeType) {
        this.scmManDftFeeType = scmManDftFeeType;
    }

    public BigDecimal getScmVruDraftXtnRate() {
        return scmVruDraftXtnRate;
    }

    public void setScmVruDraftXtnRate(BigDecimal scmVruDraftXtnRate) {
        this.scmVruDraftXtnRate = scmVruDraftXtnRate;
    }

    public Character getScmVruDftFeeType() {
        return scmVruDftFeeType;
    }

    public void setScmVruDftFeeType(Character scmVruDftFeeType) {
        this.scmVruDftFeeType = scmVruDftFeeType;
    }

    public Character getScmAutomationLevelOverride() {
        return scmAutomationLevelOverride;
    }

    public void setScmAutomationLevelOverride(Character scmAutomationLevelOverride) {
        this.scmAutomationLevelOverride = scmAutomationLevelOverride;
    }

    public Character getScmTestLocationFlag() {
        return scmTestLocationFlag;
    }

    public void setScmTestLocationFlag(Character scmTestLocationFlag) {
        this.scmTestLocationFlag = scmTestLocationFlag;
    }

    public BigDecimal getScmCashOutCost() {
        return scmCashOutCost;
    }

    public void setScmCashOutCost(BigDecimal scmCashOutCost) {
        this.scmCashOutCost = scmCashOutCost;
    }

    public String getScmSettleCodeword() {
        return scmSettleCodeword;
    }

    public void setScmSettleCodeword(String scmSettleCodeword) {
        this.scmSettleCodeword = scmSettleCodeword;
    }

    public String getScmTrendarId1() {
        return scmTrendarId1;
    }

    public void setScmTrendarId1(String scmTrendarId1) {
        this.scmTrendarId1 = scmTrendarId1;
    }

    public Character getScmNetPricingFl() {
        return scmNetPricingFl;
    }

    public void setScmNetPricingFl(Character scmNetPricingFl) {
        this.scmNetPricingFl = scmNetPricingFl;
    }

    public String getScmPricingFleId() {
        return scmPricingFleId;
    }

    public void setScmPricingFleId(String scmPricingFleId) {
        this.scmPricingFleId = scmPricingFleId;
    }

    public BigDecimal getScmMerchSurChgPct() {
        return scmMerchSurChgPct;
    }

    public void setScmMerchSurChgPct(BigDecimal scmMerchSurChgPct) {
        this.scmMerchSurChgPct = scmMerchSurChgPct;
    }

    public Character getScmMinFeeFlag() {
        return scmMinFeeFlag;
    }

    public void setScmMinFeeFlag(Character scmMinFeeFlag) {
        this.scmMinFeeFlag = scmMinFeeFlag;
    }

    public BigDecimal getScmMinFeeCpg() {
        return scmMinFeeCpg;
    }

    public void setScmMinFeeCpg(BigDecimal scmMinFeeCpg) {
        this.scmMinFeeCpg = scmMinFeeCpg;
    }

    public Character getScmGalupFeeFlag() {
        return scmGalupFeeFlag;
    }

    public void setScmGalupFeeFlag(Character scmGalupFeeFlag) {
        this.scmGalupFeeFlag = scmGalupFeeFlag;
    }

    public BigDecimal getScmGalupFeeCpg() {
        return scmGalupFeeCpg;
    }

    public void setScmGalupFeeCpg(BigDecimal scmGalupFeeCpg) {
        this.scmGalupFeeCpg = scmGalupFeeCpg;
    }

    public Character getRetryFlg() {
        return retryFlg;
    }

    public void setRetryFlg(Character retryFlg) {
        this.retryFlg = retryFlg;
    }

    public Character getManualFlg() {
        return manualFlg;
    }

    public void setManualFlg(Character manualFlg) {
        this.manualFlg = manualFlg;
    }

    public String getGeoPrcsnNm() {
        return geoPrcsnNm;
    }

    public void setGeoPrcsnNm(String geoPrcsnNm) {
        this.geoPrcsnNm = geoPrcsnNm;
    }

    public String getHwyNbr() {
        return hwyNbr;
    }

    public void setHwyNbr(String hwyNbr) {
        this.hwyNbr = hwyNbr;
    }

    public String getExitNbr() {
        return exitNbr;
    }

    public void setExitNbr(String exitNbr) {
        this.exitNbr = exitNbr;
    }

    public String getFuelBrandNm() {
        return fuelBrandNm;
    }

    public void setFuelBrandNm(String fuelBrandNm) {
        this.fuelBrandNm = fuelBrandNm;
    }

    public Character getAtmFlg() {
        return atmFlg;
    }

    public void setAtmFlg(Character atmFlg) {
        this.atmFlg = atmFlg;
    }

    public Character getCashAdvFlg() {
        return cashAdvFlg;
    }

    public void setCashAdvFlg(Character cashAdvFlg) {
        this.cashAdvFlg = cashAdvFlg;
    }

    public Character getDeliFlg() {
        return deliFlg;
    }

    public void setDeliFlg(Character deliFlg) {
        this.deliFlg = deliFlg;
    }

    public Character getFullServFuelFlg() {
        return fullServFuelFlg;
    }

    public void setFullServFuelFlg(Character fullServFuelFlg) {
        this.fullServFuelFlg = fullServFuelFlg;
    }

    public Character getLoungeFlg() {
        return loungeFlg;
    }

    public void setLoungeFlg(Character loungeFlg) {
        this.loungeFlg = loungeFlg;
    }

    public Character getMiniFlg() {
        return miniFlg;
    }

    public void setMiniFlg(Character miniFlg) {
        this.miniFlg = miniFlg;
    }

    public Character getMotelFlg() {
        return motelFlg;
    }

    public void setMotelFlg(Character motelFlg) {
        this.motelFlg = motelFlg;
    }

    public Character getPermitsAvalFlg() {
        return permitsAvalFlg;
    }

    public void setPermitsAvalFlg(Character permitsAvalFlg) {
        this.permitsAvalFlg = permitsAvalFlg;
    }

    public Character getPavedTruckParkFlg() {
        return pavedTruckParkFlg;
    }

    public void setPavedTruckParkFlg(Character pavedTruckParkFlg) {
        this.pavedTruckParkFlg = pavedTruckParkFlg;
    }

    public Character getSafeHavenFlg() {
        return safeHavenFlg;
    }

    public void setSafeHavenFlg(Character safeHavenFlg) {
        this.safeHavenFlg = safeHavenFlg;
    }

    public Character getSelfServFuelFlg() {
        return selfServFuelFlg;
    }

    public void setSelfServFuelFlg(Character selfServFuelFlg) {
        this.selfServFuelFlg = selfServFuelFlg;
    }

    public Character getFmaleShowersFlg() {
        return fmaleShowersFlg;
    }

    public void setFmaleShowersFlg(Character fmaleShowersFlg) {
        this.fmaleShowersFlg = fmaleShowersFlg;
    }

    public Character getTvGmRmFlg() {
        return tvGmRmFlg;
    }

    public void setTvGmRmFlg(Character tvGmRmFlg) {
        this.tvGmRmFlg = tvGmRmFlg;
    }

    public Character getLaundryFlg() {
        return laundryFlg;
    }

    public void setLaundryFlg(Character laundryFlg) {
        this.laundryFlg = laundryFlg;
    }

    public Character getMajorRepairFlg() {
        return majorRepairFlg;
    }

    public void setMajorRepairFlg(Character majorRepairFlg) {
        this.majorRepairFlg = majorRepairFlg;
    }

    public Character getMinorRepairFlg() {
        return minorRepairFlg;
    }

    public void setMinorRepairFlg(Character minorRepairFlg) {
        this.minorRepairFlg = minorRepairFlg;
    }

    public Character getMaleShowersFlg() {
        return maleShowersFlg;
    }

    public void setMaleShowersFlg(Character maleShowersFlg) {
        this.maleShowersFlg = maleShowersFlg;
    }

    public Character getRestaurantFlg() {
        return restaurantFlg;
    }

    public void setRestaurantFlg(Character restaurantFlg) {
        this.restaurantFlg = restaurantFlg;
    }

    public Character getScalesAvalFlg() {
        return scalesAvalFlg;
    }

    public void setScalesAvalFlg(Character scalesAvalFlg) {
        this.scalesAvalFlg = scalesAvalFlg;
    }

    public Character getTruckStoreFlg() {
        return truckStoreFlg;
    }

    public void setTruckStoreFlg(Character truckStoreFlg) {
        this.truckStoreFlg = truckStoreFlg;
    }

    public Character getTireRepairFlg() {
        return tireRepairFlg;
    }

    public void setTireRepairFlg(Character tireRepairFlg) {
        this.tireRepairFlg = tireRepairFlg;
    }

    public Character getWreckerServFlg() {
        return wreckerServFlg;
    }

    public void setWreckerServFlg(Character wreckerServFlg) {
        this.wreckerServFlg = wreckerServFlg;
    }

    public Character getTruckWashFlg() {
        return truckWashFlg;
    }

    public void setTruckWashFlg(Character truckWashFlg) {
        this.truckWashFlg = truckWashFlg;
    }

    public Character getFedexDropOffBoxFlg() {
        return fedexDropOffBoxFlg;
    }

    public void setFedexDropOffBoxFlg(Character fedexDropOffBoxFlg) {
        this.fedexDropOffBoxFlg = fedexDropOffBoxFlg;
    }

    public Character getUpsDropOffBoxFlg() {
        return upsDropOffBoxFlg;
    }

    public void setUpsDropOffBoxFlg(Character upsDropOffBoxFlg) {
        this.upsDropOffBoxFlg = upsDropOffBoxFlg;
    }

    public Character getAirbornDropOffBoxFlg() {
        return airbornDropOffBoxFlg;
    }

    public void setAirbornDropOffBoxFlg(Character airbornDropOffBoxFlg) {
        this.airbornDropOffBoxFlg = airbornDropOffBoxFlg;
    }

    public Character getOverNightParkFlg() {
        return overNightParkFlg;
    }

    public void setOverNightParkFlg(Character overNightParkFlg) {
        this.overNightParkFlg = overNightParkFlg;
    }

    public Character getPaycodeFlag() {
        return paycodeFlag;
    }

    public void setPaycodeFlag(Character paycodeFlag) {
        this.paycodeFlag = paycodeFlag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stationCode != null ? stationCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ServiceCenter)) {
            return false;
        }
        ServiceCenter other = (ServiceCenter) object;
        if ((this.stationCode == null && other.stationCode != null) || (this.stationCode != null && !this.stationCode.equals(other.stationCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ServiceCenter[ stationCode=" + stationCode + " ]";
    }

}
