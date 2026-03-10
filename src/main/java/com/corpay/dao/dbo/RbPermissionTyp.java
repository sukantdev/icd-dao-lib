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
@Table(name = "RB_PERMISSION_TYP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RbPermissionTyp.findAll", query = "SELECT r FROM RbPermissionTyp r")})
public class RbPermissionTyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PERM_TYP_ID")
    private Long permTypId;
    @Basic(optional = false)
    @Column(name = "PERM_TYP_NM")
    private String permTypNm;
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
    @Column(name = "PERM_TYP_CD")
    private String permTypCd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permTypId", fetch = FetchType.LAZY)
    private Set<RbPermission> rbPermissionSet;

    public RbPermissionTyp() {
    }

    public RbPermissionTyp(Long permTypId) {
        this.permTypId = permTypId;
    }

    public RbPermissionTyp(Long permTypId, String permTypNm, String comm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String permTypCd) {
        this.permTypId = permTypId;
        this.permTypNm = permTypNm;
        this.comm = comm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.permTypCd = permTypCd;
    }

    public Long getPermTypId() {
        return permTypId;
    }

    public void setPermTypId(Long permTypId) {
        this.permTypId = permTypId;
    }

    public String getPermTypNm() {
        return permTypNm;
    }

    public void setPermTypNm(String permTypNm) {
        this.permTypNm = permTypNm;
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

    public String getPermTypCd() {
        return permTypCd;
    }

    public void setPermTypCd(String permTypCd) {
        this.permTypCd = permTypCd;
    }

    public Set<RbPermission> getRbPermissionSet() {
        return rbPermissionSet;
    }

    public void setRbPermissionSet(Set<RbPermission> rbPermissionSet) {
        this.rbPermissionSet = rbPermissionSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permTypId != null ? permTypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RbPermissionTyp)) {
            return false;
        }
        RbPermissionTyp other = (RbPermissionTyp) object;
        if ((this.permTypId == null && other.permTypId != null) || (this.permTypId != null && !this.permTypId.equals(other.permTypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbPermissionTyp[ permTypId=" + permTypId + " ]";
    }
    
}
