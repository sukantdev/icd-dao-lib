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
@Table(name = "INV_HLTHCR", catalog = "", schema = "DBO")
public class InvHlthcr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvHlthcrPK invHlthcrPK;
    @Basic(optional = false)
    @Column(name = "ITM_DES")
    private String itmDes;

    @Basic(optional = false)
    @Column(name = "ITM_QTY")
    private BigDecimal itmQty;
    @Basic(optional = false)
    @Column(name = "ITM_QTY_EXP")
    private Character itmQtyExp;
    @Basic(optional = false)
    @Column(name = "UNT_PRIC")
    private BigDecimal untPric;
    @Basic(optional = false)
    @Column(name = "UNT_PRIC_EXP")
    private Character untPricExp;
    @Basic(optional = false)
    @Column(name = "HC_ST_IND")
    private Character hcStInd;
    @Basic(optional = false)
    @Column(name = "CUSTOMER_ID")
    private String customerId;
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

    public InvHlthcr() {
    }

    public InvHlthcr(InvHlthcrPK invHlthcrPK) {
        this.invHlthcrPK = invHlthcrPK;
    }

    public InvHlthcr(InvHlthcrPK invHlthcrPK, String itmDes, BigDecimal itmQty, Character itmQtyExp, BigDecimal untPric, Character untPricExp, Character hcStInd, String customerId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invHlthcrPK = invHlthcrPK;
        this.itmDes = itmDes;
        this.itmQty = itmQty;
        this.itmQtyExp = itmQtyExp;
        this.untPric = untPric;
        this.untPricExp = untPricExp;
        this.hcStInd = hcStInd;
        this.customerId = customerId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvHlthcr(Date pstdDt, int trnsId, short seqNo) {
        this.invHlthcrPK = new InvHlthcrPK(pstdDt, trnsId, seqNo);
    }

    public InvHlthcrPK getInvHlthcrPK() {
        return invHlthcrPK;
    }

    public void setInvHlthcrPK(InvHlthcrPK invHlthcrPK) {
        this.invHlthcrPK = invHlthcrPK;
    }

    public String getItmDes() {
        return itmDes;
    }

    public void setItmDes(String itmDes) {
        this.itmDes = itmDes;
    }

    public BigDecimal getItmQty() {
        return itmQty;
    }

    public void setItmQty(BigDecimal itmQty) {
        this.itmQty = itmQty;
    }

    public Character getItmQtyExp() {
        return itmQtyExp;
    }

    public void setItmQtyExp(Character itmQtyExp) {
        this.itmQtyExp = itmQtyExp;
    }

    public BigDecimal getUntPric() {
        return untPric;
    }

    public void setUntPric(BigDecimal untPric) {
        this.untPric = untPric;
    }

    public Character getUntPricExp() {
        return untPricExp;
    }

    public void setUntPricExp(Character untPricExp) {
        this.untPricExp = untPricExp;
    }

    public Character getHcStInd() {
        return hcStInd;
    }

    public void setHcStInd(Character hcStInd) {
        this.hcStInd = hcStInd;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
        hash += (invHlthcrPK != null ? invHlthcrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvHlthcr)) {
            return false;
        }
        InvHlthcr other = (InvHlthcr) object;
        if ((this.invHlthcrPK == null && other.invHlthcrPK != null) || (this.invHlthcrPK != null && !this.invHlthcrPK.equals(other.invHlthcrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvHlthcr[ invHlthcrPK=" + invHlthcrPK + " ]";
    }

}
