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
@Table(name = "REFUND_PEND_DET", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RefundPendDet.findAll", query = "SELECT r FROM RefundPendDet r")})
public class RefundPendDet implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RefundPendDetPK refundPendDetPK;
    @Basic(optional = false)
    @Column(name = "TYP_CD")
    private Character typCd;
    @Basic(optional = false)
    @Column(name = "CUST_NBR")
    private String custNbr;
    @Basic(optional = false)
    @Column(name = "BLK_DT")
    @Temporal(TemporalType.DATE)
    private Date blkDt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "AMT")
    private BigDecimal amt;
    @Basic(optional = false)
    @Column(name = "CRD_AMT")
    private BigDecimal crdAmt;
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

    public RefundPendDet() {
    }

    public RefundPendDet(RefundPendDetPK refundPendDetPK) {
        this.refundPendDetPK = refundPendDetPK;
    }

    public RefundPendDet(RefundPendDetPK refundPendDetPK, Character typCd, String custNbr, Date blkDt, BigDecimal amt, BigDecimal crdAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.refundPendDetPK = refundPendDetPK;
        this.typCd = typCd;
        this.custNbr = custNbr;
        this.blkDt = blkDt;
        this.amt = amt;
        this.crdAmt = crdAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public RefundPendDet(String acctNbr, Date addDt, String crdNbr) {
        this.refundPendDetPK = new RefundPendDetPK(acctNbr, addDt, crdNbr);
    }

    public RefundPendDetPK getRefundPendDetPK() {
        return refundPendDetPK;
    }

    public void setRefundPendDetPK(RefundPendDetPK refundPendDetPK) {
        this.refundPendDetPK = refundPendDetPK;
    }

    public Character getTypCd() {
        return typCd;
    }

    public void setTypCd(Character typCd) {
        this.typCd = typCd;
    }

    public String getCustNbr() {
        return custNbr;
    }

    public void setCustNbr(String custNbr) {
        this.custNbr = custNbr;
    }

    public Date getBlkDt() {
        return blkDt;
    }

    public void setBlkDt(Date blkDt) {
        this.blkDt = blkDt;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getCrdAmt() {
        return crdAmt;
    }

    public void setCrdAmt(BigDecimal crdAmt) {
        this.crdAmt = crdAmt;
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
        hash += (refundPendDetPK != null ? refundPendDetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RefundPendDet)) {
            return false;
        }
        RefundPendDet other = (RefundPendDet) object;
        if ((this.refundPendDetPK == null && other.refundPendDetPK != null) || (this.refundPendDetPK != null && !this.refundPendDetPK.equals(other.refundPendDetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RefundPendDet[ refundPendDetPK=" + refundPendDetPK + " ]";
    }
    
}
