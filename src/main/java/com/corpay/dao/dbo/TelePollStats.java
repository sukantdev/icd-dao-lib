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
@Table(name = "TELE_POLL_STATS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "TelePollStats.findAll", query = "SELECT t FROM TelePollStats t")})
public class TelePollStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TelePollStatsPK telePollStatsPK;
    @Basic(optional = false)
    @Column(name = "CMPLTD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpltdTs;
    @Basic(optional = false)
    @Column(name = "SUCCESSFUL_CNT")
    private int successfulCnt;
    @Basic(optional = false)
    @Column(name = "FAILED_CNT")
    private int failedCnt;
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

    public TelePollStats() {
    }

    public TelePollStats(TelePollStatsPK telePollStatsPK) {
        this.telePollStatsPK = telePollStatsPK;
    }

    public TelePollStats(TelePollStatsPK telePollStatsPK, Date cmpltdTs, int successfulCnt, int failedCnt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.telePollStatsPK = telePollStatsPK;
        this.cmpltdTs = cmpltdTs;
        this.successfulCnt = successfulCnt;
        this.failedCnt = failedCnt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public TelePollStats(String providerId, Date startTs) {
        this.telePollStatsPK = new TelePollStatsPK(providerId, startTs);
    }

    public TelePollStatsPK getTelePollStatsPK() {
        return telePollStatsPK;
    }

    public void setTelePollStatsPK(TelePollStatsPK telePollStatsPK) {
        this.telePollStatsPK = telePollStatsPK;
    }

    public Date getCmpltdTs() {
        return cmpltdTs;
    }

    public void setCmpltdTs(Date cmpltdTs) {
        this.cmpltdTs = cmpltdTs;
    }

    public int getSuccessfulCnt() {
        return successfulCnt;
    }

    public void setSuccessfulCnt(int successfulCnt) {
        this.successfulCnt = successfulCnt;
    }

    public int getFailedCnt() {
        return failedCnt;
    }

    public void setFailedCnt(int failedCnt) {
        this.failedCnt = failedCnt;
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
        hash += (telePollStatsPK != null ? telePollStatsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelePollStats)) {
            return false;
        }
        TelePollStats other = (TelePollStats) object;
        if ((this.telePollStatsPK == null && other.telePollStatsPK != null) || (this.telePollStatsPK != null && !this.telePollStatsPK.equals(other.telePollStatsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePollStats[ telePollStatsPK=" + telePollStatsPK + " ]";
    }
    
}
