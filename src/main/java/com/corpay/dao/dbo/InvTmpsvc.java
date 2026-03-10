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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "INV_TMPSVC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvTmpsvc.findAll", query = "SELECT i FROM InvTmpsvc i")})
public class InvTmpsvc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvTmpsvcPK invTmpsvcPK;
    @Basic(optional = false)
    @Column(name = "TMP_DB_OR_CR")
    private Character tmpDbOrCr;
    @Basic(optional = false)
    @Column(name = "BLNG_TYP")
    private Character blngTyp;
    @Basic(optional = false)
    @Column(name = "CUST_CODE")
    private String custCode;
    @Basic(optional = false)
    @Column(name = "COMM_CODE")
    private String commCode;
    @Basic(optional = false)
    @Column(name = "TEMP_NAME_ID")
    private String tempNameId;
    @Basic(optional = false)
    @Column(name = "EMP_SSN")
    private String empSsn;
    @Basic(optional = false)
    @Column(name = "JOB_DESC")
    private String jobDesc;
    @Basic(optional = false)
    @Column(name = "JOB_CODE")
    private String jobCode;
    @Basic(optional = false)
    @Column(name = "FLAT_RATE_IND")
    private Character flatRateInd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "REG_HRS_WRKD")
    private BigDecimal regHrsWrkd;
    @Basic(optional = false)
    @Column(name = "REG_HRS_RATE")
    private BigDecimal regHrsRate;
    @Basic(optional = false)
    @Column(name = "OVT_HRS_WRKD")
    private BigDecimal ovtHrsWrkd;
    @Basic(optional = false)
    @Column(name = "OVT_HRS_RATE")
    private BigDecimal ovtHrsRate;
    @Basic(optional = false)
    @Column(name = "TEMP_START_DT")
    private int tempStartDt;
    @Basic(optional = false)
    @Column(name = "TEMP_WEEK_END")
    private int tempWeekEnd;
    @Basic(optional = false)
    @Column(name = "RQSTR_NAME_ID")
    private String rqstrNameId;
    @Basic(optional = false)
    @Column(name = "SUPVR_NAME_ID")
    private String supvrNameId;
    @Basic(optional = false)
    @Column(name = "TIME_SHEET_NUM")
    private String timeSheetNum;
    @Basic(optional = false)
    @Column(name = "DISC_AMT")
    private BigDecimal discAmt;
    @Basic(optional = false)
    @Column(name = "SUBTOT_AMT")
    private BigDecimal subtotAmt;
    @Basic(optional = false)
    @Column(name = "TAX_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date taxTs;
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
    @Column(name = "TAX_EXEMPT_IND")
    private Character taxExemptInd;
    @Basic(optional = false)
    @Column(name = "TOTAL_TAX_AMT")
    private BigDecimal totalTaxAmt;
    @Basic(optional = false)
    @Column(name = "TOTAL_TAX_COLL_IND")
    private Character totalTaxCollInd;
    @Basic(optional = false)
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Basic(optional = false)
    @Column(name = "MEXP_DESC_1")
    private String mexpDesc1;
    @Basic(optional = false)
    @Column(name = "MEXP_AMT_1")
    private BigDecimal mexpAmt1;
    @Basic(optional = false)
    @Column(name = "MEXP_AMT_SI_1")
    private Character mexpAmtSi1;
    @Basic(optional = false)
    @Column(name = "MEXP_DESC_2")
    private String mexpDesc2;
    @Basic(optional = false)
    @Column(name = "MEXP_AMT_2")
    private BigDecimal mexpAmt2;
    @Basic(optional = false)
    @Column(name = "MEXP_AMT_SI_2")
    private Character mexpAmtSi2;
    @Basic(optional = false)
    @Column(name = "MEXP_DESC_3")
    private String mexpDesc3;
    @Basic(optional = false)
    @Column(name = "MEXP_AMT_3")
    private BigDecimal mexpAmt3;
    @Basic(optional = false)
    @Column(name = "MEXP_AMT_SI_3")
    private Character mexpAmtSi3;
    @Basic(optional = false)
    @Column(name = "MEXP_DESC_4")
    private String mexpDesc4;
    @Basic(optional = false)
    @Column(name = "MEXP_AMT_4")
    private BigDecimal mexpAmt4;
    @Basic(optional = false)
    @Column(name = "MEXP_AMT_SI_4")
    private Character mexpAmtSi4;

    public InvTmpsvc() {
    }

    public InvTmpsvc(InvTmpsvcPK invTmpsvcPK) {
        this.invTmpsvcPK = invTmpsvcPK;
    }

    public InvTmpsvc(InvTmpsvcPK invTmpsvcPK, Character tmpDbOrCr, Character blngTyp, String custCode, String commCode, String tempNameId, String empSsn, String jobDesc, String jobCode, Character flatRateInd, BigDecimal regHrsWrkd, BigDecimal regHrsRate, BigDecimal ovtHrsWrkd, BigDecimal ovtHrsRate, int tempStartDt, int tempWeekEnd, String rqstrNameId, String supvrNameId, String timeSheetNum, BigDecimal discAmt, BigDecimal subtotAmt, Date taxTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character taxExemptInd, BigDecimal totalTaxAmt, Character totalTaxCollInd, String customerId, String mexpDesc1, BigDecimal mexpAmt1, Character mexpAmtSi1, String mexpDesc2, BigDecimal mexpAmt2, Character mexpAmtSi2, String mexpDesc3, BigDecimal mexpAmt3, Character mexpAmtSi3, String mexpDesc4, BigDecimal mexpAmt4, Character mexpAmtSi4) {
        this.invTmpsvcPK = invTmpsvcPK;
        this.tmpDbOrCr = tmpDbOrCr;
        this.blngTyp = blngTyp;
        this.custCode = custCode;
        this.commCode = commCode;
        this.tempNameId = tempNameId;
        this.empSsn = empSsn;
        this.jobDesc = jobDesc;
        this.jobCode = jobCode;
        this.flatRateInd = flatRateInd;
        this.regHrsWrkd = regHrsWrkd;
        this.regHrsRate = regHrsRate;
        this.ovtHrsWrkd = ovtHrsWrkd;
        this.ovtHrsRate = ovtHrsRate;
        this.tempStartDt = tempStartDt;
        this.tempWeekEnd = tempWeekEnd;
        this.rqstrNameId = rqstrNameId;
        this.supvrNameId = supvrNameId;
        this.timeSheetNum = timeSheetNum;
        this.discAmt = discAmt;
        this.subtotAmt = subtotAmt;
        this.taxTs = taxTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.taxExemptInd = taxExemptInd;
        this.totalTaxAmt = totalTaxAmt;
        this.totalTaxCollInd = totalTaxCollInd;
        this.customerId = customerId;
        this.mexpDesc1 = mexpDesc1;
        this.mexpAmt1 = mexpAmt1;
        this.mexpAmtSi1 = mexpAmtSi1;
        this.mexpDesc2 = mexpDesc2;
        this.mexpAmt2 = mexpAmt2;
        this.mexpAmtSi2 = mexpAmtSi2;
        this.mexpDesc3 = mexpDesc3;
        this.mexpAmt3 = mexpAmt3;
        this.mexpAmtSi3 = mexpAmtSi3;
        this.mexpDesc4 = mexpDesc4;
        this.mexpAmt4 = mexpAmt4;
        this.mexpAmtSi4 = mexpAmtSi4;
    }

    public InvTmpsvc(Date pstdDt, int trnsId, short seqNbr) {
        this.invTmpsvcPK = new InvTmpsvcPK(pstdDt, trnsId, seqNbr);
    }

    public InvTmpsvcPK getInvTmpsvcPK() {
        return invTmpsvcPK;
    }

    public void setInvTmpsvcPK(InvTmpsvcPK invTmpsvcPK) {
        this.invTmpsvcPK = invTmpsvcPK;
    }

    public Character getTmpDbOrCr() {
        return tmpDbOrCr;
    }

    public void setTmpDbOrCr(Character tmpDbOrCr) {
        this.tmpDbOrCr = tmpDbOrCr;
    }

    public Character getBlngTyp() {
        return blngTyp;
    }

    public void setBlngTyp(Character blngTyp) {
        this.blngTyp = blngTyp;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getCommCode() {
        return commCode;
    }

    public void setCommCode(String commCode) {
        this.commCode = commCode;
    }

    public String getTempNameId() {
        return tempNameId;
    }

    public void setTempNameId(String tempNameId) {
        this.tempNameId = tempNameId;
    }

    public String getEmpSsn() {
        return empSsn;
    }

    public void setEmpSsn(String empSsn) {
        this.empSsn = empSsn;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public Character getFlatRateInd() {
        return flatRateInd;
    }

    public void setFlatRateInd(Character flatRateInd) {
        this.flatRateInd = flatRateInd;
    }

    public BigDecimal getRegHrsWrkd() {
        return regHrsWrkd;
    }

    public void setRegHrsWrkd(BigDecimal regHrsWrkd) {
        this.regHrsWrkd = regHrsWrkd;
    }

    public BigDecimal getRegHrsRate() {
        return regHrsRate;
    }

    public void setRegHrsRate(BigDecimal regHrsRate) {
        this.regHrsRate = regHrsRate;
    }

    public BigDecimal getOvtHrsWrkd() {
        return ovtHrsWrkd;
    }

    public void setOvtHrsWrkd(BigDecimal ovtHrsWrkd) {
        this.ovtHrsWrkd = ovtHrsWrkd;
    }

    public BigDecimal getOvtHrsRate() {
        return ovtHrsRate;
    }

    public void setOvtHrsRate(BigDecimal ovtHrsRate) {
        this.ovtHrsRate = ovtHrsRate;
    }

    public int getTempStartDt() {
        return tempStartDt;
    }

    public void setTempStartDt(int tempStartDt) {
        this.tempStartDt = tempStartDt;
    }

    public int getTempWeekEnd() {
        return tempWeekEnd;
    }

    public void setTempWeekEnd(int tempWeekEnd) {
        this.tempWeekEnd = tempWeekEnd;
    }

    public String getRqstrNameId() {
        return rqstrNameId;
    }

    public void setRqstrNameId(String rqstrNameId) {
        this.rqstrNameId = rqstrNameId;
    }

    public String getSupvrNameId() {
        return supvrNameId;
    }

    public void setSupvrNameId(String supvrNameId) {
        this.supvrNameId = supvrNameId;
    }

    public String getTimeSheetNum() {
        return timeSheetNum;
    }

    public void setTimeSheetNum(String timeSheetNum) {
        this.timeSheetNum = timeSheetNum;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
    }

    public BigDecimal getSubtotAmt() {
        return subtotAmt;
    }

    public void setSubtotAmt(BigDecimal subtotAmt) {
        this.subtotAmt = subtotAmt;
    }

    public Date getTaxTs() {
        return taxTs;
    }

    public void setTaxTs(Date taxTs) {
        this.taxTs = taxTs;
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

    public Character getTaxExemptInd() {
        return taxExemptInd;
    }

    public void setTaxExemptInd(Character taxExemptInd) {
        this.taxExemptInd = taxExemptInd;
    }

    public BigDecimal getTotalTaxAmt() {
        return totalTaxAmt;
    }

    public void setTotalTaxAmt(BigDecimal totalTaxAmt) {
        this.totalTaxAmt = totalTaxAmt;
    }

    public Character getTotalTaxCollInd() {
        return totalTaxCollInd;
    }

    public void setTotalTaxCollInd(Character totalTaxCollInd) {
        this.totalTaxCollInd = totalTaxCollInd;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMexpDesc1() {
        return mexpDesc1;
    }

    public void setMexpDesc1(String mexpDesc1) {
        this.mexpDesc1 = mexpDesc1;
    }

    public BigDecimal getMexpAmt1() {
        return mexpAmt1;
    }

    public void setMexpAmt1(BigDecimal mexpAmt1) {
        this.mexpAmt1 = mexpAmt1;
    }

    public Character getMexpAmtSi1() {
        return mexpAmtSi1;
    }

    public void setMexpAmtSi1(Character mexpAmtSi1) {
        this.mexpAmtSi1 = mexpAmtSi1;
    }

    public String getMexpDesc2() {
        return mexpDesc2;
    }

    public void setMexpDesc2(String mexpDesc2) {
        this.mexpDesc2 = mexpDesc2;
    }

    public BigDecimal getMexpAmt2() {
        return mexpAmt2;
    }

    public void setMexpAmt2(BigDecimal mexpAmt2) {
        this.mexpAmt2 = mexpAmt2;
    }

    public Character getMexpAmtSi2() {
        return mexpAmtSi2;
    }

    public void setMexpAmtSi2(Character mexpAmtSi2) {
        this.mexpAmtSi2 = mexpAmtSi2;
    }

    public String getMexpDesc3() {
        return mexpDesc3;
    }

    public void setMexpDesc3(String mexpDesc3) {
        this.mexpDesc3 = mexpDesc3;
    }

    public BigDecimal getMexpAmt3() {
        return mexpAmt3;
    }

    public void setMexpAmt3(BigDecimal mexpAmt3) {
        this.mexpAmt3 = mexpAmt3;
    }

    public Character getMexpAmtSi3() {
        return mexpAmtSi3;
    }

    public void setMexpAmtSi3(Character mexpAmtSi3) {
        this.mexpAmtSi3 = mexpAmtSi3;
    }

    public String getMexpDesc4() {
        return mexpDesc4;
    }

    public void setMexpDesc4(String mexpDesc4) {
        this.mexpDesc4 = mexpDesc4;
    }

    public BigDecimal getMexpAmt4() {
        return mexpAmt4;
    }

    public void setMexpAmt4(BigDecimal mexpAmt4) {
        this.mexpAmt4 = mexpAmt4;
    }

    public Character getMexpAmtSi4() {
        return mexpAmtSi4;
    }

    public void setMexpAmtSi4(Character mexpAmtSi4) {
        this.mexpAmtSi4 = mexpAmtSi4;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invTmpsvcPK != null ? invTmpsvcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvTmpsvc)) {
            return false;
        }
        InvTmpsvc other = (InvTmpsvc) object;
        if ((this.invTmpsvcPK == null && other.invTmpsvcPK != null) || (this.invTmpsvcPK != null && !this.invTmpsvcPK.equals(other.invTmpsvcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvTmpsvc[ invTmpsvcPK=" + invTmpsvcPK + " ]";
    }
    
}
