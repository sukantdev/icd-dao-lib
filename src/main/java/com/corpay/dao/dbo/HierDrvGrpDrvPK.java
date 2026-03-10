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
public class HierDrvGrpDrvPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "DRV_GRP_ID")
    private String drvGrpId;
    @Basic(optional = false)
    @Column(name = "DRV_ID")
    private String drvId;

    public HierDrvGrpDrvPK() {
    }

    public HierDrvGrpDrvPK(String hierId, String drvGrpId, String drvId) {
        this.hierId = hierId;
        this.drvGrpId = drvGrpId;
        this.drvId = drvId;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public String getDrvGrpId() {
        return drvGrpId;
    }

    public void setDrvGrpId(String drvGrpId) {
        this.drvGrpId = drvGrpId;
    }

    public String getDrvId() {
        return drvId;
    }

    public void setDrvId(String drvId) {
        this.drvId = drvId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierId != null ? hierId.hashCode() : 0);
        hash += (drvGrpId != null ? drvGrpId.hashCode() : 0);
        hash += (drvId != null ? drvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HierDrvGrpDrvPK)) {
            return false;
        }
        HierDrvGrpDrvPK other = (HierDrvGrpDrvPK) object;
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        if ((this.drvGrpId == null && other.drvGrpId != null) || (this.drvGrpId != null && !this.drvGrpId.equals(other.drvGrpId))) {
            return false;
        }
        if ((this.drvId == null && other.drvId != null) || (this.drvId != null && !this.drvId.equals(other.drvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierDrvGrpDrvPK[ hierId=" + hierId + ", drvGrpId=" + drvGrpId + ", drvId=" + drvId + " ]";
    }
    
}
