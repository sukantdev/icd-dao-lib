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
public class VpCvMastPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CV_MAST_ID")
    private String cvMastId;
    @Basic(optional = false)
    @Column(name = "CUST_MAST_ID")
    private String custMastId;

    public VpCvMastPK() {
    }

    public VpCvMastPK(String cvMastId, String custMastId) {
        this.cvMastId = cvMastId;
        this.custMastId = custMastId;
    }

    public String getCvMastId() {
        return cvMastId;
    }

    public void setCvMastId(String cvMastId) {
        this.cvMastId = cvMastId;
    }

    public String getCustMastId() {
        return custMastId;
    }

    public void setCustMastId(String custMastId) {
        this.custMastId = custMastId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cvMastId != null ? cvMastId.hashCode() : 0);
        hash += (custMastId != null ? custMastId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpCvMastPK)) {
            return false;
        }
        VpCvMastPK other = (VpCvMastPK) object;
        if ((this.cvMastId == null && other.cvMastId != null) || (this.cvMastId != null && !this.cvMastId.equals(other.cvMastId))) {
            return false;
        }
        if ((this.custMastId == null && other.custMastId != null) || (this.custMastId != null && !this.custMastId.equals(other.custMastId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCvMastPK[ cvMastId=" + cvMastId + ", custMastId=" + custMastId + " ]";
    }
    
}
