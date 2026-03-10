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
@Table(name = "GCMS_LOCAT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "GcmsLocat.findAll", query = "SELECT g FROM GcmsLocat g")})
public class GcmsLocat implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GcmsLocatPK gcmsLocatPK;
    @Basic(optional = false)
    @Column(name = "SITE_ID")
    private String siteId;
    @Basic(optional = false)
    @Column(name = "STAT")
    private Character stat;
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

    public GcmsLocat() {
    }

    public GcmsLocat(GcmsLocatPK gcmsLocatPK) {
        this.gcmsLocatPK = gcmsLocatPK;
    }

    public GcmsLocat(GcmsLocatPK gcmsLocatPK, String siteId, Character stat, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.gcmsLocatPK = gcmsLocatPK;
        this.siteId = siteId;
        this.stat = stat;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GcmsLocat(String acptrId, String fwdId, String mktrId) {
        this.gcmsLocatPK = new GcmsLocatPK(acptrId, fwdId, mktrId);
    }

    public GcmsLocatPK getGcmsLocatPK() {
        return gcmsLocatPK;
    }

    public void setGcmsLocatPK(GcmsLocatPK gcmsLocatPK) {
        this.gcmsLocatPK = gcmsLocatPK;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public Character getStat() {
        return stat;
    }

    public void setStat(Character stat) {
        this.stat = stat;
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
        hash += (gcmsLocatPK != null ? gcmsLocatPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GcmsLocat)) {
            return false;
        }
        GcmsLocat other = (GcmsLocat) object;
        if ((this.gcmsLocatPK == null && other.gcmsLocatPK != null) || (this.gcmsLocatPK != null && !this.gcmsLocatPK.equals(other.gcmsLocatPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GcmsLocat[ gcmsLocatPK=" + gcmsLocatPK + " ]";
    }
    
}
