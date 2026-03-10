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
@Table(name = "HIER_NODE_CRD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "HierNodeCrd.findAll", query = "SELECT h FROM HierNodeCrd h")})
public class HierNodeCrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierNodeCrdPK hierNodeCrdPK;
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

    public HierNodeCrd() {
    }

    public HierNodeCrd(HierNodeCrdPK hierNodeCrdPK) {
        this.hierNodeCrdPK = hierNodeCrdPK;
    }

    public HierNodeCrd(HierNodeCrdPK hierNodeCrdPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.hierNodeCrdPK = hierNodeCrdPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public HierNodeCrd(String hierId, String nodeId, String crdNbr) {
        this.hierNodeCrdPK = new HierNodeCrdPK(hierId, nodeId, crdNbr);
    }

    public HierNodeCrdPK getHierNodeCrdPK() {
        return hierNodeCrdPK;
    }

    public void setHierNodeCrdPK(HierNodeCrdPK hierNodeCrdPK) {
        this.hierNodeCrdPK = hierNodeCrdPK;
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
        hash += (hierNodeCrdPK != null ? hierNodeCrdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HierNodeCrd)) {
            return false;
        }
        HierNodeCrd other = (HierNodeCrd) object;
        if ((this.hierNodeCrdPK == null && other.hierNodeCrdPK != null) || (this.hierNodeCrdPK != null && !this.hierNodeCrdPK.equals(other.hierNodeCrdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierNodeCrd[ hierNodeCrdPK=" + hierNodeCrdPK + " ]";
    }
    
}
