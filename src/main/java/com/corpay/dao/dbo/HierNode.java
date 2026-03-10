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
@Table(name = "HIER_NODE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "HierNode.findAll", query = "SELECT h FROM HierNode h")})
public class HierNode implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierNodePK hierNodePK;
    @Basic(optional = false)
    @Column(name = "LVL_NBR")
    private short lvlNbr;
    @Basic(optional = false)
    @Column(name = "NODE_DESC")
    private String nodeDesc;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private Character statCd;
    @Basic(optional = false)
    @Column(name = "SRT_ID")
    private String srtId;
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

    public HierNode() {
    }

    public HierNode(HierNodePK hierNodePK) {
        this.hierNodePK = hierNodePK;
    }

    public HierNode(HierNodePK hierNodePK, short lvlNbr, String nodeDesc, Character statCd, String srtId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.hierNodePK = hierNodePK;
        this.lvlNbr = lvlNbr;
        this.nodeDesc = nodeDesc;
        this.statCd = statCd;
        this.srtId = srtId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public HierNode(String hierId, String nodeId) {
        this.hierNodePK = new HierNodePK(hierId, nodeId);
    }

    public HierNodePK getHierNodePK() {
        return hierNodePK;
    }

    public void setHierNodePK(HierNodePK hierNodePK) {
        this.hierNodePK = hierNodePK;
    }

    public short getLvlNbr() {
        return lvlNbr;
    }

    public void setLvlNbr(short lvlNbr) {
        this.lvlNbr = lvlNbr;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }

    public Character getStatCd() {
        return statCd;
    }

    public void setStatCd(Character statCd) {
        this.statCd = statCd;
    }

    public String getSrtId() {
        return srtId;
    }

    public void setSrtId(String srtId) {
        this.srtId = srtId;
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
        hash += (hierNodePK != null ? hierNodePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HierNode)) {
            return false;
        }
        HierNode other = (HierNode) object;
        if ((this.hierNodePK == null && other.hierNodePK != null) || (this.hierNodePK != null && !this.hierNodePK.equals(other.hierNodePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierNode[ hierNodePK=" + hierNodePK + " ]";
    }
    
}
