package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsrRptXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "RPT_NBR")
    private int rptNbr;

    public UsrRptXrefPK() {
    }

    public UsrRptXrefPK(String usrId, int rptNbr) {
        this.usrId = usrId;
        this.rptNbr = rptNbr;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public int getRptNbr() {
        return rptNbr;
    }

    public void setRptNbr(int rptNbr) {
        this.rptNbr = rptNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (int) rptNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrRptXrefPK)) {
            return false;
        }
        UsrRptXrefPK other = (UsrRptXrefPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if (this.rptNbr != other.rptNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrRptXrefPK[ usrId=" + usrId + ", rptNbr=" + rptNbr + " ]";
    }

}
