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
public class GrpPrdXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "GRP")
    private short grp;
    @Basic(optional = false)
    @Column(name = "PRD")
    private String prd;

    public GrpPrdXrefPK() {
    }

    public GrpPrdXrefPK(short grp, String prd) {
        this.grp = grp;
        this.prd = prd;
    }

    public short getGrp() {
        return grp;
    }

    public void setGrp(short grp) {
        this.grp = grp;
    }

    public String getPrd() {
        return prd;
    }

    public void setPrd(String prd) {
        this.prd = prd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) grp;
        hash += (prd != null ? prd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrpPrdXrefPK)) {
            return false;
        }
        GrpPrdXrefPK other = (GrpPrdXrefPK) object;
        if (this.grp != other.grp) {
            return false;
        }
        if ((this.prd == null && other.prd != null) || (this.prd != null && !this.prd.equals(other.prd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GrpPrdXrefPK[ grp=" + grp + ", prd=" + prd + " ]";
    }
    
}
