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
@Table(name = "INV_PYMT_TRANSACTION_DTAIL", catalog = "", schema = "DBO")
public class InvPymtTransactionDtail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPymtTransactionDtailPK invPymtTransactionDtailPK;
    @Basic(optional = false)
    @Column(name = "PYR_NM_ID")
    private String pyrNmId;
    @Basic(optional = false)
    @Column(name = "PYR_ADDRESS")
    private String pyrAddress;
    @Basic(optional = false)
    @Column(name = "PYR_CITY")
    private String pyrCity;
    @Basic(optional = false)
    @Column(name = "PYR_ST")
    private String pyrSt;
    @Basic(optional = false)
    @Column(name = "PYR_CRTY")
    private String pyrCrty;
    @Basic(optional = false)
    @Column(name = "PYR_ZIP")
    private String pyrZip;
    @Basic(optional = false)
    @Column(name = "DT_FUNDSREQ")
    private int dtFundsreq;
    @Basic(optional = false)
    @Column(name = "RCP_NM")
    private String rcpNm;
    @Basic(optional = false)
    @Column(name = "DT_ANT_RCT")
    private int dtAntRct;
    @Basic(optional = false)
    @Column(name = "ADDTRREFNOU")
    private String addtrrefnou;
    @Basic(optional = false)
    @Column(name = "ADDTRDESCD")
    private String addtrdescd;
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

    public InvPymtTransactionDtail() {
    }

    public InvPymtTransactionDtail(InvPymtTransactionDtailPK invPymtTransactionDtailPK) {
        this.invPymtTransactionDtailPK = invPymtTransactionDtailPK;
    }

    public InvPymtTransactionDtail(InvPymtTransactionDtailPK invPymtTransactionDtailPK, String pyrNmId, String pyrAddress, String pyrCity, String pyrSt, String pyrCrty, String pyrZip, int dtFundsreq, String rcpNm, int dtAntRct, String addtrrefnou, String addtrdescd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invPymtTransactionDtailPK = invPymtTransactionDtailPK;
        this.pyrNmId = pyrNmId;
        this.pyrAddress = pyrAddress;
        this.pyrCity = pyrCity;
        this.pyrSt = pyrSt;
        this.pyrCrty = pyrCrty;
        this.pyrZip = pyrZip;
        this.dtFundsreq = dtFundsreq;
        this.rcpNm = rcpNm;
        this.dtAntRct = dtAntRct;
        this.addtrrefnou = addtrrefnou;
        this.addtrdescd = addtrdescd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvPymtTransactionDtail(Date pstdDt, int trnsId, short seqNo) {
        this.invPymtTransactionDtailPK = new InvPymtTransactionDtailPK(pstdDt, trnsId, seqNo);
    }

    public InvPymtTransactionDtailPK getInvPymtTransactionDtailPK() {
        return invPymtTransactionDtailPK;
    }

    public void setInvPymtTransactionDtailPK(InvPymtTransactionDtailPK invPymtTransactionDtailPK) {
        this.invPymtTransactionDtailPK = invPymtTransactionDtailPK;
    }

    public String getPyrNmId() {
        return pyrNmId;
    }

    public void setPyrNmId(String pyrNmId) {
        this.pyrNmId = pyrNmId;
    }

    public String getPyrAddress() {
        return pyrAddress;
    }

    public void setPyrAddress(String pyrAddress) {
        this.pyrAddress = pyrAddress;
    }

    public String getPyrCity() {
        return pyrCity;
    }

    public void setPyrCity(String pyrCity) {
        this.pyrCity = pyrCity;
    }

    public String getPyrSt() {
        return pyrSt;
    }

    public void setPyrSt(String pyrSt) {
        this.pyrSt = pyrSt;
    }

    public String getPyrCrty() {
        return pyrCrty;
    }

    public void setPyrCrty(String pyrCrty) {
        this.pyrCrty = pyrCrty;
    }

    public String getPyrZip() {
        return pyrZip;
    }

    public void setPyrZip(String pyrZip) {
        this.pyrZip = pyrZip;
    }

    public int getDtFundsreq() {
        return dtFundsreq;
    }

    public void setDtFundsreq(int dtFundsreq) {
        this.dtFundsreq = dtFundsreq;
    }

    public String getRcpNm() {
        return rcpNm;
    }

    public void setRcpNm(String rcpNm) {
        this.rcpNm = rcpNm;
    }

    public int getDtAntRct() {
        return dtAntRct;
    }

    public void setDtAntRct(int dtAntRct) {
        this.dtAntRct = dtAntRct;
    }

    public String getAddtrrefnou() {
        return addtrrefnou;
    }

    public void setAddtrrefnou(String addtrrefnou) {
        this.addtrrefnou = addtrrefnou;
    }

    public String getAddtrdescd() {
        return addtrdescd;
    }

    public void setAddtrdescd(String addtrdescd) {
        this.addtrdescd = addtrdescd;
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
        hash += (invPymtTransactionDtailPK != null ? invPymtTransactionDtailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvPymtTransactionDtail)) {
            return false;
        }
        InvPymtTransactionDtail other = (InvPymtTransactionDtail) object;
        if ((this.invPymtTransactionDtailPK == null && other.invPymtTransactionDtailPK != null) || (this.invPymtTransactionDtailPK != null && !this.invPymtTransactionDtailPK.equals(other.invPymtTransactionDtailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvPymtTransactionDtail[ invPymtTransactionDtailPK=" + invPymtTransactionDtailPK + " ]";
    }

}
