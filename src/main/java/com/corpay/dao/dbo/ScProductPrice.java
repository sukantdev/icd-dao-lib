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
@Table(name = "SC_PRODUCT_PRICE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ScProductPrice.findAll", query = "SELECT s FROM ScProductPrice s")})
public class ScProductPrice implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScProductPricePK scProductPricePK;
    @Basic(optional = false)
    @Column(name = "TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date trnsDt;
    @Basic(optional = false)
    @Column(name = "TRNS_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trnsTs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRICE_RT")
    private BigDecimal priceRt;
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

    public ScProductPrice() {
    }

    public ScProductPrice(ScProductPricePK scProductPricePK) {
        this.scProductPricePK = scProductPricePK;
    }

    public ScProductPrice(ScProductPricePK scProductPricePK, Date trnsDt, Date trnsTs, BigDecimal priceRt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.scProductPricePK = scProductPricePK;
        this.trnsDt = trnsDt;
        this.trnsTs = trnsTs;
        this.priceRt = priceRt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ScProductPrice(String stationCd, String prodCd) {
        this.scProductPricePK = new ScProductPricePK(stationCd, prodCd);
    }

    public ScProductPricePK getScProductPricePK() {
        return scProductPricePK;
    }

    public void setScProductPricePK(ScProductPricePK scProductPricePK) {
        this.scProductPricePK = scProductPricePK;
    }

    public Date getTrnsDt() {
        return trnsDt;
    }

    public void setTrnsDt(Date trnsDt) {
        this.trnsDt = trnsDt;
    }

    public Date getTrnsTs() {
        return trnsTs;
    }

    public void setTrnsTs(Date trnsTs) {
        this.trnsTs = trnsTs;
    }

    public BigDecimal getPriceRt() {
        return priceRt;
    }

    public void setPriceRt(BigDecimal priceRt) {
        this.priceRt = priceRt;
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
        hash += (scProductPricePK != null ? scProductPricePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScProductPrice)) {
            return false;
        }
        ScProductPrice other = (ScProductPrice) object;
        if ((this.scProductPricePK == null && other.scProductPricePK != null) || (this.scProductPricePK != null && !this.scProductPricePK.equals(other.scProductPricePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ScProductPrice[ scProductPricePK=" + scProductPricePK + " ]";
    }
    
}
