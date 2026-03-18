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
@Table(name = "MRCHDISB", catalog = "", schema = "DBO")
public class Mrchdisb implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchdisbPK mrchdisbPK;
    @Basic(optional = false)
    @Column(name = "CTL_NBR")
    private int ctlNbr;
    @Basic(optional = false)
    @Column(name = "CORP_CD")
    private String corpCd;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "MRCH_CD")
    private String mrchCd;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date trnsDt;
    @Basic(optional = false)
    @Column(name = "ACCT_NM")
    private String acctNm;
    @Basic(optional = false)
    @Column(name = "CUST_NM")
    private String custNm;
    @Basic(optional = false)
    @Column(name = "MC_ACQRR")
    private String mcAcqrr;
    @Basic(optional = false)
    @Column(name = "MC_ACPTR")
    private String mcAcptr;
    @Basic(optional = false)
    @Column(name = "MC_TERM")
    private String mcTerm;
    @Basic(optional = false)
    @Column(name = "MRCH_NM")
    private String mrchNm;
    @Basic(optional = false)
    @Column(name = "MRCH_ADDR1")
    private String mrchAddr1;
    @Basic(optional = false)
    @Column(name = "MRCH_ADDR2")
    private String mrchAddr2;
    @Basic(optional = false)
    @Column(name = "MRCH_CITY")
    private String mrchCity;
    @Basic(optional = false)
    @Column(name = "MRCH_ST")
    private String mrchSt;
    @Basic(optional = false)
    @Column(name = "MRCH_ZIP_CD")
    private String mrchZipCd;
    @Basic(optional = false)
    @Column(name = "MRCH_CHAIN")
    private String mrchChain;
    @Basic(optional = false)
    @Column(name = "MRCH_CURR_CD")
    private String mrchCurrCd;
    @Basic(optional = false)
    @Column(name = "SRCE_CURR_CD")
    private String srceCurrCd;
    @Basic(optional = false)
    @Column(name = "BLNG_CURR_CD")
    private String blngCurrCd;

    @Basic(optional = false)
    @Column(name = "CNV_RT")
    private BigDecimal cnvRt;
    @Basic(optional = false)
    @Column(name = "MKTR_ID")
    private String mktrId;
    @Basic(optional = false)
    @Column(name = "MKTR_NM")
    private String mktrNm;
    @Basic(optional = false)
    @Column(name = "MKTR_BLNG_ID")
    private String mktrBlngId;
    @Basic(optional = false)
    @Column(name = "PRD_GRP")
    private String prdGrp;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    @Basic(optional = false)
    @Column(name = "PRD_QTY")
    private BigDecimal prdQty;
    @Basic(optional = false)
    @Column(name = "UNIT_OF_MSR")
    private Character unitOfMsr;
    @Basic(optional = false)
    @Column(name = "DB_CR_FLG")
    private Character dbCrFlg;
    @Basic(optional = false)
    @Column(name = "PRD_NET_PRC")
    private BigDecimal prdNetPrc;
    @Basic(optional = false)
    @Column(name = "PRD_TL_CST")
    private BigDecimal prdTlCst;
    @Basic(optional = false)
    @Column(name = "DISC_REB_NET_AMT")
    private BigDecimal discRebNetAmt;
    @Basic(optional = false)
    @Column(name = "GRS_TL_CST")
    private BigDecimal grsTlCst;
    @Basic(optional = false)
    @Column(name = "DSBRSMNT_MTHD")
    private Character dsbrsmntMthd;
    @Basic(optional = false)
    @Column(name = "MKTR_BILLED_FLG")
    private Character mktrBilledFlg;
    @Basic(optional = false)
    @Column(name = "BILLED_DT")
    @Temporal(TemporalType.DATE)
    private Date billedDt;
    @Basic(optional = false)
    @Column(name = "ACCT_PAID_FLG")
    private Character acctPaidFlg;
    @Basic(optional = false)
    @Column(name = "PAID_DT")
    @Temporal(TemporalType.DATE)
    private Date paidDt;
    @Basic(optional = false)
    @Column(name = "DISC_REB_GRP")
    private String discRebGrp;
    @Basic(optional = false)
    @Column(name = "GRSPRC")
    private BigDecimal grsprc;
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
    @Column(name = "CFC_REVENUE_AMT")
    private BigDecimal cfcRevenueAmt;
    @Basic(optional = false)
    @Column(name = "GRP_DESC")
    private String grpDesc;
    @Basic(optional = false)
    @Column(name = "RT_AMT")
    private BigDecimal rtAmt;
    @Basic(optional = false)
    @Column(name = "RT_TYP_CD")
    private Character rtTypCd;
    @Basic(optional = false)
    @Column(name = "RT_MEASURE_CD")
    private Character rtMeasureCd;
    @Basic(optional = false)
    @Column(name = "MKTR_BILLED_AMT")
    private BigDecimal mktrBilledAmt;
    @Basic(optional = false)
    @Column(name = "MKTR_UP_RT")
    private BigDecimal mktrUpRt;
    @Basic(optional = false)
    @Column(name = "MKTR_UP_RT_TYP")
    private Character mktrUpRtTyp;

    public Mrchdisb() {
    }

    public Mrchdisb(MrchdisbPK mrchdisbPK) {
        this.mrchdisbPK = mrchdisbPK;
    }

    public Mrchdisb(MrchdisbPK mrchdisbPK, int ctlNbr, String corpCd, String acctCd, String custId, String mrchCd, String crdNbr, Date trnsDt, String acctNm, String custNm, String mcAcqrr, String mcAcptr, String mcTerm, String mrchNm, String mrchAddr1, String mrchAddr2, String mrchCity, String mrchSt, String mrchZipCd, String mrchChain, String mrchCurrCd, String srceCurrCd, String blngCurrCd, BigDecimal cnvRt, String mktrId, String mktrNm, String mktrBlngId, String prdGrp, String prdCd, BigDecimal prdQty, Character unitOfMsr, Character dbCrFlg, BigDecimal prdNetPrc, BigDecimal prdTlCst, BigDecimal discRebNetAmt, BigDecimal grsTlCst, Character dsbrsmntMthd, Character mktrBilledFlg, Date billedDt, Character acctPaidFlg, Date paidDt, String discRebGrp, BigDecimal grsprc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, BigDecimal cfcRevenueAmt, String grpDesc, BigDecimal rtAmt, Character rtTypCd, Character rtMeasureCd, BigDecimal mktrBilledAmt, BigDecimal mktrUpRt, Character mktrUpRtTyp) {
        this.mrchdisbPK = mrchdisbPK;
        this.ctlNbr = ctlNbr;
        this.corpCd = corpCd;
        this.acctCd = acctCd;
        this.custId = custId;
        this.mrchCd = mrchCd;
        this.crdNbr = crdNbr;
        this.trnsDt = trnsDt;
        this.acctNm = acctNm;
        this.custNm = custNm;
        this.mcAcqrr = mcAcqrr;
        this.mcAcptr = mcAcptr;
        this.mcTerm = mcTerm;
        this.mrchNm = mrchNm;
        this.mrchAddr1 = mrchAddr1;
        this.mrchAddr2 = mrchAddr2;
        this.mrchCity = mrchCity;
        this.mrchSt = mrchSt;
        this.mrchZipCd = mrchZipCd;
        this.mrchChain = mrchChain;
        this.mrchCurrCd = mrchCurrCd;
        this.srceCurrCd = srceCurrCd;
        this.blngCurrCd = blngCurrCd;
        this.cnvRt = cnvRt;
        this.mktrId = mktrId;
        this.mktrNm = mktrNm;
        this.mktrBlngId = mktrBlngId;
        this.prdGrp = prdGrp;
        this.prdCd = prdCd;
        this.prdQty = prdQty;
        this.unitOfMsr = unitOfMsr;
        this.dbCrFlg = dbCrFlg;
        this.prdNetPrc = prdNetPrc;
        this.prdTlCst = prdTlCst;
        this.discRebNetAmt = discRebNetAmt;
        this.grsTlCst = grsTlCst;
        this.dsbrsmntMthd = dsbrsmntMthd;
        this.mktrBilledFlg = mktrBilledFlg;
        this.billedDt = billedDt;
        this.acctPaidFlg = acctPaidFlg;
        this.paidDt = paidDt;
        this.discRebGrp = discRebGrp;
        this.grsprc = grsprc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.cfcRevenueAmt = cfcRevenueAmt;
        this.grpDesc = grpDesc;
        this.rtAmt = rtAmt;
        this.rtTypCd = rtTypCd;
        this.rtMeasureCd = rtMeasureCd;
        this.mktrBilledAmt = mktrBilledAmt;
        this.mktrUpRt = mktrUpRt;
        this.mktrUpRtTyp = mktrUpRtTyp;
    }

    public Mrchdisb(Date pstdDt, int trnsId, int seqNbr, Character discTyp) {
        this.mrchdisbPK = new MrchdisbPK(pstdDt, trnsId, seqNbr, discTyp);
    }

    public MrchdisbPK getMrchdisbPK() {
        return mrchdisbPK;
    }

    public void setMrchdisbPK(MrchdisbPK mrchdisbPK) {
        this.mrchdisbPK = mrchdisbPK;
    }

    public int getCtlNbr() {
        return ctlNbr;
    }

    public void setCtlNbr(int ctlNbr) {
        this.ctlNbr = ctlNbr;
    }

    public String getCorpCd() {
        return corpCd;
    }

    public void setCorpCd(String corpCd) {
        this.corpCd = corpCd;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getMrchCd() {
        return mrchCd;
    }

    public void setMrchCd(String mrchCd) {
        this.mrchCd = mrchCd;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Date getTrnsDt() {
        return trnsDt;
    }

    public void setTrnsDt(Date trnsDt) {
        this.trnsDt = trnsDt;
    }

    public String getAcctNm() {
        return acctNm;
    }

    public void setAcctNm(String acctNm) {
        this.acctNm = acctNm;
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getMcAcqrr() {
        return mcAcqrr;
    }

    public void setMcAcqrr(String mcAcqrr) {
        this.mcAcqrr = mcAcqrr;
    }

    public String getMcAcptr() {
        return mcAcptr;
    }

    public void setMcAcptr(String mcAcptr) {
        this.mcAcptr = mcAcptr;
    }

    public String getMcTerm() {
        return mcTerm;
    }

    public void setMcTerm(String mcTerm) {
        this.mcTerm = mcTerm;
    }

    public String getMrchNm() {
        return mrchNm;
    }

    public void setMrchNm(String mrchNm) {
        this.mrchNm = mrchNm;
    }

    public String getMrchAddr1() {
        return mrchAddr1;
    }

    public void setMrchAddr1(String mrchAddr1) {
        this.mrchAddr1 = mrchAddr1;
    }

    public String getMrchAddr2() {
        return mrchAddr2;
    }

    public void setMrchAddr2(String mrchAddr2) {
        this.mrchAddr2 = mrchAddr2;
    }

    public String getMrchCity() {
        return mrchCity;
    }

    public void setMrchCity(String mrchCity) {
        this.mrchCity = mrchCity;
    }

    public String getMrchSt() {
        return mrchSt;
    }

    public void setMrchSt(String mrchSt) {
        this.mrchSt = mrchSt;
    }

    public String getMrchZipCd() {
        return mrchZipCd;
    }

    public void setMrchZipCd(String mrchZipCd) {
        this.mrchZipCd = mrchZipCd;
    }

    public String getMrchChain() {
        return mrchChain;
    }

    public void setMrchChain(String mrchChain) {
        this.mrchChain = mrchChain;
    }

    public String getMrchCurrCd() {
        return mrchCurrCd;
    }

    public void setMrchCurrCd(String mrchCurrCd) {
        this.mrchCurrCd = mrchCurrCd;
    }

    public String getSrceCurrCd() {
        return srceCurrCd;
    }

    public void setSrceCurrCd(String srceCurrCd) {
        this.srceCurrCd = srceCurrCd;
    }

    public String getBlngCurrCd() {
        return blngCurrCd;
    }

    public void setBlngCurrCd(String blngCurrCd) {
        this.blngCurrCd = blngCurrCd;
    }

    public BigDecimal getCnvRt() {
        return cnvRt;
    }

    public void setCnvRt(BigDecimal cnvRt) {
        this.cnvRt = cnvRt;
    }

    public String getMktrId() {
        return mktrId;
    }

    public void setMktrId(String mktrId) {
        this.mktrId = mktrId;
    }

    public String getMktrNm() {
        return mktrNm;
    }

    public void setMktrNm(String mktrNm) {
        this.mktrNm = mktrNm;
    }

    public String getMktrBlngId() {
        return mktrBlngId;
    }

    public void setMktrBlngId(String mktrBlngId) {
        this.mktrBlngId = mktrBlngId;
    }

    public String getPrdGrp() {
        return prdGrp;
    }

    public void setPrdGrp(String prdGrp) {
        this.prdGrp = prdGrp;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public BigDecimal getPrdQty() {
        return prdQty;
    }

    public void setPrdQty(BigDecimal prdQty) {
        this.prdQty = prdQty;
    }

    public Character getUnitOfMsr() {
        return unitOfMsr;
    }

    public void setUnitOfMsr(Character unitOfMsr) {
        this.unitOfMsr = unitOfMsr;
    }

    public Character getDbCrFlg() {
        return dbCrFlg;
    }

    public void setDbCrFlg(Character dbCrFlg) {
        this.dbCrFlg = dbCrFlg;
    }

    public BigDecimal getPrdNetPrc() {
        return prdNetPrc;
    }

    public void setPrdNetPrc(BigDecimal prdNetPrc) {
        this.prdNetPrc = prdNetPrc;
    }

    public BigDecimal getPrdTlCst() {
        return prdTlCst;
    }

    public void setPrdTlCst(BigDecimal prdTlCst) {
        this.prdTlCst = prdTlCst;
    }

    public BigDecimal getDiscRebNetAmt() {
        return discRebNetAmt;
    }

    public void setDiscRebNetAmt(BigDecimal discRebNetAmt) {
        this.discRebNetAmt = discRebNetAmt;
    }

    public BigDecimal getGrsTlCst() {
        return grsTlCst;
    }

    public void setGrsTlCst(BigDecimal grsTlCst) {
        this.grsTlCst = grsTlCst;
    }

    public Character getDsbrsmntMthd() {
        return dsbrsmntMthd;
    }

    public void setDsbrsmntMthd(Character dsbrsmntMthd) {
        this.dsbrsmntMthd = dsbrsmntMthd;
    }

    public Character getMktrBilledFlg() {
        return mktrBilledFlg;
    }

    public void setMktrBilledFlg(Character mktrBilledFlg) {
        this.mktrBilledFlg = mktrBilledFlg;
    }

    public Date getBilledDt() {
        return billedDt;
    }

    public void setBilledDt(Date billedDt) {
        this.billedDt = billedDt;
    }

    public Character getAcctPaidFlg() {
        return acctPaidFlg;
    }

    public void setAcctPaidFlg(Character acctPaidFlg) {
        this.acctPaidFlg = acctPaidFlg;
    }

    public Date getPaidDt() {
        return paidDt;
    }

    public void setPaidDt(Date paidDt) {
        this.paidDt = paidDt;
    }

    public String getDiscRebGrp() {
        return discRebGrp;
    }

    public void setDiscRebGrp(String discRebGrp) {
        this.discRebGrp = discRebGrp;
    }

    public BigDecimal getGrsprc() {
        return grsprc;
    }

    public void setGrsprc(BigDecimal grsprc) {
        this.grsprc = grsprc;
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

    public BigDecimal getCfcRevenueAmt() {
        return cfcRevenueAmt;
    }

    public void setCfcRevenueAmt(BigDecimal cfcRevenueAmt) {
        this.cfcRevenueAmt = cfcRevenueAmt;
    }

    public String getGrpDesc() {
        return grpDesc;
    }

    public void setGrpDesc(String grpDesc) {
        this.grpDesc = grpDesc;
    }

    public BigDecimal getRtAmt() {
        return rtAmt;
    }

    public void setRtAmt(BigDecimal rtAmt) {
        this.rtAmt = rtAmt;
    }

    public Character getRtTypCd() {
        return rtTypCd;
    }

    public void setRtTypCd(Character rtTypCd) {
        this.rtTypCd = rtTypCd;
    }

    public Character getRtMeasureCd() {
        return rtMeasureCd;
    }

    public void setRtMeasureCd(Character rtMeasureCd) {
        this.rtMeasureCd = rtMeasureCd;
    }

    public BigDecimal getMktrBilledAmt() {
        return mktrBilledAmt;
    }

    public void setMktrBilledAmt(BigDecimal mktrBilledAmt) {
        this.mktrBilledAmt = mktrBilledAmt;
    }

    public BigDecimal getMktrUpRt() {
        return mktrUpRt;
    }

    public void setMktrUpRt(BigDecimal mktrUpRt) {
        this.mktrUpRt = mktrUpRt;
    }

    public Character getMktrUpRtTyp() {
        return mktrUpRtTyp;
    }

    public void setMktrUpRtTyp(Character mktrUpRtTyp) {
        this.mktrUpRtTyp = mktrUpRtTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mrchdisbPK != null ? mrchdisbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Mrchdisb)) {
            return false;
        }
        Mrchdisb other = (Mrchdisb) object;
        if ((this.mrchdisbPK == null && other.mrchdisbPK != null) || (this.mrchdisbPK != null && !this.mrchdisbPK.equals(other.mrchdisbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Mrchdisb[ mrchdisbPK=" + mrchdisbPK + " ]";
    }

}
