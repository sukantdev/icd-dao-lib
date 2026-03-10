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
@Table(name = "PROD_LIMITS_USE9", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "ProdLimitsUse9.findAll", query = "SELECT p FROM ProdLimitsUse9 p"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduCustId", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prodLimitsUse9PK.prduCustId = :prduCustId"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduCcType", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prodLimitsUse9PK.prduCcType = :prduCcType"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduProfileId", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prodLimitsUse9PK.prduProfileId = :prduProfileId"),
    @NamedQuery(name = "ProdLimitsUse9.findByProdcId", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prodLimitsUse9PK.prodcId = :prodcId"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduDayAmtUsed", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduDayAmtUsed = :prduDayAmtUsed"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduDayXtnsUsed", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduDayXtnsUsed = :prduDayXtnsUsed"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduDayQtyUsed", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduDayQtyUsed = :prduDayQtyUsed"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduCycAmtUsed", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduCycAmtUsed = :prduCycAmtUsed"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduCycQtyUsed", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduCycQtyUsed = :prduCycQtyUsed"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduCycXtnsUsed", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduCycXtnsUsed = :prduCycXtnsUsed"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduDayAmtHold", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduDayAmtHold = :prduDayAmtHold"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduDayXtnsHold", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduDayXtnsHold = :prduDayXtnsHold"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduDayQtyHold", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduDayQtyHold = :prduDayQtyHold"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduCycAmtHold", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduCycAmtHold = :prduCycAmtHold"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduCycXtnsHold", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduCycXtnsHold = :prduCycXtnsHold"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduCycQtyHold", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduCycQtyHold = :prduCycQtyHold"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduLastXtnDate", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduLastXtnDate = :prduLastXtnDate"),
    @NamedQuery(name = "ProdLimitsUse9.findByPrduLastResDate", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.prduLastResDate = :prduLastResDate"),
    @NamedQuery(name = "ProdLimitsUse9.findByRowChgTs", query = "SELECT p FROM ProdLimitsUse9 p WHERE p.rowChgTs = :rowChgTs")})
