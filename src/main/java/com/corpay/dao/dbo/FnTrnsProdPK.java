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
public class FnTrnsProdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PAN")
    private String pan;
    @Basic(optional = false)
    @Column(name = "UT_DT")
    @Temporal(TemporalType.DATE)
    private Date utDt;
    @Basic(optional = false)
    @Column(name = "APPROV_CD")
    private int approvCd;
    @Basic(optional = false)
    @Column(name = "LOCAL_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date localTs;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private int seqNbr;

    public FnTrnsProdPK() {
    }

    public FnTrnsProdPK(String pan, Date utDt, int approvCd, Date localTs, int seqNbr) {
        this.pan = pan;
        this.utDt = utDt;
        this.approvCd = approvCd;
        this.localTs = localTs;
        this.seqNbr = seqNbr;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Date getUtDt() {
        return utDt;
    }

    public void setUtDt(Date utDt) {
        this.utDt = utDt;
    }

    public int getApprovCd() {
        return approvCd;
    }

    public void setApprovCd(int approvCd) {
        this.approvCd = approvCd;
    }

    public Date getLocalTs() {
        return localTs;
    }

    public void setLocalTs(Date localTs) {
        this.localTs = localTs;
    }

    public int getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(int seqNbr) {
        this.seqNbr = seqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pan != null ? pan.hashCode() : 0);
        hash += (utDt != null ? utDt.hashCode() : 0);
        hash += (int) approvCd;
        hash += (localTs != null ? localTs.hashCode() : 0);
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FnTrnsProdPK)) {
            return false;
        }
        FnTrnsProdPK other = (FnTrnsProdPK) object;
        if ((this.pan == null && other.pan != null) || (this.pan != null && !this.pan.equals(other.pan))) {
            return false;
        }
        if ((this.utDt == null && other.utDt != null) || (this.utDt != null && !this.utDt.equals(other.utDt))) {
            return false;
        }
        if (this.approvCd != other.approvCd) {
            return false;
        }
        if ((this.localTs == null && other.localTs != null) || (this.localTs != null && !this.localTs.equals(other.localTs))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnTrnsProdPK[ pan=" + pan + ", utDt=" + utDt + ", approvCd=" + approvCd + ", localTs=" + localTs + ", seqNbr=" + seqNbr + " ]";
    }
    
}
