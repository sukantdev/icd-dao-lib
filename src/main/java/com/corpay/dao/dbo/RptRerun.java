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
@Table(name = "RPT_RERUN", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RptRerun.findAll", query = "SELECT r FROM RptRerun r")})
public class RptRerun implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RptRerunPK rptRerunPK;
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

    public RptRerun() {
    }

    public RptRerun(RptRerunPK rptRerunPK) {
        this.rptRerunPK = rptRerunPK;
    }

    public RptRerun(RptRerunPK rptRerunPK, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.rptRerunPK = rptRerunPK;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
    }

    public RptRerun(String runId, Date runDt, String applId) {
        this.rptRerunPK = new RptRerunPK(runId, runDt, applId);
    }

    public RptRerunPK getRptRerunPK() {
        return rptRerunPK;
    }

    public void setRptRerunPK(RptRerunPK rptRerunPK) {
        this.rptRerunPK = rptRerunPK;
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
        hash += (rptRerunPK != null ? rptRerunPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RptRerun)) {
            return false;
        }
        RptRerun other = (RptRerun) object;
        if ((this.rptRerunPK == null && other.rptRerunPK != null) || (this.rptRerunPK != null && !this.rptRerunPK.equals(other.rptRerunPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RptRerun[ rptRerunPK=" + rptRerunPK + " ]";
    }
    
}
