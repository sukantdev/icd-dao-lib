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
@Table(name = "CUSTOMER", catalog = "", schema = "DBO")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CU_CUSTOMER_ID")
    private String cuCustomerId;
    @Basic(optional = false)
    @Column(name = "CU_STATUS")
    private Character cuStatus;
    @Basic(optional = false)
    @Column(name = "CU_ACCOUNT_CODE")
    private String cuAccountCode;
    @Basic(optional = false)
    @Column(name = "CU_CUSTOMER_NAME")
    private String cuCustomerName;
    @Basic(optional = false)
    @Column(name = "CU_ADDRESS_1")
    private String cuAddress1;
    @Basic(optional = false)
    @Column(name = "CU_ADDRESS_2")
    private String cuAddress2;
    @Basic(optional = false)
    @Column(name = "CU_CITY")
    private String cuCity;
    @Basic(optional = false)
    @Column(name = "CU_STATE_PROVINCE")
    private String cuStateProvince;
    @Basic(optional = false)
    @Column(name = "CU_POSTAL_CODE")
    private String cuPostalCode;
    @Basic(optional = false)
    @Column(name = "CU_COUNTRY_CODE")
    private String cuCountryCode;
    @Basic(optional = false)
    @Column(name = "CU_PHONE_NUMBER")
    private String cuPhoneNumber;
    @Basic(optional = false)
    @Column(name = "CU_IN_STATION_FLAG")
    private Character cuInStationFlag;
    @Basic(optional = false)
    @Column(name = "CU_TRAILER_NUMBER_FLAG")
    private Character cuTrailerNumberFlag;
    @Basic(optional = false)
    @Column(name = "CU_TRAILER_EDIT")
    private String cuTrailerEdit;
    @Basic(optional = false)
    @Column(name = "CU_TRAILER_HUB")
    private Character cuTrailerHub;
    @Basic(optional = false)
    @Column(name = "CU_VERIFY_TRAILER_HRS")
    private Character cuVerifyTrailerHrs;
    @Basic(optional = false)
    @Column(name = "CU_CUST_LICENSE_YN")
    private Character cuCustLicenseYn;
    @Basic(optional = false)
    @Column(name = "CU_PURCHASE_ORDER")
    private Character cuPurchaseOrder;
    @Basic(optional = false)
    @Column(name = "CU_PURCHASE_ORDER_EDIT")
    private String cuPurchaseOrderEdit;
    @Basic(optional = false)
    @Column(name = "CU_LIMIT_NETWORK_BY_CARD")
    private Character cuLimitNetworkByCard;
    @Basic(optional = false)
    @Column(name = "CU_MC_CUSTOMER")
    private Character cuMcCustomer;
    @Basic(optional = false)
    @Column(name = "CU_MONEY_SERVICE")
    private Character cuMoneyService;
    @Basic(optional = false)
    @Column(name = "CU_BALANCE_LIMIT_FLAG")
    private Character cuBalanceLimitFlag;
    @Basic(optional = false)
    @Column(name = "CU_FREE_TXN_ALLOWED")
    private short cuFreeTxnAllowed;
    @Basic(optional = false)
    @Column(name = "CU_ATM_ACCESS")
    private Character cuAtmAccess;
    @Basic(optional = false)
    @Column(name = "CU_POS_NETWORK")
    private Character cuPosNetwork;
    @Basic(optional = false)
    @Column(name = "CU_ATM_STANDIN_FLAG")
    private Character cuAtmStandinFlag;
    @Basic(optional = false)
    @Column(name = "CU_POS_STANDIN_FLAG")
    private Character cuPosStandinFlag;
    @Basic(optional = false)
    @Column(name = "CU_ATM_POS_DLY_COUNT_LIM")
    private short cuAtmPosDlyCountLim;
    @Basic(optional = false)
    @Column(name = "CU_ATM_POS_DLY_AMOUNT_LIM")
    private int cuAtmPosDlyAmountLim;
    @Basic(optional = false)
    @Column(name = "CU_ATM_POS_DEFAULT")
    private Character cuAtmPosDefault;

    @Basic(optional = false)
    @Column(name = "CU_ATM_FEE_US_CN")
    private BigDecimal cuAtmFeeUsCn;
    @Basic(optional = false)
    @Column(name = "CU_ATM_FEE_INTL")
    private BigDecimal cuAtmFeeIntl;
    @Basic(optional = false)
    @Column(name = "CU_POS_DEBIT_FEE")
    private BigDecimal cuPosDebitFee;
    @Basic(optional = false)
    @Column(name = "CU_ATM_POS_FREE_TXN_FLAG")
    private Character cuAtmPosFreeTxnFlag;
    @Basic(optional = false)
    @Column(name = "CU_FUEL_CUSTOMER")
    private Character cuFuelCustomer;
    @Basic(optional = false)
    @Column(name = "CU_COMCASH_FLAG")
    private Character cuComcashFlag;
    @Basic(optional = false)
    @Column(name = "CU_EC_BILL_FLAG")
    private Character cuEcBillFlag;
    @Basic(optional = false)
    @Column(name = "CU_CUST_NETW_FLAG")
    private Character cuCustNetwFlag;
    @Basic(optional = false)
    @Column(name = "CU_MC_LIM_NETW_FLAG")
    private Character cuMcLimNetwFlag;
    @Basic(optional = false)
    @Column(name = "CU_FLEET_LIMIT_FLAG")
    private Character cuFleetLimitFlag;
    @Basic(optional = false)
    @Column(name = "CU_OVERRIDE_LIM_NETW_FLAG")
    private Character cuOverrideLimNetwFlag;
    @Basic(optional = false)
    @Column(name = "CU_CARD_EXPIRATION")
    private String cuCardExpiration;
    @Basic(optional = false)
    @Column(name = "CU_CARD_EXPIRATION_PRE")
    private String cuCardExpirationPre;
    @Basic(optional = false)
    @Column(name = "CU_CARD_EXPIRATION_B4PRE")
    private String cuCardExpirationB4pre;
    @Basic(optional = false)
    @Column(name = "CU_CASH_OUT_FREE")
    private Character cuCashOutFree;
    @Basic(optional = false)
    @Column(name = "CU_CASH_OUT_FEE")
    private BigDecimal cuCashOutFee;
    @Basic(optional = false)
    @Column(name = "CU_IN_NETWORK_FEE")
    private BigDecimal cuInNetworkFee;
    @Basic(optional = false)
    @Column(name = "CU_PLUS_LESS_AT_PICKUP")
    private Character cuPlusLessAtPickup;
    @Basic(optional = false)
    @Column(name = "CU_LAST_CRC")
    private long cuLastCrc;
    @Basic(optional = false)
    @Column(name = "LAST_UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateTs;
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
    @Column(name = "CU_CRD_TYP")
    private String cuCrdTyp;
    @Basic(optional = false)
    @Column(name = "CU_CRD_FRMT")
    private String cuCrdFrmt;
    @Basic(optional = false)
    @Column(name = "CU_RFID_TAG_UNIT_FL")
    private Character cuRfidTagUnitFl;
    @Basic(optional = false)
    @Column(name = "CU_RFID_TAG_TRAILER_FL")
    private Character cuRfidTagTrailerFl;
    @Basic(optional = false)
    @Column(name = "CU_BLCK_CRD_SWIPE_XTN_FL")
    private Character cuBlckCrdSwipeXtnFl;

    public Customer() {
    }

    public Customer(String cuCustomerId) {
        this.cuCustomerId = cuCustomerId;
    }

    public Customer(String cuCustomerId, Character cuStatus, String cuAccountCode, String cuCustomerName, String cuAddress1, String cuAddress2, String cuCity, String cuStateProvince, String cuPostalCode, String cuCountryCode, String cuPhoneNumber, Character cuInStationFlag, Character cuTrailerNumberFlag, String cuTrailerEdit, Character cuTrailerHub, Character cuVerifyTrailerHrs, Character cuCustLicenseYn, Character cuPurchaseOrder, String cuPurchaseOrderEdit, Character cuLimitNetworkByCard, Character cuMcCustomer, Character cuMoneyService, Character cuBalanceLimitFlag, short cuFreeTxnAllowed, Character cuAtmAccess, Character cuPosNetwork, Character cuAtmStandinFlag, Character cuPosStandinFlag, short cuAtmPosDlyCountLim, int cuAtmPosDlyAmountLim, Character cuAtmPosDefault, BigDecimal cuAtmFeeUsCn, BigDecimal cuAtmFeeIntl, BigDecimal cuPosDebitFee, Character cuAtmPosFreeTxnFlag, Character cuFuelCustomer, Character cuComcashFlag, Character cuEcBillFlag, Character cuCustNetwFlag, Character cuMcLimNetwFlag, Character cuFleetLimitFlag, Character cuOverrideLimNetwFlag, String cuCardExpiration, String cuCardExpirationPre, String cuCardExpirationB4pre, Character cuCashOutFree, BigDecimal cuCashOutFee, BigDecimal cuInNetworkFee, Character cuPlusLessAtPickup, long cuLastCrc, Date lastUpdateTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String cuCrdTyp, String cuCrdFrmt, Character cuRfidTagUnitFl, Character cuRfidTagTrailerFl, Character cuBlckCrdSwipeXtnFl) {
        this.cuCustomerId = cuCustomerId;
        this.cuStatus = cuStatus;
        this.cuAccountCode = cuAccountCode;
        this.cuCustomerName = cuCustomerName;
        this.cuAddress1 = cuAddress1;
        this.cuAddress2 = cuAddress2;
        this.cuCity = cuCity;
        this.cuStateProvince = cuStateProvince;
        this.cuPostalCode = cuPostalCode;
        this.cuCountryCode = cuCountryCode;
        this.cuPhoneNumber = cuPhoneNumber;
        this.cuInStationFlag = cuInStationFlag;
        this.cuTrailerNumberFlag = cuTrailerNumberFlag;
        this.cuTrailerEdit = cuTrailerEdit;
        this.cuTrailerHub = cuTrailerHub;
        this.cuVerifyTrailerHrs = cuVerifyTrailerHrs;
        this.cuCustLicenseYn = cuCustLicenseYn;
        this.cuPurchaseOrder = cuPurchaseOrder;
        this.cuPurchaseOrderEdit = cuPurchaseOrderEdit;
        this.cuLimitNetworkByCard = cuLimitNetworkByCard;
        this.cuMcCustomer = cuMcCustomer;
        this.cuMoneyService = cuMoneyService;
        this.cuBalanceLimitFlag = cuBalanceLimitFlag;
        this.cuFreeTxnAllowed = cuFreeTxnAllowed;
        this.cuAtmAccess = cuAtmAccess;
        this.cuPosNetwork = cuPosNetwork;
        this.cuAtmStandinFlag = cuAtmStandinFlag;
        this.cuPosStandinFlag = cuPosStandinFlag;
        this.cuAtmPosDlyCountLim = cuAtmPosDlyCountLim;
        this.cuAtmPosDlyAmountLim = cuAtmPosDlyAmountLim;
        this.cuAtmPosDefault = cuAtmPosDefault;
        this.cuAtmFeeUsCn = cuAtmFeeUsCn;
        this.cuAtmFeeIntl = cuAtmFeeIntl;
        this.cuPosDebitFee = cuPosDebitFee;
        this.cuAtmPosFreeTxnFlag = cuAtmPosFreeTxnFlag;
        this.cuFuelCustomer = cuFuelCustomer;
        this.cuComcashFlag = cuComcashFlag;
        this.cuEcBillFlag = cuEcBillFlag;
        this.cuCustNetwFlag = cuCustNetwFlag;
        this.cuMcLimNetwFlag = cuMcLimNetwFlag;
        this.cuFleetLimitFlag = cuFleetLimitFlag;
        this.cuOverrideLimNetwFlag = cuOverrideLimNetwFlag;
        this.cuCardExpiration = cuCardExpiration;
        this.cuCardExpirationPre = cuCardExpirationPre;
        this.cuCardExpirationB4pre = cuCardExpirationB4pre;
        this.cuCashOutFree = cuCashOutFree;
        this.cuCashOutFee = cuCashOutFee;
        this.cuInNetworkFee = cuInNetworkFee;
        this.cuPlusLessAtPickup = cuPlusLessAtPickup;
        this.cuLastCrc = cuLastCrc;
        this.lastUpdateTs = lastUpdateTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.cuCrdTyp = cuCrdTyp;
        this.cuCrdFrmt = cuCrdFrmt;
        this.cuRfidTagUnitFl = cuRfidTagUnitFl;
        this.cuRfidTagTrailerFl = cuRfidTagTrailerFl;
        this.cuBlckCrdSwipeXtnFl = cuBlckCrdSwipeXtnFl;
    }

    public String getCuCustomerId() {
        return cuCustomerId;
    }

    public void setCuCustomerId(String cuCustomerId) {
        this.cuCustomerId = cuCustomerId;
    }

    public Character getCuStatus() {
        return cuStatus;
    }

    public void setCuStatus(Character cuStatus) {
        this.cuStatus = cuStatus;
    }

    public String getCuAccountCode() {
        return cuAccountCode;
    }

    public void setCuAccountCode(String cuAccountCode) {
        this.cuAccountCode = cuAccountCode;
    }

    public String getCuCustomerName() {
        return cuCustomerName;
    }

    public void setCuCustomerName(String cuCustomerName) {
        this.cuCustomerName = cuCustomerName;
    }

    public String getCuAddress1() {
        return cuAddress1;
    }

    public void setCuAddress1(String cuAddress1) {
        this.cuAddress1 = cuAddress1;
    }

    public String getCuAddress2() {
        return cuAddress2;
    }

    public void setCuAddress2(String cuAddress2) {
        this.cuAddress2 = cuAddress2;
    }

    public String getCuCity() {
        return cuCity;
    }

    public void setCuCity(String cuCity) {
        this.cuCity = cuCity;
    }

    public String getCuStateProvince() {
        return cuStateProvince;
    }

    public void setCuStateProvince(String cuStateProvince) {
        this.cuStateProvince = cuStateProvince;
    }

    public String getCuPostalCode() {
        return cuPostalCode;
    }

    public void setCuPostalCode(String cuPostalCode) {
        this.cuPostalCode = cuPostalCode;
    }

    public String getCuCountryCode() {
        return cuCountryCode;
    }

    public void setCuCountryCode(String cuCountryCode) {
        this.cuCountryCode = cuCountryCode;
    }

    public String getCuPhoneNumber() {
        return cuPhoneNumber;
    }

    public void setCuPhoneNumber(String cuPhoneNumber) {
        this.cuPhoneNumber = cuPhoneNumber;
    }

    public Character getCuInStationFlag() {
        return cuInStationFlag;
    }

    public void setCuInStationFlag(Character cuInStationFlag) {
        this.cuInStationFlag = cuInStationFlag;
    }

    public Character getCuTrailerNumberFlag() {
        return cuTrailerNumberFlag;
    }

    public void setCuTrailerNumberFlag(Character cuTrailerNumberFlag) {
        this.cuTrailerNumberFlag = cuTrailerNumberFlag;
    }

    public String getCuTrailerEdit() {
        return cuTrailerEdit;
    }

    public void setCuTrailerEdit(String cuTrailerEdit) {
        this.cuTrailerEdit = cuTrailerEdit;
    }

    public Character getCuTrailerHub() {
        return cuTrailerHub;
    }

    public void setCuTrailerHub(Character cuTrailerHub) {
        this.cuTrailerHub = cuTrailerHub;
    }

    public Character getCuVerifyTrailerHrs() {
        return cuVerifyTrailerHrs;
    }

    public void setCuVerifyTrailerHrs(Character cuVerifyTrailerHrs) {
        this.cuVerifyTrailerHrs = cuVerifyTrailerHrs;
    }

    public Character getCuCustLicenseYn() {
        return cuCustLicenseYn;
    }

    public void setCuCustLicenseYn(Character cuCustLicenseYn) {
        this.cuCustLicenseYn = cuCustLicenseYn;
    }

    public Character getCuPurchaseOrder() {
        return cuPurchaseOrder;
    }

    public void setCuPurchaseOrder(Character cuPurchaseOrder) {
        this.cuPurchaseOrder = cuPurchaseOrder;
    }

    public String getCuPurchaseOrderEdit() {
        return cuPurchaseOrderEdit;
    }

    public void setCuPurchaseOrderEdit(String cuPurchaseOrderEdit) {
        this.cuPurchaseOrderEdit = cuPurchaseOrderEdit;
    }

    public Character getCuLimitNetworkByCard() {
        return cuLimitNetworkByCard;
    }

    public void setCuLimitNetworkByCard(Character cuLimitNetworkByCard) {
        this.cuLimitNetworkByCard = cuLimitNetworkByCard;
    }

    public Character getCuMcCustomer() {
        return cuMcCustomer;
    }

    public void setCuMcCustomer(Character cuMcCustomer) {
        this.cuMcCustomer = cuMcCustomer;
    }

    public Character getCuMoneyService() {
        return cuMoneyService;
    }

    public void setCuMoneyService(Character cuMoneyService) {
        this.cuMoneyService = cuMoneyService;
    }

    public Character getCuBalanceLimitFlag() {
        return cuBalanceLimitFlag;
    }

    public void setCuBalanceLimitFlag(Character cuBalanceLimitFlag) {
        this.cuBalanceLimitFlag = cuBalanceLimitFlag;
    }

    public short getCuFreeTxnAllowed() {
        return cuFreeTxnAllowed;
    }

    public void setCuFreeTxnAllowed(short cuFreeTxnAllowed) {
        this.cuFreeTxnAllowed = cuFreeTxnAllowed;
    }

    public Character getCuAtmAccess() {
        return cuAtmAccess;
    }

    public void setCuAtmAccess(Character cuAtmAccess) {
        this.cuAtmAccess = cuAtmAccess;
    }

    public Character getCuPosNetwork() {
        return cuPosNetwork;
    }

    public void setCuPosNetwork(Character cuPosNetwork) {
        this.cuPosNetwork = cuPosNetwork;
    }

    public Character getCuAtmStandinFlag() {
        return cuAtmStandinFlag;
    }

    public void setCuAtmStandinFlag(Character cuAtmStandinFlag) {
        this.cuAtmStandinFlag = cuAtmStandinFlag;
    }

    public Character getCuPosStandinFlag() {
        return cuPosStandinFlag;
    }

    public void setCuPosStandinFlag(Character cuPosStandinFlag) {
        this.cuPosStandinFlag = cuPosStandinFlag;
    }

    public short getCuAtmPosDlyCountLim() {
        return cuAtmPosDlyCountLim;
    }

    public void setCuAtmPosDlyCountLim(short cuAtmPosDlyCountLim) {
        this.cuAtmPosDlyCountLim = cuAtmPosDlyCountLim;
    }

    public int getCuAtmPosDlyAmountLim() {
        return cuAtmPosDlyAmountLim;
    }

    public void setCuAtmPosDlyAmountLim(int cuAtmPosDlyAmountLim) {
        this.cuAtmPosDlyAmountLim = cuAtmPosDlyAmountLim;
    }

    public Character getCuAtmPosDefault() {
        return cuAtmPosDefault;
    }

    public void setCuAtmPosDefault(Character cuAtmPosDefault) {
        this.cuAtmPosDefault = cuAtmPosDefault;
    }

    public BigDecimal getCuAtmFeeUsCn() {
        return cuAtmFeeUsCn;
    }

    public void setCuAtmFeeUsCn(BigDecimal cuAtmFeeUsCn) {
        this.cuAtmFeeUsCn = cuAtmFeeUsCn;
    }

    public BigDecimal getCuAtmFeeIntl() {
        return cuAtmFeeIntl;
    }

    public void setCuAtmFeeIntl(BigDecimal cuAtmFeeIntl) {
        this.cuAtmFeeIntl = cuAtmFeeIntl;
    }

    public BigDecimal getCuPosDebitFee() {
        return cuPosDebitFee;
    }

    public void setCuPosDebitFee(BigDecimal cuPosDebitFee) {
        this.cuPosDebitFee = cuPosDebitFee;
    }

    public Character getCuAtmPosFreeTxnFlag() {
        return cuAtmPosFreeTxnFlag;
    }

    public void setCuAtmPosFreeTxnFlag(Character cuAtmPosFreeTxnFlag) {
        this.cuAtmPosFreeTxnFlag = cuAtmPosFreeTxnFlag;
    }

    public Character getCuFuelCustomer() {
        return cuFuelCustomer;
    }

    public void setCuFuelCustomer(Character cuFuelCustomer) {
        this.cuFuelCustomer = cuFuelCustomer;
    }

    public Character getCuComcashFlag() {
        return cuComcashFlag;
    }

    public void setCuComcashFlag(Character cuComcashFlag) {
        this.cuComcashFlag = cuComcashFlag;
    }

    public Character getCuEcBillFlag() {
        return cuEcBillFlag;
    }

    public void setCuEcBillFlag(Character cuEcBillFlag) {
        this.cuEcBillFlag = cuEcBillFlag;
    }

    public Character getCuCustNetwFlag() {
        return cuCustNetwFlag;
    }

    public void setCuCustNetwFlag(Character cuCustNetwFlag) {
        this.cuCustNetwFlag = cuCustNetwFlag;
    }

    public Character getCuMcLimNetwFlag() {
        return cuMcLimNetwFlag;
    }

    public void setCuMcLimNetwFlag(Character cuMcLimNetwFlag) {
        this.cuMcLimNetwFlag = cuMcLimNetwFlag;
    }

    public Character getCuFleetLimitFlag() {
        return cuFleetLimitFlag;
    }

    public void setCuFleetLimitFlag(Character cuFleetLimitFlag) {
        this.cuFleetLimitFlag = cuFleetLimitFlag;
    }

    public Character getCuOverrideLimNetwFlag() {
        return cuOverrideLimNetwFlag;
    }

    public void setCuOverrideLimNetwFlag(Character cuOverrideLimNetwFlag) {
        this.cuOverrideLimNetwFlag = cuOverrideLimNetwFlag;
    }

    public String getCuCardExpiration() {
        return cuCardExpiration;
    }

    public void setCuCardExpiration(String cuCardExpiration) {
        this.cuCardExpiration = cuCardExpiration;
    }

    public String getCuCardExpirationPre() {
        return cuCardExpirationPre;
    }

    public void setCuCardExpirationPre(String cuCardExpirationPre) {
        this.cuCardExpirationPre = cuCardExpirationPre;
    }

    public String getCuCardExpirationB4pre() {
        return cuCardExpirationB4pre;
    }

    public void setCuCardExpirationB4pre(String cuCardExpirationB4pre) {
        this.cuCardExpirationB4pre = cuCardExpirationB4pre;
    }

    public Character getCuCashOutFree() {
        return cuCashOutFree;
    }

    public void setCuCashOutFree(Character cuCashOutFree) {
        this.cuCashOutFree = cuCashOutFree;
    }

    public BigDecimal getCuCashOutFee() {
        return cuCashOutFee;
    }

    public void setCuCashOutFee(BigDecimal cuCashOutFee) {
        this.cuCashOutFee = cuCashOutFee;
    }

    public BigDecimal getCuInNetworkFee() {
        return cuInNetworkFee;
    }

    public void setCuInNetworkFee(BigDecimal cuInNetworkFee) {
        this.cuInNetworkFee = cuInNetworkFee;
    }

    public Character getCuPlusLessAtPickup() {
        return cuPlusLessAtPickup;
    }

    public void setCuPlusLessAtPickup(Character cuPlusLessAtPickup) {
        this.cuPlusLessAtPickup = cuPlusLessAtPickup;
    }

    public long getCuLastCrc() {
        return cuLastCrc;
    }

    public void setCuLastCrc(long cuLastCrc) {
        this.cuLastCrc = cuLastCrc;
    }

    public Date getLastUpdateTs() {
        return lastUpdateTs;
    }

    public void setLastUpdateTs(Date lastUpdateTs) {
        this.lastUpdateTs = lastUpdateTs;
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

    public String getCuCrdTyp() {
        return cuCrdTyp;
    }

    public void setCuCrdTyp(String cuCrdTyp) {
        this.cuCrdTyp = cuCrdTyp;
    }

    public String getCuCrdFrmt() {
        return cuCrdFrmt;
    }

    public void setCuCrdFrmt(String cuCrdFrmt) {
        this.cuCrdFrmt = cuCrdFrmt;
    }

    public Character getCuRfidTagUnitFl() {
        return cuRfidTagUnitFl;
    }

    public void setCuRfidTagUnitFl(Character cuRfidTagUnitFl) {
        this.cuRfidTagUnitFl = cuRfidTagUnitFl;
    }

    public Character getCuRfidTagTrailerFl() {
        return cuRfidTagTrailerFl;
    }

    public void setCuRfidTagTrailerFl(Character cuRfidTagTrailerFl) {
        this.cuRfidTagTrailerFl = cuRfidTagTrailerFl;
    }

    public Character getCuBlckCrdSwipeXtnFl() {
        return cuBlckCrdSwipeXtnFl;
    }

    public void setCuBlckCrdSwipeXtnFl(Character cuBlckCrdSwipeXtnFl) {
        this.cuBlckCrdSwipeXtnFl = cuBlckCrdSwipeXtnFl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuCustomerId != null ? cuCustomerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.cuCustomerId == null && other.cuCustomerId != null) || (this.cuCustomerId != null && !this.cuCustomerId.equals(other.cuCustomerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Customer[ cuCustomerId=" + cuCustomerId + " ]";
    }

}
