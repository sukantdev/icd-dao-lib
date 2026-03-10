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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "FN_XTN_FW_LOG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FnXtnFwLog.findAll", query = "SELECT f FROM FnXtnFwLog f")})
public class FnXtnFwLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FnXtnFwLogPK fnXtnFwLogPK;
    @Basic(optional = false)
    @Column(name = "SITE_ID")
    private String siteId;
    @Basic(optional = false)
    @Column(name = "FN_PAN")
    private String fnPan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TOT_AMT")
    private BigDecimal totAmt;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private Character statCd;
    @Basic(optional = false)
    @Column(name = "RETRY_CNT")
    private int retryCnt;
    @Basic(optional = false)
    @Column(name = "LST_RETRY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lstRetryTs;
    @Basic(optional = false)
    @Column(name = "RETRY_STAT_CD")
    private String retryStatCd;
    @Basic(optional = false)
    @Column(name = "ERR_CD")
    private String errCd;
    @Basic(optional = false)
    @Column(name = "ERR_MSG")
    private String errMsg;
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

    public FnXtnFwLog() {
    }

    public FnXtnFwLog(FnXtnFwLogPK fnXtnFwLogPK) {
        this.fnXtnFwLogPK = fnXtnFwLogPK;
    }

    public FnXtnFwLog(FnXtnFwLogPK fnXtnFwLogPK, String siteId, String fnPan, BigDecimal totAmt, Character statCd, int retryCnt, Date lstRetryTs, String retryStatCd, String errCd, String errMsg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fnXtnFwLogPK = fnXtnFwLogPK;
        this.siteId = siteId;
        this.fnPan = fnPan;
        this.totAmt = totAmt;
        this.statCd = statCd;
        this.retryCnt = retryCnt;
        this.lstRetryTs = lstRetryTs;
        this.retryStatCd = retryStatCd;
        this.errCd = errCd;
        this.errMsg = errMsg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FnXtnFwLog(String pan, Date utDt, int approvCd, Date localTs) {
        this.fnXtnFwLogPK = new FnXtnFwLogPK(pan, utDt, approvCd, localTs);
    }

    public FnXtnFwLogPK getFnXtnFwLogPK() {
        return fnXtnFwLogPK;
    }

    public void setFnXtnFwLogPK(FnXtnFwLogPK fnXtnFwLogPK) {
        this.fnXtnFwLogPK = fnXtnFwLogPK;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getFnPan() {
        return fnPan;
    }

    public void setFnPan(String fnPan) {
        this.fnPan = fnPan;
    }

    public BigDecimal getTotAmt() {
        return totAmt;
    }

    public void setTotAmt(BigDecimal totAmt) {
        this.totAmt = totAmt;
    }

    public Character getStatCd() {
        return statCd;
    }

    public void setStatCd(Character statCd) {
        this.statCd = statCd;
    }

    public int getRetryCnt() {
        return retryCnt;
    }

    public void setRetryCnt(int retryCnt) {
        this.retryCnt = retryCnt;
    }

    public Date getLstRetryTs() {
        return lstRetryTs;
    }

    public void setLstRetryTs(Date lstRetryTs) {
        this.lstRetryTs = lstRetryTs;
    }

    public String getRetryStatCd() {
        return retryStatCd;
    }

    public void setRetryStatCd(String retryStatCd) {
        this.retryStatCd = retryStatCd;
    }

    public String getErrCd() {
        return errCd;
    }

    public void setErrCd(String errCd) {
        this.errCd = errCd;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
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
        hash += (fnXtnFwLogPK != null ? fnXtnFwLogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FnXtnFwLog)) {
            return false;
        }
        FnXtnFwLog other = (FnXtnFwLog) object;
        if ((this.fnXtnFwLogPK == null && other.fnXtnFwLogPK != null) || (this.fnXtnFwLogPK != null && !this.fnXtnFwLogPK.equals(other.fnXtnFwLogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnXtnFwLog[ fnXtnFwLogPK=" + fnXtnFwLogPK + " ]";
    }
    
}
