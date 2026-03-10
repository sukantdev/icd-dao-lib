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
@Table(name = "PRD_PRMT_LINK", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdPrmtLink.findAll", query = "SELECT p FROM PrdPrmtLink p")})
public class PrdPrmtLink implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CMBND_MTHLY_TL")
    private BigDecimal cmbndMthlyTl;
    @Basic(optional = false)
    @Column(name = "PRMT_ACCT_NBRS")
    private String prmtAcctNbrs;
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

    public PrdPrmtLink() {
    }

    public PrdPrmtLink(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdPrmtLink(String applNbr, BigDecimal cmbndMthlyTl, String prmtAcctNbrs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.cmbndMthlyTl = cmbndMthlyTl;
        this.prmtAcctNbrs = prmtAcctNbrs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public BigDecimal getCmbndMthlyTl() {
        return cmbndMthlyTl;
    }

    public void setCmbndMthlyTl(BigDecimal cmbndMthlyTl) {
        this.cmbndMthlyTl = cmbndMthlyTl;
    }

    public String getPrmtAcctNbrs() {
        return prmtAcctNbrs;
    }

    public void setPrmtAcctNbrs(String prmtAcctNbrs) {
        this.prmtAcctNbrs = prmtAcctNbrs;
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
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdPrmtLink)) {
            return false;
        }
        PrdPrmtLink other = (PrdPrmtLink) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdPrmtLink[ applNbr=" + applNbr + " ]";
    }
    
}
