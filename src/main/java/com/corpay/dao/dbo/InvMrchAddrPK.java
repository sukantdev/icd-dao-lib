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
public class InvMrchAddrPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MRCH_ADDR_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mrchAddrTs;
    @Basic(optional = false)
    @Column(name = "MRCH_ADDR_SEQ_NBR")
    private short mrchAddrSeqNbr;

    public InvMrchAddrPK() {
    }

    public InvMrchAddrPK(Date mrchAddrTs, short mrchAddrSeqNbr) {
        this.mrchAddrTs = mrchAddrTs;
        this.mrchAddrSeqNbr = mrchAddrSeqNbr;
    }

    public Date getMrchAddrTs() {
        return mrchAddrTs;
    }

    public void setMrchAddrTs(Date mrchAddrTs) {
        this.mrchAddrTs = mrchAddrTs;
    }

    public short getMrchAddrSeqNbr() {
        return mrchAddrSeqNbr;
    }

    public void setMrchAddrSeqNbr(short mrchAddrSeqNbr) {
        this.mrchAddrSeqNbr = mrchAddrSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mrchAddrTs != null ? mrchAddrTs.hashCode() : 0);
        hash += (int) mrchAddrSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvMrchAddrPK)) {
            return false;
        }
        InvMrchAddrPK other = (InvMrchAddrPK) object;
        if ((this.mrchAddrTs == null && other.mrchAddrTs != null) || (this.mrchAddrTs != null && !this.mrchAddrTs.equals(other.mrchAddrTs))) {
            return false;
        }
        if (this.mrchAddrSeqNbr != other.mrchAddrSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvMrchAddrPK[ mrchAddrTs=" + mrchAddrTs + ", mrchAddrSeqNbr=" + mrchAddrSeqNbr + " ]";
    }
    
}
