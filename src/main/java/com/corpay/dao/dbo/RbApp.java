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
@Table(name = "RB_APP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RbApp.findAll", query = "SELECT r FROM RbApp r")})
public class RbApp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APP_ID")
    private Long appId;
    @Basic(optional = false)
    @Column(name = "APP_NM")
    private String appNm;
    @Basic(optional = false)
    @Column(name = "COMM")
    private String comm;
    @Basic(optional = false)
    @Column(name = "CURR_VRSN")
    private String currVrsn;
    @Basic(optional = false)
    @Column(name = "OWNR")
    private String ownr;
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
    @Column(name = "APP_CD")
    private String appCd;
    @JoinColumn(name = "APP_GRP_ID", referencedColumnName = "APP_GRP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbAppGrp appGrpId;
    @JoinColumn(name = "APP_TYP_ID", referencedColumnName = "APP_TYP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbAppType appTypId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appId", fetch = FetchType.LAZY)
    private Set<RbAppMod> rbAppModSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appId", fetch = FetchType.LAZY)
    private Set<RbRole> rbRoleSet;

    public RbApp() {
    }

    public RbApp(Long appId) {
        this.appId = appId;
    }

    public RbApp(Long appId, String appNm, String comm, String currVrsn, String ownr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String appCd) {
        this.appId = appId;
        this.appNm = appNm;
        this.comm = comm;
        this.currVrsn = currVrsn;
        this.ownr = ownr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.appCd = appCd;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getAppNm() {
        return appNm;
    }

    public void setAppNm(String appNm) {
        this.appNm = appNm;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public String getCurrVrsn() {
        return currVrsn;
    }

    public void setCurrVrsn(String currVrsn) {
        this.currVrsn = currVrsn;
    }

    public String getOwnr() {
        return ownr;
    }

    public void setOwnr(String ownr) {
        this.ownr = ownr;
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

    public String getAppCd() {
        return appCd;
    }

    public void setAppCd(String appCd) {
        this.appCd = appCd;
    }

    public RbAppGrp getAppGrpId() {
        return appGrpId;
    }

    public void setAppGrpId(RbAppGrp appGrpId) {
        this.appGrpId = appGrpId;
    }

    public RbAppType getAppTypId() {
        return appTypId;
    }

    public void setAppTypId(RbAppType appTypId) {
        this.appTypId = appTypId;
    }

    public Set<RbAppMod> getRbAppModSet() {
        return rbAppModSet;
    }

    public void setRbAppModSet(Set<RbAppMod> rbAppModSet) {
        this.rbAppModSet = rbAppModSet;
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
        hash += (appId != null ? appId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RbApp)) {
            return false;
        }
        RbApp other = (RbApp) object;
        if ((this.appId == null && other.appId != null) || (this.appId != null && !this.appId.equals(other.appId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbApp[ appId=" + appId + " ]";
    }
    
}
