/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "FA_NETWORK", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FaNetwork.findAll", query = "SELECT f FROM FaNetwork f")})
public class FaNetwork implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NETWORK_ID")
    private Long networkId;
    @Basic(optional = false)
    @Column(name = "NETWORK_NM")
    private String networkNm;
    @Basic(optional = false)
    @Column(name = "FUEL_TYP_CD")
    private String fuelTypCd;
    @Basic(optional = false)
    @Column(name = "ORG_LVL_VAL_ID")
    private String orgLvlValId;
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
    @JoinColumn(name = "ORG_LVL_TYP_ID", referencedColumnName = "ORG_LVL_TYP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbOrgLvlTyp orgLvlTypId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "faNetwork", fetch = FetchType.LAZY)
    private Set<FaNetworkLoc> faNetworkLocSet;

    public FaNetwork() {
    }

    public FaNetwork(Long networkId) {
        this.networkId = networkId;
    }

    public FaNetwork(Long networkId, String networkNm, String fuelTypCd, String orgLvlValId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.networkId = networkId;
        this.networkNm = networkNm;
        this.fuelTypCd = fuelTypCd;
        this.orgLvlValId = orgLvlValId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getNetworkId() {
        return networkId;
    }

    public void setNetworkId(Long networkId) {
        this.networkId = networkId;
    }

    public String getNetworkNm() {
        return networkNm;
    }

    public void setNetworkNm(String networkNm) {
        this.networkNm = networkNm;
    }

    public String getFuelTypCd() {
        return fuelTypCd;
    }

    public void setFuelTypCd(String fuelTypCd) {
        this.fuelTypCd = fuelTypCd;
    }

    public String getOrgLvlValId() {
        return orgLvlValId;
    }

    public void setOrgLvlValId(String orgLvlValId) {
        this.orgLvlValId = orgLvlValId;
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

    public RbOrgLvlTyp getOrgLvlTypId() {
        return orgLvlTypId;
    }

    public void setOrgLvlTypId(RbOrgLvlTyp orgLvlTypId) {
        this.orgLvlTypId = orgLvlTypId;
    }

    public Set<FaNetworkLoc> getFaNetworkLocSet() {
        return faNetworkLocSet;
    }

    public void setFaNetworkLocSet(Set<FaNetworkLoc> faNetworkLocSet) {
        this.faNetworkLocSet = faNetworkLocSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (networkId != null ? networkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaNetwork)) {
            return false;
        }
        FaNetwork other = (FaNetwork) object;
        if ((this.networkId == null && other.networkId != null) || (this.networkId != null && !this.networkId.equals(other.networkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaNetwork[ networkId=" + networkId + " ]";
    }
    
}
