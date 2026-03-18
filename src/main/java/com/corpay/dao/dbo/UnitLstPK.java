package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UnitLstPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_HIER_ID")
    private String custHierId;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "GRP_ID")
    private String grpId;
    @Basic(optional = false)
    @Column(name = "REC_ID")
    private Character recId;

    public UnitLstPK() {
    }

    public UnitLstPK(String custHierId, String unitNbr, String grpId, Character recId) {
        this.custHierId = custHierId;
        this.unitNbr = unitNbr;
        this.grpId = grpId;
        this.recId = recId;
    }

    public String getCustHierId() {
        return custHierId;
    }

    public void setCustHierId(String custHierId) {
        this.custHierId = custHierId;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public String getGrpId() {
        return grpId;
    }

    public void setGrpId(String grpId) {
        this.grpId = grpId;
    }

    public Character getRecId() {
        return recId;
    }

    public void setRecId(Character recId) {
        this.recId = recId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custHierId != null ? custHierId.hashCode() : 0);
        hash += (unitNbr != null ? unitNbr.hashCode() : 0);
        hash += (grpId != null ? grpId.hashCode() : 0);
        hash += (recId != null ? recId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UnitLstPK)) {
            return false;
        }
        UnitLstPK other = (UnitLstPK) object;
        if ((this.custHierId == null && other.custHierId != null) || (this.custHierId != null && !this.custHierId.equals(other.custHierId))) {
            return false;
        }
        if ((this.unitNbr == null && other.unitNbr != null) || (this.unitNbr != null && !this.unitNbr.equals(other.unitNbr))) {
            return false;
        }
        if ((this.grpId == null && other.grpId != null) || (this.grpId != null && !this.grpId.equals(other.grpId))) {
            return false;
        }
        if ((this.recId == null && other.recId != null) || (this.recId != null && !this.recId.equals(other.recId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UnitLstPK[ custHierId=" + custHierId + ", unitNbr=" + unitNbr + ", grpId=" + grpId + ", recId=" + recId + " ]";
    }

}
