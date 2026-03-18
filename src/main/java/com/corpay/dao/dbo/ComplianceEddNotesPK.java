package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ComplianceEddNotesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CCH_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cchTs;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public ComplianceEddNotesPK() {
    }

    public ComplianceEddNotesPK(Date cchTs, Date crtTs) {
        this.cchTs = cchTs;
        this.crtTs = crtTs;
    }

    public Date getCchTs() {
        return cchTs;
    }

    public void setCchTs(Date cchTs) {
        this.cchTs = cchTs;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cchTs != null ? cchTs.hashCode() : 0);
        hash += (crtTs != null ? crtTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ComplianceEddNotesPK)) {
            return false;
        }
        ComplianceEddNotesPK other = (ComplianceEddNotesPK) object;
        if ((this.cchTs == null && other.cchTs != null) || (this.cchTs != null && !this.cchTs.equals(other.cchTs))) {
            return false;
        }
        if ((this.crtTs == null && other.crtTs != null) || (this.crtTs != null && !this.crtTs.equals(other.crtTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ComplianceEddNotesPK[ cchTs=" + cchTs + ", crtTs=" + crtTs + " ]";
    }

}
