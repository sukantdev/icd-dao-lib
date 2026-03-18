package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "DELAYED_EMAIL", catalog = "", schema = "DBO")
public class DelayedEmail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMAIL_ID")
    private Long emailId;
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;
    @Basic(optional = false)
    @Column(name = "ADMIN_ID")
    private String adminId;
    @Basic(optional = false)
    @Column(name = "RECIPIENTS_ADDR")
    private String recipientsAddr;
    @Basic(optional = false)
    @Column(name = "SUBJECT_TXT")
    private String subjectTxt;
    @Basic(optional = false)
    @Lob
    @Column(name = "BODY_SECTION_TXT")
    private Serializable bodySectionTxt;
    @Basic(optional = false)
    @Column(name = "SEND_STATUS_CD")
    private Character sendStatusCd;
    @Basic(optional = false)
    @Column(name = "SEND_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendTs;
    @Basic(optional = false)
    @Column(name = "RETRY_ATTEMPTS_CNT")
    private short retryAttemptsCnt;
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
    @Column(name = "DB2_GENERATED_ROWID_FOR_LOBS")
    private Serializable db2GeneratedRowidForLobs;

    public DelayedEmail() {
    }

    public DelayedEmail(Long emailId) {
        this.emailId = emailId;
    }

    public DelayedEmail(Long emailId, String userId, String adminId, String recipientsAddr, String subjectTxt, Serializable bodySectionTxt, Character sendStatusCd, Date sendTs, short retryAttemptsCnt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Serializable db2GeneratedRowidForLobs) {
        this.emailId = emailId;
        this.userId = userId;
        this.adminId = adminId;
        this.recipientsAddr = recipientsAddr;
        this.subjectTxt = subjectTxt;
        this.bodySectionTxt = bodySectionTxt;
        this.sendStatusCd = sendStatusCd;
        this.sendTs = sendTs;
        this.retryAttemptsCnt = retryAttemptsCnt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public Long getEmailId() {
        return emailId;
    }

    public void setEmailId(Long emailId) {
        this.emailId = emailId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getRecipientsAddr() {
        return recipientsAddr;
    }

    public void setRecipientsAddr(String recipientsAddr) {
        this.recipientsAddr = recipientsAddr;
    }

    public String getSubjectTxt() {
        return subjectTxt;
    }

    public void setSubjectTxt(String subjectTxt) {
        this.subjectTxt = subjectTxt;
    }

    public Serializable getBodySectionTxt() {
        return bodySectionTxt;
    }

    public void setBodySectionTxt(Serializable bodySectionTxt) {
        this.bodySectionTxt = bodySectionTxt;
    }

    public Character getSendStatusCd() {
        return sendStatusCd;
    }

    public void setSendStatusCd(Character sendStatusCd) {
        this.sendStatusCd = sendStatusCd;
    }

    public Date getSendTs() {
        return sendTs;
    }

    public void setSendTs(Date sendTs) {
        this.sendTs = sendTs;
    }

    public short getRetryAttemptsCnt() {
        return retryAttemptsCnt;
    }

    public void setRetryAttemptsCnt(short retryAttemptsCnt) {
        this.retryAttemptsCnt = retryAttemptsCnt;
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

    public Serializable getDb2GeneratedRowidForLobs() {
        return db2GeneratedRowidForLobs;
    }

    public void setDb2GeneratedRowidForLobs(Serializable db2GeneratedRowidForLobs) {
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emailId != null ? emailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DelayedEmail)) {
            return false;
        }
        DelayedEmail other = (DelayedEmail) object;
        if ((this.emailId == null && other.emailId != null) || (this.emailId != null && !this.emailId.equals(other.emailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DelayedEmail[ emailId=" + emailId + " ]";
    }

}
