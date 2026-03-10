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
public class SmallFleetAchPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "CNFRMTN_PMT_ID")
    private String cnfrmtnPmtId;
    @Basic(optional = false)
    @Column(name = "BUS_DT")
    @Temporal(TemporalType.DATE)
    private Date busDt;

    public SmallFleetAchPK() {
    }

    public SmallFleetAchPK(String acctCd, String cnfrmtnPmtId, Date busDt) {
        this.acctCd = acctCd;
        this.cnfrmtnPmtId = cnfrmtnPmtId;
        this.busDt = busDt;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getCnfrmtnPmtId() {
        return cnfrmtnPmtId;
    }

    public void setCnfrmtnPmtId(String cnfrmtnPmtId) {
        this.cnfrmtnPmtId = cnfrmtnPmtId;
    }

    public Date getBusDt() {
        return busDt;
    }

    public void setBusDt(Date busDt) {
        this.busDt = busDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctCd != null ? acctCd.hashCode() : 0);
        hash += (cnfrmtnPmtId != null ? cnfrmtnPmtId.hashCode() : 0);
        hash += (busDt != null ? busDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SmallFleetAchPK)) {
            return false;
        }
        SmallFleetAchPK other = (SmallFleetAchPK) object;
        if ((this.acctCd == null && other.acctCd != null) || (this.acctCd != null && !this.acctCd.equals(other.acctCd))) {
            return false;
        }
        if ((this.cnfrmtnPmtId == null && other.cnfrmtnPmtId != null) || (this.cnfrmtnPmtId != null && !this.cnfrmtnPmtId.equals(other.cnfrmtnPmtId))) {
            return false;
        }
        if ((this.busDt == null && other.busDt != null) || (this.busDt != null && !this.busDt.equals(other.busDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SmallFleetAchPK[ acctCd=" + acctCd + ", cnfrmtnPmtId=" + cnfrmtnPmtId + ", busDt=" + busDt + " ]";
    }
    
}
