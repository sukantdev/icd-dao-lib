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
@Table(name = "ACCT_ACCT_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "AcctAcctXref.findAll", query = "SELECT a FROM AcctAcctXref a")})
public class AcctAcctXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcctAcctXrefPK acctAcctXrefPK;
    @Basic(optional = false)
    @Column(name = "APPL_ID")
    private String applId;
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
    @Column(name = "LOB_CD")
    private String lobCd;

    public AcctAcctXref() {
    }

    public AcctAcctXref(AcctAcctXrefPK acctAcctXrefPK) {
        this.acctAcctXrefPK = acctAcctXrefPK;
    }

    public AcctAcctXref(AcctAcctXrefPK acctAcctXrefPK, String applId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String lobCd) {
        this.acctAcctXrefPK = acctAcctXrefPK;
        this.applId = applId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.lobCd = lobCd;
    }

    public AcctAcctXref(String aaPrntAcctCd, String aaChldAcctCd, String aaTypCd) {
        this.acctAcctXrefPK = new AcctAcctXrefPK(aaPrntAcctCd, aaChldAcctCd, aaTypCd);
    }

    public AcctAcctXrefPK getAcctAcctXrefPK() {
        return acctAcctXrefPK;
    }

    public void setAcctAcctXrefPK(AcctAcctXrefPK acctAcctXrefPK) {
        this.acctAcctXrefPK = acctAcctXrefPK;
    }

    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
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

    public String getLobCd() {
        return lobCd;
    }

    public void setLobCd(String lobCd) {
        this.lobCd = lobCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctAcctXrefPK != null ? acctAcctXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctAcctXref)) {
            return false;
        }
        AcctAcctXref other = (AcctAcctXref) object;
        if ((this.acctAcctXrefPK == null && other.acctAcctXrefPK != null) || (this.acctAcctXrefPK != null && !this.acctAcctXrefPK.equals(other.acctAcctXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctAcctXref[ acctAcctXrefPK=" + acctAcctXrefPK + " ]";
    }
    
}
