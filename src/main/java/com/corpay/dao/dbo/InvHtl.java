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
@Table(name = "INV_HTL", catalog = "", schema = "DBO")
public class InvHtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvHtlPK invHtlPK;
    @Basic(optional = false)
    @Column(name = "HTL_CR_OR_DB")
    private Character htlCrOrDb;
    @Basic(optional = false)
    @Column(name = "BLNG_TYP")
    private Character blngTyp;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_NBR")
    private String custSrvNbr;
    @Basic(optional = false)
    @Column(name = "ARVL_DT")
    @Temporal(TemporalType.DATE)
    private Date arvlDt;
    @Basic(optional = false)
    @Column(name = "DEPR_DT")
    @Temporal(TemporalType.DATE)
    private Date deprDt;
    @Basic(optional = false)
    @Column(name = "FOLIO_NM")
    private String folioNm;
    @Basic(optional = false)
    @Column(name = "PROP_PH_NBR")
    private String propPhNbr;
    @Basic(optional = false)
    @Column(name = "BLNG_ADJM_IND")
    private Character blngAdjmInd;

    @Basic(optional = false)
    @Column(name = "BLNG_ADJM_AMT")
    private BigDecimal blngAdjmAmt;
    @Basic(optional = false)
    @Column(name = "RM_RT")
    private BigDecimal rmRt;
    @Basic(optional = false)
    @Column(name = "RM_TAX")
    private BigDecimal rmTax;
    @Basic(optional = false)
    @Column(name = "PGM_CD")
    private String pgmCd;
    @Basic(optional = false)
    @Column(name = "PH_CHGS")
    private BigDecimal phChgs;
    @Basic(optional = false)
    @Column(name = "RST_RM_CHGS")
    private BigDecimal rstRmChgs;
    @Basic(optional = false)
    @Column(name = "BAR_MINI_BAR_CHGS")
    private BigDecimal barMiniBarChgs;
    @Basic(optional = false)
    @Column(name = "GIFT_SHOP_CHGS")
    private BigDecimal giftShopChgs;
    @Basic(optional = false)
    @Column(name = "LNDY_DRY_CLN_CHGS")
    private BigDecimal lndyDryClnChgs;
    @Basic(optional = false)
    @Column(name = "OTH_SRVS_CD")
    private String othSrvsCd;
    @Basic(optional = false)
    @Column(name = "OTH_SRVS_CHGS")
    private BigDecimal othSrvsChgs;
    @Basic(optional = false)
    @Column(name = "COM_CD")
    private String comCd;
    @Basic(optional = false)
    @Column(name = "TAX_EXPT_IND")
    private Character taxExptInd;
    @Basic(optional = false)
    @Column(name = "NO_SHOW_IND")
    private Character noShowInd;
    @Basic(optional = false)
    @Column(name = "TOT_ATHD_AMT")
    private BigDecimal totAthdAmt;
    @Basic(optional = false)
    @Column(name = "TOT_TAX_AMT")
    private BigDecimal totTaxAmt;
    @Basic(optional = false)
    @Column(name = "EXT_CHGS")
    private BigDecimal extChgs;
    @Basic(optional = false)
    @Column(name = "OTH_CHGS")
    private BigDecimal othChgs;
    @Basic(optional = false)
    @Column(name = "TOT_RM_NIGHTS")
    private short totRmNights;
    @Basic(optional = false)
    @Column(name = "PP_EXP")
    private BigDecimal ppExp;
    @Basic(optional = false)
    @Column(name = "TOT_NON_RM_TAX_AMT")
    private BigDecimal totNonRmTaxAmt;
    @Basic(optional = false)
    @Column(name = "CASH_ADVS")
    private BigDecimal cashAdvs;
    @Basic(optional = false)
    @Column(name = "VALET_CHGS")
    private BigDecimal valetChgs;
    @Basic(optional = false)
    @Column(name = "MOVIE_CHGS")
    private BigDecimal movieChgs;
    @Basic(optional = false)
    @Column(name = "BUS_CNTR_CHGS")
    private BigDecimal busCntrChgs;
    @Basic(optional = false)
    @Column(name = "HLTH_CLUB_CHGS")
    private BigDecimal hlthClubChgs;
    @Basic(optional = false)
    @Column(name = "FIRE_SFTY_ACT_IND")
    private Character fireSftyActInd;
    @Basic(optional = false)
    @Column(name = "TAX_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date taxTs;
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
    @Column(name = "BLNG_ADJM_AMT_S")
    private Character blngAdjmAmtS;
    @Basic(optional = false)
    @Column(name = "RM_TAX_S")
    private Character rmTaxS;
    @Basic(optional = false)
    @Column(name = "PH_CHGS_S")
    private Character phChgsS;
    @Basic(optional = false)
    @Column(name = "RST_RM_CHGS_S")
    private Character rstRmChgsS;
    @Basic(optional = false)
    @Column(name = "BAR_MINI_BAR_CHGS_S")
    private Character barMiniBarChgsS;
    @Basic(optional = false)
    @Column(name = "GIFT_SHOP_CHGS_S")
    private Character giftShopChgsS;
    @Basic(optional = false)
    @Column(name = "LNDY_DRY_CLN_CHGS_S")
    private Character lndyDryClnChgsS;
    @Basic(optional = false)
    @Column(name = "OTH_SRVS_CHGS_S")
    private Character othSrvsChgsS;
    @Basic(optional = false)
    @Column(name = "TOT_ATHD_AMT_S")
    private Character totAthdAmtS;
    @Basic(optional = false)
    @Column(name = "TOT_TAX_AMT_S")
    private Character totTaxAmtS;
    @Basic(optional = false)
    @Column(name = "PP_EXP_S")
    private Character ppExpS;
    @Basic(optional = false)
    @Column(name = "TOT_NON_RM_TAX_AMT_S")
    private Character totNonRmTaxAmtS;
    @Basic(optional = false)
    @Column(name = "CASH_ADVS_S")
    private Character cashAdvsS;
    @Basic(optional = false)
    @Column(name = "VALET_CHGS_S")
    private Character valetChgsS;
    @Basic(optional = false)
    @Column(name = "MOVIE_CHGS_S")
    private Character movieChgsS;
    @Basic(optional = false)
    @Column(name = "BUS_CNTR_CHGS_S")
    private Character busCntrChgsS;
    @Basic(optional = false)
    @Column(name = "HLTH_CLUB_CHGS_S")
    private Character hlthClubChgsS;
    @Basic(optional = false)
    @Column(name = "LDG_TOT_TXA")
    private BigDecimal ldgTotTxa;
    @Basic(optional = false)
    @Column(name = "LDG_TOT_TXS")
    private Character ldgTotTxs;
    @Basic(optional = false)
    @Column(name = "TAX_CLTN_IND")
    private Character taxCltnInd;
    @Basic(optional = false)
    @Column(name = "CARRIER_CODE")
    private String carrierCode;
    @Basic(optional = false)
    @Column(name = "FLIGHT_NBR")
    private String flightNbr;
    @Basic(optional = false)
    @Column(name = "TOT_CHGS_AM")
    private BigDecimal totChgsAm;
    @Basic(optional = false)
    @Column(name = "TOT_CHGS_SI")
    private Character totChgsSi;
    @Basic(optional = false)
    @Column(name = "TOT_NRCHG_A")
    private BigDecimal totNrchgA;
    @Basic(optional = false)
    @Column(name = "TOT_NRCHG_S")
    private Character totNrchgS;
    @Basic(optional = false)
    @Column(name = "TOT_CHRG_CA")
    private BigDecimal totChrgCa;
    @Basic(optional = false)
    @Column(name = "TOT_CHRG_CS")
    private Character totChrgCs;
    @Basic(optional = false)
    @Column(name = "TRNSP_CHG_A")
    private BigDecimal trnspChgA;
    @Basic(optional = false)
    @Column(name = "TRNSP_CHG_S")
    private Character trnspChgS;
    @Basic(optional = false)
    @Column(name = "GRTY_CHRG_A")
    private BigDecimal grtyChrgA;
    @Basic(optional = false)
    @Column(name = "GRTY_CHRG_S")
    private Character grtyChrgS;
    @Basic(optional = false)
    @Column(name = "CFRM_CHRG_A")
    private BigDecimal cfrmChrgA;
    @Basic(optional = false)
    @Column(name = "CFRM_CHRG_S")
    private Character cfrmChrgS;
    @Basic(optional = false)
    @Column(name = "AUVIS_CHG_A")
    private BigDecimal auvisChgA;
    @Basic(optional = false)
    @Column(name = "AUVIS_CHG_S")
    private Character auvisChgS;
    @Basic(optional = false)
    @Column(name = "BQUT_CHG_A")
    private BigDecimal bqutChgA;
    @Basic(optional = false)
    @Column(name = "BQUT_CHG_S")
    private Character bqutChgS;
    @Basic(optional = false)
    @Column(name = "INTNT_CHG_A")
    private BigDecimal intntChgA;
    @Basic(optional = false)
    @Column(name = "INTNT_CHG_S")
    private Character intntChgS;
    @Basic(optional = false)
    @Column(name = "ELY_DEPR_CA")
    private BigDecimal elyDeprCa;
    @Basic(optional = false)
    @Column(name = "ELY_DEPR_CS")
    private Character elyDeprCs;
    @Basic(optional = false)
    @Column(name = "GUEST_NM")
    private String guestNm;
    @Basic(optional = false)
    @Column(name = "GUEST_NBR")
    private String guestNbr;
    @Basic(optional = false)
    @Column(name = "SRV_CD_1")
    private String srvCd1;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_1")
    private BigDecimal srvChrg1;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_SI_1")
    private Character srvChrgSi1;
    @Basic(optional = false)
    @Column(name = "SRV_CD_2")
    private String srvCd2;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_2")
    private BigDecimal srvChrg2;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_SI_2")
    private Character srvChrgSi2;
    @Basic(optional = false)
    @Column(name = "SRV_CD_3")
    private String srvCd3;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_3")
    private BigDecimal srvChrg3;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_SI_3")
    private Character srvChrgSi3;
    @Basic(optional = false)
    @Column(name = "SRV_CD_4")
    private String srvCd4;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_4")
    private BigDecimal srvChrg4;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_SI_4")
    private Character srvChrgSi4;
    @Basic(optional = false)
    @Column(name = "SRV_CD_5")
    private String srvCd5;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_5")
    private BigDecimal srvChrg5;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_SI_5")
    private Character srvChrgSi5;
    @Basic(optional = false)
    @Column(name = "SRV_CD_6")
    private String srvCd6;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_6")
    private BigDecimal srvChrg6;
    @Basic(optional = false)
    @Column(name = "SRV_CHRG_SI_6")
    private Character srvChrgSi6;
    @Basic(optional = false)
    @Column(name = "RMSRV_CHG_A")
    private BigDecimal rmsrvChgA;
    @Basic(optional = false)
    @Column(name = "RMSRV_CHG_S")
    private Character rmsrvChgS;
    @Basic(optional = false)
    @Column(name = "BAR_CHRG_A")
    private BigDecimal barChrgA;
    @Basic(optional = false)
    @Column(name = "BAR_CHRG_S")
    private Character barChrgS;
    @Basic(optional = false)
    @Column(name = "CUST_VAT_NBR")
    private String custVatNbr;

    public InvHtl() {
    }

    public InvHtl(InvHtlPK invHtlPK) {
        this.invHtlPK = invHtlPK;
    }

    public InvHtl(InvHtlPK invHtlPK, Character htlCrOrDb, Character blngTyp, String custSrvNbr, Date arvlDt, Date deprDt, String folioNm, String propPhNbr, Character blngAdjmInd, BigDecimal blngAdjmAmt, BigDecimal rmRt, BigDecimal rmTax, String pgmCd, BigDecimal phChgs, BigDecimal rstRmChgs, BigDecimal barMiniBarChgs, BigDecimal giftShopChgs, BigDecimal lndyDryClnChgs, String othSrvsCd, BigDecimal othSrvsChgs, String comCd, Character taxExptInd, Character noShowInd, BigDecimal totAthdAmt, BigDecimal totTaxAmt, BigDecimal extChgs, BigDecimal othChgs, short totRmNights, BigDecimal ppExp, BigDecimal totNonRmTaxAmt, BigDecimal cashAdvs, BigDecimal valetChgs, BigDecimal movieChgs, BigDecimal busCntrChgs, BigDecimal hlthClubChgs, Character fireSftyActInd, Date taxTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character blngAdjmAmtS, Character rmTaxS, Character phChgsS, Character rstRmChgsS, Character barMiniBarChgsS, Character giftShopChgsS, Character lndyDryClnChgsS, Character othSrvsChgsS, Character totAthdAmtS, Character totTaxAmtS, Character ppExpS, Character totNonRmTaxAmtS, Character cashAdvsS, Character valetChgsS, Character movieChgsS, Character busCntrChgsS, Character hlthClubChgsS, BigDecimal ldgTotTxa, Character ldgTotTxs, Character taxCltnInd, String carrierCode, String flightNbr, BigDecimal totChgsAm, Character totChgsSi, BigDecimal totNrchgA, Character totNrchgS, BigDecimal totChrgCa, Character totChrgCs, BigDecimal trnspChgA, Character trnspChgS, BigDecimal grtyChrgA, Character grtyChrgS, BigDecimal cfrmChrgA, Character cfrmChrgS, BigDecimal auvisChgA, Character auvisChgS, BigDecimal bqutChgA, Character bqutChgS, BigDecimal intntChgA, Character intntChgS, BigDecimal elyDeprCa, Character elyDeprCs, String guestNm, String guestNbr, String srvCd1, BigDecimal srvChrg1, Character srvChrgSi1, String srvCd2, BigDecimal srvChrg2, Character srvChrgSi2, String srvCd3, BigDecimal srvChrg3, Character srvChrgSi3, String srvCd4, BigDecimal srvChrg4, Character srvChrgSi4, String srvCd5, BigDecimal srvChrg5, Character srvChrgSi5, String srvCd6, BigDecimal srvChrg6, Character srvChrgSi6, BigDecimal rmsrvChgA, Character rmsrvChgS, BigDecimal barChrgA, Character barChrgS, String custVatNbr) {
        this.invHtlPK = invHtlPK;
        this.htlCrOrDb = htlCrOrDb;
        this.blngTyp = blngTyp;
        this.custSrvNbr = custSrvNbr;
        this.arvlDt = arvlDt;
        this.deprDt = deprDt;
        this.folioNm = folioNm;
        this.propPhNbr = propPhNbr;
        this.blngAdjmInd = blngAdjmInd;
        this.blngAdjmAmt = blngAdjmAmt;
        this.rmRt = rmRt;
        this.rmTax = rmTax;
        this.pgmCd = pgmCd;
        this.phChgs = phChgs;
        this.rstRmChgs = rstRmChgs;
        this.barMiniBarChgs = barMiniBarChgs;
        this.giftShopChgs = giftShopChgs;
        this.lndyDryClnChgs = lndyDryClnChgs;
        this.othSrvsCd = othSrvsCd;
        this.othSrvsChgs = othSrvsChgs;
        this.comCd = comCd;
        this.taxExptInd = taxExptInd;
        this.noShowInd = noShowInd;
        this.totAthdAmt = totAthdAmt;
        this.totTaxAmt = totTaxAmt;
        this.extChgs = extChgs;
        this.othChgs = othChgs;
        this.totRmNights = totRmNights;
        this.ppExp = ppExp;
        this.totNonRmTaxAmt = totNonRmTaxAmt;
        this.cashAdvs = cashAdvs;
        this.valetChgs = valetChgs;
        this.movieChgs = movieChgs;
        this.busCntrChgs = busCntrChgs;
        this.hlthClubChgs = hlthClubChgs;
        this.fireSftyActInd = fireSftyActInd;
        this.taxTs = taxTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.blngAdjmAmtS = blngAdjmAmtS;
        this.rmTaxS = rmTaxS;
        this.phChgsS = phChgsS;
        this.rstRmChgsS = rstRmChgsS;
        this.barMiniBarChgsS = barMiniBarChgsS;
        this.giftShopChgsS = giftShopChgsS;
        this.lndyDryClnChgsS = lndyDryClnChgsS;
        this.othSrvsChgsS = othSrvsChgsS;
        this.totAthdAmtS = totAthdAmtS;
        this.totTaxAmtS = totTaxAmtS;
        this.ppExpS = ppExpS;
        this.totNonRmTaxAmtS = totNonRmTaxAmtS;
        this.cashAdvsS = cashAdvsS;
        this.valetChgsS = valetChgsS;
        this.movieChgsS = movieChgsS;
        this.busCntrChgsS = busCntrChgsS;
        this.hlthClubChgsS = hlthClubChgsS;
        this.ldgTotTxa = ldgTotTxa;
        this.ldgTotTxs = ldgTotTxs;
        this.taxCltnInd = taxCltnInd;
        this.carrierCode = carrierCode;
        this.flightNbr = flightNbr;
        this.totChgsAm = totChgsAm;
        this.totChgsSi = totChgsSi;
        this.totNrchgA = totNrchgA;
        this.totNrchgS = totNrchgS;
        this.totChrgCa = totChrgCa;
        this.totChrgCs = totChrgCs;
        this.trnspChgA = trnspChgA;
        this.trnspChgS = trnspChgS;
        this.grtyChrgA = grtyChrgA;
        this.grtyChrgS = grtyChrgS;
        this.cfrmChrgA = cfrmChrgA;
        this.cfrmChrgS = cfrmChrgS;
        this.auvisChgA = auvisChgA;
        this.auvisChgS = auvisChgS;
        this.bqutChgA = bqutChgA;
        this.bqutChgS = bqutChgS;
        this.intntChgA = intntChgA;
        this.intntChgS = intntChgS;
        this.elyDeprCa = elyDeprCa;
        this.elyDeprCs = elyDeprCs;
        this.guestNm = guestNm;
        this.guestNbr = guestNbr;
        this.srvCd1 = srvCd1;
        this.srvChrg1 = srvChrg1;
        this.srvChrgSi1 = srvChrgSi1;
        this.srvCd2 = srvCd2;
        this.srvChrg2 = srvChrg2;
        this.srvChrgSi2 = srvChrgSi2;
        this.srvCd3 = srvCd3;
        this.srvChrg3 = srvChrg3;
        this.srvChrgSi3 = srvChrgSi3;
        this.srvCd4 = srvCd4;
        this.srvChrg4 = srvChrg4;
        this.srvChrgSi4 = srvChrgSi4;
        this.srvCd5 = srvCd5;
        this.srvChrg5 = srvChrg5;
        this.srvChrgSi5 = srvChrgSi5;
        this.srvCd6 = srvCd6;
        this.srvChrg6 = srvChrg6;
        this.srvChrgSi6 = srvChrgSi6;
        this.rmsrvChgA = rmsrvChgA;
        this.rmsrvChgS = rmsrvChgS;
        this.barChrgA = barChrgA;
        this.barChrgS = barChrgS;
        this.custVatNbr = custVatNbr;
    }

    public InvHtl(Date pstdDt, int trnsId) {
        this.invHtlPK = new InvHtlPK(pstdDt, trnsId);
    }

    public InvHtlPK getInvHtlPK() {
        return invHtlPK;
    }

    public void setInvHtlPK(InvHtlPK invHtlPK) {
        this.invHtlPK = invHtlPK;
    }

    public Character getHtlCrOrDb() {
        return htlCrOrDb;
    }

    public void setHtlCrOrDb(Character htlCrOrDb) {
        this.htlCrOrDb = htlCrOrDb;
    }

    public Character getBlngTyp() {
        return blngTyp;
    }

    public void setBlngTyp(Character blngTyp) {
        this.blngTyp = blngTyp;
    }

    public String getCustSrvNbr() {
        return custSrvNbr;
    }

    public void setCustSrvNbr(String custSrvNbr) {
        this.custSrvNbr = custSrvNbr;
    }

    public Date getArvlDt() {
        return arvlDt;
    }

    public void setArvlDt(Date arvlDt) {
        this.arvlDt = arvlDt;
    }

    public Date getDeprDt() {
        return deprDt;
    }

    public void setDeprDt(Date deprDt) {
        this.deprDt = deprDt;
    }

    public String getFolioNm() {
        return folioNm;
    }

    public void setFolioNm(String folioNm) {
        this.folioNm = folioNm;
    }

    public String getPropPhNbr() {
        return propPhNbr;
    }

    public void setPropPhNbr(String propPhNbr) {
        this.propPhNbr = propPhNbr;
    }

    public Character getBlngAdjmInd() {
        return blngAdjmInd;
    }

    public void setBlngAdjmInd(Character blngAdjmInd) {
        this.blngAdjmInd = blngAdjmInd;
    }

    public BigDecimal getBlngAdjmAmt() {
        return blngAdjmAmt;
    }

    public void setBlngAdjmAmt(BigDecimal blngAdjmAmt) {
        this.blngAdjmAmt = blngAdjmAmt;
    }

    public BigDecimal getRmRt() {
        return rmRt;
    }

    public void setRmRt(BigDecimal rmRt) {
        this.rmRt = rmRt;
    }

    public BigDecimal getRmTax() {
        return rmTax;
    }

    public void setRmTax(BigDecimal rmTax) {
        this.rmTax = rmTax;
    }

    public String getPgmCd() {
        return pgmCd;
    }

    public void setPgmCd(String pgmCd) {
        this.pgmCd = pgmCd;
    }

    public BigDecimal getPhChgs() {
        return phChgs;
    }

    public void setPhChgs(BigDecimal phChgs) {
        this.phChgs = phChgs;
    }

    public BigDecimal getRstRmChgs() {
        return rstRmChgs;
    }

    public void setRstRmChgs(BigDecimal rstRmChgs) {
        this.rstRmChgs = rstRmChgs;
    }

    public BigDecimal getBarMiniBarChgs() {
        return barMiniBarChgs;
    }

    public void setBarMiniBarChgs(BigDecimal barMiniBarChgs) {
        this.barMiniBarChgs = barMiniBarChgs;
    }

    public BigDecimal getGiftShopChgs() {
        return giftShopChgs;
    }

    public void setGiftShopChgs(BigDecimal giftShopChgs) {
        this.giftShopChgs = giftShopChgs;
    }

    public BigDecimal getLndyDryClnChgs() {
        return lndyDryClnChgs;
    }

    public void setLndyDryClnChgs(BigDecimal lndyDryClnChgs) {
        this.lndyDryClnChgs = lndyDryClnChgs;
    }

    public String getOthSrvsCd() {
        return othSrvsCd;
    }

    public void setOthSrvsCd(String othSrvsCd) {
        this.othSrvsCd = othSrvsCd;
    }

    public BigDecimal getOthSrvsChgs() {
        return othSrvsChgs;
    }

    public void setOthSrvsChgs(BigDecimal othSrvsChgs) {
        this.othSrvsChgs = othSrvsChgs;
    }

    public String getComCd() {
        return comCd;
    }

    public void setComCd(String comCd) {
        this.comCd = comCd;
    }

    public Character getTaxExptInd() {
        return taxExptInd;
    }

    public void setTaxExptInd(Character taxExptInd) {
        this.taxExptInd = taxExptInd;
    }

    public Character getNoShowInd() {
        return noShowInd;
    }

    public void setNoShowInd(Character noShowInd) {
        this.noShowInd = noShowInd;
    }

    public BigDecimal getTotAthdAmt() {
        return totAthdAmt;
    }

    public void setTotAthdAmt(BigDecimal totAthdAmt) {
        this.totAthdAmt = totAthdAmt;
    }

    public BigDecimal getTotTaxAmt() {
        return totTaxAmt;
    }

    public void setTotTaxAmt(BigDecimal totTaxAmt) {
        this.totTaxAmt = totTaxAmt;
    }

    public BigDecimal getExtChgs() {
        return extChgs;
    }

    public void setExtChgs(BigDecimal extChgs) {
        this.extChgs = extChgs;
    }

    public BigDecimal getOthChgs() {
        return othChgs;
    }

    public void setOthChgs(BigDecimal othChgs) {
        this.othChgs = othChgs;
    }

    public short getTotRmNights() {
        return totRmNights;
    }

    public void setTotRmNights(short totRmNights) {
        this.totRmNights = totRmNights;
    }

    public BigDecimal getPpExp() {
        return ppExp;
    }

    public void setPpExp(BigDecimal ppExp) {
        this.ppExp = ppExp;
    }

    public BigDecimal getTotNonRmTaxAmt() {
        return totNonRmTaxAmt;
    }

    public void setTotNonRmTaxAmt(BigDecimal totNonRmTaxAmt) {
        this.totNonRmTaxAmt = totNonRmTaxAmt;
    }

    public BigDecimal getCashAdvs() {
        return cashAdvs;
    }

    public void setCashAdvs(BigDecimal cashAdvs) {
        this.cashAdvs = cashAdvs;
    }

    public BigDecimal getValetChgs() {
        return valetChgs;
    }

    public void setValetChgs(BigDecimal valetChgs) {
        this.valetChgs = valetChgs;
    }

    public BigDecimal getMovieChgs() {
        return movieChgs;
    }

    public void setMovieChgs(BigDecimal movieChgs) {
        this.movieChgs = movieChgs;
    }

    public BigDecimal getBusCntrChgs() {
        return busCntrChgs;
    }

    public void setBusCntrChgs(BigDecimal busCntrChgs) {
        this.busCntrChgs = busCntrChgs;
    }

    public BigDecimal getHlthClubChgs() {
        return hlthClubChgs;
    }

    public void setHlthClubChgs(BigDecimal hlthClubChgs) {
        this.hlthClubChgs = hlthClubChgs;
    }

    public Character getFireSftyActInd() {
        return fireSftyActInd;
    }

    public void setFireSftyActInd(Character fireSftyActInd) {
        this.fireSftyActInd = fireSftyActInd;
    }

    public Date getTaxTs() {
        return taxTs;
    }

    public void setTaxTs(Date taxTs) {
        this.taxTs = taxTs;
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

    public Character getBlngAdjmAmtS() {
        return blngAdjmAmtS;
    }

    public void setBlngAdjmAmtS(Character blngAdjmAmtS) {
        this.blngAdjmAmtS = blngAdjmAmtS;
    }

    public Character getRmTaxS() {
        return rmTaxS;
    }

    public void setRmTaxS(Character rmTaxS) {
        this.rmTaxS = rmTaxS;
    }

    public Character getPhChgsS() {
        return phChgsS;
    }

    public void setPhChgsS(Character phChgsS) {
        this.phChgsS = phChgsS;
    }

    public Character getRstRmChgsS() {
        return rstRmChgsS;
    }

    public void setRstRmChgsS(Character rstRmChgsS) {
        this.rstRmChgsS = rstRmChgsS;
    }

    public Character getBarMiniBarChgsS() {
        return barMiniBarChgsS;
    }

    public void setBarMiniBarChgsS(Character barMiniBarChgsS) {
        this.barMiniBarChgsS = barMiniBarChgsS;
    }

    public Character getGiftShopChgsS() {
        return giftShopChgsS;
    }

    public void setGiftShopChgsS(Character giftShopChgsS) {
        this.giftShopChgsS = giftShopChgsS;
    }

    public Character getLndyDryClnChgsS() {
        return lndyDryClnChgsS;
    }

    public void setLndyDryClnChgsS(Character lndyDryClnChgsS) {
        this.lndyDryClnChgsS = lndyDryClnChgsS;
    }

    public Character getOthSrvsChgsS() {
        return othSrvsChgsS;
    }

    public void setOthSrvsChgsS(Character othSrvsChgsS) {
        this.othSrvsChgsS = othSrvsChgsS;
    }

    public Character getTotAthdAmtS() {
        return totAthdAmtS;
    }

    public void setTotAthdAmtS(Character totAthdAmtS) {
        this.totAthdAmtS = totAthdAmtS;
    }

    public Character getTotTaxAmtS() {
        return totTaxAmtS;
    }

    public void setTotTaxAmtS(Character totTaxAmtS) {
        this.totTaxAmtS = totTaxAmtS;
    }

    public Character getPpExpS() {
        return ppExpS;
    }

    public void setPpExpS(Character ppExpS) {
        this.ppExpS = ppExpS;
    }

    public Character getTotNonRmTaxAmtS() {
        return totNonRmTaxAmtS;
    }

    public void setTotNonRmTaxAmtS(Character totNonRmTaxAmtS) {
        this.totNonRmTaxAmtS = totNonRmTaxAmtS;
    }

    public Character getCashAdvsS() {
        return cashAdvsS;
    }

    public void setCashAdvsS(Character cashAdvsS) {
        this.cashAdvsS = cashAdvsS;
    }

    public Character getValetChgsS() {
        return valetChgsS;
    }

    public void setValetChgsS(Character valetChgsS) {
        this.valetChgsS = valetChgsS;
    }

    public Character getMovieChgsS() {
        return movieChgsS;
    }

    public void setMovieChgsS(Character movieChgsS) {
        this.movieChgsS = movieChgsS;
    }

    public Character getBusCntrChgsS() {
        return busCntrChgsS;
    }

    public void setBusCntrChgsS(Character busCntrChgsS) {
        this.busCntrChgsS = busCntrChgsS;
    }

    public Character getHlthClubChgsS() {
        return hlthClubChgsS;
    }

    public void setHlthClubChgsS(Character hlthClubChgsS) {
        this.hlthClubChgsS = hlthClubChgsS;
    }

    public BigDecimal getLdgTotTxa() {
        return ldgTotTxa;
    }

    public void setLdgTotTxa(BigDecimal ldgTotTxa) {
        this.ldgTotTxa = ldgTotTxa;
    }

    public Character getLdgTotTxs() {
        return ldgTotTxs;
    }

    public void setLdgTotTxs(Character ldgTotTxs) {
        this.ldgTotTxs = ldgTotTxs;
    }

    public Character getTaxCltnInd() {
        return taxCltnInd;
    }

    public void setTaxCltnInd(Character taxCltnInd) {
        this.taxCltnInd = taxCltnInd;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getFlightNbr() {
        return flightNbr;
    }

    public void setFlightNbr(String flightNbr) {
        this.flightNbr = flightNbr;
    }

    public BigDecimal getTotChgsAm() {
        return totChgsAm;
    }

    public void setTotChgsAm(BigDecimal totChgsAm) {
        this.totChgsAm = totChgsAm;
    }

    public Character getTotChgsSi() {
        return totChgsSi;
    }

    public void setTotChgsSi(Character totChgsSi) {
        this.totChgsSi = totChgsSi;
    }

    public BigDecimal getTotNrchgA() {
        return totNrchgA;
    }

    public void setTotNrchgA(BigDecimal totNrchgA) {
        this.totNrchgA = totNrchgA;
    }

    public Character getTotNrchgS() {
        return totNrchgS;
    }

    public void setTotNrchgS(Character totNrchgS) {
        this.totNrchgS = totNrchgS;
    }

    public BigDecimal getTotChrgCa() {
        return totChrgCa;
    }

    public void setTotChrgCa(BigDecimal totChrgCa) {
        this.totChrgCa = totChrgCa;
    }

    public Character getTotChrgCs() {
        return totChrgCs;
    }

    public void setTotChrgCs(Character totChrgCs) {
        this.totChrgCs = totChrgCs;
    }

    public BigDecimal getTrnspChgA() {
        return trnspChgA;
    }

    public void setTrnspChgA(BigDecimal trnspChgA) {
        this.trnspChgA = trnspChgA;
    }

    public Character getTrnspChgS() {
        return trnspChgS;
    }

    public void setTrnspChgS(Character trnspChgS) {
        this.trnspChgS = trnspChgS;
    }

    public BigDecimal getGrtyChrgA() {
        return grtyChrgA;
    }

    public void setGrtyChrgA(BigDecimal grtyChrgA) {
        this.grtyChrgA = grtyChrgA;
    }

    public Character getGrtyChrgS() {
        return grtyChrgS;
    }

    public void setGrtyChrgS(Character grtyChrgS) {
        this.grtyChrgS = grtyChrgS;
    }

    public BigDecimal getCfrmChrgA() {
        return cfrmChrgA;
    }

    public void setCfrmChrgA(BigDecimal cfrmChrgA) {
        this.cfrmChrgA = cfrmChrgA;
    }

    public Character getCfrmChrgS() {
        return cfrmChrgS;
    }

    public void setCfrmChrgS(Character cfrmChrgS) {
        this.cfrmChrgS = cfrmChrgS;
    }

    public BigDecimal getAuvisChgA() {
        return auvisChgA;
    }

    public void setAuvisChgA(BigDecimal auvisChgA) {
        this.auvisChgA = auvisChgA;
    }

    public Character getAuvisChgS() {
        return auvisChgS;
    }

    public void setAuvisChgS(Character auvisChgS) {
        this.auvisChgS = auvisChgS;
    }

    public BigDecimal getBqutChgA() {
        return bqutChgA;
    }

    public void setBqutChgA(BigDecimal bqutChgA) {
        this.bqutChgA = bqutChgA;
    }

    public Character getBqutChgS() {
        return bqutChgS;
    }

    public void setBqutChgS(Character bqutChgS) {
        this.bqutChgS = bqutChgS;
    }

    public BigDecimal getIntntChgA() {
        return intntChgA;
    }

    public void setIntntChgA(BigDecimal intntChgA) {
        this.intntChgA = intntChgA;
    }

    public Character getIntntChgS() {
        return intntChgS;
    }

    public void setIntntChgS(Character intntChgS) {
        this.intntChgS = intntChgS;
    }

    public BigDecimal getElyDeprCa() {
        return elyDeprCa;
    }

    public void setElyDeprCa(BigDecimal elyDeprCa) {
        this.elyDeprCa = elyDeprCa;
    }

    public Character getElyDeprCs() {
        return elyDeprCs;
    }

    public void setElyDeprCs(Character elyDeprCs) {
        this.elyDeprCs = elyDeprCs;
    }

    public String getGuestNm() {
        return guestNm;
    }

    public void setGuestNm(String guestNm) {
        this.guestNm = guestNm;
    }

    public String getGuestNbr() {
        return guestNbr;
    }

    public void setGuestNbr(String guestNbr) {
        this.guestNbr = guestNbr;
    }

    public String getSrvCd1() {
        return srvCd1;
    }

    public void setSrvCd1(String srvCd1) {
        this.srvCd1 = srvCd1;
    }

    public BigDecimal getSrvChrg1() {
        return srvChrg1;
    }

    public void setSrvChrg1(BigDecimal srvChrg1) {
        this.srvChrg1 = srvChrg1;
    }

    public Character getSrvChrgSi1() {
        return srvChrgSi1;
    }

    public void setSrvChrgSi1(Character srvChrgSi1) {
        this.srvChrgSi1 = srvChrgSi1;
    }

    public String getSrvCd2() {
        return srvCd2;
    }

    public void setSrvCd2(String srvCd2) {
        this.srvCd2 = srvCd2;
    }

    public BigDecimal getSrvChrg2() {
        return srvChrg2;
    }

    public void setSrvChrg2(BigDecimal srvChrg2) {
        this.srvChrg2 = srvChrg2;
    }

    public Character getSrvChrgSi2() {
        return srvChrgSi2;
    }

    public void setSrvChrgSi2(Character srvChrgSi2) {
        this.srvChrgSi2 = srvChrgSi2;
    }

    public String getSrvCd3() {
        return srvCd3;
    }

    public void setSrvCd3(String srvCd3) {
        this.srvCd3 = srvCd3;
    }

    public BigDecimal getSrvChrg3() {
        return srvChrg3;
    }

    public void setSrvChrg3(BigDecimal srvChrg3) {
        this.srvChrg3 = srvChrg3;
    }

    public Character getSrvChrgSi3() {
        return srvChrgSi3;
    }

    public void setSrvChrgSi3(Character srvChrgSi3) {
        this.srvChrgSi3 = srvChrgSi3;
    }

    public String getSrvCd4() {
        return srvCd4;
    }

    public void setSrvCd4(String srvCd4) {
        this.srvCd4 = srvCd4;
    }

    public BigDecimal getSrvChrg4() {
        return srvChrg4;
    }

    public void setSrvChrg4(BigDecimal srvChrg4) {
        this.srvChrg4 = srvChrg4;
    }

    public Character getSrvChrgSi4() {
        return srvChrgSi4;
    }

    public void setSrvChrgSi4(Character srvChrgSi4) {
        this.srvChrgSi4 = srvChrgSi4;
    }

    public String getSrvCd5() {
        return srvCd5;
    }

    public void setSrvCd5(String srvCd5) {
        this.srvCd5 = srvCd5;
    }

    public BigDecimal getSrvChrg5() {
        return srvChrg5;
    }

    public void setSrvChrg5(BigDecimal srvChrg5) {
        this.srvChrg5 = srvChrg5;
    }

    public Character getSrvChrgSi5() {
        return srvChrgSi5;
    }

    public void setSrvChrgSi5(Character srvChrgSi5) {
        this.srvChrgSi5 = srvChrgSi5;
    }

    public String getSrvCd6() {
        return srvCd6;
    }

    public void setSrvCd6(String srvCd6) {
        this.srvCd6 = srvCd6;
    }

    public BigDecimal getSrvChrg6() {
        return srvChrg6;
    }

    public void setSrvChrg6(BigDecimal srvChrg6) {
        this.srvChrg6 = srvChrg6;
    }

    public Character getSrvChrgSi6() {
        return srvChrgSi6;
    }

    public void setSrvChrgSi6(Character srvChrgSi6) {
        this.srvChrgSi6 = srvChrgSi6;
    }

    public BigDecimal getRmsrvChgA() {
        return rmsrvChgA;
    }

    public void setRmsrvChgA(BigDecimal rmsrvChgA) {
        this.rmsrvChgA = rmsrvChgA;
    }

    public Character getRmsrvChgS() {
        return rmsrvChgS;
    }

    public void setRmsrvChgS(Character rmsrvChgS) {
        this.rmsrvChgS = rmsrvChgS;
    }

    public BigDecimal getBarChrgA() {
        return barChrgA;
    }

    public void setBarChrgA(BigDecimal barChrgA) {
        this.barChrgA = barChrgA;
    }

    public Character getBarChrgS() {
        return barChrgS;
    }

    public void setBarChrgS(Character barChrgS) {
        this.barChrgS = barChrgS;
    }

    public String getCustVatNbr() {
        return custVatNbr;
    }

    public void setCustVatNbr(String custVatNbr) {
        this.custVatNbr = custVatNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invHtlPK != null ? invHtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvHtl)) {
            return false;
        }
        InvHtl other = (InvHtl) object;
        if ((this.invHtlPK == null && other.invHtlPK != null) || (this.invHtlPK != null && !this.invHtlPK.equals(other.invHtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvHtl[ invHtlPK=" + invHtlPK + " ]";
    }

}
