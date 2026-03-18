package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserIpResourcesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;
    @Basic(optional = false)
    @Column(name = "USER_IP")
    private String userIp;

    public UserIpResourcesPK() {
    }

    public UserIpResourcesPK(String userId, String userIp) {
        this.userId = userId;
        this.userIp = userIp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        hash += (userIp != null ? userIp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UserIpResourcesPK)) {
            return false;
        }
        UserIpResourcesPK other = (UserIpResourcesPK) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        if ((this.userIp == null && other.userIp != null) || (this.userIp != null && !this.userIp.equals(other.userIp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UserIpResourcesPK[ userId=" + userId + ", userIp=" + userIp + " ]";
    }

}
