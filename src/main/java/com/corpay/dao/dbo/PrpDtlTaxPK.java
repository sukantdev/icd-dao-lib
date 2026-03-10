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
public class PrpDtlTaxPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRAN_DT")
    private int tranDt;
    @Basic(optional = false)
    @Column(name = "TAX_TRAN_TM")
    private int taxTranTm;
    @Basic(optional = false)
    @Column(name = "TAX_CONTROL_NBR")
    private int taxControlNbr;
    @Basic(optional = false)
    @Column(name = "TAX_PRD_CD")
    private String taxPrdCd;
    @Basic(optional = false)
    @Column(name = "TAX_OCC_IND")
    private short taxOccInd;

    public PrpDtlTaxPK() {
    }

    public PrpDtlTaxPK(int tranDt, int taxTranTm, int taxControlNbr, String taxPrdCd, short taxOccInd) {
        this.tranDt = tranDt;
        this.taxTranTm = taxTranTm;
        this.taxControlNbr = taxControlNbr;
        this.taxPrdCd = taxPrdCd;
        this.taxOccInd = taxOccInd;
    }

    public int getTranDt() {
        return tranDt;
    }

    public void setTranDt(int tranDt) {
        this.tranDt = tranDt;
    }

    public int getTaxTranTm() {
        return taxTranTm;
    }

    public void setTaxTranTm(int taxTranTm) {
        this.taxTranTm = taxTranTm;
    }

    public int getTaxControlNbr() {
        return taxControlNbr;
    }

    public void setTaxControlNbr(int taxControlNbr) {
        this.taxControlNbr = taxControlNbr;
    }

    public String getTaxPrdCd() {
        return taxPrdCd;
    }

    public void setTaxPrdCd(String taxPrdCd) {
        this.taxPrdCd = taxPrdCd;
    }

    public short getTaxOccInd() {
        return taxOccInd;
    }

    public void setTaxOccInd(short taxOccInd) {
        this.taxOccInd = taxOccInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tranDt;
        hash += (int) taxTranTm;
        hash += (int) taxControlNbr;
        hash += (taxPrdCd != null ? taxPrdCd.hashCode() : 0);
        hash += (int) taxOccInd;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrpDtlTaxPK)) {
            return false;
        }
        PrpDtlTaxPK other = (PrpDtlTaxPK) object;
        if (this.tranDt != other.tranDt) {
            return false;
        }
        if (this.taxTranTm != other.taxTranTm) {
            return false;
        }
        if (this.taxControlNbr != other.taxControlNbr) {
            return false;
        }
        if ((this.taxPrdCd == null && other.taxPrdCd != null) || (this.taxPrdCd != null && !this.taxPrdCd.equals(other.taxPrdCd))) {
            return false;
        }
        if (this.taxOccInd != other.taxOccInd) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrpDtlTaxPK[ tranDt=" + tranDt + ", taxTranTm=" + taxTranTm + ", taxControlNbr=" + taxControlNbr + ", taxPrdCd=" + taxPrdCd + ", taxOccInd=" + taxOccInd + " ]";
    }
    
}
