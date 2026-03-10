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
public class UnitPrfPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "PROFILE_TYPE")
    private Character profileType;
    @Basic(optional = false)
    @Column(name = "PROFILE_ID")
    private String profileId;

    public UnitPrfPK() {
    }

    public UnitPrfPK(String custId, Character profileType, String profileId) {
        this.custId = custId;
        this.profileType = profileType;
        this.profileId = profileId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Character getProfileType() {
        return profileType;
    }

    public void setProfileType(Character profileType) {
        this.profileType = profileType;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (profileType != null ? profileType.hashCode() : 0);
        hash += (profileId != null ? profileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitPrfPK)) {
            return false;
        }
        UnitPrfPK other = (UnitPrfPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.profileType == null && other.profileType != null) || (this.profileType != null && !this.profileType.equals(other.profileType))) {
            return false;
        }
        if ((this.profileId == null && other.profileId != null) || (this.profileId != null && !this.profileId.equals(other.profileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UnitPrfPK[ custId=" + custId + ", profileType=" + profileType + ", profileId=" + profileId + " ]";
    }
    
}
