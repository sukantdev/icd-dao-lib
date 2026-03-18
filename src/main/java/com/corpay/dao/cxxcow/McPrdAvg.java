package com.corpay.dao.cxxcow;

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
@Table(name = "MC_PRD_AVG", catalog = "", schema = "CXXCOW")
public class McPrdAvg implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McPrdAvgPK mcPrdAvgPK;
    @Basic(optional = false)
    @Column(name = "MC_PA_NR_ITEMS")
    private int mcPaNrItems;

    @Basic(optional = false)
    @Column(name = "MC_PA_QUANTITY")
    private BigDecimal mcPaQuantity;
    @Basic(optional = false)
    @Column(name = "MC_PA_PRICE")
    private BigDecimal mcPaPrice;
    @Basic(optional = false)
    @Column(name = "MC_PA_COST")
    private BigDecimal mcPaCost;
    @Basic(optional = false)
    @Column(name = "MC_PA_LAST_USED")
    @Temporal(TemporalType.DATE)
    private Date mcPaLastUsed;

    public McPrdAvg() {
    }

    public McPrdAvg(McPrdAvgPK mcPrdAvgPK) {
        this.mcPrdAvgPK = mcPrdAvgPK;
    }

    public McPrdAvg(McPrdAvgPK mcPrdAvgPK, int mcPaNrItems, BigDecimal mcPaQuantity, BigDecimal mcPaPrice, BigDecimal mcPaCost, Date mcPaLastUsed) {
        this.mcPrdAvgPK = mcPrdAvgPK;
        this.mcPaNrItems = mcPaNrItems;
        this.mcPaQuantity = mcPaQuantity;
        this.mcPaPrice = mcPaPrice;
        this.mcPaCost = mcPaCost;
        this.mcPaLastUsed = mcPaLastUsed;
    }

    public McPrdAvg(Date mcPaDate, String mcPaProduct, Character mcPaRecTy, String mcPaRecId) {
        this.mcPrdAvgPK = new McPrdAvgPK(mcPaDate, mcPaProduct, mcPaRecTy, mcPaRecId);
    }

    public McPrdAvgPK getMcPrdAvgPK() {
        return mcPrdAvgPK;
    }

    public void setMcPrdAvgPK(McPrdAvgPK mcPrdAvgPK) {
        this.mcPrdAvgPK = mcPrdAvgPK;
    }

    public int getMcPaNrItems() {
        return mcPaNrItems;
    }

    public void setMcPaNrItems(int mcPaNrItems) {
        this.mcPaNrItems = mcPaNrItems;
    }

    public BigDecimal getMcPaQuantity() {
        return mcPaQuantity;
    }

    public void setMcPaQuantity(BigDecimal mcPaQuantity) {
        this.mcPaQuantity = mcPaQuantity;
    }

    public BigDecimal getMcPaPrice() {
        return mcPaPrice;
    }

    public void setMcPaPrice(BigDecimal mcPaPrice) {
        this.mcPaPrice = mcPaPrice;
    }

    public BigDecimal getMcPaCost() {
        return mcPaCost;
    }

    public void setMcPaCost(BigDecimal mcPaCost) {
        this.mcPaCost = mcPaCost;
    }

    public Date getMcPaLastUsed() {
        return mcPaLastUsed;
    }

    public void setMcPaLastUsed(Date mcPaLastUsed) {
        this.mcPaLastUsed = mcPaLastUsed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcPrdAvgPK != null ? mcPrdAvgPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McPrdAvg)) {
            return false;
        }
        McPrdAvg other = (McPrdAvg) object;
        if ((this.mcPrdAvgPK == null && other.mcPrdAvgPK != null) || (this.mcPrdAvgPK != null && !this.mcPrdAvgPK.equals(other.mcPrdAvgPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McPrdAvg[ mcPrdAvgPK=" + mcPrdAvgPK + " ]";
    }

}
