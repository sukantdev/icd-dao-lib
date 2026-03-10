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
@Table(name = "COMPLIANCE_CHECK_HIST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ComplianceCheckHist.findAll", query = "SELECT c FROM ComplianceCheckHist c")})
public class ComplianceCheckHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CCH_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cchTs;
    @Basic(optional = false)
    @Column(name = "SERVICE_PROVIDER_ID")
    private String serviceProviderId;
    @Basic(optional = false)
    @Column(name = "REQUESTER_ID")
    private String requesterId;
    @Basic(optional = false)
    @Column(name = "LAST_NM")
    private String lastNm;
    @Basic(optional = false)
    @Column(name = "FIRST_NM")
    private String firstNm;
    @Basic(optional = false)
    @Column(name = "STREET1_NM")
    private String street1Nm;
    @Basic(optional = false)
    @Column(name = "STREET2_NM")
    private String street2Nm;
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
    @Column(name = "DOB")
    private String dob;
    @Basic(optional = false)
    @Column(name = "SSN")
    private String ssn;
    @Basic(optional = false)
    @Column(name = "SSN_LAST_4")
    private String ssnLast4;
    @Basic(optional = false)
    @Column(name = "PHN_NBR")
    private String phnNbr;
    @Basic(optional = false)
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Basic(optional = false)
    @Column(name = "CDN_ASSESSMENT_TXT")
    private String cdnAssessmentTxt;
    @Basic(optional = false)
    @Column(name = "SP_TRNS_ID")
    private String spTrnsId;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
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
    @Column(name = "REQ_MSG_V")
    private String reqMsgV;
    @Basic(optional = false)
    @Column(name = "RESPONSE_MSG_V")
    private String responseMsgV;
    @Basic(optional = false)
    @Column(name = "EDD_APPROVED_FLG")
    private Character eddApprovedFlg;
    @Basic(optional = false)
    @Column(name = "EDD_DECLINED_FLG")
    private Character eddDeclinedFlg;
    @Basic(optional = false)
    @Column(name = "EDD_USER_ID")
    private String eddUserId;
    @Basic(optional = false)
    @Column(name = "DRV_LICENSE_NBR")
    private String drvLicenseNbr;
    @Basic(optional = false)
    @Column(name = "DRV_LICENSE_STATE")
    private String drvLicenseState;
    @Basic(optional = false)
    @Column(name = "APPLICANT_TYPE")
    private Character applicantType;
    @Basic(optional = false)
    @Column(name = "BUSINESS_NAME")
    private String businessName;
    @Basic(optional = false)
    @Column(name = "USDOT_NBR")
    private String usdotNbr;
    @Basic(optional = false)
    @Column(name = "MOTOR_CARRIER_NBR")
    private String motorCarrierNbr;
    @Basic(optional = false)
    @Column(name = "TAX_ID_TYPE")
    private String taxIdType;
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
    @Column(name = "OVERRIDE_FLAG")
    private Character overrideFlag;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CNTRY_CD")
    private String cntryCd;
    @Basic(optional = false)
    @Column(name = "BUSINESS_APPL_ASSESSMENT_TXT")
    private String businessApplAssessmentTxt;
    @Basic(optional = false)
    @Column(name = "APPL_LVL_CD")
    private int applLvlCd;

    public ComplianceCheckHist() {
    }

    public ComplianceCheckHist(Date cchTs) {
        this.cchTs = cchTs;
    }

    public ComplianceCheckHist(Date cchTs, String serviceProviderId, String requesterId, String lastNm, String firstNm, String street1Nm, String street2Nm, String cityNm, String stNm, String zipCd, String dob, String ssn, String ssnLast4, String phnNbr, String emailId, String cdnAssessmentTxt, String spTrnsId, String usrId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String reqMsgV, String responseMsgV, Character eddApprovedFlg, Character eddDeclinedFlg, String eddUserId, String drvLicenseNbr, String drvLicenseState, Character applicantType, String businessName, String usdotNbr, String motorCarrierNbr, String taxIdType, String applJobTtl, String applSgntrId, Date applSgntrTs, Character overrideFlag, String crdNbr, String acctNbr, String custId, String cntryCd, String businessApplAssessmentTxt, int applLvlCd) {
        this.cchTs = cchTs;
        this.serviceProviderId = serviceProviderId;
        this.requesterId = requesterId;
        this.lastNm = lastNm;
        this.firstNm = firstNm;
        this.street1Nm = street1Nm;
        this.street2Nm = street2Nm;
        this.cityNm = cityNm;
        this.stNm = stNm;
        this.zipCd = zipCd;
        this.dob = dob;
        this.ssn = ssn;
        this.ssnLast4 = ssnLast4;
        this.phnNbr = phnNbr;
        this.emailId = emailId;
        this.cdnAssessmentTxt = cdnAssessmentTxt;
        this.spTrnsId = spTrnsId;
        this.usrId = usrId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.reqMsgV = reqMsgV;
        this.responseMsgV = responseMsgV;
        this.eddApprovedFlg = eddApprovedFlg;
        this.eddDeclinedFlg = eddDeclinedFlg;
        this.eddUserId = eddUserId;
        this.drvLicenseNbr = drvLicenseNbr;
        this.drvLicenseState = drvLicenseState;
        this.applicantType = applicantType;
        this.businessName = businessName;
        this.usdotNbr = usdotNbr;
        this.motorCarrierNbr = motorCarrierNbr;
        this.taxIdType = taxIdType;
        this.applJobTtl = applJobTtl;
        this.applSgntrId = applSgntrId;
        this.applSgntrTs = applSgntrTs;
        this.overrideFlag = overrideFlag;
        this.crdNbr = crdNbr;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.cntryCd = cntryCd;
        this.businessApplAssessmentTxt = businessApplAssessmentTxt;
        this.applLvlCd = applLvlCd;
    }

    public Date getCchTs() {
        return cchTs;
    }

    public void setCchTs(Date cchTs) {
        this.cchTs = cchTs;
    }

    public String getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(String serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(String requesterId) {
        this.requesterId = requesterId;
    }

    public String getLastNm() {
        return lastNm;
    }

    public void setLastNm(String lastNm) {
        this.lastNm = lastNm;
    }

    public String getFirstNm() {
        return firstNm;
    }

    public void setFirstNm(String firstNm) {
        this.firstNm = firstNm;
    }

    public String getStreet1Nm() {
        return street1Nm;
    }

    public void setStreet1Nm(String street1Nm) {
        this.street1Nm = street1Nm;
    }

    public String getStreet2Nm() {
        return street2Nm;
    }

    public void setStreet2Nm(String street2Nm) {
        this.street2Nm = street2Nm;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsnLast4() {
        return ssnLast4;
    }

    public void setSsnLast4(String ssnLast4) {
        this.ssnLast4 = ssnLast4;
    }

    public String getPhnNbr() {
        return phnNbr;
    }

    public void setPhnNbr(String phnNbr) {
        this.phnNbr = phnNbr;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCdnAssessmentTxt() {
        return cdnAssessmentTxt;
    }

    public void setCdnAssessmentTxt(String cdnAssessmentTxt) {
        this.cdnAssessmentTxt = cdnAssessmentTxt;
    }

    public String getSpTrnsId() {
        return spTrnsId;
    }

    public void setSpTrnsId(String spTrnsId) {
        this.spTrnsId = spTrnsId;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
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

    public String getReqMsgV() {
        return reqMsgV;
    }

    public void setReqMsgV(String reqMsgV) {
        this.reqMsgV = reqMsgV;
    }

    public String getResponseMsgV() {
        return responseMsgV;
    }

    public void setResponseMsgV(String responseMsgV) {
        this.responseMsgV = responseMsgV;
    }

    public Character getEddApprovedFlg() {
        return eddApprovedFlg;
    }

    public void setEddApprovedFlg(Character eddApprovedFlg) {
        this.eddApprovedFlg = eddApprovedFlg;
    }

    public Character getEddDeclinedFlg() {
        return eddDeclinedFlg;
    }

    public void setEddDeclinedFlg(Character eddDeclinedFlg) {
        this.eddDeclinedFlg = eddDeclinedFlg;
    }

    public String getEddUserId() {
        return eddUserId;
    }

    public void setEddUserId(String eddUserId) {
        this.eddUserId = eddUserId;
    }

    public String getDrvLicenseNbr() {
        return drvLicenseNbr;
    }

    public void setDrvLicenseNbr(String drvLicenseNbr) {
        this.drvLicenseNbr = drvLicenseNbr;
    }

    public String getDrvLicenseState() {
        return drvLicenseState;
    }

    public void setDrvLicenseState(String drvLicenseState) {
        this.drvLicenseState = drvLicenseState;
    }

    public Character getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(Character applicantType) {
        this.applicantType = applicantType;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
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

    public String getTaxIdType() {
        return taxIdType;
    }

    public void setTaxIdType(String taxIdType) {
        this.taxIdType = taxIdType;
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

    public Character getOverrideFlag() {
        return overrideFlag;
    }

    public void setOverrideFlag(Character overrideFlag) {
        this.overrideFlag = overrideFlag;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCntryCd() {
        return cntryCd;
    }

    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    public String getBusinessApplAssessmentTxt() {
        return businessApplAssessmentTxt;
    }

    public void setBusinessApplAssessmentTxt(String businessApplAssessmentTxt) {
        this.businessApplAssessmentTxt = businessApplAssessmentTxt;
    }

    public int getApplLvlCd() {
        return applLvlCd;
    }

    public void setApplLvlCd(int applLvlCd) {
        this.applLvlCd = applLvlCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cchTs != null ? cchTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplianceCheckHist)) {
            return false;
        }
        ComplianceCheckHist other = (ComplianceCheckHist) object;
        if ((this.cchTs == null && other.cchTs != null) || (this.cchTs != null && !this.cchTs.equals(other.cchTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ComplianceCheckHist[ cchTs=" + cchTs + " ]";
    }
    
}
