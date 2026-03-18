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
@Table(name = "HIER_DRV_GRP", catalog = "", schema = "DBO")
public class HierDrvGrp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierDrvGrpPK hierDrvGrpPK;
    @Basic(optional = false)
    @Column(name = "DRV_GRP_NM")
    private String drvGrpNm;
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

    public HierDrvGrp() {
    }

    public HierDrvGrp(HierDrvGrpPK hierDrvGrpPK) {
        this.hierDrvGrpPK = hierDrvGrpPK;
    }

    public HierDrvGrp(HierDrvGrpPK hierDrvGrpPK, String drvGrpNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.hierDrvGrpPK = hierDrvGrpPK;
        this.drvGrpNm = drvGrpNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public HierDrvGrp(String hierId, String drvGrpId) {
        this.hierDrvGrpPK = new HierDrvGrpPK(hierId, drvGrpId);
    }

    public HierDrvGrpPK getHierDrvGrpPK() {
        return hierDrvGrpPK;
    }

    public void setHierDrvGrpPK(HierDrvGrpPK hierDrvGrpPK) {
        this.hierDrvGrpPK = hierDrvGrpPK;
    }

    public String getDrvGrpNm() {
        return drvGrpNm;
    }

    public void setDrvGrpNm(String drvGrpNm) {
        this.drvGrpNm = drvGrpNm;
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
        hash += (hierDrvGrpPK != null ? hierDrvGrpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierDrvGrp)) {
            return false;
        }
        HierDrvGrp other = (HierDrvGrp) object;
        if ((this.hierDrvGrpPK == null && other.hierDrvGrpPK != null) || (this.hierDrvGrpPK != null && !this.hierDrvGrpPK.equals(other.hierDrvGrpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierDrvGrp[ hierDrvGrpPK=" + hierDrvGrpPK + " ]";
    }

}
