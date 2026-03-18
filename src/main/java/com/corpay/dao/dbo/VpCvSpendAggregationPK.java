package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class VpCvSpendAggregationPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "VENDOR_NBR")
    private String vendorNbr;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "AGGREGATION_DT")
    @Temporal(TemporalType.DATE)
    private Date aggregationDt;

    public VpCvSpendAggregationPK() {
    }

    public VpCvSpendAggregationPK(String custId, String vendorNbr, String locCd, Date aggregationDt) {
        this.custId = custId;
        this.vendorNbr = vendorNbr;
        this.locCd = locCd;
        this.aggregationDt = aggregationDt;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getVendorNbr() {
        return vendorNbr;
    }

    public void setVendorNbr(String vendorNbr) {
        this.vendorNbr = vendorNbr;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public Date getAggregationDt() {
        return aggregationDt;
    }

    public void setAggregationDt(Date aggregationDt) {
        this.aggregationDt = aggregationDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (vendorNbr != null ? vendorNbr.hashCode() : 0);
        hash += (locCd != null ? locCd.hashCode() : 0);
        hash += (aggregationDt != null ? aggregationDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpCvSpendAggregationPK)) {
            return false;
        }
        VpCvSpendAggregationPK other = (VpCvSpendAggregationPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.vendorNbr == null && other.vendorNbr != null) || (this.vendorNbr != null && !this.vendorNbr.equals(other.vendorNbr))) {
            return false;
        }
        if ((this.locCd == null && other.locCd != null) || (this.locCd != null && !this.locCd.equals(other.locCd))) {
            return false;
        }
        if ((this.aggregationDt == null && other.aggregationDt != null) || (this.aggregationDt != null && !this.aggregationDt.equals(other.aggregationDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCvSpendAggregationPK[ custId=" + custId + ", vendorNbr=" + vendorNbr + ", locCd=" + locCd + ", aggregationDt=" + aggregationDt + " ]";
    }

}
