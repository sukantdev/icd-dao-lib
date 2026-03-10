/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "RB_ROLE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RbRole.findAll", query = "SELECT r FROM RbRole r")})
public class RbRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROLE_ID")
    private Long roleId;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "ROLE_NM")
    private String roleNm;
    @Basic(optional = false)
    @Column(name = "CMNT_TXT")
    private String cmntTxt;
    @Basic(optional = false)
    @Column(name = "ROLE_CD")
    private String roleCd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleId", fetch = FetchType.LAZY)
    private Set<RbRolePermission> rbRolePermissionSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleId", fetch = FetchType.LAZY)
    private Set<RbProfileRole> rbProfileRoleSet;
    @JoinColumn(name = "APP_ID", referencedColumnName = "APP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbApp appId;
    @JoinColumn(name = "ROLE_TYP_ID", referencedColumnName = "ROLE_TYP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbRoleTyp roleTypId;

    public RbRole() {
    }

    public RbRole(Long roleId) {
        this.roleId = roleId;
    }

    public RbRole(Long roleId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String roleNm, String cmntTxt, String roleCd) {
        this.roleId = roleId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.roleNm = roleNm;
        this.cmntTxt = cmntTxt;
        this.roleCd = roleCd;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public String getRoleNm() {
        return roleNm;
    }

    public void setRoleNm(String roleNm) {
        this.roleNm = roleNm;
    }

    public String getCmntTxt() {
        return cmntTxt;
    }

    public void setCmntTxt(String cmntTxt) {
        this.cmntTxt = cmntTxt;
    }

    public String getRoleCd() {
        return roleCd;
    }

    public void setRoleCd(String roleCd) {
        this.roleCd = roleCd;
    }

    public Set<RbRolePermission> getRbRolePermissionSet() {
        return rbRolePermissionSet;
    }

    public void setRbRolePermissionSet(Set<RbRolePermission> rbRolePermissionSet) {
        this.rbRolePermissionSet = rbRolePermissionSet;
    }

    public Set<RbProfileRole> getRbProfileRoleSet() {
        return rbProfileRoleSet;
    }

    public void setRbProfileRoleSet(Set<RbProfileRole> rbProfileRoleSet) {
        this.rbProfileRoleSet = rbProfileRoleSet;
    }

    public RbApp getAppId() {
        return appId;
    }

    public void setAppId(RbApp appId) {
        this.appId = appId;
    }

    public RbRoleTyp getRoleTypId() {
        return roleTypId;
    }

    public void setRoleTypId(RbRoleTyp roleTypId) {
        this.roleTypId = roleTypId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleId != null ? roleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RbRole)) {
            return false;
        }
        RbRole other = (RbRole) object;
        if ((this.roleId == null && other.roleId != null) || (this.roleId != null && !this.roleId.equals(other.roleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbRole[ roleId=" + roleId + " ]";
    }
    
}
