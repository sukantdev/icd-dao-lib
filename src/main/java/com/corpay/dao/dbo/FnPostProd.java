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
@Table(name = "FN_POST_PROD", catalog = "", schema = "DBO")
public class FnPostProd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FnPostProdPK fnPostProdPK;
    @Basic(optional = false)
    @Column(name = "PROD_CD")
    private String prodCd;

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

    public FnPostProd() {
    }

    public FnPostProd(FnPostProdPK fnPostProdPK) {
        this.fnPostProdPK = fnPostProdPK;
    }

    public FnPostProd(FnPostProdPK fnPostProdPK, String prodCd, BigDecimal prodQty, BigDecimal unitPrc, BigDecimal prodAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fnPostProdPK = fnPostProdPK;
        this.prodCd = prodCd;
        this.prodQty = prodQty;
        this.unitPrc = unitPrc;
        this.prodAmt = prodAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FnPostProd(Date trnsDt, int ctlNbr, short prodSeq) {
        this.fnPostProdPK = new FnPostProdPK(trnsDt, ctlNbr, prodSeq);
    }

    public FnPostProdPK getFnPostProdPK() {
        return fnPostProdPK;
    }

    public void setFnPostProdPK(FnPostProdPK fnPostProdPK) {
        this.fnPostProdPK = fnPostProdPK;
    }

    public String getProdCd() {
        return prodCd;
    }

    public void setProdCd(String prodCd) {
        this.prodCd = prodCd;
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
        hash += (fnPostProdPK != null ? fnPostProdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FnPostProd)) {
            return false;
        }
        FnPostProd other = (FnPostProd) object;
        if ((this.fnPostProdPK == null && other.fnPostProdPK != null) || (this.fnPostProdPK != null && !this.fnPostProdPK.equals(other.fnPostProdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnPostProd[ fnPostProdPK=" + fnPostProdPK + " ]";
    }

}
