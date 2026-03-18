package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrApplCustIdCdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "APPL_SCRN_ID")
    private String applScrnId;
    @Basic(optional = false)
    @Column(name = "APPL_RCD_ID")
    private int applRcdId;

    public CrApplCustIdCdPK() {
    }

    public CrApplCustIdCdPK(String applNbr, String applScrnId, int applRcdId) {
        this.applNbr = applNbr;
        this.applScrnId = applScrnId;
        this.applRcdId = applRcdId;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getApplScrnId() {
        return applScrnId;
    }

    public void setApplScrnId(String applScrnId) {
        this.applScrnId = applScrnId;
    }

    public int getApplRcdId() {
        return applRcdId;
    }

    public void setApplRcdId(int applRcdId) {
        this.applRcdId = applRcdId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (applScrnId != null ? applScrnId.hashCode() : 0);
        hash += (int) applRcdId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplCustIdCdPK)) {
            return false;
        }
        CrApplCustIdCdPK other = (CrApplCustIdCdPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.applScrnId == null && other.applScrnId != null) || (this.applScrnId != null && !this.applScrnId.equals(other.applScrnId))) {
            return false;
        }
        if (this.applRcdId != other.applRcdId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplCustIdCdPK[ applNbr=" + applNbr + ", applScrnId=" + applScrnId + ", applRcdId=" + applRcdId + " ]";
    }

}
