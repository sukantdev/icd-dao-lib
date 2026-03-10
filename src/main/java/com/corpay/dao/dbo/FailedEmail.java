/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "FAILED_EMAIL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FailedEmail.findAll", query = "SELECT f FROM FailedEmail f")})
public class FailedEmail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMAIL_ID")
    private Long emailId;
    @Basic(optional = false)
    @Column(name = "SENDER_ADDR")
    private String senderAddr;
    @Basic(optional = false)
    @Column(name = "RECIPIENTS_ADDR")
    private String recipientsAddr;
    @Basic(optional = false)
    @Column(name = "CC_RECIPIENTS_ADDR")
    private String ccRecipientsAddr;
    @Basic(optional = false)
    @Column(name = "BCC_RECIPIENTS_ADDR")
    private String bccRecipientsAddr;
    @Basic(optional = false)
    @Column(name = "SUBJECT_TXT")
    private String subjectTxt;
    @Basic(optional = false)
    @Column(name = "EMAIL_TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date emailTimeStamp;
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
    @Column(name = "RETRY_ATTEMPTS")
    private int retryAttempts;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emailId", fetch = FetchType.LAZY)
    private Set<FailedEmailBodySection> failedEmailBodySectionSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emailId", fetch = FetchType.LAZY)
    private Set<FailedEmailAttachment> failedEmailAttachmentSet;

    public FailedEmail() {
    }

    public FailedEmail(Long emailId) {
        this.emailId = emailId;
    }

    public FailedEmail(Long emailId, String senderAddr, String recipientsAddr, String ccRecipientsAddr, String bccRecipientsAddr, String subjectTxt, Date emailTimeStamp, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, int retryAttempts) {
        this.emailId = emailId;
        this.senderAddr = senderAddr;
        this.recipientsAddr = recipientsAddr;
        this.ccRecipientsAddr = ccRecipientsAddr;
        this.bccRecipientsAddr = bccRecipientsAddr;
        this.subjectTxt = subjectTxt;
        this.emailTimeStamp = emailTimeStamp;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.retryAttempts = retryAttempts;
    }

    public Long getEmailId() {
        return emailId;
    }

    public void setEmailId(Long emailId) {
        this.emailId = emailId;
    }

    public String getSenderAddr() {
        return senderAddr;
    }

    public void setSenderAddr(String senderAddr) {
        this.senderAddr = senderAddr;
    }

    public String getRecipientsAddr() {
        return recipientsAddr;
    }

    public void setRecipientsAddr(String recipientsAddr) {
        this.recipientsAddr = recipientsAddr;
    }

    public String getCcRecipientsAddr() {
        return ccRecipientsAddr;
    }

    public void setCcRecipientsAddr(String ccRecipientsAddr) {
        this.ccRecipientsAddr = ccRecipientsAddr;
    }

    public String getBccRecipientsAddr() {
        return bccRecipientsAddr;
    }

    public void setBccRecipientsAddr(String bccRecipientsAddr) {
        this.bccRecipientsAddr = bccRecipientsAddr;
    }

    public String getSubjectTxt() {
        return subjectTxt;
    }

    public void setSubjectTxt(String subjectTxt) {
        this.subjectTxt = subjectTxt;
    }

    public Date getEmailTimeStamp() {
        return emailTimeStamp;
    }

    public void setEmailTimeStamp(Date emailTimeStamp) {
        this.emailTimeStamp = emailTimeStamp;
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

    public int getRetryAttempts() {
        return retryAttempts;
    }

    public void setRetryAttempts(int retryAttempts) {
        this.retryAttempts = retryAttempts;
    }

    public Set<FailedEmailBodySection> getFailedEmailBodySectionSet() {
        return failedEmailBodySectionSet;
    }

    public void setFailedEmailBodySectionSet(Set<FailedEmailBodySection> failedEmailBodySectionSet) {
        this.failedEmailBodySectionSet = failedEmailBodySectionSet;
    }

    public Set<FailedEmailAttachment> getFailedEmailAttachmentSet() {
        return failedEmailAttachmentSet;
    }

    public void setFailedEmailAttachmentSet(Set<FailedEmailAttachment> failedEmailAttachmentSet) {
        this.failedEmailAttachmentSet = failedEmailAttachmentSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emailId != null ? emailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FailedEmail)) {
            return false;
        }
        FailedEmail other = (FailedEmail) object;
        if ((this.emailId == null && other.emailId != null) || (this.emailId != null && !this.emailId.equals(other.emailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FailedEmail[ emailId=" + emailId + " ]";
    }
    
}
