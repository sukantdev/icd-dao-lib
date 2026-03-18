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
@Table(name = "APPLICATION_SERVICE_COUNTERS", catalog = "", schema = "DBO")
public class ApplicationServiceCounters implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApplicationServiceCountersPK applicationServiceCountersPK;
    @Basic(optional = false)
    @Column(name = "COUNTER_AMT")
    private int counterAmt;
    @Basic(optional = false)
    @Column(name = "COUNTER_RESET_DT")
    @Temporal(TemporalType.DATE)
    private Date counterResetDt;
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

    public ApplicationServiceCounters() {
    }

    public ApplicationServiceCounters(ApplicationServiceCountersPK applicationServiceCountersPK) {
        this.applicationServiceCountersPK = applicationServiceCountersPK;
    }

    public ApplicationServiceCounters(ApplicationServiceCountersPK applicationServiceCountersPK, int counterAmt, Date counterResetDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applicationServiceCountersPK = applicationServiceCountersPK;
        this.counterAmt = counterAmt;
        this.counterResetDt = counterResetDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ApplicationServiceCounters(String applicationDesc, String limitTypeDesc, String identifierTypeCd, String identifierValue) {
        this.applicationServiceCountersPK = new ApplicationServiceCountersPK(applicationDesc, limitTypeDesc, identifierTypeCd, identifierValue);
    }

    public ApplicationServiceCountersPK getApplicationServiceCountersPK() {
        return applicationServiceCountersPK;
    }

    public void setApplicationServiceCountersPK(ApplicationServiceCountersPK applicationServiceCountersPK) {
        this.applicationServiceCountersPK = applicationServiceCountersPK;
    }

    public int getCounterAmt() {
        return counterAmt;
    }

    public void setCounterAmt(int counterAmt) {
        this.counterAmt = counterAmt;
    }

    public Date getCounterResetDt() {
        return counterResetDt;
    }

    public void setCounterResetDt(Date counterResetDt) {
        this.counterResetDt = counterResetDt;
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
        hash += (applicationServiceCountersPK != null ? applicationServiceCountersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ApplicationServiceCounters)) {
            return false;
        }
        ApplicationServiceCounters other = (ApplicationServiceCounters) object;
        if ((this.applicationServiceCountersPK == null && other.applicationServiceCountersPK != null) || (this.applicationServiceCountersPK != null && !this.applicationServiceCountersPK.equals(other.applicationServiceCountersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ApplicationServiceCounters[ applicationServiceCountersPK=" + applicationServiceCountersPK + " ]";
    }

}
