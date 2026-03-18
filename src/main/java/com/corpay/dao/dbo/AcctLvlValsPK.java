package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AcctLvlValsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "LVL_NBR")
    private short lvlNbr;
    @Basic(optional = false)
    @Column(name = "LVL_VAL_NBR")
    private short lvlValNbr;

    public AcctLvlValsPK() {
    }

    public AcctLvlValsPK(String acctNbr, short lvlNbr, short lvlValNbr) {
        this.acctNbr = acctNbr;
        this.lvlNbr = lvlNbr;
        this.lvlValNbr = lvlValNbr;
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

    public short getLvlValNbr() {
        return lvlValNbr;
    }

    public void setLvlValNbr(short lvlValNbr) {
        this.lvlValNbr = lvlValNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (int) lvlNbr;
        hash += (int) lvlValNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AcctLvlValsPK)) {
            return false;
        }
        AcctLvlValsPK other = (AcctLvlValsPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if (this.lvlNbr != other.lvlNbr) {
            return false;
        }
        if (this.lvlValNbr != other.lvlValNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctLvlValsPK[ acctNbr=" + acctNbr + ", lvlNbr=" + lvlNbr + ", lvlValNbr=" + lvlValNbr + " ]";
    }

}
