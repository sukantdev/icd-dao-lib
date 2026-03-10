/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "FL_TYPS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FlTyps.findAll", query = "SELECT f FROM FlTyps f")})
public class FlTyps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FL_TYP_CD")
    private String flTypCd;
    @Basic(optional = false)
    @Column(name = "FL_DESC")
    private String flDesc;
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

    public FlTyps() {
    }

    public FlTyps(String flTypCd) {
        this.flTypCd = flTypCd;
    }

    public FlTyps(String flTypCd, String flDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.flTypCd = flTypCd;
        this.flDesc = flDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getFlTypCd() {
        return flTypCd;
    }

    public void setFlTypCd(String flTypCd) {
        this.flTypCd = flTypCd;
    }

    public String getFlDesc() {
        return flDesc;
    }

    public void setFlDesc(String flDesc) {
        this.flDesc = flDesc;
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
        hash += (flTypCd != null ? flTypCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlTyps)) {
            return false;
        }
        FlTyps other = (FlTyps) object;
        if ((this.flTypCd == null && other.flTypCd != null) || (this.flTypCd != null && !this.flTypCd.equals(other.flTypCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FlTyps[ flTypCd=" + flTypCd + " ]";
    }
    
}
