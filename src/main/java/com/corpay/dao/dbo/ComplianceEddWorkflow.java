package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "COMPLIANCE_EDD_WORKFLOW", catalog = "", schema = "DBO")
public class ComplianceEddWorkflow implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ASSIGNED_DT")
    @Temporal(TemporalType.DATE)
    private Date assignedDt;
    @Basic(optional = false)
    @Column(name = "ASSIGNED_TM")
    @Temporal(TemporalType.TIME)
    private Date assignedTm;
    @Basic(optional = false)
    @Column(name = "RESOLVED_DT")
    @Temporal(TemporalType.DATE)
    private Date resolvedDt;
    @Basic(optional = false)
    @Column(name = "RESOLVED_TM")
    @Temporal(TemporalType.TIME)
    private Date resolvedTm;
    @Basic(optional = false)
    @Column(name = "PRODUCT_TYPE")
    private String productType;
    @Basic(optional = false)
    @Column(name = "WRKFLOW_STATUS_FLG")
    private Character wrkflowStatusFlg;
    @Basic(optional = false)
    @Column(name = "EDD_USERID")
    private String eddUserid;
    @Id
    @Basic(optional = false)
    @Column(name = "CCH_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cchTs;
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
    @Column(name = "APPLICANT_USERID")
    private String applicantUserid;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;

    public ComplianceEddWorkflow() {
    }

    public ComplianceEddWorkflow(Date cchTs) {
        this.cchTs = cchTs;
    }

    public ComplianceEddWorkflow(Date cchTs, Date assignedDt, Date assignedTm, Date resolvedDt, Date resolvedTm, String productType, Character wrkflowStatusFlg, String eddUserid, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String applicantUserid, String crdNbr) {
        this.cchTs = cchTs;
        this.assignedDt = assignedDt;
        this.assignedTm = assignedTm;
        this.resolvedDt = resolvedDt;
        this.resolvedTm = resolvedTm;
        this.productType = productType;
        this.wrkflowStatusFlg = wrkflowStatusFlg;
        this.eddUserid = eddUserid;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.applicantUserid = applicantUserid;
        this.crdNbr = crdNbr;
    }

    public Date getAssignedDt() {
        return assignedDt;
    }

    public void setAssignedDt(Date assignedDt) {
        this.assignedDt = assignedDt;
    }

    public Date getAssignedTm() {
        return assignedTm;
    }

    public void setAssignedTm(Date assignedTm) {
        this.assignedTm = assignedTm;
    }

    public Date getResolvedDt() {
        return resolvedDt;
    }

    public void setResolvedDt(Date resolvedDt) {
        this.resolvedDt = resolvedDt;
    }

    public Date getResolvedTm() {
        return resolvedTm;
    }

    public void setResolvedTm(Date resolvedTm) {
        this.resolvedTm = resolvedTm;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Character getWrkflowStatusFlg() {
        return wrkflowStatusFlg;
    }

    public void setWrkflowStatusFlg(Character wrkflowStatusFlg) {
        this.wrkflowStatusFlg = wrkflowStatusFlg;
    }

    public String getEddUserid() {
        return eddUserid;
    }

    public void setEddUserid(String eddUserid) {
        this.eddUserid = eddUserid;
    }

    public Date getCchTs() {
        return cchTs;
    }

    public void setCchTs(Date cchTs) {
        this.cchTs = cchTs;
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

    public String getApplicantUserid() {
        return applicantUserid;
    }

    public void setApplicantUserid(String applicantUserid) {
        this.applicantUserid = applicantUserid;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cchTs != null ? cchTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ComplianceEddWorkflow)) {
            return false;
        }
        ComplianceEddWorkflow other = (ComplianceEddWorkflow) object;
        if ((this.cchTs == null && other.cchTs != null) || (this.cchTs != null && !this.cchTs.equals(other.cchTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ComplianceEddWorkflow[ cchTs=" + cchTs + " ]";
    }

}
