package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EXP_CHK_BAL_INQ_HIST", catalog = "", schema = "DBO")
public class ExpChkBalInqHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INQ_REQ_HIST_ID")
    private Long inqReqHistId;
    @Basic(optional = false)
    @Column(name = "EXPRESS_CODE")
    private String expressCode;
    @Basic(optional = false)
    @Column(name = "REQ_INQUIRY_DATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reqInquiryDateTs;
    @Basic(optional = false)
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Basic(optional = false)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "ADDRESS1")
    private String address1;
    @Basic(optional = false)
    @Column(name = "ADDRESS2")
    private String address2;
    @Basic(optional = false)
    @Column(name = "CITY")
    private String city;
    @Basic(optional = false)
    @Column(name = "STATE")
    private String state;
    @Basic(optional = false)
    @Column(name = "ZIP")
    private String zip;
    @Basic(optional = false)
    @Column(name = "MOBILE_PH_NUMBER")
    private String mobilePhNumber;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Basic(optional = false)
    @Column(name = "DRIVERS_LIC_NUM")
    private String driversLicNum;
    @Basic(optional = false)
    @Column(name = "DRIVERS_LIC_ST")
    private String driversLicSt;
    @Basic(optional = false)
    @Column(name = "REQ_INQUIRY_RESULT")
    private String reqInquiryResult;
    @Basic(optional = false)
    @Column(name = "COMCHECK_MOBILE_USERNAME")
    private String comcheckMobileUsername;
    @Basic(optional = false)
    @Column(name = "DEVICE_ID")
    private String deviceId;
    @Basic(optional = false)
    @Column(name = "BALANCE_AMT")
    private String balanceAmt;
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

    public ExpChkBalInqHist() {
    }

    public ExpChkBalInqHist(Long inqReqHistId) {
        this.inqReqHistId = inqReqHistId;
    }

    public ExpChkBalInqHist(Long inqReqHistId, String expressCode, Date reqInquiryDateTs, String cardNumber, String firstName, String lastName, String address1, String address2, String city, String state, String zip, String mobilePhNumber, String emailAddress, String driversLicNum, String driversLicSt, String reqInquiryResult, String comcheckMobileUsername, String deviceId, String balanceAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.inqReqHistId = inqReqHistId;
        this.expressCode = expressCode;
        this.reqInquiryDateTs = reqInquiryDateTs;
        this.cardNumber = cardNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobilePhNumber = mobilePhNumber;
        this.emailAddress = emailAddress;
        this.driversLicNum = driversLicNum;
        this.driversLicSt = driversLicSt;
        this.reqInquiryResult = reqInquiryResult;
        this.comcheckMobileUsername = comcheckMobileUsername;
        this.deviceId = deviceId;
        this.balanceAmt = balanceAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getInqReqHistId() {
        return inqReqHistId;
    }

    public void setInqReqHistId(Long inqReqHistId) {
        this.inqReqHistId = inqReqHistId;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public Date getReqInquiryDateTs() {
        return reqInquiryDateTs;
    }

    public void setReqInquiryDateTs(Date reqInquiryDateTs) {
        this.reqInquiryDateTs = reqInquiryDateTs;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMobilePhNumber() {
        return mobilePhNumber;
    }

    public void setMobilePhNumber(String mobilePhNumber) {
        this.mobilePhNumber = mobilePhNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDriversLicNum() {
        return driversLicNum;
    }

    public void setDriversLicNum(String driversLicNum) {
        this.driversLicNum = driversLicNum;
    }

    public String getDriversLicSt() {
        return driversLicSt;
    }

    public void setDriversLicSt(String driversLicSt) {
        this.driversLicSt = driversLicSt;
    }

    public String getReqInquiryResult() {
        return reqInquiryResult;
    }

    public void setReqInquiryResult(String reqInquiryResult) {
        this.reqInquiryResult = reqInquiryResult;
    }

    public String getComcheckMobileUsername() {
        return comcheckMobileUsername;
    }

    public void setComcheckMobileUsername(String comcheckMobileUsername) {
        this.comcheckMobileUsername = comcheckMobileUsername;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(String balanceAmt) {
        this.balanceAmt = balanceAmt;
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
        hash += (inqReqHistId != null ? inqReqHistId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ExpChkBalInqHist)) {
            return false;
        }
        ExpChkBalInqHist other = (ExpChkBalInqHist) object;
        if ((this.inqReqHistId == null && other.inqReqHistId != null) || (this.inqReqHistId != null && !this.inqReqHistId.equals(other.inqReqHistId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ExpChkBalInqHist[ inqReqHistId=" + inqReqHistId + " ]";
    }

}
