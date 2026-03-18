package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AcctCorpXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CORP_CD")
    private String corpCd;

    public AcctCorpXrefPK() {
    }

    public AcctCorpXrefPK(String acctNbr, String corpCd) {
        this.acctNbr = acctNbr;
        this.corpCd = corpCd;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCorpCd() {
        return corpCd;
    }

    public void setCorpCd(String corpCd) {
        this.corpCd = corpCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (corpCd != null ? corpCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AcctCorpXrefPK)) {
            return false;
        }
        AcctCorpXrefPK other = (AcctCorpXrefPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.corpCd == null && other.corpCd != null) || (this.corpCd != null && !this.corpCd.equals(other.corpCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctCorpXrefPK[ acctNbr=" + acctNbr + ", corpCd=" + corpCd + " ]";
    }

}
