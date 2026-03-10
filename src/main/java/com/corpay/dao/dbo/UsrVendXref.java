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
@Table(name = "USR_VEND_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrVendXref.findAll", query = "SELECT u FROM UsrVendXref u")})
public class UsrVendXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrVendXrefPK usrVendXrefPK;
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

    public UsrVendXref() {
    }

    public UsrVendXref(UsrVendXrefPK usrVendXrefPK) {
        this.usrVendXrefPK = usrVendXrefPK;
    }

    public UsrVendXref(UsrVendXrefPK usrVendXrefPK, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.usrVendXrefPK = usrVendXrefPK;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public UsrVendXref(String usrId, String vendId) {
        this.usrVendXrefPK = new UsrVendXrefPK(usrId, vendId);
    }

    public UsrVendXrefPK getUsrVendXrefPK() {
        return usrVendXrefPK;
    }

    public void setUsrVendXrefPK(UsrVendXrefPK usrVendXrefPK) {
        this.usrVendXrefPK = usrVendXrefPK;
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
        hash += (usrVendXrefPK != null ? usrVendXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrVendXref)) {
            return false;
        }
        UsrVendXref other = (UsrVendXref) object;
        if ((this.usrVendXrefPK == null && other.usrVendXrefPK != null) || (this.usrVendXrefPK != null && !this.usrVendXrefPK.equals(other.usrVendXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrVendXref[ usrVendXrefPK=" + usrVendXrefPK + " ]";
    }
    
}
