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
@Table(name = "USR_UID_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrUidXref.findAll", query = "SELECT u FROM UsrUidXref u")})
public class UsrUidXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrUidXrefPK usrUidXrefPK;
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

    public UsrUidXref() {
    }

    public UsrUidXref(UsrUidXrefPK usrUidXrefPK) {
        this.usrUidXrefPK = usrUidXrefPK;
    }

    public UsrUidXref(UsrUidXrefPK usrUidXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrUidXrefPK = usrUidXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrUidXref(String usrId, String uid) {
        this.usrUidXrefPK = new UsrUidXrefPK(usrId, uid);
    }

    public UsrUidXrefPK getUsrUidXrefPK() {
        return usrUidXrefPK;
    }

    public void setUsrUidXrefPK(UsrUidXrefPK usrUidXrefPK) {
        this.usrUidXrefPK = usrUidXrefPK;
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
        hash += (usrUidXrefPK != null ? usrUidXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrUidXref)) {
            return false;
        }
        UsrUidXref other = (UsrUidXref) object;
        if ((this.usrUidXrefPK == null && other.usrUidXrefPK != null) || (this.usrUidXrefPK != null && !this.usrUidXrefPK.equals(other.usrUidXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrUidXref[ usrUidXrefPK=" + usrUidXrefPK + " ]";
    }
    
}
