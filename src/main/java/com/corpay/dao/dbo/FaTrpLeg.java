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
@Table(name = "FA_TRP_LEG", catalog = "", schema = "DBO")
public class FaTrpLeg implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FaTrpLegPK faTrpLegPK;
    @Basic(optional = false)
    @Column(name = "ORGN_NM")
    private String orgnNm;
    @Basic(optional = false)
    @Column(name = "ORGN_ADDR")
    private String orgnAddr;
    @Basic(optional = false)
    @Column(name = "ORGN_CTY")
    private String orgnCty;
    @Basic(optional = false)
    @Column(name = "ORGN_ST")
    private String orgnSt;
    @Basic(optional = false)
    @Column(name = "ORGN_POST_CD")
    private String orgnPostCd;

    @Basic(optional = false)
    @Column(name = "ORGN_LAT")
    private BigDecimal orgnLat;
    @Basic(optional = false)
    @Column(name = "ORGN_LON")
    private BigDecimal orgnLon;
    @Basic(optional = false)
    @Column(name = "DEST_NM")
    private String destNm;
    @Basic(optional = false)
    @Column(name = "DEST_ADDR")
    private String destAddr;
    @Basic(optional = false)
    @Column(name = "DEST_CTY")
    private String destCty;
    @Basic(optional = false)
    @Column(name = "DEST_ST")
    private String destSt;
    @Basic(optional = false)
    @Column(name = "DEST_POST_CD")
    private String destPostCd;
    @Basic(optional = false)
    @Column(name = "DEST_LAT")
    private BigDecimal destLat;
    @Basic(optional = false)
    @Column(name = "DEST_LON")
    private BigDecimal destLon;
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

    public FaTrpLeg() {
    }

    public FaTrpLeg(FaTrpLegPK faTrpLegPK) {
        this.faTrpLegPK = faTrpLegPK;
    }

    public FaTrpLeg(FaTrpLegPK faTrpLegPK, String orgnNm, String orgnAddr, String orgnCty, String orgnSt, String orgnPostCd, BigDecimal orgnLat, BigDecimal orgnLon, String destNm, String destAddr, String destCty, String destSt, String destPostCd, BigDecimal destLat, BigDecimal destLon, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.faTrpLegPK = faTrpLegPK;
        this.orgnNm = orgnNm;
        this.orgnAddr = orgnAddr;
        this.orgnCty = orgnCty;
        this.orgnSt = orgnSt;
        this.orgnPostCd = orgnPostCd;
        this.orgnLat = orgnLat;
        this.orgnLon = orgnLon;
        this.destNm = destNm;
        this.destAddr = destAddr;
        this.destCty = destCty;
        this.destSt = destSt;
        this.destPostCd = destPostCd;
        this.destLat = destLat;
        this.destLon = destLon;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FaTrpLeg(long trpId, short legNbr) {
        this.faTrpLegPK = new FaTrpLegPK(trpId, legNbr);
    }

    public FaTrpLegPK getFaTrpLegPK() {
        return faTrpLegPK;
    }

    public void setFaTrpLegPK(FaTrpLegPK faTrpLegPK) {
        this.faTrpLegPK = faTrpLegPK;
    }

    public String getOrgnNm() {
        return orgnNm;
    }

    public void setOrgnNm(String orgnNm) {
        this.orgnNm = orgnNm;
    }

    public String getOrgnAddr() {
        return orgnAddr;
    }

    public void setOrgnAddr(String orgnAddr) {
        this.orgnAddr = orgnAddr;
    }

    public String getOrgnCty() {
        return orgnCty;
    }

    public void setOrgnCty(String orgnCty) {
        this.orgnCty = orgnCty;
    }

    public String getOrgnSt() {
        return orgnSt;
    }

    public void setOrgnSt(String orgnSt) {
        this.orgnSt = orgnSt;
    }

    public String getOrgnPostCd() {
        return orgnPostCd;
    }

    public void setOrgnPostCd(String orgnPostCd) {
        this.orgnPostCd = orgnPostCd;
    }

    public BigDecimal getOrgnLat() {
        return orgnLat;
    }

    public void setOrgnLat(BigDecimal orgnLat) {
        this.orgnLat = orgnLat;
    }

    public BigDecimal getOrgnLon() {
        return orgnLon;
    }

    public void setOrgnLon(BigDecimal orgnLon) {
        this.orgnLon = orgnLon;
    }

    public String getDestNm() {
        return destNm;
    }

    public void setDestNm(String destNm) {
        this.destNm = destNm;
    }

    public String getDestAddr() {
        return destAddr;
    }

    public void setDestAddr(String destAddr) {
        this.destAddr = destAddr;
    }

    public String getDestCty() {
        return destCty;
    }

    public void setDestCty(String destCty) {
        this.destCty = destCty;
    }

    public String getDestSt() {
        return destSt;
    }

    public void setDestSt(String destSt) {
        this.destSt = destSt;
    }

    public String getDestPostCd() {
        return destPostCd;
    }

    public void setDestPostCd(String destPostCd) {
        this.destPostCd = destPostCd;
    }

    public BigDecimal getDestLat() {
        return destLat;
    }

    public void setDestLat(BigDecimal destLat) {
        this.destLat = destLat;
    }

    public BigDecimal getDestLon() {
        return destLon;
    }

    public void setDestLon(BigDecimal destLon) {
        this.destLon = destLon;
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
        hash += (faTrpLegPK != null ? faTrpLegPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FaTrpLeg)) {
            return false;
        }
        FaTrpLeg other = (FaTrpLeg) object;
        if ((this.faTrpLegPK == null && other.faTrpLegPK != null) || (this.faTrpLegPK != null && !this.faTrpLegPK.equals(other.faTrpLegPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaTrpLeg[ faTrpLegPK=" + faTrpLegPK + " ]";
    }

}
