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
@Table(name = "CDN_TOKENS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CdnTokens.findAll", query = "SELECT c FROM CdnTokens c")})
public class CdnTokens implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CdnTokensPK cdnTokensPK;
    @Basic(optional = false)
    @Column(name = "TKN_EXP_DT")
    @Temporal(TemporalType.DATE)
    private Date tknExpDt;
    @Basic(optional = false)
    @Column(name = "TKN_MAX_USE_QTY")
    private short tknMaxUseQty;
    @Basic(optional = false)
    @Column(name = "TKN_ACTUAL_USE_QTY")
    private short tknActualUseQty;
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

    public CdnTokens() {
    }

    public CdnTokens(CdnTokensPK cdnTokensPK) {
        this.cdnTokensPK = cdnTokensPK;
    }

    public CdnTokens(CdnTokensPK cdnTokensPK, Date tknExpDt, short tknMaxUseQty, short tknActualUseQty, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.cdnTokensPK = cdnTokensPK;
        this.tknExpDt = tknExpDt;
        this.tknMaxUseQty = tknMaxUseQty;
        this.tknActualUseQty = tknActualUseQty;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CdnTokens(String tknTypCd, String tknAlphaTxt) {
        this.cdnTokensPK = new CdnTokensPK(tknTypCd, tknAlphaTxt);
    }

    public CdnTokensPK getCdnTokensPK() {
        return cdnTokensPK;
    }

    public void setCdnTokensPK(CdnTokensPK cdnTokensPK) {
        this.cdnTokensPK = cdnTokensPK;
    }

    public Date getTknExpDt() {
        return tknExpDt;
    }

    public void setTknExpDt(Date tknExpDt) {
        this.tknExpDt = tknExpDt;
    }

    public short getTknMaxUseQty() {
        return tknMaxUseQty;
    }

    public void setTknMaxUseQty(short tknMaxUseQty) {
        this.tknMaxUseQty = tknMaxUseQty;
    }

    public short getTknActualUseQty() {
        return tknActualUseQty;
    }

    public void setTknActualUseQty(short tknActualUseQty) {
        this.tknActualUseQty = tknActualUseQty;
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
        hash += (cdnTokensPK != null ? cdnTokensPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CdnTokens)) {
            return false;
        }
        CdnTokens other = (CdnTokens) object;
        if ((this.cdnTokensPK == null && other.cdnTokensPK != null) || (this.cdnTokensPK != null && !this.cdnTokensPK.equals(other.cdnTokensPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CdnTokens[ cdnTokensPK=" + cdnTokensPK + " ]";
    }
    
}
