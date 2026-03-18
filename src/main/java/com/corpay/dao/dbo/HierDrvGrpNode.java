package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "HIER_DRV_GRP_NODE", catalog = "", schema = "DBO")
public class HierDrvGrpNode implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierDrvGrpNodePK hierDrvGrpNodePK;
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

    public HierDrvGrpNode() {
    }

    public HierDrvGrpNode(HierDrvGrpNodePK hierDrvGrpNodePK) {
        this.hierDrvGrpNodePK = hierDrvGrpNodePK;
    }

    public HierDrvGrpNode(HierDrvGrpNodePK hierDrvGrpNodePK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.hierDrvGrpNodePK = hierDrvGrpNodePK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public HierDrvGrpNode(String hierId, String drvGrpId, String nodeId) {
        this.hierDrvGrpNodePK = new HierDrvGrpNodePK(hierId, drvGrpId, nodeId);
    }

    public HierDrvGrpNodePK getHierDrvGrpNodePK() {
        return hierDrvGrpNodePK;
    }

    public void setHierDrvGrpNodePK(HierDrvGrpNodePK hierDrvGrpNodePK) {
        this.hierDrvGrpNodePK = hierDrvGrpNodePK;
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
        hash += (hierDrvGrpNodePK != null ? hierDrvGrpNodePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierDrvGrpNode)) {
            return false;
        }
        HierDrvGrpNode other = (HierDrvGrpNode) object;
        if ((this.hierDrvGrpNodePK == null && other.hierDrvGrpNodePK != null) || (this.hierDrvGrpNodePK != null && !this.hierDrvGrpNodePK.equals(other.hierDrvGrpNodePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierDrvGrpNode[ hierDrvGrpNodePK=" + hierDrvGrpNodePK + " ]";
    }

}
