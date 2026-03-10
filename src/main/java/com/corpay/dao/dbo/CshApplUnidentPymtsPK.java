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
public class CshApplUnidentPymtsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "UI_LOCKBOX_NR")
    private String uiLockboxNr;
    @Basic(optional = false)
    @Column(name = "UI_PYMT_DT")
    @Temporal(TemporalType.DATE)
    private Date uiPymtDt;
    @Basic(optional = false)
    @Column(name = "UI_BTCH_NR")
    private short uiBtchNr;
    @Basic(optional = false)
    @Column(name = "UI_BTCH_SEQ_NR")
    private short uiBtchSeqNr;

    public CshApplUnidentPymtsPK() {
    }

    public CshApplUnidentPymtsPK(String uiLockboxNr, Date uiPymtDt, short uiBtchNr, short uiBtchSeqNr) {
        this.uiLockboxNr = uiLockboxNr;
        this.uiPymtDt = uiPymtDt;
        this.uiBtchNr = uiBtchNr;
        this.uiBtchSeqNr = uiBtchSeqNr;
    }

    public String getUiLockboxNr() {
        return uiLockboxNr;
    }

    public void setUiLockboxNr(String uiLockboxNr) {
        this.uiLockboxNr = uiLockboxNr;
    }

    public Date getUiPymtDt() {
        return uiPymtDt;
    }

    public void setUiPymtDt(Date uiPymtDt) {
        this.uiPymtDt = uiPymtDt;
    }

    public short getUiBtchNr() {
        return uiBtchNr;
    }

    public void setUiBtchNr(short uiBtchNr) {
        this.uiBtchNr = uiBtchNr;
    }

    public short getUiBtchSeqNr() {
        return uiBtchSeqNr;
    }

    public void setUiBtchSeqNr(short uiBtchSeqNr) {
        this.uiBtchSeqNr = uiBtchSeqNr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uiLockboxNr != null ? uiLockboxNr.hashCode() : 0);
        hash += (uiPymtDt != null ? uiPymtDt.hashCode() : 0);
        hash += (int) uiBtchNr;
        hash += (int) uiBtchSeqNr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CshApplUnidentPymtsPK)) {
            return false;
        }
        CshApplUnidentPymtsPK other = (CshApplUnidentPymtsPK) object;
        if ((this.uiLockboxNr == null && other.uiLockboxNr != null) || (this.uiLockboxNr != null && !this.uiLockboxNr.equals(other.uiLockboxNr))) {
            return false;
        }
        if ((this.uiPymtDt == null && other.uiPymtDt != null) || (this.uiPymtDt != null && !this.uiPymtDt.equals(other.uiPymtDt))) {
            return false;
        }
        if (this.uiBtchNr != other.uiBtchNr) {
            return false;
        }
        if (this.uiBtchSeqNr != other.uiBtchSeqNr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CshApplUnidentPymtsPK[ uiLockboxNr=" + uiLockboxNr + ", uiPymtDt=" + uiPymtDt + ", uiBtchNr=" + uiBtchNr + ", uiBtchSeqNr=" + uiBtchSeqNr + " ]";
    }
    
}
