package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class CmLegalEntityInfoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CCH_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cchTs;
    @Basic(optional = false)
    @Column(name = "LGL_ENT_TYP_CD")
    private int lglEntTypCd;

    public CmLegalEntityInfoPK() {
    }

    public CmLegalEntityInfoPK(Date cchTs, int lglEntTypCd) {
        this.cchTs = cchTs;
        this.lglEntTypCd = lglEntTypCd;
    }

    public Date getCchTs() {
        return cchTs;
    }

    public void setCchTs(Date cchTs) {
        this.cchTs = cchTs;
    }

    public int getLglEntTypCd() {
        return lglEntTypCd;
    }

    public void setLglEntTypCd(int lglEntTypCd) {
        this.lglEntTypCd = lglEntTypCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cchTs != null ? cchTs.hashCode() : 0);
        hash += (int) lglEntTypCd;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CmLegalEntityInfoPK)) {
            return false;
        }
        CmLegalEntityInfoPK other = (CmLegalEntityInfoPK) object;
        if ((this.cchTs == null && other.cchTs != null) || (this.cchTs != null && !this.cchTs.equals(other.cchTs))) {
            return false;
        }
        if (this.lglEntTypCd != other.lglEntTypCd) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CmLegalEntityInfoPK[ cchTs=" + cchTs + ", lglEntTypCd=" + lglEntTypCd + " ]";
    }

}
