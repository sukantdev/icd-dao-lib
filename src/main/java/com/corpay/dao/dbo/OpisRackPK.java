package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class OpisRackPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "EFCTV_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date efctvTs;
    @Basic(optional = false)
    @Column(name = "OPIS_NBR")
    private long opisNbr;
    @Basic(optional = false)
    @Column(name = "SUPL_ID")
    private String suplId;

    public OpisRackPK() {
    }

    public OpisRackPK(Date efctvTs, long opisNbr, String suplId) {
        this.efctvTs = efctvTs;
        this.opisNbr = opisNbr;
        this.suplId = suplId;
    }

    public Date getEfctvTs() {
        return efctvTs;
    }

    public void setEfctvTs(Date efctvTs) {
        this.efctvTs = efctvTs;
    }

    public long getOpisNbr() {
        return opisNbr;
    }

    public void setOpisNbr(long opisNbr) {
        this.opisNbr = opisNbr;
    }

    public String getSuplId() {
        return suplId;
    }

    public void setSuplId(String suplId) {
        this.suplId = suplId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (efctvTs != null ? efctvTs.hashCode() : 0);
        hash += (int) opisNbr;
        hash += (suplId != null ? suplId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof OpisRackPK)) {
            return false;
        }
        OpisRackPK other = (OpisRackPK) object;
        if ((this.efctvTs == null && other.efctvTs != null) || (this.efctvTs != null && !this.efctvTs.equals(other.efctvTs))) {
            return false;
        }
        if (this.opisNbr != other.opisNbr) {
            return false;
        }
        if ((this.suplId == null && other.suplId != null) || (this.suplId != null && !this.suplId.equals(other.suplId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.OpisRackPK[ efctvTs=" + efctvTs + ", opisNbr=" + opisNbr + ", suplId=" + suplId + " ]";
    }

}
