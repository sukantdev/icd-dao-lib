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
@Table(name = "ACCT_PROFILE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "AcctProfile.findAll", query = "SELECT a FROM AcctProfile a")})
public class AcctProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ANNUAL_REVENUE")
    private BigDecimal annualRevenue;
    @Basic(optional = false)
    @Column(name = "EFFECTIVE_YEAR")
    private short effectiveYear;
    @Basic(optional = false)
    @Column(name = "TOTAL_VENDORS")
    private int totalVendors;
    @Basic(optional = false)
    @Column(name = "LAST_UPDT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdtTs;
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
    @Column(name = "TOTAL_AP_SPEND")
    private BigDecimal totalApSpend;

    public AcctProfile() {
    }

    public AcctProfile(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public AcctProfile(String acctNbr, String custId, BigDecimal annualRevenue, short effectiveYear, int totalVendors, Date lastUpdtTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, BigDecimal totalApSpend) {
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.annualRevenue = annualRevenue;
        this.effectiveYear = effectiveYear;
        this.totalVendors = totalVendors;
        this.lastUpdtTs = lastUpdtTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.totalApSpend = totalApSpend;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public short getEffectiveYear() {
        return effectiveYear;
    }

    public void setEffectiveYear(short effectiveYear) {
        this.effectiveYear = effectiveYear;
    }

    public int getTotalVendors() {
        return totalVendors;
    }

    public void setTotalVendors(int totalVendors) {
        this.totalVendors = totalVendors;
    }

    public Date getLastUpdtTs() {
        return lastUpdtTs;
    }

    public void setLastUpdtTs(Date lastUpdtTs) {
        this.lastUpdtTs = lastUpdtTs;
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

    public BigDecimal getTotalApSpend() {
        return totalApSpend;
    }

    public void setTotalApSpend(BigDecimal totalApSpend) {
        this.totalApSpend = totalApSpend;
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
        if (!(object instanceof AcctProfile)) {
            return false;
        }
        AcctProfile other = (AcctProfile) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctProfile[ acctNbr=" + acctNbr + " ]";
    }
    
}
