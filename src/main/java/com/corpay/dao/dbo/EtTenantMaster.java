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
@Table(name = "ET_TENANT_MASTER", catalog = "", schema = "DBO")
public class EtTenantMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TENANT_ID")
    private String tenantId;
    @Basic(optional = false)
    @Column(name = "RQSTD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rqstdTs;
    @Basic(optional = false)
    @Column(name = "XREF_TENANT_ID")
    private String xrefTenantId;
    @Basic(optional = false)
    @Column(name = "COMPANY_NM")
    private String companyNm;
    @Basic(optional = false)
    @Column(name = "ACTIVITY_FLG")
    private Character activityFlg;
    @Basic(optional = false)
    @Column(name = "LAST_FILE_RCVD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastFileRcvd;
    @Basic(optional = false)
    @Column(name = "TENANT_PIN")
    private int tenantPin;
    @Basic(optional = false)
    @Column(name = "TEST_MODE")
    private Character testMode;
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
    @Basic(optional = false)
    @Column(name = "ACCT_SYSTEM")
    private String acctSystem;
    @Basic(optional = false)
    @Column(name = "WS_USER_NAME")
    private String wsUserName;
    @Basic(optional = false)
    @Column(name = "WS_PASSWORD")
    private String wsPassword;
    @Basic(optional = false)
    @Column(name = "SE_CUST_ID")
    private String seCustId;

    public EtTenantMaster() {
    }

    public EtTenantMaster(String tenantId) {
        this.tenantId = tenantId;
    }

    public EtTenantMaster(String tenantId, Date rqstdTs, String xrefTenantId, String companyNm, Character activityFlg, Date lastFileRcvd, int tenantPin, Character testMode, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String acctSystem, String wsUserName, String wsPassword, String seCustId) {
        this.tenantId = tenantId;
        this.rqstdTs = rqstdTs;
        this.xrefTenantId = xrefTenantId;
        this.companyNm = companyNm;
        this.activityFlg = activityFlg;
        this.lastFileRcvd = lastFileRcvd;
        this.tenantPin = tenantPin;
        this.testMode = testMode;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.acctSystem = acctSystem;
        this.wsUserName = wsUserName;
        this.wsPassword = wsPassword;
        this.seCustId = seCustId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Date getRqstdTs() {
        return rqstdTs;
    }

    public void setRqstdTs(Date rqstdTs) {
        this.rqstdTs = rqstdTs;
    }

    public String getXrefTenantId() {
        return xrefTenantId;
    }

    public void setXrefTenantId(String xrefTenantId) {
        this.xrefTenantId = xrefTenantId;
    }

    public String getCompanyNm() {
        return companyNm;
    }

    public void setCompanyNm(String companyNm) {
        this.companyNm = companyNm;
    }

    public Character getActivityFlg() {
        return activityFlg;
    }

    public void setActivityFlg(Character activityFlg) {
        this.activityFlg = activityFlg;
    }

    public Date getLastFileRcvd() {
        return lastFileRcvd;
    }

    public void setLastFileRcvd(Date lastFileRcvd) {
        this.lastFileRcvd = lastFileRcvd;
    }

    public int getTenantPin() {
        return tenantPin;
    }

    public void setTenantPin(int tenantPin) {
        this.tenantPin = tenantPin;
    }

    public Character getTestMode() {
        return testMode;
    }

    public void setTestMode(Character testMode) {
        this.testMode = testMode;
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

    public String getAcctSystem() {
        return acctSystem;
    }

    public void setAcctSystem(String acctSystem) {
        this.acctSystem = acctSystem;
    }

    public String getWsUserName() {
        return wsUserName;
    }

    public void setWsUserName(String wsUserName) {
        this.wsUserName = wsUserName;
    }

    public String getWsPassword() {
        return wsPassword;
    }

    public void setWsPassword(String wsPassword) {
        this.wsPassword = wsPassword;
    }

    public String getSeCustId() {
        return seCustId;
    }

    public void setSeCustId(String seCustId) {
        this.seCustId = seCustId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tenantId != null ? tenantId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof EtTenantMaster)) {
            return false;
        }
        EtTenantMaster other = (EtTenantMaster) object;
        if ((this.tenantId == null && other.tenantId != null) || (this.tenantId != null && !this.tenantId.equals(other.tenantId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EtTenantMaster[ tenantId=" + tenantId + " ]";
    }

}
