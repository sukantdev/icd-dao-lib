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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "ACCT_RMRP_RPTS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "AcctRmrpRpts.findAll", query = "SELECT a FROM AcctRmrpRpts a")})
public class AcctRmrpRpts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcctRmrpRptsPK acctRmrpRptsPK;
    @Basic(optional = false)
    @Column(name = "ACCT_STAT_CD")
    private Character acctStatCd;
    @Basic(optional = false)
    @Column(name = "ACCT_NM")
    private String acctNm;
    @Basic(optional = false)
    @Column(name = "RPT_STYLE_CD")
    private String rptStyleCd;
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

    public AcctRmrpRpts() {
    }

    public AcctRmrpRpts(AcctRmrpRptsPK acctRmrpRptsPK) {
        this.acctRmrpRptsPK = acctRmrpRptsPK;
    }

    public AcctRmrpRpts(AcctRmrpRptsPK acctRmrpRptsPK, Character acctStatCd, String acctNm, String rptStyleCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.acctRmrpRptsPK = acctRmrpRptsPK;
        this.acctStatCd = acctStatCd;
        this.acctNm = acctNm;
        this.rptStyleCd = rptStyleCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AcctRmrpRpts(String acctNbr, String custId, String rptSysCd, String rptCd) {
        this.acctRmrpRptsPK = new AcctRmrpRptsPK(acctNbr, custId, rptSysCd, rptCd);
    }

    public AcctRmrpRptsPK getAcctRmrpRptsPK() {
        return acctRmrpRptsPK;
    }

    public void setAcctRmrpRptsPK(AcctRmrpRptsPK acctRmrpRptsPK) {
        this.acctRmrpRptsPK = acctRmrpRptsPK;
    }

    public Character getAcctStatCd() {
        return acctStatCd;
    }

    public void setAcctStatCd(Character acctStatCd) {
        this.acctStatCd = acctStatCd;
    }

    public String getAcctNm() {
        return acctNm;
    }

    public void setAcctNm(String acctNm) {
        this.acctNm = acctNm;
    }

    public String getRptStyleCd() {
        return rptStyleCd;
    }

    public void setRptStyleCd(String rptStyleCd) {
        this.rptStyleCd = rptStyleCd;
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
        hash += (acctRmrpRptsPK != null ? acctRmrpRptsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctRmrpRpts)) {
            return false;
        }
        AcctRmrpRpts other = (AcctRmrpRpts) object;
        if ((this.acctRmrpRptsPK == null && other.acctRmrpRptsPK != null) || (this.acctRmrpRptsPK != null && !this.acctRmrpRptsPK.equals(other.acctRmrpRptsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctRmrpRpts[ acctRmrpRptsPK=" + acctRmrpRptsPK + " ]";
    }
    
}
