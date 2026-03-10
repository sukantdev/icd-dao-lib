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
@Table(name = "MRCH_DISC_ID_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MrchDiscIdXref.findAll", query = "SELECT m FROM MrchDiscIdXref m")})
public class MrchDiscIdXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchDiscIdXrefPK mrchDiscIdXrefPK;
    @Basic(optional = false)
    @Column(name = "DISC_SUB_ID")
    private short discSubId;
    @Basic(optional = false)
    @Column(name = "GL_CD")
    private String glCd;
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

    public MrchDiscIdXref() {
    }

    public MrchDiscIdXref(MrchDiscIdXrefPK mrchDiscIdXrefPK) {
        this.mrchDiscIdXrefPK = mrchDiscIdXrefPK;
    }

    public MrchDiscIdXref(MrchDiscIdXrefPK mrchDiscIdXrefPK, short discSubId, String glCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mrchDiscIdXrefPK = mrchDiscIdXrefPK;
        this.discSubId = discSubId;
        this.glCd = glCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MrchDiscIdXref(String mrchCd, String mrchTypCd, String discId) {
        this.mrchDiscIdXrefPK = new MrchDiscIdXrefPK(mrchCd, mrchTypCd, discId);
    }

    public MrchDiscIdXrefPK getMrchDiscIdXrefPK() {
        return mrchDiscIdXrefPK;
    }

    public void setMrchDiscIdXrefPK(MrchDiscIdXrefPK mrchDiscIdXrefPK) {
        this.mrchDiscIdXrefPK = mrchDiscIdXrefPK;
    }

    public short getDiscSubId() {
        return discSubId;
    }

    public void setDiscSubId(short discSubId) {
        this.discSubId = discSubId;
    }

    public String getGlCd() {
        return glCd;
    }

    public void setGlCd(String glCd) {
        this.glCd = glCd;
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
        hash += (mrchDiscIdXrefPK != null ? mrchDiscIdXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchDiscIdXref)) {
            return false;
        }
        MrchDiscIdXref other = (MrchDiscIdXref) object;
        if ((this.mrchDiscIdXrefPK == null && other.mrchDiscIdXrefPK != null) || (this.mrchDiscIdXrefPK != null && !this.mrchDiscIdXrefPK.equals(other.mrchDiscIdXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchDiscIdXref[ mrchDiscIdXrefPK=" + mrchDiscIdXrefPK + " ]";
    }
    
}
