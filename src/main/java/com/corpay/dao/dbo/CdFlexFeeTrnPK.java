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
public class CdFlexFeeTrnPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRN_DT")
    @Temporal(TemporalType.DATE)
    private Date trnDt;
    @Basic(optional = false)
    @Column(name = "CNTL_NBR")
    private int cntlNbr;

    public CdFlexFeeTrnPK() {
    }

    public CdFlexFeeTrnPK(Date trnDt, int cntlNbr) {
        this.trnDt = trnDt;
        this.cntlNbr = cntlNbr;
    }

    public Date getTrnDt() {
        return trnDt;
    }

    public void setTrnDt(Date trnDt) {
        this.trnDt = trnDt;
    }

    public int getCntlNbr() {
        return cntlNbr;
    }

    public void setCntlNbr(int cntlNbr) {
        this.cntlNbr = cntlNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnDt != null ? trnDt.hashCode() : 0);
        hash += (int) cntlNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CdFlexFeeTrnPK)) {
            return false;
        }
        CdFlexFeeTrnPK other = (CdFlexFeeTrnPK) object;
        if ((this.trnDt == null && other.trnDt != null) || (this.trnDt != null && !this.trnDt.equals(other.trnDt))) {
            return false;
        }
        if (this.cntlNbr != other.cntlNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CdFlexFeeTrnPK[ trnDt=" + trnDt + ", cntlNbr=" + cntlNbr + " ]";
    }
    
}
