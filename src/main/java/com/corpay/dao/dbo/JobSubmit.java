package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "JOB_SUBMIT", catalog = "", schema = "DBO")
public class JobSubmit implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected JobSubmitPK jobSubmitPK;
    @Basic(optional = false)
    @Column(name = "JOB_DESC")
    private String jobDesc;
    @Basic(optional = false)
    @Column(name = "JOB_STATUS")
    private Character jobStatus;
    @Basic(optional = false)
    @Column(name = "TOTAL_RECS")
    private long totalRecs;
    @Basic(optional = false)
    @Column(name = "CUR_RECS")
    private long curRecs;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "RESPONSE_URL")
    private String responseUrl;
    @Basic(optional = false)
    @Column(name = "REQ_FILE")
    private String reqFile;
    @Basic(optional = false)
    @Column(name = "ACTIVE")
    private Character active;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public JobSubmit() {
    }

    public JobSubmit(JobSubmitPK jobSubmitPK) {
        this.jobSubmitPK = jobSubmitPK;
    }

    public JobSubmit(JobSubmitPK jobSubmitPK, String jobDesc, Character jobStatus, long totalRecs, long curRecs, String custId, String responseUrl, String reqFile, Character active, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.jobSubmitPK = jobSubmitPK;
        this.jobDesc = jobDesc;
        this.jobStatus = jobStatus;
        this.totalRecs = totalRecs;
        this.curRecs = curRecs;
        this.custId = custId;
        this.responseUrl = responseUrl;
        this.reqFile = reqFile;
        this.active = active;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public JobSubmit(String jobType, Date submitTs, String submitUsr) {
        this.jobSubmitPK = new JobSubmitPK(jobType, submitTs, submitUsr);
    }

    public JobSubmitPK getJobSubmitPK() {
        return jobSubmitPK;
    }

    public void setJobSubmitPK(JobSubmitPK jobSubmitPK) {
        this.jobSubmitPK = jobSubmitPK;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public Character getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Character jobStatus) {
        this.jobStatus = jobStatus;
    }

    public long getTotalRecs() {
        return totalRecs;
    }

    public void setTotalRecs(long totalRecs) {
        this.totalRecs = totalRecs;
    }

    public long getCurRecs() {
        return curRecs;
    }

    public void setCurRecs(long curRecs) {
        this.curRecs = curRecs;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getResponseUrl() {
        return responseUrl;
    }

    public void setResponseUrl(String responseUrl) {
        this.responseUrl = responseUrl;
    }

    public String getReqFile() {
        return reqFile;
    }

    public void setReqFile(String reqFile) {
        this.reqFile = reqFile;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobSubmitPK != null ? jobSubmitPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof JobSubmit)) {
            return false;
        }
        JobSubmit other = (JobSubmit) object;
        if ((this.jobSubmitPK == null && other.jobSubmitPK != null) || (this.jobSubmitPK != null && !this.jobSubmitPK.equals(other.jobSubmitPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.JobSubmit[ jobSubmitPK=" + jobSubmitPK + " ]";
    }

}
