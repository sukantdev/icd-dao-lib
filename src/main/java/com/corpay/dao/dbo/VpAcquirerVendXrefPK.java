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
public class VpAcquirerVendXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "VEND_MASTER_ID")
    private String vendMasterId;
    @Basic(optional = false)
    @Column(name = "ACQUIRER_ID")
    private String acquirerId;

    public VpAcquirerVendXrefPK() {
    }

    public VpAcquirerVendXrefPK(String vendMasterId, String acquirerId) {
        this.vendMasterId = vendMasterId;
        this.acquirerId = acquirerId;
    }

    public String getVendMasterId() {
        return vendMasterId;
    }

    public void setVendMasterId(String vendMasterId) {
        this.vendMasterId = vendMasterId;
    }

    public String getAcquirerId() {
        return acquirerId;
    }

    public void setAcquirerId(String acquirerId) {
        this.acquirerId = acquirerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendMasterId != null ? vendMasterId.hashCode() : 0);
        hash += (acquirerId != null ? acquirerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpAcquirerVendXrefPK)) {
            return false;
        }
        VpAcquirerVendXrefPK other = (VpAcquirerVendXrefPK) object;
        if ((this.vendMasterId == null && other.vendMasterId != null) || (this.vendMasterId != null && !this.vendMasterId.equals(other.vendMasterId))) {
            return false;
        }
        if ((this.acquirerId == null && other.acquirerId != null) || (this.acquirerId != null && !this.acquirerId.equals(other.acquirerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpAcquirerVendXrefPK[ vendMasterId=" + vendMasterId + ", acquirerId=" + acquirerId + " ]";
    }
    
}
