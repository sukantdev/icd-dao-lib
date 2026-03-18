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
@Table(name = "PRD_TS_MRCH_RPTS", catalog = "", schema = "DBO")
public class PrdTsMrchRpts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdTsMrchRptsPK prdTsMrchRptsPK;
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

    public PrdTsMrchRpts() {
    }

    public PrdTsMrchRpts(PrdTsMrchRptsPK prdTsMrchRptsPK) {
        this.prdTsMrchRptsPK = prdTsMrchRptsPK;
    }

    public PrdTsMrchRpts(PrdTsMrchRptsPK prdTsMrchRptsPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdTsMrchRptsPK = prdTsMrchRptsPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdTsMrchRpts(String applNbr, String rptCd) {
        this.prdTsMrchRptsPK = new PrdTsMrchRptsPK(applNbr, rptCd);
    }

    public PrdTsMrchRptsPK getPrdTsMrchRptsPK() {
        return prdTsMrchRptsPK;
    }

    public void setPrdTsMrchRptsPK(PrdTsMrchRptsPK prdTsMrchRptsPK) {
        this.prdTsMrchRptsPK = prdTsMrchRptsPK;
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
        hash += (prdTsMrchRptsPK != null ? prdTsMrchRptsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdTsMrchRpts)) {
            return false;
        }
        PrdTsMrchRpts other = (PrdTsMrchRpts) object;
        if ((this.prdTsMrchRptsPK == null && other.prdTsMrchRptsPK != null) || (this.prdTsMrchRptsPK != null && !this.prdTsMrchRptsPK.equals(other.prdTsMrchRptsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTsMrchRpts[ prdTsMrchRptsPK=" + prdTsMrchRptsPK + " ]";
    }

}
