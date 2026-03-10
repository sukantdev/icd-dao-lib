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
@Table(name = "SC_PRODUCT_PRICE_HST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ScProductPriceHst.findAll", query = "SELECT s FROM ScProductPriceHst s")})
public class ScProductPriceHst implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScProductPriceHstPK scProductPriceHstPK;
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

    public ScProductPriceHst() {
    }

    public ScProductPriceHst(ScProductPriceHstPK scProductPriceHstPK) {
        this.scProductPriceHstPK = scProductPriceHstPK;
    }

    public ScProductPriceHst(ScProductPriceHstPK scProductPriceHstPK, BigDecimal priceRt, Date crtTs, String crtUsr) {
        this.scProductPriceHstPK = scProductPriceHstPK;
        this.priceRt = priceRt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
    }

    public ScProductPriceHst(String stationCd, String prodCd, Date trnsDt, Date trnsTs) {
        this.scProductPriceHstPK = new ScProductPriceHstPK(stationCd, prodCd, trnsDt, trnsTs);
    }

    public ScProductPriceHstPK getScProductPriceHstPK() {
        return scProductPriceHstPK;
    }

    public void setScProductPriceHstPK(ScProductPriceHstPK scProductPriceHstPK) {
        this.scProductPriceHstPK = scProductPriceHstPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scProductPriceHstPK != null ? scProductPriceHstPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScProductPriceHst)) {
            return false;
        }
        ScProductPriceHst other = (ScProductPriceHst) object;
        if ((this.scProductPriceHstPK == null && other.scProductPriceHstPK != null) || (this.scProductPriceHstPK != null && !this.scProductPriceHstPK.equals(other.scProductPriceHstPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ScProductPriceHst[ scProductPriceHstPK=" + scProductPriceHstPK + " ]";
    }
    
}
