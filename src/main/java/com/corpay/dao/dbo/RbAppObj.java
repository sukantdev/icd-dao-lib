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
@Table(name = "RB_APP_OBJ", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RbAppObj.findAll", query = "SELECT r FROM RbAppObj r")})
public class RbAppObj implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OBJ_ID")
    private Long objId;
    @Basic(optional = false)
    @Column(name = "OBJ_NM")
    private String objNm;
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
    @Column(name = "OBJ_CD")
    private String objCd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "objId", fetch = FetchType.LAZY)
    private Set<RbPermission> rbPermissionSet;
    @JoinColumn(name = "MOD_ID", referencedColumnName = "MOD_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbAppMod modId;
    @JoinColumn(name = "OBJ_TYP_ID", referencedColumnName = "OBJ_TYP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbAppObjTyp objTypId;

    public RbAppObj() {
    }

    public RbAppObj(Long objId) {
        this.objId = objId;
    }

    public RbAppObj(Long objId, String objNm, String comm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String objCd) {
        this.objId = objId;
        this.objNm = objNm;
        this.comm = comm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.objCd = objCd;
    }

    public Long getObjId() {
        return objId;
    }

    public void setObjId(Long objId) {
        this.objId = objId;
    }

    public String getObjNm() {
        return objNm;
    }

    public void setObjNm(String objNm) {
        this.objNm = objNm;
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

    public String getObjCd() {
        return objCd;
    }

    public void setObjCd(String objCd) {
        this.objCd = objCd;
    }

    public Set<RbPermission> getRbPermissionSet() {
        return rbPermissionSet;
    }

    public void setRbPermissionSet(Set<RbPermission> rbPermissionSet) {
        this.rbPermissionSet = rbPermissionSet;
    }

    public RbAppMod getModId() {
        return modId;
    }

    public void setModId(RbAppMod modId) {
        this.modId = modId;
    }

    public RbAppObjTyp getObjTypId() {
        return objTypId;
    }

    public void setObjTypId(RbAppObjTyp objTypId) {
        this.objTypId = objTypId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (objId != null ? objId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RbAppObj)) {
            return false;
        }
        RbAppObj other = (RbAppObj) object;
        if ((this.objId == null && other.objId != null) || (this.objId != null && !this.objId.equals(other.objId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbAppObj[ objId=" + objId + " ]";
    }
    
}
