package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class RptRerunPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "RUN_ID")
    private String runId;
    @Basic(optional = false)
    @Column(name = "RUN_DT")
    @Temporal(TemporalType.DATE)
    private Date runDt;
    @Basic(optional = false)
    @Column(name = "APPL_ID")
    private String applId;

    public RptRerunPK() {
    }

    public RptRerunPK(String runId, Date runDt, String applId) {
        this.runId = runId;
        this.runDt = runDt;
        this.applId = applId;
    }

    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    public Date getRunDt() {
        return runDt;
    }

    public void setRunDt(Date runDt) {
        this.runDt = runDt;
    }

    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (runId != null ? runId.hashCode() : 0);
        hash += (runDt != null ? runDt.hashCode() : 0);
        hash += (applId != null ? applId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RptRerunPK)) {
            return false;
        }
        RptRerunPK other = (RptRerunPK) object;
        if ((this.runId == null && other.runId != null) || (this.runId != null && !this.runId.equals(other.runId))) {
            return false;
        }
        if ((this.runDt == null && other.runDt != null) || (this.runDt != null && !this.runDt.equals(other.runDt))) {
            return false;
        }
        if ((this.applId == null && other.applId != null) || (this.applId != null && !this.applId.equals(other.applId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RptRerunPK[ runId=" + runId + ", runDt=" + runDt + ", applId=" + applId + " ]";
    }

}
