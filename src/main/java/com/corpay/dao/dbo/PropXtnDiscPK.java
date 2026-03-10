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
public class PropXtnDiscPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date trnsDt;
    @Basic(optional = false)
    @Column(name = "CTL_NBR")
    private int ctlNbr;
    @Basic(optional = false)
    @Column(name = "PRD_NBR")
    private short prdNbr;
    @Basic(optional = false)
    @Column(name = "DISC_REB_IND")
    private Character discRebInd;
    @Basic(optional = false)
    @Column(name = "DUP_CTR")
    private short dupCtr;

    public PropXtnDiscPK() {
    }

    public PropXtnDiscPK(Date trnsDt, int ctlNbr, short prdNbr, Character discRebInd, short dupCtr) {
        this.trnsDt = trnsDt;
        this.ctlNbr = ctlNbr;
        this.prdNbr = prdNbr;
        this.discRebInd = discRebInd;
        this.dupCtr = dupCtr;
    }

    public Date getTrnsDt() {
        return trnsDt;
    }

    public void setTrnsDt(Date trnsDt) {
        this.trnsDt = trnsDt;
    }

    public int getCtlNbr() {
        return ctlNbr;
    }

    public void setCtlNbr(int ctlNbr) {
        this.ctlNbr = ctlNbr;
    }

    public short getPrdNbr() {
        return prdNbr;
    }

    public void setPrdNbr(short prdNbr) {
        this.prdNbr = prdNbr;
    }

    public Character getDiscRebInd() {
        return discRebInd;
    }

    public void setDiscRebInd(Character discRebInd) {
        this.discRebInd = discRebInd;
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
        hash += (trnsDt != null ? trnsDt.hashCode() : 0);
        hash += (int) ctlNbr;
        hash += (int) prdNbr;
        hash += (discRebInd != null ? discRebInd.hashCode() : 0);
        hash += (int) dupCtr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropXtnDiscPK)) {
            return false;
        }
        PropXtnDiscPK other = (PropXtnDiscPK) object;
        if ((this.trnsDt == null && other.trnsDt != null) || (this.trnsDt != null && !this.trnsDt.equals(other.trnsDt))) {
            return false;
        }
        if (this.ctlNbr != other.ctlNbr) {
            return false;
        }
        if (this.prdNbr != other.prdNbr) {
            return false;
        }
        if ((this.discRebInd == null && other.discRebInd != null) || (this.discRebInd != null && !this.discRebInd.equals(other.discRebInd))) {
            return false;
        }
        if (this.dupCtr != other.dupCtr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PropXtnDiscPK[ trnsDt=" + trnsDt + ", ctlNbr=" + ctlNbr + ", prdNbr=" + prdNbr + ", discRebInd=" + discRebInd + ", dupCtr=" + dupCtr + " ]";
    }
    
}
