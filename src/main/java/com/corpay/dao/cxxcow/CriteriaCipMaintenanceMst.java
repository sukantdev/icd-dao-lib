package com.corpay.dao.cxxcow;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "CRITERIA_CIP_MAINTENANCE_MST", catalog = "", schema = "CXXCOW")
public class CriteriaCipMaintenanceMst implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRITERIA_ID")
    private Integer criteriaId;
    @Basic(optional = false)
    @Column(name = "CRITERIA_NAME")
    private String criteriaName;
    @Column(name = "CRITERIA_DESC")
    private String criteriaDesc;
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

    public CriteriaCipMaintenanceMst() {
    }

    public CriteriaCipMaintenanceMst(Integer criteriaId) {
        this.criteriaId = criteriaId;
    }

    public CriteriaCipMaintenanceMst(Integer criteriaId, String criteriaName, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.criteriaId = criteriaId;
        this.criteriaName = criteriaName;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getCriteriaId() {
        return criteriaId;
    }

    public void setCriteriaId(Integer criteriaId) {
        this.criteriaId = criteriaId;
    }

    public String getCriteriaName() {
        return criteriaName;
    }

    public void setCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
    }

    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
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
        hash += (criteriaId != null ? criteriaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CriteriaCipMaintenanceMst)) {
            return false;
        }
        CriteriaCipMaintenanceMst other = (CriteriaCipMaintenanceMst) object;
        if ((this.criteriaId == null && other.criteriaId != null) || (this.criteriaId != null && !this.criteriaId.equals(other.criteriaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.CriteriaCipMaintenanceMst[ criteriaId=" + criteriaId + " ]";
    }

}
