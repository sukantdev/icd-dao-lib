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
@Table(name = "HIER_DRV_GRP_DRV", catalog = "", schema = "DBO")
public class HierDrvGrpDrv implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierDrvGrpDrvPK hierDrvGrpDrvPK;
    @Basic(optional = false)
    @Column(name = "DRV_LST_NM")
    private String drvLstNm;
    @Basic(optional = false)
    @Column(name = "DRV_FST_NM")
    private String drvFstNm;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_NBR")
    private String drvLicNbr;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_ST")
    private String drvLicSt;
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

    public HierDrvGrpDrv() {
    }

    public HierDrvGrpDrv(HierDrvGrpDrvPK hierDrvGrpDrvPK) {
        this.hierDrvGrpDrvPK = hierDrvGrpDrvPK;
    }

    public HierDrvGrpDrv(HierDrvGrpDrvPK hierDrvGrpDrvPK, String drvLstNm, String drvFstNm, String drvLicNbr, String drvLicSt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.hierDrvGrpDrvPK = hierDrvGrpDrvPK;
        this.drvLstNm = drvLstNm;
        this.drvFstNm = drvFstNm;
        this.drvLicNbr = drvLicNbr;
        this.drvLicSt = drvLicSt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public HierDrvGrpDrv(String hierId, String drvGrpId, String drvId) {
        this.hierDrvGrpDrvPK = new HierDrvGrpDrvPK(hierId, drvGrpId, drvId);
    }

    public HierDrvGrpDrvPK getHierDrvGrpDrvPK() {
        return hierDrvGrpDrvPK;
    }

    public void setHierDrvGrpDrvPK(HierDrvGrpDrvPK hierDrvGrpDrvPK) {
        this.hierDrvGrpDrvPK = hierDrvGrpDrvPK;
    }

    public String getDrvLstNm() {
        return drvLstNm;
    }

    public void setDrvLstNm(String drvLstNm) {
        this.drvLstNm = drvLstNm;
    }

    public String getDrvFstNm() {
        return drvFstNm;
    }

    public void setDrvFstNm(String drvFstNm) {
        this.drvFstNm = drvFstNm;
    }

    public String getDrvLicNbr() {
        return drvLicNbr;
    }

    public void setDrvLicNbr(String drvLicNbr) {
        this.drvLicNbr = drvLicNbr;
    }

    public String getDrvLicSt() {
        return drvLicSt;
    }

    public void setDrvLicSt(String drvLicSt) {
        this.drvLicSt = drvLicSt;
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
        hash += (hierDrvGrpDrvPK != null ? hierDrvGrpDrvPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierDrvGrpDrv)) {
            return false;
        }
        HierDrvGrpDrv other = (HierDrvGrpDrv) object;
        if ((this.hierDrvGrpDrvPK == null && other.hierDrvGrpDrvPK != null) || (this.hierDrvGrpDrvPK != null && !this.hierDrvGrpDrvPK.equals(other.hierDrvGrpDrvPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierDrvGrpDrv[ hierDrvGrpDrvPK=" + hierDrvGrpDrvPK + " ]";
    }

}
