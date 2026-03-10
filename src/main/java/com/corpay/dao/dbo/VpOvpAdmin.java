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
@Table(name = "VP_OVP_ADMIN", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpOvpAdmin.findAll", query = "SELECT v FROM VpOvpAdmin v")})
public class VpOvpAdmin implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpOvpAdminPK vpOvpAdminPK;
    @Basic(optional = false)
    @Column(name = "APPRVL_USR")
    private String apprvlUsr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "APPRVL_AMT")
    private BigDecimal apprvlAmt;
    @Basic(optional = false)
    @Column(name = "APPRVL_EMAIL_ADDR")
    private String apprvlEmailAddr;
    @Basic(optional = false)
    @Column(name = "NTF_USR")
    private String ntfUsr;
    @Basic(optional = false)
    @Column(name = "NTF_AMT")
    private BigDecimal ntfAmt;
    @Basic(optional = false)
    @Column(name = "NTF_EMAIL_ADDR")
    private String ntfEmailAddr;
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

    public VpOvpAdmin() {
    }

    public VpOvpAdmin(VpOvpAdminPK vpOvpAdminPK) {
        this.vpOvpAdminPK = vpOvpAdminPK;
    }

    public VpOvpAdmin(VpOvpAdminPK vpOvpAdminPK, String apprvlUsr, BigDecimal apprvlAmt, String apprvlEmailAddr, String ntfUsr, BigDecimal ntfAmt, String ntfEmailAddr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.vpOvpAdminPK = vpOvpAdminPK;
        this.apprvlUsr = apprvlUsr;
        this.apprvlAmt = apprvlAmt;
        this.apprvlEmailAddr = apprvlEmailAddr;
        this.ntfUsr = ntfUsr;
        this.ntfAmt = ntfAmt;
        this.ntfEmailAddr = ntfEmailAddr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public VpOvpAdmin(String acctNbr, String custId) {
        this.vpOvpAdminPK = new VpOvpAdminPK(acctNbr, custId);
    }

    public VpOvpAdminPK getVpOvpAdminPK() {
        return vpOvpAdminPK;
    }

    public void setVpOvpAdminPK(VpOvpAdminPK vpOvpAdminPK) {
        this.vpOvpAdminPK = vpOvpAdminPK;
    }

    public String getApprvlUsr() {
        return apprvlUsr;
    }

    public void setApprvlUsr(String apprvlUsr) {
        this.apprvlUsr = apprvlUsr;
    }

    public BigDecimal getApprvlAmt() {
        return apprvlAmt;
    }

    public void setApprvlAmt(BigDecimal apprvlAmt) {
        this.apprvlAmt = apprvlAmt;
    }

    public String getApprvlEmailAddr() {
        return apprvlEmailAddr;
    }

    public void setApprvlEmailAddr(String apprvlEmailAddr) {
        this.apprvlEmailAddr = apprvlEmailAddr;
    }

    public String getNtfUsr() {
        return ntfUsr;
    }

    public void setNtfUsr(String ntfUsr) {
        this.ntfUsr = ntfUsr;
    }

    public BigDecimal getNtfAmt() {
        return ntfAmt;
    }

    public void setNtfAmt(BigDecimal ntfAmt) {
        this.ntfAmt = ntfAmt;
    }

    public String getNtfEmailAddr() {
        return ntfEmailAddr;
    }

    public void setNtfEmailAddr(String ntfEmailAddr) {
        this.ntfEmailAddr = ntfEmailAddr;
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
        hash += (vpOvpAdminPK != null ? vpOvpAdminPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpOvpAdmin)) {
            return false;
        }
        VpOvpAdmin other = (VpOvpAdmin) object;
        if ((this.vpOvpAdminPK == null && other.vpOvpAdminPK != null) || (this.vpOvpAdminPK != null && !this.vpOvpAdminPK.equals(other.vpOvpAdminPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpOvpAdmin[ vpOvpAdminPK=" + vpOvpAdminPK + " ]";
    }
    
}
