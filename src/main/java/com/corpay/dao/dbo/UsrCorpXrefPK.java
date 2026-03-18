package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsrCorpXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "CORP_CD")
    private String corpCd;

    public UsrCorpXrefPK() {
    }

    public UsrCorpXrefPK(String usrId, String corpCd) {
        this.usrId = usrId;
        this.corpCd = corpCd;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getCorpCd() {
        return corpCd;
    }

    public void setCorpCd(String corpCd) {
        this.corpCd = corpCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (corpCd != null ? corpCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrCorpXrefPK)) {
            return false;
        }
        UsrCorpXrefPK other = (UsrCorpXrefPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.corpCd == null && other.corpCd != null) || (this.corpCd != null && !this.corpCd.equals(other.corpCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrCorpXrefPK[ usrId=" + usrId + ", corpCd=" + corpCd + " ]";
    }

}
