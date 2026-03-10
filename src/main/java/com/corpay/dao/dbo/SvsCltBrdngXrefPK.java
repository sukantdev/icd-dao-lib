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
public class SvsCltBrdngXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BRDNG_CD")
    private String brdngCd;
    @Basic(optional = false)
    @Column(name = "CLIENT_ID")
    private String clientId;

    public SvsCltBrdngXrefPK() {
    }

    public SvsCltBrdngXrefPK(String brdngCd, String clientId) {
        this.brdngCd = brdngCd;
        this.clientId = clientId;
    }

    public String getBrdngCd() {
        return brdngCd;
    }

    public void setBrdngCd(String brdngCd) {
        this.brdngCd = brdngCd;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brdngCd != null ? brdngCd.hashCode() : 0);
        hash += (clientId != null ? clientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SvsCltBrdngXrefPK)) {
            return false;
        }
        SvsCltBrdngXrefPK other = (SvsCltBrdngXrefPK) object;
        if ((this.brdngCd == null && other.brdngCd != null) || (this.brdngCd != null && !this.brdngCd.equals(other.brdngCd))) {
            return false;
        }
        if ((this.clientId == null && other.clientId != null) || (this.clientId != null && !this.clientId.equals(other.clientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SvsCltBrdngXrefPK[ brdngCd=" + brdngCd + ", clientId=" + clientId + " ]";
    }
    
}
