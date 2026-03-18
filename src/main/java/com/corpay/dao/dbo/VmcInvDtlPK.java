package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class VmcInvDtlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "ENTRY_SEQ")
    private int entrySeq;

    public VmcInvDtlPK() {
    }

    public VmcInvDtlPK(String crdNbr, int entrySeq) {
        this.crdNbr = crdNbr;
        this.entrySeq = entrySeq;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public int getEntrySeq() {
        return entrySeq;
    }

    public void setEntrySeq(int entrySeq) {
        this.entrySeq = entrySeq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        hash += (int) entrySeq;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VmcInvDtlPK)) {
            return false;
        }
        VmcInvDtlPK other = (VmcInvDtlPK) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        if (this.entrySeq != other.entrySeq) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VmcInvDtlPK[ crdNbr=" + crdNbr + ", entrySeq=" + entrySeq + " ]";
    }

}
