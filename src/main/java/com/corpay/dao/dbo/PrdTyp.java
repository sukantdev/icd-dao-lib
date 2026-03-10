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
@Table(name = "PRD_TYP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdTyp.findAll", query = "SELECT p FROM PrdTyp p")})
public class PrdTyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRD_TYP_CD")
    private String prdTypCd;
    @Basic(optional = false)
    @Column(name = "DESC")
    private String desc;
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
    @Column(name = "PRD_ABRV")
    private String prdAbrv;

    public PrdTyp() {
    }

    public PrdTyp(String prdTypCd) {
        this.prdTypCd = prdTypCd;
    }

    public PrdTyp(String prdTypCd, String desc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String prdAbrv) {
        this.prdTypCd = prdTypCd;
        this.desc = desc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.prdAbrv = prdAbrv;
    }

    public String getPrdTypCd() {
        return prdTypCd;
    }

    public void setPrdTypCd(String prdTypCd) {
        this.prdTypCd = prdTypCd;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public String getPrdAbrv() {
        return prdAbrv;
    }

    public void setPrdAbrv(String prdAbrv) {
        this.prdAbrv = prdAbrv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdTypCd != null ? prdTypCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdTyp)) {
            return false;
        }
        PrdTyp other = (PrdTyp) object;
        if ((this.prdTypCd == null && other.prdTypCd != null) || (this.prdTypCd != null && !this.prdTypCd.equals(other.prdTypCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTyp[ prdTypCd=" + prdTypCd + " ]";
    }
    
}
