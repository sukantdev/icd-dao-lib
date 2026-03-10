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
@Table(name = "PERMIT_SETTLEMENT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PermitSettlement.findAll", query = "SELECT p FROM PermitSettlement p")})
public class PermitSettlement implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PermitSettlementPK permitSettlementPK;
    @Basic(optional = false)
    @Column(name = "PERMIT_CRD_NBR")
    private String permitCrdNbr;
    @Basic(optional = false)
    @Column(name = "PERMIT_NBR")
    private String permitNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PERMIT_TRNS_AMT")
    private BigDecimal permitTrnsAmt;
    @Basic(optional = false)
    @Column(name = "PERMIT_TYP")
    private String permitTyp;
    @Basic(optional = false)
    @Column(name = "PERMIT_LICENSE_NBR")
    private String permitLicenseNbr;
    @Basic(optional = false)
    @Column(name = "PERMIT_TRANS_FEE_AMT")
    private BigDecimal permitTransFeeAmt;
    @Basic(optional = false)
    @Column(name = "PERMIT_LOC_CD")
    private String permitLocCd;
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

    public PermitSettlement() {
    }

    public PermitSettlement(PermitSettlementPK permitSettlementPK) {
        this.permitSettlementPK = permitSettlementPK;
    }

    public PermitSettlement(PermitSettlementPK permitSettlementPK, String permitCrdNbr, String permitNbr, BigDecimal permitTrnsAmt, String permitTyp, String permitLicenseNbr, BigDecimal permitTransFeeAmt, String permitLocCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.permitSettlementPK = permitSettlementPK;
        this.permitCrdNbr = permitCrdNbr;
        this.permitNbr = permitNbr;
        this.permitTrnsAmt = permitTrnsAmt;
        this.permitTyp = permitTyp;
        this.permitLicenseNbr = permitLicenseNbr;
        this.permitTransFeeAmt = permitTransFeeAmt;
        this.permitLocCd = permitLocCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PermitSettlement(int permitCtlNbr, Date permitPstdDt) {
        this.permitSettlementPK = new PermitSettlementPK(permitCtlNbr, permitPstdDt);
    }

    public PermitSettlementPK getPermitSettlementPK() {
        return permitSettlementPK;
    }

    public void setPermitSettlementPK(PermitSettlementPK permitSettlementPK) {
        this.permitSettlementPK = permitSettlementPK;
    }

    public String getPermitCrdNbr() {
        return permitCrdNbr;
    }

    public void setPermitCrdNbr(String permitCrdNbr) {
        this.permitCrdNbr = permitCrdNbr;
    }

    public String getPermitNbr() {
        return permitNbr;
    }

    public void setPermitNbr(String permitNbr) {
        this.permitNbr = permitNbr;
    }

    public BigDecimal getPermitTrnsAmt() {
        return permitTrnsAmt;
    }

    public void setPermitTrnsAmt(BigDecimal permitTrnsAmt) {
        this.permitTrnsAmt = permitTrnsAmt;
    }

    public String getPermitTyp() {
        return permitTyp;
    }

    public void setPermitTyp(String permitTyp) {
        this.permitTyp = permitTyp;
    }

    public String getPermitLicenseNbr() {
        return permitLicenseNbr;
    }

    public void setPermitLicenseNbr(String permitLicenseNbr) {
        this.permitLicenseNbr = permitLicenseNbr;
    }

    public BigDecimal getPermitTransFeeAmt() {
        return permitTransFeeAmt;
    }

    public void setPermitTransFeeAmt(BigDecimal permitTransFeeAmt) {
        this.permitTransFeeAmt = permitTransFeeAmt;
    }

    public String getPermitLocCd() {
        return permitLocCd;
    }

    public void setPermitLocCd(String permitLocCd) {
        this.permitLocCd = permitLocCd;
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
        hash += (permitSettlementPK != null ? permitSettlementPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermitSettlement)) {
            return false;
        }
        PermitSettlement other = (PermitSettlement) object;
        if ((this.permitSettlementPK == null && other.permitSettlementPK != null) || (this.permitSettlementPK != null && !this.permitSettlementPK.equals(other.permitSettlementPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PermitSettlement[ permitSettlementPK=" + permitSettlementPK + " ]";
    }
    
}
