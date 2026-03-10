/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "MC_PRD_AVG", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McPrdAvg.findAll", query = "SELECT m FROM McPrdAvg m"),
    @NamedQuery(name = "McPrdAvg.findByMcPaDate", query = "SELECT m FROM McPrdAvg m WHERE m.mcPrdAvgPK.mcPaDate = :mcPaDate"),
    @NamedQuery(name = "McPrdAvg.findByMcPaProduct", query = "SELECT m FROM McPrdAvg m WHERE m.mcPrdAvgPK.mcPaProduct = :mcPaProduct"),
    @NamedQuery(name = "McPrdAvg.findByMcPaRecTy", query = "SELECT m FROM McPrdAvg m WHERE m.mcPrdAvgPK.mcPaRecTy = :mcPaRecTy"),
    @NamedQuery(name = "McPrdAvg.findByMcPaRecId", query = "SELECT m FROM McPrdAvg m WHERE m.mcPrdAvgPK.mcPaRecId = :mcPaRecId"),
    @NamedQuery(name = "McPrdAvg.findByMcPaNrItems", query = "SELECT m FROM McPrdAvg m WHERE m.mcPaNrItems = :mcPaNrItems"),
    @NamedQuery(name = "McPrdAvg.findByMcPaQuantity", query = "SELECT m FROM McPrdAvg m WHERE m.mcPaQuantity = :mcPaQuantity"),
    @NamedQuery(name = "McPrdAvg.findByMcPaPrice", query = "SELECT m FROM McPrdAvg m WHERE m.mcPaPrice = :mcPaPrice"),
    @NamedQuery(name = "McPrdAvg.findByMcPaCost", query = "SELECT m FROM McPrdAvg m WHERE m.mcPaCost = :mcPaCost"),
    @NamedQuery(name = "McPrdAvg.findByMcPaLastUsed", query = "SELECT m FROM McPrdAvg m WHERE m.mcPaLastUsed = :mcPaLastUsed")})
public class McPrdAvg implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McPrdAvgPK mcPrdAvgPK;
    @Basic(optional = false)
    @Column(name = "MC_PA_NR_ITEMS")
    private int mcPaNrItems;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
