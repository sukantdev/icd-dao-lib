package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FuelTaxExemptHdrPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TAX_TRANS_DT")
    private int taxTransDt;
    @Basic(optional = false)
    @Column(name = "TAX_CONTROL_NBR")
    private int taxControlNbr;
    @Basic(optional = false)
    @Column(name = "TAX_SUB_PROD_CD")
    private String taxSubProdCd;

    public FuelTaxExemptHdrPK() {
    }

    public FuelTaxExemptHdrPK(int taxTransDt, int taxControlNbr, String taxSubProdCd) {
        this.taxTransDt = taxTransDt;
        this.taxControlNbr = taxControlNbr;
        this.taxSubProdCd = taxSubProdCd;
    }

    public int getTaxTransDt() {
        return taxTransDt;
    }

    public void setTaxTransDt(int taxTransDt) {
        this.taxTransDt = taxTransDt;
    }

    public int getTaxControlNbr() {
        return taxControlNbr;
    }

    public void setTaxControlNbr(int taxControlNbr) {
        this.taxControlNbr = taxControlNbr;
    }

    public String getTaxSubProdCd() {
        return taxSubProdCd;
    }

    public void setTaxSubProdCd(String taxSubProdCd) {
        this.taxSubProdCd = taxSubProdCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) taxTransDt;
        hash += (int) taxControlNbr;
        hash += (taxSubProdCd != null ? taxSubProdCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FuelTaxExemptHdrPK)) {
            return false;
        }
        FuelTaxExemptHdrPK other = (FuelTaxExemptHdrPK) object;
        if (this.taxTransDt != other.taxTransDt) {
            return false;
        }
        if (this.taxControlNbr != other.taxControlNbr) {
            return false;
        }
        if ((this.taxSubProdCd == null && other.taxSubProdCd != null) || (this.taxSubProdCd != null && !this.taxSubProdCd.equals(other.taxSubProdCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FuelTaxExemptHdrPK[ taxTransDt=" + taxTransDt + ", taxControlNbr=" + taxControlNbr + ", taxSubProdCd=" + taxSubProdCd + " ]";
    }

}
