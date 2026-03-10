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
public class PrpPstdTxnPrdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "XTN_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xtnTs;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private short seqNbr;

    public PrpPstdTxnPrdPK() {
    }

    public PrpPstdTxnPrdPK(Date xtnTs, short seqNbr) {
        this.xtnTs = xtnTs;
        this.seqNbr = seqNbr;
    }

    public Date getXtnTs() {
        return xtnTs;
    }

    public void setXtnTs(Date xtnTs) {
        this.xtnTs = xtnTs;
    }

    public short getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(short seqNbr) {
        this.seqNbr = seqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (xtnTs != null ? xtnTs.hashCode() : 0);
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrpPstdTxnPrdPK)) {
            return false;
        }
        PrpPstdTxnPrdPK other = (PrpPstdTxnPrdPK) object;
        if ((this.xtnTs == null && other.xtnTs != null) || (this.xtnTs != null && !this.xtnTs.equals(other.xtnTs))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrpPstdTxnPrdPK[ xtnTs=" + xtnTs + ", seqNbr=" + seqNbr + " ]";
    }
    
}
