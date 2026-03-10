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
public class MtSumFundingFilePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_NBR")
    private String custNbr;
    @Basic(optional = false)
    @Column(name = "TRNS_TYP")
    private String trnsTyp;
    @Basic(optional = false)
    @Column(name = "FILE_NBR")
    private int fileNbr;

    public MtSumFundingFilePK() {
    }

    public MtSumFundingFilePK(String acctNbr, String custNbr, String trnsTyp, int fileNbr) {
        this.acctNbr = acctNbr;
        this.custNbr = custNbr;
        this.trnsTyp = trnsTyp;
        this.fileNbr = fileNbr;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustNbr() {
        return custNbr;
    }

    public void setCustNbr(String custNbr) {
        this.custNbr = custNbr;
    }

    public String getTrnsTyp() {
        return trnsTyp;
    }

    public void setTrnsTyp(String trnsTyp) {
        this.trnsTyp = trnsTyp;
    }

    public int getFileNbr() {
        return fileNbr;
    }

    public void setFileNbr(int fileNbr) {
        this.fileNbr = fileNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custNbr != null ? custNbr.hashCode() : 0);
        hash += (trnsTyp != null ? trnsTyp.hashCode() : 0);
        hash += (int) fileNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtSumFundingFilePK)) {
            return false;
        }
        MtSumFundingFilePK other = (MtSumFundingFilePK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custNbr == null && other.custNbr != null) || (this.custNbr != null && !this.custNbr.equals(other.custNbr))) {
            return false;
        }
        if ((this.trnsTyp == null && other.trnsTyp != null) || (this.trnsTyp != null && !this.trnsTyp.equals(other.trnsTyp))) {
            return false;
        }
        if (this.fileNbr != other.fileNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MtSumFundingFilePK[ acctNbr=" + acctNbr + ", custNbr=" + custNbr + ", trnsTyp=" + trnsTyp + ", fileNbr=" + fileNbr + " ]";
    }
    
}
