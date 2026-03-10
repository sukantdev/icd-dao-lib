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
@Table(name = "PROD_LIMITS_USED_OGGTESTV19", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findAll", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduCustId", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prodLimitsUsedOggtestv19PK.prduCustId = :prduCustId"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduCcType", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prodLimitsUsedOggtestv19PK.prduCcType = :prduCcType"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduProfileId", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prodLimitsUsedOggtestv19PK.prduProfileId = :prduProfileId"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByProdcId", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prodLimitsUsedOggtestv19PK.prodcId = :prodcId"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduDayAmtUsed", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduDayAmtUsed = :prduDayAmtUsed"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduDayXtnsUsed", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduDayXtnsUsed = :prduDayXtnsUsed"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduDayQtyUsed", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduDayQtyUsed = :prduDayQtyUsed"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduCycAmtUsed", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduCycAmtUsed = :prduCycAmtUsed"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduCycQtyUsed", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduCycQtyUsed = :prduCycQtyUsed"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduCycXtnsUsed", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduCycXtnsUsed = :prduCycXtnsUsed"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduDayAmtHold", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduDayAmtHold = :prduDayAmtHold"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduDayXtnsHold", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduDayXtnsHold = :prduDayXtnsHold"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduDayQtyHold", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduDayQtyHold = :prduDayQtyHold"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduCycAmtHold", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduCycAmtHold = :prduCycAmtHold"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduCycXtnsHold", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduCycXtnsHold = :prduCycXtnsHold"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduCycQtyHold", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduCycQtyHold = :prduCycQtyHold"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduLastXtnDate", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduLastXtnDate = :prduLastXtnDate"),
    @NamedQuery(name = "ProdLimitsUsedOggtestv19.findByPrduLastResDate", query = "SELECT p FROM ProdLimitsUsedOggtestv19 p WHERE p.prduLastResDate = :prduLastResDate")})
public class ProdLimitsUsedOggtestv19 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProdLimitsUsedOggtestv19PK prodLimitsUsedOggtestv19PK;
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

    public ProdLimitsUsedOggtestv19() {
    }

    public ProdLimitsUsedOggtestv19(ProdLimitsUsedOggtestv19PK prodLimitsUsedOggtestv19PK) {
        this.prodLimitsUsedOggtestv19PK = prodLimitsUsedOggtestv19PK;
    }

    public ProdLimitsUsedOggtestv19(ProdLimitsUsedOggtestv19PK prodLimitsUsedOggtestv19PK, BigDecimal prduDayAmtUsed, int prduDayXtnsUsed, int prduDayQtyUsed, BigDecimal prduCycAmtUsed, int prduCycQtyUsed, int prduCycXtnsUsed, BigDecimal prduDayAmtHold, int prduDayXtnsHold, int prduDayQtyHold, BigDecimal prduCycAmtHold, int prduCycXtnsHold, int prduCycQtyHold, Date prduLastXtnDate, Date prduLastResDate) {
        this.prodLimitsUsedOggtestv19PK = prodLimitsUsedOggtestv19PK;
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
    }

    public ProdLimitsUsedOggtestv19(String prduCustId, Character prduCcType, long prduProfileId, int prodcId) {
        this.prodLimitsUsedOggtestv19PK = new ProdLimitsUsedOggtestv19PK(prduCustId, prduCcType, prduProfileId, prodcId);
    }

    public ProdLimitsUsedOggtestv19PK getProdLimitsUsedOggtestv19PK() {
        return prodLimitsUsedOggtestv19PK;
    }

    public void setProdLimitsUsedOggtestv19PK(ProdLimitsUsedOggtestv19PK prodLimitsUsedOggtestv19PK) {
        this.prodLimitsUsedOggtestv19PK = prodLimitsUsedOggtestv19PK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodLimitsUsedOggtestv19PK != null ? prodLimitsUsedOggtestv19PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdLimitsUsedOggtestv19)) {
            return false;
        }
        ProdLimitsUsedOggtestv19 other = (ProdLimitsUsedOggtestv19) object;
        if ((this.prodLimitsUsedOggtestv19PK == null && other.prodLimitsUsedOggtestv19PK != null) || (this.prodLimitsUsedOggtestv19PK != null && !this.prodLimitsUsedOggtestv19PK.equals(other.prodLimitsUsedOggtestv19PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProdLimitsUsedOggtestv19[ prodLimitsUsedOggtestv19PK=" + prodLimitsUsedOggtestv19PK + " ]";
    }
    
}
