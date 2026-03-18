package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsrEbpacctXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;

    public UsrEbpacctXrefPK() {
    }

    public UsrEbpacctXrefPK(String usrId, String acctNbr) {
        this.usrId = usrId;
        this.acctNbr = acctNbr;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrEbpacctXrefPK)) {
            return false;
        }
        UsrEbpacctXrefPK other = (UsrEbpacctXrefPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrEbpacctXrefPK[ usrId=" + usrId + ", acctNbr=" + acctNbr + " ]";
    }

}