public class ProdLimitsUse9 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProdLimitsUse9PK prodLimitsUse9PK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRDU_DAY_AMT_USED")
    private BigDecimal prduDayAmtUsed;
    @Basic(optional = false)
    @Column(name = "PRDU_DAY_XTNS_USED")
    private int prduDayXtnsUsed;
    @Basic(optional = false)
    @Column(name = "PRDU_DAY_QTY_USED")
    private int prduDayQtyUsed;
    @Basic(optional = false)
    @Column(name = "PRDU_CYC_AMT_USED")
    private BigDecimal prduCycAmtUsed;
    @Basic(optional = false)
    @Column(name = "PRDU_CYC_QTY_USED")
    private int prduCycQtyUsed;
    @Basic(optional = false)
    @Column(name = "PRDU_CYC_XTNS_USED")
    private int prduCycXtnsUsed;
    @Basic(optional = false)
    @Column(name = "PRDU_DAY_AMT_HOLD")
    private BigDecimal prduDayAmtHold;
    @Basic(optional = false)
    @Column(name = "PRDU_DAY_XTNS_HOLD")
    private int prduDayXtnsHold;
    @Basic(optional = false)
    @Column(name = "PRDU_DAY_QTY_HOLD")
    private int prduDayQtyHold;
    @Basic(optional = false)
    @Column(name = "PRDU_CYC_AMT_HOLD")
    private BigDecimal prduCycAmtHold;
    @Basic(optional = false)
    @Column(name = "PRDU_CYC_XTNS_HOLD")
    private int prduCycXtnsHold;
    @Basic(optional = false)
    @Column(name = "PRDU_CYC_QTY_HOLD")
    private int prduCycQtyHold;
    @Basic(optional = false)
    @Column(name = "PRDU_LAST_XTN_DATE")
    @Temporal(TemporalType.DATE)
    private Date prduLastXtnDate;
    @Basic(optional = false)
    @Column(name = "PRDU_LAST_RES_DATE")
    @Temporal(TemporalType.DATE)
    private Date prduLastResDate;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;

    public ProdLimitsUse9() {
    }

    public ProdLimitsUse9(ProdLimitsUse9PK prodLimitsUse9PK) {
        this.prodLimitsUse9PK = prodLimitsUse9PK;
    }

    public ProdLimitsUse9(ProdLimitsUse9PK prodLimitsUse9PK, BigDecimal prduDayAmtUsed, int prduDayXtnsUsed, int prduDayQtyUsed, BigDecimal prduCycAmtUsed, int prduCycQtyUsed, int prduCycXtnsUsed, BigDecimal prduDayAmtHold, int prduDayXtnsHold, int prduDayQtyHold, BigDecimal prduCycAmtHold, int prduCycXtnsHold, int prduCycQtyHold, Date prduLastXtnDate, Date prduLastResDate, Date rowChgTs) {
        this.prodLimitsUse9PK = prodLimitsUse9PK;
        this.prduDayAmtUsed = prduDayAmtUsed;
        this.prduDayXtnsUsed = prduDayXtnsUsed;
        this.prduDayQtyUsed = prduDayQtyUsed;
        this.prduCycAmtUsed = prduCycAmtUsed;
        this.prduCycQtyUsed = prduCycQtyUsed;
        this.prduCycXtnsUsed = prduCycXtnsUsed;
        this.prduDayAmtHold = prduDayAmtHold;
        this.prduDayXtnsHold = prduDayXtnsHold;
        this.prduDayQtyHold = prduDayQtyHold;
        this.prduCycAmtHold = prduCycAmtHold;
        this.prduCycXtnsHold = prduCycXtnsHold;
        this.prduCycQtyHold = prduCycQtyHold;
        this.prduLastXtnDate = prduLastXtnDate;
        this.prduLastResDate = prduLastResDate;
        this.rowChgTs = rowChgTs;
    }

    public ProdLimitsUse9(String prduCustId, Character prduCcType, long prduProfileId, int prodcId) {
        this.prodLimitsUse9PK = new ProdLimitsUse9PK(prduCustId, prduCcType, prduProfileId, prodcId);
    }

    public ProdLimitsUse9PK getProdLimitsUse9PK() {
        return prodLimitsUse9PK;
    }

    public void setProdLimitsUse9PK(ProdLimitsUse9PK prodLimitsUse9PK) {
        this.prodLimitsUse9PK = prodLimitsUse9PK;
    }

    public BigDecimal getPrduDayAmtUsed() {
        return prduDayAmtUsed;
    }

    public void setPrduDayAmtUsed(BigDecimal prduDayAmtUsed) {
        this.prduDayAmtUsed = prduDayAmtUsed;
    }

    public int getPrduDayXtnsUsed() {
        return prduDayXtnsUsed;
    }

    public void setPrduDayXtnsUsed(int prduDayXtnsUsed) {
        this.prduDayXtnsUsed = prduDayXtnsUsed;
    }

    public int getPrduDayQtyUsed() {
        return prduDayQtyUsed;
    }

    public void setPrduDayQtyUsed(int prduDayQtyUsed) {
        this.prduDayQtyUsed = prduDayQtyUsed;
    }

    public BigDecimal getPrduCycAmtUsed() {
        return prduCycAmtUsed;
    }

    public void setPrduCycAmtUsed(BigDecimal prduCycAmtUsed) {
        this.prduCycAmtUsed = prduCycAmtUsed;
    }

    public int getPrduCycQtyUsed() {
        return prduCycQtyUsed;
    }

    public void setPrduCycQtyUsed(int prduCycQtyUsed) {
        this.prduCycQtyUsed = prduCycQtyUsed;
    }

    public int getPrduCycXtnsUsed() {
        return prduCycXtnsUsed;
    }

    public void setPrduCycXtnsUsed(int prduCycXtnsUsed) {
        this.prduCycXtnsUsed = prduCycXtnsUsed;
    }

    public BigDecimal getPrduDayAmtHold() {
        return prduDayAmtHold;
    }

    public void setPrduDayAmtHold(BigDecimal prduDayAmtHold) {
        this.prduDayAmtHold = prduDayAmtHold;
    }

    public int getPrduDayXtnsHold() {
        return prduDayXtnsHold;
    }

    public void setPrduDayXtnsHold(int prduDayXtnsHold) {
        this.prduDayXtnsHold = prduDayXtnsHold;
    }

    public int getPrduDayQtyHold() {
        return prduDayQtyHold;
    }

    public void setPrduDayQtyHold(int prduDayQtyHold) {
        this.prduDayQtyHold = prduDayQtyHold;
    }

    public BigDecimal getPrduCycAmtHold() {
        return prduCycAmtHold;
    }

    public void setPrduCycAmtHold(BigDecimal prduCycAmtHold) {
        this.prduCycAmtHold = prduCycAmtHold;
    }

    public int getPrduCycXtnsHold() {
        return prduCycXtnsHold;
    }

    public void setPrduCycXtnsHold(int prduCycXtnsHold) {
        this.prduCycXtnsHold = prduCycXtnsHold;
    }

    public int getPrduCycQtyHold() {
        return prduCycQtyHold;
    }

    public void setPrduCycQtyHold(int prduCycQtyHold) {
        this.prduCycQtyHold = prduCycQtyHold;
    }

    public Date getPrduLastXtnDate() {
        return prduLastXtnDate;
    }

    public void setPrduLastXtnDate(Date prduLastXtnDate) {
        this.prduLastXtnDate = prduLastXtnDate;
    }

    public Date getPrduLastResDate() {
        return prduLastResDate;
    }

    public void setPrduLastResDate(Date prduLastResDate) {
        this.prduLastResDate = prduLastResDate;
    }

    public Date getRowChgTs() {
        return rowChgTs;
    }

    public void setRowChgTs(Date rowChgTs) {
        this.rowChgTs = rowChgTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodLimitsUse9PK != null ? prodLimitsUse9PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdLimitsUse9)) {
            return false;
        }
        ProdLimitsUse9 other = (ProdLimitsUse9) object;
        if ((this.prodLimitsUse9PK == null && other.prodLimitsUse9PK != null) || (this.prodLimitsUse9PK != null && !this.prodLimitsUse9PK.equals(other.prodLimitsUse9PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProdLimitsUse9[ prodLimitsUse9PK=" + prodLimitsUse9PK + " ]";
    }
    
}
