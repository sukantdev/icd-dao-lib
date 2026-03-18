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
@Table(name = "INV_PH", catalog = "", schema = "DBO")
public class InvPh implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPhPK invPhPK;
    @Basic(optional = false)
    @Column(name = "PH_CR_OR_DB")
    private Character phCrOrDb;
    @Basic(optional = false)
    @Column(name = "BLNG_TYP")
    private Character blngTyp;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    @Basic(optional = false)
    @Column(name = "PH_NBR_CLD")
    private String phNbrCld;
    @Basic(optional = false)
    @Column(name = "CITY_CLD")
    private String cityCld;
    @Basic(optional = false)
    @Column(name = "ST_CLD")
    private String stCld;

    @Basic(optional = false)
    @Column(name = "DRTN_OF_CALL")
    private BigDecimal drtnOfCall;
    @Basic(optional = false)
    @Column(name = "CALL_RATE_PIRD")
    private Character callRatePird;
    @Basic(optional = false)
    @Column(name = "PH_CHRG")
    private BigDecimal phChrg;
    @Basic(optional = false)
    @Column(name = "SCHG_AMT")
    private BigDecimal schgAmt;
    @Basic(optional = false)
    @Column(name = "FED_TAX_AMT")
    private BigDecimal fedTaxAmt;
    @Basic(optional = false)
    @Column(name = "ST_TAX_AMT")
    private BigDecimal stTaxAmt;
    @Basic(optional = false)
    @Column(name = "LCL_TAX_AMT")
    private BigDecimal lclTaxAmt;
    @Basic(optional = false)
    @Column(name = "TOT_USAGE_CHRG_AMT")
    private BigDecimal totUsageChrgAmt;
    @Basic(optional = false)
    @Column(name = "SCNDY_CRD_NBR")
    private String scndyCrdNbr;
    @Basic(optional = false)
    @Column(name = "TAX_EXPT_STAT")
    private Character taxExptStat;
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

    public InvPh() {
    }

    public InvPh(InvPhPK invPhPK) {
        this.invPhPK = invPhPK;
    }

    public InvPh(InvPhPK invPhPK, Character phCrOrDb, Character blngTyp, String prdCd, String phNbrCld, String cityCld, String stCld, BigDecimal drtnOfCall, Character callRatePird, BigDecimal phChrg, BigDecimal schgAmt, BigDecimal fedTaxAmt, BigDecimal stTaxAmt, BigDecimal lclTaxAmt, BigDecimal totUsageChrgAmt, String scndyCrdNbr, Character taxExptStat, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invPhPK = invPhPK;
        this.phCrOrDb = phCrOrDb;
        this.blngTyp = blngTyp;
        this.prdCd = prdCd;
        this.phNbrCld = phNbrCld;
        this.cityCld = cityCld;
        this.stCld = stCld;
        this.drtnOfCall = drtnOfCall;
        this.callRatePird = callRatePird;
        this.phChrg = phChrg;
        this.schgAmt = schgAmt;
        this.fedTaxAmt = fedTaxAmt;
        this.stTaxAmt = stTaxAmt;
        this.lclTaxAmt = lclTaxAmt;
        this.totUsageChrgAmt = totUsageChrgAmt;
        this.scndyCrdNbr = scndyCrdNbr;
        this.taxExptStat = taxExptStat;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvPh(Date pstdDt, int trnsId) {
        this.invPhPK = new InvPhPK(pstdDt, trnsId);
    }

    public InvPhPK getInvPhPK() {
        return invPhPK;
    }

    public void setInvPhPK(InvPhPK invPhPK) {
        this.invPhPK = invPhPK;
    }

    public Character getPhCrOrDb() {
        return phCrOrDb;
    }

    public void setPhCrOrDb(Character phCrOrDb) {
        this.phCrOrDb = phCrOrDb;
    }

    public Character getBlngTyp() {
        return blngTyp;
    }

    public void setBlngTyp(Character blngTyp) {
        this.blngTyp = blngTyp;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public String getPhNbrCld() {
        return phNbrCld;
    }

    public void setPhNbrCld(String phNbrCld) {
        this.phNbrCld = phNbrCld;
    }

    public String getCityCld() {
        return cityCld;
    }

    public void setCityCld(String cityCld) {
        this.cityCld = cityCld;
    }

    public String getStCld() {
        return stCld;
    }

    public void setStCld(String stCld) {
        this.stCld = stCld;
    }

    public BigDecimal getDrtnOfCall() {
        return drtnOfCall;
    }

    public void setDrtnOfCall(BigDecimal drtnOfCall) {
        this.drtnOfCall = drtnOfCall;
    }

    public Character getCallRatePird() {
        return callRatePird;
    }

    public void setCallRatePird(Character callRatePird) {
        this.callRatePird = callRatePird;
    }

    public BigDecimal getPhChrg() {
        return phChrg;
    }

    public void setPhChrg(BigDecimal phChrg) {
        this.phChrg = phChrg;
    }

    public BigDecimal getSchgAmt() {
        return schgAmt;
    }

    public void setSchgAmt(BigDecimal schgAmt) {
        this.schgAmt = schgAmt;
    }

    public BigDecimal getFedTaxAmt() {
        return fedTaxAmt;
    }

    public void setFedTaxAmt(BigDecimal fedTaxAmt) {
        this.fedTaxAmt = fedTaxAmt;
    }

    public BigDecimal getStTaxAmt() {
        return stTaxAmt;
    }

    public void setStTaxAmt(BigDecimal stTaxAmt) {
        this.stTaxAmt = stTaxAmt;
    }

    public BigDecimal getLclTaxAmt() {
        return lclTaxAmt;
    }

    public void setLclTaxAmt(BigDecimal lclTaxAmt) {
        this.lclTaxAmt = lclTaxAmt;
    }

    public BigDecimal getTotUsageChrgAmt() {
        return totUsageChrgAmt;
    }

    public void setTotUsageChrgAmt(BigDecimal totUsageChrgAmt) {
        this.totUsageChrgAmt = totUsageChrgAmt;
    }

    public String getScndyCrdNbr() {
        return scndyCrdNbr;
    }

    public void setScndyCrdNbr(String scndyCrdNbr) {
        this.scndyCrdNbr = scndyCrdNbr;
    }

    public Character getTaxExptStat() {
        return taxExptStat;
    }

    public void setTaxExptStat(Character taxExptStat) {
        this.taxExptStat = taxExptStat;
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
        hash += (invPhPK != null ? invPhPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvPh)) {
            return false;
        }
        InvPh other = (InvPh) object;
        if ((this.invPhPK == null && other.invPhPK != null) || (this.invPhPK != null && !this.invPhPK.equals(other.invPhPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvPh[ invPhPK=" + invPhPK + " ]";
    }

}
