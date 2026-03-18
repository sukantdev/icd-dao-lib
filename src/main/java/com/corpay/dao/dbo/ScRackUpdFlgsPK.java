package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ScRackUpdFlgsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "LOC_TYP")
    private String locTyp;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "SC_RACK_DAY")
    private Character scRackDay;

    public ScRackUpdFlgsPK() {
    }

    public ScRackUpdFlgsPK(String locTyp, String locCd, Character scRackDay) {
        this.locTyp = locTyp;
        this.locCd = locCd;
        this.scRackDay = scRackDay;
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

    public Character getScRackDay() {
        return scRackDay;
    }

    public void setScRackDay(Character scRackDay) {
        this.scRackDay = scRackDay;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locTyp != null ? locTyp.hashCode() : 0);
        hash += (locCd != null ? locCd.hashCode() : 0);
        hash += (scRackDay != null ? scRackDay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ScRackUpdFlgsPK)) {
            return false;
        }
        ScRackUpdFlgsPK other = (ScRackUpdFlgsPK) object;
        if ((this.locTyp == null && other.locTyp != null) || (this.locTyp != null && !this.locTyp.equals(other.locTyp))) {
            return false;
        }
        if ((this.locCd == null && other.locCd != null) || (this.locCd != null && !this.locCd.equals(other.locCd))) {
            return false;
        }
        if ((this.scRackDay == null && other.scRackDay != null) || (this.scRackDay != null && !this.scRackDay.equals(other.scRackDay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ScRackUpdFlgsPK[ locTyp=" + locTyp + ", locCd=" + locCd + ", scRackDay=" + scRackDay + " ]";
    }

}
