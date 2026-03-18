package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ALERT_HIST", catalog = "", schema = "DBO")
public class AlertHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ALERT_ID")
    private String alertId;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "STATUS_FLG")
    private Character statusFlg;
    @Basic(optional = false)
    @Column(name = "CRD_CONTACT_ID")
    private String crdContactId;

    @Basic(optional = false)
    @Column(name = "AUTH_APPROVAL_CD")
    private BigDecimal authApprovalCd;
    @Basic(optional = false)
    @Column(name = "AUTH_UT_DT")
    @Temporal(TemporalType.DATE)
    private Date authUtDt;
    @Basic(optional = false)
    @Column(name = "AUTH_LOCAL_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authLocalTs;
    @Basic(optional = false)
    @Column(name = "AUTH_POSTED_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authPostedTs;
    @Basic(optional = false)
    @Column(name = "AUTH_POSTED_DT")
    @Temporal(TemporalType.DATE)
    private Date authPostedDt;
    @Basic(optional = false)
    @Column(name = "IRIS_REC_ID")
    private String irisRecId;
    @Basic(optional = false)
    @Column(name = "RSPNDR_TXT")
    private String rspndrTxt;
    @Basic(optional = false)
    @Column(name = "LST_RESEND_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lstResendTs;
    @Basic(optional = false)
    @Column(name = "AUTH_AMT")
    private BigDecimal authAmt;
    @Basic(optional = false)
    @Column(name = "TYP_FLG")
    private Character typFlg;
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
    @Column(name = "AUTH_DECLINE_REASON_TXT")
    private String authDeclineReasonTxt;

    public AlertHist() {
    }

    public AlertHist(String alertId) {
        this.alertId = alertId;
    }

    public AlertHist(String alertId, String custId, String crdNbr, Character statusFlg, String crdContactId, BigDecimal authApprovalCd, Date authUtDt, Date authLocalTs, Date authPostedTs, Date authPostedDt, String irisRecId, String rspndrTxt, Date lstResendTs, BigDecimal authAmt, Character typFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String authDeclineReasonTxt) {
        this.alertId = alertId;
        this.custId = custId;
        this.crdNbr = crdNbr;
        this.statusFlg = statusFlg;
        this.crdContactId = crdContactId;
        this.authApprovalCd = authApprovalCd;
        this.authUtDt = authUtDt;
        this.authLocalTs = authLocalTs;
        this.authPostedTs = authPostedTs;
        this.authPostedDt = authPostedDt;
        this.irisRecId = irisRecId;
        this.rspndrTxt = rspndrTxt;
        this.lstResendTs = lstResendTs;
        this.authAmt = authAmt;
        this.typFlg = typFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.authDeclineReasonTxt = authDeclineReasonTxt;
    }

    public String getAlertId() {
        return alertId;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Character getStatusFlg() {
        return statusFlg;
    }

    public void setStatusFlg(Character statusFlg) {
        this.statusFlg = statusFlg;
    }

    public String getCrdContactId() {
        return crdContactId;
    }

    public void setCrdContactId(String crdContactId) {
        this.crdContactId = crdContactId;
    }

    public BigDecimal getAuthApprovalCd() {
        return authApprovalCd;
    }

    public void setAuthApprovalCd(BigDecimal authApprovalCd) {
        this.authApprovalCd = authApprovalCd;
    }

    public Date getAuthUtDt() {
        return authUtDt;
    }

    public void setAuthUtDt(Date authUtDt) {
        this.authUtDt = authUtDt;
    }

    public Date getAuthLocalTs() {
        return authLocalTs;
    }

    public void setAuthLocalTs(Date authLocalTs) {
        this.authLocalTs = authLocalTs;
    }

    public Date getAuthPostedTs() {
        return authPostedTs;
    }

    public void setAuthPostedTs(Date authPostedTs) {
        this.authPostedTs = authPostedTs;
    }

    public Date getAuthPostedDt() {
        return authPostedDt;
    }

    public void setAuthPostedDt(Date authPostedDt) {
        this.authPostedDt = authPostedDt;
    }

    public String getIrisRecId() {
        return irisRecId;
    }

    public void setIrisRecId(String irisRecId) {
        this.irisRecId = irisRecId;
    }

    public String getRspndrTxt() {
        return rspndrTxt;
    }

    public void setRspndrTxt(String rspndrTxt) {
        this.rspndrTxt = rspndrTxt;
    }

    public Date getLstResendTs() {
        return lstResendTs;
    }

    public void setLstResendTs(Date lstResendTs) {
        this.lstResendTs = lstResendTs;
    }

    public BigDecimal getAuthAmt() {
        return authAmt;
    }

    public void setAuthAmt(BigDecimal authAmt) {
        this.authAmt = authAmt;
    }

    public Character getTypFlg() {
        return typFlg;
    }

    public void setTypFlg(Character typFlg) {
        this.typFlg = typFlg;
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

    public String getAuthDeclineReasonTxt() {
        return authDeclineReasonTxt;
    }

    public void setAuthDeclineReasonTxt(String authDeclineReasonTxt) {
        this.authDeclineReasonTxt = authDeclineReasonTxt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alertId != null ? alertId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AlertHist)) {
            return false;
        }
        AlertHist other = (AlertHist) object;
        if ((this.alertId == null && other.alertId != null) || (this.alertId != null && !this.alertId.equals(other.alertId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AlertHist[ alertId=" + alertId + " ]";
    }

}
