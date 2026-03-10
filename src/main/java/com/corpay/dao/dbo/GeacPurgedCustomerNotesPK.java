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
public class GeacPurgedCustomerNotesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PURGE_DT")
    @Temporal(TemporalType.DATE)
    private Date purgeDt;
    @Basic(optional = false)
    @Column(name = "GEAC_ACCT_NBR")
    private String geacAcctNbr;
    @Basic(optional = false)
    @Column(name = "GEAC_CMPY_CD")
    private String geacCmpyCd;
    @Basic(optional = false)
    @Column(name = "GEAC_PAGE_NBR")
    private String geacPageNbr;
    @Basic(optional = false)
    @Column(name = "GEAC_LINE_NBR")
    private String geacLineNbr;
    @Basic(optional = false)
    @Column(name = "GEAC_PAGE_DT")
    @Temporal(TemporalType.DATE)
    private Date geacPageDt;

    public GeacPurgedCustomerNotesPK() {
    }

    public GeacPurgedCustomerNotesPK(Date purgeDt, String geacAcctNbr, String geacCmpyCd, String geacPageNbr, String geacLineNbr, Date geacPageDt) {
        this.purgeDt = purgeDt;
        this.geacAcctNbr = geacAcctNbr;
        this.geacCmpyCd = geacCmpyCd;
        this.geacPageNbr = geacPageNbr;
        this.geacLineNbr = geacLineNbr;
        this.geacPageDt = geacPageDt;
    }

    public Date getPurgeDt() {
        return purgeDt;
    }

    public void setPurgeDt(Date purgeDt) {
        this.purgeDt = purgeDt;
    }

    public String getGeacAcctNbr() {
        return geacAcctNbr;
    }

    public void setGeacAcctNbr(String geacAcctNbr) {
        this.geacAcctNbr = geacAcctNbr;
    }

    public String getGeacCmpyCd() {
        return geacCmpyCd;
    }

    public void setGeacCmpyCd(String geacCmpyCd) {
        this.geacCmpyCd = geacCmpyCd;
    }

    public String getGeacPageNbr() {
        return geacPageNbr;
    }

    public void setGeacPageNbr(String geacPageNbr) {
        this.geacPageNbr = geacPageNbr;
    }

    public String getGeacLineNbr() {
        return geacLineNbr;
    }

    public void setGeacLineNbr(String geacLineNbr) {
        this.geacLineNbr = geacLineNbr;
    }

    public Date getGeacPageDt() {
        return geacPageDt;
    }

    public void setGeacPageDt(Date geacPageDt) {
        this.geacPageDt = geacPageDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (purgeDt != null ? purgeDt.hashCode() : 0);
        hash += (geacAcctNbr != null ? geacAcctNbr.hashCode() : 0);
        hash += (geacCmpyCd != null ? geacCmpyCd.hashCode() : 0);
        hash += (geacPageNbr != null ? geacPageNbr.hashCode() : 0);
        hash += (geacLineNbr != null ? geacLineNbr.hashCode() : 0);
        hash += (geacPageDt != null ? geacPageDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeacPurgedCustomerNotesPK)) {
            return false;
        }
        GeacPurgedCustomerNotesPK other = (GeacPurgedCustomerNotesPK) object;
        if ((this.purgeDt == null && other.purgeDt != null) || (this.purgeDt != null && !this.purgeDt.equals(other.purgeDt))) {
            return false;
        }
        if ((this.geacAcctNbr == null && other.geacAcctNbr != null) || (this.geacAcctNbr != null && !this.geacAcctNbr.equals(other.geacAcctNbr))) {
            return false;
        }
        if ((this.geacCmpyCd == null && other.geacCmpyCd != null) || (this.geacCmpyCd != null && !this.geacCmpyCd.equals(other.geacCmpyCd))) {
            return false;
        }
        if ((this.geacPageNbr == null && other.geacPageNbr != null) || (this.geacPageNbr != null && !this.geacPageNbr.equals(other.geacPageNbr))) {
            return false;
        }
        if ((this.geacLineNbr == null && other.geacLineNbr != null) || (this.geacLineNbr != null && !this.geacLineNbr.equals(other.geacLineNbr))) {
            return false;
        }
        if ((this.geacPageDt == null && other.geacPageDt != null) || (this.geacPageDt != null && !this.geacPageDt.equals(other.geacPageDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GeacPurgedCustomerNotesPK[ purgeDt=" + purgeDt + ", geacAcctNbr=" + geacAcctNbr + ", geacCmpyCd=" + geacCmpyCd + ", geacPageNbr=" + geacPageNbr + ", geacLineNbr=" + geacLineNbr + ", geacPageDt=" + geacPageDt + " ]";
    }
    
}
