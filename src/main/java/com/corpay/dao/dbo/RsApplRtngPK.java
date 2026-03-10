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
public class RsApplRtngPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PROC_TRNS_ID")
    private String procTrnsId;
    @Basic(optional = false)
    @Column(name = "REQ_NBR")
    private int reqNbr;

    public RsApplRtngPK() {
    }

    public RsApplRtngPK(String procTrnsId, int reqNbr) {
        this.procTrnsId = procTrnsId;
        this.reqNbr = reqNbr;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procTrnsId != null ? procTrnsId.hashCode() : 0);
        hash += (int) reqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RsApplRtngPK)) {
            return false;
        }
        RsApplRtngPK other = (RsApplRtngPK) object;
        if ((this.procTrnsId == null && other.procTrnsId != null) || (this.procTrnsId != null && !this.procTrnsId.equals(other.procTrnsId))) {
            return false;
        }
        if (this.reqNbr != other.reqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RsApplRtngPK[ procTrnsId=" + procTrnsId + ", reqNbr=" + reqNbr + " ]";
    }
    
}
