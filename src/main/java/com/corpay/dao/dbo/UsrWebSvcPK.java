package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsrWebSvcPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "WEB_SVC_ID")
    private String webSvcId;

    public UsrWebSvcPK() {
    }

    public UsrWebSvcPK(String usrId, String webSvcId) {
        this.usrId = usrId;
        this.webSvcId = webSvcId;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getWebSvcId() {
        return webSvcId;
    }

    public void setWebSvcId(String webSvcId) {
        this.webSvcId = webSvcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (webSvcId != null ? webSvcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrWebSvcPK)) {
            return false;
        }
        UsrWebSvcPK other = (UsrWebSvcPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.webSvcId == null && other.webSvcId != null) || (this.webSvcId != null && !this.webSvcId.equals(other.webSvcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrWebSvcPK[ usrId=" + usrId + ", webSvcId=" + webSvcId + " ]";
    }

}
