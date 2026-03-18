package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OnUsMerchXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "OIL_CO_BNM")
    private short oilCoBnm;
    @Basic(optional = false)
    @Column(name = "ACQ_INST_ID_CD")
    private String acqInstIdCd;
    @Basic(optional = false)
    @Column(name = "CRD_ACPR_ID")
    private String crdAcprId;

    public OnUsMerchXrefPK() {
    }

    public OnUsMerchXrefPK(short oilCoBnm, String acqInstIdCd, String crdAcprId) {
        this.oilCoBnm = oilCoBnm;
        this.acqInstIdCd = acqInstIdCd;
        this.crdAcprId = crdAcprId;
    }

    public short getOilCoBnm() {
        return oilCoBnm;
    }

    public void setOilCoBnm(short oilCoBnm) {
        this.oilCoBnm = oilCoBnm;
    }

    public String getAcqInstIdCd() {
        return acqInstIdCd;
    }

    public void setAcqInstIdCd(String acqInstIdCd) {
        this.acqInstIdCd = acqInstIdCd;
    }

    public String getCrdAcprId() {
        return crdAcprId;
    }

    public void setCrdAcprId(String crdAcprId) {
        this.crdAcprId = crdAcprId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) oilCoBnm;
        hash += (acqInstIdCd != null ? acqInstIdCd.hashCode() : 0);
        hash += (crdAcprId != null ? crdAcprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof OnUsMerchXrefPK)) {
            return false;
        }
        OnUsMerchXrefPK other = (OnUsMerchXrefPK) object;
        if (this.oilCoBnm != other.oilCoBnm) {
            return false;
        }
        if ((this.acqInstIdCd == null && other.acqInstIdCd != null) || (this.acqInstIdCd != null && !this.acqInstIdCd.equals(other.acqInstIdCd))) {
            return false;
        }
        if ((this.crdAcprId == null && other.crdAcprId != null) || (this.crdAcprId != null && !this.crdAcprId.equals(other.crdAcprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.OnUsMerchXrefPK[ oilCoBnm=" + oilCoBnm + ", acqInstIdCd=" + acqInstIdCd + ", crdAcprId=" + crdAcprId + " ]";
    }

}
