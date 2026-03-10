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
@Table(name = "NET_PRICE_AUDIT_PRODUCT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "NetPriceAuditProduct.findAll", query = "SELECT n FROM NetPriceAuditProduct n")})
public class NetPriceAuditProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "XTN_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xtnTs;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_CTY_NBR_NEW")
    private String netOpisRckCtyNbrNew;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_CTY_NBR_OLD")
    private String netOpisRckCtyNbrOld;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_SPPLR_NBR_NEW")
    private String netOpisRckSpplrNbrNew;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_SPPLR_NBR_OLD")
    private String netOpisRckSpplrNbrOld;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_CTY_TXT_NEW")
    private String netOpisRckCtyTxtNew;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_CTY_TXT_OLD")
    private String netOpisRckCtyTxtOld;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_ST_NM_NEW")
    private String netOpisRckStNmNew;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_ST_NM_OLD")
    private String netOpisRckStNmOld;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_SPPLR_NM_NEW")
    private String netOpisSpplrNmNew;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_SPPLR_NM_OLD")
    private String netOpisSpplrNmOld;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "NET_RCK_PRC_NEW")
    private BigDecimal netRckPrcNew;
    @Basic(optional = false)
    @Column(name = "NET_RCK_PRC_OLD")
    private BigDecimal netRckPrcOld;
    @Basic(optional = false)
    @Column(name = "NET_RCK_DT_NEW")
    @Temporal(TemporalType.DATE)
    private Date netRckDtNew;
    @Basic(optional = false)
    @Column(name = "NET_RCK_DT_OLD")
    @Temporal(TemporalType.DATE)
    private Date netRckDtOld;
    @Basic(optional = false)
    @Column(name = "NET_FED_TAX_PCT_NEW")
    private BigDecimal netFedTaxPctNew;
    @Basic(optional = false)
    @Column(name = "NET_FED_TAX_PCT_OLD")
    private BigDecimal netFedTaxPctOld;
    @Basic(optional = false)
    @Column(name = "NET_ST_TAX_PCT_NEW")
    private BigDecimal netStTaxPctNew;
    @Basic(optional = false)
    @Column(name = "NET_ST_TAX_PCT_OLD")
    private BigDecimal netStTaxPctOld;
    @Basic(optional = false)
    @Column(name = "NET_ST_SF_RT_PCT_NEW")
    private BigDecimal netStSfRtPctNew;
    @Basic(optional = false)
    @Column(name = "NET_ST_SF_RT_PCT_OLD")
    private BigDecimal netStSfRtPctOld;
    @Basic(optional = false)
    @Column(name = "NET_LUST_RT_PCT_NEW")
    private BigDecimal netLustRtPctNew;
    @Basic(optional = false)
    @Column(name = "NET_LUST_RT_PCT_OLD")
    private BigDecimal netLustRtPctOld;
    @Basic(optional = false)
    @Column(name = "NET_TRNSPRT_RT_PCT_NEW")
    private BigDecimal netTrnsprtRtPctNew;
    @Basic(optional = false)
    @Column(name = "NET_TRNSPRT_RT_PCT_OLD")
    private BigDecimal netTrnsprtRtPctOld;
    @Basic(optional = false)
    @Column(name = "NET_MSC_RT_PCT_NEW")
    private BigDecimal netMscRtPctNew;
    @Basic(optional = false)
    @Column(name = "NET_MSC_RT_PCT_OLD")
    private BigDecimal netMscRtPctOld;
    @Basic(optional = false)
    @Column(name = "NET_MSC_RT_DESC_NEW")
    private String netMscRtDescNew;
    @Basic(optional = false)
    @Column(name = "NET_MSC_RT_DESC_OLD")
    private String netMscRtDescOld;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_RCK_FLG_NEW")
    private Character netTaxApplRckFlgNew;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_RCK_FLG_OLD")
    private Character netTaxApplRckFlgOld;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_FED_FLG_NEW")
    private Character netTaxApplFedFlgNew;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_FED_FLG_OLD")
    private Character netTaxApplFedFlgOld;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_ST_FLG_NEW")
    private Character netTaxApplStFlgNew;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_ST_FLG_OLD")
    private Character netTaxApplStFlgOld;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_SF_FLG_NEW")
    private Character netTaxApplSfFlgNew;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_SF_FLG_OLD")
    private Character netTaxApplSfFlgOld;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_LUST_FLG_NEW")
    private Character netTaxApplLustFlgNew;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_LUST_FLG_OLD")
    private Character netTaxApplLustFlgOld;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_TRNSPRT_FLG_NEW")
    private Character netTaxApplTrnsprtFlgNew;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_TRNSPRT_FLG_OLD")
    private Character netTaxApplTrnsprtFlgOld;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_MSC_FLG_NEW")
    private Character netTaxApplMscFlgNew;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_MSC_FLG_OLD")
    private Character netTaxApplMscFlgOld;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_MRKUP_FLG_NEW")
    private Character netTaxApplMrkupFlgNew;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPL_MRKUP_FLG_OLD")
    private Character netTaxApplMrkupFlgOld;
    @Basic(optional = false)
    @Column(name = "NET_TAX_RT_PCT_NEW")
    private BigDecimal netTaxRtPctNew;
    @Basic(optional = false)
    @Column(name = "NET_TAX_RT_PCT_OLD")
    private BigDecimal netTaxRtPctOld;
    @Basic(optional = false)
    @Column(name = "NET_MRCH_MRKUP_PCT_NEW")
    private BigDecimal netMrchMrkupPctNew;
    @Basic(optional = false)
    @Column(name = "NET_MRCH_MRKUP_PCT_OLD")
    private BigDecimal netMrchMrkupPctOld;
    @Basic(optional = false)
    @Column(name = "NET_PRC_REL_TYP_CD_NEW")
    private Character netPrcRelTypCdNew;
    @Basic(optional = false)
    @Column(name = "NET_PRC_REL_TYP_CD_OLD")
    private Character netPrcRelTypCdOld;
    @Basic(optional = false)
    @Column(name = "NET_TOT_CST_AMT_NEW")
    private BigDecimal netTotCstAmtNew;
    @Basic(optional = false)
    @Column(name = "NET_TOT_CST_AMT_OLD")
    private BigDecimal netTotCstAmtOld;
    @Basic(optional = false)
    @Column(name = "NET_CNT_OFF_AMT_NEW")
    private BigDecimal netCntOffAmtNew;
    @Basic(optional = false)
    @Column(name = "NET_CNT_OFF_AMT_OLD")
    private BigDecimal netCntOffAmtOld;
    @Basic(optional = false)
    @Column(name = "NET_MRCH_BILL_CD_NEW")
    private String netMrchBillCdNew;
    @Basic(optional = false)
    @Column(name = "NET_MRCH_BILL_CD_OLD")
    private String netMrchBillCdOld;
    @Basic(optional = false)
    @Column(name = "SALES_TAX_PPU_PCT_NEW")
    private BigDecimal salesTaxPpuPctNew;
    @Basic(optional = false)
    @Column(name = "SALES_TAX_PPU_PCT_OLD")
    private BigDecimal salesTaxPpuPctOld;
    @Basic(optional = false)
    @Column(name = "NET_ORIGINAL_RCK_PRC_NEW")
    private BigDecimal netOriginalRckPrcNew;
    @Basic(optional = false)
    @Column(name = "NET_ORIGINAL_RCK_PRC_OLD")
    private BigDecimal netOriginalRckPrcOld;
    @Basic(optional = false)
    @Column(name = "NET_ORGINAL_TOT_CST_AMT_NEW")
    private BigDecimal netOrginalTotCstAmtNew;
    @Basic(optional = false)
    @Column(name = "NET_ORGINAL_TOT_CST_AMT_OLD")
    private BigDecimal netOrginalTotCstAmtOld;
    @Basic(optional = false)
    @Column(name = "SUM_NON_VAR_COMP_NEW")
    private BigDecimal sumNonVarCompNew;
    @Basic(optional = false)
    @Column(name = "SUM_NON_VAR_COMP_OLD")
    private BigDecimal sumNonVarCompOld;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_SPPLR_NBR_CHG_FLG")
    private Character netOpisRckSpplrNbrChgFlg;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_CTY_NBR_CHG_FLG")
    private Character netOpisRckCtyNbrChgFlg;
    @Basic(optional = false)
    @Column(name = "NET_TRNSPRT_RT_PCT_CHG_FLG")
    private Character netTrnsprtRtPctChgFlg;
    @Basic(optional = false)
    @Column(name = "NET_MSC_RT_PCT_CHG_FLG")
    private Character netMscRtPctChgFlg;
    @Basic(optional = false)
    @Column(name = "NET_MRCH_MRKUP_PCT_CHG_FLG")
    private Character netMrchMrkupPctChgFlg;
    @Basic(optional = false)
    @Column(name = "NET_PRC_REL_TYP_CD_CHG_FLG")
    private Character netPrcRelTypCdChgFlg;
    @Basic(optional = false)
    @Column(name = "NET_CNT_OFF_AMT_CHG_FLG")
    private Character netCntOffAmtChgFlg;
    @Basic(optional = false)
    @Column(name = "SUM_NON_VAR_COMP_CHG_FLG")
    private Character sumNonVarCompChgFlg;
    @Basic(optional = false)
    @Column(name = "LOCATION_NEW")
    private String locationNew;
    @Basic(optional = false)
    @Column(name = "LOCATION_OLD")
    private String locationOld;
    @Basic(optional = false)
    @Column(name = "PRODUCT_NEW")
    private String productNew;
    @Basic(optional = false)
    @Column(name = "PRODUCT_OLD")
    private String productOld;
    @Basic(optional = false)
    @Column(name = "LOC_PROD_CHG_FLG")
    private Character locProdChgFlg;

    public NetPriceAuditProduct() {
    }

    public NetPriceAuditProduct(Date xtnTs) {
        this.xtnTs = xtnTs;
    }

    public NetPriceAuditProduct(Date xtnTs, String netOpisRckCtyNbrNew, String netOpisRckCtyNbrOld, String netOpisRckSpplrNbrNew, String netOpisRckSpplrNbrOld, String netOpisRckCtyTxtNew, String netOpisRckCtyTxtOld, String netOpisRckStNmNew, String netOpisRckStNmOld, String netOpisSpplrNmNew, String netOpisSpplrNmOld, BigDecimal netRckPrcNew, BigDecimal netRckPrcOld, Date netRckDtNew, Date netRckDtOld, BigDecimal netFedTaxPctNew, BigDecimal netFedTaxPctOld, BigDecimal netStTaxPctNew, BigDecimal netStTaxPctOld, BigDecimal netStSfRtPctNew, BigDecimal netStSfRtPctOld, BigDecimal netLustRtPctNew, BigDecimal netLustRtPctOld, BigDecimal netTrnsprtRtPctNew, BigDecimal netTrnsprtRtPctOld, BigDecimal netMscRtPctNew, BigDecimal netMscRtPctOld, String netMscRtDescNew, String netMscRtDescOld, Character netTaxApplRckFlgNew, Character netTaxApplRckFlgOld, Character netTaxApplFedFlgNew, Character netTaxApplFedFlgOld, Character netTaxApplStFlgNew, Character netTaxApplStFlgOld, Character netTaxApplSfFlgNew, Character netTaxApplSfFlgOld, Character netTaxApplLustFlgNew, Character netTaxApplLustFlgOld, Character netTaxApplTrnsprtFlgNew, Character netTaxApplTrnsprtFlgOld, Character netTaxApplMscFlgNew, Character netTaxApplMscFlgOld, Character netTaxApplMrkupFlgNew, Character netTaxApplMrkupFlgOld, BigDecimal netTaxRtPctNew, BigDecimal netTaxRtPctOld, BigDecimal netMrchMrkupPctNew, BigDecimal netMrchMrkupPctOld, Character netPrcRelTypCdNew, Character netPrcRelTypCdOld, BigDecimal netTotCstAmtNew, BigDecimal netTotCstAmtOld, BigDecimal netCntOffAmtNew, BigDecimal netCntOffAmtOld, String netMrchBillCdNew, String netMrchBillCdOld, BigDecimal salesTaxPpuPctNew, BigDecimal salesTaxPpuPctOld, BigDecimal netOriginalRckPrcNew, BigDecimal netOriginalRckPrcOld, BigDecimal netOrginalTotCstAmtNew, BigDecimal netOrginalTotCstAmtOld, BigDecimal sumNonVarCompNew, BigDecimal sumNonVarCompOld, Character netOpisRckSpplrNbrChgFlg, Character netOpisRckCtyNbrChgFlg, Character netTrnsprtRtPctChgFlg, Character netMscRtPctChgFlg, Character netMrchMrkupPctChgFlg, Character netPrcRelTypCdChgFlg, Character netCntOffAmtChgFlg, Character sumNonVarCompChgFlg, String locationNew, String locationOld, String productNew, String productOld, Character locProdChgFlg) {
        this.xtnTs = xtnTs;
        this.netOpisRckCtyNbrNew = netOpisRckCtyNbrNew;
        this.netOpisRckCtyNbrOld = netOpisRckCtyNbrOld;
        this.netOpisRckSpplrNbrNew = netOpisRckSpplrNbrNew;
        this.netOpisRckSpplrNbrOld = netOpisRckSpplrNbrOld;
        this.netOpisRckCtyTxtNew = netOpisRckCtyTxtNew;
        this.netOpisRckCtyTxtOld = netOpisRckCtyTxtOld;
        this.netOpisRckStNmNew = netOpisRckStNmNew;
        this.netOpisRckStNmOld = netOpisRckStNmOld;
        this.netOpisSpplrNmNew = netOpisSpplrNmNew;
        this.netOpisSpplrNmOld = netOpisSpplrNmOld;
        this.netRckPrcNew = netRckPrcNew;
        this.netRckPrcOld = netRckPrcOld;
        this.netRckDtNew = netRckDtNew;
        this.netRckDtOld = netRckDtOld;
        this.netFedTaxPctNew = netFedTaxPctNew;
        this.netFedTaxPctOld = netFedTaxPctOld;
        this.netStTaxPctNew = netStTaxPctNew;
        this.netStTaxPctOld = netStTaxPctOld;
        this.netStSfRtPctNew = netStSfRtPctNew;
        this.netStSfRtPctOld = netStSfRtPctOld;
        this.netLustRtPctNew = netLustRtPctNew;
        this.netLustRtPctOld = netLustRtPctOld;
        this.netTrnsprtRtPctNew = netTrnsprtRtPctNew;
        this.netTrnsprtRtPctOld = netTrnsprtRtPctOld;
        this.netMscRtPctNew = netMscRtPctNew;
        this.netMscRtPctOld = netMscRtPctOld;
        this.netMscRtDescNew = netMscRtDescNew;
        this.netMscRtDescOld = netMscRtDescOld;
        this.netTaxApplRckFlgNew = netTaxApplRckFlgNew;
        this.netTaxApplRckFlgOld = netTaxApplRckFlgOld;
        this.netTaxApplFedFlgNew = netTaxApplFedFlgNew;
        this.netTaxApplFedFlgOld = netTaxApplFedFlgOld;
        this.netTaxApplStFlgNew = netTaxApplStFlgNew;
        this.netTaxApplStFlgOld = netTaxApplStFlgOld;
        this.netTaxApplSfFlgNew = netTaxApplSfFlgNew;
        this.netTaxApplSfFlgOld = netTaxApplSfFlgOld;
        this.netTaxApplLustFlgNew = netTaxApplLustFlgNew;
        this.netTaxApplLustFlgOld = netTaxApplLustFlgOld;
        this.netTaxApplTrnsprtFlgNew = netTaxApplTrnsprtFlgNew;
        this.netTaxApplTrnsprtFlgOld = netTaxApplTrnsprtFlgOld;
        this.netTaxApplMscFlgNew = netTaxApplMscFlgNew;
        this.netTaxApplMscFlgOld = netTaxApplMscFlgOld;
        this.netTaxApplMrkupFlgNew = netTaxApplMrkupFlgNew;
        this.netTaxApplMrkupFlgOld = netTaxApplMrkupFlgOld;
        this.netTaxRtPctNew = netTaxRtPctNew;
        this.netTaxRtPctOld = netTaxRtPctOld;
        this.netMrchMrkupPctNew = netMrchMrkupPctNew;
        this.netMrchMrkupPctOld = netMrchMrkupPctOld;
        this.netPrcRelTypCdNew = netPrcRelTypCdNew;
        this.netPrcRelTypCdOld = netPrcRelTypCdOld;
        this.netTotCstAmtNew = netTotCstAmtNew;
        this.netTotCstAmtOld = netTotCstAmtOld;
        this.netCntOffAmtNew = netCntOffAmtNew;
        this.netCntOffAmtOld = netCntOffAmtOld;
        this.netMrchBillCdNew = netMrchBillCdNew;
        this.netMrchBillCdOld = netMrchBillCdOld;
        this.salesTaxPpuPctNew = salesTaxPpuPctNew;
        this.salesTaxPpuPctOld = salesTaxPpuPctOld;
        this.netOriginalRckPrcNew = netOriginalRckPrcNew;
        this.netOriginalRckPrcOld = netOriginalRckPrcOld;
        this.netOrginalTotCstAmtNew = netOrginalTotCstAmtNew;
        this.netOrginalTotCstAmtOld = netOrginalTotCstAmtOld;
        this.sumNonVarCompNew = sumNonVarCompNew;
        this.sumNonVarCompOld = sumNonVarCompOld;
        this.netOpisRckSpplrNbrChgFlg = netOpisRckSpplrNbrChgFlg;
        this.netOpisRckCtyNbrChgFlg = netOpisRckCtyNbrChgFlg;
        this.netTrnsprtRtPctChgFlg = netTrnsprtRtPctChgFlg;
        this.netMscRtPctChgFlg = netMscRtPctChgFlg;
        this.netMrchMrkupPctChgFlg = netMrchMrkupPctChgFlg;
        this.netPrcRelTypCdChgFlg = netPrcRelTypCdChgFlg;
        this.netCntOffAmtChgFlg = netCntOffAmtChgFlg;
        this.sumNonVarCompChgFlg = sumNonVarCompChgFlg;
        this.locationNew = locationNew;
        this.locationOld = locationOld;
        this.productNew = productNew;
        this.productOld = productOld;
        this.locProdChgFlg = locProdChgFlg;
    }

    public Date getXtnTs() {
        return xtnTs;
    }

    public void setXtnTs(Date xtnTs) {
        this.xtnTs = xtnTs;
    }

    public String getNetOpisRckCtyNbrNew() {
        return netOpisRckCtyNbrNew;
    }

    public void setNetOpisRckCtyNbrNew(String netOpisRckCtyNbrNew) {
        this.netOpisRckCtyNbrNew = netOpisRckCtyNbrNew;
    }

    public String getNetOpisRckCtyNbrOld() {
        return netOpisRckCtyNbrOld;
    }

    public void setNetOpisRckCtyNbrOld(String netOpisRckCtyNbrOld) {
        this.netOpisRckCtyNbrOld = netOpisRckCtyNbrOld;
    }

    public String getNetOpisRckSpplrNbrNew() {
        return netOpisRckSpplrNbrNew;
    }

    public void setNetOpisRckSpplrNbrNew(String netOpisRckSpplrNbrNew) {
        this.netOpisRckSpplrNbrNew = netOpisRckSpplrNbrNew;
    }

    public String getNetOpisRckSpplrNbrOld() {
        return netOpisRckSpplrNbrOld;
    }

    public void setNetOpisRckSpplrNbrOld(String netOpisRckSpplrNbrOld) {
        this.netOpisRckSpplrNbrOld = netOpisRckSpplrNbrOld;
    }

    public String getNetOpisRckCtyTxtNew() {
        return netOpisRckCtyTxtNew;
    }

    public void setNetOpisRckCtyTxtNew(String netOpisRckCtyTxtNew) {
        this.netOpisRckCtyTxtNew = netOpisRckCtyTxtNew;
    }

    public String getNetOpisRckCtyTxtOld() {
        return netOpisRckCtyTxtOld;
    }

    public void setNetOpisRckCtyTxtOld(String netOpisRckCtyTxtOld) {
        this.netOpisRckCtyTxtOld = netOpisRckCtyTxtOld;
    }

    public String getNetOpisRckStNmNew() {
        return netOpisRckStNmNew;
    }

    public void setNetOpisRckStNmNew(String netOpisRckStNmNew) {
        this.netOpisRckStNmNew = netOpisRckStNmNew;
    }

    public String getNetOpisRckStNmOld() {
        return netOpisRckStNmOld;
    }

    public void setNetOpisRckStNmOld(String netOpisRckStNmOld) {
        this.netOpisRckStNmOld = netOpisRckStNmOld;
    }

    public String getNetOpisSpplrNmNew() {
        return netOpisSpplrNmNew;
    }

    public void setNetOpisSpplrNmNew(String netOpisSpplrNmNew) {
        this.netOpisSpplrNmNew = netOpisSpplrNmNew;
    }

    public String getNetOpisSpplrNmOld() {
        return netOpisSpplrNmOld;
    }

    public void setNetOpisSpplrNmOld(String netOpisSpplrNmOld) {
        this.netOpisSpplrNmOld = netOpisSpplrNmOld;
    }

    public BigDecimal getNetRckPrcNew() {
        return netRckPrcNew;
    }

    public void setNetRckPrcNew(BigDecimal netRckPrcNew) {
        this.netRckPrcNew = netRckPrcNew;
    }

    public BigDecimal getNetRckPrcOld() {
        return netRckPrcOld;
    }

    public void setNetRckPrcOld(BigDecimal netRckPrcOld) {
        this.netRckPrcOld = netRckPrcOld;
    }

    public Date getNetRckDtNew() {
        return netRckDtNew;
    }

    public void setNetRckDtNew(Date netRckDtNew) {
        this.netRckDtNew = netRckDtNew;
    }

    public Date getNetRckDtOld() {
        return netRckDtOld;
    }

    public void setNetRckDtOld(Date netRckDtOld) {
        this.netRckDtOld = netRckDtOld;
    }

    public BigDecimal getNetFedTaxPctNew() {
        return netFedTaxPctNew;
    }

    public void setNetFedTaxPctNew(BigDecimal netFedTaxPctNew) {
        this.netFedTaxPctNew = netFedTaxPctNew;
    }

    public BigDecimal getNetFedTaxPctOld() {
        return netFedTaxPctOld;
    }

    public void setNetFedTaxPctOld(BigDecimal netFedTaxPctOld) {
        this.netFedTaxPctOld = netFedTaxPctOld;
    }

    public BigDecimal getNetStTaxPctNew() {
        return netStTaxPctNew;
    }

    public void setNetStTaxPctNew(BigDecimal netStTaxPctNew) {
        this.netStTaxPctNew = netStTaxPctNew;
    }

    public BigDecimal getNetStTaxPctOld() {
        return netStTaxPctOld;
    }

    public void setNetStTaxPctOld(BigDecimal netStTaxPctOld) {
        this.netStTaxPctOld = netStTaxPctOld;
    }

    public BigDecimal getNetStSfRtPctNew() {
        return netStSfRtPctNew;
    }

    public void setNetStSfRtPctNew(BigDecimal netStSfRtPctNew) {
        this.netStSfRtPctNew = netStSfRtPctNew;
    }

    public BigDecimal getNetStSfRtPctOld() {
        return netStSfRtPctOld;
    }

    public void setNetStSfRtPctOld(BigDecimal netStSfRtPctOld) {
        this.netStSfRtPctOld = netStSfRtPctOld;
    }

    public BigDecimal getNetLustRtPctNew() {
        return netLustRtPctNew;
    }

    public void setNetLustRtPctNew(BigDecimal netLustRtPctNew) {
        this.netLustRtPctNew = netLustRtPctNew;
    }

    public BigDecimal getNetLustRtPctOld() {
        return netLustRtPctOld;
    }

    public void setNetLustRtPctOld(BigDecimal netLustRtPctOld) {
        this.netLustRtPctOld = netLustRtPctOld;
    }

    public BigDecimal getNetTrnsprtRtPctNew() {
        return netTrnsprtRtPctNew;
    }

    public void setNetTrnsprtRtPctNew(BigDecimal netTrnsprtRtPctNew) {
        this.netTrnsprtRtPctNew = netTrnsprtRtPctNew;
    }

    public BigDecimal getNetTrnsprtRtPctOld() {
        return netTrnsprtRtPctOld;
    }

    public void setNetTrnsprtRtPctOld(BigDecimal netTrnsprtRtPctOld) {
        this.netTrnsprtRtPctOld = netTrnsprtRtPctOld;
    }

    public BigDecimal getNetMscRtPctNew() {
        return netMscRtPctNew;
    }

    public void setNetMscRtPctNew(BigDecimal netMscRtPctNew) {
        this.netMscRtPctNew = netMscRtPctNew;
    }

    public BigDecimal getNetMscRtPctOld() {
        return netMscRtPctOld;
    }

    public void setNetMscRtPctOld(BigDecimal netMscRtPctOld) {
        this.netMscRtPctOld = netMscRtPctOld;
    }

    public String getNetMscRtDescNew() {
        return netMscRtDescNew;
    }

    public void setNetMscRtDescNew(String netMscRtDescNew) {
        this.netMscRtDescNew = netMscRtDescNew;
    }

    public String getNetMscRtDescOld() {
        return netMscRtDescOld;
    }

    public void setNetMscRtDescOld(String netMscRtDescOld) {
        this.netMscRtDescOld = netMscRtDescOld;
    }

    public Character getNetTaxApplRckFlgNew() {
        return netTaxApplRckFlgNew;
    }

    public void setNetTaxApplRckFlgNew(Character netTaxApplRckFlgNew) {
        this.netTaxApplRckFlgNew = netTaxApplRckFlgNew;
    }

    public Character getNetTaxApplRckFlgOld() {
        return netTaxApplRckFlgOld;
    }

    public void setNetTaxApplRckFlgOld(Character netTaxApplRckFlgOld) {
        this.netTaxApplRckFlgOld = netTaxApplRckFlgOld;
    }

    public Character getNetTaxApplFedFlgNew() {
        return netTaxApplFedFlgNew;
    }

    public void setNetTaxApplFedFlgNew(Character netTaxApplFedFlgNew) {
        this.netTaxApplFedFlgNew = netTaxApplFedFlgNew;
    }

    public Character getNetTaxApplFedFlgOld() {
        return netTaxApplFedFlgOld;
    }

    public void setNetTaxApplFedFlgOld(Character netTaxApplFedFlgOld) {
        this.netTaxApplFedFlgOld = netTaxApplFedFlgOld;
    }

    public Character getNetTaxApplStFlgNew() {
        return netTaxApplStFlgNew;
    }

    public void setNetTaxApplStFlgNew(Character netTaxApplStFlgNew) {
        this.netTaxApplStFlgNew = netTaxApplStFlgNew;
    }

    public Character getNetTaxApplStFlgOld() {
        return netTaxApplStFlgOld;
    }

    public void setNetTaxApplStFlgOld(Character netTaxApplStFlgOld) {
        this.netTaxApplStFlgOld = netTaxApplStFlgOld;
    }

    public Character getNetTaxApplSfFlgNew() {
        return netTaxApplSfFlgNew;
    }

    public void setNetTaxApplSfFlgNew(Character netTaxApplSfFlgNew) {
        this.netTaxApplSfFlgNew = netTaxApplSfFlgNew;
    }

    public Character getNetTaxApplSfFlgOld() {
        return netTaxApplSfFlgOld;
    }

    public void setNetTaxApplSfFlgOld(Character netTaxApplSfFlgOld) {
        this.netTaxApplSfFlgOld = netTaxApplSfFlgOld;
    }

    public Character getNetTaxApplLustFlgNew() {
        return netTaxApplLustFlgNew;
    }

    public void setNetTaxApplLustFlgNew(Character netTaxApplLustFlgNew) {
        this.netTaxApplLustFlgNew = netTaxApplLustFlgNew;
    }

    public Character getNetTaxApplLustFlgOld() {
        return netTaxApplLustFlgOld;
    }

    public void setNetTaxApplLustFlgOld(Character netTaxApplLustFlgOld) {
        this.netTaxApplLustFlgOld = netTaxApplLustFlgOld;
    }

    public Character getNetTaxApplTrnsprtFlgNew() {
        return netTaxApplTrnsprtFlgNew;
    }

    public void setNetTaxApplTrnsprtFlgNew(Character netTaxApplTrnsprtFlgNew) {
        this.netTaxApplTrnsprtFlgNew = netTaxApplTrnsprtFlgNew;
    }

    public Character getNetTaxApplTrnsprtFlgOld() {
        return netTaxApplTrnsprtFlgOld;
    }

    public void setNetTaxApplTrnsprtFlgOld(Character netTaxApplTrnsprtFlgOld) {
        this.netTaxApplTrnsprtFlgOld = netTaxApplTrnsprtFlgOld;
    }

    public Character getNetTaxApplMscFlgNew() {
        return netTaxApplMscFlgNew;
    }

    public void setNetTaxApplMscFlgNew(Character netTaxApplMscFlgNew) {
        this.netTaxApplMscFlgNew = netTaxApplMscFlgNew;
    }

    public Character getNetTaxApplMscFlgOld() {
        return netTaxApplMscFlgOld;
    }

    public void setNetTaxApplMscFlgOld(Character netTaxApplMscFlgOld) {
        this.netTaxApplMscFlgOld = netTaxApplMscFlgOld;
    }

    public Character getNetTaxApplMrkupFlgNew() {
        return netTaxApplMrkupFlgNew;
    }

    public void setNetTaxApplMrkupFlgNew(Character netTaxApplMrkupFlgNew) {
        this.netTaxApplMrkupFlgNew = netTaxApplMrkupFlgNew;
    }

    public Character getNetTaxApplMrkupFlgOld() {
        return netTaxApplMrkupFlgOld;
    }

    public void setNetTaxApplMrkupFlgOld(Character netTaxApplMrkupFlgOld) {
        this.netTaxApplMrkupFlgOld = netTaxApplMrkupFlgOld;
    }

    public BigDecimal getNetTaxRtPctNew() {
        return netTaxRtPctNew;
    }

    public void setNetTaxRtPctNew(BigDecimal netTaxRtPctNew) {
        this.netTaxRtPctNew = netTaxRtPctNew;
    }

    public BigDecimal getNetTaxRtPctOld() {
        return netTaxRtPctOld;
    }

    public void setNetTaxRtPctOld(BigDecimal netTaxRtPctOld) {
        this.netTaxRtPctOld = netTaxRtPctOld;
    }

    public BigDecimal getNetMrchMrkupPctNew() {
        return netMrchMrkupPctNew;
    }

    public void setNetMrchMrkupPctNew(BigDecimal netMrchMrkupPctNew) {
        this.netMrchMrkupPctNew = netMrchMrkupPctNew;
    }

    public BigDecimal getNetMrchMrkupPctOld() {
        return netMrchMrkupPctOld;
    }

    public void setNetMrchMrkupPctOld(BigDecimal netMrchMrkupPctOld) {
        this.netMrchMrkupPctOld = netMrchMrkupPctOld;
    }

    public Character getNetPrcRelTypCdNew() {
        return netPrcRelTypCdNew;
    }

    public void setNetPrcRelTypCdNew(Character netPrcRelTypCdNew) {
        this.netPrcRelTypCdNew = netPrcRelTypCdNew;
    }

    public Character getNetPrcRelTypCdOld() {
        return netPrcRelTypCdOld;
    }

    public void setNetPrcRelTypCdOld(Character netPrcRelTypCdOld) {
        this.netPrcRelTypCdOld = netPrcRelTypCdOld;
    }

    public BigDecimal getNetTotCstAmtNew() {
        return netTotCstAmtNew;
    }

    public void setNetTotCstAmtNew(BigDecimal netTotCstAmtNew) {
        this.netTotCstAmtNew = netTotCstAmtNew;
    }

    public BigDecimal getNetTotCstAmtOld() {
        return netTotCstAmtOld;
    }

    public void setNetTotCstAmtOld(BigDecimal netTotCstAmtOld) {
        this.netTotCstAmtOld = netTotCstAmtOld;
    }

    public BigDecimal getNetCntOffAmtNew() {
        return netCntOffAmtNew;
    }

    public void setNetCntOffAmtNew(BigDecimal netCntOffAmtNew) {
        this.netCntOffAmtNew = netCntOffAmtNew;
    }

    public BigDecimal getNetCntOffAmtOld() {
        return netCntOffAmtOld;
    }

    public void setNetCntOffAmtOld(BigDecimal netCntOffAmtOld) {
        this.netCntOffAmtOld = netCntOffAmtOld;
    }

    public String getNetMrchBillCdNew() {
        return netMrchBillCdNew;
    }

    public void setNetMrchBillCdNew(String netMrchBillCdNew) {
        this.netMrchBillCdNew = netMrchBillCdNew;
    }

    public String getNetMrchBillCdOld() {
        return netMrchBillCdOld;
    }

    public void setNetMrchBillCdOld(String netMrchBillCdOld) {
        this.netMrchBillCdOld = netMrchBillCdOld;
    }

    public BigDecimal getSalesTaxPpuPctNew() {
        return salesTaxPpuPctNew;
    }

    public void setSalesTaxPpuPctNew(BigDecimal salesTaxPpuPctNew) {
        this.salesTaxPpuPctNew = salesTaxPpuPctNew;
    }

    public BigDecimal getSalesTaxPpuPctOld() {
        return salesTaxPpuPctOld;
    }

    public void setSalesTaxPpuPctOld(BigDecimal salesTaxPpuPctOld) {
        this.salesTaxPpuPctOld = salesTaxPpuPctOld;
    }

    public BigDecimal getNetOriginalRckPrcNew() {
        return netOriginalRckPrcNew;
    }

    public void setNetOriginalRckPrcNew(BigDecimal netOriginalRckPrcNew) {
        this.netOriginalRckPrcNew = netOriginalRckPrcNew;
    }

    public BigDecimal getNetOriginalRckPrcOld() {
        return netOriginalRckPrcOld;
    }

    public void setNetOriginalRckPrcOld(BigDecimal netOriginalRckPrcOld) {
        this.netOriginalRckPrcOld = netOriginalRckPrcOld;
    }

    public BigDecimal getNetOrginalTotCstAmtNew() {
        return netOrginalTotCstAmtNew;
    }

    public void setNetOrginalTotCstAmtNew(BigDecimal netOrginalTotCstAmtNew) {
        this.netOrginalTotCstAmtNew = netOrginalTotCstAmtNew;
    }

    public BigDecimal getNetOrginalTotCstAmtOld() {
        return netOrginalTotCstAmtOld;
    }

    public void setNetOrginalTotCstAmtOld(BigDecimal netOrginalTotCstAmtOld) {
        this.netOrginalTotCstAmtOld = netOrginalTotCstAmtOld;
    }

    public BigDecimal getSumNonVarCompNew() {
        return sumNonVarCompNew;
    }

    public void setSumNonVarCompNew(BigDecimal sumNonVarCompNew) {
        this.sumNonVarCompNew = sumNonVarCompNew;
    }

    public BigDecimal getSumNonVarCompOld() {
        return sumNonVarCompOld;
    }

    public void setSumNonVarCompOld(BigDecimal sumNonVarCompOld) {
        this.sumNonVarCompOld = sumNonVarCompOld;
    }

    public Character getNetOpisRckSpplrNbrChgFlg() {
        return netOpisRckSpplrNbrChgFlg;
    }

    public void setNetOpisRckSpplrNbrChgFlg(Character netOpisRckSpplrNbrChgFlg) {
        this.netOpisRckSpplrNbrChgFlg = netOpisRckSpplrNbrChgFlg;
    }

    public Character getNetOpisRckCtyNbrChgFlg() {
        return netOpisRckCtyNbrChgFlg;
    }

    public void setNetOpisRckCtyNbrChgFlg(Character netOpisRckCtyNbrChgFlg) {
        this.netOpisRckCtyNbrChgFlg = netOpisRckCtyNbrChgFlg;
    }

    public Character getNetTrnsprtRtPctChgFlg() {
        return netTrnsprtRtPctChgFlg;
    }

    public void setNetTrnsprtRtPctChgFlg(Character netTrnsprtRtPctChgFlg) {
        this.netTrnsprtRtPctChgFlg = netTrnsprtRtPctChgFlg;
    }

    public Character getNetMscRtPctChgFlg() {
        return netMscRtPctChgFlg;
    }

    public void setNetMscRtPctChgFlg(Character netMscRtPctChgFlg) {
        this.netMscRtPctChgFlg = netMscRtPctChgFlg;
    }

    public Character getNetMrchMrkupPctChgFlg() {
        return netMrchMrkupPctChgFlg;
    }

    public void setNetMrchMrkupPctChgFlg(Character netMrchMrkupPctChgFlg) {
        this.netMrchMrkupPctChgFlg = netMrchMrkupPctChgFlg;
    }

    public Character getNetPrcRelTypCdChgFlg() {
        return netPrcRelTypCdChgFlg;
    }

    public void setNetPrcRelTypCdChgFlg(Character netPrcRelTypCdChgFlg) {
        this.netPrcRelTypCdChgFlg = netPrcRelTypCdChgFlg;
    }

    public Character getNetCntOffAmtChgFlg() {
        return netCntOffAmtChgFlg;
    }

    public void setNetCntOffAmtChgFlg(Character netCntOffAmtChgFlg) {
        this.netCntOffAmtChgFlg = netCntOffAmtChgFlg;
    }

    public Character getSumNonVarCompChgFlg() {
        return sumNonVarCompChgFlg;
    }

    public void setSumNonVarCompChgFlg(Character sumNonVarCompChgFlg) {
        this.sumNonVarCompChgFlg = sumNonVarCompChgFlg;
    }

    public String getLocationNew() {
        return locationNew;
    }

    public void setLocationNew(String locationNew) {
        this.locationNew = locationNew;
    }

    public String getLocationOld() {
        return locationOld;
    }

    public void setLocationOld(String locationOld) {
        this.locationOld = locationOld;
    }

    public String getProductNew() {
        return productNew;
    }

    public void setProductNew(String productNew) {
        this.productNew = productNew;
    }

    public String getProductOld() {
        return productOld;
    }

    public void setProductOld(String productOld) {
        this.productOld = productOld;
    }

    public Character getLocProdChgFlg() {
        return locProdChgFlg;
    }

    public void setLocProdChgFlg(Character locProdChgFlg) {
        this.locProdChgFlg = locProdChgFlg;
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
        if (!(object instanceof NetPriceAuditProduct)) {
            return false;
        }
        NetPriceAuditProduct other = (NetPriceAuditProduct) object;
        if ((this.xtnTs == null && other.xtnTs != null) || (this.xtnTs != null && !this.xtnTs.equals(other.xtnTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NetPriceAuditProduct[ xtnTs=" + xtnTs + " ]";
    }
    
}
