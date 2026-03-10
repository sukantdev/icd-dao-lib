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
public class DiscPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "DISC_REB_IND")
    private Character discRebInd;
    @Basic(optional = false)
    @Column(name = "PRIORITY")
    private short priority;

    public DiscPK() {
    }

    public DiscPK(String acctNbr, String custId, Character discRebInd, short priority) {
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.discRebInd = discRebInd;
        this.priority = priority;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Character getDiscRebInd() {
        return discRebInd;
    }

    public void setDiscRebInd(Character discRebInd) {
        this.discRebInd = discRebInd;
    }

    public short getPriority() {
        return priority;
    }

    public void setPriority(short priority) {
        this.priority = priority;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (discRebInd != null ? discRebInd.hashCode() : 0);
        hash += (int) priority;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiscPK)) {
            return false;
        }
        DiscPK other = (DiscPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.discRebInd == null && other.discRebInd != null) || (this.discRebInd != null && !this.discRebInd.equals(other.discRebInd))) {
            return false;
        }
        if (this.priority != other.priority) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DiscPK[ acctNbr=" + acctNbr + ", custId=" + custId + ", discRebInd=" + discRebInd + ", priority=" + priority + " ]";
    }
    
}
