package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PrdCdnCmpltFltPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CHILD_TYP")
    private String childTyp;

    public PrdCdnCmpltFltPK() {
    }

    public PrdCdnCmpltFltPK(String applNbr, String childTyp) {
        this.applNbr = applNbr;
        this.childTyp = childTyp;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getChildTyp() {
        return childTyp;
    }

    public void setChildTyp(String childTyp) {
        this.childTyp = childTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (childTyp != null ? childTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdCdnCmpltFltPK)) {
            return false;
        }
        PrdCdnCmpltFltPK other = (PrdCdnCmpltFltPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.childTyp == null && other.childTyp != null) || (this.childTyp != null && !this.childTyp.equals(other.childTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdCdnCmpltFltPK[ applNbr=" + applNbr + ", childTyp=" + childTyp + " ]";
    }

}
