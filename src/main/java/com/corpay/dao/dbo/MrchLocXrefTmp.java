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
@Table(name = "MRCH_LOC_XREF_TMP", catalog = "", schema = "DBO")
public class MrchLocXrefTmp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchLocXrefTmpPK mrchLocXrefTmpPK;
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
    @Basic(optional = false)
    @Column(name = "OPIS_ID")
    private String opisId;

    public MrchLocXrefTmp() {
    }

    public MrchLocXrefTmp(MrchLocXrefTmpPK mrchLocXrefTmpPK) {
        this.mrchLocXrefTmpPK = mrchLocXrefTmpPK;
    }

    public MrchLocXrefTmp(MrchLocXrefTmpPK mrchLocXrefTmpPK, String locId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String siteNm, String opisId) {
        this.mrchLocXrefTmpPK = mrchLocXrefTmpPK;
        this.locId = locId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.siteNm = siteNm;
        this.opisId = opisId;
    }

    public MrchLocXrefTmp(long acqInstIdCd, String acptId, String termId, Character xrefType) {
        this.mrchLocXrefTmpPK = new MrchLocXrefTmpPK(acqInstIdCd, acptId, termId, xrefType);
    }

    public MrchLocXrefTmpPK getMrchLocXrefTmpPK() {
        return mrchLocXrefTmpPK;
    }

    public void setMrchLocXrefTmpPK(MrchLocXrefTmpPK mrchLocXrefTmpPK) {
        this.mrchLocXrefTmpPK = mrchLocXrefTmpPK;
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

    public String getOpisId() {
        return opisId;
    }

    public void setOpisId(String opisId) {
        this.opisId = opisId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mrchLocXrefTmpPK != null ? mrchLocXrefTmpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchLocXrefTmp)) {
            return false;
        }
        MrchLocXrefTmp other = (MrchLocXrefTmp) object;
        if ((this.mrchLocXrefTmpPK == null && other.mrchLocXrefTmpPK != null) || (this.mrchLocXrefTmpPK != null && !this.mrchLocXrefTmpPK.equals(other.mrchLocXrefTmpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocXrefTmp[ mrchLocXrefTmpPK=" + mrchLocXrefTmpPK + " ]";
    }

}
