package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SpndProdLmtsUsedPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SPND_PRDU_ACCT_NBR")
    private String spndPrduAcctNbr;
    @Basic(optional = false)
    @Column(name = "SPND_PRODC_ID")
    private String spndProdcId;

    public SpndProdLmtsUsedPK() {
    }

    public SpndProdLmtsUsedPK(String spndPrduAcctNbr, String spndProdcId) {
        this.spndPrduAcctNbr = spndPrduAcctNbr;
        this.spndProdcId = spndProdcId;
    }

    public String getSpndPrduAcctNbr() {
        return spndPrduAcctNbr;
    }

    public void setSpndPrduAcctNbr(String spndPrduAcctNbr) {
        this.spndPrduAcctNbr = spndPrduAcctNbr;
    }

    public String getSpndProdcId() {
        return spndProdcId;
    }

    public void setSpndProdcId(String spndProdcId) {
        this.spndProdcId = spndProdcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spndPrduAcctNbr != null ? spndPrduAcctNbr.hashCode() : 0);
        hash += (spndProdcId != null ? spndProdcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof SpndProdLmtsUsedPK)) {
            return false;
        }
        SpndProdLmtsUsedPK other = (SpndProdLmtsUsedPK) object;
        if ((this.spndPrduAcctNbr == null && other.spndPrduAcctNbr != null) || (this.spndPrduAcctNbr != null && !this.spndPrduAcctNbr.equals(other.spndPrduAcctNbr))) {
            return false;
        }
        if ((this.spndProdcId == null && other.spndProdcId != null) || (this.spndProdcId != null && !this.spndProdcId.equals(other.spndProdcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SpndProdLmtsUsedPK[ spndPrduAcctNbr=" + spndPrduAcctNbr + ", spndProdcId=" + spndProdcId + " ]";
    }

}
