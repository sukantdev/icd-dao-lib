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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PRD_RAIR_AUDT_LOG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdRairAudtLog.findAll", query = "SELECT p FROM PrdRairAudtLog p")})
public class PrdRairAudtLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "LOG_ACCT_CD")
    private String logAcctCd;
    @Basic(optional = false)
    @Column(name = "NBR_DRVS")
    private int nbrDrvs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "RT_PER_DRV")
    private BigDecimal rtPerDrv;
    @Basic(optional = false)
    @Column(name = "LOG_AUDTNG_ONLY")
    private Character logAudtngOnly;
    @Basic(optional = false)
    @Column(name = "LOG_AUDTNG_FL")
    private Character logAudtngFl;
    @Basic(optional = false)
    @Column(name = "EFCTV_SRV_DT")
    @Temporal(TemporalType.DATE)
    private Date efctvSrvDt;
    @Basic(optional = false)
    @Column(name = "FL_ACQR_CHOICE")
    private Character flAcqrChoice;
    @Basic(optional = false)
    @Column(name = "FL_ACQR_OTH_DESC")
    private String flAcqrOthDesc;
    @Basic(optional = false)
    @Column(name = "ASGN_CHOICE")
    private Character asgnChoice;
    @Basic(optional = false)
    @Column(name = "ASGN_OTH_DESC")
    private String asgnOthDesc;
    @Basic(optional = false)
    @Column(name = "COMP_CHOICE")
    private Character compChoice;
    @Basic(optional = false)
    @Column(name = "COMP_OTH_DESC")
    private String compOthDesc;
    @Basic(optional = false)
    @Column(name = "TRVL_ABROAD_FLG")
    private Character trvlAbroadFlg;
    @Basic(optional = false)
    @Column(name = "MULP_LOG_TYP_FLG")
    private Character mulpLogTypFlg;
    @Basic(optional = false)
    @Column(name = "TEAM_TRNG_DRVS_FLG")
    private Character teamTrngDrvsFlg;
    @Basic(optional = false)
    @Column(name = "AIR_MLS_DRVS_FLG")
    private Character airMlsDrvsFlg;
    @Basic(optional = false)
    @Column(name = "MULP_LOC_FLG")
    private Character mulpLocFlg;
    @Basic(optional = false)
    @Column(name = "LOG_REQMNT_FLGS")
    private short logReqmntFlgs;
    @Basic(optional = false)
    @Column(name = "CHK_LOG_ACRCY_FLGS")
    private short chkLogAcrcyFlgs;
    @Basic(optional = false)
    @Column(name = "CHK_LOG_OTH_DESC")
    private String chkLogOthDesc;
    @Basic(optional = false)
    @Column(name = "DVIR_LOC_FLG")
    private Character dvirLocFlg;
    @Basic(optional = false)
    @Column(name = "LOG_SEND_MTHD")
    private Character logSendMthd;
    @Basic(optional = false)
    @Column(name = "LOG_RTTN_MTHD")
    private Character logRttnMthd;
    @Basic(optional = false)
    @Column(name = "DRV_UPD_DNLD_FLG")
    private Character drvUpdDnldFlg;
    @Basic(optional = false)
    @Column(name = "DRV_UPD_MNL_FLG")
    private Character drvUpdMnlFlg;
    @Basic(optional = false)
    @Column(name = "SIXTY_HR_RULE_FLG")
    private Character sixtyHrRuleFlg;
    @Basic(optional = false)
    @Column(name = "SVNTY_HR_RULE_FLG")
    private Character svntyHrRuleFlg;
    @Basic(optional = false)
    @Column(name = "MSNG_LOGS_FLG")
    private Character msngLogsFlg;
    @Basic(optional = false)
    @Column(name = "MSNG_OTH_DESC")
    private String msngOthDesc;
    @Basic(optional = false)
    @Column(name = "SPDNG_VLTN_FLG")
    private Character spdngVltnFlg;
    @Basic(optional = false)
    @Column(name = "VLTN_SPEED")
    private BigDecimal vltnSpeed;
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

    public PrdRairAudtLog() {
    }

    public PrdRairAudtLog(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdRairAudtLog(String applNbr, String logAcctCd, int nbrDrvs, BigDecimal rtPerDrv, Character logAudtngOnly, Character logAudtngFl, Date efctvSrvDt, Character flAcqrChoice, String flAcqrOthDesc, Character asgnChoice, String asgnOthDesc, Character compChoice, String compOthDesc, Character trvlAbroadFlg, Character mulpLogTypFlg, Character teamTrngDrvsFlg, Character airMlsDrvsFlg, Character mulpLocFlg, short logReqmntFlgs, short chkLogAcrcyFlgs, String chkLogOthDesc, Character dvirLocFlg, Character logSendMthd, Character logRttnMthd, Character drvUpdDnldFlg, Character drvUpdMnlFlg, Character sixtyHrRuleFlg, Character svntyHrRuleFlg, Character msngLogsFlg, String msngOthDesc, Character spdngVltnFlg, BigDecimal vltnSpeed, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.logAcctCd = logAcctCd;
        this.nbrDrvs = nbrDrvs;
        this.rtPerDrv = rtPerDrv;
        this.logAudtngOnly = logAudtngOnly;
        this.logAudtngFl = logAudtngFl;
        this.efctvSrvDt = efctvSrvDt;
        this.flAcqrChoice = flAcqrChoice;
        this.flAcqrOthDesc = flAcqrOthDesc;
        this.asgnChoice = asgnChoice;
        this.asgnOthDesc = asgnOthDesc;
        this.compChoice = compChoice;
        this.compOthDesc = compOthDesc;
        this.trvlAbroadFlg = trvlAbroadFlg;
        this.mulpLogTypFlg = mulpLogTypFlg;
        this.teamTrngDrvsFlg = teamTrngDrvsFlg;
        this.airMlsDrvsFlg = airMlsDrvsFlg;
        this.mulpLocFlg = mulpLocFlg;
        this.logReqmntFlgs = logReqmntFlgs;
        this.chkLogAcrcyFlgs = chkLogAcrcyFlgs;
        this.chkLogOthDesc = chkLogOthDesc;
        this.dvirLocFlg = dvirLocFlg;
        this.logSendMthd = logSendMthd;
        this.logRttnMthd = logRttnMthd;
        this.drvUpdDnldFlg = drvUpdDnldFlg;
        this.drvUpdMnlFlg = drvUpdMnlFlg;
        this.sixtyHrRuleFlg = sixtyHrRuleFlg;
        this.svntyHrRuleFlg = svntyHrRuleFlg;
        this.msngLogsFlg = msngLogsFlg;
        this.msngOthDesc = msngOthDesc;
        this.spdngVltnFlg = spdngVltnFlg;
        this.vltnSpeed = vltnSpeed;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getLogAcctCd() {
        return logAcctCd;
    }

    public void setLogAcctCd(String logAcctCd) {
        this.logAcctCd = logAcctCd;
    }

    public int getNbrDrvs() {
        return nbrDrvs;
    }

    public void setNbrDrvs(int nbrDrvs) {
        this.nbrDrvs = nbrDrvs;
    }

    public BigDecimal getRtPerDrv() {
        return rtPerDrv;
    }

    public void setRtPerDrv(BigDecimal rtPerDrv) {
        this.rtPerDrv = rtPerDrv;
    }

    public Character getLogAudtngOnly() {
        return logAudtngOnly;
    }

    public void setLogAudtngOnly(Character logAudtngOnly) {
        this.logAudtngOnly = logAudtngOnly;
    }

    public Character getLogAudtngFl() {
        return logAudtngFl;
    }

    public void setLogAudtngFl(Character logAudtngFl) {
        this.logAudtngFl = logAudtngFl;
    }

    public Date getEfctvSrvDt() {
        return efctvSrvDt;
    }

    public void setEfctvSrvDt(Date efctvSrvDt) {
        this.efctvSrvDt = efctvSrvDt;
    }

    public Character getFlAcqrChoice() {
        return flAcqrChoice;
    }

    public void setFlAcqrChoice(Character flAcqrChoice) {
        this.flAcqrChoice = flAcqrChoice;
    }

    public String getFlAcqrOthDesc() {
        return flAcqrOthDesc;
    }

    public void setFlAcqrOthDesc(String flAcqrOthDesc) {
        this.flAcqrOthDesc = flAcqrOthDesc;
    }

    public Character getAsgnChoice() {
        return asgnChoice;
    }

    public void setAsgnChoice(Character asgnChoice) {
        this.asgnChoice = asgnChoice;
    }

    public String getAsgnOthDesc() {
        return asgnOthDesc;
    }

    public void setAsgnOthDesc(String asgnOthDesc) {
        this.asgnOthDesc = asgnOthDesc;
    }

    public Character getCompChoice() {
        return compChoice;
    }

    public void setCompChoice(Character compChoice) {
        this.compChoice = compChoice;
    }

    public String getCompOthDesc() {
        return compOthDesc;
    }

    public void setCompOthDesc(String compOthDesc) {
        this.compOthDesc = compOthDesc;
    }

    public Character getTrvlAbroadFlg() {
        return trvlAbroadFlg;
    }

    public void setTrvlAbroadFlg(Character trvlAbroadFlg) {
        this.trvlAbroadFlg = trvlAbroadFlg;
    }

    public Character getMulpLogTypFlg() {
        return mulpLogTypFlg;
    }

    public void setMulpLogTypFlg(Character mulpLogTypFlg) {
        this.mulpLogTypFlg = mulpLogTypFlg;
    }

    public Character getTeamTrngDrvsFlg() {
        return teamTrngDrvsFlg;
    }

    public void setTeamTrngDrvsFlg(Character teamTrngDrvsFlg) {
        this.teamTrngDrvsFlg = teamTrngDrvsFlg;
    }

    public Character getAirMlsDrvsFlg() {
        return airMlsDrvsFlg;
    }

    public void setAirMlsDrvsFlg(Character airMlsDrvsFlg) {
        this.airMlsDrvsFlg = airMlsDrvsFlg;
    }

    public Character getMulpLocFlg() {
        return mulpLocFlg;
    }

    public void setMulpLocFlg(Character mulpLocFlg) {
        this.mulpLocFlg = mulpLocFlg;
    }

    public short getLogReqmntFlgs() {
        return logReqmntFlgs;
    }

    public void setLogReqmntFlgs(short logReqmntFlgs) {
        this.logReqmntFlgs = logReqmntFlgs;
    }

    public short getChkLogAcrcyFlgs() {
        return chkLogAcrcyFlgs;
    }

    public void setChkLogAcrcyFlgs(short chkLogAcrcyFlgs) {
        this.chkLogAcrcyFlgs = chkLogAcrcyFlgs;
    }

    public String getChkLogOthDesc() {
        return chkLogOthDesc;
    }

    public void setChkLogOthDesc(String chkLogOthDesc) {
        this.chkLogOthDesc = chkLogOthDesc;
    }

    public Character getDvirLocFlg() {
        return dvirLocFlg;
    }

    public void setDvirLocFlg(Character dvirLocFlg) {
        this.dvirLocFlg = dvirLocFlg;
    }

    public Character getLogSendMthd() {
        return logSendMthd;
    }

    public void setLogSendMthd(Character logSendMthd) {
        this.logSendMthd = logSendMthd;
    }

    public Character getLogRttnMthd() {
        return logRttnMthd;
    }

    public void setLogRttnMthd(Character logRttnMthd) {
        this.logRttnMthd = logRttnMthd;
    }

    public Character getDrvUpdDnldFlg() {
        return drvUpdDnldFlg;
    }

    public void setDrvUpdDnldFlg(Character drvUpdDnldFlg) {
        this.drvUpdDnldFlg = drvUpdDnldFlg;
    }

    public Character getDrvUpdMnlFlg() {
        return drvUpdMnlFlg;
    }

    public void setDrvUpdMnlFlg(Character drvUpdMnlFlg) {
        this.drvUpdMnlFlg = drvUpdMnlFlg;
    }

    public Character getSixtyHrRuleFlg() {
        return sixtyHrRuleFlg;
    }

    public void setSixtyHrRuleFlg(Character sixtyHrRuleFlg) {
        this.sixtyHrRuleFlg = sixtyHrRuleFlg;
    }

    public Character getSvntyHrRuleFlg() {
        return svntyHrRuleFlg;
    }

    public void setSvntyHrRuleFlg(Character svntyHrRuleFlg) {
        this.svntyHrRuleFlg = svntyHrRuleFlg;
    }

    public Character getMsngLogsFlg() {
        return msngLogsFlg;
    }

    public void setMsngLogsFlg(Character msngLogsFlg) {
        this.msngLogsFlg = msngLogsFlg;
    }

    public String getMsngOthDesc() {
        return msngOthDesc;
    }

    public void setMsngOthDesc(String msngOthDesc) {
        this.msngOthDesc = msngOthDesc;
    }

    public Character getSpdngVltnFlg() {
        return spdngVltnFlg;
    }

    public void setSpdngVltnFlg(Character spdngVltnFlg) {
        this.spdngVltnFlg = spdngVltnFlg;
    }

    public BigDecimal getVltnSpeed() {
        return vltnSpeed;
    }

    public void setVltnSpeed(BigDecimal vltnSpeed) {
        this.vltnSpeed = vltnSpeed;
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
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdRairAudtLog)) {
            return false;
        }
        PrdRairAudtLog other = (PrdRairAudtLog) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdRairAudtLog[ applNbr=" + applNbr + " ]";
    }
    
}
