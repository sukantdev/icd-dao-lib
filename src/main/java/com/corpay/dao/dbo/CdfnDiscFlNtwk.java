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
@Table(name = "CDFN_DISC_FL_NTWK", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CdfnDiscFlNtwk.findAll", query = "SELECT c FROM CdfnDiscFlNtwk c")})
public class CdfnDiscFlNtwk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "FEE_MTHD")
    private Character feeMthd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "FUND_OPTION")
    private BigDecimal fundOption;
    @Basic(optional = false)
    @Column(name = "NBR_TRUCKS")
    private short nbrTrucks;
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
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public CdfnDiscFlNtwk() {
    }

    public CdfnDiscFlNtwk(String applNbr) {
        this.applNbr = applNbr;
    }

    public CdfnDiscFlNtwk(String applNbr, Character feeMthd, BigDecimal fundOption, short nbrTrucks, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.applNbr = applNbr;
        this.feeMthd = feeMthd;
        this.fundOption = fundOption;
        this.nbrTrucks = nbrTrucks;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public Character getFeeMthd() {
        return feeMthd;
    }

    public void setFeeMthd(Character feeMthd) {
        this.feeMthd = feeMthd;
    }

    public BigDecimal getFundOption() {
        return fundOption;
    }

    public void setFundOption(BigDecimal fundOption) {
        this.fundOption = fundOption;
    }

    public short getNbrTrucks() {
        return nbrTrucks;
    }

    public void setNbrTrucks(short nbrTrucks) {
        this.nbrTrucks = nbrTrucks;
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

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
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
        if (!(object instanceof CdfnDiscFlNtwk)) {
            return false;
        }
        CdfnDiscFlNtwk other = (CdfnDiscFlNtwk) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CdfnDiscFlNtwk[ applNbr=" + applNbr + " ]";
    }
    
}
