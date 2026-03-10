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
public class MrchLocRelPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "MARKETER_CD")
    private String marketerCd;

    public MrchLocRelPK() {
    }

    public MrchLocRelPK(String custId, String marketerCd) {
        this.custId = custId;
        this.marketerCd = marketerCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getMarketerCd() {
        return marketerCd;
    }

    public void setMarketerCd(String marketerCd) {
        this.marketerCd = marketerCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (marketerCd != null ? marketerCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchLocRelPK)) {
            return false;
        }
        MrchLocRelPK other = (MrchLocRelPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.marketerCd == null && other.marketerCd != null) || (this.marketerCd != null && !this.marketerCd.equals(other.marketerCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocRelPK[ custId=" + custId + ", marketerCd=" + marketerCd + " ]";
    }
    
}
