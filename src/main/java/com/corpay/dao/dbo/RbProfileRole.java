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
@Table(name = "RB_PROFILE_ROLE", catalog = "", schema = "DBO")
public class RbProfileRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROF_ROLE_ID")
    private Long profRoleId;
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
    @JoinColumn(name = "PROF_ID", referencedColumnName = "PROF_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbProfile profId;
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbRole roleId;

    public RbProfileRole() {
    }

    public RbProfileRole(Long profRoleId) {
        this.profRoleId = profRoleId;
    }

    public RbProfileRole(Long profRoleId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.profRoleId = profRoleId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getProfRoleId() {
        return profRoleId;
    }

    public void setProfRoleId(Long profRoleId) {
        this.profRoleId = profRoleId;
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

    public RbProfile getProfId() {
        return profId;
    }

    public void setProfId(RbProfile profId) {
        this.profId = profId;
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
        hash += (profRoleId != null ? profRoleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbProfileRole)) {
            return false;
        }
        RbProfileRole other = (RbProfileRole) object;
        if ((this.profRoleId == null && other.profRoleId != null) || (this.profRoleId != null && !this.profRoleId.equals(other.profRoleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbProfileRole[ profRoleId=" + profRoleId + " ]";
    }

}
