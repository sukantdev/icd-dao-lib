package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AccntCustTypeMappingPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_TYPE_ID")
    private int custTypeId;
    @Basic(optional = false)
    @Column(name = "PLSD_ACCT_NBR")
    private String plsdAcctNbr;

    public AccntCustTypeMappingPK() {
    }

    public AccntCustTypeMappingPK(int custTypeId, String plsdAcctNbr) {
        this.custTypeId = custTypeId;
        this.plsdAcctNbr = plsdAcctNbr;
    }

    public int getCustTypeId() {
        return custTypeId;
    }

    public void setCustTypeId(int custTypeId) {
        this.custTypeId = custTypeId;
    }

    public String getPlsdAcctNbr() {
        return plsdAcctNbr;
    }

    public void setPlsdAcctNbr(String plsdAcctNbr) {
        this.plsdAcctNbr = plsdAcctNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) custTypeId;
        hash += (plsdAcctNbr != null ? plsdAcctNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AccntCustTypeMappingPK)) {
            return false;
        }
        AccntCustTypeMappingPK other = (AccntCustTypeMappingPK) object;
        if (this.custTypeId != other.custTypeId) {
            return false;
        }
        if ((this.plsdAcctNbr == null && other.plsdAcctNbr != null) || (this.plsdAcctNbr != null && !this.plsdAcctNbr.equals(other.plsdAcctNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.AccntCustTypeMappingPK[ custTypeId=" + custTypeId + ", plsdAcctNbr=" + plsdAcctNbr + " ]";
    }

}
