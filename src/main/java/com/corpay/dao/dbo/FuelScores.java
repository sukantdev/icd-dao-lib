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
@Table(name = "FUEL_SCORES", catalog = "", schema = "DBO")
public class FuelScores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRAN_ID")
    private Long tranId;
    @Basic(optional = false)
    @Column(name = "LOCATION_ID")
    private String locationId;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "TRAN_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tranTs;
    @Basic(optional = false)
    @Column(name = "COMP_SCORE")
    private double compScore;
    @Basic(optional = false)
    @Column(name = "PRICE_SCORE")
    private double priceScore;
    @Basic(optional = false)
    @Column(name = "FUEL_PRICE")
    private double fuelPrice;
    @Basic(optional = false)
    @Column(name = "BEST_FUEL_PRICE")
    private double bestFuelPrice;
    @Basic(optional = false)
    @Column(name = "AMENITIES_SCORE")
    private double amenitiesScore;
    @Basic(optional = false)
    @Column(name = "FUEL_TYPE_SCORE")
    private double fuelTypeScore;
    @Basic(optional = false)
    @Column(name = "DISTANCE_SCORE")
    private double distanceScore;
    @Basic(optional = false)
    @Column(name = "CARDLESS_SCORE")
    private double cardlessScore;
    @Basic(optional = false)
    @Column(name = "PAYPUMP_SCORE")
    private double paypumpScore;
    @Basic(optional = false)
    @Column(name = "LEVEL3_SCORE")
    private double level3Score;
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
    @Column(name = "CDN_VALUE")
    private double cdnValue;
    @Basic(optional = false)
    @Column(name = "WORST_PRICE")
    private double worstPrice;
    @Basic(optional = false)
    @Column(name = "RETAIL_PRICE")
    private double retailPrice;
    @Basic(optional = false)
    @Column(name = "FL_PRD_CD")
    private String flPrdCd;

    @Basic(optional = false)
    @Column(name = "TOTAL_TRX_AMOUNT")
    private BigDecimal totalTrxAmount;
    @Basic(optional = false)
    @Column(name = "EMPLOYEEID")
    private String employeeid;
    @Basic(optional = false)
    @Column(name = "DIESEL2_COST")
    private BigDecimal diesel2Cost;
    @Basic(optional = false)
    @Column(name = "DIESEL2_QTY")
    private BigDecimal diesel2Qty;
    @Basic(optional = false)
    @Column(name = "DIESEL1_COST")
    private BigDecimal diesel1Cost;
    @Basic(optional = false)
    @Column(name = "DIESEL1_QTY")
    private BigDecimal diesel1Qty;
    @Basic(optional = false)
    @Column(name = "REEFER_COST")
    private BigDecimal reeferCost;
    @Basic(optional = false)
    @Column(name = "REEFER_QTY")
    private BigDecimal reeferQty;
    @Basic(optional = false)
    @Column(name = "OTHER_COST")
    private BigDecimal otherCost;
    @Basic(optional = false)
    @Column(name = "OTHER_QTY")
    private BigDecimal otherQty;
    @Basic(optional = false)
    @Column(name = "OIL_COST")
    private BigDecimal oilCost;
    @Basic(optional = false)
    @Column(name = "OIL_QTY")
    private BigDecimal oilQty;
    @Basic(optional = false)
    @Column(name = "PRODUCT1_CODE")
    private String product1Code;
    @Basic(optional = false)
    @Column(name = "PRODUCT1_AMT")
    private BigDecimal product1Amt;
    @Basic(optional = false)
    @Column(name = "PRODUCT2_CODE")
    private String product2Code;
    @Basic(optional = false)
    @Column(name = "PRODUCT2_AMT")
    private BigDecimal product2Amt;
    @Basic(optional = false)
    @Column(name = "PRODUCT3_CODE")
    private String product3Code;
    @Basic(optional = false)
    @Column(name = "PRODUCT3_AMT")
    private BigDecimal product3Amt;
    @Basic(optional = false)
    @Column(name = "AVERAGE_PRICE")
    private BigDecimal averagePrice;
    @Basic(optional = false)
    @Column(name = "REASON_CD")
    private short reasonCd;
    @Basic(optional = false)
    @Column(name = "TRNS_TYP_CD")
    private Character trnsTypCd;
    @Basic(optional = false)
    @Column(name = "BEST_COMPETITIVE_LOCATIONS")
    private String bestCompetitiveLocations;
    @Basic(optional = false)
    @Column(name = "NRT_COMP_SCORE")
    private BigDecimal nrtCompScore;
    @Basic(optional = false)
    @Column(name = "NRT_PRICE_SCORE")
    private BigDecimal nrtPriceScore;
    @Basic(optional = false)
    @Column(name = "NRT_FUEL_PRICE")
    private BigDecimal nrtFuelPrice;
    @Basic(optional = false)
    @Column(name = "NRT_BEST_FUEL_PRICE")
    private BigDecimal nrtBestFuelPrice;
    @Basic(optional = false)
    @Column(name = "NRT_CDN_VALUE")
    private BigDecimal nrtCdnValue;
    @Basic(optional = false)
    @Column(name = "NRT_WORST_PRICE")
    private BigDecimal nrtWorstPrice;
    @Basic(optional = false)
    @Column(name = "NRT_RETAIL_PRICE")
    private BigDecimal nrtRetailPrice;
    @Basic(optional = false)
    @Column(name = "NRT_TOTAL_TRX_AMOUNT")
    private BigDecimal nrtTotalTrxAmount;
    @Basic(optional = false)
    @Column(name = "NRT_DIESEL2_COST")
    private BigDecimal nrtDiesel2Cost;
    @Basic(optional = false)
    @Column(name = "POSTED_DATE")
    @Temporal(TemporalType.DATE)
    private Date postedDate;
    @Basic(optional = false)
    @Column(name = "CONTROL_ID")
    private long controlId;
    @Basic(optional = false)
    @Column(name = "ODO_PROMPT")
    private String odoPrompt;
    @Basic(optional = false)
    @Column(name = "VEHICLE_ID")
    private String vehicleId;
    @Basic(optional = false)
    @Column(name = "DRIVER_ID")
    private String driverId;
    @Basic(optional = false)
    @Column(name = "AUTH_PR_ID")
    private String authPrId;

    public FuelScores() {
    }

    public FuelScores(Long tranId) {
        this.tranId = tranId;
    }

    public FuelScores(Long tranId, String locationId, String custId, String crdNbr, Date tranTs, double compScore, double priceScore, double fuelPrice, double bestFuelPrice, double amenitiesScore, double fuelTypeScore, double distanceScore, double cardlessScore, double paypumpScore, double level3Score, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, double cdnValue, double worstPrice, double retailPrice, String flPrdCd, BigDecimal totalTrxAmount, String employeeid, BigDecimal diesel2Cost, BigDecimal diesel2Qty, BigDecimal diesel1Cost, BigDecimal diesel1Qty, BigDecimal reeferCost, BigDecimal reeferQty, BigDecimal otherCost, BigDecimal otherQty, BigDecimal oilCost, BigDecimal oilQty, String product1Code, BigDecimal product1Amt, String product2Code, BigDecimal product2Amt, String product3Code, BigDecimal product3Amt, BigDecimal averagePrice, short reasonCd, Character trnsTypCd, String bestCompetitiveLocations, BigDecimal nrtCompScore, BigDecimal nrtPriceScore, BigDecimal nrtFuelPrice, BigDecimal nrtBestFuelPrice, BigDecimal nrtCdnValue, BigDecimal nrtWorstPrice, BigDecimal nrtRetailPrice, BigDecimal nrtTotalTrxAmount, BigDecimal nrtDiesel2Cost, Date postedDate, long controlId, String odoPrompt, String vehicleId, String driverId, String authPrId) {
        this.tranId = tranId;
        this.locationId = locationId;
        this.custId = custId;
        this.crdNbr = crdNbr;
        this.tranTs = tranTs;
        this.compScore = compScore;
        this.priceScore = priceScore;
        this.fuelPrice = fuelPrice;
        this.bestFuelPrice = bestFuelPrice;
        this.amenitiesScore = amenitiesScore;
        this.fuelTypeScore = fuelTypeScore;
        this.distanceScore = distanceScore;
        this.cardlessScore = cardlessScore;
        this.paypumpScore = paypumpScore;
        this.level3Score = level3Score;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.cdnValue = cdnValue;
        this.worstPrice = worstPrice;
        this.retailPrice = retailPrice;
        this.flPrdCd = flPrdCd;
        this.totalTrxAmount = totalTrxAmount;
        this.employeeid = employeeid;
        this.diesel2Cost = diesel2Cost;
        this.diesel2Qty = diesel2Qty;
        this.diesel1Cost = diesel1Cost;
        this.diesel1Qty = diesel1Qty;
        this.reeferCost = reeferCost;
        this.reeferQty = reeferQty;
        this.otherCost = otherCost;
        this.otherQty = otherQty;
        this.oilCost = oilCost;
        this.oilQty = oilQty;
        this.product1Code = product1Code;
        this.product1Amt = product1Amt;
        this.product2Code = product2Code;
        this.product2Amt = product2Amt;
        this.product3Code = product3Code;
        this.product3Amt = product3Amt;
        this.averagePrice = averagePrice;
        this.reasonCd = reasonCd;
        this.trnsTypCd = trnsTypCd;
        this.bestCompetitiveLocations = bestCompetitiveLocations;
        this.nrtCompScore = nrtCompScore;
        this.nrtPriceScore = nrtPriceScore;
        this.nrtFuelPrice = nrtFuelPrice;
        this.nrtBestFuelPrice = nrtBestFuelPrice;
        this.nrtCdnValue = nrtCdnValue;
        this.nrtWorstPrice = nrtWorstPrice;
        this.nrtRetailPrice = nrtRetailPrice;
        this.nrtTotalTrxAmount = nrtTotalTrxAmount;
        this.nrtDiesel2Cost = nrtDiesel2Cost;
        this.postedDate = postedDate;
        this.controlId = controlId;
        this.odoPrompt = odoPrompt;
        this.vehicleId = vehicleId;
        this.driverId = driverId;
        this.authPrId = authPrId;
    }

    public Long getTranId() {
        return tranId;
    }

    public void setTranId(Long tranId) {
        this.tranId = tranId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Date getTranTs() {
        return tranTs;
    }

    public void setTranTs(Date tranTs) {
        this.tranTs = tranTs;
    }

    public double getCompScore() {
        return compScore;
    }

    public void setCompScore(double compScore) {
        this.compScore = compScore;
    }

    public double getPriceScore() {
        return priceScore;
    }

    public void setPriceScore(double priceScore) {
        this.priceScore = priceScore;
    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public double getBestFuelPrice() {
        return bestFuelPrice;
    }

    public void setBestFuelPrice(double bestFuelPrice) {
        this.bestFuelPrice = bestFuelPrice;
    }

    public double getAmenitiesScore() {
        return amenitiesScore;
    }

    public void setAmenitiesScore(double amenitiesScore) {
        this.amenitiesScore = amenitiesScore;
    }

    public double getFuelTypeScore() {
        return fuelTypeScore;
    }

    public void setFuelTypeScore(double fuelTypeScore) {
        this.fuelTypeScore = fuelTypeScore;
    }

    public double getDistanceScore() {
        return distanceScore;
    }

    public void setDistanceScore(double distanceScore) {
        this.distanceScore = distanceScore;
    }

    public double getCardlessScore() {
        return cardlessScore;
    }

    public void setCardlessScore(double cardlessScore) {
        this.cardlessScore = cardlessScore;
    }

    public double getPaypumpScore() {
        return paypumpScore;
    }

    public void setPaypumpScore(double paypumpScore) {
        this.paypumpScore = paypumpScore;
    }

    public double getLevel3Score() {
        return level3Score;
    }

    public void setLevel3Score(double level3Score) {
        this.level3Score = level3Score;
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

    public double getCdnValue() {
        return cdnValue;
    }

    public void setCdnValue(double cdnValue) {
        this.cdnValue = cdnValue;
    }

    public double getWorstPrice() {
        return worstPrice;
    }

    public void setWorstPrice(double worstPrice) {
        this.worstPrice = worstPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getFlPrdCd() {
        return flPrdCd;
    }

    public void setFlPrdCd(String flPrdCd) {
        this.flPrdCd = flPrdCd;
    }

    public BigDecimal getTotalTrxAmount() {
        return totalTrxAmount;
    }

    public void setTotalTrxAmount(BigDecimal totalTrxAmount) {
        this.totalTrxAmount = totalTrxAmount;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public BigDecimal getDiesel2Cost() {
        return diesel2Cost;
    }

    public void setDiesel2Cost(BigDecimal diesel2Cost) {
        this.diesel2Cost = diesel2Cost;
    }

    public BigDecimal getDiesel2Qty() {
        return diesel2Qty;
    }

    public void setDiesel2Qty(BigDecimal diesel2Qty) {
        this.diesel2Qty = diesel2Qty;
    }

    public BigDecimal getDiesel1Cost() {
        return diesel1Cost;
    }

    public void setDiesel1Cost(BigDecimal diesel1Cost) {
        this.diesel1Cost = diesel1Cost;
    }

    public BigDecimal getDiesel1Qty() {
        return diesel1Qty;
    }

    public void setDiesel1Qty(BigDecimal diesel1Qty) {
        this.diesel1Qty = diesel1Qty;
    }

    public BigDecimal getReeferCost() {
        return reeferCost;
    }

    public void setReeferCost(BigDecimal reeferCost) {
        this.reeferCost = reeferCost;
    }

    public BigDecimal getReeferQty() {
        return reeferQty;
    }

    public void setReeferQty(BigDecimal reeferQty) {
        this.reeferQty = reeferQty;
    }

    public BigDecimal getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(BigDecimal otherCost) {
        this.otherCost = otherCost;
    }

    public BigDecimal getOtherQty() {
        return otherQty;
    }

    public void setOtherQty(BigDecimal otherQty) {
        this.otherQty = otherQty;
    }

    public BigDecimal getOilCost() {
        return oilCost;
    }

    public void setOilCost(BigDecimal oilCost) {
        this.oilCost = oilCost;
    }

    public BigDecimal getOilQty() {
        return oilQty;
    }

    public void setOilQty(BigDecimal oilQty) {
        this.oilQty = oilQty;
    }

    public String getProduct1Code() {
        return product1Code;
    }

    public void setProduct1Code(String product1Code) {
        this.product1Code = product1Code;
    }

    public BigDecimal getProduct1Amt() {
        return product1Amt;
    }

    public void setProduct1Amt(BigDecimal product1Amt) {
        this.product1Amt = product1Amt;
    }

    public String getProduct2Code() {
        return product2Code;
    }

    public void setProduct2Code(String product2Code) {
        this.product2Code = product2Code;
    }

    public BigDecimal getProduct2Amt() {
        return product2Amt;
    }

    public void setProduct2Amt(BigDecimal product2Amt) {
        this.product2Amt = product2Amt;
    }

    public String getProduct3Code() {
        return product3Code;
    }

    public void setProduct3Code(String product3Code) {
        this.product3Code = product3Code;
    }

    public BigDecimal getProduct3Amt() {
        return product3Amt;
    }

    public void setProduct3Amt(BigDecimal product3Amt) {
        this.product3Amt = product3Amt;
    }

    public BigDecimal getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(BigDecimal averagePrice) {
        this.averagePrice = averagePrice;
    }

    public short getReasonCd() {
        return reasonCd;
    }

    public void setReasonCd(short reasonCd) {
        this.reasonCd = reasonCd;
    }

    public Character getTrnsTypCd() {
        return trnsTypCd;
    }

    public void setTrnsTypCd(Character trnsTypCd) {
        this.trnsTypCd = trnsTypCd;
    }

    public String getBestCompetitiveLocations() {
        return bestCompetitiveLocations;
    }

    public void setBestCompetitiveLocations(String bestCompetitiveLocations) {
        this.bestCompetitiveLocations = bestCompetitiveLocations;
    }

    public BigDecimal getNrtCompScore() {
        return nrtCompScore;
    }

    public void setNrtCompScore(BigDecimal nrtCompScore) {
        this.nrtCompScore = nrtCompScore;
    }

    public BigDecimal getNrtPriceScore() {
        return nrtPriceScore;
    }

    public void setNrtPriceScore(BigDecimal nrtPriceScore) {
        this.nrtPriceScore = nrtPriceScore;
    }

    public BigDecimal getNrtFuelPrice() {
        return nrtFuelPrice;
    }

    public void setNrtFuelPrice(BigDecimal nrtFuelPrice) {
        this.nrtFuelPrice = nrtFuelPrice;
    }

    public BigDecimal getNrtBestFuelPrice() {
        return nrtBestFuelPrice;
    }

    public void setNrtBestFuelPrice(BigDecimal nrtBestFuelPrice) {
        this.nrtBestFuelPrice = nrtBestFuelPrice;
    }

    public BigDecimal getNrtCdnValue() {
        return nrtCdnValue;
    }

    public void setNrtCdnValue(BigDecimal nrtCdnValue) {
        this.nrtCdnValue = nrtCdnValue;
    }

    public BigDecimal getNrtWorstPrice() {
        return nrtWorstPrice;
    }

    public void setNrtWorstPrice(BigDecimal nrtWorstPrice) {
        this.nrtWorstPrice = nrtWorstPrice;
    }

    public BigDecimal getNrtRetailPrice() {
        return nrtRetailPrice;
    }

    public void setNrtRetailPrice(BigDecimal nrtRetailPrice) {
        this.nrtRetailPrice = nrtRetailPrice;
    }

    public BigDecimal getNrtTotalTrxAmount() {
        return nrtTotalTrxAmount;
    }

    public void setNrtTotalTrxAmount(BigDecimal nrtTotalTrxAmount) {
        this.nrtTotalTrxAmount = nrtTotalTrxAmount;
    }

    public BigDecimal getNrtDiesel2Cost() {
        return nrtDiesel2Cost;
    }

    public void setNrtDiesel2Cost(BigDecimal nrtDiesel2Cost) {
        this.nrtDiesel2Cost = nrtDiesel2Cost;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public long getControlId() {
        return controlId;
    }

    public void setControlId(long controlId) {
        this.controlId = controlId;
    }

    public String getOdoPrompt() {
        return odoPrompt;
    }

    public void setOdoPrompt(String odoPrompt) {
        this.odoPrompt = odoPrompt;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getAuthPrId() {
        return authPrId;
    }

    public void setAuthPrId(String authPrId) {
        this.authPrId = authPrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tranId != null ? tranId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FuelScores)) {
            return false;
        }
        FuelScores other = (FuelScores) object;
        if ((this.tranId == null && other.tranId != null) || (this.tranId != null && !this.tranId.equals(other.tranId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FuelScores[ tranId=" + tranId + " ]";
    }

}
