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
public class FaTrpLegPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRP_ID")
    private long trpId;
    @Basic(optional = false)
    @Column(name = "LEG_NBR")
    private short legNbr;

    public FaTrpLegPK() {
    }

    public FaTrpLegPK(long trpId, short legNbr) {
        this.trpId = trpId;
        this.legNbr = legNbr;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) trpId;
        hash += (int) legNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaTrpLegPK)) {
            return false;
        }
        FaTrpLegPK other = (FaTrpLegPK) object;
        if (this.trpId != other.trpId) {
            return false;
        }
        if (this.legNbr != other.legNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaTrpLegPK[ trpId=" + trpId + ", legNbr=" + legNbr + " ]";
    }
    
}
