package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CdnTokensPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TKN_TYP_CD")
    private String tknTypCd;
    @Basic(optional = false)
    @Column(name = "TKN_ALPHA_TXT")
    private String tknAlphaTxt;

    public CdnTokensPK() {
    }

    public CdnTokensPK(String tknTypCd, String tknAlphaTxt) {
        this.tknTypCd = tknTypCd;
        this.tknAlphaTxt = tknAlphaTxt;
    }

    public String getTknTypCd() {
        return tknTypCd;
    }

    public void setTknTypCd(String tknTypCd) {
        this.tknTypCd = tknTypCd;
    }

    public String getTknAlphaTxt() {
        return tknAlphaTxt;
    }

    public void setTknAlphaTxt(String tknAlphaTxt) {
        this.tknAlphaTxt = tknAlphaTxt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tknTypCd != null ? tknTypCd.hashCode() : 0);
        hash += (tknAlphaTxt != null ? tknAlphaTxt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CdnTokensPK)) {
            return false;
        }
        CdnTokensPK other = (CdnTokensPK) object;
        if ((this.tknTypCd == null && other.tknTypCd != null) || (this.tknTypCd != null && !this.tknTypCd.equals(other.tknTypCd))) {
            return false;
        }
        if ((this.tknAlphaTxt == null && other.tknAlphaTxt != null) || (this.tknAlphaTxt != null && !this.tknAlphaTxt.equals(other.tknAlphaTxt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CdnTokensPK[ tknTypCd=" + tknTypCd + ", tknAlphaTxt=" + tknAlphaTxt + " ]";
    }

}
