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
@Table(name = "ATTACHMENTS", catalog = "", schema = "DBO")
public class Attachments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FILE_ID")
    private Integer fileId;
    @Basic(optional = false)
    @Column(name = "FILE_NM")
    private String fileNm;
    @Basic(optional = false)
    @Column(name = "FILE_SIZE")
    private int fileSize;
    @Basic(optional = false)
    @Column(name = "ROWID")
    private Serializable rowid;
    @Basic(optional = false)
    @Lob
    @Column(name = "FILE")
    private Serializable file;
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

    public Attachments() {
    }

    public Attachments(Integer fileId) {
        this.fileId = fileId;
    }

    public Attachments(Integer fileId, String fileNm, int fileSize, Serializable rowid, Serializable file, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fileId = fileId;
        this.fileNm = fileNm;
        this.fileSize = fileSize;
        this.rowid = rowid;
        this.file = file;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileNm() {
        return fileNm;
    }

    public void setFileNm(String fileNm) {
        this.fileNm = fileNm;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public Serializable getRowid() {
        return rowid;
    }

    public void setRowid(Serializable rowid) {
        this.rowid = rowid;
    }

    public Serializable getFile() {
        return file;
    }

    public void setFile(Serializable file) {
        this.file = file;
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
        hash += (fileId != null ? fileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Attachments)) {
            return false;
        }
        Attachments other = (Attachments) object;
        if ((this.fileId == null && other.fileId != null) || (this.fileId != null && !this.fileId.equals(other.fileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Attachments[ fileId=" + fileId + " ]";
    }

}
