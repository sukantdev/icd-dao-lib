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
@Table(name = "FUEL_TAX_EXEMPT_DATA", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FuelTaxExemptData.findAll", query = "SELECT f FROM FuelTaxExemptData f")})
public class FuelTaxExemptData implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FuelTaxExemptDataPK fuelTaxExemptDataPK;
    @Basic(optional = false)
    @Column(name = "TAX_AUTHORITY_ID")
    private int taxAuthorityId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "RATE_AMT")
    private BigDecimal rateAmt;
    @Basic(optional = false)
    @Column(name = "TAX_START_DT")
    @Temporal(TemporalType.DATE)
    private Date taxStartDt;
    @Basic(optional = false)
    @Column(name = "TAX_END_DT")
    @Temporal(TemporalType.DATE)
    private Date taxEndDt;
    @Basic(optional = false)
    @Column(name = "CUST_TAX_AMT")
    private BigDecimal custTaxAmt;
    @Basic(optional = false)
    @Column(name = "CUST_TAXABLE_AMT")
    private BigDecimal custTaxableAmt;
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
    @Column(name = "TAX_PROC_SEQ_NBR")
    private int taxProcSeqNbr;
    @Basic(optional = false)
    @Column(name = "TAX_EXEMPT_IND")
    private Character taxExemptInd;

    public FuelTaxExemptData() {
    }

    public FuelTaxExemptData(FuelTaxExemptDataPK fuelTaxExemptDataPK) {
        this.fuelTaxExemptDataPK = fuelTaxExemptDataPK;
    }

    public FuelTaxExemptData(FuelTaxExemptDataPK fuelTaxExemptDataPK, int taxAuthorityId, BigDecimal rateAmt, Date taxStartDt, Date taxEndDt, BigDecimal custTaxAmt, BigDecimal custTaxableAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, int taxProcSeqNbr, Character taxExemptInd) {
        this.fuelTaxExemptDataPK = fuelTaxExemptDataPK;
        this.taxAuthorityId = taxAuthorityId;
        this.rateAmt = rateAmt;
        this.taxStartDt = taxStartDt;
        this.taxEndDt = taxEndDt;
        this.custTaxAmt = custTaxAmt;
        this.custTaxableAmt = custTaxableAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.taxProcSeqNbr = taxProcSeqNbr;
        this.taxExemptInd = taxExemptInd;
    }

    public FuelTaxExemptData(int taxTransDt, int taxControlNbr, String taxSubProdCd, int taxId) {
        this.fuelTaxExemptDataPK = new FuelTaxExemptDataPK(taxTransDt, taxControlNbr, taxSubProdCd, taxId);
    }

    public FuelTaxExemptDataPK getFuelTaxExemptDataPK() {
        return fuelTaxExemptDataPK;
    }

    public void setFuelTaxExemptDataPK(FuelTaxExemptDataPK fuelTaxExemptDataPK) {
        this.fuelTaxExemptDataPK = fuelTaxExemptDataPK;
    }

    public int getTaxAuthorityId() {
        return taxAuthorityId;
    }

    public void setTaxAuthorityId(int taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    public BigDecimal getRateAmt() {
        return rateAmt;
    }

    public void setRateAmt(BigDecimal rateAmt) {
        this.rateAmt = rateAmt;
    }

    public Date getTaxStartDt() {
        return taxStartDt;
    }

    public void setTaxStartDt(Date taxStartDt) {
        this.taxStartDt = taxStartDt;
    }

    public Date getTaxEndDt() {
        return taxEndDt;
    }

    public void setTaxEndDt(Date taxEndDt) {
        this.taxEndDt = taxEndDt;
    }

    public BigDecimal getCustTaxAmt() {
        return custTaxAmt;
    }

    public void setCustTaxAmt(BigDecimal custTaxAmt) {
        this.custTaxAmt = custTaxAmt;
    }

    public BigDecimal getCustTaxableAmt() {
        return custTaxableAmt;
    }

    public void setCustTaxableAmt(BigDecimal custTaxableAmt) {
        this.custTaxableAmt = custTaxableAmt;
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

    public int getTaxProcSeqNbr() {
        return taxProcSeqNbr;
    }

    public void setTaxProcSeqNbr(int taxProcSeqNbr) {
        this.taxProcSeqNbr = taxProcSeqNbr;
    }

    public Character getTaxExemptInd() {
        return taxExemptInd;
    }

    public void setTaxExemptInd(Character taxExemptInd) {
        this.taxExemptInd = taxExemptInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fuelTaxExemptDataPK != null ? fuelTaxExemptDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FuelTaxExemptData)) {
            return false;
        }
        FuelTaxExemptData other = (FuelTaxExemptData) object;
        if ((this.fuelTaxExemptDataPK == null && other.fuelTaxExemptDataPK != null) || (this.fuelTaxExemptDataPK != null && !this.fuelTaxExemptDataPK.equals(other.fuelTaxExemptDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FuelTaxExemptData[ fuelTaxExemptDataPK=" + fuelTaxExemptDataPK + " ]";
    }
    
}
