package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class MsgHierXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MSG_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date msgId;
    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;

    public MsgHierXrefPK() {
    }

    public MsgHierXrefPK(Date msgId, String hierId, String nodeId) {
        this.msgId = msgId;
        this.hierId = hierId;
        this.nodeId = nodeId;
    }

    public Date getMsgId() {
        return msgId;
    }

    public void setMsgId(Date msgId) {
        this.msgId = msgId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (msgId != null ? msgId.hashCode() : 0);
        hash += (hierId != null ? hierId.hashCode() : 0);
        hash += (nodeId != null ? nodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MsgHierXrefPK)) {
            return false;
        }
        MsgHierXrefPK other = (MsgHierXrefPK) object;
        if ((this.msgId == null && other.msgId != null) || (this.msgId != null && !this.msgId.equals(other.msgId))) {
            return false;
        }
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MsgHierXrefPK[ msgId=" + msgId + ", hierId=" + hierId + ", nodeId=" + nodeId + " ]";
    }

}
