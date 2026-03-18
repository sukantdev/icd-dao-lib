package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "RB_ROLE_TYP", catalog = "", schema = "DBO")
public class RbRoleTyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROLE_TYP_ID")
    private Long roleTypId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYP_NM")
    private String roleTypNm;
    @Basic(optional = false)
    @Column(name = "COMM")
    private String comm;
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
    @Column(name = "ROLE_TYP_CD")
    private String roleTypCd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleTypId", fetch = FetchType.LAZY)
    private Set<RbRole> rbRoleSet;

    public RbRoleTyp() {
    }

    public RbRoleTyp(Long roleTypId) {
        this.roleTypId = roleTypId;
    }

    public RbRoleTyp(Long roleTypId, String roleTypNm, String comm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String roleTypCd) {
        this.roleTypId = roleTypId;
        this.roleTypNm = roleTypNm;
        this.comm = comm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.roleTypCd = roleTypCd;
    }

    public Long getRoleTypId() {
        return roleTypId;
    }

    public void setRoleTypId(Long roleTypId) {
        this.roleTypId = roleTypId;
    }

    public String getRoleTypNm() {
        return roleTypNm;
    }

    public void setRoleTypNm(String roleTypNm) {
        this.roleTypNm = roleTypNm;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
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

    public String getRoleTypCd() {
        return roleTypCd;
    }

    public void setRoleTypCd(String roleTypCd) {
        this.roleTypCd = roleTypCd;
    }

    public Set<RbRole> getRbRoleSet() {
        return rbRoleSet;
    }

    public void setRbRoleSet(Set<RbRole> rbRoleSet) {
        this.rbRoleSet = rbRoleSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleTypId != null ? roleTypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbRoleTyp)) {
            return false;
        }
        RbRoleTyp other = (RbRoleTyp) object;
        if ((this.roleTypId == null && other.roleTypId != null) || (this.roleTypId != null && !this.roleTypId.equals(other.roleTypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbRoleTyp[ roleTypId=" + roleTypId + " ]";
    }

}
