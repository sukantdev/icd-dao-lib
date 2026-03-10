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
@Table(name = "PRF_GRP_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrfGrpXref.findAll", query = "SELECT p FROM PrfGrpXref p")})
public class PrfGrpXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrfGrpXrefPK prfGrpXrefPK;
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

    public PrfGrpXref() {
    }

    public PrfGrpXref(PrfGrpXrefPK prfGrpXrefPK) {
        this.prfGrpXrefPK = prfGrpXrefPK;
    }

    public PrfGrpXref(PrfGrpXrefPK prfGrpXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prfGrpXrefPK = prfGrpXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrfGrpXref(Date prfId, Date grpId) {
        this.prfGrpXrefPK = new PrfGrpXrefPK(prfId, grpId);
    }

    public PrfGrpXrefPK getPrfGrpXrefPK() {
        return prfGrpXrefPK;
    }

    public void setPrfGrpXrefPK(PrfGrpXrefPK prfGrpXrefPK) {
        this.prfGrpXrefPK = prfGrpXrefPK;
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
        hash += (prfGrpXrefPK != null ? prfGrpXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrfGrpXref)) {
            return false;
        }
        PrfGrpXref other = (PrfGrpXref) object;
        if ((this.prfGrpXrefPK == null && other.prfGrpXrefPK != null) || (this.prfGrpXrefPK != null && !this.prfGrpXrefPK.equals(other.prfGrpXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrfGrpXref[ prfGrpXrefPK=" + prfGrpXrefPK + " ]";
    }
    
}
