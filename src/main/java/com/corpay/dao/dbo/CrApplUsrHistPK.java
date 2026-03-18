package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class CrApplUsrHistPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "SAVED_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date savedDt;

    public CrApplUsrHistPK() {
    }

    public CrApplUsrHistPK(String usrId, String applNbr, Date savedDt) {
        this.usrId = usrId;
        this.applNbr = applNbr;
        this.savedDt = savedDt;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public Date getSavedDt() {
        return savedDt;
    }

    public void setSavedDt(Date savedDt) {
        this.savedDt = savedDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (savedDt != null ? savedDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplUsrHistPK)) {
            return false;
        }
        CrApplUsrHistPK other = (CrApplUsrHistPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.savedDt == null && other.savedDt != null) || (this.savedDt != null && !this.savedDt.equals(other.savedDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplUsrHistPK[ usrId=" + usrId + ", applNbr=" + applNbr + ", savedDt=" + savedDt + " ]";
    }

}
