package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class TeleNotificationPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "TRANS_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transTs;

    public TeleNotificationPK() {
    }

    public TeleNotificationPK(String acctCd, String custId, Date transTs) {
        this.acctCd = acctCd;
        this.custId = custId;
        this.transTs = transTs;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Date getTransTs() {
        return transTs;
    }

    public void setTransTs(Date transTs) {
        this.transTs = transTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctCd != null ? acctCd.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (transTs != null ? transTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TeleNotificationPK)) {
            return false;
        }
        TeleNotificationPK other = (TeleNotificationPK) object;
        if ((this.acctCd == null && other.acctCd != null) || (this.acctCd != null && !this.acctCd.equals(other.acctCd))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.transTs == null && other.transTs != null) || (this.transTs != null && !this.transTs.equals(other.transTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TeleNotificationPK[ acctCd=" + acctCd + ", custId=" + custId + ", transTs=" + transTs + " ]";
    }

}
