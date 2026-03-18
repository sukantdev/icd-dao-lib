package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HierScyPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SCY_TP_CD")
    private Character scyTpCd;
    @Basic(optional = false)
    @Column(name = "SCY_KEY")
    private String scyKey;

    public HierScyPK() {
    }

    public HierScyPK(Character scyTpCd, String scyKey) {
        this.scyTpCd = scyTpCd;
        this.scyKey = scyKey;
    }

    public Character getScyTpCd() {
        return scyTpCd;
    }

    public void setScyTpCd(Character scyTpCd) {
        this.scyTpCd = scyTpCd;
    }

    public String getScyKey() {
        return scyKey;
    }

    public void setScyKey(String scyKey) {
        this.scyKey = scyKey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scyTpCd != null ? scyTpCd.hashCode() : 0);
        hash += (scyKey != null ? scyKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierScyPK)) {
            return false;
        }
        HierScyPK other = (HierScyPK) object;
        if ((this.scyTpCd == null && other.scyTpCd != null) || (this.scyTpCd != null && !this.scyTpCd.equals(other.scyTpCd))) {
            return false;
        }
        if ((this.scyKey == null && other.scyKey != null) || (this.scyKey != null && !this.scyKey.equals(other.scyKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierScyPK[ scyTpCd=" + scyTpCd + ", scyKey=" + scyKey + " ]";
    }

}
