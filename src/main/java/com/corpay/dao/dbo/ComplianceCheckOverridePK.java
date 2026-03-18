package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComplianceCheckOverridePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PRODUCT_TYPE")
    private String productType;
    @Basic(optional = false)
    @Column(name = "TAX_ID_LAST_4")
    private String taxIdLast4;
    @Basic(optional = false)
    @Column(name = "DOB")
    private String dob;

    public ComplianceCheckOverridePK() {
    }

    public ComplianceCheckOverridePK(String productType, String taxIdLast4, String dob) {
        this.productType = productType;
        this.taxIdLast4 = taxIdLast4;
        this.dob = dob;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTaxIdLast4() {
        return taxIdLast4;
    }

    public void setTaxIdLast4(String taxIdLast4) {
        this.taxIdLast4 = taxIdLast4;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productType != null ? productType.hashCode() : 0);
        hash += (taxIdLast4 != null ? taxIdLast4.hashCode() : 0);
        hash += (dob != null ? dob.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ComplianceCheckOverridePK)) {
            return false;
        }
        ComplianceCheckOverridePK other = (ComplianceCheckOverridePK) object;
        if ((this.productType == null && other.productType != null) || (this.productType != null && !this.productType.equals(other.productType))) {
            return false;
        }
        if ((this.taxIdLast4 == null && other.taxIdLast4 != null) || (this.taxIdLast4 != null && !this.taxIdLast4.equals(other.taxIdLast4))) {
            return false;
        }
        if ((this.dob == null && other.dob != null) || (this.dob != null && !this.dob.equals(other.dob))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ComplianceCheckOverridePK[ productType=" + productType + ", taxIdLast4=" + taxIdLast4 + ", dob=" + dob + " ]";
    }

}
