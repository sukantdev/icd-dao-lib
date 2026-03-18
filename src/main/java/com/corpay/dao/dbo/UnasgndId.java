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
@Table(name = "UNASGND_ID", catalog = "", schema = "DBO")
public class UnasgndId implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UnasgndIdPK unasgndIdPK;
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

    public UnasgndId() {
    }

    public UnasgndId(UnasgndIdPK unasgndIdPK) {
        this.unasgndIdPK = unasgndIdPK;
    }

    public UnasgndId(UnasgndIdPK unasgndIdPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.unasgndIdPK = unasgndIdPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UnasgndId(String custId, int unasgndId) {
        this.unasgndIdPK = new UnasgndIdPK(custId, unasgndId);
    }

    public UnasgndIdPK getUnasgndIdPK() {
        return unasgndIdPK;
    }

    public void setUnasgndIdPK(UnasgndIdPK unasgndIdPK) {
        this.unasgndIdPK = unasgndIdPK;
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
        hash += (unasgndIdPK != null ? unasgndIdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UnasgndId)) {
            return false;
        }
        UnasgndId other = (UnasgndId) object;
        if ((this.unasgndIdPK == null && other.unasgndIdPK != null) || (this.unasgndIdPK != null && !this.unasgndIdPK.equals(other.unasgndIdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UnasgndId[ unasgndIdPK=" + unasgndIdPK + " ]";
    }

}
