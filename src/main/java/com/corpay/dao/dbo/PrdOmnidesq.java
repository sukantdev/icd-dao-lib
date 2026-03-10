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
@Table(name = "PRD_OMNIDESQ", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdOmnidesq.findAll", query = "SELECT p FROM PrdOmnidesq p")})
public class PrdOmnidesq implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdOmnidesqPK prdOmnidesqPK;
    @Basic(optional = false)
    @Column(name = "TRNDR_CD")
    private String trndrCd;
    @Basic(optional = false)
    @Column(name = "CDN_ACCT_CD")
    private String cdnAcctCd;
    @Basic(optional = false)
    @Column(name = "NEW_NSTL_FLG")
    private Character newNstlFlg;
    @Basic(optional = false)
    @Column(name = "TS_NM")
    private String tsNm;
    @Basic(optional = false)
    @Column(name = "REQ_TYP_FLGS")
    private short reqTypFlgs;
    @Basic(optional = false)
    @Column(name = "SHP_DT")
    @Temporal(TemporalType.DATE)
    private Date shpDt;
    @Basic(optional = false)
    @Column(name = "NSTL_DT")
    @Temporal(TemporalType.DATE)
    private Date nstlDt;
    @Basic(optional = false)
    @Column(name = "LOC_OPEN_FLG")
    private Character locOpenFlg;
    @Basic(optional = false)
    @Column(name = "HRDWR_FLGS")
    private short hrdwrFlgs;
    @Basic(optional = false)
    @Column(name = "SCNG_FLGS")
    private short scngFlgs;
    @Basic(optional = false)
    @Column(name = "MISC_EQPMNT_FLGS")
    private short miscEqpmntFlgs;
    @Basic(optional = false)
    @Column(name = "PAY_AT_PUMP_FLGS")
    private short payAtPumpFlgs;
    @Basic(optional = false)
    @Column(name = "TA_HRDWR_FLGS")
    private short taHrdwrFlgs;
    @Basic(optional = false)
    @Column(name = "TA_SFTWR_FLGS")
    private short taSftwrFlgs;
    @Basic(optional = false)
    @Column(name = "TA_MISC_EQPMNT_FLG")
    private Character taMiscEqpmntFlg;
    @Basic(optional = false)
    @Column(name = "TA_PUMP_PAY_FLGS")
    private short taPumpPayFlgs;
    @Basic(optional = false)
    @Column(name = "OMNIDESQ_PUMP_FLG")
    private Character omnidesqPumpFlg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "OMNIDESQ_AMT")
    private BigDecimal omnidesqAmt;
    @Basic(optional = false)
    @Column(name = "PAY_PUMP_AMT")
    private BigDecimal payPumpAmt;
    @Basic(optional = false)
    @Column(name = "CASH_LEASE_FLG")
    private Character cashLeaseFlg;
    @Basic(optional = false)
    @Column(name = "CASH_TERM_FLG")
    private Character cashTermFlg;
    @Basic(optional = false)
    @Column(name = "FULL_PAID_DT")
    @Temporal(TemporalType.DATE)
    private Date fullPaidDt;
    @Basic(optional = false)
    @Column(name = "LEASE_AMT")
    private BigDecimal leaseAmt;
    @Basic(optional = false)
    @Column(name = "MTHLY_RNTL_AMT")
    private BigDecimal mthlyRntlAmt;
    @Basic(optional = false)
    @Column(name = "NSTL_AMT")
    private BigDecimal nstlAmt;
    @Basic(optional = false)
    @Column(name = "DPST_CHK_MAIL_FLG")
    private Character dpstChkMailFlg;
    @Basic(optional = false)
    @Column(name = "DPST_CHK_RCVD_FLG")
    private Character dpstChkRcvdFlg;
    @Basic(optional = false)
    @Column(name = "DPST_CHK_NBR")
    private int dpstChkNbr;
    @Basic(optional = false)
    @Column(name = "DPST_CHK_AMT")
    private BigDecimal dpstChkAmt;
    @Basic(optional = false)
    @Column(name = "NSTL_CHK_RCVD_FLG")
    private Character nstlChkRcvdFlg;
    @Basic(optional = false)
    @Column(name = "NSTL_CHK_NBR")
    private int nstlChkNbr;
    @Basic(optional = false)
    @Column(name = "NSTL_CHK_AMT")
    private BigDecimal nstlChkAmt;
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

    public PrdOmnidesq() {
    }

    public PrdOmnidesq(PrdOmnidesqPK prdOmnidesqPK) {
        this.prdOmnidesqPK = prdOmnidesqPK;
    }

    public PrdOmnidesq(PrdOmnidesqPK prdOmnidesqPK, String trndrCd, String cdnAcctCd, Character newNstlFlg, String tsNm, short reqTypFlgs, Date shpDt, Date nstlDt, Character locOpenFlg, short hrdwrFlgs, short scngFlgs, short miscEqpmntFlgs, short payAtPumpFlgs, short taHrdwrFlgs, short taSftwrFlgs, Character taMiscEqpmntFlg, short taPumpPayFlgs, Character omnidesqPumpFlg, BigDecimal omnidesqAmt, BigDecimal payPumpAmt, Character cashLeaseFlg, Character cashTermFlg, Date fullPaidDt, BigDecimal leaseAmt, BigDecimal mthlyRntlAmt, BigDecimal nstlAmt, Character dpstChkMailFlg, Character dpstChkRcvdFlg, int dpstChkNbr, BigDecimal dpstChkAmt, Character nstlChkRcvdFlg, int nstlChkNbr, BigDecimal nstlChkAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdOmnidesqPK = prdOmnidesqPK;
        this.trndrCd = trndrCd;
        this.cdnAcctCd = cdnAcctCd;
        this.newNstlFlg = newNstlFlg;
        this.tsNm = tsNm;
        this.reqTypFlgs = reqTypFlgs;
        this.shpDt = shpDt;
        this.nstlDt = nstlDt;
        this.locOpenFlg = locOpenFlg;
        this.hrdwrFlgs = hrdwrFlgs;
        this.scngFlgs = scngFlgs;
        this.miscEqpmntFlgs = miscEqpmntFlgs;
        this.payAtPumpFlgs = payAtPumpFlgs;
        this.taHrdwrFlgs = taHrdwrFlgs;
        this.taSftwrFlgs = taSftwrFlgs;
        this.taMiscEqpmntFlg = taMiscEqpmntFlg;
        this.taPumpPayFlgs = taPumpPayFlgs;
        this.omnidesqPumpFlg = omnidesqPumpFlg;
        this.omnidesqAmt = omnidesqAmt;
        this.payPumpAmt = payPumpAmt;
        this.cashLeaseFlg = cashLeaseFlg;
        this.cashTermFlg = cashTermFlg;
        this.fullPaidDt = fullPaidDt;
        this.leaseAmt = leaseAmt;
        this.mthlyRntlAmt = mthlyRntlAmt;
        this.nstlAmt = nstlAmt;
        this.dpstChkMailFlg = dpstChkMailFlg;
        this.dpstChkRcvdFlg = dpstChkRcvdFlg;
        this.dpstChkNbr = dpstChkNbr;
        this.dpstChkAmt = dpstChkAmt;
        this.nstlChkRcvdFlg = nstlChkRcvdFlg;
        this.nstlChkNbr = nstlChkNbr;
        this.nstlChkAmt = nstlChkAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdOmnidesq(String applNbr, String childTyp) {
        this.prdOmnidesqPK = new PrdOmnidesqPK(applNbr, childTyp);
    }

    public PrdOmnidesqPK getPrdOmnidesqPK() {
        return prdOmnidesqPK;
    }

    public void setPrdOmnidesqPK(PrdOmnidesqPK prdOmnidesqPK) {
        this.prdOmnidesqPK = prdOmnidesqPK;
    }

    public String getTrndrCd() {
        return trndrCd;
    }

    public void setTrndrCd(String trndrCd) {
        this.trndrCd = trndrCd;
    }

    public String getCdnAcctCd() {
        return cdnAcctCd;
    }

    public void setCdnAcctCd(String cdnAcctCd) {
        this.cdnAcctCd = cdnAcctCd;
    }

    public Character getNewNstlFlg() {
        return newNstlFlg;
    }

    public void setNewNstlFlg(Character newNstlFlg) {
        this.newNstlFlg = newNstlFlg;
    }

    public String getTsNm() {
        return tsNm;
    }

    public void setTsNm(String tsNm) {
        this.tsNm = tsNm;
    }

    public short getReqTypFlgs() {
        return reqTypFlgs;
    }

    public void setReqTypFlgs(short reqTypFlgs) {
        this.reqTypFlgs = reqTypFlgs;
    }

    public Date getShpDt() {
        return shpDt;
    }

    public void setShpDt(Date shpDt) {
        this.shpDt = shpDt;
    }

    public Date getNstlDt() {
        return nstlDt;
    }

    public void setNstlDt(Date nstlDt) {
        this.nstlDt = nstlDt;
    }

    public Character getLocOpenFlg() {
        return locOpenFlg;
    }

    public void setLocOpenFlg(Character locOpenFlg) {
        this.locOpenFlg = locOpenFlg;
    }

    public short getHrdwrFlgs() {
        return hrdwrFlgs;
    }

    public void setHrdwrFlgs(short hrdwrFlgs) {
        this.hrdwrFlgs = hrdwrFlgs;
    }

    public short getScngFlgs() {
        return scngFlgs;
    }

    public void setScngFlgs(short scngFlgs) {
        this.scngFlgs = scngFlgs;
    }

    public short getMiscEqpmntFlgs() {
        return miscEqpmntFlgs;
    }

    public void setMiscEqpmntFlgs(short miscEqpmntFlgs) {
        this.miscEqpmntFlgs = miscEqpmntFlgs;
    }

    public short getPayAtPumpFlgs() {
        return payAtPumpFlgs;
    }

    public void setPayAtPumpFlgs(short payAtPumpFlgs) {
        this.payAtPumpFlgs = payAtPumpFlgs;
    }

    public short getTaHrdwrFlgs() {
        return taHrdwrFlgs;
    }

    public void setTaHrdwrFlgs(short taHrdwrFlgs) {
        this.taHrdwrFlgs = taHrdwrFlgs;
    }

    public short getTaSftwrFlgs() {
        return taSftwrFlgs;
    }

    public void setTaSftwrFlgs(short taSftwrFlgs) {
        this.taSftwrFlgs = taSftwrFlgs;
    }

    public Character getTaMiscEqpmntFlg() {
        return taMiscEqpmntFlg;
    }

    public void setTaMiscEqpmntFlg(Character taMiscEqpmntFlg) {
        this.taMiscEqpmntFlg = taMiscEqpmntFlg;
    }

    public short getTaPumpPayFlgs() {
        return taPumpPayFlgs;
    }

    public void setTaPumpPayFlgs(short taPumpPayFlgs) {
        this.taPumpPayFlgs = taPumpPayFlgs;
    }

    public Character getOmnidesqPumpFlg() {
        return omnidesqPumpFlg;
    }

    public void setOmnidesqPumpFlg(Character omnidesqPumpFlg) {
        this.omnidesqPumpFlg = omnidesqPumpFlg;
    }

    public BigDecimal getOmnidesqAmt() {
        return omnidesqAmt;
    }

    public void setOmnidesqAmt(BigDecimal omnidesqAmt) {
        this.omnidesqAmt = omnidesqAmt;
    }

    public BigDecimal getPayPumpAmt() {
        return payPumpAmt;
    }

    public void setPayPumpAmt(BigDecimal payPumpAmt) {
        this.payPumpAmt = payPumpAmt;
    }

    public Character getCashLeaseFlg() {
        return cashLeaseFlg;
    }

    public void setCashLeaseFlg(Character cashLeaseFlg) {
        this.cashLeaseFlg = cashLeaseFlg;
    }

    public Character getCashTermFlg() {
        return cashTermFlg;
    }

    public void setCashTermFlg(Character cashTermFlg) {
        this.cashTermFlg = cashTermFlg;
    }

    public Date getFullPaidDt() {
        return fullPaidDt;
    }

    public void setFullPaidDt(Date fullPaidDt) {
        this.fullPaidDt = fullPaidDt;
    }

    public BigDecimal getLeaseAmt() {
        return leaseAmt;
    }

    public void setLeaseAmt(BigDecimal leaseAmt) {
        this.leaseAmt = leaseAmt;
    }

    public BigDecimal getMthlyRntlAmt() {
        return mthlyRntlAmt;
    }

    public void setMthlyRntlAmt(BigDecimal mthlyRntlAmt) {
        this.mthlyRntlAmt = mthlyRntlAmt;
    }

    public BigDecimal getNstlAmt() {
        return nstlAmt;
    }

    public void setNstlAmt(BigDecimal nstlAmt) {
        this.nstlAmt = nstlAmt;
    }

    public Character getDpstChkMailFlg() {
        return dpstChkMailFlg;
    }

    public void setDpstChkMailFlg(Character dpstChkMailFlg) {
        this.dpstChkMailFlg = dpstChkMailFlg;
    }

    public Character getDpstChkRcvdFlg() {
        return dpstChkRcvdFlg;
    }

    public void setDpstChkRcvdFlg(Character dpstChkRcvdFlg) {
        this.dpstChkRcvdFlg = dpstChkRcvdFlg;
    }

    public int getDpstChkNbr() {
        return dpstChkNbr;
    }

    public void setDpstChkNbr(int dpstChkNbr) {
        this.dpstChkNbr = dpstChkNbr;
    }

    public BigDecimal getDpstChkAmt() {
        return dpstChkAmt;
    }

    public void setDpstChkAmt(BigDecimal dpstChkAmt) {
        this.dpstChkAmt = dpstChkAmt;
    }

    public Character getNstlChkRcvdFlg() {
        return nstlChkRcvdFlg;
    }

    public void setNstlChkRcvdFlg(Character nstlChkRcvdFlg) {
        this.nstlChkRcvdFlg = nstlChkRcvdFlg;
    }

    public int getNstlChkNbr() {
        return nstlChkNbr;
    }

    public void setNstlChkNbr(int nstlChkNbr) {
        this.nstlChkNbr = nstlChkNbr;
    }

    public BigDecimal getNstlChkAmt() {
        return nstlChkAmt;
    }

    public void setNstlChkAmt(BigDecimal nstlChkAmt) {
        this.nstlChkAmt = nstlChkAmt;
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
        hash += (prdOmnidesqPK != null ? prdOmnidesqPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdOmnidesq)) {
            return false;
        }
        PrdOmnidesq other = (PrdOmnidesq) object;
        if ((this.prdOmnidesqPK == null && other.prdOmnidesqPK != null) || (this.prdOmnidesqPK != null && !this.prdOmnidesqPK.equals(other.prdOmnidesqPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdOmnidesq[ prdOmnidesqPK=" + prdOmnidesqPK + " ]";
    }
    
}
