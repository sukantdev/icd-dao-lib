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
@Table(name = "GL_CD_RPLCMNT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "GlCdRplcmnt.findAll", query = "SELECT g FROM GlCdRplcmnt g")})
public class GlCdRplcmnt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlCdRplcmntPK glCdRplcmntPK;
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

    public GlCdRplcmnt() {
    }

    public GlCdRplcmnt(GlCdRplcmntPK glCdRplcmntPK) {
        this.glCdRplcmntPK = glCdRplcmntPK;
    }

    public GlCdRplcmnt(GlCdRplcmntPK glCdRplcmntPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.glCdRplcmntPK = glCdRplcmntPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GlCdRplcmnt(Date pstdDt, String acctNbr, String custId) {
        this.glCdRplcmntPK = new GlCdRplcmntPK(pstdDt, acctNbr, custId);
    }

    public GlCdRplcmntPK getGlCdRplcmntPK() {
        return glCdRplcmntPK;
    }

    public void setGlCdRplcmntPK(GlCdRplcmntPK glCdRplcmntPK) {
        this.glCdRplcmntPK = glCdRplcmntPK;
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
        hash += (glCdRplcmntPK != null ? glCdRplcmntPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlCdRplcmnt)) {
            return false;
        }
        GlCdRplcmnt other = (GlCdRplcmnt) object;
        if ((this.glCdRplcmntPK == null && other.glCdRplcmntPK != null) || (this.glCdRplcmntPK != null && !this.glCdRplcmntPK.equals(other.glCdRplcmntPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlCdRplcmnt[ glCdRplcmntPK=" + glCdRplcmntPK + " ]";
    }
    
}
