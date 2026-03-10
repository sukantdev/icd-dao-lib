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
public class ExpediteFeesTotalsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "EFT_ACCT_NBR")
    private String eftAcctNbr;
    @Basic(optional = false)
    @Column(name = "EFT_REQUEST_DATE")
    private String eftRequestDate;
    @Basic(optional = false)
    @Column(name = "EFT_INVOICE_NBR")
    private String eftInvoiceNbr;

    public ExpediteFeesTotalsPK() {
    }

    public ExpediteFeesTotalsPK(String eftAcctNbr, String eftRequestDate, String eftInvoiceNbr) {
        this.eftAcctNbr = eftAcctNbr;
        this.eftRequestDate = eftRequestDate;
        this.eftInvoiceNbr = eftInvoiceNbr;
    }

    public String getEftAcctNbr() {
        return eftAcctNbr;
    }

    public void setEftAcctNbr(String eftAcctNbr) {
        this.eftAcctNbr = eftAcctNbr;
    }

    public String getEftRequestDate() {
        return eftRequestDate;
    }

    public void setEftRequestDate(String eftRequestDate) {
        this.eftRequestDate = eftRequestDate;
    }

    public String getEftInvoiceNbr() {
        return eftInvoiceNbr;
    }

    public void setEftInvoiceNbr(String eftInvoiceNbr) {
        this.eftInvoiceNbr = eftInvoiceNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eftAcctNbr != null ? eftAcctNbr.hashCode() : 0);
        hash += (eftRequestDate != null ? eftRequestDate.hashCode() : 0);
        hash += (eftInvoiceNbr != null ? eftInvoiceNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExpediteFeesTotalsPK)) {
            return false;
        }
        ExpediteFeesTotalsPK other = (ExpediteFeesTotalsPK) object;
        if ((this.eftAcctNbr == null && other.eftAcctNbr != null) || (this.eftAcctNbr != null && !this.eftAcctNbr.equals(other.eftAcctNbr))) {
            return false;
        }
        if ((this.eftRequestDate == null && other.eftRequestDate != null) || (this.eftRequestDate != null && !this.eftRequestDate.equals(other.eftRequestDate))) {
            return false;
        }
        if ((this.eftInvoiceNbr == null && other.eftInvoiceNbr != null) || (this.eftInvoiceNbr != null && !this.eftInvoiceNbr.equals(other.eftInvoiceNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ExpediteFeesTotalsPK[ eftAcctNbr=" + eftAcctNbr + ", eftRequestDate=" + eftRequestDate + ", eftInvoiceNbr=" + eftInvoiceNbr + " ]";
    }
    
}
