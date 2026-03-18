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
@Table(name = "CTI_DATA", catalog = "", schema = "DBO")
public class CtiData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRIORITY_CODE")
    private String priorityCode;
    @Basic(optional = false)
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Basic(optional = false)
    @Column(name = "CARD_PRESENT")
    private short cardPresent;
    @Basic(optional = false)
    @Column(name = "SERVICE_CENTER_CODE")
    private String serviceCenterCode;
    @Basic(optional = false)
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Basic(optional = false)
    @Column(name = "MULTIPLE_SC_PHONE")
    private short multipleScPhone;
    @Basic(optional = false)
    @Column(name = "UNIT_NUMBER")
    private String unitNumber;
    @Basic(optional = false)
    @Column(name = "EXP_DATE")
    private short expDate;
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_ID")
    private String employeeId;
    @Basic(optional = false)
    @Column(name = "DRIVERS_LICENSE")
    private String driversLicense;
    @Basic(optional = false)
    @Column(name = "DRIVERS_STATE")
    private String driversState;
    @Basic(optional = false)
    @Column(name = "DRIVER_NAME")
    private String driverName;
    @Basic(optional = false)
    @Column(name = "TRIP_NUMBER")
    private String tripNumber;
    @Basic(optional = false)
    @Column(name = "TRAILER_NUMBER")
    private String trailerNumber;
    @Basic(optional = false)
    @Column(name = "PO_NUMBER")
    private String poNumber;
    @Basic(optional = false)
    @Column(name = "TRAILER_HUBOMETER")
    private long trailerHubometer;
    @Basic(optional = false)
    @Column(name = "HUBOMETER")
    private long hubometer;
    @Basic(optional = false)
    @Column(name = "TRAILER_HOURS")
    private long trailerHours;
    @Basic(optional = false)
    @Column(name = "SERVICE_TYPE")
    private Character serviceType;
    @Basic(optional = false)
    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;
    @Basic(optional = false)
    @Column(name = "SEND_ACROSS_PRINTER")
    private Character sendAcrossPrinter;
    @Basic(optional = false)
    @Column(name = "MANUAL_CHECK_NUMBER")
    private long manualCheckNumber;

    @Basic(optional = false)
    @Column(name = "D2_GALLONS")
    private BigDecimal d2Gallons;
    @Basic(optional = false)
    @Column(name = "D2_PPG")
    private BigDecimal d2Ppg;
    @Basic(optional = false)
    @Column(name = "D2_SUBTOTAL")
    private BigDecimal d2Subtotal;
    @Basic(optional = false)
    @Column(name = "D1_GALLONS")
    private BigDecimal d1Gallons;
    @Basic(optional = false)
    @Column(name = "D1_PPG")
    private BigDecimal d1Ppg;
    @Basic(optional = false)
    @Column(name = "D1_SUBTOTAL")
    private BigDecimal d1Subtotal;
    @Basic(optional = false)
    @Column(name = "TRAILER_GALLONS")
    private BigDecimal trailerGallons;
    @Basic(optional = false)
    @Column(name = "TRAILER_PPG")
    private BigDecimal trailerPpg;
    @Basic(optional = false)
    @Column(name = "TRAILER_SUBTOTAL")
    private BigDecimal trailerSubtotal;
    @Basic(optional = false)
    @Column(name = "OTHER_GALLONS")
    private BigDecimal otherGallons;
    @Basic(optional = false)
    @Column(name = "OTHER_PPG")
    private BigDecimal otherPpg;
    @Basic(optional = false)
    @Column(name = "OTHER_SUBTOTAL")
    private BigDecimal otherSubtotal;
    @Basic(optional = false)
    @Column(name = "CASH_ADV_SUBTOTAL")
    private BigDecimal cashAdvSubtotal;
    @Basic(optional = false)
    @Column(name = "TAX_AMOUNT")
    private BigDecimal taxAmount;
    @Basic(optional = false)
    @Column(name = "OIL_QUARTS")
    private short oilQuarts;
    @Basic(optional = false)
    @Column(name = "OIL_SUBTOTAL")
    private BigDecimal oilSubtotal;
    @Basic(optional = false)
    @Column(name = "PRODUCT_CODE1")
    private short productCode1;
    @Basic(optional = false)
    @Column(name = "PRODUCT_CODE1_SUBTOTAL")
    private BigDecimal productCode1Subtotal;
    @Basic(optional = false)
    @Column(name = "PRODUCT_CODE2")
    private short productCode2;
    @Basic(optional = false)
    @Column(name = "PRODUCT_CODE2_SUBTOTAL")
    private BigDecimal productCode2Subtotal;
    @Basic(optional = false)
    @Column(name = "PRODUCT_CODE3")
    private short productCode3;
    @Basic(optional = false)
    @Column(name = "PRODUCT_CODE3_SUBTOTAL")
    private BigDecimal productCode3Subtotal;
    @Basic(optional = false)
    @Column(name = "TOTAL_AMOUNT")
    private BigDecimal totalAmount;
    @Basic(optional = false)
    @Column(name = "MESSAGE_TO_HANDLER")
    private String messageToHandler;
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

    public CtiData() {
    }

    public CtiData(String priorityCode) {
        this.priorityCode = priorityCode;
    }

    public CtiData(String priorityCode, String cardNumber, short cardPresent, String serviceCenterCode, String phoneNumber, short multipleScPhone, String unitNumber, short expDate, String employeeId, String driversLicense, String driversState, String driverName, String tripNumber, String trailerNumber, String poNumber, long trailerHubometer, long hubometer, long trailerHours, Character serviceType, String invoiceNumber, Character sendAcrossPrinter, long manualCheckNumber, BigDecimal d2Gallons, BigDecimal d2Ppg, BigDecimal d2Subtotal, BigDecimal d1Gallons, BigDecimal d1Ppg, BigDecimal d1Subtotal, BigDecimal trailerGallons, BigDecimal trailerPpg, BigDecimal trailerSubtotal, BigDecimal otherGallons, BigDecimal otherPpg, BigDecimal otherSubtotal, BigDecimal cashAdvSubtotal, BigDecimal taxAmount, short oilQuarts, BigDecimal oilSubtotal, short productCode1, BigDecimal productCode1Subtotal, short productCode2, BigDecimal productCode2Subtotal, short productCode3, BigDecimal productCode3Subtotal, BigDecimal totalAmount, String messageToHandler, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.priorityCode = priorityCode;
        this.cardNumber = cardNumber;
        this.cardPresent = cardPresent;
        this.serviceCenterCode = serviceCenterCode;
        this.phoneNumber = phoneNumber;
        this.multipleScPhone = multipleScPhone;
        this.unitNumber = unitNumber;
        this.expDate = expDate;
        this.employeeId = employeeId;
        this.driversLicense = driversLicense;
        this.driversState = driversState;
        this.driverName = driverName;
        this.tripNumber = tripNumber;
        this.trailerNumber = trailerNumber;
        this.poNumber = poNumber;
        this.trailerHubometer = trailerHubometer;
        this.hubometer = hubometer;
        this.trailerHours = trailerHours;
        this.serviceType = serviceType;
        this.invoiceNumber = invoiceNumber;
        this.sendAcrossPrinter = sendAcrossPrinter;
        this.manualCheckNumber = manualCheckNumber;
        this.d2Gallons = d2Gallons;
        this.d2Ppg = d2Ppg;
        this.d2Subtotal = d2Subtotal;
        this.d1Gallons = d1Gallons;
        this.d1Ppg = d1Ppg;
        this.d1Subtotal = d1Subtotal;
        this.trailerGallons = trailerGallons;
        this.trailerPpg = trailerPpg;
        this.trailerSubtotal = trailerSubtotal;
        this.otherGallons = otherGallons;
        this.otherPpg = otherPpg;
        this.otherSubtotal = otherSubtotal;
        this.cashAdvSubtotal = cashAdvSubtotal;
        this.taxAmount = taxAmount;
        this.oilQuarts = oilQuarts;
        this.oilSubtotal = oilSubtotal;
        this.productCode1 = productCode1;
        this.productCode1Subtotal = productCode1Subtotal;
        this.productCode2 = productCode2;
        this.productCode2Subtotal = productCode2Subtotal;
        this.productCode3 = productCode3;
        this.productCode3Subtotal = productCode3Subtotal;
        this.totalAmount = totalAmount;
        this.messageToHandler = messageToHandler;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getPriorityCode() {
        return priorityCode;
    }

    public void setPriorityCode(String priorityCode) {
        this.priorityCode = priorityCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public short getCardPresent() {
        return cardPresent;
    }

    public void setCardPresent(short cardPresent) {
        this.cardPresent = cardPresent;
    }

    public String getServiceCenterCode() {
        return serviceCenterCode;
    }

    public void setServiceCenterCode(String serviceCenterCode) {
        this.serviceCenterCode = serviceCenterCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public short getMultipleScPhone() {
        return multipleScPhone;
    }

    public void setMultipleScPhone(short multipleScPhone) {
        this.multipleScPhone = multipleScPhone;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public short getExpDate() {
        return expDate;
    }

    public void setExpDate(short expDate) {
        this.expDate = expDate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }

    public String getDriversState() {
        return driversState;
    }

    public void setDriversState(String driversState) {
        this.driversState = driversState;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public String getTrailerNumber() {
        return trailerNumber;
    }

    public void setTrailerNumber(String trailerNumber) {
        this.trailerNumber = trailerNumber;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public long getTrailerHubometer() {
        return trailerHubometer;
    }

    public void setTrailerHubometer(long trailerHubometer) {
        this.trailerHubometer = trailerHubometer;
    }

    public long getHubometer() {
        return hubometer;
    }

    public void setHubometer(long hubometer) {
        this.hubometer = hubometer;
    }

    public long getTrailerHours() {
        return trailerHours;
    }

    public void setTrailerHours(long trailerHours) {
        this.trailerHours = trailerHours;
    }

    public Character getServiceType() {
        return serviceType;
    }

    public void setServiceType(Character serviceType) {
        this.serviceType = serviceType;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Character getSendAcrossPrinter() {
        return sendAcrossPrinter;
    }

    public void setSendAcrossPrinter(Character sendAcrossPrinter) {
        this.sendAcrossPrinter = sendAcrossPrinter;
    }

    public long getManualCheckNumber() {
        return manualCheckNumber;
    }

    public void setManualCheckNumber(long manualCheckNumber) {
        this.manualCheckNumber = manualCheckNumber;
    }

    public BigDecimal getD2Gallons() {
        return d2Gallons;
    }

    public void setD2Gallons(BigDecimal d2Gallons) {
        this.d2Gallons = d2Gallons;
    }

    public BigDecimal getD2Ppg() {
        return d2Ppg;
    }

    public void setD2Ppg(BigDecimal d2Ppg) {
        this.d2Ppg = d2Ppg;
    }

    public BigDecimal getD2Subtotal() {
        return d2Subtotal;
    }

    public void setD2Subtotal(BigDecimal d2Subtotal) {
        this.d2Subtotal = d2Subtotal;
    }

    public BigDecimal getD1Gallons() {
        return d1Gallons;
    }

    public void setD1Gallons(BigDecimal d1Gallons) {
        this.d1Gallons = d1Gallons;
    }

    public BigDecimal getD1Ppg() {
        return d1Ppg;
    }

    public void setD1Ppg(BigDecimal d1Ppg) {
        this.d1Ppg = d1Ppg;
    }

    public BigDecimal getD1Subtotal() {
        return d1Subtotal;
    }

    public void setD1Subtotal(BigDecimal d1Subtotal) {
        this.d1Subtotal = d1Subtotal;
    }

    public BigDecimal getTrailerGallons() {
        return trailerGallons;
    }

    public void setTrailerGallons(BigDecimal trailerGallons) {
        this.trailerGallons = trailerGallons;
    }

    public BigDecimal getTrailerPpg() {
        return trailerPpg;
    }

    public void setTrailerPpg(BigDecimal trailerPpg) {
        this.trailerPpg = trailerPpg;
    }

    public BigDecimal getTrailerSubtotal() {
        return trailerSubtotal;
    }

    public void setTrailerSubtotal(BigDecimal trailerSubtotal) {
        this.trailerSubtotal = trailerSubtotal;
    }

    public BigDecimal getOtherGallons() {
        return otherGallons;
    }

    public void setOtherGallons(BigDecimal otherGallons) {
        this.otherGallons = otherGallons;
    }

    public BigDecimal getOtherPpg() {
        return otherPpg;
    }

    public void setOtherPpg(BigDecimal otherPpg) {
        this.otherPpg = otherPpg;
    }

    public BigDecimal getOtherSubtotal() {
        return otherSubtotal;
    }

    public void setOtherSubtotal(BigDecimal otherSubtotal) {
        this.otherSubtotal = otherSubtotal;
    }

    public BigDecimal getCashAdvSubtotal() {
        return cashAdvSubtotal;
    }

    public void setCashAdvSubtotal(BigDecimal cashAdvSubtotal) {
        this.cashAdvSubtotal = cashAdvSubtotal;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public short getOilQuarts() {
        return oilQuarts;
    }

    public void setOilQuarts(short oilQuarts) {
        this.oilQuarts = oilQuarts;
    }

    public BigDecimal getOilSubtotal() {
        return oilSubtotal;
    }

    public void setOilSubtotal(BigDecimal oilSubtotal) {
        this.oilSubtotal = oilSubtotal;
    }

    public short getProductCode1() {
        return productCode1;
    }

    public void setProductCode1(short productCode1) {
        this.productCode1 = productCode1;
    }

    public BigDecimal getProductCode1Subtotal() {
        return productCode1Subtotal;
    }

    public void setProductCode1Subtotal(BigDecimal productCode1Subtotal) {
        this.productCode1Subtotal = productCode1Subtotal;
    }

    public short getProductCode2() {
        return productCode2;
    }

    public void setProductCode2(short productCode2) {
        this.productCode2 = productCode2;
    }

    public BigDecimal getProductCode2Subtotal() {
        return productCode2Subtotal;
    }

    public void setProductCode2Subtotal(BigDecimal productCode2Subtotal) {
        this.productCode2Subtotal = productCode2Subtotal;
    }

    public short getProductCode3() {
        return productCode3;
    }

    public void setProductCode3(short productCode3) {
        this.productCode3 = productCode3;
    }

    public BigDecimal getProductCode3Subtotal() {
        return productCode3Subtotal;
    }

    public void setProductCode3Subtotal(BigDecimal productCode3Subtotal) {
        this.productCode3Subtotal = productCode3Subtotal;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getMessageToHandler() {
        return messageToHandler;
    }

    public void setMessageToHandler(String messageToHandler) {
        this.messageToHandler = messageToHandler;
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
        hash += (priorityCode != null ? priorityCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CtiData)) {
            return false;
        }
        CtiData other = (CtiData) object;
        if ((this.priorityCode == null && other.priorityCode != null) || (this.priorityCode != null && !this.priorityCode.equals(other.priorityCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CtiData[ priorityCode=" + priorityCode + " ]";
    }

}
