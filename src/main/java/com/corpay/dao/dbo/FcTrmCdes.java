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
@Table(name = "FC_TRM_CDES", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FcTrmCdes.findAll", query = "SELECT f FROM FcTrmCdes f")})
public class FcTrmCdes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FC_TRM_CD")
    private String fcTrmCd;
    @Basic(optional = false)
    @Column(name = "FC_TRM_DAYS")
    private String fcTrmDays;
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

    public FcTrmCdes() {
    }

    public FcTrmCdes(String fcTrmCd) {
        this.fcTrmCd = fcTrmCd;
    }

    public FcTrmCdes(String fcTrmCd, String fcTrmDays, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fcTrmCd = fcTrmCd;
        this.fcTrmDays = fcTrmDays;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getFcTrmCd() {
        return fcTrmCd;
    }

    public void setFcTrmCd(String fcTrmCd) {
        this.fcTrmCd = fcTrmCd;
    }

    public String getFcTrmDays() {
        return fcTrmDays;
    }

    public void setFcTrmDays(String fcTrmDays) {
        this.fcTrmDays = fcTrmDays;
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
        hash += (fcTrmCd != null ? fcTrmCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FcTrmCdes)) {
            return false;
        }
        FcTrmCdes other = (FcTrmCdes) object;
        if ((this.fcTrmCd == null && other.fcTrmCd != null) || (this.fcTrmCd != null && !this.fcTrmCd.equals(other.fcTrmCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FcTrmCdes[ fcTrmCd=" + fcTrmCd + " ]";
    }
    
}
