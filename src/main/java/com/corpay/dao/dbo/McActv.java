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
@Table(name = "MC_ACTV", catalog = "", schema = "DBO")
public class McActv implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McActvPK mcActvPK;
    @Basic(optional = false)
    @Column(name = "PAN")
    private String pan;
    @Basic(optional = false)
    @Column(name = "MTI")
    private String mti;
    @Basic(optional = false)
    @Column(name = "APPL_RNT_CD")
    private int applRntCd;
    @Basic(optional = false)
    @Column(name = "APPL_RNT_MSG")
    private String applRntMsg;
    @Basic(optional = false)
    @Column(name = "MSG_TXT")
    private String msgTxt;
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
    @Column(name = "EIBTASK_NBR")
    private String eibtaskNbr;

    public McActv() {
    }

    public McActv(McActvPK mcActvPK) {
        this.mcActvPK = mcActvPK;
    }

    public McActv(McActvPK mcActvPK, String pan, String mti, int applRntCd, String applRntMsg, String msgTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String eibtaskNbr) {
        this.mcActvPK = mcActvPK;
        this.pan = pan;
        this.mti = mti;
        this.applRntCd = applRntCd;
        this.applRntMsg = applRntMsg;
        this.msgTxt = msgTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.eibtaskNbr = eibtaskNbr;
    }

    public McActv(Date logTs, Character typCd) {
        this.mcActvPK = new McActvPK(logTs, typCd);
    }

    public McActvPK getMcActvPK() {
        return mcActvPK;
    }

    public void setMcActvPK(McActvPK mcActvPK) {
        this.mcActvPK = mcActvPK;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getMti() {
        return mti;
    }

    public void setMti(String mti) {
        this.mti = mti;
    }

    public int getApplRntCd() {
        return applRntCd;
    }

    public void setApplRntCd(int applRntCd) {
        this.applRntCd = applRntCd;
    }

    public String getApplRntMsg() {
        return applRntMsg;
    }

    public void setApplRntMsg(String applRntMsg) {
        this.applRntMsg = applRntMsg;
    }

    public String getMsgTxt() {
        return msgTxt;
    }

    public void setMsgTxt(String msgTxt) {
        this.msgTxt = msgTxt;
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

    public String getEibtaskNbr() {
        return eibtaskNbr;
    }

    public void setEibtaskNbr(String eibtaskNbr) {
        this.eibtaskNbr = eibtaskNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcActvPK != null ? mcActvPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McActv)) {
            return false;
        }
        McActv other = (McActv) object;
        if ((this.mcActvPK == null && other.mcActvPK != null) || (this.mcActvPK != null && !this.mcActvPK.equals(other.mcActvPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McActv[ mcActvPK=" + mcActvPK + " ]";
    }

}
