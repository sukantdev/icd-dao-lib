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
@Table(name = "RET_MINUS_DISC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RetMinusDisc.findAll", query = "SELECT r FROM RetMinusDisc r")})
public class RetMinusDisc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RetMinusDiscPK retMinusDiscPK;
    @Basic(optional = false)
    @Column(name = "LOC_TYP_CD")
    private String locTypCd;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "CUST_NAME")
    private String custName;
    @Basic(optional = false)
    @Column(name = "CUST_CNTRY_CD")
    private String custCntryCd;
    @Basic(optional = false)
    @Column(name = "CURR_TYP_CD")
    private Character currTypCd;
    @Basic(optional = false)
    @Column(name = "CUST_CITY_NM")
    private String custCityNm;
    @Basic(optional = false)
    @Column(name = "CUST_ST")
    private String custSt;
    @Basic(optional = false)
    @Column(name = "LOC_NAME")
    private String locName;
    @Basic(optional = false)
    @Column(name = "LOC_CNTRY_CD")
    private String locCntryCd;
    @Basic(optional = false)
    @Column(name = "LOC_CITY_NM")
    private String locCityNm;
    @Basic(optional = false)
    @Column(name = "LOC_ST")
    private String locSt;
    @Basic(optional = false)
    @Column(name = "FOCUS_DISC_TYP_CD")
    private Character focusDiscTypCd;
    @Basic(optional = false)
    @Column(name = "FOCUS_DEF_CD")
    private Character focusDefCd;
    @Basic(optional = false)
    @Column(name = "PREFER_LEVEL_FLG")
    private Character preferLevelFlg;
    @Basic(optional = false)
    @Column(name = "PREFER_LEVEL_DEF_CD")
    private Character preferLevelDefCd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CPG_TOT_DISC_AMT")
    private BigDecimal cpgTotDiscAmt;
    @Basic(optional = false)
    @Column(name = "CPG_NET_AMT")
    private BigDecimal cpgNetAmt;
    @Basic(optional = false)
    @Column(name = "CPG_REB_AMT")
    private BigDecimal cpgRebAmt;
    @Basic(optional = false)
    @Column(name = "CPG_RET_AMT")
    private BigDecimal cpgRetAmt;
    @Basic(optional = false)
    @Column(name = "CPG_G999_AMT")
    private BigDecimal cpgG999Amt;
    @Basic(optional = false)
    @Column(name = "CPG_DEF_TYP_CD")
    private String cpgDefTypCd;
    @Basic(optional = false)
    @Column(name = "POF_TOT_DISC_AMT")
    private BigDecimal pofTotDiscAmt;
    @Basic(optional = false)
    @Column(name = "POF_NET_AMT")
    private BigDecimal pofNetAmt;
    @Basic(optional = false)
    @Column(name = "POF_REB_AMT")
    private BigDecimal pofRebAmt;
    @Basic(optional = false)
    @Column(name = "POF_RET_AMT")
    private BigDecimal pofRetAmt;
    @Basic(optional = false)
    @Column(name = "POF_G999_AMT")
    private BigDecimal pofG999Amt;
    @Basic(optional = false)
    @Column(name = "POF_DEF_TYP_CD")
    private String pofDefTypCd;
    @Basic(optional = false)
    @Column(name = "FLAT_TOT_DISC")
    private BigDecimal flatTotDisc;
    @Basic(optional = false)
    @Column(name = "FLAT_NET_AMT")
    private BigDecimal flatNetAmt;
    @Basic(optional = false)
    @Column(name = "FLAT_REB_AMT")
    private BigDecimal flatRebAmt;
    @Basic(optional = false)
    @Column(name = "FLAT_RET_AMT")
    private BigDecimal flatRetAmt;
    @Basic(optional = false)
    @Column(name = "FLAT_G999_AMT")
    private BigDecimal flatG999Amt;
    @Basic(optional = false)
    @Column(name = "FLAT_DEF_TYP_CD")
    private String flatDefTypCd;
    @Basic(optional = false)
    @Column(name = "SEL_DISC_AMT")
    private BigDecimal selDiscAmt;
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

    public RetMinusDisc() {
    }

    public RetMinusDisc(RetMinusDiscPK retMinusDiscPK) {
        this.retMinusDiscPK = retMinusDiscPK;
    }

    public RetMinusDisc(RetMinusDiscPK retMinusDiscPK, String locTypCd, String acctCd, String custName, String custCntryCd, Character currTypCd, String custCityNm, String custSt, String locName, String locCntryCd, String locCityNm, String locSt, Character focusDiscTypCd, Character focusDefCd, Character preferLevelFlg, Character preferLevelDefCd, BigDecimal cpgTotDiscAmt, BigDecimal cpgNetAmt, BigDecimal cpgRebAmt, BigDecimal cpgRetAmt, BigDecimal cpgG999Amt, String cpgDefTypCd, BigDecimal pofTotDiscAmt, BigDecimal pofNetAmt, BigDecimal pofRebAmt, BigDecimal pofRetAmt, BigDecimal pofG999Amt, String pofDefTypCd, BigDecimal flatTotDisc, BigDecimal flatNetAmt, BigDecimal flatRebAmt, BigDecimal flatRetAmt, BigDecimal flatG999Amt, String flatDefTypCd, BigDecimal selDiscAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.retMinusDiscPK = retMinusDiscPK;
        this.locTypCd = locTypCd;
        this.acctCd = acctCd;
        this.custName = custName;
        this.custCntryCd = custCntryCd;
        this.currTypCd = currTypCd;
        this.custCityNm = custCityNm;
        this.custSt = custSt;
        this.locName = locName;
        this.locCntryCd = locCntryCd;
        this.locCityNm = locCityNm;
        this.locSt = locSt;
        this.focusDiscTypCd = focusDiscTypCd;
        this.focusDefCd = focusDefCd;
        this.preferLevelFlg = preferLevelFlg;
        this.preferLevelDefCd = preferLevelDefCd;
        this.cpgTotDiscAmt = cpgTotDiscAmt;
        this.cpgNetAmt = cpgNetAmt;
        this.cpgRebAmt = cpgRebAmt;
        this.cpgRetAmt = cpgRetAmt;
        this.cpgG999Amt = cpgG999Amt;
        this.cpgDefTypCd = cpgDefTypCd;
        this.pofTotDiscAmt = pofTotDiscAmt;
        this.pofNetAmt = pofNetAmt;
        this.pofRebAmt = pofRebAmt;
        this.pofRetAmt = pofRetAmt;
        this.pofG999Amt = pofG999Amt;
        this.pofDefTypCd = pofDefTypCd;
        this.flatTotDisc = flatTotDisc;
        this.flatNetAmt = flatNetAmt;
        this.flatRebAmt = flatRebAmt;
        this.flatRetAmt = flatRetAmt;
        this.flatG999Amt = flatG999Amt;
        this.flatDefTypCd = flatDefTypCd;
        this.selDiscAmt = selDiscAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public RetMinusDisc(String custId, String locCd, String discPrdCd, Date discEffctvTs, String discPrdGrpCd, Character directbillFundedFlg, Character discSrcCd) {
        this.retMinusDiscPK = new RetMinusDiscPK(custId, locCd, discPrdCd, discEffctvTs, discPrdGrpCd, directbillFundedFlg, discSrcCd);
    }

    public RetMinusDiscPK getRetMinusDiscPK() {
        return retMinusDiscPK;
    }

    public void setRetMinusDiscPK(RetMinusDiscPK retMinusDiscPK) {
        this.retMinusDiscPK = retMinusDiscPK;
    }

    public String getLocTypCd() {
        return locTypCd;
    }

    public void setLocTypCd(String locTypCd) {
        this.locTypCd = locTypCd;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustCntryCd() {
        return custCntryCd;
    }

    public void setCustCntryCd(String custCntryCd) {
        this.custCntryCd = custCntryCd;
    }

    public Character getCurrTypCd() {
        return currTypCd;
    }

    public void setCurrTypCd(Character currTypCd) {
        this.currTypCd = currTypCd;
    }

    public String getCustCityNm() {
        return custCityNm;
    }

    public void setCustCityNm(String custCityNm) {
        this.custCityNm = custCityNm;
    }

    public String getCustSt() {
        return custSt;
    }

    public void setCustSt(String custSt) {
        this.custSt = custSt;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public String getLocCntryCd() {
        return locCntryCd;
    }

    public void setLocCntryCd(String locCntryCd) {
        this.locCntryCd = locCntryCd;
    }

    public String getLocCityNm() {
        return locCityNm;
    }

    public void setLocCityNm(String locCityNm) {
        this.locCityNm = locCityNm;
    }

    public String getLocSt() {
        return locSt;
    }

    public void setLocSt(String locSt) {
        this.locSt = locSt;
    }

    public Character getFocusDiscTypCd() {
        return focusDiscTypCd;
    }

    public void setFocusDiscTypCd(Character focusDiscTypCd) {
        this.focusDiscTypCd = focusDiscTypCd;
    }

    public Character getFocusDefCd() {
        return focusDefCd;
    }

    public void setFocusDefCd(Character focusDefCd) {
        this.focusDefCd = focusDefCd;
    }

    public Character getPreferLevelFlg() {
        return preferLevelFlg;
    }

    public void setPreferLevelFlg(Character preferLevelFlg) {
        this.preferLevelFlg = preferLevelFlg;
    }

    public Character getPreferLevelDefCd() {
        return preferLevelDefCd;
    }

    public void setPreferLevelDefCd(Character preferLevelDefCd) {
        this.preferLevelDefCd = preferLevelDefCd;
    }

    public BigDecimal getCpgTotDiscAmt() {
        return cpgTotDiscAmt;
    }

    public void setCpgTotDiscAmt(BigDecimal cpgTotDiscAmt) {
        this.cpgTotDiscAmt = cpgTotDiscAmt;
    }

    public BigDecimal getCpgNetAmt() {
        return cpgNetAmt;
    }

    public void setCpgNetAmt(BigDecimal cpgNetAmt) {
        this.cpgNetAmt = cpgNetAmt;
    }

    public BigDecimal getCpgRebAmt() {
        return cpgRebAmt;
    }

    public void setCpgRebAmt(BigDecimal cpgRebAmt) {
        this.cpgRebAmt = cpgRebAmt;
    }

    public BigDecimal getCpgRetAmt() {
        return cpgRetAmt;
    }

    public void setCpgRetAmt(BigDecimal cpgRetAmt) {
        this.cpgRetAmt = cpgRetAmt;
    }

    public BigDecimal getCpgG999Amt() {
        return cpgG999Amt;
    }

    public void setCpgG999Amt(BigDecimal cpgG999Amt) {
        this.cpgG999Amt = cpgG999Amt;
    }

    public String getCpgDefTypCd() {
        return cpgDefTypCd;
    }

    public void setCpgDefTypCd(String cpgDefTypCd) {
        this.cpgDefTypCd = cpgDefTypCd;
    }

    public BigDecimal getPofTotDiscAmt() {
        return pofTotDiscAmt;
    }

    public void setPofTotDiscAmt(BigDecimal pofTotDiscAmt) {
        this.pofTotDiscAmt = pofTotDiscAmt;
    }

    public BigDecimal getPofNetAmt() {
        return pofNetAmt;
    }

    public void setPofNetAmt(BigDecimal pofNetAmt) {
        this.pofNetAmt = pofNetAmt;
    }

    public BigDecimal getPofRebAmt() {
        return pofRebAmt;
    }

    public void setPofRebAmt(BigDecimal pofRebAmt) {
        this.pofRebAmt = pofRebAmt;
    }

    public BigDecimal getPofRetAmt() {
        return pofRetAmt;
    }

    public void setPofRetAmt(BigDecimal pofRetAmt) {
        this.pofRetAmt = pofRetAmt;
    }

    public BigDecimal getPofG999Amt() {
        return pofG999Amt;
    }

    public void setPofG999Amt(BigDecimal pofG999Amt) {
        this.pofG999Amt = pofG999Amt;
    }

    public String getPofDefTypCd() {
        return pofDefTypCd;
    }

    public void setPofDefTypCd(String pofDefTypCd) {
        this.pofDefTypCd = pofDefTypCd;
    }

    public BigDecimal getFlatTotDisc() {
        return flatTotDisc;
    }

    public void setFlatTotDisc(BigDecimal flatTotDisc) {
        this.flatTotDisc = flatTotDisc;
    }

    public BigDecimal getFlatNetAmt() {
        return flatNetAmt;
    }

    public void setFlatNetAmt(BigDecimal flatNetAmt) {
        this.flatNetAmt = flatNetAmt;
    }

    public BigDecimal getFlatRebAmt() {
        return flatRebAmt;
    }

    public void setFlatRebAmt(BigDecimal flatRebAmt) {
        this.flatRebAmt = flatRebAmt;
    }

    public BigDecimal getFlatRetAmt() {
        return flatRetAmt;
    }

    public void setFlatRetAmt(BigDecimal flatRetAmt) {
        this.flatRetAmt = flatRetAmt;
    }

    public BigDecimal getFlatG999Amt() {
        return flatG999Amt;
    }

    public void setFlatG999Amt(BigDecimal flatG999Amt) {
        this.flatG999Amt = flatG999Amt;
    }

    public String getFlatDefTypCd() {
        return flatDefTypCd;
    }

    public void setFlatDefTypCd(String flatDefTypCd) {
        this.flatDefTypCd = flatDefTypCd;
    }

    public BigDecimal getSelDiscAmt() {
        return selDiscAmt;
    }

    public void setSelDiscAmt(BigDecimal selDiscAmt) {
        this.selDiscAmt = selDiscAmt;
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
        hash += (retMinusDiscPK != null ? retMinusDiscPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetMinusDisc)) {
            return false;
        }
        RetMinusDisc other = (RetMinusDisc) object;
        if ((this.retMinusDiscPK == null && other.retMinusDiscPK != null) || (this.retMinusDiscPK != null && !this.retMinusDiscPK.equals(other.retMinusDiscPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RetMinusDisc[ retMinusDiscPK=" + retMinusDiscPK + " ]";
    }
    
}
