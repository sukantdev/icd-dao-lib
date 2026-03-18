package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MESSAGES_GROUPS", catalog = "", schema = "CXXCOW")
public class MessagesGroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MessagesGroupsPK messagesGroupsPK;
    @Basic(optional = false)
    @Column(name = "MSGGRP_EFF_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date msggrpEffTs;
    @JoinColumn(name = "GROUP_ID", referencedColumnName = "GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Groups groups;

    public MessagesGroups() {
    }

    public MessagesGroups(MessagesGroupsPK messagesGroupsPK) {
        this.messagesGroupsPK = messagesGroupsPK;
    }

    public MessagesGroups(MessagesGroupsPK messagesGroupsPK, Date msggrpEffTs) {
        this.messagesGroupsPK = messagesGroupsPK;
        this.msggrpEffTs = msggrpEffTs;
    }

    public MessagesGroups(String groupId, Date msgId) {
        this.messagesGroupsPK = new MessagesGroupsPK(groupId, msgId);
    }

    public MessagesGroupsPK getMessagesGroupsPK() {
        return messagesGroupsPK;
    }

    public void setMessagesGroupsPK(MessagesGroupsPK messagesGroupsPK) {
        this.messagesGroupsPK = messagesGroupsPK;
    }

    public Date getMsggrpEffTs() {
        return msggrpEffTs;
    }

    public void setMsggrpEffTs(Date msggrpEffTs) {
        this.msggrpEffTs = msggrpEffTs;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messagesGroupsPK != null ? messagesGroupsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MessagesGroups)) {
            return false;
        }
        MessagesGroups other = (MessagesGroups) object;
        if ((this.messagesGroupsPK == null && other.messagesGroupsPK != null) || (this.messagesGroupsPK != null && !this.messagesGroupsPK.equals(other.messagesGroupsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.MessagesGroups[ messagesGroupsPK=" + messagesGroupsPK + " ]";
    }

}
