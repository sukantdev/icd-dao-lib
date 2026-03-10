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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "RESOURCES", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "Resources.findAll", query = "SELECT r FROM Resources r"),
    @NamedQuery(name = "Resources.findByRsrcId", query = "SELECT r FROM Resources r WHERE r.rsrcId = :rsrcId"),
    @NamedQuery(name = "Resources.findByRsrcInquiryFg", query = "SELECT r FROM Resources r WHERE r.rsrcInquiryFg = :rsrcInquiryFg"),
    @NamedQuery(name = "Resources.findByRsrcDeleteFg", query = "SELECT r FROM Resources r WHERE r.rsrcDeleteFg = :rsrcDeleteFg"),
    @NamedQuery(name = "Resources.findByRsrcBrowseFg", query = "SELECT r FROM Resources r WHERE r.rsrcBrowseFg = :rsrcBrowseFg"),
    @NamedQuery(name = "Resources.findByRsrcUpdteFg", query = "SELECT r FROM Resources r WHERE r.rsrcUpdteFg = :rsrcUpdteFg"),
    @NamedQuery(name = "Resources.findByRsrcInsertFg", query = "SELECT r FROM Resources r WHERE r.rsrcInsertFg = :rsrcInsertFg"),
    @NamedQuery(name = "Resources.findByRsrcType", query = "SELECT r FROM Resources r WHERE r.rsrcType = :rsrcType"),
    @NamedQuery(name = "Resources.findByRsrcOpencloseFg", query = "SELECT r FROM Resources r WHERE r.rsrcOpencloseFg = :rsrcOpencloseFg"),
    @NamedQuery(name = "Resources.findByRsrcDesc", query = "SELECT r FROM Resources r WHERE r.rsrcDesc = :rsrcDesc"),
    @NamedQuery(name = "Resources.findByRsrcUptDte", query = "SELECT r FROM Resources r WHERE r.rsrcUptDte = :rsrcUptDte"),
    @NamedQuery(name = "Resources.findByRsrcUptUsr", query = "SELECT r FROM Resources r WHERE r.rsrcUptUsr = :rsrcUptUsr"),
    @NamedQuery(name = "Resources.findByRsrcAccessDte", query = "SELECT r FROM Resources r WHERE r.rsrcAccessDte = :rsrcAccessDte"),
    @NamedQuery(name = "Resources.findByRsrcAccessUsr", query = "SELECT r FROM Resources r WHERE r.rsrcAccessUsr = :rsrcAccessUsr"),
    @NamedQuery(name = "Resources.findByRsrcApplData", query = "SELECT r FROM Resources r WHERE r.rsrcApplData = :rsrcApplData")})
