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
@Table(name = "SCRN_OVRDS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ScrnOvrds.findAll", query = "SELECT s FROM ScrnOvrds s")})
public class ScrnOvrds implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ScrnOvrdsPK scrnOvrdsPK;
    @Basic(optional = false)
    @Column(name = "FIELD_USG_OVRD")
    private String fieldUsgOvrd;
    @Basic(optional = false)
    @Column(name = "LABEL_OVRD")
    private String labelOvrd;
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

    public ScrnOvrds() {
    }

    public ScrnOvrds(ScrnOvrdsPK scrnOvrdsPK) {
        this.scrnOvrdsPK = scrnOvrdsPK;
    }

    public ScrnOvrds(ScrnOvrdsPK scrnOvrdsPK, String fieldUsgOvrd, String labelOvrd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.scrnOvrdsPK = scrnOvrdsPK;
        this.fieldUsgOvrd = fieldUsgOvrd;
        this.labelOvrd = labelOvrd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ScrnOvrds(String applId, String pageNm, String fieldNm, String asmtLvl, String asmtVal) {
        this.scrnOvrdsPK = new ScrnOvrdsPK(applId, pageNm, fieldNm, asmtLvl, asmtVal);
    }

    public ScrnOvrdsPK getScrnOvrdsPK() {
        return scrnOvrdsPK;
    }

    public void setScrnOvrdsPK(ScrnOvrdsPK scrnOvrdsPK) {
        this.scrnOvrdsPK = scrnOvrdsPK;
    }

    public String getFieldUsgOvrd() {
        return fieldUsgOvrd;
    }

    public void setFieldUsgOvrd(String fieldUsgOvrd) {
        this.fieldUsgOvrd = fieldUsgOvrd;
    }

    public String getLabelOvrd() {
        return labelOvrd;
    }

    public void setLabelOvrd(String labelOvrd) {
        this.labelOvrd = labelOvrd;
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
        hash += (scrnOvrdsPK != null ? scrnOvrdsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScrnOvrds)) {
            return false;
        }
        ScrnOvrds other = (ScrnOvrds) object;
        if ((this.scrnOvrdsPK == null && other.scrnOvrdsPK != null) || (this.scrnOvrdsPK != null && !this.scrnOvrdsPK.equals(other.scrnOvrdsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ScrnOvrds[ scrnOvrdsPK=" + scrnOvrdsPK + " ]";
    }
    
}
