package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MrchLocCfcPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BLNG_ID")
    private String blngId;
    @Basic(optional = false)
    @Column(name = "DISC_GRP")
    private short discGrp;

    public MrchLocCfcPK() {
    }

    public MrchLocCfcPK(String blngId, short discGrp) {
        this.blngId = blngId;
        this.discGrp = discGrp;
    }

    public String getBlngId() {
        return blngId;
    }

    public void setBlngId(String blngId) {
        this.blngId = blngId;
    }

    public short getDiscGrp() {
        return discGrp;
    }

    public void setDiscGrp(short discGrp) {
        this.discGrp = discGrp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (blngId != null ? blngId.hashCode() : 0);
        hash += (int) discGrp;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchLocCfcPK)) {
            return false;
        }
        MrchLocCfcPK other = (MrchLocCfcPK) object;
        if ((this.blngId == null && other.blngId != null) || (this.blngId != null && !this.blngId.equals(other.blngId))) {
            return false;
        }
        if (this.discGrp != other.discGrp) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocCfcPK[ blngId=" + blngId + ", discGrp=" + discGrp + " ]";
    }

}
