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
@Table(name = "CM_USR_CRD_XREF", catalog = "", schema = "DBO")
public class CmUsrCrdXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CmUsrCrdXrefPK cmUsrCrdXrefPK;
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

    public CmUsrCrdXref() {
    }

    public CmUsrCrdXref(CmUsrCrdXrefPK cmUsrCrdXrefPK) {
        this.cmUsrCrdXrefPK = cmUsrCrdXrefPK;
    }

    public CmUsrCrdXref(CmUsrCrdXrefPK cmUsrCrdXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.cmUsrCrdXrefPK = cmUsrCrdXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CmUsrCrdXref(String usrId, String crdNbr) {
        this.cmUsrCrdXrefPK = new CmUsrCrdXrefPK(usrId, crdNbr);
    }

    public CmUsrCrdXrefPK getCmUsrCrdXrefPK() {
        return cmUsrCrdXrefPK;
    }

    public void setCmUsrCrdXrefPK(CmUsrCrdXrefPK cmUsrCrdXrefPK) {
        this.cmUsrCrdXrefPK = cmUsrCrdXrefPK;
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
        hash += (cmUsrCrdXrefPK != null ? cmUsrCrdXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CmUsrCrdXref)) {
            return false;
        }
        CmUsrCrdXref other = (CmUsrCrdXref) object;
        if ((this.cmUsrCrdXrefPK == null && other.cmUsrCrdXrefPK != null) || (this.cmUsrCrdXrefPK != null && !this.cmUsrCrdXrefPK.equals(other.cmUsrCrdXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CmUsrCrdXref[ cmUsrCrdXrefPK=" + cmUsrCrdXrefPK + " ]";
    }

}
