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
@Table(name = "PRD_CMST_SYS_INFO", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdCmstSysInfo.findAll", query = "SELECT p FROM PrdCmstSysInfo p")})
public class PrdCmstSysInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdCmstSysInfoPK prdCmstSysInfoPK;
    @Basic(optional = false)
    @Column(name = "QTY")
    private int qty;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CST")
    private BigDecimal cst;
    @Basic(optional = false)
    @Column(name = "PAID_AMT")
    private BigDecimal paidAmt;
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

    public PrdCmstSysInfo() {
    }

    public PrdCmstSysInfo(PrdCmstSysInfoPK prdCmstSysInfoPK) {
        this.prdCmstSysInfoPK = prdCmstSysInfoPK;
    }

    public PrdCmstSysInfo(PrdCmstSysInfoPK prdCmstSysInfoPK, int qty, BigDecimal cst, BigDecimal paidAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdCmstSysInfoPK = prdCmstSysInfoPK;
        this.qty = qty;
        this.cst = cst;
        this.paidAmt = paidAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdCmstSysInfo(String applNbr, String childTyp, String sysDesc) {
        this.prdCmstSysInfoPK = new PrdCmstSysInfoPK(applNbr, childTyp, sysDesc);
    }

    public PrdCmstSysInfoPK getPrdCmstSysInfoPK() {
        return prdCmstSysInfoPK;
    }

    public void setPrdCmstSysInfoPK(PrdCmstSysInfoPK prdCmstSysInfoPK) {
        this.prdCmstSysInfoPK = prdCmstSysInfoPK;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getCst() {
        return cst;
    }

    public void setCst(BigDecimal cst) {
        this.cst = cst;
    }

    public BigDecimal getPaidAmt() {
        return paidAmt;
    }

    public void setPaidAmt(BigDecimal paidAmt) {
        this.paidAmt = paidAmt;
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
        hash += (prdCmstSysInfoPK != null ? prdCmstSysInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdCmstSysInfo)) {
            return false;
        }
        PrdCmstSysInfo other = (PrdCmstSysInfo) object;
        if ((this.prdCmstSysInfoPK == null && other.prdCmstSysInfoPK != null) || (this.prdCmstSysInfoPK != null && !this.prdCmstSysInfoPK.equals(other.prdCmstSysInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdCmstSysInfo[ prdCmstSysInfoPK=" + prdCmstSysInfoPK + " ]";
    }
    
}
