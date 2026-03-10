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
public class FaNetworkLocPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NETWORK_ID")
    private long networkId;
    @Basic(optional = false)
    @Column(name = "LOC_ID")
    private String locId;

    public FaNetworkLocPK() {
    }

    public FaNetworkLocPK(long networkId, String locId) {
        this.networkId = networkId;
        this.locId = locId;
    }

    public long getNetworkId() {
        return networkId;
    }

    public void setNetworkId(long networkId) {
        this.networkId = networkId;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) networkId;
        hash += (locId != null ? locId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaNetworkLocPK)) {
            return false;
        }
        FaNetworkLocPK other = (FaNetworkLocPK) object;
        if (this.networkId != other.networkId) {
            return false;
        }
        if ((this.locId == null && other.locId != null) || (this.locId != null && !this.locId.equals(other.locId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaNetworkLocPK[ networkId=" + networkId + ", locId=" + locId + " ]";
    }
    
}
