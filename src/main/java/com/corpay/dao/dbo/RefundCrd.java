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
@Table(name = "REFUND_CRD", catalog = "", schema = "DBO")
public class RefundCrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RefundCrdPK refundCrdPK;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "TYP_CD")
    private Character typCd;
    @Basic(optional = false)
    @Column(name = "CUST_NBR")
    private String custNbr;
    @Basic(optional = false)
    @Column(name = "BLK_DT")
    @Temporal(TemporalType.DATE)
    private Date blkDt;

    @Basic(optional = false)
    @Column(name = "AMT")
    private BigDecimal amt;
    @Basic(optional = false)
    @Column(name = "CRD_AMT")
    private BigDecimal crdAmt;
    @Basic(optional = false)
    @Column(name = "REFUND_SEND_DT")
    @Temporal(TemporalType.DATE)
    private Date refundSendDt;
    @Basic(optional = false)
    @Column(name = "REFUND_EFF_DT")
    @Temporal(TemporalType.DATE)
    private Date refundEffDt;
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

    public RefundCrd() {
    }

    public RefundCrd(RefundCrdPK refundCrdPK) {
        this.refundCrdPK = refundCrdPK;
    }

    public RefundCrd(RefundCrdPK refundCrdPK, String acctNbr, Character typCd, String custNbr, Date blkDt, BigDecimal amt, BigDecimal crdAmt, Date refundSendDt, Date refundEffDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.refundCrdPK = refundCrdPK;
        this.acctNbr = acctNbr;
        this.typCd = typCd;
        this.custNbr = custNbr;
        this.blkDt = blkDt;
        this.amt = amt;
        this.crdAmt = crdAmt;
        this.refundSendDt = refundSendDt;
        this.refundEffDt = refundEffDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public RefundCrd(String crdNbr, Date addDt) {
        this.refundCrdPK = new RefundCrdPK(crdNbr, addDt);
    }

    public RefundCrdPK getRefundCrdPK() {
        return refundCrdPK;
    }

    public void setRefundCrdPK(RefundCrdPK refundCrdPK) {
        this.refundCrdPK = refundCrdPK;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public Character getTypCd() {
        return typCd;
    }

    public void setTypCd(Character typCd) {
        this.typCd = typCd;
    }

    public String getCustNbr() {
        return custNbr;
    }

    public void setCustNbr(String custNbr) {
        this.custNbr = custNbr;
    }

    public Date getBlkDt() {
        return blkDt;
    }

    public void setBlkDt(Date blkDt) {
        this.blkDt = blkDt;
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

    public Date getRefundSendDt() {
        return refundSendDt;
    }

    public void setRefundSendDt(Date refundSendDt) {
        this.refundSendDt = refundSendDt;
    }

    public Date getRefundEffDt() {
        return refundEffDt;
    }

    public void setRefundEffDt(Date refundEffDt) {
        this.refundEffDt = refundEffDt;
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
        hash += (refundCrdPK != null ? refundCrdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RefundCrd)) {
            return false;
        }
        RefundCrd other = (RefundCrd) object;
        if ((this.refundCrdPK == null && other.refundCrdPK != null) || (this.refundCrdPK != null && !this.refundCrdPK.equals(other.refundCrdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RefundCrd[ refundCrdPK=" + refundCrdPK + " ]";
    }

}
