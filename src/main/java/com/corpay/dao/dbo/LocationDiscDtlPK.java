package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LocationDiscDtlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "LOC_TYP")
    private String locTyp;
    @Basic(optional = false)
    @Column(name = "DISC_ID")
    private String discId;
    @Basic(optional = false)
    @Column(name = "LOC_SEQ_NBR")
    private short locSeqNbr;

    public LocationDiscDtlPK() {
    }

    public LocationDiscDtlPK(String locCd, String locTyp, String discId, short locSeqNbr) {
        this.locCd = locCd;
        this.locTyp = locTyp;
        this.discId = discId;
        this.locSeqNbr = locSeqNbr;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getLocTyp() {
        return locTyp;
    }

    public void setLocTyp(String locTyp) {
        this.locTyp = locTyp;
    }

    public String getDiscId() {
        return discId;
    }

    public void setDiscId(String discId) {
        this.discId = discId;
    }

    public short getLocSeqNbr() {
        return locSeqNbr;
    }

    public void setLocSeqNbr(short locSeqNbr) {
        this.locSeqNbr = locSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locCd != null ? locCd.hashCode() : 0);
        hash += (locTyp != null ? locTyp.hashCode() : 0);
        hash += (discId != null ? discId.hashCode() : 0);
        hash += (int) locSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof LocationDiscDtlPK)) {
            return false;
        }
        LocationDiscDtlPK other = (LocationDiscDtlPK) object;
        if ((this.locCd == null && other.locCd != null) || (this.locCd != null && !this.locCd.equals(other.locCd))) {
            return false;
        }
        if ((this.locTyp == null && other.locTyp != null) || (this.locTyp != null && !this.locTyp.equals(other.locTyp))) {
            return false;
        }
        if ((this.discId == null && other.discId != null) || (this.discId != null && !this.discId.equals(other.discId))) {
            return false;
        }
        if (this.locSeqNbr != other.locSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.LocationDiscDtlPK[ locCd=" + locCd + ", locTyp=" + locTyp + ", discId=" + discId + ", locSeqNbr=" + locSeqNbr + " ]";
    }

}
