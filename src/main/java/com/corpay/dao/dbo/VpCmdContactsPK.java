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
public class VpCmdContactsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_VEND")
    private String custVend;
    @Basic(optional = false)
    @Column(name = "MAST_ID")
    private String mastId;

    public VpCmdContactsPK() {
    }

    public VpCmdContactsPK(String custVend, String mastId) {
        this.custVend = custVend;
        this.mastId = mastId;
    }

    public String getCustVend() {
        return custVend;
    }

    public void setCustVend(String custVend) {
        this.custVend = custVend;
    }

    public String getMastId() {
        return mastId;
    }

    public void setMastId(String mastId) {
        this.mastId = mastId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custVend != null ? custVend.hashCode() : 0);
        hash += (mastId != null ? mastId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpCmdContactsPK)) {
            return false;
        }
        VpCmdContactsPK other = (VpCmdContactsPK) object;
        if ((this.custVend == null && other.custVend != null) || (this.custVend != null && !this.custVend.equals(other.custVend))) {
            return false;
        }
        if ((this.mastId == null && other.mastId != null) || (this.mastId != null && !this.mastId.equals(other.mastId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCmdContactsPK[ custVend=" + custVend + ", mastId=" + mastId + " ]";
    }
    
}
