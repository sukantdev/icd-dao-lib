package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrdInvPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_TYP_CD")
    private String crdTypCd;
    @Basic(optional = false)
    @Column(name = "CRD_FRMT_CD")
    private String crdFrmtCd;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private int seqNbr;

    public CrdInvPK() {
    }

    public CrdInvPK(String crdTypCd, String crdFrmtCd, int seqNbr) {
        this.crdTypCd = crdTypCd;
        this.crdFrmtCd = crdFrmtCd;
        this.seqNbr = seqNbr;
    }

    public String getCrdTypCd() {
        return crdTypCd;
    }

    public void setCrdTypCd(String crdTypCd) {
        this.crdTypCd = crdTypCd;
    }

    public String getCrdFrmtCd() {
        return crdFrmtCd;
    }

    public void setCrdFrmtCd(String crdFrmtCd) {
        this.crdFrmtCd = crdFrmtCd;
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
        hash += (crdTypCd != null ? crdTypCd.hashCode() : 0);
        hash += (crdFrmtCd != null ? crdFrmtCd.hashCode() : 0);
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdInvPK)) {
            return false;
        }
        CrdInvPK other = (CrdInvPK) object;
        if ((this.crdTypCd == null && other.crdTypCd != null) || (this.crdTypCd != null && !this.crdTypCd.equals(other.crdTypCd))) {
            return false;
        }
        if ((this.crdFrmtCd == null && other.crdFrmtCd != null) || (this.crdFrmtCd != null && !this.crdFrmtCd.equals(other.crdFrmtCd))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdInvPK[ crdTypCd=" + crdTypCd + ", crdFrmtCd=" + crdFrmtCd + ", seqNbr=" + seqNbr + " ]";
    }

}
