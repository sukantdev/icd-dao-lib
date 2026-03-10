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
@Table(name = "USR_CUST_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrCustXref.findAll", query = "SELECT u FROM UsrCustXref u")})
public class UsrCustXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrCustXrefPK usrCustXrefPK;
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

    public UsrCustXref() {
    }

    public UsrCustXref(UsrCustXrefPK usrCustXrefPK) {
        this.usrCustXrefPK = usrCustXrefPK;
    }

    public UsrCustXref(UsrCustXrefPK usrCustXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrCustXrefPK = usrCustXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrCustXref(String usrId, String custId) {
        this.usrCustXrefPK = new UsrCustXrefPK(usrId, custId);
    }

    public UsrCustXrefPK getUsrCustXrefPK() {
        return usrCustXrefPK;
    }

    public void setUsrCustXrefPK(UsrCustXrefPK usrCustXrefPK) {
        this.usrCustXrefPK = usrCustXrefPK;
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
        hash += (usrCustXrefPK != null ? usrCustXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrCustXref)) {
            return false;
        }
        UsrCustXref other = (UsrCustXref) object;
        if ((this.usrCustXrefPK == null && other.usrCustXrefPK != null) || (this.usrCustXrefPK != null && !this.usrCustXrefPK.equals(other.usrCustXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrCustXref[ usrCustXrefPK=" + usrCustXrefPK + " ]";
    }
    
}
