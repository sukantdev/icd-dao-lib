package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class RefundCrdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "ADD_DT")
    @Temporal(TemporalType.DATE)
    private Date addDt;

    public RefundCrdPK() {
    }

    public RefundCrdPK(String crdNbr, Date addDt) {
        this.crdNbr = crdNbr;
        this.addDt = addDt;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Date getAddDt() {
        return addDt;
    }

    public void setAddDt(Date addDt) {
        this.addDt = addDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        hash += (addDt != null ? addDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RefundCrdPK)) {
            return false;
        }
        RefundCrdPK other = (RefundCrdPK) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        if ((this.addDt == null && other.addDt != null) || (this.addDt != null && !this.addDt.equals(other.addDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RefundCrdPK[ crdNbr=" + crdNbr + ", addDt=" + addDt + " ]";
    }

}
