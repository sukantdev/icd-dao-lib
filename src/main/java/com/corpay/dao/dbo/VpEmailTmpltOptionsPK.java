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
public class VpEmailTmpltOptionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "TMPLT_ID")
    private String tmpltId;

    public VpEmailTmpltOptionsPK() {
    }

    public VpEmailTmpltOptionsPK(String custId, String acctNbr, String tmpltId) {
        this.custId = custId;
        this.acctNbr = acctNbr;
        this.tmpltId = tmpltId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getTmpltId() {
        return tmpltId;
    }

    public void setTmpltId(String tmpltId) {
        this.tmpltId = tmpltId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (tmpltId != null ? tmpltId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpEmailTmpltOptionsPK)) {
            return false;
        }
        VpEmailTmpltOptionsPK other = (VpEmailTmpltOptionsPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.tmpltId == null && other.tmpltId != null) || (this.tmpltId != null && !this.tmpltId.equals(other.tmpltId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpEmailTmpltOptionsPK[ custId=" + custId + ", acctNbr=" + acctNbr + ", tmpltId=" + tmpltId + " ]";
    }
    
}
