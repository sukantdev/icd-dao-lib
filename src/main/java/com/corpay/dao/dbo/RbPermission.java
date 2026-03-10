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
@Table(name = "RB_PERMISSION", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RbPermission.findAll", query = "SELECT r FROM RbPermission r")})
public class RbPermission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PERM_ID")
    private Long permId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permId", fetch = FetchType.LAZY)
    private Set<RbRolePermission> rbRolePermissionSet;
    @JoinColumn(name = "OBJ_ID", referencedColumnName = "OBJ_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbAppObj objId;
    @JoinColumn(name = "PERM_TYP_ID", referencedColumnName = "PERM_TYP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbPermissionTyp permTypId;

    public RbPermission() {
    }

    public RbPermission(Long permId) {
        this.permId = permId;
    }

    public RbPermission(Long permId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.permId = permId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getPermId() {
        return permId;
    }

    public void setPermId(Long permId) {
        this.permId = permId;
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

    public Set<RbRolePermission> getRbRolePermissionSet() {
        return rbRolePermissionSet;
    }

    public void setRbRolePermissionSet(Set<RbRolePermission> rbRolePermissionSet) {
        this.rbRolePermissionSet = rbRolePermissionSet;
    }

    public RbAppObj getObjId() {
        return objId;
    }

    public void setObjId(RbAppObj objId) {
        this.objId = objId;
    }

    public RbPermissionTyp getPermTypId() {
        return permTypId;
    }

    public void setPermTypId(RbPermissionTyp permTypId) {
        this.permTypId = permTypId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permId != null ? permId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RbPermission)) {
            return false;
        }
        RbPermission other = (RbPermission) object;
        if ((this.permId == null && other.permId != null) || (this.permId != null && !this.permId.equals(other.permId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbPermission[ permId=" + permId + " ]";
    }
    
}
