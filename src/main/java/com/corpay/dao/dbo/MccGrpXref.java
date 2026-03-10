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
@Table(name = "MCC_GRP_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MccGrpXref.findAll", query = "SELECT m FROM MccGrpXref m")})
public class MccGrpXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MccGrpXrefPK mccGrpXrefPK;
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

    public MccGrpXref() {
    }

    public MccGrpXref(MccGrpXrefPK mccGrpXrefPK) {
        this.mccGrpXrefPK = mccGrpXrefPK;
    }

    public MccGrpXref(MccGrpXrefPK mccGrpXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mccGrpXrefPK = mccGrpXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MccGrpXref(short grp, int mcc) {
        this.mccGrpXrefPK = new MccGrpXrefPK(grp, mcc);
    }

    public MccGrpXrefPK getMccGrpXrefPK() {
        return mccGrpXrefPK;
    }

    public void setMccGrpXrefPK(MccGrpXrefPK mccGrpXrefPK) {
        this.mccGrpXrefPK = mccGrpXrefPK;
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
        hash += (mccGrpXrefPK != null ? mccGrpXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MccGrpXref)) {
            return false;
        }
        MccGrpXref other = (MccGrpXref) object;
        if ((this.mccGrpXrefPK == null && other.mccGrpXrefPK != null) || (this.mccGrpXrefPK != null && !this.mccGrpXrefPK.equals(other.mccGrpXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MccGrpXref[ mccGrpXrefPK=" + mccGrpXrefPK + " ]";
    }
    
}
