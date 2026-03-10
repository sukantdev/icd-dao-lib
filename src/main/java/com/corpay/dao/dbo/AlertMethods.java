/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "ALERT_METHODS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "AlertMethods.findAll", query = "SELECT a FROM AlertMethods a")})
public class AlertMethods implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ALERT_METHOD_ID")
    private Long alertMethodId;
    @Basic(optional = false)
    @Column(name = "ALERT_METHOD_NAME")
    private String alertMethodName;
    @Basic(optional = false)
    @Column(name = "ALERT_DESC")
    private String alertDesc;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alertMethodId", fetch = FetchType.LAZY)
    private Set<Alerts> alertsSet;

    public AlertMethods() {
    }

    public AlertMethods(Long alertMethodId) {
        this.alertMethodId = alertMethodId;
    }

    public AlertMethods(Long alertMethodId, String alertMethodName, String alertDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.alertMethodId = alertMethodId;
        this.alertMethodName = alertMethodName;
        this.alertDesc = alertDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getAlertMethodId() {
        return alertMethodId;
    }

    public void setAlertMethodId(Long alertMethodId) {
        this.alertMethodId = alertMethodId;
    }

    public String getAlertMethodName() {
        return alertMethodName;
    }

    public void setAlertMethodName(String alertMethodName) {
        this.alertMethodName = alertMethodName;
    }

    public String getAlertDesc() {
        return alertDesc;
    }

    public void setAlertDesc(String alertDesc) {
        this.alertDesc = alertDesc;
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

    public Set<Alerts> getAlertsSet() {
        return alertsSet;
    }

    public void setAlertsSet(Set<Alerts> alertsSet) {
        this.alertsSet = alertsSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alertMethodId != null ? alertMethodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlertMethods)) {
            return false;
        }
        AlertMethods other = (AlertMethods) object;
        if ((this.alertMethodId == null && other.alertMethodId != null) || (this.alertMethodId != null && !this.alertMethodId.equals(other.alertMethodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AlertMethods[ alertMethodId=" + alertMethodId + " ]";
    }
    
}
