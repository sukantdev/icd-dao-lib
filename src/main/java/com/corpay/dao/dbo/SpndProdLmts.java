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
@Table(name = "SPND_PROD_LMTS", catalog = "", schema = "DBO")
public class SpndProdLmts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SpndProdLmtsPK spndProdLmtsPK;

    @Basic(optional = false)
    @Column(name = "SPND_PRDL_XTN_AMT")
    private BigDecimal spndPrdlXtnAmt;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_XTN_AMT_OVRR")
    private BigDecimal spndPrdlXtnAmtOvrr;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_DAY_AMT")
    private BigDecimal spndPrdlDayAmt;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_DAY_AMT_OVRR")
    private BigDecimal spndPrdlDayAmtOvrr;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_DAY_XTNS")
    private int spndPrdlDayXtns;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_DAY_XTNS_OVRR")
    private int spndPrdlDayXtnsOvrr;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_CYC_FLAG")
    private Character spndPrdlCycFlag;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_CYC_RESET")
    private String spndPrdlCycReset;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_CYC_AMT")
    private BigDecimal spndPrdlCycAmt;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_CYC_AMT_OVRR")
    private BigDecimal spndPrdlCycAmtOvrr;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_CYC_XTNS")
    private int spndPrdlCycXtns;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_CYC_XTNS_OVRR")
    private int spndPrdlCycXtnsOvrr;
    @Basic(optional = false)
    @Column(name = "SPND_PRDL_PO_AMT")
    private BigDecimal spndPrdlPoAmt;
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

    public SpndProdLmts() {
    }

    public SpndProdLmts(SpndProdLmtsPK spndProdLmtsPK) {
        this.spndProdLmtsPK = spndProdLmtsPK;
    }

    public SpndProdLmts(SpndProdLmtsPK spndProdLmtsPK, BigDecimal spndPrdlXtnAmt, BigDecimal spndPrdlXtnAmtOvrr, BigDecimal spndPrdlDayAmt, BigDecimal spndPrdlDayAmtOvrr, int spndPrdlDayXtns, int spndPrdlDayXtnsOvrr, Character spndPrdlCycFlag, String spndPrdlCycReset, BigDecimal spndPrdlCycAmt, BigDecimal spndPrdlCycAmtOvrr, int spndPrdlCycXtns, int spndPrdlCycXtnsOvrr, BigDecimal spndPrdlPoAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.spndProdLmtsPK = spndProdLmtsPK;
        this.spndPrdlXtnAmt = spndPrdlXtnAmt;
        this.spndPrdlXtnAmtOvrr = spndPrdlXtnAmtOvrr;
        this.spndPrdlDayAmt = spndPrdlDayAmt;
        this.spndPrdlDayAmtOvrr = spndPrdlDayAmtOvrr;
        this.spndPrdlDayXtns = spndPrdlDayXtns;
        this.spndPrdlDayXtnsOvrr = spndPrdlDayXtnsOvrr;
        this.spndPrdlCycFlag = spndPrdlCycFlag;
        this.spndPrdlCycReset = spndPrdlCycReset;
        this.spndPrdlCycAmt = spndPrdlCycAmt;
        this.spndPrdlCycAmtOvrr = spndPrdlCycAmtOvrr;
        this.spndPrdlCycXtns = spndPrdlCycXtns;
        this.spndPrdlCycXtnsOvrr = spndPrdlCycXtnsOvrr;
        this.spndPrdlPoAmt = spndPrdlPoAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public SpndProdLmts(String spndPrdlAcctNbr, String spndProdcId) {
        this.spndProdLmtsPK = new SpndProdLmtsPK(spndPrdlAcctNbr, spndProdcId);
    }

    public SpndProdLmtsPK getSpndProdLmtsPK() {
        return spndProdLmtsPK;
    }

    public void setSpndProdLmtsPK(SpndProdLmtsPK spndProdLmtsPK) {
        this.spndProdLmtsPK = spndProdLmtsPK;
    }

    public BigDecimal getSpndPrdlXtnAmt() {
        return spndPrdlXtnAmt;
    }

    public void setSpndPrdlXtnAmt(BigDecimal spndPrdlXtnAmt) {
        this.spndPrdlXtnAmt = spndPrdlXtnAmt;
    }

    public BigDecimal getSpndPrdlXtnAmtOvrr() {
        return spndPrdlXtnAmtOvrr;
    }

    public void setSpndPrdlXtnAmtOvrr(BigDecimal spndPrdlXtnAmtOvrr) {
        this.spndPrdlXtnAmtOvrr = spndPrdlXtnAmtOvrr;
    }

    public BigDecimal getSpndPrdlDayAmt() {
        return spndPrdlDayAmt;
    }

    public void setSpndPrdlDayAmt(BigDecimal spndPrdlDayAmt) {
        this.spndPrdlDayAmt = spndPrdlDayAmt;
    }

    public BigDecimal getSpndPrdlDayAmtOvrr() {
        return spndPrdlDayAmtOvrr;
    }

    public void setSpndPrdlDayAmtOvrr(BigDecimal spndPrdlDayAmtOvrr) {
        this.spndPrdlDayAmtOvrr = spndPrdlDayAmtOvrr;
    }

    public int getSpndPrdlDayXtns() {
        return spndPrdlDayXtns;
    }

    public void setSpndPrdlDayXtns(int spndPrdlDayXtns) {
        this.spndPrdlDayXtns = spndPrdlDayXtns;
    }

    public int getSpndPrdlDayXtnsOvrr() {
        return spndPrdlDayXtnsOvrr;
    }

    public void setSpndPrdlDayXtnsOvrr(int spndPrdlDayXtnsOvrr) {
        this.spndPrdlDayXtnsOvrr = spndPrdlDayXtnsOvrr;
    }

    public Character getSpndPrdlCycFlag() {
        return spndPrdlCycFlag;
    }

    public void setSpndPrdlCycFlag(Character spndPrdlCycFlag) {
        this.spndPrdlCycFlag = spndPrdlCycFlag;
    }

    public String getSpndPrdlCycReset() {
        return spndPrdlCycReset;
    }

    public void setSpndPrdlCycReset(String spndPrdlCycReset) {
        this.spndPrdlCycReset = spndPrdlCycReset;
    }

    public BigDecimal getSpndPrdlCycAmt() {
        return spndPrdlCycAmt;
    }

    public void setSpndPrdlCycAmt(BigDecimal spndPrdlCycAmt) {
        this.spndPrdlCycAmt = spndPrdlCycAmt;
    }

    public BigDecimal getSpndPrdlCycAmtOvrr() {
        return spndPrdlCycAmtOvrr;
    }

    public void setSpndPrdlCycAmtOvrr(BigDecimal spndPrdlCycAmtOvrr) {
        this.spndPrdlCycAmtOvrr = spndPrdlCycAmtOvrr;
    }

    public int getSpndPrdlCycXtns() {
        return spndPrdlCycXtns;
    }

    public void setSpndPrdlCycXtns(int spndPrdlCycXtns) {
        this.spndPrdlCycXtns = spndPrdlCycXtns;
    }

    public int getSpndPrdlCycXtnsOvrr() {
        return spndPrdlCycXtnsOvrr;
    }

    public void setSpndPrdlCycXtnsOvrr(int spndPrdlCycXtnsOvrr) {
        this.spndPrdlCycXtnsOvrr = spndPrdlCycXtnsOvrr;
    }

    public BigDecimal getSpndPrdlPoAmt() {
        return spndPrdlPoAmt;
    }

    public void setSpndPrdlPoAmt(BigDecimal spndPrdlPoAmt) {
        this.spndPrdlPoAmt = spndPrdlPoAmt;
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
        hash += (spndProdLmtsPK != null ? spndProdLmtsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof SpndProdLmts)) {
            return false;
        }
        SpndProdLmts other = (SpndProdLmts) object;
        if ((this.spndProdLmtsPK == null && other.spndProdLmtsPK != null) || (this.spndProdLmtsPK != null && !this.spndProdLmtsPK.equals(other.spndProdLmtsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SpndProdLmts[ spndProdLmtsPK=" + spndProdLmtsPK + " ]";
    }

}
