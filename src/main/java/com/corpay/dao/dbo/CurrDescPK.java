package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CurrDescPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CURR_DESC_ISO")
    private short currDescIso;
    @Basic(optional = false)
    @Column(name = "CURR_DESC_ALPH")
    private String currDescAlph;

    public CurrDescPK() {
    }

    public CurrDescPK(short currDescIso, String currDescAlph) {
        this.currDescIso = currDescIso;
        this.currDescAlph = currDescAlph;
    }

    public short getCurrDescIso() {
        return currDescIso;
    }

    public void setCurrDescIso(short currDescIso) {
        this.currDescIso = currDescIso;
    }

    public String getCurrDescAlph() {
        return currDescAlph;
    }

    public void setCurrDescAlph(String currDescAlph) {
        this.currDescAlph = currDescAlph;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) currDescIso;
        hash += (currDescAlph != null ? currDescAlph.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CurrDescPK)) {
            return false;
        }
        CurrDescPK other = (CurrDescPK) object;
        if (this.currDescIso != other.currDescIso) {
            return false;
        }
        if ((this.currDescAlph == null && other.currDescAlph != null) || (this.currDescAlph != null && !this.currDescAlph.equals(other.currDescAlph))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CurrDescPK[ currDescIso=" + currDescIso + ", currDescAlph=" + currDescAlph + " ]";
    }

}
