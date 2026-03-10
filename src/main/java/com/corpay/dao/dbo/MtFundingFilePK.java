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
public class MtFundingFilePK implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "SEQ_NO")
    private int seqNo;

    public MtFundingFilePK() {
    }

    public MtFundingFilePK(String acctNbr, String custNbr, String trnsTyp, int fileNbr, int seqNo) {
        this.acctNbr = acctNbr;
        this.custNbr = custNbr;
        this.trnsTyp = trnsTyp;
        this.fileNbr = fileNbr;
        this.seqNo = seqNo;
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

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custNbr != null ? custNbr.hashCode() : 0);
        hash += (trnsTyp != null ? trnsTyp.hashCode() : 0);
        hash += (int) fileNbr;
        hash += (int) seqNo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtFundingFilePK)) {
            return false;
        }
        MtFundingFilePK other = (MtFundingFilePK) object;
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
        if (this.seqNo != other.seqNo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MtFundingFilePK[ acctNbr=" + acctNbr + ", custNbr=" + custNbr + ", trnsTyp=" + trnsTyp + ", fileNbr=" + fileNbr + ", seqNo=" + seqNo + " ]";
    }
    
}
