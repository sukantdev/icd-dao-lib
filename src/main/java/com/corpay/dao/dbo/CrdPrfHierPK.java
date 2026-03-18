package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrdPrfHierPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "COMP_STAND_XREF")
    private String compStandXref;

    public CrdPrfHierPK() {
    }

    public CrdPrfHierPK(String custId, String compStandXref) {
        this.custId = custId;
        this.compStandXref = compStandXref;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCompStandXref() {
        return compStandXref;
    }

    public void setCompStandXref(String compStandXref) {
        this.compStandXref = compStandXref;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (compStandXref != null ? compStandXref.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdPrfHierPK)) {
            return false;
        }
        CrdPrfHierPK other = (CrdPrfHierPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.compStandXref == null && other.compStandXref != null) || (this.compStandXref != null && !this.compStandXref.equals(other.compStandXref))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdPrfHierPK[ custId=" + custId + ", compStandXref=" + compStandXref + " ]";
    }

}
