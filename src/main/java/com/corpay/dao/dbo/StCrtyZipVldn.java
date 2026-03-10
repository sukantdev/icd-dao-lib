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
@Table(name = "ST_CRTY_ZIP_VLDN", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "StCrtyZipVldn.findAll", query = "SELECT s FROM StCrtyZipVldn s")})
public class StCrtyZipVldn implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StCrtyZipVldnPK stCrtyZipVldnPK;
    @Basic(optional = false)
    @Column(name = "ST_NM")
    private String stNm;
    @Basic(optional = false)
    @Column(name = "CRTY_CD")
    private int crtyCd;
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

    public StCrtyZipVldn() {
    }

    public StCrtyZipVldn(StCrtyZipVldnPK stCrtyZipVldnPK) {
        this.stCrtyZipVldnPK = stCrtyZipVldnPK;
    }

    public StCrtyZipVldn(StCrtyZipVldnPK stCrtyZipVldnPK, String stNm, int crtyCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.stCrtyZipVldnPK = stCrtyZipVldnPK;
        this.stNm = stNm;
        this.crtyCd = crtyCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public StCrtyZipVldn(String stCd, String zipPrefix) {
        this.stCrtyZipVldnPK = new StCrtyZipVldnPK(stCd, zipPrefix);
    }

    public StCrtyZipVldnPK getStCrtyZipVldnPK() {
        return stCrtyZipVldnPK;
    }

    public void setStCrtyZipVldnPK(StCrtyZipVldnPK stCrtyZipVldnPK) {
        this.stCrtyZipVldnPK = stCrtyZipVldnPK;
    }

    public String getStNm() {
        return stNm;
    }

    public void setStNm(String stNm) {
        this.stNm = stNm;
    }

    public int getCrtyCd() {
        return crtyCd;
    }

    public void setCrtyCd(int crtyCd) {
        this.crtyCd = crtyCd;
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
        hash += (stCrtyZipVldnPK != null ? stCrtyZipVldnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StCrtyZipVldn)) {
            return false;
        }
        StCrtyZipVldn other = (StCrtyZipVldn) object;
        if ((this.stCrtyZipVldnPK == null && other.stCrtyZipVldnPK != null) || (this.stCrtyZipVldnPK != null && !this.stCrtyZipVldnPK.equals(other.stCrtyZipVldnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.StCrtyZipVldn[ stCrtyZipVldnPK=" + stCrtyZipVldnPK + " ]";
    }
    
}
