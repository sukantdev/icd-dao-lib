/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
public class McPrdAvgPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MC_PA_DATE")
    @Temporal(TemporalType.DATE)
    private Date mcPaDate;
    @Basic(optional = false)
    @Column(name = "MC_PA_PRODUCT")
    private String mcPaProduct;
    @Basic(optional = false)
    @Column(name = "MC_PA_REC_TY")
    private Character mcPaRecTy;
    @Basic(optional = false)
    @Column(name = "MC_PA_REC_ID")
    private String mcPaRecId;

    public McPrdAvgPK() {
    }

    public McPrdAvgPK(Date mcPaDate, String mcPaProduct, Character mcPaRecTy, String mcPaRecId) {
        this.mcPaDate = mcPaDate;
        this.mcPaProduct = mcPaProduct;
        this.mcPaRecTy = mcPaRecTy;
        this.mcPaRecId = mcPaRecId;
    }

    public Date getMcPaDate() {
        return mcPaDate;
    }

    public void setMcPaDate(Date mcPaDate) {
        this.mcPaDate = mcPaDate;
    }

    public String getMcPaProduct() {
        return mcPaProduct;
    }

    public void setMcPaProduct(String mcPaProduct) {
        this.mcPaProduct = mcPaProduct;
    }

    public Character getMcPaRecTy() {
        return mcPaRecTy;
    }

    public void setMcPaRecTy(Character mcPaRecTy) {
        this.mcPaRecTy = mcPaRecTy;
    }

    public String getMcPaRecId() {
        return mcPaRecId;
    }

    public void setMcPaRecId(String mcPaRecId) {
        this.mcPaRecId = mcPaRecId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcPaDate != null ? mcPaDate.hashCode() : 0);
        hash += (mcPaProduct != null ? mcPaProduct.hashCode() : 0);
        hash += (mcPaRecTy != null ? mcPaRecTy.hashCode() : 0);
        hash += (mcPaRecId != null ? mcPaRecId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McPrdAvgPK)) {
            return false;
        }
        McPrdAvgPK other = (McPrdAvgPK) object;
        if ((this.mcPaDate == null && other.mcPaDate != null) || (this.mcPaDate != null && !this.mcPaDate.equals(other.mcPaDate))) {
            return false;
        }
        if ((this.mcPaProduct == null && other.mcPaProduct != null) || (this.mcPaProduct != null && !this.mcPaProduct.equals(other.mcPaProduct))) {
            return false;
        }
        if ((this.mcPaRecTy == null && other.mcPaRecTy != null) || (this.mcPaRecTy != null && !this.mcPaRecTy.equals(other.mcPaRecTy))) {
            return false;
        }
        if ((this.mcPaRecId == null && other.mcPaRecId != null) || (this.mcPaRecId != null && !this.mcPaRecId.equals(other.mcPaRecId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McPrdAvgPK[ mcPaDate=" + mcPaDate + ", mcPaProduct=" + mcPaProduct + ", mcPaRecTy=" + mcPaRecTy + ", mcPaRecId=" + mcPaRecId + " ]";
    }
    
}
