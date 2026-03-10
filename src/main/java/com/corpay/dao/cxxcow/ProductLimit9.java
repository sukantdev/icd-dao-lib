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
@Table(name = "PRODUCT_LIMIT9", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "ProductLimit9.findAll", query = "SELECT p FROM ProductLimit9 p"),
    @NamedQuery(name = "ProductLimit9.findByPrdlCustId", query = "SELECT p FROM ProductLimit9 p WHERE p.productLimit9PK.prdlCustId = :prdlCustId"),
    @NamedQuery(name = "ProductLimit9.findByPrdlCcType", query = "SELECT p FROM ProductLimit9 p WHERE p.productLimit9PK.prdlCcType = :prdlCcType"),
    @NamedQuery(name = "ProductLimit9.findByPrdlProfileId", query = "SELECT p FROM ProductLimit9 p WHERE p.productLimit9PK.prdlProfileId = :prdlProfileId"),
    @NamedQuery(name = "ProductLimit9.findByProdcId", query = "SELECT p FROM ProductLimit9 p WHERE p.productLimit9PK.prodcId = :prodcId"),
    @NamedQuery(name = "ProductLimit9.findByPrdlXtnAmt", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlXtnAmt = :prdlXtnAmt"),
    @NamedQuery(name = "ProductLimit9.findByPrdlXtnQty", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlXtnQty = :prdlXtnQty"),
    @NamedQuery(name = "ProductLimit9.findByPrdlDayAmt", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlDayAmt = :prdlDayAmt"),
    @NamedQuery(name = "ProductLimit9.findByPrdlDayXtns", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlDayXtns = :prdlDayXtns"),
    @NamedQuery(name = "ProductLimit9.findByPrdlDayQty", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlDayQty = :prdlDayQty"),
    @NamedQuery(name = "ProductLimit9.findByPrdlCycFlag", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlCycFlag = :prdlCycFlag"),
    @NamedQuery(name = "ProductLimit9.findByPrdlCycReset", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlCycReset = :prdlCycReset"),
    @NamedQuery(name = "ProductLimit9.findByPrdlCycAmt", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlCycAmt = :prdlCycAmt"),
    @NamedQuery(name = "ProductLimit9.findByPrdlCycQty", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlCycQty = :prdlCycQty"),
    @NamedQuery(name = "ProductLimit9.findByPrdlCycXtns", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlCycXtns = :prdlCycXtns"),
    @NamedQuery(name = "ProductLimit9.findByPrdlPoAmt", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlPoAmt = :prdlPoAmt"),
    @NamedQuery(name = "ProductLimit9.findByPrdlPoQty", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlPoQty = :prdlPoQty"),
    @NamedQuery(name = "ProductLimit9.findByPrdlAvailFlag", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlAvailFlag = :prdlAvailFlag"),
    @NamedQuery(name = "ProductLimit9.findByPrdlOpenClosed", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlOpenClosed = :prdlOpenClosed"),
    @NamedQuery(name = "ProductLimit9.findByPrdlUpdateTs", query = "SELECT p FROM ProductLimit9 p WHERE p.prdlUpdateTs = :prdlUpdateTs"),
    @NamedQuery(name = "ProductLimit9.findByRowChgTs", query = "SELECT p FROM ProductLimit9 p WHERE p.rowChgTs = :rowChgTs")})
public class ProductLimit9 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductLimit9PK productLimit9PK;
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

    public ProductLimit9() {
    }

    public ProductLimit9(ProductLimit9PK productLimit9PK) {
        this.productLimit9PK = productLimit9PK;
    }

    public ProductLimit9(ProductLimit9PK productLimit9PK, BigDecimal prdlXtnAmt, int prdlXtnQty, BigDecimal prdlDayAmt, int prdlDayXtns, int prdlDayQty, Character prdlCycFlag, String prdlCycReset, BigDecimal prdlCycAmt, int prdlCycQty, int prdlCycXtns, BigDecimal prdlPoAmt, int prdlPoQty, Character prdlAvailFlag, Character prdlOpenClosed, Date prdlUpdateTs, Date rowChgTs) {
        this.productLimit9PK = productLimit9PK;
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

    public ProductLimit9(String prdlCustId, Character prdlCcType, long prdlProfileId, int prodcId) {
        this.productLimit9PK = new ProductLimit9PK(prdlCustId, prdlCcType, prdlProfileId, prodcId);
    }

    public ProductLimit9PK getProductLimit9PK() {
        return productLimit9PK;
    }

    public void setProductLimit9PK(ProductLimit9PK productLimit9PK) {
        this.productLimit9PK = productLimit9PK;
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
        hash += (productLimit9PK != null ? productLimit9PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductLimit9)) {
            return false;
        }
        ProductLimit9 other = (ProductLimit9) object;
        if ((this.productLimit9PK == null && other.productLimit9PK != null) || (this.productLimit9PK != null && !this.productLimit9PK.equals(other.productLimit9PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProductLimit9[ productLimit9PK=" + productLimit9PK + " ]";
    }
    
}
