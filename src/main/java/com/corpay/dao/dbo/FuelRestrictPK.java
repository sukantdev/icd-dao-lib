package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FuelRestrictPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "TYP_CD")
    private Character typCd;
    @Basic(optional = false)
    @Column(name = "IDENT_NBR")
    private String identNbr;

    public FuelRestrictPK() {
    }

    public FuelRestrictPK(String custId, Character typCd, String identNbr) {
        this.custId = custId;
        this.typCd = typCd;
        this.identNbr = identNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Character getTypCd() {
        return typCd;
    }

    public void setTypCd(Character typCd) {
        this.typCd = typCd;
    }

    public String getIdentNbr() {
        return identNbr;
    }

    public void setIdentNbr(String identNbr) {
        this.identNbr = identNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (typCd != null ? typCd.hashCode() : 0);
        hash += (identNbr != null ? identNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FuelRestrictPK)) {
            return false;
        }
        FuelRestrictPK other = (FuelRestrictPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.typCd == null && other.typCd != null) || (this.typCd != null && !this.typCd.equals(other.typCd))) {
            return false;
        }
        if ((this.identNbr == null && other.identNbr != null) || (this.identNbr != null && !this.identNbr.equals(other.identNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FuelRestrictPK[ custId=" + custId + ", typCd=" + typCd + ", identNbr=" + identNbr + " ]";
    }

}
