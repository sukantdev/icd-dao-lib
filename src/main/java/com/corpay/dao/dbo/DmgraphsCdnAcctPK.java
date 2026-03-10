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
public class DmgraphsCdnAcctPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MMS_NBR")
    private String mmsNbr;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private short seqNbr;

    public DmgraphsCdnAcctPK() {
    }

    public DmgraphsCdnAcctPK(String mmsNbr, short seqNbr) {
        this.mmsNbr = mmsNbr;
        this.seqNbr = seqNbr;
    }

    public String getMmsNbr() {
        return mmsNbr;
    }

    public void setMmsNbr(String mmsNbr) {
        this.mmsNbr = mmsNbr;
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
        hash += (mmsNbr != null ? mmsNbr.hashCode() : 0);
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmgraphsCdnAcctPK)) {
            return false;
        }
        DmgraphsCdnAcctPK other = (DmgraphsCdnAcctPK) object;
        if ((this.mmsNbr == null && other.mmsNbr != null) || (this.mmsNbr != null && !this.mmsNbr.equals(other.mmsNbr))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DmgraphsCdnAcctPK[ mmsNbr=" + mmsNbr + ", seqNbr=" + seqNbr + " ]";
    }
    
}
