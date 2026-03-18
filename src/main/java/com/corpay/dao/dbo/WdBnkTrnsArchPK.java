package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class WdBnkTrnsArchPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BT_PMT_NBR")
    private int btPmtNbr;
    @Basic(optional = false)
    @Column(name = "BT_TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date btTrnsDt;

    public WdBnkTrnsArchPK() {
    }

    public WdBnkTrnsArchPK(int btPmtNbr, Date btTrnsDt) {
        this.btPmtNbr = btPmtNbr;
        this.btTrnsDt = btTrnsDt;
    }

    public int getBtPmtNbr() {
        return btPmtNbr;
    }

    public void setBtPmtNbr(int btPmtNbr) {
        this.btPmtNbr = btPmtNbr;
    }

    public Date getBtTrnsDt() {
        return btTrnsDt;
    }

    public void setBtTrnsDt(Date btTrnsDt) {
        this.btTrnsDt = btTrnsDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) btPmtNbr;
        hash += (btTrnsDt != null ? btTrnsDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof WdBnkTrnsArchPK)) {
            return false;
        }
        WdBnkTrnsArchPK other = (WdBnkTrnsArchPK) object;
        if (this.btPmtNbr != other.btPmtNbr) {
            return false;
        }
        if ((this.btTrnsDt == null && other.btTrnsDt != null) || (this.btTrnsDt != null && !this.btTrnsDt.equals(other.btTrnsDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.WdBnkTrnsArchPK[ btPmtNbr=" + btPmtNbr + ", btTrnsDt=" + btTrnsDt + " ]";
    }

}
