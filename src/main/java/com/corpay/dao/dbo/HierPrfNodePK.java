package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HierPrfNodePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "PRF_NBR")
    private int prfNbr;
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;

    public HierPrfNodePK() {
    }

    public HierPrfNodePK(String hierId, int prfNbr, String nodeId) {
        this.hierId = hierId;
        this.prfNbr = prfNbr;
        this.nodeId = nodeId;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public int getPrfNbr() {
        return prfNbr;
    }

    public void setPrfNbr(int prfNbr) {
        this.prfNbr = prfNbr;
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
        hash += (int) prfNbr;
        hash += (nodeId != null ? nodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierPrfNodePK)) {
            return false;
        }
        HierPrfNodePK other = (HierPrfNodePK) object;
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        if (this.prfNbr != other.prfNbr) {
            return false;
        }
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierPrfNodePK[ hierId=" + hierId + ", prfNbr=" + prfNbr + ", nodeId=" + nodeId + " ]";
    }

}
