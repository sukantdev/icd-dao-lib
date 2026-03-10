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
@Table(name = "MC_MERCH", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McMerch.findAll", query = "SELECT m FROM McMerch m"),
    @NamedQuery(name = "McMerch.findByD43s1CrdAcpNm", query = "SELECT m FROM McMerch m WHERE m.mcMerchPK.d43s1CrdAcpNm = :d43s1CrdAcpNm"),
    @NamedQuery(name = "McMerch.findByD43s2CrdAcpStr", query = "SELECT m FROM McMerch m WHERE m.mcMerchPK.d43s2CrdAcpStr = :d43s2CrdAcpStr"),
    @NamedQuery(name = "McMerch.findByD43s3CrdAcpCty", query = "SELECT m FROM McMerch m WHERE m.mcMerchPK.d43s3CrdAcpCty = :d43s3CrdAcpCty"),
    @NamedQuery(name = "McMerch.findByD43s4CrdAcpZip", query = "SELECT m FROM McMerch m WHERE m.mcMerchPK.d43s4CrdAcpZip = :d43s4CrdAcpZip"),
    @NamedQuery(name = "McMerch.findByD43s5CrdAcpSt", query = "SELECT m FROM McMerch m WHERE m.mcMerchPK.d43s5CrdAcpSt = :d43s5CrdAcpSt"),
    @NamedQuery(name = "McMerch.findByD43s6CrdAcpCtry", query = "SELECT m FROM McMerch m WHERE m.mcMerchPK.d43s6CrdAcpCtry = :d43s6CrdAcpCtry"),
    @NamedQuery(name = "McMerch.findByA43s4CrdAcpZip", query = "SELECT m FROM McMerch m WHERE m.a43s4CrdAcpZip = :a43s4CrdAcpZip"),
    @NamedQuery(name = "McMerch.findByA43s5CrdAcpSt", query = "SELECT m FROM McMerch m WHERE m.a43s5CrdAcpSt = :a43s5CrdAcpSt"),
    @NamedQuery(name = "McMerch.findByMcMerchId", query = "SELECT m FROM McMerch m WHERE m.mcMerchId = :mcMerchId"),
    @NamedQuery(name = "McMerch.findByMcMidLastUsed", query = "SELECT m FROM McMerch m WHERE m.mcMidLastUsed = :mcMidLastUsed"),
    @NamedQuery(name = "McMerch.findByFilteredFlags", query = "SELECT m FROM McMerch m WHERE m.filteredFlags = :filteredFlags"),
    @NamedQuery(name = "McMerch.findByP0216S0005AcptGeoCord", query = "SELECT m FROM McMerch m WHERE m.p0216S0005AcptGeoCord = :p0216S0005AcptGeoCord"),
    @NamedQuery(name = "McMerch.findByMcAcptLatNbr", query = "SELECT m FROM McMerch m WHERE m.mcAcptLatNbr = :mcAcptLatNbr"),
    @NamedQuery(name = "McMerch.findByMcAcptLongNbr", query = "SELECT m FROM McMerch m WHERE m.mcAcptLongNbr = :mcAcptLongNbr")})
