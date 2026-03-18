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
@Table(name = "CRD_TYP_FRMT", catalog = "", schema = "DBO")
public class CrdTypFrmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdTypFrmtPK crdTypFrmtPK;
    @Basic(optional = false)
    @Column(name = "CRD_FLGS")
    private String crdFlgs;
    @Basic(optional = false)
    @Column(name = "CRD_CMNT")
    private String crdCmnt;
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

    public CrdTypFrmt() {
    }

    public CrdTypFrmt(CrdTypFrmtPK crdTypFrmtPK) {
        this.crdTypFrmtPK = crdTypFrmtPK;
    }

    public CrdTypFrmt(CrdTypFrmtPK crdTypFrmtPK, String crdFlgs, String crdCmnt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdTypFrmtPK = crdTypFrmtPK;
        this.crdFlgs = crdFlgs;
        this.crdCmnt = crdCmnt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdTypFrmt(String crdTyp, String crdFrmt) {
        this.crdTypFrmtPK = new CrdTypFrmtPK(crdTyp, crdFrmt);
    }

    public CrdTypFrmtPK getCrdTypFrmtPK() {
        return crdTypFrmtPK;
    }

    public void setCrdTypFrmtPK(CrdTypFrmtPK crdTypFrmtPK) {
        this.crdTypFrmtPK = crdTypFrmtPK;
    }

    public String getCrdFlgs() {
        return crdFlgs;
    }

    public void setCrdFlgs(String crdFlgs) {
        this.crdFlgs = crdFlgs;
    }

    public String getCrdCmnt() {
        return crdCmnt;
    }

    public void setCrdCmnt(String crdCmnt) {
        this.crdCmnt = crdCmnt;
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
        hash += (crdTypFrmtPK != null ? crdTypFrmtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdTypFrmt)) {
            return false;
        }
        CrdTypFrmt other = (CrdTypFrmt) object;
        if ((this.crdTypFrmtPK == null && other.crdTypFrmtPK != null) || (this.crdTypFrmtPK != null && !this.crdTypFrmtPK.equals(other.crdTypFrmtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdTypFrmt[ crdTypFrmtPK=" + crdTypFrmtPK + " ]";
    }

}
