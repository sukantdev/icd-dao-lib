package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrApplAnlCstPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CHILD_TYP")
    private String childTyp;
    @Basic(optional = false)
    @Column(name = "CST_TYP")
    private Character cstTyp;

    public CrApplAnlCstPK() {
    }

    public CrApplAnlCstPK(String applNbr, String childTyp, Character cstTyp) {
        this.applNbr = applNbr;
        this.childTyp = childTyp;
        this.cstTyp = cstTyp;
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

    public Character getCstTyp() {
        return cstTyp;
    }

    public void setCstTyp(Character cstTyp) {
        this.cstTyp = cstTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (childTyp != null ? childTyp.hashCode() : 0);
        hash += (cstTyp != null ? cstTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplAnlCstPK)) {
            return false;
        }
        CrApplAnlCstPK other = (CrApplAnlCstPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.childTyp == null && other.childTyp != null) || (this.childTyp != null && !this.childTyp.equals(other.childTyp))) {
            return false;
        }
        if ((this.cstTyp == null && other.cstTyp != null) || (this.cstTyp != null && !this.cstTyp.equals(other.cstTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplAnlCstPK[ applNbr=" + applNbr + ", childTyp=" + childTyp + ", cstTyp=" + cstTyp + " ]";
    }

}
