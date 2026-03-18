package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "COMPLIANCE_EDD_NOTES", catalog = "", schema = "DBO")
public class ComplianceEddNotes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComplianceEddNotesPK complianceEddNotesPK;
    @Basic(optional = false)
    @Column(name = "EDD_USERID")
    private String eddUserid;
    @Basic(optional = false)
    @Column(name = "NOTE_TEXT")
    private String noteText;
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

    public ComplianceEddNotes() {
    }

    public ComplianceEddNotes(ComplianceEddNotesPK complianceEddNotesPK) {
        this.complianceEddNotesPK = complianceEddNotesPK;
    }

    public ComplianceEddNotes(ComplianceEddNotesPK complianceEddNotesPK, String eddUserid, String noteText, String crtUsr, Date mdyTs, String mdyUsr) {
        this.complianceEddNotesPK = complianceEddNotesPK;
        this.eddUserid = eddUserid;
        this.noteText = noteText;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ComplianceEddNotes(Date cchTs, Date crtTs) {
        this.complianceEddNotesPK = new ComplianceEddNotesPK(cchTs, crtTs);
    }

    public ComplianceEddNotesPK getComplianceEddNotesPK() {
        return complianceEddNotesPK;
    }

    public void setComplianceEddNotesPK(ComplianceEddNotesPK complianceEddNotesPK) {
        this.complianceEddNotesPK = complianceEddNotesPK;
    }

    public String getEddUserid() {
        return eddUserid;
    }

    public void setEddUserid(String eddUserid) {
        this.eddUserid = eddUserid;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
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
        hash += (complianceEddNotesPK != null ? complianceEddNotesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ComplianceEddNotes)) {
            return false;
        }
        ComplianceEddNotes other = (ComplianceEddNotes) object;
        if ((this.complianceEddNotesPK == null && other.complianceEddNotesPK != null) || (this.complianceEddNotesPK != null && !this.complianceEddNotesPK.equals(other.complianceEddNotesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ComplianceEddNotes[ complianceEddNotesPK=" + complianceEddNotesPK + " ]";
    }

}
