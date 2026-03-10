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
@Table(name = "RB_ORG_LVL_TYP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RbOrgLvlTyp.findAll", query = "SELECT r FROM RbOrgLvlTyp r")})
public class RbOrgLvlTyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORG_LVL_TYP_ID")
    private Long orgLvlTypId;
    @Basic(optional = false)
    @Column(name = "ORG_LVL_TYP_NM")
    private String orgLvlTypNm;
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
    @Column(name = "ORG_LVL_TYP_CD")
    private String orgLvlTypCd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orgLvlTypId", fetch = FetchType.LAZY)
    private Set<FaNetwork> faNetworkSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orgLvlTypId", fetch = FetchType.LAZY)
    private Set<RbProfile> rbProfileSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orgLvlTypId", fetch = FetchType.LAZY)
    private Set<RbSubscription> rbSubscriptionSet;

    public RbOrgLvlTyp() {
    }

    public RbOrgLvlTyp(Long orgLvlTypId) {
        this.orgLvlTypId = orgLvlTypId;
    }

    public RbOrgLvlTyp(Long orgLvlTypId, String orgLvlTypNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String orgLvlTypCd) {
        this.orgLvlTypId = orgLvlTypId;
        this.orgLvlTypNm = orgLvlTypNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.orgLvlTypCd = orgLvlTypCd;
    }

    public Long getOrgLvlTypId() {
        return orgLvlTypId;
    }

    public void setOrgLvlTypId(Long orgLvlTypId) {
        this.orgLvlTypId = orgLvlTypId;
    }

    public String getOrgLvlTypNm() {
        return orgLvlTypNm;
    }

    public void setOrgLvlTypNm(String orgLvlTypNm) {
        this.orgLvlTypNm = orgLvlTypNm;
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

    public String getOrgLvlTypCd() {
        return orgLvlTypCd;
    }

    public void setOrgLvlTypCd(String orgLvlTypCd) {
        this.orgLvlTypCd = orgLvlTypCd;
    }

    public Set<FaNetwork> getFaNetworkSet() {
        return faNetworkSet;
    }

    public void setFaNetworkSet(Set<FaNetwork> faNetworkSet) {
        this.faNetworkSet = faNetworkSet;
    }

    public Set<RbProfile> getRbProfileSet() {
        return rbProfileSet;
    }

    public void setRbProfileSet(Set<RbProfile> rbProfileSet) {
        this.rbProfileSet = rbProfileSet;
    }

    public Set<RbSubscription> getRbSubscriptionSet() {
        return rbSubscriptionSet;
    }

    public void setRbSubscriptionSet(Set<RbSubscription> rbSubscriptionSet) {
        this.rbSubscriptionSet = rbSubscriptionSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orgLvlTypId != null ? orgLvlTypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RbOrgLvlTyp)) {
            return false;
        }
        RbOrgLvlTyp other = (RbOrgLvlTyp) object;
        if ((this.orgLvlTypId == null && other.orgLvlTypId != null) || (this.orgLvlTypId != null && !this.orgLvlTypId.equals(other.orgLvlTypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbOrgLvlTyp[ orgLvlTypId=" + orgLvlTypId + " ]";
    }
    
}
