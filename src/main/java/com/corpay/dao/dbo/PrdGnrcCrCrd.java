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
@Table(name = "PRD_GNRC_CR_CRD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdGnrcCrCrd.findAll", query = "SELECT p FROM PrdGnrcCrCrd p")})
public class PrdGnrcCrCrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdGnrcCrCrdPK prdGnrcCrCrdPK;
    @Basic(optional = false)
    @Column(name = "BLNG_MTHD")
    private String blngMthd;
    @Basic(optional = false)
    @Column(name = "MTHLY_FNDD_GALS")
    private int mthlyFnddGals;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "AVG_GAL_FILL")
    private BigDecimal avgGalFill;
    @Basic(optional = false)
    @Column(name = "ACT_CRD_CNT")
    private long actCrdCnt;
    @Basic(optional = false)
    @Column(name = "GNRC_CR_CRD_FEE")
    private BigDecimal gnrcCrCrdFee;
    @Basic(optional = false)
    @Column(name = "FEE_W_CASH")
    private BigDecimal feeWCash;
    @Basic(optional = false)
    @Column(name = "CASH_ONLY")
    private BigDecimal cashOnly;
    @Basic(optional = false)
    @Column(name = "STRP_RDR")
    private BigDecimal strpRdr;
    @Basic(optional = false)
    @Column(name = "STRP_RDR_W_PRTR")
    private BigDecimal strpRdrWPrtr;
    @Basic(optional = false)
    @Column(name = "UNIT_CNT")
    private int unitCnt;
    @Basic(optional = false)
    @Column(name = "UNIT_W_PRTR")
    private int unitWPrtr;
    @Basic(optional = false)
    @Column(name = "FL_NTWK_FLG")
    private int flNtwkFlg;
    @Basic(optional = false)
    @Column(name = "NTWK_STAT_FLG")
    private Character ntwkStatFlg;
    @Basic(optional = false)
    @Column(name = "CSTM_FEE_FLG")
    private Character cstmFeeFlg;
    @Basic(optional = false)
    @Column(name = "FL_PCHS_LMT")
    private BigDecimal flPchsLmt;
    @Basic(optional = false)
    @Column(name = "DLY_FL_FLG")
    private Character dlyFlFlg;
    @Basic(optional = false)
    @Column(name = "DLY_FL_AMT")
    private BigDecimal dlyFlAmt;
    @Basic(optional = false)
    @Column(name = "ONE_TM_FL_FLG")
    private Character oneTmFlFlg;
    @Basic(optional = false)
    @Column(name = "FL_GAL_LMT")
    private BigDecimal flGalLmt;
    @Basic(optional = false)
    @Column(name = "RCRNG_FL_FLG")
    private short rcrngFlFlg;
    @Basic(optional = false)
    @Column(name = "RCRNG_FL_AMT")
    private BigDecimal rcrngFlAmt;
    @Basic(optional = false)
    @Column(name = "CASH_LMT")
    private BigDecimal cashLmt;
    @Basic(optional = false)
    @Column(name = "DLY_CASH_FLG")
    private Character dlyCashFlg;
    @Basic(optional = false)
    @Column(name = "DLY_CASH_AMT")
    private BigDecimal dlyCashAmt;
    @Basic(optional = false)
    @Column(name = "ONE_TM_CASH_FLG")
    private Character oneTmCashFlg;
    @Basic(optional = false)
    @Column(name = "RCRNG_CASH_FLG")
    private short rcrngCashFlg;
    @Basic(optional = false)
    @Column(name = "RCRNG_CASH_AMT")
    private BigDecimal rcrngCashAmt;
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

    public PrdGnrcCrCrd() {
    }

    public PrdGnrcCrCrd(PrdGnrcCrCrdPK prdGnrcCrCrdPK) {
        this.prdGnrcCrCrdPK = prdGnrcCrCrdPK;
    }

    public PrdGnrcCrCrd(PrdGnrcCrCrdPK prdGnrcCrCrdPK, String blngMthd, int mthlyFnddGals, BigDecimal avgGalFill, long actCrdCnt, BigDecimal gnrcCrCrdFee, BigDecimal feeWCash, BigDecimal cashOnly, BigDecimal strpRdr, BigDecimal strpRdrWPrtr, int unitCnt, int unitWPrtr, int flNtwkFlg, Character ntwkStatFlg, Character cstmFeeFlg, BigDecimal flPchsLmt, Character dlyFlFlg, BigDecimal dlyFlAmt, Character oneTmFlFlg, BigDecimal flGalLmt, short rcrngFlFlg, BigDecimal rcrngFlAmt, BigDecimal cashLmt, Character dlyCashFlg, BigDecimal dlyCashAmt, Character oneTmCashFlg, short rcrngCashFlg, BigDecimal rcrngCashAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdGnrcCrCrdPK = prdGnrcCrCrdPK;
        this.blngMthd = blngMthd;
        this.mthlyFnddGals = mthlyFnddGals;
        this.avgGalFill = avgGalFill;
        this.actCrdCnt = actCrdCnt;
        this.gnrcCrCrdFee = gnrcCrCrdFee;
        this.feeWCash = feeWCash;
        this.cashOnly = cashOnly;
        this.strpRdr = strpRdr;
        this.strpRdrWPrtr = strpRdrWPrtr;
        this.unitCnt = unitCnt;
        this.unitWPrtr = unitWPrtr;
        this.flNtwkFlg = flNtwkFlg;
        this.ntwkStatFlg = ntwkStatFlg;
        this.cstmFeeFlg = cstmFeeFlg;
        this.flPchsLmt = flPchsLmt;
        this.dlyFlFlg = dlyFlFlg;
        this.dlyFlAmt = dlyFlAmt;
        this.oneTmFlFlg = oneTmFlFlg;
        this.flGalLmt = flGalLmt;
        this.rcrngFlFlg = rcrngFlFlg;
        this.rcrngFlAmt = rcrngFlAmt;
        this.cashLmt = cashLmt;
        this.dlyCashFlg = dlyCashFlg;
        this.dlyCashAmt = dlyCashAmt;
        this.oneTmCashFlg = oneTmCashFlg;
        this.rcrngCashFlg = rcrngCashFlg;
        this.rcrngCashAmt = rcrngCashAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdGnrcCrCrd(String applNbr, String childTyp) {
        this.prdGnrcCrCrdPK = new PrdGnrcCrCrdPK(applNbr, childTyp);
    }

    public PrdGnrcCrCrdPK getPrdGnrcCrCrdPK() {
        return prdGnrcCrCrdPK;
    }

    public void setPrdGnrcCrCrdPK(PrdGnrcCrCrdPK prdGnrcCrCrdPK) {
        this.prdGnrcCrCrdPK = prdGnrcCrCrdPK;
    }

    public String getBlngMthd() {
        return blngMthd;
    }

    public void setBlngMthd(String blngMthd) {
        this.blngMthd = blngMthd;
    }

    public int getMthlyFnddGals() {
        return mthlyFnddGals;
    }

    public void setMthlyFnddGals(int mthlyFnddGals) {
        this.mthlyFnddGals = mthlyFnddGals;
    }

    public BigDecimal getAvgGalFill() {
        return avgGalFill;
    }

    public void setAvgGalFill(BigDecimal avgGalFill) {
        this.avgGalFill = avgGalFill;
    }

    public long getActCrdCnt() {
        return actCrdCnt;
    }

    public void setActCrdCnt(long actCrdCnt) {
        this.actCrdCnt = actCrdCnt;
    }

    public BigDecimal getGnrcCrCrdFee() {
        return gnrcCrCrdFee;
    }

    public void setGnrcCrCrdFee(BigDecimal gnrcCrCrdFee) {
        this.gnrcCrCrdFee = gnrcCrCrdFee;
    }

    public BigDecimal getFeeWCash() {
        return feeWCash;
    }

    public void setFeeWCash(BigDecimal feeWCash) {
        this.feeWCash = feeWCash;
    }

    public BigDecimal getCashOnly() {
        return cashOnly;
    }

    public void setCashOnly(BigDecimal cashOnly) {
        this.cashOnly = cashOnly;
    }

    public BigDecimal getStrpRdr() {
        return strpRdr;
    }

    public void setStrpRdr(BigDecimal strpRdr) {
        this.strpRdr = strpRdr;
    }

    public BigDecimal getStrpRdrWPrtr() {
        return strpRdrWPrtr;
    }

    public void setStrpRdrWPrtr(BigDecimal strpRdrWPrtr) {
        this.strpRdrWPrtr = strpRdrWPrtr;
    }

    public int getUnitCnt() {
        return unitCnt;
    }

    public void setUnitCnt(int unitCnt) {
        this.unitCnt = unitCnt;
    }

    public int getUnitWPrtr() {
        return unitWPrtr;
    }

    public void setUnitWPrtr(int unitWPrtr) {
        this.unitWPrtr = unitWPrtr;
    }

    public int getFlNtwkFlg() {
        return flNtwkFlg;
    }

    public void setFlNtwkFlg(int flNtwkFlg) {
        this.flNtwkFlg = flNtwkFlg;
    }

    public Character getNtwkStatFlg() {
        return ntwkStatFlg;
    }

    public void setNtwkStatFlg(Character ntwkStatFlg) {
        this.ntwkStatFlg = ntwkStatFlg;
    }

    public Character getCstmFeeFlg() {
        return cstmFeeFlg;
    }

    public void setCstmFeeFlg(Character cstmFeeFlg) {
        this.cstmFeeFlg = cstmFeeFlg;
    }

    public BigDecimal getFlPchsLmt() {
        return flPchsLmt;
    }

    public void setFlPchsLmt(BigDecimal flPchsLmt) {
        this.flPchsLmt = flPchsLmt;
    }

    public Character getDlyFlFlg() {
        return dlyFlFlg;
    }

    public void setDlyFlFlg(Character dlyFlFlg) {
        this.dlyFlFlg = dlyFlFlg;
    }

    public BigDecimal getDlyFlAmt() {
        return dlyFlAmt;
    }

    public void setDlyFlAmt(BigDecimal dlyFlAmt) {
        this.dlyFlAmt = dlyFlAmt;
    }

    public Character getOneTmFlFlg() {
        return oneTmFlFlg;
    }

    public void setOneTmFlFlg(Character oneTmFlFlg) {
        this.oneTmFlFlg = oneTmFlFlg;
    }

    public BigDecimal getFlGalLmt() {
        return flGalLmt;
    }

    public void setFlGalLmt(BigDecimal flGalLmt) {
        this.flGalLmt = flGalLmt;
    }

    public short getRcrngFlFlg() {
        return rcrngFlFlg;
    }

    public void setRcrngFlFlg(short rcrngFlFlg) {
        this.rcrngFlFlg = rcrngFlFlg;
    }

    public BigDecimal getRcrngFlAmt() {
        return rcrngFlAmt;
    }

    public void setRcrngFlAmt(BigDecimal rcrngFlAmt) {
        this.rcrngFlAmt = rcrngFlAmt;
    }

    public BigDecimal getCashLmt() {
        return cashLmt;
    }

    public void setCashLmt(BigDecimal cashLmt) {
        this.cashLmt = cashLmt;
    }

    public Character getDlyCashFlg() {
        return dlyCashFlg;
    }

    public void setDlyCashFlg(Character dlyCashFlg) {
        this.dlyCashFlg = dlyCashFlg;
    }

    public BigDecimal getDlyCashAmt() {
        return dlyCashAmt;
    }

    public void setDlyCashAmt(BigDecimal dlyCashAmt) {
        this.dlyCashAmt = dlyCashAmt;
    }

    public Character getOneTmCashFlg() {
        return oneTmCashFlg;
    }

    public void setOneTmCashFlg(Character oneTmCashFlg) {
        this.oneTmCashFlg = oneTmCashFlg;
    }

    public short getRcrngCashFlg() {
        return rcrngCashFlg;
    }

    public void setRcrngCashFlg(short rcrngCashFlg) {
        this.rcrngCashFlg = rcrngCashFlg;
    }

    public BigDecimal getRcrngCashAmt() {
        return rcrngCashAmt;
    }

    public void setRcrngCashAmt(BigDecimal rcrngCashAmt) {
        this.rcrngCashAmt = rcrngCashAmt;
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
        hash += (prdGnrcCrCrdPK != null ? prdGnrcCrCrdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdGnrcCrCrd)) {
            return false;
        }
        PrdGnrcCrCrd other = (PrdGnrcCrCrd) object;
        if ((this.prdGnrcCrCrdPK == null && other.prdGnrcCrCrdPK != null) || (this.prdGnrcCrCrdPK != null && !this.prdGnrcCrCrdPK.equals(other.prdGnrcCrCrdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdGnrcCrCrd[ prdGnrcCrCrdPK=" + prdGnrcCrCrdPK + " ]";
    }
    
}
