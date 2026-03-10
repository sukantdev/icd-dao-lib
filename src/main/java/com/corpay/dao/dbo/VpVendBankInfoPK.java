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
public class VpVendBankInfoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BNK_PAY_LOC")
    private String bnkPayLoc;
    @Basic(optional = false)
    @Column(name = "BNK_PAY_LOC_TYP")
    private String bnkPayLocTyp;
    @Basic(optional = false)
    @Column(name = "BNK_PAY_METH")
    private String bnkPayMeth;

    public VpVendBankInfoPK() {
    }

    public VpVendBankInfoPK(String bnkPayLoc, String bnkPayLocTyp, String bnkPayMeth) {
        this.bnkPayLoc = bnkPayLoc;
        this.bnkPayLocTyp = bnkPayLocTyp;
        this.bnkPayMeth = bnkPayMeth;
    }

    public String getBnkPayLoc() {
        return bnkPayLoc;
    }

    public void setBnkPayLoc(String bnkPayLoc) {
        this.bnkPayLoc = bnkPayLoc;
    }

    public String getBnkPayLocTyp() {
        return bnkPayLocTyp;
    }

    public void setBnkPayLocTyp(String bnkPayLocTyp) {
        this.bnkPayLocTyp = bnkPayLocTyp;
    }

    public String getBnkPayMeth() {
        return bnkPayMeth;
    }

    public void setBnkPayMeth(String bnkPayMeth) {
        this.bnkPayMeth = bnkPayMeth;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bnkPayLoc != null ? bnkPayLoc.hashCode() : 0);
        hash += (bnkPayLocTyp != null ? bnkPayLocTyp.hashCode() : 0);
        hash += (bnkPayMeth != null ? bnkPayMeth.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpVendBankInfoPK)) {
            return false;
        }
        VpVendBankInfoPK other = (VpVendBankInfoPK) object;
        if ((this.bnkPayLoc == null && other.bnkPayLoc != null) || (this.bnkPayLoc != null && !this.bnkPayLoc.equals(other.bnkPayLoc))) {
            return false;
        }
        if ((this.bnkPayLocTyp == null && other.bnkPayLocTyp != null) || (this.bnkPayLocTyp != null && !this.bnkPayLocTyp.equals(other.bnkPayLocTyp))) {
            return false;
        }
        if ((this.bnkPayMeth == null && other.bnkPayMeth != null) || (this.bnkPayMeth != null && !this.bnkPayMeth.equals(other.bnkPayMeth))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpVendBankInfoPK[ bnkPayLoc=" + bnkPayLoc + ", bnkPayLocTyp=" + bnkPayLocTyp + ", bnkPayMeth=" + bnkPayMeth + " ]";
    }
    
}
