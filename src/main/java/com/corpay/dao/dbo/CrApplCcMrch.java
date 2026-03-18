package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "CR_APPL_CC_MRCH", catalog = "", schema = "DBO")
public class CrApplCcMrch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;

    @Basic(optional = false)
    @Column(name = "PRJTD_WKLY_VOL")
    private BigDecimal prjtdWklyVol;
    @Basic(optional = false)
    @Column(name = "PGM_LMT")
    private BigDecimal pgmLmt;
    @Basic(optional = false)
    @Column(name = "RQSTD_RCRS_LMT")
    private BigDecimal rqstdRcrsLmt;
    @Basic(optional = false)
    @Column(name = "SETTLEMENT_FREQ")
    private String settlementFreq;
    @Basic(optional = false)
    @Column(name = "PGM_BLNG_CYC")
    private String pgmBlngCyc;
    @Basic(optional = false)
    @Column(name = "PGM_TERMS")
    private String pgmTerms;
    @Basic(optional = false)
    @Column(name = "FNCL_STMT")
    private Character fnclStmt;
    @Basic(optional = false)
    @Column(name = "ARTCL_OF_INCRPTN")
    private Character artclOfIncrptn;
    @Basic(optional = false)
    @Column(name = "CUST_LSTG")
    private Character custLstg;
    @Basic(optional = false)
    @Column(name = "CUST_AGING")
    private Character custAging;
    @Basic(optional = false)
    @Column(name = "CDN_SRV_AGMT")
    private Character cdnSrvAgmt;
    @Basic(optional = false)
    @Column(name = "CDN_SRV_CNTR_AGMT")
    private Character cdnSrvCntrAgmt;
    @Basic(optional = false)
    @Column(name = "ACH_AUTH")
    private Character achAuth;
    @Basic(optional = false)
    @Column(name = "PRCG_MOD")
    private Character prcgMod;
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

    public CrApplCcMrch() {
    }

    public CrApplCcMrch(String applNbr) {
        this.applNbr = applNbr;
    }

    public CrApplCcMrch(String applNbr, BigDecimal prjtdWklyVol, BigDecimal pgmLmt, BigDecimal rqstdRcrsLmt, String settlementFreq, String pgmBlngCyc, String pgmTerms, Character fnclStmt, Character artclOfIncrptn, Character custLstg, Character custAging, Character cdnSrvAgmt, Character cdnSrvCntrAgmt, Character achAuth, Character prcgMod, String mdyUsr, Date crtTs, String crtUsr, Date mdyTs) {
        this.applNbr = applNbr;
        this.prjtdWklyVol = prjtdWklyVol;
        this.pgmLmt = pgmLmt;
        this.rqstdRcrsLmt = rqstdRcrsLmt;
        this.settlementFreq = settlementFreq;
        this.pgmBlngCyc = pgmBlngCyc;
        this.pgmTerms = pgmTerms;
        this.fnclStmt = fnclStmt;
        this.artclOfIncrptn = artclOfIncrptn;
        this.custLstg = custLstg;
        this.custAging = custAging;
        this.cdnSrvAgmt = cdnSrvAgmt;
        this.cdnSrvCntrAgmt = cdnSrvCntrAgmt;
        this.achAuth = achAuth;
        this.prcgMod = prcgMod;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public BigDecimal getPrjtdWklyVol() {
        return prjtdWklyVol;
    }

    public void setPrjtdWklyVol(BigDecimal prjtdWklyVol) {
        this.prjtdWklyVol = prjtdWklyVol;
    }

    public BigDecimal getPgmLmt() {
        return pgmLmt;
    }

    public void setPgmLmt(BigDecimal pgmLmt) {
        this.pgmLmt = pgmLmt;
    }

    public BigDecimal getRqstdRcrsLmt() {
        return rqstdRcrsLmt;
    }

    public void setRqstdRcrsLmt(BigDecimal rqstdRcrsLmt) {
        this.rqstdRcrsLmt = rqstdRcrsLmt;
    }

    public String getSettlementFreq() {
        return settlementFreq;
    }

    public void setSettlementFreq(String settlementFreq) {
        this.settlementFreq = settlementFreq;
    }

    public String getPgmBlngCyc() {
        return pgmBlngCyc;
    }

    public void setPgmBlngCyc(String pgmBlngCyc) {
        this.pgmBlngCyc = pgmBlngCyc;
    }

    public String getPgmTerms() {
        return pgmTerms;
    }

    public void setPgmTerms(String pgmTerms) {
        this.pgmTerms = pgmTerms;
    }

    public Character getFnclStmt() {
        return fnclStmt;
    }

    public void setFnclStmt(Character fnclStmt) {
        this.fnclStmt = fnclStmt;
    }

    public Character getArtclOfIncrptn() {
        return artclOfIncrptn;
    }

    public void setArtclOfIncrptn(Character artclOfIncrptn) {
        this.artclOfIncrptn = artclOfIncrptn;
    }

    public Character getCustLstg() {
        return custLstg;
    }

    public void setCustLstg(Character custLstg) {
        this.custLstg = custLstg;
    }

    public Character getCustAging() {
        return custAging;
    }

    public void setCustAging(Character custAging) {
        this.custAging = custAging;
    }

    public Character getCdnSrvAgmt() {
        return cdnSrvAgmt;
    }

    public void setCdnSrvAgmt(Character cdnSrvAgmt) {
        this.cdnSrvAgmt = cdnSrvAgmt;
    }

    public Character getCdnSrvCntrAgmt() {
        return cdnSrvCntrAgmt;
    }

    public void setCdnSrvCntrAgmt(Character cdnSrvCntrAgmt) {
        this.cdnSrvCntrAgmt = cdnSrvCntrAgmt;
    }

    public Character getAchAuth() {
        return achAuth;
    }

    public void setAchAuth(Character achAuth) {
        this.achAuth = achAuth;
    }

    public Character getPrcgMod() {
        return prcgMod;
    }

    public void setPrcgMod(Character prcgMod) {
        this.prcgMod = prcgMod;
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
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplCcMrch)) {
            return false;
        }
        CrApplCcMrch other = (CrApplCcMrch) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplCcMrch[ applNbr=" + applNbr + " ]";
    }

}
