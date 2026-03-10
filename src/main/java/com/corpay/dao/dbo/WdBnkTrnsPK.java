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
public class WdBnkTrnsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BT_PMT_NBR")
    private int btPmtNbr;
    @Basic(optional = false)
    @Column(name = "BT_TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date btTrnsDt;

    public WdBnkTrnsPK() {
    }

    public WdBnkTrnsPK(int btPmtNbr, Date btTrnsDt) {
        this.btPmtNbr = btPmtNbr;
        this.btTrnsDt = btTrnsDt;
    }

    public int getBtPmtNbr() {
        return btPmtNbr;
    }

    public void setBtPmtNbr(int btPmtNbr) {
        this.btPmtNbr = btPmtNbr;
    }

    public Date getBtTrnsDt() {
        return btTrnsDt;
    }

    public void setBtTrnsDt(Date btTrnsDt) {
        this.btTrnsDt = btTrnsDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) btPmtNbr;
        hash += (btTrnsDt != null ? btTrnsDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WdBnkTrnsPK)) {
            return false;
        }
        WdBnkTrnsPK other = (WdBnkTrnsPK) object;
        if (this.btPmtNbr != other.btPmtNbr) {
            return false;
        }
        if ((this.btTrnsDt == null && other.btTrnsDt != null) || (this.btTrnsDt != null && !this.btTrnsDt.equals(other.btTrnsDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.WdBnkTrnsPK[ btPmtNbr=" + btPmtNbr + ", btTrnsDt=" + btTrnsDt + " ]";
    }
    
}
