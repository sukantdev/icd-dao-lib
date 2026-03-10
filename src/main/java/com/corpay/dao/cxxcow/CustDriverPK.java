/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class CustDriverPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DRVR_CUST_ID")
    private String drvrCustId;
    @Basic(optional = false)
    @Column(name = "DRVR_ID")
    private String drvrId;

    public CustDriverPK() {
    }

    public CustDriverPK(String drvrCustId, String drvrId) {
        this.drvrCustId = drvrCustId;
        this.drvrId = drvrId;
    }

    public String getDrvrCustId() {
        return drvrCustId;
    }

    public void setDrvrCustId(String drvrCustId) {
        this.drvrCustId = drvrCustId;
    }

    public String getDrvrId() {
        return drvrId;
    }

    public void setDrvrId(String drvrId) {
        this.drvrId = drvrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (drvrCustId != null ? drvrCustId.hashCode() : 0);
        hash += (drvrId != null ? drvrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustDriverPK)) {
            return false;
        }
        CustDriverPK other = (CustDriverPK) object;
        if ((this.drvrCustId == null && other.drvrCustId != null) || (this.drvrCustId != null && !this.drvrCustId.equals(other.drvrCustId))) {
            return false;
        }
        if ((this.drvrId == null && other.drvrId != null) || (this.drvrId != null && !this.drvrId.equals(other.drvrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.CustDriverPK[ drvrCustId=" + drvrCustId + ", drvrId=" + drvrId + " ]";
    }
    
}
