/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_BATCH_INFO", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McBatchInfo.findAll", query = "SELECT m FROM McBatchInfo m"),
    @NamedQuery(name = "McBatchInfo.findByBtchId", query = "SELECT m FROM McBatchInfo m WHERE m.mcBatchInfoPK.btchId = :btchId"),
    @NamedQuery(name = "McBatchInfo.findByStlmtId", query = "SELECT m FROM McBatchInfo m WHERE m.mcBatchInfoPK.stlmtId = :stlmtId"),
    @NamedQuery(name = "McBatchInfo.findByBtSendIcaNo", query = "SELECT m FROM McBatchInfo m WHERE m.btSendIcaNo = :btSendIcaNo"),
    @NamedQuery(name = "McBatchInfo.findByBtRcvIcaNo", query = "SELECT m FROM McBatchInfo m WHERE m.btRcvIcaNo = :btRcvIcaNo"),
    @NamedQuery(name = "McBatchInfo.findByBtJulProcDt", query = "SELECT m FROM McBatchInfo m WHERE m.btJulProcDt = :btJulProcDt"),
    @NamedQuery(name = "McBatchInfo.findByBtJulProcDtRaw", query = "SELECT m FROM McBatchInfo m WHERE m.btJulProcDtRaw = :btJulProcDtRaw"),
    @NamedQuery(name = "McBatchInfo.findByBtBatchDtRaw", query = "SELECT m FROM McBatchInfo m WHERE m.btBatchDtRaw = :btBatchDtRaw"),
    @NamedQuery(name = "McBatchInfo.findByBtBatchDt", query = "SELECT m FROM McBatchInfo m WHERE m.btBatchDt = :btBatchDt"),
    @NamedQuery(name = "McBatchInfo.findByBtBatchNo", query = "SELECT m FROM McBatchInfo m WHERE m.btBatchNo = :btBatchNo"),
    @NamedQuery(name = "McBatchInfo.findByBtRcdType", query = "SELECT m FROM McBatchInfo m WHERE m.btRcdType = :btRcdType"),
    @NamedQuery(name = "McBatchInfo.findByBtNoCshAtmDisb", query = "SELECT m FROM McBatchInfo m WHERE m.btNoCshAtmDisb = :btNoCshAtmDisb"),
    @NamedQuery(name = "McBatchInfo.findByBtAmtCshAtmDis", query = "SELECT m FROM McBatchInfo m WHERE m.btAmtCshAtmDis = :btAmtCshAtmDis"),
    @NamedQuery(name = "McBatchInfo.findByBt0amtCshAtmDis", query = "SELECT m FROM McBatchInfo m WHERE m.bt0amtCshAtmDis = :bt0amtCshAtmDis"),
    @NamedQuery(name = "McBatchInfo.findByBtCshAtmDisFee", query = "SELECT m FROM McBatchInfo m WHERE m.btCshAtmDisFee = :btCshAtmDisFee"),
    @NamedQuery(name = "McBatchInfo.findByBtNoRtlSls", query = "SELECT m FROM McBatchInfo m WHERE m.btNoRtlSls = :btNoRtlSls"),
    @NamedQuery(name = "McBatchInfo.findByBtAmtRtlSls", query = "SELECT m FROM McBatchInfo m WHERE m.btAmtRtlSls = :btAmtRtlSls"),
    @NamedQuery(name = "McBatchInfo.findByBt0amtRtlSls", query = "SELECT m FROM McBatchInfo m WHERE m.bt0amtRtlSls = :bt0amtRtlSls"),
    @NamedQuery(name = "McBatchInfo.findByBtNoCreds", query = "SELECT m FROM McBatchInfo m WHERE m.btNoCreds = :btNoCreds"),
    @NamedQuery(name = "McBatchInfo.findByBtAmtCreds", query = "SELECT m FROM McBatchInfo m WHERE m.btAmtCreds = :btAmtCreds"),
    @NamedQuery(name = "McBatchInfo.findByBt0amtCreds", query = "SELECT m FROM McBatchInfo m WHERE m.bt0amtCreds = :bt0amtCreds"),
    @NamedQuery(name = "McBatchInfo.findByBtNoUniqXact", query = "SELECT m FROM McBatchInfo m WHERE m.btNoUniqXact = :btNoUniqXact"),
    @NamedQuery(name = "McBatchInfo.findByBtAmtUniqXact", query = "SELECT m FROM McBatchInfo m WHERE m.btAmtUniqXact = :btAmtUniqXact"),
    @NamedQuery(name = "McBatchInfo.findByBt0amtUniqXact", query = "SELECT m FROM McBatchInfo m WHERE m.bt0amtUniqXact = :bt0amtUniqXact"),
    @NamedQuery(name = "McBatchInfo.findByBtFeeApldStld", query = "SELECT m FROM McBatchInfo m WHERE m.btFeeApldStld = :btFeeApldStld"),
    @NamedQuery(name = "McBatchInfo.findByBtBatchAmt", query = "SELECT m FROM McBatchInfo m WHERE m.btBatchAmt = :btBatchAmt"),
    @NamedQuery(name = "McBatchInfo.findByBt0batchAmt", query = "SELECT m FROM McBatchInfo m WHERE m.bt0batchAmt = :bt0batchAmt"),
    @NamedQuery(name = "McBatchInfo.findByBtAmtFinDtls", query = "SELECT m FROM McBatchInfo m WHERE m.btAmtFinDtls = :btAmtFinDtls"),
    @NamedQuery(name = "McBatchInfo.findByBt0amtFinDtls", query = "SELECT m FROM McBatchInfo m WHERE m.bt0amtFinDtls = :bt0amtFinDtls"),
    @NamedQuery(name = "McBatchInfo.findByBtStlmntMthd", query = "SELECT m FROM McBatchInfo m WHERE m.btStlmntMthd = :btStlmntMthd"),
    @NamedQuery(name = "McBatchInfo.findByBtXactCurrCd", query = "SELECT m FROM McBatchInfo m WHERE m.btXactCurrCd = :btXactCurrCd"),
    @NamedQuery(name = "McBatchInfo.findByBtXactAmtExp", query = "SELECT m FROM McBatchInfo m WHERE m.btXactAmtExp = :btXactAmtExp"),
    @NamedQuery(name = "McBatchInfo.findByBtStlmntCurrCd", query = "SELECT m FROM McBatchInfo m WHERE m.btStlmntCurrCd = :btStlmntCurrCd"),
    @NamedQuery(name = "McBatchInfo.findByBtStlmntCurrExp", query = "SELECT m FROM McBatchInfo m WHERE m.btStlmntCurrExp = :btStlmntCurrExp"),
    @NamedQuery(name = "McBatchInfo.findByBtIssuerCurrCd", query = "SELECT m FROM McBatchInfo m WHERE m.btIssuerCurrCd = :btIssuerCurrCd"),
    @NamedQuery(name = "McBatchInfo.findByBtIssuerCurrExp", query = "SELECT m FROM McBatchInfo m WHERE m.btIssuerCurrExp = :btIssuerCurrExp"),
    @NamedQuery(name = "McBatchInfo.findByBtNetAmtXctCur", query = "SELECT m FROM McBatchInfo m WHERE m.btNetAmtXctCur = :btNetAmtXctCur"),
    @NamedQuery(name = "McBatchInfo.findByBt0netAmtXctCur", query = "SELECT m FROM McBatchInfo m WHERE m.bt0netAmtXctCur = :bt0netAmtXctCur"),
    @NamedQuery(name = "McBatchInfo.findByBtNetAmtXctCrd", query = "SELECT m FROM McBatchInfo m WHERE m.btNetAmtXctCrd = :btNetAmtXctCrd"),
    @NamedQuery(name = "McBatchInfo.findByBtNetAmtStCurr", query = "SELECT m FROM McBatchInfo m WHERE m.btNetAmtStCurr = :btNetAmtStCurr"),
    @NamedQuery(name = "McBatchInfo.findByBt0netAmtStCurr", query = "SELECT m FROM McBatchInfo m WHERE m.bt0netAmtStCurr = :bt0netAmtStCurr"),
    @NamedQuery(name = "McBatchInfo.findByBtNetAmtStCrd", query = "SELECT m FROM McBatchInfo m WHERE m.btNetAmtStCrd = :btNetAmtStCrd"),
    @NamedQuery(name = "McBatchInfo.findByBtNoteid", query = "SELECT m FROM McBatchInfo m WHERE m.btNoteid = :btNoteid"),
    @NamedQuery(name = "McBatchInfo.findByClusterKey", query = "SELECT m FROM McBatchInfo m WHERE m.clusterKey = :clusterKey"),
    @NamedQuery(name = "McBatchInfo.findByBtFeeApldAmt", query = "SELECT m FROM McBatchInfo m WHERE m.btFeeApldAmt = :btFeeApldAmt"),
    @NamedQuery(name = "McBatchInfo.findByBt0feeApldAmt", query = "SELECT m FROM McBatchInfo m WHERE m.bt0feeApldAmt = :bt0feeApldAmt"),
    @NamedQuery(name = "McBatchInfo.findByBtFeeApldInd", query = "SELECT m FROM McBatchInfo m WHERE m.btFeeApldInd = :btFeeApldInd"),
    @NamedQuery(name = "McBatchInfo.findByBtBatchAmtInd", query = "SELECT m FROM McBatchInfo m WHERE m.btBatchAmtInd = :btBatchAmtInd"),
    @NamedQuery(name = "McBatchInfo.findByBtAmtFinDtlInd", query = "SELECT m FROM McBatchInfo m WHERE m.btAmtFinDtlInd = :btAmtFinDtlInd")})
