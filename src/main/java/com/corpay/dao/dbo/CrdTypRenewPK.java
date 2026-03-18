package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrdTypRenewPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "FROM_CRD_TYP_CD")
    private String fromCrdTypCd;
    @Basic(optional = false)
    @Column(name = "FROM_CRD_STYLE_CD")
    private String fromCrdStyleCd;

    public CrdTypRenewPK() {
    }

    public CrdTypRenewPK(String custId, String fromCrdTypCd, String fromCrdStyleCd) {
        this.custId = custId;
        this.fromCrdTypCd = fromCrdTypCd;
        this.fromCrdStyleCd = fromCrdStyleCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getFromCrdTypCd() {
        return fromCrdTypCd;
    }

    public void setFromCrdTypCd(String fromCrdTypCd) {
        this.fromCrdTypCd = fromCrdTypCd;
    }

    public String getFromCrdStyleCd() {
        return fromCrdStyleCd;
    }

    public void setFromCrdStyleCd(String fromCrdStyleCd) {
        this.fromCrdStyleCd = fromCrdStyleCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (fromCrdTypCd != null ? fromCrdTypCd.hashCode() : 0);
        hash += (fromCrdStyleCd != null ? fromCrdStyleCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdTypRenewPK)) {
            return false;
        }
        CrdTypRenewPK other = (CrdTypRenewPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.fromCrdTypCd == null && other.fromCrdTypCd != null) || (this.fromCrdTypCd != null && !this.fromCrdTypCd.equals(other.fromCrdTypCd))) {
            return false;
        }
        if ((this.fromCrdStyleCd == null && other.fromCrdStyleCd != null) || (this.fromCrdStyleCd != null && !this.fromCrdStyleCd.equals(other.fromCrdStyleCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdTypRenewPK[ custId=" + custId + ", fromCrdTypCd=" + fromCrdTypCd + ", fromCrdStyleCd=" + fromCrdStyleCd + " ]";
    }

}
