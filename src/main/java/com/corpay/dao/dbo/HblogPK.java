package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class HblogPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "STA_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date staTs;
    @Basic(optional = false)
    @Column(name = "CICS_EIBTASKN_NBR")
    private int cicsEibtasknNbr;

    public HblogPK() {
    }

    public HblogPK(Date staTs, int cicsEibtasknNbr) {
        this.staTs = staTs;
        this.cicsEibtasknNbr = cicsEibtasknNbr;
    }

    public Date getStaTs() {
        return staTs;
    }

    public void setStaTs(Date staTs) {
        this.staTs = staTs;
    }

    public int getCicsEibtasknNbr() {
        return cicsEibtasknNbr;
    }

    public void setCicsEibtasknNbr(int cicsEibtasknNbr) {
        this.cicsEibtasknNbr = cicsEibtasknNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staTs != null ? staTs.hashCode() : 0);
        hash += (int) cicsEibtasknNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HblogPK)) {
            return false;
        }
        HblogPK other = (HblogPK) object;
        if ((this.staTs == null && other.staTs != null) || (this.staTs != null && !this.staTs.equals(other.staTs))) {
            return false;
        }
        if (this.cicsEibtasknNbr != other.cicsEibtasknNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HblogPK[ staTs=" + staTs + ", cicsEibtasknNbr=" + cicsEibtasknNbr + " ]";
    }

}