public class McBatchInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McBatchInfoPK mcBatchInfoPK;
    @Basic(optional = false)
    @Column(name = "BT_SEND_ICA_NO")
    private short btSendIcaNo;
    @Basic(optional = false)
    @Column(name = "BT_RCV_ICA_NO")
    private short btRcvIcaNo;
    @Basic(optional = false)
    @Column(name = "BT_JUL_PROC_DT")
    @Temporal(TemporalType.DATE)
    private Date btJulProcDt;
    @Basic(optional = false)
    @Column(name = "BT_JUL_PROC_DT_RAW")
    private int btJulProcDtRaw;
    @Basic(optional = false)
    @Column(name = "BT_BATCH_DT_RAW")
    private int btBatchDtRaw;
    @Basic(optional = false)
    @Column(name = "BT_BATCH_DT")
    @Temporal(TemporalType.DATE)
    private Date btBatchDt;
    @Basic(optional = false)
    @Column(name = "BT_BATCH_NO")
    private int btBatchNo;
    @Basic(optional = false)
    @Column(name = "BT_RCD_TYPE")
    private Character btRcdType;
    @Basic(optional = false)
    @Column(name = "BT_NO_CSH_ATM_DISB")
    private short btNoCshAtmDisb;
    @Basic(optional = false)
    @Column(name = "BT_AMT_CSH_ATM_DIS")
    private long btAmtCshAtmDis;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "BT0AMT_CSH_ATM_DIS")
    private BigDecimal bt0amtCshAtmDis;
    @Basic(optional = false)
    @Column(name = "BT_CSH_ATM_DIS_FEE")
    private int btCshAtmDisFee;
    @Basic(optional = false)
    @Column(name = "BT_NO_RTL_SLS")
    private int btNoRtlSls;
    @Basic(optional = false)
    @Column(name = "BT_AMT_RTL_SLS")
    private long btAmtRtlSls;
    @Basic(optional = false)
    @Column(name = "BT0AMT_RTL_SLS")
    private BigDecimal bt0amtRtlSls;
    @Basic(optional = false)
    @Column(name = "BT_NO_CREDS")
    private short btNoCreds;
    @Basic(optional = false)
    @Column(name = "BT_AMT_CREDS")
    private long btAmtCreds;
    @Basic(optional = false)
    @Column(name = "BT0AMT_CREDS")
    private BigDecimal bt0amtCreds;
    @Basic(optional = false)
    @Column(name = "BT_NO_UNIQ_XACT")
    private short btNoUniqXact;
    @Basic(optional = false)
    @Column(name = "BT_AMT_UNIQ_XACT")
    private long btAmtUniqXact;
    @Basic(optional = false)
    @Column(name = "BT0AMT_UNIQ_XACT")
    private BigDecimal bt0amtUniqXact;
    @Basic(optional = false)
    @Column(name = "BT_FEE_APLD_STLD")
    private String btFeeApldStld;
    @Basic(optional = false)
    @Column(name = "BT_BATCH_AMT")
    private String btBatchAmt;
    @Basic(optional = false)
    @Column(name = "BT0BATCH_AMT")
    private BigDecimal bt0batchAmt;
    @Basic(optional = false)
    @Column(name = "BT_AMT_FIN_DTLS")
    private String btAmtFinDtls;
    @Basic(optional = false)
    @Column(name = "BT0AMT_FIN_DTLS")
    private BigDecimal bt0amtFinDtls;
    @Basic(optional = false)
    @Column(name = "BT_STLMNT_MTHD")
    private Character btStlmntMthd;
    @Basic(optional = false)
    @Column(name = "BT_XACT_CURR_CD")
    private String btXactCurrCd;
    @Basic(optional = false)
    @Column(name = "BT_XACT_AMT_EXP")
    private Character btXactAmtExp;
    @Basic(optional = false)
    @Column(name = "BT_STLMNT_CURR_CD")
    private String btStlmntCurrCd;
    @Basic(optional = false)
    @Column(name = "BT_STLMNT_CURR_EXP")
    private Character btStlmntCurrExp;
    @Basic(optional = false)
    @Column(name = "BT_ISSUER_CURR_CD")
    private String btIssuerCurrCd;
    @Basic(optional = false)
    @Column(name = "BT_ISSUER_CURR_EXP")
    private Character btIssuerCurrExp;
    @Basic(optional = false)
    @Column(name = "BT_NET_AMT_XCT_CUR")
    private long btNetAmtXctCur;
    @Basic(optional = false)
    @Column(name = "BT0NET_AMT_XCT_CUR")
    private BigDecimal bt0netAmtXctCur;
    @Basic(optional = false)
    @Column(name = "BT_NET_AMT_XCT_CRD")
    private Character btNetAmtXctCrd;
    @Basic(optional = false)
    @Column(name = "BT_NET_AMT_ST_CURR")
    private long btNetAmtStCurr;
    @Basic(optional = false)
    @Column(name = "BT0NET_AMT_ST_CURR")
    private BigDecimal bt0netAmtStCurr;
    @Basic(optional = false)
    @Column(name = "BT_NET_AMT_ST_CRD")
    private Character btNetAmtStCrd;
    @Basic(optional = false)
    @Column(name = "BT_NOTEID")
    private int btNoteid;
    @Basic(optional = false)
    @Column(name = "CLUSTER_KEY")
    private String clusterKey;
    @Basic(optional = false)
    @Column(name = "BT_FEE_APLD_AMT")
    private String btFeeApldAmt;
    @Basic(optional = false)
    @Column(name = "BT0FEE_APLD_AMT")
    private BigDecimal bt0feeApldAmt;
    @Basic(optional = false)
    @Column(name = "BT_FEE_APLD_IND")
    private Character btFeeApldInd;
    @Basic(optional = false)
    @Column(name = "BT_BATCH_AMT_IND")
    private Character btBatchAmtInd;
    @Basic(optional = false)
    @Column(name = "BT_AMT_FIN_DTL_IND")
    private Character btAmtFinDtlInd;

    public McBatchInfo() {
    }

    public McBatchInfo(McBatchInfoPK mcBatchInfoPK) {
        this.mcBatchInfoPK = mcBatchInfoPK;
    }

    public McBatchInfo(McBatchInfoPK mcBatchInfoPK, short btSendIcaNo, short btRcvIcaNo, Date btJulProcDt, int btJulProcDtRaw, int btBatchDtRaw, Date btBatchDt, int btBatchNo, Character btRcdType, short btNoCshAtmDisb, long btAmtCshAtmDis, BigDecimal bt0amtCshAtmDis, int btCshAtmDisFee, int btNoRtlSls, long btAmtRtlSls, BigDecimal bt0amtRtlSls, short btNoCreds, long btAmtCreds, BigDecimal bt0amtCreds, short btNoUniqXact, long btAmtUniqXact, BigDecimal bt0amtUniqXact, String btFeeApldStld, String btBatchAmt, BigDecimal bt0batchAmt, String btAmtFinDtls, BigDecimal bt0amtFinDtls, Character btStlmntMthd, String btXactCurrCd, Character btXactAmtExp, String btStlmntCurrCd, Character btStlmntCurrExp, String btIssuerCurrCd, Character btIssuerCurrExp, long btNetAmtXctCur, BigDecimal bt0netAmtXctCur, Character btNetAmtXctCrd, long btNetAmtStCurr, BigDecimal bt0netAmtStCurr, Character btNetAmtStCrd, int btNoteid, String clusterKey, String btFeeApldAmt, BigDecimal bt0feeApldAmt, Character btFeeApldInd, Character btBatchAmtInd, Character btAmtFinDtlInd) {
        this.mcBatchInfoPK = mcBatchInfoPK;
        this.btSendIcaNo = btSendIcaNo;
        this.btRcvIcaNo = btRcvIcaNo;
        this.btJulProcDt = btJulProcDt;
        this.btJulProcDtRaw = btJulProcDtRaw;
        this.btBatchDtRaw = btBatchDtRaw;
        this.btBatchDt = btBatchDt;
        this.btBatchNo = btBatchNo;
        this.btRcdType = btRcdType;
        this.btNoCshAtmDisb = btNoCshAtmDisb;
        this.btAmtCshAtmDis = btAmtCshAtmDis;
        this.bt0amtCshAtmDis = bt0amtCshAtmDis;
        this.btCshAtmDisFee = btCshAtmDisFee;
        this.btNoRtlSls = btNoRtlSls;
        this.btAmtRtlSls = btAmtRtlSls;
        this.bt0amtRtlSls = bt0amtRtlSls;
        this.btNoCreds = btNoCreds;
        this.btAmtCreds = btAmtCreds;
        this.bt0amtCreds = bt0amtCreds;
        this.btNoUniqXact = btNoUniqXact;
        this.btAmtUniqXact = btAmtUniqXact;
        this.bt0amtUniqXact = bt0amtUniqXact;
        this.btFeeApldStld = btFeeApldStld;
        this.btBatchAmt = btBatchAmt;
        this.bt0batchAmt = bt0batchAmt;
        this.btAmtFinDtls = btAmtFinDtls;
        this.bt0amtFinDtls = bt0amtFinDtls;
        this.btStlmntMthd = btStlmntMthd;
        this.btXactCurrCd = btXactCurrCd;
        this.btXactAmtExp = btXactAmtExp;
        this.btStlmntCurrCd = btStlmntCurrCd;
        this.btStlmntCurrExp = btStlmntCurrExp;
        this.btIssuerCurrCd = btIssuerCurrCd;
        this.btIssuerCurrExp = btIssuerCurrExp;
        this.btNetAmtXctCur = btNetAmtXctCur;
        this.bt0netAmtXctCur = bt0netAmtXctCur;
        this.btNetAmtXctCrd = btNetAmtXctCrd;
        this.btNetAmtStCurr = btNetAmtStCurr;
        this.bt0netAmtStCurr = bt0netAmtStCurr;
        this.btNetAmtStCrd = btNetAmtStCrd;
        this.btNoteid = btNoteid;
        this.clusterKey = clusterKey;
        this.btFeeApldAmt = btFeeApldAmt;
        this.bt0feeApldAmt = bt0feeApldAmt;
        this.btFeeApldInd = btFeeApldInd;
        this.btBatchAmtInd = btBatchAmtInd;
        this.btAmtFinDtlInd = btAmtFinDtlInd;
    }

    public McBatchInfo(short btchId, Date stlmtId) {
        this.mcBatchInfoPK = new McBatchInfoPK(btchId, stlmtId);
    }

    public McBatchInfoPK getMcBatchInfoPK() {
        return mcBatchInfoPK;
    }

    public void setMcBatchInfoPK(McBatchInfoPK mcBatchInfoPK) {
        this.mcBatchInfoPK = mcBatchInfoPK;
    }

    public short getBtSendIcaNo() {
        return btSendIcaNo;
    }

    public void setBtSendIcaNo(short btSendIcaNo) {
        this.btSendIcaNo = btSendIcaNo;
    }

    public short getBtRcvIcaNo() {
        return btRcvIcaNo;
    }

    public void setBtRcvIcaNo(short btRcvIcaNo) {
        this.btRcvIcaNo = btRcvIcaNo;
    }

    public Date getBtJulProcDt() {
        return btJulProcDt;
    }

    public void setBtJulProcDt(Date btJulProcDt) {
        this.btJulProcDt = btJulProcDt;
    }

    public int getBtJulProcDtRaw() {
        return btJulProcDtRaw;
    }

    public void setBtJulProcDtRaw(int btJulProcDtRaw) {
        this.btJulProcDtRaw = btJulProcDtRaw;
    }

    public int getBtBatchDtRaw() {
        return btBatchDtRaw;
    }

    public void setBtBatchDtRaw(int btBatchDtRaw) {
        this.btBatchDtRaw = btBatchDtRaw;
    }

    public Date getBtBatchDt() {
        return btBatchDt;
    }

    public void setBtBatchDt(Date btBatchDt) {
        this.btBatchDt = btBatchDt;
    }

    public int getBtBatchNo() {
        return btBatchNo;
    }

    public void setBtBatchNo(int btBatchNo) {
        this.btBatchNo = btBatchNo;
    }

    public Character getBtRcdType() {
        return btRcdType;
    }

    public void setBtRcdType(Character btRcdType) {
        this.btRcdType = btRcdType;
    }

    public short getBtNoCshAtmDisb() {
        return btNoCshAtmDisb;
    }

    public void setBtNoCshAtmDisb(short btNoCshAtmDisb) {
        this.btNoCshAtmDisb = btNoCshAtmDisb;
    }

    public long getBtAmtCshAtmDis() {
        return btAmtCshAtmDis;
    }

    public void setBtAmtCshAtmDis(long btAmtCshAtmDis) {
        this.btAmtCshAtmDis = btAmtCshAtmDis;
    }

    public BigDecimal getBt0amtCshAtmDis() {
        return bt0amtCshAtmDis;
    }

    public void setBt0amtCshAtmDis(BigDecimal bt0amtCshAtmDis) {
        this.bt0amtCshAtmDis = bt0amtCshAtmDis;
    }

    public int getBtCshAtmDisFee() {
        return btCshAtmDisFee;
    }

    public void setBtCshAtmDisFee(int btCshAtmDisFee) {
        this.btCshAtmDisFee = btCshAtmDisFee;
    }

    public int getBtNoRtlSls() {
        return btNoRtlSls;
    }

    public void setBtNoRtlSls(int btNoRtlSls) {
        this.btNoRtlSls = btNoRtlSls;
    }

    public long getBtAmtRtlSls() {
        return btAmtRtlSls;
    }

    public void setBtAmtRtlSls(long btAmtRtlSls) {
        this.btAmtRtlSls = btAmtRtlSls;
    }

    public BigDecimal getBt0amtRtlSls() {
        return bt0amtRtlSls;
    }

    public void setBt0amtRtlSls(BigDecimal bt0amtRtlSls) {
        this.bt0amtRtlSls = bt0amtRtlSls;
    }

    public short getBtNoCreds() {
        return btNoCreds;
    }

    public void setBtNoCreds(short btNoCreds) {
        this.btNoCreds = btNoCreds;
    }

    public long getBtAmtCreds() {
        return btAmtCreds;
    }

    public void setBtAmtCreds(long btAmtCreds) {
        this.btAmtCreds = btAmtCreds;
    }

    public BigDecimal getBt0amtCreds() {
        return bt0amtCreds;
    }

    public void setBt0amtCreds(BigDecimal bt0amtCreds) {
        this.bt0amtCreds = bt0amtCreds;
    }

    public short getBtNoUniqXact() {
        return btNoUniqXact;
    }

    public void setBtNoUniqXact(short btNoUniqXact) {
        this.btNoUniqXact = btNoUniqXact;
    }

    public long getBtAmtUniqXact() {
        return btAmtUniqXact;
    }

    public void setBtAmtUniqXact(long btAmtUniqXact) {
        this.btAmtUniqXact = btAmtUniqXact;
    }

    public BigDecimal getBt0amtUniqXact() {
        return bt0amtUniqXact;
    }

    public void setBt0amtUniqXact(BigDecimal bt0amtUniqXact) {
        this.bt0amtUniqXact = bt0amtUniqXact;
    }

    public String getBtFeeApldStld() {
        return btFeeApldStld;
    }

    public void setBtFeeApldStld(String btFeeApldStld) {
        this.btFeeApldStld = btFeeApldStld;
    }

    public String getBtBatchAmt() {
        return btBatchAmt;
    }

    public void setBtBatchAmt(String btBatchAmt) {
        this.btBatchAmt = btBatchAmt;
    }

    public BigDecimal getBt0batchAmt() {
        return bt0batchAmt;
    }

    public void setBt0batchAmt(BigDecimal bt0batchAmt) {
        this.bt0batchAmt = bt0batchAmt;
    }

    public String getBtAmtFinDtls() {
        return btAmtFinDtls;
    }

    public void setBtAmtFinDtls(String btAmtFinDtls) {
        this.btAmtFinDtls = btAmtFinDtls;
    }

    public BigDecimal getBt0amtFinDtls() {
        return bt0amtFinDtls;
    }

    public void setBt0amtFinDtls(BigDecimal bt0amtFinDtls) {
        this.bt0amtFinDtls = bt0amtFinDtls;
    }

    public Character getBtStlmntMthd() {
        return btStlmntMthd;
    }

    public void setBtStlmntMthd(Character btStlmntMthd) {
        this.btStlmntMthd = btStlmntMthd;
    }

    public String getBtXactCurrCd() {
        return btXactCurrCd;
    }

    public void setBtXactCurrCd(String btXactCurrCd) {
        this.btXactCurrCd = btXactCurrCd;
    }

    public Character getBtXactAmtExp() {
        return btXactAmtExp;
    }

    public void setBtXactAmtExp(Character btXactAmtExp) {
        this.btXactAmtExp = btXactAmtExp;
    }

    public String getBtStlmntCurrCd() {
        return btStlmntCurrCd;
    }

    public void setBtStlmntCurrCd(String btStlmntCurrCd) {
        this.btStlmntCurrCd = btStlmntCurrCd;
    }

    public Character getBtStlmntCurrExp() {
        return btStlmntCurrExp;
    }

    public void setBtStlmntCurrExp(Character btStlmntCurrExp) {
        this.btStlmntCurrExp = btStlmntCurrExp;
    }

    public String getBtIssuerCurrCd() {
        return btIssuerCurrCd;
    }

    public void setBtIssuerCurrCd(String btIssuerCurrCd) {
        this.btIssuerCurrCd = btIssuerCurrCd;
    }

    public Character getBtIssuerCurrExp() {
        return btIssuerCurrExp;
    }

    public void setBtIssuerCurrExp(Character btIssuerCurrExp) {
        this.btIssuerCurrExp = btIssuerCurrExp;
    }

    public long getBtNetAmtXctCur() {
        return btNetAmtXctCur;
    }

    public void setBtNetAmtXctCur(long btNetAmtXctCur) {
        this.btNetAmtXctCur = btNetAmtXctCur;
    }

    public BigDecimal getBt0netAmtXctCur() {
        return bt0netAmtXctCur;
    }

    public void setBt0netAmtXctCur(BigDecimal bt0netAmtXctCur) {
        this.bt0netAmtXctCur = bt0netAmtXctCur;
    }

    public Character getBtNetAmtXctCrd() {
        return btNetAmtXctCrd;
    }

    public void setBtNetAmtXctCrd(Character btNetAmtXctCrd) {
        this.btNetAmtXctCrd = btNetAmtXctCrd;
    }

    public long getBtNetAmtStCurr() {
        return btNetAmtStCurr;
    }

    public void setBtNetAmtStCurr(long btNetAmtStCurr) {
        this.btNetAmtStCurr = btNetAmtStCurr;
    }

    public BigDecimal getBt0netAmtStCurr() {
        return bt0netAmtStCurr;
    }

    public void setBt0netAmtStCurr(BigDecimal bt0netAmtStCurr) {
        this.bt0netAmtStCurr = bt0netAmtStCurr;
    }

    public Character getBtNetAmtStCrd() {
        return btNetAmtStCrd;
    }

    public void setBtNetAmtStCrd(Character btNetAmtStCrd) {
        this.btNetAmtStCrd = btNetAmtStCrd;
    }

    public int getBtNoteid() {
        return btNoteid;
    }

    public void setBtNoteid(int btNoteid) {
        this.btNoteid = btNoteid;
    }

    public String getClusterKey() {
        return clusterKey;
    }

    public void setClusterKey(String clusterKey) {
        this.clusterKey = clusterKey;
    }

    public String getBtFeeApldAmt() {
        return btFeeApldAmt;
    }

    public void setBtFeeApldAmt(String btFeeApldAmt) {
        this.btFeeApldAmt = btFeeApldAmt;
    }

    public BigDecimal getBt0feeApldAmt() {
        return bt0feeApldAmt;
    }

    public void setBt0feeApldAmt(BigDecimal bt0feeApldAmt) {
        this.bt0feeApldAmt = bt0feeApldAmt;
    }

    public Character getBtFeeApldInd() {
        return btFeeApldInd;
    }

    public void setBtFeeApldInd(Character btFeeApldInd) {
        this.btFeeApldInd = btFeeApldInd;
    }

    public Character getBtBatchAmtInd() {
        return btBatchAmtInd;
    }

    public void setBtBatchAmtInd(Character btBatchAmtInd) {
        this.btBatchAmtInd = btBatchAmtInd;
    }

    public Character getBtAmtFinDtlInd() {
        return btAmtFinDtlInd;
    }

    public void setBtAmtFinDtlInd(Character btAmtFinDtlInd) {
        this.btAmtFinDtlInd = btAmtFinDtlInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcBatchInfoPK != null ? mcBatchInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McBatchInfo)) {
            return false;
        }
        McBatchInfo other = (McBatchInfo) object;
        if ((this.mcBatchInfoPK == null && other.mcBatchInfoPK != null) || (this.mcBatchInfoPK != null && !this.mcBatchInfoPK.equals(other.mcBatchInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McBatchInfo[ mcBatchInfoPK=" + mcBatchInfoPK + " ]";
    }
    
}
