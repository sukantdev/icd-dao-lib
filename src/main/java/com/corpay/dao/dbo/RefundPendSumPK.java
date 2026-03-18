package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class RefundPendSumPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "ADD_DT")
    @Temporal(TemporalType.DATE)
    private Date addDt;

    public RefundPendSumPK() {
    }

    public RefundPendSumPK(String acctNbr, Date addDt) {
        this.acctNbr = acctNbr;
        this.addDt = addDt;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
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
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (addDt != null ? addDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RefundPendSumPK)) {
            return false;
        }
        RefundPendSumPK other = (RefundPendSumPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.addDt == null && other.addDt != null) || (this.addDt != null && !this.addDt.equals(other.addDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RefundPendSumPK[ acctNbr=" + acctNbr + ", addDt=" + addDt + " ]";
    }

}
