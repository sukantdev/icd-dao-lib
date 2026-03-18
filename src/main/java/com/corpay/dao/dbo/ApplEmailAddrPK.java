package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ApplEmailAddrPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ENTITY_LVL")
    private String entityLvl;
    @Basic(optional = false)
    @Column(name = "ENTITY_ID")
    private String entityId;
    @Basic(optional = false)
    @Column(name = "APPL_ID")
    private String applId;

    public ApplEmailAddrPK() {
    }

    public ApplEmailAddrPK(String entityLvl, String entityId, String applId) {
        this.entityLvl = entityLvl;
        this.entityId = entityId;
        this.applId = applId;
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

    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityLvl != null ? entityLvl.hashCode() : 0);
        hash += (entityId != null ? entityId.hashCode() : 0);
        hash += (applId != null ? applId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ApplEmailAddrPK)) {
            return false;
        }
        ApplEmailAddrPK other = (ApplEmailAddrPK) object;
        if ((this.entityLvl == null && other.entityLvl != null) || (this.entityLvl != null && !this.entityLvl.equals(other.entityLvl))) {
            return false;
        }
        if ((this.entityId == null && other.entityId != null) || (this.entityId != null && !this.entityId.equals(other.entityId))) {
            return false;
        }
        if ((this.applId == null && other.applId != null) || (this.applId != null && !this.applId.equals(other.applId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ApplEmailAddrPK[ entityLvl=" + entityLvl + ", entityId=" + entityId + ", applId=" + applId + " ]";
    }

}
