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
public class MktrGrpXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "GRP")
    private short grp;
    @Basic(optional = false)
    @Column(name = "MKTR_ID")
    private String mktrId;

    public MktrGrpXrefPK() {
    }

    public MktrGrpXrefPK(short grp, String mktrId) {
        this.grp = grp;
        this.mktrId = mktrId;
    }

    public short getGrp() {
        return grp;
    }

    public void setGrp(short grp) {
        this.grp = grp;
    }

    public String getMktrId() {
        return mktrId;
    }

    public void setMktrId(String mktrId) {
        this.mktrId = mktrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) grp;
        hash += (mktrId != null ? mktrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MktrGrpXrefPK)) {
            return false;
        }
        MktrGrpXrefPK other = (MktrGrpXrefPK) object;
        if (this.grp != other.grp) {
            return false;
        }
        if ((this.mktrId == null && other.mktrId != null) || (this.mktrId != null && !this.mktrId.equals(other.mktrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MktrGrpXrefPK[ grp=" + grp + ", mktrId=" + mktrId + " ]";
    }
    
}
