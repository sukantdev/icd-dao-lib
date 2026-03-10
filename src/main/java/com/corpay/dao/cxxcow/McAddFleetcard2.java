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
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_ADD_FLEETCARD2", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McAddFleetcard2.findAll", query = "SELECT m FROM McAddFleetcard2 m"),
    @NamedQuery(name = "McAddFleetcard2.findByStlmtId", query = "SELECT m FROM McAddFleetcard2 m WHERE m.mcAddFleetcard2PK.stlmtId = :stlmtId"),
    @NamedQuery(name = "McAddFleetcard2.findByBtchId", query = "SELECT m FROM McAddFleetcard2 m WHERE m.mcAddFleetcard2PK.btchId = :btchId"),
    @NamedQuery(name = "McAddFleetcard2.findByMrchId", query = "SELECT m FROM McAddFleetcard2 m WHERE m.mcAddFleetcard2PK.mrchId = :mrchId"),
    @NamedQuery(name = "McAddFleetcard2.findByDtlStlmtId", query = "SELECT m FROM McAddFleetcard2 m WHERE m.mcAddFleetcard2PK.dtlStlmtId = :dtlStlmtId"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2AddId", query = "SELECT m FROM McAddFleetcard2 m WHERE m.mcAddFleetcard2PK.flt2AddId = :flt2AddId"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2ProdCd", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2ProdCd = :flt2ProdCd"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2ItemDesc", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2ItemDesc = :flt2ItemDesc"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2ItemQty", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2ItemQty = :flt2ItemQty"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt20itemQty", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt20itemQty = :flt20itemQty"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2ItemUnMeas", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2ItemUnMeas = :flt2ItemUnMeas"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2ExtItemAmt", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2ExtItemAmt = :flt2ExtItemAmt"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt20extItemAmt", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt20extItemAmt = :flt20extItemAmt"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2DiscFlg", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2DiscFlg = :flt2DiscFlg"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2DiscAmt", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2DiscAmt = :flt2DiscAmt"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt20discAmt", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt20discAmt = :flt20discAmt"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2NetGrossFlg", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2NetGrossFlg = :flt2NetGrossFlg"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2TaxRateAppl", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2TaxRateAppl = :flt2TaxRateAppl"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2TaxTypeAppl", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2TaxTypeAppl = :flt2TaxTypeAppl"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2TaxAmt", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2TaxAmt = :flt2TaxAmt"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt20taxAmt", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt20taxAmt = :flt20taxAmt"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2DebCredInd", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2DebCredInd = :flt2DebCredInd"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2AltTaxId", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2AltTaxId = :flt2AltTaxId"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2AddendSeq", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2AddendSeq = :flt2AddendSeq"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2TotalAddenda", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2TotalAddenda = :flt2TotalAddenda"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2AddendUseCd", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2AddendUseCd = :flt2AddendUseCd"),
    @NamedQuery(name = "McAddFleetcard2.findByNoteid", query = "SELECT m FROM McAddFleetcard2 m WHERE m.noteid = :noteid"),
    @NamedQuery(name = "McAddFleetcard2.findByClusterKey", query = "SELECT m FROM McAddFleetcard2 m WHERE m.clusterKey = :clusterKey"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt20adjItemAmt", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt20adjItemAmt = :flt20adjItemAmt"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2AdjDebCred", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2AdjDebCred = :flt2AdjDebCred"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2aitemDesc", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2aitemDesc = :flt2aitemDesc"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2aitemQty", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2aitemQty = :flt2aitemQty"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2aextItemAmt", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2aextItemAmt = :flt2aextItemAmt"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2adiscAmt", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2adiscAmt = :flt2adiscAmt"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2ataxAmt", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2ataxAmt = :flt2ataxAmt"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2adebCredInd", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2adebCredInd = :flt2adebCredInd"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2anetGrossFlg", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2anetGrossFlg = :flt2anetGrossFlg"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2adiscFlg", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2adiscFlg = :flt2adiscFlg"),
    @NamedQuery(name = "McAddFleetcard2.findByFlt2aprodCd", query = "SELECT m FROM McAddFleetcard2 m WHERE m.flt2aprodCd = :flt2aprodCd"),
    @NamedQuery(name = "McAddFleetcard2.findByFilteredFlags", query = "SELECT m FROM McAddFleetcard2 m WHERE m.filteredFlags = :filteredFlags")})
