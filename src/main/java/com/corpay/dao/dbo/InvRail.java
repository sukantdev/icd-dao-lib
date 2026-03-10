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
@Table(name = "INV_RAIL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvRail.findAll", query = "SELECT i FROM InvRail i")})
public class InvRail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvRailPK invRailPK;
    @Basic(optional = false)
    @Column(name = "BLLING_TYP")
    private Character bllingTyp;
    @Basic(optional = false)
    @Column(name = "PASS_NM")
    private String passNm;
    @Basic(optional = false)
    @Column(name = "TCKT_NO")
    private String tcktNo;
    @Basic(optional = false)
    @Column(name = "TRVL_AGNCY_CD")
    private String trvlAgncyCd;
    @Basic(optional = false)
    @Column(name = "TRVL_AGNCY_NM")
    private String trvlAgncyNm;
    @Basic(optional = false)
    @Column(name = "TRV_DT")
    private int trvDt;
    @Basic(optional = false)
    @Column(name = "TRVL_AGNCY_SEQ_NBR")
    private String trvlAgncySeqNbr;
    @Basic(optional = false)
    @Column(name = "PROCDRE_ID")
    private String procdreId;
    @Basic(optional = false)
    @Column(name = "SRVCE_TYP_1")
    private String srvceTyp1;
    @Basic(optional = false)
    @Column(name = "SRVCE_TYP_2")
    private String srvceTyp2;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SRVCE_AMT")
    private BigDecimal srvceAmt;
    @Basic(optional = false)
    @Column(name = "SRVCE_AMT_SIGN")
    private Character srvceAmtSign;
    @Basic(optional = false)
    @Column(name = "FULL_VAT_GRSS_AMT")
    private BigDecimal fullVatGrssAmt;
    @Basic(optional = false)
    @Column(name = "FULL_VAT_GRSS_AMT_SIGN")
    private Character fullVatGrssAmtSign;
    @Basic(optional = false)
    @Column(name = "FULL_VAT_TAX_AMT")
    private BigDecimal fullVatTaxAmt;
    @Basic(optional = false)
    @Column(name = "FULL_VAT_TAX_AMT_SIGN")
    private Character fullVatTaxAmtSign;
    @Basic(optional = false)
    @Column(name = "HALF_VAT_GRSS_AMT")
    private BigDecimal halfVatGrssAmt;
    @Basic(optional = false)
    @Column(name = "HALF_VAT_GRSS_AMT_SIGN")
    private Character halfVatGrssAmtSign;
    @Basic(optional = false)
    @Column(name = "HALF_VAT_TAX_AMT")
    private BigDecimal halfVatTaxAmt;
    @Basic(optional = false)
    @Column(name = "HALF_VAT_TAX_AMT_SIGN")
    private Character halfVatTaxAmtSign;
    @Basic(optional = false)
    @Column(name = "TRFFC_CD")
    private short trffcCd;
    @Basic(optional = false)
    @Column(name = "SMPL_NBR")
    private short smplNbr;
    @Basic(optional = false)
    @Column(name = "STRT_STATION")
    private String strtStation;
    @Basic(optional = false)
    @Column(name = "DEST_STATION")
    private String destStation;
    @Basic(optional = false)
    @Column(name = "GNRIC_CD")
    private short gnricCd;
    @Basic(optional = false)
    @Column(name = "GNRIC_NO")
    private String gnricNo;
    @Basic(optional = false)
    @Column(name = "GNRIC_OTH_CD")
    private short gnricOthCd;
    @Basic(optional = false)
    @Column(name = "GNRIC_OTH_NO")
    private String gnricOthNo;
    @Basic(optional = false)
    @Column(name = "REDUCTION_CD")
    private short reductionCd;
    @Basic(optional = false)
    @Column(name = "REDUCTION_NO")
    private String reductionNo;
    @Basic(optional = false)
    @Column(name = "REDUCTION_OTH_CD")
    private short reductionOthCd;
    @Basic(optional = false)
    @Column(name = "REDUCTION_OTH_NO")
    private String reductionOthNo;
    @Basic(optional = false)
    @Column(name = "TRAN_OTH_CD")
    private short tranOthCd;
    @Basic(optional = false)
    @Column(name = "NBR_OF_ADLTS")
    private short nbrOfAdlts;
    @Basic(optional = false)
    @Column(name = "NBR_OF_CHLDRN")
    private short nbrOfChldrn;
    @Basic(optional = false)
    @Column(name = "SERVCE_CLASS")
    private Character servceClass;
    @Basic(optional = false)
    @Column(name = "TRAN_SERVCE_PRVDER")
    private String tranServcePrvder;
    @Basic(optional = false)
    @Column(name = "TRAN_SERVCE_OFFERD")
    private String tranServceOfferd;
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

    public InvRail() {
    }

    public InvRail(InvRailPK invRailPK) {
        this.invRailPK = invRailPK;
    }

    public InvRail(InvRailPK invRailPK, Character bllingTyp, String passNm, String tcktNo, String trvlAgncyCd, String trvlAgncyNm, int trvDt, String trvlAgncySeqNbr, String procdreId, String srvceTyp1, String srvceTyp2, BigDecimal srvceAmt, Character srvceAmtSign, BigDecimal fullVatGrssAmt, Character fullVatGrssAmtSign, BigDecimal fullVatTaxAmt, Character fullVatTaxAmtSign, BigDecimal halfVatGrssAmt, Character halfVatGrssAmtSign, BigDecimal halfVatTaxAmt, Character halfVatTaxAmtSign, short trffcCd, short smplNbr, String strtStation, String destStation, short gnricCd, String gnricNo, short gnricOthCd, String gnricOthNo, short reductionCd, String reductionNo, short reductionOthCd, String reductionOthNo, short tranOthCd, short nbrOfAdlts, short nbrOfChldrn, Character servceClass, String tranServcePrvder, String tranServceOfferd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invRailPK = invRailPK;
        this.bllingTyp = bllingTyp;
        this.passNm = passNm;
        this.tcktNo = tcktNo;
        this.trvlAgncyCd = trvlAgncyCd;
        this.trvlAgncyNm = trvlAgncyNm;
        this.trvDt = trvDt;
        this.trvlAgncySeqNbr = trvlAgncySeqNbr;
        this.procdreId = procdreId;
        this.srvceTyp1 = srvceTyp1;
        this.srvceTyp2 = srvceTyp2;
        this.srvceAmt = srvceAmt;
        this.srvceAmtSign = srvceAmtSign;
        this.fullVatGrssAmt = fullVatGrssAmt;
        this.fullVatGrssAmtSign = fullVatGrssAmtSign;
        this.fullVatTaxAmt = fullVatTaxAmt;
        this.fullVatTaxAmtSign = fullVatTaxAmtSign;
        this.halfVatGrssAmt = halfVatGrssAmt;
        this.halfVatGrssAmtSign = halfVatGrssAmtSign;
        this.halfVatTaxAmt = halfVatTaxAmt;
        this.halfVatTaxAmtSign = halfVatTaxAmtSign;
        this.trffcCd = trffcCd;
        this.smplNbr = smplNbr;
        this.strtStation = strtStation;
        this.destStation = destStation;
        this.gnricCd = gnricCd;
        this.gnricNo = gnricNo;
        this.gnricOthCd = gnricOthCd;
        this.gnricOthNo = gnricOthNo;
        this.reductionCd = reductionCd;
        this.reductionNo = reductionNo;
        this.reductionOthCd = reductionOthCd;
        this.reductionOthNo = reductionOthNo;
        this.tranOthCd = tranOthCd;
        this.nbrOfAdlts = nbrOfAdlts;
        this.nbrOfChldrn = nbrOfChldrn;
        this.servceClass = servceClass;
        this.tranServcePrvder = tranServcePrvder;
        this.tranServceOfferd = tranServceOfferd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvRail(Date pstdDt, int trnsId, short seqNo) {
        this.invRailPK = new InvRailPK(pstdDt, trnsId, seqNo);
    }

    public InvRailPK getInvRailPK() {
        return invRailPK;
    }

    public void setInvRailPK(InvRailPK invRailPK) {
        this.invRailPK = invRailPK;
    }

    public Character getBllingTyp() {
        return bllingTyp;
    }

    public void setBllingTyp(Character bllingTyp) {
        this.bllingTyp = bllingTyp;
    }

    public String getPassNm() {
        return passNm;
    }

    public void setPassNm(String passNm) {
        this.passNm = passNm;
    }

    public String getTcktNo() {
        return tcktNo;
    }

    public void setTcktNo(String tcktNo) {
        this.tcktNo = tcktNo;
    }

    public String getTrvlAgncyCd() {
        return trvlAgncyCd;
    }

    public void setTrvlAgncyCd(String trvlAgncyCd) {
        this.trvlAgncyCd = trvlAgncyCd;
    }

    public String getTrvlAgncyNm() {
        return trvlAgncyNm;
    }

    public void setTrvlAgncyNm(String trvlAgncyNm) {
        this.trvlAgncyNm = trvlAgncyNm;
    }

    public int getTrvDt() {
        return trvDt;
    }

    public void setTrvDt(int trvDt) {
        this.trvDt = trvDt;
    }

    public String getTrvlAgncySeqNbr() {
        return trvlAgncySeqNbr;
    }

    public void setTrvlAgncySeqNbr(String trvlAgncySeqNbr) {
        this.trvlAgncySeqNbr = trvlAgncySeqNbr;
    }

    public String getProcdreId() {
        return procdreId;
    }

    public void setProcdreId(String procdreId) {
        this.procdreId = procdreId;
    }

    public String getSrvceTyp1() {
        return srvceTyp1;
    }

    public void setSrvceTyp1(String srvceTyp1) {
        this.srvceTyp1 = srvceTyp1;
    }

    public String getSrvceTyp2() {
        return srvceTyp2;
    }

    public void setSrvceTyp2(String srvceTyp2) {
        this.srvceTyp2 = srvceTyp2;
    }

    public BigDecimal getSrvceAmt() {
        return srvceAmt;
    }

    public void setSrvceAmt(BigDecimal srvceAmt) {
        this.srvceAmt = srvceAmt;
    }

    public Character getSrvceAmtSign() {
        return srvceAmtSign;
    }

    public void setSrvceAmtSign(Character srvceAmtSign) {
        this.srvceAmtSign = srvceAmtSign;
    }

    public BigDecimal getFullVatGrssAmt() {
        return fullVatGrssAmt;
    }

    public void setFullVatGrssAmt(BigDecimal fullVatGrssAmt) {
        this.fullVatGrssAmt = fullVatGrssAmt;
    }

    public Character getFullVatGrssAmtSign() {
        return fullVatGrssAmtSign;
    }

    public void setFullVatGrssAmtSign(Character fullVatGrssAmtSign) {
        this.fullVatGrssAmtSign = fullVatGrssAmtSign;
    }

    public BigDecimal getFullVatTaxAmt() {
        return fullVatTaxAmt;
    }

    public void setFullVatTaxAmt(BigDecimal fullVatTaxAmt) {
        this.fullVatTaxAmt = fullVatTaxAmt;
    }

    public Character getFullVatTaxAmtSign() {
        return fullVatTaxAmtSign;
    }

    public void setFullVatTaxAmtSign(Character fullVatTaxAmtSign) {
        this.fullVatTaxAmtSign = fullVatTaxAmtSign;
    }

    public BigDecimal getHalfVatGrssAmt() {
        return halfVatGrssAmt;
    }

    public void setHalfVatGrssAmt(BigDecimal halfVatGrssAmt) {
        this.halfVatGrssAmt = halfVatGrssAmt;
    }

    public Character getHalfVatGrssAmtSign() {
        return halfVatGrssAmtSign;
    }

    public void setHalfVatGrssAmtSign(Character halfVatGrssAmtSign) {
        this.halfVatGrssAmtSign = halfVatGrssAmtSign;
    }

    public BigDecimal getHalfVatTaxAmt() {
        return halfVatTaxAmt;
    }

    public void setHalfVatTaxAmt(BigDecimal halfVatTaxAmt) {
        this.halfVatTaxAmt = halfVatTaxAmt;
    }

    public Character getHalfVatTaxAmtSign() {
        return halfVatTaxAmtSign;
    }

    public void setHalfVatTaxAmtSign(Character halfVatTaxAmtSign) {
        this.halfVatTaxAmtSign = halfVatTaxAmtSign;
    }

    public short getTrffcCd() {
        return trffcCd;
    }

    public void setTrffcCd(short trffcCd) {
        this.trffcCd = trffcCd;
    }

    public short getSmplNbr() {
        return smplNbr;
    }

    public void setSmplNbr(short smplNbr) {
        this.smplNbr = smplNbr;
    }

    public String getStrtStation() {
        return strtStation;
    }

    public void setStrtStation(String strtStation) {
        this.strtStation = strtStation;
    }

    public String getDestStation() {
        return destStation;
    }

    public void setDestStation(String destStation) {
        this.destStation = destStation;
    }

    public short getGnricCd() {
        return gnricCd;
    }

    public void setGnricCd(short gnricCd) {
        this.gnricCd = gnricCd;
    }

    public String getGnricNo() {
        return gnricNo;
    }

    public void setGnricNo(String gnricNo) {
        this.gnricNo = gnricNo;
    }

    public short getGnricOthCd() {
        return gnricOthCd;
    }

    public void setGnricOthCd(short gnricOthCd) {
        this.gnricOthCd = gnricOthCd;
    }

    public String getGnricOthNo() {
        return gnricOthNo;
    }

    public void setGnricOthNo(String gnricOthNo) {
        this.gnricOthNo = gnricOthNo;
    }

    public short getReductionCd() {
        return reductionCd;
    }

    public void setReductionCd(short reductionCd) {
        this.reductionCd = reductionCd;
    }

    public String getReductionNo() {
        return reductionNo;
    }

    public void setReductionNo(String reductionNo) {
        this.reductionNo = reductionNo;
    }

    public short getReductionOthCd() {
        return reductionOthCd;
    }

    public void setReductionOthCd(short reductionOthCd) {
        this.reductionOthCd = reductionOthCd;
    }

    public String getReductionOthNo() {
        return reductionOthNo;
    }

    public void setReductionOthNo(String reductionOthNo) {
        this.reductionOthNo = reductionOthNo;
    }

    public short getTranOthCd() {
        return tranOthCd;
    }

    public void setTranOthCd(short tranOthCd) {
        this.tranOthCd = tranOthCd;
    }

    public short getNbrOfAdlts() {
        return nbrOfAdlts;
    }

    public void setNbrOfAdlts(short nbrOfAdlts) {
        this.nbrOfAdlts = nbrOfAdlts;
    }

    public short getNbrOfChldrn() {
        return nbrOfChldrn;
    }

    public void setNbrOfChldrn(short nbrOfChldrn) {
        this.nbrOfChldrn = nbrOfChldrn;
    }

    public Character getServceClass() {
        return servceClass;
    }

    public void setServceClass(Character servceClass) {
        this.servceClass = servceClass;
    }

    public String getTranServcePrvder() {
        return tranServcePrvder;
    }

    public void setTranServcePrvder(String tranServcePrvder) {
        this.tranServcePrvder = tranServcePrvder;
    }

    public String getTranServceOfferd() {
        return tranServceOfferd;
    }

    public void setTranServceOfferd(String tranServceOfferd) {
        this.tranServceOfferd = tranServceOfferd;
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
        hash += (invRailPK != null ? invRailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvRail)) {
            return false;
        }
        InvRail other = (InvRail) object;
        if ((this.invRailPK == null && other.invRailPK != null) || (this.invRailPK != null && !this.invRailPK.equals(other.invRailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvRail[ invRailPK=" + invRailPK + " ]";
    }
    
}
