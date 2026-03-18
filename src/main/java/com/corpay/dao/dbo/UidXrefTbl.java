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
@Table(name = "UID_XREF_TBL", catalog = "", schema = "DBO")
public class UidXrefTbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UidXrefTblPK uidXrefTblPK;
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

    public UidXrefTbl() {
    }

    public UidXrefTbl(UidXrefTblPK uidXrefTblPK) {
        this.uidXrefTblPK = uidXrefTblPK;
    }

    public UidXrefTbl(UidXrefTblPK uidXrefTblPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.uidXrefTblPK = uidXrefTblPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UidXrefTbl(String uid, String acct, String cust, String sys, int rpt) {
        this.uidXrefTblPK = new UidXrefTblPK(uid, acct, cust, sys, rpt);
    }

    public UidXrefTblPK getUidXrefTblPK() {
        return uidXrefTblPK;
    }

    public void setUidXrefTblPK(UidXrefTblPK uidXrefTblPK) {
        this.uidXrefTblPK = uidXrefTblPK;
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
        hash += (uidXrefTblPK != null ? uidXrefTblPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UidXrefTbl)) {
            return false;
        }
        UidXrefTbl other = (UidXrefTbl) object;
        if ((this.uidXrefTblPK == null && other.uidXrefTblPK != null) || (this.uidXrefTblPK != null && !this.uidXrefTblPK.equals(other.uidXrefTblPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UidXrefTbl[ uidXrefTblPK=" + uidXrefTblPK + " ]";
    }

}
