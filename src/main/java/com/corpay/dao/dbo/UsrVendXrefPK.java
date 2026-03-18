package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsrVendXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "VEND_ID")
    private String vendId;

    public UsrVendXrefPK() {
    }

    public UsrVendXrefPK(String usrId, String vendId) {
        this.usrId = usrId;
        this.vendId = vendId;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getVendId() {
        return vendId;
    }

    public void setVendId(String vendId) {
        this.vendId = vendId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (vendId != null ? vendId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrVendXrefPK)) {
            return false;
        }
        UsrVendXrefPK other = (UsrVendXrefPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.vendId == null && other.vendId != null) || (this.vendId != null && !this.vendId.equals(other.vendId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrVendXrefPK[ usrId=" + usrId + ", vendId=" + vendId + " ]";
    }

}
