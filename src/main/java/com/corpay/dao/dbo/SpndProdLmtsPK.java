package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SpndProdLmtsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SPND_PRDL_ACCT_NBR")
    private String spndPrdlAcctNbr;
    @Basic(optional = false)
    @Column(name = "SPND_PRODC_ID")
    private String spndProdcId;

    public SpndProdLmtsPK() {
    }

    public SpndProdLmtsPK(String spndPrdlAcctNbr, String spndProdcId) {
        this.spndPrdlAcctNbr = spndPrdlAcctNbr;
        this.spndProdcId = spndProdcId;
    }

    public String getSpndPrdlAcctNbr() {
        return spndPrdlAcctNbr;
    }

    public void setSpndPrdlAcctNbr(String spndPrdlAcctNbr) {
        this.spndPrdlAcctNbr = spndPrdlAcctNbr;
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
        hash += (spndPrdlAcctNbr != null ? spndPrdlAcctNbr.hashCode() : 0);
        hash += (spndProdcId != null ? spndProdcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof SpndProdLmtsPK)) {
            return false;
        }
        SpndProdLmtsPK other = (SpndProdLmtsPK) object;
        if ((this.spndPrdlAcctNbr == null && other.spndPrdlAcctNbr != null) || (this.spndPrdlAcctNbr != null && !this.spndPrdlAcctNbr.equals(other.spndPrdlAcctNbr))) {
            return false;
        }
        if ((this.spndProdcId == null && other.spndProdcId != null) || (this.spndProdcId != null && !this.spndProdcId.equals(other.spndProdcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SpndProdLmtsPK[ spndPrdlAcctNbr=" + spndPrdlAcctNbr + ", spndProdcId=" + spndProdcId + " ]";
    }

}
