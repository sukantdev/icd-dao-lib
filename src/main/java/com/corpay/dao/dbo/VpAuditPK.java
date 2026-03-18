package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class VpAuditPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;
    @Basic(optional = false)
    @Column(name = "APP")
    private String app;
    @Basic(optional = false)
    @Column(name = "FIELD_NAME")
    private String fieldName;

    public VpAuditPK() {
    }

    public VpAuditPK(String userId, String app, String fieldName) {
        this.userId = userId;
        this.app = app;
        this.fieldName = fieldName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        hash += (app != null ? app.hashCode() : 0);
        hash += (fieldName != null ? fieldName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpAuditPK)) {
            return false;
        }
        VpAuditPK other = (VpAuditPK) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        if ((this.app == null && other.app != null) || (this.app != null && !this.app.equals(other.app))) {
            return false;
        }
        if ((this.fieldName == null && other.fieldName != null) || (this.fieldName != null && !this.fieldName.equals(other.fieldName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpAuditPK[ userId=" + userId + ", app=" + app + ", fieldName=" + fieldName + " ]";
    }

}
