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
@Table(name = "EXC_TRKG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ExcTrkg.findAll", query = "SELECT e FROM ExcTrkg e")})
public class ExcTrkg implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExcTrkgPK excTrkgPK;
    @Basic(optional = false)
    @Column(name = "CUST_STAT")
    private String custStat;
    @Basic(optional = false)
    @Column(name = "CDN_STAT")
    private String cdnStat;
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

    public ExcTrkg() {
    }

    public ExcTrkg(ExcTrkgPK excTrkgPK) {
        this.excTrkgPK = excTrkgPK;
    }

    public ExcTrkg(ExcTrkgPK excTrkgPK, String custStat, String cdnStat, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.excTrkgPK = excTrkgPK;
        this.custStat = custStat;
        this.cdnStat = cdnStat;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ExcTrkg(Date pstdDt, int trnsId) {
        this.excTrkgPK = new ExcTrkgPK(pstdDt, trnsId);
    }

    public ExcTrkgPK getExcTrkgPK() {
        return excTrkgPK;
    }

    public void setExcTrkgPK(ExcTrkgPK excTrkgPK) {
        this.excTrkgPK = excTrkgPK;
    }

    public String getCustStat() {
        return custStat;
    }

    public void setCustStat(String custStat) {
        this.custStat = custStat;
    }

    public String getCdnStat() {
        return cdnStat;
    }

    public void setCdnStat(String cdnStat) {
        this.cdnStat = cdnStat;
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
        hash += (excTrkgPK != null ? excTrkgPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExcTrkg)) {
            return false;
        }
        ExcTrkg other = (ExcTrkg) object;
        if ((this.excTrkgPK == null && other.excTrkgPK != null) || (this.excTrkgPK != null && !this.excTrkgPK.equals(other.excTrkgPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ExcTrkg[ excTrkgPK=" + excTrkgPK + " ]";
    }
    
}
