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
@Table(name = "PRD_TS_MRCH_AMNTYS", catalog = "", schema = "DBO")
public class PrdTsMrchAmntys implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdTsMrchAmntysPK prdTsMrchAmntysPK;
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

    public PrdTsMrchAmntys() {
    }

    public PrdTsMrchAmntys(PrdTsMrchAmntysPK prdTsMrchAmntysPK) {
        this.prdTsMrchAmntysPK = prdTsMrchAmntysPK;
    }

    public PrdTsMrchAmntys(PrdTsMrchAmntysPK prdTsMrchAmntysPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdTsMrchAmntysPK = prdTsMrchAmntysPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdTsMrchAmntys(String applNbr, String amnty) {
        this.prdTsMrchAmntysPK = new PrdTsMrchAmntysPK(applNbr, amnty);
    }

    public PrdTsMrchAmntysPK getPrdTsMrchAmntysPK() {
        return prdTsMrchAmntysPK;
    }

    public void setPrdTsMrchAmntysPK(PrdTsMrchAmntysPK prdTsMrchAmntysPK) {
        this.prdTsMrchAmntysPK = prdTsMrchAmntysPK;
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
        hash += (prdTsMrchAmntysPK != null ? prdTsMrchAmntysPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdTsMrchAmntys)) {
            return false;
        }
        PrdTsMrchAmntys other = (PrdTsMrchAmntys) object;
        if ((this.prdTsMrchAmntysPK == null && other.prdTsMrchAmntysPK != null) || (this.prdTsMrchAmntysPK != null && !this.prdTsMrchAmntysPK.equals(other.prdTsMrchAmntysPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTsMrchAmntys[ prdTsMrchAmntysPK=" + prdTsMrchAmntysPK + " ]";
    }

}
