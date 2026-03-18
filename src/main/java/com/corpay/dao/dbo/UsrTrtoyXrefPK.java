package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsrTrtoyXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "TRTOY_CD")
    private String trtoyCd;

    public UsrTrtoyXrefPK() {
    }

    public UsrTrtoyXrefPK(String usrId, String trtoyCd) {
        this.usrId = usrId;
        this.trtoyCd = trtoyCd;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getTrtoyCd() {
        return trtoyCd;
    }

    public void setTrtoyCd(String trtoyCd) {
        this.trtoyCd = trtoyCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (trtoyCd != null ? trtoyCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrTrtoyXrefPK)) {
            return false;
        }
        UsrTrtoyXrefPK other = (UsrTrtoyXrefPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.trtoyCd == null && other.trtoyCd != null) || (this.trtoyCd != null && !this.trtoyCd.equals(other.trtoyCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrTrtoyXrefPK[ usrId=" + usrId + ", trtoyCd=" + trtoyCd + " ]";
    }

}
