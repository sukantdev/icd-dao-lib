package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class PrmHistLoadsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PERM_HIST_CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date permHistCrtTs;
    @Basic(optional = false)
    @Column(name = "REF_NBR")
    private int refNbr;

    public PrmHistLoadsPK() {
    }

    public PrmHistLoadsPK(Date permHistCrtTs, int refNbr) {
        this.permHistCrtTs = permHistCrtTs;
        this.refNbr = refNbr;
    }

    public Date getPermHistCrtTs() {
        return permHistCrtTs;
    }

    public void setPermHistCrtTs(Date permHistCrtTs) {
        this.permHistCrtTs = permHistCrtTs;
    }

    public int getRefNbr() {
        return refNbr;
    }

    public void setRefNbr(int refNbr) {
        this.refNbr = refNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permHistCrtTs != null ? permHistCrtTs.hashCode() : 0);
        hash += (int) refNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrmHistLoadsPK)) {
            return false;
        }
        PrmHistLoadsPK other = (PrmHistLoadsPK) object;
        if ((this.permHistCrtTs == null && other.permHistCrtTs != null) || (this.permHistCrtTs != null && !this.permHistCrtTs.equals(other.permHistCrtTs))) {
            return false;
        }
        if (this.refNbr != other.refNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrmHistLoadsPK[ permHistCrtTs=" + permHistCrtTs + ", refNbr=" + refNbr + " ]";
    }

}
