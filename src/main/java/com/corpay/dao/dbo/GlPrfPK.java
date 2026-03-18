package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class GlPrfPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "PRF_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prfId;

    public GlPrfPK() {
    }

    public GlPrfPK(String acctNbr, Date prfId) {
        this.acctNbr = acctNbr;
        this.prfId = prfId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public Date getPrfId() {
        return prfId;
    }

    public void setPrfId(Date prfId) {
        this.prfId = prfId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (prfId != null ? prfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GlPrfPK)) {
            return false;
        }
        GlPrfPK other = (GlPrfPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.prfId == null && other.prfId != null) || (this.prfId != null && !this.prfId.equals(other.prfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlPrfPK[ acctNbr=" + acctNbr + ", prfId=" + prfId + " ]";
    }

}
