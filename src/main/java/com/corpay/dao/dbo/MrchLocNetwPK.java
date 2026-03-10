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
public class MrchLocNetwPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MARKETER_CD")
    private String marketerCd;
    @Basic(optional = false)
    @Column(name = "LOC_ID")
    private String locId;

    public MrchLocNetwPK() {
    }

    public MrchLocNetwPK(String marketerCd, String locId) {
        this.marketerCd = marketerCd;
        this.locId = locId;
    }

    public String getMarketerCd() {
        return marketerCd;
    }

    public void setMarketerCd(String marketerCd) {
        this.marketerCd = marketerCd;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marketerCd != null ? marketerCd.hashCode() : 0);
        hash += (locId != null ? locId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchLocNetwPK)) {
            return false;
        }
        MrchLocNetwPK other = (MrchLocNetwPK) object;
        if ((this.marketerCd == null && other.marketerCd != null) || (this.marketerCd != null && !this.marketerCd.equals(other.marketerCd))) {
            return false;
        }
        if ((this.locId == null && other.locId != null) || (this.locId != null && !this.locId.equals(other.locId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocNetwPK[ marketerCd=" + marketerCd + ", locId=" + locId + " ]";
    }
    
}
