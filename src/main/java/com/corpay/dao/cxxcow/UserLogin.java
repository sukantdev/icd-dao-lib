package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USER_LOGIN", catalog = "", schema = "CXXCOW")
public class UserLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserLoginPK userLoginPK;
    @Basic(optional = false)
    @Column(name = "LOGIN_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTs;
    @Basic(optional = false)
    @Column(name = "LAST_LOGIN_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginTs;
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

    public UserLogin() {
    }

    public UserLogin(UserLoginPK userLoginPK) {
        this.userLoginPK = userLoginPK;
    }

    public UserLogin(UserLoginPK userLoginPK, Date loginTs, Date lastLoginTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.userLoginPK = userLoginPK;
        this.loginTs = loginTs;
        this.lastLoginTs = lastLoginTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UserLogin(String userId, String loginTypCd) {
        this.userLoginPK = new UserLoginPK(userId, loginTypCd);
    }

    public UserLoginPK getUserLoginPK() {
        return userLoginPK;
    }

    public void setUserLoginPK(UserLoginPK userLoginPK) {
        this.userLoginPK = userLoginPK;
    }

    public Date getLoginTs() {
        return loginTs;
    }

    public void setLoginTs(Date loginTs) {
        this.loginTs = loginTs;
    }

    public Date getLastLoginTs() {
        return lastLoginTs;
    }

    public void setLastLoginTs(Date lastLoginTs) {
        this.lastLoginTs = lastLoginTs;
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
        hash += (userLoginPK != null ? userLoginPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UserLogin)) {
            return false;
        }
        UserLogin other = (UserLogin) object;
        if ((this.userLoginPK == null && other.userLoginPK != null) || (this.userLoginPK != null && !this.userLoginPK.equals(other.userLoginPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UserLogin[ userLoginPK=" + userLoginPK + " ]";
    }

}
