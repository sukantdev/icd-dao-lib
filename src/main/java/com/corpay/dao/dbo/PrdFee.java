package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "PRD_FEE", catalog = "", schema = "DBO")
public class PrdFee implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdFeePK prdFeePK;
    @Basic(optional = false)
    @Column(name = "PRD_DESC")
    private String prdDesc;

    @Basic(optional = false)
    @Column(name = "PRD_FEE")
    private BigDecimal prdFee;

    public PrdFee() {
    }

    public PrdFee(PrdFeePK prdFeePK) {
        this.prdFeePK = prdFeePK;
    }

    public PrdFee(PrdFeePK prdFeePK, String prdDesc, BigDecimal prdFee) {
        this.prdFeePK = prdFeePK;
        this.prdDesc = prdDesc;
        this.prdFee = prdFee;
    }

    public PrdFee(String prdGrpId, String prdFeeTyp) {
        this.prdFeePK = new PrdFeePK(prdGrpId, prdFeeTyp);
    }

    public PrdFeePK getPrdFeePK() {
        return prdFeePK;
    }

    public void setPrdFeePK(PrdFeePK prdFeePK) {
        this.prdFeePK = prdFeePK;
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    public BigDecimal getPrdFee() {
        return prdFee;
    }

    public void setPrdFee(BigDecimal prdFee) {
        this.prdFee = prdFee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdFeePK != null ? prdFeePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdFee)) {
            return false;
        }
        PrdFee other = (PrdFee) object;
        if ((this.prdFeePK == null && other.prdFeePK != null) || (this.prdFeePK != null && !this.prdFeePK.equals(other.prdFeePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdFee[ prdFeePK=" + prdFeePK + " ]";
    }

}
