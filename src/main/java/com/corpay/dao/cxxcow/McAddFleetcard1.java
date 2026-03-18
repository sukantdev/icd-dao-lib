package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "MC_ADD_FLEETCARD1", catalog = "", schema = "CXXCOW")
public class McAddFleetcard1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddFleetcard1PK mcAddFleetcard1PK;
    @Basic(optional = false)
    @Column(name = "FLT1_OIL_CO_BRAND")
    private String flt1OilCoBrand;
    @Basic(optional = false)
    @Column(name = "FLT1_MERCH_ADDR")
    private String flt1MerchAddr;
    @Basic(optional = false)
    @Column(name = "FLT1_MERCH_POST_CD")
    private String flt1MerchPostCd;
    @Basic(optional = false)
    @Column(name = "FLT1_PURCHASE_TM")
    private String flt1PurchaseTm;
    @Basic(optional = false)
    @Column(name = "FLT1_FU_SERV_TYP")
    private Character flt1FuServTyp;
    @Basic(optional = false)
    @Column(name = "FLT1_FU_PROD_CD")
    private String flt1FuProdCd;
    @Basic(optional = false)
    @Column(name = "FLT1_FU_UNT_PRICE")
    private int flt1FuUntPrice;

    @Basic(optional = false)
    @Column(name = "FLT10FU_UNT_PRICE")
    private BigDecimal flt10fuUntPrice;
    @Basic(optional = false)
    @Column(name = "FLT1_FU_UNT_MEAS")
    private Character flt1FuUntMeas;
    @Basic(optional = false)
    @Column(name = "FLT1_FU_QTY")
    private int flt1FuQty;
    @Basic(optional = false)
    @Column(name = "FLT10FU_QTY")
    private BigDecimal flt10fuQty;
    @Basic(optional = false)
    @Column(name = "FLT1_FU_SALE_AMT")
    private int flt1FuSaleAmt;
    @Basic(optional = false)
    @Column(name = "FLT10FU_SALE_AMT")
    private BigDecimal flt10fuSaleAmt;
    @Basic(optional = false)
    @Column(name = "FLT1_ODOMETER")
    private String flt1Odometer;
    @Basic(optional = false)
    @Column(name = "FLT1_VEHICLE_NO")
    private String flt1VehicleNo;
    @Basic(optional = false)
    @Column(name = "FLT1_DRVR_NO")
    private String flt1DrvrNo;
    @Basic(optional = false)
    @Column(name = "FLT1_PROD_TYP")
    private Character flt1ProdTyp;
    @Basic(optional = false)
    @Column(name = "FLT1_DISC_AMT")
    private int flt1DiscAmt;
    @Basic(optional = false)
    @Column(name = "FLT10DISC_AMT")
    private BigDecimal flt10discAmt;
    @Basic(optional = false)
    @Column(name = "FLT1_TAX_AMT1")
    private int flt1TaxAmt1;
    @Basic(optional = false)
    @Column(name = "FLT10TAX_AMT1")
    private BigDecimal flt10taxAmt1;
    @Basic(optional = false)
    @Column(name = "FLT1_TAX_AMT2")
    private int flt1TaxAmt2;
    @Basic(optional = false)
    @Column(name = "FLT10TAX_AMT2")
    private BigDecimal flt10taxAmt2;
    @Basic(optional = false)
    @Column(name = "FLT1_ADDEND_SEQ")
    private String flt1AddendSeq;
    @Basic(optional = false)
    @Column(name = "FLT1_TOTAL_ADDENDA")
    private String flt1TotalAddenda;
    @Basic(optional = false)
    @Column(name = "FLT1_ADDEND_USE_CD")
    private String flt1AddendUseCd;
    @Basic(optional = false)
    @Column(name = "NOTEID")
    private int noteid;
    @Basic(optional = false)
    @Column(name = "CLUSTER_KEY")
    private String clusterKey;
    @Basic(optional = false)
    @Column(name = "FLT1AMERCH_POST_CD")
    private String flt1amerchPostCd;
    @Basic(optional = false)
    @Column(name = "FLT1AFU_SERV_TYP")
    private Character flt1afuServTyp;
    @Basic(optional = false)
    @Column(name = "FLT1AFU_PROD_CD")
    private String flt1afuProdCd;
    @Basic(optional = false)
    @Column(name = "FLT1AFU_UNT_PRICE")
    private BigDecimal flt1afuUntPrice;
    @Basic(optional = false)
    @Column(name = "FLT1AFU_QTY")
    private BigDecimal flt1afuQty;
    @Basic(optional = false)
    @Column(name = "FLT1AFU_SALE_AMT")
    private BigDecimal flt1afuSaleAmt;
    @Basic(optional = false)
    @Column(name = "FLT1ADISC_AMT")
    private BigDecimal flt1adiscAmt;
    @Basic(optional = false)
    @Column(name = "FLT1ATAX_AMT1")
    private BigDecimal flt1ataxAmt1;
    @Basic(optional = false)
    @Column(name = "FLT1ATAX_AMT2")
    private BigDecimal flt1ataxAmt2;
    @Basic(optional = false)
    @Column(name = "FILTERED_FLAGS")
    private String filteredFlags;

    public McAddFleetcard1() {
    }

    public McAddFleetcard1(McAddFleetcard1PK mcAddFleetcard1PK) {
        this.mcAddFleetcard1PK = mcAddFleetcard1PK;
    }

    public McAddFleetcard1(McAddFleetcard1PK mcAddFleetcard1PK, String flt1OilCoBrand, String flt1MerchAddr, String flt1MerchPostCd, String flt1PurchaseTm, Character flt1FuServTyp, String flt1FuProdCd, int flt1FuUntPrice, BigDecimal flt10fuUntPrice, Character flt1FuUntMeas, int flt1FuQty, BigDecimal flt10fuQty, int flt1FuSaleAmt, BigDecimal flt10fuSaleAmt, String flt1Odometer, String flt1VehicleNo, String flt1DrvrNo, Character flt1ProdTyp, int flt1DiscAmt, BigDecimal flt10discAmt, int flt1TaxAmt1, BigDecimal flt10taxAmt1, int flt1TaxAmt2, BigDecimal flt10taxAmt2, String flt1AddendSeq, String flt1TotalAddenda, String flt1AddendUseCd, int noteid, String clusterKey, String flt1amerchPostCd, Character flt1afuServTyp, String flt1afuProdCd, BigDecimal flt1afuUntPrice, BigDecimal flt1afuQty, BigDecimal flt1afuSaleAmt, BigDecimal flt1adiscAmt, BigDecimal flt1ataxAmt1, BigDecimal flt1ataxAmt2, String filteredFlags) {
        this.mcAddFleetcard1PK = mcAddFleetcard1PK;
        this.flt1OilCoBrand = flt1OilCoBrand;
        this.flt1MerchAddr = flt1MerchAddr;
        this.flt1MerchPostCd = flt1MerchPostCd;
        this.flt1PurchaseTm = flt1PurchaseTm;
        this.flt1FuServTyp = flt1FuServTyp;
        this.flt1FuProdCd = flt1FuProdCd;
        this.flt1FuUntPrice = flt1FuUntPrice;
        this.flt10fuUntPrice = flt10fuUntPrice;
        this.flt1FuUntMeas = flt1FuUntMeas;
        this.flt1FuQty = flt1FuQty;
        this.flt10fuQty = flt10fuQty;
        this.flt1FuSaleAmt = flt1FuSaleAmt;
        this.flt10fuSaleAmt = flt10fuSaleAmt;
        this.flt1Odometer = flt1Odometer;
        this.flt1VehicleNo = flt1VehicleNo;
        this.flt1DrvrNo = flt1DrvrNo;
        this.flt1ProdTyp = flt1ProdTyp;
        this.flt1DiscAmt = flt1DiscAmt;
        this.flt10discAmt = flt10discAmt;
        this.flt1TaxAmt1 = flt1TaxAmt1;
        this.flt10taxAmt1 = flt10taxAmt1;
        this.flt1TaxAmt2 = flt1TaxAmt2;
        this.flt10taxAmt2 = flt10taxAmt2;
        this.flt1AddendSeq = flt1AddendSeq;
        this.flt1TotalAddenda = flt1TotalAddenda;
        this.flt1AddendUseCd = flt1AddendUseCd;
        this.noteid = noteid;
        this.clusterKey = clusterKey;
        this.flt1amerchPostCd = flt1amerchPostCd;
        this.flt1afuServTyp = flt1afuServTyp;
        this.flt1afuProdCd = flt1afuProdCd;
        this.flt1afuUntPrice = flt1afuUntPrice;
        this.flt1afuQty = flt1afuQty;
        this.flt1afuSaleAmt = flt1afuSaleAmt;
        this.flt1adiscAmt = flt1adiscAmt;
        this.flt1ataxAmt1 = flt1ataxAmt1;
        this.flt1ataxAmt2 = flt1ataxAmt2;
        this.filteredFlags = filteredFlags;
    }

    public McAddFleetcard1(Date stlmtId, short btchId, short mrchId, short dtlStlmtId) {
        this.mcAddFleetcard1PK = new McAddFleetcard1PK(stlmtId, btchId, mrchId, dtlStlmtId);
    }

    public McAddFleetcard1PK getMcAddFleetcard1PK() {
        return mcAddFleetcard1PK;
    }

    public void setMcAddFleetcard1PK(McAddFleetcard1PK mcAddFleetcard1PK) {
        this.mcAddFleetcard1PK = mcAddFleetcard1PK;
    }

    public String getFlt1OilCoBrand() {
        return flt1OilCoBrand;
    }

    public void setFlt1OilCoBrand(String flt1OilCoBrand) {
        this.flt1OilCoBrand = flt1OilCoBrand;
    }

    public String getFlt1MerchAddr() {
        return flt1MerchAddr;
    }

    public void setFlt1MerchAddr(String flt1MerchAddr) {
        this.flt1MerchAddr = flt1MerchAddr;
    }

    public String getFlt1MerchPostCd() {
        return flt1MerchPostCd;
    }

    public void setFlt1MerchPostCd(String flt1MerchPostCd) {
        this.flt1MerchPostCd = flt1MerchPostCd;
    }

    public String getFlt1PurchaseTm() {
        return flt1PurchaseTm;
    }

    public void setFlt1PurchaseTm(String flt1PurchaseTm) {
        this.flt1PurchaseTm = flt1PurchaseTm;
    }

    public Character getFlt1FuServTyp() {
        return flt1FuServTyp;
    }

    public void setFlt1FuServTyp(Character flt1FuServTyp) {
        this.flt1FuServTyp = flt1FuServTyp;
    }

    public String getFlt1FuProdCd() {
        return flt1FuProdCd;
    }

    public void setFlt1FuProdCd(String flt1FuProdCd) {
        this.flt1FuProdCd = flt1FuProdCd;
    }

    public int getFlt1FuUntPrice() {
        return flt1FuUntPrice;
    }

    public void setFlt1FuUntPrice(int flt1FuUntPrice) {
        this.flt1FuUntPrice = flt1FuUntPrice;
    }

    public BigDecimal getFlt10fuUntPrice() {
        return flt10fuUntPrice;
    }

    public void setFlt10fuUntPrice(BigDecimal flt10fuUntPrice) {
        this.flt10fuUntPrice = flt10fuUntPrice;
    }

    public Character getFlt1FuUntMeas() {
        return flt1FuUntMeas;
    }

    public void setFlt1FuUntMeas(Character flt1FuUntMeas) {
        this.flt1FuUntMeas = flt1FuUntMeas;
    }

    public int getFlt1FuQty() {
        return flt1FuQty;
    }

    public void setFlt1FuQty(int flt1FuQty) {
        this.flt1FuQty = flt1FuQty;
    }

    public BigDecimal getFlt10fuQty() {
        return flt10fuQty;
    }

    public void setFlt10fuQty(BigDecimal flt10fuQty) {
        this.flt10fuQty = flt10fuQty;
    }

    public int getFlt1FuSaleAmt() {
        return flt1FuSaleAmt;
    }

    public void setFlt1FuSaleAmt(int flt1FuSaleAmt) {
        this.flt1FuSaleAmt = flt1FuSaleAmt;
    }

    public BigDecimal getFlt10fuSaleAmt() {
        return flt10fuSaleAmt;
    }

    public void setFlt10fuSaleAmt(BigDecimal flt10fuSaleAmt) {
        this.flt10fuSaleAmt = flt10fuSaleAmt;
    }

    public String getFlt1Odometer() {
        return flt1Odometer;
    }

    public void setFlt1Odometer(String flt1Odometer) {
        this.flt1Odometer = flt1Odometer;
    }

    public String getFlt1VehicleNo() {
        return flt1VehicleNo;
    }

    public void setFlt1VehicleNo(String flt1VehicleNo) {
        this.flt1VehicleNo = flt1VehicleNo;
    }

    public String getFlt1DrvrNo() {
        return flt1DrvrNo;
    }

    public void setFlt1DrvrNo(String flt1DrvrNo) {
        this.flt1DrvrNo = flt1DrvrNo;
    }

    public Character getFlt1ProdTyp() {
        return flt1ProdTyp;
    }

    public void setFlt1ProdTyp(Character flt1ProdTyp) {
        this.flt1ProdTyp = flt1ProdTyp;
    }

    public int getFlt1DiscAmt() {
        return flt1DiscAmt;
    }

    public void setFlt1DiscAmt(int flt1DiscAmt) {
        this.flt1DiscAmt = flt1DiscAmt;
    }

    public BigDecimal getFlt10discAmt() {
        return flt10discAmt;
    }

    public void setFlt10discAmt(BigDecimal flt10discAmt) {
        this.flt10discAmt = flt10discAmt;
    }

    public int getFlt1TaxAmt1() {
        return flt1TaxAmt1;
    }

    public void setFlt1TaxAmt1(int flt1TaxAmt1) {
        this.flt1TaxAmt1 = flt1TaxAmt1;
    }

    public BigDecimal getFlt10taxAmt1() {
        return flt10taxAmt1;
    }

    public void setFlt10taxAmt1(BigDecimal flt10taxAmt1) {
        this.flt10taxAmt1 = flt10taxAmt1;
    }

    public int getFlt1TaxAmt2() {
        return flt1TaxAmt2;
    }

    public void setFlt1TaxAmt2(int flt1TaxAmt2) {
        this.flt1TaxAmt2 = flt1TaxAmt2;
    }

    public BigDecimal getFlt10taxAmt2() {
        return flt10taxAmt2;
    }

    public void setFlt10taxAmt2(BigDecimal flt10taxAmt2) {
        this.flt10taxAmt2 = flt10taxAmt2;
    }

    public String getFlt1AddendSeq() {
        return flt1AddendSeq;
    }

    public void setFlt1AddendSeq(String flt1AddendSeq) {
        this.flt1AddendSeq = flt1AddendSeq;
    }

    public String getFlt1TotalAddenda() {
        return flt1TotalAddenda;
    }

    public void setFlt1TotalAddenda(String flt1TotalAddenda) {
        this.flt1TotalAddenda = flt1TotalAddenda;
    }

    public String getFlt1AddendUseCd() {
        return flt1AddendUseCd;
    }

    public void setFlt1AddendUseCd(String flt1AddendUseCd) {
        this.flt1AddendUseCd = flt1AddendUseCd;
    }

    public int getNoteid() {
        return noteid;
    }

    public void setNoteid(int noteid) {
        this.noteid = noteid;
    }

    public String getClusterKey() {
        return clusterKey;
    }

    public void setClusterKey(String clusterKey) {
        this.clusterKey = clusterKey;
    }

    public String getFlt1amerchPostCd() {
        return flt1amerchPostCd;
    }

    public void setFlt1amerchPostCd(String flt1amerchPostCd) {
        this.flt1amerchPostCd = flt1amerchPostCd;
    }

    public Character getFlt1afuServTyp() {
        return flt1afuServTyp;
    }

    public void setFlt1afuServTyp(Character flt1afuServTyp) {
        this.flt1afuServTyp = flt1afuServTyp;
    }

    public String getFlt1afuProdCd() {
        return flt1afuProdCd;
    }

    public void setFlt1afuProdCd(String flt1afuProdCd) {
        this.flt1afuProdCd = flt1afuProdCd;
    }

    public BigDecimal getFlt1afuUntPrice() {
        return flt1afuUntPrice;
    }

    public void setFlt1afuUntPrice(BigDecimal flt1afuUntPrice) {
        this.flt1afuUntPrice = flt1afuUntPrice;
    }

    public BigDecimal getFlt1afuQty() {
        return flt1afuQty;
    }

    public void setFlt1afuQty(BigDecimal flt1afuQty) {
        this.flt1afuQty = flt1afuQty;
    }

    public BigDecimal getFlt1afuSaleAmt() {
        return flt1afuSaleAmt;
    }

    public void setFlt1afuSaleAmt(BigDecimal flt1afuSaleAmt) {
        this.flt1afuSaleAmt = flt1afuSaleAmt;
    }

    public BigDecimal getFlt1adiscAmt() {
        return flt1adiscAmt;
    }

    public void setFlt1adiscAmt(BigDecimal flt1adiscAmt) {
        this.flt1adiscAmt = flt1adiscAmt;
    }

    public BigDecimal getFlt1ataxAmt1() {
        return flt1ataxAmt1;
    }

    public void setFlt1ataxAmt1(BigDecimal flt1ataxAmt1) {
        this.flt1ataxAmt1 = flt1ataxAmt1;
    }

    public BigDecimal getFlt1ataxAmt2() {
        return flt1ataxAmt2;
    }

    public void setFlt1ataxAmt2(BigDecimal flt1ataxAmt2) {
        this.flt1ataxAmt2 = flt1ataxAmt2;
    }

    public String getFilteredFlags() {
        return filteredFlags;
    }

    public void setFilteredFlags(String filteredFlags) {
        this.filteredFlags = filteredFlags;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddFleetcard1PK != null ? mcAddFleetcard1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddFleetcard1)) {
            return false;
        }
        McAddFleetcard1 other = (McAddFleetcard1) object;
        if ((this.mcAddFleetcard1PK == null && other.mcAddFleetcard1PK != null) || (this.mcAddFleetcard1PK != null && !this.mcAddFleetcard1PK.equals(other.mcAddFleetcard1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddFleetcard1[ mcAddFleetcard1PK=" + mcAddFleetcard1PK + " ]";
    }

}
