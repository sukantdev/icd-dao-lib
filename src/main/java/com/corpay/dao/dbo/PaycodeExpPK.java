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
public class PaycodeExpPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PAY_LOC")
    private String payLoc;
    @Basic(optional = false)
    @Column(name = "PAY_UNIQ_CD")
    private String payUniqCd;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private int seqNbr;

    public PaycodeExpPK() {
    }

    public PaycodeExpPK(String payLoc, String payUniqCd, int seqNbr) {
        this.payLoc = payLoc;
        this.payUniqCd = payUniqCd;
        this.seqNbr = seqNbr;
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

    public int getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(int seqNbr) {
        this.seqNbr = seqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (payLoc != null ? payLoc.hashCode() : 0);
        hash += (payUniqCd != null ? payUniqCd.hashCode() : 0);
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaycodeExpPK)) {
            return false;
        }
        PaycodeExpPK other = (PaycodeExpPK) object;
        if ((this.payLoc == null && other.payLoc != null) || (this.payLoc != null && !this.payLoc.equals(other.payLoc))) {
            return false;
        }
        if ((this.payUniqCd == null && other.payUniqCd != null) || (this.payUniqCd != null && !this.payUniqCd.equals(other.payUniqCd))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PaycodeExpPK[ payLoc=" + payLoc + ", payUniqCd=" + payUniqCd + ", seqNbr=" + seqNbr + " ]";
    }
    
}
