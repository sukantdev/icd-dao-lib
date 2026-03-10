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
@Table(name = "AUTH_CODE_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "AuthCodeXref.findAll", query = "SELECT a FROM AuthCodeXref a")})
public class AuthCodeXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AuthCodeXrefPK authCodeXrefPK;
    @Basic(optional = false)
    @Column(name = "AUTH_ALM_APPROV_CD")
    private String authAlmApprovCd;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_TOKEN")
    private String crdNbrToken;
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

    public AuthCodeXref() {
    }

    public AuthCodeXref(AuthCodeXrefPK authCodeXrefPK) {
        this.authCodeXrefPK = authCodeXrefPK;
    }

    public AuthCodeXref(AuthCodeXrefPK authCodeXrefPK, String authAlmApprovCd, String crdNbrToken, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.authCodeXrefPK = authCodeXrefPK;
        this.authAlmApprovCd = authAlmApprovCd;
        this.crdNbrToken = crdNbrToken;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AuthCodeXref(int authApprovCd, Date authDt) {
        this.authCodeXrefPK = new AuthCodeXrefPK(authApprovCd, authDt);
    }

    public AuthCodeXrefPK getAuthCodeXrefPK() {
        return authCodeXrefPK;
    }

    public void setAuthCodeXrefPK(AuthCodeXrefPK authCodeXrefPK) {
        this.authCodeXrefPK = authCodeXrefPK;
    }

    public String getAuthAlmApprovCd() {
        return authAlmApprovCd;
    }

    public void setAuthAlmApprovCd(String authAlmApprovCd) {
        this.authAlmApprovCd = authAlmApprovCd;
    }

    public String getCrdNbrToken() {
        return crdNbrToken;
    }

    public void setCrdNbrToken(String crdNbrToken) {
        this.crdNbrToken = crdNbrToken;
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
        hash += (authCodeXrefPK != null ? authCodeXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuthCodeXref)) {
            return false;
        }
        AuthCodeXref other = (AuthCodeXref) object;
        if ((this.authCodeXrefPK == null && other.authCodeXrefPK != null) || (this.authCodeXrefPK != null && !this.authCodeXrefPK.equals(other.authCodeXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AuthCodeXref[ authCodeXrefPK=" + authCodeXrefPK + " ]";
    }
    
}
