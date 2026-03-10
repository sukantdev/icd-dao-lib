/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MESSAGES_GROUPS", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "MessagesGroups.findAll", query = "SELECT m FROM MessagesGroups m"),
    @NamedQuery(name = "MessagesGroups.findByGroupId", query = "SELECT m FROM MessagesGroups m WHERE m.messagesGroupsPK.groupId = :groupId"),
    @NamedQuery(name = "MessagesGroups.findByMsgId", query = "SELECT m FROM MessagesGroups m WHERE m.messagesGroupsPK.msgId = :msgId"),
    @NamedQuery(name = "MessagesGroups.findByMsggrpEffTs", query = "SELECT m FROM MessagesGroups m WHERE m.msggrpEffTs = :msggrpEffTs")})
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
