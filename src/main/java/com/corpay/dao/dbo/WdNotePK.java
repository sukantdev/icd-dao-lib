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
public class WdNotePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BT_PMT_NBR")
    private int btPmtNbr;
    @Basic(optional = false)
    @Column(name = "BT_TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date btTrnsDt;
    @Basic(optional = false)
    @Column(name = "WD_TYP_CD")
    private String wdTypCd;
    @Basic(optional = false)
    @Column(name = "WD_SEQ_NBR")
    private int wdSeqNbr;

    public WdNotePK() {
    }

    public WdNotePK(int btPmtNbr, Date btTrnsDt, String wdTypCd, int wdSeqNbr) {
        this.btPmtNbr = btPmtNbr;
        this.btTrnsDt = btTrnsDt;
        this.wdTypCd = wdTypCd;
        this.wdSeqNbr = wdSeqNbr;
    }

    public int getBtPmtNbr() {
        return btPmtNbr;
    }

    public void setBtPmtNbr(int btPmtNbr) {
        this.btPmtNbr = btPmtNbr;
    }

    public Date getBtTrnsDt() {
        return btTrnsDt;
    }

    public void setBtTrnsDt(Date btTrnsDt) {
        this.btTrnsDt = btTrnsDt;
    }

    public String getWdTypCd() {
        return wdTypCd;
    }

    public void setWdTypCd(String wdTypCd) {
        this.wdTypCd = wdTypCd;
    }

    public int getWdSeqNbr() {
        return wdSeqNbr;
    }

    public void setWdSeqNbr(int wdSeqNbr) {
        this.wdSeqNbr = wdSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) btPmtNbr;
        hash += (btTrnsDt != null ? btTrnsDt.hashCode() : 0);
        hash += (wdTypCd != null ? wdTypCd.hashCode() : 0);
        hash += (int) wdSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WdNotePK)) {
            return false;
        }
        WdNotePK other = (WdNotePK) object;
        if (this.btPmtNbr != other.btPmtNbr) {
            return false;
        }
        if ((this.btTrnsDt == null && other.btTrnsDt != null) || (this.btTrnsDt != null && !this.btTrnsDt.equals(other.btTrnsDt))) {
            return false;
        }
        if ((this.wdTypCd == null && other.wdTypCd != null) || (this.wdTypCd != null && !this.wdTypCd.equals(other.wdTypCd))) {
            return false;
        }
        if (this.wdSeqNbr != other.wdSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.WdNotePK[ btPmtNbr=" + btPmtNbr + ", btTrnsDt=" + btTrnsDt + ", wdTypCd=" + wdTypCd + ", wdSeqNbr=" + wdSeqNbr + " ]";
    }
    
}
