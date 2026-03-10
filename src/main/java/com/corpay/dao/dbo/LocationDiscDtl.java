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
@Table(name = "LOCATION_DISC_DTL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "LocationDiscDtl.findAll", query = "SELECT l FROM LocationDiscDtl l")})
public class LocationDiscDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LocationDiscDtlPK locationDiscDtlPK;
    @Basic(optional = false)
    @Column(name = "TRUCK_CNT")
    private int truckCnt;
    @Basic(optional = false)
    @Column(name = "USE_MARGIN_FLG")
    private Character useMarginFlg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SC_FEE_AMT")
    private BigDecimal scFeeAmt;
    @Basic(optional = false)
    @Column(name = "SC_FEE_RTL_AMT")
    private BigDecimal scFeeRtlAmt;
    @Basic(optional = false)
    @Column(name = "CP_MKUP_CNTS_OFF")
    private BigDecimal cpMkupCntsOff;
    @Basic(optional = false)
    @Column(name = "DISC_TYP")
    private String discTyp;
    @Basic(optional = false)
    @Column(name = "CP_1ST_PPG_AMT")
    private BigDecimal cp1stPpgAmt;
    @Basic(optional = false)
    @Column(name = "CP_1ST_PPG_FLG")
    private Character cp1stPpgFlg;
    @Basic(optional = false)
    @Column(name = "CP_REMAIN_PPG_FLG")
    private Character cpRemainPpgFlg;
    @Basic(optional = false)
    @Column(name = "REBATED_MTHLY_AMT")
    private BigDecimal rebatedMthlyAmt;
    @Basic(optional = false)
    @Column(name = "RETAINED_CDN_AMT")
    private BigDecimal retainedCdnAmt;
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
    @Column(name = "FEE_TYP")
    private String feeTyp;

    public LocationDiscDtl() {
    }

    public LocationDiscDtl(LocationDiscDtlPK locationDiscDtlPK) {
        this.locationDiscDtlPK = locationDiscDtlPK;
    }

    public LocationDiscDtl(LocationDiscDtlPK locationDiscDtlPK, int truckCnt, Character useMarginFlg, BigDecimal scFeeAmt, BigDecimal scFeeRtlAmt, BigDecimal cpMkupCntsOff, String discTyp, BigDecimal cp1stPpgAmt, Character cp1stPpgFlg, Character cpRemainPpgFlg, BigDecimal rebatedMthlyAmt, BigDecimal retainedCdnAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String feeTyp) {
        this.locationDiscDtlPK = locationDiscDtlPK;
        this.truckCnt = truckCnt;
        this.useMarginFlg = useMarginFlg;
        this.scFeeAmt = scFeeAmt;
        this.scFeeRtlAmt = scFeeRtlAmt;
        this.cpMkupCntsOff = cpMkupCntsOff;
        this.discTyp = discTyp;
        this.cp1stPpgAmt = cp1stPpgAmt;
        this.cp1stPpgFlg = cp1stPpgFlg;
        this.cpRemainPpgFlg = cpRemainPpgFlg;
        this.rebatedMthlyAmt = rebatedMthlyAmt;
        this.retainedCdnAmt = retainedCdnAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.feeTyp = feeTyp;
    }

    public LocationDiscDtl(String locCd, String locTyp, String discId, short locSeqNbr) {
        this.locationDiscDtlPK = new LocationDiscDtlPK(locCd, locTyp, discId, locSeqNbr);
    }

    public LocationDiscDtlPK getLocationDiscDtlPK() {
        return locationDiscDtlPK;
    }

    public void setLocationDiscDtlPK(LocationDiscDtlPK locationDiscDtlPK) {
        this.locationDiscDtlPK = locationDiscDtlPK;
    }

    public int getTruckCnt() {
        return truckCnt;
    }

    public void setTruckCnt(int truckCnt) {
        this.truckCnt = truckCnt;
    }

    public Character getUseMarginFlg() {
        return useMarginFlg;
    }

    public void setUseMarginFlg(Character useMarginFlg) {
        this.useMarginFlg = useMarginFlg;
    }

    public BigDecimal getScFeeAmt() {
        return scFeeAmt;
    }

    public void setScFeeAmt(BigDecimal scFeeAmt) {
        this.scFeeAmt = scFeeAmt;
    }

    public BigDecimal getScFeeRtlAmt() {
        return scFeeRtlAmt;
    }

    public void setScFeeRtlAmt(BigDecimal scFeeRtlAmt) {
        this.scFeeRtlAmt = scFeeRtlAmt;
    }

    public BigDecimal getCpMkupCntsOff() {
        return cpMkupCntsOff;
    }

    public void setCpMkupCntsOff(BigDecimal cpMkupCntsOff) {
        this.cpMkupCntsOff = cpMkupCntsOff;
    }

    public String getDiscTyp() {
        return discTyp;
    }

    public void setDiscTyp(String discTyp) {
        this.discTyp = discTyp;
    }

    public BigDecimal getCp1stPpgAmt() {
        return cp1stPpgAmt;
    }

    public void setCp1stPpgAmt(BigDecimal cp1stPpgAmt) {
        this.cp1stPpgAmt = cp1stPpgAmt;
    }

    public Character getCp1stPpgFlg() {
        return cp1stPpgFlg;
    }

    public void setCp1stPpgFlg(Character cp1stPpgFlg) {
        this.cp1stPpgFlg = cp1stPpgFlg;
    }

    public Character getCpRemainPpgFlg() {
        return cpRemainPpgFlg;
    }

    public void setCpRemainPpgFlg(Character cpRemainPpgFlg) {
        this.cpRemainPpgFlg = cpRemainPpgFlg;
    }

    public BigDecimal getRebatedMthlyAmt() {
        return rebatedMthlyAmt;
    }

    public void setRebatedMthlyAmt(BigDecimal rebatedMthlyAmt) {
        this.rebatedMthlyAmt = rebatedMthlyAmt;
    }

    public BigDecimal getRetainedCdnAmt() {
        return retainedCdnAmt;
    }

    public void setRetainedCdnAmt(BigDecimal retainedCdnAmt) {
        this.retainedCdnAmt = retainedCdnAmt;
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

    public String getFeeTyp() {
        return feeTyp;
    }

    public void setFeeTyp(String feeTyp) {
        this.feeTyp = feeTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locationDiscDtlPK != null ? locationDiscDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocationDiscDtl)) {
            return false;
        }
        LocationDiscDtl other = (LocationDiscDtl) object;
        if ((this.locationDiscDtlPK == null && other.locationDiscDtlPK != null) || (this.locationDiscDtlPK != null && !this.locationDiscDtlPK.equals(other.locationDiscDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.LocationDiscDtl[ locationDiscDtlPK=" + locationDiscDtlPK + " ]";
    }
    
}
