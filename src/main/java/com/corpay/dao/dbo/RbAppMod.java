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
import jakarta.persistence.OneToOne;
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
@Table(name = "RB_APP_MOD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RbAppMod.findAll", query = "SELECT r FROM RbAppMod r")})
public class RbAppMod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MOD_ID")
    private Long modId;
    @Basic(optional = false)
    @Column(name = "MOD_NM")
    private String modNm;
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
    @Column(name = "MOD_CD")
    private String modCd;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "rbAppMod", fetch = FetchType.LAZY)
    private RbModBill rbModBill;
    @JoinColumn(name = "APP_ID", referencedColumnName = "APP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbApp appId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modId", fetch = FetchType.LAZY)
    private Set<RbSubscription> rbSubscriptionSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modId", fetch = FetchType.LAZY)
    private Set<RbAppObj> rbAppObjSet;

    public RbAppMod() {
    }

    public RbAppMod(Long modId) {
        this.modId = modId;
    }

    public RbAppMod(Long modId, String modNm, String comm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String modCd) {
        this.modId = modId;
        this.modNm = modNm;
        this.comm = comm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.modCd = modCd;
    }

    public Long getModId() {
        return modId;
    }

    public void setModId(Long modId) {
        this.modId = modId;
    }

    public String getModNm() {
        return modNm;
    }

    public void setModNm(String modNm) {
        this.modNm = modNm;
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

    public String getModCd() {
        return modCd;
    }

    public void setModCd(String modCd) {
        this.modCd = modCd;
    }

    public RbModBill getRbModBill() {
        return rbModBill;
    }

    public void setRbModBill(RbModBill rbModBill) {
        this.rbModBill = rbModBill;
    }

    public RbApp getAppId() {
        return appId;
    }

    public void setAppId(RbApp appId) {
        this.appId = appId;
    }

    public Set<RbSubscription> getRbSubscriptionSet() {
        return rbSubscriptionSet;
    }

    public void setRbSubscriptionSet(Set<RbSubscription> rbSubscriptionSet) {
        this.rbSubscriptionSet = rbSubscriptionSet;
    }

    public Set<RbAppObj> getRbAppObjSet() {
        return rbAppObjSet;
    }

    public void setRbAppObjSet(Set<RbAppObj> rbAppObjSet) {
        this.rbAppObjSet = rbAppObjSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modId != null ? modId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RbAppMod)) {
            return false;
        }
        RbAppMod other = (RbAppMod) object;
        if ((this.modId == null && other.modId != null) || (this.modId != null && !this.modId.equals(other.modId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbAppMod[ modId=" + modId + " ]";
    }
    
}
