/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class McDtlTaxPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TAX_AMT_TS")
    private String taxAmtTs;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_OCC_IND")
    private short taxAmtOccInd;
    @Basic(optional = false)
    @Column(name = "PARENT_TABLE")
    private String parentTable;

    public McDtlTaxPK() {
    }

    public McDtlTaxPK(String taxAmtTs, short taxAmtOccInd, String parentTable) {
        this.taxAmtTs = taxAmtTs;
        this.taxAmtOccInd = taxAmtOccInd;
        this.parentTable = parentTable;
    }

    public String getTaxAmtTs() {
        return taxAmtTs;
    }

    public void setTaxAmtTs(String taxAmtTs) {
        this.taxAmtTs = taxAmtTs;
    }

    public short getTaxAmtOccInd() {
        return taxAmtOccInd;
    }

    public void setTaxAmtOccInd(short taxAmtOccInd) {
        this.taxAmtOccInd = taxAmtOccInd;
    }

    public String getParentTable() {
        return parentTable;
    }

    public void setParentTable(String parentTable) {
        this.parentTable = parentTable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxAmtTs != null ? taxAmtTs.hashCode() : 0);
        hash += (int) taxAmtOccInd;
        hash += (parentTable != null ? parentTable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McDtlTaxPK)) {
            return false;
        }
        McDtlTaxPK other = (McDtlTaxPK) object;
        if ((this.taxAmtTs == null && other.taxAmtTs != null) || (this.taxAmtTs != null && !this.taxAmtTs.equals(other.taxAmtTs))) {
            return false;
        }
        if (this.taxAmtOccInd != other.taxAmtOccInd) {
            return false;
        }
        if ((this.parentTable == null && other.parentTable != null) || (this.parentTable != null && !this.parentTable.equals(other.parentTable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McDtlTaxPK[ taxAmtTs=" + taxAmtTs + ", taxAmtOccInd=" + taxAmtOccInd + ", parentTable=" + parentTable + " ]";
    }
    
}