public class McAddFleetcard2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddFleetcard2PK mcAddFleetcard2PK;
    @Basic(optional = false)
    @Column(name = "FLT2_PROD_CD")
    private String flt2ProdCd;
    @Basic(optional = false)
    @Column(name = "FLT2_ITEM_DESC")
    private String flt2ItemDesc;
    @Basic(optional = false)
    @Column(name = "FLT2_ITEM_QTY")
    private String flt2ItemQty;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "FLT20ITEM_QTY")
    private BigDecimal flt20itemQty;
    @Basic(optional = false)
    @Column(name = "FLT2_ITEM_UN_MEAS")
    private String flt2ItemUnMeas;
    @Basic(optional = false)
    @Column(name = "FLT2_EXT_ITEM_AMT")
    private String flt2ExtItemAmt;
    @Basic(optional = false)
    @Column(name = "FLT20EXT_ITEM_AMT")
    private BigDecimal flt20extItemAmt;
    @Basic(optional = false)
    @Column(name = "FLT2_DISC_FLG")
    private Character flt2DiscFlg;
    @Basic(optional = false)
    @Column(name = "FLT2_DISC_AMT")
    private String flt2DiscAmt;
    @Basic(optional = false)
    @Column(name = "FLT20DISC_AMT")
    private BigDecimal flt20discAmt;
    @Basic(optional = false)
    @Column(name = "FLT2_NET_GROSS_FLG")
    private Character flt2NetGrossFlg;
    @Basic(optional = false)
    @Column(name = "FLT2_TAX_RATE_APPL")
    private String flt2TaxRateAppl;
    @Basic(optional = false)
    @Column(name = "FLT2_TAX_TYPE_APPL")
    private String flt2TaxTypeAppl;
    @Basic(optional = false)
    @Column(name = "FLT2_TAX_AMT")
    private String flt2TaxAmt;
    @Basic(optional = false)
    @Column(name = "FLT20TAX_AMT")
    private BigDecimal flt20taxAmt;
    @Basic(optional = false)
    @Column(name = "FLT2_DEB_CRED_IND")
    private Character flt2DebCredInd;
    @Basic(optional = false)
    @Column(name = "FLT2_ALT_TAX_ID")
    private String flt2AltTaxId;
    @Basic(optional = false)
    @Column(name = "FLT2_ADDEND_SEQ")
    private String flt2AddendSeq;
    @Basic(optional = false)
    @Column(name = "FLT2_TOTAL_ADDENDA")
    private String flt2TotalAddenda;
    @Basic(optional = false)
    @Column(name = "FLT2_ADDEND_USE_CD")
    private String flt2AddendUseCd;
    @Basic(optional = false)
    @Column(name = "NOTEID")
    private int noteid;
    @Basic(optional = false)
    @Column(name = "CLUSTER_KEY")
    private String clusterKey;
    @Basic(optional = false)
    @Column(name = "FLT20ADJ_ITEM_AMT")
    private BigDecimal flt20adjItemAmt;
    @Basic(optional = false)
    @Column(name = "FLT2_ADJ_DEB_CRED")
    private Character flt2AdjDebCred;
    @Basic(optional = false)
    @Column(name = "FLT2AITEM_DESC")
    private String flt2aitemDesc;
    @Basic(optional = false)
    @Column(name = "FLT2AITEM_QTY")
    private BigDecimal flt2aitemQty;
    @Basic(optional = false)
    @Column(name = "FLT2AEXT_ITEM_AMT")
    private BigDecimal flt2aextItemAmt;
    @Basic(optional = false)
    @Column(name = "FLT2ADISC_AMT")
    private BigDecimal flt2adiscAmt;
    @Basic(optional = false)
    @Column(name = "FLT2ATAX_AMT")
    private BigDecimal flt2ataxAmt;
    @Basic(optional = false)
    @Column(name = "FLT2ADEB_CRED_IND")
    private Character flt2adebCredInd;
    @Basic(optional = false)
    @Column(name = "FLT2ANET_GROSS_FLG")
    private Character flt2anetGrossFlg;
    @Basic(optional = false)
    @Column(name = "FLT2ADISC_FLG")
    private Character flt2adiscFlg;
    @Basic(optional = false)
    @Column(name = "FLT2APROD_CD")
    private String flt2aprodCd;
    @Basic(optional = false)
    @Column(name = "FILTERED_FLAGS")
    private String filteredFlags;

    public McAddFleetcard2() {
    }

    public McAddFleetcard2(McAddFleetcard2PK mcAddFleetcard2PK) {
        this.mcAddFleetcard2PK = mcAddFleetcard2PK;
    }

    public McAddFleetcard2(McAddFleetcard2PK mcAddFleetcard2PK, String flt2ProdCd, String flt2ItemDesc, String flt2ItemQty, BigDecimal flt20itemQty, String flt2ItemUnMeas, String flt2ExtItemAmt, BigDecimal flt20extItemAmt, Character flt2DiscFlg, String flt2DiscAmt, BigDecimal flt20discAmt, Character flt2NetGrossFlg, String flt2TaxRateAppl, String flt2TaxTypeAppl, String flt2TaxAmt, BigDecimal flt20taxAmt, Character flt2DebCredInd, String flt2AltTaxId, String flt2AddendSeq, String flt2TotalAddenda, String flt2AddendUseCd, int noteid, String clusterKey, BigDecimal flt20adjItemAmt, Character flt2AdjDebCred, String flt2aitemDesc, BigDecimal flt2aitemQty, BigDecimal flt2aextItemAmt, BigDecimal flt2adiscAmt, BigDecimal flt2ataxAmt, Character flt2adebCredInd, Character flt2anetGrossFlg, Character flt2adiscFlg, String flt2aprodCd, String filteredFlags) {
        this.mcAddFleetcard2PK = mcAddFleetcard2PK;
        this.flt2ProdCd = flt2ProdCd;
        this.flt2ItemDesc = flt2ItemDesc;
        this.flt2ItemQty = flt2ItemQty;
        this.flt20itemQty = flt20itemQty;
        this.flt2ItemUnMeas = flt2ItemUnMeas;
        this.flt2ExtItemAmt = flt2ExtItemAmt;
        this.flt20extItemAmt = flt20extItemAmt;
        this.flt2DiscFlg = flt2DiscFlg;
        this.flt2DiscAmt = flt2DiscAmt;
        this.flt20discAmt = flt20discAmt;
        this.flt2NetGrossFlg = flt2NetGrossFlg;
        this.flt2TaxRateAppl = flt2TaxRateAppl;
        this.flt2TaxTypeAppl = flt2TaxTypeAppl;
        this.flt2TaxAmt = flt2TaxAmt;
        this.flt20taxAmt = flt20taxAmt;
        this.flt2DebCredInd = flt2DebCredInd;
        this.flt2AltTaxId = flt2AltTaxId;
        this.flt2AddendSeq = flt2AddendSeq;
        this.flt2TotalAddenda = flt2TotalAddenda;
        this.flt2AddendUseCd = flt2AddendUseCd;
        this.noteid = noteid;
        this.clusterKey = clusterKey;
        this.flt20adjItemAmt = flt20adjItemAmt;
        this.flt2AdjDebCred = flt2AdjDebCred;
        this.flt2aitemDesc = flt2aitemDesc;
        this.flt2aitemQty = flt2aitemQty;
        this.flt2aextItemAmt = flt2aextItemAmt;
        this.flt2adiscAmt = flt2adiscAmt;
        this.flt2ataxAmt = flt2ataxAmt;
        this.flt2adebCredInd = flt2adebCredInd;
        this.flt2anetGrossFlg = flt2anetGrossFlg;
        this.flt2adiscFlg = flt2adiscFlg;
        this.flt2aprodCd = flt2aprodCd;
        this.filteredFlags = filteredFlags;
    }

    public McAddFleetcard2(Date stlmtId, short btchId, short mrchId, short dtlStlmtId, short flt2AddId) {
        this.mcAddFleetcard2PK = new McAddFleetcard2PK(stlmtId, btchId, mrchId, dtlStlmtId, flt2AddId);
    }

    public McAddFleetcard2PK getMcAddFleetcard2PK() {
        return mcAddFleetcard2PK;
    }

    public void setMcAddFleetcard2PK(McAddFleetcard2PK mcAddFleetcard2PK) {
        this.mcAddFleetcard2PK = mcAddFleetcard2PK;
    }

    public String getFlt2ProdCd() {
        return flt2ProdCd;
    }

    public void setFlt2ProdCd(String flt2ProdCd) {
        this.flt2ProdCd = flt2ProdCd;
    }

    public String getFlt2ItemDesc() {
        return flt2ItemDesc;
    }

    public void setFlt2ItemDesc(String flt2ItemDesc) {
        this.flt2ItemDesc = flt2ItemDesc;
    }

    public String getFlt2ItemQty() {
        return flt2ItemQty;
    }

    public void setFlt2ItemQty(String flt2ItemQty) {
        this.flt2ItemQty = flt2ItemQty;
    }

    public BigDecimal getFlt20itemQty() {
        return flt20itemQty;
    }

    public void setFlt20itemQty(BigDecimal flt20itemQty) {
        this.flt20itemQty = flt20itemQty;
    }

    public String getFlt2ItemUnMeas() {
        return flt2ItemUnMeas;
    }

    public void setFlt2ItemUnMeas(String flt2ItemUnMeas) {
        this.flt2ItemUnMeas = flt2ItemUnMeas;
    }

    public String getFlt2ExtItemAmt() {
        return flt2ExtItemAmt;
    }

    public void setFlt2ExtItemAmt(String flt2ExtItemAmt) {
        this.flt2ExtItemAmt = flt2ExtItemAmt;
    }

    public BigDecimal getFlt20extItemAmt() {
        return flt20extItemAmt;
    }

    public void setFlt20extItemAmt(BigDecimal flt20extItemAmt) {
        this.flt20extItemAmt = flt20extItemAmt;
    }

    public Character getFlt2DiscFlg() {
        return flt2DiscFlg;
    }

    public void setFlt2DiscFlg(Character flt2DiscFlg) {
        this.flt2DiscFlg = flt2DiscFlg;
    }

    public String getFlt2DiscAmt() {
        return flt2DiscAmt;
    }

    public void setFlt2DiscAmt(String flt2DiscAmt) {
        this.flt2DiscAmt = flt2DiscAmt;
    }

    public BigDecimal getFlt20discAmt() {
        return flt20discAmt;
    }

    public void setFlt20discAmt(BigDecimal flt20discAmt) {
        this.flt20discAmt = flt20discAmt;
    }

    public Character getFlt2NetGrossFlg() {
        return flt2NetGrossFlg;
    }

    public void setFlt2NetGrossFlg(Character flt2NetGrossFlg) {
        this.flt2NetGrossFlg = flt2NetGrossFlg;
    }

    public String getFlt2TaxRateAppl() {
        return flt2TaxRateAppl;
    }

    public void setFlt2TaxRateAppl(String flt2TaxRateAppl) {
        this.flt2TaxRateAppl = flt2TaxRateAppl;
    }

    public String getFlt2TaxTypeAppl() {
        return flt2TaxTypeAppl;
    }

    public void setFlt2TaxTypeAppl(String flt2TaxTypeAppl) {
        this.flt2TaxTypeAppl = flt2TaxTypeAppl;
    }

    public String getFlt2TaxAmt() {
        return flt2TaxAmt;
    }

    public void setFlt2TaxAmt(String flt2TaxAmt) {
        this.flt2TaxAmt = flt2TaxAmt;
    }

    public BigDecimal getFlt20taxAmt() {
        return flt20taxAmt;
    }

    public void setFlt20taxAmt(BigDecimal flt20taxAmt) {
        this.flt20taxAmt = flt20taxAmt;
    }

    public Character getFlt2DebCredInd() {
        return flt2DebCredInd;
    }

    public void setFlt2DebCredInd(Character flt2DebCredInd) {
        this.flt2DebCredInd = flt2DebCredInd;
    }

    public String getFlt2AltTaxId() {
        return flt2AltTaxId;
    }

    public void setFlt2AltTaxId(String flt2AltTaxId) {
        this.flt2AltTaxId = flt2AltTaxId;
    }

    public String getFlt2AddendSeq() {
        return flt2AddendSeq;
    }

    public void setFlt2AddendSeq(String flt2AddendSeq) {
        this.flt2AddendSeq = flt2AddendSeq;
    }

    public String getFlt2TotalAddenda() {
        return flt2TotalAddenda;
    }

    public void setFlt2TotalAddenda(String flt2TotalAddenda) {
        this.flt2TotalAddenda = flt2TotalAddenda;
    }

    public String getFlt2AddendUseCd() {
        return flt2AddendUseCd;
    }

    public void setFlt2AddendUseCd(String flt2AddendUseCd) {
        this.flt2AddendUseCd = flt2AddendUseCd;
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

    public BigDecimal getFlt20adjItemAmt() {
        return flt20adjItemAmt;
    }

    public void setFlt20adjItemAmt(BigDecimal flt20adjItemAmt) {
        this.flt20adjItemAmt = flt20adjItemAmt;
    }

    public Character getFlt2AdjDebCred() {
        return flt2AdjDebCred;
    }

    public void setFlt2AdjDebCred(Character flt2AdjDebCred) {
        this.flt2AdjDebCred = flt2AdjDebCred;
    }

    public String getFlt2aitemDesc() {
        return flt2aitemDesc;
    }

    public void setFlt2aitemDesc(String flt2aitemDesc) {
        this.flt2aitemDesc = flt2aitemDesc;
    }

    public BigDecimal getFlt2aitemQty() {
        return flt2aitemQty;
    }

    public void setFlt2aitemQty(BigDecimal flt2aitemQty) {
        this.flt2aitemQty = flt2aitemQty;
    }

    public BigDecimal getFlt2aextItemAmt() {
        return flt2aextItemAmt;
    }

    public void setFlt2aextItemAmt(BigDecimal flt2aextItemAmt) {
        this.flt2aextItemAmt = flt2aextItemAmt;
    }

    public BigDecimal getFlt2adiscAmt() {
        return flt2adiscAmt;
    }

    public void setFlt2adiscAmt(BigDecimal flt2adiscAmt) {
        this.flt2adiscAmt = flt2adiscAmt;
    }

    public BigDecimal getFlt2ataxAmt() {
        return flt2ataxAmt;
    }

    public void setFlt2ataxAmt(BigDecimal flt2ataxAmt) {
        this.flt2ataxAmt = flt2ataxAmt;
    }

    public Character getFlt2adebCredInd() {
        return flt2adebCredInd;
    }

    public void setFlt2adebCredInd(Character flt2adebCredInd) {
        this.flt2adebCredInd = flt2adebCredInd;
    }

    public Character getFlt2anetGrossFlg() {
        return flt2anetGrossFlg;
    }

    public void setFlt2anetGrossFlg(Character flt2anetGrossFlg) {
        this.flt2anetGrossFlg = flt2anetGrossFlg;
    }

    public Character getFlt2adiscFlg() {
        return flt2adiscFlg;
    }

    public void setFlt2adiscFlg(Character flt2adiscFlg) {
        this.flt2adiscFlg = flt2adiscFlg;
    }

    public String getFlt2aprodCd() {
        return flt2aprodCd;
    }

    public void setFlt2aprodCd(String flt2aprodCd) {
        this.flt2aprodCd = flt2aprodCd;
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
        hash += (mcAddFleetcard2PK != null ? mcAddFleetcard2PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McAddFleetcard2)) {
            return false;
        }
        McAddFleetcard2 other = (McAddFleetcard2) object;
        if ((this.mcAddFleetcard2PK == null && other.mcAddFleetcard2PK != null) || (this.mcAddFleetcard2PK != null && !this.mcAddFleetcard2PK.equals(other.mcAddFleetcard2PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddFleetcard2[ mcAddFleetcard2PK=" + mcAddFleetcard2PK + " ]";
    }
    
}
