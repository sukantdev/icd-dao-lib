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
public class NtwkGrpXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "GRP")
    private short grp;
    @Basic(optional = false)
    @Column(name = "NTWK_ID")
    private String ntwkId;

    public NtwkGrpXrefPK() {
    }

    public NtwkGrpXrefPK(short grp, String ntwkId) {
        this.grp = grp;
        this.ntwkId = ntwkId;
    }

    public short getGrp() {
        return grp;
    }

    public void setGrp(short grp) {
        this.grp = grp;
    }

    public String getNtwkId() {
        return ntwkId;
    }

    public void setNtwkId(String ntwkId) {
        this.ntwkId = ntwkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) grp;
        hash += (ntwkId != null ? ntwkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NtwkGrpXrefPK)) {
            return false;
        }
        NtwkGrpXrefPK other = (NtwkGrpXrefPK) object;
        if (this.grp != other.grp) {
            return false;
        }
        if ((this.ntwkId == null && other.ntwkId != null) || (this.ntwkId != null && !this.ntwkId.equals(other.ntwkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NtwkGrpXrefPK[ grp=" + grp + ", ntwkId=" + ntwkId + " ]";
    }
    
}
