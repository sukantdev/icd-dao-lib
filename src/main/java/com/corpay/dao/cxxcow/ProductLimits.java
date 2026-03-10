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
@Table(name = "PRODUCT_LIMITS", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "ProductLimits.findAll", query = "SELECT p FROM ProductLimits p"),
    @NamedQuery(name = "ProductLimits.findByPrdlCustId", query = "SELECT p FROM ProductLimits p WHERE p.productLimitsPK.prdlCustId = :prdlCustId"),
    @NamedQuery(name = "ProductLimits.findByPrdlCcType", query = "SELECT p FROM ProductLimits p WHERE p.productLimitsPK.prdlCcType = :prdlCcType"),
    @NamedQuery(name = "ProductLimits.findByPrdlProfileId", query = "SELECT p FROM ProductLimits p WHERE p.productLimitsPK.prdlProfileId = :prdlProfileId"),
    @NamedQuery(name = "ProductLimits.findByProdcId", query = "SELECT p FROM ProductLimits p WHERE p.productLimitsPK.prodcId = :prodcId"),
    @NamedQuery(name = "ProductLimits.findByPrdlXtnAmt", query = "SELECT p FROM ProductLimits p WHERE p.prdlXtnAmt = :prdlXtnAmt"),
    @NamedQuery(name = "ProductLimits.findByPrdlXtnQty", query = "SELECT p FROM ProductLimits p WHERE p.prdlXtnQty = :prdlXtnQty"),
    @NamedQuery(name = "ProductLimits.findByPrdlDayAmt", query = "SELECT p FROM ProductLimits p WHERE p.prdlDayAmt = :prdlDayAmt"),
    @NamedQuery(name = "ProductLimits.findByPrdlDayXtns", query = "SELECT p FROM ProductLimits p WHERE p.prdlDayXtns = :prdlDayXtns"),
    @NamedQuery(name = "ProductLimits.findByPrdlDayQty", query = "SELECT p FROM ProductLimits p WHERE p.prdlDayQty = :prdlDayQty"),
    @NamedQuery(name = "ProductLimits.findByPrdlCycFlag", query = "SELECT p FROM ProductLimits p WHERE p.prdlCycFlag = :prdlCycFlag"),
    @NamedQuery(name = "ProductLimits.findByPrdlCycReset", query = "SELECT p FROM ProductLimits p WHERE p.prdlCycReset = :prdlCycReset"),
    @NamedQuery(name = "ProductLimits.findByPrdlCycAmt", query = "SELECT p FROM ProductLimits p WHERE p.prdlCycAmt = :prdlCycAmt"),
    @NamedQuery(name = "ProductLimits.findByPrdlCycQty", query = "SELECT p FROM ProductLimits p WHERE p.prdlCycQty = :prdlCycQty"),
    @NamedQuery(name = "ProductLimits.findByPrdlCycXtns", query = "SELECT p FROM ProductLimits p WHERE p.prdlCycXtns = :prdlCycXtns"),
    @NamedQuery(name = "ProductLimits.findByPrdlPoAmt", query = "SELECT p FROM ProductLimits p WHERE p.prdlPoAmt = :prdlPoAmt"),
    @NamedQuery(name = "ProductLimits.findByPrdlPoQty", query = "SELECT p FROM ProductLimits p WHERE p.prdlPoQty = :prdlPoQty"),
    @NamedQuery(name = "ProductLimits.findByPrdlAvailFlag", query = "SELECT p FROM ProductLimits p WHERE p.prdlAvailFlag = :prdlAvailFlag"),
    @NamedQuery(name = "ProductLimits.findByPrdlOpenClosed", query = "SELECT p FROM ProductLimits p WHERE p.prdlOpenClosed = :prdlOpenClosed"),
    @NamedQuery(name = "ProductLimits.findByPrdlUpdateTs", query = "SELECT p FROM ProductLimits p WHERE p.prdlUpdateTs = :prdlUpdateTs"),
    @NamedQuery(name = "ProductLimits.findByRowChgTs", query = "SELECT p FROM ProductLimits p WHERE p.rowChgTs = :rowChgTs")})
