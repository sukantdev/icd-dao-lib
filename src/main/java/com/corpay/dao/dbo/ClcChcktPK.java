package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ClcChcktPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CLC_CTL_NBR")
    private int clcCtlNbr;
    @Basic(optional = false)
    @Column(name = "CLC_PSTG_DT")
    @Temporal(TemporalType.DATE)
    private Date clcPstgDt;

    public ClcChcktPK() {
    }

    public ClcChcktPK(int clcCtlNbr, Date clcPstgDt) {
        this.clcCtlNbr = clcCtlNbr;
        this.clcPstgDt = clcPstgDt;
    }

    public int getClcCtlNbr() {
        return clcCtlNbr;
    }

    public void setClcCtlNbr(int clcCtlNbr) {
        this.clcCtlNbr = clcCtlNbr;
    }

    public Date getClcPstgDt() {
        return clcPstgDt;
    }

    public void setClcPstgDt(Date clcPstgDt) {
        this.clcPstgDt = clcPstgDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) clcCtlNbr;
        hash += (clcPstgDt != null ? clcPstgDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ClcChcktPK)) {
            return false;
        }
        ClcChcktPK other = (ClcChcktPK) object;
        if (this.clcCtlNbr != other.clcCtlNbr) {
            return false;
        }
        if ((this.clcPstgDt == null && other.clcPstgDt != null) || (this.clcPstgDt != null && !this.clcPstgDt.equals(other.clcPstgDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ClcChcktPK[ clcCtlNbr=" + clcCtlNbr + ", clcPstgDt=" + clcPstgDt + " ]";
    }

}
