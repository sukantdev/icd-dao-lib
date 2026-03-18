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
@Table(name = "CR_APPL_ATTACHMENT", catalog = "", schema = "DBO")
public class CrApplAttachment implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplAttachmentPK crApplAttachmentPK;
    @Basic(optional = false)
    @Column(name = "FILE_SEQ")
    private short fileSeq;
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
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public CrApplAttachment() {
    }

    public CrApplAttachment(CrApplAttachmentPK crApplAttachmentPK) {
        this.crApplAttachmentPK = crApplAttachmentPK;
    }

    public CrApplAttachment(CrApplAttachmentPK crApplAttachmentPK, short fileSeq, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.crApplAttachmentPK = crApplAttachmentPK;
        this.fileSeq = fileSeq;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
    }

    public CrApplAttachment(String applNbr, int fileId) {
        this.crApplAttachmentPK = new CrApplAttachmentPK(applNbr, fileId);
    }

    public CrApplAttachmentPK getCrApplAttachmentPK() {
        return crApplAttachmentPK;
    }

    public void setCrApplAttachmentPK(CrApplAttachmentPK crApplAttachmentPK) {
        this.crApplAttachmentPK = crApplAttachmentPK;
    }

    public short getFileSeq() {
        return fileSeq;
    }

    public void setFileSeq(short fileSeq) {
        this.fileSeq = fileSeq;
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

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crApplAttachmentPK != null ? crApplAttachmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplAttachment)) {
            return false;
        }
        CrApplAttachment other = (CrApplAttachment) object;
        if ((this.crApplAttachmentPK == null && other.crApplAttachmentPK != null) || (this.crApplAttachmentPK != null && !this.crApplAttachmentPK.equals(other.crApplAttachmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplAttachment[ crApplAttachmentPK=" + crApplAttachmentPK + " ]";
    }

}
