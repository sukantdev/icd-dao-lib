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
@Table(name = "EMAIL_EXC", catalog = "", schema = "DBO")
public class EmailExc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmailExcPK emailExcPK;
    @Basic(optional = false)
    @Column(name = "MAIL_FREQ")
    private Character mailFreq;
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
    @Column(name = "EXC_STAT")
    private Character excStat;

    public EmailExc() {
    }

    public EmailExc(EmailExcPK emailExcPK) {
        this.emailExcPK = emailExcPK;
    }

    public EmailExc(EmailExcPK emailExcPK, Character mailFreq, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character excStat) {
        this.emailExcPK = emailExcPK;
        this.mailFreq = mailFreq;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.excStat = excStat;
    }

    public EmailExc(String usrId, String entityLvl, String entityId, String node) {
        this.emailExcPK = new EmailExcPK(usrId, entityLvl, entityId, node);
    }

    public EmailExcPK getEmailExcPK() {
        return emailExcPK;
    }

    public void setEmailExcPK(EmailExcPK emailExcPK) {
        this.emailExcPK = emailExcPK;
    }

    public Character getMailFreq() {
        return mailFreq;
    }

    public void setMailFreq(Character mailFreq) {
        this.mailFreq = mailFreq;
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

    public Character getExcStat() {
        return excStat;
    }

    public void setExcStat(Character excStat) {
        this.excStat = excStat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emailExcPK != null ? emailExcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof EmailExc)) {
            return false;
        }
        EmailExc other = (EmailExc) object;
        if ((this.emailExcPK == null && other.emailExcPK != null) || (this.emailExcPK != null && !this.emailExcPK.equals(other.emailExcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EmailExc[ emailExcPK=" + emailExcPK + " ]";
    }

}
