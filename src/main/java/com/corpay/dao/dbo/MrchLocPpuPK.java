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
public class MrchLocPpuPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "LOC_ID")
    private String locId;
    @Basic(optional = false)
    @Column(name = "FL_SRV_TYP")
    private Character flSrvTyp;
    @Basic(optional = false)
    @Column(name = "FL_PRD_CD")
    private String flPrdCd;

    public MrchLocPpuPK() {
    }

    public MrchLocPpuPK(String locId, Character flSrvTyp, String flPrdCd) {
        this.locId = locId;
        this.flSrvTyp = flSrvTyp;
        this.flPrdCd = flPrdCd;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public Character getFlSrvTyp() {
        return flSrvTyp;
    }

    public void setFlSrvTyp(Character flSrvTyp) {
        this.flSrvTyp = flSrvTyp;
    }

    public String getFlPrdCd() {
        return flPrdCd;
    }

    public void setFlPrdCd(String flPrdCd) {
        this.flPrdCd = flPrdCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locId != null ? locId.hashCode() : 0);
        hash += (flSrvTyp != null ? flSrvTyp.hashCode() : 0);
        hash += (flPrdCd != null ? flPrdCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchLocPpuPK)) {
            return false;
        }
        MrchLocPpuPK other = (MrchLocPpuPK) object;
        if ((this.locId == null && other.locId != null) || (this.locId != null && !this.locId.equals(other.locId))) {
            return false;
        }
        if ((this.flSrvTyp == null && other.flSrvTyp != null) || (this.flSrvTyp != null && !this.flSrvTyp.equals(other.flSrvTyp))) {
            return false;
        }
        if ((this.flPrdCd == null && other.flPrdCd != null) || (this.flPrdCd != null && !this.flPrdCd.equals(other.flPrdCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocPpuPK[ locId=" + locId + ", flSrvTyp=" + flSrvTyp + ", flPrdCd=" + flPrdCd + " ]";
    }
    
}
