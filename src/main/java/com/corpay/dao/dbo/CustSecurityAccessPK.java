package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CustSecurityAccessPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "SECURITY_PARTNER")
    private String securityPartner;

    public CustSecurityAccessPK() {
    }

    public CustSecurityAccessPK(String acctNbr, String custId, String securityPartner) {
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.securityPartner = securityPartner;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getSecurityPartner() {
        return securityPartner;
    }

    public void setSecurityPartner(String securityPartner) {
        this.securityPartner = securityPartner;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (securityPartner != null ? securityPartner.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CustSecurityAccessPK)) {
            return false;
        }
        CustSecurityAccessPK other = (CustSecurityAccessPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.securityPartner == null && other.securityPartner != null) || (this.securityPartner != null && !this.securityPartner.equals(other.securityPartner))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustSecurityAccessPK[ acctNbr=" + acctNbr + ", custId=" + custId + ", securityPartner=" + securityPartner + " ]";
    }

}
