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
public class HierDrvGrpNodePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "DRV_GRP_ID")
    private String drvGrpId;
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;

    public HierDrvGrpNodePK() {
    }

    public HierDrvGrpNodePK(String hierId, String drvGrpId, String nodeId) {
        this.hierId = hierId;
        this.drvGrpId = drvGrpId;
        this.nodeId = nodeId;
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

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierId != null ? hierId.hashCode() : 0);
        hash += (drvGrpId != null ? drvGrpId.hashCode() : 0);
        hash += (nodeId != null ? nodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HierDrvGrpNodePK)) {
            return false;
        }
        HierDrvGrpNodePK other = (HierDrvGrpNodePK) object;
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        if ((this.drvGrpId == null && other.drvGrpId != null) || (this.drvGrpId != null && !this.drvGrpId.equals(other.drvGrpId))) {
            return false;
        }
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierDrvGrpNodePK[ hierId=" + hierId + ", drvGrpId=" + drvGrpId + ", nodeId=" + nodeId + " ]";
    }
    
}
