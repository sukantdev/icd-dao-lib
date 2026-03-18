package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class StateFeeWaiverPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "STATE_CD")
    private String stateCd;
    @Basic(optional = false)
    @Column(name = "FEE_TYP_CD")
    private String feeTypCd;

    public StateFeeWaiverPK() {
    }

    public StateFeeWaiverPK(String stateCd, String feeTypCd) {
        this.stateCd = stateCd;
        this.feeTypCd = feeTypCd;
    }

    public String getStateCd() {
        return stateCd;
    }

    public void setStateCd(String stateCd) {
        this.stateCd = stateCd;
    }

    public String getFeeTypCd() {
        return feeTypCd;
    }

    public void setFeeTypCd(String feeTypCd) {
        this.feeTypCd = feeTypCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stateCd != null ? stateCd.hashCode() : 0);
        hash += (feeTypCd != null ? feeTypCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof StateFeeWaiverPK)) {
            return false;
        }
        StateFeeWaiverPK other = (StateFeeWaiverPK) object;
        if ((this.stateCd == null && other.stateCd != null) || (this.stateCd != null && !this.stateCd.equals(other.stateCd))) {
            return false;
        }
        if ((this.feeTypCd == null && other.feeTypCd != null) || (this.feeTypCd != null && !this.feeTypCd.equals(other.feeTypCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.StateFeeWaiverPK[ stateCd=" + stateCd + ", feeTypCd=" + feeTypCd + " ]";
    }

}
