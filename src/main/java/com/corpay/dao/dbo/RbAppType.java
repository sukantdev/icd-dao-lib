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
@Table(name = "RB_APP_TYPE", catalog = "", schema = "DBO")
public class RbAppType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APP_TYP_ID")
    private Long appTypId;
    @Basic(optional = false)
    @Column(name = "APP_TYP_NM")
    private String appTypNm;
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
    @Column(name = "APP_TYP_CD")
    private String appTypCd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appTypId", fetch = FetchType.LAZY)
    private Set<RbApp> rbAppSet;

    public RbAppType() {
    }

    public RbAppType(Long appTypId) {
        this.appTypId = appTypId;
    }

    public RbAppType(Long appTypId, String appTypNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String appTypCd) {
        this.appTypId = appTypId;
        this.appTypNm = appTypNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.appTypCd = appTypCd;
    }

    public Long getAppTypId() {
        return appTypId;
    }

    public void setAppTypId(Long appTypId) {
        this.appTypId = appTypId;
    }

    public String getAppTypNm() {
        return appTypNm;
    }

    public void setAppTypNm(String appTypNm) {
        this.appTypNm = appTypNm;
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

    public String getAppTypCd() {
        return appTypCd;
    }

    public void setAppTypCd(String appTypCd) {
        this.appTypCd = appTypCd;
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
        hash += (appTypId != null ? appTypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbAppType)) {
            return false;
        }
        RbAppType other = (RbAppType) object;
        if ((this.appTypId == null && other.appTypId != null) || (this.appTypId != null && !this.appTypId.equals(other.appTypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbAppType[ appTypId=" + appTypId + " ]";
    }

}
