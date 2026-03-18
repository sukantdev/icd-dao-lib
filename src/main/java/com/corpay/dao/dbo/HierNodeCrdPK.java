package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HierNodeCrdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;

    public HierNodeCrdPK() {
    }

    public HierNodeCrdPK(String hierId, String nodeId, String crdNbr) {
        this.hierId = hierId;
        this.nodeId = nodeId;
        this.crdNbr = crdNbr;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierId != null ? hierId.hashCode() : 0);
        hash += (nodeId != null ? nodeId.hashCode() : 0);
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierNodeCrdPK)) {
            return false;
        }
        HierNodeCrdPK other = (HierNodeCrdPK) object;
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierNodeCrdPK[ hierId=" + hierId + ", nodeId=" + nodeId + ", crdNbr=" + crdNbr + " ]";
    }

}
