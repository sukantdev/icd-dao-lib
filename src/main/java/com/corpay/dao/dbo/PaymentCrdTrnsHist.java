package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PAYMENT_CRD_TRNS_HIST", catalog = "", schema = "DBO")
public class PaymentCrdTrnsHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentCrdTrnsHistPK paymentCrdTrnsHistPK;
    @Basic(optional = false)
    @Column(name = "AUTH_STAT")
    private String authStat;
    @Basic(optional = false)
    @Column(name = "AUTH_CMPLT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authCmpltTs;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_LAST_FOUR")
    private String crdNbrLastFour;

    @Basic(optional = false)
    @Column(name = "TRNS_FEE_AMT")
    private BigDecimal trnsFeeAmt;
    @Basic(optional = false)
    @Column(name = "SETLMNT_AMT")
    private BigDecimal setlmntAmt;
    @Basic(optional = false)
    @Column(name = "AUTH_RESP_CD")
    private String authRespCd;
    @Basic(optional = false)
    @Column(name = "AUTH_RESP_MSG")
    private String authRespMsg;
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

    public PaymentCrdTrnsHist() {
    }

    public PaymentCrdTrnsHist(PaymentCrdTrnsHistPK paymentCrdTrnsHistPK) {
        this.paymentCrdTrnsHistPK = paymentCrdTrnsHistPK;
    }

    public PaymentCrdTrnsHist(PaymentCrdTrnsHistPK paymentCrdTrnsHistPK, String authStat, Date authCmpltTs, String acctNbr, String crdNbrLastFour, BigDecimal trnsFeeAmt, BigDecimal setlmntAmt, String authRespCd, String authRespMsg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.paymentCrdTrnsHistPK = paymentCrdTrnsHistPK;
        this.authStat = authStat;
        this.authCmpltTs = authCmpltTs;
        this.acctNbr = acctNbr;
        this.crdNbrLastFour = crdNbrLastFour;
        this.trnsFeeAmt = trnsFeeAmt;
        this.setlmntAmt = setlmntAmt;
        this.authRespCd = authRespCd;
        this.authRespMsg = authRespMsg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PaymentCrdTrnsHist(Date trnsTs, String trnsId) {
        this.paymentCrdTrnsHistPK = new PaymentCrdTrnsHistPK(trnsTs, trnsId);
    }

    public PaymentCrdTrnsHistPK getPaymentCrdTrnsHistPK() {
        return paymentCrdTrnsHistPK;
    }

    public void setPaymentCrdTrnsHistPK(PaymentCrdTrnsHistPK paymentCrdTrnsHistPK) {
        this.paymentCrdTrnsHistPK = paymentCrdTrnsHistPK;
    }

    public String getAuthStat() {
        return authStat;
    }

    public void setAuthStat(String authStat) {
        this.authStat = authStat;
    }

    public Date getAuthCmpltTs() {
        return authCmpltTs;
    }

    public void setAuthCmpltTs(Date authCmpltTs) {
        this.authCmpltTs = authCmpltTs;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCrdNbrLastFour() {
        return crdNbrLastFour;
    }

    public void setCrdNbrLastFour(String crdNbrLastFour) {
        this.crdNbrLastFour = crdNbrLastFour;
    }

    public BigDecimal getTrnsFeeAmt() {
        return trnsFeeAmt;
    }

    public void setTrnsFeeAmt(BigDecimal trnsFeeAmt) {
        this.trnsFeeAmt = trnsFeeAmt;
    }

    public BigDecimal getSetlmntAmt() {
        return setlmntAmt;
    }

    public void setSetlmntAmt(BigDecimal setlmntAmt) {
        this.setlmntAmt = setlmntAmt;
    }

    public String getAuthRespCd() {
        return authRespCd;
    }

    public void setAuthRespCd(String authRespCd) {
        this.authRespCd = authRespCd;
    }

    public String getAuthRespMsg() {
        return authRespMsg;
    }

    public void setAuthRespMsg(String authRespMsg) {
        this.authRespMsg = authRespMsg;
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
        hash += (paymentCrdTrnsHistPK != null ? paymentCrdTrnsHistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PaymentCrdTrnsHist)) {
            return false;
        }
        PaymentCrdTrnsHist other = (PaymentCrdTrnsHist) object;
        if ((this.paymentCrdTrnsHistPK == null && other.paymentCrdTrnsHistPK != null) || (this.paymentCrdTrnsHistPK != null && !this.paymentCrdTrnsHistPK.equals(other.paymentCrdTrnsHistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PaymentCrdTrnsHist[ paymentCrdTrnsHistPK=" + paymentCrdTrnsHistPK + " ]";
    }

}
