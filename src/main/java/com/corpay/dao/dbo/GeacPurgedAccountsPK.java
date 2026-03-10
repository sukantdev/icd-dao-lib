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
public class GeacPurgedAccountsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PURGE_DT")
    @Temporal(TemporalType.DATE)
    private Date purgeDt;
    @Basic(optional = false)
    @Column(name = "GEAC_ACCT_NBR")
    private String geacAcctNbr;
    @Basic(optional = false)
    @Column(name = "GEAC_CMPY_CD")
    private String geacCmpyCd;

    public GeacPurgedAccountsPK() {
    }

    public GeacPurgedAccountsPK(Date purgeDt, String geacAcctNbr, String geacCmpyCd) {
        this.purgeDt = purgeDt;
        this.geacAcctNbr = geacAcctNbr;
        this.geacCmpyCd = geacCmpyCd;
    }

    public Date getPurgeDt() {
        return purgeDt;
    }

    public void setPurgeDt(Date purgeDt) {
        this.purgeDt = purgeDt;
    }

    public String getGeacAcctNbr() {
        return geacAcctNbr;
    }

    public void setGeacAcctNbr(String geacAcctNbr) {
        this.geacAcctNbr = geacAcctNbr;
    }

    public String getGeacCmpyCd() {
        return geacCmpyCd;
    }

    public void setGeacCmpyCd(String geacCmpyCd) {
        this.geacCmpyCd = geacCmpyCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (purgeDt != null ? purgeDt.hashCode() : 0);
        hash += (geacAcctNbr != null ? geacAcctNbr.hashCode() : 0);
        hash += (geacCmpyCd != null ? geacCmpyCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeacPurgedAccountsPK)) {
            return false;
        }
        GeacPurgedAccountsPK other = (GeacPurgedAccountsPK) object;
        if ((this.purgeDt == null && other.purgeDt != null) || (this.purgeDt != null && !this.purgeDt.equals(other.purgeDt))) {
            return false;
        }
        if ((this.geacAcctNbr == null && other.geacAcctNbr != null) || (this.geacAcctNbr != null && !this.geacAcctNbr.equals(other.geacAcctNbr))) {
            return false;
        }
        if ((this.geacCmpyCd == null && other.geacCmpyCd != null) || (this.geacCmpyCd != null && !this.geacCmpyCd.equals(other.geacCmpyCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GeacPurgedAccountsPK[ purgeDt=" + purgeDt + ", geacAcctNbr=" + geacAcctNbr + ", geacCmpyCd=" + geacCmpyCd + " ]";
    }
    
}
