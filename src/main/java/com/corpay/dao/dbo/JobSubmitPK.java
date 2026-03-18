package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class JobSubmitPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "JOB_TYPE")
    private String jobType;
    @Basic(optional = false)
    @Column(name = "SUBMIT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date submitTs;
    @Basic(optional = false)
    @Column(name = "SUBMIT_USR")
    private String submitUsr;

    public JobSubmitPK() {
    }

    public JobSubmitPK(String jobType, Date submitTs, String submitUsr) {
        this.jobType = jobType;
        this.submitTs = submitTs;
        this.submitUsr = submitUsr;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Date getSubmitTs() {
        return submitTs;
    }

    public void setSubmitTs(Date submitTs) {
        this.submitTs = submitTs;
    }

    public String getSubmitUsr() {
        return submitUsr;
    }

    public void setSubmitUsr(String submitUsr) {
        this.submitUsr = submitUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobType != null ? jobType.hashCode() : 0);
        hash += (submitTs != null ? submitTs.hashCode() : 0);
        hash += (submitUsr != null ? submitUsr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof JobSubmitPK)) {
            return false;
        }
        JobSubmitPK other = (JobSubmitPK) object;
        if ((this.jobType == null && other.jobType != null) || (this.jobType != null && !this.jobType.equals(other.jobType))) {
            return false;
        }
        if ((this.submitTs == null && other.submitTs != null) || (this.submitTs != null && !this.submitTs.equals(other.submitTs))) {
            return false;
        }
        if ((this.submitUsr == null && other.submitUsr != null) || (this.submitUsr != null && !this.submitUsr.equals(other.submitUsr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.JobSubmitPK[ jobType=" + jobType + ", submitTs=" + submitTs + ", submitUsr=" + submitUsr + " ]";
    }

}
