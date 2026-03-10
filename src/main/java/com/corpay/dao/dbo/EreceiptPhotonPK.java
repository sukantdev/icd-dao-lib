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
public class EreceiptPhotonPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date trnsDt;
    @Basic(optional = false)
    @Column(name = "CTL_NBR")
    private int ctlNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_SITE_ID")
    private String mrchSiteId;

    public EreceiptPhotonPK() {
    }

    public EreceiptPhotonPK(Date trnsDt, int ctlNbr, String mrchSiteId) {
        this.trnsDt = trnsDt;
        this.ctlNbr = ctlNbr;
        this.mrchSiteId = mrchSiteId;
    }

    public Date getTrnsDt() {
        return trnsDt;
    }

    public void setTrnsDt(Date trnsDt) {
        this.trnsDt = trnsDt;
    }

    public int getCtlNbr() {
        return ctlNbr;
    }

    public void setCtlNbr(int ctlNbr) {
        this.ctlNbr = ctlNbr;
    }

    public String getMrchSiteId() {
        return mrchSiteId;
    }

    public void setMrchSiteId(String mrchSiteId) {
        this.mrchSiteId = mrchSiteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnsDt != null ? trnsDt.hashCode() : 0);
        hash += (int) ctlNbr;
        hash += (mrchSiteId != null ? mrchSiteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EreceiptPhotonPK)) {
            return false;
        }
        EreceiptPhotonPK other = (EreceiptPhotonPK) object;
        if ((this.trnsDt == null && other.trnsDt != null) || (this.trnsDt != null && !this.trnsDt.equals(other.trnsDt))) {
            return false;
        }
        if (this.ctlNbr != other.ctlNbr) {
            return false;
        }
        if ((this.mrchSiteId == null && other.mrchSiteId != null) || (this.mrchSiteId != null && !this.mrchSiteId.equals(other.mrchSiteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EreceiptPhotonPK[ trnsDt=" + trnsDt + ", ctlNbr=" + ctlNbr + ", mrchSiteId=" + mrchSiteId + " ]";
    }
    
}
