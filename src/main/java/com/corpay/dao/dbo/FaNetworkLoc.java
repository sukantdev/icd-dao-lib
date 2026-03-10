/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "FA_NETWORK_LOC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FaNetworkLoc.findAll", query = "SELECT f FROM FaNetworkLoc f")})
public class FaNetworkLoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FaNetworkLocPK faNetworkLocPK;
    @Basic(optional = false)
    @Column(name = "LOC_TYPE_CD")
    private String locTypeCd;
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
    @JoinColumn(name = "NETWORK_ID", referencedColumnName = "NETWORK_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FaNetwork faNetwork;

    public FaNetworkLoc() {
    }

    public FaNetworkLoc(FaNetworkLocPK faNetworkLocPK) {
        this.faNetworkLocPK = faNetworkLocPK;
    }

    public FaNetworkLoc(FaNetworkLocPK faNetworkLocPK, String locTypeCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.faNetworkLocPK = faNetworkLocPK;
        this.locTypeCd = locTypeCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FaNetworkLoc(long networkId, String locId) {
        this.faNetworkLocPK = new FaNetworkLocPK(networkId, locId);
    }

    public FaNetworkLocPK getFaNetworkLocPK() {
        return faNetworkLocPK;
    }

    public void setFaNetworkLocPK(FaNetworkLocPK faNetworkLocPK) {
        this.faNetworkLocPK = faNetworkLocPK;
    }

    public String getLocTypeCd() {
        return locTypeCd;
    }

    public void setLocTypeCd(String locTypeCd) {
        this.locTypeCd = locTypeCd;
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

    public FaNetwork getFaNetwork() {
        return faNetwork;
    }

    public void setFaNetwork(FaNetwork faNetwork) {
        this.faNetwork = faNetwork;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (faNetworkLocPK != null ? faNetworkLocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaNetworkLoc)) {
            return false;
        }
        FaNetworkLoc other = (FaNetworkLoc) object;
        if ((this.faNetworkLocPK == null && other.faNetworkLocPK != null) || (this.faNetworkLocPK != null && !this.faNetworkLocPK.equals(other.faNetworkLocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaNetworkLoc[ faNetworkLocPK=" + faNetworkLocPK + " ]";
    }
    
}
