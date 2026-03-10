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
public class AcctLvlsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "LVL_NBR")
    private short lvlNbr;

    public AcctLvlsPK() {
    }

    public AcctLvlsPK(String acctNbr, short lvlNbr) {
        this.acctNbr = acctNbr;
        this.lvlNbr = lvlNbr;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public short getLvlNbr() {
        return lvlNbr;
    }

    public void setLvlNbr(short lvlNbr) {
        this.lvlNbr = lvlNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (int) lvlNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctLvlsPK)) {
            return false;
        }
        AcctLvlsPK other = (AcctLvlsPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if (this.lvlNbr != other.lvlNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctLvlsPK[ acctNbr=" + acctNbr + ", lvlNbr=" + lvlNbr + " ]";
    }
    
}
