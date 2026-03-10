/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "USR_CM_INFO", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrCmInfo.findAll", query = "SELECT u FROM UsrCmInfo u")})
public class UsrCmInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "BUSINESS_NAME")
    private String businessName;
    @Basic(optional = false)
    @Column(name = "TAX_ID_TYPE")
    private String taxIdType;
    @Basic(optional = false)
    @Column(name = "USDOT_NBR")
    private String usdotNbr;
    @Basic(optional = false)
    @Column(name = "MOTOR_CARRIER_NBR")
    private String motorCarrierNbr;
    @Basic(optional = false)
    @Column(name = "APPLICANT_TYPE")
    private Character applicantType;
    @Basic(optional = false)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "SSN_LAST_FOUR")
    private String ssnLastFour;
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
    @Column(name = "APPL_JOB_TTL")
    private String applJobTtl;
    @Basic(optional = false)
    @Column(name = "APPL_SGNTR_ID")
    private String applSgntrId;
    @Basic(optional = false)
    @Column(name = "APPL_SGNTR_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date applSgntrTs;
    @Basic(optional = false)
    @Column(name = "SERVICE_CENTER_CODE")
    private String serviceCenterCode;
    @Basic(optional = false)
    @Column(name = "MERCHANT_EMAIL_ID")
    private String merchantEmailId;
    @Basic(optional = false)
    @Column(name = "STATUS_FLG")
    private Character statusFlg;
    @Basic(optional = false)
    @Column(name = "USR_EMAIL_ID")
    private String usrEmailId;
    @Basic(optional = false)
    @Column(name = "MOBILE_APP_NAME")
    private String mobileAppName;
    @Basic(optional = false)
    @Column(name = "PHONE_NBR")
    private String phoneNbr;
    @Basic(optional = false)
    @Column(name = "CIP_PASS_FLG")
    private Character cipPassFlg;
    @Basic(optional = false)
    @Column(name = "CNTRY_CD")
    private String cntryCd;
    @Basic(optional = false)
    @Column(name = "STREET_ADDR1")
    private String streetAddr1;
    @Basic(optional = false)
    @Column(name = "STREET_ADDR2")
    private String streetAddr2;
    @Basic(optional = false)
    @Column(name = "CITY_NM")
    private String cityNm;
    @Basic(optional = false)
    @Column(name = "ST_NM")
    private String stNm;
    @Basic(optional = false)
    @Column(name = "ZIP_CD")
    private String zipCd;
    @Basic(optional = false)
    @Column(name = "MOBILE_DEVICE_TKN_ID")
    private String mobileDeviceTknId;
    @Basic(optional = false)
    @Column(name = "MOBILE_DEVICE_DTL_TXT")
    private String mobileDeviceDtlTxt;

    public UsrCmInfo() {
    }

    public UsrCmInfo(String usrId) {
        this.usrId = usrId;
    }

    public UsrCmInfo(String usrId, String businessName, String taxIdType, String usdotNbr, String motorCarrierNbr, Character applicantType, String firstName, String lastName, String ssnLastFour, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String applJobTtl, String applSgntrId, Date applSgntrTs, String serviceCenterCode, String merchantEmailId, Character statusFlg, String usrEmailId, String mobileAppName, String phoneNbr, Character cipPassFlg, String cntryCd, String streetAddr1, String streetAddr2, String cityNm, String stNm, String zipCd, String mobileDeviceTknId, String mobileDeviceDtlTxt) {
        this.usrId = usrId;
        this.businessName = businessName;
        this.taxIdType = taxIdType;
        this.usdotNbr = usdotNbr;
        this.motorCarrierNbr = motorCarrierNbr;
        this.applicantType = applicantType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssnLastFour = ssnLastFour;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.applJobTtl = applJobTtl;
        this.applSgntrId = applSgntrId;
        this.applSgntrTs = applSgntrTs;
        this.serviceCenterCode = serviceCenterCode;
        this.merchantEmailId = merchantEmailId;
        this.statusFlg = statusFlg;
        this.usrEmailId = usrEmailId;
        this.mobileAppName = mobileAppName;
        this.phoneNbr = phoneNbr;
        this.cipPassFlg = cipPassFlg;
        this.cntryCd = cntryCd;
        this.streetAddr1 = streetAddr1;
        this.streetAddr2 = streetAddr2;
        this.cityNm = cityNm;
        this.stNm = stNm;
        this.zipCd = zipCd;
        this.mobileDeviceTknId = mobileDeviceTknId;
        this.mobileDeviceDtlTxt = mobileDeviceDtlTxt;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getTaxIdType() {
        return taxIdType;
    }

    public void setTaxIdType(String taxIdType) {
        this.taxIdType = taxIdType;
    }

    public String getUsdotNbr() {
        return usdotNbr;
    }

    public void setUsdotNbr(String usdotNbr) {
        this.usdotNbr = usdotNbr;
    }

    public String getMotorCarrierNbr() {
        return motorCarrierNbr;
    }

    public void setMotorCarrierNbr(String motorCarrierNbr) {
        this.motorCarrierNbr = motorCarrierNbr;
    }

    public Character getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(Character applicantType) {
        this.applicantType = applicantType;
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

    public String getSsnLastFour() {
        return ssnLastFour;
    }

    public void setSsnLastFour(String ssnLastFour) {
        this.ssnLastFour = ssnLastFour;
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

    public String getApplJobTtl() {
        return applJobTtl;
    }

    public void setApplJobTtl(String applJobTtl) {
        this.applJobTtl = applJobTtl;
    }

    public String getApplSgntrId() {
        return applSgntrId;
    }

    public void setApplSgntrId(String applSgntrId) {
        this.applSgntrId = applSgntrId;
    }

    public Date getApplSgntrTs() {
        return applSgntrTs;
    }

    public void setApplSgntrTs(Date applSgntrTs) {
        this.applSgntrTs = applSgntrTs;
    }

    public String getServiceCenterCode() {
        return serviceCenterCode;
    }

    public void setServiceCenterCode(String serviceCenterCode) {
        this.serviceCenterCode = serviceCenterCode;
    }

    public String getMerchantEmailId() {
        return merchantEmailId;
    }

    public void setMerchantEmailId(String merchantEmailId) {
        this.merchantEmailId = merchantEmailId;
    }

    public Character getStatusFlg() {
        return statusFlg;
    }

    public void setStatusFlg(Character statusFlg) {
        this.statusFlg = statusFlg;
    }

    public String getUsrEmailId() {
        return usrEmailId;
    }

    public void setUsrEmailId(String usrEmailId) {
        this.usrEmailId = usrEmailId;
    }

    public String getMobileAppName() {
        return mobileAppName;
    }

    public void setMobileAppName(String mobileAppName) {
        this.mobileAppName = mobileAppName;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public Character getCipPassFlg() {
        return cipPassFlg;
    }

    public void setCipPassFlg(Character cipPassFlg) {
        this.cipPassFlg = cipPassFlg;
    }

    public String getCntryCd() {
        return cntryCd;
    }

    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    public String getStreetAddr1() {
        return streetAddr1;
    }

    public void setStreetAddr1(String streetAddr1) {
        this.streetAddr1 = streetAddr1;
    }

    public String getStreetAddr2() {
        return streetAddr2;
    }

    public void setStreetAddr2(String streetAddr2) {
        this.streetAddr2 = streetAddr2;
    }

    public String getCityNm() {
        return cityNm;
    }

    public void setCityNm(String cityNm) {
        this.cityNm = cityNm;
    }

    public String getStNm() {
        return stNm;
    }

    public void setStNm(String stNm) {
        this.stNm = stNm;
    }

    public String getZipCd() {
        return zipCd;
    }

    public void setZipCd(String zipCd) {
        this.zipCd = zipCd;
    }

    public String getMobileDeviceTknId() {
        return mobileDeviceTknId;
    }

    public void setMobileDeviceTknId(String mobileDeviceTknId) {
        this.mobileDeviceTknId = mobileDeviceTknId;
    }

    public String getMobileDeviceDtlTxt() {
        return mobileDeviceDtlTxt;
    }

    public void setMobileDeviceDtlTxt(String mobileDeviceDtlTxt) {
        this.mobileDeviceDtlTxt = mobileDeviceDtlTxt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrCmInfo)) {
            return false;
        }
        UsrCmInfo other = (UsrCmInfo) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrCmInfo[ usrId=" + usrId + " ]";
    }
    
}
