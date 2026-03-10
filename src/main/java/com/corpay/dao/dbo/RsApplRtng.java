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
@Table(name = "RS_APPL_RTNG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RsApplRtng.findAll", query = "SELECT r FROM RsApplRtng r")})
public class RsApplRtng implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RsApplRtngPK rsApplRtngPK;
    @Basic(optional = false)
    @Column(name = "APPL_PGM_NM")
    private String applPgmNm;
    @Basic(optional = false)
    @Column(name = "APPL_TRNS_ID")
    private String applTrnsId;
    @Basic(optional = false)
    @Column(name = "PROC_TRNS_DESC")
    private String procTrnsDesc;
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

    public RsApplRtng() {
    }

    public RsApplRtng(RsApplRtngPK rsApplRtngPK) {
        this.rsApplRtngPK = rsApplRtngPK;
    }

    public RsApplRtng(RsApplRtngPK rsApplRtngPK, String applPgmNm, String applTrnsId, String procTrnsDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.rsApplRtngPK = rsApplRtngPK;
        this.applPgmNm = applPgmNm;
        this.applTrnsId = applTrnsId;
        this.procTrnsDesc = procTrnsDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public RsApplRtng(String procTrnsId, int reqNbr) {
        this.rsApplRtngPK = new RsApplRtngPK(procTrnsId, reqNbr);
    }

    public RsApplRtngPK getRsApplRtngPK() {
        return rsApplRtngPK;
    }

    public void setRsApplRtngPK(RsApplRtngPK rsApplRtngPK) {
        this.rsApplRtngPK = rsApplRtngPK;
    }

    public String getApplPgmNm() {
        return applPgmNm;
    }

    public void setApplPgmNm(String applPgmNm) {
        this.applPgmNm = applPgmNm;
    }

    public String getApplTrnsId() {
        return applTrnsId;
    }

    public void setApplTrnsId(String applTrnsId) {
        this.applTrnsId = applTrnsId;
    }

    public String getProcTrnsDesc() {
        return procTrnsDesc;
    }

    public void setProcTrnsDesc(String procTrnsDesc) {
        this.procTrnsDesc = procTrnsDesc;
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
        hash += (rsApplRtngPK != null ? rsApplRtngPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RsApplRtng)) {
            return false;
        }
        RsApplRtng other = (RsApplRtng) object;
        if ((this.rsApplRtngPK == null && other.rsApplRtngPK != null) || (this.rsApplRtngPK != null && !this.rsApplRtngPK.equals(other.rsApplRtngPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RsApplRtng[ rsApplRtngPK=" + rsApplRtngPK + " ]";
    }
    
}
