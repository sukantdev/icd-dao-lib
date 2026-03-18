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
@Table(name = "SMALL_FLEET_ACH", catalog = "", schema = "DBO")
public class SmallFleetAch implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SmallFleetAchPK smallFleetAchPK;
    @Basic(optional = false)
    @Column(name = "BNK_NM")
    private String bnkNm;
    @Basic(optional = false)
    @Column(name = "BNK_ACCT_NBR")
    private String bnkAcctNbr;
    @Basic(optional = false)
    @Column(name = "BNK_RTNG_NBR")
    private String bnkRtngNbr;
    @Basic(optional = false)
    @Column(name = "PMT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pmtTs;

    @Basic(optional = false)
    @Column(name = "PMT_AMT")
    private BigDecimal pmtAmt;
    @Basic(optional = false)
    @Column(name = "AVL_DT")
    @Temporal(TemporalType.DATE)
    private Date avlDt;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private Character statCd;
    @Basic(optional = false)
    @Column(name = "PMT_DLY_CNT")
    private short pmtDlyCnt;
    @Basic(optional = false)
    @Column(name = "PMT_MTHD_CD")
    private String pmtMthdCd;
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
    @Column(name = "MEMO_TXT")
    private String memoTxt;
    @Basic(optional = false)
    @Column(name = "IMMED_FND_TRNSFR_IND")
    private Character immedFndTrnsfrInd;
    @Basic(optional = false)
    @Column(name = "TRACE_ID")
    private String traceId;
    @Basic(optional = false)
    @Column(name = "DAYS_DLY")
    private short daysDly;
    @Basic(optional = false)
    @Column(name = "TRNS_FEE_AMT")
    private BigDecimal trnsFeeAmt;
    @Basic(optional = false)
    @Column(name = "LEGY_FLG")
    private Character legyFlg;

    public SmallFleetAch() {
    }

    public SmallFleetAch(SmallFleetAchPK smallFleetAchPK) {
        this.smallFleetAchPK = smallFleetAchPK;
    }

    public SmallFleetAch(SmallFleetAchPK smallFleetAchPK, String bnkNm, String bnkAcctNbr, String bnkRtngNbr, Date pmtTs, BigDecimal pmtAmt, Date avlDt, Character statCd, short pmtDlyCnt, String pmtMthdCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String memoTxt, Character immedFndTrnsfrInd, String traceId, short daysDly, BigDecimal trnsFeeAmt, Character legyFlg) {
        this.smallFleetAchPK = smallFleetAchPK;
        this.bnkNm = bnkNm;
        this.bnkAcctNbr = bnkAcctNbr;
        this.bnkRtngNbr = bnkRtngNbr;
        this.pmtTs = pmtTs;
        this.pmtAmt = pmtAmt;
        this.avlDt = avlDt;
        this.statCd = statCd;
        this.pmtDlyCnt = pmtDlyCnt;
        this.pmtMthdCd = pmtMthdCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.memoTxt = memoTxt;
        this.immedFndTrnsfrInd = immedFndTrnsfrInd;
        this.traceId = traceId;
        this.daysDly = daysDly;
        this.trnsFeeAmt = trnsFeeAmt;
        this.legyFlg = legyFlg;
    }

    public SmallFleetAch(String acctCd, String cnfrmtnPmtId, Date busDt) {
        this.smallFleetAchPK = new SmallFleetAchPK(acctCd, cnfrmtnPmtId, busDt);
    }

    public SmallFleetAchPK getSmallFleetAchPK() {
        return smallFleetAchPK;
    }

    public void setSmallFleetAchPK(SmallFleetAchPK smallFleetAchPK) {
        this.smallFleetAchPK = smallFleetAchPK;
    }

    public String getBnkNm() {
        return bnkNm;
    }

    public void setBnkNm(String bnkNm) {
        this.bnkNm = bnkNm;
    }

    public String getBnkAcctNbr() {
        return bnkAcctNbr;
    }

    public void setBnkAcctNbr(String bnkAcctNbr) {
        this.bnkAcctNbr = bnkAcctNbr;
    }

    public String getBnkRtngNbr() {
        return bnkRtngNbr;
    }

    public void setBnkRtngNbr(String bnkRtngNbr) {
        this.bnkRtngNbr = bnkRtngNbr;
    }

    public Date getPmtTs() {
        return pmtTs;
    }

    public void setPmtTs(Date pmtTs) {
        this.pmtTs = pmtTs;
    }

    public BigDecimal getPmtAmt() {
        return pmtAmt;
    }

    public void setPmtAmt(BigDecimal pmtAmt) {
        this.pmtAmt = pmtAmt;
    }

    public Date getAvlDt() {
        return avlDt;
    }

    public void setAvlDt(Date avlDt) {
        this.avlDt = avlDt;
    }

    public Character getStatCd() {
        return statCd;
    }

    public void setStatCd(Character statCd) {
        this.statCd = statCd;
    }

    public short getPmtDlyCnt() {
        return pmtDlyCnt;
    }

    public void setPmtDlyCnt(short pmtDlyCnt) {
        this.pmtDlyCnt = pmtDlyCnt;
    }

    public String getPmtMthdCd() {
        return pmtMthdCd;
    }

    public void setPmtMthdCd(String pmtMthdCd) {
        this.pmtMthdCd = pmtMthdCd;
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

    public String getMemoTxt() {
        return memoTxt;
    }

    public void setMemoTxt(String memoTxt) {
        this.memoTxt = memoTxt;
    }

    public Character getImmedFndTrnsfrInd() {
        return immedFndTrnsfrInd;
    }

    public void setImmedFndTrnsfrInd(Character immedFndTrnsfrInd) {
        this.immedFndTrnsfrInd = immedFndTrnsfrInd;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public short getDaysDly() {
        return daysDly;
    }

    public void setDaysDly(short daysDly) {
        this.daysDly = daysDly;
    }

    public BigDecimal getTrnsFeeAmt() {
        return trnsFeeAmt;
    }

    public void setTrnsFeeAmt(BigDecimal trnsFeeAmt) {
        this.trnsFeeAmt = trnsFeeAmt;
    }

    public Character getLegyFlg() {
        return legyFlg;
    }

    public void setLegyFlg(Character legyFlg) {
        this.legyFlg = legyFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (smallFleetAchPK != null ? smallFleetAchPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof SmallFleetAch)) {
            return false;
        }
        SmallFleetAch other = (SmallFleetAch) object;
        if ((this.smallFleetAchPK == null && other.smallFleetAchPK != null) || (this.smallFleetAchPK != null && !this.smallFleetAchPK.equals(other.smallFleetAchPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SmallFleetAch[ smallFleetAchPK=" + smallFleetAchPK + " ]";
    }

}
