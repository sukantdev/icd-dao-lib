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
@Table(name = "PRD_DTL_LINE_ITM", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdDtlLineItm.findAll", query = "SELECT p FROM PrdDtlLineItm p")})
public class PrdDtlLineItm implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdDtlLineItmPK prdDtlLineItmPK;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    @Basic(optional = false)
    @Column(name = "PRD_DESC")
    private String prdDesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRD_QTY")
    private BigDecimal prdQty;
    @Basic(optional = false)
    @Column(name = "PRD_PRC")
    private BigDecimal prdPrc;
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
    @Column(name = "PRD_TOT_CST")
    private BigDecimal prdTotCst;

    public PrdDtlLineItm() {
    }

    public PrdDtlLineItm(PrdDtlLineItmPK prdDtlLineItmPK) {
        this.prdDtlLineItmPK = prdDtlLineItmPK;
    }

    public PrdDtlLineItm(PrdDtlLineItmPK prdDtlLineItmPK, String prdCd, String prdDesc, BigDecimal prdQty, BigDecimal prdPrc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, BigDecimal prdTotCst) {
        this.prdDtlLineItmPK = prdDtlLineItmPK;
        this.prdCd = prdCd;
        this.prdDesc = prdDesc;
        this.prdQty = prdQty;
        this.prdPrc = prdPrc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.prdTotCst = prdTotCst;
    }

    public PrdDtlLineItm(Date pstdDt, int trnsId, int seqNbr, int lineItmSeqNbr) {
        this.prdDtlLineItmPK = new PrdDtlLineItmPK(pstdDt, trnsId, seqNbr, lineItmSeqNbr);
    }

    public PrdDtlLineItmPK getPrdDtlLineItmPK() {
        return prdDtlLineItmPK;
    }

    public void setPrdDtlLineItmPK(PrdDtlLineItmPK prdDtlLineItmPK) {
        this.prdDtlLineItmPK = prdDtlLineItmPK;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    public BigDecimal getPrdQty() {
        return prdQty;
    }

    public void setPrdQty(BigDecimal prdQty) {
        this.prdQty = prdQty;
    }

    public BigDecimal getPrdPrc() {
        return prdPrc;
    }

    public void setPrdPrc(BigDecimal prdPrc) {
        this.prdPrc = prdPrc;
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

    public BigDecimal getPrdTotCst() {
        return prdTotCst;
    }

    public void setPrdTotCst(BigDecimal prdTotCst) {
        this.prdTotCst = prdTotCst;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdDtlLineItmPK != null ? prdDtlLineItmPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdDtlLineItm)) {
            return false;
        }
        PrdDtlLineItm other = (PrdDtlLineItm) object;
        if ((this.prdDtlLineItmPK == null && other.prdDtlLineItmPK != null) || (this.prdDtlLineItmPK != null && !this.prdDtlLineItmPK.equals(other.prdDtlLineItmPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdDtlLineItm[ prdDtlLineItmPK=" + prdDtlLineItmPK + " ]";
    }
    
}
