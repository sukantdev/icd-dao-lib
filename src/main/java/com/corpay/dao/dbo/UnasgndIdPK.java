package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UnasgndIdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "UNASGND_ID")
    private int unasgndId;

    public UnasgndIdPK() {
    }

    public UnasgndIdPK(String custId, int unasgndId) {
        this.custId = custId;
        this.unasgndId = unasgndId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public int getUnasgndId() {
        return unasgndId;
    }

    public void setUnasgndId(int unasgndId) {
        this.unasgndId = unasgndId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (int) unasgndId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UnasgndIdPK)) {
            return false;
        }
        UnasgndIdPK other = (UnasgndIdPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if (this.unasgndId != other.unasgndId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UnasgndIdPK[ custId=" + custId + ", unasgndId=" + unasgndId + " ]";
    }

}
