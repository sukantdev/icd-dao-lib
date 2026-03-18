package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsrUsrXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "OTHR_USR_ID")
    private String othrUsrId;

    public UsrUsrXrefPK() {
    }

    public UsrUsrXrefPK(String usrId, String othrUsrId) {
        this.usrId = usrId;
        this.othrUsrId = othrUsrId;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getOthrUsrId() {
        return othrUsrId;
    }

    public void setOthrUsrId(String othrUsrId) {
        this.othrUsrId = othrUsrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (othrUsrId != null ? othrUsrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrUsrXrefPK)) {
            return false;
        }
        UsrUsrXrefPK other = (UsrUsrXrefPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.othrUsrId == null && other.othrUsrId != null) || (this.othrUsrId != null && !this.othrUsrId.equals(other.othrUsrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrUsrXrefPK[ usrId=" + usrId + ", othrUsrId=" + othrUsrId + " ]";
    }

}
