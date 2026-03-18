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
@Table(name = "PRD_TS_MRCH_CDS", catalog = "", schema = "DBO")
public class PrdTsMrchCds implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdTsMrchCdsPK prdTsMrchCdsPK;
    @Basic(optional = false)
    @Column(name = "CD")
    private String cd;
    @Basic(optional = false)
    @Column(name = "NEW_CD_FLG")
    private Character newCdFlg;
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

    public PrdTsMrchCds() {
    }

    public PrdTsMrchCds(PrdTsMrchCdsPK prdTsMrchCdsPK) {
        this.prdTsMrchCdsPK = prdTsMrchCdsPK;
    }

    public PrdTsMrchCds(PrdTsMrchCdsPK prdTsMrchCdsPK, String cd, Character newCdFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdTsMrchCdsPK = prdTsMrchCdsPK;
        this.cd = cd;
        this.newCdFlg = newCdFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdTsMrchCds(String applNbr, String cdTyp) {
        this.prdTsMrchCdsPK = new PrdTsMrchCdsPK(applNbr, cdTyp);
    }

    public PrdTsMrchCdsPK getPrdTsMrchCdsPK() {
        return prdTsMrchCdsPK;
    }

    public void setPrdTsMrchCdsPK(PrdTsMrchCdsPK prdTsMrchCdsPK) {
        this.prdTsMrchCdsPK = prdTsMrchCdsPK;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public Character getNewCdFlg() {
        return newCdFlg;
    }

    public void setNewCdFlg(Character newCdFlg) {
        this.newCdFlg = newCdFlg;
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
        hash += (prdTsMrchCdsPK != null ? prdTsMrchCdsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdTsMrchCds)) {
            return false;
        }
        PrdTsMrchCds other = (PrdTsMrchCds) object;
        if ((this.prdTsMrchCdsPK == null && other.prdTsMrchCdsPK != null) || (this.prdTsMrchCdsPK != null && !this.prdTsMrchCdsPK.equals(other.prdTsMrchCdsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTsMrchCds[ prdTsMrchCdsPK=" + prdTsMrchCdsPK + " ]";
    }

}
