package com.corpay.dao.cxxcow;

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
@Table(name = "MC_STLMT_DTL", catalog = "", schema = "CXXCOW")
public class McStlmtDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McStlmtDtlPK mcStlmtDtlPK;
    @Basic(optional = false)
    @Column(name = "DTL_CDHOLD_ACC")
    private String dtlCdholdAcc;
    @Basic(optional = false)
    @Column(name = "DTL_ACQ_REF_NO")
    private String dtlAcqRefNo;
    @Basic(optional = false)
    @Column(name = "DTL_TRAN_DT_RAW")
    private int dtlTranDtRaw;
    @Basic(optional = false)
    @Column(name = "DTL_REC_CD_TYPE")
    private Character dtlRecCdType;
    @Basic(optional = false)
    @Column(name = "DTL_REC_CD_TRANS")
    private short dtlRecCdTrans;
    @Basic(optional = false)
    @Column(name = "DTL_AMT_TRAN_CURR")
    private int dtlAmtTranCurr;

    @Basic(optional = false)
    @Column(name = "DTL0AMT_TRAN_CURR")
    private BigDecimal dtl0amtTranCurr;
    @Basic(optional = false)
    @Column(name = "DTL_AUTH_CD")
    private String dtlAuthCd;
    @Basic(optional = false)
    @Column(name = "DTL_TRANS_AMT_CUR")
    private int dtlTransAmtCur;
    @Basic(optional = false)
    @Column(name = "DTL0TRANS_AMT_CUR")
    private BigDecimal dtl0transAmtCur;
    @Basic(optional = false)
    @Column(name = "DTL_TRANS_CURR_EXP")
    private Character dtlTransCurrExp;
    @Basic(optional = false)
    @Column(name = "DTL_TRANS_CURR_CD")
    private String dtlTransCurrCd;
    @Basic(optional = false)
    @Column(name = "DTL_CNVERSION_DT")
    private short dtlCnversionDt;
    @Basic(optional = false)
    @Column(name = "DTL_MERCH_ADD_CITY")
    private String dtlMerchAddCity;
    @Basic(optional = false)
    @Column(name = "DTL_STATE_CNTRY_CD")
    private String dtlStateCntryCd;
    @Basic(optional = false)
    @Column(name = "DTL_DETAIL_LIST")
    private String dtlDetailList;
    @Basic(optional = false)
    @Column(name = "DTL_TRAN_AMT_ISS")
    private String dtlTranAmtIss;
    @Basic(optional = false)
    @Column(name = "DTL0TRAN_AMT_ISS")
    private BigDecimal dtl0tranAmtIss;
    @Basic(optional = false)
    @Column(name = "DTL_ISS_CURR_EXP")
    private Character dtlIssCurrExp;
    @Basic(optional = false)
    @Column(name = "DTL_ISS_CURR_CD")
    private String dtlIssCurrCd;
    @Basic(optional = false)
    @Column(name = "DTL_CUR_CNV_DT_RAW")
    private String dtlCurCnvDtRaw;
    @Basic(optional = false)
    @Column(name = "DTL_CUR_CNV_DT")
    @Temporal(TemporalType.DATE)
    private Date dtlCurCnvDt;
    @Basic(optional = false)
    @Column(name = "DTL_POST_DT")
    @Temporal(TemporalType.DATE)
    private Date dtlPostDt;
    @Basic(optional = false)
    @Column(name = "DTL_BILL_DT")
    @Temporal(TemporalType.DATE)
    private Date dtlBillDt;
    @Basic(optional = false)
    @Column(name = "NOTEID")
    private int noteid;
    @Basic(optional = false)
    @Column(name = "CLUSTER_KEY")
    private String clusterKey;
    @Basic(optional = false)
    @Column(name = "DTL_TRAN_DT")
    @Temporal(TemporalType.DATE)
    private Date dtlTranDt;
    @Basic(optional = false)
    @Column(name = "DTL_PROCESSED_FLG")
    private Character dtlProcessedFlg;
    @Basic(optional = false)
    @Column(name = "DTL_SAFE_STATUS")
    private Character dtlSafeStatus;
    @Basic(optional = false)
    @Column(name = "DTL_BTCH_CUR_ID")
    private short dtlBtchCurId;
    @Basic(optional = false)
    @Column(name = "DTL_RCD_SEQ_NO")
    private int dtlRcdSeqNo;
    @Basic(optional = false)
    @Column(name = "FILTERED_FLAGS")
    private String filteredFlags;

    public McStlmtDtl() {
    }

    public McStlmtDtl(McStlmtDtlPK mcStlmtDtlPK) {
        this.mcStlmtDtlPK = mcStlmtDtlPK;
    }

    public McStlmtDtl(McStlmtDtlPK mcStlmtDtlPK, String dtlCdholdAcc, String dtlAcqRefNo, int dtlTranDtRaw, Character dtlRecCdType, short dtlRecCdTrans, int dtlAmtTranCurr, BigDecimal dtl0amtTranCurr, String dtlAuthCd, int dtlTransAmtCur, BigDecimal dtl0transAmtCur, Character dtlTransCurrExp, String dtlTransCurrCd, short dtlCnversionDt, String dtlMerchAddCity, String dtlStateCntryCd, String dtlDetailList, String dtlTranAmtIss, BigDecimal dtl0tranAmtIss, Character dtlIssCurrExp, String dtlIssCurrCd, String dtlCurCnvDtRaw, Date dtlCurCnvDt, Date dtlPostDt, Date dtlBillDt, int noteid, String clusterKey, Date dtlTranDt, Character dtlProcessedFlg, Character dtlSafeStatus, short dtlBtchCurId, int dtlRcdSeqNo, String filteredFlags) {
        this.mcStlmtDtlPK = mcStlmtDtlPK;
        this.dtlCdholdAcc = dtlCdholdAcc;
        this.dtlAcqRefNo = dtlAcqRefNo;
        this.dtlTranDtRaw = dtlTranDtRaw;
        this.dtlRecCdType = dtlRecCdType;
        this.dtlRecCdTrans = dtlRecCdTrans;
        this.dtlAmtTranCurr = dtlAmtTranCurr;
        this.dtl0amtTranCurr = dtl0amtTranCurr;
        this.dtlAuthCd = dtlAuthCd;
        this.dtlTransAmtCur = dtlTransAmtCur;
        this.dtl0transAmtCur = dtl0transAmtCur;
        this.dtlTransCurrExp = dtlTransCurrExp;
        this.dtlTransCurrCd = dtlTransCurrCd;
        this.dtlCnversionDt = dtlCnversionDt;
        this.dtlMerchAddCity = dtlMerchAddCity;
        this.dtlStateCntryCd = dtlStateCntryCd;
        this.dtlDetailList = dtlDetailList;
        this.dtlTranAmtIss = dtlTranAmtIss;
        this.dtl0tranAmtIss = dtl0tranAmtIss;
        this.dtlIssCurrExp = dtlIssCurrExp;
        this.dtlIssCurrCd = dtlIssCurrCd;
        this.dtlCurCnvDtRaw = dtlCurCnvDtRaw;
        this.dtlCurCnvDt = dtlCurCnvDt;
        this.dtlPostDt = dtlPostDt;
        this.dtlBillDt = dtlBillDt;
        this.noteid = noteid;
        this.clusterKey = clusterKey;
        this.dtlTranDt = dtlTranDt;
        this.dtlProcessedFlg = dtlProcessedFlg;
        this.dtlSafeStatus = dtlSafeStatus;
        this.dtlBtchCurId = dtlBtchCurId;
        this.dtlRcdSeqNo = dtlRcdSeqNo;
        this.filteredFlags = filteredFlags;
    }

    public McStlmtDtl(short dtlStlmtId, short mrchId, Date stlmtId, short btchId) {
        this.mcStlmtDtlPK = new McStlmtDtlPK(dtlStlmtId, mrchId, stlmtId, btchId);
    }

    public McStlmtDtlPK getMcStlmtDtlPK() {
        return mcStlmtDtlPK;
    }

    public void setMcStlmtDtlPK(McStlmtDtlPK mcStlmtDtlPK) {
        this.mcStlmtDtlPK = mcStlmtDtlPK;
    }

    public String getDtlCdholdAcc() {
        return dtlCdholdAcc;
    }

    public void setDtlCdholdAcc(String dtlCdholdAcc) {
        this.dtlCdholdAcc = dtlCdholdAcc;
    }

    public String getDtlAcqRefNo() {
        return dtlAcqRefNo;
    }

    public void setDtlAcqRefNo(String dtlAcqRefNo) {
        this.dtlAcqRefNo = dtlAcqRefNo;
    }

    public int getDtlTranDtRaw() {
        return dtlTranDtRaw;
    }

    public void setDtlTranDtRaw(int dtlTranDtRaw) {
        this.dtlTranDtRaw = dtlTranDtRaw;
    }

    public Character getDtlRecCdType() {
        return dtlRecCdType;
    }

    public void setDtlRecCdType(Character dtlRecCdType) {
        this.dtlRecCdType = dtlRecCdType;
    }

    public short getDtlRecCdTrans() {
        return dtlRecCdTrans;
    }

    public void setDtlRecCdTrans(short dtlRecCdTrans) {
        this.dtlRecCdTrans = dtlRecCdTrans;
    }

    public int getDtlAmtTranCurr() {
        return dtlAmtTranCurr;
    }

    public void setDtlAmtTranCurr(int dtlAmtTranCurr) {
        this.dtlAmtTranCurr = dtlAmtTranCurr;
    }

    public BigDecimal getDtl0amtTranCurr() {
        return dtl0amtTranCurr;
    }

    public void setDtl0amtTranCurr(BigDecimal dtl0amtTranCurr) {
        this.dtl0amtTranCurr = dtl0amtTranCurr;
    }

    public String getDtlAuthCd() {
        return dtlAuthCd;
    }

    public void setDtlAuthCd(String dtlAuthCd) {
        this.dtlAuthCd = dtlAuthCd;
    }

    public int getDtlTransAmtCur() {
        return dtlTransAmtCur;
    }

    public void setDtlTransAmtCur(int dtlTransAmtCur) {
        this.dtlTransAmtCur = dtlTransAmtCur;
    }

    public BigDecimal getDtl0transAmtCur() {
        return dtl0transAmtCur;
    }

    public void setDtl0transAmtCur(BigDecimal dtl0transAmtCur) {
        this.dtl0transAmtCur = dtl0transAmtCur;
    }

    public Character getDtlTransCurrExp() {
        return dtlTransCurrExp;
    }

    public void setDtlTransCurrExp(Character dtlTransCurrExp) {
        this.dtlTransCurrExp = dtlTransCurrExp;
    }

    public String getDtlTransCurrCd() {
        return dtlTransCurrCd;
    }

    public void setDtlTransCurrCd(String dtlTransCurrCd) {
        this.dtlTransCurrCd = dtlTransCurrCd;
    }

    public short getDtlCnversionDt() {
        return dtlCnversionDt;
    }

    public void setDtlCnversionDt(short dtlCnversionDt) {
        this.dtlCnversionDt = dtlCnversionDt;
    }

    public String getDtlMerchAddCity() {
        return dtlMerchAddCity;
    }

    public void setDtlMerchAddCity(String dtlMerchAddCity) {
        this.dtlMerchAddCity = dtlMerchAddCity;
    }

    public String getDtlStateCntryCd() {
        return dtlStateCntryCd;
    }

    public void setDtlStateCntryCd(String dtlStateCntryCd) {
        this.dtlStateCntryCd = dtlStateCntryCd;
    }

    public String getDtlDetailList() {
        return dtlDetailList;
    }

    public void setDtlDetailList(String dtlDetailList) {
        this.dtlDetailList = dtlDetailList;
    }

    public String getDtlTranAmtIss() {
        return dtlTranAmtIss;
    }

    public void setDtlTranAmtIss(String dtlTranAmtIss) {
        this.dtlTranAmtIss = dtlTranAmtIss;
    }

    public BigDecimal getDtl0tranAmtIss() {
        return dtl0tranAmtIss;
    }

    public void setDtl0tranAmtIss(BigDecimal dtl0tranAmtIss) {
        this.dtl0tranAmtIss = dtl0tranAmtIss;
    }

    public Character getDtlIssCurrExp() {
        return dtlIssCurrExp;
    }

    public void setDtlIssCurrExp(Character dtlIssCurrExp) {
        this.dtlIssCurrExp = dtlIssCurrExp;
    }

    public String getDtlIssCurrCd() {
        return dtlIssCurrCd;
    }

    public void setDtlIssCurrCd(String dtlIssCurrCd) {
        this.dtlIssCurrCd = dtlIssCurrCd;
    }

    public String getDtlCurCnvDtRaw() {
        return dtlCurCnvDtRaw;
    }

    public void setDtlCurCnvDtRaw(String dtlCurCnvDtRaw) {
        this.dtlCurCnvDtRaw = dtlCurCnvDtRaw;
    }

    public Date getDtlCurCnvDt() {
        return dtlCurCnvDt;
    }

    public void setDtlCurCnvDt(Date dtlCurCnvDt) {
        this.dtlCurCnvDt = dtlCurCnvDt;
    }

    public Date getDtlPostDt() {
        return dtlPostDt;
    }

    public void setDtlPostDt(Date dtlPostDt) {
        this.dtlPostDt = dtlPostDt;
    }

    public Date getDtlBillDt() {
        return dtlBillDt;
    }

    public void setDtlBillDt(Date dtlBillDt) {
        this.dtlBillDt = dtlBillDt;
    }

    public int getNoteid() {
        return noteid;
    }

    public void setNoteid(int noteid) {
        this.noteid = noteid;
    }

    public String getClusterKey() {
        return clusterKey;
    }

    public void setClusterKey(String clusterKey) {
        this.clusterKey = clusterKey;
    }

    public Date getDtlTranDt() {
        return dtlTranDt;
    }

    public void setDtlTranDt(Date dtlTranDt) {
        this.dtlTranDt = dtlTranDt;
    }

    public Character getDtlProcessedFlg() {
        return dtlProcessedFlg;
    }

    public void setDtlProcessedFlg(Character dtlProcessedFlg) {
        this.dtlProcessedFlg = dtlProcessedFlg;
    }

    public Character getDtlSafeStatus() {
        return dtlSafeStatus;
    }

    public void setDtlSafeStatus(Character dtlSafeStatus) {
        this.dtlSafeStatus = dtlSafeStatus;
    }

    public short getDtlBtchCurId() {
        return dtlBtchCurId;
    }

    public void setDtlBtchCurId(short dtlBtchCurId) {
        this.dtlBtchCurId = dtlBtchCurId;
    }

    public int getDtlRcdSeqNo() {
        return dtlRcdSeqNo;
    }

    public void setDtlRcdSeqNo(int dtlRcdSeqNo) {
        this.dtlRcdSeqNo = dtlRcdSeqNo;
    }

    public String getFilteredFlags() {
        return filteredFlags;
    }

    public void setFilteredFlags(String filteredFlags) {
        this.filteredFlags = filteredFlags;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcStlmtDtlPK != null ? mcStlmtDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McStlmtDtl)) {
            return false;
        }
        McStlmtDtl other = (McStlmtDtl) object;
        if ((this.mcStlmtDtlPK == null && other.mcStlmtDtlPK != null) || (this.mcStlmtDtlPK != null && !this.mcStlmtDtlPK.equals(other.mcStlmtDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McStlmtDtl[ mcStlmtDtlPK=" + mcStlmtDtlPK + " ]";
    }

}
