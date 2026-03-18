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
@Table(name = "GL_USR_CATG_ASMT", catalog = "", schema = "DBO")
public class GlUsrCatgAsmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlUsrCatgAsmtPK glUsrCatgAsmtPK;
    @Basic(optional = false)
    @Column(name = "DFLT_FLG")
    private Character dfltFlg;
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

    public GlUsrCatgAsmt() {
    }

    public GlUsrCatgAsmt(GlUsrCatgAsmtPK glUsrCatgAsmtPK) {
        this.glUsrCatgAsmtPK = glUsrCatgAsmtPK;
    }

    public GlUsrCatgAsmt(GlUsrCatgAsmtPK glUsrCatgAsmtPK, Character dfltFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.glUsrCatgAsmtPK = glUsrCatgAsmtPK;
        this.dfltFlg = dfltFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GlUsrCatgAsmt(String acctNbr, int catgLvl, String catgCd, Date mstPrfId, Date usrPrfId) {
        this.glUsrCatgAsmtPK = new GlUsrCatgAsmtPK(acctNbr, catgLvl, catgCd, mstPrfId, usrPrfId);
    }

    public GlUsrCatgAsmtPK getGlUsrCatgAsmtPK() {
        return glUsrCatgAsmtPK;
    }

    public void setGlUsrCatgAsmtPK(GlUsrCatgAsmtPK glUsrCatgAsmtPK) {
        this.glUsrCatgAsmtPK = glUsrCatgAsmtPK;
    }

    public Character getDfltFlg() {
        return dfltFlg;
    }

    public void setDfltFlg(Character dfltFlg) {
        this.dfltFlg = dfltFlg;
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
        hash += (glUsrCatgAsmtPK != null ? glUsrCatgAsmtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GlUsrCatgAsmt)) {
            return false;
        }
        GlUsrCatgAsmt other = (GlUsrCatgAsmt) object;
        if ((this.glUsrCatgAsmtPK == null && other.glUsrCatgAsmtPK != null) || (this.glUsrCatgAsmtPK != null && !this.glUsrCatgAsmtPK.equals(other.glUsrCatgAsmtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlUsrCatgAsmt[ glUsrCatgAsmtPK=" + glUsrCatgAsmtPK + " ]";
    }

}
