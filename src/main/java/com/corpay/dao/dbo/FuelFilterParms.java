package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "FUEL_FILTER_PARMS", catalog = "", schema = "DBO")
public class FuelFilterParms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CNTRY_CD")
    private String cntryCd;

    @Basic(optional = false)
    @Column(name = "COMPARE_AMT")
    private BigDecimal compareAmt;
    @Basic(optional = false)
    @Column(name = "THRSHLD_FLG")
    private Character thrshldFlg;
    @Basic(optional = false)
    @Column(name = "THRSHLD_AMT_HIGH")
    private BigDecimal thrshldAmtHigh;
    @Basic(optional = false)
    @Column(name = "THRSHLD_AMT_LOW")
    private BigDecimal thrshldAmtLow;
    @Basic(optional = false)
    @Column(name = "SALE_AMT_HIGH")
    private BigDecimal saleAmtHigh;
    @Basic(optional = false)
    @Column(name = "SALE_AMT_LOW")
    private BigDecimal saleAmtLow;
    @Basic(optional = false)
    @Column(name = "MCC_CDS")
    private String mccCds;
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

    public FuelFilterParms() {
    }

    public FuelFilterParms(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    public FuelFilterParms(String cntryCd, BigDecimal compareAmt, Character thrshldFlg, BigDecimal thrshldAmtHigh, BigDecimal thrshldAmtLow, BigDecimal saleAmtHigh, BigDecimal saleAmtLow, String mccCds, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.cntryCd = cntryCd;
        this.compareAmt = compareAmt;
        this.thrshldFlg = thrshldFlg;
        this.thrshldAmtHigh = thrshldAmtHigh;
        this.thrshldAmtLow = thrshldAmtLow;
        this.saleAmtHigh = saleAmtHigh;
        this.saleAmtLow = saleAmtLow;
        this.mccCds = mccCds;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getCntryCd() {
        return cntryCd;
    }

    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    public BigDecimal getCompareAmt() {
        return compareAmt;
    }

    public void setCompareAmt(BigDecimal compareAmt) {
        this.compareAmt = compareAmt;
    }

    public Character getThrshldFlg() {
        return thrshldFlg;
    }

    public void setThrshldFlg(Character thrshldFlg) {
        this.thrshldFlg = thrshldFlg;
    }

    public BigDecimal getThrshldAmtHigh() {
        return thrshldAmtHigh;
    }

    public void setThrshldAmtHigh(BigDecimal thrshldAmtHigh) {
        this.thrshldAmtHigh = thrshldAmtHigh;
    }

    public BigDecimal getThrshldAmtLow() {
        return thrshldAmtLow;
    }

    public void setThrshldAmtLow(BigDecimal thrshldAmtLow) {
        this.thrshldAmtLow = thrshldAmtLow;
    }

    public BigDecimal getSaleAmtHigh() {
        return saleAmtHigh;
    }

    public void setSaleAmtHigh(BigDecimal saleAmtHigh) {
        this.saleAmtHigh = saleAmtHigh;
    }

    public BigDecimal getSaleAmtLow() {
        return saleAmtLow;
    }

    public void setSaleAmtLow(BigDecimal saleAmtLow) {
        this.saleAmtLow = saleAmtLow;
    }

    public String getMccCds() {
        return mccCds;
    }

    public void setMccCds(String mccCds) {
        this.mccCds = mccCds;
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
        hash += (cntryCd != null ? cntryCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FuelFilterParms)) {
            return false;
        }
        FuelFilterParms other = (FuelFilterParms) object;
        if ((this.cntryCd == null && other.cntryCd != null) || (this.cntryCd != null && !this.cntryCd.equals(other.cntryCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FuelFilterParms[ cntryCd=" + cntryCd + " ]";
    }

}
