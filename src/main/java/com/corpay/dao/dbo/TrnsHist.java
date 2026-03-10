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
@Table(name = "TRNS_HIST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "TrnsHist.findAll", query = "SELECT t FROM TrnsHist t")})
public class TrnsHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TrnsHistPK trnsHistPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "XTN_AMT")
    private BigDecimal xtnAmt;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "LOC_INVOICE_NBR")
    private String locInvoiceNbr;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "DRAFT_NBR")
    private long draftNbr;
    @Basic(optional = false)
    @Column(name = "DRAFT_AMT")
    private BigDecimal draftAmt;
    @Basic(optional = false)
    @Column(name = "ROLLOVER_IND")
    private Character rolloverInd;
    @Basic(optional = false)
    @Column(name = "ROLLOVER_CTL_NBR")
    private int rolloverCtlNbr;
    @Column(name = "ROLLOVER_DT")
    @Temporal(TemporalType.DATE)
    private Date rolloverDt;
    @Basic(optional = false)
    @Column(name = "PAYEE_NM")
    private String payeeNm;
    @Basic(optional = false)
    @Column(name = "SMALL_NM")
    private String smallNm;
    @Basic(optional = false)
    @Column(name = "AUTH_NBR")
    private int authNbr;
    @Basic(optional = false)
    @Column(name = "EC_SEQ_NBR")
    private int ecSeqNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "TIME_IN")
    private String timeIn;
    @Basic(optional = false)
    @Column(name = "TIME_OUT")
    private String timeOut;
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

    public TrnsHist() {
    }

    public TrnsHist(TrnsHistPK trnsHistPK) {
        this.trnsHistPK = trnsHistPK;
    }

    public TrnsHist(TrnsHistPK trnsHistPK, BigDecimal xtnAmt, String locCd, String locInvoiceNbr, String acctCd, String crdNbr, long draftNbr, BigDecimal draftAmt, Character rolloverInd, int rolloverCtlNbr, String payeeNm, String smallNm, int authNbr, int ecSeqNbr, String custId, String timeIn, String timeOut, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.trnsHistPK = trnsHistPK;
        this.xtnAmt = xtnAmt;
        this.locCd = locCd;
        this.locInvoiceNbr = locInvoiceNbr;
        this.acctCd = acctCd;
        this.crdNbr = crdNbr;
        this.draftNbr = draftNbr;
        this.draftAmt = draftAmt;
        this.rolloverInd = rolloverInd;
        this.rolloverCtlNbr = rolloverCtlNbr;
        this.payeeNm = payeeNm;
        this.smallNm = smallNm;
        this.authNbr = authNbr;
        this.ecSeqNbr = ecSeqNbr;
        this.custId = custId;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public TrnsHist(Date xtnDt, int ctlNbr) {
        this.trnsHistPK = new TrnsHistPK(xtnDt, ctlNbr);
    }

    public TrnsHistPK getTrnsHistPK() {
        return trnsHistPK;
    }

    public void setTrnsHistPK(TrnsHistPK trnsHistPK) {
        this.trnsHistPK = trnsHistPK;
    }

    public BigDecimal getXtnAmt() {
        return xtnAmt;
    }

    public void setXtnAmt(BigDecimal xtnAmt) {
        this.xtnAmt = xtnAmt;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getLocInvoiceNbr() {
        return locInvoiceNbr;
    }

    public void setLocInvoiceNbr(String locInvoiceNbr) {
        this.locInvoiceNbr = locInvoiceNbr;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public long getDraftNbr() {
        return draftNbr;
    }

    public void setDraftNbr(long draftNbr) {
        this.draftNbr = draftNbr;
    }

    public BigDecimal getDraftAmt() {
        return draftAmt;
    }

    public void setDraftAmt(BigDecimal draftAmt) {
        this.draftAmt = draftAmt;
    }

    public Character getRolloverInd() {
        return rolloverInd;
    }

    public void setRolloverInd(Character rolloverInd) {
        this.rolloverInd = rolloverInd;
    }

    public int getRolloverCtlNbr() {
        return rolloverCtlNbr;
    }

    public void setRolloverCtlNbr(int rolloverCtlNbr) {
        this.rolloverCtlNbr = rolloverCtlNbr;
    }

    public Date getRolloverDt() {
        return rolloverDt;
    }

    public void setRolloverDt(Date rolloverDt) {
        this.rolloverDt = rolloverDt;
    }

    public String getPayeeNm() {
        return payeeNm;
    }

    public void setPayeeNm(String payeeNm) {
        this.payeeNm = payeeNm;
    }

    public String getSmallNm() {
        return smallNm;
    }

    public void setSmallNm(String smallNm) {
        this.smallNm = smallNm;
    }

    public int getAuthNbr() {
        return authNbr;
    }

    public void setAuthNbr(int authNbr) {
        this.authNbr = authNbr;
    }

    public int getEcSeqNbr() {
        return ecSeqNbr;
    }

    public void setEcSeqNbr(int ecSeqNbr) {
        this.ecSeqNbr = ecSeqNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
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
        hash += (trnsHistPK != null ? trnsHistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrnsHist)) {
            return false;
        }
        TrnsHist other = (TrnsHist) object;
        if ((this.trnsHistPK == null && other.trnsHistPK != null) || (this.trnsHistPK != null && !this.trnsHistPK.equals(other.trnsHistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TrnsHist[ trnsHistPK=" + trnsHistPK + " ]";
    }
    
}
