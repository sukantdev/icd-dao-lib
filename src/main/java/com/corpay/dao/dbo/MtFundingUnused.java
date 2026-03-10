/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MT_FUNDING_UNUSED", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MtFundingUnused.findAll", query = "SELECT m FROM MtFundingUnused m")})
public class MtFundingUnused implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CRD_LOADED_TDY")
    private BigDecimal crdLoadedTdy;
    @Basic(optional = false)
    @Column(name = "CRD_LOADED_WTD")
    private BigDecimal crdLoadedWtd;
    @Basic(optional = false)
    @Column(name = "UNUSED_CRD_AMT")
    private BigDecimal unusedCrdAmt;
    @Basic(optional = false)
    @Column(name = "CRD_LOADED_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdLoadedTs;
    @Basic(optional = false)
    @Column(name = "UNUSED_CRD_UPD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date unusedCrdUpdTs;
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
    @Column(name = "WTD_RESET_DT")
    @Temporal(TemporalType.DATE)
    private Date wtdResetDt;

    public MtFundingUnused() {
    }

    public MtFundingUnused(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public MtFundingUnused(String acctNbr, BigDecimal crdLoadedTdy, BigDecimal crdLoadedWtd, BigDecimal unusedCrdAmt, Date crdLoadedTs, Date unusedCrdUpdTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Date wtdResetDt) {
        this.acctNbr = acctNbr;
        this.crdLoadedTdy = crdLoadedTdy;
        this.crdLoadedWtd = crdLoadedWtd;
        this.unusedCrdAmt = unusedCrdAmt;
        this.crdLoadedTs = crdLoadedTs;
        this.unusedCrdUpdTs = unusedCrdUpdTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.wtdResetDt = wtdResetDt;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public BigDecimal getCrdLoadedTdy() {
        return crdLoadedTdy;
    }

    public void setCrdLoadedTdy(BigDecimal crdLoadedTdy) {
        this.crdLoadedTdy = crdLoadedTdy;
    }

    public BigDecimal getCrdLoadedWtd() {
        return crdLoadedWtd;
    }

    public void setCrdLoadedWtd(BigDecimal crdLoadedWtd) {
        this.crdLoadedWtd = crdLoadedWtd;
    }

    public BigDecimal getUnusedCrdAmt() {
        return unusedCrdAmt;
    }

    public void setUnusedCrdAmt(BigDecimal unusedCrdAmt) {
        this.unusedCrdAmt = unusedCrdAmt;
    }

    public Date getCrdLoadedTs() {
        return crdLoadedTs;
    }

    public void setCrdLoadedTs(Date crdLoadedTs) {
        this.crdLoadedTs = crdLoadedTs;
    }

    public Date getUnusedCrdUpdTs() {
        return unusedCrdUpdTs;
    }

    public void setUnusedCrdUpdTs(Date unusedCrdUpdTs) {
        this.unusedCrdUpdTs = unusedCrdUpdTs;
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

    public Date getWtdResetDt() {
        return wtdResetDt;
    }

    public void setWtdResetDt(Date wtdResetDt) {
        this.wtdResetDt = wtdResetDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtFundingUnused)) {
            return false;
        }
        MtFundingUnused other = (MtFundingUnused) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MtFundingUnused[ acctNbr=" + acctNbr + " ]";
    }
    
}
