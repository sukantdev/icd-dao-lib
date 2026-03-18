package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsrLoginInfoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "SCRN_ID")
    private String scrnId;
    @Basic(optional = false)
    @Column(name = "RCD_NBR")
    private int rcdNbr;

    public UsrLoginInfoPK() {
    }

    public UsrLoginInfoPK(String applNbr, String scrnId, int rcdNbr) {
        this.applNbr = applNbr;
        this.scrnId = scrnId;
        this.rcdNbr = rcdNbr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getScrnId() {
        return scrnId;
    }

    public void setScrnId(String scrnId) {
        this.scrnId = scrnId;
    }

    public int getRcdNbr() {
        return rcdNbr;
    }

    public void setRcdNbr(int rcdNbr) {
        this.rcdNbr = rcdNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (scrnId != null ? scrnId.hashCode() : 0);
        hash += (int) rcdNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrLoginInfoPK)) {
            return false;
        }
        UsrLoginInfoPK other = (UsrLoginInfoPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.scrnId == null && other.scrnId != null) || (this.scrnId != null && !this.scrnId.equals(other.scrnId))) {
            return false;
        }
        if (this.rcdNbr != other.rcdNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrLoginInfoPK[ applNbr=" + applNbr + ", scrnId=" + scrnId + ", rcdNbr=" + rcdNbr + " ]";
    }

}
