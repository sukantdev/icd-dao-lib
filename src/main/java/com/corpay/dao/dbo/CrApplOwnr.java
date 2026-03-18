package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "CR_APPL_OWNR", catalog = "", schema = "DBO")
public class CrApplOwnr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplOwnrPK crApplOwnrPK;
    @Basic(optional = false)
    @Column(name = "OWNR_LST_NM")
    private String ownrLstNm;
    @Basic(optional = false)
    @Column(name = "OWNR_FST_NM")
    private String ownrFstNm;
    @Basic(optional = false)
    @Column(name = "OWNR_SSN")
    private String ownrSsn;
    @Basic(optional = false)
    @Column(name = "OWNR_DOB")
    @Temporal(TemporalType.DATE)
    private Date ownrDob;

    @Basic(optional = false)
    @Column(name = "PCTGE_OWNRSHP")
    private BigDecimal pctgeOwnrshp;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_NBR")
    private String drvLicNbr;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_ST")
    private String drvLicSt;
    @Basic(optional = false)
    @Column(name = "OWNR_ADDR1")
    private String ownrAddr1;
    @Basic(optional = false)
    @Column(name = "OWNR_CTY")
    private String ownrCty;
    @Basic(optional = false)
    @Column(name = "OWNR_ST")
    private String ownrSt;
    @Basic(optional = false)
    @Column(name = "OWNR_POST_CD")
    private String ownrPostCd;
    @Basic(optional = false)
    @Column(name = "OWNR_CRTY")
    private String ownrCrty;
    @Basic(optional = false)
    @Column(name = "OWNR_PH")
    private String ownrPh;
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

    public CrApplOwnr() {
    }

    public CrApplOwnr(CrApplOwnrPK crApplOwnrPK) {
        this.crApplOwnrPK = crApplOwnrPK;
    }

    public CrApplOwnr(CrApplOwnrPK crApplOwnrPK, String ownrLstNm, String ownrFstNm, String ownrSsn, Date ownrDob, BigDecimal pctgeOwnrshp, String drvLicNbr, String drvLicSt, String ownrAddr1, String ownrCty, String ownrSt, String ownrPostCd, String ownrCrty, String ownrPh, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crApplOwnrPK = crApplOwnrPK;
        this.ownrLstNm = ownrLstNm;
        this.ownrFstNm = ownrFstNm;
        this.ownrSsn = ownrSsn;
        this.ownrDob = ownrDob;
        this.pctgeOwnrshp = pctgeOwnrshp;
        this.drvLicNbr = drvLicNbr;
        this.drvLicSt = drvLicSt;
        this.ownrAddr1 = ownrAddr1;
        this.ownrCty = ownrCty;
        this.ownrSt = ownrSt;
        this.ownrPostCd = ownrPostCd;
        this.ownrCrty = ownrCrty;
        this.ownrPh = ownrPh;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrApplOwnr(String applNbr, short seqNbr) {
        this.crApplOwnrPK = new CrApplOwnrPK(applNbr, seqNbr);
    }

    public CrApplOwnrPK getCrApplOwnrPK() {
        return crApplOwnrPK;
    }

    public void setCrApplOwnrPK(CrApplOwnrPK crApplOwnrPK) {
        this.crApplOwnrPK = crApplOwnrPK;
    }

    public String getOwnrLstNm() {
        return ownrLstNm;
    }

    public void setOwnrLstNm(String ownrLstNm) {
        this.ownrLstNm = ownrLstNm;
    }

    public String getOwnrFstNm() {
        return ownrFstNm;
    }

    public void setOwnrFstNm(String ownrFstNm) {
        this.ownrFstNm = ownrFstNm;
    }

    public String getOwnrSsn() {
        return ownrSsn;
    }

    public void setOwnrSsn(String ownrSsn) {
        this.ownrSsn = ownrSsn;
    }

    public Date getOwnrDob() {
        return ownrDob;
    }

    public void setOwnrDob(Date ownrDob) {
        this.ownrDob = ownrDob;
    }

    public BigDecimal getPctgeOwnrshp() {
        return pctgeOwnrshp;
    }

    public void setPctgeOwnrshp(BigDecimal pctgeOwnrshp) {
        this.pctgeOwnrshp = pctgeOwnrshp;
    }

    public String getDrvLicNbr() {
        return drvLicNbr;
    }

    public void setDrvLicNbr(String drvLicNbr) {
        this.drvLicNbr = drvLicNbr;
    }

    public String getDrvLicSt() {
        return drvLicSt;
    }

    public void setDrvLicSt(String drvLicSt) {
        this.drvLicSt = drvLicSt;
    }

    public String getOwnrAddr1() {
        return ownrAddr1;
    }

    public void setOwnrAddr1(String ownrAddr1) {
        this.ownrAddr1 = ownrAddr1;
    }

    public String getOwnrCty() {
        return ownrCty;
    }

    public void setOwnrCty(String ownrCty) {
        this.ownrCty = ownrCty;
    }

    public String getOwnrSt() {
        return ownrSt;
    }

    public void setOwnrSt(String ownrSt) {
        this.ownrSt = ownrSt;
    }

    public String getOwnrPostCd() {
        return ownrPostCd;
    }

    public void setOwnrPostCd(String ownrPostCd) {
        this.ownrPostCd = ownrPostCd;
    }

    public String getOwnrCrty() {
        return ownrCrty;
    }

    public void setOwnrCrty(String ownrCrty) {
        this.ownrCrty = ownrCrty;
    }

    public String getOwnrPh() {
        return ownrPh;
    }

    public void setOwnrPh(String ownrPh) {
        this.ownrPh = ownrPh;
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
        hash += (crApplOwnrPK != null ? crApplOwnrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplOwnr)) {
            return false;
        }
        CrApplOwnr other = (CrApplOwnr) object;
        if ((this.crApplOwnrPK == null && other.crApplOwnrPK != null) || (this.crApplOwnrPK != null && !this.crApplOwnrPK.equals(other.crApplOwnrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplOwnr[ crApplOwnrPK=" + crApplOwnrPK + " ]";
    }

}
