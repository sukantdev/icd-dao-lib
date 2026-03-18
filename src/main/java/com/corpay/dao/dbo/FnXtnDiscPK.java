package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class FnXtnDiscPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date trnsDt;
    @Basic(optional = false)
    @Column(name = "CTL_NBR")
    private int ctlNbr;
    @Basic(optional = false)
    @Column(name = "DISC_REB_IND")
    private Character discRebInd;
    @Basic(optional = false)
    @Column(name = "DISC_SEQ")
    private short discSeq;

    public FnXtnDiscPK() {
    }

    public FnXtnDiscPK(Date trnsDt, int ctlNbr, Character discRebInd, short discSeq) {
        this.trnsDt = trnsDt;
        this.ctlNbr = ctlNbr;
        this.discRebInd = discRebInd;
        this.discSeq = discSeq;
    }

    public Date getTrnsDt() {
        return trnsDt;
    }

    public void setTrnsDt(Date trnsDt) {
        this.trnsDt = trnsDt;
    }

    public int getCtlNbr() {
        return ctlNbr;
    }

    public void setCtlNbr(int ctlNbr) {
        this.ctlNbr = ctlNbr;
    }

    public Character getDiscRebInd() {
        return discRebInd;
    }

    public void setDiscRebInd(Character discRebInd) {
        this.discRebInd = discRebInd;
    }

    public short getDiscSeq() {
        return discSeq;
    }

    public void setDiscSeq(short discSeq) {
        this.discSeq = discSeq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnsDt != null ? trnsDt.hashCode() : 0);
        hash += (int) ctlNbr;
        hash += (discRebInd != null ? discRebInd.hashCode() : 0);
        hash += (int) discSeq;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FnXtnDiscPK)) {
            return false;
        }
        FnXtnDiscPK other = (FnXtnDiscPK) object;
        if ((this.trnsDt == null && other.trnsDt != null) || (this.trnsDt != null && !this.trnsDt.equals(other.trnsDt))) {
            return false;
        }
        if (this.ctlNbr != other.ctlNbr) {
            return false;
        }
        if ((this.discRebInd == null && other.discRebInd != null) || (this.discRebInd != null && !this.discRebInd.equals(other.discRebInd))) {
            return false;
        }
        if (this.discSeq != other.discSeq) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnXtnDiscPK[ trnsDt=" + trnsDt + ", ctlNbr=" + ctlNbr + ", discRebInd=" + discRebInd + ", discSeq=" + discSeq + " ]";
    }

}
