package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "FAILED_EMAIL_BODY_SECTION", catalog = "", schema = "DBO")
public class FailedEmailBodySection implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BODY_SECTION_ID")
    private Long bodySectionId;
    @Basic(optional = false)
    @Column(name = "BODY_SECTION_TXT")
    private String bodySectionTxt;
    @Basic(optional = false)
    @Column(name = "SEQUENCE_NBR")
    private int sequenceNbr;
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
    @JoinColumn(name = "EMAIL_ID", referencedColumnName = "EMAIL_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FailedEmail emailId;

    public FailedEmailBodySection() {
    }

    public FailedEmailBodySection(Long bodySectionId) {
        this.bodySectionId = bodySectionId;
    }

    public FailedEmailBodySection(Long bodySectionId, String bodySectionTxt, int sequenceNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.bodySectionId = bodySectionId;
        this.bodySectionTxt = bodySectionTxt;
        this.sequenceNbr = sequenceNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getBodySectionId() {
        return bodySectionId;
    }

    public void setBodySectionId(Long bodySectionId) {
        this.bodySectionId = bodySectionId;
    }

    public String getBodySectionTxt() {
        return bodySectionTxt;
    }

    public void setBodySectionTxt(String bodySectionTxt) {
        this.bodySectionTxt = bodySectionTxt;
    }

    public int getSequenceNbr() {
        return sequenceNbr;
    }

    public void setSequenceNbr(int sequenceNbr) {
        this.sequenceNbr = sequenceNbr;
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

    public FailedEmail getEmailId() {
        return emailId;
    }

    public void setEmailId(FailedEmail emailId) {
        this.emailId = emailId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bodySectionId != null ? bodySectionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FailedEmailBodySection)) {
            return false;
        }
        FailedEmailBodySection other = (FailedEmailBodySection) object;
        if ((this.bodySectionId == null && other.bodySectionId != null) || (this.bodySectionId != null && !this.bodySectionId.equals(other.bodySectionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FailedEmailBodySection[ bodySectionId=" + bodySectionId + " ]";
    }

}
