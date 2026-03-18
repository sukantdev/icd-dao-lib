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
@Table(name = "TELE_PRD", catalog = "", schema = "DBO")
public class TelePrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TelePrdPK telePrdPK;
    @Basic(optional = false)
    @Column(name = "PRD_SENT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prdSentTs;
    @Basic(optional = false)
    @Column(name = "PRD_SENT_UNQ_ID")
    private String prdSentUnqId;
    @Basic(optional = false)
    @Column(name = "PRD_CODE")
    private String prdCode;

    @Basic(optional = false)
    @Column(name = "PRD_QTY")
    private BigDecimal prdQty;
    @Basic(optional = false)
    @Column(name = "PRD_QTY_UOM")
    private Character prdQtyUom;
    @Basic(optional = false)
    @Column(name = "PRD_COST")
    private BigDecimal prdCost;
    @Basic(optional = false)
    @Column(name = "PRD_COST_CUR_CD")
    private short prdCostCurCd;
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

    public TelePrd() {
    }

    public TelePrd(TelePrdPK telePrdPK) {
        this.telePrdPK = telePrdPK;
    }

    public TelePrd(TelePrdPK telePrdPK, Date prdSentTs, String prdSentUnqId, String prdCode, BigDecimal prdQty, Character prdQtyUom, BigDecimal prdCost, short prdCostCurCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.telePrdPK = telePrdPK;
        this.prdSentTs = prdSentTs;
        this.prdSentUnqId = prdSentUnqId;
        this.prdCode = prdCode;
        this.prdQty = prdQty;
        this.prdQtyUom = prdQtyUom;
        this.prdCost = prdCost;
        this.prdCostCurCd = prdCostCurCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public TelePrd(String partnerId, Date teleTrnsTs, long trkNbr, short prdNbr) {
        this.telePrdPK = new TelePrdPK(partnerId, teleTrnsTs, trkNbr, prdNbr);
    }

    public TelePrdPK getTelePrdPK() {
        return telePrdPK;
    }

    public void setTelePrdPK(TelePrdPK telePrdPK) {
        this.telePrdPK = telePrdPK;
    }

    public Date getPrdSentTs() {
        return prdSentTs;
    }

    public void setPrdSentTs(Date prdSentTs) {
        this.prdSentTs = prdSentTs;
    }

    public String getPrdSentUnqId() {
        return prdSentUnqId;
    }

    public void setPrdSentUnqId(String prdSentUnqId) {
        this.prdSentUnqId = prdSentUnqId;
    }

    public String getPrdCode() {
        return prdCode;
    }

    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode;
    }

    public BigDecimal getPrdQty() {
        return prdQty;
    }

    public void setPrdQty(BigDecimal prdQty) {
        this.prdQty = prdQty;
    }

    public Character getPrdQtyUom() {
        return prdQtyUom;
    }

    public void setPrdQtyUom(Character prdQtyUom) {
        this.prdQtyUom = prdQtyUom;
    }

    public BigDecimal getPrdCost() {
        return prdCost;
    }

    public void setPrdCost(BigDecimal prdCost) {
        this.prdCost = prdCost;
    }

    public short getPrdCostCurCd() {
        return prdCostCurCd;
    }

    public void setPrdCostCurCd(short prdCostCurCd) {
        this.prdCostCurCd = prdCostCurCd;
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
        hash += (telePrdPK != null ? telePrdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TelePrd)) {
            return false;
        }
        TelePrd other = (TelePrd) object;
        if ((this.telePrdPK == null && other.telePrdPK != null) || (this.telePrdPK != null && !this.telePrdPK.equals(other.telePrdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePrd[ telePrdPK=" + telePrdPK + " ]";
    }

}
