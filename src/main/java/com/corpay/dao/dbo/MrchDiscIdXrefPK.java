package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MrchDiscIdXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MRCH_CD")
    private String mrchCd;
    @Basic(optional = false)
    @Column(name = "MRCH_TYP_CD")
    private String mrchTypCd;
    @Basic(optional = false)
    @Column(name = "DISC_ID")
    private String discId;

    public MrchDiscIdXrefPK() {
    }

    public MrchDiscIdXrefPK(String mrchCd, String mrchTypCd, String discId) {
        this.mrchCd = mrchCd;
        this.mrchTypCd = mrchTypCd;
        this.discId = discId;
    }

    public String getMrchCd() {
        return mrchCd;
    }

    public void setMrchCd(String mrchCd) {
        this.mrchCd = mrchCd;
    }

    public String getMrchTypCd() {
        return mrchTypCd;
    }

    public void setMrchTypCd(String mrchTypCd) {
        this.mrchTypCd = mrchTypCd;
    }

    public String getDiscId() {
        return discId;
    }

    public void setDiscId(String discId) {
        this.discId = discId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mrchCd != null ? mrchCd.hashCode() : 0);
        hash += (mrchTypCd != null ? mrchTypCd.hashCode() : 0);
        hash += (discId != null ? discId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchDiscIdXrefPK)) {
            return false;
        }
        MrchDiscIdXrefPK other = (MrchDiscIdXrefPK) object;
        if ((this.mrchCd == null && other.mrchCd != null) || (this.mrchCd != null && !this.mrchCd.equals(other.mrchCd))) {
            return false;
        }
        if ((this.mrchTypCd == null && other.mrchTypCd != null) || (this.mrchTypCd != null && !this.mrchTypCd.equals(other.mrchTypCd))) {
            return false;
        }
        if ((this.discId == null && other.discId != null) || (this.discId != null && !this.discId.equals(other.discId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchDiscIdXrefPK[ mrchCd=" + mrchCd + ", mrchTypCd=" + mrchTypCd + ", discId=" + discId + " ]";
    }

}
