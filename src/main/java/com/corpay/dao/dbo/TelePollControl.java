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
@Table(name = "TELE_POLL_CONTROL", catalog = "", schema = "DBO")
public class TelePollControl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROVIDER_ID")
    private String providerId;
    @Basic(optional = false)
    @Column(name = "START_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTs;
    @Basic(optional = false)
    @Column(name = "STAT")
    private Character stat;
    @Basic(optional = false)
    @Column(name = "CMPLTD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpltdTs;
    @Basic(optional = false)
    @Column(name = "SUCCESSFUL_CNT")
    private int successfulCnt;
    @Basic(optional = false)
    @Column(name = "FAILED_CNT")
    private int failedCnt;
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

    public TelePollControl() {
    }

    public TelePollControl(String providerId) {
        this.providerId = providerId;
    }

    public TelePollControl(String providerId, Date startTs, Character stat, Date cmpltdTs, int successfulCnt, int failedCnt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.providerId = providerId;
        this.startTs = startTs;
        this.stat = stat;
        this.cmpltdTs = cmpltdTs;
        this.successfulCnt = successfulCnt;
        this.failedCnt = failedCnt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public Date getStartTs() {
        return startTs;
    }

    public void setStartTs(Date startTs) {
        this.startTs = startTs;
    }

    public Character getStat() {
        return stat;
    }

    public void setStat(Character stat) {
        this.stat = stat;
    }

    public Date getCmpltdTs() {
        return cmpltdTs;
    }

    public void setCmpltdTs(Date cmpltdTs) {
        this.cmpltdTs = cmpltdTs;
    }

    public int getSuccessfulCnt() {
        return successfulCnt;
    }

    public void setSuccessfulCnt(int successfulCnt) {
        this.successfulCnt = successfulCnt;
    }

    public int getFailedCnt() {
        return failedCnt;
    }

    public void setFailedCnt(int failedCnt) {
        this.failedCnt = failedCnt;
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
        hash += (providerId != null ? providerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TelePollControl)) {
            return false;
        }
        TelePollControl other = (TelePollControl) object;
        if ((this.providerId == null && other.providerId != null) || (this.providerId != null && !this.providerId.equals(other.providerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePollControl[ providerId=" + providerId + " ]";
    }

}
