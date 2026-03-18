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
@Table(name = "FAILED_MOBILE_REGISTRATION_ATTEMPT", catalog = "", schema = "DBO")
public class FailedMobileRegistrationAttempt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FailedMobileRegistrationAttemptPK failedMobileRegistrationAttemptPK;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
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

    public FailedMobileRegistrationAttempt() {
    }

    public FailedMobileRegistrationAttempt(FailedMobileRegistrationAttemptPK failedMobileRegistrationAttemptPK) {
        this.failedMobileRegistrationAttemptPK = failedMobileRegistrationAttemptPK;
    }

    public FailedMobileRegistrationAttempt(FailedMobileRegistrationAttemptPK failedMobileRegistrationAttemptPK, String usrId, String crtUsr, Date mdyTs, String mdyUsr) {
        this.failedMobileRegistrationAttemptPK = failedMobileRegistrationAttemptPK;
        this.usrId = usrId;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FailedMobileRegistrationAttempt(String dvcId, Date crtTs) {
        this.failedMobileRegistrationAttemptPK = new FailedMobileRegistrationAttemptPK(dvcId, crtTs);
    }

    public FailedMobileRegistrationAttemptPK getFailedMobileRegistrationAttemptPK() {
        return failedMobileRegistrationAttemptPK;
    }

    public void setFailedMobileRegistrationAttemptPK(FailedMobileRegistrationAttemptPK failedMobileRegistrationAttemptPK) {
        this.failedMobileRegistrationAttemptPK = failedMobileRegistrationAttemptPK;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
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
        hash += (failedMobileRegistrationAttemptPK != null ? failedMobileRegistrationAttemptPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FailedMobileRegistrationAttempt)) {
            return false;
        }
        FailedMobileRegistrationAttempt other = (FailedMobileRegistrationAttempt) object;
        if ((this.failedMobileRegistrationAttemptPK == null && other.failedMobileRegistrationAttemptPK != null) || (this.failedMobileRegistrationAttemptPK != null && !this.failedMobileRegistrationAttemptPK.equals(other.failedMobileRegistrationAttemptPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FailedMobileRegistrationAttempt[ failedMobileRegistrationAttemptPK=" + failedMobileRegistrationAttemptPK + " ]";
    }

}
