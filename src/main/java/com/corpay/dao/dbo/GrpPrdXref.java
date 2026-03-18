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
@Table(name = "GRP_PRD_XREF", catalog = "", schema = "DBO")
public class GrpPrdXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GrpPrdXrefPK grpPrdXrefPK;
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

    public GrpPrdXref() {
    }

    public GrpPrdXref(GrpPrdXrefPK grpPrdXrefPK) {
        this.grpPrdXrefPK = grpPrdXrefPK;
    }

    public GrpPrdXref(GrpPrdXrefPK grpPrdXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.grpPrdXrefPK = grpPrdXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GrpPrdXref(short grp, String prd) {
        this.grpPrdXrefPK = new GrpPrdXrefPK(grp, prd);
    }

    public GrpPrdXrefPK getGrpPrdXrefPK() {
        return grpPrdXrefPK;
    }

    public void setGrpPrdXrefPK(GrpPrdXrefPK grpPrdXrefPK) {
        this.grpPrdXrefPK = grpPrdXrefPK;
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
        hash += (grpPrdXrefPK != null ? grpPrdXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GrpPrdXref)) {
            return false;
        }
        GrpPrdXref other = (GrpPrdXref) object;
        if ((this.grpPrdXrefPK == null && other.grpPrdXrefPK != null) || (this.grpPrdXrefPK != null && !this.grpPrdXrefPK.equals(other.grpPrdXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GrpPrdXref[ grpPrdXrefPK=" + grpPrdXrefPK + " ]";
    }

}
