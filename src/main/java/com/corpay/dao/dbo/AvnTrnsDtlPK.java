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
public class AvnTrnsDtlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRNS_TRKG_NBR")
    private int trnsTrkgNbr;
    @Basic(optional = false)
    @Column(name = "LN_SEQ_NBR")
    private int lnSeqNbr;

    public AvnTrnsDtlPK() {
    }

    public AvnTrnsDtlPK(int trnsTrkgNbr, int lnSeqNbr) {
        this.trnsTrkgNbr = trnsTrkgNbr;
        this.lnSeqNbr = lnSeqNbr;
    }

    public int getTrnsTrkgNbr() {
        return trnsTrkgNbr;
    }

    public void setTrnsTrkgNbr(int trnsTrkgNbr) {
        this.trnsTrkgNbr = trnsTrkgNbr;
    }

    public int getLnSeqNbr() {
        return lnSeqNbr;
    }

    public void setLnSeqNbr(int lnSeqNbr) {
        this.lnSeqNbr = lnSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) trnsTrkgNbr;
        hash += (int) lnSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvnTrnsDtlPK)) {
            return false;
        }
        AvnTrnsDtlPK other = (AvnTrnsDtlPK) object;
        if (this.trnsTrkgNbr != other.trnsTrkgNbr) {
            return false;
        }
        if (this.lnSeqNbr != other.lnSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AvnTrnsDtlPK[ trnsTrkgNbr=" + trnsTrkgNbr + ", lnSeqNbr=" + lnSeqNbr + " ]";
    }
    
}
