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
@Table(name = "USER_IP_RESOURCES", catalog = "", schema = "CXXCOW")
public class UserIpResources implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserIpResourcesPK userIpResourcesPK;
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

    public UserIpResources() {
    }

    public UserIpResources(UserIpResourcesPK userIpResourcesPK) {
        this.userIpResourcesPK = userIpResourcesPK;
    }

    public UserIpResources(UserIpResourcesPK userIpResourcesPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.userIpResourcesPK = userIpResourcesPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UserIpResources(String userId, String userIp) {
        this.userIpResourcesPK = new UserIpResourcesPK(userId, userIp);
    }

    public UserIpResourcesPK getUserIpResourcesPK() {
        return userIpResourcesPK;
    }

    public void setUserIpResourcesPK(UserIpResourcesPK userIpResourcesPK) {
        this.userIpResourcesPK = userIpResourcesPK;
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
        hash += (userIpResourcesPK != null ? userIpResourcesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UserIpResources)) {
            return false;
        }
        UserIpResources other = (UserIpResources) object;
        if ((this.userIpResourcesPK == null && other.userIpResourcesPK != null) || (this.userIpResourcesPK != null && !this.userIpResourcesPK.equals(other.userIpResourcesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UserIpResources[ userIpResourcesPK=" + userIpResourcesPK + " ]";
    }

}