public class McMerch implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McMerchPK mcMerchPK;
    @Column(name = "A43S4_CRD_ACP_ZIP")
    private String a43s4CrdAcpZip;
    @Column(name = "A43S5_CRD_ACP_ST")
    private String a43s5CrdAcpSt;
    @Basic(optional = false)
    @Column(name = "MC_MERCH_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mcMerchId;
    @Basic(optional = false)
    @Column(name = "MC_MID_LAST_USED")
    @Temporal(TemporalType.DATE)
    private Date mcMidLastUsed;
    @Column(name = "FILTERED_FLAGS")
    private String filteredFlags;
    @Basic(optional = false)
    @Column(name = "P0216_S0005_ACPT_GEO_CORD")
    private String p0216S0005AcptGeoCord;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MC_ACPT_LAT_NBR")
    private BigDecimal mcAcptLatNbr;
    @Basic(optional = false)
    @Column(name = "MC_ACPT_LONG_NBR")
    private BigDecimal mcAcptLongNbr;

    public McMerch() {
    }

    public McMerch(McMerchPK mcMerchPK) {
        this.mcMerchPK = mcMerchPK;
    }

    public McMerch(McMerchPK mcMerchPK, Date mcMerchId, Date mcMidLastUsed, String p0216S0005AcptGeoCord, BigDecimal mcAcptLatNbr, BigDecimal mcAcptLongNbr) {
        this.mcMerchPK = mcMerchPK;
        this.mcMerchId = mcMerchId;
        this.mcMidLastUsed = mcMidLastUsed;
        this.p0216S0005AcptGeoCord = p0216S0005AcptGeoCord;
        this.mcAcptLatNbr = mcAcptLatNbr;
        this.mcAcptLongNbr = mcAcptLongNbr;
    }

    public McMerch(String d43s1CrdAcpNm, String d43s2CrdAcpStr, String d43s3CrdAcpCty, String d43s4CrdAcpZip, String d43s5CrdAcpSt, String d43s6CrdAcpCtry) {
        this.mcMerchPK = new McMerchPK(d43s1CrdAcpNm, d43s2CrdAcpStr, d43s3CrdAcpCty, d43s4CrdAcpZip, d43s5CrdAcpSt, d43s6CrdAcpCtry);
    }

    public McMerchPK getMcMerchPK() {
        return mcMerchPK;
    }

    public void setMcMerchPK(McMerchPK mcMerchPK) {
        this.mcMerchPK = mcMerchPK;
    }

    public String getA43s4CrdAcpZip() {
        return a43s4CrdAcpZip;
    }

    public void setA43s4CrdAcpZip(String a43s4CrdAcpZip) {
        this.a43s4CrdAcpZip = a43s4CrdAcpZip;
    }

    public String getA43s5CrdAcpSt() {
        return a43s5CrdAcpSt;
    }

    public void setA43s5CrdAcpSt(String a43s5CrdAcpSt) {
        this.a43s5CrdAcpSt = a43s5CrdAcpSt;
    }

    public Date getMcMerchId() {
        return mcMerchId;
    }

    public void setMcMerchId(Date mcMerchId) {
        this.mcMerchId = mcMerchId;
    }

    public Date getMcMidLastUsed() {
        return mcMidLastUsed;
    }

    public void setMcMidLastUsed(Date mcMidLastUsed) {
        this.mcMidLastUsed = mcMidLastUsed;
    }

    public String getFilteredFlags() {
        return filteredFlags;
    }

    public void setFilteredFlags(String filteredFlags) {
        this.filteredFlags = filteredFlags;
    }

    public String getP0216S0005AcptGeoCord() {
        return p0216S0005AcptGeoCord;
    }

    public void setP0216S0005AcptGeoCord(String p0216S0005AcptGeoCord) {
        this.p0216S0005AcptGeoCord = p0216S0005AcptGeoCord;
    }

    public BigDecimal getMcAcptLatNbr() {
        return mcAcptLatNbr;
    }

    public void setMcAcptLatNbr(BigDecimal mcAcptLatNbr) {
        this.mcAcptLatNbr = mcAcptLatNbr;
    }

    public BigDecimal getMcAcptLongNbr() {
        return mcAcptLongNbr;
    }

    public void setMcAcptLongNbr(BigDecimal mcAcptLongNbr) {
        this.mcAcptLongNbr = mcAcptLongNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcMerchPK != null ? mcMerchPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McMerch)) {
            return false;
        }
        McMerch other = (McMerch) object;
        if ((this.mcMerchPK == null && other.mcMerchPK != null) || (this.mcMerchPK != null && !this.mcMerchPK.equals(other.mcMerchPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McMerch[ mcMerchPK=" + mcMerchPK + " ]";
    }
    
}
