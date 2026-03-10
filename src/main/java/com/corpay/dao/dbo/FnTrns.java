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
@Table(name = "FN_TRNS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FnTrns.findAll", query = "SELECT f FROM FnTrns f")})
public class FnTrns implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FnTrnsPK fnTrnsPK;
    @Basic(optional = false)
    @Column(name = "PROC_FLG")
    private Character procFlg;
    @Basic(optional = false)
    @Column(name = "PROC_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date procTs;
    @Basic(optional = false)
    @Column(name = "TRX_MASTER_ID")
    private long trxMasterId;
    @Basic(optional = false)
    @Column(name = "CARD_NBR")
    private String cardNbr;
    @Basic(optional = false)
    @Column(name = "POS_DT")
    @Temporal(TemporalType.DATE)
    private Date posDt;
    @Basic(optional = false)
    @Column(name = "POS_TM")
    @Temporal(TemporalType.TIME)
    private Date posTm;
    @Basic(optional = false)
    @Column(name = "TRX_TYP_CD")
    private String trxTypCd;
    @Basic(optional = false)
    @Column(name = "SITE_ID")
    private long siteId;
    @Basic(optional = false)
    @Column(name = "SITE_NM")
    private String siteNm;
    @Basic(optional = false)
    @Column(name = "SITE_CTY")
    private String siteCty;
    @Basic(optional = false)
    @Column(name = "SITE_STATE_CD")
    private String siteStateCd;
    @Basic(optional = false)
    @Column(name = "SITE_PH_NBR")
    private String sitePhNbr;
    @Basic(optional = false)
    @Column(name = "SITE_STREET_ADDR")
    private String siteStreetAddr;
    @Basic(optional = false)
    @Column(name = "SITE_ZIP_CD")
    private String siteZipCd;
    @Basic(optional = false)
    @Column(name = "AUTH_NO")
    private String authNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TRX_TOT_AMT")
    private BigDecimal trxTotAmt;
    @Basic(optional = false)
    @Column(name = "TRX_TOT_PROD_NBR")
    private short trxTotProdNbr;
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

    public FnTrns() {
    }

    public FnTrns(FnTrnsPK fnTrnsPK) {
        this.fnTrnsPK = fnTrnsPK;
    }

    public FnTrns(FnTrnsPK fnTrnsPK, Character procFlg, Date procTs, long trxMasterId, String cardNbr, Date posDt, Date posTm, String trxTypCd, long siteId, String siteNm, String siteCty, String siteStateCd, String sitePhNbr, String siteStreetAddr, String siteZipCd, String authNo, BigDecimal trxTotAmt, short trxTotProdNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fnTrnsPK = fnTrnsPK;
        this.procFlg = procFlg;
        this.procTs = procTs;
        this.trxMasterId = trxMasterId;
        this.cardNbr = cardNbr;
        this.posDt = posDt;
        this.posTm = posTm;
        this.trxTypCd = trxTypCd;
        this.siteId = siteId;
        this.siteNm = siteNm;
        this.siteCty = siteCty;
        this.siteStateCd = siteStateCd;
        this.sitePhNbr = sitePhNbr;
        this.siteStreetAddr = siteStreetAddr;
        this.siteZipCd = siteZipCd;
        this.authNo = authNo;
        this.trxTotAmt = trxTotAmt;
        this.trxTotProdNbr = trxTotProdNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FnTrns(Date fileDt, short fileSeq, int trnsSeq) {
        this.fnTrnsPK = new FnTrnsPK(fileDt, fileSeq, trnsSeq);
    }

    public FnTrnsPK getFnTrnsPK() {
        return fnTrnsPK;
    }

    public void setFnTrnsPK(FnTrnsPK fnTrnsPK) {
        this.fnTrnsPK = fnTrnsPK;
    }

    public Character getProcFlg() {
        return procFlg;
    }

    public void setProcFlg(Character procFlg) {
        this.procFlg = procFlg;
    }

    public Date getProcTs() {
        return procTs;
    }

    public void setProcTs(Date procTs) {
        this.procTs = procTs;
    }

    public long getTrxMasterId() {
        return trxMasterId;
    }

    public void setTrxMasterId(long trxMasterId) {
        this.trxMasterId = trxMasterId;
    }

    public String getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr;
    }

    public Date getPosDt() {
        return posDt;
    }

    public void setPosDt(Date posDt) {
        this.posDt = posDt;
    }

    public Date getPosTm() {
        return posTm;
    }

    public void setPosTm(Date posTm) {
        this.posTm = posTm;
    }

    public String getTrxTypCd() {
        return trxTypCd;
    }

    public void setTrxTypCd(String trxTypCd) {
        this.trxTypCd = trxTypCd;
    }

    public long getSiteId() {
        return siteId;
    }

    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }

    public String getSiteNm() {
        return siteNm;
    }

    public void setSiteNm(String siteNm) {
        this.siteNm = siteNm;
    }

    public String getSiteCty() {
        return siteCty;
    }

    public void setSiteCty(String siteCty) {
        this.siteCty = siteCty;
    }

    public String getSiteStateCd() {
        return siteStateCd;
    }

    public void setSiteStateCd(String siteStateCd) {
        this.siteStateCd = siteStateCd;
    }

    public String getSitePhNbr() {
        return sitePhNbr;
    }

    public void setSitePhNbr(String sitePhNbr) {
        this.sitePhNbr = sitePhNbr;
    }

    public String getSiteStreetAddr() {
        return siteStreetAddr;
    }

    public void setSiteStreetAddr(String siteStreetAddr) {
        this.siteStreetAddr = siteStreetAddr;
    }

    public String getSiteZipCd() {
        return siteZipCd;
    }

    public void setSiteZipCd(String siteZipCd) {
        this.siteZipCd = siteZipCd;
    }

    public String getAuthNo() {
        return authNo;
    }

    public void setAuthNo(String authNo) {
        this.authNo = authNo;
    }

    public BigDecimal getTrxTotAmt() {
        return trxTotAmt;
    }

    public void setTrxTotAmt(BigDecimal trxTotAmt) {
        this.trxTotAmt = trxTotAmt;
    }

    public short getTrxTotProdNbr() {
        return trxTotProdNbr;
    }

    public void setTrxTotProdNbr(short trxTotProdNbr) {
        this.trxTotProdNbr = trxTotProdNbr;
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
        hash += (fnTrnsPK != null ? fnTrnsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FnTrns)) {
            return false;
        }
        FnTrns other = (FnTrns) object;
        if ((this.fnTrnsPK == null && other.fnTrnsPK != null) || (this.fnTrnsPK != null && !this.fnTrnsPK.equals(other.fnTrnsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnTrns[ fnTrnsPK=" + fnTrnsPK + " ]";
    }
    
}
