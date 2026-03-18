package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ConsInvSummPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "COMPANY_CD")
    private String companyCd;
    @Basic(optional = false)
    @Column(name = "INV_DT")
    @Temporal(TemporalType.DATE)
    private Date invDt;

    public ConsInvSummPK() {
    }

    public ConsInvSummPK(String acctNbr, String companyCd, Date invDt) {
        this.acctNbr = acctNbr;
        this.companyCd = companyCd;
        this.invDt = invDt;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCompanyCd() {
        return companyCd;
    }

    public void setCompanyCd(String companyCd) {
        this.companyCd = companyCd;
    }

    public Date getInvDt() {
        return invDt;
    }

    public void setInvDt(Date invDt) {
        this.invDt = invDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (companyCd != null ? companyCd.hashCode() : 0);
        hash += (invDt != null ? invDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ConsInvSummPK)) {
            return false;
        }
        ConsInvSummPK other = (ConsInvSummPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.companyCd == null && other.companyCd != null) || (this.companyCd != null && !this.companyCd.equals(other.companyCd))) {
            return false;
        }
        if ((this.invDt == null && other.invDt != null) || (this.invDt != null && !this.invDt.equals(other.invDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ConsInvSummPK[ acctNbr=" + acctNbr + ", companyCd=" + companyCd + ", invDt=" + invDt + " ]";
    }

}
