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
@Table(name = "MRCH_LOC_XREF", catalog = "", schema = "DBO")
public class MrchLocXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchLocXrefPK mrchLocXrefPK;
    @Basic(optional = false)
    @Column(name = "LOC_ID")
    private String locId;
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
    @Column(name = "SITE_NM")
    private String siteNm;

    public MrchLocXref() {
    }

    public MrchLocXref(MrchLocXrefPK mrchLocXrefPK) {
        this.mrchLocXrefPK = mrchLocXrefPK;
    }

    public MrchLocXref(MrchLocXrefPK mrchLocXrefPK, String locId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String siteNm) {
        this.mrchLocXrefPK = mrchLocXrefPK;
        this.locId = locId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.siteNm = siteNm;
    }

    public MrchLocXref(long acqInstIdCd, String acptId, String termId, Character xrefType) {
        this.mrchLocXrefPK = new MrchLocXrefPK(acqInstIdCd, acptId, termId, xrefType);
    }

    public MrchLocXrefPK getMrchLocXrefPK() {
        return mrchLocXrefPK;
    }

    public void setMrchLocXrefPK(MrchLocXrefPK mrchLocXrefPK) {
        this.mrchLocXrefPK = mrchLocXrefPK;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
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

    public String getSiteNm() {
        return siteNm;
    }

    public void setSiteNm(String siteNm) {
        this.siteNm = siteNm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mrchLocXrefPK != null ? mrchLocXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchLocXref)) {
            return false;
        }
        MrchLocXref other = (MrchLocXref) object;
        if ((this.mrchLocXrefPK == null && other.mrchLocXrefPK != null) || (this.mrchLocXrefPK != null && !this.mrchLocXrefPK.equals(other.mrchLocXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocXref[ mrchLocXrefPK=" + mrchLocXrefPK + " ]";
    }

}
