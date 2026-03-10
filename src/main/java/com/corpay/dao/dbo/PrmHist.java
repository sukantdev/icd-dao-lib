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
@Table(name = "PRM_HIST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrmHist.findAll", query = "SELECT p FROM PrmHist p")})
public class PrmHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrmHistPK prmHistPK;
    @Basic(optional = false)
    @Column(name = "PARTITION_ID")
    private short partitionId;
    @Basic(optional = false)
    @Column(name = "PAYEE_LST_NM")
    private String payeeLstNm;
    @Basic(optional = false)
    @Column(name = "PAYEE_FST_NM")
    private Character payeeFstNm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PREV_BAL")
    private BigDecimal prevBal;
    @Basic(optional = false)
    @Column(name = "ADJD_BAL")
    private BigDecimal adjdBal;
    @Basic(optional = false)
    @Column(name = "TRNS_AMT")
    private BigDecimal trnsAmt;
    @Basic(optional = false)
    @Column(name = "AMT_ADD_SUBTR")
    private Character amtAddSubtr;
    @Basic(optional = false)
    @Column(name = "PLUS_LESS")
    private Character plusLess;
    @Basic(optional = false)
    @Column(name = "CRD_TYP")
    private Character crdTyp;
    @Basic(optional = false)
    @Column(name = "AMT_DUE")
    private BigDecimal amtDue;
    @Basic(optional = false)
    @Column(name = "CHGS")
    private BigDecimal chgs;
    @Basic(optional = false)
    @Column(name = "PRDCTN_TYP_ID")
    private int prdctnTypId;
    @Basic(optional = false)
    @Column(name = "OP_ID")
    private String opId;
    @Basic(optional = false)
    @Column(name = "TERM_ID")
    private String termId;
    @Basic(optional = false)
    @Column(name = "ORD_STAT")
    private Character ordStat;
    @Basic(optional = false)
    @Column(name = "CMPLTN_DT")
    @Temporal(TemporalType.DATE)
    private Date cmpltnDt;
    @Basic(optional = false)
    @Column(name = "CMPLTN_TM")
    @Temporal(TemporalType.TIME)
    private Date cmpltnTm;
    @Basic(optional = false)
    @Column(name = "INV_NBR")
    private String invNbr;
    @Basic(optional = false)
    @Column(name = "INV_ITM_NBR")
    private int invItmNbr;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "EMP_NBR")
    private String empNbr;
    @Basic(optional = false)
    @Column(name = "BUS_DT")
    @Temporal(TemporalType.DATE)
    private Date busDt;
    @Basic(optional = false)
    @Column(name = "CMPLTN_REF_NBR")
    private int cmpltnRefNbr;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR")
    private String tripNbr;
    @Basic(optional = false)
    @Column(name = "BLNG_TYP")
    private Character blngTyp;
    @Basic(optional = false)
    @Column(name = "PRM_RELTV_RCD_NBR")
    private int prmReltvRcdNbr;
    @Basic(optional = false)
    @Column(name = "FMLOG_RELTV_RCD_NB")
    private int fmlogReltvRcdNb;
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
    @Column(name = "BLNG_TRNS_ID")
    private int blngTrnsId;
    @Basic(optional = false)
    @Column(name = "IN_NETW_FLG")
    private Character inNetwFlg;
    @Basic(optional = false)
    @Column(name = "IN_NETW_CST")
    private BigDecimal inNetwCst;
    @Basic(optional = false)
    @Column(name = "XBRDR_TRNS_FLG")
    private Character xbrdrTrnsFlg;
    @Basic(optional = false)
    @Column(name = "XBRDR_CURR_FLG")
    private Character xbrdrCurrFlg;
    @Basic(optional = false)
    @Column(name = "CURR_CNV_ASSMNT")
    private BigDecimal currCnvAssmnt;
    @Basic(optional = false)
    @Column(name = "XBRDR_ASSMNT")
    private BigDecimal xbrdrAssmnt;
    @Basic(optional = false)
    @Column(name = "IRIS_FLG")
    private String irisFlg;
    @Basic(optional = false)
    @Column(name = "ATM_TRNS_TYP_CD")
    private String atmTrnsTypCd;
    @Basic(optional = false)
    @Column(name = "LPN_CRD_NBR")
    private String lpnCrdNbr;
    @Basic(optional = false)
    @Column(name = "LPN_CRD_IND")
    private Character lpnCrdInd;
    @Basic(optional = false)
    @Column(name = "LPN_PRV_BAL_AMT")
    private BigDecimal lpnPrvBalAmt;
    @Basic(optional = false)
    @Column(name = "LPN_ADJ_BAL_AMT")
    private BigDecimal lpnAdjBalAmt;
    @Basic(optional = false)
    @Column(name = "LPN_TRNS_AMT")
    private BigDecimal lpnTrnsAmt;
    @Basic(optional = false)
    @Column(name = "PAYROLL_OR_OTHER")
    private Character payrollOrOther;

    public PrmHist() {
    }

    public PrmHist(PrmHistPK prmHistPK) {
        this.prmHistPK = prmHistPK;
    }

    public PrmHist(PrmHistPK prmHistPK, short partitionId, String payeeLstNm, Character payeeFstNm, BigDecimal prevBal, BigDecimal adjdBal, BigDecimal trnsAmt, Character amtAddSubtr, Character plusLess, Character crdTyp, BigDecimal amtDue, BigDecimal chgs, int prdctnTypId, String opId, String termId, Character ordStat, Date cmpltnDt, Date cmpltnTm, String invNbr, int invItmNbr, String acctNbr, String empNbr, Date busDt, int cmpltnRefNbr, String tripNbr, Character blngTyp, int prmReltvRcdNbr, int fmlogReltvRcdNb, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, int blngTrnsId, Character inNetwFlg, BigDecimal inNetwCst, Character xbrdrTrnsFlg, Character xbrdrCurrFlg, BigDecimal currCnvAssmnt, BigDecimal xbrdrAssmnt, String irisFlg, String atmTrnsTypCd, String lpnCrdNbr, Character lpnCrdInd, BigDecimal lpnPrvBalAmt, BigDecimal lpnAdjBalAmt, BigDecimal lpnTrnsAmt, Character payrollOrOther) {
        this.prmHistPK = prmHistPK;
        this.partitionId = partitionId;
        this.payeeLstNm = payeeLstNm;
        this.payeeFstNm = payeeFstNm;
        this.prevBal = prevBal;
        this.adjdBal = adjdBal;
        this.trnsAmt = trnsAmt;
        this.amtAddSubtr = amtAddSubtr;
        this.plusLess = plusLess;
        this.crdTyp = crdTyp;
        this.amtDue = amtDue;
        this.chgs = chgs;
        this.prdctnTypId = prdctnTypId;
        this.opId = opId;
        this.termId = termId;
        this.ordStat = ordStat;
        this.cmpltnDt = cmpltnDt;
        this.cmpltnTm = cmpltnTm;
        this.invNbr = invNbr;
        this.invItmNbr = invItmNbr;
        this.acctNbr = acctNbr;
        this.empNbr = empNbr;
        this.busDt = busDt;
        this.cmpltnRefNbr = cmpltnRefNbr;
        this.tripNbr = tripNbr;
        this.blngTyp = blngTyp;
        this.prmReltvRcdNbr = prmReltvRcdNbr;
        this.fmlogReltvRcdNb = fmlogReltvRcdNb;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.blngTrnsId = blngTrnsId;
        this.inNetwFlg = inNetwFlg;
        this.inNetwCst = inNetwCst;
        this.xbrdrTrnsFlg = xbrdrTrnsFlg;
        this.xbrdrCurrFlg = xbrdrCurrFlg;
        this.currCnvAssmnt = currCnvAssmnt;
        this.xbrdrAssmnt = xbrdrAssmnt;
        this.irisFlg = irisFlg;
        this.atmTrnsTypCd = atmTrnsTypCd;
        this.lpnCrdNbr = lpnCrdNbr;
        this.lpnCrdInd = lpnCrdInd;
        this.lpnPrvBalAmt = lpnPrvBalAmt;
        this.lpnAdjBalAmt = lpnAdjBalAmt;
        this.lpnTrnsAmt = lpnTrnsAmt;
        this.payrollOrOther = payrollOrOther;
    }

    public PrmHist(String custId, String crdNbr, Date prmHistDt, Date prmHistTm, int refNbr, Character rcdId) {
        this.prmHistPK = new PrmHistPK(custId, crdNbr, prmHistDt, prmHistTm, refNbr, rcdId);
    }

    public PrmHistPK getPrmHistPK() {
        return prmHistPK;
    }

    public void setPrmHistPK(PrmHistPK prmHistPK) {
        this.prmHistPK = prmHistPK;
    }

    public short getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(short partitionId) {
        this.partitionId = partitionId;
    }

    public String getPayeeLstNm() {
        return payeeLstNm;
    }

    public void setPayeeLstNm(String payeeLstNm) {
        this.payeeLstNm = payeeLstNm;
    }

    public Character getPayeeFstNm() {
        return payeeFstNm;
    }

    public void setPayeeFstNm(Character payeeFstNm) {
        this.payeeFstNm = payeeFstNm;
    }

    public BigDecimal getPrevBal() {
        return prevBal;
    }

    public void setPrevBal(BigDecimal prevBal) {
        this.prevBal = prevBal;
    }

    public BigDecimal getAdjdBal() {
        return adjdBal;
    }

    public void setAdjdBal(BigDecimal adjdBal) {
        this.adjdBal = adjdBal;
    }

    public BigDecimal getTrnsAmt() {
        return trnsAmt;
    }

    public void setTrnsAmt(BigDecimal trnsAmt) {
        this.trnsAmt = trnsAmt;
    }

    public Character getAmtAddSubtr() {
        return amtAddSubtr;
    }

    public void setAmtAddSubtr(Character amtAddSubtr) {
        this.amtAddSubtr = amtAddSubtr;
    }

    public Character getPlusLess() {
        return plusLess;
    }

    public void setPlusLess(Character plusLess) {
        this.plusLess = plusLess;
    }

    public Character getCrdTyp() {
        return crdTyp;
    }

    public void setCrdTyp(Character crdTyp) {
        this.crdTyp = crdTyp;
    }

    public BigDecimal getAmtDue() {
        return amtDue;
    }

    public void setAmtDue(BigDecimal amtDue) {
        this.amtDue = amtDue;
    }

    public BigDecimal getChgs() {
        return chgs;
    }

    public void setChgs(BigDecimal chgs) {
        this.chgs = chgs;
    }

    public int getPrdctnTypId() {
        return prdctnTypId;
    }

    public void setPrdctnTypId(int prdctnTypId) {
        this.prdctnTypId = prdctnTypId;
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public Character getOrdStat() {
        return ordStat;
    }

    public void setOrdStat(Character ordStat) {
        this.ordStat = ordStat;
    }

    public Date getCmpltnDt() {
        return cmpltnDt;
    }

    public void setCmpltnDt(Date cmpltnDt) {
        this.cmpltnDt = cmpltnDt;
    }

    public Date getCmpltnTm() {
        return cmpltnTm;
    }

    public void setCmpltnTm(Date cmpltnTm) {
        this.cmpltnTm = cmpltnTm;
    }

    public String getInvNbr() {
        return invNbr;
    }

    public void setInvNbr(String invNbr) {
        this.invNbr = invNbr;
    }

    public int getInvItmNbr() {
        return invItmNbr;
    }

    public void setInvItmNbr(int invItmNbr) {
        this.invItmNbr = invItmNbr;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getEmpNbr() {
        return empNbr;
    }

    public void setEmpNbr(String empNbr) {
        this.empNbr = empNbr;
    }

    public Date getBusDt() {
        return busDt;
    }

    public void setBusDt(Date busDt) {
        this.busDt = busDt;
    }

    public int getCmpltnRefNbr() {
        return cmpltnRefNbr;
    }

    public void setCmpltnRefNbr(int cmpltnRefNbr) {
        this.cmpltnRefNbr = cmpltnRefNbr;
    }

    public String getTripNbr() {
        return tripNbr;
    }

    public void setTripNbr(String tripNbr) {
        this.tripNbr = tripNbr;
    }

    public Character getBlngTyp() {
        return blngTyp;
    }

    public void setBlngTyp(Character blngTyp) {
        this.blngTyp = blngTyp;
    }

    public int getPrmReltvRcdNbr() {
        return prmReltvRcdNbr;
    }

    public void setPrmReltvRcdNbr(int prmReltvRcdNbr) {
        this.prmReltvRcdNbr = prmReltvRcdNbr;
    }

    public int getFmlogReltvRcdNb() {
        return fmlogReltvRcdNb;
    }

    public void setFmlogReltvRcdNb(int fmlogReltvRcdNb) {
        this.fmlogReltvRcdNb = fmlogReltvRcdNb;
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

    public int getBlngTrnsId() {
        return blngTrnsId;
    }

    public void setBlngTrnsId(int blngTrnsId) {
        this.blngTrnsId = blngTrnsId;
    }

    public Character getInNetwFlg() {
        return inNetwFlg;
    }

    public void setInNetwFlg(Character inNetwFlg) {
        this.inNetwFlg = inNetwFlg;
    }

    public BigDecimal getInNetwCst() {
        return inNetwCst;
    }

    public void setInNetwCst(BigDecimal inNetwCst) {
        this.inNetwCst = inNetwCst;
    }

    public Character getXbrdrTrnsFlg() {
        return xbrdrTrnsFlg;
    }

    public void setXbrdrTrnsFlg(Character xbrdrTrnsFlg) {
        this.xbrdrTrnsFlg = xbrdrTrnsFlg;
    }

    public Character getXbrdrCurrFlg() {
        return xbrdrCurrFlg;
    }

    public void setXbrdrCurrFlg(Character xbrdrCurrFlg) {
        this.xbrdrCurrFlg = xbrdrCurrFlg;
    }

    public BigDecimal getCurrCnvAssmnt() {
        return currCnvAssmnt;
    }

    public void setCurrCnvAssmnt(BigDecimal currCnvAssmnt) {
        this.currCnvAssmnt = currCnvAssmnt;
    }

    public BigDecimal getXbrdrAssmnt() {
        return xbrdrAssmnt;
    }

    public void setXbrdrAssmnt(BigDecimal xbrdrAssmnt) {
        this.xbrdrAssmnt = xbrdrAssmnt;
    }

    public String getIrisFlg() {
        return irisFlg;
    }

    public void setIrisFlg(String irisFlg) {
        this.irisFlg = irisFlg;
    }

    public String getAtmTrnsTypCd() {
        return atmTrnsTypCd;
    }

    public void setAtmTrnsTypCd(String atmTrnsTypCd) {
        this.atmTrnsTypCd = atmTrnsTypCd;
    }

    public String getLpnCrdNbr() {
        return lpnCrdNbr;
    }

    public void setLpnCrdNbr(String lpnCrdNbr) {
        this.lpnCrdNbr = lpnCrdNbr;
    }

    public Character getLpnCrdInd() {
        return lpnCrdInd;
    }

    public void setLpnCrdInd(Character lpnCrdInd) {
        this.lpnCrdInd = lpnCrdInd;
    }

    public BigDecimal getLpnPrvBalAmt() {
        return lpnPrvBalAmt;
    }

    public void setLpnPrvBalAmt(BigDecimal lpnPrvBalAmt) {
        this.lpnPrvBalAmt = lpnPrvBalAmt;
    }

    public BigDecimal getLpnAdjBalAmt() {
        return lpnAdjBalAmt;
    }

    public void setLpnAdjBalAmt(BigDecimal lpnAdjBalAmt) {
        this.lpnAdjBalAmt = lpnAdjBalAmt;
    }

    public BigDecimal getLpnTrnsAmt() {
        return lpnTrnsAmt;
    }

    public void setLpnTrnsAmt(BigDecimal lpnTrnsAmt) {
        this.lpnTrnsAmt = lpnTrnsAmt;
    }

    public Character getPayrollOrOther() {
        return payrollOrOther;
    }

    public void setPayrollOrOther(Character payrollOrOther) {
        this.payrollOrOther = payrollOrOther;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmHistPK != null ? prmHistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrmHist)) {
            return false;
        }
        PrmHist other = (PrmHist) object;
        if ((this.prmHistPK == null && other.prmHistPK != null) || (this.prmHistPK != null && !this.prmHistPK.equals(other.prmHistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrmHist[ prmHistPK=" + prmHistPK + " ]";
    }
    
}
