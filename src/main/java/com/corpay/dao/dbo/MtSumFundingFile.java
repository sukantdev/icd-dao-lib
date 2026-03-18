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
@Table(name = "MT_SUM_FUNDING_FILE", catalog = "", schema = "DBO")
public class MtSumFundingFile implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MtSumFundingFilePK mtSumFundingFilePK;
    @Basic(optional = false)
    @Column(name = "BUSS_DT")
    @Temporal(TemporalType.DATE)
    private Date bussDt;
    @Basic(optional = false)
    @Column(name = "BUSS_TM")
    @Temporal(TemporalType.TIME)
    private Date bussTm;

    @Basic(optional = false)
    @Column(name = "AMT")
    private BigDecimal amt;
    @Basic(optional = false)
    @Column(name = "CNT")
    private int cnt;
    @Basic(optional = false)
    @Column(name = "FUND_METH")
    private Character fundMeth;
    @Basic(optional = false)
    @Column(name = "CORP_CD")
    private String corpCd;
    @Basic(optional = false)
    @Column(name = "PMT_TRCE_NBR")
    private String pmtTrceNbr;
    @Basic(optional = false)
    @Column(name = "FUNDING_STAT")
    private Character fundingStat;
    @Basic(optional = false)
    @Column(name = "CUST_BTCH_ID")
    private String custBtchId;
    @Basic(optional = false)
    @Column(name = "DESC")
    private String desc;
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
    @Column(name = "FUND_CONFIRM_DT")
    @Temporal(TemporalType.DATE)
    private Date fundConfirmDt;
    @Basic(optional = false)
    @Column(name = "FUND_CONFIRM_TM")
    @Temporal(TemporalType.TIME)
    private Date fundConfirmTm;
    @Basic(optional = false)
    @Column(name = "FUND_NTC_SENT_FLG")
    private Character fundNtcSentFlg;

    public MtSumFundingFile() {
    }

    public MtSumFundingFile(MtSumFundingFilePK mtSumFundingFilePK) {
        this.mtSumFundingFilePK = mtSumFundingFilePK;
    }

    public MtSumFundingFile(MtSumFundingFilePK mtSumFundingFilePK, Date bussDt, Date bussTm, BigDecimal amt, int cnt, Character fundMeth, String corpCd, String pmtTrceNbr, Character fundingStat, String custBtchId, String desc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Date fundConfirmDt, Date fundConfirmTm, Character fundNtcSentFlg) {
        this.mtSumFundingFilePK = mtSumFundingFilePK;
        this.bussDt = bussDt;
        this.bussTm = bussTm;
        this.amt = amt;
        this.cnt = cnt;
        this.fundMeth = fundMeth;
        this.corpCd = corpCd;
        this.pmtTrceNbr = pmtTrceNbr;
        this.fundingStat = fundingStat;
        this.custBtchId = custBtchId;
        this.desc = desc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.fundConfirmDt = fundConfirmDt;
        this.fundConfirmTm = fundConfirmTm;
        this.fundNtcSentFlg = fundNtcSentFlg;
    }

    public MtSumFundingFile(String acctNbr, String custNbr, String trnsTyp, int fileNbr) {
        this.mtSumFundingFilePK = new MtSumFundingFilePK(acctNbr, custNbr, trnsTyp, fileNbr);
    }

    public MtSumFundingFilePK getMtSumFundingFilePK() {
        return mtSumFundingFilePK;
    }

    public void setMtSumFundingFilePK(MtSumFundingFilePK mtSumFundingFilePK) {
        this.mtSumFundingFilePK = mtSumFundingFilePK;
    }

    public Date getBussDt() {
        return bussDt;
    }

    public void setBussDt(Date bussDt) {
        this.bussDt = bussDt;
    }

    public Date getBussTm() {
        return bussTm;
    }

    public void setBussTm(Date bussTm) {
        this.bussTm = bussTm;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public Character getFundMeth() {
        return fundMeth;
    }

    public void setFundMeth(Character fundMeth) {
        this.fundMeth = fundMeth;
    }

    public String getCorpCd() {
        return corpCd;
    }

    public void setCorpCd(String corpCd) {
        this.corpCd = corpCd;
    }

    public String getPmtTrceNbr() {
        return pmtTrceNbr;
    }

    public void setPmtTrceNbr(String pmtTrceNbr) {
        this.pmtTrceNbr = pmtTrceNbr;
    }

    public Character getFundingStat() {
        return fundingStat;
    }

    public void setFundingStat(Character fundingStat) {
        this.fundingStat = fundingStat;
    }

    public String getCustBtchId() {
        return custBtchId;
    }

    public void setCustBtchId(String custBtchId) {
        this.custBtchId = custBtchId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public Date getFundConfirmDt() {
        return fundConfirmDt;
    }

    public void setFundConfirmDt(Date fundConfirmDt) {
        this.fundConfirmDt = fundConfirmDt;
    }

    public Date getFundConfirmTm() {
        return fundConfirmTm;
    }

    public void setFundConfirmTm(Date fundConfirmTm) {
        this.fundConfirmTm = fundConfirmTm;
    }

    public Character getFundNtcSentFlg() {
        return fundNtcSentFlg;
    }

    public void setFundNtcSentFlg(Character fundNtcSentFlg) {
        this.fundNtcSentFlg = fundNtcSentFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtSumFundingFilePK != null ? mtSumFundingFilePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MtSumFundingFile)) {
            return false;
        }
        MtSumFundingFile other = (MtSumFundingFile) object;
        if ((this.mtSumFundingFilePK == null && other.mtSumFundingFilePK != null) || (this.mtSumFundingFilePK != null && !this.mtSumFundingFilePK.equals(other.mtSumFundingFilePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MtSumFundingFile[ mtSumFundingFilePK=" + mtSumFundingFilePK + " ]";
    }

}
