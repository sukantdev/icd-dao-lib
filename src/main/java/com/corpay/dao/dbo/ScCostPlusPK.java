package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ScCostPlusPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "LOC_TYP")
    private String locTyp;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;

    public ScCostPlusPK() {
    }

    public ScCostPlusPK(String locTyp, String locCd) {
        this.locTyp = locTyp;
        this.locCd = locCd;
    }

    public String getLocTyp() {
        return locTyp;
    }

    public void setLocTyp(String locTyp) {
        this.locTyp = locTyp;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locTyp != null ? locTyp.hashCode() : 0);
        hash += (locCd != null ? locCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ScCostPlusPK)) {
            return false;
        }
        ScCostPlusPK other = (ScCostPlusPK) object;
        if ((this.locTyp == null && other.locTyp != null) || (this.locTyp != null && !this.locTyp.equals(other.locTyp))) {
            return false;
        }
        if ((this.locCd == null && other.locCd != null) || (this.locCd != null && !this.locCd.equals(other.locCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ScCostPlusPK[ locTyp=" + locTyp + ", locCd=" + locCd + " ]";
    }

}
