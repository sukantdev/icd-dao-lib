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
@Table(name = "CRD_CONTACTS_XREF", catalog = "", schema = "DBO")
public class CrdContactsXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdContactsXrefPK crdContactsXrefPK;
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

    public CrdContactsXref() {
    }

    public CrdContactsXref(CrdContactsXrefPK crdContactsXrefPK) {
        this.crdContactsXrefPK = crdContactsXrefPK;
    }

    public CrdContactsXref(CrdContactsXrefPK crdContactsXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdContactsXrefPK = crdContactsXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdContactsXref(String crdContactId, String crdPrefId) {
        this.crdContactsXrefPK = new CrdContactsXrefPK(crdContactId, crdPrefId);
    }

    public CrdContactsXrefPK getCrdContactsXrefPK() {
        return crdContactsXrefPK;
    }

    public void setCrdContactsXrefPK(CrdContactsXrefPK crdContactsXrefPK) {
        this.crdContactsXrefPK = crdContactsXrefPK;
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
        hash += (crdContactsXrefPK != null ? crdContactsXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdContactsXref)) {
            return false;
        }
        CrdContactsXref other = (CrdContactsXref) object;
        if ((this.crdContactsXrefPK == null && other.crdContactsXrefPK != null) || (this.crdContactsXrefPK != null && !this.crdContactsXrefPK.equals(other.crdContactsXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdContactsXref[ crdContactsXrefPK=" + crdContactsXrefPK + " ]";
    }

}
