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
@Table(name = "HIER_UNIT_GRP_NODE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "HierUnitGrpNode.findAll", query = "SELECT h FROM HierUnitGrpNode h")})
public class HierUnitGrpNode implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierUnitGrpNodePK hierUnitGrpNodePK;
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

    public HierUnitGrpNode() {
    }

    public HierUnitGrpNode(HierUnitGrpNodePK hierUnitGrpNodePK) {
        this.hierUnitGrpNodePK = hierUnitGrpNodePK;
    }

    public HierUnitGrpNode(HierUnitGrpNodePK hierUnitGrpNodePK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.hierUnitGrpNodePK = hierUnitGrpNodePK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public HierUnitGrpNode(String hierId, String unitGrpId, String nodeId) {
        this.hierUnitGrpNodePK = new HierUnitGrpNodePK(hierId, unitGrpId, nodeId);
    }

    public HierUnitGrpNodePK getHierUnitGrpNodePK() {
        return hierUnitGrpNodePK;
    }

    public void setHierUnitGrpNodePK(HierUnitGrpNodePK hierUnitGrpNodePK) {
        this.hierUnitGrpNodePK = hierUnitGrpNodePK;
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
        hash += (hierUnitGrpNodePK != null ? hierUnitGrpNodePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HierUnitGrpNode)) {
            return false;
        }
        HierUnitGrpNode other = (HierUnitGrpNode) object;
        if ((this.hierUnitGrpNodePK == null && other.hierUnitGrpNodePK != null) || (this.hierUnitGrpNodePK != null && !this.hierUnitGrpNodePK.equals(other.hierUnitGrpNodePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierUnitGrpNode[ hierUnitGrpNodePK=" + hierUnitGrpNodePK + " ]";
    }
    
}
