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
@Table(name = "APPLICATION_SERVICE_LIMIT_TYPES", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ApplicationServiceLimitTypes.findAll", query = "SELECT a FROM ApplicationServiceLimitTypes a")})
public class ApplicationServiceLimitTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApplicationServiceLimitTypesPK applicationServiceLimitTypesPK;
    @Basic(optional = false)
    @Column(name = "LIMIT_AMT")
    private int limitAmt;
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
    @Column(name = "INTERVAL")
    private String interval;
    @Basic(optional = false)
    @Column(name = "DURATION")
    private short duration;

    public ApplicationServiceLimitTypes() {
    }

    public ApplicationServiceLimitTypes(ApplicationServiceLimitTypesPK applicationServiceLimitTypesPK) {
        this.applicationServiceLimitTypesPK = applicationServiceLimitTypesPK;
    }

    public ApplicationServiceLimitTypes(ApplicationServiceLimitTypesPK applicationServiceLimitTypesPK, int limitAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String interval, short duration) {
        this.applicationServiceLimitTypesPK = applicationServiceLimitTypesPK;
        this.limitAmt = limitAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.interval = interval;
        this.duration = duration;
    }

    public ApplicationServiceLimitTypes(String applicationDesc, String limitTypeDesc, String identifierTypeCd) {
        this.applicationServiceLimitTypesPK = new ApplicationServiceLimitTypesPK(applicationDesc, limitTypeDesc, identifierTypeCd);
    }

    public ApplicationServiceLimitTypesPK getApplicationServiceLimitTypesPK() {
        return applicationServiceLimitTypesPK;
    }

    public void setApplicationServiceLimitTypesPK(ApplicationServiceLimitTypesPK applicationServiceLimitTypesPK) {
        this.applicationServiceLimitTypesPK = applicationServiceLimitTypesPK;
    }

    public int getLimitAmt() {
        return limitAmt;
    }

    public void setLimitAmt(int limitAmt) {
        this.limitAmt = limitAmt;
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

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public short getDuration() {
        return duration;
    }

    public void setDuration(short duration) {
        this.duration = duration;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applicationServiceLimitTypesPK != null ? applicationServiceLimitTypesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApplicationServiceLimitTypes)) {
            return false;
        }
        ApplicationServiceLimitTypes other = (ApplicationServiceLimitTypes) object;
        if ((this.applicationServiceLimitTypesPK == null && other.applicationServiceLimitTypesPK != null) || (this.applicationServiceLimitTypesPK != null && !this.applicationServiceLimitTypesPK.equals(other.applicationServiceLimitTypesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ApplicationServiceLimitTypes[ applicationServiceLimitTypesPK=" + applicationServiceLimitTypesPK + " ]";
    }
    
}
