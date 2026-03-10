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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PRD_CABCARD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdCabcard.findAll", query = "SELECT p FROM PrdCabcard p")})
public class PrdCabcard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CAB_CRD_TYP")
    private Character cabCrdTyp;
    @Basic(optional = false)
    @Column(name = "FUND_OPTION")
    private Character fundOption;
    @Basic(optional = false)
    @Column(name = "QLCM_ACCT_NBR")
    private String qlcmAcctNbr;
    @Basic(optional = false)
    @Column(name = "AUXRLY_ACCT_NBR")
    private String auxrlyAcctNbr;
    @Basic(optional = false)
    @Column(name = "DVC_ID_NBR")
    private String dvcIdNbr;
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

    public PrdCabcard() {
    }

    public PrdCabcard(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdCabcard(String applNbr, Character cabCrdTyp, Character fundOption, String qlcmAcctNbr, String auxrlyAcctNbr, String dvcIdNbr, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.applNbr = applNbr;
        this.cabCrdTyp = cabCrdTyp;
        this.fundOption = fundOption;
        this.qlcmAcctNbr = qlcmAcctNbr;
        this.auxrlyAcctNbr = auxrlyAcctNbr;
        this.dvcIdNbr = dvcIdNbr;
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

    public Character getCabCrdTyp() {
        return cabCrdTyp;
    }

    public void setCabCrdTyp(Character cabCrdTyp) {
        this.cabCrdTyp = cabCrdTyp;
    }

    public Character getFundOption() {
        return fundOption;
    }

    public void setFundOption(Character fundOption) {
        this.fundOption = fundOption;
    }

    public String getQlcmAcctNbr() {
        return qlcmAcctNbr;
    }

    public void setQlcmAcctNbr(String qlcmAcctNbr) {
        this.qlcmAcctNbr = qlcmAcctNbr;
    }

    public String getAuxrlyAcctNbr() {
        return auxrlyAcctNbr;
    }

    public void setAuxrlyAcctNbr(String auxrlyAcctNbr) {
        this.auxrlyAcctNbr = auxrlyAcctNbr;
    }

    public String getDvcIdNbr() {
        return dvcIdNbr;
    }

    public void setDvcIdNbr(String dvcIdNbr) {
        this.dvcIdNbr = dvcIdNbr;
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
        if (!(object instanceof PrdCabcard)) {
            return false;
        }
        PrdCabcard other = (PrdCabcard) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdCabcard[ applNbr=" + applNbr + " ]";
    }
    
}
