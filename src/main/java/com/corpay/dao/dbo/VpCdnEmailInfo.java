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
@Table(name = "VP_CDN_EMAIL_INFO", catalog = "", schema = "DBO")
public class VpCdnEmailInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Basic(optional = false)
    @Column(name = "MSG_ID")
    private String msgId;
    @Basic(optional = false)
    @Column(name = "REPLY_TO_ADDR")
    private String replyToAddr;
    @Basic(optional = false)
    @Column(name = "EMAIL_TO_ADDR")
    private String emailToAddr;
    @Basic(optional = false)
    @Column(name = "EMAIL_CC_ADDR")
    private String emailCcAddr;
    @Basic(optional = false)
    @Column(name = "EMAIL_BCC_ADDR")
    private String emailBccAddr;
    @Basic(optional = false)
    @Column(name = "MSG_BDY_TXT")
    private String msgBdyTxt;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public VpCdnEmailInfo() {
    }

    public VpCdnEmailInfo(String emailId) {
        this.emailId = emailId;
    }

    public VpCdnEmailInfo(String emailId, String msgId, String replyToAddr, String emailToAddr, String emailCcAddr, String emailBccAddr, String msgBdyTxt, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.emailId = emailId;
        this.msgId = msgId;
        this.replyToAddr = replyToAddr;
        this.emailToAddr = emailToAddr;
        this.emailCcAddr = emailCcAddr;
        this.emailBccAddr = emailBccAddr;
        this.msgBdyTxt = msgBdyTxt;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getReplyToAddr() {
        return replyToAddr;
    }

    public void setReplyToAddr(String replyToAddr) {
        this.replyToAddr = replyToAddr;
    }

    public String getEmailToAddr() {
        return emailToAddr;
    }

    public void setEmailToAddr(String emailToAddr) {
        this.emailToAddr = emailToAddr;
    }

    public String getEmailCcAddr() {
        return emailCcAddr;
    }

    public void setEmailCcAddr(String emailCcAddr) {
        this.emailCcAddr = emailCcAddr;
    }

    public String getEmailBccAddr() {
        return emailBccAddr;
    }

    public void setEmailBccAddr(String emailBccAddr) {
        this.emailBccAddr = emailBccAddr;
    }

    public String getMsgBdyTxt() {
        return msgBdyTxt;
    }

    public void setMsgBdyTxt(String msgBdyTxt) {
        this.msgBdyTxt = msgBdyTxt;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emailId != null ? emailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpCdnEmailInfo)) {
            return false;
        }
        VpCdnEmailInfo other = (VpCdnEmailInfo) object;
        if ((this.emailId == null && other.emailId != null) || (this.emailId != null && !this.emailId.equals(other.emailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCdnEmailInfo[ emailId=" + emailId + " ]";
    }

}
