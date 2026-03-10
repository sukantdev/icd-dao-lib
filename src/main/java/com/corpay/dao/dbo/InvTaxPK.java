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
public class InvTaxPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TAX_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date taxTs;
    @Basic(optional = false)
    @Column(name = "TAX_PRD_TYP")
    private String taxPrdTyp;
    @Basic(optional = false)
    @Column(name = "TAX_SEQ_NBR")
    private short taxSeqNbr;

    public InvTaxPK() {
    }

    public InvTaxPK(Date taxTs, String taxPrdTyp, short taxSeqNbr) {
        this.taxTs = taxTs;
        this.taxPrdTyp = taxPrdTyp;
        this.taxSeqNbr = taxSeqNbr;
    }

    public Date getTaxTs() {
        return taxTs;
    }

    public void setTaxTs(Date taxTs) {
        this.taxTs = taxTs;
    }

    public String getTaxPrdTyp() {
        return taxPrdTyp;
    }

    public void setTaxPrdTyp(String taxPrdTyp) {
        this.taxPrdTyp = taxPrdTyp;
    }

    public short getTaxSeqNbr() {
        return taxSeqNbr;
    }

    public void setTaxSeqNbr(short taxSeqNbr) {
        this.taxSeqNbr = taxSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxTs != null ? taxTs.hashCode() : 0);
        hash += (taxPrdTyp != null ? taxPrdTyp.hashCode() : 0);
        hash += (int) taxSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvTaxPK)) {
            return false;
        }
        InvTaxPK other = (InvTaxPK) object;
        if ((this.taxTs == null && other.taxTs != null) || (this.taxTs != null && !this.taxTs.equals(other.taxTs))) {
            return false;
        }
        if ((this.taxPrdTyp == null && other.taxPrdTyp != null) || (this.taxPrdTyp != null && !this.taxPrdTyp.equals(other.taxPrdTyp))) {
            return false;
        }
        if (this.taxSeqNbr != other.taxSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvTaxPK[ taxTs=" + taxTs + ", taxPrdTyp=" + taxPrdTyp + ", taxSeqNbr=" + taxSeqNbr + " ]";
    }
    
}
