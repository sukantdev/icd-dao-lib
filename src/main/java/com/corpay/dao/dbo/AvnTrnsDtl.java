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
@Table(name = "AVN_TRNS_DTL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "AvnTrnsDtl.findAll", query = "SELECT a FROM AvnTrnsDtl a")})
public class AvnTrnsDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvnTrnsDtlPK avnTrnsDtlPK;
    @Basic(optional = false)
    @Column(name = "ITM_ID")
    private String itmId;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITM_QTY")
    private BigDecimal itmQty;
    @Basic(optional = false)
    @Column(name = "PRC_PER_UNIT")
    private BigDecimal prcPerUnit;
    @Basic(optional = false)
    @Column(name = "LN_ITM_TL")
    private BigDecimal lnItmTl;
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

    public AvnTrnsDtl() {
    }

    public AvnTrnsDtl(AvnTrnsDtlPK avnTrnsDtlPK) {
        this.avnTrnsDtlPK = avnTrnsDtlPK;
    }

    public AvnTrnsDtl(AvnTrnsDtlPK avnTrnsDtlPK, String itmId, String prdCd, BigDecimal itmQty, BigDecimal prcPerUnit, BigDecimal lnItmTl, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.avnTrnsDtlPK = avnTrnsDtlPK;
        this.itmId = itmId;
        this.prdCd = prdCd;
        this.itmQty = itmQty;
        this.prcPerUnit = prcPerUnit;
        this.lnItmTl = lnItmTl;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AvnTrnsDtl(int trnsTrkgNbr, int lnSeqNbr) {
        this.avnTrnsDtlPK = new AvnTrnsDtlPK(trnsTrkgNbr, lnSeqNbr);
    }

    public AvnTrnsDtlPK getAvnTrnsDtlPK() {
        return avnTrnsDtlPK;
    }

    public void setAvnTrnsDtlPK(AvnTrnsDtlPK avnTrnsDtlPK) {
        this.avnTrnsDtlPK = avnTrnsDtlPK;
    }

    public String getItmId() {
        return itmId;
    }

    public void setItmId(String itmId) {
        this.itmId = itmId;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public BigDecimal getItmQty() {
        return itmQty;
    }

    public void setItmQty(BigDecimal itmQty) {
        this.itmQty = itmQty;
    }

    public BigDecimal getPrcPerUnit() {
        return prcPerUnit;
    }

    public void setPrcPerUnit(BigDecimal prcPerUnit) {
        this.prcPerUnit = prcPerUnit;
    }

    public BigDecimal getLnItmTl() {
        return lnItmTl;
    }

    public void setLnItmTl(BigDecimal lnItmTl) {
        this.lnItmTl = lnItmTl;
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
        hash += (avnTrnsDtlPK != null ? avnTrnsDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvnTrnsDtl)) {
            return false;
        }
        AvnTrnsDtl other = (AvnTrnsDtl) object;
        if ((this.avnTrnsDtlPK == null && other.avnTrnsDtlPK != null) || (this.avnTrnsDtlPK != null && !this.avnTrnsDtlPK.equals(other.avnTrnsDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AvnTrnsDtl[ avnTrnsDtlPK=" + avnTrnsDtlPK + " ]";
    }
    
}
