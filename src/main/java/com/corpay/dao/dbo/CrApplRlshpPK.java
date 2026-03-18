package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrApplRlshpPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "SEQ")
    private short seq;

    public CrApplRlshpPK() {
    }

    public CrApplRlshpPK(String applNbr, short seq) {
        this.applNbr = applNbr;
        this.seq = seq;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public short getSeq() {
        return seq;
    }

    public void setSeq(short seq) {
        this.seq = seq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (int) seq;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplRlshpPK)) {
            return false;
        }
        CrApplRlshpPK other = (CrApplRlshpPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if (this.seq != other.seq) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplRlshpPK[ applNbr=" + applNbr + ", seq=" + seq + " ]";
    }

}
