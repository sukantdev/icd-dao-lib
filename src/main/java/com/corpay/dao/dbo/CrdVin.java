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
@Table(name = "CRD_VIN", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrdVin.findAll", query = "SELECT c FROM CrdVin c")})
public class CrdVin implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdVinPK crdVinPK;
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

    public CrdVin() {
    }

    public CrdVin(CrdVinPK crdVinPK) {
        this.crdVinPK = crdVinPK;
    }

    public CrdVin(CrdVinPK crdVinPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdVinPK = crdVinPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdVin(String crdTknNbr, String vin) {
        this.crdVinPK = new CrdVinPK(crdTknNbr, vin);
    }

    public CrdVinPK getCrdVinPK() {
        return crdVinPK;
    }

    public void setCrdVinPK(CrdVinPK crdVinPK) {
        this.crdVinPK = crdVinPK;
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
        hash += (crdVinPK != null ? crdVinPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdVin)) {
            return false;
        }
        CrdVin other = (CrdVin) object;
        if ((this.crdVinPK == null && other.crdVinPK != null) || (this.crdVinPK != null && !this.crdVinPK.equals(other.crdVinPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdVin[ crdVinPK=" + crdVinPK + " ]";
    }
    
}
