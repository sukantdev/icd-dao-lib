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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "BATCH_JOB_EXECUTION", catalog = "", schema = "DBO")
public class BatchJobExecution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "JOB_EXECUTION_ID")
    private Long jobExecutionId;
    @Column(name = "VERSION")
    private BigInteger version;
    @Basic(optional = false)
    @Column(name = "CREATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "START_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "END_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "EXIT_CODE")
    private String exitCode;
    @Column(name = "EXIT_MESSAGE")
    private String exitMessage;
    @Column(name = "LAST_UPDATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @Column(name = "JOB_CONFIGURATION_LOCATION")
    private String jobConfigurationLocation;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "batchJobExecution", fetch = FetchType.LAZY)
    private BatchJobExecutionContext batchJobExecutionContext;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobExecutionId", fetch = FetchType.LAZY)
    private Set<BatchStepExecution> batchStepExecutionSet;
    @JoinColumn(name = "JOB_INSTANCE_ID", referencedColumnName = "JOB_INSTANCE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private BatchJobInstance jobInstanceId;

    public BatchJobExecution() {
    }

    public BatchJobExecution(Long jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
    }

    public BatchJobExecution(Long jobExecutionId, Date createTime) {
        this.jobExecutionId = jobExecutionId;
        this.createTime = createTime;
    }

    public Long getJobExecutionId() {
        return jobExecutionId;
    }

    public void setJobExecutionId(Long jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExitCode() {
        return exitCode;
    }

    public void setExitCode(String exitCode) {
        this.exitCode = exitCode;
    }

    public String getExitMessage() {
        return exitMessage;
    }

    public void setExitMessage(String exitMessage) {
        this.exitMessage = exitMessage;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getJobConfigurationLocation() {
        return jobConfigurationLocation;
    }

    public void setJobConfigurationLocation(String jobConfigurationLocation) {
        this.jobConfigurationLocation = jobConfigurationLocation;
    }

    public BatchJobExecutionContext getBatchJobExecutionContext() {
        return batchJobExecutionContext;
    }

    public void setBatchJobExecutionContext(BatchJobExecutionContext batchJobExecutionContext) {
        this.batchJobExecutionContext = batchJobExecutionContext;
    }

    public Set<BatchStepExecution> getBatchStepExecutionSet() {
        return batchStepExecutionSet;
    }

    public void setBatchStepExecutionSet(Set<BatchStepExecution> batchStepExecutionSet) {
        this.batchStepExecutionSet = batchStepExecutionSet;
    }

    public BatchJobInstance getJobInstanceId() {
        return jobInstanceId;
    }

    public void setJobInstanceId(BatchJobInstance jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobExecutionId != null ? jobExecutionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof BatchJobExecution)) {
            return false;
        }
        BatchJobExecution other = (BatchJobExecution) object;
        if ((this.jobExecutionId == null && other.jobExecutionId != null) || (this.jobExecutionId != null && !this.jobExecutionId.equals(other.jobExecutionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.BatchJobExecution[ jobExecutionId=" + jobExecutionId + " ]";
    }

}
