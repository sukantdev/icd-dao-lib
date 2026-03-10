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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "COMPLIANCE_CHECK_OVERRIDE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ComplianceCheckOverride.findAll", query = "SELECT c FROM ComplianceCheckOverride c")})
public class ComplianceCheckOverride implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComplianceCheckOverridePK complianceCheckOverridePK;
    @Basic(optional = false)
    @Column(name = "FIRST_NM")
    private String firstNm;
    @Basic(optional = false)
    @Column(name = "LAST_NM")
    private String lastNm;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR")
    private String emailAddr;
    @Basic(optional = false)
    @Column(name = "OVERRIDE_VALUE")
    private String overrideValue;
    @Basic(optional = false)
    @Column(name = "REASON")
    private String reason;
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
    @Column(name = "BUSINESS_NAME")
    private String businessName;
    @Basic(optional = false)
    @Column(name = "APPLICANT_TYPE")
    private Character applicantType;

    public ComplianceCheckOverride() {
    }

    public ComplianceCheckOverride(ComplianceCheckOverridePK complianceCheckOverridePK) {
        this.complianceCheckOverridePK = complianceCheckOverridePK;
    }

    public ComplianceCheckOverride(ComplianceCheckOverridePK complianceCheckOverridePK, String firstNm, String lastNm, String emailAddr, String overrideValue, String reason, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String businessName, Character applicantType) {
        this.complianceCheckOverridePK = complianceCheckOverridePK;
        this.firstNm = firstNm;
        this.lastNm = lastNm;
        this.emailAddr = emailAddr;
        this.overrideValue = overrideValue;
        this.reason = reason;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.businessName = businessName;
        this.applicantType = applicantType;
    }

    public ComplianceCheckOverride(String productType, String taxIdLast4, String dob) {
        this.complianceCheckOverridePK = new ComplianceCheckOverridePK(productType, taxIdLast4, dob);
    }

    public ComplianceCheckOverridePK getComplianceCheckOverridePK() {
        return complianceCheckOverridePK;
    }

    public void setComplianceCheckOverridePK(ComplianceCheckOverridePK complianceCheckOverridePK) {
        this.complianceCheckOverridePK = complianceCheckOverridePK;
    }

    public String getFirstNm() {
        return firstNm;
    }

    public void setFirstNm(String firstNm) {
        this.firstNm = firstNm;
    }

    public String getLastNm() {
        return lastNm;
    }

    public void setLastNm(String lastNm) {
        this.lastNm = lastNm;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getOverrideValue() {
        return overrideValue;
    }

    public void setOverrideValue(String overrideValue) {
        this.overrideValue = overrideValue;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Character getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(Character applicantType) {
        this.applicantType = applicantType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (complianceCheckOverridePK != null ? complianceCheckOverridePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplianceCheckOverride)) {
            return false;
        }
        ComplianceCheckOverride other = (ComplianceCheckOverride) object;
        if ((this.complianceCheckOverridePK == null && other.complianceCheckOverridePK != null) || (this.complianceCheckOverridePK != null && !this.complianceCheckOverridePK.equals(other.complianceCheckOverridePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ComplianceCheckOverride[ complianceCheckOverridePK=" + complianceCheckOverridePK + " ]";
    }
    
}
