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
public class PrdDtlLineItmPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PSTD_DT")
    @Temporal(TemporalType.DATE)
    private Date pstdDt;
    @Basic(optional = false)
    @Column(name = "TRNS_ID")
    private int trnsId;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private int seqNbr;
    @Basic(optional = false)
    @Column(name = "LINE_ITM_SEQ_NBR")
    private int lineItmSeqNbr;

    public PrdDtlLineItmPK() {
    }

    public PrdDtlLineItmPK(Date pstdDt, int trnsId, int seqNbr, int lineItmSeqNbr) {
        this.pstdDt = pstdDt;
        this.trnsId = trnsId;
        this.seqNbr = seqNbr;
        this.lineItmSeqNbr = lineItmSeqNbr;
    }

    public Date getPstdDt() {
        return pstdDt;
    }

    public void setPstdDt(Date pstdDt) {
        this.pstdDt = pstdDt;
    }

    public int getTrnsId() {
        return trnsId;
    }

    public void setTrnsId(int trnsId) {
        this.trnsId = trnsId;
    }

    public int getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(int seqNbr) {
        this.seqNbr = seqNbr;
    }

    public int getLineItmSeqNbr() {
        return lineItmSeqNbr;
    }

    public void setLineItmSeqNbr(int lineItmSeqNbr) {
        this.lineItmSeqNbr = lineItmSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pstdDt != null ? pstdDt.hashCode() : 0);
        hash += (int) trnsId;
        hash += (int) seqNbr;
        hash += (int) lineItmSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdDtlLineItmPK)) {
            return false;
        }
        PrdDtlLineItmPK other = (PrdDtlLineItmPK) object;
        if ((this.pstdDt == null && other.pstdDt != null) || (this.pstdDt != null && !this.pstdDt.equals(other.pstdDt))) {
            return false;
        }
        if (this.trnsId != other.trnsId) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        if (this.lineItmSeqNbr != other.lineItmSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdDtlLineItmPK[ pstdDt=" + pstdDt + ", trnsId=" + trnsId + ", seqNbr=" + seqNbr + ", lineItmSeqNbr=" + lineItmSeqNbr + " ]";
    }
    
}
