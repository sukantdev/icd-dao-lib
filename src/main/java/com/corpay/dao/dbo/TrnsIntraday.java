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
@Table(name = "TRNS_INTRADAY", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "TrnsIntraday.findAll", query = "SELECT t FROM TrnsIntraday t")})
public class TrnsIntraday implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TrnsIntradayPK trnsIntradayPK;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "SYSTEM_ID")
    private String systemId;
    @Basic(optional = false)
    @Column(name = "RPT_NBR")
    private int rptNbr;
    @Basic(optional = false)
    @Column(name = "RSP_CD")
    private int rspCd;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "UT_DT")
    @Temporal(TemporalType.DATE)
    private Date utDt;
    @Basic(optional = false)
    @Column(name = "APPROV_CD")
    private int approvCd;
    @Basic(optional = false)
    @Column(name = "INTRADAY_MSG_TXT")
    private String intradayMsgTxt;
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

    public TrnsIntraday() {
    }

    public TrnsIntraday(TrnsIntradayPK trnsIntradayPK) {
        this.trnsIntradayPK = trnsIntradayPK;
    }

    public TrnsIntraday(TrnsIntradayPK trnsIntradayPK, String acctNbr, String custId, String systemId, int rptNbr, int rspCd, String crdNbr, Date utDt, int approvCd, String intradayMsgTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.trnsIntradayPK = trnsIntradayPK;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.systemId = systemId;
        this.rptNbr = rptNbr;
        this.rspCd = rspCd;
        this.crdNbr = crdNbr;
        this.utDt = utDt;
        this.approvCd = approvCd;
        this.intradayMsgTxt = intradayMsgTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public TrnsIntraday(String uid, Date transTs, long trkNbr) {
        this.trnsIntradayPK = new TrnsIntradayPK(uid, transTs, trkNbr);
    }

    public TrnsIntradayPK getTrnsIntradayPK() {
        return trnsIntradayPK;
    }

    public void setTrnsIntradayPK(TrnsIntradayPK trnsIntradayPK) {
        this.trnsIntradayPK = trnsIntradayPK;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public int getRptNbr() {
        return rptNbr;
    }

    public void setRptNbr(int rptNbr) {
        this.rptNbr = rptNbr;
    }

    public int getRspCd() {
        return rspCd;
    }

    public void setRspCd(int rspCd) {
        this.rspCd = rspCd;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Date getUtDt() {
        return utDt;
    }

    public void setUtDt(Date utDt) {
        this.utDt = utDt;
    }

    public int getApprovCd() {
        return approvCd;
    }

    public void setApprovCd(int approvCd) {
        this.approvCd = approvCd;
    }

    public String getIntradayMsgTxt() {
        return intradayMsgTxt;
    }

    public void setIntradayMsgTxt(String intradayMsgTxt) {
        this.intradayMsgTxt = intradayMsgTxt;
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
        hash += (trnsIntradayPK != null ? trnsIntradayPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrnsIntraday)) {
            return false;
        }
        TrnsIntraday other = (TrnsIntraday) object;
        if ((this.trnsIntradayPK == null && other.trnsIntradayPK != null) || (this.trnsIntradayPK != null && !this.trnsIntradayPK.equals(other.trnsIntradayPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TrnsIntraday[ trnsIntradayPK=" + trnsIntradayPK + " ]";
    }
    
}
