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
@Table(name = "FUND_TRNSFR_HIST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FundTrnsfrHist.findAll", query = "SELECT f FROM FundTrnsfrHist f")})
public class FundTrnsfrHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FUND_TRNSFR_HIST_ID")
    private String fundTrnsfrHistId;
    @Basic(optional = false)
    @Column(name = "USR_COMP_ID")
    private int usrCompId;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "FND_ACCT_ID")
    private String fndAcctId;
    @Basic(optional = false)
    @Column(name = "FND_TRNSFR_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fndTrnsfrTs;
    @Basic(optional = false)
    @Column(name = "FND_STAT_RSN_TXT")
    private String fndStatRsnTxt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "FND_TRNSFR_AMT")
    private BigDecimal fndTrnsfrAmt;
    @Basic(optional = false)
    @Column(name = "FND_TRACE_ID")
    private String fndTraceId;
    @Basic(optional = false)
    @Column(name = "FND_PYMT_ID")
    private String fndPymtId;
    @Basic(optional = false)
    @Column(name = "FND_CMNTS_TXT")
    private String fndCmntsTxt;
    @Basic(optional = false)
    @Column(name = "FND_CURR_CD")
    private String fndCurrCd;
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

    public FundTrnsfrHist() {
    }

    public FundTrnsfrHist(String fundTrnsfrHistId) {
        this.fundTrnsfrHistId = fundTrnsfrHistId;
    }

    public FundTrnsfrHist(String fundTrnsfrHistId, int usrCompId, String acctNbr, String fndAcctId, Date fndTrnsfrTs, String fndStatRsnTxt, BigDecimal fndTrnsfrAmt, String fndTraceId, String fndPymtId, String fndCmntsTxt, String fndCurrCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fundTrnsfrHistId = fundTrnsfrHistId;
        this.usrCompId = usrCompId;
        this.acctNbr = acctNbr;
        this.fndAcctId = fndAcctId;
        this.fndTrnsfrTs = fndTrnsfrTs;
        this.fndStatRsnTxt = fndStatRsnTxt;
        this.fndTrnsfrAmt = fndTrnsfrAmt;
        this.fndTraceId = fndTraceId;
        this.fndPymtId = fndPymtId;
        this.fndCmntsTxt = fndCmntsTxt;
        this.fndCurrCd = fndCurrCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getFundTrnsfrHistId() {
        return fundTrnsfrHistId;
    }

    public void setFundTrnsfrHistId(String fundTrnsfrHistId) {
        this.fundTrnsfrHistId = fundTrnsfrHistId;
    }

    public int getUsrCompId() {
        return usrCompId;
    }

    public void setUsrCompId(int usrCompId) {
        this.usrCompId = usrCompId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getFndAcctId() {
        return fndAcctId;
    }

    public void setFndAcctId(String fndAcctId) {
        this.fndAcctId = fndAcctId;
    }

    public Date getFndTrnsfrTs() {
        return fndTrnsfrTs;
    }

    public void setFndTrnsfrTs(Date fndTrnsfrTs) {
        this.fndTrnsfrTs = fndTrnsfrTs;
    }

    public String getFndStatRsnTxt() {
        return fndStatRsnTxt;
    }

    public void setFndStatRsnTxt(String fndStatRsnTxt) {
        this.fndStatRsnTxt = fndStatRsnTxt;
    }

    public BigDecimal getFndTrnsfrAmt() {
        return fndTrnsfrAmt;
    }

    public void setFndTrnsfrAmt(BigDecimal fndTrnsfrAmt) {
        this.fndTrnsfrAmt = fndTrnsfrAmt;
    }

    public String getFndTraceId() {
        return fndTraceId;
    }

    public void setFndTraceId(String fndTraceId) {
        this.fndTraceId = fndTraceId;
    }

    public String getFndPymtId() {
        return fndPymtId;
    }

    public void setFndPymtId(String fndPymtId) {
        this.fndPymtId = fndPymtId;
    }

    public String getFndCmntsTxt() {
        return fndCmntsTxt;
    }

    public void setFndCmntsTxt(String fndCmntsTxt) {
        this.fndCmntsTxt = fndCmntsTxt;
    }

    public String getFndCurrCd() {
        return fndCurrCd;
    }

    public void setFndCurrCd(String fndCurrCd) {
        this.fndCurrCd = fndCurrCd;
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
        hash += (fundTrnsfrHistId != null ? fundTrnsfrHistId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FundTrnsfrHist)) {
            return false;
        }
        FundTrnsfrHist other = (FundTrnsfrHist) object;
        if ((this.fundTrnsfrHistId == null && other.fundTrnsfrHistId != null) || (this.fundTrnsfrHistId != null && !this.fundTrnsfrHistId.equals(other.fundTrnsfrHistId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FundTrnsfrHist[ fundTrnsfrHistId=" + fundTrnsfrHistId + " ]";
    }
    
}
