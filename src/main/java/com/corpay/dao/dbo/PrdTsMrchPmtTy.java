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
@Table(name = "PRD_TS_MRCH_PMT_TY", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdTsMrchPmtTy.findAll", query = "SELECT p FROM PrdTsMrchPmtTy p")})
public class PrdTsMrchPmtTy implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdTsMrchPmtTyPK prdTsMrchPmtTyPK;
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

    public PrdTsMrchPmtTy() {
    }

    public PrdTsMrchPmtTy(PrdTsMrchPmtTyPK prdTsMrchPmtTyPK) {
        this.prdTsMrchPmtTyPK = prdTsMrchPmtTyPK;
    }

    public PrdTsMrchPmtTy(PrdTsMrchPmtTyPK prdTsMrchPmtTyPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdTsMrchPmtTyPK = prdTsMrchPmtTyPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdTsMrchPmtTy(String applNbr, String pmtTyp) {
        this.prdTsMrchPmtTyPK = new PrdTsMrchPmtTyPK(applNbr, pmtTyp);
    }

    public PrdTsMrchPmtTyPK getPrdTsMrchPmtTyPK() {
        return prdTsMrchPmtTyPK;
    }

    public void setPrdTsMrchPmtTyPK(PrdTsMrchPmtTyPK prdTsMrchPmtTyPK) {
        this.prdTsMrchPmtTyPK = prdTsMrchPmtTyPK;
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
        hash += (prdTsMrchPmtTyPK != null ? prdTsMrchPmtTyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdTsMrchPmtTy)) {
            return false;
        }
        PrdTsMrchPmtTy other = (PrdTsMrchPmtTy) object;
        if ((this.prdTsMrchPmtTyPK == null && other.prdTsMrchPmtTyPK != null) || (this.prdTsMrchPmtTyPK != null && !this.prdTsMrchPmtTyPK.equals(other.prdTsMrchPmtTyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTsMrchPmtTy[ prdTsMrchPmtTyPK=" + prdTsMrchPmtTyPK + " ]";
    }
    
}
