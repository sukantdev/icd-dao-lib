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
@Table(name = "USR_EBPACCT_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrEbpacctXref.findAll", query = "SELECT u FROM UsrEbpacctXref u")})
public class UsrEbpacctXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrEbpacctXrefPK usrEbpacctXrefPK;
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

    public UsrEbpacctXref() {
    }

    public UsrEbpacctXref(UsrEbpacctXrefPK usrEbpacctXrefPK) {
        this.usrEbpacctXrefPK = usrEbpacctXrefPK;
    }

    public UsrEbpacctXref(UsrEbpacctXrefPK usrEbpacctXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrEbpacctXrefPK = usrEbpacctXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrEbpacctXref(String usrId, String acctNbr) {
        this.usrEbpacctXrefPK = new UsrEbpacctXrefPK(usrId, acctNbr);
    }

    public UsrEbpacctXrefPK getUsrEbpacctXrefPK() {
        return usrEbpacctXrefPK;
    }

    public void setUsrEbpacctXrefPK(UsrEbpacctXrefPK usrEbpacctXrefPK) {
        this.usrEbpacctXrefPK = usrEbpacctXrefPK;
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
        hash += (usrEbpacctXrefPK != null ? usrEbpacctXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrEbpacctXref)) {
            return false;
        }
        UsrEbpacctXref other = (UsrEbpacctXref) object;
        if ((this.usrEbpacctXrefPK == null && other.usrEbpacctXrefPK != null) || (this.usrEbpacctXrefPK != null && !this.usrEbpacctXrefPK.equals(other.usrEbpacctXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrEbpacctXref[ usrEbpacctXrefPK=" + usrEbpacctXrefPK + " ]";
    }
    
}
