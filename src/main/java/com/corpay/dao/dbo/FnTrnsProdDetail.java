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
@Table(name = "FN_TRNS_PROD_DETAIL", catalog = "", schema = "DBO")
public class FnTrnsProdDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FnTrnsProdDetailPK fnTrnsProdDetailPK;
    @Basic(optional = false)
    @Column(name = "TRX_MASTER_ID")
    private long trxMasterId;
    @Basic(optional = false)
    @Column(name = "TRX_ID")
    private long trxId;
    @Basic(optional = false)
    @Column(name = "LIC_ID")
    private long licId;
    @Basic(optional = false)
    @Column(name = "CBG_ID")
    private long cbgId;
    @Basic(optional = false)
    @Column(name = "FN_CUST_NBR")
    private long fnCustNbr;
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
    @Column(name = "AUTH_NO")
    private String authNo;
    @Basic(optional = false)
    @Column(name = "FN_PROD_CD")
    private short fnProdCd;

    @Basic(optional = false)
    @Column(name = "PROD_QTY")
    private BigDecimal prodQty;
    @Basic(optional = false)
    @Column(name = "EXT_RETAIL_AMT")
    private BigDecimal extRetailAmt;
    @Basic(optional = false)
    @Column(name = "MRCH_TOT_AMT")
    private BigDecimal mrchTotAmt;
    @Basic(optional = false)
    @Column(name = "MRCH_PRIC_REF_CD")
    private String mrchPricRefCd;
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
    @Column(name = "ERROR_DESC")
    private String errorDesc;
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

    public FnTrnsProdDetail() {
    }

    public FnTrnsProdDetail(FnTrnsProdDetailPK fnTrnsProdDetailPK) {
        this.fnTrnsProdDetailPK = fnTrnsProdDetailPK;
    }

    public FnTrnsProdDetail(FnTrnsProdDetailPK fnTrnsProdDetailPK, long trxMasterId, long trxId, long licId, long cbgId, long fnCustNbr, String cardNbr, Date posDt, Date posTm, String trxTypCd, String authNo, short fnProdCd, BigDecimal prodQty, BigDecimal extRetailAmt, BigDecimal mrchTotAmt, String mrchPricRefCd, long siteId, String siteNm, String siteCty, String siteStateCd, String sitePhNbr, String siteStreetAddr, String siteZipCd, String errorDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fnTrnsProdDetailPK = fnTrnsProdDetailPK;
        this.trxMasterId = trxMasterId;
        this.trxId = trxId;
        this.licId = licId;
        this.cbgId = cbgId;
        this.fnCustNbr = fnCustNbr;
        this.cardNbr = cardNbr;
        this.posDt = posDt;
        this.posTm = posTm;
        this.trxTypCd = trxTypCd;
        this.authNo = authNo;
        this.fnProdCd = fnProdCd;
        this.prodQty = prodQty;
        this.extRetailAmt = extRetailAmt;
        this.mrchTotAmt = mrchTotAmt;
        this.mrchPricRefCd = mrchPricRefCd;
        this.siteId = siteId;
        this.siteNm = siteNm;
        this.siteCty = siteCty;
        this.siteStateCd = siteStateCd;
        this.sitePhNbr = sitePhNbr;
        this.siteStreetAddr = siteStreetAddr;
        this.siteZipCd = siteZipCd;
        this.errorDesc = errorDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FnTrnsProdDetail(Date fileDt, short fileSeq, int trnsSeq, short prodSeq) {
        this.fnTrnsProdDetailPK = new FnTrnsProdDetailPK(fileDt, fileSeq, trnsSeq, prodSeq);
    }

    public FnTrnsProdDetailPK getFnTrnsProdDetailPK() {
        return fnTrnsProdDetailPK;
    }

    public void setFnTrnsProdDetailPK(FnTrnsProdDetailPK fnTrnsProdDetailPK) {
        this.fnTrnsProdDetailPK = fnTrnsProdDetailPK;
    }

    public long getTrxMasterId() {
        return trxMasterId;
    }

    public void setTrxMasterId(long trxMasterId) {
        this.trxMasterId = trxMasterId;
    }

    public long getTrxId() {
        return trxId;
    }

    public void setTrxId(long trxId) {
        this.trxId = trxId;
    }

    public long getLicId() {
        return licId;
    }

    public void setLicId(long licId) {
        this.licId = licId;
    }

    public long getCbgId() {
        return cbgId;
    }

    public void setCbgId(long cbgId) {
        this.cbgId = cbgId;
    }

    public long getFnCustNbr() {
        return fnCustNbr;
    }

    public void setFnCustNbr(long fnCustNbr) {
        this.fnCustNbr = fnCustNbr;
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

    public String getAuthNo() {
        return authNo;
    }

    public void setAuthNo(String authNo) {
        this.authNo = authNo;
    }

    public short getFnProdCd() {
        return fnProdCd;
    }

    public void setFnProdCd(short fnProdCd) {
        this.fnProdCd = fnProdCd;
    }

    public BigDecimal getProdQty() {
        return prodQty;
    }

    public void setProdQty(BigDecimal prodQty) {
        this.prodQty = prodQty;
    }

    public BigDecimal getExtRetailAmt() {
        return extRetailAmt;
    }

    public void setExtRetailAmt(BigDecimal extRetailAmt) {
        this.extRetailAmt = extRetailAmt;
    }

    public BigDecimal getMrchTotAmt() {
        return mrchTotAmt;
    }

    public void setMrchTotAmt(BigDecimal mrchTotAmt) {
        this.mrchTotAmt = mrchTotAmt;
    }

    public String getMrchPricRefCd() {
        return mrchPricRefCd;
    }

    public void setMrchPricRefCd(String mrchPricRefCd) {
        this.mrchPricRefCd = mrchPricRefCd;
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

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
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
        hash += (fnTrnsProdDetailPK != null ? fnTrnsProdDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FnTrnsProdDetail)) {
            return false;
        }
        FnTrnsProdDetail other = (FnTrnsProdDetail) object;
        if ((this.fnTrnsProdDetailPK == null && other.fnTrnsProdDetailPK != null) || (this.fnTrnsProdDetailPK != null && !this.fnTrnsProdDetailPK.equals(other.fnTrnsProdDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnTrnsProdDetail[ fnTrnsProdDetailPK=" + fnTrnsProdDetailPK + " ]";
    }

}