public class ProductLimits implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductLimitsPK productLimitsPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRDL_XTN_AMT")
    private BigDecimal prdlXtnAmt;
    @Basic(optional = false)
    @Column(name = "PRDL_XTN_QTY")
    private int prdlXtnQty;
    @Basic(optional = false)
    @Column(name = "PRDL_DAY_AMT")
    private BigDecimal prdlDayAmt;
    @Basic(optional = false)
    @Column(name = "PRDL_DAY_XTNS")
    private int prdlDayXtns;
    @Basic(optional = false)
    @Column(name = "PRDL_DAY_QTY")
    private int prdlDayQty;
    @Basic(optional = false)
    @Column(name = "PRDL_CYC_FLAG")
    private Character prdlCycFlag;
    @Basic(optional = false)
    @Column(name = "PRDL_CYC_RESET")
    private String prdlCycReset;
    @Basic(optional = false)
    @Column(name = "PRDL_CYC_AMT")
    private BigDecimal prdlCycAmt;
    @Basic(optional = false)
    @Column(name = "PRDL_CYC_QTY")
    private int prdlCycQty;
    @Basic(optional = false)
    @Column(name = "PRDL_CYC_XTNS")
    private int prdlCycXtns;
    @Basic(optional = false)
    @Column(name = "PRDL_PO_AMT")
    private BigDecimal prdlPoAmt;
    @Basic(optional = false)
    @Column(name = "PRDL_PO_QTY")
    private int prdlPoQty;
    @Basic(optional = false)
    @Column(name = "PRDL_AVAIL_FLAG")
    private Character prdlAvailFlag;
    @Basic(optional = false)
    @Column(name = "PRDL_OPEN_CLOSED")
    private Character prdlOpenClosed;
    @Basic(optional = false)
    @Column(name = "PRDL_UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prdlUpdateTs;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;

    public ProductLimits() {
    }

    public ProductLimits(ProductLimitsPK productLimitsPK) {
        this.productLimitsPK = productLimitsPK;
    }

    public ProductLimits(ProductLimitsPK productLimitsPK, BigDecimal prdlXtnAmt, int prdlXtnQty, BigDecimal prdlDayAmt, int prdlDayXtns, int prdlDayQty, Character prdlCycFlag, String prdlCycReset, BigDecimal prdlCycAmt, int prdlCycQty, int prdlCycXtns, BigDecimal prdlPoAmt, int prdlPoQty, Character prdlAvailFlag, Character prdlOpenClosed, Date prdlUpdateTs, Date rowChgTs) {
        this.productLimitsPK = productLimitsPK;
        this.prdlXtnAmt = prdlXtnAmt;
        this.prdlXtnQty = prdlXtnQty;
        this.prdlDayAmt = prdlDayAmt;
        this.prdlDayXtns = prdlDayXtns;
        this.prdlDayQty = prdlDayQty;
        this.prdlCycFlag = prdlCycFlag;
        this.prdlCycReset = prdlCycReset;
        this.prdlCycAmt = prdlCycAmt;
        this.prdlCycQty = prdlCycQty;
        this.prdlCycXtns = prdlCycXtns;
        this.prdlPoAmt = prdlPoAmt;
        this.prdlPoQty = prdlPoQty;
        this.prdlAvailFlag = prdlAvailFlag;
        this.prdlOpenClosed = prdlOpenClosed;
        this.prdlUpdateTs = prdlUpdateTs;
        this.rowChgTs = rowChgTs;
    }

    public ProductLimits(String prdlCustId, Character prdlCcType, long prdlProfileId, int prodcId) {
        this.productLimitsPK = new ProductLimitsPK(prdlCustId, prdlCcType, prdlProfileId, prodcId);
    }

    public ProductLimitsPK getProductLimitsPK() {
        return productLimitsPK;
    }

    public void setProductLimitsPK(ProductLimitsPK productLimitsPK) {
        this.productLimitsPK = productLimitsPK;
    }

    public BigDecimal getPrdlXtnAmt() {
        return prdlXtnAmt;
    }

    public void setPrdlXtnAmt(BigDecimal prdlXtnAmt) {
        this.prdlXtnAmt = prdlXtnAmt;
    }

    public int getPrdlXtnQty() {
        return prdlXtnQty;
    }

    public void setPrdlXtnQty(int prdlXtnQty) {
        this.prdlXtnQty = prdlXtnQty;
    }

    public BigDecimal getPrdlDayAmt() {
        return prdlDayAmt;
    }

    public void setPrdlDayAmt(BigDecimal prdlDayAmt) {
        this.prdlDayAmt = prdlDayAmt;
    }

    public int getPrdlDayXtns() {
        return prdlDayXtns;
    }

    public void setPrdlDayXtns(int prdlDayXtns) {
        this.prdlDayXtns = prdlDayXtns;
    }

    public int getPrdlDayQty() {
        return prdlDayQty;
    }

    public void setPrdlDayQty(int prdlDayQty) {
        this.prdlDayQty = prdlDayQty;
    }

    public Character getPrdlCycFlag() {
        return prdlCycFlag;
    }

    public void setPrdlCycFlag(Character prdlCycFlag) {
        this.prdlCycFlag = prdlCycFlag;
    }

    public String getPrdlCycReset() {
        return prdlCycReset;
    }

    public void setPrdlCycReset(String prdlCycReset) {
        this.prdlCycReset = prdlCycReset;
    }

    public BigDecimal getPrdlCycAmt() {
        return prdlCycAmt;
    }

    public void setPrdlCycAmt(BigDecimal prdlCycAmt) {
        this.prdlCycAmt = prdlCycAmt;
    }

    public int getPrdlCycQty() {
        return prdlCycQty;
    }

    public void setPrdlCycQty(int prdlCycQty) {
        this.prdlCycQty = prdlCycQty;
    }

    public int getPrdlCycXtns() {
        return prdlCycXtns;
    }

    public void setPrdlCycXtns(int prdlCycXtns) {
        this.prdlCycXtns = prdlCycXtns;
    }

    public BigDecimal getPrdlPoAmt() {
        return prdlPoAmt;
    }

    public void setPrdlPoAmt(BigDecimal prdlPoAmt) {
        this.prdlPoAmt = prdlPoAmt;
    }

    public int getPrdlPoQty() {
        return prdlPoQty;
    }

    public void setPrdlPoQty(int prdlPoQty) {
        this.prdlPoQty = prdlPoQty;
    }

    public Character getPrdlAvailFlag() {
        return prdlAvailFlag;
    }

    public void setPrdlAvailFlag(Character prdlAvailFlag) {
        this.prdlAvailFlag = prdlAvailFlag;
    }

    public Character getPrdlOpenClosed() {
        return prdlOpenClosed;
    }

    public void setPrdlOpenClosed(Character prdlOpenClosed) {
        this.prdlOpenClosed = prdlOpenClosed;
    }

    public Date getPrdlUpdateTs() {
        return prdlUpdateTs;
    }

    public void setPrdlUpdateTs(Date prdlUpdateTs) {
        this.prdlUpdateTs = prdlUpdateTs;
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
        hash += (productLimitsPK != null ? productLimitsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductLimits)) {
            return false;
        }
        ProductLimits other = (ProductLimits) object;
        if ((this.productLimitsPK == null && other.productLimitsPK != null) || (this.productLimitsPK != null && !this.productLimitsPK.equals(other.productLimitsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProductLimits[ productLimitsPK=" + productLimitsPK + " ]";
    }
    
}
