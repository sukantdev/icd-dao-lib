package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HierAcctPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;

    public HierAcctPK() {
    }

    public HierAcctPK(String acctCd, String hierId) {
        this.acctCd = acctCd;
        this.hierId = hierId;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctCd != null ? acctCd.hashCode() : 0);
        hash += (hierId != null ? hierId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierAcctPK)) {
            return false;
        }
        HierAcctPK other = (HierAcctPK) object;
        if ((this.acctCd == null && other.acctCd != null) || (this.acctCd != null && !this.acctCd.equals(other.acctCd))) {
            return false;
        }
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierAcctPK[ acctCd=" + acctCd + ", hierId=" + hierId + " ]";
    }

}
