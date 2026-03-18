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
@Table(name = "CONS_INV_SUMM", catalog = "", schema = "DBO")
public class ConsInvSumm implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConsInvSummPK consInvSummPK;

    @Basic(optional = false)
    @Column(name = "TOT_DUE_US_AMT")
    private BigDecimal totDueUsAmt;
    @Basic(optional = false)
    @Column(name = "TOT_DUE_CN_AMT")
    private BigDecimal totDueCnAmt;
    @Basic(optional = false)
    @Column(name = "INV_DUE_DT")
    @Temporal(TemporalType.DATE)
    private Date invDueDt;
    @Basic(optional = false)
    @Column(name = "PREV_BAL_AMT")
    private BigDecimal prevBalAmt;
    @Basic(optional = false)
    @Column(name = "PAYMNTS_ADJ_AMT")
    private BigDecimal paymntsAdjAmt;
    @Basic(optional = false)
    @Column(name = "NEW_ACTVTY_US_AMT")
    private BigDecimal newActvtyUsAmt;
    @Basic(optional = false)
    @Column(name = "NEW_ACTVTY_CN_AMT")
    private BigDecimal newActvtyCnAmt;
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
    @Column(name = "STMT_PRD_BG_DT")
    @Temporal(TemporalType.DATE)
    private Date stmtPrdBgDt;
    @Basic(optional = false)
    @Column(name = "RBT_GVN")
    private BigDecimal rbtGvn;
    @Basic(optional = false)
    @Column(name = "INTRST_CHRGD")
    private BigDecimal intrstChrgd;
    @Basic(optional = false)
    @Column(name = "LT_FEE_CHRGD")
    private BigDecimal ltFeeChrgd;
    @Basic(optional = false)
    @Column(name = "ALL_OTH_FEE_CHRGD")
    private BigDecimal allOthFeeChrgd;
    @Basic(optional = false)
    @Column(name = "NEW_ACTVTY_US_MC_AMT")
    private BigDecimal newActvtyUsMcAmt;
    @Basic(optional = false)
    @Column(name = "NEW_ACTVTY_US_PROP_AMT")
    private BigDecimal newActvtyUsPropAmt;
    @Basic(optional = false)
    @Column(name = "NEW_ACTVTY_CN_MC_AMT")
    private BigDecimal newActvtyCnMcAmt;
    @Basic(optional = false)
    @Column(name = "NEW_ACTVTY_CN_PROP_AMT")
    private BigDecimal newActvtyCnPropAmt;

    public ConsInvSumm() {
    }

    public ConsInvSumm(ConsInvSummPK consInvSummPK) {
        this.consInvSummPK = consInvSummPK;
    }

    public ConsInvSumm(ConsInvSummPK consInvSummPK, BigDecimal totDueUsAmt, BigDecimal totDueCnAmt, Date invDueDt, BigDecimal prevBalAmt, BigDecimal paymntsAdjAmt, BigDecimal newActvtyUsAmt, BigDecimal newActvtyCnAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Date stmtPrdBgDt, BigDecimal rbtGvn, BigDecimal intrstChrgd, BigDecimal ltFeeChrgd, BigDecimal allOthFeeChrgd, BigDecimal newActvtyUsMcAmt, BigDecimal newActvtyUsPropAmt, BigDecimal newActvtyCnMcAmt, BigDecimal newActvtyCnPropAmt) {
        this.consInvSummPK = consInvSummPK;
        this.totDueUsAmt = totDueUsAmt;
        this.totDueCnAmt = totDueCnAmt;
        this.invDueDt = invDueDt;
        this.prevBalAmt = prevBalAmt;
        this.paymntsAdjAmt = paymntsAdjAmt;
        this.newActvtyUsAmt = newActvtyUsAmt;
        this.newActvtyCnAmt = newActvtyCnAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.stmtPrdBgDt = stmtPrdBgDt;
        this.rbtGvn = rbtGvn;
        this.intrstChrgd = intrstChrgd;
        this.ltFeeChrgd = ltFeeChrgd;
        this.allOthFeeChrgd = allOthFeeChrgd;
        this.newActvtyUsMcAmt = newActvtyUsMcAmt;
        this.newActvtyUsPropAmt = newActvtyUsPropAmt;
        this.newActvtyCnMcAmt = newActvtyCnMcAmt;
        this.newActvtyCnPropAmt = newActvtyCnPropAmt;
    }

    public ConsInvSumm(String acctNbr, String companyCd, Date invDt) {
        this.consInvSummPK = new ConsInvSummPK(acctNbr, companyCd, invDt);
    }

    public ConsInvSummPK getConsInvSummPK() {
        return consInvSummPK;
    }

    public void setConsInvSummPK(ConsInvSummPK consInvSummPK) {
        this.consInvSummPK = consInvSummPK;
    }

    public BigDecimal getTotDueUsAmt() {
        return totDueUsAmt;
    }

    public void setTotDueUsAmt(BigDecimal totDueUsAmt) {
        this.totDueUsAmt = totDueUsAmt;
    }

    public BigDecimal getTotDueCnAmt() {
        return totDueCnAmt;
    }

    public void setTotDueCnAmt(BigDecimal totDueCnAmt) {
        this.totDueCnAmt = totDueCnAmt;
    }

    public Date getInvDueDt() {
        return invDueDt;
    }

    public void setInvDueDt(Date invDueDt) {
        this.invDueDt = invDueDt;
    }

    public BigDecimal getPrevBalAmt() {
        return prevBalAmt;
    }

    public void setPrevBalAmt(BigDecimal prevBalAmt) {
        this.prevBalAmt = prevBalAmt;
    }

    public BigDecimal getPaymntsAdjAmt() {
        return paymntsAdjAmt;
    }

    public void setPaymntsAdjAmt(BigDecimal paymntsAdjAmt) {
        this.paymntsAdjAmt = paymntsAdjAmt;
    }

    public BigDecimal getNewActvtyUsAmt() {
        return newActvtyUsAmt;
    }

    public void setNewActvtyUsAmt(BigDecimal newActvtyUsAmt) {
        this.newActvtyUsAmt = newActvtyUsAmt;
    }

    public BigDecimal getNewActvtyCnAmt() {
        return newActvtyCnAmt;
    }

    public void setNewActvtyCnAmt(BigDecimal newActvtyCnAmt) {
        this.newActvtyCnAmt = newActvtyCnAmt;
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

    public Date getStmtPrdBgDt() {
        return stmtPrdBgDt;
    }

    public void setStmtPrdBgDt(Date stmtPrdBgDt) {
        this.stmtPrdBgDt = stmtPrdBgDt;
    }

    public BigDecimal getRbtGvn() {
        return rbtGvn;
    }

    public void setRbtGvn(BigDecimal rbtGvn) {
        this.rbtGvn = rbtGvn;
    }

    public BigDecimal getIntrstChrgd() {
        return intrstChrgd;
    }

    public void setIntrstChrgd(BigDecimal intrstChrgd) {
        this.intrstChrgd = intrstChrgd;
    }

    public BigDecimal getLtFeeChrgd() {
        return ltFeeChrgd;
    }

    public void setLtFeeChrgd(BigDecimal ltFeeChrgd) {
        this.ltFeeChrgd = ltFeeChrgd;
    }

    public BigDecimal getAllOthFeeChrgd() {
        return allOthFeeChrgd;
    }

    public void setAllOthFeeChrgd(BigDecimal allOthFeeChrgd) {
        this.allOthFeeChrgd = allOthFeeChrgd;
    }

    public BigDecimal getNewActvtyUsMcAmt() {
        return newActvtyUsMcAmt;
    }

    public void setNewActvtyUsMcAmt(BigDecimal newActvtyUsMcAmt) {
        this.newActvtyUsMcAmt = newActvtyUsMcAmt;
    }

    public BigDecimal getNewActvtyUsPropAmt() {
        return newActvtyUsPropAmt;
    }

    public void setNewActvtyUsPropAmt(BigDecimal newActvtyUsPropAmt) {
        this.newActvtyUsPropAmt = newActvtyUsPropAmt;
    }

    public BigDecimal getNewActvtyCnMcAmt() {
        return newActvtyCnMcAmt;
    }

    public void setNewActvtyCnMcAmt(BigDecimal newActvtyCnMcAmt) {
        this.newActvtyCnMcAmt = newActvtyCnMcAmt;
    }

    public BigDecimal getNewActvtyCnPropAmt() {
        return newActvtyCnPropAmt;
    }

    public void setNewActvtyCnPropAmt(BigDecimal newActvtyCnPropAmt) {
        this.newActvtyCnPropAmt = newActvtyCnPropAmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consInvSummPK != null ? consInvSummPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ConsInvSumm)) {
            return false;
        }
        ConsInvSumm other = (ConsInvSumm) object;
        if ((this.consInvSummPK == null && other.consInvSummPK != null) || (this.consInvSummPK != null && !this.consInvSummPK.equals(other.consInvSummPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ConsInvSumm[ consInvSummPK=" + consInvSummPK + " ]";
    }

}
