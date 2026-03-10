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
public class ExcLmtPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_STRU")
    private String acctStru;
    @Basic(optional = false)
    @Column(name = "ACCT_ID")
    private Character acctId;

    public ExcLmtPK() {
    }

    public ExcLmtPK(String acctStru, Character acctId) {
        this.acctStru = acctStru;
        this.acctId = acctId;
    }

    public String getAcctStru() {
        return acctStru;
    }

    public void setAcctStru(String acctStru) {
        this.acctStru = acctStru;
    }

    public Character getAcctId() {
        return acctId;
    }

    public void setAcctId(Character acctId) {
        this.acctId = acctId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctStru != null ? acctStru.hashCode() : 0);
        hash += (acctId != null ? acctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExcLmtPK)) {
            return false;
        }
        ExcLmtPK other = (ExcLmtPK) object;
        if ((this.acctStru == null && other.acctStru != null) || (this.acctStru != null && !this.acctStru.equals(other.acctStru))) {
            return false;
        }
        if ((this.acctId == null && other.acctId != null) || (this.acctId != null && !this.acctId.equals(other.acctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ExcLmtPK[ acctStru=" + acctStru + ", acctId=" + acctId + " ]";
    }
    
}
