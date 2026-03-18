package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class UserActivitiesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACTIVITY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activityTs;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "APP_NM")
    private String appNm;
    @Basic(optional = false)
    @Column(name = "SOURCE_TXT")
    private String sourceTxt;

    public UserActivitiesPK() {
    }

    public UserActivitiesPK(Date activityTs, String usrId, String appNm, String sourceTxt) {
        this.activityTs = activityTs;
        this.usrId = usrId;
        this.appNm = appNm;
        this.sourceTxt = sourceTxt;
    }

    public Date getActivityTs() {
        return activityTs;
    }

    public void setActivityTs(Date activityTs) {
        this.activityTs = activityTs;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getAppNm() {
        return appNm;
    }

    public void setAppNm(String appNm) {
        this.appNm = appNm;
    }

    public String getSourceTxt() {
        return sourceTxt;
    }

    public void setSourceTxt(String sourceTxt) {
        this.sourceTxt = sourceTxt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activityTs != null ? activityTs.hashCode() : 0);
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (appNm != null ? appNm.hashCode() : 0);
        hash += (sourceTxt != null ? sourceTxt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UserActivitiesPK)) {
            return false;
        }
        UserActivitiesPK other = (UserActivitiesPK) object;
        if ((this.activityTs == null && other.activityTs != null) || (this.activityTs != null && !this.activityTs.equals(other.activityTs))) {
            return false;
        }
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.appNm == null && other.appNm != null) || (this.appNm != null && !this.appNm.equals(other.appNm))) {
            return false;
        }
        if ((this.sourceTxt == null && other.sourceTxt != null) || (this.sourceTxt != null && !this.sourceTxt.equals(other.sourceTxt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UserActivitiesPK[ activityTs=" + activityTs + ", usrId=" + usrId + ", appNm=" + appNm + ", sourceTxt=" + sourceTxt + " ]";
    }

}
