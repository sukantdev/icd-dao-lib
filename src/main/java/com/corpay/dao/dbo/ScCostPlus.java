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
@Table(name = "SC_COST_PLUS", catalog = "", schema = "DBO")
public class ScCostPlus implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScCostPlusPK scCostPlusPK;
    @Basic(optional = false)
    @Column(name = "RACK_TYP")
    private Character rackTyp;
    @Basic(optional = false)
    @Column(name = "RACK_CTY_NBR")
    private String rackCtyNbr;
    @Basic(optional = false)
    @Column(name = "RACK_CTY_NAME")
    private String rackCtyName;
    @Basic(optional = false)
    @Column(name = "RACK_ST")
    private String rackSt;
    @Basic(optional = false)
    @Column(name = "RACK_SPPLR_NBR")
    private String rackSpplrNbr;
    @Basic(optional = false)
    @Column(name = "RACK_SPPLR_NAME")
    private String rackSpplrName;

    @Basic(optional = false)
    @Column(name = "RACK_NBR2_CUR_PPG")
    private BigDecimal rackNbr2CurPpg;
    @Basic(optional = false)
    @Column(name = "RACK_NBR1_CUR_PPG")
    private BigDecimal rackNbr1CurPpg;
    @Basic(optional = false)
    @Column(name = "RACK_LST_UPD_DT")
    @Temporal(TemporalType.DATE)
    private Date rackLstUpdDt;
    @Basic(optional = false)
    @Column(name = "FED_TAX_TRACTOR_PPG")
    private BigDecimal fedTaxTractorPpg;
    @Basic(optional = false)
    @Column(name = "FED_TAX_REEFER_PPG")
    private BigDecimal fedTaxReeferPpg;
    @Basic(optional = false)
    @Column(name = "ST_FUEL_TAX_TRACTOR_RT")
    private BigDecimal stFuelTaxTractorRt;
    @Basic(optional = false)
    @Column(name = "ST_FUEL_TAX_REEFER_RT")
    private BigDecimal stFuelTaxReeferRt;
    @Basic(optional = false)
    @Column(name = "ST_SUPERFUND_TRACTOR_PPG")
    private BigDecimal stSuperfundTractorPpg;
    @Basic(optional = false)
    @Column(name = "ST_SUPERFUND_REEFER_PPG")
    private BigDecimal stSuperfundReeferPpg;
    @Basic(optional = false)
    @Column(name = "RACK_NBR2_PPG")
    private BigDecimal rackNbr2Ppg;
    @Basic(optional = false)
    @Column(name = "COST_NBR2_PPG")
    private BigDecimal costNbr2Ppg;
    @Basic(optional = false)
    @Column(name = "CASH_NBR2_PPG")
    private BigDecimal cashNbr2Ppg;
    @Basic(optional = false)
    @Column(name = "LUST_TAX_TRACTOR_PPG")
    private BigDecimal lustTaxTractorPpg;
    @Basic(optional = false)
    @Column(name = "LUST_TAX_REEFER_PPG")
    private BigDecimal lustTaxReeferPpg;
    @Basic(optional = false)
    @Column(name = "RACK_NBR1_PPG")
    private BigDecimal rackNbr1Ppg;
    @Basic(optional = false)
    @Column(name = "COST_NBR1_PPG")
    private BigDecimal costNbr1Ppg;
    @Basic(optional = false)
    @Column(name = "CASH_NBR1_PPG")
    private BigDecimal cashNbr1Ppg;
    @Basic(optional = false)
    @Column(name = "TRANS_TAX_TRACTOR_PPG")
    private BigDecimal transTaxTractorPpg;
    @Basic(optional = false)
    @Column(name = "TRANS_TAX_REEFER_PPG")
    private BigDecimal transTaxReeferPpg;
    @Basic(optional = false)
    @Column(name = "RACK_REEFER_PPG")
    private BigDecimal rackReeferPpg;
    @Basic(optional = false)
    @Column(name = "COST_REEFER_PPG")
    private BigDecimal costReeferPpg;
    @Basic(optional = false)
    @Column(name = "CASH_REEFER_PPG")
    private BigDecimal cashReeferPpg;
    @Basic(optional = false)
    @Column(name = "MISC_TAX_TRACTOR_PPG")
    private BigDecimal miscTaxTractorPpg;
    @Basic(optional = false)
    @Column(name = "MISC_TAX_REEFER_PPG")
    private BigDecimal miscTaxReeferPpg;
    @Basic(optional = false)
    @Column(name = "SALES_TAX_TRACTOR_RT")
    private BigDecimal salesTaxTractorRt;
    @Basic(optional = false)
    @Column(name = "SALES_TAX_REEFER_RT")
    private BigDecimal salesTaxReeferRt;
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

    public ScCostPlus() {
    }

    public ScCostPlus(ScCostPlusPK scCostPlusPK) {
        this.scCostPlusPK = scCostPlusPK;
    }

    public ScCostPlus(ScCostPlusPK scCostPlusPK, Character rackTyp, String rackCtyNbr, String rackCtyName, String rackSt, String rackSpplrNbr, String rackSpplrName, BigDecimal rackNbr2CurPpg, BigDecimal rackNbr1CurPpg, Date rackLstUpdDt, BigDecimal fedTaxTractorPpg, BigDecimal fedTaxReeferPpg, BigDecimal stFuelTaxTractorRt, BigDecimal stFuelTaxReeferRt, BigDecimal stSuperfundTractorPpg, BigDecimal stSuperfundReeferPpg, BigDecimal rackNbr2Ppg, BigDecimal costNbr2Ppg, BigDecimal cashNbr2Ppg, BigDecimal lustTaxTractorPpg, BigDecimal lustTaxReeferPpg, BigDecimal rackNbr1Ppg, BigDecimal costNbr1Ppg, BigDecimal cashNbr1Ppg, BigDecimal transTaxTractorPpg, BigDecimal transTaxReeferPpg, BigDecimal rackReeferPpg, BigDecimal costReeferPpg, BigDecimal cashReeferPpg, BigDecimal miscTaxTractorPpg, BigDecimal miscTaxReeferPpg, BigDecimal salesTaxTractorRt, BigDecimal salesTaxReeferRt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.scCostPlusPK = scCostPlusPK;
        this.rackTyp = rackTyp;
        this.rackCtyNbr = rackCtyNbr;
        this.rackCtyName = rackCtyName;
        this.rackSt = rackSt;
        this.rackSpplrNbr = rackSpplrNbr;
        this.rackSpplrName = rackSpplrName;
        this.rackNbr2CurPpg = rackNbr2CurPpg;
        this.rackNbr1CurPpg = rackNbr1CurPpg;
        this.rackLstUpdDt = rackLstUpdDt;
        this.fedTaxTractorPpg = fedTaxTractorPpg;
        this.fedTaxReeferPpg = fedTaxReeferPpg;
        this.stFuelTaxTractorRt = stFuelTaxTractorRt;
        this.stFuelTaxReeferRt = stFuelTaxReeferRt;
        this.stSuperfundTractorPpg = stSuperfundTractorPpg;
        this.stSuperfundReeferPpg = stSuperfundReeferPpg;
        this.rackNbr2Ppg = rackNbr2Ppg;
        this.costNbr2Ppg = costNbr2Ppg;
        this.cashNbr2Ppg = cashNbr2Ppg;
        this.lustTaxTractorPpg = lustTaxTractorPpg;
        this.lustTaxReeferPpg = lustTaxReeferPpg;
        this.rackNbr1Ppg = rackNbr1Ppg;
        this.costNbr1Ppg = costNbr1Ppg;
        this.cashNbr1Ppg = cashNbr1Ppg;
        this.transTaxTractorPpg = transTaxTractorPpg;
        this.transTaxReeferPpg = transTaxReeferPpg;
        this.rackReeferPpg = rackReeferPpg;
        this.costReeferPpg = costReeferPpg;
        this.cashReeferPpg = cashReeferPpg;
        this.miscTaxTractorPpg = miscTaxTractorPpg;
        this.miscTaxReeferPpg = miscTaxReeferPpg;
        this.salesTaxTractorRt = salesTaxTractorRt;
        this.salesTaxReeferRt = salesTaxReeferRt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ScCostPlus(String locTyp, String locCd) {
        this.scCostPlusPK = new ScCostPlusPK(locTyp, locCd);
    }

    public ScCostPlusPK getScCostPlusPK() {
        return scCostPlusPK;
    }

    public void setScCostPlusPK(ScCostPlusPK scCostPlusPK) {
        this.scCostPlusPK = scCostPlusPK;
    }

    public Character getRackTyp() {
        return rackTyp;
    }

    public void setRackTyp(Character rackTyp) {
        this.rackTyp = rackTyp;
    }

    public String getRackCtyNbr() {
        return rackCtyNbr;
    }

    public void setRackCtyNbr(String rackCtyNbr) {
        this.rackCtyNbr = rackCtyNbr;
    }

    public String getRackCtyName() {
        return rackCtyName;
    }

    public void setRackCtyName(String rackCtyName) {
        this.rackCtyName = rackCtyName;
    }

    public String getRackSt() {
        return rackSt;
    }

    public void setRackSt(String rackSt) {
        this.rackSt = rackSt;
    }

    public String getRackSpplrNbr() {
        return rackSpplrNbr;
    }

    public void setRackSpplrNbr(String rackSpplrNbr) {
        this.rackSpplrNbr = rackSpplrNbr;
    }

    public String getRackSpplrName() {
        return rackSpplrName;
    }

    public void setRackSpplrName(String rackSpplrName) {
        this.rackSpplrName = rackSpplrName;
    }

    public BigDecimal getRackNbr2CurPpg() {
        return rackNbr2CurPpg;
    }

    public void setRackNbr2CurPpg(BigDecimal rackNbr2CurPpg) {
        this.rackNbr2CurPpg = rackNbr2CurPpg;
    }

    public BigDecimal getRackNbr1CurPpg() {
        return rackNbr1CurPpg;
    }

    public void setRackNbr1CurPpg(BigDecimal rackNbr1CurPpg) {
        this.rackNbr1CurPpg = rackNbr1CurPpg;
    }

    public Date getRackLstUpdDt() {
        return rackLstUpdDt;
    }

    public void setRackLstUpdDt(Date rackLstUpdDt) {
        this.rackLstUpdDt = rackLstUpdDt;
    }

    public BigDecimal getFedTaxTractorPpg() {
        return fedTaxTractorPpg;
    }

    public void setFedTaxTractorPpg(BigDecimal fedTaxTractorPpg) {
        this.fedTaxTractorPpg = fedTaxTractorPpg;
    }

    public BigDecimal getFedTaxReeferPpg() {
        return fedTaxReeferPpg;
    }

    public void setFedTaxReeferPpg(BigDecimal fedTaxReeferPpg) {
        this.fedTaxReeferPpg = fedTaxReeferPpg;
    }

    public BigDecimal getStFuelTaxTractorRt() {
        return stFuelTaxTractorRt;
    }

    public void setStFuelTaxTractorRt(BigDecimal stFuelTaxTractorRt) {
        this.stFuelTaxTractorRt = stFuelTaxTractorRt;
    }

    public BigDecimal getStFuelTaxReeferRt() {
        return stFuelTaxReeferRt;
    }

    public void setStFuelTaxReeferRt(BigDecimal stFuelTaxReeferRt) {
        this.stFuelTaxReeferRt = stFuelTaxReeferRt;
    }

    public BigDecimal getStSuperfundTractorPpg() {
        return stSuperfundTractorPpg;
    }

    public void setStSuperfundTractorPpg(BigDecimal stSuperfundTractorPpg) {
        this.stSuperfundTractorPpg = stSuperfundTractorPpg;
    }

    public BigDecimal getStSuperfundReeferPpg() {
        return stSuperfundReeferPpg;
    }

    public void setStSuperfundReeferPpg(BigDecimal stSuperfundReeferPpg) {
        this.stSuperfundReeferPpg = stSuperfundReeferPpg;
    }

    public BigDecimal getRackNbr2Ppg() {
        return rackNbr2Ppg;
    }

    public void setRackNbr2Ppg(BigDecimal rackNbr2Ppg) {
        this.rackNbr2Ppg = rackNbr2Ppg;
    }

    public BigDecimal getCostNbr2Ppg() {
        return costNbr2Ppg;
    }

    public void setCostNbr2Ppg(BigDecimal costNbr2Ppg) {
        this.costNbr2Ppg = costNbr2Ppg;
    }

    public BigDecimal getCashNbr2Ppg() {
        return cashNbr2Ppg;
    }

    public void setCashNbr2Ppg(BigDecimal cashNbr2Ppg) {
        this.cashNbr2Ppg = cashNbr2Ppg;
    }

    public BigDecimal getLustTaxTractorPpg() {
        return lustTaxTractorPpg;
    }

    public void setLustTaxTractorPpg(BigDecimal lustTaxTractorPpg) {
        this.lustTaxTractorPpg = lustTaxTractorPpg;
    }

    public BigDecimal getLustTaxReeferPpg() {
        return lustTaxReeferPpg;
    }

    public void setLustTaxReeferPpg(BigDecimal lustTaxReeferPpg) {
        this.lustTaxReeferPpg = lustTaxReeferPpg;
    }

    public BigDecimal getRackNbr1Ppg() {
        return rackNbr1Ppg;
    }

    public void setRackNbr1Ppg(BigDecimal rackNbr1Ppg) {
        this.rackNbr1Ppg = rackNbr1Ppg;
    }

    public BigDecimal getCostNbr1Ppg() {
        return costNbr1Ppg;
    }

    public void setCostNbr1Ppg(BigDecimal costNbr1Ppg) {
        this.costNbr1Ppg = costNbr1Ppg;
    }

    public BigDecimal getCashNbr1Ppg() {
        return cashNbr1Ppg;
    }

    public void setCashNbr1Ppg(BigDecimal cashNbr1Ppg) {
        this.cashNbr1Ppg = cashNbr1Ppg;
    }

    public BigDecimal getTransTaxTractorPpg() {
        return transTaxTractorPpg;
    }

    public void setTransTaxTractorPpg(BigDecimal transTaxTractorPpg) {
        this.transTaxTractorPpg = transTaxTractorPpg;
    }

    public BigDecimal getTransTaxReeferPpg() {
        return transTaxReeferPpg;
    }

    public void setTransTaxReeferPpg(BigDecimal transTaxReeferPpg) {
        this.transTaxReeferPpg = transTaxReeferPpg;
    }

    public BigDecimal getRackReeferPpg() {
        return rackReeferPpg;
    }

    public void setRackReeferPpg(BigDecimal rackReeferPpg) {
        this.rackReeferPpg = rackReeferPpg;
    }

    public BigDecimal getCostReeferPpg() {
        return costReeferPpg;
    }

    public void setCostReeferPpg(BigDecimal costReeferPpg) {
        this.costReeferPpg = costReeferPpg;
    }

    public BigDecimal getCashReeferPpg() {
        return cashReeferPpg;
    }

    public void setCashReeferPpg(BigDecimal cashReeferPpg) {
        this.cashReeferPpg = cashReeferPpg;
    }

    public BigDecimal getMiscTaxTractorPpg() {
        return miscTaxTractorPpg;
    }

    public void setMiscTaxTractorPpg(BigDecimal miscTaxTractorPpg) {
        this.miscTaxTractorPpg = miscTaxTractorPpg;
    }

    public BigDecimal getMiscTaxReeferPpg() {
        return miscTaxReeferPpg;
    }

    public void setMiscTaxReeferPpg(BigDecimal miscTaxReeferPpg) {
        this.miscTaxReeferPpg = miscTaxReeferPpg;
    }

    public BigDecimal getSalesTaxTractorRt() {
        return salesTaxTractorRt;
    }

    public void setSalesTaxTractorRt(BigDecimal salesTaxTractorRt) {
        this.salesTaxTractorRt = salesTaxTractorRt;
    }

    public BigDecimal getSalesTaxReeferRt() {
        return salesTaxReeferRt;
    }

    public void setSalesTaxReeferRt(BigDecimal salesTaxReeferRt) {
        this.salesTaxReeferRt = salesTaxReeferRt;
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
        hash += (scCostPlusPK != null ? scCostPlusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ScCostPlus)) {
            return false;
        }
        ScCostPlus other = (ScCostPlus) object;
        if ((this.scCostPlusPK == null && other.scCostPlusPK != null) || (this.scCostPlusPK != null && !this.scCostPlusPK.equals(other.scCostPlusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ScCostPlus[ scCostPlusPK=" + scCostPlusPK + " ]";
    }

}
