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
@Table(name = "PS_CDN_LOC_XREF", catalog = "", schema = "DBO")
public class PsCdnLocXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PsCdnLocXrefPK psCdnLocXrefPK;
    @Basic(optional = false)
    @Column(name = "PS_SITE_NM")
    private String psSiteNm;
    @Basic(optional = false)
    @Column(name = "PS_SITE_STATUS")
    private String psSiteStatus;
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

    public PsCdnLocXref() {
    }

    public PsCdnLocXref(PsCdnLocXrefPK psCdnLocXrefPK) {
        this.psCdnLocXrefPK = psCdnLocXrefPK;
    }

    public PsCdnLocXref(PsCdnLocXrefPK psCdnLocXrefPK, String psSiteNm, String psSiteStatus, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.psCdnLocXrefPK = psCdnLocXrefPK;
        this.psSiteNm = psSiteNm;
        this.psSiteStatus = psSiteStatus;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PsCdnLocXref(String psSiteId, String cmdSiteId) {
        this.psCdnLocXrefPK = new PsCdnLocXrefPK(psSiteId, cmdSiteId);
    }

    public PsCdnLocXrefPK getPsCdnLocXrefPK() {
        return psCdnLocXrefPK;
    }

    public void setPsCdnLocXrefPK(PsCdnLocXrefPK psCdnLocXrefPK) {
        this.psCdnLocXrefPK = psCdnLocXrefPK;
    }

    public String getPsSiteNm() {
        return psSiteNm;
    }

    public void setPsSiteNm(String psSiteNm) {
        this.psSiteNm = psSiteNm;
    }

    public String getPsSiteStatus() {
        return psSiteStatus;
    }

    public void setPsSiteStatus(String psSiteStatus) {
        this.psSiteStatus = psSiteStatus;
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
        hash += (psCdnLocXrefPK != null ? psCdnLocXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PsCdnLocXref)) {
            return false;
        }
        PsCdnLocXref other = (PsCdnLocXref) object;
        if ((this.psCdnLocXrefPK == null && other.psCdnLocXrefPK != null) || (this.psCdnLocXrefPK != null && !this.psCdnLocXrefPK.equals(other.psCdnLocXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PsCdnLocXref[ psCdnLocXrefPK=" + psCdnLocXrefPK + " ]";
    }

}
