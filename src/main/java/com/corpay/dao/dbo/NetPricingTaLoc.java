package com.corpay.dao.dbo;

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
@Table(name = "NET_PRICING_TA_LOC", catalog = "", schema = "DBO")
public class NetPricingTaLoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NetPricingTaLocPK netPricingTaLocPK;
    @Basic(optional = false)
    @Column(name = "TA_MRCH_CD")
    private String taMrchCd;
    @Basic(optional = false)
    @Column(name = "NET_PRC_REL_TYP_CD")
    private Character netPrcRelTypCd;

    @Basic(optional = false)
    @Column(name = "PER_UNIT_PRC")
    private BigDecimal perUnitPrc;
    @Basic(optional = false)
    @Column(name = "PER_UNIT_PRC_TYP")
    private Character perUnitPrcTyp;
    @Basic(optional = false)
    @Column(name = "CNT_OFF_PER_GAL_AMT")
    private BigDecimal cntOffPerGalAmt;
    @Basic(optional = false)
    @Column(name = "CURR_RETAIL_PRC")
    private BigDecimal currRetailPrc;
    @Basic(optional = false)
    @Column(name = "RETAIL_PRC_LAST_UPD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date retailPrcLastUpdTs;
    @Basic(optional = false)
    @Column(name = "LAST_UPD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdTs;

    public NetPricingTaLoc() {
    }

    public NetPricingTaLoc(NetPricingTaLocPK netPricingTaLocPK) {
        this.netPricingTaLocPK = netPricingTaLocPK;
    }

    public NetPricingTaLoc(NetPricingTaLocPK netPricingTaLocPK, String taMrchCd, Character netPrcRelTypCd, BigDecimal perUnitPrc, Character perUnitPrcTyp, BigDecimal cntOffPerGalAmt, BigDecimal currRetailPrc, Date retailPrcLastUpdTs, Date lastUpdTs) {
        this.netPricingTaLocPK = netPricingTaLocPK;
        this.taMrchCd = taMrchCd;
        this.netPrcRelTypCd = netPrcRelTypCd;
        this.perUnitPrc = perUnitPrc;
        this.perUnitPrcTyp = perUnitPrcTyp;
        this.cntOffPerGalAmt = cntOffPerGalAmt;
        this.currRetailPrc = currRetailPrc;
        this.retailPrcLastUpdTs = retailPrcLastUpdTs;
        this.lastUpdTs = lastUpdTs;
    }

    public NetPricingTaLoc(String keyToTaLoc, String locCd, String prdCd) {
        this.netPricingTaLocPK = new NetPricingTaLocPK(keyToTaLoc, locCd, prdCd);
    }

    public NetPricingTaLocPK getNetPricingTaLocPK() {
        return netPricingTaLocPK;
    }

    public void setNetPricingTaLocPK(NetPricingTaLocPK netPricingTaLocPK) {
        this.netPricingTaLocPK = netPricingTaLocPK;
    }

    public String getTaMrchCd() {
        return taMrchCd;
    }

    public void setTaMrchCd(String taMrchCd) {
        this.taMrchCd = taMrchCd;
    }

    public Character getNetPrcRelTypCd() {
        return netPrcRelTypCd;
    }

    public void setNetPrcRelTypCd(Character netPrcRelTypCd) {
        this.netPrcRelTypCd = netPrcRelTypCd;
    }

    public BigDecimal getPerUnitPrc() {
        return perUnitPrc;
    }

    public void setPerUnitPrc(BigDecimal perUnitPrc) {
        this.perUnitPrc = perUnitPrc;
    }

    public Character getPerUnitPrcTyp() {
        return perUnitPrcTyp;
    }

    public void setPerUnitPrcTyp(Character perUnitPrcTyp) {
        this.perUnitPrcTyp = perUnitPrcTyp;
    }

    public BigDecimal getCntOffPerGalAmt() {
        return cntOffPerGalAmt;
    }

    public void setCntOffPerGalAmt(BigDecimal cntOffPerGalAmt) {
        this.cntOffPerGalAmt = cntOffPerGalAmt;
    }

    public BigDecimal getCurrRetailPrc() {
        return currRetailPrc;
    }

    public void setCurrRetailPrc(BigDecimal currRetailPrc) {
        this.currRetailPrc = currRetailPrc;
    }

    public Date getRetailPrcLastUpdTs() {
        return retailPrcLastUpdTs;
    }

    public void setRetailPrcLastUpdTs(Date retailPrcLastUpdTs) {
        this.retailPrcLastUpdTs = retailPrcLastUpdTs;
    }

    public Date getLastUpdTs() {
        return lastUpdTs;
    }

    public void setLastUpdTs(Date lastUpdTs) {
        this.lastUpdTs = lastUpdTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (netPricingTaLocPK != null ? netPricingTaLocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof NetPricingTaLoc)) {
            return false;
        }
        NetPricingTaLoc other = (NetPricingTaLoc) object;
        if ((this.netPricingTaLocPK == null && other.netPricingTaLocPK != null) || (this.netPricingTaLocPK != null && !this.netPricingTaLocPK.equals(other.netPricingTaLocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NetPricingTaLoc[ netPricingTaLocPK=" + netPricingTaLocPK + " ]";
    }

}
