package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class CrdAccessLogPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCESS_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accessTs;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private int seqNbr;

    public CrdAccessLogPK() {
    }

    public CrdAccessLogPK(Date accessTs, String usrId, int seqNbr) {
        this.accessTs = accessTs;
        this.usrId = usrId;
        this.seqNbr = seqNbr;
    }

    public Date getAccessTs() {
        return accessTs;
    }

    public void setAccessTs(Date accessTs) {
        this.accessTs = accessTs;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public int getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(int seqNbr) {
        this.seqNbr = seqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accessTs != null ? accessTs.hashCode() : 0);
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdAccessLogPK)) {
            return false;
        }
        CrdAccessLogPK other = (CrdAccessLogPK) object;
        if ((this.accessTs == null && other.accessTs != null) || (this.accessTs != null && !this.accessTs.equals(other.accessTs))) {
            return false;
        }
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdAccessLogPK[ accessTs=" + accessTs + ", usrId=" + usrId + ", seqNbr=" + seqNbr + " ]";
    }

}
