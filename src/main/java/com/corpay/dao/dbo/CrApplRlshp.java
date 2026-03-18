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
@Table(name = "CR_APPL_RLSHP", catalog = "", schema = "DBO")
public class CrApplRlshp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplRlshpPK crApplRlshpPK;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR_CHG")
    private String acctNbrChg;

    @Basic(optional = false)
    @Column(name = "ACCT_CR_LMT")
    private BigDecimal acctCrLmt;
    @Basic(optional = false)
    @Column(name = "BLNG_CYC")
    private String blngCyc;
    @Basic(optional = false)
    @Column(name = "PMT_MTHD")
    private String pmtMthd;
    @Basic(optional = false)
    @Column(name = "PMT_TRMS")
    private String pmtTrms;
    @Basic(optional = false)
    @Column(name = "SCY_TYP")
    private String scyTyp;
    @Basic(optional = false)
    @Column(name = "SCY_AMT")
    private BigDecimal scyAmt;
    @Basic(optional = false)
    @Column(name = "ACCT_NM")
    private String acctNm;
    @Basic(optional = false)
    @Column(name = "OWNR")
    private String ownr;
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
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;

    public CrApplRlshp() {
    }

    public CrApplRlshp(CrApplRlshpPK crApplRlshpPK) {
        this.crApplRlshpPK = crApplRlshpPK;
    }

    public CrApplRlshp(CrApplRlshpPK crApplRlshpPK, String acctNbrChg, BigDecimal acctCrLmt, String blngCyc, String pmtMthd, String pmtTrms, String scyTyp, BigDecimal scyAmt, String acctNm, String ownr, Date mdyTs, String mdyUsr, Date crtTs, String crtUsr) {
        this.crApplRlshpPK = crApplRlshpPK;
        this.acctNbrChg = acctNbrChg;
        this.acctCrLmt = acctCrLmt;
        this.blngCyc = blngCyc;
        this.pmtMthd = pmtMthd;
        this.pmtTrms = pmtTrms;
        this.scyTyp = scyTyp;
        this.scyAmt = scyAmt;
        this.acctNm = acctNm;
        this.ownr = ownr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
    }

    public CrApplRlshp(String applNbr, short seq) {
        this.crApplRlshpPK = new CrApplRlshpPK(applNbr, seq);
    }

    public CrApplRlshpPK getCrApplRlshpPK() {
        return crApplRlshpPK;
    }

    public void setCrApplRlshpPK(CrApplRlshpPK crApplRlshpPK) {
        this.crApplRlshpPK = crApplRlshpPK;
    }

    public String getAcctNbrChg() {
        return acctNbrChg;
    }

    public void setAcctNbrChg(String acctNbrChg) {
        this.acctNbrChg = acctNbrChg;
    }

    public BigDecimal getAcctCrLmt() {
        return acctCrLmt;
    }

    public void setAcctCrLmt(BigDecimal acctCrLmt) {
        this.acctCrLmt = acctCrLmt;
    }

    public String getBlngCyc() {
        return blngCyc;
    }

    public void setBlngCyc(String blngCyc) {
        this.blngCyc = blngCyc;
    }

    public String getPmtMthd() {
        return pmtMthd;
    }

    public void setPmtMthd(String pmtMthd) {
        this.pmtMthd = pmtMthd;
    }

    public String getPmtTrms() {
        return pmtTrms;
    }

    public void setPmtTrms(String pmtTrms) {
        this.pmtTrms = pmtTrms;
    }

    public String getScyTyp() {
        return scyTyp;
    }

    public void setScyTyp(String scyTyp) {
        this.scyTyp = scyTyp;
    }

    public BigDecimal getScyAmt() {
        return scyAmt;
    }

    public void setScyAmt(BigDecimal scyAmt) {
        this.scyAmt = scyAmt;
    }

    public String getAcctNm() {
        return acctNm;
    }

    public void setAcctNm(String acctNm) {
        this.acctNm = acctNm;
    }

    public String getOwnr() {
        return ownr;
    }

    public void setOwnr(String ownr) {
        this.ownr = ownr;
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

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crApplRlshpPK != null ? crApplRlshpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplRlshp)) {
            return false;
        }
        CrApplRlshp other = (CrApplRlshp) object;
        if ((this.crApplRlshpPK == null && other.crApplRlshpPK != null) || (this.crApplRlshpPK != null && !this.crApplRlshpPK.equals(other.crApplRlshpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplRlshp[ crApplRlshpPK=" + crApplRlshpPK + " ]";
    }

}
