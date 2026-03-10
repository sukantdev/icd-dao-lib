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
public class PrpCanTax2PK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CAN_TAX_PRVNC_CD")
    private String canTaxPrvncCd;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_PRD_CD")
    private String canTaxPrdCd;
    @Basic(optional = false)
    @Column(name = "CAN_EFCTV_DT")
    @Temporal(TemporalType.DATE)
    private Date canEfctvDt;

    public PrpCanTax2PK() {
    }

    public PrpCanTax2PK(String canTaxPrvncCd, String canTaxPrdCd, Date canEfctvDt) {
        this.canTaxPrvncCd = canTaxPrvncCd;
        this.canTaxPrdCd = canTaxPrdCd;
        this.canEfctvDt = canEfctvDt;
    }

    public String getCanTaxPrvncCd() {
        return canTaxPrvncCd;
    }

    public void setCanTaxPrvncCd(String canTaxPrvncCd) {
        this.canTaxPrvncCd = canTaxPrvncCd;
    }

    public String getCanTaxPrdCd() {
        return canTaxPrdCd;
    }

    public void setCanTaxPrdCd(String canTaxPrdCd) {
        this.canTaxPrdCd = canTaxPrdCd;
    }

    public Date getCanEfctvDt() {
        return canEfctvDt;
    }

    public void setCanEfctvDt(Date canEfctvDt) {
        this.canEfctvDt = canEfctvDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (canTaxPrvncCd != null ? canTaxPrvncCd.hashCode() : 0);
        hash += (canTaxPrdCd != null ? canTaxPrdCd.hashCode() : 0);
        hash += (canEfctvDt != null ? canEfctvDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrpCanTax2PK)) {
            return false;
        }
        PrpCanTax2PK other = (PrpCanTax2PK) object;
        if ((this.canTaxPrvncCd == null && other.canTaxPrvncCd != null) || (this.canTaxPrvncCd != null && !this.canTaxPrvncCd.equals(other.canTaxPrvncCd))) {
            return false;
        }
        if ((this.canTaxPrdCd == null && other.canTaxPrdCd != null) || (this.canTaxPrdCd != null && !this.canTaxPrdCd.equals(other.canTaxPrdCd))) {
            return false;
        }
        if ((this.canEfctvDt == null && other.canEfctvDt != null) || (this.canEfctvDt != null && !this.canEfctvDt.equals(other.canEfctvDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrpCanTax2PK[ canTaxPrvncCd=" + canTaxPrvncCd + ", canTaxPrdCd=" + canTaxPrdCd + ", canEfctvDt=" + canEfctvDt + " ]";
    }
    
}
