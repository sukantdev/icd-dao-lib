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
@Table(name = "FN_2IN1_ACCT_XREF", catalog = "", schema = "DBO")
public class Fn2in1AcctXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "FN_ACCT_NBR")
    private long fnAcctNbr;
    @Basic(optional = false)
    @Column(name = "FN_PROFILE_ID")
    private long fnProfileId;
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
    @Column(name = "SYS_ACCT_ID")
    private String sysAcctId;

    public Fn2in1AcctXref() {
    }

    public Fn2in1AcctXref(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public Fn2in1AcctXref(String acctNbr, long fnAcctNbr, long fnProfileId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String sysAcctId) {
        this.acctNbr = acctNbr;
        this.fnAcctNbr = fnAcctNbr;
        this.fnProfileId = fnProfileId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.sysAcctId = sysAcctId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public long getFnAcctNbr() {
        return fnAcctNbr;
    }

    public void setFnAcctNbr(long fnAcctNbr) {
        this.fnAcctNbr = fnAcctNbr;
    }

    public long getFnProfileId() {
        return fnProfileId;
    }

    public void setFnProfileId(long fnProfileId) {
        this.fnProfileId = fnProfileId;
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

    public String getSysAcctId() {
        return sysAcctId;
    }

    public void setSysAcctId(String sysAcctId) {
        this.sysAcctId = sysAcctId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Fn2in1AcctXref)) {
            return false;
        }
        Fn2in1AcctXref other = (Fn2in1AcctXref) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Fn2in1AcctXref[ acctNbr=" + acctNbr + " ]";
    }

}
