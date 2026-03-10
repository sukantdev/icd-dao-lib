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
public class CrdUsgSetupPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ENTITY_LVL")
    private String entityLvl;
    @Basic(optional = false)
    @Column(name = "ENTITY_ID")
    private String entityId;

    public CrdUsgSetupPK() {
    }

    public CrdUsgSetupPK(String entityLvl, String entityId) {
        this.entityLvl = entityLvl;
        this.entityId = entityId;
    }

    public String getEntityLvl() {
        return entityLvl;
    }

    public void setEntityLvl(String entityLvl) {
        this.entityLvl = entityLvl;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityLvl != null ? entityLvl.hashCode() : 0);
        hash += (entityId != null ? entityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdUsgSetupPK)) {
            return false;
        }
        CrdUsgSetupPK other = (CrdUsgSetupPK) object;
        if ((this.entityLvl == null && other.entityLvl != null) || (this.entityLvl != null && !this.entityLvl.equals(other.entityLvl))) {
            return false;
        }
        if ((this.entityId == null && other.entityId != null) || (this.entityId != null && !this.entityId.equals(other.entityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdUsgSetupPK[ entityLvl=" + entityLvl + ", entityId=" + entityId + " ]";
    }
    
}
