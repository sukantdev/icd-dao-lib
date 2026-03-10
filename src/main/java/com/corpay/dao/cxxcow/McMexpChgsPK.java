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
public class McMexpChgsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MEXP_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mexpTs;
    @Basic(optional = false)
    @Column(name = "PARENT_TABLE")
    private String parentTable;
    @Basic(optional = false)
    @Column(name = "OCC_IND")
    private short occInd;

    public McMexpChgsPK() {
    }

    public McMexpChgsPK(Date mexpTs, String parentTable, short occInd) {
        this.mexpTs = mexpTs;
        this.parentTable = parentTable;
        this.occInd = occInd;
    }

    public Date getMexpTs() {
        return mexpTs;
    }

    public void setMexpTs(Date mexpTs) {
        this.mexpTs = mexpTs;
    }

    public String getParentTable() {
        return parentTable;
    }

    public void setParentTable(String parentTable) {
        this.parentTable = parentTable;
    }

    public short getOccInd() {
        return occInd;
    }

    public void setOccInd(short occInd) {
        this.occInd = occInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mexpTs != null ? mexpTs.hashCode() : 0);
        hash += (parentTable != null ? parentTable.hashCode() : 0);
        hash += (int) occInd;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McMexpChgsPK)) {
            return false;
        }
        McMexpChgsPK other = (McMexpChgsPK) object;
        if ((this.mexpTs == null && other.mexpTs != null) || (this.mexpTs != null && !this.mexpTs.equals(other.mexpTs))) {
            return false;
        }
        if ((this.parentTable == null && other.parentTable != null) || (this.parentTable != null && !this.parentTable.equals(other.parentTable))) {
            return false;
        }
        if (this.occInd != other.occInd) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McMexpChgsPK[ mexpTs=" + mexpTs + ", parentTable=" + parentTable + ", occInd=" + occInd + " ]";
    }
    
}
