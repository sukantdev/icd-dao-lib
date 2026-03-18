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
@Table(name = "BATCH_STEP_EXECUTION_CONTEXT", catalog = "", schema = "DBO")
public class BatchStepExecutionContext implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STEP_EXECUTION_ID")
    private Long stepExecutionId;
    @Basic(optional = false)
    @Column(name = "SHORT_CONTEXT")
    private String shortContext;
    @Lob
    @Column(name = "SERIALIZED_CONTEXT")
    private String serializedContext;
    @Basic(optional = false)
    @Column(name = "DB2_GENERATED_ROWID_FOR_LOBS")
    private Serializable db2GeneratedRowidForLobs;
    @JoinColumn(name = "STEP_EXECUTION_ID", referencedColumnName = "STEP_EXECUTION_ID", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private BatchStepExecution batchStepExecution;

    public BatchStepExecutionContext() {
    }

    public BatchStepExecutionContext(Long stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    public BatchStepExecutionContext(Long stepExecutionId, String shortContext, Serializable db2GeneratedRowidForLobs) {
        this.stepExecutionId = stepExecutionId;
        this.shortContext = shortContext;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public Long getStepExecutionId() {
        return stepExecutionId;
    }

    public void setStepExecutionId(Long stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
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

    public BatchStepExecution getBatchStepExecution() {
        return batchStepExecution;
    }

    public void setBatchStepExecution(BatchStepExecution batchStepExecution) {
        this.batchStepExecution = batchStepExecution;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stepExecutionId != null ? stepExecutionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof BatchStepExecutionContext)) {
            return false;
        }
        BatchStepExecutionContext other = (BatchStepExecutionContext) object;
        if ((this.stepExecutionId == null && other.stepExecutionId != null) || (this.stepExecutionId != null && !this.stepExecutionId.equals(other.stepExecutionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.BatchStepExecutionContext[ stepExecutionId=" + stepExecutionId + " ]";
    }

}
