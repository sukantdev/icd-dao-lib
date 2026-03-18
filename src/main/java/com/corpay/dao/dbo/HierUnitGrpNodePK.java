package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HierUnitGrpNodePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "UNIT_GRP_ID")
    private String unitGrpId;
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;

    public HierUnitGrpNodePK() {
    }

    public HierUnitGrpNodePK(String hierId, String unitGrpId, String nodeId) {
        this.hierId = hierId;
        this.unitGrpId = unitGrpId;
        this.nodeId = nodeId;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public String getUnitGrpId() {
        return unitGrpId;
    }

    public void setUnitGrpId(String unitGrpId) {
        this.unitGrpId = unitGrpId;
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
        hash += (unitGrpId != null ? unitGrpId.hashCode() : 0);
        hash += (nodeId != null ? nodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierUnitGrpNodePK)) {
            return false;
        }
        HierUnitGrpNodePK other = (HierUnitGrpNodePK) object;
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        if ((this.unitGrpId == null && other.unitGrpId != null) || (this.unitGrpId != null && !this.unitGrpId.equals(other.unitGrpId))) {
            return false;
        }
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierUnitGrpNodePK[ hierId=" + hierId + ", unitGrpId=" + unitGrpId + ", nodeId=" + nodeId + " ]";
    }

}
