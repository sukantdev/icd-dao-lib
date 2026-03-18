package com.corpay.dao.cxxcow;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USER_DOWNLOAD", catalog = "", schema = "CXXCOW")
public class UserDownload implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserDownloadPK userDownloadPK;

    public UserDownload() {
    }

    public UserDownload(UserDownloadPK userDownloadPK) {
        this.userDownloadPK = userDownloadPK;
    }

    public UserDownload(String userId, String rsrcId, Date udUptDate) {
        this.userDownloadPK = new UserDownloadPK(userId, rsrcId, udUptDate);
    }

    public UserDownloadPK getUserDownloadPK() {
        return userDownloadPK;
    }

    public void setUserDownloadPK(UserDownloadPK userDownloadPK) {
        this.userDownloadPK = userDownloadPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userDownloadPK != null ? userDownloadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UserDownload)) {
            return false;
        }
        UserDownload other = (UserDownload) object;
        if ((this.userDownloadPK == null && other.userDownloadPK != null) || (this.userDownloadPK != null && !this.userDownloadPK.equals(other.userDownloadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UserDownload[ userDownloadPK=" + userDownloadPK + " ]";
    }

}
