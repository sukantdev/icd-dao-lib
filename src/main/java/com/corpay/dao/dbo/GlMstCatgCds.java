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
@Table(name = "GL_MST_CATG_CDS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "GlMstCatgCds.findAll", query = "SELECT g FROM GlMstCatgCds g")})
public class GlMstCatgCds implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlMstCatgCdsPK glMstCatgCdsPK;
    @Basic(optional = false)
    @Column(name = "CATG_CD_DESC")
    private String catgCdDesc;
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

    public GlMstCatgCds() {
    }

    public GlMstCatgCds(GlMstCatgCdsPK glMstCatgCdsPK) {
        this.glMstCatgCdsPK = glMstCatgCdsPK;
    }

    public GlMstCatgCds(GlMstCatgCdsPK glMstCatgCdsPK, String catgCdDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.glMstCatgCdsPK = glMstCatgCdsPK;
        this.catgCdDesc = catgCdDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GlMstCatgCds(String acctNbr, int catgLvl, String catgCd, Date mstPrfId) {
        this.glMstCatgCdsPK = new GlMstCatgCdsPK(acctNbr, catgLvl, catgCd, mstPrfId);
    }

    public GlMstCatgCdsPK getGlMstCatgCdsPK() {
        return glMstCatgCdsPK;
    }

    public void setGlMstCatgCdsPK(GlMstCatgCdsPK glMstCatgCdsPK) {
        this.glMstCatgCdsPK = glMstCatgCdsPK;
    }

    public String getCatgCdDesc() {
        return catgCdDesc;
    }

    public void setCatgCdDesc(String catgCdDesc) {
        this.catgCdDesc = catgCdDesc;
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
        hash += (glMstCatgCdsPK != null ? glMstCatgCdsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlMstCatgCds)) {
            return false;
        }
        GlMstCatgCds other = (GlMstCatgCds) object;
        if ((this.glMstCatgCdsPK == null && other.glMstCatgCdsPK != null) || (this.glMstCatgCdsPK != null && !this.glMstCatgCdsPK.equals(other.glMstCatgCdsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlMstCatgCds[ glMstCatgCdsPK=" + glMstCatgCdsPK + " ]";
    }
    
}
