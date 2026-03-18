package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class NetPricingTaCustPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "EFFCTV_DT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effctvDtTs;
    @Basic(optional = false)
    @Column(name = "UNOCAL_NBR")
    private long unocalNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;

    public NetPricingTaCustPK() {
    }

    public NetPricingTaCustPK(Date effctvDtTs, long unocalNbr, String custId) {
        this.effctvDtTs = effctvDtTs;
        this.unocalNbr = unocalNbr;
        this.custId = custId;
    }

    public Date getEffctvDtTs() {
        return effctvDtTs;
    }

    public void setEffctvDtTs(Date effctvDtTs) {
        this.effctvDtTs = effctvDtTs;
    }

    public long getUnocalNbr() {
        return unocalNbr;
    }

    public void setUnocalNbr(long unocalNbr) {
        this.unocalNbr = unocalNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (effctvDtTs != null ? effctvDtTs.hashCode() : 0);
        hash += (int) unocalNbr;
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof NetPricingTaCustPK)) {
            return false;
        }
        NetPricingTaCustPK other = (NetPricingTaCustPK) object;
        if ((this.effctvDtTs == null && other.effctvDtTs != null) || (this.effctvDtTs != null && !this.effctvDtTs.equals(other.effctvDtTs))) {
            return false;
        }
        if (this.unocalNbr != other.unocalNbr) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NetPricingTaCustPK[ effctvDtTs=" + effctvDtTs + ", unocalNbr=" + unocalNbr + ", custId=" + custId + " ]";
    }

}
