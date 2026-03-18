package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TelePingFuelCurrPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "SEQ")
    private short seq;

    public TelePingFuelCurrPK() {
    }

    public TelePingFuelCurrPK(String custId, String unitNbr, short seq) {
        this.custId = custId;
        this.unitNbr = unitNbr;
        this.seq = seq;
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

    public short getSeq() {
        return seq;
    }

    public void setSeq(short seq) {
        this.seq = seq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (unitNbr != null ? unitNbr.hashCode() : 0);
        hash += (int) seq;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TelePingFuelCurrPK)) {
            return false;
        }
        TelePingFuelCurrPK other = (TelePingFuelCurrPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.unitNbr == null && other.unitNbr != null) || (this.unitNbr != null && !this.unitNbr.equals(other.unitNbr))) {
            return false;
        }
        if (this.seq != other.seq) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePingFuelCurrPK[ custId=" + custId + ", unitNbr=" + unitNbr + ", seq=" + seq + " ]";
    }

}
