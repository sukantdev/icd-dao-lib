/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CRITERIA_CIP_MAINTENANCE_TXN", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findAll", query = "SELECT c FROM CriteriaCipMaintenanceTxn c"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findByTxnId", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.txnId = :txnId"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findByCriteriaId", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.criteriaId = :criteriaId"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findByAcctNm", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.acctNm = :acctNm"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findByAcctCd", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.acctCd = :acctCd"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findByCriteriaCipChk", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.criteriaCipChk = :criteriaCipChk"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findBySsn", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.ssn = :ssn"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findByDlNbr", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.dlNbr = :dlNbr"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findByPassportNbr", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.passportNbr = :passportNbr"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findByCrtTs", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.crtTs = :crtTs"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findByCrtUsr", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.crtUsr = :crtUsr"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findByMdyTs", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.mdyTs = :mdyTs"),
    @NamedQuery(name = "CriteriaCipMaintenanceTxn.findByMdyUsr", query = "SELECT c FROM CriteriaCipMaintenanceTxn c WHERE c.mdyUsr = :mdyUsr")})
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
