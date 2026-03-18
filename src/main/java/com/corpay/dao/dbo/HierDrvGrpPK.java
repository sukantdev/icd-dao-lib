package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HierDrvGrpPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "DRV_GRP_ID")
    private String drvGrpId;

    public HierDrvGrpPK() {
    }

    public HierDrvGrpPK(String hierId, String drvGrpId) {
        this.hierId = hierId;
        this.drvGrpId = drvGrpId;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public String getDrvGrpId() {
        return drvGrpId;
    }

    public void setDrvGrpId(String drvGrpId) {
        this.drvGrpId = drvGrpId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierId != null ? hierId.hashCode() : 0);
        hash += (drvGrpId != null ? drvGrpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierDrvGrpPK)) {
            return false;
        }
        HierDrvGrpPK other = (HierDrvGrpPK) object;
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        if ((this.drvGrpId == null && other.drvGrpId != null) || (this.drvGrpId != null && !this.drvGrpId.equals(other.drvGrpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierDrvGrpPK[ hierId=" + hierId + ", drvGrpId=" + drvGrpId + " ]";
    }

}
