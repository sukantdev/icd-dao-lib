package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class RbBillingFactPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SUB_TYP_CD")
    private String subTypCd;
    @Basic(optional = false)
    @Column(name = "SUB_ID")
    private long subId;
    @Basic(optional = false)
    @Column(name = "SUB_PHSE_ID")
    private long subPhseId;
    @Basic(optional = false)
    @Column(name = "BILL_PD_START_DT")
    @Temporal(TemporalType.DATE)
    private Date billPdStartDt;

    public RbBillingFactPK() {
    }

    public RbBillingFactPK(String subTypCd, long subId, long subPhseId, Date billPdStartDt) {
        this.subTypCd = subTypCd;
        this.subId = subId;
        this.subPhseId = subPhseId;
        this.billPdStartDt = billPdStartDt;
    }

    public String getSubTypCd() {
        return subTypCd;
    }

    public void setSubTypCd(String subTypCd) {
        this.subTypCd = subTypCd;
    }

    public long getSubId() {
        return subId;
    }

    public void setSubId(long subId) {
        this.subId = subId;
    }

    public long getSubPhseId() {
        return subPhseId;
    }

    public void setSubPhseId(long subPhseId) {
        this.subPhseId = subPhseId;
    }

    public Date getBillPdStartDt() {
        return billPdStartDt;
    }

    public void setBillPdStartDt(Date billPdStartDt) {
        this.billPdStartDt = billPdStartDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subTypCd != null ? subTypCd.hashCode() : 0);
        hash += (int) subId;
        hash += (int) subPhseId;
        hash += (billPdStartDt != null ? billPdStartDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbBillingFactPK)) {
            return false;
        }
        RbBillingFactPK other = (RbBillingFactPK) object;
        if ((this.subTypCd == null && other.subTypCd != null) || (this.subTypCd != null && !this.subTypCd.equals(other.subTypCd))) {
            return false;
        }
        if (this.subId != other.subId) {
            return false;
        }
        if (this.subPhseId != other.subPhseId) {
            return false;
        }
        if ((this.billPdStartDt == null && other.billPdStartDt != null) || (this.billPdStartDt != null && !this.billPdStartDt.equals(other.billPdStartDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbBillingFactPK[ subTypCd=" + subTypCd + ", subId=" + subId + ", subPhseId=" + subPhseId + ", billPdStartDt=" + billPdStartDt + " ]";
    }

}
