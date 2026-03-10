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
@Table(name = "CR_APPL_PRD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrApplPrd.findAll", query = "SELECT c FROM CrApplPrd c")})
public class CrApplPrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplPrdPK crApplPrdPK;
    @Basic(optional = false)
    @Column(name = "PRD")
    private String prd;
    @Basic(optional = false)
    @Column(name = "WKLY_PRJTD_SPEND")
    private int wklyPrjtdSpend;
    @Basic(optional = false)
    @Column(name = "BLNG_CYC")
    private String blngCyc;
    @Basic(optional = false)
    @Column(name = "TERMS")
    private String terms;
    @Basic(optional = false)
    @Column(name = "PMT_FREQ")
    private String pmtFreq;
    @Basic(optional = false)
    @Column(name = "PMT_METHOD")
    private String pmtMethod;
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

    public CrApplPrd() {
    }

    public CrApplPrd(CrApplPrdPK crApplPrdPK) {
        this.crApplPrdPK = crApplPrdPK;
    }

    public CrApplPrd(CrApplPrdPK crApplPrdPK, String prd, int wklyPrjtdSpend, String blngCyc, String terms, String pmtFreq, String pmtMethod, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crApplPrdPK = crApplPrdPK;
        this.prd = prd;
        this.wklyPrjtdSpend = wklyPrjtdSpend;
        this.blngCyc = blngCyc;
        this.terms = terms;
        this.pmtFreq = pmtFreq;
        this.pmtMethod = pmtMethod;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrApplPrd(String applNbr, short seqNbr) {
        this.crApplPrdPK = new CrApplPrdPK(applNbr, seqNbr);
    }

    public CrApplPrdPK getCrApplPrdPK() {
        return crApplPrdPK;
    }

    public void setCrApplPrdPK(CrApplPrdPK crApplPrdPK) {
        this.crApplPrdPK = crApplPrdPK;
    }

    public String getPrd() {
        return prd;
    }

    public void setPrd(String prd) {
        this.prd = prd;
    }

    public int getWklyPrjtdSpend() {
        return wklyPrjtdSpend;
    }

    public void setWklyPrjtdSpend(int wklyPrjtdSpend) {
        this.wklyPrjtdSpend = wklyPrjtdSpend;
    }

    public String getBlngCyc() {
        return blngCyc;
    }

    public void setBlngCyc(String blngCyc) {
        this.blngCyc = blngCyc;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getPmtFreq() {
        return pmtFreq;
    }

    public void setPmtFreq(String pmtFreq) {
        this.pmtFreq = pmtFreq;
    }

    public String getPmtMethod() {
        return pmtMethod;
    }

    public void setPmtMethod(String pmtMethod) {
        this.pmtMethod = pmtMethod;
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
        hash += (crApplPrdPK != null ? crApplPrdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrApplPrd)) {
            return false;
        }
        CrApplPrd other = (CrApplPrd) object;
        if ((this.crApplPrdPK == null && other.crApplPrdPK != null) || (this.crApplPrdPK != null && !this.crApplPrdPK.equals(other.crApplPrdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplPrd[ crApplPrdPK=" + crApplPrdPK + " ]";
    }
    
}
