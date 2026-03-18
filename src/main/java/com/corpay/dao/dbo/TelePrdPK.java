package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class TelePrdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PARTNER_ID")
    private String partnerId;
    @Basic(optional = false)
    @Column(name = "TELE_TRNS_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date teleTrnsTs;
    @Basic(optional = false)
    @Column(name = "TRK_NBR")
    private long trkNbr;
    @Basic(optional = false)
    @Column(name = "PRD_NBR")
    private short prdNbr;

    public TelePrdPK() {
    }

    public TelePrdPK(String partnerId, Date teleTrnsTs, long trkNbr, short prdNbr) {
        this.partnerId = partnerId;
        this.teleTrnsTs = teleTrnsTs;
        this.trkNbr = trkNbr;
        this.prdNbr = prdNbr;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public Date getTeleTrnsTs() {
        return teleTrnsTs;
    }

    public void setTeleTrnsTs(Date teleTrnsTs) {
        this.teleTrnsTs = teleTrnsTs;
    }

    public long getTrkNbr() {
        return trkNbr;
    }

    public void setTrkNbr(long trkNbr) {
        this.trkNbr = trkNbr;
    }

    public short getPrdNbr() {
        return prdNbr;
    }

    public void setPrdNbr(short prdNbr) {
        this.prdNbr = prdNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partnerId != null ? partnerId.hashCode() : 0);
        hash += (teleTrnsTs != null ? teleTrnsTs.hashCode() : 0);
        hash += (int) trkNbr;
        hash += (int) prdNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TelePrdPK)) {
            return false;
        }
        TelePrdPK other = (TelePrdPK) object;
        if ((this.partnerId == null && other.partnerId != null) || (this.partnerId != null && !this.partnerId.equals(other.partnerId))) {
            return false;
        }
        if ((this.teleTrnsTs == null && other.teleTrnsTs != null) || (this.teleTrnsTs != null && !this.teleTrnsTs.equals(other.teleTrnsTs))) {
            return false;
        }
        if (this.trkNbr != other.trkNbr) {
            return false;
        }
        if (this.prdNbr != other.prdNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePrdPK[ partnerId=" + partnerId + ", teleTrnsTs=" + teleTrnsTs + ", trkNbr=" + trkNbr + ", prdNbr=" + prdNbr + " ]";
    }

}
