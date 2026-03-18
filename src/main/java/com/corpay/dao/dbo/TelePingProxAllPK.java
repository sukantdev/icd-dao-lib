package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class TelePingProxAllPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "CDN_RECV_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cdnRecvTs;

    public TelePingProxAllPK() {
    }

    public TelePingProxAllPK(String custId, String unitNbr, Date cdnRecvTs) {
        this.custId = custId;
        this.unitNbr = unitNbr;
        this.cdnRecvTs = cdnRecvTs;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public Date getCdnRecvTs() {
        return cdnRecvTs;
    }

    public void setCdnRecvTs(Date cdnRecvTs) {
        this.cdnRecvTs = cdnRecvTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (unitNbr != null ? unitNbr.hashCode() : 0);
        hash += (cdnRecvTs != null ? cdnRecvTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TelePingProxAllPK)) {
            return false;
        }
        TelePingProxAllPK other = (TelePingProxAllPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.unitNbr == null && other.unitNbr != null) || (this.unitNbr != null && !this.unitNbr.equals(other.unitNbr))) {
            return false;
        }
        if ((this.cdnRecvTs == null && other.cdnRecvTs != null) || (this.cdnRecvTs != null && !this.cdnRecvTs.equals(other.cdnRecvTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePingProxAllPK[ custId=" + custId + ", unitNbr=" + unitNbr + ", cdnRecvTs=" + cdnRecvTs + " ]";
    }

}
