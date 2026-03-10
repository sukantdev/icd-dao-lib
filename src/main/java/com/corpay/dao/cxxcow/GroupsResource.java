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
@Table(name = "GROUPS_RESOURCE", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "GroupsResource.findAll", query = "SELECT g FROM GroupsResource g"),
    @NamedQuery(name = "GroupsResource.findByRsrcId", query = "SELECT g FROM GroupsResource g WHERE g.groupsResourcePK.rsrcId = :rsrcId"),
    @NamedQuery(name = "GroupsResource.findByGroupId", query = "SELECT g FROM GroupsResource g WHERE g.groupsResourcePK.groupId = :groupId"),
    @NamedQuery(name = "GroupsResource.findByGrInsertFg", query = "SELECT g FROM GroupsResource g WHERE g.grInsertFg = :grInsertFg"),
    @NamedQuery(name = "GroupsResource.findByGrInquiryFg", query = "SELECT g FROM GroupsResource g WHERE g.grInquiryFg = :grInquiryFg"),
    @NamedQuery(name = "GroupsResource.findByGrUpdteFg", query = "SELECT g FROM GroupsResource g WHERE g.grUpdteFg = :grUpdteFg"),
    @NamedQuery(name = "GroupsResource.findByGrDeleteFg", query = "SELECT g FROM GroupsResource g WHERE g.grDeleteFg = :grDeleteFg"),
    @NamedQuery(name = "GroupsResource.findByGrBrowseFg", query = "SELECT g FROM GroupsResource g WHERE g.grBrowseFg = :grBrowseFg"),
    @NamedQuery(name = "GroupsResource.findByGrOpencloseFg", query = "SELECT g FROM GroupsResource g WHERE g.grOpencloseFg = :grOpencloseFg"),
    @NamedQuery(name = "GroupsResource.findByGrUptDte", query = "SELECT g FROM GroupsResource g WHERE g.grUptDte = :grUptDte"),
    @NamedQuery(name = "GroupsResource.findByGrUptUsr", query = "SELECT g FROM GroupsResource g WHERE g.grUptUsr = :grUptUsr"),
    @NamedQuery(name = "GroupsResource.findByGrAccessDte", query = "SELECT g FROM GroupsResource g WHERE g.grAccessDte = :grAccessDte"),
    @NamedQuery(name = "GroupsResource.findByGrAccessUsr", query = "SELECT g FROM GroupsResource g WHERE g.grAccessUsr = :grAccessUsr")})
public class GroupsResource implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GroupsResourcePK groupsResourcePK;
    @Basic(optional = false)
    @Column(name = "GR_INSERT_FG")
    private Character grInsertFg;
    @Basic(optional = false)
    @Column(name = "GR_INQUIRY_FG")
    private Character grInquiryFg;
    @Basic(optional = false)
    @Column(name = "GR_UPDTE_FG")
    private Character grUpdteFg;
    @Basic(optional = false)
    @Column(name = "GR_DELETE_FG")
    private Character grDeleteFg;
    @Basic(optional = false)
    @Column(name = "GR_BROWSE_FG")
    private Character grBrowseFg;
    @Basic(optional = false)
    @Column(name = "GR_OPENCLOSE_FG")
    private Character grOpencloseFg;
    @Basic(optional = false)
    @Column(name = "GR_UPT_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date grUptDte;
    @Basic(optional = false)
    @Column(name = "GR_UPT_USR")
    private String grUptUsr;
    @Basic(optional = false)
    @Column(name = "GR_ACCESS_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date grAccessDte;
    @Basic(optional = false)
    @Column(name = "GR_ACCESS_USR")
    private String grAccessUsr;
    @JoinColumn(name = "GROUP_ID", referencedColumnName = "GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Groups groups;
    @JoinColumn(name = "RSRC_ID", referencedColumnName = "RSRC_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Resources resources;

    public GroupsResource() {
    }

    public GroupsResource(GroupsResourcePK groupsResourcePK) {
        this.groupsResourcePK = groupsResourcePK;
    }

    public GroupsResource(GroupsResourcePK groupsResourcePK, Character grInsertFg, Character grInquiryFg, Character grUpdteFg, Character grDeleteFg, Character grBrowseFg, Character grOpencloseFg, Date grUptDte, String grUptUsr, Date grAccessDte, String grAccessUsr) {
        this.groupsResourcePK = groupsResourcePK;
        this.grInsertFg = grInsertFg;
        this.grInquiryFg = grInquiryFg;
        this.grUpdteFg = grUpdteFg;
        this.grDeleteFg = grDeleteFg;
        this.grBrowseFg = grBrowseFg;
        this.grOpencloseFg = grOpencloseFg;
        this.grUptDte = grUptDte;
        this.grUptUsr = grUptUsr;
        this.grAccessDte = grAccessDte;
        this.grAccessUsr = grAccessUsr;
    }

    public GroupsResource(String rsrcId, String groupId) {
        this.groupsResourcePK = new GroupsResourcePK(rsrcId, groupId);
    }

    public GroupsResourcePK getGroupsResourcePK() {
        return groupsResourcePK;
    }

    public void setGroupsResourcePK(GroupsResourcePK groupsResourcePK) {
        this.groupsResourcePK = groupsResourcePK;
    }

    public Character getGrInsertFg() {
        return grInsertFg;
    }

    public void setGrInsertFg(Character grInsertFg) {
        this.grInsertFg = grInsertFg;
    }

    public Character getGrInquiryFg() {
        return grInquiryFg;
    }

    public void setGrInquiryFg(Character grInquiryFg) {
        this.grInquiryFg = grInquiryFg;
    }

    public Character getGrUpdteFg() {
        return grUpdteFg;
    }

    public void setGrUpdteFg(Character grUpdteFg) {
        this.grUpdteFg = grUpdteFg;
    }

    public Character getGrDeleteFg() {
        return grDeleteFg;
    }

    public void setGrDeleteFg(Character grDeleteFg) {
        this.grDeleteFg = grDeleteFg;
    }

    public Character getGrBrowseFg() {
        return grBrowseFg;
    }

    public void setGrBrowseFg(Character grBrowseFg) {
        this.grBrowseFg = grBrowseFg;
    }

    public Character getGrOpencloseFg() {
        return grOpencloseFg;
    }

    public void setGrOpencloseFg(Character grOpencloseFg) {
        this.grOpencloseFg = grOpencloseFg;
    }

    public Date getGrUptDte() {
        return grUptDte;
    }

    public void setGrUptDte(Date grUptDte) {
        this.grUptDte = grUptDte;
    }

    public String getGrUptUsr() {
        return grUptUsr;
    }

    public void setGrUptUsr(String grUptUsr) {
        this.grUptUsr = grUptUsr;
    }

    public Date getGrAccessDte() {
        return grAccessDte;
    }

    public void setGrAccessDte(Date grAccessDte) {
        this.grAccessDte = grAccessDte;
    }

    public String getGrAccessUsr() {
        return grAccessUsr;
    }

    public void setGrAccessUsr(String grAccessUsr) {
        this.grAccessUsr = grAccessUsr;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupsResourcePK != null ? groupsResourcePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupsResource)) {
            return false;
        }
        GroupsResource other = (GroupsResource) object;
        if ((this.groupsResourcePK == null && other.groupsResourcePK != null) || (this.groupsResourcePK != null && !this.groupsResourcePK.equals(other.groupsResourcePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.GroupsResource[ groupsResourcePK=" + groupsResourcePK + " ]";
    }
    
}
