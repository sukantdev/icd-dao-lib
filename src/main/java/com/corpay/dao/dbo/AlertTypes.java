package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "ALERT_TYPES", catalog = "", schema = "DBO")
public class AlertTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ALERT_TYPE_ID")
    private Long alertTypeId;
    @Basic(optional = false)
    @Column(name = "ALERT_NAME")
    private String alertName;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alertTypeId", fetch = FetchType.LAZY)
    private Set<Alerts> alertsSet;

    public AlertTypes() {
    }

    public AlertTypes(Long alertTypeId) {
        this.alertTypeId = alertTypeId;
    }

    public AlertTypes(Long alertTypeId, String alertName, String alertDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.alertTypeId = alertTypeId;
        this.alertName = alertName;
        this.alertDesc = alertDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getAlertTypeId() {
        return alertTypeId;
    }

    public void setAlertTypeId(Long alertTypeId) {
        this.alertTypeId = alertTypeId;
    }

    public String getAlertName() {
        return alertName;
    }

    public void setAlertName(String alertName) {
        this.alertName = alertName;
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
        hash += (alertTypeId != null ? alertTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AlertTypes)) {
            return false;
        }
        AlertTypes other = (AlertTypes) object;
        if ((this.alertTypeId == null && other.alertTypeId != null) || (this.alertTypeId != null && !this.alertTypeId.equals(other.alertTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AlertTypes[ alertTypeId=" + alertTypeId + " ]";
    }

}
