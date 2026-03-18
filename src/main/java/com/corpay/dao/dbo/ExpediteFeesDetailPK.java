package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ExpediteFeesDetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "EFD_CRD_NBR")
    private String efdCrdNbr;
    @Basic(optional = false)
    @Column(name = "EFD_REQUEST_DATE")
    private String efdRequestDate;

    public ExpediteFeesDetailPK() {
    }

    public ExpediteFeesDetailPK(String efdCrdNbr, String efdRequestDate) {
        this.efdCrdNbr = efdCrdNbr;
        this.efdRequestDate = efdRequestDate;
    }

    public String getEfdCrdNbr() {
        return efdCrdNbr;
    }

    public void setEfdCrdNbr(String efdCrdNbr) {
        this.efdCrdNbr = efdCrdNbr;
    }

    public String getEfdRequestDate() {
        return efdRequestDate;
    }

    public void setEfdRequestDate(String efdRequestDate) {
        this.efdRequestDate = efdRequestDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (efdCrdNbr != null ? efdCrdNbr.hashCode() : 0);
        hash += (efdRequestDate != null ? efdRequestDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ExpediteFeesDetailPK)) {
            return false;
        }
        ExpediteFeesDetailPK other = (ExpediteFeesDetailPK) object;
        if ((this.efdCrdNbr == null && other.efdCrdNbr != null) || (this.efdCrdNbr != null && !this.efdCrdNbr.equals(other.efdCrdNbr))) {
            return false;
        }
        if ((this.efdRequestDate == null && other.efdRequestDate != null) || (this.efdRequestDate != null && !this.efdRequestDate.equals(other.efdRequestDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ExpediteFeesDetailPK[ efdCrdNbr=" + efdCrdNbr + ", efdRequestDate=" + efdRequestDate + " ]";
    }

}
