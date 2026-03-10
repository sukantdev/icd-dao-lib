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
public class TenantIdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TENANT_ID")
    private String tenantId;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;

    public TenantIdPK() {
    }

    public TenantIdPK(String tenantId, String custId) {
        this.tenantId = tenantId;
        this.custId = custId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tenantId != null ? tenantId.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TenantIdPK)) {
            return false;
        }
        TenantIdPK other = (TenantIdPK) object;
        if ((this.tenantId == null && other.tenantId != null) || (this.tenantId != null && !this.tenantId.equals(other.tenantId))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TenantIdPK[ tenantId=" + tenantId + ", custId=" + custId + " ]";
    }
    
}
