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
@Table(name = "APPL_EMAIL_ADDR", catalog = "", schema = "DBO")
public class ApplEmailAddr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApplEmailAddrPK applEmailAddrPK;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR")
    private String emailAddr;
    @Basic(optional = false)
    @Column(name = "CC_EMAIL_ADDR")
    private String ccEmailAddr;
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
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "MAIL_FRQ")
    private Character mailFrq;
    @Basic(optional = false)
    @Column(name = "FROM_EMAIL_ADDR")
    private String fromEmailAddr;
    @Basic(optional = false)
    @Column(name = "BC_EMAIL_ADDR")
    private String bcEmailAddr;

    public ApplEmailAddr() {
    }

    public ApplEmailAddr(ApplEmailAddrPK applEmailAddrPK) {
        this.applEmailAddrPK = applEmailAddrPK;
    }

    public ApplEmailAddr(ApplEmailAddrPK applEmailAddrPK, String emailAddr, String ccEmailAddr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String usrId, Character mailFrq, String fromEmailAddr, String bcEmailAddr) {
        this.applEmailAddrPK = applEmailAddrPK;
        this.emailAddr = emailAddr;
        this.ccEmailAddr = ccEmailAddr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.usrId = usrId;
        this.mailFrq = mailFrq;
        this.fromEmailAddr = fromEmailAddr;
        this.bcEmailAddr = bcEmailAddr;
    }

    public ApplEmailAddr(String entityLvl, String entityId, String applId) {
        this.applEmailAddrPK = new ApplEmailAddrPK(entityLvl, entityId, applId);
    }

    public ApplEmailAddrPK getApplEmailAddrPK() {
        return applEmailAddrPK;
    }

    public void setApplEmailAddrPK(ApplEmailAddrPK applEmailAddrPK) {
        this.applEmailAddrPK = applEmailAddrPK;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getCcEmailAddr() {
        return ccEmailAddr;
    }

    public void setCcEmailAddr(String ccEmailAddr) {
        this.ccEmailAddr = ccEmailAddr;
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

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public Character getMailFrq() {
        return mailFrq;
    }

    public void setMailFrq(Character mailFrq) {
        this.mailFrq = mailFrq;
    }

    public String getFromEmailAddr() {
        return fromEmailAddr;
    }

    public void setFromEmailAddr(String fromEmailAddr) {
        this.fromEmailAddr = fromEmailAddr;
    }

    public String getBcEmailAddr() {
        return bcEmailAddr;
    }

    public void setBcEmailAddr(String bcEmailAddr) {
        this.bcEmailAddr = bcEmailAddr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applEmailAddrPK != null ? applEmailAddrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ApplEmailAddr)) {
            return false;
        }
        ApplEmailAddr other = (ApplEmailAddr) object;
        if ((this.applEmailAddrPK == null && other.applEmailAddrPK != null) || (this.applEmailAddrPK != null && !this.applEmailAddrPK.equals(other.applEmailAddrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ApplEmailAddr[ applEmailAddrPK=" + applEmailAddrPK + " ]";
    }

}
