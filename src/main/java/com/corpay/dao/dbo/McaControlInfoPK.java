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
public class McaControlInfoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SERVICE_CENTER_CD")
    private String serviceCenterCd;
    @Basic(optional = false)
    @Column(name = "MCA_PURCHASE_NUM")
    private short mcaPurchaseNum;

    public McaControlInfoPK() {
    }

    public McaControlInfoPK(String serviceCenterCd, short mcaPurchaseNum) {
        this.serviceCenterCd = serviceCenterCd;
        this.mcaPurchaseNum = mcaPurchaseNum;
    }

    public String getServiceCenterCd() {
        return serviceCenterCd;
    }

    public void setServiceCenterCd(String serviceCenterCd) {
        this.serviceCenterCd = serviceCenterCd;
    }

    public short getMcaPurchaseNum() {
        return mcaPurchaseNum;
    }

    public void setMcaPurchaseNum(short mcaPurchaseNum) {
        this.mcaPurchaseNum = mcaPurchaseNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceCenterCd != null ? serviceCenterCd.hashCode() : 0);
        hash += (int) mcaPurchaseNum;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McaControlInfoPK)) {
            return false;
        }
        McaControlInfoPK other = (McaControlInfoPK) object;
        if ((this.serviceCenterCd == null && other.serviceCenterCd != null) || (this.serviceCenterCd != null && !this.serviceCenterCd.equals(other.serviceCenterCd))) {
            return false;
        }
        if (this.mcaPurchaseNum != other.mcaPurchaseNum) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McaControlInfoPK[ serviceCenterCd=" + serviceCenterCd + ", mcaPurchaseNum=" + mcaPurchaseNum + " ]";
    }
    
}
