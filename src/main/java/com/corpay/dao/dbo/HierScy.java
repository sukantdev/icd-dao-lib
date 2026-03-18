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
@Table(name = "HIER_SCY", catalog = "", schema = "DBO")
public class HierScy implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierScyPK hierScyPK;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;
    @Basic(optional = false)
    @Column(name = "CD_WORD")
    private String cdWord;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private Character statCd;
    @Basic(optional = false)
    @Column(name = "USR_ADMN_AUTH_FLG")
    private Character usrAdmnAuthFlg;
    @Basic(optional = false)
    @Column(name = "CD_WORD_MNT_FLG")
    private Character cdWordMntFlg;
    @Basic(optional = false)
    @Column(name = "MAINT_FLG")
    private Character maintFlg;
    @Basic(optional = false)
    @Column(name = "INQRY_FLG")
    private Character inqryFlg;
    @Basic(optional = false)
    @Column(name = "ADMIN_FLG")
    private Character adminFlg;
    @Basic(optional = false)
    @Column(name = "MAX_SNDNG_AMT")
    private int maxSndngAmt;
    @Basic(optional = false)
    @Column(name = "LST_ACT_DT")
    @Temporal(TemporalType.DATE)
    private Date lstActDt;
    @Basic(optional = false)
    @Column(name = "LST_ACT_TM")
    @Temporal(TemporalType.TIME)
    private Date lstActTm;

    @Basic(optional = false)
    @Column(name = "CUR_DAY_XMIT_AMT")
    private BigDecimal curDayXmitAmt;
    @Basic(optional = false)
    @Column(name = "YTD_XMIT_AMT")
    private BigDecimal ytdXmitAmt;
    @Basic(optional = false)
    @Column(name = "CUR_DAY_CNT")
    private int curDayCnt;
    @Basic(optional = false)
    @Column(name = "YTD_CNT")
    private int ytdCnt;
    @Basic(optional = false)
    @Column(name = "MAX_DLY_AMT")
    private int maxDlyAmt;
    @Basic(optional = false)
    @Column(name = "DLY_LD_MAX_AMT")
    private int dlyLdMaxAmt;
    @Basic(optional = false)
    @Column(name = "CODE_ISNC_FLG")
    private Character codeIsncFlg;
    @Basic(optional = false)
    @Column(name = "INV_RTRVL_FLG")
    private Character invRtrvlFlg;
    @Basic(optional = false)
    @Column(name = "EXPCHK_TRNSLMT_AMT")
    private int expchkTrnslmtAmt;
    @Basic(optional = false)
    @Column(name = "EXPCHK_DLY_LMT_AMT")
    private int expchkDlyLmtAmt;
    @Basic(optional = false)
    @Column(name = "EXPCHK_DLYUSED_AMT")
    private int expchkDlyusedAmt;
    @Basic(optional = false)
    @Column(name = "EXPCHK_DLY_DT")
    @Temporal(TemporalType.DATE)
    private Date expchkDlyDt;
    @Basic(optional = false)
    @Column(name = "COMVOY_FLG")
    private Character comvoyFlg;
    @Basic(optional = false)
    @Column(name = "EMP_NBR_FLG")
    private Character empNbrFlg;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR_FLG")
    private Character unitNbrFlg;
    @Basic(optional = false)
    @Column(name = "CRD_STAT_FLG")
    private Character crdStatFlg;
    @Basic(optional = false)
    @Column(name = "DRV_NM")
    private Character drvNm;
    @Basic(optional = false)
    @Column(name = "TRL_NBR_FLG")
    private Character trlNbrFlg;
    @Basic(optional = false)
    @Column(name = "CRD_TRIP_NBR_FLG")
    private Character crdTripNbrFlg;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_FLG")
    private Character drvLicFlg;
    @Basic(optional = false)
    @Column(name = "COMP_STAND_FLG")
    private Character compStandFlg;
    @Basic(optional = false)
    @Column(name = "CSH_LMT_AMT")
    private BigDecimal cshLmtAmt;
    @Basic(optional = false)
    @Column(name = "CSH_RESET_FLG")
    private Character cshResetFlg;
    @Basic(optional = false)
    @Column(name = "PCHS_LMT_AMT")
    private BigDecimal pchsLmtAmt;
    @Basic(optional = false)
    @Column(name = "PCHS_LMT_RESET_FLG")
    private Character pchsLmtResetFlg;
    @Basic(optional = false)
    @Column(name = "ONE_TM_CASH_AMT")
    private BigDecimal oneTmCashAmt;
    @Basic(optional = false)
    @Column(name = "ONE_TM_PCHS_AMT")
    private BigDecimal oneTmPchsAmt;
    @Basic(optional = false)
    @Column(name = "EXP_CSH_FLG")
    private Character expCshFlg;
    @Basic(optional = false)
    @Column(name = "PH_FLG")
    private Character phFlg;
    @Basic(optional = false)
    @Column(name = "FL_FLG")
    private Character flFlg;
    @Basic(optional = false)
    @Column(name = "VM_FLG")
    private Character vmFlg;
    @Basic(optional = false)
    @Column(name = "PH_OPTN_FLG")
    private Character phOptnFlg;
    @Basic(optional = false)
    @Column(name = "PH_MAX_CALLS_AMT")
    private short phMaxCallsAmt;
    @Basic(optional = false)
    @Column(name = "PH_DLR_LMT_AMT")
    private int phDlrLmtAmt;
    @Basic(optional = false)
    @Column(name = "FMUN_MOVE_FLG")
    private Character fmunMoveFlg;
    @Basic(optional = false)
    @Column(name = "LMT_NTWK_CRD_FLG")
    private Character lmtNtwkCrdFlg;
    @Basic(optional = false)
    @Column(name = "ATM_ACS_FLG")
    private Character atmAcsFlg;
    @Basic(optional = false)
    @Column(name = "PRMY_CRD_FLG")
    private Character prmyCrdFlg;
    @Basic(optional = false)
    @Column(name = "FL_OFFNET_FLG")
    private Character flOffnetFlg;
    @Basic(optional = false)
    @Column(name = "PIN_RESET_FLG")
    private Character pinResetFlg;
    @Basic(optional = false)
    @Column(name = "PIN_ACS_FLG")
    private Character pinAcsFlg;
    @Basic(optional = false)
    @Column(name = "CSH_PER_QTY_FLG")
    private Character cshPerQtyFlg;
    @Basic(optional = false)
    @Column(name = "ALW_CSH_OFFNET_FLG")
    private Character alwCshOffnetFlg;
    @Basic(optional = false)
    @Column(name = "IGN_2HR_CHK_FLG")
    private Character ign2hrChkFlg;
    @Basic(optional = false)
    @Column(name = "NEW_CRD_REQ_FLG")
    private Character newCrdReqFlg;
    @Basic(optional = false)
    @Column(name = "OFF_HRR_FLG")
    private Character offHrrFlg;
    @Basic(optional = false)
    @Column(name = "DRV_VEH_INFO_FLG")
    private Character drvVehInfoFlg;
    @Basic(optional = false)
    @Column(name = "DRV_GRPS_FLG")
    private Character drvGrpsFlg;
    @Basic(optional = false)
    @Column(name = "ADDR_UPD_FLG")
    private Character addrUpdFlg;
    @Basic(optional = false)
    @Column(name = "OPTN_UPD_FLG")
    private Character optnUpdFlg;
    @Basic(optional = false)
    @Column(name = "FLT_OPTN_UPD_FLG")
    private Character fltOptnUpdFlg;
    @Basic(optional = false)
    @Column(name = "CRD_PRD_FLG")
    private Character crdPrdFlg;
    @Basic(optional = false)
    @Column(name = "PNCH_FLG")
    private Character pnchFlg;
    @Basic(optional = false)
    @Column(name = "MCC_OPEN_FLG")
    private Character mccOpenFlg;
    @Basic(optional = false)
    @Column(name = "ICD_RPT_FLG")
    private Character icdRptFlg;
    @Basic(optional = false)
    @Column(name = "FLT_PRE_AMT")
    private BigDecimal fltPreAmt;
    @Basic(optional = false)
    @Column(name = "XTN_LMT")
    private BigDecimal xtnLmt;
    @Basic(optional = false)
    @Column(name = "XTN_QTY")
    private int xtnQty;
    @Basic(optional = false)
    @Column(name = "DAY_XTNS_NBR")
    private int dayXtnsNbr;
    @Basic(optional = false)
    @Column(name = "DAY_LMT")
    private BigDecimal dayLmt;
    @Basic(optional = false)
    @Column(name = "DAY_QTY")
    private int dayQty;
    @Basic(optional = false)
    @Column(name = "CYC_XTNS_NBR")
    private int cycXtnsNbr;
    @Basic(optional = false)
    @Column(name = "CYC_LMT")
    private BigDecimal cycLmt;
    @Basic(optional = false)
    @Column(name = "CYC_QTY")
    private int cycQty;
    @Basic(optional = false)
    @Column(name = "POO_LMT")
    private BigDecimal pooLmt;
    @Basic(optional = false)
    @Column(name = "POO_QTY")
    private int pooQty;
    @Basic(optional = false)
    @Column(name = "DLY_PURCH_LMT")
    private BigDecimal dlyPurchLmt;
    @Basic(optional = false)
    @Column(name = "OVRG_PCT")
    private BigDecimal ovrgPct;
    @Basic(optional = false)
    @Column(name = "TRIP_ALWN_AMT")
    private BigDecimal tripAlwnAmt;
    @Basic(optional = false)
    @Column(name = "FL_TRIP_NBR_FLG")
    private Character flTripNbrFlg;
    @Basic(optional = false)
    @Column(name = "DLY_CSH_LMT")
    private BigDecimal dlyCshLmt;
    @Basic(optional = false)
    @Column(name = "TTL_CSH_AMT")
    private BigDecimal ttlCshAmt;
    @Basic(optional = false)
    @Column(name = "CSH_RNWL_FLG")
    private Character cshRnwlFlg;
    @Basic(optional = false)
    @Column(name = "HUBOMETER_FLG")
    private Character hubometerFlg;
    @Basic(optional = false)
    @Column(name = "FL_STAT_FLG")
    private Character flStatFlg;
    @Basic(optional = false)
    @Column(name = "MSG_FLG")
    private Character msgFlg;
    @Basic(optional = false)
    @Column(name = "FL_PRD_FLG")
    private Character flPrdFlg;
    @Basic(optional = false)
    @Column(name = "PO_MAINT_SCY_FLG")
    private Character poMaintScyFlg;
    @Basic(optional = false)
    @Column(name = "PO_MAX_AMT")
    private BigDecimal poMaxAmt;
    @Basic(optional = false)
    @Column(name = "TRL_MAINT_SCY_FLG")
    private Character trlMaintScyFlg;
    @Basic(optional = false)
    @Column(name = "RLSHP_MNT_SCY_FLG")
    private Character rlshpMntScyFlg;
    @Basic(optional = false)
    @Column(name = "LIM_NETW_OPEN_FLG")
    private Character limNetwOpenFlg;
    @Basic(optional = false)
    @Column(name = "LIM_NETW_CLOSE_FLG")
    private Character limNetwCloseFlg;
    @Basic(optional = false)
    @Column(name = "LIM_NETW_1TM_FLG")
    private Character limNetw1tmFlg;
    @Basic(optional = false)
    @Column(name = "VF_MAIL_LMT")
    private BigDecimal vfMailLmt;
    @Basic(optional = false)
    @Column(name = "VF_MAIL_RST_FLG")
    private Character vfMailRstFlg;
    @Basic(optional = false)
    @Column(name = "CUST_OPTN_UPD_FLG")
    private Character custOptnUpdFlg;
    @Basic(optional = false)
    @Column(name = "SPCL_INSTRCTNS")
    private String spclInstrctns;
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
    @Column(name = "CRD_ADD_FLG")
    private Character crdAddFlg;
    @Basic(optional = false)
    @Column(name = "CRD_ADD_QTY")
    private int crdAddQty;
    @Basic(optional = false)
    @Column(name = "RFID_MAINT_FLG")
    private Character rfidMaintFlg;
    @Basic(optional = false)
    @Column(name = "GHST_CRD_FLG")
    private Character ghstCrdFlg;
    @Basic(optional = false)
    @Column(name = "CRD_HLDR_ID_FLG")
    private Character crdHldrIdFlg;

    public HierScy() {
    }

    public HierScy(HierScyPK hierScyPK) {
        this.hierScyPK = hierScyPK;
    }

    public HierScy(HierScyPK hierScyPK, String acctCd, String usrId, String hierId, String custId, String nodeId, String cdWord, Character statCd, Character usrAdmnAuthFlg, Character cdWordMntFlg, Character maintFlg, Character inqryFlg, Character adminFlg, int maxSndngAmt, Date lstActDt, Date lstActTm, BigDecimal curDayXmitAmt, BigDecimal ytdXmitAmt, int curDayCnt, int ytdCnt, int maxDlyAmt, int dlyLdMaxAmt, Character codeIsncFlg, Character invRtrvlFlg, int expchkTrnslmtAmt, int expchkDlyLmtAmt, int expchkDlyusedAmt, Date expchkDlyDt, Character comvoyFlg, Character empNbrFlg, Character unitNbrFlg, Character crdStatFlg, Character drvNm, Character trlNbrFlg, Character crdTripNbrFlg, Character drvLicFlg, Character compStandFlg, BigDecimal cshLmtAmt, Character cshResetFlg, BigDecimal pchsLmtAmt, Character pchsLmtResetFlg, BigDecimal oneTmCashAmt, BigDecimal oneTmPchsAmt, Character expCshFlg, Character phFlg, Character flFlg, Character vmFlg, Character phOptnFlg, short phMaxCallsAmt, int phDlrLmtAmt, Character fmunMoveFlg, Character lmtNtwkCrdFlg, Character atmAcsFlg, Character prmyCrdFlg, Character flOffnetFlg, Character pinResetFlg, Character pinAcsFlg, Character cshPerQtyFlg, Character alwCshOffnetFlg, Character ign2hrChkFlg, Character newCrdReqFlg, Character offHrrFlg, Character drvVehInfoFlg, Character drvGrpsFlg, Character addrUpdFlg, Character optnUpdFlg, Character fltOptnUpdFlg, Character crdPrdFlg, Character pnchFlg, Character mccOpenFlg, Character icdRptFlg, BigDecimal fltPreAmt, BigDecimal xtnLmt, int xtnQty, int dayXtnsNbr, BigDecimal dayLmt, int dayQty, int cycXtnsNbr, BigDecimal cycLmt, int cycQty, BigDecimal pooLmt, int pooQty, BigDecimal dlyPurchLmt, BigDecimal ovrgPct, BigDecimal tripAlwnAmt, Character flTripNbrFlg, BigDecimal dlyCshLmt, BigDecimal ttlCshAmt, Character cshRnwlFlg, Character hubometerFlg, Character flStatFlg, Character msgFlg, Character flPrdFlg, Character poMaintScyFlg, BigDecimal poMaxAmt, Character trlMaintScyFlg, Character rlshpMntScyFlg, Character limNetwOpenFlg, Character limNetwCloseFlg, Character limNetw1tmFlg, BigDecimal vfMailLmt, Character vfMailRstFlg, Character custOptnUpdFlg, String spclInstrctns, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character crdAddFlg, int crdAddQty, Character rfidMaintFlg, Character ghstCrdFlg, Character crdHldrIdFlg) {
        this.hierScyPK = hierScyPK;
        this.acctCd = acctCd;
        this.usrId = usrId;
        this.hierId = hierId;
        this.custId = custId;
        this.nodeId = nodeId;
        this.cdWord = cdWord;
        this.statCd = statCd;
        this.usrAdmnAuthFlg = usrAdmnAuthFlg;
        this.cdWordMntFlg = cdWordMntFlg;
        this.maintFlg = maintFlg;
        this.inqryFlg = inqryFlg;
        this.adminFlg = adminFlg;
        this.maxSndngAmt = maxSndngAmt;
        this.lstActDt = lstActDt;
        this.lstActTm = lstActTm;
        this.curDayXmitAmt = curDayXmitAmt;
        this.ytdXmitAmt = ytdXmitAmt;
        this.curDayCnt = curDayCnt;
        this.ytdCnt = ytdCnt;
        this.maxDlyAmt = maxDlyAmt;
        this.dlyLdMaxAmt = dlyLdMaxAmt;
        this.codeIsncFlg = codeIsncFlg;
        this.invRtrvlFlg = invRtrvlFlg;
        this.expchkTrnslmtAmt = expchkTrnslmtAmt;
        this.expchkDlyLmtAmt = expchkDlyLmtAmt;
        this.expchkDlyusedAmt = expchkDlyusedAmt;
        this.expchkDlyDt = expchkDlyDt;
        this.comvoyFlg = comvoyFlg;
        this.empNbrFlg = empNbrFlg;
        this.unitNbrFlg = unitNbrFlg;
        this.crdStatFlg = crdStatFlg;
        this.drvNm = drvNm;
        this.trlNbrFlg = trlNbrFlg;
        this.crdTripNbrFlg = crdTripNbrFlg;
        this.drvLicFlg = drvLicFlg;
        this.compStandFlg = compStandFlg;
        this.cshLmtAmt = cshLmtAmt;
        this.cshResetFlg = cshResetFlg;
        this.pchsLmtAmt = pchsLmtAmt;
        this.pchsLmtResetFlg = pchsLmtResetFlg;
        this.oneTmCashAmt = oneTmCashAmt;
        this.oneTmPchsAmt = oneTmPchsAmt;
        this.expCshFlg = expCshFlg;
        this.phFlg = phFlg;
        this.flFlg = flFlg;
        this.vmFlg = vmFlg;
        this.phOptnFlg = phOptnFlg;
        this.phMaxCallsAmt = phMaxCallsAmt;
        this.phDlrLmtAmt = phDlrLmtAmt;
        this.fmunMoveFlg = fmunMoveFlg;
        this.lmtNtwkCrdFlg = lmtNtwkCrdFlg;
        this.atmAcsFlg = atmAcsFlg;
        this.prmyCrdFlg = prmyCrdFlg;
        this.flOffnetFlg = flOffnetFlg;
        this.pinResetFlg = pinResetFlg;
        this.pinAcsFlg = pinAcsFlg;
        this.cshPerQtyFlg = cshPerQtyFlg;
        this.alwCshOffnetFlg = alwCshOffnetFlg;
        this.ign2hrChkFlg = ign2hrChkFlg;
        this.newCrdReqFlg = newCrdReqFlg;
        this.offHrrFlg = offHrrFlg;
        this.drvVehInfoFlg = drvVehInfoFlg;
        this.drvGrpsFlg = drvGrpsFlg;
        this.addrUpdFlg = addrUpdFlg;
        this.optnUpdFlg = optnUpdFlg;
        this.fltOptnUpdFlg = fltOptnUpdFlg;
        this.crdPrdFlg = crdPrdFlg;
        this.pnchFlg = pnchFlg;
        this.mccOpenFlg = mccOpenFlg;
        this.icdRptFlg = icdRptFlg;
        this.fltPreAmt = fltPreAmt;
        this.xtnLmt = xtnLmt;
        this.xtnQty = xtnQty;
        this.dayXtnsNbr = dayXtnsNbr;
        this.dayLmt = dayLmt;
        this.dayQty = dayQty;
        this.cycXtnsNbr = cycXtnsNbr;
        this.cycLmt = cycLmt;
        this.cycQty = cycQty;
        this.pooLmt = pooLmt;
        this.pooQty = pooQty;
        this.dlyPurchLmt = dlyPurchLmt;
        this.ovrgPct = ovrgPct;
        this.tripAlwnAmt = tripAlwnAmt;
        this.flTripNbrFlg = flTripNbrFlg;
        this.dlyCshLmt = dlyCshLmt;
        this.ttlCshAmt = ttlCshAmt;
        this.cshRnwlFlg = cshRnwlFlg;
        this.hubometerFlg = hubometerFlg;
        this.flStatFlg = flStatFlg;
        this.msgFlg = msgFlg;
        this.flPrdFlg = flPrdFlg;
        this.poMaintScyFlg = poMaintScyFlg;
        this.poMaxAmt = poMaxAmt;
        this.trlMaintScyFlg = trlMaintScyFlg;
        this.rlshpMntScyFlg = rlshpMntScyFlg;
        this.limNetwOpenFlg = limNetwOpenFlg;
        this.limNetwCloseFlg = limNetwCloseFlg;
        this.limNetw1tmFlg = limNetw1tmFlg;
        this.vfMailLmt = vfMailLmt;
        this.vfMailRstFlg = vfMailRstFlg;
        this.custOptnUpdFlg = custOptnUpdFlg;
        this.spclInstrctns = spclInstrctns;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crdAddFlg = crdAddFlg;
        this.crdAddQty = crdAddQty;
        this.rfidMaintFlg = rfidMaintFlg;
        this.ghstCrdFlg = ghstCrdFlg;
        this.crdHldrIdFlg = crdHldrIdFlg;
    }

    public HierScy(Character scyTpCd, String scyKey) {
        this.hierScyPK = new HierScyPK(scyTpCd, scyKey);
    }

    public HierScyPK getHierScyPK() {
        return hierScyPK;
    }

    public void setHierScyPK(HierScyPK hierScyPK) {
        this.hierScyPK = hierScyPK;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getCdWord() {
        return cdWord;
    }

    public void setCdWord(String cdWord) {
        this.cdWord = cdWord;
    }

    public Character getStatCd() {
        return statCd;
    }

    public void setStatCd(Character statCd) {
        this.statCd = statCd;
    }

    public Character getUsrAdmnAuthFlg() {
        return usrAdmnAuthFlg;
    }

    public void setUsrAdmnAuthFlg(Character usrAdmnAuthFlg) {
        this.usrAdmnAuthFlg = usrAdmnAuthFlg;
    }

    public Character getCdWordMntFlg() {
        return cdWordMntFlg;
    }

    public void setCdWordMntFlg(Character cdWordMntFlg) {
        this.cdWordMntFlg = cdWordMntFlg;
    }

    public Character getMaintFlg() {
        return maintFlg;
    }

    public void setMaintFlg(Character maintFlg) {
        this.maintFlg = maintFlg;
    }

    public Character getInqryFlg() {
        return inqryFlg;
    }

    public void setInqryFlg(Character inqryFlg) {
        this.inqryFlg = inqryFlg;
    }

    public Character getAdminFlg() {
        return adminFlg;
    }

    public void setAdminFlg(Character adminFlg) {
        this.adminFlg = adminFlg;
    }

    public int getMaxSndngAmt() {
        return maxSndngAmt;
    }

    public void setMaxSndngAmt(int maxSndngAmt) {
        this.maxSndngAmt = maxSndngAmt;
    }

    public Date getLstActDt() {
        return lstActDt;
    }

    public void setLstActDt(Date lstActDt) {
        this.lstActDt = lstActDt;
    }

    public Date getLstActTm() {
        return lstActTm;
    }

    public void setLstActTm(Date lstActTm) {
        this.lstActTm = lstActTm;
    }

    public BigDecimal getCurDayXmitAmt() {
        return curDayXmitAmt;
    }

    public void setCurDayXmitAmt(BigDecimal curDayXmitAmt) {
        this.curDayXmitAmt = curDayXmitAmt;
    }

    public BigDecimal getYtdXmitAmt() {
        return ytdXmitAmt;
    }

    public void setYtdXmitAmt(BigDecimal ytdXmitAmt) {
        this.ytdXmitAmt = ytdXmitAmt;
    }

    public int getCurDayCnt() {
        return curDayCnt;
    }

    public void setCurDayCnt(int curDayCnt) {
        this.curDayCnt = curDayCnt;
    }

    public int getYtdCnt() {
        return ytdCnt;
    }

    public void setYtdCnt(int ytdCnt) {
        this.ytdCnt = ytdCnt;
    }

    public int getMaxDlyAmt() {
        return maxDlyAmt;
    }

    public void setMaxDlyAmt(int maxDlyAmt) {
        this.maxDlyAmt = maxDlyAmt;
    }

    public int getDlyLdMaxAmt() {
        return dlyLdMaxAmt;
    }

    public void setDlyLdMaxAmt(int dlyLdMaxAmt) {
        this.dlyLdMaxAmt = dlyLdMaxAmt;
    }

    public Character getCodeIsncFlg() {
        return codeIsncFlg;
    }

    public void setCodeIsncFlg(Character codeIsncFlg) {
        this.codeIsncFlg = codeIsncFlg;
    }

    public Character getInvRtrvlFlg() {
        return invRtrvlFlg;
    }

    public void setInvRtrvlFlg(Character invRtrvlFlg) {
        this.invRtrvlFlg = invRtrvlFlg;
    }

    public int getExpchkTrnslmtAmt() {
        return expchkTrnslmtAmt;
    }

    public void setExpchkTrnslmtAmt(int expchkTrnslmtAmt) {
        this.expchkTrnslmtAmt = expchkTrnslmtAmt;
    }

    public int getExpchkDlyLmtAmt() {
        return expchkDlyLmtAmt;
    }

    public void setExpchkDlyLmtAmt(int expchkDlyLmtAmt) {
        this.expchkDlyLmtAmt = expchkDlyLmtAmt;
    }

    public int getExpchkDlyusedAmt() {
        return expchkDlyusedAmt;
    }

    public void setExpchkDlyusedAmt(int expchkDlyusedAmt) {
        this.expchkDlyusedAmt = expchkDlyusedAmt;
    }

    public Date getExpchkDlyDt() {
        return expchkDlyDt;
    }

    public void setExpchkDlyDt(Date expchkDlyDt) {
        this.expchkDlyDt = expchkDlyDt;
    }

    public Character getComvoyFlg() {
        return comvoyFlg;
    }

    public void setComvoyFlg(Character comvoyFlg) {
        this.comvoyFlg = comvoyFlg;
    }

    public Character getEmpNbrFlg() {
        return empNbrFlg;
    }

    public void setEmpNbrFlg(Character empNbrFlg) {
        this.empNbrFlg = empNbrFlg;
    }

    public Character getUnitNbrFlg() {
        return unitNbrFlg;
    }

    public void setUnitNbrFlg(Character unitNbrFlg) {
        this.unitNbrFlg = unitNbrFlg;
    }

    public Character getCrdStatFlg() {
        return crdStatFlg;
    }

    public void setCrdStatFlg(Character crdStatFlg) {
        this.crdStatFlg = crdStatFlg;
    }

    public Character getDrvNm() {
        return drvNm;
    }

    public void setDrvNm(Character drvNm) {
        this.drvNm = drvNm;
    }

    public Character getTrlNbrFlg() {
        return trlNbrFlg;
    }

    public void setTrlNbrFlg(Character trlNbrFlg) {
        this.trlNbrFlg = trlNbrFlg;
    }

    public Character getCrdTripNbrFlg() {
        return crdTripNbrFlg;
    }

    public void setCrdTripNbrFlg(Character crdTripNbrFlg) {
        this.crdTripNbrFlg = crdTripNbrFlg;
    }

    public Character getDrvLicFlg() {
        return drvLicFlg;
    }

    public void setDrvLicFlg(Character drvLicFlg) {
        this.drvLicFlg = drvLicFlg;
    }

    public Character getCompStandFlg() {
        return compStandFlg;
    }

    public void setCompStandFlg(Character compStandFlg) {
        this.compStandFlg = compStandFlg;
    }

    public BigDecimal getCshLmtAmt() {
        return cshLmtAmt;
    }

    public void setCshLmtAmt(BigDecimal cshLmtAmt) {
        this.cshLmtAmt = cshLmtAmt;
    }

    public Character getCshResetFlg() {
        return cshResetFlg;
    }

    public void setCshResetFlg(Character cshResetFlg) {
        this.cshResetFlg = cshResetFlg;
    }

    public BigDecimal getPchsLmtAmt() {
        return pchsLmtAmt;
    }

    public void setPchsLmtAmt(BigDecimal pchsLmtAmt) {
        this.pchsLmtAmt = pchsLmtAmt;
    }

    public Character getPchsLmtResetFlg() {
        return pchsLmtResetFlg;
    }

    public void setPchsLmtResetFlg(Character pchsLmtResetFlg) {
        this.pchsLmtResetFlg = pchsLmtResetFlg;
    }

    public BigDecimal getOneTmCashAmt() {
        return oneTmCashAmt;
    }

    public void setOneTmCashAmt(BigDecimal oneTmCashAmt) {
        this.oneTmCashAmt = oneTmCashAmt;
    }

    public BigDecimal getOneTmPchsAmt() {
        return oneTmPchsAmt;
    }

    public void setOneTmPchsAmt(BigDecimal oneTmPchsAmt) {
        this.oneTmPchsAmt = oneTmPchsAmt;
    }

    public Character getExpCshFlg() {
        return expCshFlg;
    }

    public void setExpCshFlg(Character expCshFlg) {
        this.expCshFlg = expCshFlg;
    }

    public Character getPhFlg() {
        return phFlg;
    }

    public void setPhFlg(Character phFlg) {
        this.phFlg = phFlg;
    }

    public Character getFlFlg() {
        return flFlg;
    }

    public void setFlFlg(Character flFlg) {
        this.flFlg = flFlg;
    }

    public Character getVmFlg() {
        return vmFlg;
    }

    public void setVmFlg(Character vmFlg) {
        this.vmFlg = vmFlg;
    }

    public Character getPhOptnFlg() {
        return phOptnFlg;
    }

    public void setPhOptnFlg(Character phOptnFlg) {
        this.phOptnFlg = phOptnFlg;
    }

    public short getPhMaxCallsAmt() {
        return phMaxCallsAmt;
    }

    public void setPhMaxCallsAmt(short phMaxCallsAmt) {
        this.phMaxCallsAmt = phMaxCallsAmt;
    }

    public int getPhDlrLmtAmt() {
        return phDlrLmtAmt;
    }

    public void setPhDlrLmtAmt(int phDlrLmtAmt) {
        this.phDlrLmtAmt = phDlrLmtAmt;
    }

    public Character getFmunMoveFlg() {
        return fmunMoveFlg;
    }

    public void setFmunMoveFlg(Character fmunMoveFlg) {
        this.fmunMoveFlg = fmunMoveFlg;
    }

    public Character getLmtNtwkCrdFlg() {
        return lmtNtwkCrdFlg;
    }

    public void setLmtNtwkCrdFlg(Character lmtNtwkCrdFlg) {
        this.lmtNtwkCrdFlg = lmtNtwkCrdFlg;
    }

    public Character getAtmAcsFlg() {
        return atmAcsFlg;
    }

    public void setAtmAcsFlg(Character atmAcsFlg) {
        this.atmAcsFlg = atmAcsFlg;
    }

    public Character getPrmyCrdFlg() {
        return prmyCrdFlg;
    }

    public void setPrmyCrdFlg(Character prmyCrdFlg) {
        this.prmyCrdFlg = prmyCrdFlg;
    }

    public Character getFlOffnetFlg() {
        return flOffnetFlg;
    }

    public void setFlOffnetFlg(Character flOffnetFlg) {
        this.flOffnetFlg = flOffnetFlg;
    }

    public Character getPinResetFlg() {
        return pinResetFlg;
    }

    public void setPinResetFlg(Character pinResetFlg) {
        this.pinResetFlg = pinResetFlg;
    }

    public Character getPinAcsFlg() {
        return pinAcsFlg;
    }

    public void setPinAcsFlg(Character pinAcsFlg) {
        this.pinAcsFlg = pinAcsFlg;
    }

    public Character getCshPerQtyFlg() {
        return cshPerQtyFlg;
    }

    public void setCshPerQtyFlg(Character cshPerQtyFlg) {
        this.cshPerQtyFlg = cshPerQtyFlg;
    }

    public Character getAlwCshOffnetFlg() {
        return alwCshOffnetFlg;
    }

    public void setAlwCshOffnetFlg(Character alwCshOffnetFlg) {
        this.alwCshOffnetFlg = alwCshOffnetFlg;
    }

    public Character getIgn2hrChkFlg() {
        return ign2hrChkFlg;
    }

    public void setIgn2hrChkFlg(Character ign2hrChkFlg) {
        this.ign2hrChkFlg = ign2hrChkFlg;
    }

    public Character getNewCrdReqFlg() {
        return newCrdReqFlg;
    }

    public void setNewCrdReqFlg(Character newCrdReqFlg) {
        this.newCrdReqFlg = newCrdReqFlg;
    }

    public Character getOffHrrFlg() {
        return offHrrFlg;
    }

    public void setOffHrrFlg(Character offHrrFlg) {
        this.offHrrFlg = offHrrFlg;
    }

    public Character getDrvVehInfoFlg() {
        return drvVehInfoFlg;
    }

    public void setDrvVehInfoFlg(Character drvVehInfoFlg) {
        this.drvVehInfoFlg = drvVehInfoFlg;
    }

    public Character getDrvGrpsFlg() {
        return drvGrpsFlg;
    }

    public void setDrvGrpsFlg(Character drvGrpsFlg) {
        this.drvGrpsFlg = drvGrpsFlg;
    }

    public Character getAddrUpdFlg() {
        return addrUpdFlg;
    }

    public void setAddrUpdFlg(Character addrUpdFlg) {
        this.addrUpdFlg = addrUpdFlg;
    }

    public Character getOptnUpdFlg() {
        return optnUpdFlg;
    }

    public void setOptnUpdFlg(Character optnUpdFlg) {
        this.optnUpdFlg = optnUpdFlg;
    }

    public Character getFltOptnUpdFlg() {
        return fltOptnUpdFlg;
    }

    public void setFltOptnUpdFlg(Character fltOptnUpdFlg) {
        this.fltOptnUpdFlg = fltOptnUpdFlg;
    }

    public Character getCrdPrdFlg() {
        return crdPrdFlg;
    }

    public void setCrdPrdFlg(Character crdPrdFlg) {
        this.crdPrdFlg = crdPrdFlg;
    }

    public Character getPnchFlg() {
        return pnchFlg;
    }

    public void setPnchFlg(Character pnchFlg) {
        this.pnchFlg = pnchFlg;
    }

    public Character getMccOpenFlg() {
        return mccOpenFlg;
    }

    public void setMccOpenFlg(Character mccOpenFlg) {
        this.mccOpenFlg = mccOpenFlg;
    }

    public Character getIcdRptFlg() {
        return icdRptFlg;
    }

    public void setIcdRptFlg(Character icdRptFlg) {
        this.icdRptFlg = icdRptFlg;
    }

    public BigDecimal getFltPreAmt() {
        return fltPreAmt;
    }

    public void setFltPreAmt(BigDecimal fltPreAmt) {
        this.fltPreAmt = fltPreAmt;
    }

    public BigDecimal getXtnLmt() {
        return xtnLmt;
    }

    public void setXtnLmt(BigDecimal xtnLmt) {
        this.xtnLmt = xtnLmt;
    }

    public int getXtnQty() {
        return xtnQty;
    }

    public void setXtnQty(int xtnQty) {
        this.xtnQty = xtnQty;
    }

    public int getDayXtnsNbr() {
        return dayXtnsNbr;
    }

    public void setDayXtnsNbr(int dayXtnsNbr) {
        this.dayXtnsNbr = dayXtnsNbr;
    }

    public BigDecimal getDayLmt() {
        return dayLmt;
    }

    public void setDayLmt(BigDecimal dayLmt) {
        this.dayLmt = dayLmt;
    }

    public int getDayQty() {
        return dayQty;
    }

    public void setDayQty(int dayQty) {
        this.dayQty = dayQty;
    }

    public int getCycXtnsNbr() {
        return cycXtnsNbr;
    }

    public void setCycXtnsNbr(int cycXtnsNbr) {
        this.cycXtnsNbr = cycXtnsNbr;
    }

    public BigDecimal getCycLmt() {
        return cycLmt;
    }

    public void setCycLmt(BigDecimal cycLmt) {
        this.cycLmt = cycLmt;
    }

    public int getCycQty() {
        return cycQty;
    }

    public void setCycQty(int cycQty) {
        this.cycQty = cycQty;
    }

    public BigDecimal getPooLmt() {
        return pooLmt;
    }

    public void setPooLmt(BigDecimal pooLmt) {
        this.pooLmt = pooLmt;
    }

    public int getPooQty() {
        return pooQty;
    }

    public void setPooQty(int pooQty) {
        this.pooQty = pooQty;
    }

    public BigDecimal getDlyPurchLmt() {
        return dlyPurchLmt;
    }

    public void setDlyPurchLmt(BigDecimal dlyPurchLmt) {
        this.dlyPurchLmt = dlyPurchLmt;
    }

    public BigDecimal getOvrgPct() {
        return ovrgPct;
    }

    public void setOvrgPct(BigDecimal ovrgPct) {
        this.ovrgPct = ovrgPct;
    }

    public BigDecimal getTripAlwnAmt() {
        return tripAlwnAmt;
    }

    public void setTripAlwnAmt(BigDecimal tripAlwnAmt) {
        this.tripAlwnAmt = tripAlwnAmt;
    }

    public Character getFlTripNbrFlg() {
        return flTripNbrFlg;
    }

    public void setFlTripNbrFlg(Character flTripNbrFlg) {
        this.flTripNbrFlg = flTripNbrFlg;
    }

    public BigDecimal getDlyCshLmt() {
        return dlyCshLmt;
    }

    public void setDlyCshLmt(BigDecimal dlyCshLmt) {
        this.dlyCshLmt = dlyCshLmt;
    }

    public BigDecimal getTtlCshAmt() {
        return ttlCshAmt;
    }

    public void setTtlCshAmt(BigDecimal ttlCshAmt) {
        this.ttlCshAmt = ttlCshAmt;
    }

    public Character getCshRnwlFlg() {
        return cshRnwlFlg;
    }

    public void setCshRnwlFlg(Character cshRnwlFlg) {
        this.cshRnwlFlg = cshRnwlFlg;
    }

    public Character getHubometerFlg() {
        return hubometerFlg;
    }

    public void setHubometerFlg(Character hubometerFlg) {
        this.hubometerFlg = hubometerFlg;
    }

    public Character getFlStatFlg() {
        return flStatFlg;
    }

    public void setFlStatFlg(Character flStatFlg) {
        this.flStatFlg = flStatFlg;
    }

    public Character getMsgFlg() {
        return msgFlg;
    }

    public void setMsgFlg(Character msgFlg) {
        this.msgFlg = msgFlg;
    }

    public Character getFlPrdFlg() {
        return flPrdFlg;
    }

    public void setFlPrdFlg(Character flPrdFlg) {
        this.flPrdFlg = flPrdFlg;
    }

    public Character getPoMaintScyFlg() {
        return poMaintScyFlg;
    }

    public void setPoMaintScyFlg(Character poMaintScyFlg) {
        this.poMaintScyFlg = poMaintScyFlg;
    }

    public BigDecimal getPoMaxAmt() {
        return poMaxAmt;
    }

    public void setPoMaxAmt(BigDecimal poMaxAmt) {
        this.poMaxAmt = poMaxAmt;
    }

    public Character getTrlMaintScyFlg() {
        return trlMaintScyFlg;
    }

    public void setTrlMaintScyFlg(Character trlMaintScyFlg) {
        this.trlMaintScyFlg = trlMaintScyFlg;
    }

    public Character getRlshpMntScyFlg() {
        return rlshpMntScyFlg;
    }

    public void setRlshpMntScyFlg(Character rlshpMntScyFlg) {
        this.rlshpMntScyFlg = rlshpMntScyFlg;
    }

    public Character getLimNetwOpenFlg() {
        return limNetwOpenFlg;
    }

    public void setLimNetwOpenFlg(Character limNetwOpenFlg) {
        this.limNetwOpenFlg = limNetwOpenFlg;
    }

    public Character getLimNetwCloseFlg() {
        return limNetwCloseFlg;
    }

    public void setLimNetwCloseFlg(Character limNetwCloseFlg) {
        this.limNetwCloseFlg = limNetwCloseFlg;
    }

    public Character getLimNetw1tmFlg() {
        return limNetw1tmFlg;
    }

    public void setLimNetw1tmFlg(Character limNetw1tmFlg) {
        this.limNetw1tmFlg = limNetw1tmFlg;
    }

    public BigDecimal getVfMailLmt() {
        return vfMailLmt;
    }

    public void setVfMailLmt(BigDecimal vfMailLmt) {
        this.vfMailLmt = vfMailLmt;
    }

    public Character getVfMailRstFlg() {
        return vfMailRstFlg;
    }

    public void setVfMailRstFlg(Character vfMailRstFlg) {
        this.vfMailRstFlg = vfMailRstFlg;
    }

    public Character getCustOptnUpdFlg() {
        return custOptnUpdFlg;
    }

    public void setCustOptnUpdFlg(Character custOptnUpdFlg) {
        this.custOptnUpdFlg = custOptnUpdFlg;
    }

    public String getSpclInstrctns() {
        return spclInstrctns;
    }

    public void setSpclInstrctns(String spclInstrctns) {
        this.spclInstrctns = spclInstrctns;
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

    public Character getCrdAddFlg() {
        return crdAddFlg;
    }

    public void setCrdAddFlg(Character crdAddFlg) {
        this.crdAddFlg = crdAddFlg;
    }

    public int getCrdAddQty() {
        return crdAddQty;
    }

    public void setCrdAddQty(int crdAddQty) {
        this.crdAddQty = crdAddQty;
    }

    public Character getRfidMaintFlg() {
        return rfidMaintFlg;
    }

    public void setRfidMaintFlg(Character rfidMaintFlg) {
        this.rfidMaintFlg = rfidMaintFlg;
    }

    public Character getGhstCrdFlg() {
        return ghstCrdFlg;
    }

    public void setGhstCrdFlg(Character ghstCrdFlg) {
        this.ghstCrdFlg = ghstCrdFlg;
    }

    public Character getCrdHldrIdFlg() {
        return crdHldrIdFlg;
    }

    public void setCrdHldrIdFlg(Character crdHldrIdFlg) {
        this.crdHldrIdFlg = crdHldrIdFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierScyPK != null ? hierScyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierScy)) {
            return false;
        }
        HierScy other = (HierScy) object;
        if ((this.hierScyPK == null && other.hierScyPK != null) || (this.hierScyPK != null && !this.hierScyPK.equals(other.hierScyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierScy[ hierScyPK=" + hierScyPK + " ]";
    }

}
