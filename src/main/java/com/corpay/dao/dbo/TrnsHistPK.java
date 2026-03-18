package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class TrnsHistPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "XTN_DT")
    @Temporal(TemporalType.DATE)
    private Date xtnDt;
    @Basic(optional = false)
    @Column(name = "CTL_NBR")
    private int ctlNbr;

    public TrnsHistPK() {
    }

    public TrnsHistPK(Date xtnDt, int ctlNbr) {
        this.xtnDt = xtnDt;
        this.ctlNbr = ctlNbr;
    }

    public Date getXtnDt() {
        return xtnDt;
    }

    public void setXtnDt(Date xtnDt) {
        this.xtnDt = xtnDt;
    }

    public int getCtlNbr() {
        return ctlNbr;
    }

    public void setCtlNbr(int ctlNbr) {
        this.ctlNbr = ctlNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (xtnDt != null ? xtnDt.hashCode() : 0);
        hash += (int) ctlNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TrnsHistPK)) {
            return false;
        }
        TrnsHistPK other = (TrnsHistPK) object;
        if ((this.xtnDt == null && other.xtnDt != null) || (this.xtnDt != null && !this.xtnDt.equals(other.xtnDt))) {
            return false;
        }
        if (this.ctlNbr != other.ctlNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TrnsHistPK[ xtnDt=" + xtnDt + ", ctlNbr=" + ctlNbr + " ]";
    }

}
