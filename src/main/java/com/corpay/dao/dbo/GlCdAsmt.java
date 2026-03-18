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
@Table(name = "GL_CD_ASMT", catalog = "", schema = "DBO")
public class GlCdAsmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlCdAsmtPK glCdAsmtPK;
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

    public GlCdAsmt() {
    }

    public GlCdAsmt(GlCdAsmtPK glCdAsmtPK) {
        this.glCdAsmtPK = glCdAsmtPK;
    }

    public GlCdAsmt(GlCdAsmtPK glCdAsmtPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.glCdAsmtPK = glCdAsmtPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GlCdAsmt(String acctNbr, String asmtTyp, Date prfId, String asmtVal, String glCd) {
        this.glCdAsmtPK = new GlCdAsmtPK(acctNbr, asmtTyp, prfId, asmtVal, glCd);
    }

    public GlCdAsmtPK getGlCdAsmtPK() {
        return glCdAsmtPK;
    }

    public void setGlCdAsmtPK(GlCdAsmtPK glCdAsmtPK) {
        this.glCdAsmtPK = glCdAsmtPK;
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
        hash += (glCdAsmtPK != null ? glCdAsmtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GlCdAsmt)) {
            return false;
        }
        GlCdAsmt other = (GlCdAsmt) object;
        if ((this.glCdAsmtPK == null && other.glCdAsmtPK != null) || (this.glCdAsmtPK != null && !this.glCdAsmtPK.equals(other.glCdAsmtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlCdAsmt[ glCdAsmtPK=" + glCdAsmtPK + " ]";
    }

}
