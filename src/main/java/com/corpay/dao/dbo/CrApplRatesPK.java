package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrApplRatesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CHILD_TYP")
    private String childTyp;
    @Basic(optional = false)
    @Column(name = "TYP")
    private String typ;
    @Basic(optional = false)
    @Column(name = "GRP")
    private String grp;

    public CrApplRatesPK() {
    }

    public CrApplRatesPK(String applNbr, String childTyp, String typ, String grp) {
        this.applNbr = applNbr;
        this.childTyp = childTyp;
        this.typ = typ;
        this.grp = grp;
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

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getGrp() {
        return grp;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (childTyp != null ? childTyp.hashCode() : 0);
        hash += (typ != null ? typ.hashCode() : 0);
        hash += (grp != null ? grp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplRatesPK)) {
            return false;
        }
        CrApplRatesPK other = (CrApplRatesPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.childTyp == null && other.childTyp != null) || (this.childTyp != null && !this.childTyp.equals(other.childTyp))) {
            return false;
        }
        if ((this.typ == null && other.typ != null) || (this.typ != null && !this.typ.equals(other.typ))) {
            return false;
        }
        if ((this.grp == null && other.grp != null) || (this.grp != null && !this.grp.equals(other.grp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplRatesPK[ applNbr=" + applNbr + ", childTyp=" + childTyp + ", typ=" + typ + ", grp=" + grp + " ]";
    }

}
