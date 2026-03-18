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
@Table(name = "MC_AUTH_FUEL_INFO", catalog = "", schema = "CXXCOW")
public class McAuthFuelInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAuthFuelInfoPK mcAuthFuelInfoPK;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;

    @Basic(optional = false)
    @Column(name = "UNIT_PRC")
    private BigDecimal unitPrc;
    @Basic(optional = false)
    @Column(name = "UNIT_OF_MSR")
    private Character unitOfMsr;
    @Basic(optional = false)
    @Column(name = "PRD_QTY")
    private BigDecimal prdQty;
    @Basic(optional = false)
    @Column(name = "PRD_AMT")
    private BigDecimal prdAmt;
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

    public McAuthFuelInfo() {
    }

    public McAuthFuelInfo(McAuthFuelInfoPK mcAuthFuelInfoPK) {
        this.mcAuthFuelInfoPK = mcAuthFuelInfoPK;
    }

    public McAuthFuelInfo(McAuthFuelInfoPK mcAuthFuelInfoPK, String prdCd, BigDecimal unitPrc, Character unitOfMsr, BigDecimal prdQty, BigDecimal prdAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mcAuthFuelInfoPK = mcAuthFuelInfoPK;
        this.prdCd = prdCd;
        this.unitPrc = unitPrc;
        this.unitOfMsr = unitOfMsr;
        this.prdQty = prdQty;
        this.prdAmt = prdAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public McAuthFuelInfo(String authPan, Date authUtDt, int authApprovCd, Date authLocalTs, short prdSeqNo) {
        this.mcAuthFuelInfoPK = new McAuthFuelInfoPK(authPan, authUtDt, authApprovCd, authLocalTs, prdSeqNo);
    }

    public McAuthFuelInfoPK getMcAuthFuelInfoPK() {
        return mcAuthFuelInfoPK;
    }

    public void setMcAuthFuelInfoPK(McAuthFuelInfoPK mcAuthFuelInfoPK) {
        this.mcAuthFuelInfoPK = mcAuthFuelInfoPK;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public BigDecimal getUnitPrc() {
        return unitPrc;
    }

    public void setUnitPrc(BigDecimal unitPrc) {
        this.unitPrc = unitPrc;
    }

    public Character getUnitOfMsr() {
        return unitOfMsr;
    }

    public void setUnitOfMsr(Character unitOfMsr) {
        this.unitOfMsr = unitOfMsr;
    }

    public BigDecimal getPrdQty() {
        return prdQty;
    }

    public void setPrdQty(BigDecimal prdQty) {
        this.prdQty = prdQty;
    }

    public BigDecimal getPrdAmt() {
        return prdAmt;
    }

    public void setPrdAmt(BigDecimal prdAmt) {
        this.prdAmt = prdAmt;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAuthFuelInfoPK != null ? mcAuthFuelInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAuthFuelInfo)) {
            return false;
        }
        McAuthFuelInfo other = (McAuthFuelInfo) object;
        if ((this.mcAuthFuelInfoPK == null && other.mcAuthFuelInfoPK != null) || (this.mcAuthFuelInfoPK != null && !this.mcAuthFuelInfoPK.equals(other.mcAuthFuelInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAuthFuelInfo[ mcAuthFuelInfoPK=" + mcAuthFuelInfoPK + " ]";
    }

}
