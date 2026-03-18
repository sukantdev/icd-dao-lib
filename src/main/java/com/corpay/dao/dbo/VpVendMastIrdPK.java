package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class VpVendMastIrdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "VEND_MAST_ID")
    private String vendMastId;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private int seqNbr;

    public VpVendMastIrdPK() {
    }

    public VpVendMastIrdPK(String vendMastId, int seqNbr) {
        this.vendMastId = vendMastId;
        this.seqNbr = seqNbr;
    }

    public String getVendMastId() {
        return vendMastId;
    }

    public void setVendMastId(String vendMastId) {
        this.vendMastId = vendMastId;
    }

    public int getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(int seqNbr) {
        this.seqNbr = seqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendMastId != null ? vendMastId.hashCode() : 0);
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpVendMastIrdPK)) {
            return false;
        }
        VpVendMastIrdPK other = (VpVendMastIrdPK) object;
        if ((this.vendMastId == null && other.vendMastId != null) || (this.vendMastId != null && !this.vendMastId.equals(other.vendMastId))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpVendMastIrdPK[ vendMastId=" + vendMastId + ", seqNbr=" + seqNbr + " ]";
    }

}
