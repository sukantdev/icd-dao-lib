package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PrdTrnslnkCrdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CHILD_TYP")
    private String childTyp;
    @Basic(optional = false)
    @Column(name = "CRD_TYP")
    private String crdTyp;

    public PrdTrnslnkCrdPK() {
    }

    public PrdTrnslnkCrdPK(String applNbr, String childTyp, String crdTyp) {
        this.applNbr = applNbr;
        this.childTyp = childTyp;
        this.crdTyp = crdTyp;
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

    public String getCrdTyp() {
        return crdTyp;
    }

    public void setCrdTyp(String crdTyp) {
        this.crdTyp = crdTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (childTyp != null ? childTyp.hashCode() : 0);
        hash += (crdTyp != null ? crdTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdTrnslnkCrdPK)) {
            return false;
        }
        PrdTrnslnkCrdPK other = (PrdTrnslnkCrdPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.childTyp == null && other.childTyp != null) || (this.childTyp != null && !this.childTyp.equals(other.childTyp))) {
            return false;
        }
        if ((this.crdTyp == null && other.crdTyp != null) || (this.crdTyp != null && !this.crdTyp.equals(other.crdTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTrnslnkCrdPK[ applNbr=" + applNbr + ", childTyp=" + childTyp + ", crdTyp=" + crdTyp + " ]";
    }

}
