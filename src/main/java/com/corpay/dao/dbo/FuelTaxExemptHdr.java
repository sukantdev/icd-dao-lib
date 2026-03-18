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
@Table(name = "FUEL_TAX_EXEMPT_HDR", catalog = "", schema = "DBO")
public class FuelTaxExemptHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FuelTaxExemptHdrPK fuelTaxExemptHdrPK;

    @Basic(optional = false)
    @Column(name = "CUST_TAXABLE_AMT")
    private BigDecimal custTaxableAmt;
    @Basic(optional = false)
    @Column(name = "CUST_TAX_AMT")
    private BigDecimal custTaxAmt;
    @Basic(optional = false)
    @Column(name = "CUST_TAX_AMT_PCT")
    private BigDecimal custTaxAmtPct;
    @Basic(optional = false)
    @Column(name = "CUST_PRICE_WO_TAX_AMT")
    private BigDecimal custPriceWoTaxAmt;
    @Basic(optional = false)
    @Column(name = "ORGL_TR_PPG_AMT")
    private BigDecimal orglTrPpgAmt;
    @Basic(optional = false)
    @Column(name = "ORGL_TR_COST_AMT")
    private BigDecimal orglTrCostAmt;
    @Basic(optional = false)
    @Column(name = "ORGL_BC_TR_PPG_AMT")
    private BigDecimal orglBcTrPpgAmt;
    @Basic(optional = false)
    @Column(name = "ORGL_BC_TR_COST_AMT")
    private BigDecimal orglBcTrCostAmt;
    @Basic(optional = false)
    @Column(name = "ORGL_SC_TR_PPG_AMT")
    private BigDecimal orglScTrPpgAmt;
    @Basic(optional = false)
    @Column(name = "ORGL_SC_TR_COST_AMT")
    private BigDecimal orglScTrCostAmt;
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
    @Column(name = "TAX_ERROR_MSG_TXT")
    private String taxErrorMsgTxt;

    public FuelTaxExemptHdr() {
    }

    public FuelTaxExemptHdr(FuelTaxExemptHdrPK fuelTaxExemptHdrPK) {
        this.fuelTaxExemptHdrPK = fuelTaxExemptHdrPK;
    }

    public FuelTaxExemptHdr(FuelTaxExemptHdrPK fuelTaxExemptHdrPK, BigDecimal custTaxableAmt, BigDecimal custTaxAmt, BigDecimal custTaxAmtPct, BigDecimal custPriceWoTaxAmt, BigDecimal orglTrPpgAmt, BigDecimal orglTrCostAmt, BigDecimal orglBcTrPpgAmt, BigDecimal orglBcTrCostAmt, BigDecimal orglScTrPpgAmt, BigDecimal orglScTrCostAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String taxErrorMsgTxt) {
        this.fuelTaxExemptHdrPK = fuelTaxExemptHdrPK;
        this.custTaxableAmt = custTaxableAmt;
        this.custTaxAmt = custTaxAmt;
        this.custTaxAmtPct = custTaxAmtPct;
        this.custPriceWoTaxAmt = custPriceWoTaxAmt;
        this.orglTrPpgAmt = orglTrPpgAmt;
        this.orglTrCostAmt = orglTrCostAmt;
        this.orglBcTrPpgAmt = orglBcTrPpgAmt;
        this.orglBcTrCostAmt = orglBcTrCostAmt;
        this.orglScTrPpgAmt = orglScTrPpgAmt;
        this.orglScTrCostAmt = orglScTrCostAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.taxErrorMsgTxt = taxErrorMsgTxt;
    }

    public FuelTaxExemptHdr(int taxTransDt, int taxControlNbr, String taxSubProdCd) {
        this.fuelTaxExemptHdrPK = new FuelTaxExemptHdrPK(taxTransDt, taxControlNbr, taxSubProdCd);
    }

    public FuelTaxExemptHdrPK getFuelTaxExemptHdrPK() {
        return fuelTaxExemptHdrPK;
    }

    public void setFuelTaxExemptHdrPK(FuelTaxExemptHdrPK fuelTaxExemptHdrPK) {
        this.fuelTaxExemptHdrPK = fuelTaxExemptHdrPK;
    }

    public BigDecimal getCustTaxableAmt() {
        return custTaxableAmt;
    }

    public void setCustTaxableAmt(BigDecimal custTaxableAmt) {
        this.custTaxableAmt = custTaxableAmt;
    }

    public BigDecimal getCustTaxAmt() {
        return custTaxAmt;
    }

    public void setCustTaxAmt(BigDecimal custTaxAmt) {
        this.custTaxAmt = custTaxAmt;
    }

    public BigDecimal getCustTaxAmtPct() {
        return custTaxAmtPct;
    }

    public void setCustTaxAmtPct(BigDecimal custTaxAmtPct) {
        this.custTaxAmtPct = custTaxAmtPct;
    }

    public BigDecimal getCustPriceWoTaxAmt() {
        return custPriceWoTaxAmt;
    }

    public void setCustPriceWoTaxAmt(BigDecimal custPriceWoTaxAmt) {
        this.custPriceWoTaxAmt = custPriceWoTaxAmt;
    }

    public BigDecimal getOrglTrPpgAmt() {
        return orglTrPpgAmt;
    }

    public void setOrglTrPpgAmt(BigDecimal orglTrPpgAmt) {
        this.orglTrPpgAmt = orglTrPpgAmt;
    }

    public BigDecimal getOrglTrCostAmt() {
        return orglTrCostAmt;
    }

    public void setOrglTrCostAmt(BigDecimal orglTrCostAmt) {
        this.orglTrCostAmt = orglTrCostAmt;
    }

    public BigDecimal getOrglBcTrPpgAmt() {
        return orglBcTrPpgAmt;
    }

    public void setOrglBcTrPpgAmt(BigDecimal orglBcTrPpgAmt) {
        this.orglBcTrPpgAmt = orglBcTrPpgAmt;
    }

    public BigDecimal getOrglBcTrCostAmt() {
        return orglBcTrCostAmt;
    }

    public void setOrglBcTrCostAmt(BigDecimal orglBcTrCostAmt) {
        this.orglBcTrCostAmt = orglBcTrCostAmt;
    }

    public BigDecimal getOrglScTrPpgAmt() {
        return orglScTrPpgAmt;
    }

    public void setOrglScTrPpgAmt(BigDecimal orglScTrPpgAmt) {
        this.orglScTrPpgAmt = orglScTrPpgAmt;
    }

    public BigDecimal getOrglScTrCostAmt() {
        return orglScTrCostAmt;
    }

    public void setOrglScTrCostAmt(BigDecimal orglScTrCostAmt) {
        this.orglScTrCostAmt = orglScTrCostAmt;
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

    public String getTaxErrorMsgTxt() {
        return taxErrorMsgTxt;
    }

    public void setTaxErrorMsgTxt(String taxErrorMsgTxt) {
        this.taxErrorMsgTxt = taxErrorMsgTxt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fuelTaxExemptHdrPK != null ? fuelTaxExemptHdrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FuelTaxExemptHdr)) {
            return false;
        }
        FuelTaxExemptHdr other = (FuelTaxExemptHdr) object;
        if ((this.fuelTaxExemptHdrPK == null && other.fuelTaxExemptHdrPK != null) || (this.fuelTaxExemptHdrPK != null && !this.fuelTaxExemptHdrPK.equals(other.fuelTaxExemptHdrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FuelTaxExemptHdr[ fuelTaxExemptHdrPK=" + fuelTaxExemptHdrPK + " ]";
    }

}
