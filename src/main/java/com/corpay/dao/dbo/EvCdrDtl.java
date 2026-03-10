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
@Table(name = "EV_CDR_DTL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "EvCdrDtl.findAll", query = "SELECT e FROM EvCdrDtl e")})
public class EvCdrDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EvCdrDtlPK evCdrDtlPK;
    @Basic(optional = false)
    @Column(name = "CDR_REQUEST_ID")
    private String cdrRequestId;
    @Basic(optional = false)
    @Column(name = "CDR_TYPE")
    private String cdrType;
    @Basic(optional = false)
    @Column(name = "CDR_REQUEST_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cdrRequestTs;
    @Basic(optional = false)
    @Column(name = "PAYER_ID")
    private String payerId;
    @Basic(optional = false)
    @Column(name = "PAYER_TYPE")
    private String payerType;
    @Basic(optional = false)
    @Column(name = "PAYER_CHRG_KEY_UID")
    private String payerChrgKeyUid;
    @Basic(optional = false)
    @Column(name = "PAYER_CHRG_KEY_CNTRCT_ID")
    private String payerChrgKeyCntrctId;
    @Basic(optional = false)
    @Column(name = "PAYER_CHRG_KEY_VSUL_NBR")
    private String payerChrgKeyVsulNbr;
    @Basic(optional = false)
    @Column(name = "PAYER_CHRG_KEY_ID_TYPE")
    private String payerChrgKeyIdType;
    @Basic(optional = false)
    @Column(name = "PAYER_CHRG_KEY_TYPE")
    private String payerChrgKeyType;
    @Basic(optional = false)
    @Column(name = "ITEM_SESSION_ID")
    private String itemSessionId;
    @Basic(optional = false)
    @Column(name = "ITEM_EXT_SESSION_ID")
    private String itemExtSessionId;
    @Basic(optional = false)
    @Column(name = "ITEM_START_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itemStartTs;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCAL_START_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itemLocalStartTs;
    @Basic(optional = false)
    @Column(name = "ITEM_STOP_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itemStopTs;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCAL_STOP_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itemLocalStopTs;
    @Basic(optional = false)
    @Column(name = "ITEM_ENERGY_CONSUMED_IN_WH")
    private int itemEnergyConsumedInWh;
    @Basic(optional = false)
    @Column(name = "ITEM_TOTAL_PARKING_TIME")
    private int itemTotalParkingTime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ITEM_EMPCOST_TOT_W_TAX_AMT")
    private BigDecimal itemEmpcostTotWTaxAmt;
    @Basic(optional = false)
    @Column(name = "ITEM_EMPCOST_TOT_WO_TAX_AMT")
    private BigDecimal itemEmpcostTotWoTaxAmt;
    @Basic(optional = false)
    @Column(name = "ITEM_CURRENCY_CD")
    private String itemCurrencyCd;
    @Basic(optional = false)
    @Column(name = "ITEM_PS_LOCATION_ID")
    private String itemPsLocationId;
    @Basic(optional = false)
    @Column(name = "ITEM_CDN_LOCATION_ID")
    private String itemCdnLocationId;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCATION_EVSE_ID")
    private String itemLocationEvseId;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCATION_CPO_ID")
    private String itemLocationCpoId;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCATION_ADDRESS_TXT")
    private String itemLocationAddressTxt;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCATION_CITY_NM")
    private String itemLocationCityNm;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCATION_POSTAL_CD")
    private String itemLocationPostalCd;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCATION_COUNTRY_NM")
    private String itemLocationCountryNm;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCATION_POWER_TYPE")
    private String itemLocationPowerType;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCATION_PRIVATE_NM")
    private String itemLocationPrivateNm;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCATION_LAT_NBR")
    private BigDecimal itemLocationLatNbr;
    @Basic(optional = false)
    @Column(name = "ITEM_LOCATION_LONG_NBR")
    private BigDecimal itemLocationLongNbr;
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

    public EvCdrDtl() {
    }

    public EvCdrDtl(EvCdrDtlPK evCdrDtlPK) {
        this.evCdrDtlPK = evCdrDtlPK;
    }

    public EvCdrDtl(EvCdrDtlPK evCdrDtlPK, String cdrRequestId, String cdrType, Date cdrRequestTs, String payerId, String payerType, String payerChrgKeyUid, String payerChrgKeyCntrctId, String payerChrgKeyVsulNbr, String payerChrgKeyIdType, String payerChrgKeyType, String itemSessionId, String itemExtSessionId, Date itemStartTs, Date itemLocalStartTs, Date itemStopTs, Date itemLocalStopTs, int itemEnergyConsumedInWh, int itemTotalParkingTime, BigDecimal itemEmpcostTotWTaxAmt, BigDecimal itemEmpcostTotWoTaxAmt, String itemCurrencyCd, String itemPsLocationId, String itemCdnLocationId, String itemLocationEvseId, String itemLocationCpoId, String itemLocationAddressTxt, String itemLocationCityNm, String itemLocationPostalCd, String itemLocationCountryNm, String itemLocationPowerType, String itemLocationPrivateNm, BigDecimal itemLocationLatNbr, BigDecimal itemLocationLongNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.evCdrDtlPK = evCdrDtlPK;
        this.cdrRequestId = cdrRequestId;
        this.cdrType = cdrType;
        this.cdrRequestTs = cdrRequestTs;
        this.payerId = payerId;
        this.payerType = payerType;
        this.payerChrgKeyUid = payerChrgKeyUid;
        this.payerChrgKeyCntrctId = payerChrgKeyCntrctId;
        this.payerChrgKeyVsulNbr = payerChrgKeyVsulNbr;
        this.payerChrgKeyIdType = payerChrgKeyIdType;
        this.payerChrgKeyType = payerChrgKeyType;
        this.itemSessionId = itemSessionId;
        this.itemExtSessionId = itemExtSessionId;
        this.itemStartTs = itemStartTs;
        this.itemLocalStartTs = itemLocalStartTs;
        this.itemStopTs = itemStopTs;
        this.itemLocalStopTs = itemLocalStopTs;
        this.itemEnergyConsumedInWh = itemEnergyConsumedInWh;
        this.itemTotalParkingTime = itemTotalParkingTime;
        this.itemEmpcostTotWTaxAmt = itemEmpcostTotWTaxAmt;
        this.itemEmpcostTotWoTaxAmt = itemEmpcostTotWoTaxAmt;
        this.itemCurrencyCd = itemCurrencyCd;
        this.itemPsLocationId = itemPsLocationId;
        this.itemCdnLocationId = itemCdnLocationId;
        this.itemLocationEvseId = itemLocationEvseId;
        this.itemLocationCpoId = itemLocationCpoId;
        this.itemLocationAddressTxt = itemLocationAddressTxt;
        this.itemLocationCityNm = itemLocationCityNm;
        this.itemLocationPostalCd = itemLocationPostalCd;
        this.itemLocationCountryNm = itemLocationCountryNm;
        this.itemLocationPowerType = itemLocationPowerType;
        this.itemLocationPrivateNm = itemLocationPrivateNm;
        this.itemLocationLatNbr = itemLocationLatNbr;
        this.itemLocationLongNbr = itemLocationLongNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public EvCdrDtl(Date trnsDt, int ctlNbr) {
        this.evCdrDtlPK = new EvCdrDtlPK(trnsDt, ctlNbr);
    }

    public EvCdrDtlPK getEvCdrDtlPK() {
        return evCdrDtlPK;
    }

    public void setEvCdrDtlPK(EvCdrDtlPK evCdrDtlPK) {
        this.evCdrDtlPK = evCdrDtlPK;
    }

    public String getCdrRequestId() {
        return cdrRequestId;
    }

    public void setCdrRequestId(String cdrRequestId) {
        this.cdrRequestId = cdrRequestId;
    }

    public String getCdrType() {
        return cdrType;
    }

    public void setCdrType(String cdrType) {
        this.cdrType = cdrType;
    }

    public Date getCdrRequestTs() {
        return cdrRequestTs;
    }

    public void setCdrRequestTs(Date cdrRequestTs) {
        this.cdrRequestTs = cdrRequestTs;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getPayerType() {
        return payerType;
    }

    public void setPayerType(String payerType) {
        this.payerType = payerType;
    }

    public String getPayerChrgKeyUid() {
        return payerChrgKeyUid;
    }

    public void setPayerChrgKeyUid(String payerChrgKeyUid) {
        this.payerChrgKeyUid = payerChrgKeyUid;
    }

    public String getPayerChrgKeyCntrctId() {
        return payerChrgKeyCntrctId;
    }

    public void setPayerChrgKeyCntrctId(String payerChrgKeyCntrctId) {
        this.payerChrgKeyCntrctId = payerChrgKeyCntrctId;
    }

    public String getPayerChrgKeyVsulNbr() {
        return payerChrgKeyVsulNbr;
    }

    public void setPayerChrgKeyVsulNbr(String payerChrgKeyVsulNbr) {
        this.payerChrgKeyVsulNbr = payerChrgKeyVsulNbr;
    }

    public String getPayerChrgKeyIdType() {
        return payerChrgKeyIdType;
    }

    public void setPayerChrgKeyIdType(String payerChrgKeyIdType) {
        this.payerChrgKeyIdType = payerChrgKeyIdType;
    }

    public String getPayerChrgKeyType() {
        return payerChrgKeyType;
    }

    public void setPayerChrgKeyType(String payerChrgKeyType) {
        this.payerChrgKeyType = payerChrgKeyType;
    }

    public String getItemSessionId() {
        return itemSessionId;
    }

    public void setItemSessionId(String itemSessionId) {
        this.itemSessionId = itemSessionId;
    }

    public String getItemExtSessionId() {
        return itemExtSessionId;
    }

    public void setItemExtSessionId(String itemExtSessionId) {
        this.itemExtSessionId = itemExtSessionId;
    }

    public Date getItemStartTs() {
        return itemStartTs;
    }

    public void setItemStartTs(Date itemStartTs) {
        this.itemStartTs = itemStartTs;
    }

    public Date getItemLocalStartTs() {
        return itemLocalStartTs;
    }

    public void setItemLocalStartTs(Date itemLocalStartTs) {
        this.itemLocalStartTs = itemLocalStartTs;
    }

    public Date getItemStopTs() {
        return itemStopTs;
    }

    public void setItemStopTs(Date itemStopTs) {
        this.itemStopTs = itemStopTs;
    }

    public Date getItemLocalStopTs() {
        return itemLocalStopTs;
    }

    public void setItemLocalStopTs(Date itemLocalStopTs) {
        this.itemLocalStopTs = itemLocalStopTs;
    }

    public int getItemEnergyConsumedInWh() {
        return itemEnergyConsumedInWh;
    }

    public void setItemEnergyConsumedInWh(int itemEnergyConsumedInWh) {
        this.itemEnergyConsumedInWh = itemEnergyConsumedInWh;
    }

    public int getItemTotalParkingTime() {
        return itemTotalParkingTime;
    }

    public void setItemTotalParkingTime(int itemTotalParkingTime) {
        this.itemTotalParkingTime = itemTotalParkingTime;
    }

    public BigDecimal getItemEmpcostTotWTaxAmt() {
        return itemEmpcostTotWTaxAmt;
    }

    public void setItemEmpcostTotWTaxAmt(BigDecimal itemEmpcostTotWTaxAmt) {
        this.itemEmpcostTotWTaxAmt = itemEmpcostTotWTaxAmt;
    }

    public BigDecimal getItemEmpcostTotWoTaxAmt() {
        return itemEmpcostTotWoTaxAmt;
    }

    public void setItemEmpcostTotWoTaxAmt(BigDecimal itemEmpcostTotWoTaxAmt) {
        this.itemEmpcostTotWoTaxAmt = itemEmpcostTotWoTaxAmt;
    }

    public String getItemCurrencyCd() {
        return itemCurrencyCd;
    }

    public void setItemCurrencyCd(String itemCurrencyCd) {
        this.itemCurrencyCd = itemCurrencyCd;
    }

    public String getItemPsLocationId() {
        return itemPsLocationId;
    }

    public void setItemPsLocationId(String itemPsLocationId) {
        this.itemPsLocationId = itemPsLocationId;
    }

    public String getItemCdnLocationId() {
        return itemCdnLocationId;
    }

    public void setItemCdnLocationId(String itemCdnLocationId) {
        this.itemCdnLocationId = itemCdnLocationId;
    }

    public String getItemLocationEvseId() {
        return itemLocationEvseId;
    }

    public void setItemLocationEvseId(String itemLocationEvseId) {
        this.itemLocationEvseId = itemLocationEvseId;
    }

    public String getItemLocationCpoId() {
        return itemLocationCpoId;
    }

    public void setItemLocationCpoId(String itemLocationCpoId) {
        this.itemLocationCpoId = itemLocationCpoId;
    }

    public String getItemLocationAddressTxt() {
        return itemLocationAddressTxt;
    }

    public void setItemLocationAddressTxt(String itemLocationAddressTxt) {
        this.itemLocationAddressTxt = itemLocationAddressTxt;
    }

    public String getItemLocationCityNm() {
        return itemLocationCityNm;
    }

    public void setItemLocationCityNm(String itemLocationCityNm) {
        this.itemLocationCityNm = itemLocationCityNm;
    }

    public String getItemLocationPostalCd() {
        return itemLocationPostalCd;
    }

    public void setItemLocationPostalCd(String itemLocationPostalCd) {
        this.itemLocationPostalCd = itemLocationPostalCd;
    }

    public String getItemLocationCountryNm() {
        return itemLocationCountryNm;
    }

    public void setItemLocationCountryNm(String itemLocationCountryNm) {
        this.itemLocationCountryNm = itemLocationCountryNm;
    }

    public String getItemLocationPowerType() {
        return itemLocationPowerType;
    }

    public void setItemLocationPowerType(String itemLocationPowerType) {
        this.itemLocationPowerType = itemLocationPowerType;
    }

    public String getItemLocationPrivateNm() {
        return itemLocationPrivateNm;
    }

    public void setItemLocationPrivateNm(String itemLocationPrivateNm) {
        this.itemLocationPrivateNm = itemLocationPrivateNm;
    }

    public BigDecimal getItemLocationLatNbr() {
        return itemLocationLatNbr;
    }

    public void setItemLocationLatNbr(BigDecimal itemLocationLatNbr) {
        this.itemLocationLatNbr = itemLocationLatNbr;
    }

    public BigDecimal getItemLocationLongNbr() {
        return itemLocationLongNbr;
    }

    public void setItemLocationLongNbr(BigDecimal itemLocationLongNbr) {
        this.itemLocationLongNbr = itemLocationLongNbr;
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
        hash += (evCdrDtlPK != null ? evCdrDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvCdrDtl)) {
            return false;
        }
        EvCdrDtl other = (EvCdrDtl) object;
        if ((this.evCdrDtlPK == null && other.evCdrDtlPK != null) || (this.evCdrDtlPK != null && !this.evCdrDtlPK.equals(other.evCdrDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EvCdrDtl[ evCdrDtlPK=" + evCdrDtlPK + " ]";
    }
    
}
