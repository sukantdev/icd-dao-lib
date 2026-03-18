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
@Table(name = "TELE_PARTNER", catalog = "", schema = "DBO")
public class TelePartner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTNER_ID")
    private String partnerId;
    @Basic(optional = false)
    @Column(name = "PARTNER_NAME")
    private String partnerName;
    @Basic(optional = false)
    @Column(name = "PARTNER_STATUS")
    private Character partnerStatus;
    @Basic(optional = false)
    @Column(name = "PARTNER_ADDRESS")
    private String partnerAddress;
    @Basic(optional = false)
    @Column(name = "PARTNER_ADDRESS_CITY")
    private String partnerAddressCity;
    @Basic(optional = false)
    @Column(name = "PARTNER_ADDRESS_STATE")
    private String partnerAddressState;
    @Basic(optional = false)
    @Column(name = "PARTNER_ADDRESS_ZIP")
    private String partnerAddressZip;
    @Basic(optional = false)
    @Column(name = "PARTNER_CONTACT_NAME")
    private String partnerContactName;
    @Basic(optional = false)
    @Column(name = "PARTNER_PHONE")
    private String partnerPhone;
    @Basic(optional = false)
    @Column(name = "PARTNER_EMAIL")
    private String partnerEmail;
    @Basic(optional = false)
    @Column(name = "PARTNER_API_URL")
    private String partnerApiUrl;
    @Basic(optional = false)
    @Column(name = "PARTNER_PING_METHOD")
    private Character partnerPingMethod;
    @Basic(optional = false)
    @Column(name = "PARTNER_COMMENTS")
    private String partnerComments;
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
    @Column(name = "POLL_INTERVAL")
    private short pollInterval;
    @Basic(optional = false)
    @Column(name = "MAX_DEVICE_CNT")
    private int maxDeviceCnt;
    @Basic(optional = false)
    @Column(name = "MAX_THREAD_CNT")
    private int maxThreadCnt;
    @Basic(optional = false)
    @Column(name = "SESSION_ID_DURATION")
    private short sessionIdDuration;
    @Basic(optional = false)
    @Column(name = "SESSION_ID_DUR_UNIT")
    private Character sessionIdDurUnit;

    public TelePartner() {
    }

    public TelePartner(String partnerId) {
        this.partnerId = partnerId;
    }

    public TelePartner(String partnerId, String partnerName, Character partnerStatus, String partnerAddress, String partnerAddressCity, String partnerAddressState, String partnerAddressZip, String partnerContactName, String partnerPhone, String partnerEmail, String partnerApiUrl, Character partnerPingMethod, String partnerComments, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, short pollInterval, int maxDeviceCnt, int maxThreadCnt, short sessionIdDuration, Character sessionIdDurUnit) {
        this.partnerId = partnerId;
        this.partnerName = partnerName;
        this.partnerStatus = partnerStatus;
        this.partnerAddress = partnerAddress;
        this.partnerAddressCity = partnerAddressCity;
        this.partnerAddressState = partnerAddressState;
        this.partnerAddressZip = partnerAddressZip;
        this.partnerContactName = partnerContactName;
        this.partnerPhone = partnerPhone;
        this.partnerEmail = partnerEmail;
        this.partnerApiUrl = partnerApiUrl;
        this.partnerPingMethod = partnerPingMethod;
        this.partnerComments = partnerComments;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.pollInterval = pollInterval;
        this.maxDeviceCnt = maxDeviceCnt;
        this.maxThreadCnt = maxThreadCnt;
        this.sessionIdDuration = sessionIdDuration;
        this.sessionIdDurUnit = sessionIdDurUnit;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public Character getPartnerStatus() {
        return partnerStatus;
    }

    public void setPartnerStatus(Character partnerStatus) {
        this.partnerStatus = partnerStatus;
    }

    public String getPartnerAddress() {
        return partnerAddress;
    }

    public void setPartnerAddress(String partnerAddress) {
        this.partnerAddress = partnerAddress;
    }

    public String getPartnerAddressCity() {
        return partnerAddressCity;
    }

    public void setPartnerAddressCity(String partnerAddressCity) {
        this.partnerAddressCity = partnerAddressCity;
    }

    public String getPartnerAddressState() {
        return partnerAddressState;
    }

    public void setPartnerAddressState(String partnerAddressState) {
        this.partnerAddressState = partnerAddressState;
    }

    public String getPartnerAddressZip() {
        return partnerAddressZip;
    }

    public void setPartnerAddressZip(String partnerAddressZip) {
        this.partnerAddressZip = partnerAddressZip;
    }

    public String getPartnerContactName() {
        return partnerContactName;
    }

    public void setPartnerContactName(String partnerContactName) {
        this.partnerContactName = partnerContactName;
    }

    public String getPartnerPhone() {
        return partnerPhone;
    }

    public void setPartnerPhone(String partnerPhone) {
        this.partnerPhone = partnerPhone;
    }

    public String getPartnerEmail() {
        return partnerEmail;
    }

    public void setPartnerEmail(String partnerEmail) {
        this.partnerEmail = partnerEmail;
    }

    public String getPartnerApiUrl() {
        return partnerApiUrl;
    }

    public void setPartnerApiUrl(String partnerApiUrl) {
        this.partnerApiUrl = partnerApiUrl;
    }

    public Character getPartnerPingMethod() {
        return partnerPingMethod;
    }

    public void setPartnerPingMethod(Character partnerPingMethod) {
        this.partnerPingMethod = partnerPingMethod;
    }

    public String getPartnerComments() {
        return partnerComments;
    }

    public void setPartnerComments(String partnerComments) {
        this.partnerComments = partnerComments;
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

    public short getPollInterval() {
        return pollInterval;
    }

    public void setPollInterval(short pollInterval) {
        this.pollInterval = pollInterval;
    }

    public int getMaxDeviceCnt() {
        return maxDeviceCnt;
    }

    public void setMaxDeviceCnt(int maxDeviceCnt) {
        this.maxDeviceCnt = maxDeviceCnt;
    }

    public int getMaxThreadCnt() {
        return maxThreadCnt;
    }

    public void setMaxThreadCnt(int maxThreadCnt) {
        this.maxThreadCnt = maxThreadCnt;
    }

    public short getSessionIdDuration() {
        return sessionIdDuration;
    }

    public void setSessionIdDuration(short sessionIdDuration) {
        this.sessionIdDuration = sessionIdDuration;
    }

    public Character getSessionIdDurUnit() {
        return sessionIdDurUnit;
    }

    public void setSessionIdDurUnit(Character sessionIdDurUnit) {
        this.sessionIdDurUnit = sessionIdDurUnit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partnerId != null ? partnerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TelePartner)) {
            return false;
        }
        TelePartner other = (TelePartner) object;
        if ((this.partnerId == null && other.partnerId != null) || (this.partnerId != null && !this.partnerId.equals(other.partnerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TelePartner[ partnerId=" + partnerId + " ]";
    }

}
