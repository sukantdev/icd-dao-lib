package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ALERT_CUSTS", catalog = "", schema = "DBO")
public class AlertCusts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AlertCustsPK alertCustsPK;
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
    @JoinColumn(name = "ALERT_ID", referencedColumnName = "ALERT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Alerts alerts;
    @JoinColumn(name = "CUST_ID", referencedColumnName = "CUST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Custs custs;

    public AlertCusts() {
    }

    public AlertCusts(AlertCustsPK alertCustsPK) {
        this.alertCustsPK = alertCustsPK;
    }

    public AlertCusts(AlertCustsPK alertCustsPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.alertCustsPK = alertCustsPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AlertCusts(long alertId, String custId) {
        this.alertCustsPK = new AlertCustsPK(alertId, custId);
    }

    public AlertCustsPK getAlertCustsPK() {
        return alertCustsPK;
    }

    public void setAlertCustsPK(AlertCustsPK alertCustsPK) {
        this.alertCustsPK = alertCustsPK;
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

    public Alerts getAlerts() {
        return alerts;
    }

    public void setAlerts(Alerts alerts) {
        this.alerts = alerts;
    }

    public Custs getCusts() {
        return custs;
    }

    public void setCusts(Custs custs) {
        this.custs = custs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alertCustsPK != null ? alertCustsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AlertCusts)) {
            return false;
        }
        AlertCusts other = (AlertCusts) object;
        if ((this.alertCustsPK == null && other.alertCustsPK != null) || (this.alertCustsPK != null && !this.alertCustsPK.equals(other.alertCustsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AlertCusts[ alertCustsPK=" + alertCustsPK + " ]";
    }

}
