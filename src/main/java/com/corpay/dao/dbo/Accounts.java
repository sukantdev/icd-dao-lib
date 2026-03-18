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
@Table(name = "ACCOUNTS", catalog = "", schema = "DBO")
public class Accounts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "ACCT_NM")
    private String acctNm;
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
    @Column(name = "PCI_MSKNG_FLG")
    private Character pciMskngFlg;
    @Basic(optional = false)
    @Column(name = "PCI_MSKNG_CHAR_CD")
    private Character pciMskngCharCd;
    @Basic(optional = false)
    @Column(name = "PL_CD")
    private String plCd;
    @Basic(optional = false)
    @Column(name = "BLNG_DIV_CD")
    private String blngDivCd;
    @Basic(optional = false)
    @Column(name = "GEAC_COMP_1_CD")
    private String geacComp1Cd;
    @Basic(optional = false)
    @Column(name = "GEAC_COMP_2_CD")
    private String geacComp2Cd;
    @Basic(optional = false)
    @Column(name = "GEAC_COMP_3_CD")
    private String geacComp3Cd;
    @Basic(optional = false)
    @Column(name = "GEAC_COMP_4_CD")
    private String geacComp4Cd;
    @Basic(optional = false)
    @Column(name = "GEAC_COMP_5_CD")
    private String geacComp5Cd;
    @Basic(optional = false)
    @Column(name = "GEAC_COMP_6_CD")
    private String geacComp6Cd;
    @Basic(optional = false)
    @Column(name = "GEAC_COMP_7_CD")
    private String geacComp7Cd;
    @Basic(optional = false)
    @Column(name = "GEAC_COMP_8_CD")
    private String geacComp8Cd;
    @Basic(optional = false)
    @Column(name = "GEAC_COMP_9_CD")
    private String geacComp9Cd;
    @Basic(optional = false)
    @Column(name = "GEAC_COMP_10_CD")
    private String geacComp10Cd;
    @Column(name = "EBP_ACCT_IND")
    private Character ebpAcctInd;
    @Basic(optional = false)
    @Column(name = "FUND_METH")
    private Character fundMeth;
    @Basic(optional = false)
    @Column(name = "VC_FULL_AUTH_FLG")
    private Character vcFullAuthFlg;
    @Basic(optional = false)
    @Column(name = "BIH_CSH_DISP_FLG")
    private Character bihCshDispFlg;
    @Basic(optional = false)
    @Column(name = "ACCT_STAT_CD")
    private Character acctStatCd;
    @Basic(optional = false)
    @Column(name = "VNDR_FEE_OVR_FLG")
    private Character vndrFeeOvrFlg;

    @Basic(optional = false)
    @Column(name = "MAX_FEE_OVR_AMT")
    private BigDecimal maxFeeOvrAmt;
    @Basic(optional = false)
    @Column(name = "BILL_FEE_CUST_ID")
    private String billFeeCustId;
    @Basic(optional = false)
    @Column(name = "PFY_THRSHLD_AMT")
    private int pfyThrshldAmt;
    @Basic(optional = false)
    @Column(name = "THRD_PTY_ACH_FLG")
    private Character thrdPtyAchFlg;
    @Basic(optional = false)
    @Column(name = "THRD_PTY_ACH_DELAY_CNT")
    private short thrdPtyAchDelayCnt;
    @Basic(optional = false)
    @Column(name = "REFUND_FLG")
    private Character refundFlg;
    @Basic(optional = false)
    @Column(name = "REFUND_LIMIT")
    private int refundLimit;
    @Basic(optional = false)
    @Column(name = "RFRL_CD_1")
    private String rfrlCd1;
    @Basic(optional = false)
    @Column(name = "RFRL_CD_2")
    private String rfrlCd2;
    @Basic(optional = false)
    @Column(name = "ACCT_FEE_OVR_PCT")
    private BigDecimal acctFeeOvrPct;
    @Basic(optional = false)
    @Column(name = "GFN_CD")
    private String gfnCd;
    @Basic(optional = false)
    @Column(name = "TRUST_ACCT_NBR")
    private String trustAcctNbr;
    @Basic(optional = false)
    @Column(name = "ICD_MASK_FLG")
    private Character icdMaskFlg;
    @Basic(optional = false)
    @Column(name = "GO_FUND_ME_FLG")
    private Character goFundMeFlg;
    @Basic(optional = false)
    @Column(name = "GO_FUND_ME_DELAY_CNT")
    private short goFundMeDelayCnt;
    @Basic(optional = false)
    @Column(name = "BILLPAY_VENDOR_IND")
    private Character billpayVendorInd;
    @Basic(optional = false)
    @Column(name = "ACCT_PREPAID_FLG")
    private Character acctPrepaidFlg;
    @Basic(optional = false)
    @Column(name = "ACCTS_TELE_PARTNER_FLAG")
    private Character acctsTelePartnerFlag;
    @Basic(optional = false)
    @Column(name = "LST_LP_ACH_DT")
    @Temporal(TemporalType.DATE)
    private Date lstLpAchDt;
    @Basic(optional = false)
    @Column(name = "LST_LP_ACH_AMT")
    private BigDecimal lstLpAchAmt;
    @Basic(optional = false)
    @Column(name = "BEC_CUST_ID")
    private String becCustId;
    @Basic(optional = false)
    @Column(name = "IN_AUTH_FLG")
    private Character inAuthFlg;
    @Basic(optional = false)
    @Column(name = "TEAM_ID")
    private String teamId;
    @Basic(optional = false)
    @Column(name = "PING_PURGE_DAYS")
    private short pingPurgeDays;
    @Basic(optional = false)
    @Column(name = "CNTRY_CD")
    private String cntryCd;
    @Basic(optional = false)
    @Column(name = "TRUCK_CNT")
    private int truckCnt;
    @Basic(optional = false)
    @Column(name = "ALT_PAY_FLG")
    private Character altPayFlg;
    @Basic(optional = false)
    @Column(name = "RTF_FLG")
    private Character rtfFlg;
    @Basic(optional = false)
    @Column(name = "CUST_UI_CD")
    private Character custUiCd;
    @Basic(optional = false)
    @Column(name = "CC_BUS_ST_CD")
    private String ccBusStCd;
    @Basic(optional = false)
    @Column(name = "CC_SURCHRG_PCT")
    private BigDecimal ccSurchrgPct;
    @Basic(optional = false)
    @Column(name = "CC_ACH_FEE_AMT")
    private BigDecimal ccAchFeeAmt;
    @Basic(optional = false)
    @Column(name = "RESELLER_ID")
    private String resellerId;
    @Basic(optional = false)
    @Column(name = "USDOT_NBR")
    private String usdotNbr;
    @Basic(optional = false)
    @Column(name = "MOTOR_CARRIER_NBR")
    private String motorCarrierNbr;
    @Basic(optional = false)
    @Column(name = "FEE_ON_CARD_FLG")
    private Character feeOnCardFlg;
    @Basic(optional = false)
    @Column(name = "PRE_AUTH_AMT")
    private int preAuthAmt;
    @Basic(optional = false)
    @Column(name = "DEBIT_FLG")
    private Character debitFlg;
    @Basic(optional = false)
    @Column(name = "PREFUND_TYPE")
    private String prefundType;
    @Basic(optional = false)
    @Column(name = "SPI_PURG_NBR_OF_MO")
    private String spiPurgNbrOfMo;

    public Accounts() {
    }

    public Accounts(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public Accounts(String acctNbr, String acctNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character pciMskngFlg, Character pciMskngCharCd, String plCd, String blngDivCd, String geacComp1Cd, String geacComp2Cd, String geacComp3Cd, String geacComp4Cd, String geacComp5Cd, String geacComp6Cd, String geacComp7Cd, String geacComp8Cd, String geacComp9Cd, String geacComp10Cd, Character fundMeth, Character vcFullAuthFlg, Character bihCshDispFlg, Character acctStatCd, Character vndrFeeOvrFlg, BigDecimal maxFeeOvrAmt, String billFeeCustId, int pfyThrshldAmt, Character thrdPtyAchFlg, short thrdPtyAchDelayCnt, Character refundFlg, int refundLimit, String rfrlCd1, String rfrlCd2, BigDecimal acctFeeOvrPct, String gfnCd, String trustAcctNbr, Character icdMaskFlg, Character goFundMeFlg, short goFundMeDelayCnt, Character billpayVendorInd, Character acctPrepaidFlg, Character acctsTelePartnerFlag, Date lstLpAchDt, BigDecimal lstLpAchAmt, String becCustId, Character inAuthFlg, String teamId, short pingPurgeDays, String cntryCd, int truckCnt, Character altPayFlg, Character rtfFlg, Character custUiCd, String ccBusStCd, BigDecimal ccSurchrgPct, BigDecimal ccAchFeeAmt, String resellerId, String usdotNbr, String motorCarrierNbr, Character feeOnCardFlg, int preAuthAmt, Character debitFlg, String prefundType, String spiPurgNbrOfMo) {
        this.acctNbr = acctNbr;
        this.acctNm = acctNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.pciMskngFlg = pciMskngFlg;
        this.pciMskngCharCd = pciMskngCharCd;
        this.plCd = plCd;
        this.blngDivCd = blngDivCd;
        this.geacComp1Cd = geacComp1Cd;
        this.geacComp2Cd = geacComp2Cd;
        this.geacComp3Cd = geacComp3Cd;
        this.geacComp4Cd = geacComp4Cd;
        this.geacComp5Cd = geacComp5Cd;
        this.geacComp6Cd = geacComp6Cd;
        this.geacComp7Cd = geacComp7Cd;
        this.geacComp8Cd = geacComp8Cd;
        this.geacComp9Cd = geacComp9Cd;
        this.geacComp10Cd = geacComp10Cd;
        this.fundMeth = fundMeth;
        this.vcFullAuthFlg = vcFullAuthFlg;
        this.bihCshDispFlg = bihCshDispFlg;
        this.acctStatCd = acctStatCd;
        this.vndrFeeOvrFlg = vndrFeeOvrFlg;
        this.maxFeeOvrAmt = maxFeeOvrAmt;
        this.billFeeCustId = billFeeCustId;
        this.pfyThrshldAmt = pfyThrshldAmt;
        this.thrdPtyAchFlg = thrdPtyAchFlg;
        this.thrdPtyAchDelayCnt = thrdPtyAchDelayCnt;
        this.refundFlg = refundFlg;
        this.refundLimit = refundLimit;
        this.rfrlCd1 = rfrlCd1;
        this.rfrlCd2 = rfrlCd2;
        this.acctFeeOvrPct = acctFeeOvrPct;
        this.gfnCd = gfnCd;
        this.trustAcctNbr = trustAcctNbr;
        this.icdMaskFlg = icdMaskFlg;
        this.goFundMeFlg = goFundMeFlg;
        this.goFundMeDelayCnt = goFundMeDelayCnt;
        this.billpayVendorInd = billpayVendorInd;
        this.acctPrepaidFlg = acctPrepaidFlg;
        this.acctsTelePartnerFlag = acctsTelePartnerFlag;
        this.lstLpAchDt = lstLpAchDt;
        this.lstLpAchAmt = lstLpAchAmt;
        this.becCustId = becCustId;
        this.inAuthFlg = inAuthFlg;
        this.teamId = teamId;
        this.pingPurgeDays = pingPurgeDays;
        this.cntryCd = cntryCd;
        this.truckCnt = truckCnt;
        this.altPayFlg = altPayFlg;
        this.rtfFlg = rtfFlg;
        this.custUiCd = custUiCd;
        this.ccBusStCd = ccBusStCd;
        this.ccSurchrgPct = ccSurchrgPct;
        this.ccAchFeeAmt = ccAchFeeAmt;
        this.resellerId = resellerId;
        this.usdotNbr = usdotNbr;
        this.motorCarrierNbr = motorCarrierNbr;
        this.feeOnCardFlg = feeOnCardFlg;
        this.preAuthAmt = preAuthAmt;
        this.debitFlg = debitFlg;
        this.prefundType = prefundType;
        this.spiPurgNbrOfMo = spiPurgNbrOfMo;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getAcctNm() {
        return acctNm;
    }

    public void setAcctNm(String acctNm) {
        this.acctNm = acctNm;
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

    public Character getPciMskngFlg() {
        return pciMskngFlg;
    }

    public void setPciMskngFlg(Character pciMskngFlg) {
        this.pciMskngFlg = pciMskngFlg;
    }

    public Character getPciMskngCharCd() {
        return pciMskngCharCd;
    }

    public void setPciMskngCharCd(Character pciMskngCharCd) {
        this.pciMskngCharCd = pciMskngCharCd;
    }

    public String getPlCd() {
        return plCd;
    }

    public void setPlCd(String plCd) {
        this.plCd = plCd;
    }

    public String getBlngDivCd() {
        return blngDivCd;
    }

    public void setBlngDivCd(String blngDivCd) {
        this.blngDivCd = blngDivCd;
    }

    public String getGeacComp1Cd() {
        return geacComp1Cd;
    }

    public void setGeacComp1Cd(String geacComp1Cd) {
        this.geacComp1Cd = geacComp1Cd;
    }

    public String getGeacComp2Cd() {
        return geacComp2Cd;
    }

    public void setGeacComp2Cd(String geacComp2Cd) {
        this.geacComp2Cd = geacComp2Cd;
    }

    public String getGeacComp3Cd() {
        return geacComp3Cd;
    }

    public void setGeacComp3Cd(String geacComp3Cd) {
        this.geacComp3Cd = geacComp3Cd;
    }

    public String getGeacComp4Cd() {
        return geacComp4Cd;
    }

    public void setGeacComp4Cd(String geacComp4Cd) {
        this.geacComp4Cd = geacComp4Cd;
    }

    public String getGeacComp5Cd() {
        return geacComp5Cd;
    }

    public void setGeacComp5Cd(String geacComp5Cd) {
        this.geacComp5Cd = geacComp5Cd;
    }

    public String getGeacComp6Cd() {
        return geacComp6Cd;
    }

    public void setGeacComp6Cd(String geacComp6Cd) {
        this.geacComp6Cd = geacComp6Cd;
    }

    public String getGeacComp7Cd() {
        return geacComp7Cd;
    }

    public void setGeacComp7Cd(String geacComp7Cd) {
        this.geacComp7Cd = geacComp7Cd;
    }

    public String getGeacComp8Cd() {
        return geacComp8Cd;
    }

    public void setGeacComp8Cd(String geacComp8Cd) {
        this.geacComp8Cd = geacComp8Cd;
    }

    public String getGeacComp9Cd() {
        return geacComp9Cd;
    }

    public void setGeacComp9Cd(String geacComp9Cd) {
        this.geacComp9Cd = geacComp9Cd;
    }

    public String getGeacComp10Cd() {
        return geacComp10Cd;
    }

    public void setGeacComp10Cd(String geacComp10Cd) {
        this.geacComp10Cd = geacComp10Cd;
    }

    public Character getEbpAcctInd() {
        return ebpAcctInd;
    }

    public void setEbpAcctInd(Character ebpAcctInd) {
        this.ebpAcctInd = ebpAcctInd;
    }

    public Character getFundMeth() {
        return fundMeth;
    }

    public void setFundMeth(Character fundMeth) {
        this.fundMeth = fundMeth;
    }

    public Character getVcFullAuthFlg() {
        return vcFullAuthFlg;
    }

    public void setVcFullAuthFlg(Character vcFullAuthFlg) {
        this.vcFullAuthFlg = vcFullAuthFlg;
    }

    public Character getBihCshDispFlg() {
        return bihCshDispFlg;
    }

    public void setBihCshDispFlg(Character bihCshDispFlg) {
        this.bihCshDispFlg = bihCshDispFlg;
    }

    public Character getAcctStatCd() {
        return acctStatCd;
    }

    public void setAcctStatCd(Character acctStatCd) {
        this.acctStatCd = acctStatCd;
    }

    public Character getVndrFeeOvrFlg() {
        return vndrFeeOvrFlg;
    }

    public void setVndrFeeOvrFlg(Character vndrFeeOvrFlg) {
        this.vndrFeeOvrFlg = vndrFeeOvrFlg;
    }

    public BigDecimal getMaxFeeOvrAmt() {
        return maxFeeOvrAmt;
    }

    public void setMaxFeeOvrAmt(BigDecimal maxFeeOvrAmt) {
        this.maxFeeOvrAmt = maxFeeOvrAmt;
    }

    public String getBillFeeCustId() {
        return billFeeCustId;
    }

    public void setBillFeeCustId(String billFeeCustId) {
        this.billFeeCustId = billFeeCustId;
    }

    public int getPfyThrshldAmt() {
        return pfyThrshldAmt;
    }

    public void setPfyThrshldAmt(int pfyThrshldAmt) {
        this.pfyThrshldAmt = pfyThrshldAmt;
    }

    public Character getThrdPtyAchFlg() {
        return thrdPtyAchFlg;
    }

    public void setThrdPtyAchFlg(Character thrdPtyAchFlg) {
        this.thrdPtyAchFlg = thrdPtyAchFlg;
    }

    public short getThrdPtyAchDelayCnt() {
        return thrdPtyAchDelayCnt;
    }

    public void setThrdPtyAchDelayCnt(short thrdPtyAchDelayCnt) {
        this.thrdPtyAchDelayCnt = thrdPtyAchDelayCnt;
    }

    public Character getRefundFlg() {
        return refundFlg;
    }

    public void setRefundFlg(Character refundFlg) {
        this.refundFlg = refundFlg;
    }

    public int getRefundLimit() {
        return refundLimit;
    }

    public void setRefundLimit(int refundLimit) {
        this.refundLimit = refundLimit;
    }

    public String getRfrlCd1() {
        return rfrlCd1;
    }

    public void setRfrlCd1(String rfrlCd1) {
        this.rfrlCd1 = rfrlCd1;
    }

    public String getRfrlCd2() {
        return rfrlCd2;
    }

    public void setRfrlCd2(String rfrlCd2) {
        this.rfrlCd2 = rfrlCd2;
    }

    public BigDecimal getAcctFeeOvrPct() {
        return acctFeeOvrPct;
    }

    public void setAcctFeeOvrPct(BigDecimal acctFeeOvrPct) {
        this.acctFeeOvrPct = acctFeeOvrPct;
    }

    public String getGfnCd() {
        return gfnCd;
    }

    public void setGfnCd(String gfnCd) {
        this.gfnCd = gfnCd;
    }

    public String getTrustAcctNbr() {
        return trustAcctNbr;
    }

    public void setTrustAcctNbr(String trustAcctNbr) {
        this.trustAcctNbr = trustAcctNbr;
    }

    public Character getIcdMaskFlg() {
        return icdMaskFlg;
    }

    public void setIcdMaskFlg(Character icdMaskFlg) {
        this.icdMaskFlg = icdMaskFlg;
    }

    public Character getGoFundMeFlg() {
        return goFundMeFlg;
    }

    public void setGoFundMeFlg(Character goFundMeFlg) {
        this.goFundMeFlg = goFundMeFlg;
    }

    public short getGoFundMeDelayCnt() {
        return goFundMeDelayCnt;
    }

    public void setGoFundMeDelayCnt(short goFundMeDelayCnt) {
        this.goFundMeDelayCnt = goFundMeDelayCnt;
    }

    public Character getBillpayVendorInd() {
        return billpayVendorInd;
    }

    public void setBillpayVendorInd(Character billpayVendorInd) {
        this.billpayVendorInd = billpayVendorInd;
    }

    public Character getAcctPrepaidFlg() {
        return acctPrepaidFlg;
    }

    public void setAcctPrepaidFlg(Character acctPrepaidFlg) {
        this.acctPrepaidFlg = acctPrepaidFlg;
    }

    public Character getAcctsTelePartnerFlag() {
        return acctsTelePartnerFlag;
    }

    public void setAcctsTelePartnerFlag(Character acctsTelePartnerFlag) {
        this.acctsTelePartnerFlag = acctsTelePartnerFlag;
    }

    public Date getLstLpAchDt() {
        return lstLpAchDt;
    }

    public void setLstLpAchDt(Date lstLpAchDt) {
        this.lstLpAchDt = lstLpAchDt;
    }

    public BigDecimal getLstLpAchAmt() {
        return lstLpAchAmt;
    }

    public void setLstLpAchAmt(BigDecimal lstLpAchAmt) {
        this.lstLpAchAmt = lstLpAchAmt;
    }

    public String getBecCustId() {
        return becCustId;
    }

    public void setBecCustId(String becCustId) {
        this.becCustId = becCustId;
    }

    public Character getInAuthFlg() {
        return inAuthFlg;
    }

    public void setInAuthFlg(Character inAuthFlg) {
        this.inAuthFlg = inAuthFlg;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public short getPingPurgeDays() {
        return pingPurgeDays;
    }

    public void setPingPurgeDays(short pingPurgeDays) {
        this.pingPurgeDays = pingPurgeDays;
    }

    public String getCntryCd() {
        return cntryCd;
    }

    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    public int getTruckCnt() {
        return truckCnt;
    }

    public void setTruckCnt(int truckCnt) {
        this.truckCnt = truckCnt;
    }

    public Character getAltPayFlg() {
        return altPayFlg;
    }

    public void setAltPayFlg(Character altPayFlg) {
        this.altPayFlg = altPayFlg;
    }

    public Character getRtfFlg() {
        return rtfFlg;
    }

    public void setRtfFlg(Character rtfFlg) {
        this.rtfFlg = rtfFlg;
    }

    public Character getCustUiCd() {
        return custUiCd;
    }

    public void setCustUiCd(Character custUiCd) {
        this.custUiCd = custUiCd;
    }

    public String getCcBusStCd() {
        return ccBusStCd;
    }

    public void setCcBusStCd(String ccBusStCd) {
        this.ccBusStCd = ccBusStCd;
    }

    public BigDecimal getCcSurchrgPct() {
        return ccSurchrgPct;
    }

    public void setCcSurchrgPct(BigDecimal ccSurchrgPct) {
        this.ccSurchrgPct = ccSurchrgPct;
    }

    public BigDecimal getCcAchFeeAmt() {
        return ccAchFeeAmt;
    }

    public void setCcAchFeeAmt(BigDecimal ccAchFeeAmt) {
        this.ccAchFeeAmt = ccAchFeeAmt;
    }

    public String getResellerId() {
        return resellerId;
    }

    public void setResellerId(String resellerId) {
        this.resellerId = resellerId;
    }

    public String getUsdotNbr() {
        return usdotNbr;
    }

    public void setUsdotNbr(String usdotNbr) {
        this.usdotNbr = usdotNbr;
    }

    public String getMotorCarrierNbr() {
        return motorCarrierNbr;
    }

    public void setMotorCarrierNbr(String motorCarrierNbr) {
        this.motorCarrierNbr = motorCarrierNbr;
    }

    public Character getFeeOnCardFlg() {
        return feeOnCardFlg;
    }

    public void setFeeOnCardFlg(Character feeOnCardFlg) {
        this.feeOnCardFlg = feeOnCardFlg;
    }

    public int getPreAuthAmt() {
        return preAuthAmt;
    }

    public void setPreAuthAmt(int preAuthAmt) {
        this.preAuthAmt = preAuthAmt;
    }

    public Character getDebitFlg() {
        return debitFlg;
    }

    public void setDebitFlg(Character debitFlg) {
        this.debitFlg = debitFlg;
    }

    public String getPrefundType() {
        return prefundType;
    }

    public void setPrefundType(String prefundType) {
        this.prefundType = prefundType;
    }

    public String getSpiPurgNbrOfMo() {
        return spiPurgNbrOfMo;
    }

    public void setSpiPurgNbrOfMo(String spiPurgNbrOfMo) {
        this.spiPurgNbrOfMo = spiPurgNbrOfMo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Accounts)) {
            return false;
        }
        Accounts other = (Accounts) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Accounts[ acctNbr=" + acctNbr + " ]";
    }

}
