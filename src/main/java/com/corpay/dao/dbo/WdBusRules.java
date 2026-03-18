package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "WD_BUS_RULES", catalog = "", schema = "DBO")
public class WdBusRules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RULE_NBR")
    private Integer ruleNbr;
    @Basic(optional = false)
    @Column(name = "TYP_CD")
    private String typCd;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private int seqNbr;
    @Basic(optional = false)
    @Column(name = "BT_SRC_SYS_CD")
    private String btSrcSysCd;
    @Basic(optional = false)
    @Column(name = "RULE_TXT")
    private String ruleTxt;
    @Basic(optional = false)
    @Column(name = "START_TXT")
    private String startTxt;
    @Basic(optional = false)
    @Column(name = "END_TXT")
    private String endTxt;
    @Basic(optional = false)
    @Column(name = "APPLY_TXT")
    private String applyTxt;
    @Basic(optional = false)
    @Column(name = "APPLY_RULE_NBR")
    private int applyRuleNbr;
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
    @Column(name = "LOB_CD")
    private String lobCd;

    public WdBusRules() {
    }

    public WdBusRules(Integer ruleNbr) {
        this.ruleNbr = ruleNbr;
    }

    public WdBusRules(Integer ruleNbr, String typCd, int seqNbr, String btSrcSysCd, String ruleTxt, String startTxt, String endTxt, String applyTxt, int applyRuleNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String lobCd) {
        this.ruleNbr = ruleNbr;
        this.typCd = typCd;
        this.seqNbr = seqNbr;
        this.btSrcSysCd = btSrcSysCd;
        this.ruleTxt = ruleTxt;
        this.startTxt = startTxt;
        this.endTxt = endTxt;
        this.applyTxt = applyTxt;
        this.applyRuleNbr = applyRuleNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.lobCd = lobCd;
    }

    public Integer getRuleNbr() {
        return ruleNbr;
    }

    public void setRuleNbr(Integer ruleNbr) {
        this.ruleNbr = ruleNbr;
    }

    public String getTypCd() {
        return typCd;
    }

    public void setTypCd(String typCd) {
        this.typCd = typCd;
    }

    public int getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(int seqNbr) {
        this.seqNbr = seqNbr;
    }

    public String getBtSrcSysCd() {
        return btSrcSysCd;
    }

    public void setBtSrcSysCd(String btSrcSysCd) {
        this.btSrcSysCd = btSrcSysCd;
    }

    public String getRuleTxt() {
        return ruleTxt;
    }

    public void setRuleTxt(String ruleTxt) {
        this.ruleTxt = ruleTxt;
    }

    public String getStartTxt() {
        return startTxt;
    }

    public void setStartTxt(String startTxt) {
        this.startTxt = startTxt;
    }

    public String getEndTxt() {
        return endTxt;
    }

    public void setEndTxt(String endTxt) {
        this.endTxt = endTxt;
    }

    public String getApplyTxt() {
        return applyTxt;
    }

    public void setApplyTxt(String applyTxt) {
        this.applyTxt = applyTxt;
    }

    public int getApplyRuleNbr() {
        return applyRuleNbr;
    }

    public void setApplyRuleNbr(int applyRuleNbr) {
        this.applyRuleNbr = applyRuleNbr;
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

    public String getLobCd() {
        return lobCd;
    }

    public void setLobCd(String lobCd) {
        this.lobCd = lobCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ruleNbr != null ? ruleNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof WdBusRules)) {
            return false;
        }
        WdBusRules other = (WdBusRules) object;
        if ((this.ruleNbr == null && other.ruleNbr != null) || (this.ruleNbr != null && !this.ruleNbr.equals(other.ruleNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.WdBusRules[ ruleNbr=" + ruleNbr + " ]";
    }

}
