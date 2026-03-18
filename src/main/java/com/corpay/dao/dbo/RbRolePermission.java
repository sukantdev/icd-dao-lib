package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "RB_ROLE_PERMISSION", catalog = "", schema = "DBO")
public class RbRolePermission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROLE_PERM_ID")
    private Long rolePermId;
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
    @JoinColumn(name = "PERM_ID", referencedColumnName = "PERM_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbPermission permId;
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbRole roleId;

    public RbRolePermission() {
    }

    public RbRolePermission(Long rolePermId) {
        this.rolePermId = rolePermId;
    }

    public RbRolePermission(Long rolePermId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.rolePermId = rolePermId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getRolePermId() {
        return rolePermId;
    }

    public void setRolePermId(Long rolePermId) {
        this.rolePermId = rolePermId;
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

    public RbPermission getPermId() {
        return permId;
    }

    public void setPermId(RbPermission permId) {
        this.permId = permId;
    }

    public RbRole getRoleId() {
        return roleId;
    }

    public void setRoleId(RbRole roleId) {
        this.roleId = roleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolePermId != null ? rolePermId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbRolePermission)) {
            return false;
        }
        RbRolePermission other = (RbRolePermission) object;
        if ((this.rolePermId == null && other.rolePermId != null) || (this.rolePermId != null && !this.rolePermId.equals(other.rolePermId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbRolePermission[ rolePermId=" + rolePermId + " ]";
    }

}
