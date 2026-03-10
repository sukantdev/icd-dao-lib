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
@Table(name = "PSGR_GRP_NAMES", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PsgrGrpNames.findAll", query = "SELECT p FROM PsgrGrpNames p")})
public class PsgrGrpNames implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PsgrGrpNamesPK psgrGrpNamesPK;
    @Basic(optional = false)
    @Column(name = "GRP_NM")
    private String grpNm;
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

    public PsgrGrpNames() {
    }

    public PsgrGrpNames(PsgrGrpNamesPK psgrGrpNamesPK) {
        this.psgrGrpNamesPK = psgrGrpNamesPK;
    }

    public PsgrGrpNames(PsgrGrpNamesPK psgrGrpNamesPK, String grpNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.psgrGrpNamesPK = psgrGrpNamesPK;
        this.grpNm = grpNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PsgrGrpNames(String acctNbr, String psgrNm) {
        this.psgrGrpNamesPK = new PsgrGrpNamesPK(acctNbr, psgrNm);
    }

    public PsgrGrpNamesPK getPsgrGrpNamesPK() {
        return psgrGrpNamesPK;
    }

    public void setPsgrGrpNamesPK(PsgrGrpNamesPK psgrGrpNamesPK) {
        this.psgrGrpNamesPK = psgrGrpNamesPK;
    }

    public String getGrpNm() {
        return grpNm;
    }

    public void setGrpNm(String grpNm) {
        this.grpNm = grpNm;
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
        hash += (psgrGrpNamesPK != null ? psgrGrpNamesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsgrGrpNames)) {
            return false;
        }
        PsgrGrpNames other = (PsgrGrpNames) object;
        if ((this.psgrGrpNamesPK == null && other.psgrGrpNamesPK != null) || (this.psgrGrpNamesPK != null && !this.psgrGrpNamesPK.equals(other.psgrGrpNamesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PsgrGrpNames[ psgrGrpNamesPK=" + psgrGrpNamesPK + " ]";
    }
    
}
