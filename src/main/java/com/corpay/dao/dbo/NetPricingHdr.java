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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "NET_PRICING_HDR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "NetPricingHdr.findAll", query = "SELECT n FROM NetPricingHdr n")})
public class NetPricingHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NetPricingHdrPK netPricingHdrPK;
    @Basic(optional = false)
    @Column(name = "PROC_CD")
    private Character procCd;
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
    @Column(name = "MDY_USER")
    private String mdyUser;
    @Basic(optional = false)
    @Column(name = "EXP_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expTs;

    public NetPricingHdr() {
    }

    public NetPricingHdr(NetPricingHdrPK netPricingHdrPK) {
        this.netPricingHdrPK = netPricingHdrPK;
    }

    public NetPricingHdr(NetPricingHdrPK netPricingHdrPK, Character procCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUser, Date expTs) {
        this.netPricingHdrPK = netPricingHdrPK;
        this.procCd = procCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUser = mdyUser;
        this.expTs = expTs;
    }

    public NetPricingHdr(String pfidCd, Date effctvDtTs) {
        this.netPricingHdrPK = new NetPricingHdrPK(pfidCd, effctvDtTs);
    }

    public NetPricingHdrPK getNetPricingHdrPK() {
        return netPricingHdrPK;
    }

    public void setNetPricingHdrPK(NetPricingHdrPK netPricingHdrPK) {
        this.netPricingHdrPK = netPricingHdrPK;
    }

    public Character getProcCd() {
        return procCd;
    }

    public void setProcCd(Character procCd) {
        this.procCd = procCd;
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

    public String getMdyUser() {
        return mdyUser;
    }

    public void setMdyUser(String mdyUser) {
        this.mdyUser = mdyUser;
    }

    public Date getExpTs() {
        return expTs;
    }

    public void setExpTs(Date expTs) {
        this.expTs = expTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (netPricingHdrPK != null ? netPricingHdrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NetPricingHdr)) {
            return false;
        }
        NetPricingHdr other = (NetPricingHdr) object;
        if ((this.netPricingHdrPK == null && other.netPricingHdrPK != null) || (this.netPricingHdrPK != null && !this.netPricingHdrPK.equals(other.netPricingHdrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NetPricingHdr[ netPricingHdrPK=" + netPricingHdrPK + " ]";
    }
    
}
