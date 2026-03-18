package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FaTrpStpPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRP_ID")
    private long trpId;
    @Basic(optional = false)
    @Column(name = "LEG_NBR")
    private short legNbr;
    @Basic(optional = false)
    @Column(name = "STP_NBR")
    private short stpNbr;
    @Basic(optional = false)
    @Column(name = "LOC_ID")
    private String locId;

    public FaTrpStpPK() {
    }

    public FaTrpStpPK(long trpId, short legNbr, short stpNbr, String locId) {
        this.trpId = trpId;
        this.legNbr = legNbr;
        this.stpNbr = stpNbr;
        this.locId = locId;
    }

    public long getTrpId() {
        return trpId;
    }

    public void setTrpId(long trpId) {
        this.trpId = trpId;
    }

    public short getLegNbr() {
        return legNbr;
    }

    public void setLegNbr(short legNbr) {
        this.legNbr = legNbr;
    }

    public short getStpNbr() {
        return stpNbr;
    }

    public void setStpNbr(short stpNbr) {
        this.stpNbr = stpNbr;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) trpId;
        hash += (int) legNbr;
        hash += (int) stpNbr;
        hash += (locId != null ? locId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FaTrpStpPK)) {
            return false;
        }
        FaTrpStpPK other = (FaTrpStpPK) object;
        if (this.trpId != other.trpId) {
            return false;
        }
        if (this.legNbr != other.legNbr) {
            return false;
        }
        if (this.stpNbr != other.stpNbr) {
            return false;
        }
        if ((this.locId == null && other.locId != null) || (this.locId != null && !this.locId.equals(other.locId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaTrpStpPK[ trpId=" + trpId + ", legNbr=" + legNbr + ", stpNbr=" + stpNbr + ", locId=" + locId + " ]";
    }

}
