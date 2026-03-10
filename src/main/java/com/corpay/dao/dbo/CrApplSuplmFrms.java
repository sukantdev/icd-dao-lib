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
@Table(name = "CR_APPL_SUPLM_FRMS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrApplSuplmFrms.findAll", query = "SELECT c FROM CrApplSuplmFrms c")})
public class CrApplSuplmFrms implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplSuplmFrmsPK crApplSuplmFrmsPK;
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
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public CrApplSuplmFrms() {
    }

    public CrApplSuplmFrms(CrApplSuplmFrmsPK crApplSuplmFrmsPK) {
        this.crApplSuplmFrmsPK = crApplSuplmFrmsPK;
    }

    public CrApplSuplmFrms(CrApplSuplmFrmsPK crApplSuplmFrmsPK, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.crApplSuplmFrmsPK = crApplSuplmFrmsPK;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
    }

    public CrApplSuplmFrms(String applNbr, String childTyp) {
        this.crApplSuplmFrmsPK = new CrApplSuplmFrmsPK(applNbr, childTyp);
    }

    public CrApplSuplmFrmsPK getCrApplSuplmFrmsPK() {
        return crApplSuplmFrmsPK;
    }

    public void setCrApplSuplmFrmsPK(CrApplSuplmFrmsPK crApplSuplmFrmsPK) {
        this.crApplSuplmFrmsPK = crApplSuplmFrmsPK;
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

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crApplSuplmFrmsPK != null ? crApplSuplmFrmsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrApplSuplmFrms)) {
            return false;
        }
        CrApplSuplmFrms other = (CrApplSuplmFrms) object;
        if ((this.crApplSuplmFrmsPK == null && other.crApplSuplmFrmsPK != null) || (this.crApplSuplmFrmsPK != null && !this.crApplSuplmFrmsPK.equals(other.crApplSuplmFrmsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplSuplmFrms[ crApplSuplmFrmsPK=" + crApplSuplmFrmsPK + " ]";
    }
    
}
