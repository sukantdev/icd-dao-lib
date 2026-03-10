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
public class CompStandDescPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COMP_STAND_ID")
    private String compStandId;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;

    public CompStandDescPK() {
    }

    public CompStandDescPK(String compStandId, String custId) {
        this.compStandId = compStandId;
        this.custId = custId;
    }

    public String getCompStandId() {
        return compStandId;
    }

    public void setCompStandId(String compStandId) {
        this.compStandId = compStandId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compStandId != null ? compStandId.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompStandDescPK)) {
            return false;
        }
        CompStandDescPK other = (CompStandDescPK) object;
        if ((this.compStandId == null && other.compStandId != null) || (this.compStandId != null && !this.compStandId.equals(other.compStandId))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CompStandDescPK[ compStandId=" + compStandId + ", custId=" + custId + " ]";
    }
    
}
