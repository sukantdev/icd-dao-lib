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
@Table(name = "PRD_ECSH", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdEcsh.findAll", query = "SELECT p FROM PrdEcsh p")})
public class PrdEcsh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "DDPOS_XTNS")
    private int ddposXtns;
    @Basic(optional = false)
    @Column(name = "LOAD_MTHD")
    private Character loadMthd;
    @Basic(optional = false)
    @Column(name = "LST_TAX_ID")
    private String lstTaxId;
    @Basic(optional = false)
    @Column(name = "BILL_OPTN")
    private Character billOptn;
    @Basic(optional = false)
    @Column(name = "FUNDING_OPTN")
    private Character fundingOptn;
    @Basic(optional = false)
    @Column(name = "FREE_TRNS_CNT")
    private int freeTrnsCnt;
    @Basic(optional = false)
    @Column(name = "LOAD_FEE_OPTN")
    private Character loadFeeOptn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LOAD_FEE_AMT")
    private BigDecimal loadFeeAmt;
    @Basic(optional = false)
    @Column(name = "PKUP_FEE_OPTN")
    private Character pkupFeeOptn;
    @Basic(optional = false)
    @Column(name = "PKUP_FEE_AMT")
    private BigDecimal pkupFeeAmt;
    @Basic(optional = false)
    @Column(name = "SRV_FEE_BLNG_OPTN")
    private Character srvFeeBlngOptn;
    @Basic(optional = false)
    @Column(name = "EXP_CASH_RPT_AVBLT")
    private short expCashRptAvblt;
    @Basic(optional = false)
    @Column(name = "DDPOS_OPTN")
    private Character ddposOptn;
    @Basic(optional = false)
    @Column(name = "AUTMTC_DPOS_FEE")
    private BigDecimal autmtcDposFee;
    @Basic(optional = false)
    @Column(name = "MANUAL_DPOS_FEE")
    private BigDecimal manualDposFee;
    @Basic(optional = false)
    @Column(name = "DDPOS_PRJTN")
    private BigDecimal ddposPrjtn;
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

    public PrdEcsh() {
    }

    public PrdEcsh(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdEcsh(String applNbr, int ddposXtns, Character loadMthd, String lstTaxId, Character billOptn, Character fundingOptn, int freeTrnsCnt, Character loadFeeOptn, BigDecimal loadFeeAmt, Character pkupFeeOptn, BigDecimal pkupFeeAmt, Character srvFeeBlngOptn, short expCashRptAvblt, Character ddposOptn, BigDecimal autmtcDposFee, BigDecimal manualDposFee, BigDecimal ddposPrjtn, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.ddposXtns = ddposXtns;
        this.loadMthd = loadMthd;
        this.lstTaxId = lstTaxId;
        this.billOptn = billOptn;
        this.fundingOptn = fundingOptn;
        this.freeTrnsCnt = freeTrnsCnt;
        this.loadFeeOptn = loadFeeOptn;
        this.loadFeeAmt = loadFeeAmt;
        this.pkupFeeOptn = pkupFeeOptn;
        this.pkupFeeAmt = pkupFeeAmt;
        this.srvFeeBlngOptn = srvFeeBlngOptn;
        this.expCashRptAvblt = expCashRptAvblt;
        this.ddposOptn = ddposOptn;
        this.autmtcDposFee = autmtcDposFee;
        this.manualDposFee = manualDposFee;
        this.ddposPrjtn = ddposPrjtn;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public int getDdposXtns() {
        return ddposXtns;
    }

    public void setDdposXtns(int ddposXtns) {
        this.ddposXtns = ddposXtns;
    }

    public Character getLoadMthd() {
        return loadMthd;
    }

    public void setLoadMthd(Character loadMthd) {
        this.loadMthd = loadMthd;
    }

    public String getLstTaxId() {
        return lstTaxId;
    }

    public void setLstTaxId(String lstTaxId) {
        this.lstTaxId = lstTaxId;
    }

    public Character getBillOptn() {
        return billOptn;
    }

    public void setBillOptn(Character billOptn) {
        this.billOptn = billOptn;
    }

    public Character getFundingOptn() {
        return fundingOptn;
    }

    public void setFundingOptn(Character fundingOptn) {
        this.fundingOptn = fundingOptn;
    }

    public int getFreeTrnsCnt() {
        return freeTrnsCnt;
    }

    public void setFreeTrnsCnt(int freeTrnsCnt) {
        this.freeTrnsCnt = freeTrnsCnt;
    }

    public Character getLoadFeeOptn() {
        return loadFeeOptn;
    }

    public void setLoadFeeOptn(Character loadFeeOptn) {
        this.loadFeeOptn = loadFeeOptn;
    }

    public BigDecimal getLoadFeeAmt() {
        return loadFeeAmt;
    }

    public void setLoadFeeAmt(BigDecimal loadFeeAmt) {
        this.loadFeeAmt = loadFeeAmt;
    }

    public Character getPkupFeeOptn() {
        return pkupFeeOptn;
    }

    public void setPkupFeeOptn(Character pkupFeeOptn) {
        this.pkupFeeOptn = pkupFeeOptn;
    }

    public BigDecimal getPkupFeeAmt() {
        return pkupFeeAmt;
    }

    public void setPkupFeeAmt(BigDecimal pkupFeeAmt) {
        this.pkupFeeAmt = pkupFeeAmt;
    }

    public Character getSrvFeeBlngOptn() {
        return srvFeeBlngOptn;
    }

    public void setSrvFeeBlngOptn(Character srvFeeBlngOptn) {
        this.srvFeeBlngOptn = srvFeeBlngOptn;
    }

    public short getExpCashRptAvblt() {
        return expCashRptAvblt;
    }

    public void setExpCashRptAvblt(short expCashRptAvblt) {
        this.expCashRptAvblt = expCashRptAvblt;
    }

    public Character getDdposOptn() {
        return ddposOptn;
    }

    public void setDdposOptn(Character ddposOptn) {
        this.ddposOptn = ddposOptn;
    }

    public BigDecimal getAutmtcDposFee() {
        return autmtcDposFee;
    }

    public void setAutmtcDposFee(BigDecimal autmtcDposFee) {
        this.autmtcDposFee = autmtcDposFee;
    }

    public BigDecimal getManualDposFee() {
        return manualDposFee;
    }

    public void setManualDposFee(BigDecimal manualDposFee) {
        this.manualDposFee = manualDposFee;
    }

    public BigDecimal getDdposPrjtn() {
        return ddposPrjtn;
    }

    public void setDdposPrjtn(BigDecimal ddposPrjtn) {
        this.ddposPrjtn = ddposPrjtn;
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
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdEcsh)) {
            return false;
        }
        PrdEcsh other = (PrdEcsh) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdEcsh[ applNbr=" + applNbr + " ]";
    }
    
}
