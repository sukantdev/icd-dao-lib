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
public class ZipLatLongPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CITY_NM")
    private String cityNm;
    @Basic(optional = false)
    @Column(name = "ST_NM")
    private String stNm;
    @Basic(optional = false)
    @Column(name = "ZIP_CD")
    private String zipCd;

    public ZipLatLongPK() {
    }

    public ZipLatLongPK(String cityNm, String stNm, String zipCd) {
        this.cityNm = cityNm;
        this.stNm = stNm;
        this.zipCd = zipCd;
    }

    public String getCityNm() {
        return cityNm;
    }

    public void setCityNm(String cityNm) {
        this.cityNm = cityNm;
    }

    public String getStNm() {
        return stNm;
    }

    public void setStNm(String stNm) {
        this.stNm = stNm;
    }

    public String getZipCd() {
        return zipCd;
    }

    public void setZipCd(String zipCd) {
        this.zipCd = zipCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cityNm != null ? cityNm.hashCode() : 0);
        hash += (stNm != null ? stNm.hashCode() : 0);
        hash += (zipCd != null ? zipCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZipLatLongPK)) {
            return false;
        }
        ZipLatLongPK other = (ZipLatLongPK) object;
        if ((this.cityNm == null && other.cityNm != null) || (this.cityNm != null && !this.cityNm.equals(other.cityNm))) {
            return false;
        }
        if ((this.stNm == null && other.stNm != null) || (this.stNm != null && !this.stNm.equals(other.stNm))) {
            return false;
        }
        if ((this.zipCd == null && other.zipCd != null) || (this.zipCd != null && !this.zipCd.equals(other.zipCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ZipLatLongPK[ cityNm=" + cityNm + ", stNm=" + stNm + ", zipCd=" + zipCd + " ]";
    }
    
}
