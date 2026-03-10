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
public class EmailExcPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "ENTITY_LVL")
    private String entityLvl;
    @Basic(optional = false)
    @Column(name = "ENTITY_ID")
    private String entityId;
    @Basic(optional = false)
    @Column(name = "NODE")
    private String node;

    public EmailExcPK() {
    }

    public EmailExcPK(String usrId, String entityLvl, String entityId, String node) {
        this.usrId = usrId;
        this.entityLvl = entityLvl;
        this.entityId = entityId;
        this.node = node;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
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

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (entityLvl != null ? entityLvl.hashCode() : 0);
        hash += (entityId != null ? entityId.hashCode() : 0);
        hash += (node != null ? node.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmailExcPK)) {
            return false;
        }
        EmailExcPK other = (EmailExcPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.entityLvl == null && other.entityLvl != null) || (this.entityLvl != null && !this.entityLvl.equals(other.entityLvl))) {
            return false;
        }
        if ((this.entityId == null && other.entityId != null) || (this.entityId != null && !this.entityId.equals(other.entityId))) {
            return false;
        }
        if ((this.node == null && other.node != null) || (this.node != null && !this.node.equals(other.node))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EmailExcPK[ usrId=" + usrId + ", entityLvl=" + entityLvl + ", entityId=" + entityId + ", node=" + node + " ]";
    }
    
}
