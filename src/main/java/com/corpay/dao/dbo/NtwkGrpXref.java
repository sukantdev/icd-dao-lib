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
@Table(name = "NTWK_GRP_XREF", catalog = "", schema = "DBO")
public class NtwkGrpXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NtwkGrpXrefPK ntwkGrpXrefPK;
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

    public NtwkGrpXref() {
    }

    public NtwkGrpXref(NtwkGrpXrefPK ntwkGrpXrefPK) {
        this.ntwkGrpXrefPK = ntwkGrpXrefPK;
    }

    public NtwkGrpXref(NtwkGrpXrefPK ntwkGrpXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.ntwkGrpXrefPK = ntwkGrpXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public NtwkGrpXref(short grp, String ntwkId) {
        this.ntwkGrpXrefPK = new NtwkGrpXrefPK(grp, ntwkId);
    }

    public NtwkGrpXrefPK getNtwkGrpXrefPK() {
        return ntwkGrpXrefPK;
    }

    public void setNtwkGrpXrefPK(NtwkGrpXrefPK ntwkGrpXrefPK) {
        this.ntwkGrpXrefPK = ntwkGrpXrefPK;
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
        hash += (ntwkGrpXrefPK != null ? ntwkGrpXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof NtwkGrpXref)) {
            return false;
        }
        NtwkGrpXref other = (NtwkGrpXref) object;
        if ((this.ntwkGrpXrefPK == null && other.ntwkGrpXrefPK != null) || (this.ntwkGrpXrefPK != null && !this.ntwkGrpXrefPK.equals(other.ntwkGrpXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NtwkGrpXref[ ntwkGrpXrefPK=" + ntwkGrpXrefPK + " ]";
    }

}
