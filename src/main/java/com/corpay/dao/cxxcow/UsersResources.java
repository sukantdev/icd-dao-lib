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
@Table(name = "USERS_RESOURCES", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "UsersResources.findAll", query = "SELECT u FROM UsersResources u"),
    @NamedQuery(name = "UsersResources.findByRsrcId", query = "SELECT u FROM UsersResources u WHERE u.usersResourcesPK.rsrcId = :rsrcId"),
    @NamedQuery(name = "UsersResources.findByUserId", query = "SELECT u FROM UsersResources u WHERE u.usersResourcesPK.userId = :userId"),
    @NamedQuery(name = "UsersResources.findByUrInsertFg", query = "SELECT u FROM UsersResources u WHERE u.urInsertFg = :urInsertFg"),
    @NamedQuery(name = "UsersResources.findByUrInquiryFg", query = "SELECT u FROM UsersResources u WHERE u.urInquiryFg = :urInquiryFg"),
    @NamedQuery(name = "UsersResources.findByUrUpdteFg", query = "SELECT u FROM UsersResources u WHERE u.urUpdteFg = :urUpdteFg"),
    @NamedQuery(name = "UsersResources.findByUrDeleteFg", query = "SELECT u FROM UsersResources u WHERE u.urDeleteFg = :urDeleteFg"),
    @NamedQuery(name = "UsersResources.findByUrBrowseFg", query = "SELECT u FROM UsersResources u WHERE u.urBrowseFg = :urBrowseFg"),
    @NamedQuery(name = "UsersResources.findByUrOpencloseFg", query = "SELECT u FROM UsersResources u WHERE u.urOpencloseFg = :urOpencloseFg"),
    @NamedQuery(name = "UsersResources.findByUrUptDte", query = "SELECT u FROM UsersResources u WHERE u.urUptDte = :urUptDte"),
    @NamedQuery(name = "UsersResources.findByUrUptUsr", query = "SELECT u FROM UsersResources u WHERE u.urUptUsr = :urUptUsr"),
    @NamedQuery(name = "UsersResources.findByUrAccessDte", query = "SELECT u FROM UsersResources u WHERE u.urAccessDte = :urAccessDte"),
    @NamedQuery(name = "UsersResources.findByUrAccessUsr", query = "SELECT u FROM UsersResources u WHERE u.urAccessUsr = :urAccessUsr"),
    @NamedQuery(name = "UsersResources.findByUrCodeWord", query = "SELECT u FROM UsersResources u WHERE u.urCodeWord = :urCodeWord")})
