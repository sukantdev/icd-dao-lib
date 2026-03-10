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
public class TrnsIntradayIdxPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "UID")
    private String uid;
    @Basic(optional = false)
    @Column(name = "CURR_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currTs;
    @Basic(optional = false)
    @Column(name = "CURR_TRK_NBR")
    private int currTrkNbr;

    public TrnsIntradayIdxPK() {
    }

    public TrnsIntradayIdxPK(String uid, Date currTs, int currTrkNbr) {
        this.uid = uid;
        this.currTs = currTs;
        this.currTrkNbr = currTrkNbr;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Date getCurrTs() {
        return currTs;
    }

    public void setCurrTs(Date currTs) {
        this.currTs = currTs;
    }

    public int getCurrTrkNbr() {
        return currTrkNbr;
    }

    public void setCurrTrkNbr(int currTrkNbr) {
        this.currTrkNbr = currTrkNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        hash += (currTs != null ? currTs.hashCode() : 0);
        hash += (int) currTrkNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrnsIntradayIdxPK)) {
            return false;
        }
        TrnsIntradayIdxPK other = (TrnsIntradayIdxPK) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        if ((this.currTs == null && other.currTs != null) || (this.currTs != null && !this.currTs.equals(other.currTs))) {
            return false;
        }
        if (this.currTrkNbr != other.currTrkNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TrnsIntradayIdxPK[ uid=" + uid + ", currTs=" + currTs + ", currTrkNbr=" + currTrkNbr + " ]";
    }
    
}
