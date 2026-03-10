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
public class StCrtyZipVldnPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ST_CD")
    private String stCd;
    @Basic(optional = false)
    @Column(name = "ZIP_PREFIX")
    private String zipPrefix;

    public StCrtyZipVldnPK() {
    }

    public StCrtyZipVldnPK(String stCd, String zipPrefix) {
        this.stCd = stCd;
        this.zipPrefix = zipPrefix;
    }

    public String getStCd() {
        return stCd;
    }

    public void setStCd(String stCd) {
        this.stCd = stCd;
    }

    public String getZipPrefix() {
        return zipPrefix;
    }

    public void setZipPrefix(String zipPrefix) {
        this.zipPrefix = zipPrefix;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stCd != null ? stCd.hashCode() : 0);
        hash += (zipPrefix != null ? zipPrefix.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StCrtyZipVldnPK)) {
            return false;
        }
        StCrtyZipVldnPK other = (StCrtyZipVldnPK) object;
        if ((this.stCd == null && other.stCd != null) || (this.stCd != null && !this.stCd.equals(other.stCd))) {
            return false;
        }
        if ((this.zipPrefix == null && other.zipPrefix != null) || (this.zipPrefix != null && !this.zipPrefix.equals(other.zipPrefix))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.StCrtyZipVldnPK[ stCd=" + stCd + ", zipPrefix=" + zipPrefix + " ]";
    }
    
}
