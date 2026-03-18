package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsrMrchXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "MRCH_CD")
    private String mrchCd;

    public UsrMrchXrefPK() {
    }

    public UsrMrchXrefPK(String usrId, String mrchCd) {
        this.usrId = usrId;
        this.mrchCd = mrchCd;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getMrchCd() {
        return mrchCd;
    }

    public void setMrchCd(String mrchCd) {
        this.mrchCd = mrchCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (mrchCd != null ? mrchCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrMrchXrefPK)) {
            return false;
        }
        UsrMrchXrefPK other = (UsrMrchXrefPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.mrchCd == null && other.mrchCd != null) || (this.mrchCd != null && !this.mrchCd.equals(other.mrchCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrMrchXrefPK[ usrId=" + usrId + ", mrchCd=" + mrchCd + " ]";
    }

}
