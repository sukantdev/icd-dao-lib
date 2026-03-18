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
@Table(name = "FN_API_LOG", catalog = "", schema = "DBO")
public class FnApiLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FnApiLogPK fnApiLogPK;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CRD_TKN")
    private String crdTkn;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_LAST_FOUR")
    private String crdNbrLastFour;
    @Basic(optional = false)
    @Column(name = "API_MSG_SENT_TXT")
    private String apiMsgSentTxt;
    @Basic(optional = false)
    @Column(name = "API_MSG_RESP_TXT")
    private String apiMsgRespTxt;
    @Basic(optional = false)
    @Column(name = "RTN_ST")
    private String rtnSt;
    @Basic(optional = false)
    @Column(name = "ERR_CD")
    private String errCd;
    @Basic(optional = false)
    @Column(name = "ERR_MSG_TXT")
    private String errMsgTxt;
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

    public FnApiLog() {
    }

    public FnApiLog(FnApiLogPK fnApiLogPK) {
        this.fnApiLogPK = fnApiLogPK;
    }

    public FnApiLog(FnApiLogPK fnApiLogPK, String acctCd, String custId, String crdTkn, String crdNbrLastFour, String apiMsgSentTxt, String apiMsgRespTxt, String rtnSt, String errCd, String errMsgTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fnApiLogPK = fnApiLogPK;
        this.acctCd = acctCd;
        this.custId = custId;
        this.crdTkn = crdTkn;
        this.crdNbrLastFour = crdNbrLastFour;
        this.apiMsgSentTxt = apiMsgSentTxt;
        this.apiMsgRespTxt = apiMsgRespTxt;
        this.rtnSt = rtnSt;
        this.errCd = errCd;
        this.errMsgTxt = errMsgTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FnApiLog(String trnsId, Date trnsTs) {
        this.fnApiLogPK = new FnApiLogPK(trnsId, trnsTs);
    }

    public FnApiLogPK getFnApiLogPK() {
        return fnApiLogPK;
    }

    public void setFnApiLogPK(FnApiLogPK fnApiLogPK) {
        this.fnApiLogPK = fnApiLogPK;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCrdTkn() {
        return crdTkn;
    }

    public void setCrdTkn(String crdTkn) {
        this.crdTkn = crdTkn;
    }

    public String getCrdNbrLastFour() {
        return crdNbrLastFour;
    }

    public void setCrdNbrLastFour(String crdNbrLastFour) {
        this.crdNbrLastFour = crdNbrLastFour;
    }

    public String getApiMsgSentTxt() {
        return apiMsgSentTxt;
    }

    public void setApiMsgSentTxt(String apiMsgSentTxt) {
        this.apiMsgSentTxt = apiMsgSentTxt;
    }

    public String getApiMsgRespTxt() {
        return apiMsgRespTxt;
    }

    public void setApiMsgRespTxt(String apiMsgRespTxt) {
        this.apiMsgRespTxt = apiMsgRespTxt;
    }

    public String getRtnSt() {
        return rtnSt;
    }

    public void setRtnSt(String rtnSt) {
        this.rtnSt = rtnSt;
    }

    public String getErrCd() {
        return errCd;
    }

    public void setErrCd(String errCd) {
        this.errCd = errCd;
    }

    public String getErrMsgTxt() {
        return errMsgTxt;
    }

    public void setErrMsgTxt(String errMsgTxt) {
        this.errMsgTxt = errMsgTxt;
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
        hash += (fnApiLogPK != null ? fnApiLogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FnApiLog)) {
            return false;
        }
        FnApiLog other = (FnApiLog) object;
        if ((this.fnApiLogPK == null && other.fnApiLogPK != null) || (this.fnApiLogPK != null && !this.fnApiLogPK.equals(other.fnApiLogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnApiLog[ fnApiLogPK=" + fnApiLogPK + " ]";
    }

}