public class Resources implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RSRC_ID")
    private String rsrcId;
    @Basic(optional = false)
    @Column(name = "RSRC_INQUIRY_FG")
    private Character rsrcInquiryFg;
    @Basic(optional = false)
    @Column(name = "RSRC_DELETE_FG")
    private Character rsrcDeleteFg;
    @Basic(optional = false)
    @Column(name = "RSRC_BROWSE_FG")
    private Character rsrcBrowseFg;
    @Basic(optional = false)
    @Column(name = "RSRC_UPDTE_FG")
    private Character rsrcUpdteFg;
    @Basic(optional = false)
    @Column(name = "RSRC_INSERT_FG")
    private Character rsrcInsertFg;
    @Basic(optional = false)
    @Column(name = "RSRC_TYPE")
    private Character rsrcType;
    @Basic(optional = false)
    @Column(name = "RSRC_OPENCLOSE_FG")
    private Character rsrcOpencloseFg;
    @Basic(optional = false)
    @Column(name = "RSRC_DESC")
    private String rsrcDesc;
    @Basic(optional = false)
    @Column(name = "RSRC_UPT_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rsrcUptDte;
    @Basic(optional = false)
    @Column(name = "RSRC_UPT_USR")
    private String rsrcUptUsr;
    @Basic(optional = false)
    @Column(name = "RSRC_ACCESS_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rsrcAccessDte;
    @Basic(optional = false)
    @Column(name = "RSRC_ACCESS_USR")
    private String rsrcAccessUsr;
    @Basic(optional = false)
    @Column(name = "RSRC_APPL_DATA")
    private String rsrcApplData;
    @JoinTable(name = "RESOURC_TO_RESOURC", joinColumns = {
        @JoinColumn(name = "RSRC_ID_PARENT", referencedColumnName = "RSRC_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "RSRC_ID_CHILD", referencedColumnName = "RSRC_ID")})
    @ManyToMany
    private Collection<Resources> resourcesCollection;
    @ManyToMany(mappedBy = "resourcesCollection")
    private Collection<Resources> resourcesCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resources")
    private Collection<ResourceAppl> resourceApplCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resources")
    private Collection<UsersResources> usersResourcesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resources")
    private Collection<GroupsResource> groupsResourceCollection;

    public Resources() {
    }

    public Resources(String rsrcId) {
        this.rsrcId = rsrcId;
    }

    public Resources(String rsrcId, Character rsrcInquiryFg, Character rsrcDeleteFg, Character rsrcBrowseFg, Character rsrcUpdteFg, Character rsrcInsertFg, Character rsrcType, Character rsrcOpencloseFg, String rsrcDesc, Date rsrcUptDte, String rsrcUptUsr, Date rsrcAccessDte, String rsrcAccessUsr, String rsrcApplData) {
        this.rsrcId = rsrcId;
        this.rsrcInquiryFg = rsrcInquiryFg;
        this.rsrcDeleteFg = rsrcDeleteFg;
        this.rsrcBrowseFg = rsrcBrowseFg;
        this.rsrcUpdteFg = rsrcUpdteFg;
        this.rsrcInsertFg = rsrcInsertFg;
        this.rsrcType = rsrcType;
        this.rsrcOpencloseFg = rsrcOpencloseFg;
        this.rsrcDesc = rsrcDesc;
        this.rsrcUptDte = rsrcUptDte;
        this.rsrcUptUsr = rsrcUptUsr;
        this.rsrcAccessDte = rsrcAccessDte;
        this.rsrcAccessUsr = rsrcAccessUsr;
        this.rsrcApplData = rsrcApplData;
    }

    public String getRsrcId() {
        return rsrcId;
    }

    public void setRsrcId(String rsrcId) {
        this.rsrcId = rsrcId;
    }

    public Character getRsrcInquiryFg() {
        return rsrcInquiryFg;
    }

    public void setRsrcInquiryFg(Character rsrcInquiryFg) {
        this.rsrcInquiryFg = rsrcInquiryFg;
    }

    public Character getRsrcDeleteFg() {
        return rsrcDeleteFg;
    }

    public void setRsrcDeleteFg(Character rsrcDeleteFg) {
        this.rsrcDeleteFg = rsrcDeleteFg;
    }

    public Character getRsrcBrowseFg() {
        return rsrcBrowseFg;
    }

    public void setRsrcBrowseFg(Character rsrcBrowseFg) {
        this.rsrcBrowseFg = rsrcBrowseFg;
    }

    public Character getRsrcUpdteFg() {
        return rsrcUpdteFg;
    }

    public void setRsrcUpdteFg(Character rsrcUpdteFg) {
        this.rsrcUpdteFg = rsrcUpdteFg;
    }

    public Character getRsrcInsertFg() {
        return rsrcInsertFg;
    }

    public void setRsrcInsertFg(Character rsrcInsertFg) {
        this.rsrcInsertFg = rsrcInsertFg;
    }

    public Character getRsrcType() {
        return rsrcType;
    }

    public void setRsrcType(Character rsrcType) {
        this.rsrcType = rsrcType;
    }

    public Character getRsrcOpencloseFg() {
        return rsrcOpencloseFg;
    }

    public void setRsrcOpencloseFg(Character rsrcOpencloseFg) {
        this.rsrcOpencloseFg = rsrcOpencloseFg;
    }

    public String getRsrcDesc() {
        return rsrcDesc;
    }

    public void setRsrcDesc(String rsrcDesc) {
        this.rsrcDesc = rsrcDesc;
    }

    public Date getRsrcUptDte() {
        return rsrcUptDte;
    }

    public void setRsrcUptDte(Date rsrcUptDte) {
        this.rsrcUptDte = rsrcUptDte;
    }

    public String getRsrcUptUsr() {
        return rsrcUptUsr;
    }

    public void setRsrcUptUsr(String rsrcUptUsr) {
        this.rsrcUptUsr = rsrcUptUsr;
    }

    public Date getRsrcAccessDte() {
        return rsrcAccessDte;
    }

    public void setRsrcAccessDte(Date rsrcAccessDte) {
        this.rsrcAccessDte = rsrcAccessDte;
    }

    public String getRsrcAccessUsr() {
        return rsrcAccessUsr;
    }

    public void setRsrcAccessUsr(String rsrcAccessUsr) {
        this.rsrcAccessUsr = rsrcAccessUsr;
    }

    public String getRsrcApplData() {
        return rsrcApplData;
    }

    public void setRsrcApplData(String rsrcApplData) {
        this.rsrcApplData = rsrcApplData;
    }

    public Collection<Resources> getResourcesCollection() {
        return resourcesCollection;
    }

    public void setResourcesCollection(Collection<Resources> resourcesCollection) {
        this.resourcesCollection = resourcesCollection;
    }

    public Collection<Resources> getResourcesCollection1() {
        return resourcesCollection1;
    }

    public void setResourcesCollection1(Collection<Resources> resourcesCollection1) {
        this.resourcesCollection1 = resourcesCollection1;
    }

    public Collection<ResourceAppl> getResourceApplCollection() {
        return resourceApplCollection;
    }

    public void setResourceApplCollection(Collection<ResourceAppl> resourceApplCollection) {
        this.resourceApplCollection = resourceApplCollection;
    }

    public Collection<UsersResources> getUsersResourcesCollection() {
        return usersResourcesCollection;
    }

    public void setUsersResourcesCollection(Collection<UsersResources> usersResourcesCollection) {
        this.usersResourcesCollection = usersResourcesCollection;
    }

    public Collection<GroupsResource> getGroupsResourceCollection() {
        return groupsResourceCollection;
    }

    public void setGroupsResourceCollection(Collection<GroupsResource> groupsResourceCollection) {
        this.groupsResourceCollection = groupsResourceCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rsrcId != null ? rsrcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resources)) {
            return false;
        }
        Resources other = (Resources) object;
        if ((this.rsrcId == null && other.rsrcId != null) || (this.rsrcId != null && !this.rsrcId.equals(other.rsrcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.Resources[ rsrcId=" + rsrcId + " ]";
    }
    
}
