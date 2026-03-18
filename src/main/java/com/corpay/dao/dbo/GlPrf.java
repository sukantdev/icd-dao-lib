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
@Table(name = "GL_PRF", catalog = "", schema = "DBO")
public class GlPrf implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlPrfPK glPrfPK;
    @Basic(optional = false)
    @Column(name = "DESC")
    private String desc;
    @Basic(optional = false)
    @Column(name = "TYP")
    private Character typ;
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
    @Basic(optional = false)
    @Column(name = "GL_CD_SEPTR")
    private String glCdSeptr;
    @Basic(optional = false)
    @Column(name = "PRHB_PRTL_GLCD")
    private Character prhbPrtlGlcd;

    public GlPrf() {
    }

    public GlPrf(GlPrfPK glPrfPK) {
        this.glPrfPK = glPrfPK;
    }

    public GlPrf(GlPrfPK glPrfPK, String desc, Character typ, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String glCdSeptr, Character prhbPrtlGlcd) {
        this.glPrfPK = glPrfPK;
        this.desc = desc;
        this.typ = typ;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.glCdSeptr = glCdSeptr;
        this.prhbPrtlGlcd = prhbPrtlGlcd;
    }

    public GlPrf(String acctNbr, Date prfId) {
        this.glPrfPK = new GlPrfPK(acctNbr, prfId);
    }

    public GlPrfPK getGlPrfPK() {
        return glPrfPK;
    }

    public void setGlPrfPK(GlPrfPK glPrfPK) {
        this.glPrfPK = glPrfPK;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Character getTyp() {
        return typ;
    }

    public void setTyp(Character typ) {
        this.typ = typ;
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

    public String getGlCdSeptr() {
        return glCdSeptr;
    }

    public void setGlCdSeptr(String glCdSeptr) {
        this.glCdSeptr = glCdSeptr;
    }

    public Character getPrhbPrtlGlcd() {
        return prhbPrtlGlcd;
    }

    public void setPrhbPrtlGlcd(Character prhbPrtlGlcd) {
        this.prhbPrtlGlcd = prhbPrtlGlcd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glPrfPK != null ? glPrfPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GlPrf)) {
            return false;
        }
        GlPrf other = (GlPrf) object;
        if ((this.glPrfPK == null && other.glPrfPK != null) || (this.glPrfPK != null && !this.glPrfPK.equals(other.glPrfPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlPrf[ glPrfPK=" + glPrfPK + " ]";
    }

}
