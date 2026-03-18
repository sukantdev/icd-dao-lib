package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PrdFeePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PRD_GRP_ID")
    private String prdGrpId;
    @Basic(optional = false)
    @Column(name = "PRD_FEE_TYP")
    private String prdFeeTyp;

    public PrdFeePK() {
    }

    public PrdFeePK(String prdGrpId, String prdFeeTyp) {
        this.prdGrpId = prdGrpId;
        this.prdFeeTyp = prdFeeTyp;
    }

    public String getPrdGrpId() {
        return prdGrpId;
    }

    public void setPrdGrpId(String prdGrpId) {
        this.prdGrpId = prdGrpId;
    }

    public String getPrdFeeTyp() {
        return prdFeeTyp;
    }

    public void setPrdFeeTyp(String prdFeeTyp) {
        this.prdFeeTyp = prdFeeTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdGrpId != null ? prdGrpId.hashCode() : 0);
        hash += (prdFeeTyp != null ? prdFeeTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdFeePK)) {
            return false;
        }
        PrdFeePK other = (PrdFeePK) object;
        if ((this.prdGrpId == null && other.prdGrpId != null) || (this.prdGrpId != null && !this.prdGrpId.equals(other.prdGrpId))) {
            return false;
        }
        if ((this.prdFeeTyp == null && other.prdFeeTyp != null) || (this.prdFeeTyp != null && !this.prdFeeTyp.equals(other.prdFeeTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdFeePK[ prdGrpId=" + prdGrpId + ", prdFeeTyp=" + prdFeeTyp + " ]";
    }

}
