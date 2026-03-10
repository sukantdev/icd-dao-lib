/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "NET_PRICING", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "NetPricing.findAll", query = "SELECT n FROM NetPricing n")})
public class NetPricing implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NetPricingPK netPricingPK;
    @Basic(optional = false)
    @Column(name = "NET_PRD_GRP")
    private String netPrdGrp;
    @Basic(optional = false)
    @Column(name = "NET_DRVR_TYP_CD")
    private Character netDrvrTypCd;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_CTY_NBR")
    private String netOpisRckCtyNbr;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_SPPLR_NBR")
    private String netOpisRckSpplrNbr;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_CTY_TXT")
    private String netOpisRckCtyTxt;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_ST_NM")
    private String netOpisRckStNm;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_SPPLR_NM")
    private String netOpisSpplrNm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "NET_RCK_PRC")
    private BigDecimal netRckPrc;
    @Basic(optional = false)
    @Column(name = "NET_RCK_DT")
    @Temporal(TemporalType.DATE)
    private Date netRckDt;
    @Basic(optional = false)
    @Column(name = "NET_FED_TAX_PCT")
    private BigDecimal netFedTaxPct;
    @Basic(optional = false)
    @Column(name = "NET_ST_TAX_PCT")
    private BigDecimal netStTaxPct;
    @Basic(optional = false)
    @Column(name = "NET_ST_SF_RT_PCT")
    private BigDecimal netStSfRtPct;
    @Basic(optional = false)
    @Column(name = "NET_LUST_RT_PCT")
    private BigDecimal netLustRtPct;
    @Basic(optional = false)
    @Column(name = "NET_TRNSPRT_RT_PCT")
    private BigDecimal netTrnsprtRtPct;
    @Basic(optional = false)
    @Column(name = "NET_MSC_RT_PCT")
    private BigDecimal netMscRtPct;
    @Basic(optional = false)
    @Column(name = "NET_MSC_RT_DESC")
    private String netMscRtDesc;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPLIES_RCK_FLG")
    private Character netTaxAppliesRckFlg;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPLIES_FED_FLG")
    private Character netTaxAppliesFedFlg;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPLIES_ST_FLG")
    private Character netTaxAppliesStFlg;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPLIES_SF_FLG")
    private Character netTaxAppliesSfFlg;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPLIES_LUST_FLG")
    private Character netTaxAppliesLustFlg;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPLIES_TRNSPRT_FLG")
    private Character netTaxAppliesTrnsprtFlg;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPLIES_MSC_FLG")
    private Character netTaxAppliesMscFlg;
    @Basic(optional = false)
    @Column(name = "NET_TAX_APPLIES_MRKUP_FLG")
    private Character netTaxAppliesMrkupFlg;
    @Basic(optional = false)
    @Column(name = "NET_TAX_RT_PCT")
    private BigDecimal netTaxRtPct;
    @Basic(optional = false)
    @Column(name = "NET_MRCH_MRKUP_PCT")
    private BigDecimal netMrchMrkupPct;
    @Basic(optional = false)
    @Column(name = "NET_PRC_REL_TYP_CD")
    private Character netPrcRelTypCd;
    @Basic(optional = false)
    @Column(name = "NET_TOT_CST_AMT")
    private BigDecimal netTotCstAmt;
    @Basic(optional = false)
    @Column(name = "NET_CNT_OFF_AMT")
    private BigDecimal netCntOffAmt;
    @Basic(optional = false)
    @Column(name = "NET_MRCH_BILL_CD")
    private String netMrchBillCd;
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
    @Column(name = "EXP_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expTs;

    public NetPricing() {
    }

    public NetPricing(NetPricingPK netPricingPK) {
        this.netPricingPK = netPricingPK;
    }

    public NetPricing(NetPricingPK netPricingPK, String netPrdGrp, Character netDrvrTypCd, String netOpisRckCtyNbr, String netOpisRckSpplrNbr, String netOpisRckCtyTxt, String netOpisRckStNm, String netOpisSpplrNm, BigDecimal netRckPrc, Date netRckDt, BigDecimal netFedTaxPct, BigDecimal netStTaxPct, BigDecimal netStSfRtPct, BigDecimal netLustRtPct, BigDecimal netTrnsprtRtPct, BigDecimal netMscRtPct, String netMscRtDesc, Character netTaxAppliesRckFlg, Character netTaxAppliesFedFlg, Character netTaxAppliesStFlg, Character netTaxAppliesSfFlg, Character netTaxAppliesLustFlg, Character netTaxAppliesTrnsprtFlg, Character netTaxAppliesMscFlg, Character netTaxAppliesMrkupFlg, BigDecimal netTaxRtPct, BigDecimal netMrchMrkupPct, Character netPrcRelTypCd, BigDecimal netTotCstAmt, BigDecimal netCntOffAmt, String netMrchBillCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Date expTs) {
        this.netPricingPK = netPricingPK;
        this.netPrdGrp = netPrdGrp;
        this.netDrvrTypCd = netDrvrTypCd;
        this.netOpisRckCtyNbr = netOpisRckCtyNbr;
        this.netOpisRckSpplrNbr = netOpisRckSpplrNbr;
        this.netOpisRckCtyTxt = netOpisRckCtyTxt;
        this.netOpisRckStNm = netOpisRckStNm;
        this.netOpisSpplrNm = netOpisSpplrNm;
        this.netRckPrc = netRckPrc;
        this.netRckDt = netRckDt;
        this.netFedTaxPct = netFedTaxPct;
        this.netStTaxPct = netStTaxPct;
        this.netStSfRtPct = netStSfRtPct;
        this.netLustRtPct = netLustRtPct;
        this.netTrnsprtRtPct = netTrnsprtRtPct;
        this.netMscRtPct = netMscRtPct;
        this.netMscRtDesc = netMscRtDesc;
        this.netTaxAppliesRckFlg = netTaxAppliesRckFlg;
        this.netTaxAppliesFedFlg = netTaxAppliesFedFlg;
        this.netTaxAppliesStFlg = netTaxAppliesStFlg;
        this.netTaxAppliesSfFlg = netTaxAppliesSfFlg;
        this.netTaxAppliesLustFlg = netTaxAppliesLustFlg;
        this.netTaxAppliesTrnsprtFlg = netTaxAppliesTrnsprtFlg;
        this.netTaxAppliesMscFlg = netTaxAppliesMscFlg;
        this.netTaxAppliesMrkupFlg = netTaxAppliesMrkupFlg;
        this.netTaxRtPct = netTaxRtPct;
        this.netMrchMrkupPct = netMrchMrkupPct;
        this.netPrcRelTypCd = netPrcRelTypCd;
        this.netTotCstAmt = netTotCstAmt;
        this.netCntOffAmt = netCntOffAmt;
        this.netMrchBillCd = netMrchBillCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.expTs = expTs;
    }

    public NetPricing(String locCd, String pfidCd, String custId, String acctNbr, String prdCd, Date effctvDtTs) {
        this.netPricingPK = new NetPricingPK(locCd, pfidCd, custId, acctNbr, prdCd, effctvDtTs);
    }

    public NetPricingPK getNetPricingPK() {
        return netPricingPK;
    }

    public void setNetPricingPK(NetPricingPK netPricingPK) {
        this.netPricingPK = netPricingPK;
    }

    public String getNetPrdGrp() {
        return netPrdGrp;
    }

    public void setNetPrdGrp(String netPrdGrp) {
        this.netPrdGrp = netPrdGrp;
    }

    public Character getNetDrvrTypCd() {
        return netDrvrTypCd;
    }

    public void setNetDrvrTypCd(Character netDrvrTypCd) {
        this.netDrvrTypCd = netDrvrTypCd;
    }

    public String getNetOpisRckCtyNbr() {
        return netOpisRckCtyNbr;
    }

    public void setNetOpisRckCtyNbr(String netOpisRckCtyNbr) {
        this.netOpisRckCtyNbr = netOpisRckCtyNbr;
    }

    public String getNetOpisRckSpplrNbr() {
        return netOpisRckSpplrNbr;
    }

    public void setNetOpisRckSpplrNbr(String netOpisRckSpplrNbr) {
        this.netOpisRckSpplrNbr = netOpisRckSpplrNbr;
    }

    public String getNetOpisRckCtyTxt() {
        return netOpisRckCtyTxt;
    }

    public void setNetOpisRckCtyTxt(String netOpisRckCtyTxt) {
        this.netOpisRckCtyTxt = netOpisRckCtyTxt;
    }

    public String getNetOpisRckStNm() {
        return netOpisRckStNm;
    }

    public void setNetOpisRckStNm(String netOpisRckStNm) {
        this.netOpisRckStNm = netOpisRckStNm;
    }

    public String getNetOpisSpplrNm() {
        return netOpisSpplrNm;
    }

    public void setNetOpisSpplrNm(String netOpisSpplrNm) {
        this.netOpisSpplrNm = netOpisSpplrNm;
    }

    public BigDecimal getNetRckPrc() {
        return netRckPrc;
    }

    public void setNetRckPrc(BigDecimal netRckPrc) {
        this.netRckPrc = netRckPrc;
    }

    public Date getNetRckDt() {
        return netRckDt;
    }

    public void setNetRckDt(Date netRckDt) {
        this.netRckDt = netRckDt;
    }

    public BigDecimal getNetFedTaxPct() {
        return netFedTaxPct;
    }

    public void setNetFedTaxPct(BigDecimal netFedTaxPct) {
        this.netFedTaxPct = netFedTaxPct;
    }

    public BigDecimal getNetStTaxPct() {
        return netStTaxPct;
    }

    public void setNetStTaxPct(BigDecimal netStTaxPct) {
        this.netStTaxPct = netStTaxPct;
    }

    public BigDecimal getNetStSfRtPct() {
        return netStSfRtPct;
    }

    public void setNetStSfRtPct(BigDecimal netStSfRtPct) {
        this.netStSfRtPct = netStSfRtPct;
    }

    public BigDecimal getNetLustRtPct() {
        return netLustRtPct;
    }

    public void setNetLustRtPct(BigDecimal netLustRtPct) {
        this.netLustRtPct = netLustRtPct;
    }

    public BigDecimal getNetTrnsprtRtPct() {
        return netTrnsprtRtPct;
    }

    public void setNetTrnsprtRtPct(BigDecimal netTrnsprtRtPct) {
        this.netTrnsprtRtPct = netTrnsprtRtPct;
    }

    public BigDecimal getNetMscRtPct() {
        return netMscRtPct;
    }

    public void setNetMscRtPct(BigDecimal netMscRtPct) {
        this.netMscRtPct = netMscRtPct;
    }

    public String getNetMscRtDesc() {
        return netMscRtDesc;
    }

    public void setNetMscRtDesc(String netMscRtDesc) {
        this.netMscRtDesc = netMscRtDesc;
    }

    public Character getNetTaxAppliesRckFlg() {
        return netTaxAppliesRckFlg;
    }

    public void setNetTaxAppliesRckFlg(Character netTaxAppliesRckFlg) {
        this.netTaxAppliesRckFlg = netTaxAppliesRckFlg;
    }

    public Character getNetTaxAppliesFedFlg() {
        return netTaxAppliesFedFlg;
    }

    public void setNetTaxAppliesFedFlg(Character netTaxAppliesFedFlg) {
        this.netTaxAppliesFedFlg = netTaxAppliesFedFlg;
    }

    public Character getNetTaxAppliesStFlg() {
        return netTaxAppliesStFlg;
    }

    public void setNetTaxAppliesStFlg(Character netTaxAppliesStFlg) {
        this.netTaxAppliesStFlg = netTaxAppliesStFlg;
    }

    public Character getNetTaxAppliesSfFlg() {
        return netTaxAppliesSfFlg;
    }

    public void setNetTaxAppliesSfFlg(Character netTaxAppliesSfFlg) {
        this.netTaxAppliesSfFlg = netTaxAppliesSfFlg;
    }

    public Character getNetTaxAppliesLustFlg() {
        return netTaxAppliesLustFlg;
    }

    public void setNetTaxAppliesLustFlg(Character netTaxAppliesLustFlg) {
        this.netTaxAppliesLustFlg = netTaxAppliesLustFlg;
    }

    public Character getNetTaxAppliesTrnsprtFlg() {
        return netTaxAppliesTrnsprtFlg;
    }

    public void setNetTaxAppliesTrnsprtFlg(Character netTaxAppliesTrnsprtFlg) {
        this.netTaxAppliesTrnsprtFlg = netTaxAppliesTrnsprtFlg;
    }

    public Character getNetTaxAppliesMscFlg() {
        return netTaxAppliesMscFlg;
    }

    public void setNetTaxAppliesMscFlg(Character netTaxAppliesMscFlg) {
        this.netTaxAppliesMscFlg = netTaxAppliesMscFlg;
    }

    public Character getNetTaxAppliesMrkupFlg() {
        return netTaxAppliesMrkupFlg;
    }

    public void setNetTaxAppliesMrkupFlg(Character netTaxAppliesMrkupFlg) {
        this.netTaxAppliesMrkupFlg = netTaxAppliesMrkupFlg;
    }

    public BigDecimal getNetTaxRtPct() {
        return netTaxRtPct;
    }

    public void setNetTaxRtPct(BigDecimal netTaxRtPct) {
        this.netTaxRtPct = netTaxRtPct;
    }

    public BigDecimal getNetMrchMrkupPct() {
        return netMrchMrkupPct;
    }

    public void setNetMrchMrkupPct(BigDecimal netMrchMrkupPct) {
        this.netMrchMrkupPct = netMrchMrkupPct;
    }

    public Character getNetPrcRelTypCd() {
        return netPrcRelTypCd;
    }

    public void setNetPrcRelTypCd(Character netPrcRelTypCd) {
        this.netPrcRelTypCd = netPrcRelTypCd;
    }

    public BigDecimal getNetTotCstAmt() {
        return netTotCstAmt;
    }

    public void setNetTotCstAmt(BigDecimal netTotCstAmt) {
        this.netTotCstAmt = netTotCstAmt;
    }

    public BigDecimal getNetCntOffAmt() {
        return netCntOffAmt;
    }

    public void setNetCntOffAmt(BigDecimal netCntOffAmt) {
        this.netCntOffAmt = netCntOffAmt;
    }

    public String getNetMrchBillCd() {
        return netMrchBillCd;
    }

    public void setNetMrchBillCd(String netMrchBillCd) {
        this.netMrchBillCd = netMrchBillCd;
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

    public Date getExpTs() {
        return expTs;
    }

    public void setExpTs(Date expTs) {
        this.expTs = expTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (netPricingPK != null ? netPricingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NetPricing)) {
            return false;
        }
        NetPricing other = (NetPricing) object;
        if ((this.netPricingPK == null && other.netPricingPK != null) || (this.netPricingPK != null && !this.netPricingPK.equals(other.netPricingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NetPricing[ netPricingPK=" + netPricingPK + " ]";
    }
    
}
