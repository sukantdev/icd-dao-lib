/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class AlertCustsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ALERT_ID")
    private long alertId;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;

    public AlertCustsPK() {
    }

    public AlertCustsPK(long alertId, String custId) {
        this.alertId = alertId;
        this.custId = custId;
    }

    public long getAlertId() {
        return alertId;
    }

    public void setAlertId(long alertId) {
        this.alertId = alertId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) alertId;
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlertCustsPK)) {
            return false;
        }
        AlertCustsPK other = (AlertCustsPK) object;
        if (this.alertId != other.alertId) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AlertCustsPK[ alertId=" + alertId + ", custId=" + custId + " ]";
    }
    
}
