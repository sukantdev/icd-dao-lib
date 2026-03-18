package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class McActvPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "LOG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logTs;
    @Basic(optional = false)
    @Column(name = "TYP_CD")
    private Character typCd;

    public McActvPK() {
    }

    public McActvPK(Date logTs, Character typCd) {
        this.logTs = logTs;
        this.typCd = typCd;
    }

    public Date getLogTs() {
        return logTs;
    }

    public void setLogTs(Date logTs) {
        this.logTs = logTs;
    }

    public Character getTypCd() {
        return typCd;
    }

    public void setTypCd(Character typCd) {
        this.typCd = typCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logTs != null ? logTs.hashCode() : 0);
        hash += (typCd != null ? typCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McActvPK)) {
            return false;
        }
        McActvPK other = (McActvPK) object;
        if ((this.logTs == null && other.logTs != null) || (this.logTs != null && !this.logTs.equals(other.logTs))) {
            return false;
        }
        if ((this.typCd == null && other.typCd != null) || (this.typCd != null && !this.typCd.equals(other.typCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McActvPK[ logTs=" + logTs + ", typCd=" + typCd + " ]";
    }

}
