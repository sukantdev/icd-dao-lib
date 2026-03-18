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
@Table(name = "GL_ACCT_XREF", catalog = "", schema = "DBO")
public class GlAcctXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlAcctXrefPK glAcctXrefPK;
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

    public GlAcctXref() {
    }

    public GlAcctXref(GlAcctXrefPK glAcctXrefPK) {
        this.glAcctXrefPK = glAcctXrefPK;
    }

    public GlAcctXref(GlAcctXrefPK glAcctXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.glAcctXrefPK = glAcctXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GlAcctXref(String acctNbr, String glCd) {
        this.glAcctXrefPK = new GlAcctXrefPK(acctNbr, glCd);
    }

    public GlAcctXrefPK getGlAcctXrefPK() {
        return glAcctXrefPK;
    }

    public void setGlAcctXrefPK(GlAcctXrefPK glAcctXrefPK) {
        this.glAcctXrefPK = glAcctXrefPK;
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
        hash += (glAcctXrefPK != null ? glAcctXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GlAcctXref)) {
            return false;
        }
        GlAcctXref other = (GlAcctXref) object;
        if ((this.glAcctXrefPK == null && other.glAcctXrefPK != null) || (this.glAcctXrefPK != null && !this.glAcctXrefPK.equals(other.glAcctXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlAcctXref[ glAcctXrefPK=" + glAcctXrefPK + " ]";
    }

}
