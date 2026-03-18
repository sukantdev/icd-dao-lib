package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Ach3rdPartyBankPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "BANK_ACCT_NBR")
    private String bankAcctNbr;
    @Basic(optional = false)
    @Column(name = "BANK_ROUTING_NBR")
    private String bankRoutingNbr;

    public Ach3rdPartyBankPK() {
    }

    public Ach3rdPartyBankPK(String acctNbr, String bankAcctNbr, String bankRoutingNbr) {
        this.acctNbr = acctNbr;
        this.bankAcctNbr = bankAcctNbr;
        this.bankRoutingNbr = bankRoutingNbr;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getBankAcctNbr() {
        return bankAcctNbr;
    }

    public void setBankAcctNbr(String bankAcctNbr) {
        this.bankAcctNbr = bankAcctNbr;
    }

    public String getBankRoutingNbr() {
        return bankRoutingNbr;
    }

    public void setBankRoutingNbr(String bankRoutingNbr) {
        this.bankRoutingNbr = bankRoutingNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (bankAcctNbr != null ? bankAcctNbr.hashCode() : 0);
        hash += (bankRoutingNbr != null ? bankRoutingNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Ach3rdPartyBankPK)) {
            return false;
        }
        Ach3rdPartyBankPK other = (Ach3rdPartyBankPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.bankAcctNbr == null && other.bankAcctNbr != null) || (this.bankAcctNbr != null && !this.bankAcctNbr.equals(other.bankAcctNbr))) {
            return false;
        }
        if ((this.bankRoutingNbr == null && other.bankRoutingNbr != null) || (this.bankRoutingNbr != null && !this.bankRoutingNbr.equals(other.bankRoutingNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Ach3rdPartyBankPK[ acctNbr=" + acctNbr + ", bankAcctNbr=" + bankAcctNbr + ", bankRoutingNbr=" + bankRoutingNbr + " ]";
    }

}
