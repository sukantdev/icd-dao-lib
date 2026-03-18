package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FmrmSummSitelocDtlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;

    public FmrmSummSitelocDtlPK() {
    }

    public FmrmSummSitelocDtlPK(String custId, String locCd) {
        this.custId = custId;
        this.locCd = locCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (locCd != null ? locCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FmrmSummSitelocDtlPK)) {
            return false;
        }
        FmrmSummSitelocDtlPK other = (FmrmSummSitelocDtlPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.locCd == null && other.locCd != null) || (this.locCd != null && !this.locCd.equals(other.locCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FmrmSummSitelocDtlPK[ custId=" + custId + ", locCd=" + locCd + " ]";
    }

}
