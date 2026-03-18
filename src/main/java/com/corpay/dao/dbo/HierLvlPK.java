package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HierLvlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "LVL_NBR")
    private short lvlNbr;

    public HierLvlPK() {
    }

    public HierLvlPK(String hierId, short lvlNbr) {
        this.hierId = hierId;
        this.lvlNbr = lvlNbr;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public short getLvlNbr() {
        return lvlNbr;
    }

    public void setLvlNbr(short lvlNbr) {
        this.lvlNbr = lvlNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierId != null ? hierId.hashCode() : 0);
        hash += (int) lvlNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierLvlPK)) {
            return false;
        }
        HierLvlPK other = (HierLvlPK) object;
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        if (this.lvlNbr != other.lvlNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierLvlPK[ hierId=" + hierId + ", lvlNbr=" + lvlNbr + " ]";
    }

}
