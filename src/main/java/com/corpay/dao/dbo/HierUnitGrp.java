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
@Table(name = "HIER_UNIT_GRP", catalog = "", schema = "DBO")
public class HierUnitGrp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierUnitGrpPK hierUnitGrpPK;
    @Basic(optional = false)
    @Column(name = "UNIT_GRP_NM")
    private String unitGrpNm;
    @Basic(optional = false)
    @Column(name = "DFLT_PRF_NR")
    private int dfltPrfNr;
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

    public HierUnitGrp() {
    }

    public HierUnitGrp(HierUnitGrpPK hierUnitGrpPK) {
        this.hierUnitGrpPK = hierUnitGrpPK;
    }

    public HierUnitGrp(HierUnitGrpPK hierUnitGrpPK, String unitGrpNm, int dfltPrfNr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.hierUnitGrpPK = hierUnitGrpPK;
        this.unitGrpNm = unitGrpNm;
        this.dfltPrfNr = dfltPrfNr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public HierUnitGrp(String hierId, String unitGrpId) {
        this.hierUnitGrpPK = new HierUnitGrpPK(hierId, unitGrpId);
    }

    public HierUnitGrpPK getHierUnitGrpPK() {
        return hierUnitGrpPK;
    }

    public void setHierUnitGrpPK(HierUnitGrpPK hierUnitGrpPK) {
        this.hierUnitGrpPK = hierUnitGrpPK;
    }

    public String getUnitGrpNm() {
        return unitGrpNm;
    }

    public void setUnitGrpNm(String unitGrpNm) {
        this.unitGrpNm = unitGrpNm;
    }

    public int getDfltPrfNr() {
        return dfltPrfNr;
    }

    public void setDfltPrfNr(int dfltPrfNr) {
        this.dfltPrfNr = dfltPrfNr;
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
        hash += (hierUnitGrpPK != null ? hierUnitGrpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierUnitGrp)) {
            return false;
        }
        HierUnitGrp other = (HierUnitGrp) object;
        if ((this.hierUnitGrpPK == null && other.hierUnitGrpPK != null) || (this.hierUnitGrpPK != null && !this.hierUnitGrpPK.equals(other.hierUnitGrpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierUnitGrp[ hierUnitGrpPK=" + hierUnitGrpPK + " ]";
    }

}
