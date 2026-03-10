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
public class InvMobilFlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MOBIL_FL_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mobilFlTs;
    @Basic(optional = false)
    @Column(name = "MOBIL_SEQ_NBR")
    private short mobilSeqNbr;

    public InvMobilFlPK() {
    }

    public InvMobilFlPK(Date mobilFlTs, short mobilSeqNbr) {
        this.mobilFlTs = mobilFlTs;
        this.mobilSeqNbr = mobilSeqNbr;
    }

    public Date getMobilFlTs() {
        return mobilFlTs;
    }

    public void setMobilFlTs(Date mobilFlTs) {
        this.mobilFlTs = mobilFlTs;
    }

    public short getMobilSeqNbr() {
        return mobilSeqNbr;
    }

    public void setMobilSeqNbr(short mobilSeqNbr) {
        this.mobilSeqNbr = mobilSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mobilFlTs != null ? mobilFlTs.hashCode() : 0);
        hash += (int) mobilSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvMobilFlPK)) {
            return false;
        }
        InvMobilFlPK other = (InvMobilFlPK) object;
        if ((this.mobilFlTs == null && other.mobilFlTs != null) || (this.mobilFlTs != null && !this.mobilFlTs.equals(other.mobilFlTs))) {
            return false;
        }
        if (this.mobilSeqNbr != other.mobilSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvMobilFlPK[ mobilFlTs=" + mobilFlTs + ", mobilSeqNbr=" + mobilSeqNbr + " ]";
    }
    
}
