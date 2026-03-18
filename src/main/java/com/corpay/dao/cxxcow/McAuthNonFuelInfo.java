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
@Table(name = "MC_AUTH_NON_FUEL_INFO", catalog = "", schema = "CXXCOW")
public class McAuthNonFuelInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAuthNonFuelInfoPK mcAuthNonFuelInfoPK;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;

    @Basic(optional = false)
    @Column(name = "PRD_QTY")
    private BigDecimal prdQty;
    @Basic(optional = false)
    @Column(name = "UNIT_OF_MSR")
    private String unitOfMsr;
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

    public McAuthNonFuelInfo() {
    }

    public McAuthNonFuelInfo(McAuthNonFuelInfoPK mcAuthNonFuelInfoPK) {
        this.mcAuthNonFuelInfoPK = mcAuthNonFuelInfoPK;
    }

    public McAuthNonFuelInfo(McAuthNonFuelInfoPK mcAuthNonFuelInfoPK, String prdCd, BigDecimal prdQty, String unitOfMsr, BigDecimal prdAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mcAuthNonFuelInfoPK = mcAuthNonFuelInfoPK;
        this.prdCd = prdCd;
        this.prdQty = prdQty;
        this.unitOfMsr = unitOfMsr;
        this.prdAmt = prdAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public McAuthNonFuelInfo(String authPan, Date authUtDt, int authApprovCd, Date authLocalTs, short prdSeqNo) {
        this.mcAuthNonFuelInfoPK = new McAuthNonFuelInfoPK(authPan, authUtDt, authApprovCd, authLocalTs, prdSeqNo);
    }

    public McAuthNonFuelInfoPK getMcAuthNonFuelInfoPK() {
        return mcAuthNonFuelInfoPK;
    }

    public void setMcAuthNonFuelInfoPK(McAuthNonFuelInfoPK mcAuthNonFuelInfoPK) {
        this.mcAuthNonFuelInfoPK = mcAuthNonFuelInfoPK;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public BigDecimal getPrdQty() {
        return prdQty;
    }

    public void setPrdQty(BigDecimal prdQty) {
        this.prdQty = prdQty;
    }

    public String getUnitOfMsr() {
        return unitOfMsr;
    }

    public void setUnitOfMsr(String unitOfMsr) {
        this.unitOfMsr = unitOfMsr;
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
        hash += (mcAuthNonFuelInfoPK != null ? mcAuthNonFuelInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAuthNonFuelInfo)) {
            return false;
        }
        McAuthNonFuelInfo other = (McAuthNonFuelInfo) object;
        if ((this.mcAuthNonFuelInfoPK == null && other.mcAuthNonFuelInfoPK != null) || (this.mcAuthNonFuelInfoPK != null && !this.mcAuthNonFuelInfoPK.equals(other.mcAuthNonFuelInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAuthNonFuelInfo[ mcAuthNonFuelInfoPK=" + mcAuthNonFuelInfoPK + " ]";
    }

}
