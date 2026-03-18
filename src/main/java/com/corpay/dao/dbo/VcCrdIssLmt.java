package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "VC_CRD_ISS_LMT", catalog = "", schema = "DBO")
public class VcCrdIssLmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "DLY_FLG")
    private Character dlyFlg;

    @Basic(optional = false)
    @Column(name = "DLY_LMT_AMT")
    private BigDecimal dlyLmtAmt;
    @Basic(optional = false)
    @Column(name = "DLY_ISS_AMT")
    private BigDecimal dlyIssAmt;
    @Basic(optional = false)
    @Column(name = "DLY_LST_RESET_DT")
    @Temporal(TemporalType.DATE)
    private Date dlyLstResetDt;
    @Basic(optional = false)
    @Column(name = "WKLY_FLG")
    private Character wklyFlg;
    @Basic(optional = false)
    @Column(name = "WKLY_RESET_NBR")
    private short wklyResetNbr;
    @Basic(optional = false)
    @Column(name = "WKLY_LMT_AMT")
    private BigDecimal wklyLmtAmt;
    @Basic(optional = false)
    @Column(name = "WKLY_ISS_AMT")
    private BigDecimal wklyIssAmt;
    @Basic(optional = false)
    @Column(name = "WKLY_LST_RESET_DT")
    @Temporal(TemporalType.DATE)
    private Date wklyLstResetDt;
    @Basic(optional = false)
    @Column(name = "MTHLY_FLG")
    private Character mthlyFlg;
    @Basic(optional = false)
    @Column(name = "MTHLY_RESET_NBR")
    private short mthlyResetNbr;
    @Basic(optional = false)
    @Column(name = "MTHLY_LMT_AMT")
    private BigDecimal mthlyLmtAmt;
    @Basic(optional = false)
    @Column(name = "MTHLY_ISS_AMT")
    private BigDecimal mthlyIssAmt;
    @Basic(optional = false)
    @Column(name = "MTHLY_LST_RESET_DT")
    @Temporal(TemporalType.DATE)
    private Date mthlyLstResetDt;
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

    public VcCrdIssLmt() {
    }

    public VcCrdIssLmt(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public VcCrdIssLmt(String acctNbr, Character dlyFlg, BigDecimal dlyLmtAmt, BigDecimal dlyIssAmt, Date dlyLstResetDt, Character wklyFlg, short wklyResetNbr, BigDecimal wklyLmtAmt, BigDecimal wklyIssAmt, Date wklyLstResetDt, Character mthlyFlg, short mthlyResetNbr, BigDecimal mthlyLmtAmt, BigDecimal mthlyIssAmt, Date mthlyLstResetDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.acctNbr = acctNbr;
        this.dlyFlg = dlyFlg;
        this.dlyLmtAmt = dlyLmtAmt;
        this.dlyIssAmt = dlyIssAmt;
        this.dlyLstResetDt = dlyLstResetDt;
        this.wklyFlg = wklyFlg;
        this.wklyResetNbr = wklyResetNbr;
        this.wklyLmtAmt = wklyLmtAmt;
        this.wklyIssAmt = wklyIssAmt;
        this.wklyLstResetDt = wklyLstResetDt;
        this.mthlyFlg = mthlyFlg;
        this.mthlyResetNbr = mthlyResetNbr;
        this.mthlyLmtAmt = mthlyLmtAmt;
        this.mthlyIssAmt = mthlyIssAmt;
        this.mthlyLstResetDt = mthlyLstResetDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public Character getDlyFlg() {
        return dlyFlg;
    }

    public void setDlyFlg(Character dlyFlg) {
        this.dlyFlg = dlyFlg;
    }

    public BigDecimal getDlyLmtAmt() {
        return dlyLmtAmt;
    }

    public void setDlyLmtAmt(BigDecimal dlyLmtAmt) {
        this.dlyLmtAmt = dlyLmtAmt;
    }

    public BigDecimal getDlyIssAmt() {
        return dlyIssAmt;
    }

    public void setDlyIssAmt(BigDecimal dlyIssAmt) {
        this.dlyIssAmt = dlyIssAmt;
    }

    public Date getDlyLstResetDt() {
        return dlyLstResetDt;
    }

    public void setDlyLstResetDt(Date dlyLstResetDt) {
        this.dlyLstResetDt = dlyLstResetDt;
    }

    public Character getWklyFlg() {
        return wklyFlg;
    }

    public void setWklyFlg(Character wklyFlg) {
        this.wklyFlg = wklyFlg;
    }

    public short getWklyResetNbr() {
        return wklyResetNbr;
    }

    public void setWklyResetNbr(short wklyResetNbr) {
        this.wklyResetNbr = wklyResetNbr;
    }

    public BigDecimal getWklyLmtAmt() {
        return wklyLmtAmt;
    }

    public void setWklyLmtAmt(BigDecimal wklyLmtAmt) {
        this.wklyLmtAmt = wklyLmtAmt;
    }

    public BigDecimal getWklyIssAmt() {
        return wklyIssAmt;
    }

    public void setWklyIssAmt(BigDecimal wklyIssAmt) {
        this.wklyIssAmt = wklyIssAmt;
    }

    public Date getWklyLstResetDt() {
        return wklyLstResetDt;
    }

    public void setWklyLstResetDt(Date wklyLstResetDt) {
        this.wklyLstResetDt = wklyLstResetDt;
    }

    public Character getMthlyFlg() {
        return mthlyFlg;
    }

    public void setMthlyFlg(Character mthlyFlg) {
        this.mthlyFlg = mthlyFlg;
    }

    public short getMthlyResetNbr() {
        return mthlyResetNbr;
    }

    public void setMthlyResetNbr(short mthlyResetNbr) {
        this.mthlyResetNbr = mthlyResetNbr;
    }

    public BigDecimal getMthlyLmtAmt() {
        return mthlyLmtAmt;
    }

    public void setMthlyLmtAmt(BigDecimal mthlyLmtAmt) {
        this.mthlyLmtAmt = mthlyLmtAmt;
    }

    public BigDecimal getMthlyIssAmt() {
        return mthlyIssAmt;
    }

    public void setMthlyIssAmt(BigDecimal mthlyIssAmt) {
        this.mthlyIssAmt = mthlyIssAmt;
    }

    public Date getMthlyLstResetDt() {
        return mthlyLstResetDt;
    }

    public void setMthlyLstResetDt(Date mthlyLstResetDt) {
        this.mthlyLstResetDt = mthlyLstResetDt;
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
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VcCrdIssLmt)) {
            return false;
        }
        VcCrdIssLmt other = (VcCrdIssLmt) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VcCrdIssLmt[ acctNbr=" + acctNbr + " ]";
    }

}
