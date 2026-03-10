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
public class EcbPndgLoadPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "LOAD_DT")
    @Temporal(TemporalType.DATE)
    private Date loadDt;
    @Basic(optional = false)
    @Column(name = "LOAD_TM")
    @Temporal(TemporalType.TIME)
    private Date loadTm;
    @Basic(optional = false)
    @Column(name = "DUP_CTR")
    private short dupCtr;

    public EcbPndgLoadPK() {
    }

    public EcbPndgLoadPK(String acctNbr, String custId, String crdNbr, Date loadDt, Date loadTm, short dupCtr) {
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.crdNbr = crdNbr;
        this.loadDt = loadDt;
        this.loadTm = loadTm;
        this.dupCtr = dupCtr;
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

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Date getLoadDt() {
        return loadDt;
    }

    public void setLoadDt(Date loadDt) {
        this.loadDt = loadDt;
    }

    public Date getLoadTm() {
        return loadTm;
    }

    public void setLoadTm(Date loadTm) {
        this.loadTm = loadTm;
    }

    public short getDupCtr() {
        return dupCtr;
    }

    public void setDupCtr(short dupCtr) {
        this.dupCtr = dupCtr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        hash += (loadDt != null ? loadDt.hashCode() : 0);
        hash += (loadTm != null ? loadTm.hashCode() : 0);
        hash += (int) dupCtr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcbPndgLoadPK)) {
            return false;
        }
        EcbPndgLoadPK other = (EcbPndgLoadPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        if ((this.loadDt == null && other.loadDt != null) || (this.loadDt != null && !this.loadDt.equals(other.loadDt))) {
            return false;
        }
        if ((this.loadTm == null && other.loadTm != null) || (this.loadTm != null && !this.loadTm.equals(other.loadTm))) {
            return false;
        }
        if (this.dupCtr != other.dupCtr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EcbPndgLoadPK[ acctNbr=" + acctNbr + ", custId=" + custId + ", crdNbr=" + crdNbr + ", loadDt=" + loadDt + ", loadTm=" + loadTm + ", dupCtr=" + dupCtr + " ]";
    }
    
}
