package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "BATCH_JOB_EXECUTION_CONTEXT", catalog = "", schema = "DBO")
public class BatchJobExecutionContext implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "JOB_EXECUTION_ID")
    private Long jobExecutionId;
    @Basic(optional = false)
    @Column(name = "SHORT_CONTEXT")
    private String shortContext;
    @Lob
    @Column(name = "SERIALIZED_CONTEXT")
    private String serializedContext;
    @Basic(optional = false)
    @Column(name = "DB2_GENERATED_ROWID_FOR_LOBS")
    private Serializable db2GeneratedRowidForLobs;
    @JoinColumn(name = "JOB_EXECUTION_ID", referencedColumnName = "JOB_EXECUTION_ID", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private BatchJobExecution batchJobExecution;

    public BatchJobExecutionContext() {
    }

    public BatchJobExecutionContext(Long jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
    }

    public BatchJobExecutionContext(Long jobExecutionId, String shortContext, Serializable db2GeneratedRowidForLobs) {
        this.jobExecutionId = jobExecutionId;
        this.shortContext = shortContext;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public Long getJobExecutionId() {
        return jobExecutionId;
    }

    public void setJobExecutionId(Long jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
    }

    public String getShortContext() {
        return shortContext;
    }

    public void setShortContext(String shortContext) {
        this.shortContext = shortContext;
    }

    public String getSerializedContext() {
        return serializedContext;
    }

    public void setSerializedContext(String serializedContext) {
        this.serializedContext = serializedContext;
    }

    public Serializable getDb2GeneratedRowidForLobs() {
        return db2GeneratedRowidForLobs;
    }

    public void setDb2GeneratedRowidForLobs(Serializable db2GeneratedRowidForLobs) {
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public BatchJobExecution getBatchJobExecution() {
        return batchJobExecution;
    }

    public void setBatchJobExecution(BatchJobExecution batchJobExecution) {
        this.batchJobExecution = batchJobExecution;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobExecutionId != null ? jobExecutionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof BatchJobExecutionContext)) {
            return false;
        }
        BatchJobExecutionContext other = (BatchJobExecutionContext) object;
        if ((this.jobExecutionId == null && other.jobExecutionId != null) || (this.jobExecutionId != null && !this.jobExecutionId.equals(other.jobExecutionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.BatchJobExecutionContext[ jobExecutionId=" + jobExecutionId + " ]";
    }

}
