package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProdLimitsUsebPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PRDU_CUST_ID")
    private String prduCustId;
    @Basic(optional = false)
    @Column(name = "PRDU_CC_TYPE")
    private Character prduCcType;
    @Basic(optional = false)
    @Column(name = "PRDU_PROFILE_ID")
    private long prduProfileId;
    @Basic(optional = false)
    @Column(name = "PRODC_ID")
    private int prodcId;

    public ProdLimitsUsebPK() {
    }

    public ProdLimitsUsebPK(String prduCustId, Character prduCcType, long prduProfileId, int prodcId) {
        this.prduCustId = prduCustId;
        this.prduCcType = prduCcType;
        this.prduProfileId = prduProfileId;
        this.prodcId = prodcId;
    }

    public String getPrduCustId() {
        return prduCustId;
    }

    public void setPrduCustId(String prduCustId) {
        this.prduCustId = prduCustId;
    }

    public Character getPrduCcType() {
        return prduCcType;
    }

    public void setPrduCcType(Character prduCcType) {
        this.prduCcType = prduCcType;
    }

    public long getPrduProfileId() {
        return prduProfileId;
    }

    public void setPrduProfileId(long prduProfileId) {
        this.prduProfileId = prduProfileId;
    }

    public int getProdcId() {
        return prodcId;
    }

    public void setProdcId(int prodcId) {
        this.prodcId = prodcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prduCustId != null ? prduCustId.hashCode() : 0);
        hash += (prduCcType != null ? prduCcType.hashCode() : 0);
        hash += (int) prduProfileId;
        hash += (int) prodcId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ProdLimitsUsebPK)) {
            return false;
        }
        ProdLimitsUsebPK other = (ProdLimitsUsebPK) object;
        if ((this.prduCustId == null && other.prduCustId != null) || (this.prduCustId != null && !this.prduCustId.equals(other.prduCustId))) {
            return false;
        }
        if ((this.prduCcType == null && other.prduCcType != null) || (this.prduCcType != null && !this.prduCcType.equals(other.prduCcType))) {
            return false;
        }
        if (this.prduProfileId != other.prduProfileId) {
            return false;
        }
        if (this.prodcId != other.prodcId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProdLimitsUsebPK[ prduCustId=" + prduCustId + ", prduCcType=" + prduCcType + ", prduProfileId=" + prduProfileId + ", prodcId=" + prodcId + " ]";
    }

}
