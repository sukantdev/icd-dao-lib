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
@Table(name = "LOAD_PAY_NETWRK_LOADS", catalog = "", schema = "DBO")
public class LoadPayNetwrkLoads implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LoadPayNetwrkLoadsPK loadPayNetwrkLoadsPK;
    @Basic(optional = false)
    @Column(name = "SHPR_EMAIL_ADDR")
    private String shprEmailAddr;
    @Basic(optional = false)
    @Column(name = "SHPR_DOT_NBR")
    private String shprDotNbr;
    @Basic(optional = false)
    @Column(name = "ORIG_CITY")
    private String origCity;
    @Basic(optional = false)
    @Column(name = "ORIG_ST")
    private String origSt;
    @Basic(optional = false)
    @Column(name = "ORIG_ZIP")
    private int origZip;
    @Basic(optional = false)
    @Column(name = "DEST_CITY")
    private String destCity;
    @Basic(optional = false)
    @Column(name = "DEST_ST")
    private String destSt;
    @Basic(optional = false)
    @Column(name = "DEST_ZIP")
    private int destZip;

    @Basic(optional = false)
    @Column(name = "LOAD_RECVD_AMT")
    private BigDecimal loadRecvdAmt;
    @Basic(optional = false)
    @Column(name = "LOAD_RECVD_DT")
    @Temporal(TemporalType.DATE)
    private Date loadRecvdDt;
    @Basic(optional = false)
    @Column(name = "LOAD_RECVD_TM")
    @Temporal(TemporalType.TIME)
    private Date loadRecvdTm;
    @Basic(optional = false)
    @Column(name = "CARGO_PICKUP_DT")
    @Temporal(TemporalType.DATE)
    private Date cargoPickupDt;
    @Basic(optional = false)
    @Column(name = "CARGO_PICKUP_TM")
    @Temporal(TemporalType.TIME)
    private Date cargoPickupTm;
    @Basic(optional = false)
    @Column(name = "CARGO_DELIVERED_DT")
    @Temporal(TemporalType.DATE)
    private Date cargoDeliveredDt;
    @Basic(optional = false)
    @Column(name = "CARGO_DELIVERED_TM")
    @Temporal(TemporalType.TIME)
    private Date cargoDeliveredTm;
    @Basic(optional = false)
    @Column(name = "LOAD_STATUS_FLG")
    private Character loadStatusFlg;
    @Basic(optional = false)
    @Column(name = "CARR_PYMT_AMT")
    private BigDecimal carrPymtAmt;
    @Basic(optional = false)
    @Column(name = "CARR_INVOICE_NBR")
    private String carrInvoiceNbr;
    @Basic(optional = false)
    @Column(name = "CARR_PAY_DT")
    @Temporal(TemporalType.DATE)
    private Date carrPayDt;
    @Basic(optional = false)
    @Column(name = "CARR_PAY_TM")
    @Temporal(TemporalType.TIME)
    private Date carrPayTm;
    @Basic(optional = false)
    @Column(name = "TRLR_TYP_TXT")
    private String trlrTypTxt;
    @Basic(optional = false)
    @Column(name = "COMMODITIES_TXT")
    private String commoditiesTxt;
    @Basic(optional = false)
    @Column(name = "MILEAGE_NBR")
    private int mileageNbr;
    @Basic(optional = false)
    @Column(name = "EXTRA_STOPS_FLG")
    private Character extraStopsFlg;
    @Basic(optional = false)
    @Column(name = "RECEIVED_ON_HOST_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedOnHostDt;
    @Basic(optional = false)
    @Column(name = "ADV_FINAL_FLG")
    private Character advFinalFlg;
    @Basic(optional = false)
    @Column(name = "FUEL_SURCHG_AMT")
    private BigDecimal fuelSurchgAmt;
    @Basic(optional = false)
    @Column(name = "SHPR_CUST_LPN_FLG")
    private Character shprCustLpnFlg;
    @Basic(optional = false)
    @Column(name = "SHPR_CUST_PMN_FLG")
    private Character shprCustPmnFlg;
    @Basic(optional = false)
    @Column(name = "SHPR_CUST_PREPAID_FLG")
    private Character shprCustPrepaidFlg;
    @Basic(optional = false)
    @Column(name = "SHPR_INV_BY_CDN_DT")
    @Temporal(TemporalType.DATE)
    private Date shprInvByCdnDt;
    @Basic(optional = false)
    @Column(name = "HEIGHT_AMT")
    private int heightAmt;
    @Basic(optional = false)
    @Column(name = "WEIGHT_AMT")
    private int weightAmt;
    @Basic(optional = false)
    @Column(name = "SHPR_LOAD_MONEY_REF_NBR")
    private int shprLoadMoneyRefNbr;
    @Basic(optional = false)
    @Column(name = "SHPR_LOAD_SUBTRACT_REF_NBR")
    private int shprLoadSubtractRefNbr;
    @Basic(optional = false)
    @Column(name = "CARR_LOAD_MONEY_REF_NBR")
    private int carrLoadMoneyRefNbr;
    @Basic(optional = false)
    @Column(name = "SHPR_PLUS_LESS_FLG")
    private Character shprPlusLessFlg;
    @Basic(optional = false)
    @Column(name = "SHPR_EXPRESS_BILLING_FLG")
    private Character shprExpressBillingFlg;
    @Basic(optional = false)
    @Column(name = "SHPR_INVOICE_AMT")
    private BigDecimal shprInvoiceAmt;
    @Basic(optional = false)
    @Column(name = "SHPR_REVENUE_AMT")
    private BigDecimal shprRevenueAmt;
    @Basic(optional = false)
    @Column(name = "CARR_PLUS_LESS_FLG")
    private Character carrPlusLessFlg;
    @Basic(optional = false)
    @Column(name = "CARR_EXPRESS_BILLING_FLG")
    private Character carrExpressBillingFlg;
    @Basic(optional = false)
    @Column(name = "CARR_INVOICE_AMT")
    private BigDecimal carrInvoiceAmt;
    @Basic(optional = false)
    @Column(name = "CARR_REVENUE_AMT")
    private BigDecimal carrRevenueAmt;
    @Basic(optional = false)
    @Column(name = "CDN_ACCT_CD")
    private String cdnAcctCd;
    @Basic(optional = false)
    @Column(name = "CDN_CUSTID")
    private String cdnCustid;
    @Basic(optional = false)
    @Column(name = "CARD_NBR")
    private String cardNbr;
    @Basic(optional = false)
    @Column(name = "LOAD_DT")
    @Temporal(TemporalType.DATE)
    private Date loadDt;
    @Basic(optional = false)
    @Column(name = "LOAD_TM")
    @Temporal(TemporalType.TIME)
    private Date loadTm;
    @Basic(optional = false)
    @Column(name = "DUP_CTR_NBR")
    private int dupCtrNbr;
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
    @Column(name = "SHPR_1ST_BNK_EMAIL_FLG")
    private Character shpr1stBnkEmailFlg;
    @Basic(optional = false)
    @Column(name = "SRC_CD")
    private String srcCd;
    @Basic(optional = false)
    @Column(name = "SHPR_CUST_NM")
    private String shprCustNm;
    @Basic(optional = false)
    @Column(name = "CRDHOLDER_ID")
    private String crdholderId;
    @Basic(optional = false)
    @Column(name = "USER_FLD1_VALUE")
    private String userFld1Value;
    @Basic(optional = false)
    @Column(name = "USER_FLD1_ENTRY")
    private String userFld1Entry;
    @Basic(optional = false)
    @Column(name = "MOBAPP_DISPLAY1")
    private String mobappDisplay1;
    @Basic(optional = false)
    @Column(name = "USER_FLD2_VALUE")
    private String userFld2Value;
    @Basic(optional = false)
    @Column(name = "USER_FLD2_ENTRY")
    private String userFld2Entry;
    @Basic(optional = false)
    @Column(name = "MOBAPP_DISPLAY2")
    private String mobappDisplay2;
    @Basic(optional = false)
    @Column(name = "USER_FLD3_VALUE")
    private String userFld3Value;
    @Basic(optional = false)
    @Column(name = "USER_FLD3_ENTRY")
    private String userFld3Entry;
    @Basic(optional = false)
    @Column(name = "MOBAPP_DISPLAY3")
    private String mobappDisplay3;

    public LoadPayNetwrkLoads() {
    }

    public LoadPayNetwrkLoads(LoadPayNetwrkLoadsPK loadPayNetwrkLoadsPK) {
        this.loadPayNetwrkLoadsPK = loadPayNetwrkLoadsPK;
    }

    public LoadPayNetwrkLoads(LoadPayNetwrkLoadsPK loadPayNetwrkLoadsPK, String shprEmailAddr, String shprDotNbr, String origCity, String origSt, int origZip, String destCity, String destSt, int destZip, BigDecimal loadRecvdAmt, Date loadRecvdDt, Date loadRecvdTm, Date cargoPickupDt, Date cargoPickupTm, Date cargoDeliveredDt, Date cargoDeliveredTm, Character loadStatusFlg, BigDecimal carrPymtAmt, String carrInvoiceNbr, Date carrPayDt, Date carrPayTm, String trlrTypTxt, String commoditiesTxt, int mileageNbr, Character extraStopsFlg, Date receivedOnHostDt, Character advFinalFlg, BigDecimal fuelSurchgAmt, Character shprCustLpnFlg, Character shprCustPmnFlg, Character shprCustPrepaidFlg, Date shprInvByCdnDt, int heightAmt, int weightAmt, int shprLoadMoneyRefNbr, int shprLoadSubtractRefNbr, int carrLoadMoneyRefNbr, Character shprPlusLessFlg, Character shprExpressBillingFlg, BigDecimal shprInvoiceAmt, BigDecimal shprRevenueAmt, Character carrPlusLessFlg, Character carrExpressBillingFlg, BigDecimal carrInvoiceAmt, BigDecimal carrRevenueAmt, String cdnAcctCd, String cdnCustid, String cardNbr, Date loadDt, Date loadTm, int dupCtrNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character shpr1stBnkEmailFlg, String srcCd, String shprCustNm, String crdholderId, String userFld1Value, String userFld1Entry, String mobappDisplay1, String userFld2Value, String userFld2Entry, String mobappDisplay2, String userFld3Value, String userFld3Entry, String mobappDisplay3) {
        this.loadPayNetwrkLoadsPK = loadPayNetwrkLoadsPK;
        this.shprEmailAddr = shprEmailAddr;
        this.shprDotNbr = shprDotNbr;
        this.origCity = origCity;
        this.origSt = origSt;
        this.origZip = origZip;
        this.destCity = destCity;
        this.destSt = destSt;
        this.destZip = destZip;
        this.loadRecvdAmt = loadRecvdAmt;
        this.loadRecvdDt = loadRecvdDt;
        this.loadRecvdTm = loadRecvdTm;
        this.cargoPickupDt = cargoPickupDt;
        this.cargoPickupTm = cargoPickupTm;
        this.cargoDeliveredDt = cargoDeliveredDt;
        this.cargoDeliveredTm = cargoDeliveredTm;
        this.loadStatusFlg = loadStatusFlg;
        this.carrPymtAmt = carrPymtAmt;
        this.carrInvoiceNbr = carrInvoiceNbr;
        this.carrPayDt = carrPayDt;
        this.carrPayTm = carrPayTm;
        this.trlrTypTxt = trlrTypTxt;
        this.commoditiesTxt = commoditiesTxt;
        this.mileageNbr = mileageNbr;
        this.extraStopsFlg = extraStopsFlg;
        this.receivedOnHostDt = receivedOnHostDt;
        this.advFinalFlg = advFinalFlg;
        this.fuelSurchgAmt = fuelSurchgAmt;
        this.shprCustLpnFlg = shprCustLpnFlg;
        this.shprCustPmnFlg = shprCustPmnFlg;
        this.shprCustPrepaidFlg = shprCustPrepaidFlg;
        this.shprInvByCdnDt = shprInvByCdnDt;
        this.heightAmt = heightAmt;
        this.weightAmt = weightAmt;
        this.shprLoadMoneyRefNbr = shprLoadMoneyRefNbr;
        this.shprLoadSubtractRefNbr = shprLoadSubtractRefNbr;
        this.carrLoadMoneyRefNbr = carrLoadMoneyRefNbr;
        this.shprPlusLessFlg = shprPlusLessFlg;
        this.shprExpressBillingFlg = shprExpressBillingFlg;
        this.shprInvoiceAmt = shprInvoiceAmt;
        this.shprRevenueAmt = shprRevenueAmt;
        this.carrPlusLessFlg = carrPlusLessFlg;
        this.carrExpressBillingFlg = carrExpressBillingFlg;
        this.carrInvoiceAmt = carrInvoiceAmt;
        this.carrRevenueAmt = carrRevenueAmt;
        this.cdnAcctCd = cdnAcctCd;
        this.cdnCustid = cdnCustid;
        this.cardNbr = cardNbr;
        this.loadDt = loadDt;
        this.loadTm = loadTm;
        this.dupCtrNbr = dupCtrNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.shpr1stBnkEmailFlg = shpr1stBnkEmailFlg;
        this.srcCd = srcCd;
        this.shprCustNm = shprCustNm;
        this.crdholderId = crdholderId;
        this.userFld1Value = userFld1Value;
        this.userFld1Entry = userFld1Entry;
        this.mobappDisplay1 = mobappDisplay1;
        this.userFld2Value = userFld2Value;
        this.userFld2Entry = userFld2Entry;
        this.mobappDisplay2 = mobappDisplay2;
        this.userFld3Value = userFld3Value;
        this.userFld3Entry = userFld3Entry;
        this.mobappDisplay3 = mobappDisplay3;
    }

    public LoadPayNetwrkLoads(String srvPrvdrAcctAbbrev, String shprId, String carrId, String loadId, Date loadRecvdTs) {
        this.loadPayNetwrkLoadsPK = new LoadPayNetwrkLoadsPK(srvPrvdrAcctAbbrev, shprId, carrId, loadId, loadRecvdTs);
    }

    public LoadPayNetwrkLoadsPK getLoadPayNetwrkLoadsPK() {
        return loadPayNetwrkLoadsPK;
    }

    public void setLoadPayNetwrkLoadsPK(LoadPayNetwrkLoadsPK loadPayNetwrkLoadsPK) {
        this.loadPayNetwrkLoadsPK = loadPayNetwrkLoadsPK;
    }

    public String getShprEmailAddr() {
        return shprEmailAddr;
    }

    public void setShprEmailAddr(String shprEmailAddr) {
        this.shprEmailAddr = shprEmailAddr;
    }

    public String getShprDotNbr() {
        return shprDotNbr;
    }

    public void setShprDotNbr(String shprDotNbr) {
        this.shprDotNbr = shprDotNbr;
    }

    public String getOrigCity() {
        return origCity;
    }

    public void setOrigCity(String origCity) {
        this.origCity = origCity;
    }

    public String getOrigSt() {
        return origSt;
    }

    public void setOrigSt(String origSt) {
        this.origSt = origSt;
    }

    public int getOrigZip() {
        return origZip;
    }

    public void setOrigZip(int origZip) {
        this.origZip = origZip;
    }

    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    public String getDestSt() {
        return destSt;
    }

    public void setDestSt(String destSt) {
        this.destSt = destSt;
    }

    public int getDestZip() {
        return destZip;
    }

    public void setDestZip(int destZip) {
        this.destZip = destZip;
    }

    public BigDecimal getLoadRecvdAmt() {
        return loadRecvdAmt;
    }

    public void setLoadRecvdAmt(BigDecimal loadRecvdAmt) {
        this.loadRecvdAmt = loadRecvdAmt;
    }

    public Date getLoadRecvdDt() {
        return loadRecvdDt;
    }

    public void setLoadRecvdDt(Date loadRecvdDt) {
        this.loadRecvdDt = loadRecvdDt;
    }

    public Date getLoadRecvdTm() {
        return loadRecvdTm;
    }

    public void setLoadRecvdTm(Date loadRecvdTm) {
        this.loadRecvdTm = loadRecvdTm;
    }

    public Date getCargoPickupDt() {
        return cargoPickupDt;
    }

    public void setCargoPickupDt(Date cargoPickupDt) {
        this.cargoPickupDt = cargoPickupDt;
    }

    public Date getCargoPickupTm() {
        return cargoPickupTm;
    }

    public void setCargoPickupTm(Date cargoPickupTm) {
        this.cargoPickupTm = cargoPickupTm;
    }

    public Date getCargoDeliveredDt() {
        return cargoDeliveredDt;
    }

    public void setCargoDeliveredDt(Date cargoDeliveredDt) {
        this.cargoDeliveredDt = cargoDeliveredDt;
    }

    public Date getCargoDeliveredTm() {
        return cargoDeliveredTm;
    }

    public void setCargoDeliveredTm(Date cargoDeliveredTm) {
        this.cargoDeliveredTm = cargoDeliveredTm;
    }

    public Character getLoadStatusFlg() {
        return loadStatusFlg;
    }

    public void setLoadStatusFlg(Character loadStatusFlg) {
        this.loadStatusFlg = loadStatusFlg;
    }

    public BigDecimal getCarrPymtAmt() {
        return carrPymtAmt;
    }

    public void setCarrPymtAmt(BigDecimal carrPymtAmt) {
        this.carrPymtAmt = carrPymtAmt;
    }

    public String getCarrInvoiceNbr() {
        return carrInvoiceNbr;
    }

    public void setCarrInvoiceNbr(String carrInvoiceNbr) {
        this.carrInvoiceNbr = carrInvoiceNbr;
    }

    public Date getCarrPayDt() {
        return carrPayDt;
    }

    public void setCarrPayDt(Date carrPayDt) {
        this.carrPayDt = carrPayDt;
    }

    public Date getCarrPayTm() {
        return carrPayTm;
    }

    public void setCarrPayTm(Date carrPayTm) {
        this.carrPayTm = carrPayTm;
    }

    public String getTrlrTypTxt() {
        return trlrTypTxt;
    }

    public void setTrlrTypTxt(String trlrTypTxt) {
        this.trlrTypTxt = trlrTypTxt;
    }

    public String getCommoditiesTxt() {
        return commoditiesTxt;
    }

    public void setCommoditiesTxt(String commoditiesTxt) {
        this.commoditiesTxt = commoditiesTxt;
    }

    public int getMileageNbr() {
        return mileageNbr;
    }

    public void setMileageNbr(int mileageNbr) {
        this.mileageNbr = mileageNbr;
    }

    public Character getExtraStopsFlg() {
        return extraStopsFlg;
    }

    public void setExtraStopsFlg(Character extraStopsFlg) {
        this.extraStopsFlg = extraStopsFlg;
    }

    public Date getReceivedOnHostDt() {
        return receivedOnHostDt;
    }

    public void setReceivedOnHostDt(Date receivedOnHostDt) {
        this.receivedOnHostDt = receivedOnHostDt;
    }

    public Character getAdvFinalFlg() {
        return advFinalFlg;
    }

    public void setAdvFinalFlg(Character advFinalFlg) {
        this.advFinalFlg = advFinalFlg;
    }

    public BigDecimal getFuelSurchgAmt() {
        return fuelSurchgAmt;
    }

    public void setFuelSurchgAmt(BigDecimal fuelSurchgAmt) {
        this.fuelSurchgAmt = fuelSurchgAmt;
    }

    public Character getShprCustLpnFlg() {
        return shprCustLpnFlg;
    }

    public void setShprCustLpnFlg(Character shprCustLpnFlg) {
        this.shprCustLpnFlg = shprCustLpnFlg;
    }

    public Character getShprCustPmnFlg() {
        return shprCustPmnFlg;
    }

    public void setShprCustPmnFlg(Character shprCustPmnFlg) {
        this.shprCustPmnFlg = shprCustPmnFlg;
    }

    public Character getShprCustPrepaidFlg() {
        return shprCustPrepaidFlg;
    }

    public void setShprCustPrepaidFlg(Character shprCustPrepaidFlg) {
        this.shprCustPrepaidFlg = shprCustPrepaidFlg;
    }

    public Date getShprInvByCdnDt() {
        return shprInvByCdnDt;
    }

    public void setShprInvByCdnDt(Date shprInvByCdnDt) {
        this.shprInvByCdnDt = shprInvByCdnDt;
    }

    public int getHeightAmt() {
        return heightAmt;
    }

    public void setHeightAmt(int heightAmt) {
        this.heightAmt = heightAmt;
    }

    public int getWeightAmt() {
        return weightAmt;
    }

    public void setWeightAmt(int weightAmt) {
        this.weightAmt = weightAmt;
    }

    public int getShprLoadMoneyRefNbr() {
        return shprLoadMoneyRefNbr;
    }

    public void setShprLoadMoneyRefNbr(int shprLoadMoneyRefNbr) {
        this.shprLoadMoneyRefNbr = shprLoadMoneyRefNbr;
    }

    public int getShprLoadSubtractRefNbr() {
        return shprLoadSubtractRefNbr;
    }

    public void setShprLoadSubtractRefNbr(int shprLoadSubtractRefNbr) {
        this.shprLoadSubtractRefNbr = shprLoadSubtractRefNbr;
    }

    public int getCarrLoadMoneyRefNbr() {
        return carrLoadMoneyRefNbr;
    }

    public void setCarrLoadMoneyRefNbr(int carrLoadMoneyRefNbr) {
        this.carrLoadMoneyRefNbr = carrLoadMoneyRefNbr;
    }

    public Character getShprPlusLessFlg() {
        return shprPlusLessFlg;
    }

    public void setShprPlusLessFlg(Character shprPlusLessFlg) {
        this.shprPlusLessFlg = shprPlusLessFlg;
    }

    public Character getShprExpressBillingFlg() {
        return shprExpressBillingFlg;
    }

    public void setShprExpressBillingFlg(Character shprExpressBillingFlg) {
        this.shprExpressBillingFlg = shprExpressBillingFlg;
    }

    public BigDecimal getShprInvoiceAmt() {
        return shprInvoiceAmt;
    }

    public void setShprInvoiceAmt(BigDecimal shprInvoiceAmt) {
        this.shprInvoiceAmt = shprInvoiceAmt;
    }

    public BigDecimal getShprRevenueAmt() {
        return shprRevenueAmt;
    }

    public void setShprRevenueAmt(BigDecimal shprRevenueAmt) {
        this.shprRevenueAmt = shprRevenueAmt;
    }

    public Character getCarrPlusLessFlg() {
        return carrPlusLessFlg;
    }

    public void setCarrPlusLessFlg(Character carrPlusLessFlg) {
        this.carrPlusLessFlg = carrPlusLessFlg;
    }

    public Character getCarrExpressBillingFlg() {
        return carrExpressBillingFlg;
    }

    public void setCarrExpressBillingFlg(Character carrExpressBillingFlg) {
        this.carrExpressBillingFlg = carrExpressBillingFlg;
    }

    public BigDecimal getCarrInvoiceAmt() {
        return carrInvoiceAmt;
    }

    public void setCarrInvoiceAmt(BigDecimal carrInvoiceAmt) {
        this.carrInvoiceAmt = carrInvoiceAmt;
    }

    public BigDecimal getCarrRevenueAmt() {
        return carrRevenueAmt;
    }

    public void setCarrRevenueAmt(BigDecimal carrRevenueAmt) {
        this.carrRevenueAmt = carrRevenueAmt;
    }

    public String getCdnAcctCd() {
        return cdnAcctCd;
    }

    public void setCdnAcctCd(String cdnAcctCd) {
        this.cdnAcctCd = cdnAcctCd;
    }

    public String getCdnCustid() {
        return cdnCustid;
    }

    public void setCdnCustid(String cdnCustid) {
        this.cdnCustid = cdnCustid;
    }

    public String getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr;
    }

    public Date getLoadDt() {
        return loadDt;
    }

    public void setLoadDt(Date loadDt) {
        this.loadDt = loadDt;
    }

    public Date getLoadTm() {
        return loadTm;
    }

    public void setLoadTm(Date loadTm) {
        this.loadTm = loadTm;
    }

    public int getDupCtrNbr() {
        return dupCtrNbr;
    }

    public void setDupCtrNbr(int dupCtrNbr) {
        this.dupCtrNbr = dupCtrNbr;
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

    public Character getShpr1stBnkEmailFlg() {
        return shpr1stBnkEmailFlg;
    }

    public void setShpr1stBnkEmailFlg(Character shpr1stBnkEmailFlg) {
        this.shpr1stBnkEmailFlg = shpr1stBnkEmailFlg;
    }

    public String getSrcCd() {
        return srcCd;
    }

    public void setSrcCd(String srcCd) {
        this.srcCd = srcCd;
    }

    public String getShprCustNm() {
        return shprCustNm;
    }

    public void setShprCustNm(String shprCustNm) {
        this.shprCustNm = shprCustNm;
    }

    public String getCrdholderId() {
        return crdholderId;
    }

    public void setCrdholderId(String crdholderId) {
        this.crdholderId = crdholderId;
    }

    public String getUserFld1Value() {
        return userFld1Value;
    }

    public void setUserFld1Value(String userFld1Value) {
        this.userFld1Value = userFld1Value;
    }

    public String getUserFld1Entry() {
        return userFld1Entry;
    }

    public void setUserFld1Entry(String userFld1Entry) {
        this.userFld1Entry = userFld1Entry;
    }

    public String getMobappDisplay1() {
        return mobappDisplay1;
    }

    public void setMobappDisplay1(String mobappDisplay1) {
        this.mobappDisplay1 = mobappDisplay1;
    }

    public String getUserFld2Value() {
        return userFld2Value;
    }

    public void setUserFld2Value(String userFld2Value) {
        this.userFld2Value = userFld2Value;
    }

    public String getUserFld2Entry() {
        return userFld2Entry;
    }

    public void setUserFld2Entry(String userFld2Entry) {
        this.userFld2Entry = userFld2Entry;
    }

    public String getMobappDisplay2() {
        return mobappDisplay2;
    }

    public void setMobappDisplay2(String mobappDisplay2) {
        this.mobappDisplay2 = mobappDisplay2;
    }

    public String getUserFld3Value() {
        return userFld3Value;
    }

    public void setUserFld3Value(String userFld3Value) {
        this.userFld3Value = userFld3Value;
    }

    public String getUserFld3Entry() {
        return userFld3Entry;
    }

    public void setUserFld3Entry(String userFld3Entry) {
        this.userFld3Entry = userFld3Entry;
    }

    public String getMobappDisplay3() {
        return mobappDisplay3;
    }

    public void setMobappDisplay3(String mobappDisplay3) {
        this.mobappDisplay3 = mobappDisplay3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loadPayNetwrkLoadsPK != null ? loadPayNetwrkLoadsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof LoadPayNetwrkLoads)) {
            return false;
        }
        LoadPayNetwrkLoads other = (LoadPayNetwrkLoads) object;
        if ((this.loadPayNetwrkLoadsPK == null && other.loadPayNetwrkLoadsPK != null) || (this.loadPayNetwrkLoadsPK != null && !this.loadPayNetwrkLoadsPK.equals(other.loadPayNetwrkLoadsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.LoadPayNetwrkLoads[ loadPayNetwrkLoadsPK=" + loadPayNetwrkLoadsPK + " ]";
    }

}
