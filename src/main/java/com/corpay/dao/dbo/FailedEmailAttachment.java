package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "FAILED_EMAIL_ATTACHMENT", catalog = "", schema = "DBO")
public class FailedEmailAttachment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ATTACHMENT_ID")
    private Long attachmentId;
    @Basic(optional = false)
    @Column(name = "FILE_TYPE_CD")
    private String fileTypeCd;
    @Basic(optional = false)
    @Column(name = "FILE_NAME")
    private String fileName;
    @Basic(optional = false)
    @Lob
    @Column(name = "FILE_CONTENT")
    private Serializable fileContent;
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
    @JoinColumn(name = "EMAIL_ID", referencedColumnName = "EMAIL_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FailedEmail emailId;

    public FailedEmailAttachment() {
    }

    public FailedEmailAttachment(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    public FailedEmailAttachment(Long attachmentId, String fileTypeCd, String fileName, Serializable fileContent, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Serializable db2GeneratedRowidForLobs) {
        this.attachmentId = attachmentId;
        this.fileTypeCd = fileTypeCd;
        this.fileName = fileName;
        this.fileContent = fileContent;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public Long getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getFileTypeCd() {
        return fileTypeCd;
    }

    public void setFileTypeCd(String fileTypeCd) {
        this.fileTypeCd = fileTypeCd;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Serializable getFileContent() {
        return fileContent;
    }

    public void setFileContent(Serializable fileContent) {
        this.fileContent = fileContent;
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

    public FailedEmail getEmailId() {
        return emailId;
    }

    public void setEmailId(FailedEmail emailId) {
        this.emailId = emailId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (attachmentId != null ? attachmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FailedEmailAttachment)) {
            return false;
        }
        FailedEmailAttachment other = (FailedEmailAttachment) object;
        if ((this.attachmentId == null && other.attachmentId != null) || (this.attachmentId != null && !this.attachmentId.equals(other.attachmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FailedEmailAttachment[ attachmentId=" + attachmentId + " ]";
    }

}
