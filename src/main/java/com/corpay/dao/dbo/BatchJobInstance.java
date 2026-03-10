/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Set;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "BATCH_JOB_INSTANCE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "BatchJobInstance.findAll", query = "SELECT b FROM BatchJobInstance b")})
public class BatchJobInstance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "JOB_INSTANCE_ID")
    private Long jobInstanceId;
    @Column(name = "VERSION")
    private BigInteger version;
    @Basic(optional = false)
    @Column(name = "JOB_NAME")
    private String jobName;
    @Basic(optional = false)
    @Column(name = "JOB_KEY")
    private String jobKey;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobInstanceId", fetch = FetchType.LAZY)
    private Set<BatchJobExecution> batchJobExecutionSet;

    public BatchJobInstance() {
    }

    public BatchJobInstance(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
    }

    public BatchJobInstance(Long jobInstanceId, String jobName, String jobKey) {
        this.jobInstanceId = jobInstanceId;
        this.jobName = jobName;
        this.jobKey = jobKey;
    }

    public Long getJobInstanceId() {
        return jobInstanceId;
    }

    public void setJobInstanceId(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobKey() {
        return jobKey;
    }

    public void setJobKey(String jobKey) {
        this.jobKey = jobKey;
    }

    public Set<BatchJobExecution> getBatchJobExecutionSet() {
        return batchJobExecutionSet;
    }

    public void setBatchJobExecutionSet(Set<BatchJobExecution> batchJobExecutionSet) {
        this.batchJobExecutionSet = batchJobExecutionSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobInstanceId != null ? jobInstanceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BatchJobInstance)) {
            return false;
        }
        BatchJobInstance other = (BatchJobInstance) object;
        if ((this.jobInstanceId == null && other.jobInstanceId != null) || (this.jobInstanceId != null && !this.jobInstanceId.equals(other.jobInstanceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.BatchJobInstance[ jobInstanceId=" + jobInstanceId + " ]";
    }
    
}
