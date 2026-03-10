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
@Table(name = "SC_RACK_UPD_FLGS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ScRackUpdFlgs.findAll", query = "SELECT s FROM ScRackUpdFlgs s")})
public class ScRackUpdFlgs implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScRackUpdFlgsPK scRackUpdFlgsPK;
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

    public ScRackUpdFlgs() {
    }

    public ScRackUpdFlgs(ScRackUpdFlgsPK scRackUpdFlgsPK) {
        this.scRackUpdFlgsPK = scRackUpdFlgsPK;
    }

    public ScRackUpdFlgs(ScRackUpdFlgsPK scRackUpdFlgsPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.scRackUpdFlgsPK = scRackUpdFlgsPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ScRackUpdFlgs(String locTyp, String locCd, Character scRackDay) {
        this.scRackUpdFlgsPK = new ScRackUpdFlgsPK(locTyp, locCd, scRackDay);
    }

    public ScRackUpdFlgsPK getScRackUpdFlgsPK() {
        return scRackUpdFlgsPK;
    }

    public void setScRackUpdFlgsPK(ScRackUpdFlgsPK scRackUpdFlgsPK) {
        this.scRackUpdFlgsPK = scRackUpdFlgsPK;
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
        hash += (scRackUpdFlgsPK != null ? scRackUpdFlgsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScRackUpdFlgs)) {
            return false;
        }
        ScRackUpdFlgs other = (ScRackUpdFlgs) object;
        if ((this.scRackUpdFlgsPK == null && other.scRackUpdFlgsPK != null) || (this.scRackUpdFlgsPK != null && !this.scRackUpdFlgsPK.equals(other.scRackUpdFlgsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ScRackUpdFlgs[ scRackUpdFlgsPK=" + scRackUpdFlgsPK + " ]";
    }
    
}
