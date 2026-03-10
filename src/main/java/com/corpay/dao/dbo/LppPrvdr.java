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
@Table(name = "LPP_PRVDR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "LppPrvdr.findAll", query = "SELECT l FROM LppPrvdr l")})
public class LppPrvdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LPP_ABBRV_NM")
    private String lppAbbrvNm;
    @Basic(optional = false)
    @Column(name = "LPP_PRVDR_NM")
    private String lppPrvdrNm;
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

    public LppPrvdr() {
    }

    public LppPrvdr(String lppAbbrvNm) {
        this.lppAbbrvNm = lppAbbrvNm;
    }

    public LppPrvdr(String lppAbbrvNm, String lppPrvdrNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.lppAbbrvNm = lppAbbrvNm;
        this.lppPrvdrNm = lppPrvdrNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getLppAbbrvNm() {
        return lppAbbrvNm;
    }

    public void setLppAbbrvNm(String lppAbbrvNm) {
        this.lppAbbrvNm = lppAbbrvNm;
    }

    public String getLppPrvdrNm() {
        return lppPrvdrNm;
    }

    public void setLppPrvdrNm(String lppPrvdrNm) {
        this.lppPrvdrNm = lppPrvdrNm;
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
        hash += (lppAbbrvNm != null ? lppAbbrvNm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LppPrvdr)) {
            return false;
        }
        LppPrvdr other = (LppPrvdr) object;
        if ((this.lppAbbrvNm == null && other.lppAbbrvNm != null) || (this.lppAbbrvNm != null && !this.lppAbbrvNm.equals(other.lppAbbrvNm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.LppPrvdr[ lppAbbrvNm=" + lppAbbrvNm + " ]";
    }
    
}
