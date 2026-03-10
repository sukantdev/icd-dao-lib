/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "VP_CV_MAST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpCvMast.findAll", query = "SELECT v FROM VpCvMast v")})
public class VpCvMast implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpCvMastPK vpCvMastPK;
    @Basic(optional = false)
    @Column(name = "VEND_MAST_ID")
    private String vendMastId;
    @Basic(optional = false)
    @Column(name = "CUST_DBA_NM")
    private String custDbaNm;
    @Basic(optional = false)
    @Column(name = "VEND_NM")
    private String vendNm;
    @Basic(optional = false)
    @Column(name = "CUST_VEND_NBR")
    private String custVendNbr;
    @Basic(optional = false)
    @Column(name = "CDN_PAY_METH")
    private String cdnPayMeth;
    @Basic(optional = false)
    @Column(name = "CURR_PAY_METH")
    private Character currPayMeth;
    @Basic(optional = false)
    @Column(name = "VEND_ENROLL_CD")
    private String vendEnrollCd;
    @Basic(optional = false)
    @Column(name = "VEND_ENROLL_STAT")
    private Character vendEnrollStat;
    @Basic(optional = false)
    @Column(name = "VEND_ENROLL_STAT_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vendEnrollStatDt;
    @Basic(optional = false)
    @Column(name = "VEND_ID_CONF")
    private String vendIdConf;
    @Basic(optional = false)
    @Column(name = "WELCOME_LTR_STAT")
    private Character welcomeLtrStat;
    @Basic(optional = false)
    @Column(name = "WELCOME_LTR_STAT_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date welcomeLtrStatDt;
    @Basic(optional = false)
    @Column(name = "PROJ_ANN_SPND")
    private long projAnnSpnd;
    @Basic(optional = false)
    @Column(name = "ACCT_VER_AMT_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date acctVerAmtDt;
    @Basic(optional = false)
    @Column(name = "MISC1")
    private String misc1;
    @Basic(optional = false)
    @Column(name = "MISC2")
    private String misc2;
    @Basic(optional = false)
    @Column(name = "MISC3")
    private String misc3;
    @Basic(optional = false)
    @Column(name = "MISC4")
    private String misc4;
    @Basic(optional = false)
    @Column(name = "DECLINE_REASON")
    private String declineReason;
    @Basic(optional = false)
    @Column(name = "DECLINE_INTERCHANGE")
    private short declineInterchange;
    @Basic(optional = false)
    @Column(name = "DECLINE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date declineDt;
    @Basic(optional = false)
    @Column(name = "CAMP_NBR")
    private String campNbr;
    @Basic(optional = false)
    @Column(name = "CAMP_NAME")
    private String campName;
    @Basic(optional = false)
    @Column(name = "NOTES")
    private String notes;
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
    @Basic(optional = false)
    @Column(name = "CUST_GRP_ID")
    private String custGrpId;
    @Basic(optional = false)
    @Column(name = "VEND_ENROLL_NBR")
    private String vendEnrollNbr;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "REMIT_EMAIL")
    private String remitEmail;
    @Basic(optional = false)
    @Column(name = "SRV_CENTER_CD")
    private String srvCenterCd;
    @Basic(optional = false)
    @Column(name = "TAX_ID")
    private String taxId;
    @Basic(optional = false)
    @Column(name = "DB_NBR")
    private String dbNbr;
    @Basic(optional = false)
    @Column(name = "CUST_GRP_NM")
    private String custGrpNm;
    @Basic(optional = false)
    @Column(name = "FAX_NBR")
    private String faxNbr;
    @Basic(optional = false)
    @Column(name = "MATCH_CD")
    private Character matchCd;
    @Basic(optional = false)
    @Column(name = "REMIT_INSTRUCTIONS")
    private String remitInstructions;
    @Basic(optional = false)
    @Column(name = "RDY_FOR_CAMP")
    private Character rdyForCamp;
    @Basic(optional = false)
    @Column(name = "OVRD_TRNS_NBR")
    private int ovrdTrnsNbr;
    @Basic(optional = false)
    @Column(name = "OVRD_EXACT_AMT_FLG")
    private Character ovrdExactAmtFlg;
    @Basic(optional = false)
    @Column(name = "OVRD_CRT_VC_BY_FLG")
    private Character ovrdCrtVcByFlg;
    @Basic(optional = false)
    @Column(name = "OVRD_BYR_STUP")
    private Character ovrdByrStup;
    @Basic(optional = false)
    @Column(name = "SRC_VNDR_TXT")
    private String srcVndrTxt;
    @Basic(optional = false)
    @Column(name = "ENRLD_USR_ID")
    private String enrldUsrId;
    @Basic(optional = false)
    @Column(name = "FST_PMT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fstPmtTs;
    @Basic(optional = false)
    @Column(name = "LST_PMT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lstPmtTs;
    @Basic(optional = false)
    @Column(name = "RESELLER")
    private String reseller;
    @Basic(optional = false)
    @Column(name = "CUST_VEND_ACT_NBR")
    private String custVendActNbr;
    @Basic(optional = false)
    @Column(name = "SF_VNDR_RLSHP_UID")
    private String sfVndrRlshpUid;
    @Basic(optional = false)
    @Column(name = "STAT_RSN_CD")
    private String statRsnCd;
    @Basic(optional = false)
    @Column(name = "EXCLD_FROM_LOST_OPPTY_FLG")
    private Character excldFromLostOpptyFlg;
    @Basic(optional = false)
    @Column(name = "EMAIL_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date emailChgTs;
    @Basic(optional = false)
    @Column(name = "LMTNS_TXT")
    private String lmtnsTxt;
    @Basic(optional = false)
    @Column(name = "FEES_TXT")
    private String feesTxt;
    @Basic(optional = false)
    @Column(name = "VP_3RD_PARTY_ID")
    private String vp3rdPartyId;
    @Basic(optional = false)
    @Column(name = "ACTN_RQD_TYP_CD")
    private String actnRqdTypCd;
    @Basic(optional = false)
    @Column(name = "MTCHD_USR")
    private String mtchdUsr;
    @Basic(optional = false)
    @Column(name = "MTCHD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mtchdTs;
    @Basic(optional = false)
    @Column(name = "CC_EMAIL")
    private String ccEmail;
    @Column(name = "LST_PMT_PSTD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lstPmtPstdTs;
    @Basic(optional = false)
    @Column(name = "CUST_PIN_AT_VNDR")
    private String custPinAtVndr;
    @Basic(optional = false)
    @Column(name = "CUST_TAX_ID_LAST4")
    private String custTaxIdLast4;
    @Basic(optional = false)
    @Column(name = "REC_STAGE_CD")
    private String recStageCd;
    @Basic(optional = false)
    @Column(name = "ALT_BIN_FLG")
    private Character altBinFlg;
    @Basic(optional = false)
    @Column(name = "OVRD_VM_PMT_MTHD_CD")
    private Character ovrdVmPmtMthdCd;

    public VpCvMast() {
    }

    public VpCvMast(VpCvMastPK vpCvMastPK) {
        this.vpCvMastPK = vpCvMastPK;
    }

    public VpCvMast(VpCvMastPK vpCvMastPK, String vendMastId, String custDbaNm, String vendNm, String custVendNbr, String cdnPayMeth, Character currPayMeth, String vendEnrollCd, Character vendEnrollStat, Date vendEnrollStatDt, String vendIdConf, Character welcomeLtrStat, Date welcomeLtrStatDt, long projAnnSpnd, Date acctVerAmtDt, String misc1, String misc2, String misc3, String misc4, String declineReason, short declineInterchange, Date declineDt, String campNbr, String campName, String notes, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, String custGrpId, String vendEnrollNbr, String locCd, String remitEmail, String srvCenterCd, String taxId, String dbNbr, String custGrpNm, String faxNbr, Character matchCd, String remitInstructions, Character rdyForCamp, int ovrdTrnsNbr, Character ovrdExactAmtFlg, Character ovrdCrtVcByFlg, Character ovrdByrStup, String srcVndrTxt, String enrldUsrId, Date fstPmtTs, Date lstPmtTs, String reseller, String custVendActNbr, String sfVndrRlshpUid, String statRsnCd, Character excldFromLostOpptyFlg, Date emailChgTs, String lmtnsTxt, String feesTxt, String vp3rdPartyId, String actnRqdTypCd, String mtchdUsr, Date mtchdTs, String ccEmail, String custPinAtVndr, String custTaxIdLast4, String recStageCd, Character altBinFlg, Character ovrdVmPmtMthdCd) {
        this.vpCvMastPK = vpCvMastPK;
        this.vendMastId = vendMastId;
        this.custDbaNm = custDbaNm;
        this.vendNm = vendNm;
        this.custVendNbr = custVendNbr;
        this.cdnPayMeth = cdnPayMeth;
        this.currPayMeth = currPayMeth;
        this.vendEnrollCd = vendEnrollCd;
        this.vendEnrollStat = vendEnrollStat;
        this.vendEnrollStatDt = vendEnrollStatDt;
        this.vendIdConf = vendIdConf;
        this.welcomeLtrStat = welcomeLtrStat;
        this.welcomeLtrStatDt = welcomeLtrStatDt;
        this.projAnnSpnd = projAnnSpnd;
        this.acctVerAmtDt = acctVerAmtDt;
        this.misc1 = misc1;
        this.misc2 = misc2;
        this.misc3 = misc3;
        this.misc4 = misc4;
        this.declineReason = declineReason;
        this.declineInterchange = declineInterchange;
        this.declineDt = declineDt;
        this.campNbr = campNbr;
        this.campName = campName;
        this.notes = notes;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.custGrpId = custGrpId;
        this.vendEnrollNbr = vendEnrollNbr;
        this.locCd = locCd;
        this.remitEmail = remitEmail;
        this.srvCenterCd = srvCenterCd;
        this.taxId = taxId;
        this.dbNbr = dbNbr;
        this.custGrpNm = custGrpNm;
        this.faxNbr = faxNbr;
        this.matchCd = matchCd;
        this.remitInstructions = remitInstructions;
        this.rdyForCamp = rdyForCamp;
        this.ovrdTrnsNbr = ovrdTrnsNbr;
        this.ovrdExactAmtFlg = ovrdExactAmtFlg;
        this.ovrdCrtVcByFlg = ovrdCrtVcByFlg;
        this.ovrdByrStup = ovrdByrStup;
        this.srcVndrTxt = srcVndrTxt;
        this.enrldUsrId = enrldUsrId;
        this.fstPmtTs = fstPmtTs;
        this.lstPmtTs = lstPmtTs;
        this.reseller = reseller;
        this.custVendActNbr = custVendActNbr;
        this.sfVndrRlshpUid = sfVndrRlshpUid;
        this.statRsnCd = statRsnCd;
        this.excldFromLostOpptyFlg = excldFromLostOpptyFlg;
        this.emailChgTs = emailChgTs;
        this.lmtnsTxt = lmtnsTxt;
        this.feesTxt = feesTxt;
        this.vp3rdPartyId = vp3rdPartyId;
        this.actnRqdTypCd = actnRqdTypCd;
        this.mtchdUsr = mtchdUsr;
        this.mtchdTs = mtchdTs;
        this.ccEmail = ccEmail;
        this.custPinAtVndr = custPinAtVndr;
        this.custTaxIdLast4 = custTaxIdLast4;
        this.recStageCd = recStageCd;
        this.altBinFlg = altBinFlg;
        this.ovrdVmPmtMthdCd = ovrdVmPmtMthdCd;
    }

    public VpCvMast(String cvMastId, String custMastId) {
        this.vpCvMastPK = new VpCvMastPK(cvMastId, custMastId);
    }

    public VpCvMastPK getVpCvMastPK() {
        return vpCvMastPK;
    }

    public void setVpCvMastPK(VpCvMastPK vpCvMastPK) {
        this.vpCvMastPK = vpCvMastPK;
    }

    public String getVendMastId() {
        return vendMastId;
    }

    public void setVendMastId(String vendMastId) {
        this.vendMastId = vendMastId;
    }

    public String getCustDbaNm() {
        return custDbaNm;
    }

    public void setCustDbaNm(String custDbaNm) {
        this.custDbaNm = custDbaNm;
    }

    public String getVendNm() {
        return vendNm;
    }

    public void setVendNm(String vendNm) {
        this.vendNm = vendNm;
    }

    public String getCustVendNbr() {
        return custVendNbr;
    }

    public void setCustVendNbr(String custVendNbr) {
        this.custVendNbr = custVendNbr;
    }

    public String getCdnPayMeth() {
        return cdnPayMeth;
    }

    public void setCdnPayMeth(String cdnPayMeth) {
        this.cdnPayMeth = cdnPayMeth;
    }

    public Character getCurrPayMeth() {
        return currPayMeth;
    }

    public void setCurrPayMeth(Character currPayMeth) {
        this.currPayMeth = currPayMeth;
    }

    public String getVendEnrollCd() {
        return vendEnrollCd;
    }

    public void setVendEnrollCd(String vendEnrollCd) {
        this.vendEnrollCd = vendEnrollCd;
    }

    public Character getVendEnrollStat() {
        return vendEnrollStat;
    }

    public void setVendEnrollStat(Character vendEnrollStat) {
        this.vendEnrollStat = vendEnrollStat;
    }

    public Date getVendEnrollStatDt() {
        return vendEnrollStatDt;
    }

    public void setVendEnrollStatDt(Date vendEnrollStatDt) {
        this.vendEnrollStatDt = vendEnrollStatDt;
    }

    public String getVendIdConf() {
        return vendIdConf;
    }

    public void setVendIdConf(String vendIdConf) {
        this.vendIdConf = vendIdConf;
    }

    public Character getWelcomeLtrStat() {
        return welcomeLtrStat;
    }

    public void setWelcomeLtrStat(Character welcomeLtrStat) {
        this.welcomeLtrStat = welcomeLtrStat;
    }

    public Date getWelcomeLtrStatDt() {
        return welcomeLtrStatDt;
    }

    public void setWelcomeLtrStatDt(Date welcomeLtrStatDt) {
        this.welcomeLtrStatDt = welcomeLtrStatDt;
    }

    public long getProjAnnSpnd() {
        return projAnnSpnd;
    }

    public void setProjAnnSpnd(long projAnnSpnd) {
        this.projAnnSpnd = projAnnSpnd;
    }

    public Date getAcctVerAmtDt() {
        return acctVerAmtDt;
    }

    public void setAcctVerAmtDt(Date acctVerAmtDt) {
        this.acctVerAmtDt = acctVerAmtDt;
    }

    public String getMisc1() {
        return misc1;
    }

    public void setMisc1(String misc1) {
        this.misc1 = misc1;
    }

    public String getMisc2() {
        return misc2;
    }

    public void setMisc2(String misc2) {
        this.misc2 = misc2;
    }

    public String getMisc3() {
        return misc3;
    }

    public void setMisc3(String misc3) {
        this.misc3 = misc3;
    }

    public String getMisc4() {
        return misc4;
    }

    public void setMisc4(String misc4) {
        this.misc4 = misc4;
    }

    public String getDeclineReason() {
        return declineReason;
    }

    public void setDeclineReason(String declineReason) {
        this.declineReason = declineReason;
    }

    public short getDeclineInterchange() {
        return declineInterchange;
    }

    public void setDeclineInterchange(short declineInterchange) {
        this.declineInterchange = declineInterchange;
    }

    public Date getDeclineDt() {
        return declineDt;
    }

    public void setDeclineDt(Date declineDt) {
        this.declineDt = declineDt;
    }

    public String getCampNbr() {
        return campNbr;
    }

    public void setCampNbr(String campNbr) {
        this.campNbr = campNbr;
    }

    public String getCampName() {
        return campName;
    }

    public void setCampName(String campName) {
        this.campName = campName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public String getCustGrpId() {
        return custGrpId;
    }

    public void setCustGrpId(String custGrpId) {
        this.custGrpId = custGrpId;
    }

    public String getVendEnrollNbr() {
        return vendEnrollNbr;
    }

    public void setVendEnrollNbr(String vendEnrollNbr) {
        this.vendEnrollNbr = vendEnrollNbr;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getRemitEmail() {
        return remitEmail;
    }

    public void setRemitEmail(String remitEmail) {
        this.remitEmail = remitEmail;
    }

    public String getSrvCenterCd() {
        return srvCenterCd;
    }

    public void setSrvCenterCd(String srvCenterCd) {
        this.srvCenterCd = srvCenterCd;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getDbNbr() {
        return dbNbr;
    }

    public void setDbNbr(String dbNbr) {
        this.dbNbr = dbNbr;
    }

    public String getCustGrpNm() {
        return custGrpNm;
    }

    public void setCustGrpNm(String custGrpNm) {
        this.custGrpNm = custGrpNm;
    }

    public String getFaxNbr() {
        return faxNbr;
    }

    public void setFaxNbr(String faxNbr) {
        this.faxNbr = faxNbr;
    }

    public Character getMatchCd() {
        return matchCd;
    }

    public void setMatchCd(Character matchCd) {
        this.matchCd = matchCd;
    }

    public String getRemitInstructions() {
        return remitInstructions;
    }

    public void setRemitInstructions(String remitInstructions) {
        this.remitInstructions = remitInstructions;
    }

    public Character getRdyForCamp() {
        return rdyForCamp;
    }

    public void setRdyForCamp(Character rdyForCamp) {
        this.rdyForCamp = rdyForCamp;
    }

    public int getOvrdTrnsNbr() {
        return ovrdTrnsNbr;
    }

    public void setOvrdTrnsNbr(int ovrdTrnsNbr) {
        this.ovrdTrnsNbr = ovrdTrnsNbr;
    }

    public Character getOvrdExactAmtFlg() {
        return ovrdExactAmtFlg;
    }

    public void setOvrdExactAmtFlg(Character ovrdExactAmtFlg) {
        this.ovrdExactAmtFlg = ovrdExactAmtFlg;
    }

    public Character getOvrdCrtVcByFlg() {
        return ovrdCrtVcByFlg;
    }

    public void setOvrdCrtVcByFlg(Character ovrdCrtVcByFlg) {
        this.ovrdCrtVcByFlg = ovrdCrtVcByFlg;
    }

    public Character getOvrdByrStup() {
        return ovrdByrStup;
    }

    public void setOvrdByrStup(Character ovrdByrStup) {
        this.ovrdByrStup = ovrdByrStup;
    }

    public String getSrcVndrTxt() {
        return srcVndrTxt;
    }

    public void setSrcVndrTxt(String srcVndrTxt) {
        this.srcVndrTxt = srcVndrTxt;
    }

    public String getEnrldUsrId() {
        return enrldUsrId;
    }

    public void setEnrldUsrId(String enrldUsrId) {
        this.enrldUsrId = enrldUsrId;
    }

    public Date getFstPmtTs() {
        return fstPmtTs;
    }

    public void setFstPmtTs(Date fstPmtTs) {
        this.fstPmtTs = fstPmtTs;
    }

    public Date getLstPmtTs() {
        return lstPmtTs;
    }

    public void setLstPmtTs(Date lstPmtTs) {
        this.lstPmtTs = lstPmtTs;
    }

    public String getReseller() {
        return reseller;
    }

    public void setReseller(String reseller) {
        this.reseller = reseller;
    }

    public String getCustVendActNbr() {
        return custVendActNbr;
    }

    public void setCustVendActNbr(String custVendActNbr) {
        this.custVendActNbr = custVendActNbr;
    }

    public String getSfVndrRlshpUid() {
        return sfVndrRlshpUid;
    }

    public void setSfVndrRlshpUid(String sfVndrRlshpUid) {
        this.sfVndrRlshpUid = sfVndrRlshpUid;
    }

    public String getStatRsnCd() {
        return statRsnCd;
    }

    public void setStatRsnCd(String statRsnCd) {
        this.statRsnCd = statRsnCd;
    }

    public Character getExcldFromLostOpptyFlg() {
        return excldFromLostOpptyFlg;
    }

    public void setExcldFromLostOpptyFlg(Character excldFromLostOpptyFlg) {
        this.excldFromLostOpptyFlg = excldFromLostOpptyFlg;
    }

    public Date getEmailChgTs() {
        return emailChgTs;
    }

    public void setEmailChgTs(Date emailChgTs) {
        this.emailChgTs = emailChgTs;
    }

    public String getLmtnsTxt() {
        return lmtnsTxt;
    }

    public void setLmtnsTxt(String lmtnsTxt) {
        this.lmtnsTxt = lmtnsTxt;
    }

    public String getFeesTxt() {
        return feesTxt;
    }

    public void setFeesTxt(String feesTxt) {
        this.feesTxt = feesTxt;
    }

    public String getVp3rdPartyId() {
        return vp3rdPartyId;
    }

    public void setVp3rdPartyId(String vp3rdPartyId) {
        this.vp3rdPartyId = vp3rdPartyId;
    }

    public String getActnRqdTypCd() {
        return actnRqdTypCd;
    }

    public void setActnRqdTypCd(String actnRqdTypCd) {
        this.actnRqdTypCd = actnRqdTypCd;
    }

    public String getMtchdUsr() {
        return mtchdUsr;
    }

    public void setMtchdUsr(String mtchdUsr) {
        this.mtchdUsr = mtchdUsr;
    }

    public Date getMtchdTs() {
        return mtchdTs;
    }

    public void setMtchdTs(Date mtchdTs) {
        this.mtchdTs = mtchdTs;
    }

    public String getCcEmail() {
        return ccEmail;
    }

    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail;
    }

    public Date getLstPmtPstdTs() {
        return lstPmtPstdTs;
    }

    public void setLstPmtPstdTs(Date lstPmtPstdTs) {
        this.lstPmtPstdTs = lstPmtPstdTs;
    }

    public String getCustPinAtVndr() {
        return custPinAtVndr;
    }

    public void setCustPinAtVndr(String custPinAtVndr) {
        this.custPinAtVndr = custPinAtVndr;
    }

    public String getCustTaxIdLast4() {
        return custTaxIdLast4;
    }

    public void setCustTaxIdLast4(String custTaxIdLast4) {
        this.custTaxIdLast4 = custTaxIdLast4;
    }

    public String getRecStageCd() {
        return recStageCd;
    }

    public void setRecStageCd(String recStageCd) {
        this.recStageCd = recStageCd;
    }

    public Character getAltBinFlg() {
        return altBinFlg;
    }

    public void setAltBinFlg(Character altBinFlg) {
        this.altBinFlg = altBinFlg;
    }

    public Character getOvrdVmPmtMthdCd() {
        return ovrdVmPmtMthdCd;
    }

    public void setOvrdVmPmtMthdCd(Character ovrdVmPmtMthdCd) {
        this.ovrdVmPmtMthdCd = ovrdVmPmtMthdCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpCvMastPK != null ? vpCvMastPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpCvMast)) {
            return false;
        }
        VpCvMast other = (VpCvMast) object;
        if ((this.vpCvMastPK == null && other.vpCvMastPK != null) || (this.vpCvMastPK != null && !this.vpCvMastPK.equals(other.vpCvMastPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCvMast[ vpCvMastPK=" + vpCvMastPK + " ]";
    }
    
}
