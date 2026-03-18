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
@Table(name = "EV_CDR_COST_SEGMENTS", catalog = "", schema = "DBO")
public class EvCdrCostSegments implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EvCdrCostSegmentsPK evCdrCostSegmentsPK;

    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_QTY")
    private BigDecimal itemCostSgmntQty;
    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_PPU_W_TAX_AMT")
    private BigDecimal itemCostSgmntPpuWTaxAmt;
    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_WO_TAX_AMT")
    private BigDecimal itemCostSgmntWoTaxAmt;
    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_W_TAX_AMT")
    private BigDecimal itemCostSgmntWTaxAmt;
    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_UNIT_TYPE")
    private String itemCostSgmntUnitType;
    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_UNIT_AMT")
    private int itemCostSgmntUnitAmt;
    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_TAX_RATE")
    private BigDecimal itemCostSgmntTaxRate;
    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_FROM_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itemCostSgmntFromTs;
    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_LOCAL_FROM_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itemCostSgmntLocalFromTs;
    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_TO_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itemCostSgmntToTs;
    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_LOCAL_TO_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itemCostSgmntLocalToTs;
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

    public EvCdrCostSegments() {
    }

    public EvCdrCostSegments(EvCdrCostSegmentsPK evCdrCostSegmentsPK) {
        this.evCdrCostSegmentsPK = evCdrCostSegmentsPK;
    }

    public EvCdrCostSegments(EvCdrCostSegmentsPK evCdrCostSegmentsPK, BigDecimal itemCostSgmntQty, BigDecimal itemCostSgmntPpuWTaxAmt, BigDecimal itemCostSgmntWoTaxAmt, BigDecimal itemCostSgmntWTaxAmt, String itemCostSgmntUnitType, int itemCostSgmntUnitAmt, BigDecimal itemCostSgmntTaxRate, Date itemCostSgmntFromTs, Date itemCostSgmntLocalFromTs, Date itemCostSgmntToTs, Date itemCostSgmntLocalToTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.evCdrCostSegmentsPK = evCdrCostSegmentsPK;
        this.itemCostSgmntQty = itemCostSgmntQty;
        this.itemCostSgmntPpuWTaxAmt = itemCostSgmntPpuWTaxAmt;
        this.itemCostSgmntWoTaxAmt = itemCostSgmntWoTaxAmt;
        this.itemCostSgmntWTaxAmt = itemCostSgmntWTaxAmt;
        this.itemCostSgmntUnitType = itemCostSgmntUnitType;
        this.itemCostSgmntUnitAmt = itemCostSgmntUnitAmt;
        this.itemCostSgmntTaxRate = itemCostSgmntTaxRate;
        this.itemCostSgmntFromTs = itemCostSgmntFromTs;
        this.itemCostSgmntLocalFromTs = itemCostSgmntLocalFromTs;
        this.itemCostSgmntToTs = itemCostSgmntToTs;
        this.itemCostSgmntLocalToTs = itemCostSgmntLocalToTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public EvCdrCostSegments(String cdrRequestId, String itemSessionId, String itemCostSgmntType) {
        this.evCdrCostSegmentsPK = new EvCdrCostSegmentsPK(cdrRequestId, itemSessionId, itemCostSgmntType);
    }

    public EvCdrCostSegmentsPK getEvCdrCostSegmentsPK() {
        return evCdrCostSegmentsPK;
    }

    public void setEvCdrCostSegmentsPK(EvCdrCostSegmentsPK evCdrCostSegmentsPK) {
        this.evCdrCostSegmentsPK = evCdrCostSegmentsPK;
    }

    public BigDecimal getItemCostSgmntQty() {
        return itemCostSgmntQty;
    }

    public void setItemCostSgmntQty(BigDecimal itemCostSgmntQty) {
        this.itemCostSgmntQty = itemCostSgmntQty;
    }

    public BigDecimal getItemCostSgmntPpuWTaxAmt() {
        return itemCostSgmntPpuWTaxAmt;
    }

    public void setItemCostSgmntPpuWTaxAmt(BigDecimal itemCostSgmntPpuWTaxAmt) {
        this.itemCostSgmntPpuWTaxAmt = itemCostSgmntPpuWTaxAmt;
    }

    public BigDecimal getItemCostSgmntWoTaxAmt() {
        return itemCostSgmntWoTaxAmt;
    }

    public void setItemCostSgmntWoTaxAmt(BigDecimal itemCostSgmntWoTaxAmt) {
        this.itemCostSgmntWoTaxAmt = itemCostSgmntWoTaxAmt;
    }

    public BigDecimal getItemCostSgmntWTaxAmt() {
        return itemCostSgmntWTaxAmt;
    }

    public void setItemCostSgmntWTaxAmt(BigDecimal itemCostSgmntWTaxAmt) {
        this.itemCostSgmntWTaxAmt = itemCostSgmntWTaxAmt;
    }

    public String getItemCostSgmntUnitType() {
        return itemCostSgmntUnitType;
    }

    public void setItemCostSgmntUnitType(String itemCostSgmntUnitType) {
        this.itemCostSgmntUnitType = itemCostSgmntUnitType;
    }

    public int getItemCostSgmntUnitAmt() {
        return itemCostSgmntUnitAmt;
    }

    public void setItemCostSgmntUnitAmt(int itemCostSgmntUnitAmt) {
        this.itemCostSgmntUnitAmt = itemCostSgmntUnitAmt;
    }

    public BigDecimal getItemCostSgmntTaxRate() {
        return itemCostSgmntTaxRate;
    }

    public void setItemCostSgmntTaxRate(BigDecimal itemCostSgmntTaxRate) {
        this.itemCostSgmntTaxRate = itemCostSgmntTaxRate;
    }

    public Date getItemCostSgmntFromTs() {
        return itemCostSgmntFromTs;
    }

    public void setItemCostSgmntFromTs(Date itemCostSgmntFromTs) {
        this.itemCostSgmntFromTs = itemCostSgmntFromTs;
    }

    public Date getItemCostSgmntLocalFromTs() {
        return itemCostSgmntLocalFromTs;
    }

    public void setItemCostSgmntLocalFromTs(Date itemCostSgmntLocalFromTs) {
        this.itemCostSgmntLocalFromTs = itemCostSgmntLocalFromTs;
    }

    public Date getItemCostSgmntToTs() {
        return itemCostSgmntToTs;
    }

    public void setItemCostSgmntToTs(Date itemCostSgmntToTs) {
        this.itemCostSgmntToTs = itemCostSgmntToTs;
    }

    public Date getItemCostSgmntLocalToTs() {
        return itemCostSgmntLocalToTs;
    }

    public void setItemCostSgmntLocalToTs(Date itemCostSgmntLocalToTs) {
        this.itemCostSgmntLocalToTs = itemCostSgmntLocalToTs;
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
        hash += (evCdrCostSegmentsPK != null ? evCdrCostSegmentsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof EvCdrCostSegments)) {
            return false;
        }
        EvCdrCostSegments other = (EvCdrCostSegments) object;
        if ((this.evCdrCostSegmentsPK == null && other.evCdrCostSegmentsPK != null) || (this.evCdrCostSegmentsPK != null && !this.evCdrCostSegmentsPK.equals(other.evCdrCostSegmentsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EvCdrCostSegments[ evCdrCostSegmentsPK=" + evCdrCostSegmentsPK + " ]";
    }

}
