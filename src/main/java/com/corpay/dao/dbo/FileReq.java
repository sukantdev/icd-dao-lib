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
@Table(name = "FILE_REQ", catalog = "", schema = "DBO")
public class FileReq implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FileReqPK fileReqPK;
    @Basic(optional = false)
    @Column(name = "PROCD_TS")
    @Temporal(TemporalType.DATE)
    private Date procdTs;
    @Basic(optional = false)
    @Column(name = "FILE_REQ_USR")
    private String fileReqUsr;
    @Basic(optional = false)
    @Column(name = "STAT")
    private Character stat;
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

    public FileReq() {
    }

    public FileReq(FileReqPK fileReqPK) {
        this.fileReqPK = fileReqPK;
    }

    public FileReq(FileReqPK fileReqPK, Date procdTs, String fileReqUsr, Character stat, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fileReqPK = fileReqPK;
        this.procdTs = procdTs;
        this.fileReqUsr = fileReqUsr;
        this.stat = stat;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FileReq(String acctNbr, Date reqTs, Date cycInvDt) {
        this.fileReqPK = new FileReqPK(acctNbr, reqTs, cycInvDt);
    }

    public FileReqPK getFileReqPK() {
        return fileReqPK;
    }

    public void setFileReqPK(FileReqPK fileReqPK) {
        this.fileReqPK = fileReqPK;
    }

    public Date getProcdTs() {
        return procdTs;
    }

    public void setProcdTs(Date procdTs) {
        this.procdTs = procdTs;
    }

    public String getFileReqUsr() {
        return fileReqUsr;
    }

    public void setFileReqUsr(String fileReqUsr) {
        this.fileReqUsr = fileReqUsr;
    }

    public Character getStat() {
        return stat;
    }

    public void setStat(Character stat) {
        this.stat = stat;
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
        hash += (fileReqPK != null ? fileReqPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FileReq)) {
            return false;
        }
        FileReq other = (FileReq) object;
        if ((this.fileReqPK == null && other.fileReqPK != null) || (this.fileReqPK != null && !this.fileReqPK.equals(other.fileReqPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FileReq[ fileReqPK=" + fileReqPK + " ]";
    }

}
