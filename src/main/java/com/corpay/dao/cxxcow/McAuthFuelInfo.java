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
@Table(name = "MC_AUTH_FUEL_INFO", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McAuthFuelInfo.findAll", query = "SELECT m FROM McAuthFuelInfo m"),
    @NamedQuery(name = "McAuthFuelInfo.findByAuthPan", query = "SELECT m FROM McAuthFuelInfo m WHERE m.mcAuthFuelInfoPK.authPan = :authPan"),
    @NamedQuery(name = "McAuthFuelInfo.findByAuthUtDt", query = "SELECT m FROM McAuthFuelInfo m WHERE m.mcAuthFuelInfoPK.authUtDt = :authUtDt"),
    @NamedQuery(name = "McAuthFuelInfo.findByAuthApprovCd", query = "SELECT m FROM McAuthFuelInfo m WHERE m.mcAuthFuelInfoPK.authApprovCd = :authApprovCd"),
    @NamedQuery(name = "McAuthFuelInfo.findByAuthLocalTs", query = "SELECT m FROM McAuthFuelInfo m WHERE m.mcAuthFuelInfoPK.authLocalTs = :authLocalTs"),
    @NamedQuery(name = "McAuthFuelInfo.findByPrdSeqNo", query = "SELECT m FROM McAuthFuelInfo m WHERE m.mcAuthFuelInfoPK.prdSeqNo = :prdSeqNo"),
    @NamedQuery(name = "McAuthFuelInfo.findByPrdCd", query = "SELECT m FROM McAuthFuelInfo m WHERE m.prdCd = :prdCd"),
    @NamedQuery(name = "McAuthFuelInfo.findByUnitPrc", query = "SELECT m FROM McAuthFuelInfo m WHERE m.unitPrc = :unitPrc"),
    @NamedQuery(name = "McAuthFuelInfo.findByUnitOfMsr", query = "SELECT m FROM McAuthFuelInfo m WHERE m.unitOfMsr = :unitOfMsr"),
    @NamedQuery(name = "McAuthFuelInfo.findByPrdQty", query = "SELECT m FROM McAuthFuelInfo m WHERE m.prdQty = :prdQty"),
    @NamedQuery(name = "McAuthFuelInfo.findByPrdAmt", query = "SELECT m FROM McAuthFuelInfo m WHERE m.prdAmt = :prdAmt"),
    @NamedQuery(name = "McAuthFuelInfo.findByCrtTs", query = "SELECT m FROM McAuthFuelInfo m WHERE m.crtTs = :crtTs"),
    @NamedQuery(name = "McAuthFuelInfo.findByCrtUsr", query = "SELECT m FROM McAuthFuelInfo m WHERE m.crtUsr = :crtUsr"),
    @NamedQuery(name = "McAuthFuelInfo.findByMdyTs", query = "SELECT m FROM McAuthFuelInfo m WHERE m.mdyTs = :mdyTs"),
    @NamedQuery(name = "McAuthFuelInfo.findByMdyUsr", query = "SELECT m FROM McAuthFuelInfo m WHERE m.mdyUsr = :mdyUsr")})
public class McAuthFuelInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAuthFuelInfoPK mcAuthFuelInfoPK;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
