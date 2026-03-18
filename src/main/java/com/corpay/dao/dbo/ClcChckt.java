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
@Table(name = "CLC_CHCKT", catalog = "", schema = "DBO")
public class ClcChckt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClcChcktPK clcChcktPK;
    @Basic(optional = false)
    @Column(name = "CLC_CRD_NBR")
    private String clcCrdNbr;
    @Basic(optional = false)
    @Column(name = "CLC_HTL_NM")
    private String clcHtlNm;
    @Basic(optional = false)
    @Column(name = "CLC_HTL_CT")
    private String clcHtlCt;
    @Basic(optional = false)
    @Column(name = "CLC_HTL_ST")
    private String clcHtlSt;
    @Basic(optional = false)
    @Column(name = "CLC_CHCK_IN_DT")
    @Temporal(TemporalType.DATE)
    private Date clcChckInDt;
    @Basic(optional = false)
    @Column(name = "CLC_CHCK_OUT_DT")
    @Temporal(TemporalType.DATE)
    private Date clcChckOutDt;
    @Basic(optional = false)
    @Column(name = "CLC_TRNS_ID")
    private String clcTrnsId;
    @Basic(optional = false)
    @Column(name = "CLC_LGTH_OF_STY")
    private short clcLgthOfSty;

    @Basic(optional = false)
    @Column(name = "CLC_TRNS_AMT")
    private BigDecimal clcTrnsAmt;
    @Basic(optional = false)
    @Column(name = "CLC_LOC_CD")
    private String clcLocCd;
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
    @Column(name = "CLC_MIN_PUB_RATE_AMT")
    private BigDecimal clcMinPubRateAmt;
    @Basic(optional = false)
    @Column(name = "CLC_ROOM_RATE_CHARGED_AMT")
    private BigDecimal clcRoomRateChargedAmt;
    @Basic(optional = false)
    @Column(name = "CLC_TAX_AMT")
    private BigDecimal clcTaxAmt;
    @Basic(optional = false)
    @Column(name = "CLC_TRANS_FEE_AMT")
    private BigDecimal clcTransFeeAmt;
    @Basic(optional = false)
    @Column(name = "CLC_CARDHLDR_FST_NAME")
    private String clcCardhldrFstName;
    @Basic(optional = false)
    @Column(name = "CLC_CARDHLDR_LST_NAME")
    private String clcCardhldrLstName;
    @Basic(optional = false)
    @Column(name = "CLC_ROOM_NBR")
    private String clcRoomNbr;
    @Basic(optional = false)
    @Column(name = "CLC_FOLIO_NBR")
    private String clcFolioNbr;
    @Basic(optional = false)
    @Column(name = "CLC_HOTEL_ADDR")
    private String clcHotelAddr;
    @Basic(optional = false)
    @Column(name = "CLC_CARDHLDR_EMAIL_ADDR")
    private String clcCardhldrEmailAddr;

    public ClcChckt() {
    }

    public ClcChckt(ClcChcktPK clcChcktPK) {
        this.clcChcktPK = clcChcktPK;
    }

    public ClcChckt(ClcChcktPK clcChcktPK, String clcCrdNbr, String clcHtlNm, String clcHtlCt, String clcHtlSt, Date clcChckInDt, Date clcChckOutDt, String clcTrnsId, short clcLgthOfSty, BigDecimal clcTrnsAmt, String clcLocCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, BigDecimal clcMinPubRateAmt, BigDecimal clcRoomRateChargedAmt, BigDecimal clcTaxAmt, BigDecimal clcTransFeeAmt, String clcCardhldrFstName, String clcCardhldrLstName, String clcRoomNbr, String clcFolioNbr, String clcHotelAddr, String clcCardhldrEmailAddr) {
        this.clcChcktPK = clcChcktPK;
        this.clcCrdNbr = clcCrdNbr;
        this.clcHtlNm = clcHtlNm;
        this.clcHtlCt = clcHtlCt;
        this.clcHtlSt = clcHtlSt;
        this.clcChckInDt = clcChckInDt;
        this.clcChckOutDt = clcChckOutDt;
        this.clcTrnsId = clcTrnsId;
        this.clcLgthOfSty = clcLgthOfSty;
        this.clcTrnsAmt = clcTrnsAmt;
        this.clcLocCd = clcLocCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.clcMinPubRateAmt = clcMinPubRateAmt;
        this.clcRoomRateChargedAmt = clcRoomRateChargedAmt;
        this.clcTaxAmt = clcTaxAmt;
        this.clcTransFeeAmt = clcTransFeeAmt;
        this.clcCardhldrFstName = clcCardhldrFstName;
        this.clcCardhldrLstName = clcCardhldrLstName;
        this.clcRoomNbr = clcRoomNbr;
        this.clcFolioNbr = clcFolioNbr;
        this.clcHotelAddr = clcHotelAddr;
        this.clcCardhldrEmailAddr = clcCardhldrEmailAddr;
    }

    public ClcChckt(int clcCtlNbr, Date clcPstgDt) {
        this.clcChcktPK = new ClcChcktPK(clcCtlNbr, clcPstgDt);
    }

    public ClcChcktPK getClcChcktPK() {
        return clcChcktPK;
    }

    public void setClcChcktPK(ClcChcktPK clcChcktPK) {
        this.clcChcktPK = clcChcktPK;
    }

    public String getClcCrdNbr() {
        return clcCrdNbr;
    }

    public void setClcCrdNbr(String clcCrdNbr) {
        this.clcCrdNbr = clcCrdNbr;
    }

    public String getClcHtlNm() {
        return clcHtlNm;
    }

    public void setClcHtlNm(String clcHtlNm) {
        this.clcHtlNm = clcHtlNm;
    }

    public String getClcHtlCt() {
        return clcHtlCt;
    }

    public void setClcHtlCt(String clcHtlCt) {
        this.clcHtlCt = clcHtlCt;
    }

    public String getClcHtlSt() {
        return clcHtlSt;
    }

    public void setClcHtlSt(String clcHtlSt) {
        this.clcHtlSt = clcHtlSt;
    }

    public Date getClcChckInDt() {
        return clcChckInDt;
    }

    public void setClcChckInDt(Date clcChckInDt) {
        this.clcChckInDt = clcChckInDt;
    }

    public Date getClcChckOutDt() {
        return clcChckOutDt;
    }

    public void setClcChckOutDt(Date clcChckOutDt) {
        this.clcChckOutDt = clcChckOutDt;
    }

    public String getClcTrnsId() {
        return clcTrnsId;
    }

    public void setClcTrnsId(String clcTrnsId) {
        this.clcTrnsId = clcTrnsId;
    }

    public short getClcLgthOfSty() {
        return clcLgthOfSty;
    }

    public void setClcLgthOfSty(short clcLgthOfSty) {
        this.clcLgthOfSty = clcLgthOfSty;
    }

    public BigDecimal getClcTrnsAmt() {
        return clcTrnsAmt;
    }

    public void setClcTrnsAmt(BigDecimal clcTrnsAmt) {
        this.clcTrnsAmt = clcTrnsAmt;
    }

    public String getClcLocCd() {
        return clcLocCd;
    }

    public void setClcLocCd(String clcLocCd) {
        this.clcLocCd = clcLocCd;
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

    public BigDecimal getClcMinPubRateAmt() {
        return clcMinPubRateAmt;
    }

    public void setClcMinPubRateAmt(BigDecimal clcMinPubRateAmt) {
        this.clcMinPubRateAmt = clcMinPubRateAmt;
    }

    public BigDecimal getClcRoomRateChargedAmt() {
        return clcRoomRateChargedAmt;
    }

    public void setClcRoomRateChargedAmt(BigDecimal clcRoomRateChargedAmt) {
        this.clcRoomRateChargedAmt = clcRoomRateChargedAmt;
    }

    public BigDecimal getClcTaxAmt() {
        return clcTaxAmt;
    }

    public void setClcTaxAmt(BigDecimal clcTaxAmt) {
        this.clcTaxAmt = clcTaxAmt;
    }

    public BigDecimal getClcTransFeeAmt() {
        return clcTransFeeAmt;
    }

    public void setClcTransFeeAmt(BigDecimal clcTransFeeAmt) {
        this.clcTransFeeAmt = clcTransFeeAmt;
    }

    public String getClcCardhldrFstName() {
        return clcCardhldrFstName;
    }

    public void setClcCardhldrFstName(String clcCardhldrFstName) {
        this.clcCardhldrFstName = clcCardhldrFstName;
    }

    public String getClcCardhldrLstName() {
        return clcCardhldrLstName;
    }

    public void setClcCardhldrLstName(String clcCardhldrLstName) {
        this.clcCardhldrLstName = clcCardhldrLstName;
    }

    public String getClcRoomNbr() {
        return clcRoomNbr;
    }

    public void setClcRoomNbr(String clcRoomNbr) {
        this.clcRoomNbr = clcRoomNbr;
    }

    public String getClcFolioNbr() {
        return clcFolioNbr;
    }

    public void setClcFolioNbr(String clcFolioNbr) {
        this.clcFolioNbr = clcFolioNbr;
    }

    public String getClcHotelAddr() {
        return clcHotelAddr;
    }

    public void setClcHotelAddr(String clcHotelAddr) {
        this.clcHotelAddr = clcHotelAddr;
    }

    public String getClcCardhldrEmailAddr() {
        return clcCardhldrEmailAddr;
    }

    public void setClcCardhldrEmailAddr(String clcCardhldrEmailAddr) {
        this.clcCardhldrEmailAddr = clcCardhldrEmailAddr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clcChcktPK != null ? clcChcktPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ClcChckt)) {
            return false;
        }
        ClcChckt other = (ClcChckt) object;
        if ((this.clcChcktPK == null && other.clcChcktPK != null) || (this.clcChcktPK != null && !this.clcChcktPK.equals(other.clcChcktPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ClcChckt[ clcChcktPK=" + clcChcktPK + " ]";
    }

}
