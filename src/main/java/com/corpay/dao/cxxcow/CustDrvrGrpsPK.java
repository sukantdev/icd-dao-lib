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
public class CustDrvrGrpsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DRGR_CUST_ID")
    private String drgrCustId;
    @Basic(optional = false)
    @Column(name = "DRGR_GRP_ID")
    private String drgrGrpId;
    @Basic(optional = false)
    @Column(name = "DRGR_DRVR_ID")
    private String drgrDrvrId;

    public CustDrvrGrpsPK() {
    }

    public CustDrvrGrpsPK(String drgrCustId, String drgrGrpId, String drgrDrvrId) {
        this.drgrCustId = drgrCustId;
        this.drgrGrpId = drgrGrpId;
        this.drgrDrvrId = drgrDrvrId;
    }

    public String getDrgrCustId() {
        return drgrCustId;
    }

    public void setDrgrCustId(String drgrCustId) {
        this.drgrCustId = drgrCustId;
    }

    public String getDrgrGrpId() {
        return drgrGrpId;
    }

    public void setDrgrGrpId(String drgrGrpId) {
        this.drgrGrpId = drgrGrpId;
    }

    public String getDrgrDrvrId() {
        return drgrDrvrId;
    }

    public void setDrgrDrvrId(String drgrDrvrId) {
        this.drgrDrvrId = drgrDrvrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (drgrCustId != null ? drgrCustId.hashCode() : 0);
        hash += (drgrGrpId != null ? drgrGrpId.hashCode() : 0);
        hash += (drgrDrvrId != null ? drgrDrvrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustDrvrGrpsPK)) {
            return false;
        }
        CustDrvrGrpsPK other = (CustDrvrGrpsPK) object;
        if ((this.drgrCustId == null && other.drgrCustId != null) || (this.drgrCustId != null && !this.drgrCustId.equals(other.drgrCustId))) {
            return false;
        }
        if ((this.drgrGrpId == null && other.drgrGrpId != null) || (this.drgrGrpId != null && !this.drgrGrpId.equals(other.drgrGrpId))) {
            return false;
        }
        if ((this.drgrDrvrId == null && other.drgrDrvrId != null) || (this.drgrDrvrId != null && !this.drgrDrvrId.equals(other.drgrDrvrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.CustDrvrGrpsPK[ drgrCustId=" + drgrCustId + ", drgrGrpId=" + drgrGrpId + ", drgrDrvrId=" + drgrDrvrId + " ]";
    }
    
}
