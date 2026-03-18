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
@Table(name = "PRD_TRNSLNK", catalog = "", schema = "DBO")
public class PrdTrnslnk implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdTrnslnkPK prdTrnslnkPK;
    @Basic(optional = false)
    @Column(name = "NBR_UNITS")
    private int nbrUnits;
    @Basic(optional = false)
    @Column(name = "SRV_CNTR_CD")
    private String srvCntrCd;
    @Basic(optional = false)
    @Column(name = "CHAIN_CD")
    private String chainCd;
    @Basic(optional = false)
    @Column(name = "LOC_CNT")
    private int locCnt;

    @Basic(optional = false)
    @Column(name = "RSRC_CR_LMT")
    private BigDecimal rsrcCrLmt;
    @Basic(optional = false)
    @Column(name = "TRTOY_CD")
    private String trtoyCd;
    @Basic(optional = false)
    @Column(name = "RCRS_FLG")
    private Character rcrsFlg;
    @Basic(optional = false)
    @Column(name = "PMT_MTHD")
    private Character pmtMthd;
    @Basic(optional = false)
    @Column(name = "PMT_FREQ")
    private Character pmtFreq;
    @Basic(optional = false)
    @Column(name = "PMT_DY")
    private Character pmtDy;
    @Basic(optional = false)
    @Column(name = "BLNG_FREUENCY")
    private Character blngFreuency;
    @Basic(optional = false)
    @Column(name = "BLNG_DY")
    private Character blngDy;
    @Basic(optional = false)
    @Column(name = "RT_FIXED")
    private BigDecimal rtFixed;
    @Basic(optional = false)
    @Column(name = "RT_PCTGE")
    private BigDecimal rtPctge;
    @Basic(optional = false)
    @Column(name = "TS_NM")
    private String tsNm;
    @Basic(optional = false)
    @Column(name = "RPTNG_FLGS")
    private short rptngFlgs;
    @Basic(optional = false)
    @Column(name = "VIEW_EACH_FLG")
    private Character viewEachFlg;
    @Basic(optional = false)
    @Column(name = "SRV_PRF_FLG")
    private Character srvPrfFlg;
    @Basic(optional = false)
    @Column(name = "STUP_FEE_FLG")
    private Character stupFeeFlg;
    @Basic(optional = false)
    @Column(name = "STUP_FEE_AMT")
    private BigDecimal stupFeeAmt;
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

    public PrdTrnslnk() {
    }

    public PrdTrnslnk(PrdTrnslnkPK prdTrnslnkPK) {
        this.prdTrnslnkPK = prdTrnslnkPK;
    }

    public PrdTrnslnk(PrdTrnslnkPK prdTrnslnkPK, int nbrUnits, String srvCntrCd, String chainCd, int locCnt, BigDecimal rsrcCrLmt, String trtoyCd, Character rcrsFlg, Character pmtMthd, Character pmtFreq, Character pmtDy, Character blngFreuency, Character blngDy, BigDecimal rtFixed, BigDecimal rtPctge, String tsNm, short rptngFlgs, Character viewEachFlg, Character srvPrfFlg, Character stupFeeFlg, BigDecimal stupFeeAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdTrnslnkPK = prdTrnslnkPK;
        this.nbrUnits = nbrUnits;
        this.srvCntrCd = srvCntrCd;
        this.chainCd = chainCd;
        this.locCnt = locCnt;
        this.rsrcCrLmt = rsrcCrLmt;
        this.trtoyCd = trtoyCd;
        this.rcrsFlg = rcrsFlg;
        this.pmtMthd = pmtMthd;
        this.pmtFreq = pmtFreq;
        this.pmtDy = pmtDy;
        this.blngFreuency = blngFreuency;
        this.blngDy = blngDy;
        this.rtFixed = rtFixed;
        this.rtPctge = rtPctge;
        this.tsNm = tsNm;
        this.rptngFlgs = rptngFlgs;
        this.viewEachFlg = viewEachFlg;
        this.srvPrfFlg = srvPrfFlg;
        this.stupFeeFlg = stupFeeFlg;
        this.stupFeeAmt = stupFeeAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdTrnslnk(String applNbr, String childTyp) {
        this.prdTrnslnkPK = new PrdTrnslnkPK(applNbr, childTyp);
    }

    public PrdTrnslnkPK getPrdTrnslnkPK() {
        return prdTrnslnkPK;
    }

    public void setPrdTrnslnkPK(PrdTrnslnkPK prdTrnslnkPK) {
        this.prdTrnslnkPK = prdTrnslnkPK;
    }

    public int getNbrUnits() {
        return nbrUnits;
    }

    public void setNbrUnits(int nbrUnits) {
        this.nbrUnits = nbrUnits;
    }

    public String getSrvCntrCd() {
        return srvCntrCd;
    }

    public void setSrvCntrCd(String srvCntrCd) {
        this.srvCntrCd = srvCntrCd;
    }

    public String getChainCd() {
        return chainCd;
    }

    public void setChainCd(String chainCd) {
        this.chainCd = chainCd;
    }

    public int getLocCnt() {
        return locCnt;
    }

    public void setLocCnt(int locCnt) {
        this.locCnt = locCnt;
    }

    public BigDecimal getRsrcCrLmt() {
        return rsrcCrLmt;
    }

    public void setRsrcCrLmt(BigDecimal rsrcCrLmt) {
        this.rsrcCrLmt = rsrcCrLmt;
    }

    public String getTrtoyCd() {
        return trtoyCd;
    }

    public void setTrtoyCd(String trtoyCd) {
        this.trtoyCd = trtoyCd;
    }

    public Character getRcrsFlg() {
        return rcrsFlg;
    }

    public void setRcrsFlg(Character rcrsFlg) {
        this.rcrsFlg = rcrsFlg;
    }

    public Character getPmtMthd() {
        return pmtMthd;
    }

    public void setPmtMthd(Character pmtMthd) {
        this.pmtMthd = pmtMthd;
    }

    public Character getPmtFreq() {
        return pmtFreq;
    }

    public void setPmtFreq(Character pmtFreq) {
        this.pmtFreq = pmtFreq;
    }

    public Character getPmtDy() {
        return pmtDy;
    }

    public void setPmtDy(Character pmtDy) {
        this.pmtDy = pmtDy;
    }

    public Character getBlngFreuency() {
        return blngFreuency;
    }

    public void setBlngFreuency(Character blngFreuency) {
        this.blngFreuency = blngFreuency;
    }

    public Character getBlngDy() {
        return blngDy;
    }

    public void setBlngDy(Character blngDy) {
        this.blngDy = blngDy;
    }

    public BigDecimal getRtFixed() {
        return rtFixed;
    }

    public void setRtFixed(BigDecimal rtFixed) {
        this.rtFixed = rtFixed;
    }

    public BigDecimal getRtPctge() {
        return rtPctge;
    }

    public void setRtPctge(BigDecimal rtPctge) {
        this.rtPctge = rtPctge;
    }

    public String getTsNm() {
        return tsNm;
    }

    public void setTsNm(String tsNm) {
        this.tsNm = tsNm;
    }

    public short getRptngFlgs() {
        return rptngFlgs;
    }

    public void setRptngFlgs(short rptngFlgs) {
        this.rptngFlgs = rptngFlgs;
    }

    public Character getViewEachFlg() {
        return viewEachFlg;
    }

    public void setViewEachFlg(Character viewEachFlg) {
        this.viewEachFlg = viewEachFlg;
    }

    public Character getSrvPrfFlg() {
        return srvPrfFlg;
    }

    public void setSrvPrfFlg(Character srvPrfFlg) {
        this.srvPrfFlg = srvPrfFlg;
    }

    public Character getStupFeeFlg() {
        return stupFeeFlg;
    }

    public void setStupFeeFlg(Character stupFeeFlg) {
        this.stupFeeFlg = stupFeeFlg;
    }

    public BigDecimal getStupFeeAmt() {
        return stupFeeAmt;
    }

    public void setStupFeeAmt(BigDecimal stupFeeAmt) {
        this.stupFeeAmt = stupFeeAmt;
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
        hash += (prdTrnslnkPK != null ? prdTrnslnkPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdTrnslnk)) {
            return false;
        }
        PrdTrnslnk other = (PrdTrnslnk) object;
        if ((this.prdTrnslnkPK == null && other.prdTrnslnkPK != null) || (this.prdTrnslnkPK != null && !this.prdTrnslnkPK.equals(other.prdTrnslnkPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTrnslnk[ prdTrnslnkPK=" + prdTrnslnkPK + " ]";
    }

}
