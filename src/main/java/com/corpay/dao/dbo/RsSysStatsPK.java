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
public class RsSysStatsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "QUE_NM")
    private String queNm;
    @Basic(optional = false)
    @Column(name = "ROW_MNT")
    private int rowMnt;

    public RsSysStatsPK() {
    }

    public RsSysStatsPK(String queNm, int rowMnt) {
        this.queNm = queNm;
        this.rowMnt = rowMnt;
    }

    public String getQueNm() {
        return queNm;
    }

    public void setQueNm(String queNm) {
        this.queNm = queNm;
    }

    public int getRowMnt() {
        return rowMnt;
    }

    public void setRowMnt(int rowMnt) {
        this.rowMnt = rowMnt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (queNm != null ? queNm.hashCode() : 0);
        hash += (int) rowMnt;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RsSysStatsPK)) {
            return false;
        }
        RsSysStatsPK other = (RsSysStatsPK) object;
        if ((this.queNm == null && other.queNm != null) || (this.queNm != null && !this.queNm.equals(other.queNm))) {
            return false;
        }
        if (this.rowMnt != other.rowMnt) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RsSysStatsPK[ queNm=" + queNm + ", rowMnt=" + rowMnt + " ]";
    }
    
}
