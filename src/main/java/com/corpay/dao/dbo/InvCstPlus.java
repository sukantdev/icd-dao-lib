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
@Table(name = "INV_CST_PLUS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvCstPlus.findAll", query = "SELECT i FROM InvCstPlus i")})
public class InvCstPlus implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvCstPlusPK invCstPlusPK;
    @Basic(optional = false)
    @Column(name = "RACK_TYP")
    private Character rackTyp;
    @Basic(optional = false)
    @Column(name = "OPIS_RACK_CITY_NBR")
    private String opisRackCityNbr;
    @Basic(optional = false)
    @Column(name = "OPIS_SUPL_NBR")
    private String opisSuplNbr;
    @Basic(optional = false)
    @Column(name = "OPIS_RACK_CITY_DES")
    private String opisRackCityDes;
    @Basic(optional = false)
    @Column(name = "OPIS_RACK_ST")
    private String opisRackSt;
    @Basic(optional = false)
    @Column(name = "OPIS_SUPL_NM")
    private String opisSuplNm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "RACK_PPU_DSL2")
    private BigDecimal rackPpuDsl2;
    @Basic(optional = false)
    @Column(name = "RACK_PPU_DSL1")
    private BigDecimal rackPpuDsl1;
    @Basic(optional = false)
    @Column(name = "RACK_DT")
    @Temporal(TemporalType.DATE)
    private Date rackDt;
    @Basic(optional = false)
    @Column(name = "AUTO_TRNS")
    private Character autoTrns;
    @Basic(optional = false)
    @Column(name = "DSL_FED_TAX_PPU")
    private BigDecimal dslFedTaxPpu;
    @Basic(optional = false)
    @Column(name = "DSL_ST_TAX_PPU")
    private BigDecimal dslStTaxPpu;
    @Basic(optional = false)
    @Column(name = "DSL_ST_SFUND_RT_PP")
    private BigDecimal dslStSfundRtPp;
    @Basic(optional = false)
    @Column(name = "DSL_LUST_RT_PPU")
    private BigDecimal dslLustRtPpu;
    @Basic(optional = false)
    @Column(name = "DSL_TRANS_RT_PPU")
    private BigDecimal dslTransRtPpu;
    @Basic(optional = false)
    @Column(name = "DSL_MISC_RT_PPU")
    private BigDecimal dslMiscRtPpu;
    @Basic(optional = false)
    @Column(name = "NHWY_FED_TAX_PPU")
    private BigDecimal nhwyFedTaxPpu;
    @Basic(optional = false)
    @Column(name = "NHWY_ST_TAX_PPU")
    private BigDecimal nhwyStTaxPpu;
    @Basic(optional = false)
    @Column(name = "NHWY_ST_SFUND_PPU")
    private BigDecimal nhwyStSfundPpu;
    @Basic(optional = false)
    @Column(name = "NHWY_LUST_RT_PPU")
    private BigDecimal nhwyLustRtPpu;
    @Basic(optional = false)
    @Column(name = "NHWY_TRANS_RT_PPU")
    private BigDecimal nhwyTransRtPpu;
    @Basic(optional = false)
    @Column(name = "NHWY_MISC_RT_PPU")
    private BigDecimal nhwyMiscRtPpu;
    @Basic(optional = false)
    @Column(name = "DSL_TAX_APPL_RACK")
    private Character dslTaxApplRack;
    @Basic(optional = false)
    @Column(name = "DSL_TAX_APPL_FED")
    private Character dslTaxApplFed;
    @Basic(optional = false)
    @Column(name = "DSL_TAX_APPL_ST_TA")
    private Character dslTaxApplStTa;
    @Basic(optional = false)
    @Column(name = "DSL_TAX_APPL_SFUND")
    private Character dslTaxApplSfund;
    @Basic(optional = false)
    @Column(name = "DSL_TAX_APPL_LUST")
    private Character dslTaxApplLust;
    @Basic(optional = false)
    @Column(name = "DSL_TAX_APPL_TRANS")
    private Character dslTaxApplTrans;
    @Basic(optional = false)
    @Column(name = "DSL_TAX_APPL_MISC")
    private Character dslTaxApplMisc;
    @Basic(optional = false)
    @Column(name = "DSL_TAX_APPL_MKUP")
    private Character dslTaxApplMkup;
    @Basic(optional = false)
    @Column(name = "NHWY_TAX_APPL_RACK")
    private Character nhwyTaxApplRack;
    @Basic(optional = false)
    @Column(name = "NHWY_TAX_APPL_FED")
    private Character nhwyTaxApplFed;
    @Basic(optional = false)
    @Column(name = "NHWY_TAX_APPL_ST")
    private Character nhwyTaxApplSt;
    @Basic(optional = false)
    @Column(name = "NHWY_TAX_APPL_SFUN")
    private Character nhwyTaxApplSfun;
    @Basic(optional = false)
    @Column(name = "NHWY_TAX_APPL_LUST")
    private Character nhwyTaxApplLust;
    @Basic(optional = false)
    @Column(name = "NHWY_TAX_APPL_TRAN")
    private Character nhwyTaxApplTran;
    @Basic(optional = false)
    @Column(name = "NHWY_TAX_APPL_MISC")
    private Character nhwyTaxApplMisc;
    @Basic(optional = false)
    @Column(name = "NHWY_TAX_APPL_MARK")
    private Character nhwyTaxApplMark;
    @Basic(optional = false)
    @Column(name = "DSL_SALES_TAX_PCT")
    private BigDecimal dslSalesTaxPct;
    @Basic(optional = false)
    @Column(name = "NHWY_SLS_TAX_PCT")
    private BigDecimal nhwySlsTaxPct;
    @Basic(optional = false)
    @Column(name = "MISC_RT_DESC")
    private String miscRtDesc;
    @Basic(optional = false)
    @Column(name = "OTH_MKUP_PPU")
    private BigDecimal othMkupPpu;
    @Basic(optional = false)
    @Column(name = "TS_MKUP_PPU")
    private BigDecimal tsMkupPpu;
    @Basic(optional = false)
    @Column(name = "RLSHP_TYP")
    private Character rlshpTyp;
    @Basic(optional = false)
    @Column(name = "DSL2_CP_PPU")
    private BigDecimal dsl2CpPpu;
    @Basic(optional = false)
    @Column(name = "DSL1_CP_PPU")
    private BigDecimal dsl1CpPpu;
    @Basic(optional = false)
    @Column(name = "NHWY_CP_PPU")
    private BigDecimal nhwyCpPpu;
    @Basic(optional = false)
    @Column(name = "DSL2_TOT_CP_PPU")
    private BigDecimal dsl2TotCpPpu;
    @Basic(optional = false)
    @Column(name = "DSL1_TOT_CP_PPU")
    private BigDecimal dsl1TotCpPpu;
    @Basic(optional = false)
    @Column(name = "NHWY_TOT_CP_PPU")
    private BigDecimal nhwyTotCpPpu;
    @Basic(optional = false)
    @Column(name = "DSL2_RETAIL_PPU")
    private BigDecimal dsl2RetailPpu;
    @Basic(optional = false)
    @Column(name = "DSL1_RETAIL_PPU")
    private BigDecimal dsl1RetailPpu;
    @Basic(optional = false)
    @Column(name = "NHWY_RTL_PPU")
    private BigDecimal nhwyRtlPpu;
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

    public InvCstPlus() {
    }

    public InvCstPlus(InvCstPlusPK invCstPlusPK) {
        this.invCstPlusPK = invCstPlusPK;
    }

    public InvCstPlus(InvCstPlusPK invCstPlusPK, Character rackTyp, String opisRackCityNbr, String opisSuplNbr, String opisRackCityDes, String opisRackSt, String opisSuplNm, BigDecimal rackPpuDsl2, BigDecimal rackPpuDsl1, Date rackDt, Character autoTrns, BigDecimal dslFedTaxPpu, BigDecimal dslStTaxPpu, BigDecimal dslStSfundRtPp, BigDecimal dslLustRtPpu, BigDecimal dslTransRtPpu, BigDecimal dslMiscRtPpu, BigDecimal nhwyFedTaxPpu, BigDecimal nhwyStTaxPpu, BigDecimal nhwyStSfundPpu, BigDecimal nhwyLustRtPpu, BigDecimal nhwyTransRtPpu, BigDecimal nhwyMiscRtPpu, Character dslTaxApplRack, Character dslTaxApplFed, Character dslTaxApplStTa, Character dslTaxApplSfund, Character dslTaxApplLust, Character dslTaxApplTrans, Character dslTaxApplMisc, Character dslTaxApplMkup, Character nhwyTaxApplRack, Character nhwyTaxApplFed, Character nhwyTaxApplSt, Character nhwyTaxApplSfun, Character nhwyTaxApplLust, Character nhwyTaxApplTran, Character nhwyTaxApplMisc, Character nhwyTaxApplMark, BigDecimal dslSalesTaxPct, BigDecimal nhwySlsTaxPct, String miscRtDesc, BigDecimal othMkupPpu, BigDecimal tsMkupPpu, Character rlshpTyp, BigDecimal dsl2CpPpu, BigDecimal dsl1CpPpu, BigDecimal nhwyCpPpu, BigDecimal dsl2TotCpPpu, BigDecimal dsl1TotCpPpu, BigDecimal nhwyTotCpPpu, BigDecimal dsl2RetailPpu, BigDecimal dsl1RetailPpu, BigDecimal nhwyRtlPpu, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invCstPlusPK = invCstPlusPK;
        this.rackTyp = rackTyp;
        this.opisRackCityNbr = opisRackCityNbr;
        this.opisSuplNbr = opisSuplNbr;
        this.opisRackCityDes = opisRackCityDes;
        this.opisRackSt = opisRackSt;
        this.opisSuplNm = opisSuplNm;
        this.rackPpuDsl2 = rackPpuDsl2;
        this.rackPpuDsl1 = rackPpuDsl1;
        this.rackDt = rackDt;
        this.autoTrns = autoTrns;
        this.dslFedTaxPpu = dslFedTaxPpu;
        this.dslStTaxPpu = dslStTaxPpu;
        this.dslStSfundRtPp = dslStSfundRtPp;
        this.dslLustRtPpu = dslLustRtPpu;
        this.dslTransRtPpu = dslTransRtPpu;
        this.dslMiscRtPpu = dslMiscRtPpu;
        this.nhwyFedTaxPpu = nhwyFedTaxPpu;
        this.nhwyStTaxPpu = nhwyStTaxPpu;
        this.nhwyStSfundPpu = nhwyStSfundPpu;
        this.nhwyLustRtPpu = nhwyLustRtPpu;
        this.nhwyTransRtPpu = nhwyTransRtPpu;
        this.nhwyMiscRtPpu = nhwyMiscRtPpu;
        this.dslTaxApplRack = dslTaxApplRack;
        this.dslTaxApplFed = dslTaxApplFed;
        this.dslTaxApplStTa = dslTaxApplStTa;
        this.dslTaxApplSfund = dslTaxApplSfund;
        this.dslTaxApplLust = dslTaxApplLust;
        this.dslTaxApplTrans = dslTaxApplTrans;
        this.dslTaxApplMisc = dslTaxApplMisc;
        this.dslTaxApplMkup = dslTaxApplMkup;
        this.nhwyTaxApplRack = nhwyTaxApplRack;
        this.nhwyTaxApplFed = nhwyTaxApplFed;
        this.nhwyTaxApplSt = nhwyTaxApplSt;
        this.nhwyTaxApplSfun = nhwyTaxApplSfun;
        this.nhwyTaxApplLust = nhwyTaxApplLust;
        this.nhwyTaxApplTran = nhwyTaxApplTran;
        this.nhwyTaxApplMisc = nhwyTaxApplMisc;
        this.nhwyTaxApplMark = nhwyTaxApplMark;
        this.dslSalesTaxPct = dslSalesTaxPct;
        this.nhwySlsTaxPct = nhwySlsTaxPct;
        this.miscRtDesc = miscRtDesc;
        this.othMkupPpu = othMkupPpu;
        this.tsMkupPpu = tsMkupPpu;
        this.rlshpTyp = rlshpTyp;
        this.dsl2CpPpu = dsl2CpPpu;
        this.dsl1CpPpu = dsl1CpPpu;
        this.nhwyCpPpu = nhwyCpPpu;
        this.dsl2TotCpPpu = dsl2TotCpPpu;
        this.dsl1TotCpPpu = dsl1TotCpPpu;
        this.nhwyTotCpPpu = nhwyTotCpPpu;
        this.dsl2RetailPpu = dsl2RetailPpu;
        this.dsl1RetailPpu = dsl1RetailPpu;
        this.nhwyRtlPpu = nhwyRtlPpu;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvCstPlus(Date pstdDt, int trnsId) {
        this.invCstPlusPK = new InvCstPlusPK(pstdDt, trnsId);
    }

    public InvCstPlusPK getInvCstPlusPK() {
        return invCstPlusPK;
    }

    public void setInvCstPlusPK(InvCstPlusPK invCstPlusPK) {
        this.invCstPlusPK = invCstPlusPK;
    }

    public Character getRackTyp() {
        return rackTyp;
    }

    public void setRackTyp(Character rackTyp) {
        this.rackTyp = rackTyp;
    }

    public String getOpisRackCityNbr() {
        return opisRackCityNbr;
    }

    public void setOpisRackCityNbr(String opisRackCityNbr) {
        this.opisRackCityNbr = opisRackCityNbr;
    }

    public String getOpisSuplNbr() {
        return opisSuplNbr;
    }

    public void setOpisSuplNbr(String opisSuplNbr) {
        this.opisSuplNbr = opisSuplNbr;
    }

    public String getOpisRackCityDes() {
        return opisRackCityDes;
    }

    public void setOpisRackCityDes(String opisRackCityDes) {
        this.opisRackCityDes = opisRackCityDes;
    }

    public String getOpisRackSt() {
        return opisRackSt;
    }

    public void setOpisRackSt(String opisRackSt) {
        this.opisRackSt = opisRackSt;
    }

    public String getOpisSuplNm() {
        return opisSuplNm;
    }

    public void setOpisSuplNm(String opisSuplNm) {
        this.opisSuplNm = opisSuplNm;
    }

    public BigDecimal getRackPpuDsl2() {
        return rackPpuDsl2;
    }

    public void setRackPpuDsl2(BigDecimal rackPpuDsl2) {
        this.rackPpuDsl2 = rackPpuDsl2;
    }

    public BigDecimal getRackPpuDsl1() {
        return rackPpuDsl1;
    }

    public void setRackPpuDsl1(BigDecimal rackPpuDsl1) {
        this.rackPpuDsl1 = rackPpuDsl1;
    }

    public Date getRackDt() {
        return rackDt;
    }

    public void setRackDt(Date rackDt) {
        this.rackDt = rackDt;
    }

    public Character getAutoTrns() {
        return autoTrns;
    }

    public void setAutoTrns(Character autoTrns) {
        this.autoTrns = autoTrns;
    }

    public BigDecimal getDslFedTaxPpu() {
        return dslFedTaxPpu;
    }

    public void setDslFedTaxPpu(BigDecimal dslFedTaxPpu) {
        this.dslFedTaxPpu = dslFedTaxPpu;
    }

    public BigDecimal getDslStTaxPpu() {
        return dslStTaxPpu;
    }

    public void setDslStTaxPpu(BigDecimal dslStTaxPpu) {
        this.dslStTaxPpu = dslStTaxPpu;
    }

    public BigDecimal getDslStSfundRtPp() {
        return dslStSfundRtPp;
    }

    public void setDslStSfundRtPp(BigDecimal dslStSfundRtPp) {
        this.dslStSfundRtPp = dslStSfundRtPp;
    }

    public BigDecimal getDslLustRtPpu() {
        return dslLustRtPpu;
    }

    public void setDslLustRtPpu(BigDecimal dslLustRtPpu) {
        this.dslLustRtPpu = dslLustRtPpu;
    }

    public BigDecimal getDslTransRtPpu() {
        return dslTransRtPpu;
    }

    public void setDslTransRtPpu(BigDecimal dslTransRtPpu) {
        this.dslTransRtPpu = dslTransRtPpu;
    }

    public BigDecimal getDslMiscRtPpu() {
        return dslMiscRtPpu;
    }

    public void setDslMiscRtPpu(BigDecimal dslMiscRtPpu) {
        this.dslMiscRtPpu = dslMiscRtPpu;
    }

    public BigDecimal getNhwyFedTaxPpu() {
        return nhwyFedTaxPpu;
    }

    public void setNhwyFedTaxPpu(BigDecimal nhwyFedTaxPpu) {
        this.nhwyFedTaxPpu = nhwyFedTaxPpu;
    }

    public BigDecimal getNhwyStTaxPpu() {
        return nhwyStTaxPpu;
    }

    public void setNhwyStTaxPpu(BigDecimal nhwyStTaxPpu) {
        this.nhwyStTaxPpu = nhwyStTaxPpu;
    }

    public BigDecimal getNhwyStSfundPpu() {
        return nhwyStSfundPpu;
    }

    public void setNhwyStSfundPpu(BigDecimal nhwyStSfundPpu) {
        this.nhwyStSfundPpu = nhwyStSfundPpu;
    }

    public BigDecimal getNhwyLustRtPpu() {
        return nhwyLustRtPpu;
    }

    public void setNhwyLustRtPpu(BigDecimal nhwyLustRtPpu) {
        this.nhwyLustRtPpu = nhwyLustRtPpu;
    }

    public BigDecimal getNhwyTransRtPpu() {
        return nhwyTransRtPpu;
    }

    public void setNhwyTransRtPpu(BigDecimal nhwyTransRtPpu) {
        this.nhwyTransRtPpu = nhwyTransRtPpu;
    }

    public BigDecimal getNhwyMiscRtPpu() {
        return nhwyMiscRtPpu;
    }

    public void setNhwyMiscRtPpu(BigDecimal nhwyMiscRtPpu) {
        this.nhwyMiscRtPpu = nhwyMiscRtPpu;
    }

    public Character getDslTaxApplRack() {
        return dslTaxApplRack;
    }

    public void setDslTaxApplRack(Character dslTaxApplRack) {
        this.dslTaxApplRack = dslTaxApplRack;
    }

    public Character getDslTaxApplFed() {
        return dslTaxApplFed;
    }

    public void setDslTaxApplFed(Character dslTaxApplFed) {
        this.dslTaxApplFed = dslTaxApplFed;
    }

    public Character getDslTaxApplStTa() {
        return dslTaxApplStTa;
    }

    public void setDslTaxApplStTa(Character dslTaxApplStTa) {
        this.dslTaxApplStTa = dslTaxApplStTa;
    }

    public Character getDslTaxApplSfund() {
        return dslTaxApplSfund;
    }

    public void setDslTaxApplSfund(Character dslTaxApplSfund) {
        this.dslTaxApplSfund = dslTaxApplSfund;
    }

    public Character getDslTaxApplLust() {
        return dslTaxApplLust;
    }

    public void setDslTaxApplLust(Character dslTaxApplLust) {
        this.dslTaxApplLust = dslTaxApplLust;
    }

    public Character getDslTaxApplTrans() {
        return dslTaxApplTrans;
    }

    public void setDslTaxApplTrans(Character dslTaxApplTrans) {
        this.dslTaxApplTrans = dslTaxApplTrans;
    }

    public Character getDslTaxApplMisc() {
        return dslTaxApplMisc;
    }

    public void setDslTaxApplMisc(Character dslTaxApplMisc) {
        this.dslTaxApplMisc = dslTaxApplMisc;
    }

    public Character getDslTaxApplMkup() {
        return dslTaxApplMkup;
    }

    public void setDslTaxApplMkup(Character dslTaxApplMkup) {
        this.dslTaxApplMkup = dslTaxApplMkup;
    }

    public Character getNhwyTaxApplRack() {
        return nhwyTaxApplRack;
    }

    public void setNhwyTaxApplRack(Character nhwyTaxApplRack) {
        this.nhwyTaxApplRack = nhwyTaxApplRack;
    }

    public Character getNhwyTaxApplFed() {
        return nhwyTaxApplFed;
    }

    public void setNhwyTaxApplFed(Character nhwyTaxApplFed) {
        this.nhwyTaxApplFed = nhwyTaxApplFed;
    }

    public Character getNhwyTaxApplSt() {
        return nhwyTaxApplSt;
    }

    public void setNhwyTaxApplSt(Character nhwyTaxApplSt) {
        this.nhwyTaxApplSt = nhwyTaxApplSt;
    }

    public Character getNhwyTaxApplSfun() {
        return nhwyTaxApplSfun;
    }

    public void setNhwyTaxApplSfun(Character nhwyTaxApplSfun) {
        this.nhwyTaxApplSfun = nhwyTaxApplSfun;
    }

    public Character getNhwyTaxApplLust() {
        return nhwyTaxApplLust;
    }

    public void setNhwyTaxApplLust(Character nhwyTaxApplLust) {
        this.nhwyTaxApplLust = nhwyTaxApplLust;
    }

    public Character getNhwyTaxApplTran() {
        return nhwyTaxApplTran;
    }

    public void setNhwyTaxApplTran(Character nhwyTaxApplTran) {
        this.nhwyTaxApplTran = nhwyTaxApplTran;
    }

    public Character getNhwyTaxApplMisc() {
        return nhwyTaxApplMisc;
    }

    public void setNhwyTaxApplMisc(Character nhwyTaxApplMisc) {
        this.nhwyTaxApplMisc = nhwyTaxApplMisc;
    }

    public Character getNhwyTaxApplMark() {
        return nhwyTaxApplMark;
    }

    public void setNhwyTaxApplMark(Character nhwyTaxApplMark) {
        this.nhwyTaxApplMark = nhwyTaxApplMark;
    }

    public BigDecimal getDslSalesTaxPct() {
        return dslSalesTaxPct;
    }

    public void setDslSalesTaxPct(BigDecimal dslSalesTaxPct) {
        this.dslSalesTaxPct = dslSalesTaxPct;
    }

    public BigDecimal getNhwySlsTaxPct() {
        return nhwySlsTaxPct;
    }

    public void setNhwySlsTaxPct(BigDecimal nhwySlsTaxPct) {
        this.nhwySlsTaxPct = nhwySlsTaxPct;
    }

    public String getMiscRtDesc() {
        return miscRtDesc;
    }

    public void setMiscRtDesc(String miscRtDesc) {
        this.miscRtDesc = miscRtDesc;
    }

    public BigDecimal getOthMkupPpu() {
        return othMkupPpu;
    }

    public void setOthMkupPpu(BigDecimal othMkupPpu) {
        this.othMkupPpu = othMkupPpu;
    }

    public BigDecimal getTsMkupPpu() {
        return tsMkupPpu;
    }

    public void setTsMkupPpu(BigDecimal tsMkupPpu) {
        this.tsMkupPpu = tsMkupPpu;
    }

    public Character getRlshpTyp() {
        return rlshpTyp;
    }

    public void setRlshpTyp(Character rlshpTyp) {
        this.rlshpTyp = rlshpTyp;
    }

    public BigDecimal getDsl2CpPpu() {
        return dsl2CpPpu;
    }

    public void setDsl2CpPpu(BigDecimal dsl2CpPpu) {
        this.dsl2CpPpu = dsl2CpPpu;
    }

    public BigDecimal getDsl1CpPpu() {
        return dsl1CpPpu;
    }

    public void setDsl1CpPpu(BigDecimal dsl1CpPpu) {
        this.dsl1CpPpu = dsl1CpPpu;
    }

    public BigDecimal getNhwyCpPpu() {
        return nhwyCpPpu;
    }

    public void setNhwyCpPpu(BigDecimal nhwyCpPpu) {
        this.nhwyCpPpu = nhwyCpPpu;
    }

    public BigDecimal getDsl2TotCpPpu() {
        return dsl2TotCpPpu;
    }

    public void setDsl2TotCpPpu(BigDecimal dsl2TotCpPpu) {
        this.dsl2TotCpPpu = dsl2TotCpPpu;
    }

    public BigDecimal getDsl1TotCpPpu() {
        return dsl1TotCpPpu;
    }

    public void setDsl1TotCpPpu(BigDecimal dsl1TotCpPpu) {
        this.dsl1TotCpPpu = dsl1TotCpPpu;
    }

    public BigDecimal getNhwyTotCpPpu() {
        return nhwyTotCpPpu;
    }

    public void setNhwyTotCpPpu(BigDecimal nhwyTotCpPpu) {
        this.nhwyTotCpPpu = nhwyTotCpPpu;
    }

    public BigDecimal getDsl2RetailPpu() {
        return dsl2RetailPpu;
    }

    public void setDsl2RetailPpu(BigDecimal dsl2RetailPpu) {
        this.dsl2RetailPpu = dsl2RetailPpu;
    }

    public BigDecimal getDsl1RetailPpu() {
        return dsl1RetailPpu;
    }

    public void setDsl1RetailPpu(BigDecimal dsl1RetailPpu) {
        this.dsl1RetailPpu = dsl1RetailPpu;
    }

    public BigDecimal getNhwyRtlPpu() {
        return nhwyRtlPpu;
    }

    public void setNhwyRtlPpu(BigDecimal nhwyRtlPpu) {
        this.nhwyRtlPpu = nhwyRtlPpu;
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
        hash += (invCstPlusPK != null ? invCstPlusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvCstPlus)) {
            return false;
        }
        InvCstPlus other = (InvCstPlus) object;
        if ((this.invCstPlusPK == null && other.invCstPlusPK != null) || (this.invCstPlusPK != null && !this.invCstPlusPK.equals(other.invCstPlusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvCstPlus[ invCstPlusPK=" + invCstPlusPK + " ]";
    }
    
}
