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
public class InvGlCdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PSTD_DT")
    @Temporal(TemporalType.DATE)
    private Date pstdDt;
    @Basic(optional = false)
    @Column(name = "TRNS_ID")
    private int trnsId;
    @Basic(optional = false)
    @Column(name = "GL_CD")
    private String glCd;
    @Basic(optional = false)
    @Column(name = "GL_TRNS_SEQ_NBR")
    private short glTrnsSeqNbr;

    public InvGlCdPK() {
    }

    public InvGlCdPK(Date pstdDt, int trnsId, String glCd, short glTrnsSeqNbr) {
        this.pstdDt = pstdDt;
        this.trnsId = trnsId;
        this.glCd = glCd;
        this.glTrnsSeqNbr = glTrnsSeqNbr;
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

    public String getGlCd() {
        return glCd;
    }

    public void setGlCd(String glCd) {
        this.glCd = glCd;
    }

    public short getGlTrnsSeqNbr() {
        return glTrnsSeqNbr;
    }

    public void setGlTrnsSeqNbr(short glTrnsSeqNbr) {
        this.glTrnsSeqNbr = glTrnsSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pstdDt != null ? pstdDt.hashCode() : 0);
        hash += (int) trnsId;
        hash += (glCd != null ? glCd.hashCode() : 0);
        hash += (int) glTrnsSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvGlCdPK)) {
            return false;
        }
        InvGlCdPK other = (InvGlCdPK) object;
        if ((this.pstdDt == null && other.pstdDt != null) || (this.pstdDt != null && !this.pstdDt.equals(other.pstdDt))) {
            return false;
        }
        if (this.trnsId != other.trnsId) {
            return false;
        }
        if ((this.glCd == null && other.glCd != null) || (this.glCd != null && !this.glCd.equals(other.glCd))) {
            return false;
        }
        if (this.glTrnsSeqNbr != other.glTrnsSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvGlCdPK[ pstdDt=" + pstdDt + ", trnsId=" + trnsId + ", glCd=" + glCd + ", glTrnsSeqNbr=" + glTrnsSeqNbr + " ]";
    }
    
}
