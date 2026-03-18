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
@Table(name = "HIER_PRF_NODE", catalog = "", schema = "DBO")
public class HierPrfNode implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierPrfNodePK hierPrfNodePK;
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

    public HierPrfNode() {
    }

    public HierPrfNode(HierPrfNodePK hierPrfNodePK) {
        this.hierPrfNodePK = hierPrfNodePK;
    }

    public HierPrfNode(HierPrfNodePK hierPrfNodePK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.hierPrfNodePK = hierPrfNodePK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public HierPrfNode(String hierId, int prfNbr, String nodeId) {
        this.hierPrfNodePK = new HierPrfNodePK(hierId, prfNbr, nodeId);
    }

    public HierPrfNodePK getHierPrfNodePK() {
        return hierPrfNodePK;
    }

    public void setHierPrfNodePK(HierPrfNodePK hierPrfNodePK) {
        this.hierPrfNodePK = hierPrfNodePK;
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
        hash += (hierPrfNodePK != null ? hierPrfNodePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierPrfNode)) {
            return false;
        }
        HierPrfNode other = (HierPrfNode) object;
        if ((this.hierPrfNodePK == null && other.hierPrfNodePK != null) || (this.hierPrfNodePK != null && !this.hierPrfNodePK.equals(other.hierPrfNodePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierPrfNode[ hierPrfNodePK=" + hierPrfNodePK + " ]";
    }

}
