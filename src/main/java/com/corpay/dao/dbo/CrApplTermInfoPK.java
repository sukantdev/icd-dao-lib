package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrApplTermInfoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private short seqNbr;

    public CrApplTermInfoPK() {
    }

    public CrApplTermInfoPK(String applNbr, short seqNbr) {
        this.applNbr = applNbr;
        this.seqNbr = seqNbr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public short getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(short seqNbr) {
        this.seqNbr = seqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplTermInfoPK)) {
            return false;
        }
        CrApplTermInfoPK other = (CrApplTermInfoPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplTermInfoPK[ applNbr=" + applNbr + ", seqNbr=" + seqNbr + " ]";
    }

}
