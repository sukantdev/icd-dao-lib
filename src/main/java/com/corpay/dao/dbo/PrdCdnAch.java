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
@Table(name = "PRD_CDN_ACH", catalog = "", schema = "DBO")
public class PrdCdnAch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "BANK_NM")
    private String bankNm;
    @Basic(optional = false)
    @Column(name = "BANK_CTY")
    private String bankCty;
    @Basic(optional = false)
    @Column(name = "BANK_ST")
    private String bankSt;
    @Basic(optional = false)
    @Column(name = "BANK_ZIP")
    private String bankZip;
    @Basic(optional = false)
    @Column(name = "BANK_CRTY")
    private String bankCrty;
    @Basic(optional = false)
    @Column(name = "RTNG_NBR")
    private String rtngNbr;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "ACCT_NM")
    private String acctNm;
    @Basic(optional = false)
    @Column(name = "DRAFT_DYS")
    private short draftDys;
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
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public PrdCdnAch() {
    }

    public PrdCdnAch(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdCdnAch(String applNbr, String bankNm, String bankCty, String bankSt, String bankZip, String bankCrty, String rtngNbr, String acctNbr, String acctNm, short draftDys, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.applNbr = applNbr;
        this.bankNm = bankNm;
        this.bankCty = bankCty;
        this.bankSt = bankSt;
        this.bankZip = bankZip;
        this.bankCrty = bankCrty;
        this.rtngNbr = rtngNbr;
        this.acctNbr = acctNbr;
        this.acctNm = acctNm;
        this.draftDys = draftDys;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getBankNm() {
        return bankNm;
    }

    public void setBankNm(String bankNm) {
        this.bankNm = bankNm;
    }

    public String getBankCty() {
        return bankCty;
    }

    public void setBankCty(String bankCty) {
        this.bankCty = bankCty;
    }

    public String getBankSt() {
        return bankSt;
    }

    public void setBankSt(String bankSt) {
        this.bankSt = bankSt;
    }

    public String getBankZip() {
        return bankZip;
    }

    public void setBankZip(String bankZip) {
        this.bankZip = bankZip;
    }

    public String getBankCrty() {
        return bankCrty;
    }

    public void setBankCrty(String bankCrty) {
        this.bankCrty = bankCrty;
    }

    public String getRtngNbr() {
        return rtngNbr;
    }

    public void setRtngNbr(String rtngNbr) {
        this.rtngNbr = rtngNbr;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getAcctNm() {
        return acctNm;
    }

    public void setAcctNm(String acctNm) {
        this.acctNm = acctNm;
    }

    public short getDraftDys() {
        return draftDys;
    }

    public void setDraftDys(short draftDys) {
        this.draftDys = draftDys;
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

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdCdnAch)) {
            return false;
        }
        PrdCdnAch other = (PrdCdnAch) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdCdnAch[ applNbr=" + applNbr + " ]";
    }

}
