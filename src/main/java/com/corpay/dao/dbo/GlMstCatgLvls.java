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
@Table(name = "GL_MST_CATG_LVLS", catalog = "", schema = "DBO")
public class GlMstCatgLvls implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GlMstCatgLvlsPK glMstCatgLvlsPK;
    @Basic(optional = false)
    @Column(name = "CATG_LVL_DESC")
    private String catgLvlDesc;
    @Basic(optional = false)
    @Column(name = "CATG_LENGTH")
    private int catgLength;
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

    public GlMstCatgLvls() {
    }

    public GlMstCatgLvls(GlMstCatgLvlsPK glMstCatgLvlsPK) {
        this.glMstCatgLvlsPK = glMstCatgLvlsPK;
    }

    public GlMstCatgLvls(GlMstCatgLvlsPK glMstCatgLvlsPK, String catgLvlDesc, int catgLength, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.glMstCatgLvlsPK = glMstCatgLvlsPK;
        this.catgLvlDesc = catgLvlDesc;
        this.catgLength = catgLength;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GlMstCatgLvls(String acctNbr, Date mstPrfId, int catgLvl) {
        this.glMstCatgLvlsPK = new GlMstCatgLvlsPK(acctNbr, mstPrfId, catgLvl);
    }

    public GlMstCatgLvlsPK getGlMstCatgLvlsPK() {
        return glMstCatgLvlsPK;
    }

    public void setGlMstCatgLvlsPK(GlMstCatgLvlsPK glMstCatgLvlsPK) {
        this.glMstCatgLvlsPK = glMstCatgLvlsPK;
    }

    public String getCatgLvlDesc() {
        return catgLvlDesc;
    }

    public void setCatgLvlDesc(String catgLvlDesc) {
        this.catgLvlDesc = catgLvlDesc;
    }

    public int getCatgLength() {
        return catgLength;
    }

    public void setCatgLength(int catgLength) {
        this.catgLength = catgLength;
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
        hash += (glMstCatgLvlsPK != null ? glMstCatgLvlsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GlMstCatgLvls)) {
            return false;
        }
        GlMstCatgLvls other = (GlMstCatgLvls) object;
        if ((this.glMstCatgLvlsPK == null && other.glMstCatgLvlsPK != null) || (this.glMstCatgLvlsPK != null && !this.glMstCatgLvlsPK.equals(other.glMstCatgLvlsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlMstCatgLvls[ glMstCatgLvlsPK=" + glMstCatgLvlsPK + " ]";
    }

}
