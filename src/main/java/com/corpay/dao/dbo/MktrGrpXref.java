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
@Table(name = "MKTR_GRP_XREF", catalog = "", schema = "DBO")
public class MktrGrpXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MktrGrpXrefPK mktrGrpXrefPK;
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

    public MktrGrpXref() {
    }

    public MktrGrpXref(MktrGrpXrefPK mktrGrpXrefPK) {
        this.mktrGrpXrefPK = mktrGrpXrefPK;
    }

    public MktrGrpXref(MktrGrpXrefPK mktrGrpXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mktrGrpXrefPK = mktrGrpXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MktrGrpXref(short grp, String mktrId) {
        this.mktrGrpXrefPK = new MktrGrpXrefPK(grp, mktrId);
    }

    public MktrGrpXrefPK getMktrGrpXrefPK() {
        return mktrGrpXrefPK;
    }

    public void setMktrGrpXrefPK(MktrGrpXrefPK mktrGrpXrefPK) {
        this.mktrGrpXrefPK = mktrGrpXrefPK;
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
        hash += (mktrGrpXrefPK != null ? mktrGrpXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MktrGrpXref)) {
            return false;
        }
        MktrGrpXref other = (MktrGrpXref) object;
        if ((this.mktrGrpXrefPK == null && other.mktrGrpXrefPK != null) || (this.mktrGrpXrefPK != null && !this.mktrGrpXrefPK.equals(other.mktrGrpXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MktrGrpXref[ mktrGrpXrefPK=" + mktrGrpXrefPK + " ]";
    }

}
