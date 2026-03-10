/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "GROUPS", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "Groups.findAll", query = "SELECT g FROM Groups g"),
    @NamedQuery(name = "Groups.findByGroupId", query = "SELECT g FROM Groups g WHERE g.groupId = :groupId"),
    @NamedQuery(name = "Groups.findByGroupDesc", query = "SELECT g FROM Groups g WHERE g.groupDesc = :groupDesc"),
    @NamedQuery(name = "Groups.findByGroupUptDte", query = "SELECT g FROM Groups g WHERE g.groupUptDte = :groupUptDte"),
    @NamedQuery(name = "Groups.findByGroupUptUser", query = "SELECT g FROM Groups g WHERE g.groupUptUser = :groupUptUser")})
public class Groups implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GROUP_ID")
    private String groupId;
    @Basic(optional = false)
    @Column(name = "GROUP_DESC")
    private String groupDesc;
    @Basic(optional = false)
    @Column(name = "GROUP_UPT_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date groupUptDte;
    @Basic(optional = false)
    @Column(name = "GROUP_UPT_USER")
    private String groupUptUser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groups")
    private Collection<UsersGroups> usersGroupsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groups")
    private Collection<GroupsResource> groupsResourceCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groups")
    private Collection<GroupResrcappl> groupResrcapplCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groups")
    private Collection<MessagesGroups> messagesGroupsCollection;

    public Groups() {
    }

    public Groups(String groupId) {
        this.groupId = groupId;
    }

    public Groups(String groupId, String groupDesc, Date groupUptDte, String groupUptUser) {
        this.groupId = groupId;
        this.groupDesc = groupDesc;
        this.groupUptDte = groupUptDte;
        this.groupUptUser = groupUptUser;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public Date getGroupUptDte() {
        return groupUptDte;
    }

    public void setGroupUptDte(Date groupUptDte) {
        this.groupUptDte = groupUptDte;
    }

    public String getGroupUptUser() {
        return groupUptUser;
    }

    public void setGroupUptUser(String groupUptUser) {
        this.groupUptUser = groupUptUser;
    }

    public Collection<UsersGroups> getUsersGroupsCollection() {
        return usersGroupsCollection;
    }

    public void setUsersGroupsCollection(Collection<UsersGroups> usersGroupsCollection) {
        this.usersGroupsCollection = usersGroupsCollection;
    }

    public Collection<GroupsResource> getGroupsResourceCollection() {
        return groupsResourceCollection;
    }

    public void setGroupsResourceCollection(Collection<GroupsResource> groupsResourceCollection) {
        this.groupsResourceCollection = groupsResourceCollection;
    }

    public Collection<GroupResrcappl> getGroupResrcapplCollection() {
        return groupResrcapplCollection;
    }

    public void setGroupResrcapplCollection(Collection<GroupResrcappl> groupResrcapplCollection) {
        this.groupResrcapplCollection = groupResrcapplCollection;
    }

    public Collection<MessagesGroups> getMessagesGroupsCollection() {
        return messagesGroupsCollection;
    }

    public void setMessagesGroupsCollection(Collection<MessagesGroups> messagesGroupsCollection) {
        this.messagesGroupsCollection = messagesGroupsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groups)) {
            return false;
        }
        Groups other = (Groups) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.Groups[ groupId=" + groupId + " ]";
    }
    
}
