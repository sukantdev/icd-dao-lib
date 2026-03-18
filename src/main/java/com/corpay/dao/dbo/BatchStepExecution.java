package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "BATCH_STEP_EXECUTION", catalog = "", schema = "DBO")
public class BatchStepExecution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STEP_EXECUTION_ID")
    private Long stepExecutionId;
    @Basic(optional = false)
    @Column(name = "VERSION")
    private long version;
    @Basic(optional = false)
    @Column(name = "STEP_NAME")
    private String stepName;
    @Basic(optional = false)
    @Column(name = "START_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "END_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "COMMIT_COUNT")
    private BigInteger commitCount;
    @Column(name = "READ_COUNT")
    private BigInteger readCount;
    @Column(name = "FILTER_COUNT")
    private BigInteger filterCount;
    @Column(name = "WRITE_COUNT")
    private BigInteger writeCount;
    @Column(name = "READ_SKIP_COUNT")
    private BigInteger readSkipCount;
    @Column(name = "WRITE_SKIP_COUNT")
    private BigInteger writeSkipCount;
    @Column(name = "PROCESS_SKIP_COUNT")
    private BigInteger processSkipCount;
    @Column(name = "ROLLBACK_COUNT")
    private BigInteger rollbackCount;
    @Column(name = "EXIT_CODE")
    private String exitCode;
    @Column(name = "EXIT_MESSAGE")
    private String exitMessage;
    @Column(name = "LAST_UPDATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "batchStepExecution", fetch = FetchType.LAZY)
    private BatchStepExecutionContext batchStepExecutionContext;
    @JoinColumn(name = "JOB_EXECUTION_ID", referencedColumnName = "JOB_EXECUTION_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private BatchJobExecution jobExecutionId;

    public BatchStepExecution() {
    }

    public BatchStepExecution(Long stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    public BatchStepExecution(Long stepExecutionId, long version, String stepName, Date startTime) {
        this.stepExecutionId = stepExecutionId;
        this.version = version;
        this.stepName = stepName;
        this.startTime = startTime;
    }

    public Long getStepExecutionId() {
        return stepExecutionId;
    }

    public void setStepExecutionId(Long stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
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

    public BigInteger getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(BigInteger commitCount) {
        this.commitCount = commitCount;
    }

    public BigInteger getReadCount() {
        return readCount;
    }

    public void setReadCount(BigInteger readCount) {
        this.readCount = readCount;
    }

    public BigInteger getFilterCount() {
        return filterCount;
    }

    public void setFilterCount(BigInteger filterCount) {
        this.filterCount = filterCount;
    }

    public BigInteger getWriteCount() {
        return writeCount;
    }

    public void setWriteCount(BigInteger writeCount) {
        this.writeCount = writeCount;
    }

    public BigInteger getReadSkipCount() {
        return readSkipCount;
    }

    public void setReadSkipCount(BigInteger readSkipCount) {
        this.readSkipCount = readSkipCount;
    }

    public BigInteger getWriteSkipCount() {
        return writeSkipCount;
    }

    public void setWriteSkipCount(BigInteger writeSkipCount) {
        this.writeSkipCount = writeSkipCount;
    }

    public BigInteger getProcessSkipCount() {
        return processSkipCount;
    }

    public void setProcessSkipCount(BigInteger processSkipCount) {
        this.processSkipCount = processSkipCount;
    }

    public BigInteger getRollbackCount() {
        return rollbackCount;
    }

    public void setRollbackCount(BigInteger rollbackCount) {
        this.rollbackCount = rollbackCount;
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

    public BatchStepExecutionContext getBatchStepExecutionContext() {
        return batchStepExecutionContext;
    }

    public void setBatchStepExecutionContext(BatchStepExecutionContext batchStepExecutionContext) {
        this.batchStepExecutionContext = batchStepExecutionContext;
    }

    public BatchJobExecution getJobExecutionId() {
        return jobExecutionId;
    }

    public void setJobExecutionId(BatchJobExecution jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stepExecutionId != null ? stepExecutionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof BatchStepExecution)) {
            return false;
        }
        BatchStepExecution other = (BatchStepExecution) object;
        if ((this.stepExecutionId == null && other.stepExecutionId != null) || (this.stepExecutionId != null && !this.stepExecutionId.equals(other.stepExecutionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.BatchStepExecution[ stepExecutionId=" + stepExecutionId + " ]";
    }

}
