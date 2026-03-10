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
@Table(name = "FC_MRCH_LOC", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "FcMrchLoc.findAll", query = "SELECT f FROM FcMrchLoc f"),
    @NamedQuery(name = "FcMrchLoc.findByMrchId", query = "SELECT f FROM FcMrchLoc f WHERE f.mrchId = :mrchId"),
    @NamedQuery(name = "FcMrchLoc.findByAcqId", query = "SELECT f FROM FcMrchLoc f WHERE f.acqId = :acqId"),
    @NamedQuery(name = "FcMrchLoc.findByFcSiteId", query = "SELECT f FROM FcMrchLoc f WHERE f.fcSiteId = :fcSiteId"),
    @NamedQuery(name = "FcMrchLoc.findByCrtTs", query = "SELECT f FROM FcMrchLoc f WHERE f.crtTs = :crtTs"),
    @NamedQuery(name = "FcMrchLoc.findByCrtUsr", query = "SELECT f FROM FcMrchLoc f WHERE f.crtUsr = :crtUsr"),
    @NamedQuery(name = "FcMrchLoc.findByMdyTs", query = "SELECT f FROM FcMrchLoc f WHERE f.mdyTs = :mdyTs"),
    @NamedQuery(name = "FcMrchLoc.findByMdyUsr", query = "SELECT f FROM FcMrchLoc f WHERE f.mdyUsr = :mdyUsr")})
public class FcMrchLoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MRCH_ID")
    private String mrchId;
    @Basic(optional = false)
    @Column(name = "ACQ_ID")
    private long acqId;
    @Basic(optional = false)
    @Column(name = "FC_SITE_ID")
    private String fcSiteId;
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

    public FcMrchLoc() {
    }

    public FcMrchLoc(String mrchId) {
        this.mrchId = mrchId;
    }

    public FcMrchLoc(String mrchId, long acqId, String fcSiteId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mrchId = mrchId;
        this.acqId = acqId;
        this.fcSiteId = fcSiteId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getMrchId() {
        return mrchId;
    }

    public void setMrchId(String mrchId) {
        this.mrchId = mrchId;
    }

    public long getAcqId() {
        return acqId;
    }

    public void setAcqId(long acqId) {
        this.acqId = acqId;
    }

    public String getFcSiteId() {
        return fcSiteId;
    }

    public void setFcSiteId(String fcSiteId) {
        this.fcSiteId = fcSiteId;
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
        hash += (mrchId != null ? mrchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FcMrchLoc)) {
            return false;
        }
        FcMrchLoc other = (FcMrchLoc) object;
        if ((this.mrchId == null && other.mrchId != null) || (this.mrchId != null && !this.mrchId.equals(other.mrchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.FcMrchLoc[ mrchId=" + mrchId + " ]";
    }
    
}
