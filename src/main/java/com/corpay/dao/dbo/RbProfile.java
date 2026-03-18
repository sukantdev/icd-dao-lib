package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "RB_PROFILE", catalog = "", schema = "DBO")
public class RbProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROF_ID")
    private Long profId;
    @Basic(optional = false)
    @Column(name = "PROF_NM")
    private String profNm;
    @Basic(optional = false)
    @Column(name = "COMM")
    private String comm;
    @Basic(optional = false)
    @Column(name = "ORG_LVL_VAL")
    private String orgLvlVal;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profId", fetch = FetchType.LAZY)
    private Set<RbProfileRole> rbProfileRoleSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profId", fetch = FetchType.LAZY)
    private Set<RbUserProfile> rbUserProfileSet;

    public RbProfile() {
    }

    public RbProfile(Long profId) {
        this.profId = profId;
    }

    public RbProfile(Long profId, String profNm, String comm, String orgLvlVal, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.profId = profId;
        this.profNm = profNm;
        this.comm = comm;
        this.orgLvlVal = orgLvlVal;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getProfId() {
        return profId;
    }

    public void setProfId(Long profId) {
        this.profId = profId;
    }

    public String getProfNm() {
        return profNm;
    }

    public void setProfNm(String profNm) {
        this.profNm = profNm;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public String getOrgLvlVal() {
        return orgLvlVal;
    }

    public void setOrgLvlVal(String orgLvlVal) {
        this.orgLvlVal = orgLvlVal;
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

    public Set<RbProfileRole> getRbProfileRoleSet() {
        return rbProfileRoleSet;
    }

    public void setRbProfileRoleSet(Set<RbProfileRole> rbProfileRoleSet) {
        this.rbProfileRoleSet = rbProfileRoleSet;
    }

    public Set<RbUserProfile> getRbUserProfileSet() {
        return rbUserProfileSet;
    }

    public void setRbUserProfileSet(Set<RbUserProfile> rbUserProfileSet) {
        this.rbUserProfileSet = rbUserProfileSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profId != null ? profId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbProfile)) {
            return false;
        }
        RbProfile other = (RbProfile) object;
        if ((this.profId == null && other.profId != null) || (this.profId != null && !this.profId.equals(other.profId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbProfile[ profId=" + profId + " ]";
    }

}
