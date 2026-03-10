/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "TRNS_INTRADAY_IDX", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "TrnsIntradayIdx.findAll", query = "SELECT t FROM TrnsIntradayIdx t")})
public class TrnsIntradayIdx implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TrnsIntradayIdxPK trnsIntradayIdxPK;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public TrnsIntradayIdx() {
    }

    public TrnsIntradayIdx(TrnsIntradayIdxPK trnsIntradayIdxPK) {
        this.trnsIntradayIdxPK = trnsIntradayIdxPK;
    }

    public TrnsIntradayIdx(TrnsIntradayIdxPK trnsIntradayIdxPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.trnsIntradayIdxPK = trnsIntradayIdxPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public TrnsIntradayIdx(String uid, Date currTs, int currTrkNbr) {
        this.trnsIntradayIdxPK = new TrnsIntradayIdxPK(uid, currTs, currTrkNbr);
    }

    public TrnsIntradayIdxPK getTrnsIntradayIdxPK() {
        return trnsIntradayIdxPK;
    }

    public void setTrnsIntradayIdxPK(TrnsIntradayIdxPK trnsIntradayIdxPK) {
        this.trnsIntradayIdxPK = trnsIntradayIdxPK;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnsIntradayIdxPK != null ? trnsIntradayIdxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrnsIntradayIdx)) {
            return false;
        }
        TrnsIntradayIdx other = (TrnsIntradayIdx) object;
        if ((this.trnsIntradayIdxPK == null && other.trnsIntradayIdxPK != null) || (this.trnsIntradayIdxPK != null && !this.trnsIntradayIdxPK.equals(other.trnsIntradayIdxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TrnsIntradayIdx[ trnsIntradayIdxPK=" + trnsIntradayIdxPK + " ]";
    }
    
}
