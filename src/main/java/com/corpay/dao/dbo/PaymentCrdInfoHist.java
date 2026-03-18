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
@Table(name = "PAYMENT_CRD_INFO_HIST", catalog = "", schema = "DBO")
public class PaymentCrdInfoHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentCrdInfoHistPK paymentCrdInfoHistPK;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_LAST_FOUR")
    private String crdNbrLastFour;
    @Basic(optional = false)
    @Column(name = "FUNDING_SOURCE_CD")
    private Character fundingSourceCd;
    @Basic(optional = false)
    @Column(name = "CRD_TYP_CD")
    private String crdTypCd;
    @Basic(optional = false)
    @Column(name = "CRD_ADDED_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdAddedTs;
    @Basic(optional = false)
    @Column(name = "SOURCE_APP_ID")
    private String sourceAppId;
    @Basic(optional = false)
    @Column(name = "ACTIVE_FLG")
    private Character activeFlg;
    @Basic(optional = false)
    @Column(name = "CRD_REMOVED_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdRemovedTs;
    @Basic(optional = false)
    @Column(name = "CRD_LAST_ACTION_TXT")
    private String crdLastActionTxt;
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

    public PaymentCrdInfoHist() {
    }

    public PaymentCrdInfoHist(PaymentCrdInfoHistPK paymentCrdInfoHistPK) {
        this.paymentCrdInfoHistPK = paymentCrdInfoHistPK;
    }

    public PaymentCrdInfoHist(PaymentCrdInfoHistPK paymentCrdInfoHistPK, String crdNbrLastFour, Character fundingSourceCd, String crdTypCd, Date crdAddedTs, String sourceAppId, Character activeFlg, Date crdRemovedTs, String crdLastActionTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.paymentCrdInfoHistPK = paymentCrdInfoHistPK;
        this.crdNbrLastFour = crdNbrLastFour;
        this.fundingSourceCd = fundingSourceCd;
        this.crdTypCd = crdTypCd;
        this.crdAddedTs = crdAddedTs;
        this.sourceAppId = sourceAppId;
        this.activeFlg = activeFlg;
        this.crdRemovedTs = crdRemovedTs;
        this.crdLastActionTxt = crdLastActionTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PaymentCrdInfoHist(String acctNbr, String crdTknNbr) {
        this.paymentCrdInfoHistPK = new PaymentCrdInfoHistPK(acctNbr, crdTknNbr);
    }

    public PaymentCrdInfoHistPK getPaymentCrdInfoHistPK() {
        return paymentCrdInfoHistPK;
    }

    public void setPaymentCrdInfoHistPK(PaymentCrdInfoHistPK paymentCrdInfoHistPK) {
        this.paymentCrdInfoHistPK = paymentCrdInfoHistPK;
    }

    public String getCrdNbrLastFour() {
        return crdNbrLastFour;
    }

    public void setCrdNbrLastFour(String crdNbrLastFour) {
        this.crdNbrLastFour = crdNbrLastFour;
    }

    public Character getFundingSourceCd() {
        return fundingSourceCd;
    }

    public void setFundingSourceCd(Character fundingSourceCd) {
        this.fundingSourceCd = fundingSourceCd;
    }

    public String getCrdTypCd() {
        return crdTypCd;
    }

    public void setCrdTypCd(String crdTypCd) {
        this.crdTypCd = crdTypCd;
    }

    public Date getCrdAddedTs() {
        return crdAddedTs;
    }

    public void setCrdAddedTs(Date crdAddedTs) {
        this.crdAddedTs = crdAddedTs;
    }

    public String getSourceAppId() {
        return sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

    public Character getActiveFlg() {
        return activeFlg;
    }

    public void setActiveFlg(Character activeFlg) {
        this.activeFlg = activeFlg;
    }

    public Date getCrdRemovedTs() {
        return crdRemovedTs;
    }

    public void setCrdRemovedTs(Date crdRemovedTs) {
        this.crdRemovedTs = crdRemovedTs;
    }

    public String getCrdLastActionTxt() {
        return crdLastActionTxt;
    }

    public void setCrdLastActionTxt(String crdLastActionTxt) {
        this.crdLastActionTxt = crdLastActionTxt;
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
        hash += (paymentCrdInfoHistPK != null ? paymentCrdInfoHistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PaymentCrdInfoHist)) {
            return false;
        }
        PaymentCrdInfoHist other = (PaymentCrdInfoHist) object;
        if ((this.paymentCrdInfoHistPK == null && other.paymentCrdInfoHistPK != null) || (this.paymentCrdInfoHistPK != null && !this.paymentCrdInfoHistPK.equals(other.paymentCrdInfoHistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PaymentCrdInfoHist[ paymentCrdInfoHistPK=" + paymentCrdInfoHistPK + " ]";
    }

}
