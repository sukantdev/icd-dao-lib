package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PaymentCrdInfoHistPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;

    public PaymentCrdInfoHistPK() {
    }

    public PaymentCrdInfoHistPK(String acctNbr, String crdTknNbr) {
        this.acctNbr = acctNbr;
        this.crdTknNbr = crdTknNbr;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (crdTknNbr != null ? crdTknNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PaymentCrdInfoHistPK)) {
            return false;
        }
        PaymentCrdInfoHistPK other = (PaymentCrdInfoHistPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.crdTknNbr == null && other.crdTknNbr != null) || (this.crdTknNbr != null && !this.crdTknNbr.equals(other.crdTknNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PaymentCrdInfoHistPK[ acctNbr=" + acctNbr + ", crdTknNbr=" + crdTknNbr + " ]";
    }

}
