/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class NetPricingHdrPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PFID_CD")
    private String pfidCd;
    @Basic(optional = false)
    @Column(name = "EFFCTV_DT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effctvDtTs;

    public NetPricingHdrPK() {
    }

    public NetPricingHdrPK(String pfidCd, Date effctvDtTs) {
        this.pfidCd = pfidCd;
        this.effctvDtTs = effctvDtTs;
    }

    public String getPfidCd() {
        return pfidCd;
    }

    public void setPfidCd(String pfidCd) {
        this.pfidCd = pfidCd;
    }

    public Date getEffctvDtTs() {
        return effctvDtTs;
    }

    public void setEffctvDtTs(Date effctvDtTs) {
        this.effctvDtTs = effctvDtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pfidCd != null ? pfidCd.hashCode() : 0);
        hash += (effctvDtTs != null ? effctvDtTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NetPricingHdrPK)) {
            return false;
        }
        NetPricingHdrPK other = (NetPricingHdrPK) object;
        if ((this.pfidCd == null && other.pfidCd != null) || (this.pfidCd != null && !this.pfidCd.equals(other.pfidCd))) {
            return false;
        }
        if ((this.effctvDtTs == null && other.effctvDtTs != null) || (this.effctvDtTs != null && !this.effctvDtTs.equals(other.effctvDtTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NetPricingHdrPK[ pfidCd=" + pfidCd + ", effctvDtTs=" + effctvDtTs + " ]";
    }
    
}
