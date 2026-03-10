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
public class AmzCustStationXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "AMZ_STATION_CD")
    private String amzStationCd;

    public AmzCustStationXrefPK() {
    }

    public AmzCustStationXrefPK(String custId, String amzStationCd) {
        this.custId = custId;
        this.amzStationCd = amzStationCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getAmzStationCd() {
        return amzStationCd;
    }

    public void setAmzStationCd(String amzStationCd) {
        this.amzStationCd = amzStationCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (amzStationCd != null ? amzStationCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AmzCustStationXrefPK)) {
            return false;
        }
        AmzCustStationXrefPK other = (AmzCustStationXrefPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.amzStationCd == null && other.amzStationCd != null) || (this.amzStationCd != null && !this.amzStationCd.equals(other.amzStationCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AmzCustStationXrefPK[ custId=" + custId + ", amzStationCd=" + amzStationCd + " ]";
    }
    
}
