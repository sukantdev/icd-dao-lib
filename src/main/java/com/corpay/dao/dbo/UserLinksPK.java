package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserLinksPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;
    @Basic(optional = false)
    @Column(name = "LINK_RSRC_ID")
    private int linkRsrcId;

    public UserLinksPK() {
    }

    public UserLinksPK(String userId, int linkRsrcId) {
        this.userId = userId;
        this.linkRsrcId = linkRsrcId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLinkRsrcId() {
        return linkRsrcId;
    }

    public void setLinkRsrcId(int linkRsrcId) {
        this.linkRsrcId = linkRsrcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        hash += (int) linkRsrcId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UserLinksPK)) {
            return false;
        }
        UserLinksPK other = (UserLinksPK) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        if (this.linkRsrcId != other.linkRsrcId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UserLinksPK[ userId=" + userId + ", linkRsrcId=" + linkRsrcId + " ]";
    }

}
