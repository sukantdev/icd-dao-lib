package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrApplPrmtCntPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CHILD_TYP")
    private String childTyp;
    @Basic(optional = false)
    @Column(name = "PRMT_TYP")
    private String prmtTyp;

    public CrApplPrmtCntPK() {
    }

    public CrApplPrmtCntPK(String applNbr, String childTyp, String prmtTyp) {
        this.applNbr = applNbr;
        this.childTyp = childTyp;
        this.prmtTyp = prmtTyp;
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

    public String getPrmtTyp() {
        return prmtTyp;
    }

    public void setPrmtTyp(String prmtTyp) {
        this.prmtTyp = prmtTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (childTyp != null ? childTyp.hashCode() : 0);
        hash += (prmtTyp != null ? prmtTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplPrmtCntPK)) {
            return false;
        }
        CrApplPrmtCntPK other = (CrApplPrmtCntPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.childTyp == null && other.childTyp != null) || (this.childTyp != null && !this.childTyp.equals(other.childTyp))) {
            return false;
        }
        if ((this.prmtTyp == null && other.prmtTyp != null) || (this.prmtTyp != null && !this.prmtTyp.equals(other.prmtTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplPrmtCntPK[ applNbr=" + applNbr + ", childTyp=" + childTyp + ", prmtTyp=" + prmtTyp + " ]";
    }

}
