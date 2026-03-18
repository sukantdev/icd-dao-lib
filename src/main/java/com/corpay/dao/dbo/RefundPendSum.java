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
@Table(name = "REFUND_PEND_SUM", catalog = "", schema = "DBO")
public class RefundPendSum implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RefundPendSumPK refundPendSumPK;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private Character statCd;
    @Basic(optional = false)
    @Column(name = "SENT_FLG")
    private Character sentFlg;
    @Basic(optional = false)
    @Column(name = "SENT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sentTs;
    @Basic(optional = false)
    @Column(name = "SEND_DT")
    @Temporal(TemporalType.DATE)
    private Date sendDt;

    @Basic(optional = false)
    @Column(name = "AMT")
    private BigDecimal amt;
    @Basic(optional = false)
    @Column(name = "CRD_AMT")
    private BigDecimal crdAmt;
    @Basic(optional = false)
    @Column(name = "CNT")
    private int cnt;
    @Basic(optional = false)
    @Column(name = "RSN")
    private String rsn;
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

    public RefundPendSum() {
    }

    public RefundPendSum(RefundPendSumPK refundPendSumPK) {
        this.refundPendSumPK = refundPendSumPK;
    }

    public RefundPendSum(RefundPendSumPK refundPendSumPK, Character statCd, Character sentFlg, Date sentTs, Date sendDt, BigDecimal amt, BigDecimal crdAmt, int cnt, String rsn, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.refundPendSumPK = refundPendSumPK;
        this.statCd = statCd;
        this.sentFlg = sentFlg;
        this.sentTs = sentTs;
        this.sendDt = sendDt;
        this.amt = amt;
        this.crdAmt = crdAmt;
        this.cnt = cnt;
        this.rsn = rsn;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public RefundPendSum(String acctNbr, Date addDt) {
        this.refundPendSumPK = new RefundPendSumPK(acctNbr, addDt);
    }

    public RefundPendSumPK getRefundPendSumPK() {
        return refundPendSumPK;
    }

    public void setRefundPendSumPK(RefundPendSumPK refundPendSumPK) {
        this.refundPendSumPK = refundPendSumPK;
    }

    public Character getStatCd() {
        return statCd;
    }

    public void setStatCd(Character statCd) {
        this.statCd = statCd;
    }

    public Character getSentFlg() {
        return sentFlg;
    }

    public void setSentFlg(Character sentFlg) {
        this.sentFlg = sentFlg;
    }

    public Date getSentTs() {
        return sentTs;
    }

    public void setSentTs(Date sentTs) {
        this.sentTs = sentTs;
    }

    public Date getSendDt() {
        return sendDt;
    }

    public void setSendDt(Date sendDt) {
        this.sendDt = sendDt;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getCrdAmt() {
        return crdAmt;
    }

    public void setCrdAmt(BigDecimal crdAmt) {
        this.crdAmt = crdAmt;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getRsn() {
        return rsn;
    }

    public void setRsn(String rsn) {
        this.rsn = rsn;
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
        hash += (refundPendSumPK != null ? refundPendSumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RefundPendSum)) {
            return false;
        }
        RefundPendSum other = (RefundPendSum) object;
        if ((this.refundPendSumPK == null && other.refundPendSumPK != null) || (this.refundPendSumPK != null && !this.refundPendSumPK.equals(other.refundPendSumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RefundPendSum[ refundPendSumPK=" + refundPendSumPK + " ]";
    }

}
