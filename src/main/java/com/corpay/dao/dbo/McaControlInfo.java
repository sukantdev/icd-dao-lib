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
@Table(name = "MCA_CONTROL_INFO", catalog = "", schema = "DBO")
public class McaControlInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McaControlInfoPK mcaControlInfoPK;
    @Basic(optional = false)
    @Column(name = "MCA_STATUS_CD")
    private Character mcaStatusCd;
    @Basic(optional = false)
    @Column(name = "MCA_SETTLE_DATE")
    @Temporal(TemporalType.DATE)
    private Date mcaSettleDate;

    @Basic(optional = false)
    @Column(name = "MCA_PURCHASE_PRICE")
    private BigDecimal mcaPurchasePrice;
    @Basic(optional = false)
    @Column(name = "MCA_PURCHASE_AMT")
    private BigDecimal mcaPurchaseAmt;
    @Basic(optional = false)
    @Column(name = "MCA_ADMIN_FEE")
    private BigDecimal mcaAdminFee;
    @Basic(optional = false)
    @Column(name = "MCA_SETTLEMENT_PCT")
    private BigDecimal mcaSettlementPct;
    @Basic(optional = false)
    @Column(name = "MCA_REVENUE_PCT")
    private BigDecimal mcaRevenuePct;
    @Basic(optional = false)
    @Column(name = "MCA_CURRENT_MON")
    private short mcaCurrentMon;
    @Basic(optional = false)
    @Column(name = "MCA_MTD_REMIT")
    private BigDecimal mcaMtdRemit;
    @Basic(optional = false)
    @Column(name = "MCA_MTD_REVENUE")
    private BigDecimal mcaMtdRevenue;
    @Basic(optional = false)
    @Column(name = "MCA_TOTAL_REMIT")
    private BigDecimal mcaTotalRemit;
    @Basic(optional = false)
    @Column(name = "MCA_TOTAL_REVENUE")
    private BigDecimal mcaTotalRevenue;
    @Basic(optional = false)
    @Column(name = "MCA_PAID_OFF_DATE")
    @Temporal(TemporalType.DATE)
    private Date mcaPaidOffDate;
    @Basic(optional = false)
    @Column(name = "MCA_ONE_TIME_SETTLE")
    private BigDecimal mcaOneTimeSettle;
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

    public McaControlInfo() {
    }

    public McaControlInfo(McaControlInfoPK mcaControlInfoPK) {
        this.mcaControlInfoPK = mcaControlInfoPK;
    }

    public McaControlInfo(McaControlInfoPK mcaControlInfoPK, Character mcaStatusCd, Date mcaSettleDate, BigDecimal mcaPurchasePrice, BigDecimal mcaPurchaseAmt, BigDecimal mcaAdminFee, BigDecimal mcaSettlementPct, BigDecimal mcaRevenuePct, short mcaCurrentMon, BigDecimal mcaMtdRemit, BigDecimal mcaMtdRevenue, BigDecimal mcaTotalRemit, BigDecimal mcaTotalRevenue, Date mcaPaidOffDate, BigDecimal mcaOneTimeSettle, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mcaControlInfoPK = mcaControlInfoPK;
        this.mcaStatusCd = mcaStatusCd;
        this.mcaSettleDate = mcaSettleDate;
        this.mcaPurchasePrice = mcaPurchasePrice;
        this.mcaPurchaseAmt = mcaPurchaseAmt;
        this.mcaAdminFee = mcaAdminFee;
        this.mcaSettlementPct = mcaSettlementPct;
        this.mcaRevenuePct = mcaRevenuePct;
        this.mcaCurrentMon = mcaCurrentMon;
        this.mcaMtdRemit = mcaMtdRemit;
        this.mcaMtdRevenue = mcaMtdRevenue;
        this.mcaTotalRemit = mcaTotalRemit;
        this.mcaTotalRevenue = mcaTotalRevenue;
        this.mcaPaidOffDate = mcaPaidOffDate;
        this.mcaOneTimeSettle = mcaOneTimeSettle;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public McaControlInfo(String serviceCenterCd, short mcaPurchaseNum) {
        this.mcaControlInfoPK = new McaControlInfoPK(serviceCenterCd, mcaPurchaseNum);
    }

    public McaControlInfoPK getMcaControlInfoPK() {
        return mcaControlInfoPK;
    }

    public void setMcaControlInfoPK(McaControlInfoPK mcaControlInfoPK) {
        this.mcaControlInfoPK = mcaControlInfoPK;
    }

    public Character getMcaStatusCd() {
        return mcaStatusCd;
    }

    public void setMcaStatusCd(Character mcaStatusCd) {
        this.mcaStatusCd = mcaStatusCd;
    }

    public Date getMcaSettleDate() {
        return mcaSettleDate;
    }

    public void setMcaSettleDate(Date mcaSettleDate) {
        this.mcaSettleDate = mcaSettleDate;
    }

    public BigDecimal getMcaPurchasePrice() {
        return mcaPurchasePrice;
    }

    public void setMcaPurchasePrice(BigDecimal mcaPurchasePrice) {
        this.mcaPurchasePrice = mcaPurchasePrice;
    }

    public BigDecimal getMcaPurchaseAmt() {
        return mcaPurchaseAmt;
    }

    public void setMcaPurchaseAmt(BigDecimal mcaPurchaseAmt) {
        this.mcaPurchaseAmt = mcaPurchaseAmt;
    }

    public BigDecimal getMcaAdminFee() {
        return mcaAdminFee;
    }

    public void setMcaAdminFee(BigDecimal mcaAdminFee) {
        this.mcaAdminFee = mcaAdminFee;
    }

    public BigDecimal getMcaSettlementPct() {
        return mcaSettlementPct;
    }

    public void setMcaSettlementPct(BigDecimal mcaSettlementPct) {
        this.mcaSettlementPct = mcaSettlementPct;
    }

    public BigDecimal getMcaRevenuePct() {
        return mcaRevenuePct;
    }

    public void setMcaRevenuePct(BigDecimal mcaRevenuePct) {
        this.mcaRevenuePct = mcaRevenuePct;
    }

    public short getMcaCurrentMon() {
        return mcaCurrentMon;
    }

    public void setMcaCurrentMon(short mcaCurrentMon) {
        this.mcaCurrentMon = mcaCurrentMon;
    }

    public BigDecimal getMcaMtdRemit() {
        return mcaMtdRemit;
    }

    public void setMcaMtdRemit(BigDecimal mcaMtdRemit) {
        this.mcaMtdRemit = mcaMtdRemit;
    }

    public BigDecimal getMcaMtdRevenue() {
        return mcaMtdRevenue;
    }

    public void setMcaMtdRevenue(BigDecimal mcaMtdRevenue) {
        this.mcaMtdRevenue = mcaMtdRevenue;
    }

    public BigDecimal getMcaTotalRemit() {
        return mcaTotalRemit;
    }

    public void setMcaTotalRemit(BigDecimal mcaTotalRemit) {
        this.mcaTotalRemit = mcaTotalRemit;
    }

    public BigDecimal getMcaTotalRevenue() {
        return mcaTotalRevenue;
    }

    public void setMcaTotalRevenue(BigDecimal mcaTotalRevenue) {
        this.mcaTotalRevenue = mcaTotalRevenue;
    }

    public Date getMcaPaidOffDate() {
        return mcaPaidOffDate;
    }

    public void setMcaPaidOffDate(Date mcaPaidOffDate) {
        this.mcaPaidOffDate = mcaPaidOffDate;
    }

    public BigDecimal getMcaOneTimeSettle() {
        return mcaOneTimeSettle;
    }

    public void setMcaOneTimeSettle(BigDecimal mcaOneTimeSettle) {
        this.mcaOneTimeSettle = mcaOneTimeSettle;
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
        hash += (mcaControlInfoPK != null ? mcaControlInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McaControlInfo)) {
            return false;
        }
        McaControlInfo other = (McaControlInfo) object;
        if ((this.mcaControlInfoPK == null && other.mcaControlInfoPK != null) || (this.mcaControlInfoPK != null && !this.mcaControlInfoPK.equals(other.mcaControlInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McaControlInfo[ mcaControlInfoPK=" + mcaControlInfoPK + " ]";
    }

}
