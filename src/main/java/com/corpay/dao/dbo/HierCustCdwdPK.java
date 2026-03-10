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
public class HierCustCdwdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CD_WORD")
    private String cdWord;

    public HierCustCdwdPK() {
    }

    public HierCustCdwdPK(String custId, String cdWord) {
        this.custId = custId;
        this.cdWord = cdWord;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCdWord() {
        return cdWord;
    }

    public void setCdWord(String cdWord) {
        this.cdWord = cdWord;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (cdWord != null ? cdWord.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HierCustCdwdPK)) {
            return false;
        }
        HierCustCdwdPK other = (HierCustCdwdPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.cdWord == null && other.cdWord != null) || (this.cdWord != null && !this.cdWord.equals(other.cdWord))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierCustCdwdPK[ custId=" + custId + ", cdWord=" + cdWord + " ]";
    }
    
}
