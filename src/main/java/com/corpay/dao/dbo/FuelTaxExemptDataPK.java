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
public class FuelTaxExemptDataPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TAX_TRANS_DT")
    private int taxTransDt;
    @Basic(optional = false)
    @Column(name = "TAX_CONTROL_NBR")
    private int taxControlNbr;
    @Basic(optional = false)
    @Column(name = "TAX_SUB_PROD_CD")
    private String taxSubProdCd;
    @Basic(optional = false)
    @Column(name = "TAX_ID")
    private int taxId;

    public FuelTaxExemptDataPK() {
    }

    public FuelTaxExemptDataPK(int taxTransDt, int taxControlNbr, String taxSubProdCd, int taxId) {
        this.taxTransDt = taxTransDt;
        this.taxControlNbr = taxControlNbr;
        this.taxSubProdCd = taxSubProdCd;
        this.taxId = taxId;
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

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) taxTransDt;
        hash += (int) taxControlNbr;
        hash += (taxSubProdCd != null ? taxSubProdCd.hashCode() : 0);
        hash += (int) taxId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FuelTaxExemptDataPK)) {
            return false;
        }
        FuelTaxExemptDataPK other = (FuelTaxExemptDataPK) object;
        if (this.taxTransDt != other.taxTransDt) {
            return false;
        }
        if (this.taxControlNbr != other.taxControlNbr) {
            return false;
        }
        if ((this.taxSubProdCd == null && other.taxSubProdCd != null) || (this.taxSubProdCd != null && !this.taxSubProdCd.equals(other.taxSubProdCd))) {
            return false;
        }
        if (this.taxId != other.taxId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FuelTaxExemptDataPK[ taxTransDt=" + taxTransDt + ", taxControlNbr=" + taxControlNbr + ", taxSubProdCd=" + taxSubProdCd + ", taxId=" + taxId + " ]";
    }
    
}
