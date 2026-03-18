package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "RB_APP_GRP", catalog = "", schema = "DBO")
public class RbAppGrp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APP_GRP_ID")
    private Long appGrpId;
    @Basic(optional = false)
    @Column(name = "APP_GRP_NM")
    private String appGrpNm;
    @Basic(optional = false)
    @Column(name = "COMM")
    private String comm;
    @Basic(optional = false)
    @Column(name = "OWNR")
    private String ownr;
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
    @Column(name = "APP_GRP_CD")
    private String appGrpCd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appGrpId", fetch = FetchType.LAZY)
    private Set<RbApp> rbAppSet;

    public RbAppGrp() {
    }

    public RbAppGrp(Long appGrpId) {
        this.appGrpId = appGrpId;
    }

    public RbAppGrp(Long appGrpId, String appGrpNm, String comm, String ownr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String appGrpCd) {
        this.appGrpId = appGrpId;
        this.appGrpNm = appGrpNm;
        this.comm = comm;
        this.ownr = ownr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.appGrpCd = appGrpCd;
    }

    public Long getAppGrpId() {
        return appGrpId;
    }

    public void setAppGrpId(Long appGrpId) {
        this.appGrpId = appGrpId;
    }

    public String getAppGrpNm() {
        return appGrpNm;
    }

    public void setAppGrpNm(String appGrpNm) {
        this.appGrpNm = appGrpNm;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public String getOwnr() {
        return ownr;
    }

    public void setOwnr(String ownr) {
        this.ownr = ownr;
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

    public String getAppGrpCd() {
        return appGrpCd;
    }

    public void setAppGrpCd(String appGrpCd) {
        this.appGrpCd = appGrpCd;
    }

    public Set<RbApp> getRbAppSet() {
        return rbAppSet;
    }

    public void setRbAppSet(Set<RbApp> rbAppSet) {
        this.rbAppSet = rbAppSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appGrpId != null ? appGrpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbAppGrp)) {
            return false;
        }
        RbAppGrp other = (RbAppGrp) object;
        if ((this.appGrpId == null && other.appGrpId != null) || (this.appGrpId != null && !this.appGrpId.equals(other.appGrpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbAppGrp[ appGrpId=" + appGrpId + " ]";
    }

}
