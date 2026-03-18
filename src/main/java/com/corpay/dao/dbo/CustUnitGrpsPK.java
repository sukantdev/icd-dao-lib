package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CustUnitGrpsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "UNIT_ID")
    private String unitId;
    @Basic(optional = false)
    @Column(name = "GRP_ID")
    private String grpId;

    public CustUnitGrpsPK() {
    }

    public CustUnitGrpsPK(String custId, String unitId, String grpId) {
        this.custId = custId;
        this.unitId = unitId;
        this.grpId = grpId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getGrpId() {
        return grpId;
    }

    public void setGrpId(String grpId) {
        this.grpId = grpId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (unitId != null ? unitId.hashCode() : 0);
        hash += (grpId != null ? grpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CustUnitGrpsPK)) {
            return false;
        }
        CustUnitGrpsPK other = (CustUnitGrpsPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.unitId == null && other.unitId != null) || (this.unitId != null && !this.unitId.equals(other.unitId))) {
            return false;
        }
        if ((this.grpId == null && other.grpId != null) || (this.grpId != null && !this.grpId.equals(other.grpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustUnitGrpsPK[ custId=" + custId + ", unitId=" + unitId + ", grpId=" + grpId + " ]";
    }

}
