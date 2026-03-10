/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "PRP_PSTD_TXN", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrpPstdTxn.findAll", query = "SELECT p FROM PrpPstdTxn p")})
public class PrpPstdTxn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "XTN_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xtnTs;
    @Basic(optional = false)
    @Column(name = "XTN_REC_TYP")
    private String xtnRecTyp;
    @Basic(optional = false)
    @Column(name = "TRNS_CNTRY_CD")
    private Character trnsCntryCd;
    @Basic(optional = false)
    @Column(name = "PREFER_LEVEL_CD")
    private Character preferLevelCd;
    @Basic(optional = false)
    @Column(name = "TEXACO_CREDIT_XTN_CD")
    private Character texacoCreditXtnCd;
    @Basic(optional = false)
    @Column(name = "ACCT_CURR_TYP")
    private Character acctCurrTyp;
    @Basic(optional = false)
    @Column(name = "CURRENCY_CD")
    private Character currencyCd;
    @Basic(optional = false)
    @Column(name = "PAY_AT_LOAD_CD")
    private Character payAtLoadCd;
    @Basic(optional = false)
    @Column(name = "PURCH_ORD_NBR")
    private String purchOrdNbr;
    @Basic(optional = false)
    @Column(name = "DRVR_NM")
    private String drvrNm;
    @Basic(optional = false)
    @Column(name = "SC_CTY_NM")
    private String scCtyNm;
    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "SCNDY_CRD_IND")
    private Character scndyCrdInd;
    @Basic(optional = false)
    @Column(name = "SC_INV_NBR")
    private String scInvNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ODOMETER_RDNG")
    private BigDecimal odometerRdng;
    @Basic(optional = false)
    @Column(name = "PREV_HUB_RDNG")
    private BigDecimal prevHubRdng;
    @Basic(optional = false)
    @Column(name = "COM_SITE_ACCT_NBR")
    private String comSiteAcctNbr;
    @Basic(optional = false)
    @Column(name = "CUR_MPG")
    private BigDecimal curMpg;
    @Basic(optional = false)
    @Column(name = "YTD_MPG")
    private BigDecimal ytdMpg;
    @Basic(optional = false)
    @Column(name = "TRLR_HRS")
    private BigDecimal trlrHrs;
    @Basic(optional = false)
    @Column(name = "TRLR_HPG")
    private BigDecimal trlrHpg;
    @Basic(optional = false)
    @Column(name = "TRLR_HUB")
    private BigDecimal trlrHub;
    @Basic(optional = false)
    @Column(name = "DRVR_LIC_NBR")
    private String drvrLicNbr;
    @Basic(optional = false)
    @Column(name = "DRVR_LIC_ST_CD")
    private String drvrLicStCd;
    @Basic(optional = false)
    @Column(name = "CUST_DISC_METHOD_CD")
    private Character custDiscMethodCd;
    @Basic(optional = false)
    @Column(name = "CUST_NM")
    private String custNm;
    @Basic(optional = false)
    @Column(name = "DISC_TYP_CD")
    private Character discTypCd;
    @Basic(optional = false)
    @Column(name = "DISC_AMT")
    private BigDecimal discAmt;
    @Basic(optional = false)
    @Column(name = "EXT_DISC_AMT")
    private BigDecimal extDiscAmt;
    @Basic(optional = false)
    @Column(name = "TOT_INV_AMT")
    private BigDecimal totInvAmt;
    @Basic(optional = false)
    @Column(name = "TF_CASH_CD")
    private short tfCashCd;
    @Basic(optional = false)
    @Column(name = "TF_OIL_CD")
    private short tfOilCd;
    @Basic(optional = false)
    @Column(name = "TF_OTH_FUEL_CD")
    private short tfOthFuelCd;
    @Basic(optional = false)
    @Column(name = "TF_PRODUCT1_CD")
    private short tfProduct1Cd;
    @Basic(optional = false)
    @Column(name = "TF_PRODUCT2_CD")
    private short tfProduct2Cd;
    @Basic(optional = false)
    @Column(name = "TF_PRODUCT3_CD")
    private short tfProduct3Cd;
    @Basic(optional = false)
    @Column(name = "TF_TRACTOR_FUEL_CD")
    private short tfTractorFuelCd;
    @Basic(optional = false)
    @Column(name = "TF_TRLR_FUEL_CD")
    private short tfTrlrFuelCd;
    @Basic(optional = false)
    @Column(name = "TR_PRD_CD_1")
    private String trPrdCd1;
    @Basic(optional = false)
    @Column(name = "TR_PRD_CD_2")
    private String trPrdCd2;
    @Basic(optional = false)
    @Column(name = "TR_PRD_CD_3")
    private String trPrdCd3;
    @Basic(optional = false)
    @Column(name = "SPLT_REC_NBR")
    private Character spltRecNbr;
    @Basic(optional = false)
    @Column(name = "CNCL_CD")
    private Character cnclCd;
    @Basic(optional = false)
    @Column(name = "CNCL_DT")
    @Temporal(TemporalType.DATE)
    private Date cnclDt;
    @Basic(optional = false)
    @Column(name = "ADJ_DT")
    @Temporal(TemporalType.DATE)
    private Date adjDt;
    @Basic(optional = false)
    @Column(name = "DLY_CD")
    private Character dlyCd;
    @Basic(optional = false)
    @Column(name = "DNETPRCG_NR1_DISC_AMT")
    private BigDecimal dnetprcgNr1DiscAmt;
    @Basic(optional = false)
    @Column(name = "DNETPRCG_NR2_DISC_AMT")
    private BigDecimal dnetprcgNr2DiscAmt;
    @Basic(optional = false)
    @Column(name = "DNETPRCG_OTH_DISC_AMT")
    private BigDecimal dnetprcgOthDiscAmt;
    @Basic(optional = false)
    @Column(name = "DNETPRCG_REF_DISC_AMT")
    private BigDecimal dnetprcgRefDiscAmt;
    @Basic(optional = false)
    @Column(name = "FUEL_UP_AMT")
    private BigDecimal fuelUpAmt;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_CAN_DOL_AMT")
    private BigDecimal canTaxCanDolAmt;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_US_DOL_AMT")
    private BigDecimal canTaxUsDolAmt;
    @Basic(optional = false)
    @Column(name = "OTH_FUEL_TYP")
    private String othFuelTyp;
    @Basic(optional = false)
    @Column(name = "BATCH_UPD_CD")
    private Character batchUpdCd;
    @Basic(optional = false)
    @Column(name = "CONV_GET_BACK_RATE")
    private BigDecimal convGetBackRate;
    @Basic(optional = false)
    @Column(name = "TMP_UNIT_NBR")
    private String tmpUnitNbr;
    @Basic(optional = false)
    @Column(name = "SC_ALLIANCE_CD")
    private Character scAllianceCd;
    @Basic(optional = false)
    @Column(name = "SCNDY_CARD_NBR")
    private String scndyCardNbr;
    @Basic(optional = false)
    @Column(name = "SEL_OR_FOCUS_DISC_CD")
    private Character selOrFocusDiscCd;
    @Basic(optional = false)
    @Column(name = "TR_SC_INVOICE_AMT")
    private BigDecimal trScInvoiceAmt;
    @Basic(optional = false)
    @Column(name = "TR_REB_DISC_AMT")
    private BigDecimal trRebDiscAmt;
    @Basic(optional = false)
    @Column(name = "TR_RD_FUEL_RATE")
    private BigDecimal trRdFuelRate;
    @Basic(optional = false)
    @Column(name = "TR_RD_CASH_ADVANCE_RATE")
    private BigDecimal trRdCashAdvanceRate;
    @Basic(optional = false)
    @Column(name = "TR_RD_SC_SELECT_DISC_AMT")
    private BigDecimal trRdScSelectDiscAmt;
    @Basic(optional = false)
    @Column(name = "TR_RD_COMP_HNDLG_CHG_AMT")
    private BigDecimal trRdCompHndlgChgAmt;
    @Basic(optional = false)
    @Column(name = "TR_RD_SC_TRAN_FEE_AMT")
    private BigDecimal trRdScTranFeeAmt;
    @Basic(optional = false)
    @Column(name = "TR_GD_SC_REV_AMT")
    private BigDecimal trGdScRevAmt;
    @Basic(optional = false)
    @Column(name = "TR_BR_SC_FEE_AMT")
    private BigDecimal trBrScFeeAmt;
    @Basic(optional = false)
    @Column(name = "TR_BR_SRVC_CNTR_FEE_AMT")
    private BigDecimal trBrSrvcCntrFeeAmt;
    @Basic(optional = false)
    @Column(name = "TR_BR_CUSTOMER_FEE_AMT")
    private BigDecimal trBrCustomerFeeAmt;
    @Basic(optional = false)
    @Column(name = "TR_BR_CASH_ADD_FEE_AMT")
    private BigDecimal trBrCashAddFeeAmt;
    @Basic(optional = false)
    @Column(name = "TR_BR_VOICE_SURCHG_FEE_AMT")
    private BigDecimal trBrVoiceSurchgFeeAmt;
    @Basic(optional = false)
    @Column(name = "TR_CUST_MANUAL_FEE_AMT")
    private BigDecimal trCustManualFeeAmt;
    @Basic(optional = false)
    @Column(name = "TR_COST_PLUS_ADD_ON_AMT")
    private BigDecimal trCostPlusAddOnAmt;
    @Basic(optional = false)
    @Column(name = "TR_SC_SELECT_DISC_AMT")
    private BigDecimal trScSelectDiscAmt;
    @Basic(optional = false)
    @Column(name = "BC_SC_INVOICE_AMT")
    private BigDecimal bcScInvoiceAmt;
    @Basic(optional = false)
    @Column(name = "BC_REB_DISC_AMT")
    private BigDecimal bcRebDiscAmt;
    @Basic(optional = false)
    @Column(name = "BC_RD_FUEL_RATE")
    private BigDecimal bcRdFuelRate;
    @Basic(optional = false)
    @Column(name = "BC_RD_CASH_ADVANCE_RATE")
    private BigDecimal bcRdCashAdvanceRate;
    @Basic(optional = false)
    @Column(name = "BC_RD_SC_SELECT_DISC_AMT")
    private BigDecimal bcRdScSelectDiscAmt;
    @Basic(optional = false)
    @Column(name = "BC_RD_COMP_HNDLG_CHG_AMT")
    private BigDecimal bcRdCompHndlgChgAmt;
    @Basic(optional = false)
    @Column(name = "BC_RD_SC_TRAN_FEE_AMT")
    private BigDecimal bcRdScTranFeeAmt;
    @Basic(optional = false)
    @Column(name = "BC_GD_SC_REV_AMT")
    private BigDecimal bcGdScRevAmt;
    @Basic(optional = false)
    @Column(name = "BC_BR_SC_FEE_AMT")
    private BigDecimal bcBrScFeeAmt;
    @Basic(optional = false)
    @Column(name = "BC_BR_SRVC_CNTR_FEE_AMT")
    private BigDecimal bcBrSrvcCntrFeeAmt;
    @Basic(optional = false)
    @Column(name = "BC_BR_CUSTOMER_FEE_AMT")
    private BigDecimal bcBrCustomerFeeAmt;
    @Basic(optional = false)
    @Column(name = "BC_BR_CASH_ADD_FEE_AMT")
    private BigDecimal bcBrCashAddFeeAmt;
    @Basic(optional = false)
    @Column(name = "BC_BR_VOICE_SURCHG_FEE_AMT")
    private BigDecimal bcBrVoiceSurchgFeeAmt;
    @Basic(optional = false)
    @Column(name = "BC_CUST_MANUAL_FEE_AMT")
    private BigDecimal bcCustManualFeeAmt;
    @Basic(optional = false)
    @Column(name = "BC_COST_PLUS_ADD_ON_AMT")
    private BigDecimal bcCostPlusAddOnAmt;
    @Basic(optional = false)
    @Column(name = "BC_SC_SELECT_DISC_AMT")
    private BigDecimal bcScSelectDiscAmt;
    @Basic(optional = false)
    @Column(name = "BC_TAX_AMT")
    private BigDecimal bcTaxAmt;
    @Basic(optional = false)
    @Column(name = "SC_SC_INVOICE_AMT")
    private BigDecimal scScInvoiceAmt;
    @Basic(optional = false)
    @Column(name = "SC_REB_DISC_AMT")
    private BigDecimal scRebDiscAmt;
    @Basic(optional = false)
    @Column(name = "SC_RD_FUEL_RATE")
    private BigDecimal scRdFuelRate;
    @Basic(optional = false)
    @Column(name = "SC_RD_CASH_ADVANCE_RATE")
    private BigDecimal scRdCashAdvanceRate;
    @Basic(optional = false)
    @Column(name = "SC_RD_SC_SELECT_DISC_AMT")
    private BigDecimal scRdScSelectDiscAmt;
    @Basic(optional = false)
    @Column(name = "SC_RD_COMP_HNDLG_CHG_AMT")
    private BigDecimal scRdCompHndlgChgAmt;
    @Basic(optional = false)
    @Column(name = "SC_RD_SC_TRAN_FEE_AMT")
    private BigDecimal scRdScTranFeeAmt;
    @Basic(optional = false)
    @Column(name = "SC_GD_SC_REV_AMT")
    private BigDecimal scGdScRevAmt;
    @Basic(optional = false)
    @Column(name = "SC_BR_SC_FEE_AMT")
    private BigDecimal scBrScFeeAmt;
    @Basic(optional = false)
    @Column(name = "SC_BR_SRVC_CNTR_FEE_AMT")
    private BigDecimal scBrSrvcCntrFeeAmt;
    @Basic(optional = false)
    @Column(name = "SC_BR_CUSTOMER_FEE_AMT")
    private BigDecimal scBrCustomerFeeAmt;
    @Basic(optional = false)
    @Column(name = "SC_BR_CASH_ADD_FEE_AMT")
    private BigDecimal scBrCashAddFeeAmt;
    @Basic(optional = false)
    @Column(name = "SC_BR_VOICE_SURCHG_FEE_AMT")
    private BigDecimal scBrVoiceSurchgFeeAmt;
    @Basic(optional = false)
    @Column(name = "SC_CUST_MANUAL_FEE_AMT")
    private BigDecimal scCustManualFeeAmt;
    @Basic(optional = false)
    @Column(name = "SC_COST_PLUS_ADD_ON_AMT")
    private BigDecimal scCostPlusAddOnAmt;
    @Basic(optional = false)
    @Column(name = "SC_SC_SELECT_DISC_AMT")
    private BigDecimal scScSelectDiscAmt;
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
    @Column(name = "POS_SEND_DATA")
    private String posSendData;
    @Basic(optional = false)
    @Column(name = "TRACKING_NBR")
    private int trackingNbr;
    @Basic(optional = false)
    @Column(name = "ITPU_SYSTEM_ID")
    private String itpuSystemId;
    @Basic(optional = false)
    @Column(name = "ITPU_REPORT_NBR")
    private String itpuReportNbr;
    @Basic(optional = false)
    @Column(name = "ITPU_DEVICE_TYP")
    private String itpuDeviceTyp;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;

    public PrpPstdTxn() {
    }

    public PrpPstdTxn(Date xtnTs) {
        this.xtnTs = xtnTs;
    }

    public PrpPstdTxn(Date xtnTs, String xtnRecTyp, Character trnsCntryCd, Character preferLevelCd, Character texacoCreditXtnCd, Character acctCurrTyp, Character currencyCd, Character payAtLoadCd, String purchOrdNbr, String drvrNm, String scCtyNm, String crdTknNbr, Character scndyCrdInd, String scInvNbr, BigDecimal odometerRdng, BigDecimal prevHubRdng, String comSiteAcctNbr, BigDecimal curMpg, BigDecimal ytdMpg, BigDecimal trlrHrs, BigDecimal trlrHpg, BigDecimal trlrHub, String drvrLicNbr, String drvrLicStCd, Character custDiscMethodCd, String custNm, Character discTypCd, BigDecimal discAmt, BigDecimal extDiscAmt, BigDecimal totInvAmt, short tfCashCd, short tfOilCd, short tfOthFuelCd, short tfProduct1Cd, short tfProduct2Cd, short tfProduct3Cd, short tfTractorFuelCd, short tfTrlrFuelCd, String trPrdCd1, String trPrdCd2, String trPrdCd3, Character spltRecNbr, Character cnclCd, Date cnclDt, Date adjDt, Character dlyCd, BigDecimal dnetprcgNr1DiscAmt, BigDecimal dnetprcgNr2DiscAmt, BigDecimal dnetprcgOthDiscAmt, BigDecimal dnetprcgRefDiscAmt, BigDecimal fuelUpAmt, BigDecimal canTaxCanDolAmt, BigDecimal canTaxUsDolAmt, String othFuelTyp, Character batchUpdCd, BigDecimal convGetBackRate, String tmpUnitNbr, Character scAllianceCd, String scndyCardNbr, Character selOrFocusDiscCd, BigDecimal trScInvoiceAmt, BigDecimal trRebDiscAmt, BigDecimal trRdFuelRate, BigDecimal trRdCashAdvanceRate, BigDecimal trRdScSelectDiscAmt, BigDecimal trRdCompHndlgChgAmt, BigDecimal trRdScTranFeeAmt, BigDecimal trGdScRevAmt, BigDecimal trBrScFeeAmt, BigDecimal trBrSrvcCntrFeeAmt, BigDecimal trBrCustomerFeeAmt, BigDecimal trBrCashAddFeeAmt, BigDecimal trBrVoiceSurchgFeeAmt, BigDecimal trCustManualFeeAmt, BigDecimal trCostPlusAddOnAmt, BigDecimal trScSelectDiscAmt, BigDecimal bcScInvoiceAmt, BigDecimal bcRebDiscAmt, BigDecimal bcRdFuelRate, BigDecimal bcRdCashAdvanceRate, BigDecimal bcRdScSelectDiscAmt, BigDecimal bcRdCompHndlgChgAmt, BigDecimal bcRdScTranFeeAmt, BigDecimal bcGdScRevAmt, BigDecimal bcBrScFeeAmt, BigDecimal bcBrSrvcCntrFeeAmt, BigDecimal bcBrCustomerFeeAmt, BigDecimal bcBrCashAddFeeAmt, BigDecimal bcBrVoiceSurchgFeeAmt, BigDecimal bcCustManualFeeAmt, BigDecimal bcCostPlusAddOnAmt, BigDecimal bcScSelectDiscAmt, BigDecimal bcTaxAmt, BigDecimal scScInvoiceAmt, BigDecimal scRebDiscAmt, BigDecimal scRdFuelRate, BigDecimal scRdCashAdvanceRate, BigDecimal scRdScSelectDiscAmt, BigDecimal scRdCompHndlgChgAmt, BigDecimal scRdScTranFeeAmt, BigDecimal scGdScRevAmt, BigDecimal scBrScFeeAmt, BigDecimal scBrSrvcCntrFeeAmt, BigDecimal scBrCustomerFeeAmt, BigDecimal scBrCashAddFeeAmt, BigDecimal scBrVoiceSurchgFeeAmt, BigDecimal scCustManualFeeAmt, BigDecimal scCostPlusAddOnAmt, BigDecimal scScSelectDiscAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String posSendData, int trackingNbr, String itpuSystemId, String itpuReportNbr, String itpuDeviceTyp, Date rowChgTs) {
        this.xtnTs = xtnTs;
        this.xtnRecTyp = xtnRecTyp;
        this.trnsCntryCd = trnsCntryCd;
        this.preferLevelCd = preferLevelCd;
        this.texacoCreditXtnCd = texacoCreditXtnCd;
        this.acctCurrTyp = acctCurrTyp;
        this.currencyCd = currencyCd;
        this.payAtLoadCd = payAtLoadCd;
        this.purchOrdNbr = purchOrdNbr;
        this.drvrNm = drvrNm;
        this.scCtyNm = scCtyNm;
        this.crdTknNbr = crdTknNbr;
        this.scndyCrdInd = scndyCrdInd;
        this.scInvNbr = scInvNbr;
        this.odometerRdng = odometerRdng;
        this.prevHubRdng = prevHubRdng;
        this.comSiteAcctNbr = comSiteAcctNbr;
        this.curMpg = curMpg;
        this.ytdMpg = ytdMpg;
        this.trlrHrs = trlrHrs;
        this.trlrHpg = trlrHpg;
        this.trlrHub = trlrHub;
        this.drvrLicNbr = drvrLicNbr;
        this.drvrLicStCd = drvrLicStCd;
        this.custDiscMethodCd = custDiscMethodCd;
        this.custNm = custNm;
        this.discTypCd = discTypCd;
        this.discAmt = discAmt;
        this.extDiscAmt = extDiscAmt;
        this.totInvAmt = totInvAmt;
        this.tfCashCd = tfCashCd;
        this.tfOilCd = tfOilCd;
        this.tfOthFuelCd = tfOthFuelCd;
        this.tfProduct1Cd = tfProduct1Cd;
        this.tfProduct2Cd = tfProduct2Cd;
        this.tfProduct3Cd = tfProduct3Cd;
        this.tfTractorFuelCd = tfTractorFuelCd;
        this.tfTrlrFuelCd = tfTrlrFuelCd;
        this.trPrdCd1 = trPrdCd1;
        this.trPrdCd2 = trPrdCd2;
        this.trPrdCd3 = trPrdCd3;
        this.spltRecNbr = spltRecNbr;
        this.cnclCd = cnclCd;
        this.cnclDt = cnclDt;
        this.adjDt = adjDt;
        this.dlyCd = dlyCd;
        this.dnetprcgNr1DiscAmt = dnetprcgNr1DiscAmt;
        this.dnetprcgNr2DiscAmt = dnetprcgNr2DiscAmt;
        this.dnetprcgOthDiscAmt = dnetprcgOthDiscAmt;
        this.dnetprcgRefDiscAmt = dnetprcgRefDiscAmt;
        this.fuelUpAmt = fuelUpAmt;
        this.canTaxCanDolAmt = canTaxCanDolAmt;
        this.canTaxUsDolAmt = canTaxUsDolAmt;
        this.othFuelTyp = othFuelTyp;
        this.batchUpdCd = batchUpdCd;
        this.convGetBackRate = convGetBackRate;
        this.tmpUnitNbr = tmpUnitNbr;
        this.scAllianceCd = scAllianceCd;
        this.scndyCardNbr = scndyCardNbr;
        this.selOrFocusDiscCd = selOrFocusDiscCd;
        this.trScInvoiceAmt = trScInvoiceAmt;
        this.trRebDiscAmt = trRebDiscAmt;
        this.trRdFuelRate = trRdFuelRate;
        this.trRdCashAdvanceRate = trRdCashAdvanceRate;
        this.trRdScSelectDiscAmt = trRdScSelectDiscAmt;
        this.trRdCompHndlgChgAmt = trRdCompHndlgChgAmt;
        this.trRdScTranFeeAmt = trRdScTranFeeAmt;
        this.trGdScRevAmt = trGdScRevAmt;
        this.trBrScFeeAmt = trBrScFeeAmt;
        this.trBrSrvcCntrFeeAmt = trBrSrvcCntrFeeAmt;
        this.trBrCustomerFeeAmt = trBrCustomerFeeAmt;
        this.trBrCashAddFeeAmt = trBrCashAddFeeAmt;
        this.trBrVoiceSurchgFeeAmt = trBrVoiceSurchgFeeAmt;
        this.trCustManualFeeAmt = trCustManualFeeAmt;
        this.trCostPlusAddOnAmt = trCostPlusAddOnAmt;
        this.trScSelectDiscAmt = trScSelectDiscAmt;
        this.bcScInvoiceAmt = bcScInvoiceAmt;
        this.bcRebDiscAmt = bcRebDiscAmt;
        this.bcRdFuelRate = bcRdFuelRate;
        this.bcRdCashAdvanceRate = bcRdCashAdvanceRate;
        this.bcRdScSelectDiscAmt = bcRdScSelectDiscAmt;
        this.bcRdCompHndlgChgAmt = bcRdCompHndlgChgAmt;
        this.bcRdScTranFeeAmt = bcRdScTranFeeAmt;
        this.bcGdScRevAmt = bcGdScRevAmt;
        this.bcBrScFeeAmt = bcBrScFeeAmt;
        this.bcBrSrvcCntrFeeAmt = bcBrSrvcCntrFeeAmt;
        this.bcBrCustomerFeeAmt = bcBrCustomerFeeAmt;
        this.bcBrCashAddFeeAmt = bcBrCashAddFeeAmt;
        this.bcBrVoiceSurchgFeeAmt = bcBrVoiceSurchgFeeAmt;
        this.bcCustManualFeeAmt = bcCustManualFeeAmt;
        this.bcCostPlusAddOnAmt = bcCostPlusAddOnAmt;
        this.bcScSelectDiscAmt = bcScSelectDiscAmt;
        this.bcTaxAmt = bcTaxAmt;
        this.scScInvoiceAmt = scScInvoiceAmt;
        this.scRebDiscAmt = scRebDiscAmt;
        this.scRdFuelRate = scRdFuelRate;
        this.scRdCashAdvanceRate = scRdCashAdvanceRate;
        this.scRdScSelectDiscAmt = scRdScSelectDiscAmt;
        this.scRdCompHndlgChgAmt = scRdCompHndlgChgAmt;
        this.scRdScTranFeeAmt = scRdScTranFeeAmt;
        this.scGdScRevAmt = scGdScRevAmt;
        this.scBrScFeeAmt = scBrScFeeAmt;
        this.scBrSrvcCntrFeeAmt = scBrSrvcCntrFeeAmt;
        this.scBrCustomerFeeAmt = scBrCustomerFeeAmt;
        this.scBrCashAddFeeAmt = scBrCashAddFeeAmt;
        this.scBrVoiceSurchgFeeAmt = scBrVoiceSurchgFeeAmt;
        this.scCustManualFeeAmt = scCustManualFeeAmt;
        this.scCostPlusAddOnAmt = scCostPlusAddOnAmt;
        this.scScSelectDiscAmt = scScSelectDiscAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.posSendData = posSendData;
        this.trackingNbr = trackingNbr;
        this.itpuSystemId = itpuSystemId;
        this.itpuReportNbr = itpuReportNbr;
        this.itpuDeviceTyp = itpuDeviceTyp;
        this.rowChgTs = rowChgTs;
    }

    public Date getXtnTs() {
        return xtnTs;
    }

    public void setXtnTs(Date xtnTs) {
        this.xtnTs = xtnTs;
    }

    public String getXtnRecTyp() {
        return xtnRecTyp;
    }

    public void setXtnRecTyp(String xtnRecTyp) {
        this.xtnRecTyp = xtnRecTyp;
    }

    public Character getTrnsCntryCd() {
        return trnsCntryCd;
    }

    public void setTrnsCntryCd(Character trnsCntryCd) {
        this.trnsCntryCd = trnsCntryCd;
    }

    public Character getPreferLevelCd() {
        return preferLevelCd;
    }

    public void setPreferLevelCd(Character preferLevelCd) {
        this.preferLevelCd = preferLevelCd;
    }

    public Character getTexacoCreditXtnCd() {
        return texacoCreditXtnCd;
    }

    public void setTexacoCreditXtnCd(Character texacoCreditXtnCd) {
        this.texacoCreditXtnCd = texacoCreditXtnCd;
    }

    public Character getAcctCurrTyp() {
        return acctCurrTyp;
    }

    public void setAcctCurrTyp(Character acctCurrTyp) {
        this.acctCurrTyp = acctCurrTyp;
    }

    public Character getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(Character currencyCd) {
        this.currencyCd = currencyCd;
    }

    public Character getPayAtLoadCd() {
        return payAtLoadCd;
    }

    public void setPayAtLoadCd(Character payAtLoadCd) {
        this.payAtLoadCd = payAtLoadCd;
    }

    public String getPurchOrdNbr() {
        return purchOrdNbr;
    }

    public void setPurchOrdNbr(String purchOrdNbr) {
        this.purchOrdNbr = purchOrdNbr;
    }

    public String getDrvrNm() {
        return drvrNm;
    }

    public void setDrvrNm(String drvrNm) {
        this.drvrNm = drvrNm;
    }

    public String getScCtyNm() {
        return scCtyNm;
    }

    public void setScCtyNm(String scCtyNm) {
        this.scCtyNm = scCtyNm;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public Character getScndyCrdInd() {
        return scndyCrdInd;
    }

    public void setScndyCrdInd(Character scndyCrdInd) {
        this.scndyCrdInd = scndyCrdInd;
    }

    public String getScInvNbr() {
        return scInvNbr;
    }

    public void setScInvNbr(String scInvNbr) {
        this.scInvNbr = scInvNbr;
    }

    public BigDecimal getOdometerRdng() {
        return odometerRdng;
    }

    public void setOdometerRdng(BigDecimal odometerRdng) {
        this.odometerRdng = odometerRdng;
    }

    public BigDecimal getPrevHubRdng() {
        return prevHubRdng;
    }

    public void setPrevHubRdng(BigDecimal prevHubRdng) {
        this.prevHubRdng = prevHubRdng;
    }

    public String getComSiteAcctNbr() {
        return comSiteAcctNbr;
    }

    public void setComSiteAcctNbr(String comSiteAcctNbr) {
        this.comSiteAcctNbr = comSiteAcctNbr;
    }

    public BigDecimal getCurMpg() {
        return curMpg;
    }

    public void setCurMpg(BigDecimal curMpg) {
        this.curMpg = curMpg;
    }

    public BigDecimal getYtdMpg() {
        return ytdMpg;
    }

    public void setYtdMpg(BigDecimal ytdMpg) {
        this.ytdMpg = ytdMpg;
    }

    public BigDecimal getTrlrHrs() {
        return trlrHrs;
    }

    public void setTrlrHrs(BigDecimal trlrHrs) {
        this.trlrHrs = trlrHrs;
    }

    public BigDecimal getTrlrHpg() {
        return trlrHpg;
    }

    public void setTrlrHpg(BigDecimal trlrHpg) {
        this.trlrHpg = trlrHpg;
    }

    public BigDecimal getTrlrHub() {
        return trlrHub;
    }

    public void setTrlrHub(BigDecimal trlrHub) {
        this.trlrHub = trlrHub;
    }

    public String getDrvrLicNbr() {
        return drvrLicNbr;
    }

    public void setDrvrLicNbr(String drvrLicNbr) {
        this.drvrLicNbr = drvrLicNbr;
    }

    public String getDrvrLicStCd() {
        return drvrLicStCd;
    }

    public void setDrvrLicStCd(String drvrLicStCd) {
        this.drvrLicStCd = drvrLicStCd;
    }

    public Character getCustDiscMethodCd() {
        return custDiscMethodCd;
    }

    public void setCustDiscMethodCd(Character custDiscMethodCd) {
        this.custDiscMethodCd = custDiscMethodCd;
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public Character getDiscTypCd() {
        return discTypCd;
    }

    public void setDiscTypCd(Character discTypCd) {
        this.discTypCd = discTypCd;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
    }

    public BigDecimal getExtDiscAmt() {
        return extDiscAmt;
    }

    public void setExtDiscAmt(BigDecimal extDiscAmt) {
        this.extDiscAmt = extDiscAmt;
    }

    public BigDecimal getTotInvAmt() {
        return totInvAmt;
    }

    public void setTotInvAmt(BigDecimal totInvAmt) {
        this.totInvAmt = totInvAmt;
    }

    public short getTfCashCd() {
        return tfCashCd;
    }

    public void setTfCashCd(short tfCashCd) {
        this.tfCashCd = tfCashCd;
    }

    public short getTfOilCd() {
        return tfOilCd;
    }

    public void setTfOilCd(short tfOilCd) {
        this.tfOilCd = tfOilCd;
    }

    public short getTfOthFuelCd() {
        return tfOthFuelCd;
    }

    public void setTfOthFuelCd(short tfOthFuelCd) {
        this.tfOthFuelCd = tfOthFuelCd;
    }

    public short getTfProduct1Cd() {
        return tfProduct1Cd;
    }

    public void setTfProduct1Cd(short tfProduct1Cd) {
        this.tfProduct1Cd = tfProduct1Cd;
    }

    public short getTfProduct2Cd() {
        return tfProduct2Cd;
    }

    public void setTfProduct2Cd(short tfProduct2Cd) {
        this.tfProduct2Cd = tfProduct2Cd;
    }

    public short getTfProduct3Cd() {
        return tfProduct3Cd;
    }

    public void setTfProduct3Cd(short tfProduct3Cd) {
        this.tfProduct3Cd = tfProduct3Cd;
    }

    public short getTfTractorFuelCd() {
        return tfTractorFuelCd;
    }

    public void setTfTractorFuelCd(short tfTractorFuelCd) {
        this.tfTractorFuelCd = tfTractorFuelCd;
    }

    public short getTfTrlrFuelCd() {
        return tfTrlrFuelCd;
    }

    public void setTfTrlrFuelCd(short tfTrlrFuelCd) {
        this.tfTrlrFuelCd = tfTrlrFuelCd;
    }

    public String getTrPrdCd1() {
        return trPrdCd1;
    }

    public void setTrPrdCd1(String trPrdCd1) {
        this.trPrdCd1 = trPrdCd1;
    }

    public String getTrPrdCd2() {
        return trPrdCd2;
    }

    public void setTrPrdCd2(String trPrdCd2) {
        this.trPrdCd2 = trPrdCd2;
    }

    public String getTrPrdCd3() {
        return trPrdCd3;
    }

    public void setTrPrdCd3(String trPrdCd3) {
        this.trPrdCd3 = trPrdCd3;
    }

    public Character getSpltRecNbr() {
        return spltRecNbr;
    }

    public void setSpltRecNbr(Character spltRecNbr) {
        this.spltRecNbr = spltRecNbr;
    }

    public Character getCnclCd() {
        return cnclCd;
    }

    public void setCnclCd(Character cnclCd) {
        this.cnclCd = cnclCd;
    }

    public Date getCnclDt() {
        return cnclDt;
    }

    public void setCnclDt(Date cnclDt) {
        this.cnclDt = cnclDt;
    }

    public Date getAdjDt() {
        return adjDt;
    }

    public void setAdjDt(Date adjDt) {
        this.adjDt = adjDt;
    }

    public Character getDlyCd() {
        return dlyCd;
    }

    public void setDlyCd(Character dlyCd) {
        this.dlyCd = dlyCd;
    }

    public BigDecimal getDnetprcgNr1DiscAmt() {
        return dnetprcgNr1DiscAmt;
    }

    public void setDnetprcgNr1DiscAmt(BigDecimal dnetprcgNr1DiscAmt) {
        this.dnetprcgNr1DiscAmt = dnetprcgNr1DiscAmt;
    }

    public BigDecimal getDnetprcgNr2DiscAmt() {
        return dnetprcgNr2DiscAmt;
    }

    public void setDnetprcgNr2DiscAmt(BigDecimal dnetprcgNr2DiscAmt) {
        this.dnetprcgNr2DiscAmt = dnetprcgNr2DiscAmt;
    }

    public BigDecimal getDnetprcgOthDiscAmt() {
        return dnetprcgOthDiscAmt;
    }

    public void setDnetprcgOthDiscAmt(BigDecimal dnetprcgOthDiscAmt) {
        this.dnetprcgOthDiscAmt = dnetprcgOthDiscAmt;
    }

    public BigDecimal getDnetprcgRefDiscAmt() {
        return dnetprcgRefDiscAmt;
    }

    public void setDnetprcgRefDiscAmt(BigDecimal dnetprcgRefDiscAmt) {
        this.dnetprcgRefDiscAmt = dnetprcgRefDiscAmt;
    }

    public BigDecimal getFuelUpAmt() {
        return fuelUpAmt;
    }

    public void setFuelUpAmt(BigDecimal fuelUpAmt) {
        this.fuelUpAmt = fuelUpAmt;
    }

    public BigDecimal getCanTaxCanDolAmt() {
        return canTaxCanDolAmt;
    }

    public void setCanTaxCanDolAmt(BigDecimal canTaxCanDolAmt) {
        this.canTaxCanDolAmt = canTaxCanDolAmt;
    }

    public BigDecimal getCanTaxUsDolAmt() {
        return canTaxUsDolAmt;
    }

    public void setCanTaxUsDolAmt(BigDecimal canTaxUsDolAmt) {
        this.canTaxUsDolAmt = canTaxUsDolAmt;
    }

    public String getOthFuelTyp() {
        return othFuelTyp;
    }

    public void setOthFuelTyp(String othFuelTyp) {
        this.othFuelTyp = othFuelTyp;
    }

    public Character getBatchUpdCd() {
        return batchUpdCd;
    }

    public void setBatchUpdCd(Character batchUpdCd) {
        this.batchUpdCd = batchUpdCd;
    }

    public BigDecimal getConvGetBackRate() {
        return convGetBackRate;
    }

    public void setConvGetBackRate(BigDecimal convGetBackRate) {
        this.convGetBackRate = convGetBackRate;
    }

    public String getTmpUnitNbr() {
        return tmpUnitNbr;
    }

    public void setTmpUnitNbr(String tmpUnitNbr) {
        this.tmpUnitNbr = tmpUnitNbr;
    }

    public Character getScAllianceCd() {
        return scAllianceCd;
    }

    public void setScAllianceCd(Character scAllianceCd) {
        this.scAllianceCd = scAllianceCd;
    }

    public String getScndyCardNbr() {
        return scndyCardNbr;
    }

    public void setScndyCardNbr(String scndyCardNbr) {
        this.scndyCardNbr = scndyCardNbr;
    }

    public Character getSelOrFocusDiscCd() {
        return selOrFocusDiscCd;
    }

    public void setSelOrFocusDiscCd(Character selOrFocusDiscCd) {
        this.selOrFocusDiscCd = selOrFocusDiscCd;
    }

    public BigDecimal getTrScInvoiceAmt() {
        return trScInvoiceAmt;
    }

    public void setTrScInvoiceAmt(BigDecimal trScInvoiceAmt) {
        this.trScInvoiceAmt = trScInvoiceAmt;
    }

    public BigDecimal getTrRebDiscAmt() {
        return trRebDiscAmt;
    }

    public void setTrRebDiscAmt(BigDecimal trRebDiscAmt) {
        this.trRebDiscAmt = trRebDiscAmt;
    }

    public BigDecimal getTrRdFuelRate() {
        return trRdFuelRate;
    }

    public void setTrRdFuelRate(BigDecimal trRdFuelRate) {
        this.trRdFuelRate = trRdFuelRate;
    }

    public BigDecimal getTrRdCashAdvanceRate() {
        return trRdCashAdvanceRate;
    }

    public void setTrRdCashAdvanceRate(BigDecimal trRdCashAdvanceRate) {
        this.trRdCashAdvanceRate = trRdCashAdvanceRate;
    }

    public BigDecimal getTrRdScSelectDiscAmt() {
        return trRdScSelectDiscAmt;
    }

    public void setTrRdScSelectDiscAmt(BigDecimal trRdScSelectDiscAmt) {
        this.trRdScSelectDiscAmt = trRdScSelectDiscAmt;
    }

    public BigDecimal getTrRdCompHndlgChgAmt() {
        return trRdCompHndlgChgAmt;
    }

    public void setTrRdCompHndlgChgAmt(BigDecimal trRdCompHndlgChgAmt) {
        this.trRdCompHndlgChgAmt = trRdCompHndlgChgAmt;
    }

    public BigDecimal getTrRdScTranFeeAmt() {
        return trRdScTranFeeAmt;
    }

    public void setTrRdScTranFeeAmt(BigDecimal trRdScTranFeeAmt) {
        this.trRdScTranFeeAmt = trRdScTranFeeAmt;
    }

    public BigDecimal getTrGdScRevAmt() {
        return trGdScRevAmt;
    }

    public void setTrGdScRevAmt(BigDecimal trGdScRevAmt) {
        this.trGdScRevAmt = trGdScRevAmt;
    }

    public BigDecimal getTrBrScFeeAmt() {
        return trBrScFeeAmt;
    }

    public void setTrBrScFeeAmt(BigDecimal trBrScFeeAmt) {
        this.trBrScFeeAmt = trBrScFeeAmt;
    }

    public BigDecimal getTrBrSrvcCntrFeeAmt() {
        return trBrSrvcCntrFeeAmt;
    }

    public void setTrBrSrvcCntrFeeAmt(BigDecimal trBrSrvcCntrFeeAmt) {
        this.trBrSrvcCntrFeeAmt = trBrSrvcCntrFeeAmt;
    }

    public BigDecimal getTrBrCustomerFeeAmt() {
        return trBrCustomerFeeAmt;
    }

    public void setTrBrCustomerFeeAmt(BigDecimal trBrCustomerFeeAmt) {
        this.trBrCustomerFeeAmt = trBrCustomerFeeAmt;
    }

    public BigDecimal getTrBrCashAddFeeAmt() {
        return trBrCashAddFeeAmt;
    }

    public void setTrBrCashAddFeeAmt(BigDecimal trBrCashAddFeeAmt) {
        this.trBrCashAddFeeAmt = trBrCashAddFeeAmt;
    }

    public BigDecimal getTrBrVoiceSurchgFeeAmt() {
        return trBrVoiceSurchgFeeAmt;
    }

    public void setTrBrVoiceSurchgFeeAmt(BigDecimal trBrVoiceSurchgFeeAmt) {
        this.trBrVoiceSurchgFeeAmt = trBrVoiceSurchgFeeAmt;
    }

    public BigDecimal getTrCustManualFeeAmt() {
        return trCustManualFeeAmt;
    }

    public void setTrCustManualFeeAmt(BigDecimal trCustManualFeeAmt) {
        this.trCustManualFeeAmt = trCustManualFeeAmt;
    }

    public BigDecimal getTrCostPlusAddOnAmt() {
        return trCostPlusAddOnAmt;
    }

    public void setTrCostPlusAddOnAmt(BigDecimal trCostPlusAddOnAmt) {
        this.trCostPlusAddOnAmt = trCostPlusAddOnAmt;
    }

    public BigDecimal getTrScSelectDiscAmt() {
        return trScSelectDiscAmt;
    }

    public void setTrScSelectDiscAmt(BigDecimal trScSelectDiscAmt) {
        this.trScSelectDiscAmt = trScSelectDiscAmt;
    }

    public BigDecimal getBcScInvoiceAmt() {
        return bcScInvoiceAmt;
    }

    public void setBcScInvoiceAmt(BigDecimal bcScInvoiceAmt) {
        this.bcScInvoiceAmt = bcScInvoiceAmt;
    }

    public BigDecimal getBcRebDiscAmt() {
        return bcRebDiscAmt;
    }

    public void setBcRebDiscAmt(BigDecimal bcRebDiscAmt) {
        this.bcRebDiscAmt = bcRebDiscAmt;
    }

    public BigDecimal getBcRdFuelRate() {
        return bcRdFuelRate;
    }

    public void setBcRdFuelRate(BigDecimal bcRdFuelRate) {
        this.bcRdFuelRate = bcRdFuelRate;
    }

    public BigDecimal getBcRdCashAdvanceRate() {
        return bcRdCashAdvanceRate;
    }

    public void setBcRdCashAdvanceRate(BigDecimal bcRdCashAdvanceRate) {
        this.bcRdCashAdvanceRate = bcRdCashAdvanceRate;
    }

    public BigDecimal getBcRdScSelectDiscAmt() {
        return bcRdScSelectDiscAmt;
    }

    public void setBcRdScSelectDiscAmt(BigDecimal bcRdScSelectDiscAmt) {
        this.bcRdScSelectDiscAmt = bcRdScSelectDiscAmt;
    }

    public BigDecimal getBcRdCompHndlgChgAmt() {
        return bcRdCompHndlgChgAmt;
    }

    public void setBcRdCompHndlgChgAmt(BigDecimal bcRdCompHndlgChgAmt) {
        this.bcRdCompHndlgChgAmt = bcRdCompHndlgChgAmt;
    }

    public BigDecimal getBcRdScTranFeeAmt() {
        return bcRdScTranFeeAmt;
    }

    public void setBcRdScTranFeeAmt(BigDecimal bcRdScTranFeeAmt) {
        this.bcRdScTranFeeAmt = bcRdScTranFeeAmt;
    }

    public BigDecimal getBcGdScRevAmt() {
        return bcGdScRevAmt;
    }

    public void setBcGdScRevAmt(BigDecimal bcGdScRevAmt) {
        this.bcGdScRevAmt = bcGdScRevAmt;
    }

    public BigDecimal getBcBrScFeeAmt() {
        return bcBrScFeeAmt;
    }

    public void setBcBrScFeeAmt(BigDecimal bcBrScFeeAmt) {
        this.bcBrScFeeAmt = bcBrScFeeAmt;
    }

    public BigDecimal getBcBrSrvcCntrFeeAmt() {
        return bcBrSrvcCntrFeeAmt;
    }

    public void setBcBrSrvcCntrFeeAmt(BigDecimal bcBrSrvcCntrFeeAmt) {
        this.bcBrSrvcCntrFeeAmt = bcBrSrvcCntrFeeAmt;
    }

    public BigDecimal getBcBrCustomerFeeAmt() {
        return bcBrCustomerFeeAmt;
    }

    public void setBcBrCustomerFeeAmt(BigDecimal bcBrCustomerFeeAmt) {
        this.bcBrCustomerFeeAmt = bcBrCustomerFeeAmt;
    }

    public BigDecimal getBcBrCashAddFeeAmt() {
        return bcBrCashAddFeeAmt;
    }

    public void setBcBrCashAddFeeAmt(BigDecimal bcBrCashAddFeeAmt) {
        this.bcBrCashAddFeeAmt = bcBrCashAddFeeAmt;
    }

    public BigDecimal getBcBrVoiceSurchgFeeAmt() {
        return bcBrVoiceSurchgFeeAmt;
    }

    public void setBcBrVoiceSurchgFeeAmt(BigDecimal bcBrVoiceSurchgFeeAmt) {
        this.bcBrVoiceSurchgFeeAmt = bcBrVoiceSurchgFeeAmt;
    }

    public BigDecimal getBcCustManualFeeAmt() {
        return bcCustManualFeeAmt;
    }

    public void setBcCustManualFeeAmt(BigDecimal bcCustManualFeeAmt) {
        this.bcCustManualFeeAmt = bcCustManualFeeAmt;
    }

    public BigDecimal getBcCostPlusAddOnAmt() {
        return bcCostPlusAddOnAmt;
    }

    public void setBcCostPlusAddOnAmt(BigDecimal bcCostPlusAddOnAmt) {
        this.bcCostPlusAddOnAmt = bcCostPlusAddOnAmt;
    }

    public BigDecimal getBcScSelectDiscAmt() {
        return bcScSelectDiscAmt;
    }

    public void setBcScSelectDiscAmt(BigDecimal bcScSelectDiscAmt) {
        this.bcScSelectDiscAmt = bcScSelectDiscAmt;
    }

    public BigDecimal getBcTaxAmt() {
        return bcTaxAmt;
    }

    public void setBcTaxAmt(BigDecimal bcTaxAmt) {
        this.bcTaxAmt = bcTaxAmt;
    }

    public BigDecimal getScScInvoiceAmt() {
        return scScInvoiceAmt;
    }

    public void setScScInvoiceAmt(BigDecimal scScInvoiceAmt) {
        this.scScInvoiceAmt = scScInvoiceAmt;
    }

    public BigDecimal getScRebDiscAmt() {
        return scRebDiscAmt;
    }

    public void setScRebDiscAmt(BigDecimal scRebDiscAmt) {
        this.scRebDiscAmt = scRebDiscAmt;
    }

    public BigDecimal getScRdFuelRate() {
        return scRdFuelRate;
    }

    public void setScRdFuelRate(BigDecimal scRdFuelRate) {
        this.scRdFuelRate = scRdFuelRate;
    }

    public BigDecimal getScRdCashAdvanceRate() {
        return scRdCashAdvanceRate;
    }

    public void setScRdCashAdvanceRate(BigDecimal scRdCashAdvanceRate) {
        this.scRdCashAdvanceRate = scRdCashAdvanceRate;
    }

    public BigDecimal getScRdScSelectDiscAmt() {
        return scRdScSelectDiscAmt;
    }

    public void setScRdScSelectDiscAmt(BigDecimal scRdScSelectDiscAmt) {
        this.scRdScSelectDiscAmt = scRdScSelectDiscAmt;
    }

    public BigDecimal getScRdCompHndlgChgAmt() {
        return scRdCompHndlgChgAmt;
    }

    public void setScRdCompHndlgChgAmt(BigDecimal scRdCompHndlgChgAmt) {
        this.scRdCompHndlgChgAmt = scRdCompHndlgChgAmt;
    }

    public BigDecimal getScRdScTranFeeAmt() {
        return scRdScTranFeeAmt;
    }

    public void setScRdScTranFeeAmt(BigDecimal scRdScTranFeeAmt) {
        this.scRdScTranFeeAmt = scRdScTranFeeAmt;
    }

    public BigDecimal getScGdScRevAmt() {
        return scGdScRevAmt;
    }

    public void setScGdScRevAmt(BigDecimal scGdScRevAmt) {
        this.scGdScRevAmt = scGdScRevAmt;
    }

    public BigDecimal getScBrScFeeAmt() {
        return scBrScFeeAmt;
    }

    public void setScBrScFeeAmt(BigDecimal scBrScFeeAmt) {
        this.scBrScFeeAmt = scBrScFeeAmt;
    }

    public BigDecimal getScBrSrvcCntrFeeAmt() {
        return scBrSrvcCntrFeeAmt;
    }

    public void setScBrSrvcCntrFeeAmt(BigDecimal scBrSrvcCntrFeeAmt) {
        this.scBrSrvcCntrFeeAmt = scBrSrvcCntrFeeAmt;
    }

    public BigDecimal getScBrCustomerFeeAmt() {
        return scBrCustomerFeeAmt;
    }

    public void setScBrCustomerFeeAmt(BigDecimal scBrCustomerFeeAmt) {
        this.scBrCustomerFeeAmt = scBrCustomerFeeAmt;
    }

    public BigDecimal getScBrCashAddFeeAmt() {
        return scBrCashAddFeeAmt;
    }

    public void setScBrCashAddFeeAmt(BigDecimal scBrCashAddFeeAmt) {
        this.scBrCashAddFeeAmt = scBrCashAddFeeAmt;
    }

    public BigDecimal getScBrVoiceSurchgFeeAmt() {
        return scBrVoiceSurchgFeeAmt;
    }

    public void setScBrVoiceSurchgFeeAmt(BigDecimal scBrVoiceSurchgFeeAmt) {
        this.scBrVoiceSurchgFeeAmt = scBrVoiceSurchgFeeAmt;
    }

    public BigDecimal getScCustManualFeeAmt() {
        return scCustManualFeeAmt;
    }

    public void setScCustManualFeeAmt(BigDecimal scCustManualFeeAmt) {
        this.scCustManualFeeAmt = scCustManualFeeAmt;
    }

    public BigDecimal getScCostPlusAddOnAmt() {
        return scCostPlusAddOnAmt;
    }

    public void setScCostPlusAddOnAmt(BigDecimal scCostPlusAddOnAmt) {
        this.scCostPlusAddOnAmt = scCostPlusAddOnAmt;
    }

    public BigDecimal getScScSelectDiscAmt() {
        return scScSelectDiscAmt;
    }

    public void setScScSelectDiscAmt(BigDecimal scScSelectDiscAmt) {
        this.scScSelectDiscAmt = scScSelectDiscAmt;
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

    public String getPosSendData() {
        return posSendData;
    }

    public void setPosSendData(String posSendData) {
        this.posSendData = posSendData;
    }

    public int getTrackingNbr() {
        return trackingNbr;
    }

    public void setTrackingNbr(int trackingNbr) {
        this.trackingNbr = trackingNbr;
    }

    public String getItpuSystemId() {
        return itpuSystemId;
    }

    public void setItpuSystemId(String itpuSystemId) {
        this.itpuSystemId = itpuSystemId;
    }

    public String getItpuReportNbr() {
        return itpuReportNbr;
    }

    public void setItpuReportNbr(String itpuReportNbr) {
        this.itpuReportNbr = itpuReportNbr;
    }

    public String getItpuDeviceTyp() {
        return itpuDeviceTyp;
    }

    public void setItpuDeviceTyp(String itpuDeviceTyp) {
        this.itpuDeviceTyp = itpuDeviceTyp;
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
        hash += (xtnTs != null ? xtnTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrpPstdTxn)) {
            return false;
        }
        PrpPstdTxn other = (PrpPstdTxn) object;
        if ((this.xtnTs == null && other.xtnTs != null) || (this.xtnTs != null && !this.xtnTs.equals(other.xtnTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrpPstdTxn[ xtnTs=" + xtnTs + " ]";
    }
    
}
