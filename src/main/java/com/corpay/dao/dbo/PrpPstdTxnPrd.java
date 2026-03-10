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
@Table(name = "PRP_PSTD_TXN_PRD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrpPstdTxnPrd.findAll", query = "SELECT p FROM PrpPstdTxnPrd p")})
public class PrpPstdTxnPrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrpPstdTxnPrdPK prpPstdTxnPrdPK;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRD_QTY")
    private BigDecimal prdQty;
    @Basic(optional = false)
    @Column(name = "PRD_QTY2")
    private BigDecimal prdQty2;
    @Basic(optional = false)
    @Column(name = "PRD_HRS")
    private BigDecimal prdHrs;
    @Basic(optional = false)
    @Column(name = "PRD_MLS")
    private BigDecimal prdMls;
    @Basic(optional = false)
    @Column(name = "PRD_UNIT_COST_AMT")
    private BigDecimal prdUnitCostAmt;
    @Basic(optional = false)
    @Column(name = "PRD_INV_AMT")
    private BigDecimal prdInvAmt;
    @Basic(optional = false)
    @Column(name = "TRNS_FEE_1_AMT")
    private BigDecimal trnsFee1Amt;
    @Basic(optional = false)
    @Column(name = "FEE_CANCEL_IND")
    private String feeCancelInd;
    @Basic(optional = false)
    @Column(name = "PRD_DISC_AMT")
    private BigDecimal prdDiscAmt;
    @Basic(optional = false)
    @Column(name = "PRD_DISC_PU_AMT")
    private BigDecimal prdDiscPuAmt;
    @Basic(optional = false)
    @Column(name = "QTY_US_CUR_AMT")
    private BigDecimal qtyUsCurAmt;
    @Basic(optional = false)
    @Column(name = "QTY_BC_CUR_AMT")
    private BigDecimal qtyBcCurAmt;
    @Basic(optional = false)
    @Column(name = "QTY_SC_CUR_AMT")
    private BigDecimal qtyScCurAmt;
    @Basic(optional = false)
    @Column(name = "PPU_US_CUR_AMT")
    private BigDecimal ppuUsCurAmt;
    @Basic(optional = false)
    @Column(name = "PPU_BC_CUR_AMT")
    private BigDecimal ppuBcCurAmt;
    @Basic(optional = false)
    @Column(name = "PPU_SC_CUR_AMT")
    private BigDecimal ppuScCurAmt;
    @Basic(optional = false)
    @Column(name = "COST_US_CUR_AMT")
    private BigDecimal costUsCurAmt;
    @Basic(optional = false)
    @Column(name = "COST_BC_CUR_AMT")
    private BigDecimal costBcCurAmt;
    @Basic(optional = false)
    @Column(name = "COST_SC_CUR_AMT")
    private BigDecimal costScCurAmt;
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

    public PrpPstdTxnPrd() {
    }

    public PrpPstdTxnPrd(PrpPstdTxnPrdPK prpPstdTxnPrdPK) {
        this.prpPstdTxnPrdPK = prpPstdTxnPrdPK;
    }

    public PrpPstdTxnPrd(PrpPstdTxnPrdPK prpPstdTxnPrdPK, String prdCd, BigDecimal prdQty, BigDecimal prdQty2, BigDecimal prdHrs, BigDecimal prdMls, BigDecimal prdUnitCostAmt, BigDecimal prdInvAmt, BigDecimal trnsFee1Amt, String feeCancelInd, BigDecimal prdDiscAmt, BigDecimal prdDiscPuAmt, BigDecimal qtyUsCurAmt, BigDecimal qtyBcCurAmt, BigDecimal qtyScCurAmt, BigDecimal ppuUsCurAmt, BigDecimal ppuBcCurAmt, BigDecimal ppuScCurAmt, BigDecimal costUsCurAmt, BigDecimal costBcCurAmt, BigDecimal costScCurAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prpPstdTxnPrdPK = prpPstdTxnPrdPK;
        this.prdCd = prdCd;
        this.prdQty = prdQty;
        this.prdQty2 = prdQty2;
        this.prdHrs = prdHrs;
        this.prdMls = prdMls;
        this.prdUnitCostAmt = prdUnitCostAmt;
        this.prdInvAmt = prdInvAmt;
        this.trnsFee1Amt = trnsFee1Amt;
        this.feeCancelInd = feeCancelInd;
        this.prdDiscAmt = prdDiscAmt;
        this.prdDiscPuAmt = prdDiscPuAmt;
        this.qtyUsCurAmt = qtyUsCurAmt;
        this.qtyBcCurAmt = qtyBcCurAmt;
        this.qtyScCurAmt = qtyScCurAmt;
        this.ppuUsCurAmt = ppuUsCurAmt;
        this.ppuBcCurAmt = ppuBcCurAmt;
        this.ppuScCurAmt = ppuScCurAmt;
        this.costUsCurAmt = costUsCurAmt;
        this.costBcCurAmt = costBcCurAmt;
        this.costScCurAmt = costScCurAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrpPstdTxnPrd(Date xtnTs, short seqNbr) {
        this.prpPstdTxnPrdPK = new PrpPstdTxnPrdPK(xtnTs, seqNbr);
    }

    public PrpPstdTxnPrdPK getPrpPstdTxnPrdPK() {
        return prpPstdTxnPrdPK;
    }

    public void setPrpPstdTxnPrdPK(PrpPstdTxnPrdPK prpPstdTxnPrdPK) {
        this.prpPstdTxnPrdPK = prpPstdTxnPrdPK;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public BigDecimal getPrdQty() {
        return prdQty;
    }

    public void setPrdQty(BigDecimal prdQty) {
        this.prdQty = prdQty;
    }

    public BigDecimal getPrdQty2() {
        return prdQty2;
    }

    public void setPrdQty2(BigDecimal prdQty2) {
        this.prdQty2 = prdQty2;
    }

    public BigDecimal getPrdHrs() {
        return prdHrs;
    }

    public void setPrdHrs(BigDecimal prdHrs) {
        this.prdHrs = prdHrs;
    }

    public BigDecimal getPrdMls() {
        return prdMls;
    }

    public void setPrdMls(BigDecimal prdMls) {
        this.prdMls = prdMls;
    }

    public BigDecimal getPrdUnitCostAmt() {
        return prdUnitCostAmt;
    }

    public void setPrdUnitCostAmt(BigDecimal prdUnitCostAmt) {
        this.prdUnitCostAmt = prdUnitCostAmt;
    }

    public BigDecimal getPrdInvAmt() {
        return prdInvAmt;
    }

    public void setPrdInvAmt(BigDecimal prdInvAmt) {
        this.prdInvAmt = prdInvAmt;
    }

    public BigDecimal getTrnsFee1Amt() {
        return trnsFee1Amt;
    }

    public void setTrnsFee1Amt(BigDecimal trnsFee1Amt) {
        this.trnsFee1Amt = trnsFee1Amt;
    }

    public String getFeeCancelInd() {
        return feeCancelInd;
    }

    public void setFeeCancelInd(String feeCancelInd) {
        this.feeCancelInd = feeCancelInd;
    }

    public BigDecimal getPrdDiscAmt() {
        return prdDiscAmt;
    }

    public void setPrdDiscAmt(BigDecimal prdDiscAmt) {
        this.prdDiscAmt = prdDiscAmt;
    }

    public BigDecimal getPrdDiscPuAmt() {
        return prdDiscPuAmt;
    }

    public void setPrdDiscPuAmt(BigDecimal prdDiscPuAmt) {
        this.prdDiscPuAmt = prdDiscPuAmt;
    }

    public BigDecimal getQtyUsCurAmt() {
        return qtyUsCurAmt;
    }

    public void setQtyUsCurAmt(BigDecimal qtyUsCurAmt) {
        this.qtyUsCurAmt = qtyUsCurAmt;
    }

    public BigDecimal getQtyBcCurAmt() {
        return qtyBcCurAmt;
    }

    public void setQtyBcCurAmt(BigDecimal qtyBcCurAmt) {
        this.qtyBcCurAmt = qtyBcCurAmt;
    }

    public BigDecimal getQtyScCurAmt() {
        return qtyScCurAmt;
    }

    public void setQtyScCurAmt(BigDecimal qtyScCurAmt) {
        this.qtyScCurAmt = qtyScCurAmt;
    }

    public BigDecimal getPpuUsCurAmt() {
        return ppuUsCurAmt;
    }

    public void setPpuUsCurAmt(BigDecimal ppuUsCurAmt) {
        this.ppuUsCurAmt = ppuUsCurAmt;
    }

    public BigDecimal getPpuBcCurAmt() {
        return ppuBcCurAmt;
    }

    public void setPpuBcCurAmt(BigDecimal ppuBcCurAmt) {
        this.ppuBcCurAmt = ppuBcCurAmt;
    }

    public BigDecimal getPpuScCurAmt() {
        return ppuScCurAmt;
    }

    public void setPpuScCurAmt(BigDecimal ppuScCurAmt) {
        this.ppuScCurAmt = ppuScCurAmt;
    }

    public BigDecimal getCostUsCurAmt() {
        return costUsCurAmt;
    }

    public void setCostUsCurAmt(BigDecimal costUsCurAmt) {
        this.costUsCurAmt = costUsCurAmt;
    }

    public BigDecimal getCostBcCurAmt() {
        return costBcCurAmt;
    }

    public void setCostBcCurAmt(BigDecimal costBcCurAmt) {
        this.costBcCurAmt = costBcCurAmt;
    }

    public BigDecimal getCostScCurAmt() {
        return costScCurAmt;
    }

    public void setCostScCurAmt(BigDecimal costScCurAmt) {
        this.costScCurAmt = costScCurAmt;
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
        hash += (prpPstdTxnPrdPK != null ? prpPstdTxnPrdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrpPstdTxnPrd)) {
            return false;
        }
        PrpPstdTxnPrd other = (PrpPstdTxnPrd) object;
        if ((this.prpPstdTxnPrdPK == null && other.prpPstdTxnPrdPK != null) || (this.prpPstdTxnPrdPK != null && !this.prpPstdTxnPrdPK.equals(other.prpPstdTxnPrdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrpPstdTxnPrd[ prpPstdTxnPrdPK=" + prpPstdTxnPrdPK + " ]";
    }
    
}
