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
@Table(name = "PRP_PRE_AUTH", catalog = "", schema = "DBO")
public class PrpPreAuth implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrpPreAuthPK prpPreAuthPK;
    @Basic(optional = false)
    @Column(name = "D1_QTY_LIM")
    private int d1QtyLim;

    @Basic(optional = false)
    @Column(name = "D1_AMT_LIM")
    private BigDecimal d1AmtLim;
    @Basic(optional = false)
    @Column(name = "D2_QTY_LIM")
    private int d2QtyLim;
    @Basic(optional = false)
    @Column(name = "D2_AMT_LIM")
    private BigDecimal d2AmtLim;
    @Basic(optional = false)
    @Column(name = "RFR_QTY_LIM")
    private int rfrQtyLim;
    @Basic(optional = false)
    @Column(name = "RFR_AMT_LIM")
    private BigDecimal rfrAmtLim;
    @Basic(optional = false)
    @Column(name = "OTH_QTY_LIM")
    private int othQtyLim;
    @Basic(optional = false)
    @Column(name = "OTH_AMT_LIM")
    private BigDecimal othAmtLim;
    @Basic(optional = false)
    @Column(name = "ALL_AMT_LIM")
    private BigDecimal allAmtLim;
    @Basic(optional = false)
    @Column(name = "OIL_QTY_LIM")
    private int oilQtyLim;
    @Basic(optional = false)
    @Column(name = "OIL_AMT_LIM")
    private BigDecimal oilAmtLim;
    @Basic(optional = false)
    @Column(name = "CASH_AMT_LIM")
    private BigDecimal cashAmtLim;
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
    @Column(name = "WCC_CD")
    private Character wccCd;
    @Basic(optional = false)
    @Column(name = "PRE_AUTH_ID_NBR")
    private int preAuthIdNbr;
    @Basic(optional = false)
    @Column(name = "POST_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postTs;
    @Basic(optional = false)
    @Column(name = "PRE_AUTH_MSG_NBR")
    private int preAuthMsgNbr;
    @Basic(optional = false)
    @Column(name = "AUTH_CD")
    private int authCd;
    @Basic(optional = false)
    @Column(name = "AUTH_TTID")
    private String authTtid;
    @Basic(optional = false)
    @Column(name = "AUTH_TRNS_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authTrnsTs;

    public PrpPreAuth() {
    }

    public PrpPreAuth(PrpPreAuthPK prpPreAuthPK) {
        this.prpPreAuthPK = prpPreAuthPK;
    }

    public PrpPreAuth(PrpPreAuthPK prpPreAuthPK, int d1QtyLim, BigDecimal d1AmtLim, int d2QtyLim, BigDecimal d2AmtLim, int rfrQtyLim, BigDecimal rfrAmtLim, int othQtyLim, BigDecimal othAmtLim, BigDecimal allAmtLim, int oilQtyLim, BigDecimal oilAmtLim, BigDecimal cashAmtLim, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character wccCd, int preAuthIdNbr, Date postTs, int preAuthMsgNbr, int authCd, String authTtid, Date authTrnsTs) {
        this.prpPreAuthPK = prpPreAuthPK;
        this.d1QtyLim = d1QtyLim;
        this.d1AmtLim = d1AmtLim;
        this.d2QtyLim = d2QtyLim;
        this.d2AmtLim = d2AmtLim;
        this.rfrQtyLim = rfrQtyLim;
        this.rfrAmtLim = rfrAmtLim;
        this.othQtyLim = othQtyLim;
        this.othAmtLim = othAmtLim;
        this.allAmtLim = allAmtLim;
        this.oilQtyLim = oilQtyLim;
        this.oilAmtLim = oilAmtLim;
        this.cashAmtLim = cashAmtLim;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.wccCd = wccCd;
        this.preAuthIdNbr = preAuthIdNbr;
        this.postTs = postTs;
        this.preAuthMsgNbr = preAuthMsgNbr;
        this.authCd = authCd;
        this.authTtid = authTtid;
        this.authTrnsTs = authTrnsTs;
    }

    public PrpPreAuth(String crdNbr, String mrchNbr, Date preAuthDt, Date preAuthTs, Character postFlg) {
        this.prpPreAuthPK = new PrpPreAuthPK(crdNbr, mrchNbr, preAuthDt, preAuthTs, postFlg);
    }

    public PrpPreAuthPK getPrpPreAuthPK() {
        return prpPreAuthPK;
    }

    public void setPrpPreAuthPK(PrpPreAuthPK prpPreAuthPK) {
        this.prpPreAuthPK = prpPreAuthPK;
    }

    public int getD1QtyLim() {
        return d1QtyLim;
    }

    public void setD1QtyLim(int d1QtyLim) {
        this.d1QtyLim = d1QtyLim;
    }

    public BigDecimal getD1AmtLim() {
        return d1AmtLim;
    }

    public void setD1AmtLim(BigDecimal d1AmtLim) {
        this.d1AmtLim = d1AmtLim;
    }

    public int getD2QtyLim() {
        return d2QtyLim;
    }

    public void setD2QtyLim(int d2QtyLim) {
        this.d2QtyLim = d2QtyLim;
    }

    public BigDecimal getD2AmtLim() {
        return d2AmtLim;
    }

    public void setD2AmtLim(BigDecimal d2AmtLim) {
        this.d2AmtLim = d2AmtLim;
    }

    public int getRfrQtyLim() {
        return rfrQtyLim;
    }

    public void setRfrQtyLim(int rfrQtyLim) {
        this.rfrQtyLim = rfrQtyLim;
    }

    public BigDecimal getRfrAmtLim() {
        return rfrAmtLim;
    }

    public void setRfrAmtLim(BigDecimal rfrAmtLim) {
        this.rfrAmtLim = rfrAmtLim;
    }

    public int getOthQtyLim() {
        return othQtyLim;
    }

    public void setOthQtyLim(int othQtyLim) {
        this.othQtyLim = othQtyLim;
    }

    public BigDecimal getOthAmtLim() {
        return othAmtLim;
    }

    public void setOthAmtLim(BigDecimal othAmtLim) {
        this.othAmtLim = othAmtLim;
    }

    public BigDecimal getAllAmtLim() {
        return allAmtLim;
    }

    public void setAllAmtLim(BigDecimal allAmtLim) {
        this.allAmtLim = allAmtLim;
    }

    public int getOilQtyLim() {
        return oilQtyLim;
    }

    public void setOilQtyLim(int oilQtyLim) {
        this.oilQtyLim = oilQtyLim;
    }

    public BigDecimal getOilAmtLim() {
        return oilAmtLim;
    }

    public void setOilAmtLim(BigDecimal oilAmtLim) {
        this.oilAmtLim = oilAmtLim;
    }

    public BigDecimal getCashAmtLim() {
        return cashAmtLim;
    }

    public void setCashAmtLim(BigDecimal cashAmtLim) {
        this.cashAmtLim = cashAmtLim;
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

    public Character getWccCd() {
        return wccCd;
    }

    public void setWccCd(Character wccCd) {
        this.wccCd = wccCd;
    }

    public int getPreAuthIdNbr() {
        return preAuthIdNbr;
    }

    public void setPreAuthIdNbr(int preAuthIdNbr) {
        this.preAuthIdNbr = preAuthIdNbr;
    }

    public Date getPostTs() {
        return postTs;
    }

    public void setPostTs(Date postTs) {
        this.postTs = postTs;
    }

    public int getPreAuthMsgNbr() {
        return preAuthMsgNbr;
    }

    public void setPreAuthMsgNbr(int preAuthMsgNbr) {
        this.preAuthMsgNbr = preAuthMsgNbr;
    }

    public int getAuthCd() {
        return authCd;
    }

    public void setAuthCd(int authCd) {
        this.authCd = authCd;
    }

    public String getAuthTtid() {
        return authTtid;
    }

    public void setAuthTtid(String authTtid) {
        this.authTtid = authTtid;
    }

    public Date getAuthTrnsTs() {
        return authTrnsTs;
    }

    public void setAuthTrnsTs(Date authTrnsTs) {
        this.authTrnsTs = authTrnsTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prpPreAuthPK != null ? prpPreAuthPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrpPreAuth)) {
            return false;
        }
        PrpPreAuth other = (PrpPreAuth) object;
        if ((this.prpPreAuthPK == null && other.prpPreAuthPK != null) || (this.prpPreAuthPK != null && !this.prpPreAuthPK.equals(other.prpPreAuthPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrpPreAuth[ prpPreAuthPK=" + prpPreAuthPK + " ]";
    }

}
