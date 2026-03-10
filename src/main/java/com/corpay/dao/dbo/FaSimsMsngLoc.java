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
@Table(name = "FA_SIMS_MSNG_LOC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FaSimsMsngLoc.findAll", query = "SELECT f FROM FaSimsMsngLoc f")})
public class FaSimsMsngLoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FaSimsMsngLocPK faSimsMsngLocPK;
    @Basic(optional = false)
    @Column(name = "CLEARING_REC")
    private String clearingRec;
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
    @Basic(optional = false)
    @Column(name = "AUTH_ACQ_INST_ID")
    private String authAcqInstId;
    @Basic(optional = false)
    @Column(name = "AUTH_ACCEPT_ID")
    private String authAcceptId;

    public FaSimsMsngLoc() {
    }

    public FaSimsMsngLoc(FaSimsMsngLocPK faSimsMsngLocPK) {
        this.faSimsMsngLocPK = faSimsMsngLocPK;
    }

    public FaSimsMsngLoc(FaSimsMsngLocPK faSimsMsngLocPK, String clearingRec, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String authAcqInstId, String authAcceptId) {
        this.faSimsMsngLocPK = faSimsMsngLocPK;
        this.clearingRec = clearingRec;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.authAcqInstId = authAcqInstId;
        this.authAcceptId = authAcceptId;
    }

    public FaSimsMsngLoc(long transId, long transDt) {
        this.faSimsMsngLocPK = new FaSimsMsngLocPK(transId, transDt);
    }

    public FaSimsMsngLocPK getFaSimsMsngLocPK() {
        return faSimsMsngLocPK;
    }

    public void setFaSimsMsngLocPK(FaSimsMsngLocPK faSimsMsngLocPK) {
        this.faSimsMsngLocPK = faSimsMsngLocPK;
    }

    public String getClearingRec() {
        return clearingRec;
    }

    public void setClearingRec(String clearingRec) {
        this.clearingRec = clearingRec;
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

    public String getAuthAcqInstId() {
        return authAcqInstId;
    }

    public void setAuthAcqInstId(String authAcqInstId) {
        this.authAcqInstId = authAcqInstId;
    }

    public String getAuthAcceptId() {
        return authAcceptId;
    }

    public void setAuthAcceptId(String authAcceptId) {
        this.authAcceptId = authAcceptId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (faSimsMsngLocPK != null ? faSimsMsngLocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaSimsMsngLoc)) {
            return false;
        }
        FaSimsMsngLoc other = (FaSimsMsngLoc) object;
        if ((this.faSimsMsngLocPK == null && other.faSimsMsngLocPK != null) || (this.faSimsMsngLocPK != null && !this.faSimsMsngLocPK.equals(other.faSimsMsngLocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaSimsMsngLoc[ faSimsMsngLocPK=" + faSimsMsngLocPK + " ]";
    }
    
}
