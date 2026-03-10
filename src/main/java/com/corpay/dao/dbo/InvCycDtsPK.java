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
public class InvCycDtsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CYC_INV_DT")
    @Temporal(TemporalType.DATE)
    private Date cycInvDt;

    public InvCycDtsPK() {
    }

    public InvCycDtsPK(String acctNbr, Date cycInvDt) {
        this.acctNbr = acctNbr;
        this.cycInvDt = cycInvDt;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public Date getCycInvDt() {
        return cycInvDt;
    }

    public void setCycInvDt(Date cycInvDt) {
        this.cycInvDt = cycInvDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (cycInvDt != null ? cycInvDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvCycDtsPK)) {
            return false;
        }
        InvCycDtsPK other = (InvCycDtsPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.cycInvDt == null && other.cycInvDt != null) || (this.cycInvDt != null && !this.cycInvDt.equals(other.cycInvDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvCycDtsPK[ acctNbr=" + acctNbr + ", cycInvDt=" + cycInvDt + " ]";
    }
    
}
