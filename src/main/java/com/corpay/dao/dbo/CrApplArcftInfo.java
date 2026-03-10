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
@Table(name = "CR_APPL_ARCFT_INFO", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrApplArcftInfo.findAll", query = "SELECT c FROM CrApplArcftInfo c")})
public class CrApplArcftInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplArcftInfoPK crApplArcftInfoPK;
    @Basic(optional = false)
    @Column(name = "BAS_ARPT")
    private String basArpt;
    @Basic(optional = false)
    @Column(name = "REG_NBR")
    private String regNbr;
    @Basic(optional = false)
    @Column(name = "MAKE_MODEL")
    private String makeModel;
    @Basic(optional = false)
    @Column(name = "OWN_OR_FIN")
    private String ownOrFin;
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
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;

    public CrApplArcftInfo() {
    }

    public CrApplArcftInfo(CrApplArcftInfoPK crApplArcftInfoPK) {
        this.crApplArcftInfoPK = crApplArcftInfoPK;
    }

    public CrApplArcftInfo(CrApplArcftInfoPK crApplArcftInfoPK, String basArpt, String regNbr, String makeModel, String ownOrFin, Date mdyTs, String mdyUsr, Date crtTs, String crtUsr) {
        this.crApplArcftInfoPK = crApplArcftInfoPK;
        this.basArpt = basArpt;
        this.regNbr = regNbr;
        this.makeModel = makeModel;
        this.ownOrFin = ownOrFin;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
    }

    public CrApplArcftInfo(String applNbr, short seqNbr) {
        this.crApplArcftInfoPK = new CrApplArcftInfoPK(applNbr, seqNbr);
    }

    public CrApplArcftInfoPK getCrApplArcftInfoPK() {
        return crApplArcftInfoPK;
    }

    public void setCrApplArcftInfoPK(CrApplArcftInfoPK crApplArcftInfoPK) {
        this.crApplArcftInfoPK = crApplArcftInfoPK;
    }

    public String getBasArpt() {
        return basArpt;
    }

    public void setBasArpt(String basArpt) {
        this.basArpt = basArpt;
    }

    public String getRegNbr() {
        return regNbr;
    }

    public void setRegNbr(String regNbr) {
        this.regNbr = regNbr;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getOwnOrFin() {
        return ownOrFin;
    }

    public void setOwnOrFin(String ownOrFin) {
        this.ownOrFin = ownOrFin;
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

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crApplArcftInfoPK != null ? crApplArcftInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrApplArcftInfo)) {
            return false;
        }
        CrApplArcftInfo other = (CrApplArcftInfo) object;
        if ((this.crApplArcftInfoPK == null && other.crApplArcftInfoPK != null) || (this.crApplArcftInfoPK != null && !this.crApplArcftInfoPK.equals(other.crApplArcftInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplArcftInfo[ crApplArcftInfoPK=" + crApplArcftInfoPK + " ]";
    }
    
}
