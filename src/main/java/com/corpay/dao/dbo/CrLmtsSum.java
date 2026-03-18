package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "CR_LMTS_SUM", catalog = "", schema = "DBO")
public class CrLmtsSum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CL_TIE_CD")
    private Integer clTieCd;
    @Basic(optional = false)
    @Column(name = "CL_LAST_DEPOSIT_DT")
    @Temporal(TemporalType.DATE)
    private Date clLastDepositDt;

    @Basic(optional = false)
    @Column(name = "CL_SUM_GLOBAL_CR_LMT")
    private BigDecimal clSumGlobalCrLmt;
    @Basic(optional = false)
    @Column(name = "CL_SUM_GLOBAL_AR_BAL")
    private BigDecimal clSumGlobalArBal;
    @Basic(optional = false)
    @Column(name = "CL_SUM_GLOBAL_CSH_RCVD")
    private BigDecimal clSumGlobalCshRcvd;
    @Basic(optional = false)
    @Column(name = "CL_SUM_GLOBAL_CUR_DY")
    private BigDecimal clSumGlobalCurDy;
    @Basic(optional = false)
    @Column(name = "CL_SUM_GLOBAL_PREAUTH")
    private BigDecimal clSumGlobalPreauth;
    @Basic(optional = false)
    @Column(name = "CL_SUM_GLOBAL_UNBILLED")
    private BigDecimal clSumGlobalUnbilled;
    @Basic(optional = false)
    @Column(name = "CL_SUM_GLOBAL_TEMP_LMT")
    private BigDecimal clSumGlobalTempLmt;
    @Basic(optional = false)
    @Column(name = "CL_SUM_ACCNT_CR_LMT")
    private BigDecimal clSumAccntCrLmt;
    @Basic(optional = false)
    @Column(name = "CL_SUM_ACCNT_AR_BAL")
    private BigDecimal clSumAccntArBal;
    @Basic(optional = false)
    @Column(name = "CL_SUM_ACCNT_CSH_RCVD")
    private BigDecimal clSumAccntCshRcvd;
    @Basic(optional = false)
    @Column(name = "CL_SUM_ACCNT_CUR_DY")
    private BigDecimal clSumAccntCurDy;
    @Basic(optional = false)
    @Column(name = "CL_SUM_ACCNT_PREAUTH")
    private BigDecimal clSumAccntPreauth;
    @Basic(optional = false)
    @Column(name = "CL_SUM_ACCNT_UNBILLED")
    private BigDecimal clSumAccntUnbilled;
    @Basic(optional = false)
    @Column(name = "CL_SUM_ACCNT_TEMP_LMT")
    private BigDecimal clSumAccntTempLmt;
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
    @Column(name = "CL_SUM_GLOBAL_CUR_TMP_AMT")
    private BigDecimal clSumGlobalCurTmpAmt;
    @Basic(optional = false)
    @Column(name = "CL_SUM_INTL_TIE_CD")
    private String clSumIntlTieCd;
    @Basic(optional = false)
    @Column(name = "CL_SUM_INTL_TIE_CD_DESC")
    private String clSumIntlTieCdDesc;
    @Basic(optional = false)
    @Column(name = "CL_SUM_GLOBAL_TMP_EXP_DT")
    @Temporal(TemporalType.DATE)
    private Date clSumGlobalTmpExpDt;

    public CrLmtsSum() {
    }

    public CrLmtsSum(Integer clTieCd) {
        this.clTieCd = clTieCd;
    }

    public CrLmtsSum(Integer clTieCd, Date clLastDepositDt, BigDecimal clSumGlobalCrLmt, BigDecimal clSumGlobalArBal, BigDecimal clSumGlobalCshRcvd, BigDecimal clSumGlobalCurDy, BigDecimal clSumGlobalPreauth, BigDecimal clSumGlobalUnbilled, BigDecimal clSumGlobalTempLmt, BigDecimal clSumAccntCrLmt, BigDecimal clSumAccntArBal, BigDecimal clSumAccntCshRcvd, BigDecimal clSumAccntCurDy, BigDecimal clSumAccntPreauth, BigDecimal clSumAccntUnbilled, BigDecimal clSumAccntTempLmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, BigDecimal clSumGlobalCurTmpAmt, String clSumIntlTieCd, String clSumIntlTieCdDesc, Date clSumGlobalTmpExpDt) {
        this.clTieCd = clTieCd;
        this.clLastDepositDt = clLastDepositDt;
        this.clSumGlobalCrLmt = clSumGlobalCrLmt;
        this.clSumGlobalArBal = clSumGlobalArBal;
        this.clSumGlobalCshRcvd = clSumGlobalCshRcvd;
        this.clSumGlobalCurDy = clSumGlobalCurDy;
        this.clSumGlobalPreauth = clSumGlobalPreauth;
        this.clSumGlobalUnbilled = clSumGlobalUnbilled;
        this.clSumGlobalTempLmt = clSumGlobalTempLmt;
        this.clSumAccntCrLmt = clSumAccntCrLmt;
        this.clSumAccntArBal = clSumAccntArBal;
        this.clSumAccntCshRcvd = clSumAccntCshRcvd;
        this.clSumAccntCurDy = clSumAccntCurDy;
        this.clSumAccntPreauth = clSumAccntPreauth;
        this.clSumAccntUnbilled = clSumAccntUnbilled;
        this.clSumAccntTempLmt = clSumAccntTempLmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.clSumGlobalCurTmpAmt = clSumGlobalCurTmpAmt;
        this.clSumIntlTieCd = clSumIntlTieCd;
        this.clSumIntlTieCdDesc = clSumIntlTieCdDesc;
        this.clSumGlobalTmpExpDt = clSumGlobalTmpExpDt;
    }

    public Integer getClTieCd() {
        return clTieCd;
    }

    public void setClTieCd(Integer clTieCd) {
        this.clTieCd = clTieCd;
    }

    public Date getClLastDepositDt() {
        return clLastDepositDt;
    }

    public void setClLastDepositDt(Date clLastDepositDt) {
        this.clLastDepositDt = clLastDepositDt;
    }

    public BigDecimal getClSumGlobalCrLmt() {
        return clSumGlobalCrLmt;
    }

    public void setClSumGlobalCrLmt(BigDecimal clSumGlobalCrLmt) {
        this.clSumGlobalCrLmt = clSumGlobalCrLmt;
    }

    public BigDecimal getClSumGlobalArBal() {
        return clSumGlobalArBal;
    }

    public void setClSumGlobalArBal(BigDecimal clSumGlobalArBal) {
        this.clSumGlobalArBal = clSumGlobalArBal;
    }

    public BigDecimal getClSumGlobalCshRcvd() {
        return clSumGlobalCshRcvd;
    }

    public void setClSumGlobalCshRcvd(BigDecimal clSumGlobalCshRcvd) {
        this.clSumGlobalCshRcvd = clSumGlobalCshRcvd;
    }

    public BigDecimal getClSumGlobalCurDy() {
        return clSumGlobalCurDy;
    }

    public void setClSumGlobalCurDy(BigDecimal clSumGlobalCurDy) {
        this.clSumGlobalCurDy = clSumGlobalCurDy;
    }

    public BigDecimal getClSumGlobalPreauth() {
        return clSumGlobalPreauth;
    }

    public void setClSumGlobalPreauth(BigDecimal clSumGlobalPreauth) {
        this.clSumGlobalPreauth = clSumGlobalPreauth;
    }

    public BigDecimal getClSumGlobalUnbilled() {
        return clSumGlobalUnbilled;
    }

    public void setClSumGlobalUnbilled(BigDecimal clSumGlobalUnbilled) {
        this.clSumGlobalUnbilled = clSumGlobalUnbilled;
    }

    public BigDecimal getClSumGlobalTempLmt() {
        return clSumGlobalTempLmt;
    }

    public void setClSumGlobalTempLmt(BigDecimal clSumGlobalTempLmt) {
        this.clSumGlobalTempLmt = clSumGlobalTempLmt;
    }

    public BigDecimal getClSumAccntCrLmt() {
        return clSumAccntCrLmt;
    }

    public void setClSumAccntCrLmt(BigDecimal clSumAccntCrLmt) {
        this.clSumAccntCrLmt = clSumAccntCrLmt;
    }

    public BigDecimal getClSumAccntArBal() {
        return clSumAccntArBal;
    }

    public void setClSumAccntArBal(BigDecimal clSumAccntArBal) {
        this.clSumAccntArBal = clSumAccntArBal;
    }

    public BigDecimal getClSumAccntCshRcvd() {
        return clSumAccntCshRcvd;
    }

    public void setClSumAccntCshRcvd(BigDecimal clSumAccntCshRcvd) {
        this.clSumAccntCshRcvd = clSumAccntCshRcvd;
    }

    public BigDecimal getClSumAccntCurDy() {
        return clSumAccntCurDy;
    }

    public void setClSumAccntCurDy(BigDecimal clSumAccntCurDy) {
        this.clSumAccntCurDy = clSumAccntCurDy;
    }

    public BigDecimal getClSumAccntPreauth() {
        return clSumAccntPreauth;
    }

    public void setClSumAccntPreauth(BigDecimal clSumAccntPreauth) {
        this.clSumAccntPreauth = clSumAccntPreauth;
    }

    public BigDecimal getClSumAccntUnbilled() {
        return clSumAccntUnbilled;
    }

    public void setClSumAccntUnbilled(BigDecimal clSumAccntUnbilled) {
        this.clSumAccntUnbilled = clSumAccntUnbilled;
    }

    public BigDecimal getClSumAccntTempLmt() {
        return clSumAccntTempLmt;
    }

    public void setClSumAccntTempLmt(BigDecimal clSumAccntTempLmt) {
        this.clSumAccntTempLmt = clSumAccntTempLmt;
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

    public BigDecimal getClSumGlobalCurTmpAmt() {
        return clSumGlobalCurTmpAmt;
    }

    public void setClSumGlobalCurTmpAmt(BigDecimal clSumGlobalCurTmpAmt) {
        this.clSumGlobalCurTmpAmt = clSumGlobalCurTmpAmt;
    }

    public String getClSumIntlTieCd() {
        return clSumIntlTieCd;
    }

    public void setClSumIntlTieCd(String clSumIntlTieCd) {
        this.clSumIntlTieCd = clSumIntlTieCd;
    }

    public String getClSumIntlTieCdDesc() {
        return clSumIntlTieCdDesc;
    }

    public void setClSumIntlTieCdDesc(String clSumIntlTieCdDesc) {
        this.clSumIntlTieCdDesc = clSumIntlTieCdDesc;
    }

    public Date getClSumGlobalTmpExpDt() {
        return clSumGlobalTmpExpDt;
    }

    public void setClSumGlobalTmpExpDt(Date clSumGlobalTmpExpDt) {
        this.clSumGlobalTmpExpDt = clSumGlobalTmpExpDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clTieCd != null ? clTieCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrLmtsSum)) {
            return false;
        }
        CrLmtsSum other = (CrLmtsSum) object;
        if ((this.clTieCd == null && other.clTieCd != null) || (this.clTieCd != null && !this.clTieCd.equals(other.clTieCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrLmtsSum[ clTieCd=" + clTieCd + " ]";
    }

}
