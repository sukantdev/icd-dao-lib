package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MccGrpXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "GRP")
    private short grp;
    @Basic(optional = false)
    @Column(name = "MCC")
    private int mcc;

    public MccGrpXrefPK() {
    }

    public MccGrpXrefPK(short grp, int mcc) {
        this.grp = grp;
        this.mcc = mcc;
    }

    public short getGrp() {
        return grp;
    }

    public void setGrp(short grp) {
        this.grp = grp;
    }

    public int getMcc() {
        return mcc;
    }

    public void setMcc(int mcc) {
        this.mcc = mcc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) grp;
        hash += (int) mcc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MccGrpXrefPK)) {
            return false;
        }
        MccGrpXrefPK other = (MccGrpXrefPK) object;
        if (this.grp != other.grp) {
            return false;
        }
        if (this.mcc != other.mcc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MccGrpXrefPK[ grp=" + grp + ", mcc=" + mcc + " ]";
    }

}
