/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "ERECEIPT_PHOTON", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "EreceiptPhoton.findAll", query = "SELECT e FROM EreceiptPhoton e")})
public class EreceiptPhoton implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EreceiptPhotonPK ereceiptPhotonPK;
    @Column(name = "P_PHOTON_KEY")
    private String pPhotonKey;
    @Column(name = "P_CHAIN_NAME")
    private String pChainName;
    @Column(name = "P_CHAIN_TAX_ID")
    private String pChainTaxId;
    @Column(name = "P_CHAIN_CORP_ADDRESS")
    private String pChainCorpAddress;
    @Column(name = "P_CHAIN_CORP_CITY_ST_ZIP")
    private String pChainCorpCityStZip;
    @Column(name = "P_CHAIN_CORP_PHONE")
    private String pChainCorpPhone;
    @Column(name = "P_MERCH_TAX_ID")
    private String pMerchTaxId;
    @Column(name = "P_MERCH_CHAIN_LOGO")
    private String pMerchChainLogo;
    @Column(name = "P_MERCH_CORP_LOGO")
    private String pMerchCorpLogo;
    @Column(name = "P_MERCH_CORP_NAME")
    private String pMerchCorpName;
    @Column(name = "P_CHAIN_LOC_ID")
    private String pChainLocId;
    @Column(name = "P_MERCH_CORP_ADDRESS")
    private String pMerchCorpAddress;
    @Column(name = "P_MERCH_CORP_CITY_ST_ZIP")
    private String pMerchCorpCityStZip;
    @Column(name = "P_MERCH_PHONE")
    private String pMerchPhone;
    @Column(name = "P_MERCH_NAME")
    private String pMerchName;
    @Column(name = "P_MERCH_ADDR")
    private String pMerchAddr;
    @Column(name = "P_MERCH_CITY_ST_ZIP")
    private String pMerchCityStZip;
    @Column(name = "P_MERCH_RECEIPT_ID")
    private String pMerchReceiptId;
    @Column(name = "P_CARRIER_NAME")
    private String pCarrierName;
    @Column(name = "P_CARRIER_DRIVER_PHONE")
    private String pCarrierDriverPhone;
    @Column(name = "P_RECEIPT_TRANS_DT")
    private String pReceiptTransDt;
    @Column(name = "P_WAREHOUSE_DOOR_NBR")
    private String pWarehouseDoorNbr;
    @Column(name = "P_DOCK_NBR")
    private String pDockNbr;
    @Column(name = "P_LOAD_NUMBER")
    private String pLoadNumber;
    @Column(name = "P_TRL_NBR")
    private String pTrlNbr;
    @Column(name = "P_UNIT_NBR")
    private String pUnitNbr;
    @Lob
    @Column(name = "P_MERCH_PO_DETAILS")
    private String pMerchPoDetails;
    @Column(name = "P_PALLET_START_COUNT")
    private String pPalletStartCount;
    @Column(name = "P_PALLET_END_COUNT")
    private String pPalletEndCount;
    @Column(name = "P_SPECIAL_CIRCUM_COMMENT")
    private String pSpecialCircumComment;
    @Column(name = "P_APPT_TIME")
    private String pApptTime;
    @Column(name = "P_DRIVER_CHECKIN_TIME")
    private String pDriverCheckinTime;
    @Column(name = "P_DOOR_ASSIGN_TIME")
    private String pDoorAssignTime;
    @Column(name = "P_LUMP_START_TIME")
    private String pLumpStartTime;
    @Column(name = "P_LUMP_END_TIME")
    private String pLumpEndTime;
    @Column(name = "P_BOL_SIGN_TIME")
    private String pBolSignTime;
    @Column(name = "P_BASE_CHARGE_AMT")
    private String pBaseChargeAmt;
    @Column(name = "P_ADD_FEE_SUBTOTAL")
    private String pAddFeeSubtotal;
    @Column(name = "P_CONV_FEE")
    private String pConvFee;
    @Column(name = "P_TOTAL_COST")
    private String pTotalCost;
    @Column(name = "P_CARD_OR_CODE")
    private String pCardOrCode;
    @Column(name = "P_CUSTOMER_PAY_TYPE")
    private String pCustomerPayType;
    @Column(name = "P_METHOD_PAY_TYPE")
    private String pMethodPayType;
    @Column(name = "P_CHECK_AMT")
    private String pCheckAmt;
    @Column(name = "P_TOTAL_PAYMENT")
    private String pTotalPayment;
    @Lob
    @Column(name = "P_MERCH_FEE_DETAILS")
    private String pMerchFeeDetails;
    @Column(name = "P_RECEIPT_COMMENTS")
    private String pReceiptComments;
    @Column(name = "P_MERCH_CLERK")
    private String pMerchClerk;
    @Column(name = "P_COMDATA_SITE_CODE")
    private String pComdataSiteCode;
    @Column(name = "P_COMDATA_PAY_METHOD")
    private String pComdataPayMethod;
    @Column(name = "P_CARD_NUMBER")
    private String pCardNumber;
    @Column(name = "P_PROMPT_UNIT_NUM")
    private String pPromptUnitNum;
    @Column(name = "P_PROMPT_TRIP_NUM")
    private String pPromptTripNum;
    @Column(name = "P_PROMPT_HUB_READING")
    private String pPromptHubReading;
    @Column(name = "P_PROMPT_TRAILER_HRS")
    private String pPromptTrailerHrs;
    @Column(name = "P_PROMPT_TRLR_HUB_READG")
    private String pPromptTrlrHubReadg;
    @Column(name = "P_PROMPT_TRAILER_NUM")
    private String pPromptTrailerNum;
    @Column(name = "P_PROMPT_PO_NUM")
    private String pPromptPoNum;
    @Column(name = "P_COMDATA_MERCH_AUTH_NUM")
    private String pComdataMerchAuthNum;
    @Column(name = "P_MERCH_PO_REF")
    private String pMerchPoRef;
    @Column(name = "P_FIELD1")
    private String pField1;
    @Column(name = "P_FIELD2")
    private String pField2;
    @Column(name = "P_FIELD3")
    private String pField3;
    @Column(name = "P_FIELD4")
    private String pField4;
    @Column(name = "P_FIELD5")
    private String pField5;
    @Column(name = "P_FIELD6")
    private String pField6;
    @Column(name = "P_FIELD7")
    private String pField7;
    @Column(name = "P_FIELD8")
    private String pField8;
    @Column(name = "P_FIELD9")
    private String pField9;
    @Column(name = "P_FIELD10")
    private String pField10;
    @Column(name = "P_FIELD11")
    private String pField11;
    @Column(name = "P_FIELD12")
    private String pField12;
    @Column(name = "P_FIELD13")
    private String pField13;
    @Column(name = "P_FIELD14")
    private String pField14;
    @Column(name = "P_FIELD15")
    private String pField15;
    @Column(name = "P_FIELD16")
    private String pField16;
    @Column(name = "P_FIELD17")
    private String pField17;
    @Column(name = "P_FIELD18")
    private String pField18;
    @Column(name = "P_FIELD19")
    private String pField19;
    @Column(name = "P_FIELD20")
    private String pField20;
    @Column(name = "A_ALERTFLAG1")
    private Character aAlertflag1;
    @Column(name = "A_ALERTFLAG2")
    private Character aAlertflag2;
    @Column(name = "A_ALERTFLAG3")
    private Character aAlertflag3;
    @Column(name = "A_ALERTFLAG4")
    private Character aAlertflag4;
    @Column(name = "A_ALERTFLAG5")
    private Character aAlertflag5;
    @Column(name = "A_ALERTFLAG6")
    private Character aAlertflag6;
    @Column(name = "A_ALERTFLAG7")
    private Character aAlertflag7;
    @Column(name = "A_ALERTFLAG8")
    private Character aAlertflag8;
    @Column(name = "A_ALERTFLAG9")
    private Character aAlertflag9;
    @Column(name = "A_ALERTFLAG10")
    private Character aAlertflag10;
    @Lob
    @Column(name = "P_RAWJSON")
    private String pRawjson;
    @Column(name = "C_ERECEIPT_GRAND_TOTAL")
    private String cEreceiptGrandTotal;
    @Column(name = "P_ERRORDESC")
    private String pErrordesc;
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
    @Column(name = "DB2_GENERATED_ROWID_FOR_LOBS")
    private Serializable db2GeneratedRowidForLobs;

    public EreceiptPhoton() {
    }

    public EreceiptPhoton(EreceiptPhotonPK ereceiptPhotonPK) {
        this.ereceiptPhotonPK = ereceiptPhotonPK;
    }

    public EreceiptPhoton(EreceiptPhotonPK ereceiptPhotonPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Serializable db2GeneratedRowidForLobs) {
        this.ereceiptPhotonPK = ereceiptPhotonPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public EreceiptPhoton(Date trnsDt, int ctlNbr, String mrchSiteId) {
        this.ereceiptPhotonPK = new EreceiptPhotonPK(trnsDt, ctlNbr, mrchSiteId);
    }

    public EreceiptPhotonPK getEreceiptPhotonPK() {
        return ereceiptPhotonPK;
    }

    public void setEreceiptPhotonPK(EreceiptPhotonPK ereceiptPhotonPK) {
        this.ereceiptPhotonPK = ereceiptPhotonPK;
    }

    public String getPPhotonKey() {
        return pPhotonKey;
    }

    public void setPPhotonKey(String pPhotonKey) {
        this.pPhotonKey = pPhotonKey;
    }

    public String getPChainName() {
        return pChainName;
    }

    public void setPChainName(String pChainName) {
        this.pChainName = pChainName;
    }

    public String getPChainTaxId() {
        return pChainTaxId;
    }

    public void setPChainTaxId(String pChainTaxId) {
        this.pChainTaxId = pChainTaxId;
    }

    public String getPChainCorpAddress() {
        return pChainCorpAddress;
    }

    public void setPChainCorpAddress(String pChainCorpAddress) {
        this.pChainCorpAddress = pChainCorpAddress;
    }

    public String getPChainCorpCityStZip() {
        return pChainCorpCityStZip;
    }

    public void setPChainCorpCityStZip(String pChainCorpCityStZip) {
        this.pChainCorpCityStZip = pChainCorpCityStZip;
    }

    public String getPChainCorpPhone() {
        return pChainCorpPhone;
    }

    public void setPChainCorpPhone(String pChainCorpPhone) {
        this.pChainCorpPhone = pChainCorpPhone;
    }

    public String getPMerchTaxId() {
        return pMerchTaxId;
    }

    public void setPMerchTaxId(String pMerchTaxId) {
        this.pMerchTaxId = pMerchTaxId;
    }

    public String getPMerchChainLogo() {
        return pMerchChainLogo;
    }

    public void setPMerchChainLogo(String pMerchChainLogo) {
        this.pMerchChainLogo = pMerchChainLogo;
    }

    public String getPMerchCorpLogo() {
        return pMerchCorpLogo;
    }

    public void setPMerchCorpLogo(String pMerchCorpLogo) {
        this.pMerchCorpLogo = pMerchCorpLogo;
    }

    public String getPMerchCorpName() {
        return pMerchCorpName;
    }

    public void setPMerchCorpName(String pMerchCorpName) {
        this.pMerchCorpName = pMerchCorpName;
    }

    public String getPChainLocId() {
        return pChainLocId;
    }

    public void setPChainLocId(String pChainLocId) {
        this.pChainLocId = pChainLocId;
    }

    public String getPMerchCorpAddress() {
        return pMerchCorpAddress;
    }

    public void setPMerchCorpAddress(String pMerchCorpAddress) {
        this.pMerchCorpAddress = pMerchCorpAddress;
    }

    public String getPMerchCorpCityStZip() {
        return pMerchCorpCityStZip;
    }

    public void setPMerchCorpCityStZip(String pMerchCorpCityStZip) {
        this.pMerchCorpCityStZip = pMerchCorpCityStZip;
    }

    public String getPMerchPhone() {
        return pMerchPhone;
    }

    public void setPMerchPhone(String pMerchPhone) {
        this.pMerchPhone = pMerchPhone;
    }

    public String getPMerchName() {
        return pMerchName;
    }

    public void setPMerchName(String pMerchName) {
        this.pMerchName = pMerchName;
    }

    public String getPMerchAddr() {
        return pMerchAddr;
    }

    public void setPMerchAddr(String pMerchAddr) {
        this.pMerchAddr = pMerchAddr;
    }

    public String getPMerchCityStZip() {
        return pMerchCityStZip;
    }

    public void setPMerchCityStZip(String pMerchCityStZip) {
        this.pMerchCityStZip = pMerchCityStZip;
    }

    public String getPMerchReceiptId() {
        return pMerchReceiptId;
    }

    public void setPMerchReceiptId(String pMerchReceiptId) {
        this.pMerchReceiptId = pMerchReceiptId;
    }

    public String getPCarrierName() {
        return pCarrierName;
    }

    public void setPCarrierName(String pCarrierName) {
        this.pCarrierName = pCarrierName;
    }

    public String getPCarrierDriverPhone() {
        return pCarrierDriverPhone;
    }

    public void setPCarrierDriverPhone(String pCarrierDriverPhone) {
        this.pCarrierDriverPhone = pCarrierDriverPhone;
    }

    public String getPReceiptTransDt() {
        return pReceiptTransDt;
    }

    public void setPReceiptTransDt(String pReceiptTransDt) {
        this.pReceiptTransDt = pReceiptTransDt;
    }

    public String getPWarehouseDoorNbr() {
        return pWarehouseDoorNbr;
    }

    public void setPWarehouseDoorNbr(String pWarehouseDoorNbr) {
        this.pWarehouseDoorNbr = pWarehouseDoorNbr;
    }

    public String getPDockNbr() {
        return pDockNbr;
    }

    public void setPDockNbr(String pDockNbr) {
        this.pDockNbr = pDockNbr;
    }

    public String getPLoadNumber() {
        return pLoadNumber;
    }

    public void setPLoadNumber(String pLoadNumber) {
        this.pLoadNumber = pLoadNumber;
    }

    public String getPTrlNbr() {
        return pTrlNbr;
    }

    public void setPTrlNbr(String pTrlNbr) {
        this.pTrlNbr = pTrlNbr;
    }

    public String getPUnitNbr() {
        return pUnitNbr;
    }

    public void setPUnitNbr(String pUnitNbr) {
        this.pUnitNbr = pUnitNbr;
    }

    public String getPMerchPoDetails() {
        return pMerchPoDetails;
    }

    public void setPMerchPoDetails(String pMerchPoDetails) {
        this.pMerchPoDetails = pMerchPoDetails;
    }

    public String getPPalletStartCount() {
        return pPalletStartCount;
    }

    public void setPPalletStartCount(String pPalletStartCount) {
        this.pPalletStartCount = pPalletStartCount;
    }

    public String getPPalletEndCount() {
        return pPalletEndCount;
    }

    public void setPPalletEndCount(String pPalletEndCount) {
        this.pPalletEndCount = pPalletEndCount;
    }

    public String getPSpecialCircumComment() {
        return pSpecialCircumComment;
    }

    public void setPSpecialCircumComment(String pSpecialCircumComment) {
        this.pSpecialCircumComment = pSpecialCircumComment;
    }

    public String getPApptTime() {
        return pApptTime;
    }

    public void setPApptTime(String pApptTime) {
        this.pApptTime = pApptTime;
    }

    public String getPDriverCheckinTime() {
        return pDriverCheckinTime;
    }

    public void setPDriverCheckinTime(String pDriverCheckinTime) {
        this.pDriverCheckinTime = pDriverCheckinTime;
    }

    public String getPDoorAssignTime() {
        return pDoorAssignTime;
    }

    public void setPDoorAssignTime(String pDoorAssignTime) {
        this.pDoorAssignTime = pDoorAssignTime;
    }

    public String getPLumpStartTime() {
        return pLumpStartTime;
    }

    public void setPLumpStartTime(String pLumpStartTime) {
        this.pLumpStartTime = pLumpStartTime;
    }

    public String getPLumpEndTime() {
        return pLumpEndTime;
    }

    public void setPLumpEndTime(String pLumpEndTime) {
        this.pLumpEndTime = pLumpEndTime;
    }

    public String getPBolSignTime() {
        return pBolSignTime;
    }

    public void setPBolSignTime(String pBolSignTime) {
        this.pBolSignTime = pBolSignTime;
    }

    public String getPBaseChargeAmt() {
        return pBaseChargeAmt;
    }

    public void setPBaseChargeAmt(String pBaseChargeAmt) {
        this.pBaseChargeAmt = pBaseChargeAmt;
    }

    public String getPAddFeeSubtotal() {
        return pAddFeeSubtotal;
    }

    public void setPAddFeeSubtotal(String pAddFeeSubtotal) {
        this.pAddFeeSubtotal = pAddFeeSubtotal;
    }

    public String getPConvFee() {
        return pConvFee;
    }

    public void setPConvFee(String pConvFee) {
        this.pConvFee = pConvFee;
    }

    public String getPTotalCost() {
        return pTotalCost;
    }

    public void setPTotalCost(String pTotalCost) {
        this.pTotalCost = pTotalCost;
    }

    public String getPCardOrCode() {
        return pCardOrCode;
    }

    public void setPCardOrCode(String pCardOrCode) {
        this.pCardOrCode = pCardOrCode;
    }

    public String getPCustomerPayType() {
        return pCustomerPayType;
    }

    public void setPCustomerPayType(String pCustomerPayType) {
        this.pCustomerPayType = pCustomerPayType;
    }

    public String getPMethodPayType() {
        return pMethodPayType;
    }

    public void setPMethodPayType(String pMethodPayType) {
        this.pMethodPayType = pMethodPayType;
    }

    public String getPCheckAmt() {
        return pCheckAmt;
    }

    public void setPCheckAmt(String pCheckAmt) {
        this.pCheckAmt = pCheckAmt;
    }

    public String getPTotalPayment() {
        return pTotalPayment;
    }

    public void setPTotalPayment(String pTotalPayment) {
        this.pTotalPayment = pTotalPayment;
    }

    public String getPMerchFeeDetails() {
        return pMerchFeeDetails;
    }

    public void setPMerchFeeDetails(String pMerchFeeDetails) {
        this.pMerchFeeDetails = pMerchFeeDetails;
    }

    public String getPReceiptComments() {
        return pReceiptComments;
    }

    public void setPReceiptComments(String pReceiptComments) {
        this.pReceiptComments = pReceiptComments;
    }

    public String getPMerchClerk() {
        return pMerchClerk;
    }

    public void setPMerchClerk(String pMerchClerk) {
        this.pMerchClerk = pMerchClerk;
    }

    public String getPComdataSiteCode() {
        return pComdataSiteCode;
    }

    public void setPComdataSiteCode(String pComdataSiteCode) {
        this.pComdataSiteCode = pComdataSiteCode;
    }

    public String getPComdataPayMethod() {
        return pComdataPayMethod;
    }

    public void setPComdataPayMethod(String pComdataPayMethod) {
        this.pComdataPayMethod = pComdataPayMethod;
    }

    public String getPCardNumber() {
        return pCardNumber;
    }

    public void setPCardNumber(String pCardNumber) {
        this.pCardNumber = pCardNumber;
    }

    public String getPPromptUnitNum() {
        return pPromptUnitNum;
    }

    public void setPPromptUnitNum(String pPromptUnitNum) {
        this.pPromptUnitNum = pPromptUnitNum;
    }

    public String getPPromptTripNum() {
        return pPromptTripNum;
    }

    public void setPPromptTripNum(String pPromptTripNum) {
        this.pPromptTripNum = pPromptTripNum;
    }

    public String getPPromptHubReading() {
        return pPromptHubReading;
    }

    public void setPPromptHubReading(String pPromptHubReading) {
        this.pPromptHubReading = pPromptHubReading;
    }

    public String getPPromptTrailerHrs() {
        return pPromptTrailerHrs;
    }

    public void setPPromptTrailerHrs(String pPromptTrailerHrs) {
        this.pPromptTrailerHrs = pPromptTrailerHrs;
    }

    public String getPPromptTrlrHubReadg() {
        return pPromptTrlrHubReadg;
    }

    public void setPPromptTrlrHubReadg(String pPromptTrlrHubReadg) {
        this.pPromptTrlrHubReadg = pPromptTrlrHubReadg;
    }

    public String getPPromptTrailerNum() {
        return pPromptTrailerNum;
    }

    public void setPPromptTrailerNum(String pPromptTrailerNum) {
        this.pPromptTrailerNum = pPromptTrailerNum;
    }

    public String getPPromptPoNum() {
        return pPromptPoNum;
    }

    public void setPPromptPoNum(String pPromptPoNum) {
        this.pPromptPoNum = pPromptPoNum;
    }

    public String getPComdataMerchAuthNum() {
        return pComdataMerchAuthNum;
    }

    public void setPComdataMerchAuthNum(String pComdataMerchAuthNum) {
        this.pComdataMerchAuthNum = pComdataMerchAuthNum;
    }

    public String getPMerchPoRef() {
        return pMerchPoRef;
    }

    public void setPMerchPoRef(String pMerchPoRef) {
        this.pMerchPoRef = pMerchPoRef;
    }

    public String getPField1() {
        return pField1;
    }

    public void setPField1(String pField1) {
        this.pField1 = pField1;
    }

    public String getPField2() {
        return pField2;
    }

    public void setPField2(String pField2) {
        this.pField2 = pField2;
    }

    public String getPField3() {
        return pField3;
    }

    public void setPField3(String pField3) {
        this.pField3 = pField3;
    }

    public String getPField4() {
        return pField4;
    }

    public void setPField4(String pField4) {
        this.pField4 = pField4;
    }

    public String getPField5() {
        return pField5;
    }

    public void setPField5(String pField5) {
        this.pField5 = pField5;
    }

    public String getPField6() {
        return pField6;
    }

    public void setPField6(String pField6) {
        this.pField6 = pField6;
    }

    public String getPField7() {
        return pField7;
    }

    public void setPField7(String pField7) {
        this.pField7 = pField7;
    }

    public String getPField8() {
        return pField8;
    }

    public void setPField8(String pField8) {
        this.pField8 = pField8;
    }

    public String getPField9() {
        return pField9;
    }

    public void setPField9(String pField9) {
        this.pField9 = pField9;
    }

    public String getPField10() {
        return pField10;
    }

    public void setPField10(String pField10) {
        this.pField10 = pField10;
    }

    public String getPField11() {
        return pField11;
    }

    public void setPField11(String pField11) {
        this.pField11 = pField11;
    }

    public String getPField12() {
        return pField12;
    }

    public void setPField12(String pField12) {
        this.pField12 = pField12;
    }

    public String getPField13() {
        return pField13;
    }

    public void setPField13(String pField13) {
        this.pField13 = pField13;
    }

    public String getPField14() {
        return pField14;
    }

    public void setPField14(String pField14) {
        this.pField14 = pField14;
    }

    public String getPField15() {
        return pField15;
    }

    public void setPField15(String pField15) {
        this.pField15 = pField15;
    }

    public String getPField16() {
        return pField16;
    }

    public void setPField16(String pField16) {
        this.pField16 = pField16;
    }

    public String getPField17() {
        return pField17;
    }

    public void setPField17(String pField17) {
        this.pField17 = pField17;
    }

    public String getPField18() {
        return pField18;
    }

    public void setPField18(String pField18) {
        this.pField18 = pField18;
    }

    public String getPField19() {
        return pField19;
    }

    public void setPField19(String pField19) {
        this.pField19 = pField19;
    }

    public String getPField20() {
        return pField20;
    }

    public void setPField20(String pField20) {
        this.pField20 = pField20;
    }

    public Character getAAlertflag1() {
        return aAlertflag1;
    }

    public void setAAlertflag1(Character aAlertflag1) {
        this.aAlertflag1 = aAlertflag1;
    }

    public Character getAAlertflag2() {
        return aAlertflag2;
    }

    public void setAAlertflag2(Character aAlertflag2) {
        this.aAlertflag2 = aAlertflag2;
    }

    public Character getAAlertflag3() {
        return aAlertflag3;
    }

    public void setAAlertflag3(Character aAlertflag3) {
        this.aAlertflag3 = aAlertflag3;
    }

    public Character getAAlertflag4() {
        return aAlertflag4;
    }

    public void setAAlertflag4(Character aAlertflag4) {
        this.aAlertflag4 = aAlertflag4;
    }

    public Character getAAlertflag5() {
        return aAlertflag5;
    }

    public void setAAlertflag5(Character aAlertflag5) {
        this.aAlertflag5 = aAlertflag5;
    }

    public Character getAAlertflag6() {
        return aAlertflag6;
    }

    public void setAAlertflag6(Character aAlertflag6) {
        this.aAlertflag6 = aAlertflag6;
    }

    public Character getAAlertflag7() {
        return aAlertflag7;
    }

    public void setAAlertflag7(Character aAlertflag7) {
        this.aAlertflag7 = aAlertflag7;
    }

    public Character getAAlertflag8() {
        return aAlertflag8;
    }

    public void setAAlertflag8(Character aAlertflag8) {
        this.aAlertflag8 = aAlertflag8;
    }

    public Character getAAlertflag9() {
        return aAlertflag9;
    }

    public void setAAlertflag9(Character aAlertflag9) {
        this.aAlertflag9 = aAlertflag9;
    }

    public Character getAAlertflag10() {
        return aAlertflag10;
    }

    public void setAAlertflag10(Character aAlertflag10) {
        this.aAlertflag10 = aAlertflag10;
    }

    public String getPRawjson() {
        return pRawjson;
    }

    public void setPRawjson(String pRawjson) {
        this.pRawjson = pRawjson;
    }

    public String getCEreceiptGrandTotal() {
        return cEreceiptGrandTotal;
    }

    public void setCEreceiptGrandTotal(String cEreceiptGrandTotal) {
        this.cEreceiptGrandTotal = cEreceiptGrandTotal;
    }

    public String getPErrordesc() {
        return pErrordesc;
    }

    public void setPErrordesc(String pErrordesc) {
        this.pErrordesc = pErrordesc;
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

    public Serializable getDb2GeneratedRowidForLobs() {
        return db2GeneratedRowidForLobs;
    }

    public void setDb2GeneratedRowidForLobs(Serializable db2GeneratedRowidForLobs) {
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ereceiptPhotonPK != null ? ereceiptPhotonPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EreceiptPhoton)) {
            return false;
        }
        EreceiptPhoton other = (EreceiptPhoton) object;
        if ((this.ereceiptPhotonPK == null && other.ereceiptPhotonPK != null) || (this.ereceiptPhotonPK != null && !this.ereceiptPhotonPK.equals(other.ereceiptPhotonPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EreceiptPhoton[ ereceiptPhotonPK=" + ereceiptPhotonPK + " ]";
    }
    
}
