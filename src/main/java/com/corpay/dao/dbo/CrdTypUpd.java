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
@Table(name = "CRD_TYP_UPD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrdTypUpd.findAll", query = "SELECT c FROM CrdTypUpd c")})
public class CrdTypUpd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdTypUpdPK crdTypUpdPK;
    @Basic(optional = false)
    @Column(name = "CRD_TYP_CD")
    private String crdTypCd;
    @Basic(optional = false)
    @Column(name = "CRD_STYLE_CD")
    private String crdStyleCd;
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

    public CrdTypUpd() {
    }

    public CrdTypUpd(CrdTypUpdPK crdTypUpdPK) {
        this.crdTypUpdPK = crdTypUpdPK;
    }

    public CrdTypUpd(CrdTypUpdPK crdTypUpdPK, String crdTypCd, String crdStyleCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdTypUpdPK = crdTypUpdPK;
        this.crdTypCd = crdTypCd;
        this.crdStyleCd = crdStyleCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdTypUpd(String crdNbr, short newExpDt) {
        this.crdTypUpdPK = new CrdTypUpdPK(crdNbr, newExpDt);
    }

    public CrdTypUpdPK getCrdTypUpdPK() {
        return crdTypUpdPK;
    }

    public void setCrdTypUpdPK(CrdTypUpdPK crdTypUpdPK) {
        this.crdTypUpdPK = crdTypUpdPK;
    }

    public String getCrdTypCd() {
        return crdTypCd;
    }

    public void setCrdTypCd(String crdTypCd) {
        this.crdTypCd = crdTypCd;
    }

    public String getCrdStyleCd() {
        return crdStyleCd;
    }

    public void setCrdStyleCd(String crdStyleCd) {
        this.crdStyleCd = crdStyleCd;
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
        hash += (crdTypUpdPK != null ? crdTypUpdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdTypUpd)) {
            return false;
        }
        CrdTypUpd other = (CrdTypUpd) object;
        if ((this.crdTypUpdPK == null && other.crdTypUpdPK != null) || (this.crdTypUpdPK != null && !this.crdTypUpdPK.equals(other.crdTypUpdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdTypUpd[ crdTypUpdPK=" + crdTypUpdPK + " ]";
    }
    
}
