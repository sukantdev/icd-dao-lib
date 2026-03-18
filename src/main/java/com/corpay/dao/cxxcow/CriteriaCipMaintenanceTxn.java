package com.corpay.dao.cxxcow;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "CRITERIA_CIP_MAINTENANCE_TXN", catalog = "", schema = "CXXCOW")
public class CriteriaCipMaintenanceTxn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TXN_ID")
    private Integer txnId;
    @Basic(optional = false)
    @Column(name = "CRITERIA_ID")
    private int criteriaId;
    @Basic(optional = false)
    @Column(name = "ACCT_NM")
    private String acctNm;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "CRITERIA_CIP_CHK")
    private int criteriaCipChk;
    @Column(name = "SSN")
    private String ssn;
    @Column(name = "DL_NBR")
    private String dlNbr;
    @Column(name = "PASSPORT_NBR")
    private String passportNbr;
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

    public CriteriaCipMaintenanceTxn() {
    }

    public CriteriaCipMaintenanceTxn(Integer txnId) {
        this.txnId = txnId;
    }

    public CriteriaCipMaintenanceTxn(Integer txnId, int criteriaId, String acctNm, String acctCd, int criteriaCipChk, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.txnId = txnId;
        this.criteriaId = criteriaId;
        this.acctNm = acctNm;
        this.acctCd = acctCd;
        this.criteriaCipChk = criteriaCipChk;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getTxnId() {
        return txnId;
    }

    public void setTxnId(Integer txnId) {
        this.txnId = txnId;
    }

    public int getCriteriaId() {
        return criteriaId;
    }

    public void setCriteriaId(int criteriaId) {
        this.criteriaId = criteriaId;
    }

    public String getAcctNm() {
        return acctNm;
    }

    public void setAcctNm(String acctNm) {
        this.acctNm = acctNm;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public int getCriteriaCipChk() {
        return criteriaCipChk;
    }

    public void setCriteriaCipChk(int criteriaCipChk) {
        this.criteriaCipChk = criteriaCipChk;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDlNbr() {
        return dlNbr;
    }

    public void setDlNbr(String dlNbr) {
        this.dlNbr = dlNbr;
    }

    public String getPassportNbr() {
        return passportNbr;
    }

    public void setPassportNbr(String passportNbr) {
        this.passportNbr = passportNbr;
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
        hash += (txnId != null ? txnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CriteriaCipMaintenanceTxn)) {
            return false;
        }
        CriteriaCipMaintenanceTxn other = (CriteriaCipMaintenanceTxn) object;
        if ((this.txnId == null && other.txnId != null) || (this.txnId != null && !this.txnId.equals(other.txnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.CriteriaCipMaintenanceTxn[ txnId=" + txnId + " ]";
    }

}
