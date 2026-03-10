/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "USERS_DPT", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "UsersDpt.findAll", query = "SELECT u FROM UsersDpt u"),
    @NamedQuery(name = "UsersDpt.findByUsrId", query = "SELECT u FROM UsersDpt u WHERE u.usersDptPK.usrId = :usrId"),
    @NamedQuery(name = "UsersDpt.findByDptId", query = "SELECT u FROM UsersDpt u WHERE u.usersDptPK.dptId = :dptId"),
    @NamedQuery(name = "UsersDpt.findByCrtTs", query = "SELECT u FROM UsersDpt u WHERE u.crtTs = :crtTs"),
    @NamedQuery(name = "UsersDpt.findByCrtUsr", query = "SELECT u FROM UsersDpt u WHERE u.crtUsr = :crtUsr"),
    @NamedQuery(name = "UsersDpt.findByMdyTs", query = "SELECT u FROM UsersDpt u WHERE u.mdyTs = :mdyTs"),
    @NamedQuery(name = "UsersDpt.findByMdyUsr", query = "SELECT u FROM UsersDpt u WHERE u.mdyUsr = :mdyUsr")})
public class UsersDpt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsersDptPK usersDptPK;
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

    public UsersDpt() {
    }

    public UsersDpt(UsersDptPK usersDptPK) {
        this.usersDptPK = usersDptPK;
    }

    public UsersDpt(UsersDptPK usersDptPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usersDptPK = usersDptPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsersDpt(String usrId, String dptId) {
        this.usersDptPK = new UsersDptPK(usrId, dptId);
    }

    public UsersDptPK getUsersDptPK() {
        return usersDptPK;
    }

    public void setUsersDptPK(UsersDptPK usersDptPK) {
        this.usersDptPK = usersDptPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersDptPK != null ? usersDptPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersDpt)) {
            return false;
        }
        UsersDpt other = (UsersDpt) object;
        if ((this.usersDptPK == null && other.usersDptPK != null) || (this.usersDptPK != null && !this.usersDptPK.equals(other.usersDptPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UsersDpt[ usersDptPK=" + usersDptPK + " ]";
    }
    
}
