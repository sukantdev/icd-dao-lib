package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "ALERTS", catalog = "", schema = "DBO")
public class Alerts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ALERT_ID")
    private Long alertId;
    @Basic(optional = false)
    @Column(name = "UPPER_LIMIT")
    private double upperLimit;
    @Basic(optional = false)
    @Column(name = "LOWER_LIMIT")
    private double lowerLimit;
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;
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
    @JoinColumn(name = "ALERT_METHOD_ID", referencedColumnName = "ALERT_METHOD_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private AlertMethods alertMethodId;
    @JoinColumn(name = "ALERT_TYPE_ID", referencedColumnName = "ALERT_TYPE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private AlertTypes alertTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alerts", fetch = FetchType.LAZY)
    private Set<AlertCusts> alertCustsSet;

    public Alerts() {
    }

    public Alerts(Long alertId) {
        this.alertId = alertId;
    }

    public Alerts(Long alertId, double upperLimit, double lowerLimit, String userId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.alertId = alertId;
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
        this.userId = userId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getAlertId() {
        return alertId;
    }

    public void setAlertId(Long alertId) {
        this.alertId = alertId;
    }

    public double getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(double upperLimit) {
        this.upperLimit = upperLimit;
    }

    public double getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(double lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public AlertMethods getAlertMethodId() {
        return alertMethodId;
    }

    public void setAlertMethodId(AlertMethods alertMethodId) {
        this.alertMethodId = alertMethodId;
    }

    public AlertTypes getAlertTypeId() {
        return alertTypeId;
    }

    public void setAlertTypeId(AlertTypes alertTypeId) {
        this.alertTypeId = alertTypeId;
    }

    public Set<AlertCusts> getAlertCustsSet() {
        return alertCustsSet;
    }

    public void setAlertCustsSet(Set<AlertCusts> alertCustsSet) {
        this.alertCustsSet = alertCustsSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alertId != null ? alertId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Alerts)) {
            return false;
        }
        Alerts other = (Alerts) object;
        if ((this.alertId == null && other.alertId != null) || (this.alertId != null && !this.alertId.equals(other.alertId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Alerts[ alertId=" + alertId + " ]";
    }

}
