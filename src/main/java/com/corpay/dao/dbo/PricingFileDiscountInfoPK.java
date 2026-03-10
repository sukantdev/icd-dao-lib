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
public class PricingFileDiscountInfoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PFID_CD")
    private String pfidCd;
    @Basic(optional = false)
    @Column(name = "CUST_TYP")
    private String custTyp;
    @Basic(optional = false)
    @Column(name = "CUST_CD")
    private String custCd;
    @Basic(optional = false)
    @Column(name = "LOC_TYP")
    private String locTyp;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;

    public PricingFileDiscountInfoPK() {
    }

    public PricingFileDiscountInfoPK(String pfidCd, String custTyp, String custCd, String locTyp, String locCd) {
        this.pfidCd = pfidCd;
        this.custTyp = custTyp;
        this.custCd = custCd;
        this.locTyp = locTyp;
        this.locCd = locCd;
    }

    public String getPfidCd() {
        return pfidCd;
    }

    public void setPfidCd(String pfidCd) {
        this.pfidCd = pfidCd;
    }

    public String getCustTyp() {
        return custTyp;
    }

    public void setCustTyp(String custTyp) {
        this.custTyp = custTyp;
    }

    public String getCustCd() {
        return custCd;
    }

    public void setCustCd(String custCd) {
        this.custCd = custCd;
    }

    public String getLocTyp() {
        return locTyp;
    }

    public void setLocTyp(String locTyp) {
        this.locTyp = locTyp;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pfidCd != null ? pfidCd.hashCode() : 0);
        hash += (custTyp != null ? custTyp.hashCode() : 0);
        hash += (custCd != null ? custCd.hashCode() : 0);
        hash += (locTyp != null ? locTyp.hashCode() : 0);
        hash += (locCd != null ? locCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PricingFileDiscountInfoPK)) {
            return false;
        }
        PricingFileDiscountInfoPK other = (PricingFileDiscountInfoPK) object;
        if ((this.pfidCd == null && other.pfidCd != null) || (this.pfidCd != null && !this.pfidCd.equals(other.pfidCd))) {
            return false;
        }
        if ((this.custTyp == null && other.custTyp != null) || (this.custTyp != null && !this.custTyp.equals(other.custTyp))) {
            return false;
        }
        if ((this.custCd == null && other.custCd != null) || (this.custCd != null && !this.custCd.equals(other.custCd))) {
            return false;
        }
        if ((this.locTyp == null && other.locTyp != null) || (this.locTyp != null && !this.locTyp.equals(other.locTyp))) {
            return false;
        }
        if ((this.locCd == null && other.locCd != null) || (this.locCd != null && !this.locCd.equals(other.locCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PricingFileDiscountInfoPK[ pfidCd=" + pfidCd + ", custTyp=" + custTyp + ", custCd=" + custCd + ", locTyp=" + locTyp + ", locCd=" + locCd + " ]";
    }
    
}
