package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrdBinPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_BIN")
    private int crdBin;
    @Basic(optional = false)
    @Column(name = "CRD_TYP")
    private String crdTyp;

    public CrdBinPK() {
    }

    public CrdBinPK(int crdBin, String crdTyp) {
        this.crdBin = crdBin;
        this.crdTyp = crdTyp;
    }

    public int getCrdBin() {
        return crdBin;
    }

    public void setCrdBin(int crdBin) {
        this.crdBin = crdBin;
    }

    public String getCrdTyp() {
        return crdTyp;
    }

    public void setCrdTyp(String crdTyp) {
        this.crdTyp = crdTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) crdBin;
        hash += (crdTyp != null ? crdTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdBinPK)) {
            return false;
        }
        CrdBinPK other = (CrdBinPK) object;
        if (this.crdBin != other.crdBin) {
            return false;
        }
        if ((this.crdTyp == null && other.crdTyp != null) || (this.crdTyp != null && !this.crdTyp.equals(other.crdTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdBinPK[ crdBin=" + crdBin + ", crdTyp=" + crdTyp + " ]";
    }

}
