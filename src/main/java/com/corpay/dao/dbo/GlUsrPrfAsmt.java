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
@Table(name = "GL_USR_PRF_ASMT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "GlUsrPrfAsmt.findAll", query = "SELECT g FROM GlUsrPrfAsmt g")})
public class GlUsrPrfAsmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlUsrPrfAsmtPK glUsrPrfAsmtPK;
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

    public GlUsrPrfAsmt() {
    }

    public GlUsrPrfAsmt(GlUsrPrfAsmtPK glUsrPrfAsmtPK) {
        this.glUsrPrfAsmtPK = glUsrPrfAsmtPK;
    }

    public GlUsrPrfAsmt(GlUsrPrfAsmtPK glUsrPrfAsmtPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.glUsrPrfAsmtPK = glUsrPrfAsmtPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GlUsrPrfAsmt(String acctNbr, Date prfId, String usrId) {
        this.glUsrPrfAsmtPK = new GlUsrPrfAsmtPK(acctNbr, prfId, usrId);
    }

    public GlUsrPrfAsmtPK getGlUsrPrfAsmtPK() {
        return glUsrPrfAsmtPK;
    }

    public void setGlUsrPrfAsmtPK(GlUsrPrfAsmtPK glUsrPrfAsmtPK) {
        this.glUsrPrfAsmtPK = glUsrPrfAsmtPK;
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
        hash += (glUsrPrfAsmtPK != null ? glUsrPrfAsmtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlUsrPrfAsmt)) {
            return false;
        }
        GlUsrPrfAsmt other = (GlUsrPrfAsmt) object;
        if ((this.glUsrPrfAsmtPK == null && other.glUsrPrfAsmtPK != null) || (this.glUsrPrfAsmtPK != null && !this.glUsrPrfAsmtPK.equals(other.glUsrPrfAsmtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlUsrPrfAsmt[ glUsrPrfAsmtPK=" + glUsrPrfAsmtPK + " ]";
    }
    
}