public class UsersResources implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsersResourcesPK usersResourcesPK;
    @Basic(optional = false)
    @Column(name = "UR_INSERT_FG")
    private Character urInsertFg;
    @Basic(optional = false)
    @Column(name = "UR_INQUIRY_FG")
    private Character urInquiryFg;
    @Basic(optional = false)
    @Column(name = "UR_UPDTE_FG")
    private Character urUpdteFg;
    @Basic(optional = false)
    @Column(name = "UR_DELETE_FG")
    private Character urDeleteFg;
    @Basic(optional = false)
    @Column(name = "UR_BROWSE_FG")
    private Character urBrowseFg;
    @Basic(optional = false)
    @Column(name = "UR_OPENCLOSE_FG")
    private Character urOpencloseFg;
    @Basic(optional = false)
    @Column(name = "UR_UPT_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date urUptDte;
    @Basic(optional = false)
    @Column(name = "UR_UPT_USR")
    private String urUptUsr;
    @Basic(optional = false)
    @Column(name = "UR_ACCESS_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date urAccessDte;
    @Basic(optional = false)
    @Column(name = "UR_ACCESS_USR")
    private String urAccessUsr;
    @Basic(optional = false)
    @Column(name = "UR_CODE_WORD")
    private String urCodeWord;
    @JoinColumn(name = "RSRC_ID", referencedColumnName = "RSRC_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Resources resources;

    public UsersResources() {
    }

    public UsersResources(UsersResourcesPK usersResourcesPK) {
        this.usersResourcesPK = usersResourcesPK;
    }

    public UsersResources(UsersResourcesPK usersResourcesPK, Character urInsertFg, Character urInquiryFg, Character urUpdteFg, Character urDeleteFg, Character urBrowseFg, Character urOpencloseFg, Date urUptDte, String urUptUsr, Date urAccessDte, String urAccessUsr, String urCodeWord) {
        this.usersResourcesPK = usersResourcesPK;
        this.urInsertFg = urInsertFg;
        this.urInquiryFg = urInquiryFg;
        this.urUpdteFg = urUpdteFg;
        this.urDeleteFg = urDeleteFg;
        this.urBrowseFg = urBrowseFg;
        this.urOpencloseFg = urOpencloseFg;
        this.urUptDte = urUptDte;
        this.urUptUsr = urUptUsr;
        this.urAccessDte = urAccessDte;
        this.urAccessUsr = urAccessUsr;
        this.urCodeWord = urCodeWord;
    }

    public UsersResources(String rsrcId, String userId) {
        this.usersResourcesPK = new UsersResourcesPK(rsrcId, userId);
    }

    public UsersResourcesPK getUsersResourcesPK() {
        return usersResourcesPK;
    }

    public void setUsersResourcesPK(UsersResourcesPK usersResourcesPK) {
        this.usersResourcesPK = usersResourcesPK;
    }

    public Character getUrInsertFg() {
        return urInsertFg;
    }

    public void setUrInsertFg(Character urInsertFg) {
        this.urInsertFg = urInsertFg;
    }

    public Character getUrInquiryFg() {
        return urInquiryFg;
    }

    public void setUrInquiryFg(Character urInquiryFg) {
        this.urInquiryFg = urInquiryFg;
    }

    public Character getUrUpdteFg() {
        return urUpdteFg;
    }

    public void setUrUpdteFg(Character urUpdteFg) {
        this.urUpdteFg = urUpdteFg;
    }

    public Character getUrDeleteFg() {
        return urDeleteFg;
    }

    public void setUrDeleteFg(Character urDeleteFg) {
        this.urDeleteFg = urDeleteFg;
    }

    public Character getUrBrowseFg() {
        return urBrowseFg;
    }

    public void setUrBrowseFg(Character urBrowseFg) {
        this.urBrowseFg = urBrowseFg;
    }

    public Character getUrOpencloseFg() {
        return urOpencloseFg;
    }

    public void setUrOpencloseFg(Character urOpencloseFg) {
        this.urOpencloseFg = urOpencloseFg;
    }

    public Date getUrUptDte() {
        return urUptDte;
    }

    public void setUrUptDte(Date urUptDte) {
        this.urUptDte = urUptDte;
    }

    public String getUrUptUsr() {
        return urUptUsr;
    }

    public void setUrUptUsr(String urUptUsr) {
        this.urUptUsr = urUptUsr;
    }

    public Date getUrAccessDte() {
        return urAccessDte;
    }

    public void setUrAccessDte(Date urAccessDte) {
        this.urAccessDte = urAccessDte;
    }

    public String getUrAccessUsr() {
        return urAccessUsr;
    }

    public void setUrAccessUsr(String urAccessUsr) {
        this.urAccessUsr = urAccessUsr;
    }

    public String getUrCodeWord() {
        return urCodeWord;
    }

    public void setUrCodeWord(String urCodeWord) {
        this.urCodeWord = urCodeWord;
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
        hash += (usersResourcesPK != null ? usersResourcesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersResources)) {
            return false;
        }
        UsersResources other = (UsersResources) object;
        if ((this.usersResourcesPK == null && other.usersResourcesPK != null) || (this.usersResourcesPK != null && !this.usersResourcesPK.equals(other.usersResourcesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UsersResources[ usersResourcesPK=" + usersResourcesPK + " ]";
    }
    
}
