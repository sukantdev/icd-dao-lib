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
public class PaycodePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PAY_LOC")
    private String payLoc;
    @Basic(optional = false)
    @Column(name = "PAY_UNIQ_CD")
    private String payUniqCd;

    public PaycodePK() {
    }

    public PaycodePK(String payLoc, String payUniqCd) {
        this.payLoc = payLoc;
        this.payUniqCd = payUniqCd;
    }

    public String getPayLoc() {
        return payLoc;
    }

    public void setPayLoc(String payLoc) {
        this.payLoc = payLoc;
    }

    public String getPayUniqCd() {
        return payUniqCd;
    }

    public void setPayUniqCd(String payUniqCd) {
        this.payUniqCd = payUniqCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (payLoc != null ? payLoc.hashCode() : 0);
        hash += (payUniqCd != null ? payUniqCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaycodePK)) {
            return false;
        }
        PaycodePK other = (PaycodePK) object;
        if ((this.payLoc == null && other.payLoc != null) || (this.payLoc != null && !this.payLoc.equals(other.payLoc))) {
            return false;
        }
        if ((this.payUniqCd == null && other.payUniqCd != null) || (this.payUniqCd != null && !this.payUniqCd.equals(other.payUniqCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PaycodePK[ payLoc=" + payLoc + ", payUniqCd=" + payUniqCd + " ]";
    }
    
}
