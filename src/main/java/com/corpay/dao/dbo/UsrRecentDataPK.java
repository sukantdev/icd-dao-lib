/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class UsrRecentDataPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "LAST_USED_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUsedTs;

    public UsrRecentDataPK() {
    }

    public UsrRecentDataPK(String usrId, Date lastUsedTs) {
        this.usrId = usrId;
        this.lastUsedTs = lastUsedTs;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public Date getLastUsedTs() {
        return lastUsedTs;
    }

    public void setLastUsedTs(Date lastUsedTs) {
        this.lastUsedTs = lastUsedTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (lastUsedTs != null ? lastUsedTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrRecentDataPK)) {
            return false;
        }
        UsrRecentDataPK other = (UsrRecentDataPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.lastUsedTs == null && other.lastUsedTs != null) || (this.lastUsedTs != null && !this.lastUsedTs.equals(other.lastUsedTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrRecentDataPK[ usrId=" + usrId + ", lastUsedTs=" + lastUsedTs + " ]";
    }
    
}
