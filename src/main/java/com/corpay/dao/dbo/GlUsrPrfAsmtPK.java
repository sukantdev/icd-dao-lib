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
public class GlUsrPrfAsmtPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "PRF_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prfId;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;

    public GlUsrPrfAsmtPK() {
    }

    public GlUsrPrfAsmtPK(String acctNbr, Date prfId, String usrId) {
        this.acctNbr = acctNbr;
        this.prfId = prfId;
        this.usrId = usrId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public Date getPrfId() {
        return prfId;
    }

    public void setPrfId(Date prfId) {
        this.prfId = prfId;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (prfId != null ? prfId.hashCode() : 0);
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlUsrPrfAsmtPK)) {
            return false;
        }
        GlUsrPrfAsmtPK other = (GlUsrPrfAsmtPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.prfId == null && other.prfId != null) || (this.prfId != null && !this.prfId.equals(other.prfId))) {
            return false;
        }
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlUsrPrfAsmtPK[ acctNbr=" + acctNbr + ", prfId=" + prfId + ", usrId=" + usrId + " ]";
    }
    
}
