/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

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
@Table(name = "PRICING_FILE_DISCOUNT_INFO", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PricingFileDiscountInfo.findAll", query = "SELECT p FROM PricingFileDiscountInfo p")})
public class PricingFileDiscountInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PricingFileDiscountInfoPK pricingFileDiscountInfoPK;
    @Basic(optional = false)
    @Column(name = "RTL_FRST_DISC_FLG")
    private Character rtlFrstDiscFlg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "RTL_FRST_DIS_AMT")
    private BigDecimal rtlFrstDisAmt;
    @Basic(optional = false)
    @Column(name = "RTL_SECND_DISC_FLG")
    private Character rtlSecndDiscFlg;
    @Basic(optional = false)
    @Column(name = "RTL_SECND_DISC_AMT")
    private BigDecimal rtlSecndDiscAmt;
    @Basic(optional = false)
    @Column(name = "RTL_THRD_DISC_FLG")
    private Character rtlThrdDiscFlg;
    @Basic(optional = false)
    @Column(name = "RTL_THRD_DISC_AMT")
    private BigDecimal rtlThrdDiscAmt;
    @Basic(optional = false)
    @Column(name = "RTL_REMAINDER_FLG")
    private Character rtlRemainderFlg;
    @Basic(optional = false)
    @Column(name = "CST_PLS_FRST_DISC_FLG")
    private Character cstPlsFrstDiscFlg;
    @Basic(optional = false)
    @Column(name = "CST_PLS_FRST_DISC_AMT")
    private BigDecimal cstPlsFrstDiscAmt;
    @Basic(optional = false)
    @Column(name = "CST_PLUS_RMNDR_FLG")
    private Character cstPlusRmndrFlg;
    @Basic(optional = false)
    @Column(name = "NET_FOR_SMALL_FLEET_AMT")
    private BigDecimal netForSmallFleetAmt;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "ALT_TA_FEE")
    private BigDecimal altTaFee;

    public PricingFileDiscountInfo() {
    }

    public PricingFileDiscountInfo(PricingFileDiscountInfoPK pricingFileDiscountInfoPK) {
        this.pricingFileDiscountInfoPK = pricingFileDiscountInfoPK;
    }

    public PricingFileDiscountInfo(PricingFileDiscountInfoPK pricingFileDiscountInfoPK, Character rtlFrstDiscFlg, BigDecimal rtlFrstDisAmt, Character rtlSecndDiscFlg, BigDecimal rtlSecndDiscAmt, Character rtlThrdDiscFlg, BigDecimal rtlThrdDiscAmt, Character rtlRemainderFlg, Character cstPlsFrstDiscFlg, BigDecimal cstPlsFrstDiscAmt, Character cstPlusRmndrFlg, BigDecimal netForSmallFleetAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, BigDecimal altTaFee) {
        this.pricingFileDiscountInfoPK = pricingFileDiscountInfoPK;
        this.rtlFrstDiscFlg = rtlFrstDiscFlg;
        this.rtlFrstDisAmt = rtlFrstDisAmt;
        this.rtlSecndDiscFlg = rtlSecndDiscFlg;
        this.rtlSecndDiscAmt = rtlSecndDiscAmt;
        this.rtlThrdDiscFlg = rtlThrdDiscFlg;
        this.rtlThrdDiscAmt = rtlThrdDiscAmt;
        this.rtlRemainderFlg = rtlRemainderFlg;
        this.cstPlsFrstDiscFlg = cstPlsFrstDiscFlg;
        this.cstPlsFrstDiscAmt = cstPlsFrstDiscAmt;
        this.cstPlusRmndrFlg = cstPlusRmndrFlg;
        this.netForSmallFleetAmt = netForSmallFleetAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.altTaFee = altTaFee;
    }

    public PricingFileDiscountInfo(String pfidCd, String custTyp, String custCd, String locTyp, String locCd) {
        this.pricingFileDiscountInfoPK = new PricingFileDiscountInfoPK(pfidCd, custTyp, custCd, locTyp, locCd);
    }

    public PricingFileDiscountInfoPK getPricingFileDiscountInfoPK() {
        return pricingFileDiscountInfoPK;
    }

    public void setPricingFileDiscountInfoPK(PricingFileDiscountInfoPK pricingFileDiscountInfoPK) {
        this.pricingFileDiscountInfoPK = pricingFileDiscountInfoPK;
    }

    public Character getRtlFrstDiscFlg() {
        return rtlFrstDiscFlg;
    }

    public void setRtlFrstDiscFlg(Character rtlFrstDiscFlg) {
        this.rtlFrstDiscFlg = rtlFrstDiscFlg;
    }

    public BigDecimal getRtlFrstDisAmt() {
        return rtlFrstDisAmt;
    }

    public void setRtlFrstDisAmt(BigDecimal rtlFrstDisAmt) {
        this.rtlFrstDisAmt = rtlFrstDisAmt;
    }

    public Character getRtlSecndDiscFlg() {
        return rtlSecndDiscFlg;
    }

    public void setRtlSecndDiscFlg(Character rtlSecndDiscFlg) {
        this.rtlSecndDiscFlg = rtlSecndDiscFlg;
    }

    public BigDecimal getRtlSecndDiscAmt() {
        return rtlSecndDiscAmt;
    }

    public void setRtlSecndDiscAmt(BigDecimal rtlSecndDiscAmt) {
        this.rtlSecndDiscAmt = rtlSecndDiscAmt;
    }

    public Character getRtlThrdDiscFlg() {
        return rtlThrdDiscFlg;
    }

    public void setRtlThrdDiscFlg(Character rtlThrdDiscFlg) {
        this.rtlThrdDiscFlg = rtlThrdDiscFlg;
    }

    public BigDecimal getRtlThrdDiscAmt() {
        return rtlThrdDiscAmt;
    }

    public void setRtlThrdDiscAmt(BigDecimal rtlThrdDiscAmt) {
        this.rtlThrdDiscAmt = rtlThrdDiscAmt;
    }

    public Character getRtlRemainderFlg() {
        return rtlRemainderFlg;
    }

    public void setRtlRemainderFlg(Character rtlRemainderFlg) {
        this.rtlRemainderFlg = rtlRemainderFlg;
    }

    public Character getCstPlsFrstDiscFlg() {
        return cstPlsFrstDiscFlg;
    }

    public void setCstPlsFrstDiscFlg(Character cstPlsFrstDiscFlg) {
        this.cstPlsFrstDiscFlg = cstPlsFrstDiscFlg;
    }

    public BigDecimal getCstPlsFrstDiscAmt() {
        return cstPlsFrstDiscAmt;
    }

    public void setCstPlsFrstDiscAmt(BigDecimal cstPlsFrstDiscAmt) {
        this.cstPlsFrstDiscAmt = cstPlsFrstDiscAmt;
    }

    public Character getCstPlusRmndrFlg() {
        return cstPlusRmndrFlg;
    }

    public void setCstPlusRmndrFlg(Character cstPlusRmndrFlg) {
        this.cstPlusRmndrFlg = cstPlusRmndrFlg;
    }

    public BigDecimal getNetForSmallFleetAmt() {
        return netForSmallFleetAmt;
    }

    public void setNetForSmallFleetAmt(BigDecimal netForSmallFleetAmt) {
        this.netForSmallFleetAmt = netForSmallFleetAmt;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public BigDecimal getAltTaFee() {
        return altTaFee;
    }

    public void setAltTaFee(BigDecimal altTaFee) {
        this.altTaFee = altTaFee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pricingFileDiscountInfoPK != null ? pricingFileDiscountInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PricingFileDiscountInfo)) {
            return false;
        }
        PricingFileDiscountInfo other = (PricingFileDiscountInfo) object;
        if ((this.pricingFileDiscountInfoPK == null && other.pricingFileDiscountInfoPK != null) || (this.pricingFileDiscountInfoPK != null && !this.pricingFileDiscountInfoPK.equals(other.pricingFileDiscountInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PricingFileDiscountInfo[ pricingFileDiscountInfoPK=" + pricingFileDiscountInfoPK + " ]";
    }
    
}
