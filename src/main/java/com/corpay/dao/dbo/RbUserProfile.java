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
@Table(name = "RB_USER_PROFILE", catalog = "", schema = "DBO")
public class RbUserProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_PROF_ID")
    private Long userProfId;
    @Basic(optional = false)
    @Column(name = "LOGIN")
    private String login;
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

    public RbUserProfile() {
    }

    public RbUserProfile(Long userProfId) {
        this.userProfId = userProfId;
    }

    public RbUserProfile(Long userProfId, String login, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.userProfId = userProfId;
        this.login = login;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getUserProfId() {
        return userProfId;
    }

    public void setUserProfId(Long userProfId) {
        this.userProfId = userProfId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userProfId != null ? userProfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbUserProfile)) {
            return false;
        }
        RbUserProfile other = (RbUserProfile) object;
        if ((this.userProfId == null && other.userProfId != null) || (this.userProfId != null && !this.userProfId.equals(other.userProfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbUserProfile[ userProfId=" + userProfId + " ]";
    }

}
