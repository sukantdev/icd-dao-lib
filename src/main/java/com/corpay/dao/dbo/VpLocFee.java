package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "VP_LOC_FEE", catalog = "", schema = "DBO")
public class VpLocFee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SRV_CENTER_CD")
    private String srvCenterCd;

    @Basic(optional = false)
    @Column(name = "FEE_VAL")
    private BigDecimal feeVal;
    @Basic(optional = false)
    @Column(name = "FEE_TYP")
    private Character feeTyp;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public VpLocFee() {
    }

    public VpLocFee(String srvCenterCd) {
        this.srvCenterCd = srvCenterCd;
    }

    public VpLocFee(String srvCenterCd, BigDecimal feeVal, Character feeTyp, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.srvCenterCd = srvCenterCd;
        this.feeVal = feeVal;
        this.feeTyp = feeTyp;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public String getSrvCenterCd() {
        return srvCenterCd;
    }

    public void setSrvCenterCd(String srvCenterCd) {
        this.srvCenterCd = srvCenterCd;
    }

    public BigDecimal getFeeVal() {
        return feeVal;
    }

    public void setFeeVal(BigDecimal feeVal) {
        this.feeVal = feeVal;
    }

    public Character getFeeTyp() {
        return feeTyp;
    }

    public void setFeeTyp(Character feeTyp) {
        this.feeTyp = feeTyp;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srvCenterCd != null ? srvCenterCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpLocFee)) {
            return false;
        }
        VpLocFee other = (VpLocFee) object;
        if ((this.srvCenterCd == null && other.srvCenterCd != null) || (this.srvCenterCd != null && !this.srvCenterCd.equals(other.srvCenterCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpLocFee[ srvCenterCd=" + srvCenterCd + " ]";
    }

}
