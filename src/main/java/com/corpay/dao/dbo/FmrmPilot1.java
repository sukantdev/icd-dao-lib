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
@Table(name = "FMRM_PILOT1", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FmrmPilot1.findAll", query = "SELECT f FROM FmrmPilot1 f")})
public class FmrmPilot1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FmrmPilot1PK fmrmPilot1PK;
    @Basic(optional = false)
    @Column(name = "APPLY_HOLD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date applyHoldTs;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_CTY_NBR")
    private String netOpisRckCtyNbr;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_SPPLR_NBR")
    private String netOpisRckSpplrNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "NET_FED_TAX_PCT")
    private BigDecimal netFedTaxPct;
    @Basic(optional = false)
    @Column(name = "NET_ST_TAX_PCT")
    private BigDecimal netStTaxPct;
    @Basic(optional = false)
    @Column(name = "NET_TRNSPRT_RT_PCT")
    private BigDecimal netTrnsprtRtPct;
    @Basic(optional = false)
    @Column(name = "NET_MSC_RT_PCT")
    private BigDecimal netMscRtPct;
    @Basic(optional = false)
    @Column(name = "SALES_TAX_PPU")
    private BigDecimal salesTaxPpu;
    @Basic(optional = false)
    @Column(name = "NET_MRCH_MRKUP_PCT")
    private BigDecimal netMrchMrkupPct;
    @Basic(optional = false)
    @Column(name = "NET_PRC_REL_TYP_CD")
    private Character netPrcRelTypCd;
    @Basic(optional = false)
    @Column(name = "NET_ST_SF_RT_PCT")
    private BigDecimal netStSfRtPct;
    @Basic(optional = false)
    @Column(name = "NET_LUST_RT_PCT")
    private BigDecimal netLustRtPct;
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
    @Column(name = "NET_RCK_PRC")
    private BigDecimal netRckPrc;
    @Basic(optional = false)
    @Column(name = "NET_RCK_DT")
    @Temporal(TemporalType.DATE)
    private Date netRckDt;
    @Basic(optional = false)
    @Column(name = "NET_MSC_RT_DESC")
    private String netMscRtDesc;
    @Basic(optional = false)
    @Column(name = "NET_TAX_RT_PCT")
    private BigDecimal netTaxRtPct;
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

    public FmrmPilot1() {
    }

    public FmrmPilot1(FmrmPilot1PK fmrmPilot1PK) {
        this.fmrmPilot1PK = fmrmPilot1PK;
    }

    public FmrmPilot1(FmrmPilot1PK fmrmPilot1PK, Date applyHoldTs, String netOpisRckCtyNbr, String netOpisRckSpplrNbr, BigDecimal netFedTaxPct, BigDecimal netStTaxPct, BigDecimal netTrnsprtRtPct, BigDecimal netMscRtPct, BigDecimal salesTaxPpu, BigDecimal netMrchMrkupPct, Character netPrcRelTypCd, BigDecimal netStSfRtPct, BigDecimal netLustRtPct, Character netTaxAppliesRckFlg, Character netTaxAppliesFedFlg, Character netTaxAppliesStFlg, Character netTaxAppliesSfFlg, Character netTaxAppliesLustFlg, Character netTaxAppliesTrnsprtFlg, Character netTaxAppliesMscFlg, Character netTaxAppliesMrkupFlg, BigDecimal netRckPrc, Date netRckDt, String netMscRtDesc, BigDecimal netTaxRtPct, BigDecimal netTotCstAmt, BigDecimal netCntOffAmt, String netMrchBillCd, Date crtTs, String crtUsr) {
        this.fmrmPilot1PK = fmrmPilot1PK;
        this.applyHoldTs = applyHoldTs;
        this.netOpisRckCtyNbr = netOpisRckCtyNbr;
        this.netOpisRckSpplrNbr = netOpisRckSpplrNbr;
        this.netFedTaxPct = netFedTaxPct;
        this.netStTaxPct = netStTaxPct;
        this.netTrnsprtRtPct = netTrnsprtRtPct;
        this.netMscRtPct = netMscRtPct;
        this.salesTaxPpu = salesTaxPpu;
        this.netMrchMrkupPct = netMrchMrkupPct;
        this.netPrcRelTypCd = netPrcRelTypCd;
        this.netStSfRtPct = netStSfRtPct;
        this.netLustRtPct = netLustRtPct;
        this.netTaxAppliesRckFlg = netTaxAppliesRckFlg;
        this.netTaxAppliesFedFlg = netTaxAppliesFedFlg;
        this.netTaxAppliesStFlg = netTaxAppliesStFlg;
        this.netTaxAppliesSfFlg = netTaxAppliesSfFlg;
        this.netTaxAppliesLustFlg = netTaxAppliesLustFlg;
        this.netTaxAppliesTrnsprtFlg = netTaxAppliesTrnsprtFlg;
        this.netTaxAppliesMscFlg = netTaxAppliesMscFlg;
        this.netTaxAppliesMrkupFlg = netTaxAppliesMrkupFlg;
        this.netRckPrc = netRckPrc;
        this.netRckDt = netRckDt;
        this.netMscRtDesc = netMscRtDesc;
        this.netTaxRtPct = netTaxRtPct;
        this.netTotCstAmt = netTotCstAmt;
        this.netCntOffAmt = netCntOffAmt;
        this.netMrchBillCd = netMrchBillCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
    }

    public FmrmPilot1(String acctNbr, String locCd, String custId, String prdCd, Date effctvDtTs, String pfidCd, String netPrdGrp, Character fndngRltnshpCd) {
        this.fmrmPilot1PK = new FmrmPilot1PK(acctNbr, locCd, custId, prdCd, effctvDtTs, pfidCd, netPrdGrp, fndngRltnshpCd);
    }

    public FmrmPilot1PK getFmrmPilot1PK() {
        return fmrmPilot1PK;
    }

    public void setFmrmPilot1PK(FmrmPilot1PK fmrmPilot1PK) {
        this.fmrmPilot1PK = fmrmPilot1PK;
    }

    public Date getApplyHoldTs() {
        return applyHoldTs;
    }

    public void setApplyHoldTs(Date applyHoldTs) {
        this.applyHoldTs = applyHoldTs;
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

    public BigDecimal getSalesTaxPpu() {
        return salesTaxPpu;
    }

    public void setSalesTaxPpu(BigDecimal salesTaxPpu) {
        this.salesTaxPpu = salesTaxPpu;
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

    public String getNetMscRtDesc() {
        return netMscRtDesc;
    }

    public void setNetMscRtDesc(String netMscRtDesc) {
        this.netMscRtDesc = netMscRtDesc;
    }

    public BigDecimal getNetTaxRtPct() {
        return netTaxRtPct;
    }

    public void setNetTaxRtPct(BigDecimal netTaxRtPct) {
        this.netTaxRtPct = netTaxRtPct;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fmrmPilot1PK != null ? fmrmPilot1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FmrmPilot1)) {
            return false;
        }
        FmrmPilot1 other = (FmrmPilot1) object;
        if ((this.fmrmPilot1PK == null && other.fmrmPilot1PK != null) || (this.fmrmPilot1PK != null && !this.fmrmPilot1PK.equals(other.fmrmPilot1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FmrmPilot1[ fmrmPilot1PK=" + fmrmPilot1PK + " ]";
    }
    
}
