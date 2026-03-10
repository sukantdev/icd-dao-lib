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
@Table(name = "VP_ACQUIRER_VEND_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpAcquirerVendXref.findAll", query = "SELECT v FROM VpAcquirerVendXref v")})
public class VpAcquirerVendXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpAcquirerVendXrefPK vpAcquirerVendXrefPK;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public VpAcquirerVendXref() {
    }

    public VpAcquirerVendXref(VpAcquirerVendXrefPK vpAcquirerVendXrefPK) {
        this.vpAcquirerVendXrefPK = vpAcquirerVendXrefPK;
    }

    public VpAcquirerVendXref(VpAcquirerVendXrefPK vpAcquirerVendXrefPK, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.vpAcquirerVendXrefPK = vpAcquirerVendXrefPK;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public VpAcquirerVendXref(String vendMasterId, String acquirerId) {
        this.vpAcquirerVendXrefPK = new VpAcquirerVendXrefPK(vendMasterId, acquirerId);
    }

    public VpAcquirerVendXrefPK getVpAcquirerVendXrefPK() {
        return vpAcquirerVendXrefPK;
    }

    public void setVpAcquirerVendXrefPK(VpAcquirerVendXrefPK vpAcquirerVendXrefPK) {
        this.vpAcquirerVendXrefPK = vpAcquirerVendXrefPK;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
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
        hash += (vpAcquirerVendXrefPK != null ? vpAcquirerVendXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpAcquirerVendXref)) {
            return false;
        }
        VpAcquirerVendXref other = (VpAcquirerVendXref) object;
        if ((this.vpAcquirerVendXrefPK == null && other.vpAcquirerVendXrefPK != null) || (this.vpAcquirerVendXrefPK != null && !this.vpAcquirerVendXrefPK.equals(other.vpAcquirerVendXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpAcquirerVendXref[ vpAcquirerVendXrefPK=" + vpAcquirerVendXrefPK + " ]";
    }
    
}
