package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GenCvcPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_BIN")
    private int crdBin;
    @Basic(optional = false)
    @Column(name = "CRD_STA")
    private long crdSta;

    public GenCvcPK() {
    }

    public GenCvcPK(int crdBin, long crdSta) {
        this.crdBin = crdBin;
        this.crdSta = crdSta;
    }

    public int getCrdBin() {
        return crdBin;
    }

    public void setCrdBin(int crdBin) {
        this.crdBin = crdBin;
    }

    public long getCrdSta() {
        return crdSta;
    }

    public void setCrdSta(long crdSta) {
        this.crdSta = crdSta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) crdBin;
        hash += (int) crdSta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GenCvcPK)) {
            return false;
        }
        GenCvcPK other = (GenCvcPK) object;
        if (this.crdBin != other.crdBin) {
            return false;
        }
        if (this.crdSta != other.crdSta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GenCvcPK[ crdBin=" + crdBin + ", crdSta=" + crdSta + " ]";
    }

}
