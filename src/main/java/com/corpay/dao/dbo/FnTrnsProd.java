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
@Table(name = "FN_TRNS_PROD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FnTrnsProd.findAll", query = "SELECT f FROM FnTrnsProd f")})
public class FnTrnsProd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FnTrnsProdPK fnTrnsProdPK;
    @Basic(optional = false)
    @Column(name = "FN_PROD_CD")
    private short fnProdCd;
    @Basic(optional = false)
    @Column(name = "CD_PROD_CD")
    private String cdProdCd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PROD_QTY")
    private BigDecimal prodQty;
    @Basic(optional = false)
    @Column(name = "UNIT_PRC")
    private BigDecimal unitPrc;
    @Basic(optional = false)
    @Column(name = "PROD_AMT")
    private BigDecimal prodAmt;
    @Basic(optional = false)
    @Column(name = "FN_MRCH_DT")
    @Temporal(TemporalType.DATE)
    private Date fnMrchDt;
    @Basic(optional = false)
    @Column(name = "FN_MRCH_TM")
    @Temporal(TemporalType.TIME)
    private Date fnMrchTm;
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

    public FnTrnsProd() {
    }

    public FnTrnsProd(FnTrnsProdPK fnTrnsProdPK) {
        this.fnTrnsProdPK = fnTrnsProdPK;
    }

    public FnTrnsProd(FnTrnsProdPK fnTrnsProdPK, short fnProdCd, String cdProdCd, BigDecimal prodQty, BigDecimal unitPrc, BigDecimal prodAmt, Date fnMrchDt, Date fnMrchTm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fnTrnsProdPK = fnTrnsProdPK;
        this.fnProdCd = fnProdCd;
        this.cdProdCd = cdProdCd;
        this.prodQty = prodQty;
        this.unitPrc = unitPrc;
        this.prodAmt = prodAmt;
        this.fnMrchDt = fnMrchDt;
        this.fnMrchTm = fnMrchTm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FnTrnsProd(String pan, Date utDt, int approvCd, Date localTs, int seqNbr) {
        this.fnTrnsProdPK = new FnTrnsProdPK(pan, utDt, approvCd, localTs, seqNbr);
    }

    public FnTrnsProdPK getFnTrnsProdPK() {
        return fnTrnsProdPK;
    }

    public void setFnTrnsProdPK(FnTrnsProdPK fnTrnsProdPK) {
        this.fnTrnsProdPK = fnTrnsProdPK;
    }

    public short getFnProdCd() {
        return fnProdCd;
    }

    public void setFnProdCd(short fnProdCd) {
        this.fnProdCd = fnProdCd;
    }

    public String getCdProdCd() {
        return cdProdCd;
    }

    public void setCdProdCd(String cdProdCd) {
        this.cdProdCd = cdProdCd;
    }

    public BigDecimal getProdQty() {
        return prodQty;
    }

    public void setProdQty(BigDecimal prodQty) {
        this.prodQty = prodQty;
    }

    public BigDecimal getUnitPrc() {
        return unitPrc;
    }

    public void setUnitPrc(BigDecimal unitPrc) {
        this.unitPrc = unitPrc;
    }

    public BigDecimal getProdAmt() {
        return prodAmt;
    }

    public void setProdAmt(BigDecimal prodAmt) {
        this.prodAmt = prodAmt;
    }

    public Date getFnMrchDt() {
        return fnMrchDt;
    }

    public void setFnMrchDt(Date fnMrchDt) {
        this.fnMrchDt = fnMrchDt;
    }

    public Date getFnMrchTm() {
        return fnMrchTm;
    }

    public void setFnMrchTm(Date fnMrchTm) {
        this.fnMrchTm = fnMrchTm;
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
        hash += (fnTrnsProdPK != null ? fnTrnsProdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FnTrnsProd)) {
            return false;
        }
        FnTrnsProd other = (FnTrnsProd) object;
        if ((this.fnTrnsProdPK == null && other.fnTrnsProdPK != null) || (this.fnTrnsProdPK != null && !this.fnTrnsProdPK.equals(other.fnTrnsProdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnTrnsProd[ fnTrnsProdPK=" + fnTrnsProdPK + " ]";
    }
    
}
