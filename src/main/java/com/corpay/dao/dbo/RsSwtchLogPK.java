package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RsSwtchLogPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PROC_TRNS_ID")
    private String procTrnsId;
    @Basic(optional = false)
    @Column(name = "REQ_NBR")
    private int reqNbr;
    @Basic(optional = false)
    @Column(name = "BEG_UTIME")
    private long begUtime;

    public RsSwtchLogPK() {
    }

    public RsSwtchLogPK(String procTrnsId, int reqNbr, long begUtime) {
        this.procTrnsId = procTrnsId;
        this.reqNbr = reqNbr;
        this.begUtime = begUtime;
    }

    public String getProcTrnsId() {
        return procTrnsId;
    }

    public void setProcTrnsId(String procTrnsId) {
        this.procTrnsId = procTrnsId;
    }

    public int getReqNbr() {
        return reqNbr;
    }

    public void setReqNbr(int reqNbr) {
        this.reqNbr = reqNbr;
    }

    public long getBegUtime() {
        return begUtime;
    }

    public void setBegUtime(long begUtime) {
        this.begUtime = begUtime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procTrnsId != null ? procTrnsId.hashCode() : 0);
        hash += (int) reqNbr;
        hash += (int) begUtime;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RsSwtchLogPK)) {
            return false;
        }
        RsSwtchLogPK other = (RsSwtchLogPK) object;
        if ((this.procTrnsId == null && other.procTrnsId != null) || (this.procTrnsId != null && !this.procTrnsId.equals(other.procTrnsId))) {
            return false;
        }
        if (this.reqNbr != other.reqNbr) {
            return false;
        }
        if (this.begUtime != other.begUtime) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RsSwtchLogPK[ procTrnsId=" + procTrnsId + ", reqNbr=" + reqNbr + ", begUtime=" + begUtime + " ]";
    }

}
