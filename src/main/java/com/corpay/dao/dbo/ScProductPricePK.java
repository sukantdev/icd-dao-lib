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
public class ScProductPricePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "STATION_CD")
    private String stationCd;
    @Basic(optional = false)
    @Column(name = "PROD_CD")
    private String prodCd;

    public ScProductPricePK() {
    }

    public ScProductPricePK(String stationCd, String prodCd) {
        this.stationCd = stationCd;
        this.prodCd = prodCd;
    }

    public String getStationCd() {
        return stationCd;
    }

    public void setStationCd(String stationCd) {
        this.stationCd = stationCd;
    }

    public String getProdCd() {
        return prodCd;
    }

    public void setProdCd(String prodCd) {
        this.prodCd = prodCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stationCd != null ? stationCd.hashCode() : 0);
        hash += (prodCd != null ? prodCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScProductPricePK)) {
            return false;
        }
        ScProductPricePK other = (ScProductPricePK) object;
        if ((this.stationCd == null && other.stationCd != null) || (this.stationCd != null && !this.stationCd.equals(other.stationCd))) {
            return false;
        }
        if ((this.prodCd == null && other.prodCd != null) || (this.prodCd != null && !this.prodCd.equals(other.prodCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ScProductPricePK[ stationCd=" + stationCd + ", prodCd=" + prodCd + " ]";
    }
    
}
