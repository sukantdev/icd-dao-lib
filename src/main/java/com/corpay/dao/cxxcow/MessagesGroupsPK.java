package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class MessagesGroupsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "GROUP_ID")
    private String groupId;
    @Basic(optional = false)
    @Column(name = "MSG_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date msgId;

    public MessagesGroupsPK() {
    }

    public MessagesGroupsPK(String groupId, Date msgId) {
        this.groupId = groupId;
        this.msgId = msgId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Date getMsgId() {
        return msgId;
    }

    public void setMsgId(Date msgId) {
        this.msgId = msgId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        hash += (msgId != null ? msgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MessagesGroupsPK)) {
            return false;
        }
        MessagesGroupsPK other = (MessagesGroupsPK) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        if ((this.msgId == null && other.msgId != null) || (this.msgId != null && !this.msgId.equals(other.msgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.MessagesGroupsPK[ groupId=" + groupId + ", msgId=" + msgId + " ]";
    }

}
