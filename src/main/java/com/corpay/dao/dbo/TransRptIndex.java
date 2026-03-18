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
@Table(name = "TRANS_RPT_INDEX", catalog = "", schema = "DBO")
public class TransRptIndex implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TransRptIndexPK transRptIndexPK;
    @Basic(optional = false)
    @Column(name = "FREQ")
    private Character freq;
    @Basic(optional = false)
    @Column(name = "FILE_EXT")
    private String fileExt;
    @Basic(optional = false)
    @Column(name = "FILE_PATH")
    private String filePath;
    @Basic(optional = false)
    @Column(name = "VIEW_CNT")
    private int viewCnt;
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
    @Column(name = "EMAIL_FLG")
    private Character emailFlg;

    public TransRptIndex() {
    }

    public TransRptIndex(TransRptIndexPK transRptIndexPK) {
        this.transRptIndexPK = transRptIndexPK;
    }

    public TransRptIndex(TransRptIndexPK transRptIndexPK, Character freq, String fileExt, String filePath, int viewCnt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character emailFlg) {
        this.transRptIndexPK = transRptIndexPK;
        this.freq = freq;
        this.fileExt = fileExt;
        this.filePath = filePath;
        this.viewCnt = viewCnt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.emailFlg = emailFlg;
    }

    public TransRptIndex(String typ, String acctNbr, String custId, Date rptDt, String rdmNbr) {
        this.transRptIndexPK = new TransRptIndexPK(typ, acctNbr, custId, rptDt, rdmNbr);
    }

    public TransRptIndexPK getTransRptIndexPK() {
        return transRptIndexPK;
    }

    public void setTransRptIndexPK(TransRptIndexPK transRptIndexPK) {
        this.transRptIndexPK = transRptIndexPK;
    }

    public Character getFreq() {
        return freq;
    }

    public void setFreq(Character freq) {
        this.freq = freq;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
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

    public Character getEmailFlg() {
        return emailFlg;
    }

    public void setEmailFlg(Character emailFlg) {
        this.emailFlg = emailFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transRptIndexPK != null ? transRptIndexPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TransRptIndex)) {
            return false;
        }
        TransRptIndex other = (TransRptIndex) object;
        if ((this.transRptIndexPK == null && other.transRptIndexPK != null) || (this.transRptIndexPK != null && !this.transRptIndexPK.equals(other.transRptIndexPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TransRptIndex[ transRptIndexPK=" + transRptIndexPK + " ]";
    }

}
