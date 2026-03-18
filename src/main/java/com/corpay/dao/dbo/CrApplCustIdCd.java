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
@Table(name = "CR_APPL_CUST_ID_CD", catalog = "", schema = "DBO")
public class CrApplCustIdCd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplCustIdCdPK crApplCustIdCdPK;
    @Basic(optional = false)
    @Column(name = "CDN_TSD_ACCT_CD")
    private String cdnTsdAcctCd;
    @Basic(optional = false)
    @Column(name = "CDN_CUST_ID_NBR")
    private String cdnCustIdNbr;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
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

    public CrApplCustIdCd() {
    }

    public CrApplCustIdCd(CrApplCustIdCdPK crApplCustIdCdPK) {
        this.crApplCustIdCdPK = crApplCustIdCdPK;
    }

    public CrApplCustIdCd(CrApplCustIdCdPK crApplCustIdCdPK, String cdnTsdAcctCd, String cdnCustIdNbr, String mdyUsr, Date crtTs, String crtUsr, Date mdyTs) {
        this.crApplCustIdCdPK = crApplCustIdCdPK;
        this.cdnTsdAcctCd = cdnTsdAcctCd;
        this.cdnCustIdNbr = cdnCustIdNbr;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
    }

    public CrApplCustIdCd(String applNbr, String applScrnId, int applRcdId) {
        this.crApplCustIdCdPK = new CrApplCustIdCdPK(applNbr, applScrnId, applRcdId);
    }

    public CrApplCustIdCdPK getCrApplCustIdCdPK() {
        return crApplCustIdCdPK;
    }

    public void setCrApplCustIdCdPK(CrApplCustIdCdPK crApplCustIdCdPK) {
        this.crApplCustIdCdPK = crApplCustIdCdPK;
    }

    public String getCdnTsdAcctCd() {
        return cdnTsdAcctCd;
    }

    public void setCdnTsdAcctCd(String cdnTsdAcctCd) {
        this.cdnTsdAcctCd = cdnTsdAcctCd;
    }

    public String getCdnCustIdNbr() {
        return cdnCustIdNbr;
    }

    public void setCdnCustIdNbr(String cdnCustIdNbr) {
        this.cdnCustIdNbr = cdnCustIdNbr;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crApplCustIdCdPK != null ? crApplCustIdCdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplCustIdCd)) {
            return false;
        }
        CrApplCustIdCd other = (CrApplCustIdCd) object;
        if ((this.crApplCustIdCdPK == null && other.crApplCustIdCdPK != null) || (this.crApplCustIdCdPK != null && !this.crApplCustIdCdPK.equals(other.crApplCustIdCdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplCustIdCd[ crApplCustIdCdPK=" + crApplCustIdCdPK + " ]";
    }

}
