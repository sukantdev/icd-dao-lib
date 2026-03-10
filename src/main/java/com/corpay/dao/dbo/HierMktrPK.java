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
public class HierMktrPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;
    @Basic(optional = false)
    @Column(name = "MKTR")
    private String mktr;

    public HierMktrPK() {
    }

    public HierMktrPK(String hierId, String nodeId, String mktr) {
        this.hierId = hierId;
        this.nodeId = nodeId;
        this.mktr = mktr;
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

    public String getMktr() {
        return mktr;
    }

    public void setMktr(String mktr) {
        this.mktr = mktr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierId != null ? hierId.hashCode() : 0);
        hash += (nodeId != null ? nodeId.hashCode() : 0);
        hash += (mktr != null ? mktr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HierMktrPK)) {
            return false;
        }
        HierMktrPK other = (HierMktrPK) object;
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        if ((this.mktr == null && other.mktr != null) || (this.mktr != null && !this.mktr.equals(other.mktr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierMktrPK[ hierId=" + hierId + ", nodeId=" + nodeId + ", mktr=" + mktr + " ]";
    }
    
}
