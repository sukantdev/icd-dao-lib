package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class UserDownloadPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;
    @Basic(optional = false)
    @Column(name = "RSRC_ID")
    private String rsrcId;
    @Basic(optional = false)
    @Column(name = "UD_UPT_DATE")
    @Temporal(TemporalType.DATE)
    private Date udUptDate;

    public UserDownloadPK() {
    }

    public UserDownloadPK(String userId, String rsrcId, Date udUptDate) {
        this.userId = userId;
        this.rsrcId = rsrcId;
        this.udUptDate = udUptDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRsrcId() {
        return rsrcId;
    }

    public void setRsrcId(String rsrcId) {
        this.rsrcId = rsrcId;
    }

    public Date getUdUptDate() {
        return udUptDate;
    }

    public void setUdUptDate(Date udUptDate) {
        this.udUptDate = udUptDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        hash += (rsrcId != null ? rsrcId.hashCode() : 0);
        hash += (udUptDate != null ? udUptDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UserDownloadPK)) {
            return false;
        }
        UserDownloadPK other = (UserDownloadPK) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        if ((this.rsrcId == null && other.rsrcId != null) || (this.rsrcId != null && !this.rsrcId.equals(other.rsrcId))) {
            return false;
        }
        if ((this.udUptDate == null && other.udUptDate != null) || (this.udUptDate != null && !this.udUptDate.equals(other.udUptDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UserDownloadPK[ userId=" + userId + ", rsrcId=" + rsrcId + ", udUptDate=" + udUptDate + " ]";
    }

}
