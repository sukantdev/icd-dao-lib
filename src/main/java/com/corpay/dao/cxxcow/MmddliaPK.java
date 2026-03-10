/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class MmddliaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DDLIA_ACCOUNT_ID")
    private String ddliaAccountId;
    @Basic(optional = false)
    @Column(name = "DDLIA_CUSTOMER_ID")
    private String ddliaCustomerId;
    @Basic(optional = false)
    @Column(name = "DDLIA_EMPLOYEE_NR")
    private String ddliaEmployeeNr;
    @Basic(optional = false)
    @Column(name = "DDLIA_REFERENCE_NR")
    private int ddliaReferenceNr;

    public MmddliaPK() {
    }

    public MmddliaPK(String ddliaAccountId, String ddliaCustomerId, String ddliaEmployeeNr, int ddliaReferenceNr) {
        this.ddliaAccountId = ddliaAccountId;
        this.ddliaCustomerId = ddliaCustomerId;
        this.ddliaEmployeeNr = ddliaEmployeeNr;
        this.ddliaReferenceNr = ddliaReferenceNr;
    }

    public String getDdliaAccountId() {
        return ddliaAccountId;
    }

    public void setDdliaAccountId(String ddliaAccountId) {
        this.ddliaAccountId = ddliaAccountId;
    }

    public String getDdliaCustomerId() {
        return ddliaCustomerId;
    }

    public void setDdliaCustomerId(String ddliaCustomerId) {
        this.ddliaCustomerId = ddliaCustomerId;
    }

    public String getDdliaEmployeeNr() {
        return ddliaEmployeeNr;
    }

    public void setDdliaEmployeeNr(String ddliaEmployeeNr) {
        this.ddliaEmployeeNr = ddliaEmployeeNr;
    }

    public int getDdliaReferenceNr() {
        return ddliaReferenceNr;
    }

    public void setDdliaReferenceNr(int ddliaReferenceNr) {
        this.ddliaReferenceNr = ddliaReferenceNr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ddliaAccountId != null ? ddliaAccountId.hashCode() : 0);
        hash += (ddliaCustomerId != null ? ddliaCustomerId.hashCode() : 0);
        hash += (ddliaEmployeeNr != null ? ddliaEmployeeNr.hashCode() : 0);
        hash += (int) ddliaReferenceNr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MmddliaPK)) {
            return false;
        }
        MmddliaPK other = (MmddliaPK) object;
        if ((this.ddliaAccountId == null && other.ddliaAccountId != null) || (this.ddliaAccountId != null && !this.ddliaAccountId.equals(other.ddliaAccountId))) {
            return false;
        }
        if ((this.ddliaCustomerId == null && other.ddliaCustomerId != null) || (this.ddliaCustomerId != null && !this.ddliaCustomerId.equals(other.ddliaCustomerId))) {
            return false;
        }
        if ((this.ddliaEmployeeNr == null && other.ddliaEmployeeNr != null) || (this.ddliaEmployeeNr != null && !this.ddliaEmployeeNr.equals(other.ddliaEmployeeNr))) {
            return false;
        }
        if (this.ddliaReferenceNr != other.ddliaReferenceNr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.MmddliaPK[ ddliaAccountId=" + ddliaAccountId + ", ddliaCustomerId=" + ddliaCustomerId + ", ddliaEmployeeNr=" + ddliaEmployeeNr + ", ddliaReferenceNr=" + ddliaReferenceNr + " ]";
    }
    
}
