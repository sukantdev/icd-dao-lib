/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "FM_ACTV", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FmActv.findAll", query = "SELECT f FROM FmActv f")})
public class FmActv implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FmActvPK fmActvPK;
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

    public FmActv() {
    }

    public FmActv(FmActvPK fmActvPK) {
        this.fmActvPK = fmActvPK;
    }

    public FmActv(FmActvPK fmActvPK, String pan, String mti, int applRntCd, String applRntMsg, String msgTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String eibtaskNbr) {
        this.fmActvPK = fmActvPK;
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

    public FmActv(Date logTs, Character typCd) {
        this.fmActvPK = new FmActvPK(logTs, typCd);
    }

    public FmActvPK getFmActvPK() {
        return fmActvPK;
    }

    public void setFmActvPK(FmActvPK fmActvPK) {
        this.fmActvPK = fmActvPK;
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
        hash += (fmActvPK != null ? fmActvPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FmActv)) {
            return false;
        }
        FmActv other = (FmActv) object;
        if ((this.fmActvPK == null && other.fmActvPK != null) || (this.fmActvPK != null && !this.fmActvPK.equals(other.fmActvPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FmActv[ fmActvPK=" + fmActvPK + " ]";
    }
    
}
