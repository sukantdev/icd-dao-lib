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
@Table(name = "INV_PSGR", catalog = "", schema = "DBO")
public class InvPsgr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPsgrPK invPsgrPK;
    @Basic(optional = false)
    @Column(name = "TRVL_DT")
    @Temporal(TemporalType.DATE)
    private Date trvlDt;
    @Basic(optional = false)
    @Column(name = "CARR_CD")
    private String carrCd;
    @Basic(optional = false)
    @Column(name = "SRV_CLS_CD")
    private String srvClsCd;
    @Basic(optional = false)
    @Column(name = "ORGN_ARPT_CD")
    private String orgnArptCd;
    @Basic(optional = false)
    @Column(name = "DEST_ARPT_CD")
    private String destArptCd;
    @Basic(optional = false)
    @Column(name = "STP_OVR_CD")
    private Character stpOvrCd;
    @Basic(optional = false)
    @Column(name = "CNJ_TKT")
    private String cnjTkt;
    @Basic(optional = false)
    @Column(name = "XCHG_TKT")
    private String xchgTkt;
    @Basic(optional = false)
    @Column(name = "CPN_NBR")
    private Character cpnNbr;
    @Basic(optional = false)
    @Column(name = "FARE_BASIS_CD")
    private String fareBasisCd;
    @Basic(optional = false)
    @Column(name = "FLIGHT_NBR")
    private String flightNbr;
    @Basic(optional = false)
    @Column(name = "DEPR_TM")
    @Temporal(TemporalType.TIME)
    private Date deprTm;
    @Basic(optional = false)
    @Column(name = "ARVL_TM")
    @Temporal(TemporalType.TIME)
    private Date arvlTm;

    @Basic(optional = false)
    @Column(name = "FARE")
    private BigDecimal fare;
    @Basic(optional = false)
    @Column(name = "FEE")
    private BigDecimal fee;
    @Basic(optional = false)
    @Column(name = "TAXES")
    private BigDecimal taxes;
    @Basic(optional = false)
    @Column(name = "ENDSMTS_RSTS")
    private String endsmtsRsts;
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

    public InvPsgr() {
    }

    public InvPsgr(InvPsgrPK invPsgrPK) {
        this.invPsgrPK = invPsgrPK;
    }

    public InvPsgr(InvPsgrPK invPsgrPK, Date trvlDt, String carrCd, String srvClsCd, String orgnArptCd, String destArptCd, Character stpOvrCd, String cnjTkt, String xchgTkt, Character cpnNbr, String fareBasisCd, String flightNbr, Date deprTm, Date arvlTm, BigDecimal fare, BigDecimal fee, BigDecimal taxes, String endsmtsRsts, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invPsgrPK = invPsgrPK;
        this.trvlDt = trvlDt;
        this.carrCd = carrCd;
        this.srvClsCd = srvClsCd;
        this.orgnArptCd = orgnArptCd;
        this.destArptCd = destArptCd;
        this.stpOvrCd = stpOvrCd;
        this.cnjTkt = cnjTkt;
        this.xchgTkt = xchgTkt;
        this.cpnNbr = cpnNbr;
        this.fareBasisCd = fareBasisCd;
        this.flightNbr = flightNbr;
        this.deprTm = deprTm;
        this.arvlTm = arvlTm;
        this.fare = fare;
        this.fee = fee;
        this.taxes = taxes;
        this.endsmtsRsts = endsmtsRsts;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvPsgr(Date pstdDt, int trnsId, short seqNbr) {
        this.invPsgrPK = new InvPsgrPK(pstdDt, trnsId, seqNbr);
    }

    public InvPsgrPK getInvPsgrPK() {
        return invPsgrPK;
    }

    public void setInvPsgrPK(InvPsgrPK invPsgrPK) {
        this.invPsgrPK = invPsgrPK;
    }

    public Date getTrvlDt() {
        return trvlDt;
    }

    public void setTrvlDt(Date trvlDt) {
        this.trvlDt = trvlDt;
    }

    public String getCarrCd() {
        return carrCd;
    }

    public void setCarrCd(String carrCd) {
        this.carrCd = carrCd;
    }

    public String getSrvClsCd() {
        return srvClsCd;
    }

    public void setSrvClsCd(String srvClsCd) {
        this.srvClsCd = srvClsCd;
    }

    public String getOrgnArptCd() {
        return orgnArptCd;
    }

    public void setOrgnArptCd(String orgnArptCd) {
        this.orgnArptCd = orgnArptCd;
    }

    public String getDestArptCd() {
        return destArptCd;
    }

    public void setDestArptCd(String destArptCd) {
        this.destArptCd = destArptCd;
    }

    public Character getStpOvrCd() {
        return stpOvrCd;
    }

    public void setStpOvrCd(Character stpOvrCd) {
        this.stpOvrCd = stpOvrCd;
    }

    public String getCnjTkt() {
        return cnjTkt;
    }

    public void setCnjTkt(String cnjTkt) {
        this.cnjTkt = cnjTkt;
    }

    public String getXchgTkt() {
        return xchgTkt;
    }

    public void setXchgTkt(String xchgTkt) {
        this.xchgTkt = xchgTkt;
    }

    public Character getCpnNbr() {
        return cpnNbr;
    }

    public void setCpnNbr(Character cpnNbr) {
        this.cpnNbr = cpnNbr;
    }

    public String getFareBasisCd() {
        return fareBasisCd;
    }

    public void setFareBasisCd(String fareBasisCd) {
        this.fareBasisCd = fareBasisCd;
    }

    public String getFlightNbr() {
        return flightNbr;
    }

    public void setFlightNbr(String flightNbr) {
        this.flightNbr = flightNbr;
    }

    public Date getDeprTm() {
        return deprTm;
    }

    public void setDeprTm(Date deprTm) {
        this.deprTm = deprTm;
    }

    public Date getArvlTm() {
        return arvlTm;
    }

    public void setArvlTm(Date arvlTm) {
        this.arvlTm = arvlTm;
    }

    public BigDecimal getFare() {
        return fare;
    }

    public void setFare(BigDecimal fare) {
        this.fare = fare;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public String getEndsmtsRsts() {
        return endsmtsRsts;
    }

    public void setEndsmtsRsts(String endsmtsRsts) {
        this.endsmtsRsts = endsmtsRsts;
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
        hash += (invPsgrPK != null ? invPsgrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvPsgr)) {
            return false;
        }
        InvPsgr other = (InvPsgr) object;
        if ((this.invPsgrPK == null && other.invPsgrPK != null) || (this.invPsgrPK != null && !this.invPsgrPK.equals(other.invPsgrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvPsgr[ invPsgrPK=" + invPsgrPK + " ]";
    }

}
