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
@Table(name = "MOTRS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Motrs.findAll", query = "SELECT m FROM Motrs m")})
public class Motrs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STATION_CODE")
    private String stationCode;
    @Basic(optional = false)
    @Column(name = "INTERVIEW_DT")
    @Temporal(TemporalType.DATE)
    private Date interviewDt;
    @Basic(optional = false)
    @Column(name = "SITE_CD")
    private String siteCd;
    @Basic(optional = false)
    @Column(name = "RESPONDENT_FST_NM")
    private String respondentFstNm;
    @Basic(optional = false)
    @Column(name = "RESPONDENT_LST_NM")
    private String respondentLstNm;
    @Basic(optional = false)
    @Column(name = "RESPONDENT_TTL")
    private String respondentTtl;
    @Basic(optional = false)
    @Column(name = "FL_DESK_PRM_PH_NBR")
    private String flDeskPrmPhNbr;
    @Basic(optional = false)
    @Column(name = "FL_DESK_SEC_PH_NBR")
    private String flDeskSecPhNbr;
    @Basic(optional = false)
    @Column(name = "MON_OPEN_HR")
    private String monOpenHr;
    @Basic(optional = false)
    @Column(name = "MON_CLOSE_HR")
    private String monCloseHr;
    @Basic(optional = false)
    @Column(name = "TUES_OPEN_HR")
    private String tuesOpenHr;
    @Basic(optional = false)
    @Column(name = "TUES_CLOSE_HR")
    private String tuesCloseHr;
    @Basic(optional = false)
    @Column(name = "WED_OPEN_HR")
    private String wedOpenHr;
    @Basic(optional = false)
    @Column(name = "WED_CLOSE_HR")
    private String wedCloseHr;
    @Basic(optional = false)
    @Column(name = "THURS_OPEN_HR")
    private String thursOpenHr;
    @Basic(optional = false)
    @Column(name = "THURS_CLOSE_HR")
    private String thursCloseHr;
    @Basic(optional = false)
    @Column(name = "FRI_OPEN_HR")
    private String friOpenHr;
    @Basic(optional = false)
    @Column(name = "FRI_CLOSE_HR")
    private String friCloseHr;
    @Basic(optional = false)
    @Column(name = "SAT_OPEN_HR")
    private String satOpenHr;
    @Basic(optional = false)
    @Column(name = "SAT_CLOSE_HR")
    private String satCloseHr;
    @Basic(optional = false)
    @Column(name = "SUN_OPEN_HR")
    private String sunOpenHr;
    @Basic(optional = false)
    @Column(name = "SUN_CLOSE_HR")
    private String sunCloseHr;
    @Basic(optional = false)
    @Column(name = "OPEN_24_7_FLG")
    private Character open247Flg;
    @Basic(optional = false)
    @Column(name = "NEAREST_INTST_HWY_NBR")
    private String nearestIntstHwyNbr;
    @Basic(optional = false)
    @Column(name = "NEAREST_INTST_DRCTN_CD")
    private Character nearestIntstDrctnCd;
    @Basic(optional = false)
    @Column(name = "MLS_MRKR")
    private String mlsMrkr;
    @Basic(optional = false)
    @Column(name = "NEAREST_HWY_INTRSCTN_TXT")
    private String nearestHwyIntrsctnTxt;
    @Basic(optional = false)
    @Column(name = "FL_SRV_CD")
    private Character flSrvCd;
    @Basic(optional = false)
    @Column(name = "RED_LOW_SULFUR_DYE_CD")
    private Character redLowSulfurDyeCd;
    @Basic(optional = false)
    @Column(name = "BLUE_HIGH_SULFUR_DYE_CD")
    private Character blueHighSulfurDyeCd;
    @Basic(optional = false)
    @Column(name = "DSL_PUMPS_CNT")
    private String dslPumpsCnt;
    @Basic(optional = false)
    @Column(name = "PUBLISHED_VOL_DISC_CD")
    private Character publishedVolDiscCd;
    @Basic(optional = false)
    @Column(name = "NEAREST_TRUCKER_MOTEL_NBR")
    private String nearestTruckerMotelNbr;
    @Basic(optional = false)
    @Column(name = "OTH_HTL_MOTEL_TXT")
    private String othHtlMotelTxt;
    @Basic(optional = false)
    @Column(name = "DST_TO_NEAREST_MOTEL_NBR")
    private String dstToNearestMotelNbr;
    @Basic(optional = false)
    @Column(name = "FED_TAX_ID_OR_GST_NBR")
    private String fedTaxIdOrGstNbr;
    @Basic(optional = false)
    @Column(name = "RCVD_PRMTS_CD")
    private Character rcvdPrmtsCd;
    @Basic(optional = false)
    @Column(name = "FAX_RCVG_PRMTS_NBR")
    private String faxRcvgPrmtsNbr;
    @Basic(optional = false)
    @Column(name = "RCVD_CDN_XCEIVER_NBR")
    private Character rcvdCdnXceiverNbr;
    @Basic(optional = false)
    @Column(name = "FAX_RCVG_XCEIVER_NBR")
    private String faxRcvgXceiverNbr;
    @Basic(optional = false)
    @Column(name = "PRMT_TYP_OF_PMT_CD")
    private Character prmtTypOfPmtCd;
    @Basic(optional = false)
    @Column(name = "SEND_PRMTS_CD")
    private Character sendPrmtsCd;
    @Basic(optional = false)
    @Column(name = "SEND_CDN_XCEIVER_PERM_CD")
    private Character sendCdnXceiverPermCd;
    @Basic(optional = false)
    @Column(name = "PRMT_LOC_ID_CD")
    private String prmtLocIdCd;
    @Basic(optional = false)
    @Column(name = "PMT_SENDER_FOR_CMCHK_CD")
    private Character pmtSenderForCmchkCd;
    @Basic(optional = false)
    @Column(name = "XCEIVER_ACCT_CD")
    private String xceiverAcctCd;
    @Basic(optional = false)
    @Column(name = "SEND_MONEY_XFRS_WU_AMEX_CD")
    private Character sendMoneyXfrsWuAmexCd;
    @Basic(optional = false)
    @Column(name = "MC_VISA_DI_ON_CMCHK_CD")
    private Character mcVisaDiOnCmchkCd;
    @Basic(optional = false)
    @Column(name = "MC_VISA_DI_ON_OTH_CD")
    private Character mcVisaDiOnOthCd;
    @Basic(optional = false)
    @Column(name = "OTH_RESP_CD")
    private Character othRespCd;
    @Basic(optional = false)
    @Column(name = "LEGAL_NM")
    private String legalNm;
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

    public Motrs() {
    }

    public Motrs(String stationCode) {
        this.stationCode = stationCode;
    }

    public Motrs(String stationCode, Date interviewDt, String siteCd, String respondentFstNm, String respondentLstNm, String respondentTtl, String flDeskPrmPhNbr, String flDeskSecPhNbr, String monOpenHr, String monCloseHr, String tuesOpenHr, String tuesCloseHr, String wedOpenHr, String wedCloseHr, String thursOpenHr, String thursCloseHr, String friOpenHr, String friCloseHr, String satOpenHr, String satCloseHr, String sunOpenHr, String sunCloseHr, Character open247Flg, String nearestIntstHwyNbr, Character nearestIntstDrctnCd, String mlsMrkr, String nearestHwyIntrsctnTxt, Character flSrvCd, Character redLowSulfurDyeCd, Character blueHighSulfurDyeCd, String dslPumpsCnt, Character publishedVolDiscCd, String nearestTruckerMotelNbr, String othHtlMotelTxt, String dstToNearestMotelNbr, String fedTaxIdOrGstNbr, Character rcvdPrmtsCd, String faxRcvgPrmtsNbr, Character rcvdCdnXceiverNbr, String faxRcvgXceiverNbr, Character prmtTypOfPmtCd, Character sendPrmtsCd, Character sendCdnXceiverPermCd, String prmtLocIdCd, Character pmtSenderForCmchkCd, String xceiverAcctCd, Character sendMoneyXfrsWuAmexCd, Character mcVisaDiOnCmchkCd, Character mcVisaDiOnOthCd, Character othRespCd, String legalNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.stationCode = stationCode;
        this.interviewDt = interviewDt;
        this.siteCd = siteCd;
        this.respondentFstNm = respondentFstNm;
        this.respondentLstNm = respondentLstNm;
        this.respondentTtl = respondentTtl;
        this.flDeskPrmPhNbr = flDeskPrmPhNbr;
        this.flDeskSecPhNbr = flDeskSecPhNbr;
        this.monOpenHr = monOpenHr;
        this.monCloseHr = monCloseHr;
        this.tuesOpenHr = tuesOpenHr;
        this.tuesCloseHr = tuesCloseHr;
        this.wedOpenHr = wedOpenHr;
        this.wedCloseHr = wedCloseHr;
        this.thursOpenHr = thursOpenHr;
        this.thursCloseHr = thursCloseHr;
        this.friOpenHr = friOpenHr;
        this.friCloseHr = friCloseHr;
        this.satOpenHr = satOpenHr;
        this.satCloseHr = satCloseHr;
        this.sunOpenHr = sunOpenHr;
        this.sunCloseHr = sunCloseHr;
        this.open247Flg = open247Flg;
        this.nearestIntstHwyNbr = nearestIntstHwyNbr;
        this.nearestIntstDrctnCd = nearestIntstDrctnCd;
        this.mlsMrkr = mlsMrkr;
        this.nearestHwyIntrsctnTxt = nearestHwyIntrsctnTxt;
        this.flSrvCd = flSrvCd;
        this.redLowSulfurDyeCd = redLowSulfurDyeCd;
        this.blueHighSulfurDyeCd = blueHighSulfurDyeCd;
        this.dslPumpsCnt = dslPumpsCnt;
        this.publishedVolDiscCd = publishedVolDiscCd;
        this.nearestTruckerMotelNbr = nearestTruckerMotelNbr;
        this.othHtlMotelTxt = othHtlMotelTxt;
        this.dstToNearestMotelNbr = dstToNearestMotelNbr;
        this.fedTaxIdOrGstNbr = fedTaxIdOrGstNbr;
        this.rcvdPrmtsCd = rcvdPrmtsCd;
        this.faxRcvgPrmtsNbr = faxRcvgPrmtsNbr;
        this.rcvdCdnXceiverNbr = rcvdCdnXceiverNbr;
        this.faxRcvgXceiverNbr = faxRcvgXceiverNbr;
        this.prmtTypOfPmtCd = prmtTypOfPmtCd;
        this.sendPrmtsCd = sendPrmtsCd;
        this.sendCdnXceiverPermCd = sendCdnXceiverPermCd;
        this.prmtLocIdCd = prmtLocIdCd;
        this.pmtSenderForCmchkCd = pmtSenderForCmchkCd;
        this.xceiverAcctCd = xceiverAcctCd;
        this.sendMoneyXfrsWuAmexCd = sendMoneyXfrsWuAmexCd;
        this.mcVisaDiOnCmchkCd = mcVisaDiOnCmchkCd;
        this.mcVisaDiOnOthCd = mcVisaDiOnOthCd;
        this.othRespCd = othRespCd;
        this.legalNm = legalNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public Date getInterviewDt() {
        return interviewDt;
    }

    public void setInterviewDt(Date interviewDt) {
        this.interviewDt = interviewDt;
    }

    public String getSiteCd() {
        return siteCd;
    }

    public void setSiteCd(String siteCd) {
        this.siteCd = siteCd;
    }

    public String getRespondentFstNm() {
        return respondentFstNm;
    }

    public void setRespondentFstNm(String respondentFstNm) {
        this.respondentFstNm = respondentFstNm;
    }

    public String getRespondentLstNm() {
        return respondentLstNm;
    }

    public void setRespondentLstNm(String respondentLstNm) {
        this.respondentLstNm = respondentLstNm;
    }

    public String getRespondentTtl() {
        return respondentTtl;
    }

    public void setRespondentTtl(String respondentTtl) {
        this.respondentTtl = respondentTtl;
    }

    public String getFlDeskPrmPhNbr() {
        return flDeskPrmPhNbr;
    }

    public void setFlDeskPrmPhNbr(String flDeskPrmPhNbr) {
        this.flDeskPrmPhNbr = flDeskPrmPhNbr;
    }

    public String getFlDeskSecPhNbr() {
        return flDeskSecPhNbr;
    }

    public void setFlDeskSecPhNbr(String flDeskSecPhNbr) {
        this.flDeskSecPhNbr = flDeskSecPhNbr;
    }

    public String getMonOpenHr() {
        return monOpenHr;
    }

    public void setMonOpenHr(String monOpenHr) {
        this.monOpenHr = monOpenHr;
    }

    public String getMonCloseHr() {
        return monCloseHr;
    }

    public void setMonCloseHr(String monCloseHr) {
        this.monCloseHr = monCloseHr;
    }

    public String getTuesOpenHr() {
        return tuesOpenHr;
    }

    public void setTuesOpenHr(String tuesOpenHr) {
        this.tuesOpenHr = tuesOpenHr;
    }

    public String getTuesCloseHr() {
        return tuesCloseHr;
    }

    public void setTuesCloseHr(String tuesCloseHr) {
        this.tuesCloseHr = tuesCloseHr;
    }

    public String getWedOpenHr() {
        return wedOpenHr;
    }

    public void setWedOpenHr(String wedOpenHr) {
        this.wedOpenHr = wedOpenHr;
    }

    public String getWedCloseHr() {
        return wedCloseHr;
    }

    public void setWedCloseHr(String wedCloseHr) {
        this.wedCloseHr = wedCloseHr;
    }

    public String getThursOpenHr() {
        return thursOpenHr;
    }

    public void setThursOpenHr(String thursOpenHr) {
        this.thursOpenHr = thursOpenHr;
    }

    public String getThursCloseHr() {
        return thursCloseHr;
    }

    public void setThursCloseHr(String thursCloseHr) {
        this.thursCloseHr = thursCloseHr;
    }

    public String getFriOpenHr() {
        return friOpenHr;
    }

    public void setFriOpenHr(String friOpenHr) {
        this.friOpenHr = friOpenHr;
    }

    public String getFriCloseHr() {
        return friCloseHr;
    }

    public void setFriCloseHr(String friCloseHr) {
        this.friCloseHr = friCloseHr;
    }

    public String getSatOpenHr() {
        return satOpenHr;
    }

    public void setSatOpenHr(String satOpenHr) {
        this.satOpenHr = satOpenHr;
    }

    public String getSatCloseHr() {
        return satCloseHr;
    }

    public void setSatCloseHr(String satCloseHr) {
        this.satCloseHr = satCloseHr;
    }

    public String getSunOpenHr() {
        return sunOpenHr;
    }

    public void setSunOpenHr(String sunOpenHr) {
        this.sunOpenHr = sunOpenHr;
    }

    public String getSunCloseHr() {
        return sunCloseHr;
    }

    public void setSunCloseHr(String sunCloseHr) {
        this.sunCloseHr = sunCloseHr;
    }

    public Character getOpen247Flg() {
        return open247Flg;
    }

    public void setOpen247Flg(Character open247Flg) {
        this.open247Flg = open247Flg;
    }

    public String getNearestIntstHwyNbr() {
        return nearestIntstHwyNbr;
    }

    public void setNearestIntstHwyNbr(String nearestIntstHwyNbr) {
        this.nearestIntstHwyNbr = nearestIntstHwyNbr;
    }

    public Character getNearestIntstDrctnCd() {
        return nearestIntstDrctnCd;
    }

    public void setNearestIntstDrctnCd(Character nearestIntstDrctnCd) {
        this.nearestIntstDrctnCd = nearestIntstDrctnCd;
    }

    public String getMlsMrkr() {
        return mlsMrkr;
    }

    public void setMlsMrkr(String mlsMrkr) {
        this.mlsMrkr = mlsMrkr;
    }

    public String getNearestHwyIntrsctnTxt() {
        return nearestHwyIntrsctnTxt;
    }

    public void setNearestHwyIntrsctnTxt(String nearestHwyIntrsctnTxt) {
        this.nearestHwyIntrsctnTxt = nearestHwyIntrsctnTxt;
    }

    public Character getFlSrvCd() {
        return flSrvCd;
    }

    public void setFlSrvCd(Character flSrvCd) {
        this.flSrvCd = flSrvCd;
    }

    public Character getRedLowSulfurDyeCd() {
        return redLowSulfurDyeCd;
    }

    public void setRedLowSulfurDyeCd(Character redLowSulfurDyeCd) {
        this.redLowSulfurDyeCd = redLowSulfurDyeCd;
    }

    public Character getBlueHighSulfurDyeCd() {
        return blueHighSulfurDyeCd;
    }

    public void setBlueHighSulfurDyeCd(Character blueHighSulfurDyeCd) {
        this.blueHighSulfurDyeCd = blueHighSulfurDyeCd;
    }

    public String getDslPumpsCnt() {
        return dslPumpsCnt;
    }

    public void setDslPumpsCnt(String dslPumpsCnt) {
        this.dslPumpsCnt = dslPumpsCnt;
    }

    public Character getPublishedVolDiscCd() {
        return publishedVolDiscCd;
    }

    public void setPublishedVolDiscCd(Character publishedVolDiscCd) {
        this.publishedVolDiscCd = publishedVolDiscCd;
    }

    public String getNearestTruckerMotelNbr() {
        return nearestTruckerMotelNbr;
    }

    public void setNearestTruckerMotelNbr(String nearestTruckerMotelNbr) {
        this.nearestTruckerMotelNbr = nearestTruckerMotelNbr;
    }

    public String getOthHtlMotelTxt() {
        return othHtlMotelTxt;
    }

    public void setOthHtlMotelTxt(String othHtlMotelTxt) {
        this.othHtlMotelTxt = othHtlMotelTxt;
    }

    public String getDstToNearestMotelNbr() {
        return dstToNearestMotelNbr;
    }

    public void setDstToNearestMotelNbr(String dstToNearestMotelNbr) {
        this.dstToNearestMotelNbr = dstToNearestMotelNbr;
    }

    public String getFedTaxIdOrGstNbr() {
        return fedTaxIdOrGstNbr;
    }

    public void setFedTaxIdOrGstNbr(String fedTaxIdOrGstNbr) {
        this.fedTaxIdOrGstNbr = fedTaxIdOrGstNbr;
    }

    public Character getRcvdPrmtsCd() {
        return rcvdPrmtsCd;
    }

    public void setRcvdPrmtsCd(Character rcvdPrmtsCd) {
        this.rcvdPrmtsCd = rcvdPrmtsCd;
    }

    public String getFaxRcvgPrmtsNbr() {
        return faxRcvgPrmtsNbr;
    }

    public void setFaxRcvgPrmtsNbr(String faxRcvgPrmtsNbr) {
        this.faxRcvgPrmtsNbr = faxRcvgPrmtsNbr;
    }

    public Character getRcvdCdnXceiverNbr() {
        return rcvdCdnXceiverNbr;
    }

    public void setRcvdCdnXceiverNbr(Character rcvdCdnXceiverNbr) {
        this.rcvdCdnXceiverNbr = rcvdCdnXceiverNbr;
    }

    public String getFaxRcvgXceiverNbr() {
        return faxRcvgXceiverNbr;
    }

    public void setFaxRcvgXceiverNbr(String faxRcvgXceiverNbr) {
        this.faxRcvgXceiverNbr = faxRcvgXceiverNbr;
    }

    public Character getPrmtTypOfPmtCd() {
        return prmtTypOfPmtCd;
    }

    public void setPrmtTypOfPmtCd(Character prmtTypOfPmtCd) {
        this.prmtTypOfPmtCd = prmtTypOfPmtCd;
    }

    public Character getSendPrmtsCd() {
        return sendPrmtsCd;
    }

    public void setSendPrmtsCd(Character sendPrmtsCd) {
        this.sendPrmtsCd = sendPrmtsCd;
    }

    public Character getSendCdnXceiverPermCd() {
        return sendCdnXceiverPermCd;
    }

    public void setSendCdnXceiverPermCd(Character sendCdnXceiverPermCd) {
        this.sendCdnXceiverPermCd = sendCdnXceiverPermCd;
    }

    public String getPrmtLocIdCd() {
        return prmtLocIdCd;
    }

    public void setPrmtLocIdCd(String prmtLocIdCd) {
        this.prmtLocIdCd = prmtLocIdCd;
    }

    public Character getPmtSenderForCmchkCd() {
        return pmtSenderForCmchkCd;
    }

    public void setPmtSenderForCmchkCd(Character pmtSenderForCmchkCd) {
        this.pmtSenderForCmchkCd = pmtSenderForCmchkCd;
    }

    public String getXceiverAcctCd() {
        return xceiverAcctCd;
    }

    public void setXceiverAcctCd(String xceiverAcctCd) {
        this.xceiverAcctCd = xceiverAcctCd;
    }

    public Character getSendMoneyXfrsWuAmexCd() {
        return sendMoneyXfrsWuAmexCd;
    }

    public void setSendMoneyXfrsWuAmexCd(Character sendMoneyXfrsWuAmexCd) {
        this.sendMoneyXfrsWuAmexCd = sendMoneyXfrsWuAmexCd;
    }

    public Character getMcVisaDiOnCmchkCd() {
        return mcVisaDiOnCmchkCd;
    }

    public void setMcVisaDiOnCmchkCd(Character mcVisaDiOnCmchkCd) {
        this.mcVisaDiOnCmchkCd = mcVisaDiOnCmchkCd;
    }

    public Character getMcVisaDiOnOthCd() {
        return mcVisaDiOnOthCd;
    }

    public void setMcVisaDiOnOthCd(Character mcVisaDiOnOthCd) {
        this.mcVisaDiOnOthCd = mcVisaDiOnOthCd;
    }

    public Character getOthRespCd() {
        return othRespCd;
    }

    public void setOthRespCd(Character othRespCd) {
        this.othRespCd = othRespCd;
    }

    public String getLegalNm() {
        return legalNm;
    }

    public void setLegalNm(String legalNm) {
        this.legalNm = legalNm;
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
        hash += (stationCode != null ? stationCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motrs)) {
            return false;
        }
        Motrs other = (Motrs) object;
        if ((this.stationCode == null && other.stationCode != null) || (this.stationCode != null && !this.stationCode.equals(other.stationCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Motrs[ stationCode=" + stationCode + " ]";
    }
    
}
