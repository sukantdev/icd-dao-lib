package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FmrmSummStatePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "ST_CD")
    private String stCd;

    public FmrmSummStatePK() {
    }

    public FmrmSummStatePK(String custId, String stCd) {
        this.custId = custId;
        this.stCd = stCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getStCd() {
        return stCd;
    }

    public void setStCd(String stCd) {
        this.stCd = stCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (stCd != null ? stCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FmrmSummStatePK)) {
            return false;
        }
        FmrmSummStatePK other = (FmrmSummStatePK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.stCd == null && other.stCd != null) || (this.stCd != null && !this.stCd.equals(other.stCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FmrmSummStatePK[ custId=" + custId + ", stCd=" + stCd + " ]";
    }

}
