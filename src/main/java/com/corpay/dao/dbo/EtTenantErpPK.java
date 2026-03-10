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
public class EtTenantErpPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TENANT_ID")
    private String tenantId;
    @Basic(optional = false)
    @Column(name = "ERP_NM")
    private String erpNm;
    @Basic(optional = false)
    @Column(name = "OVRD_NM")
    private String ovrdNm;

    public EtTenantErpPK() {
    }

    public EtTenantErpPK(String tenantId, String erpNm, String ovrdNm) {
        this.tenantId = tenantId;
        this.erpNm = erpNm;
        this.ovrdNm = ovrdNm;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getErpNm() {
        return erpNm;
    }

    public void setErpNm(String erpNm) {
        this.erpNm = erpNm;
    }

    public String getOvrdNm() {
        return ovrdNm;
    }

    public void setOvrdNm(String ovrdNm) {
        this.ovrdNm = ovrdNm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tenantId != null ? tenantId.hashCode() : 0);
        hash += (erpNm != null ? erpNm.hashCode() : 0);
        hash += (ovrdNm != null ? ovrdNm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtTenantErpPK)) {
            return false;
        }
        EtTenantErpPK other = (EtTenantErpPK) object;
        if ((this.tenantId == null && other.tenantId != null) || (this.tenantId != null && !this.tenantId.equals(other.tenantId))) {
            return false;
        }
        if ((this.erpNm == null && other.erpNm != null) || (this.erpNm != null && !this.erpNm.equals(other.erpNm))) {
            return false;
        }
        if ((this.ovrdNm == null && other.ovrdNm != null) || (this.ovrdNm != null && !this.ovrdNm.equals(other.ovrdNm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EtTenantErpPK[ tenantId=" + tenantId + ", erpNm=" + erpNm + ", ovrdNm=" + ovrdNm + " ]";
    }
    
}
