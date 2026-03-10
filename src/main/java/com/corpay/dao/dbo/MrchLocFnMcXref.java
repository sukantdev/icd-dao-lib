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
@Table(name = "MRCH_LOC_FN_MC_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MrchLocFnMcXref.findAll", query = "SELECT m FROM MrchLocFnMcXref m")})
public class MrchLocFnMcXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchLocFnMcXrefPK mrchLocFnMcXrefPK;
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

    public MrchLocFnMcXref() {
    }

    public MrchLocFnMcXref(MrchLocFnMcXrefPK mrchLocFnMcXrefPK) {
        this.mrchLocFnMcXrefPK = mrchLocFnMcXrefPK;
    }

    public MrchLocFnMcXref(MrchLocFnMcXrefPK mrchLocFnMcXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mrchLocFnMcXrefPK = mrchLocFnMcXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MrchLocFnMcXref(String locId, String siteId) {
        this.mrchLocFnMcXrefPK = new MrchLocFnMcXrefPK(locId, siteId);
    }

    public MrchLocFnMcXrefPK getMrchLocFnMcXrefPK() {
        return mrchLocFnMcXrefPK;
    }

    public void setMrchLocFnMcXrefPK(MrchLocFnMcXrefPK mrchLocFnMcXrefPK) {
        this.mrchLocFnMcXrefPK = mrchLocFnMcXrefPK;
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
        hash += (mrchLocFnMcXrefPK != null ? mrchLocFnMcXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchLocFnMcXref)) {
            return false;
        }
        MrchLocFnMcXref other = (MrchLocFnMcXref) object;
        if ((this.mrchLocFnMcXrefPK == null && other.mrchLocFnMcXrefPK != null) || (this.mrchLocFnMcXrefPK != null && !this.mrchLocFnMcXrefPK.equals(other.mrchLocFnMcXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocFnMcXref[ mrchLocFnMcXrefPK=" + mrchLocFnMcXrefPK + " ]";
    }
    
}
