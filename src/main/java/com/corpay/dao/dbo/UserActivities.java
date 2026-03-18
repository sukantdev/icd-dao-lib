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
@Table(name = "USER_ACTIVITIES", catalog = "", schema = "DBO")
public class UserActivities implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserActivitiesPK userActivitiesPK;
    @Basic(optional = false)
    @Column(name = "USR_ACTION_TXT")
    private String usrActionTxt;
    @Basic(optional = false)
    @Column(name = "IP_ADDR")
    private String ipAddr;
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

    public UserActivities() {
    }

    public UserActivities(UserActivitiesPK userActivitiesPK) {
        this.userActivitiesPK = userActivitiesPK;
    }

    public UserActivities(UserActivitiesPK userActivitiesPK, String usrActionTxt, String ipAddr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.userActivitiesPK = userActivitiesPK;
        this.usrActionTxt = usrActionTxt;
        this.ipAddr = ipAddr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UserActivities(Date activityTs, String usrId, String appNm, String sourceTxt) {
        this.userActivitiesPK = new UserActivitiesPK(activityTs, usrId, appNm, sourceTxt);
    }

    public UserActivitiesPK getUserActivitiesPK() {
        return userActivitiesPK;
    }

    public void setUserActivitiesPK(UserActivitiesPK userActivitiesPK) {
        this.userActivitiesPK = userActivitiesPK;
    }

    public String getUsrActionTxt() {
        return usrActionTxt;
    }

    public void setUsrActionTxt(String usrActionTxt) {
        this.usrActionTxt = usrActionTxt;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
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
        hash += (userActivitiesPK != null ? userActivitiesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UserActivities)) {
            return false;
        }
        UserActivities other = (UserActivities) object;
        if ((this.userActivitiesPK == null && other.userActivitiesPK != null) || (this.userActivitiesPK != null && !this.userActivitiesPK.equals(other.userActivitiesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UserActivities[ userActivitiesPK=" + userActivitiesPK + " ]";
    }

}
