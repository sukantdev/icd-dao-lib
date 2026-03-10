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
public class RptNamesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "RPT_TYP")
    private String rptTyp;
    @Basic(optional = false)
    @Column(name = "ACCT_TYP")
    private String acctTyp;
    @Basic(optional = false)
    @Column(name = "PDF_CD")
    private String pdfCd;
    @Basic(optional = false)
    @Column(name = "COMP_ID")
    private Character compId;

    public RptNamesPK() {
    }

    public RptNamesPK(String rptTyp, String acctTyp, String pdfCd, Character compId) {
        this.rptTyp = rptTyp;
        this.acctTyp = acctTyp;
        this.pdfCd = pdfCd;
        this.compId = compId;
    }

    public String getRptTyp() {
        return rptTyp;
    }

    public void setRptTyp(String rptTyp) {
        this.rptTyp = rptTyp;
    }

    public String getAcctTyp() {
        return acctTyp;
    }

    public void setAcctTyp(String acctTyp) {
        this.acctTyp = acctTyp;
    }

    public String getPdfCd() {
        return pdfCd;
    }

    public void setPdfCd(String pdfCd) {
        this.pdfCd = pdfCd;
    }

    public Character getCompId() {
        return compId;
    }

    public void setCompId(Character compId) {
        this.compId = compId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rptTyp != null ? rptTyp.hashCode() : 0);
        hash += (acctTyp != null ? acctTyp.hashCode() : 0);
        hash += (pdfCd != null ? pdfCd.hashCode() : 0);
        hash += (compId != null ? compId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RptNamesPK)) {
            return false;
        }
        RptNamesPK other = (RptNamesPK) object;
        if ((this.rptTyp == null && other.rptTyp != null) || (this.rptTyp != null && !this.rptTyp.equals(other.rptTyp))) {
            return false;
        }
        if ((this.acctTyp == null && other.acctTyp != null) || (this.acctTyp != null && !this.acctTyp.equals(other.acctTyp))) {
            return false;
        }
        if ((this.pdfCd == null && other.pdfCd != null) || (this.pdfCd != null && !this.pdfCd.equals(other.pdfCd))) {
            return false;
        }
        if ((this.compId == null && other.compId != null) || (this.compId != null && !this.compId.equals(other.compId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RptNamesPK[ rptTyp=" + rptTyp + ", acctTyp=" + acctTyp + ", pdfCd=" + pdfCd + ", compId=" + compId + " ]";
    }
    
}
