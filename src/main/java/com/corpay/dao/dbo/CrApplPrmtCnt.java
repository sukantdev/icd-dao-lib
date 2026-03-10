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
@Table(name = "CR_APPL_PRMT_CNT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrApplPrmtCnt.findAll", query = "SELECT c FROM CrApplPrmtCnt c")})
public class CrApplPrmtCnt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplPrmtCntPK crApplPrmtCntPK;
    @Basic(optional = false)
    @Column(name = "CNT")
    private int cnt;
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

    public CrApplPrmtCnt() {
    }

    public CrApplPrmtCnt(CrApplPrmtCntPK crApplPrmtCntPK) {
        this.crApplPrmtCntPK = crApplPrmtCntPK;
    }

    public CrApplPrmtCnt(CrApplPrmtCntPK crApplPrmtCntPK, int cnt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crApplPrmtCntPK = crApplPrmtCntPK;
        this.cnt = cnt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrApplPrmtCnt(String applNbr, String childTyp, String prmtTyp) {
        this.crApplPrmtCntPK = new CrApplPrmtCntPK(applNbr, childTyp, prmtTyp);
    }

    public CrApplPrmtCntPK getCrApplPrmtCntPK() {
        return crApplPrmtCntPK;
    }

    public void setCrApplPrmtCntPK(CrApplPrmtCntPK crApplPrmtCntPK) {
        this.crApplPrmtCntPK = crApplPrmtCntPK;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
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
        hash += (crApplPrmtCntPK != null ? crApplPrmtCntPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrApplPrmtCnt)) {
            return false;
        }
        CrApplPrmtCnt other = (CrApplPrmtCnt) object;
        if ((this.crApplPrmtCntPK == null && other.crApplPrmtCntPK != null) || (this.crApplPrmtCntPK != null && !this.crApplPrmtCntPK.equals(other.crApplPrmtCntPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplPrmtCnt[ crApplPrmtCntPK=" + crApplPrmtCntPK + " ]";
    }
    
}
