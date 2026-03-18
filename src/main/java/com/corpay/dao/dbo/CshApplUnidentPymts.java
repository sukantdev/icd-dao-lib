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
@Table(name = "CSH_APPL_UNIDENT_PYMTS", catalog = "", schema = "DBO")
public class CshApplUnidentPymts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CshApplUnidentPymtsPK cshApplUnidentPymtsPK;
    @Basic(optional = false)
    @Column(name = "UI_ORIGIN_BNK_NR")
    private String uiOriginBnkNr;

    @Basic(optional = false)
    @Column(name = "UI_PYMT_AMT")
    private BigDecimal uiPymtAmt;
    @Basic(optional = false)
    @Column(name = "UI_CUST_BNK_RTG_NR")
    private String uiCustBnkRtgNr;
    @Basic(optional = false)
    @Column(name = "UI_CUST_BNK_ACCT_NR")
    private String uiCustBnkAcctNr;
    @Basic(optional = false)
    @Column(name = "UI_PYMT_NR")
    private String uiPymtNr;
    @Basic(optional = false)
    @Column(name = "UI_CUST_AR_CO_NR")
    private String uiCustArCoNr;
    @Basic(optional = false)
    @Column(name = "UI_CUST_AR_ACCT_CD")
    private String uiCustArAcctCd;
    @Basic(optional = false)
    @Column(name = "UI_PYMT_STATUS")
    private Character uiPymtStatus;
    @Basic(optional = false)
    @Column(name = "UI_SRC_PGM")
    private String uiSrcPgm;
    @Basic(optional = false)
    @Column(name = "UI_IDENT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uiIdentTs;
    @Basic(optional = false)
    @Column(name = "UI_IDENT_USR")
    private String uiIdentUsr;
    @Basic(optional = false)
    @Column(name = "UI_AR_EXTR_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uiArExtrTs;
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

    public CshApplUnidentPymts() {
    }

    public CshApplUnidentPymts(CshApplUnidentPymtsPK cshApplUnidentPymtsPK) {
        this.cshApplUnidentPymtsPK = cshApplUnidentPymtsPK;
    }

    public CshApplUnidentPymts(CshApplUnidentPymtsPK cshApplUnidentPymtsPK, String uiOriginBnkNr, BigDecimal uiPymtAmt, String uiCustBnkRtgNr, String uiCustBnkAcctNr, String uiPymtNr, String uiCustArCoNr, String uiCustArAcctCd, Character uiPymtStatus, String uiSrcPgm, Date uiIdentTs, String uiIdentUsr, Date uiArExtrTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.cshApplUnidentPymtsPK = cshApplUnidentPymtsPK;
        this.uiOriginBnkNr = uiOriginBnkNr;
        this.uiPymtAmt = uiPymtAmt;
        this.uiCustBnkRtgNr = uiCustBnkRtgNr;
        this.uiCustBnkAcctNr = uiCustBnkAcctNr;
        this.uiPymtNr = uiPymtNr;
        this.uiCustArCoNr = uiCustArCoNr;
        this.uiCustArAcctCd = uiCustArAcctCd;
        this.uiPymtStatus = uiPymtStatus;
        this.uiSrcPgm = uiSrcPgm;
        this.uiIdentTs = uiIdentTs;
        this.uiIdentUsr = uiIdentUsr;
        this.uiArExtrTs = uiArExtrTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CshApplUnidentPymts(String uiLockboxNr, Date uiPymtDt, short uiBtchNr, short uiBtchSeqNr) {
        this.cshApplUnidentPymtsPK = new CshApplUnidentPymtsPK(uiLockboxNr, uiPymtDt, uiBtchNr, uiBtchSeqNr);
    }

    public CshApplUnidentPymtsPK getCshApplUnidentPymtsPK() {
        return cshApplUnidentPymtsPK;
    }

    public void setCshApplUnidentPymtsPK(CshApplUnidentPymtsPK cshApplUnidentPymtsPK) {
        this.cshApplUnidentPymtsPK = cshApplUnidentPymtsPK;
    }

    public String getUiOriginBnkNr() {
        return uiOriginBnkNr;
    }

    public void setUiOriginBnkNr(String uiOriginBnkNr) {
        this.uiOriginBnkNr = uiOriginBnkNr;
    }

    public BigDecimal getUiPymtAmt() {
        return uiPymtAmt;
    }

    public void setUiPymtAmt(BigDecimal uiPymtAmt) {
        this.uiPymtAmt = uiPymtAmt;
    }

    public String getUiCustBnkRtgNr() {
        return uiCustBnkRtgNr;
    }

    public void setUiCustBnkRtgNr(String uiCustBnkRtgNr) {
        this.uiCustBnkRtgNr = uiCustBnkRtgNr;
    }

    public String getUiCustBnkAcctNr() {
        return uiCustBnkAcctNr;
    }

    public void setUiCustBnkAcctNr(String uiCustBnkAcctNr) {
        this.uiCustBnkAcctNr = uiCustBnkAcctNr;
    }

    public String getUiPymtNr() {
        return uiPymtNr;
    }

    public void setUiPymtNr(String uiPymtNr) {
        this.uiPymtNr = uiPymtNr;
    }

    public String getUiCustArCoNr() {
        return uiCustArCoNr;
    }

    public void setUiCustArCoNr(String uiCustArCoNr) {
        this.uiCustArCoNr = uiCustArCoNr;
    }

    public String getUiCustArAcctCd() {
        return uiCustArAcctCd;
    }

    public void setUiCustArAcctCd(String uiCustArAcctCd) {
        this.uiCustArAcctCd = uiCustArAcctCd;
    }

    public Character getUiPymtStatus() {
        return uiPymtStatus;
    }

    public void setUiPymtStatus(Character uiPymtStatus) {
        this.uiPymtStatus = uiPymtStatus;
    }

    public String getUiSrcPgm() {
        return uiSrcPgm;
    }

    public void setUiSrcPgm(String uiSrcPgm) {
        this.uiSrcPgm = uiSrcPgm;
    }

    public Date getUiIdentTs() {
        return uiIdentTs;
    }

    public void setUiIdentTs(Date uiIdentTs) {
        this.uiIdentTs = uiIdentTs;
    }

    public String getUiIdentUsr() {
        return uiIdentUsr;
    }

    public void setUiIdentUsr(String uiIdentUsr) {
        this.uiIdentUsr = uiIdentUsr;
    }

    public Date getUiArExtrTs() {
        return uiArExtrTs;
    }

    public void setUiArExtrTs(Date uiArExtrTs) {
        this.uiArExtrTs = uiArExtrTs;
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
        hash += (cshApplUnidentPymtsPK != null ? cshApplUnidentPymtsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CshApplUnidentPymts)) {
            return false;
        }
        CshApplUnidentPymts other = (CshApplUnidentPymts) object;
        if ((this.cshApplUnidentPymtsPK == null && other.cshApplUnidentPymtsPK != null) || (this.cshApplUnidentPymtsPK != null && !this.cshApplUnidentPymtsPK.equals(other.cshApplUnidentPymtsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CshApplUnidentPymts[ cshApplUnidentPymtsPK=" + cshApplUnidentPymtsPK + " ]";
    }

}
