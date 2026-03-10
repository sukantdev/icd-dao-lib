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
@Table(name = "WD_BNK_TRNS_ARCH", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "WdBnkTrnsArch.findAll", query = "SELECT w FROM WdBnkTrnsArch w")})
public class WdBnkTrnsArch implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WdBnkTrnsArchPK wdBnkTrnsArchPK;
    @Basic(optional = false)
    @Column(name = "BT_BNK_REF_NBR")
    private String btBnkRefNbr;
    @Basic(optional = false)
    @Column(name = "BT_CUST_REF_NBR")
    private String btCustRefNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "BT_PMT_AMT")
    private BigDecimal btPmtAmt;
    @Basic(optional = false)
    @Column(name = "BT_SRCE_SYS_CD")
    private String btSrceSysCd;
    @Basic(optional = false)
    @Column(name = "BT_COMP_NBR")
    private String btCompNbr;
    @Basic(optional = false)
    @Column(name = "BT_ACCT_NBR")
    private String btAcctNbr;
    @Basic(optional = false)
    @Column(name = "BT_COMP_NM")
    private String btCompNm;
    @Basic(optional = false)
    @Column(name = "BT_BCH_NBR")
    private int btBchNbr;
    @Basic(optional = false)
    @Column(name = "BT_STAT_CD")
    private String btStatCd;
    @Basic(optional = false)
    @Column(name = "BT_BNK_NM")
    private String btBnkNm;
    @Basic(optional = false)
    @Column(name = "BT_BNK_ID")
    private String btBnkId;
    @Basic(optional = false)
    @Column(name = "BT_TRNS_CD")
    private String btTrnsCd;
    @Basic(optional = false)
    @Column(name = "BT_MTHD_CD")
    private Character btMthdCd;
    @Basic(optional = false)
    @Column(name = "BT_EXC_CD")
    private String btExcCd;
    @Basic(optional = false)
    @Column(name = "BT_PRNT_NBR")
    private int btPrntNbr;
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
    @Column(name = "BT_PRNT_DT")
    @Temporal(TemporalType.DATE)
    private Date btPrntDt;
    @Basic(optional = false)
    @Column(name = "BT_STLMNT_DT")
    private String btStlmntDt;
    @Basic(optional = false)
    @Column(name = "CDN_BNK_REF_NBR")
    private String cdnBnkRefNbr;
    @Basic(optional = false)
    @Column(name = "CDN_BNK_ACCT_NBR")
    private String cdnBnkAcctNbr;
    @Basic(optional = false)
    @Column(name = "CDN_BNK_ACCT_NBR_LAST4")
    private String cdnBnkAcctNbrLast4;
    @Basic(optional = false)
    @Column(name = "WD_BNK_INDEX")
    private int wdBnkIndex;
    @Basic(optional = false)
    @Column(name = "LOB_CD")
    private String lobCd;

    public WdBnkTrnsArch() {
    }

    public WdBnkTrnsArch(WdBnkTrnsArchPK wdBnkTrnsArchPK) {
        this.wdBnkTrnsArchPK = wdBnkTrnsArchPK;
    }

    public WdBnkTrnsArch(WdBnkTrnsArchPK wdBnkTrnsArchPK, String btBnkRefNbr, String btCustRefNbr, BigDecimal btPmtAmt, String btSrceSysCd, String btCompNbr, String btAcctNbr, String btCompNm, int btBchNbr, String btStatCd, String btBnkNm, String btBnkId, String btTrnsCd, Character btMthdCd, String btExcCd, int btPrntNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Date btPrntDt, String btStlmntDt, String cdnBnkRefNbr, String cdnBnkAcctNbr, String cdnBnkAcctNbrLast4, int wdBnkIndex, String lobCd) {
        this.wdBnkTrnsArchPK = wdBnkTrnsArchPK;
        this.btBnkRefNbr = btBnkRefNbr;
        this.btCustRefNbr = btCustRefNbr;
        this.btPmtAmt = btPmtAmt;
        this.btSrceSysCd = btSrceSysCd;
        this.btCompNbr = btCompNbr;
        this.btAcctNbr = btAcctNbr;
        this.btCompNm = btCompNm;
        this.btBchNbr = btBchNbr;
        this.btStatCd = btStatCd;
        this.btBnkNm = btBnkNm;
        this.btBnkId = btBnkId;
        this.btTrnsCd = btTrnsCd;
        this.btMthdCd = btMthdCd;
        this.btExcCd = btExcCd;
        this.btPrntNbr = btPrntNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.btPrntDt = btPrntDt;
        this.btStlmntDt = btStlmntDt;
        this.cdnBnkRefNbr = cdnBnkRefNbr;
        this.cdnBnkAcctNbr = cdnBnkAcctNbr;
        this.cdnBnkAcctNbrLast4 = cdnBnkAcctNbrLast4;
        this.wdBnkIndex = wdBnkIndex;
        this.lobCd = lobCd;
    }

    public WdBnkTrnsArch(int btPmtNbr, Date btTrnsDt) {
        this.wdBnkTrnsArchPK = new WdBnkTrnsArchPK(btPmtNbr, btTrnsDt);
    }

    public WdBnkTrnsArchPK getWdBnkTrnsArchPK() {
        return wdBnkTrnsArchPK;
    }

    public void setWdBnkTrnsArchPK(WdBnkTrnsArchPK wdBnkTrnsArchPK) {
        this.wdBnkTrnsArchPK = wdBnkTrnsArchPK;
    }

    public String getBtBnkRefNbr() {
        return btBnkRefNbr;
    }

    public void setBtBnkRefNbr(String btBnkRefNbr) {
        this.btBnkRefNbr = btBnkRefNbr;
    }

    public String getBtCustRefNbr() {
        return btCustRefNbr;
    }

    public void setBtCustRefNbr(String btCustRefNbr) {
        this.btCustRefNbr = btCustRefNbr;
    }

    public BigDecimal getBtPmtAmt() {
        return btPmtAmt;
    }

    public void setBtPmtAmt(BigDecimal btPmtAmt) {
        this.btPmtAmt = btPmtAmt;
    }

    public String getBtSrceSysCd() {
        return btSrceSysCd;
    }

    public void setBtSrceSysCd(String btSrceSysCd) {
        this.btSrceSysCd = btSrceSysCd;
    }

    public String getBtCompNbr() {
        return btCompNbr;
    }

    public void setBtCompNbr(String btCompNbr) {
        this.btCompNbr = btCompNbr;
    }

    public String getBtAcctNbr() {
        return btAcctNbr;
    }

    public void setBtAcctNbr(String btAcctNbr) {
        this.btAcctNbr = btAcctNbr;
    }

    public String getBtCompNm() {
        return btCompNm;
    }

    public void setBtCompNm(String btCompNm) {
        this.btCompNm = btCompNm;
    }

    public int getBtBchNbr() {
        return btBchNbr;
    }

    public void setBtBchNbr(int btBchNbr) {
        this.btBchNbr = btBchNbr;
    }

    public String getBtStatCd() {
        return btStatCd;
    }

    public void setBtStatCd(String btStatCd) {
        this.btStatCd = btStatCd;
    }

    public String getBtBnkNm() {
        return btBnkNm;
    }

    public void setBtBnkNm(String btBnkNm) {
        this.btBnkNm = btBnkNm;
    }

    public String getBtBnkId() {
        return btBnkId;
    }

    public void setBtBnkId(String btBnkId) {
        this.btBnkId = btBnkId;
    }

    public String getBtTrnsCd() {
        return btTrnsCd;
    }

    public void setBtTrnsCd(String btTrnsCd) {
        this.btTrnsCd = btTrnsCd;
    }

    public Character getBtMthdCd() {
        return btMthdCd;
    }

    public void setBtMthdCd(Character btMthdCd) {
        this.btMthdCd = btMthdCd;
    }

    public String getBtExcCd() {
        return btExcCd;
    }

    public void setBtExcCd(String btExcCd) {
        this.btExcCd = btExcCd;
    }

    public int getBtPrntNbr() {
        return btPrntNbr;
    }

    public void setBtPrntNbr(int btPrntNbr) {
        this.btPrntNbr = btPrntNbr;
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

    public Date getBtPrntDt() {
        return btPrntDt;
    }

    public void setBtPrntDt(Date btPrntDt) {
        this.btPrntDt = btPrntDt;
    }

    public String getBtStlmntDt() {
        return btStlmntDt;
    }

    public void setBtStlmntDt(String btStlmntDt) {
        this.btStlmntDt = btStlmntDt;
    }

    public String getCdnBnkRefNbr() {
        return cdnBnkRefNbr;
    }

    public void setCdnBnkRefNbr(String cdnBnkRefNbr) {
        this.cdnBnkRefNbr = cdnBnkRefNbr;
    }

    public String getCdnBnkAcctNbr() {
        return cdnBnkAcctNbr;
    }

    public void setCdnBnkAcctNbr(String cdnBnkAcctNbr) {
        this.cdnBnkAcctNbr = cdnBnkAcctNbr;
    }

    public String getCdnBnkAcctNbrLast4() {
        return cdnBnkAcctNbrLast4;
    }

    public void setCdnBnkAcctNbrLast4(String cdnBnkAcctNbrLast4) {
        this.cdnBnkAcctNbrLast4 = cdnBnkAcctNbrLast4;
    }

    public int getWdBnkIndex() {
        return wdBnkIndex;
    }

    public void setWdBnkIndex(int wdBnkIndex) {
        this.wdBnkIndex = wdBnkIndex;
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
        hash += (wdBnkTrnsArchPK != null ? wdBnkTrnsArchPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WdBnkTrnsArch)) {
            return false;
        }
        WdBnkTrnsArch other = (WdBnkTrnsArch) object;
        if ((this.wdBnkTrnsArchPK == null && other.wdBnkTrnsArchPK != null) || (this.wdBnkTrnsArchPK != null && !this.wdBnkTrnsArchPK.equals(other.wdBnkTrnsArchPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.WdBnkTrnsArch[ wdBnkTrnsArchPK=" + wdBnkTrnsArchPK + " ]";
    }
    
}
