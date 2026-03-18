package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrdTypFrmtPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_TYP")
    private String crdTyp;
    @Basic(optional = false)
    @Column(name = "CRD_FRMT")
    private String crdFrmt;

    public CrdTypFrmtPK() {
    }

    public CrdTypFrmtPK(String crdTyp, String crdFrmt) {
        this.crdTyp = crdTyp;
        this.crdFrmt = crdFrmt;
    }

    public String getCrdTyp() {
        return crdTyp;
    }

    public void setCrdTyp(String crdTyp) {
        this.crdTyp = crdTyp;
    }

    public String getCrdFrmt() {
        return crdFrmt;
    }

    public void setCrdFrmt(String crdFrmt) {
        this.crdFrmt = crdFrmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdTyp != null ? crdTyp.hashCode() : 0);
        hash += (crdFrmt != null ? crdFrmt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdTypFrmtPK)) {
            return false;
        }
        CrdTypFrmtPK other = (CrdTypFrmtPK) object;
        if ((this.crdTyp == null && other.crdTyp != null) || (this.crdTyp != null && !this.crdTyp.equals(other.crdTyp))) {
            return false;
        }
        if ((this.crdFrmt == null && other.crdFrmt != null) || (this.crdFrmt != null && !this.crdFrmt.equals(other.crdFrmt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdTypFrmtPK[ crdTyp=" + crdTyp + ", crdFrmt=" + crdFrmt + " ]";
    }

}
