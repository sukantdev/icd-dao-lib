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
@Table(name = "VMC_BYR_STUP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VmcByrStup.findAll", query = "SELECT v FROM VmcByrStup v")})
public class VmcByrStup implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VmcByrStupPK vmcByrStupPK;
    @Basic(optional = false)
    @Column(name = "COMP_NM")
    private String compNm;
    @Basic(optional = false)
    @Column(name = "CNTCT_NM")
    private String cntctNm;
    @Basic(optional = false)
    @Column(name = "ADDR1")
    private String addr1;
    @Basic(optional = false)
    @Column(name = "ADDR2")
    private String addr2;
    @Basic(optional = false)
    @Column(name = "CTY")
    private String cty;
    @Basic(optional = false)
    @Column(name = "ST")
    private String st;
    @Basic(optional = false)
    @Column(name = "ZIP")
    private String zip;
    @Basic(optional = false)
    @Column(name = "CRTY_CD")
    private String crtyCd;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR1")
    private String emailAddr1;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR2")
    private String emailAddr2;
    @Basic(optional = false)
    @Column(name = "PH_NBR")
    private String phNbr;
    @Basic(optional = false)
    @Column(name = "FAX_NBR1")
    private String faxNbr1;
    @Basic(optional = false)
    @Column(name = "FAX_NBR2")
    private String faxNbr2;
    @Basic(optional = false)
    @Column(name = "TRNS_NBR")
    private int trnsNbr;
    @Basic(optional = false)
    @Column(name = "CRD_EXPR_MO")
    private int crdExprMo;
    @Basic(optional = false)
    @Column(name = "EXACT_AMT")
    private Character exactAmt;
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
    @Column(name = "EDIT_CMNT1_FLG")
    private Character editCmnt1Flg;
    @Basic(optional = false)
    @Column(name = "EDIT_CMNT2_FLG")
    private Character editCmnt2Flg;
    @Basic(optional = false)
    @Column(name = "EDIT_CMNT3_FLG")
    private Character editCmnt3Flg;
    @Basic(optional = false)
    @Column(name = "EDIT_CMNT4_FLG")
    private Character editCmnt4Flg;
    @Basic(optional = false)
    @Column(name = "PS17_FRMT_FLG")
    private Character ps17FrmtFlg;
    @Basic(optional = false)
    @Column(name = "SND_RMTNC_EML_FLG")
    private Character sndRmtncEmlFlg;
    @Basic(optional = false)
    @Column(name = "PS16_EML_IND")
    private Character ps16EmlInd;
    @Basic(optional = false)
    @Column(name = "VND_TBL_OVR_IND")
    private Character vndTblOvrInd;
    @Basic(optional = false)
    @Column(name = "CRT_VC_BY_FLG")
    private Character crtVcByFlg;
    @Basic(optional = false)
    @Column(name = "REG_URL")
    private String regUrl;
    @Basic(optional = false)
    @Column(name = "CRD_USG_RMNDR_FLG")
    private Character crdUsgRmndrFlg;
    @Basic(optional = false)
    @Column(name = "AP_BATCH_NBR")
    private int apBatchNbr;
    @Basic(optional = false)
    @Column(name = "DUP_CHK_FLG")
    private Character dupChkFlg;
    @Basic(optional = false)
    @Column(name = "PS17_EMAIL_FLAG")
    private Character ps17EmailFlag;
    @Basic(optional = false)
    @Column(name = "PS17_EMAIL_RECIPIENTS")
    private String ps17EmailRecipients;
    @Basic(optional = false)
    @Column(name = "FOLLOW_UP_DAYS_1_CNT")
    private int followUpDays1Cnt;
    @Basic(optional = false)
    @Column(name = "FOLLOW_UP_DAYS_2_CNT")
    private int followUpDays2Cnt;
    @Basic(optional = false)
    @Column(name = "FOLLOW_UP_DAYS_3_CNT")
    private int followUpDays3Cnt;
    @Basic(optional = false)
    @Column(name = "BPP_FLG")
    private Character bppFlg;
    @Basic(optional = false)
    @Column(name = "AUTO_BLOCK_CRDS_FLG")
    private Character autoBlockCrdsFlg;
    @Basic(optional = false)
    @Column(name = "AUTO_BLOCK_DAYS_CNT")
    private int autoBlockDaysCnt;
    @Basic(optional = false)
    @Column(name = "CRD_PRTL_USG_RMNDR_FLG")
    private Character crdPrtlUsgRmndrFlg;
    @Basic(optional = false)
    @Column(name = "RECON_FLG")
    private Character reconFlg;
    @Basic(optional = false)
    @Column(name = "FULL_CARD_ON_REMITTANCE_FLG")
    private Character fullCardOnRemittanceFlg;
    @Basic(optional = false)
    @Column(name = "CUSTOM_REMIT_TEMPLATE")
    private String customRemitTemplate;
    @Basic(optional = false)
    @Column(name = "VCT_FLAG")
    private Character vctFlag;
    @Basic(optional = false)
    @Column(name = "CTX_820_FLAG")
    private Character ctx820Flag;
    @Basic(optional = false)
    @Column(name = "VNDR_EMAIL_RCPT_ADDR")
    private String vndrEmailRcptAddr;
    @Basic(optional = false)
    @Column(name = "MXD_CSE_VNDR_FLG")
    private Character mxdCseVndrFlg;
    @Basic(optional = false)
    @Column(name = "FULL_CARD_IMG_REMITTANCE_FLG")
    private Character fullCardImgRemittanceFlg;
    @Basic(optional = false)
    @Column(name = "TRSTD_CUST_FLG")
    private Character trstdCustFlg;
    @Basic(optional = false)
    @Column(name = "BYO_REMITTANCE_ENABLE_FLG")
    private Character byoRemittanceEnableFlg;

    public VmcByrStup() {
    }

    public VmcByrStup(VmcByrStupPK vmcByrStupPK) {
        this.vmcByrStupPK = vmcByrStupPK;
    }

    public VmcByrStup(VmcByrStupPK vmcByrStupPK, String compNm, String cntctNm, String addr1, String addr2, String cty, String st, String zip, String crtyCd, String emailAddr1, String emailAddr2, String phNbr, String faxNbr1, String faxNbr2, int trnsNbr, int crdExprMo, Character exactAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character editCmnt1Flg, Character editCmnt2Flg, Character editCmnt3Flg, Character editCmnt4Flg, Character ps17FrmtFlg, Character sndRmtncEmlFlg, Character ps16EmlInd, Character vndTblOvrInd, Character crtVcByFlg, String regUrl, Character crdUsgRmndrFlg, int apBatchNbr, Character dupChkFlg, Character ps17EmailFlag, String ps17EmailRecipients, int followUpDays1Cnt, int followUpDays2Cnt, int followUpDays3Cnt, Character bppFlg, Character autoBlockCrdsFlg, int autoBlockDaysCnt, Character crdPrtlUsgRmndrFlg, Character reconFlg, Character fullCardOnRemittanceFlg, String customRemitTemplate, Character vctFlag, Character ctx820Flag, String vndrEmailRcptAddr, Character mxdCseVndrFlg, Character fullCardImgRemittanceFlg, Character trstdCustFlg, Character byoRemittanceEnableFlg) {
        this.vmcByrStupPK = vmcByrStupPK;
        this.compNm = compNm;
        this.cntctNm = cntctNm;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.cty = cty;
        this.st = st;
        this.zip = zip;
        this.crtyCd = crtyCd;
        this.emailAddr1 = emailAddr1;
        this.emailAddr2 = emailAddr2;
        this.phNbr = phNbr;
        this.faxNbr1 = faxNbr1;
        this.faxNbr2 = faxNbr2;
        this.trnsNbr = trnsNbr;
        this.crdExprMo = crdExprMo;
        this.exactAmt = exactAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.editCmnt1Flg = editCmnt1Flg;
        this.editCmnt2Flg = editCmnt2Flg;
        this.editCmnt3Flg = editCmnt3Flg;
        this.editCmnt4Flg = editCmnt4Flg;
        this.ps17FrmtFlg = ps17FrmtFlg;
        this.sndRmtncEmlFlg = sndRmtncEmlFlg;
        this.ps16EmlInd = ps16EmlInd;
        this.vndTblOvrInd = vndTblOvrInd;
        this.crtVcByFlg = crtVcByFlg;
        this.regUrl = regUrl;
        this.crdUsgRmndrFlg = crdUsgRmndrFlg;
        this.apBatchNbr = apBatchNbr;
        this.dupChkFlg = dupChkFlg;
        this.ps17EmailFlag = ps17EmailFlag;
        this.ps17EmailRecipients = ps17EmailRecipients;
        this.followUpDays1Cnt = followUpDays1Cnt;
        this.followUpDays2Cnt = followUpDays2Cnt;
        this.followUpDays3Cnt = followUpDays3Cnt;
        this.bppFlg = bppFlg;
        this.autoBlockCrdsFlg = autoBlockCrdsFlg;
        this.autoBlockDaysCnt = autoBlockDaysCnt;
        this.crdPrtlUsgRmndrFlg = crdPrtlUsgRmndrFlg;
        this.reconFlg = reconFlg;
        this.fullCardOnRemittanceFlg = fullCardOnRemittanceFlg;
        this.customRemitTemplate = customRemitTemplate;
        this.vctFlag = vctFlag;
        this.ctx820Flag = ctx820Flag;
        this.vndrEmailRcptAddr = vndrEmailRcptAddr;
        this.mxdCseVndrFlg = mxdCseVndrFlg;
        this.fullCardImgRemittanceFlg = fullCardImgRemittanceFlg;
        this.trstdCustFlg = trstdCustFlg;
        this.byoRemittanceEnableFlg = byoRemittanceEnableFlg;
    }

    public VmcByrStup(String acctNbr, String custId) {
        this.vmcByrStupPK = new VmcByrStupPK(acctNbr, custId);
    }

    public VmcByrStupPK getVmcByrStupPK() {
        return vmcByrStupPK;
    }

    public void setVmcByrStupPK(VmcByrStupPK vmcByrStupPK) {
        this.vmcByrStupPK = vmcByrStupPK;
    }

    public String getCompNm() {
        return compNm;
    }

    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    public String getCntctNm() {
        return cntctNm;
    }

    public void setCntctNm(String cntctNm) {
        this.cntctNm = cntctNm;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
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

    public String getCrtyCd() {
        return crtyCd;
    }

    public void setCrtyCd(String crtyCd) {
        this.crtyCd = crtyCd;
    }

    public String getEmailAddr1() {
        return emailAddr1;
    }

    public void setEmailAddr1(String emailAddr1) {
        this.emailAddr1 = emailAddr1;
    }

    public String getEmailAddr2() {
        return emailAddr2;
    }

    public void setEmailAddr2(String emailAddr2) {
        this.emailAddr2 = emailAddr2;
    }

    public String getPhNbr() {
        return phNbr;
    }

    public void setPhNbr(String phNbr) {
        this.phNbr = phNbr;
    }

    public String getFaxNbr1() {
        return faxNbr1;
    }

    public void setFaxNbr1(String faxNbr1) {
        this.faxNbr1 = faxNbr1;
    }

    public String getFaxNbr2() {
        return faxNbr2;
    }

    public void setFaxNbr2(String faxNbr2) {
        this.faxNbr2 = faxNbr2;
    }

    public int getTrnsNbr() {
        return trnsNbr;
    }

    public void setTrnsNbr(int trnsNbr) {
        this.trnsNbr = trnsNbr;
    }

    public int getCrdExprMo() {
        return crdExprMo;
    }

    public void setCrdExprMo(int crdExprMo) {
        this.crdExprMo = crdExprMo;
    }

    public Character getExactAmt() {
        return exactAmt;
    }

    public void setExactAmt(Character exactAmt) {
        this.exactAmt = exactAmt;
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

    public Character getEditCmnt1Flg() {
        return editCmnt1Flg;
    }

    public void setEditCmnt1Flg(Character editCmnt1Flg) {
        this.editCmnt1Flg = editCmnt1Flg;
    }

    public Character getEditCmnt2Flg() {
        return editCmnt2Flg;
    }

    public void setEditCmnt2Flg(Character editCmnt2Flg) {
        this.editCmnt2Flg = editCmnt2Flg;
    }

    public Character getEditCmnt3Flg() {
        return editCmnt3Flg;
    }

    public void setEditCmnt3Flg(Character editCmnt3Flg) {
        this.editCmnt3Flg = editCmnt3Flg;
    }

    public Character getEditCmnt4Flg() {
        return editCmnt4Flg;
    }

    public void setEditCmnt4Flg(Character editCmnt4Flg) {
        this.editCmnt4Flg = editCmnt4Flg;
    }

    public Character getPs17FrmtFlg() {
        return ps17FrmtFlg;
    }

    public void setPs17FrmtFlg(Character ps17FrmtFlg) {
        this.ps17FrmtFlg = ps17FrmtFlg;
    }

    public Character getSndRmtncEmlFlg() {
        return sndRmtncEmlFlg;
    }

    public void setSndRmtncEmlFlg(Character sndRmtncEmlFlg) {
        this.sndRmtncEmlFlg = sndRmtncEmlFlg;
    }

    public Character getPs16EmlInd() {
        return ps16EmlInd;
    }

    public void setPs16EmlInd(Character ps16EmlInd) {
        this.ps16EmlInd = ps16EmlInd;
    }

    public Character getVndTblOvrInd() {
        return vndTblOvrInd;
    }

    public void setVndTblOvrInd(Character vndTblOvrInd) {
        this.vndTblOvrInd = vndTblOvrInd;
    }

    public Character getCrtVcByFlg() {
        return crtVcByFlg;
    }

    public void setCrtVcByFlg(Character crtVcByFlg) {
        this.crtVcByFlg = crtVcByFlg;
    }

    public String getRegUrl() {
        return regUrl;
    }

    public void setRegUrl(String regUrl) {
        this.regUrl = regUrl;
    }

    public Character getCrdUsgRmndrFlg() {
        return crdUsgRmndrFlg;
    }

    public void setCrdUsgRmndrFlg(Character crdUsgRmndrFlg) {
        this.crdUsgRmndrFlg = crdUsgRmndrFlg;
    }

    public int getApBatchNbr() {
        return apBatchNbr;
    }

    public void setApBatchNbr(int apBatchNbr) {
        this.apBatchNbr = apBatchNbr;
    }

    public Character getDupChkFlg() {
        return dupChkFlg;
    }

    public void setDupChkFlg(Character dupChkFlg) {
        this.dupChkFlg = dupChkFlg;
    }

    public Character getPs17EmailFlag() {
        return ps17EmailFlag;
    }

    public void setPs17EmailFlag(Character ps17EmailFlag) {
        this.ps17EmailFlag = ps17EmailFlag;
    }

    public String getPs17EmailRecipients() {
        return ps17EmailRecipients;
    }

    public void setPs17EmailRecipients(String ps17EmailRecipients) {
        this.ps17EmailRecipients = ps17EmailRecipients;
    }

    public int getFollowUpDays1Cnt() {
        return followUpDays1Cnt;
    }

    public void setFollowUpDays1Cnt(int followUpDays1Cnt) {
        this.followUpDays1Cnt = followUpDays1Cnt;
    }

    public int getFollowUpDays2Cnt() {
        return followUpDays2Cnt;
    }

    public void setFollowUpDays2Cnt(int followUpDays2Cnt) {
        this.followUpDays2Cnt = followUpDays2Cnt;
    }

    public int getFollowUpDays3Cnt() {
        return followUpDays3Cnt;
    }

    public void setFollowUpDays3Cnt(int followUpDays3Cnt) {
        this.followUpDays3Cnt = followUpDays3Cnt;
    }

    public Character getBppFlg() {
        return bppFlg;
    }

    public void setBppFlg(Character bppFlg) {
        this.bppFlg = bppFlg;
    }

    public Character getAutoBlockCrdsFlg() {
        return autoBlockCrdsFlg;
    }

    public void setAutoBlockCrdsFlg(Character autoBlockCrdsFlg) {
        this.autoBlockCrdsFlg = autoBlockCrdsFlg;
    }

    public int getAutoBlockDaysCnt() {
        return autoBlockDaysCnt;
    }

    public void setAutoBlockDaysCnt(int autoBlockDaysCnt) {
        this.autoBlockDaysCnt = autoBlockDaysCnt;
    }

    public Character getCrdPrtlUsgRmndrFlg() {
        return crdPrtlUsgRmndrFlg;
    }

    public void setCrdPrtlUsgRmndrFlg(Character crdPrtlUsgRmndrFlg) {
        this.crdPrtlUsgRmndrFlg = crdPrtlUsgRmndrFlg;
    }

    public Character getReconFlg() {
        return reconFlg;
    }

    public void setReconFlg(Character reconFlg) {
        this.reconFlg = reconFlg;
    }

    public Character getFullCardOnRemittanceFlg() {
        return fullCardOnRemittanceFlg;
    }

    public void setFullCardOnRemittanceFlg(Character fullCardOnRemittanceFlg) {
        this.fullCardOnRemittanceFlg = fullCardOnRemittanceFlg;
    }

    public String getCustomRemitTemplate() {
        return customRemitTemplate;
    }

    public void setCustomRemitTemplate(String customRemitTemplate) {
        this.customRemitTemplate = customRemitTemplate;
    }

    public Character getVctFlag() {
        return vctFlag;
    }

    public void setVctFlag(Character vctFlag) {
        this.vctFlag = vctFlag;
    }

    public Character getCtx820Flag() {
        return ctx820Flag;
    }

    public void setCtx820Flag(Character ctx820Flag) {
        this.ctx820Flag = ctx820Flag;
    }

    public String getVndrEmailRcptAddr() {
        return vndrEmailRcptAddr;
    }

    public void setVndrEmailRcptAddr(String vndrEmailRcptAddr) {
        this.vndrEmailRcptAddr = vndrEmailRcptAddr;
    }

    public Character getMxdCseVndrFlg() {
        return mxdCseVndrFlg;
    }

    public void setMxdCseVndrFlg(Character mxdCseVndrFlg) {
        this.mxdCseVndrFlg = mxdCseVndrFlg;
    }

    public Character getFullCardImgRemittanceFlg() {
        return fullCardImgRemittanceFlg;
    }

    public void setFullCardImgRemittanceFlg(Character fullCardImgRemittanceFlg) {
        this.fullCardImgRemittanceFlg = fullCardImgRemittanceFlg;
    }

    public Character getTrstdCustFlg() {
        return trstdCustFlg;
    }

    public void setTrstdCustFlg(Character trstdCustFlg) {
        this.trstdCustFlg = trstdCustFlg;
    }

    public Character getByoRemittanceEnableFlg() {
        return byoRemittanceEnableFlg;
    }

    public void setByoRemittanceEnableFlg(Character byoRemittanceEnableFlg) {
        this.byoRemittanceEnableFlg = byoRemittanceEnableFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vmcByrStupPK != null ? vmcByrStupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VmcByrStup)) {
            return false;
        }
        VmcByrStup other = (VmcByrStup) object;
        if ((this.vmcByrStupPK == null && other.vmcByrStupPK != null) || (this.vmcByrStupPK != null && !this.vmcByrStupPK.equals(other.vmcByrStupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VmcByrStup[ vmcByrStupPK=" + vmcByrStupPK + " ]";
    }
    
}
