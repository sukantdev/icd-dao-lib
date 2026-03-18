package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsersResourcesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "RSRC_ID")
    private String rsrcId;
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;

    public UsersResourcesPK() {
    }

    public UsersResourcesPK(String rsrcId, String userId) {
        this.rsrcId = rsrcId;
        this.userId = userId;
    }

    public String getRsrcId() {
        return rsrcId;
    }

    public void setRsrcId(String rsrcId) {
        this.rsrcId = rsrcId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rsrcId != null ? rsrcId.hashCode() : 0);
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsersResourcesPK)) {
            return false;
        }
        UsersResourcesPK other = (UsersResourcesPK) object;
        if ((this.rsrcId == null && other.rsrcId != null) || (this.rsrcId != null && !this.rsrcId.equals(other.rsrcId))) {
            return false;
        }
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UsersResourcesPK[ rsrcId=" + rsrcId + ", userId=" + userId + " ]";
    }

}
