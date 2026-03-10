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
@Table(name = "PAYMENT_CRD_TRNS_AUDIT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PaymentCrdTrnsAudit.findAll", query = "SELECT p FROM PaymentCrdTrnsAudit p")})
public class PaymentCrdTrnsAudit implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentCrdTrnsAuditPK paymentCrdTrnsAuditPK;
    @Basic(optional = false)
    @Column(name = "PROCESSOR_ID")
    private String processorId;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_LAST_FOUR")
    private String crdNbrLastFour;
    @Basic(optional = false)
    @Column(name = "REQ_MSG_TXT")
    private String reqMsgTxt;
    @Basic(optional = false)
    @Column(name = "RESP_MSG_TXT")
    private String respMsgTxt;
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

    public PaymentCrdTrnsAudit() {
    }

    public PaymentCrdTrnsAudit(PaymentCrdTrnsAuditPK paymentCrdTrnsAuditPK) {
        this.paymentCrdTrnsAuditPK = paymentCrdTrnsAuditPK;
    }

    public PaymentCrdTrnsAudit(PaymentCrdTrnsAuditPK paymentCrdTrnsAuditPK, String processorId, String acctNbr, String crdTknNbr, String crdNbrLastFour, String reqMsgTxt, String respMsgTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.paymentCrdTrnsAuditPK = paymentCrdTrnsAuditPK;
        this.processorId = processorId;
        this.acctNbr = acctNbr;
        this.crdTknNbr = crdTknNbr;
        this.crdNbrLastFour = crdNbrLastFour;
        this.reqMsgTxt = reqMsgTxt;
        this.respMsgTxt = respMsgTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PaymentCrdTrnsAudit(String trnsId, Date trnsTs) {
        this.paymentCrdTrnsAuditPK = new PaymentCrdTrnsAuditPK(trnsId, trnsTs);
    }

    public PaymentCrdTrnsAuditPK getPaymentCrdTrnsAuditPK() {
        return paymentCrdTrnsAuditPK;
    }

    public void setPaymentCrdTrnsAuditPK(PaymentCrdTrnsAuditPK paymentCrdTrnsAuditPK) {
        this.paymentCrdTrnsAuditPK = paymentCrdTrnsAuditPK;
    }

    public String getProcessorId() {
        return processorId;
    }

    public void setProcessorId(String processorId) {
        this.processorId = processorId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public String getCrdNbrLastFour() {
        return crdNbrLastFour;
    }

    public void setCrdNbrLastFour(String crdNbrLastFour) {
        this.crdNbrLastFour = crdNbrLastFour;
    }

    public String getReqMsgTxt() {
        return reqMsgTxt;
    }

    public void setReqMsgTxt(String reqMsgTxt) {
        this.reqMsgTxt = reqMsgTxt;
    }

    public String getRespMsgTxt() {
        return respMsgTxt;
    }

    public void setRespMsgTxt(String respMsgTxt) {
        this.respMsgTxt = respMsgTxt;
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
        hash += (paymentCrdTrnsAuditPK != null ? paymentCrdTrnsAuditPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentCrdTrnsAudit)) {
            return false;
        }
        PaymentCrdTrnsAudit other = (PaymentCrdTrnsAudit) object;
        if ((this.paymentCrdTrnsAuditPK == null && other.paymentCrdTrnsAuditPK != null) || (this.paymentCrdTrnsAuditPK != null && !this.paymentCrdTrnsAuditPK.equals(other.paymentCrdTrnsAuditPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PaymentCrdTrnsAudit[ paymentCrdTrnsAuditPK=" + paymentCrdTrnsAuditPK + " ]";
    }
    
}
