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
public class HierUnitGrpPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "UNIT_GRP_ID")
    private String unitGrpId;

    public HierUnitGrpPK() {
    }

    public HierUnitGrpPK(String hierId, String unitGrpId) {
        this.hierId = hierId;
        this.unitGrpId = unitGrpId;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public String getUnitGrpId() {
        return unitGrpId;
    }

    public void setUnitGrpId(String unitGrpId) {
        this.unitGrpId = unitGrpId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierId != null ? hierId.hashCode() : 0);
        hash += (unitGrpId != null ? unitGrpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HierUnitGrpPK)) {
            return false;
        }
        HierUnitGrpPK other = (HierUnitGrpPK) object;
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        if ((this.unitGrpId == null && other.unitGrpId != null) || (this.unitGrpId != null && !this.unitGrpId.equals(other.unitGrpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierUnitGrpPK[ hierId=" + hierId + ", unitGrpId=" + unitGrpId + " ]";
    }
    
}
