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
@Table(name = "MOB_USR_CRD_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MobUsrCrdXref.findAll", query = "SELECT m FROM MobUsrCrdXref m")})
public class MobUsrCrdXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MobUsrCrdXrefPK mobUsrCrdXrefPK;
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

    public MobUsrCrdXref() {
    }

    public MobUsrCrdXref(MobUsrCrdXrefPK mobUsrCrdXrefPK) {
        this.mobUsrCrdXrefPK = mobUsrCrdXrefPK;
    }

    public MobUsrCrdXref(MobUsrCrdXrefPK mobUsrCrdXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mobUsrCrdXrefPK = mobUsrCrdXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MobUsrCrdXref(String usrId, String crdNbr) {
        this.mobUsrCrdXrefPK = new MobUsrCrdXrefPK(usrId, crdNbr);
    }

    public MobUsrCrdXrefPK getMobUsrCrdXrefPK() {
        return mobUsrCrdXrefPK;
    }

    public void setMobUsrCrdXrefPK(MobUsrCrdXrefPK mobUsrCrdXrefPK) {
        this.mobUsrCrdXrefPK = mobUsrCrdXrefPK;
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
        hash += (mobUsrCrdXrefPK != null ? mobUsrCrdXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MobUsrCrdXref)) {
            return false;
        }
        MobUsrCrdXref other = (MobUsrCrdXref) object;
        if ((this.mobUsrCrdXrefPK == null && other.mobUsrCrdXrefPK != null) || (this.mobUsrCrdXrefPK != null && !this.mobUsrCrdXrefPK.equals(other.mobUsrCrdXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MobUsrCrdXref[ mobUsrCrdXrefPK=" + mobUsrCrdXrefPK + " ]";
    }
    
}
