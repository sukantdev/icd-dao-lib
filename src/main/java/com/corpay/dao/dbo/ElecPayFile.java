/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "ELEC_PAY_FILE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ElecPayFile.findAll", query = "SELECT e FROM ElecPayFile e")})
public class ElecPayFile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FILE_KEY")
    private Long fileKey;
    @Basic(optional = false)
    @Column(name = "DATE_UPDATE_1")
    private String dateUpdate1;
    @Basic(optional = false)
    @Column(name = "TYP_INST_CD")
    private String typInstCd;
    @Basic(optional = false)
    @Column(name = "OFFICE_CODE")
    private String officeCode;
    @Basic(optional = false)
    @Column(name = "ROUTING_MICR")
    private int routingMicr;
    @Basic(optional = false)
    @Column(name = "ROUTING_FRAC")
    private long routingFrac;
    @Basic(optional = false)
    @Column(name = "INST_NM")
    private String instNm;
    @Basic(optional = false)
    @Column(name = "INST_NM_ABBR")
    private String instNmAbbr;
    @Basic(optional = false)
    @Column(name = "ADDR")
    private String addr;
    @Basic(optional = false)
    @Column(name = "CITY")
    private String city;
    @Basic(optional = false)
    @Column(name = "ST")
    private String st;
    @Basic(optional = false)
    @Column(name = "ZIP")
    private String zip;
    @Basic(optional = false)
    @Column(name = "ZIP_4")
    private String zip4;
    @Basic(optional = false)
    @Column(name = "MAIL_ADDR")
    private String mailAddr;
    @Basic(optional = false)
    @Column(name = "MAIL_CITY")
    private String mailCity;
    @Basic(optional = false)
    @Column(name = "MAIL_ST")
    private String mailSt;
    @Basic(optional = false)
    @Column(name = "MAIL_ZIP")
    private String mailZip;
    @Basic(optional = false)
    @Column(name = "MAIL_ZIP_4")
    private String mailZip4;
    @Basic(optional = false)
    @Column(name = "BRNCH_NM")
    private String brnchNm;
    @Basic(optional = false)
    @Column(name = "HOFFICE_ROUT_NBR")
    private String hofficeRoutNbr;
    @Basic(optional = false)
    @Column(name = "PHONE_AREA_CD")
    private String phoneAreaCd;
    @Basic(optional = false)
    @Column(name = "PHONE")
    private String phone;
    @Basic(optional = false)
    @Column(name = "EXT")
    private String ext;
    @Basic(optional = false)
    @Column(name = "FAX_AREA_CD")
    private String faxAreaCd;
    @Basic(optional = false)
    @Column(name = "FAX")
    private String fax;
    @Basic(optional = false)
    @Column(name = "FAX_EXT")
    private String faxExt;
    @Basic(optional = false)
    @Column(name = "HOFFICE_ASSET_SIZE")
    private String hofficeAssetSize;
    @Basic(optional = false)
    @Column(name = "FED_RES_DIST_CD")
    private String fedResDistCd;
    @Basic(optional = false)
    @Column(name = "Y2K_LAST_UPDATE")
    private String y2kLastUpdate;
    @Basic(optional = false)
    @Column(name = "HOFFICE_FILE_KEY")
    private String hofficeFileKey;
    @Basic(optional = false)
    @Column(name = "ROUT_NBR_TYP")
    private String routNbrTyp;
    @Basic(optional = false)
    @Column(name = "ROUT_NBR_STAT")
    private Character routNbrStat;
    @Basic(optional = false)
    @Column(name = "EMP_TID")
    private String empTid;
    @Basic(optional = false)
    @Column(name = "ACH_FL")
    private Character achFl;
    @Basic(optional = false)
    @Column(name = "FED_RES_ROUT_NBR")
    private int fedResRoutNbr;
    @Basic(optional = false)
    @Column(name = "INST_ID")
    private String instId;
    @Basic(optional = false)
    @Column(name = "LAST_UPDATE")
    private String lastUpdate;
    @Basic(optional = false)
    @Column(name = "WIRE_TRANS_CONTACT_NM")
    private String wireTransContactNm;
    @Basic(optional = false)
    @Column(name = "WIRE_TRANS_AREA_CD")
    private String wireTransAreaCd;
    @Basic(optional = false)
    @Column(name = "WIRE_TRANS_PHONE")
    private String wireTransPhone;
    @Basic(optional = false)
    @Column(name = "WIRE_TRANS_EXT")
    private String wireTransExt;
    @Basic(optional = false)
    @Column(name = "EFT_CONTACT_NM")
    private String eftContactNm;
    @Basic(optional = false)
    @Column(name = "EFT_AREA_CD")
    private String eftAreaCd;
    @Basic(optional = false)
    @Column(name = "EFT_PHONE")
    private String eftPhone;
    @Basic(optional = false)
    @Column(name = "EFT_EXT")
    private String eftExt;
    @Basic(optional = false)
    @Column(name = "EDI_CONTACT_NM_1")
    private String ediContactNm1;
    @Basic(optional = false)
    @Column(name = "EDI_AREA_CD_1")
    private String ediAreaCd1;
    @Basic(optional = false)
    @Column(name = "EDI_PHONE_1")
    private String ediPhone1;
    @Basic(optional = false)
    @Column(name = "EDI_EXT_1")
    private String ediExt1;
    @Basic(optional = false)
    @Column(name = "FEDWIRE_FUNDS_STAT")
    private Character fedwireFundsStat;
    @Basic(optional = false)
    @Column(name = "FEDWIRE_SEC_STAT")
    private Character fedwireSecStat;
    @Basic(optional = false)
    @Column(name = "FEDWIRE_TELE_NM")
    private String fedwireTeleNm;
    @Basic(optional = false)
    @Column(name = "SWIFT_ADDR")
    private String swiftAddr;
    @Basic(optional = false)
    @Column(name = "BIC_ADDR")
    private String bicAddr;
    @Basic(optional = false)
    @Column(name = "WIRE_TRANS_CD")
    private Character wireTransCd;
    @Basic(optional = false)
    @Column(name = "FEDWIRE_CORR")
    private String fedwireCorr;
    @Basic(optional = false)
    @Column(name = "FEDWIRE_CORR_FUND_STAT")
    private Character fedwireCorrFundStat;
    @Basic(optional = false)
    @Column(name = "FEDWIRE_CORR_MICR")
    private int fedwireCorrMicr;
    @Basic(optional = false)
    @Column(name = "FEDWIRE_CORR_ASSETS")
    private String fedwireCorrAssets;
    @Basic(optional = false)
    @Column(name = "Y2K_LAST_UPDATE2")
    private String y2kLastUpdate2;
    @Basic(optional = false)
    @Column(name = "INST_ID2")
    private String instId2;
    @Basic(optional = false)
    @Column(name = "FEDWIRE_CORR_FILE_KEY")
    private String fedwireCorrFileKey;
    @Basic(optional = false)
    @Column(name = "MOFFICE_FILE_KEY")
    private String mofficeFileKey;
    @Basic(optional = false)
    @Column(name = "DT_UPDATED")
    private String dtUpdated;
    @Basic(optional = false)
    @Column(name = "ACH_CONTACT_NM")
    private String achContactNm;
    @Basic(optional = false)
    @Column(name = "ACH_CONTACT_AREA_CD")
    private String achContactAreaCd;
    @Basic(optional = false)
    @Column(name = "ACH_CONTACT_PHONE")
    private String achContactPhone;
    @Basic(optional = false)
    @Column(name = "ACH_CONTACT_EXT")
    private String achContactExt;
    @Basic(optional = false)
    @Column(name = "EDI_CONTACT_NM_2")
    private String ediContactNm2;
    @Basic(optional = false)
    @Column(name = "EDI_AREA_CD_2")
    private String ediAreaCd2;
    @Basic(optional = false)
    @Column(name = "EDI_PHONE_2")
    private String ediPhone2;
    @Basic(optional = false)
    @Column(name = "EDI_EXT_2")
    private String ediExt2;
    @Basic(optional = false)
    @Column(name = "PAPER_RET_CONTACT_NM")
    private String paperRetContactNm;
    @Basic(optional = false)
    @Column(name = "PAPER_RET_AREA_CD")
    private String paperRetAreaCd;
    @Basic(optional = false)
    @Column(name = "PAPER_RET_PHONE")
    private String paperRetPhone;
    @Basic(optional = false)
    @Column(name = "PAPER_RET_EXT")
    private String paperRetExt;
    @Basic(optional = false)
    @Column(name = "ACH_RET_CONTACT_NM")
    private String achRetContactNm;
    @Basic(optional = false)
    @Column(name = "ACH_RET_AREA_CD")
    private String achRetAreaCd;
    @Basic(optional = false)
    @Column(name = "ACH_RET_PHONE")
    private String achRetPhone;
    @Basic(optional = false)
    @Column(name = "ACH_RET_EXT")
    private String achRetExt;
    @Basic(optional = false)
    @Column(name = "PAPER_ADJ_CONTACT_NM")
    private String paperAdjContactNm;
    @Basic(optional = false)
    @Column(name = "PAPER_ADJ_AREA_CD")
    private String paperAdjAreaCd;
    @Basic(optional = false)
    @Column(name = "PAPER_ADJ_PHONE")
    private String paperAdjPhone;
    @Basic(optional = false)
    @Column(name = "PAPER_ADJ_EXT")
    private String paperAdjExt;
    @Basic(optional = false)
    @Column(name = "ACH_ADJ_CONTACT_NM")
    private String achAdjContactNm;
    @Basic(optional = false)
    @Column(name = "ACH_ADJ_AREA_CD")
    private String achAdjAreaCd;
    @Basic(optional = false)
    @Column(name = "ACH_ADJ_PHONE")
    private String achAdjPhone;
    @Basic(optional = false)
    @Column(name = "ACH_ADJ_EXT")
    private String achAdjExt;
    @Basic(optional = false)
    @Column(name = "ORIG_STAT")
    private Character origStat;
    @Basic(optional = false)
    @Column(name = "REC_STAT")
    private Character recStat;
    @Basic(optional = false)
    @Column(name = "ACH_MICR_ROUT_NBR")
    private int achMicrRoutNbr;
    @Basic(optional = false)
    @Column(name = "ACH_PROV")
    private String achProv;
    @Basic(optional = false)
    @Column(name = "ACH_MICR_STAT")
    private Character achMicrStat;
    @Basic(optional = false)
    @Column(name = "CU_PAP_PAY_THR")
    private String cuPapPayThr;
    @Basic(optional = false)
    @Column(name = "CU_PAP_PAY_THR_MICR")
    private int cuPapPayThrMicr;
    @Basic(optional = false)
    @Column(name = "CU_ACCT_NBR_IC")
    private long cuAcctNbrIc;
    @Basic(optional = false)
    @Column(name = "CU_ID_POS")
    private short cuIdPos;
    @Basic(optional = false)
    @Column(name = "ACH_PAY_THR")
    private Character achPayThr;
    @Basic(optional = false)
    @Column(name = "SAV_ACCT")
    private Character savAcct;
    @Basic(optional = false)
    @Column(name = "CHK_ACCT")
    private Character chkAcct;
    @Basic(optional = false)
    @Column(name = "LOCAL_ACH")
    private String localAch;
    @Basic(optional = false)
    @Column(name = "ACH_MEM_IND")
    private Character achMemInd;
    @Basic(optional = false)
    @Column(name = "FED_RES_ACH_MICR")
    private int fedResAchMicr;
    @Basic(optional = false)
    @Column(name = "FEDWIRE_FUNDS_TRANS_STAT")
    private Character fedwireFundsTransStat;
    @Basic(optional = false)
    @Column(name = "EDI_CD_CASH")
    private Character ediCdCash;
    @Basic(optional = false)
    @Column(name = "EDI_CD_CORP_TRADE_PAY")
    private Character ediCdCorpTradePay;
    @Basic(optional = false)
    @Column(name = "EDI_CD_CORP_TRADE_EXCH")
    private Character ediCdCorpTradeExch;
    @Basic(optional = false)
    @Column(name = "EDI_CD_CUST_INIT_ENTRY")
    private Character ediCdCustInitEntry;
    @Basic(optional = false)
    @Column(name = "PRIV_SEC_ACH_ASSOC")
    private String privSecAchAssoc;
    @Basic(optional = false)
    @Column(name = "PRIV_SEC_ACH_MICR")
    private int privSecAchMicr;
    @Basic(optional = false)
    @Column(name = "Y2K_LAST_UPDATED3")
    private String y2kLastUpdated3;
    @Basic(optional = false)
    @Column(name = "INST_ID3")
    private String instId3;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public ElecPayFile() {
    }

    public ElecPayFile(Long fileKey) {
        this.fileKey = fileKey;
    }

    public ElecPayFile(Long fileKey, String dateUpdate1, String typInstCd, String officeCode, int routingMicr, long routingFrac, String instNm, String instNmAbbr, String addr, String city, String st, String zip, String zip4, String mailAddr, String mailCity, String mailSt, String mailZip, String mailZip4, String brnchNm, String hofficeRoutNbr, String phoneAreaCd, String phone, String ext, String faxAreaCd, String fax, String faxExt, String hofficeAssetSize, String fedResDistCd, String y2kLastUpdate, String hofficeFileKey, String routNbrTyp, Character routNbrStat, String empTid, Character achFl, int fedResRoutNbr, String instId, String lastUpdate, String wireTransContactNm, String wireTransAreaCd, String wireTransPhone, String wireTransExt, String eftContactNm, String eftAreaCd, String eftPhone, String eftExt, String ediContactNm1, String ediAreaCd1, String ediPhone1, String ediExt1, Character fedwireFundsStat, Character fedwireSecStat, String fedwireTeleNm, String swiftAddr, String bicAddr, Character wireTransCd, String fedwireCorr, Character fedwireCorrFundStat, int fedwireCorrMicr, String fedwireCorrAssets, String y2kLastUpdate2, String instId2, String fedwireCorrFileKey, String mofficeFileKey, String dtUpdated, String achContactNm, String achContactAreaCd, String achContactPhone, String achContactExt, String ediContactNm2, String ediAreaCd2, String ediPhone2, String ediExt2, String paperRetContactNm, String paperRetAreaCd, String paperRetPhone, String paperRetExt, String achRetContactNm, String achRetAreaCd, String achRetPhone, String achRetExt, String paperAdjContactNm, String paperAdjAreaCd, String paperAdjPhone, String paperAdjExt, String achAdjContactNm, String achAdjAreaCd, String achAdjPhone, String achAdjExt, Character origStat, Character recStat, int achMicrRoutNbr, String achProv, Character achMicrStat, String cuPapPayThr, int cuPapPayThrMicr, long cuAcctNbrIc, short cuIdPos, Character achPayThr, Character savAcct, Character chkAcct, String localAch, Character achMemInd, int fedResAchMicr, Character fedwireFundsTransStat, Character ediCdCash, Character ediCdCorpTradePay, Character ediCdCorpTradeExch, Character ediCdCustInitEntry, String privSecAchAssoc, int privSecAchMicr, String y2kLastUpdated3, String instId3, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.fileKey = fileKey;
        this.dateUpdate1 = dateUpdate1;
        this.typInstCd = typInstCd;
        this.officeCode = officeCode;
        this.routingMicr = routingMicr;
        this.routingFrac = routingFrac;
        this.instNm = instNm;
        this.instNmAbbr = instNmAbbr;
        this.addr = addr;
        this.city = city;
        this.st = st;
        this.zip = zip;
        this.zip4 = zip4;
        this.mailAddr = mailAddr;
        this.mailCity = mailCity;
        this.mailSt = mailSt;
        this.mailZip = mailZip;
        this.mailZip4 = mailZip4;
        this.brnchNm = brnchNm;
        this.hofficeRoutNbr = hofficeRoutNbr;
        this.phoneAreaCd = phoneAreaCd;
        this.phone = phone;
        this.ext = ext;
        this.faxAreaCd = faxAreaCd;
        this.fax = fax;
        this.faxExt = faxExt;
        this.hofficeAssetSize = hofficeAssetSize;
        this.fedResDistCd = fedResDistCd;
        this.y2kLastUpdate = y2kLastUpdate;
        this.hofficeFileKey = hofficeFileKey;
        this.routNbrTyp = routNbrTyp;
        this.routNbrStat = routNbrStat;
        this.empTid = empTid;
        this.achFl = achFl;
        this.fedResRoutNbr = fedResRoutNbr;
        this.instId = instId;
        this.lastUpdate = lastUpdate;
        this.wireTransContactNm = wireTransContactNm;
        this.wireTransAreaCd = wireTransAreaCd;
        this.wireTransPhone = wireTransPhone;
        this.wireTransExt = wireTransExt;
        this.eftContactNm = eftContactNm;
        this.eftAreaCd = eftAreaCd;
        this.eftPhone = eftPhone;
        this.eftExt = eftExt;
        this.ediContactNm1 = ediContactNm1;
        this.ediAreaCd1 = ediAreaCd1;
        this.ediPhone1 = ediPhone1;
        this.ediExt1 = ediExt1;
        this.fedwireFundsStat = fedwireFundsStat;
        this.fedwireSecStat = fedwireSecStat;
        this.fedwireTeleNm = fedwireTeleNm;
        this.swiftAddr = swiftAddr;
        this.bicAddr = bicAddr;
        this.wireTransCd = wireTransCd;
        this.fedwireCorr = fedwireCorr;
        this.fedwireCorrFundStat = fedwireCorrFundStat;
        this.fedwireCorrMicr = fedwireCorrMicr;
        this.fedwireCorrAssets = fedwireCorrAssets;
        this.y2kLastUpdate2 = y2kLastUpdate2;
        this.instId2 = instId2;
        this.fedwireCorrFileKey = fedwireCorrFileKey;
        this.mofficeFileKey = mofficeFileKey;
        this.dtUpdated = dtUpdated;
        this.achContactNm = achContactNm;
        this.achContactAreaCd = achContactAreaCd;
        this.achContactPhone = achContactPhone;
        this.achContactExt = achContactExt;
        this.ediContactNm2 = ediContactNm2;
        this.ediAreaCd2 = ediAreaCd2;
        this.ediPhone2 = ediPhone2;
        this.ediExt2 = ediExt2;
        this.paperRetContactNm = paperRetContactNm;
        this.paperRetAreaCd = paperRetAreaCd;
        this.paperRetPhone = paperRetPhone;
        this.paperRetExt = paperRetExt;
        this.achRetContactNm = achRetContactNm;
        this.achRetAreaCd = achRetAreaCd;
        this.achRetPhone = achRetPhone;
        this.achRetExt = achRetExt;
        this.paperAdjContactNm = paperAdjContactNm;
        this.paperAdjAreaCd = paperAdjAreaCd;
        this.paperAdjPhone = paperAdjPhone;
        this.paperAdjExt = paperAdjExt;
        this.achAdjContactNm = achAdjContactNm;
        this.achAdjAreaCd = achAdjAreaCd;
        this.achAdjPhone = achAdjPhone;
        this.achAdjExt = achAdjExt;
        this.origStat = origStat;
        this.recStat = recStat;
        this.achMicrRoutNbr = achMicrRoutNbr;
        this.achProv = achProv;
        this.achMicrStat = achMicrStat;
        this.cuPapPayThr = cuPapPayThr;
        this.cuPapPayThrMicr = cuPapPayThrMicr;
        this.cuAcctNbrIc = cuAcctNbrIc;
        this.cuIdPos = cuIdPos;
        this.achPayThr = achPayThr;
        this.savAcct = savAcct;
        this.chkAcct = chkAcct;
        this.localAch = localAch;
        this.achMemInd = achMemInd;
        this.fedResAchMicr = fedResAchMicr;
        this.fedwireFundsTransStat = fedwireFundsTransStat;
        this.ediCdCash = ediCdCash;
        this.ediCdCorpTradePay = ediCdCorpTradePay;
        this.ediCdCorpTradeExch = ediCdCorpTradeExch;
        this.ediCdCustInitEntry = ediCdCustInitEntry;
        this.privSecAchAssoc = privSecAchAssoc;
        this.privSecAchMicr = privSecAchMicr;
        this.y2kLastUpdated3 = y2kLastUpdated3;
        this.instId3 = instId3;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public Long getFileKey() {
        return fileKey;
    }

    public void setFileKey(Long fileKey) {
        this.fileKey = fileKey;
    }

    public String getDateUpdate1() {
        return dateUpdate1;
    }

    public void setDateUpdate1(String dateUpdate1) {
        this.dateUpdate1 = dateUpdate1;
    }

    public String getTypInstCd() {
        return typInstCd;
    }

    public void setTypInstCd(String typInstCd) {
        this.typInstCd = typInstCd;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public int getRoutingMicr() {
        return routingMicr;
    }

    public void setRoutingMicr(int routingMicr) {
        this.routingMicr = routingMicr;
    }

    public long getRoutingFrac() {
        return routingFrac;
    }

    public void setRoutingFrac(long routingFrac) {
        this.routingFrac = routingFrac;
    }

    public String getInstNm() {
        return instNm;
    }

    public void setInstNm(String instNm) {
        this.instNm = instNm;
    }

    public String getInstNmAbbr() {
        return instNmAbbr;
    }

    public void setInstNmAbbr(String instNmAbbr) {
        this.instNmAbbr = instNmAbbr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip4() {
        return zip4;
    }

    public void setZip4(String zip4) {
        this.zip4 = zip4;
    }

    public String getMailAddr() {
        return mailAddr;
    }

    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    public String getMailCity() {
        return mailCity;
    }

    public void setMailCity(String mailCity) {
        this.mailCity = mailCity;
    }

    public String getMailSt() {
        return mailSt;
    }

    public void setMailSt(String mailSt) {
        this.mailSt = mailSt;
    }

    public String getMailZip() {
        return mailZip;
    }

    public void setMailZip(String mailZip) {
        this.mailZip = mailZip;
    }

    public String getMailZip4() {
        return mailZip4;
    }

    public void setMailZip4(String mailZip4) {
        this.mailZip4 = mailZip4;
    }

    public String getBrnchNm() {
        return brnchNm;
    }

    public void setBrnchNm(String brnchNm) {
        this.brnchNm = brnchNm;
    }

    public String getHofficeRoutNbr() {
        return hofficeRoutNbr;
    }

    public void setHofficeRoutNbr(String hofficeRoutNbr) {
        this.hofficeRoutNbr = hofficeRoutNbr;
    }

    public String getPhoneAreaCd() {
        return phoneAreaCd;
    }

    public void setPhoneAreaCd(String phoneAreaCd) {
        this.phoneAreaCd = phoneAreaCd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getFaxAreaCd() {
        return faxAreaCd;
    }

    public void setFaxAreaCd(String faxAreaCd) {
        this.faxAreaCd = faxAreaCd;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFaxExt() {
        return faxExt;
    }

    public void setFaxExt(String faxExt) {
        this.faxExt = faxExt;
    }

    public String getHofficeAssetSize() {
        return hofficeAssetSize;
    }

    public void setHofficeAssetSize(String hofficeAssetSize) {
        this.hofficeAssetSize = hofficeAssetSize;
    }

    public String getFedResDistCd() {
        return fedResDistCd;
    }

    public void setFedResDistCd(String fedResDistCd) {
        this.fedResDistCd = fedResDistCd;
    }

    public String getY2kLastUpdate() {
        return y2kLastUpdate;
    }

    public void setY2kLastUpdate(String y2kLastUpdate) {
        this.y2kLastUpdate = y2kLastUpdate;
    }

    public String getHofficeFileKey() {
        return hofficeFileKey;
    }

    public void setHofficeFileKey(String hofficeFileKey) {
        this.hofficeFileKey = hofficeFileKey;
    }

    public String getRoutNbrTyp() {
        return routNbrTyp;
    }

    public void setRoutNbrTyp(String routNbrTyp) {
        this.routNbrTyp = routNbrTyp;
    }

    public Character getRoutNbrStat() {
        return routNbrStat;
    }

    public void setRoutNbrStat(Character routNbrStat) {
        this.routNbrStat = routNbrStat;
    }

    public String getEmpTid() {
        return empTid;
    }

    public void setEmpTid(String empTid) {
        this.empTid = empTid;
    }

    public Character getAchFl() {
        return achFl;
    }

    public void setAchFl(Character achFl) {
        this.achFl = achFl;
    }

    public int getFedResRoutNbr() {
        return fedResRoutNbr;
    }

    public void setFedResRoutNbr(int fedResRoutNbr) {
        this.fedResRoutNbr = fedResRoutNbr;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getWireTransContactNm() {
        return wireTransContactNm;
    }

    public void setWireTransContactNm(String wireTransContactNm) {
        this.wireTransContactNm = wireTransContactNm;
    }

    public String getWireTransAreaCd() {
        return wireTransAreaCd;
    }

    public void setWireTransAreaCd(String wireTransAreaCd) {
        this.wireTransAreaCd = wireTransAreaCd;
    }

    public String getWireTransPhone() {
        return wireTransPhone;
    }

    public void setWireTransPhone(String wireTransPhone) {
        this.wireTransPhone = wireTransPhone;
    }

    public String getWireTransExt() {
        return wireTransExt;
    }

    public void setWireTransExt(String wireTransExt) {
        this.wireTransExt = wireTransExt;
    }

    public String getEftContactNm() {
        return eftContactNm;
    }

    public void setEftContactNm(String eftContactNm) {
        this.eftContactNm = eftContactNm;
    }

    public String getEftAreaCd() {
        return eftAreaCd;
    }

    public void setEftAreaCd(String eftAreaCd) {
        this.eftAreaCd = eftAreaCd;
    }

    public String getEftPhone() {
        return eftPhone;
    }

    public void setEftPhone(String eftPhone) {
        this.eftPhone = eftPhone;
    }

    public String getEftExt() {
        return eftExt;
    }

    public void setEftExt(String eftExt) {
        this.eftExt = eftExt;
    }

    public String getEdiContactNm1() {
        return ediContactNm1;
    }

    public void setEdiContactNm1(String ediContactNm1) {
        this.ediContactNm1 = ediContactNm1;
    }

    public String getEdiAreaCd1() {
        return ediAreaCd1;
    }

    public void setEdiAreaCd1(String ediAreaCd1) {
        this.ediAreaCd1 = ediAreaCd1;
    }

    public String getEdiPhone1() {
        return ediPhone1;
    }

    public void setEdiPhone1(String ediPhone1) {
        this.ediPhone1 = ediPhone1;
    }

    public String getEdiExt1() {
        return ediExt1;
    }

    public void setEdiExt1(String ediExt1) {
        this.ediExt1 = ediExt1;
    }

    public Character getFedwireFundsStat() {
        return fedwireFundsStat;
    }

    public void setFedwireFundsStat(Character fedwireFundsStat) {
        this.fedwireFundsStat = fedwireFundsStat;
    }

    public Character getFedwireSecStat() {
        return fedwireSecStat;
    }

    public void setFedwireSecStat(Character fedwireSecStat) {
        this.fedwireSecStat = fedwireSecStat;
    }

    public String getFedwireTeleNm() {
        return fedwireTeleNm;
    }

    public void setFedwireTeleNm(String fedwireTeleNm) {
        this.fedwireTeleNm = fedwireTeleNm;
    }

    public String getSwiftAddr() {
        return swiftAddr;
    }

    public void setSwiftAddr(String swiftAddr) {
        this.swiftAddr = swiftAddr;
    }

    public String getBicAddr() {
        return bicAddr;
    }

    public void setBicAddr(String bicAddr) {
        this.bicAddr = bicAddr;
    }

    public Character getWireTransCd() {
        return wireTransCd;
    }

    public void setWireTransCd(Character wireTransCd) {
        this.wireTransCd = wireTransCd;
    }

    public String getFedwireCorr() {
        return fedwireCorr;
    }

    public void setFedwireCorr(String fedwireCorr) {
        this.fedwireCorr = fedwireCorr;
    }

    public Character getFedwireCorrFundStat() {
        return fedwireCorrFundStat;
    }

    public void setFedwireCorrFundStat(Character fedwireCorrFundStat) {
        this.fedwireCorrFundStat = fedwireCorrFundStat;
    }

    public int getFedwireCorrMicr() {
        return fedwireCorrMicr;
    }

    public void setFedwireCorrMicr(int fedwireCorrMicr) {
        this.fedwireCorrMicr = fedwireCorrMicr;
    }

    public String getFedwireCorrAssets() {
        return fedwireCorrAssets;
    }

    public void setFedwireCorrAssets(String fedwireCorrAssets) {
        this.fedwireCorrAssets = fedwireCorrAssets;
    }

    public String getY2kLastUpdate2() {
        return y2kLastUpdate2;
    }

    public void setY2kLastUpdate2(String y2kLastUpdate2) {
        this.y2kLastUpdate2 = y2kLastUpdate2;
    }

    public String getInstId2() {
        return instId2;
    }

    public void setInstId2(String instId2) {
        this.instId2 = instId2;
    }

    public String getFedwireCorrFileKey() {
        return fedwireCorrFileKey;
    }

    public void setFedwireCorrFileKey(String fedwireCorrFileKey) {
        this.fedwireCorrFileKey = fedwireCorrFileKey;
    }

    public String getMofficeFileKey() {
        return mofficeFileKey;
    }

    public void setMofficeFileKey(String mofficeFileKey) {
        this.mofficeFileKey = mofficeFileKey;
    }

    public String getDtUpdated() {
        return dtUpdated;
    }

    public void setDtUpdated(String dtUpdated) {
        this.dtUpdated = dtUpdated;
    }

    public String getAchContactNm() {
        return achContactNm;
    }

    public void setAchContactNm(String achContactNm) {
        this.achContactNm = achContactNm;
    }

    public String getAchContactAreaCd() {
        return achContactAreaCd;
    }

    public void setAchContactAreaCd(String achContactAreaCd) {
        this.achContactAreaCd = achContactAreaCd;
    }

    public String getAchContactPhone() {
        return achContactPhone;
    }

    public void setAchContactPhone(String achContactPhone) {
        this.achContactPhone = achContactPhone;
    }

    public String getAchContactExt() {
        return achContactExt;
    }

    public void setAchContactExt(String achContactExt) {
        this.achContactExt = achContactExt;
    }

    public String getEdiContactNm2() {
        return ediContactNm2;
    }

    public void setEdiContactNm2(String ediContactNm2) {
        this.ediContactNm2 = ediContactNm2;
    }

    public String getEdiAreaCd2() {
        return ediAreaCd2;
    }

    public void setEdiAreaCd2(String ediAreaCd2) {
        this.ediAreaCd2 = ediAreaCd2;
    }

    public String getEdiPhone2() {
        return ediPhone2;
    }

    public void setEdiPhone2(String ediPhone2) {
        this.ediPhone2 = ediPhone2;
    }

    public String getEdiExt2() {
        return ediExt2;
    }

    public void setEdiExt2(String ediExt2) {
        this.ediExt2 = ediExt2;
    }

    public String getPaperRetContactNm() {
        return paperRetContactNm;
    }

    public void setPaperRetContactNm(String paperRetContactNm) {
        this.paperRetContactNm = paperRetContactNm;
    }

    public String getPaperRetAreaCd() {
        return paperRetAreaCd;
    }

    public void setPaperRetAreaCd(String paperRetAreaCd) {
        this.paperRetAreaCd = paperRetAreaCd;
    }

    public String getPaperRetPhone() {
        return paperRetPhone;
    }

    public void setPaperRetPhone(String paperRetPhone) {
        this.paperRetPhone = paperRetPhone;
    }

    public String getPaperRetExt() {
        return paperRetExt;
    }

    public void setPaperRetExt(String paperRetExt) {
        this.paperRetExt = paperRetExt;
    }

    public String getAchRetContactNm() {
        return achRetContactNm;
    }

    public void setAchRetContactNm(String achRetContactNm) {
        this.achRetContactNm = achRetContactNm;
    }

    public String getAchRetAreaCd() {
        return achRetAreaCd;
    }

    public void setAchRetAreaCd(String achRetAreaCd) {
        this.achRetAreaCd = achRetAreaCd;
    }

    public String getAchRetPhone() {
        return achRetPhone;
    }

    public void setAchRetPhone(String achRetPhone) {
        this.achRetPhone = achRetPhone;
    }

    public String getAchRetExt() {
        return achRetExt;
    }

    public void setAchRetExt(String achRetExt) {
        this.achRetExt = achRetExt;
    }

    public String getPaperAdjContactNm() {
        return paperAdjContactNm;
    }

    public void setPaperAdjContactNm(String paperAdjContactNm) {
        this.paperAdjContactNm = paperAdjContactNm;
    }

    public String getPaperAdjAreaCd() {
        return paperAdjAreaCd;
    }

    public void setPaperAdjAreaCd(String paperAdjAreaCd) {
        this.paperAdjAreaCd = paperAdjAreaCd;
    }

    public String getPaperAdjPhone() {
        return paperAdjPhone;
    }

    public void setPaperAdjPhone(String paperAdjPhone) {
        this.paperAdjPhone = paperAdjPhone;
    }

    public String getPaperAdjExt() {
        return paperAdjExt;
    }

    public void setPaperAdjExt(String paperAdjExt) {
        this.paperAdjExt = paperAdjExt;
    }

    public String getAchAdjContactNm() {
        return achAdjContactNm;
    }

    public void setAchAdjContactNm(String achAdjContactNm) {
        this.achAdjContactNm = achAdjContactNm;
    }

    public String getAchAdjAreaCd() {
        return achAdjAreaCd;
    }

    public void setAchAdjAreaCd(String achAdjAreaCd) {
        this.achAdjAreaCd = achAdjAreaCd;
    }

    public String getAchAdjPhone() {
        return achAdjPhone;
    }

    public void setAchAdjPhone(String achAdjPhone) {
        this.achAdjPhone = achAdjPhone;
    }

    public String getAchAdjExt() {
        return achAdjExt;
    }

    public void setAchAdjExt(String achAdjExt) {
        this.achAdjExt = achAdjExt;
    }

    public Character getOrigStat() {
        return origStat;
    }

    public void setOrigStat(Character origStat) {
        this.origStat = origStat;
    }

    public Character getRecStat() {
        return recStat;
    }

    public void setRecStat(Character recStat) {
        this.recStat = recStat;
    }

    public int getAchMicrRoutNbr() {
        return achMicrRoutNbr;
    }

    public void setAchMicrRoutNbr(int achMicrRoutNbr) {
        this.achMicrRoutNbr = achMicrRoutNbr;
    }

    public String getAchProv() {
        return achProv;
    }

    public void setAchProv(String achProv) {
        this.achProv = achProv;
    }

    public Character getAchMicrStat() {
        return achMicrStat;
    }

    public void setAchMicrStat(Character achMicrStat) {
        this.achMicrStat = achMicrStat;
    }

    public String getCuPapPayThr() {
        return cuPapPayThr;
    }

    public void setCuPapPayThr(String cuPapPayThr) {
        this.cuPapPayThr = cuPapPayThr;
    }

    public int getCuPapPayThrMicr() {
        return cuPapPayThrMicr;
    }

    public void setCuPapPayThrMicr(int cuPapPayThrMicr) {
        this.cuPapPayThrMicr = cuPapPayThrMicr;
    }

    public long getCuAcctNbrIc() {
        return cuAcctNbrIc;
    }

    public void setCuAcctNbrIc(long cuAcctNbrIc) {
        this.cuAcctNbrIc = cuAcctNbrIc;
    }

    public short getCuIdPos() {
        return cuIdPos;
    }

    public void setCuIdPos(short cuIdPos) {
        this.cuIdPos = cuIdPos;
    }

    public Character getAchPayThr() {
        return achPayThr;
    }

    public void setAchPayThr(Character achPayThr) {
        this.achPayThr = achPayThr;
    }

    public Character getSavAcct() {
        return savAcct;
    }

    public void setSavAcct(Character savAcct) {
        this.savAcct = savAcct;
    }

    public Character getChkAcct() {
        return chkAcct;
    }

    public void setChkAcct(Character chkAcct) {
        this.chkAcct = chkAcct;
    }

    public String getLocalAch() {
        return localAch;
    }

    public void setLocalAch(String localAch) {
        this.localAch = localAch;
    }

    public Character getAchMemInd() {
        return achMemInd;
    }

    public void setAchMemInd(Character achMemInd) {
        this.achMemInd = achMemInd;
    }

    public int getFedResAchMicr() {
        return fedResAchMicr;
    }

    public void setFedResAchMicr(int fedResAchMicr) {
        this.fedResAchMicr = fedResAchMicr;
    }

    public Character getFedwireFundsTransStat() {
        return fedwireFundsTransStat;
    }

    public void setFedwireFundsTransStat(Character fedwireFundsTransStat) {
        this.fedwireFundsTransStat = fedwireFundsTransStat;
    }

    public Character getEdiCdCash() {
        return ediCdCash;
    }

    public void setEdiCdCash(Character ediCdCash) {
        this.ediCdCash = ediCdCash;
    }

    public Character getEdiCdCorpTradePay() {
        return ediCdCorpTradePay;
    }

    public void setEdiCdCorpTradePay(Character ediCdCorpTradePay) {
        this.ediCdCorpTradePay = ediCdCorpTradePay;
    }

    public Character getEdiCdCorpTradeExch() {
        return ediCdCorpTradeExch;
    }

    public void setEdiCdCorpTradeExch(Character ediCdCorpTradeExch) {
        this.ediCdCorpTradeExch = ediCdCorpTradeExch;
    }

    public Character getEdiCdCustInitEntry() {
        return ediCdCustInitEntry;
    }

    public void setEdiCdCustInitEntry(Character ediCdCustInitEntry) {
        this.ediCdCustInitEntry = ediCdCustInitEntry;
    }

    public String getPrivSecAchAssoc() {
        return privSecAchAssoc;
    }

    public void setPrivSecAchAssoc(String privSecAchAssoc) {
        this.privSecAchAssoc = privSecAchAssoc;
    }

    public int getPrivSecAchMicr() {
        return privSecAchMicr;
    }

    public void setPrivSecAchMicr(int privSecAchMicr) {
        this.privSecAchMicr = privSecAchMicr;
    }

    public String getY2kLastUpdated3() {
        return y2kLastUpdated3;
    }

    public void setY2kLastUpdated3(String y2kLastUpdated3) {
        this.y2kLastUpdated3 = y2kLastUpdated3;
    }

    public String getInstId3() {
        return instId3;
    }

    public void setInstId3(String instId3) {
        this.instId3 = instId3;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fileKey != null ? fileKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElecPayFile)) {
            return false;
        }
        ElecPayFile other = (ElecPayFile) object;
        if ((this.fileKey == null && other.fileKey != null) || (this.fileKey != null && !this.fileKey.equals(other.fileKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ElecPayFile[ fileKey=" + fileKey + " ]";
    }
    
}
