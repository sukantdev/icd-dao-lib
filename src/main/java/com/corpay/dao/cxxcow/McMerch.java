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
@Table(name = "MC_MERCH", catalog = "", schema = "CXXCOW")
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
