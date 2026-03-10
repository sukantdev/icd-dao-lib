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
public class InvPpnePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PPNE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppneTs;
    @Basic(optional = false)
    @Column(name = "PPNE_SEQ_NBR")
    private short ppneSeqNbr;

    public InvPpnePK() {
    }

    public InvPpnePK(Date ppneTs, short ppneSeqNbr) {
        this.ppneTs = ppneTs;
        this.ppneSeqNbr = ppneSeqNbr;
    }

    public Date getPpneTs() {
        return ppneTs;
    }

    public void setPpneTs(Date ppneTs) {
        this.ppneTs = ppneTs;
    }

    public short getPpneSeqNbr() {
        return ppneSeqNbr;
    }

    public void setPpneSeqNbr(short ppneSeqNbr) {
        this.ppneSeqNbr = ppneSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ppneTs != null ? ppneTs.hashCode() : 0);
        hash += (int) ppneSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPpnePK)) {
            return false;
        }
        InvPpnePK other = (InvPpnePK) object;
        if ((this.ppneTs == null && other.ppneTs != null) || (this.ppneTs != null && !this.ppneTs.equals(other.ppneTs))) {
            return false;
        }
        if (this.ppneSeqNbr != other.ppneSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvPpnePK[ ppneTs=" + ppneTs + ", ppneSeqNbr=" + ppneSeqNbr + " ]";
    }
    
}
