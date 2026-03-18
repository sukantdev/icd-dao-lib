package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrApplCntctsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CHILD_TYP")
    private String childTyp;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private short seqNbr;
    @Basic(optional = false)
    @Column(name = "CNTCT_TYP")
    private String cntctTyp;

    public CrApplCntctsPK() {
    }

    public CrApplCntctsPK(String applNbr, String childTyp, short seqNbr, String cntctTyp) {
        this.applNbr = applNbr;
        this.childTyp = childTyp;
        this.seqNbr = seqNbr;
        this.cntctTyp = cntctTyp;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getChildTyp() {
        return childTyp;
    }

    public void setChildTyp(String childTyp) {
        this.childTyp = childTyp;
    }

    public short getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(short seqNbr) {
        this.seqNbr = seqNbr;
    }

    public String getCntctTyp() {
        return cntctTyp;
    }

    public void setCntctTyp(String cntctTyp) {
        this.cntctTyp = cntctTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (childTyp != null ? childTyp.hashCode() : 0);
        hash += (int) seqNbr;
        hash += (cntctTyp != null ? cntctTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplCntctsPK)) {
            return false;
        }
        CrApplCntctsPK other = (CrApplCntctsPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.childTyp == null && other.childTyp != null) || (this.childTyp != null && !this.childTyp.equals(other.childTyp))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        if ((this.cntctTyp == null && other.cntctTyp != null) || (this.cntctTyp != null && !this.cntctTyp.equals(other.cntctTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplCntctsPK[ applNbr=" + applNbr + ", childTyp=" + childTyp + ", seqNbr=" + seqNbr + ", cntctTyp=" + cntctTyp + " ]";
    }

}
