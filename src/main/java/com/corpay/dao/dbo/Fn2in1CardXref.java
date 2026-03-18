package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "FN_2IN1_CARD_XREF", catalog = "", schema = "DBO")
public class Fn2in1CardXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CARD_NBR")
    private String cardNbr;
    @Basic(optional = false)
    @Column(name = "FN_CARD_NBR")
    private String fnCardNbr;
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
    @Column(name = "APP_TRNS_CNT")
    private int appTrnsCnt;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_LAST_FOUR")
    private String crdNbrLastFour;

    public Fn2in1CardXref() {
    }

    public Fn2in1CardXref(String cardNbr) {
        this.cardNbr = cardNbr;
    }

    public Fn2in1CardXref(String cardNbr, String fnCardNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, int appTrnsCnt, String acctCd, String custId, String crdNbrLastFour) {
        this.cardNbr = cardNbr;
        this.fnCardNbr = fnCardNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.appTrnsCnt = appTrnsCnt;
        this.acctCd = acctCd;
        this.custId = custId;
        this.crdNbrLastFour = crdNbrLastFour;
    }

    public String getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr;
    }

    public String getFnCardNbr() {
        return fnCardNbr;
    }

    public void setFnCardNbr(String fnCardNbr) {
        this.fnCardNbr = fnCardNbr;
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

    public int getAppTrnsCnt() {
        return appTrnsCnt;
    }

    public void setAppTrnsCnt(int appTrnsCnt) {
        this.appTrnsCnt = appTrnsCnt;
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

    public String getCrdNbrLastFour() {
        return crdNbrLastFour;
    }

    public void setCrdNbrLastFour(String crdNbrLastFour) {
        this.crdNbrLastFour = crdNbrLastFour;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cardNbr != null ? cardNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Fn2in1CardXref)) {
            return false;
        }
        Fn2in1CardXref other = (Fn2in1CardXref) object;
        if ((this.cardNbr == null && other.cardNbr != null) || (this.cardNbr != null && !this.cardNbr.equals(other.cardNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Fn2in1CardXref[ cardNbr=" + cardNbr + " ]";
    }

}
