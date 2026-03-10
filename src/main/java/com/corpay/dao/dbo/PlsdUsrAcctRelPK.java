/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class PlsdUsrAcctRelPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "PLSD_ACCT_NBR")
    private String plsdAcctNbr;

    public PlsdUsrAcctRelPK() {
    }

    public PlsdUsrAcctRelPK(String usrId, String plsdAcctNbr) {
        this.usrId = usrId;
        this.plsdAcctNbr = plsdAcctNbr;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getPlsdAcctNbr() {
        return plsdAcctNbr;
    }

    public void setPlsdAcctNbr(String plsdAcctNbr) {
        this.plsdAcctNbr = plsdAcctNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (plsdAcctNbr != null ? plsdAcctNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlsdUsrAcctRelPK)) {
            return false;
        }
        PlsdUsrAcctRelPK other = (PlsdUsrAcctRelPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.plsdAcctNbr == null && other.plsdAcctNbr != null) || (this.plsdAcctNbr != null && !this.plsdAcctNbr.equals(other.plsdAcctNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PlsdUsrAcctRelPK[ usrId=" + usrId + ", plsdAcctNbr=" + plsdAcctNbr + " ]";
    }
    
}
