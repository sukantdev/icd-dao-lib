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
@Table(name = "CUST_COST_PLUS", catalog = "", schema = "DBO")
public class CustCostPlus implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustCostPlusPK custCostPlusPK;
    @Basic(optional = false)
    @Column(name = "CUST_ACCT")
    private String custAcct;
    @Basic(optional = false)
    @Column(name = "CUST_NAME")
    private String custName;
    @Basic(optional = false)
    @Column(name = "CUST_CNTRY_CD")
    private String custCntryCd;
    @Basic(optional = false)
    @Column(name = "CURR_TYP")
    private Character currTyp;
    @Basic(optional = false)
    @Column(name = "CUST_CITY")
    private String custCity;
    @Basic(optional = false)
    @Column(name = "CUST_ST")
    private String custSt;
    @Basic(optional = false)
    @Column(name = "LOC_NAME")
    private String locName;
    @Basic(optional = false)
    @Column(name = "LOC_CNTRY_CD")
    private String locCntryCd;
    @Basic(optional = false)
    @Column(name = "LOC_CITY")
    private String locCity;
    @Basic(optional = false)
    @Column(name = "LOC_ST")
    private String locSt;
    @Basic(optional = false)
    @Column(name = "COST_PLUS_ACTV_FLAG")
    private Character costPlusActvFlag;
    @Basic(optional = false)
    @Column(name = "COST_PLUS_DFLT_FLAG")
    private Character costPlusDfltFlag;
    @Basic(optional = false)
    @Column(name = "RACK_TYP")
    private Character rackTyp;
    @Basic(optional = false)
    @Column(name = "RACK_TYP_ORIGIN")
    private Character rackTypOrigin;
    @Basic(optional = false)
    @Column(name = "RACK_CTY_NBR")
    private String rackCtyNbr;
    @Basic(optional = false)
    @Column(name = "RACK_CTY_NAME")
    private String rackCtyName;
    @Basic(optional = false)
    @Column(name = "RACK_ST")
    private String rackSt;
    @Basic(optional = false)
    @Column(name = "RACK_SPPLR_NBR")
    private String rackSpplrNbr;
    @Basic(optional = false)
    @Column(name = "RACK_SPPLR_NAME")
    private String rackSpplrName;
    @Basic(optional = false)
    @Column(name = "RACK_TS_MARKUP_FLG")
    private Character rackTsMarkupFlg;

    @Basic(optional = false)
    @Column(name = "RACK_TS_MARKUP")
    private BigDecimal rackTsMarkup;
    @Basic(optional = false)
    @Column(name = "RACK_CDN_MARKUP")
    private BigDecimal rackCdnMarkup;
    @Basic(optional = false)
    @Column(name = "RACK_FIRST_PPG")
    private BigDecimal rackFirstPpg;
    @Basic(optional = false)
    @Column(name = "RACK_NBR2_PPG")
    private BigDecimal rackNbr2Ppg;
    @Basic(optional = false)
    @Column(name = "COST_NBR2_PPG")
    private BigDecimal costNbr2Ppg;
    @Basic(optional = false)
    @Column(name = "CASH_NBR2_PPG")
    private BigDecimal cashNbr2Ppg;
    @Basic(optional = false)
    @Column(name = "RACK_NBR2_CUR_PPG")
    private BigDecimal rackNbr2CurPpg;
    @Basic(optional = false)
    @Column(name = "RACK_NBR1_CUR_PPG")
    private BigDecimal rackNbr1CurPpg;
    @Basic(optional = false)
    @Column(name = "RACK_LST_UPD_DT")
    @Temporal(TemporalType.DATE)
    private Date rackLstUpdDt;
    @Basic(optional = false)
    @Column(name = "FED_TAX_TRACTOR_PPG")
    private BigDecimal fedTaxTractorPpg;
    @Basic(optional = false)
    @Column(name = "FED_TAX_REEFER_PPG")
    private BigDecimal fedTaxReeferPpg;
    @Basic(optional = false)
    @Column(name = "ST_FUEL_TAX_TRACTOR_RT")
    private BigDecimal stFuelTaxTractorRt;
    @Basic(optional = false)
    @Column(name = "ST_FUEL_TAX_REEFER_RT")
    private BigDecimal stFuelTaxReeferRt;
    @Basic(optional = false)
    @Column(name = "ST_SUPERFUND_TRACTOR_PPG")
    private BigDecimal stSuperfundTractorPpg;
    @Basic(optional = false)
    @Column(name = "ST_SUPERFUND_REEFER_PPG")
    private BigDecimal stSuperfundReeferPpg;
    @Basic(optional = false)
    @Column(name = "LUST_TAX_TRACTOR_PPG")
    private BigDecimal lustTaxTractorPpg;
    @Basic(optional = false)
    @Column(name = "LUST_TAX_REEFER_PPG")
    private BigDecimal lustTaxReeferPpg;
    @Basic(optional = false)
    @Column(name = "RACK_NBR1_PPG")
    private BigDecimal rackNbr1Ppg;
    @Basic(optional = false)
    @Column(name = "COST_NBR1_PPG")
    private BigDecimal costNbr1Ppg;
    @Basic(optional = false)
    @Column(name = "CASH_NBR1_PPG")
    private BigDecimal cashNbr1Ppg;
    @Basic(optional = false)
    @Column(name = "TRANS_TAX_TRACTOR_PPG")
    private BigDecimal transTaxTractorPpg;
    @Basic(optional = false)
    @Column(name = "TRANS_TAX_REEFER_PPG")
    private BigDecimal transTaxReeferPpg;
    @Basic(optional = false)
    @Column(name = "RACK_REEFER_PPG")
    private BigDecimal rackReeferPpg;
    @Basic(optional = false)
    @Column(name = "COST_REEFER_PPG")
    private BigDecimal costReeferPpg;
    @Basic(optional = false)
    @Column(name = "CASH_REEFER_PPG")
    private BigDecimal cashReeferPpg;
    @Basic(optional = false)
    @Column(name = "MISC_TAX_TRACTOR_PPG")
    private BigDecimal miscTaxTractorPpg;
    @Basic(optional = false)
    @Column(name = "MISC_TAX_REEFER_PPG")
    private BigDecimal miscTaxReeferPpg;
    @Basic(optional = false)
    @Column(name = "SALES_TAX_TRACTOR_RT")
    private BigDecimal salesTaxTractorRt;
    @Basic(optional = false)
    @Column(name = "SALES_TAX_REEFER_RT")
    private BigDecimal salesTaxReeferRt;
    @Basic(optional = false)
    @Column(name = "NET_REBATE_FLAG")
    private Character netRebateFlag;
    @Basic(optional = false)
    @Column(name = "NET_REBATE_REMAINDER_FLAG")
    private Character netRebateRemainderFlag;
    @Basic(optional = false)
    @Column(name = "CUSTOM_ST_TAX_RATE_FLAG")
    private Character customStTaxRateFlag;
    @Basic(optional = false)
    @Column(name = "RATE_CPG_NR2D_AMT")
    private BigDecimal rateCpgNr2dAmt;
    @Basic(optional = false)
    @Column(name = "RATE_CPG_REEFER_AMT")
    private BigDecimal rateCpgReeferAmt;
    @Basic(optional = false)
    @Column(name = "MAX_ALLOWED_PRICE_CD")
    private Character maxAllowedPriceCd;
    @Basic(optional = false)
    @Column(name = "MAX_NR2_PRICE_AMT")
    private BigDecimal maxNr2PriceAmt;
    @Basic(optional = false)
    @Column(name = "RACK_PRICE_DIESEL_FLG")
    private Character rackPriceDieselFlg;
    @Basic(optional = false)
    @Column(name = "RACK_PRICE_REEFER_FLG")
    private Character rackPriceReeferFlg;
    @Basic(optional = false)
    @Column(name = "FED_TAX_DIESEL_FLG")
    private Character fedTaxDieselFlg;
    @Basic(optional = false)
    @Column(name = "FED_TAX_REEFER_FLG")
    private Character fedTaxReeferFlg;
    @Basic(optional = false)
    @Column(name = "ST_TAX_DIESEL_FLG")
    private Character stTaxDieselFlg;
    @Basic(optional = false)
    @Column(name = "ST_TAX_REEFER_FLG")
    private Character stTaxReeferFlg;
    @Basic(optional = false)
    @Column(name = "ST_SUPFUND_DIESEL_FLG")
    private Character stSupfundDieselFlg;
    @Basic(optional = false)
    @Column(name = "ST_SUPFUND_REEFER_FLG")
    private Character stSupfundReeferFlg;
    @Basic(optional = false)
    @Column(name = "LUST_TAX_DIESEL_FLG")
    private Character lustTaxDieselFlg;
    @Basic(optional = false)
    @Column(name = "LUST_TAX_REEFER_FLG")
    private Character lustTaxReeferFlg;
    @Basic(optional = false)
    @Column(name = "TRANS_DIESEL_FLG")
    private Character transDieselFlg;
    @Basic(optional = false)
    @Column(name = "TRANS_REEFER_FLG")
    private Character transReeferFlg;
    @Basic(optional = false)
    @Column(name = "MISC_DIESEL_FLG")
    private Character miscDieselFlg;
    @Basic(optional = false)
    @Column(name = "MISC_REEFER_FLG")
    private Character miscReeferFlg;
    @Basic(optional = false)
    @Column(name = "MARKUP_DIESEL_FLG")
    private Character markupDieselFlg;
    @Basic(optional = false)
    @Column(name = "MARKUP_REEFER_FLG")
    private Character markupReeferFlg;
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
    @Column(name = "SALES_TAX_TRACTOR_CPG")
    private BigDecimal salesTaxTractorCpg;
    @Basic(optional = false)
    @Column(name = "SALES_TAX_REEFER_CPG")
    private BigDecimal salesTaxReeferCpg;

    public CustCostPlus() {
    }

    public CustCostPlus(CustCostPlusPK custCostPlusPK) {
        this.custCostPlusPK = custCostPlusPK;
    }

    public CustCostPlus(CustCostPlusPK custCostPlusPK, String custAcct, String custName, String custCntryCd, Character currTyp, String custCity, String custSt, String locName, String locCntryCd, String locCity, String locSt, Character costPlusActvFlag, Character costPlusDfltFlag, Character rackTyp, Character rackTypOrigin, String rackCtyNbr, String rackCtyName, String rackSt, String rackSpplrNbr, String rackSpplrName, Character rackTsMarkupFlg, BigDecimal rackTsMarkup, BigDecimal rackCdnMarkup, BigDecimal rackFirstPpg, BigDecimal rackNbr2Ppg, BigDecimal costNbr2Ppg, BigDecimal cashNbr2Ppg, BigDecimal rackNbr2CurPpg, BigDecimal rackNbr1CurPpg, Date rackLstUpdDt, BigDecimal fedTaxTractorPpg, BigDecimal fedTaxReeferPpg, BigDecimal stFuelTaxTractorRt, BigDecimal stFuelTaxReeferRt, BigDecimal stSuperfundTractorPpg, BigDecimal stSuperfundReeferPpg, BigDecimal lustTaxTractorPpg, BigDecimal lustTaxReeferPpg, BigDecimal rackNbr1Ppg, BigDecimal costNbr1Ppg, BigDecimal cashNbr1Ppg, BigDecimal transTaxTractorPpg, BigDecimal transTaxReeferPpg, BigDecimal rackReeferPpg, BigDecimal costReeferPpg, BigDecimal cashReeferPpg, BigDecimal miscTaxTractorPpg, BigDecimal miscTaxReeferPpg, BigDecimal salesTaxTractorRt, BigDecimal salesTaxReeferRt, Character netRebateFlag, Character netRebateRemainderFlag, Character customStTaxRateFlag, BigDecimal rateCpgNr2dAmt, BigDecimal rateCpgReeferAmt, Character maxAllowedPriceCd, BigDecimal maxNr2PriceAmt, Character rackPriceDieselFlg, Character rackPriceReeferFlg, Character fedTaxDieselFlg, Character fedTaxReeferFlg, Character stTaxDieselFlg, Character stTaxReeferFlg, Character stSupfundDieselFlg, Character stSupfundReeferFlg, Character lustTaxDieselFlg, Character lustTaxReeferFlg, Character transDieselFlg, Character transReeferFlg, Character miscDieselFlg, Character miscReeferFlg, Character markupDieselFlg, Character markupReeferFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, BigDecimal salesTaxTractorCpg, BigDecimal salesTaxReeferCpg) {
        this.custCostPlusPK = custCostPlusPK;
        this.custAcct = custAcct;
        this.custName = custName;
        this.custCntryCd = custCntryCd;
        this.currTyp = currTyp;
        this.custCity = custCity;
        this.custSt = custSt;
        this.locName = locName;
        this.locCntryCd = locCntryCd;
        this.locCity = locCity;
        this.locSt = locSt;
        this.costPlusActvFlag = costPlusActvFlag;
        this.costPlusDfltFlag = costPlusDfltFlag;
        this.rackTyp = rackTyp;
        this.rackTypOrigin = rackTypOrigin;
        this.rackCtyNbr = rackCtyNbr;
        this.rackCtyName = rackCtyName;
        this.rackSt = rackSt;
        this.rackSpplrNbr = rackSpplrNbr;
        this.rackSpplrName = rackSpplrName;
        this.rackTsMarkupFlg = rackTsMarkupFlg;
        this.rackTsMarkup = rackTsMarkup;
        this.rackCdnMarkup = rackCdnMarkup;
        this.rackFirstPpg = rackFirstPpg;
        this.rackNbr2Ppg = rackNbr2Ppg;
        this.costNbr2Ppg = costNbr2Ppg;
        this.cashNbr2Ppg = cashNbr2Ppg;
        this.rackNbr2CurPpg = rackNbr2CurPpg;
        this.rackNbr1CurPpg = rackNbr1CurPpg;
        this.rackLstUpdDt = rackLstUpdDt;
        this.fedTaxTractorPpg = fedTaxTractorPpg;
        this.fedTaxReeferPpg = fedTaxReeferPpg;
        this.stFuelTaxTractorRt = stFuelTaxTractorRt;
        this.stFuelTaxReeferRt = stFuelTaxReeferRt;
        this.stSuperfundTractorPpg = stSuperfundTractorPpg;
        this.stSuperfundReeferPpg = stSuperfundReeferPpg;
        this.lustTaxTractorPpg = lustTaxTractorPpg;
        this.lustTaxReeferPpg = lustTaxReeferPpg;
        this.rackNbr1Ppg = rackNbr1Ppg;
        this.costNbr1Ppg = costNbr1Ppg;
        this.cashNbr1Ppg = cashNbr1Ppg;
        this.transTaxTractorPpg = transTaxTractorPpg;
        this.transTaxReeferPpg = transTaxReeferPpg;
        this.rackReeferPpg = rackReeferPpg;
        this.costReeferPpg = costReeferPpg;
        this.cashReeferPpg = cashReeferPpg;
        this.miscTaxTractorPpg = miscTaxTractorPpg;
        this.miscTaxReeferPpg = miscTaxReeferPpg;
        this.salesTaxTractorRt = salesTaxTractorRt;
        this.salesTaxReeferRt = salesTaxReeferRt;
        this.netRebateFlag = netRebateFlag;
        this.netRebateRemainderFlag = netRebateRemainderFlag;
        this.customStTaxRateFlag = customStTaxRateFlag;
        this.rateCpgNr2dAmt = rateCpgNr2dAmt;
        this.rateCpgReeferAmt = rateCpgReeferAmt;
        this.maxAllowedPriceCd = maxAllowedPriceCd;
        this.maxNr2PriceAmt = maxNr2PriceAmt;
        this.rackPriceDieselFlg = rackPriceDieselFlg;
        this.rackPriceReeferFlg = rackPriceReeferFlg;
        this.fedTaxDieselFlg = fedTaxDieselFlg;
        this.fedTaxReeferFlg = fedTaxReeferFlg;
        this.stTaxDieselFlg = stTaxDieselFlg;
        this.stTaxReeferFlg = stTaxReeferFlg;
        this.stSupfundDieselFlg = stSupfundDieselFlg;
        this.stSupfundReeferFlg = stSupfundReeferFlg;
        this.lustTaxDieselFlg = lustTaxDieselFlg;
        this.lustTaxReeferFlg = lustTaxReeferFlg;
        this.transDieselFlg = transDieselFlg;
        this.transReeferFlg = transReeferFlg;
        this.miscDieselFlg = miscDieselFlg;
        this.miscReeferFlg = miscReeferFlg;
        this.markupDieselFlg = markupDieselFlg;
        this.markupReeferFlg = markupReeferFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.salesTaxTractorCpg = salesTaxTractorCpg;
        this.salesTaxReeferCpg = salesTaxReeferCpg;
    }

    public CustCostPlus(String custTyp, String custId, String locTyp, String locCd, String custPrd, Date custEffctvTs, String custPrdGrp, Character directbillFundedFlg, Character custSrc) {
        this.custCostPlusPK = new CustCostPlusPK(custTyp, custId, locTyp, locCd, custPrd, custEffctvTs, custPrdGrp, directbillFundedFlg, custSrc);
    }

    public CustCostPlusPK getCustCostPlusPK() {
        return custCostPlusPK;
    }

    public void setCustCostPlusPK(CustCostPlusPK custCostPlusPK) {
        this.custCostPlusPK = custCostPlusPK;
    }

    public String getCustAcct() {
        return custAcct;
    }

    public void setCustAcct(String custAcct) {
        this.custAcct = custAcct;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustCntryCd() {
        return custCntryCd;
    }

    public void setCustCntryCd(String custCntryCd) {
        this.custCntryCd = custCntryCd;
    }

    public Character getCurrTyp() {
        return currTyp;
    }

    public void setCurrTyp(Character currTyp) {
        this.currTyp = currTyp;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getCustSt() {
        return custSt;
    }

    public void setCustSt(String custSt) {
        this.custSt = custSt;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public String getLocCntryCd() {
        return locCntryCd;
    }

    public void setLocCntryCd(String locCntryCd) {
        this.locCntryCd = locCntryCd;
    }

    public String getLocCity() {
        return locCity;
    }

    public void setLocCity(String locCity) {
        this.locCity = locCity;
    }

    public String getLocSt() {
        return locSt;
    }

    public void setLocSt(String locSt) {
        this.locSt = locSt;
    }

    public Character getCostPlusActvFlag() {
        return costPlusActvFlag;
    }

    public void setCostPlusActvFlag(Character costPlusActvFlag) {
        this.costPlusActvFlag = costPlusActvFlag;
    }

    public Character getCostPlusDfltFlag() {
        return costPlusDfltFlag;
    }

    public void setCostPlusDfltFlag(Character costPlusDfltFlag) {
        this.costPlusDfltFlag = costPlusDfltFlag;
    }

    public Character getRackTyp() {
        return rackTyp;
    }

    public void setRackTyp(Character rackTyp) {
        this.rackTyp = rackTyp;
    }

    public Character getRackTypOrigin() {
        return rackTypOrigin;
    }

    public void setRackTypOrigin(Character rackTypOrigin) {
        this.rackTypOrigin = rackTypOrigin;
    }

    public String getRackCtyNbr() {
        return rackCtyNbr;
    }

    public void setRackCtyNbr(String rackCtyNbr) {
        this.rackCtyNbr = rackCtyNbr;
    }

    public String getRackCtyName() {
        return rackCtyName;
    }

    public void setRackCtyName(String rackCtyName) {
        this.rackCtyName = rackCtyName;
    }

    public String getRackSt() {
        return rackSt;
    }

    public void setRackSt(String rackSt) {
        this.rackSt = rackSt;
    }

    public String getRackSpplrNbr() {
        return rackSpplrNbr;
    }

    public void setRackSpplrNbr(String rackSpplrNbr) {
        this.rackSpplrNbr = rackSpplrNbr;
    }

    public String getRackSpplrName() {
        return rackSpplrName;
    }

    public void setRackSpplrName(String rackSpplrName) {
        this.rackSpplrName = rackSpplrName;
    }

    public Character getRackTsMarkupFlg() {
        return rackTsMarkupFlg;
    }

    public void setRackTsMarkupFlg(Character rackTsMarkupFlg) {
        this.rackTsMarkupFlg = rackTsMarkupFlg;
    }

    public BigDecimal getRackTsMarkup() {
        return rackTsMarkup;
    }

    public void setRackTsMarkup(BigDecimal rackTsMarkup) {
        this.rackTsMarkup = rackTsMarkup;
    }

    public BigDecimal getRackCdnMarkup() {
        return rackCdnMarkup;
    }

    public void setRackCdnMarkup(BigDecimal rackCdnMarkup) {
        this.rackCdnMarkup = rackCdnMarkup;
    }

    public BigDecimal getRackFirstPpg() {
        return rackFirstPpg;
    }

    public void setRackFirstPpg(BigDecimal rackFirstPpg) {
        this.rackFirstPpg = rackFirstPpg;
    }

    public BigDecimal getRackNbr2Ppg() {
        return rackNbr2Ppg;
    }

    public void setRackNbr2Ppg(BigDecimal rackNbr2Ppg) {
        this.rackNbr2Ppg = rackNbr2Ppg;
    }

    public BigDecimal getCostNbr2Ppg() {
        return costNbr2Ppg;
    }

    public void setCostNbr2Ppg(BigDecimal costNbr2Ppg) {
        this.costNbr2Ppg = costNbr2Ppg;
    }

    public BigDecimal getCashNbr2Ppg() {
        return cashNbr2Ppg;
    }

    public void setCashNbr2Ppg(BigDecimal cashNbr2Ppg) {
        this.cashNbr2Ppg = cashNbr2Ppg;
    }

    public BigDecimal getRackNbr2CurPpg() {
        return rackNbr2CurPpg;
    }

    public void setRackNbr2CurPpg(BigDecimal rackNbr2CurPpg) {
        this.rackNbr2CurPpg = rackNbr2CurPpg;
    }

    public BigDecimal getRackNbr1CurPpg() {
        return rackNbr1CurPpg;
    }

    public void setRackNbr1CurPpg(BigDecimal rackNbr1CurPpg) {
        this.rackNbr1CurPpg = rackNbr1CurPpg;
    }

    public Date getRackLstUpdDt() {
        return rackLstUpdDt;
    }

    public void setRackLstUpdDt(Date rackLstUpdDt) {
        this.rackLstUpdDt = rackLstUpdDt;
    }

    public BigDecimal getFedTaxTractorPpg() {
        return fedTaxTractorPpg;
    }

    public void setFedTaxTractorPpg(BigDecimal fedTaxTractorPpg) {
        this.fedTaxTractorPpg = fedTaxTractorPpg;
    }

    public BigDecimal getFedTaxReeferPpg() {
        return fedTaxReeferPpg;
    }

    public void setFedTaxReeferPpg(BigDecimal fedTaxReeferPpg) {
        this.fedTaxReeferPpg = fedTaxReeferPpg;
    }

    public BigDecimal getStFuelTaxTractorRt() {
        return stFuelTaxTractorRt;
    }

    public void setStFuelTaxTractorRt(BigDecimal stFuelTaxTractorRt) {
        this.stFuelTaxTractorRt = stFuelTaxTractorRt;
    }

    public BigDecimal getStFuelTaxReeferRt() {
        return stFuelTaxReeferRt;
    }

    public void setStFuelTaxReeferRt(BigDecimal stFuelTaxReeferRt) {
        this.stFuelTaxReeferRt = stFuelTaxReeferRt;
    }

    public BigDecimal getStSuperfundTractorPpg() {
        return stSuperfundTractorPpg;
    }

    public void setStSuperfundTractorPpg(BigDecimal stSuperfundTractorPpg) {
        this.stSuperfundTractorPpg = stSuperfundTractorPpg;
    }

    public BigDecimal getStSuperfundReeferPpg() {
        return stSuperfundReeferPpg;
    }

    public void setStSuperfundReeferPpg(BigDecimal stSuperfundReeferPpg) {
        this.stSuperfundReeferPpg = stSuperfundReeferPpg;
    }

    public BigDecimal getLustTaxTractorPpg() {
        return lustTaxTractorPpg;
    }

    public void setLustTaxTractorPpg(BigDecimal lustTaxTractorPpg) {
        this.lustTaxTractorPpg = lustTaxTractorPpg;
    }

    public BigDecimal getLustTaxReeferPpg() {
        return lustTaxReeferPpg;
    }

    public void setLustTaxReeferPpg(BigDecimal lustTaxReeferPpg) {
        this.lustTaxReeferPpg = lustTaxReeferPpg;
    }

    public BigDecimal getRackNbr1Ppg() {
        return rackNbr1Ppg;
    }

    public void setRackNbr1Ppg(BigDecimal rackNbr1Ppg) {
        this.rackNbr1Ppg = rackNbr1Ppg;
    }

    public BigDecimal getCostNbr1Ppg() {
        return costNbr1Ppg;
    }

    public void setCostNbr1Ppg(BigDecimal costNbr1Ppg) {
        this.costNbr1Ppg = costNbr1Ppg;
    }

    public BigDecimal getCashNbr1Ppg() {
        return cashNbr1Ppg;
    }

    public void setCashNbr1Ppg(BigDecimal cashNbr1Ppg) {
        this.cashNbr1Ppg = cashNbr1Ppg;
    }

    public BigDecimal getTransTaxTractorPpg() {
        return transTaxTractorPpg;
    }

    public void setTransTaxTractorPpg(BigDecimal transTaxTractorPpg) {
        this.transTaxTractorPpg = transTaxTractorPpg;
    }

    public BigDecimal getTransTaxReeferPpg() {
        return transTaxReeferPpg;
    }

    public void setTransTaxReeferPpg(BigDecimal transTaxReeferPpg) {
        this.transTaxReeferPpg = transTaxReeferPpg;
    }

    public BigDecimal getRackReeferPpg() {
        return rackReeferPpg;
    }

    public void setRackReeferPpg(BigDecimal rackReeferPpg) {
        this.rackReeferPpg = rackReeferPpg;
    }

    public BigDecimal getCostReeferPpg() {
        return costReeferPpg;
    }

    public void setCostReeferPpg(BigDecimal costReeferPpg) {
        this.costReeferPpg = costReeferPpg;
    }

    public BigDecimal getCashReeferPpg() {
        return cashReeferPpg;
    }

    public void setCashReeferPpg(BigDecimal cashReeferPpg) {
        this.cashReeferPpg = cashReeferPpg;
    }

    public BigDecimal getMiscTaxTractorPpg() {
        return miscTaxTractorPpg;
    }

    public void setMiscTaxTractorPpg(BigDecimal miscTaxTractorPpg) {
        this.miscTaxTractorPpg = miscTaxTractorPpg;
    }

    public BigDecimal getMiscTaxReeferPpg() {
        return miscTaxReeferPpg;
    }

    public void setMiscTaxReeferPpg(BigDecimal miscTaxReeferPpg) {
        this.miscTaxReeferPpg = miscTaxReeferPpg;
    }

    public BigDecimal getSalesTaxTractorRt() {
        return salesTaxTractorRt;
    }

    public void setSalesTaxTractorRt(BigDecimal salesTaxTractorRt) {
        this.salesTaxTractorRt = salesTaxTractorRt;
    }

    public BigDecimal getSalesTaxReeferRt() {
        return salesTaxReeferRt;
    }

    public void setSalesTaxReeferRt(BigDecimal salesTaxReeferRt) {
        this.salesTaxReeferRt = salesTaxReeferRt;
    }

    public Character getNetRebateFlag() {
        return netRebateFlag;
    }

    public void setNetRebateFlag(Character netRebateFlag) {
        this.netRebateFlag = netRebateFlag;
    }

    public Character getNetRebateRemainderFlag() {
        return netRebateRemainderFlag;
    }

    public void setNetRebateRemainderFlag(Character netRebateRemainderFlag) {
        this.netRebateRemainderFlag = netRebateRemainderFlag;
    }

    public Character getCustomStTaxRateFlag() {
        return customStTaxRateFlag;
    }

    public void setCustomStTaxRateFlag(Character customStTaxRateFlag) {
        this.customStTaxRateFlag = customStTaxRateFlag;
    }

    public BigDecimal getRateCpgNr2dAmt() {
        return rateCpgNr2dAmt;
    }

    public void setRateCpgNr2dAmt(BigDecimal rateCpgNr2dAmt) {
        this.rateCpgNr2dAmt = rateCpgNr2dAmt;
    }

    public BigDecimal getRateCpgReeferAmt() {
        return rateCpgReeferAmt;
    }

    public void setRateCpgReeferAmt(BigDecimal rateCpgReeferAmt) {
        this.rateCpgReeferAmt = rateCpgReeferAmt;
    }

    public Character getMaxAllowedPriceCd() {
        return maxAllowedPriceCd;
    }

    public void setMaxAllowedPriceCd(Character maxAllowedPriceCd) {
        this.maxAllowedPriceCd = maxAllowedPriceCd;
    }

    public BigDecimal getMaxNr2PriceAmt() {
        return maxNr2PriceAmt;
    }

    public void setMaxNr2PriceAmt(BigDecimal maxNr2PriceAmt) {
        this.maxNr2PriceAmt = maxNr2PriceAmt;
    }

    public Character getRackPriceDieselFlg() {
        return rackPriceDieselFlg;
    }

    public void setRackPriceDieselFlg(Character rackPriceDieselFlg) {
        this.rackPriceDieselFlg = rackPriceDieselFlg;
    }

    public Character getRackPriceReeferFlg() {
        return rackPriceReeferFlg;
    }

    public void setRackPriceReeferFlg(Character rackPriceReeferFlg) {
        this.rackPriceReeferFlg = rackPriceReeferFlg;
    }

    public Character getFedTaxDieselFlg() {
        return fedTaxDieselFlg;
    }

    public void setFedTaxDieselFlg(Character fedTaxDieselFlg) {
        this.fedTaxDieselFlg = fedTaxDieselFlg;
    }

    public Character getFedTaxReeferFlg() {
        return fedTaxReeferFlg;
    }

    public void setFedTaxReeferFlg(Character fedTaxReeferFlg) {
        this.fedTaxReeferFlg = fedTaxReeferFlg;
    }

    public Character getStTaxDieselFlg() {
        return stTaxDieselFlg;
    }

    public void setStTaxDieselFlg(Character stTaxDieselFlg) {
        this.stTaxDieselFlg = stTaxDieselFlg;
    }

    public Character getStTaxReeferFlg() {
        return stTaxReeferFlg;
    }

    public void setStTaxReeferFlg(Character stTaxReeferFlg) {
        this.stTaxReeferFlg = stTaxReeferFlg;
    }

    public Character getStSupfundDieselFlg() {
        return stSupfundDieselFlg;
    }

    public void setStSupfundDieselFlg(Character stSupfundDieselFlg) {
        this.stSupfundDieselFlg = stSupfundDieselFlg;
    }

    public Character getStSupfundReeferFlg() {
        return stSupfundReeferFlg;
    }

    public void setStSupfundReeferFlg(Character stSupfundReeferFlg) {
        this.stSupfundReeferFlg = stSupfundReeferFlg;
    }

    public Character getLustTaxDieselFlg() {
        return lustTaxDieselFlg;
    }

    public void setLustTaxDieselFlg(Character lustTaxDieselFlg) {
        this.lustTaxDieselFlg = lustTaxDieselFlg;
    }

    public Character getLustTaxReeferFlg() {
        return lustTaxReeferFlg;
    }

    public void setLustTaxReeferFlg(Character lustTaxReeferFlg) {
        this.lustTaxReeferFlg = lustTaxReeferFlg;
    }

    public Character getTransDieselFlg() {
        return transDieselFlg;
    }

    public void setTransDieselFlg(Character transDieselFlg) {
        this.transDieselFlg = transDieselFlg;
    }

    public Character getTransReeferFlg() {
        return transReeferFlg;
    }

    public void setTransReeferFlg(Character transReeferFlg) {
        this.transReeferFlg = transReeferFlg;
    }

    public Character getMiscDieselFlg() {
        return miscDieselFlg;
    }

    public void setMiscDieselFlg(Character miscDieselFlg) {
        this.miscDieselFlg = miscDieselFlg;
    }

    public Character getMiscReeferFlg() {
        return miscReeferFlg;
    }

    public void setMiscReeferFlg(Character miscReeferFlg) {
        this.miscReeferFlg = miscReeferFlg;
    }

    public Character getMarkupDieselFlg() {
        return markupDieselFlg;
    }

    public void setMarkupDieselFlg(Character markupDieselFlg) {
        this.markupDieselFlg = markupDieselFlg;
    }

    public Character getMarkupReeferFlg() {
        return markupReeferFlg;
    }

    public void setMarkupReeferFlg(Character markupReeferFlg) {
        this.markupReeferFlg = markupReeferFlg;
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

    public BigDecimal getSalesTaxTractorCpg() {
        return salesTaxTractorCpg;
    }

    public void setSalesTaxTractorCpg(BigDecimal salesTaxTractorCpg) {
        this.salesTaxTractorCpg = salesTaxTractorCpg;
    }

    public BigDecimal getSalesTaxReeferCpg() {
        return salesTaxReeferCpg;
    }

    public void setSalesTaxReeferCpg(BigDecimal salesTaxReeferCpg) {
        this.salesTaxReeferCpg = salesTaxReeferCpg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custCostPlusPK != null ? custCostPlusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CustCostPlus)) {
            return false;
        }
        CustCostPlus other = (CustCostPlus) object;
        if ((this.custCostPlusPK == null && other.custCostPlusPK != null) || (this.custCostPlusPK != null && !this.custCostPlusPK.equals(other.custCostPlusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustCostPlus[ custCostPlusPK=" + custCostPlusPK + " ]";
    }

}
