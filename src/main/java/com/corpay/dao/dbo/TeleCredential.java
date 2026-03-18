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
@Table(name = "TELE_CREDENTIAL", catalog = "", schema = "DBO")
public class TeleCredential implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TeleCredentialPK teleCredentialPK;
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @Column(name = "DBNAME")
    private String dbname;
    @Basic(optional = false)
    @Column(name = "SESSION_ID")
    private String sessionId;
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
    @Column(name = "LAST_SESSION_ID_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSessionIdTs;
    @Basic(optional = false)
    @Column(name = "URL")
    private String url;
    @Basic(optional = false)
    @Column(name = "PROVIDER_EMAIL_1")
    private String providerEmail1;
    @Basic(optional = false)
    @Column(name = "PROVIDER_EMAIL_2")
    private String providerEmail2;

    public TeleCredential() {
    }

    public TeleCredential(TeleCredentialPK teleCredentialPK) {
        this.teleCredentialPK = teleCredentialPK;
    }

    public TeleCredential(TeleCredentialPK teleCredentialPK, String userId, String password, String dbname, String sessionId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Date lastSessionIdTs, String url, String providerEmail1, String providerEmail2) {
        this.teleCredentialPK = teleCredentialPK;
        this.userId = userId;
        this.password = password;
        this.dbname = dbname;
        this.sessionId = sessionId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.lastSessionIdTs = lastSessionIdTs;
        this.url = url;
        this.providerEmail1 = providerEmail1;
        this.providerEmail2 = providerEmail2;
    }

    public TeleCredential(String custId, String partnerId) {
        this.teleCredentialPK = new TeleCredentialPK(custId, partnerId);
    }

    public TeleCredentialPK getTeleCredentialPK() {
        return teleCredentialPK;
    }

    public void setTeleCredentialPK(TeleCredentialPK teleCredentialPK) {
        this.teleCredentialPK = teleCredentialPK;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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

    public Date getLastSessionIdTs() {
        return lastSessionIdTs;
    }

    public void setLastSessionIdTs(Date lastSessionIdTs) {
        this.lastSessionIdTs = lastSessionIdTs;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProviderEmail1() {
        return providerEmail1;
    }

    public void setProviderEmail1(String providerEmail1) {
        this.providerEmail1 = providerEmail1;
    }

    public String getProviderEmail2() {
        return providerEmail2;
    }

    public void setProviderEmail2(String providerEmail2) {
        this.providerEmail2 = providerEmail2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teleCredentialPK != null ? teleCredentialPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TeleCredential)) {
            return false;
        }
        TeleCredential other = (TeleCredential) object;
        if ((this.teleCredentialPK == null && other.teleCredentialPK != null) || (this.teleCredentialPK != null && !this.teleCredentialPK.equals(other.teleCredentialPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TeleCredential[ teleCredentialPK=" + teleCredentialPK + " ]";
    }

}
