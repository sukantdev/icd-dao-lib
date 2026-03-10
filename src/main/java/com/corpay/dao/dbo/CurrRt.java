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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CURR_RT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CurrRt.findAll", query = "SELECT c FROM CurrRt c")})
public class CurrRt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CurrRtPK currRtPK;
    @Basic(optional = false)
    @Column(name = "CURR_RT_BASE_ISO")
    private short currRtBaseIso;
    @Basic(optional = false)
    @Column(name = "CURR_RT_CNV_TO_ISO")
    private short currRtCnvToIso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CURR_BASE_CNV_RT")
    private BigDecimal currBaseCnvRt;
    @Basic(optional = false)
    @Column(name = "CURR_CNV_RT")
    private BigDecimal currCnvRt;
    @Basic(optional = false)
    @Column(name = "CURR_CNV_RT_MRKUP")
    private BigDecimal currCnvRtMrkup;
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

    public CurrRt() {
    }

    public CurrRt(CurrRtPK currRtPK) {
        this.currRtPK = currRtPK;
    }

    public CurrRt(CurrRtPK currRtPK, short currRtBaseIso, short currRtCnvToIso, BigDecimal currBaseCnvRt, BigDecimal currCnvRt, BigDecimal currCnvRtMrkup, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.currRtPK = currRtPK;
        this.currRtBaseIso = currRtBaseIso;
        this.currRtCnvToIso = currRtCnvToIso;
        this.currBaseCnvRt = currBaseCnvRt;
        this.currCnvRt = currCnvRt;
        this.currCnvRtMrkup = currCnvRtMrkup;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CurrRt(Date currRtEffDt, String currRtBaseAlph, String currRtCnvToAlph) {
        this.currRtPK = new CurrRtPK(currRtEffDt, currRtBaseAlph, currRtCnvToAlph);
    }

    public CurrRtPK getCurrRtPK() {
        return currRtPK;
    }

    public void setCurrRtPK(CurrRtPK currRtPK) {
        this.currRtPK = currRtPK;
    }

    public short getCurrRtBaseIso() {
        return currRtBaseIso;
    }

    public void setCurrRtBaseIso(short currRtBaseIso) {
        this.currRtBaseIso = currRtBaseIso;
    }

    public short getCurrRtCnvToIso() {
        return currRtCnvToIso;
    }

    public void setCurrRtCnvToIso(short currRtCnvToIso) {
        this.currRtCnvToIso = currRtCnvToIso;
    }

    public BigDecimal getCurrBaseCnvRt() {
        return currBaseCnvRt;
    }

    public void setCurrBaseCnvRt(BigDecimal currBaseCnvRt) {
        this.currBaseCnvRt = currBaseCnvRt;
    }

    public BigDecimal getCurrCnvRt() {
        return currCnvRt;
    }

    public void setCurrCnvRt(BigDecimal currCnvRt) {
        this.currCnvRt = currCnvRt;
    }

    public BigDecimal getCurrCnvRtMrkup() {
        return currCnvRtMrkup;
    }

    public void setCurrCnvRtMrkup(BigDecimal currCnvRtMrkup) {
        this.currCnvRtMrkup = currCnvRtMrkup;
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
        hash += (currRtPK != null ? currRtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurrRt)) {
            return false;
        }
        CurrRt other = (CurrRt) object;
        if ((this.currRtPK == null && other.currRtPK != null) || (this.currRtPK != null && !this.currRtPK.equals(other.currRtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CurrRt[ currRtPK=" + currRtPK + " ]";
    }
    
}
