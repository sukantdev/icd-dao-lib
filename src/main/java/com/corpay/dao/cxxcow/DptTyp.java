/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "DPT_TYP", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "DptTyp.findAll", query = "SELECT d FROM DptTyp d"),
    @NamedQuery(name = "DptTyp.findByDptTyp", query = "SELECT d FROM DptTyp d WHERE d.dptTyp = :dptTyp"),
    @NamedQuery(name = "DptTyp.findByTypDesc", query = "SELECT d FROM DptTyp d WHERE d.typDesc = :typDesc"),
    @NamedQuery(name = "DptTyp.findByCrtTs", query = "SELECT d FROM DptTyp d WHERE d.crtTs = :crtTs"),
    @NamedQuery(name = "DptTyp.findByCrtUsr", query = "SELECT d FROM DptTyp d WHERE d.crtUsr = :crtUsr"),
    @NamedQuery(name = "DptTyp.findByMdyTs", query = "SELECT d FROM DptTyp d WHERE d.mdyTs = :mdyTs"),
    @NamedQuery(name = "DptTyp.findByMdyUsr", query = "SELECT d FROM DptTyp d WHERE d.mdyUsr = :mdyUsr")})
public class DptTyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DPT_TYP")
    private String dptTyp;
    @Basic(optional = false)
    @Column(name = "TYP_DESC")
    private String typDesc;
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

    public DptTyp() {
    }

    public DptTyp(String dptTyp) {
        this.dptTyp = dptTyp;
    }

    public DptTyp(String dptTyp, String typDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.dptTyp = dptTyp;
        this.typDesc = typDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getDptTyp() {
        return dptTyp;
    }

    public void setDptTyp(String dptTyp) {
        this.dptTyp = dptTyp;
    }

    public String getTypDesc() {
        return typDesc;
    }

    public void setTypDesc(String typDesc) {
        this.typDesc = typDesc;
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
        hash += (dptTyp != null ? dptTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DptTyp)) {
            return false;
        }
        DptTyp other = (DptTyp) object;
        if ((this.dptTyp == null && other.dptTyp != null) || (this.dptTyp != null && !this.dptTyp.equals(other.dptTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.DptTyp[ dptTyp=" + dptTyp + " ]";
    }
    
}
