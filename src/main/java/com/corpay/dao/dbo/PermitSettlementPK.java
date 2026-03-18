package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class PermitSettlementPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PERMIT_CTL_NBR")
    private int permitCtlNbr;
    @Basic(optional = false)
    @Column(name = "PERMIT_PSTD_DT")
    @Temporal(TemporalType.DATE)
    private Date permitPstdDt;

    public PermitSettlementPK() {
    }

    public PermitSettlementPK(int permitCtlNbr, Date permitPstdDt) {
        this.permitCtlNbr = permitCtlNbr;
        this.permitPstdDt = permitPstdDt;
    }

    public int getPermitCtlNbr() {
        return permitCtlNbr;
    }

    public void setPermitCtlNbr(int permitCtlNbr) {
        this.permitCtlNbr = permitCtlNbr;
    }

    public Date getPermitPstdDt() {
        return permitPstdDt;
    }

    public void setPermitPstdDt(Date permitPstdDt) {
        this.permitPstdDt = permitPstdDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) permitCtlNbr;
        hash += (permitPstdDt != null ? permitPstdDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PermitSettlementPK)) {
            return false;
        }
        PermitSettlementPK other = (PermitSettlementPK) object;
        if (this.permitCtlNbr != other.permitCtlNbr) {
            return false;
        }
        if ((this.permitPstdDt == null && other.permitPstdDt != null) || (this.permitPstdDt != null && !this.permitPstdDt.equals(other.permitPstdDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PermitSettlementPK[ permitCtlNbr=" + permitCtlNbr + ", permitPstdDt=" + permitPstdDt + " ]";
    }

}
