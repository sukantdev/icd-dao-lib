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
@Table(name = "CRD_PREFS", catalog = "", schema = "DBO")
public class CrdPrefs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRD_PREF_ID")
    private String crdPrefId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "SMS_PREF_FLG")
    private Character smsPrefFlg;
    @Basic(optional = false)
    @Column(name = "EMAIL_PREF_FLG")
    private Character emailPrefFlg;
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
    @Column(name = "WEBHOOK_PREF_FLG")
    private Character webhookPrefFlg;

    public CrdPrefs() {
    }

    public CrdPrefs(String crdPrefId) {
        this.crdPrefId = crdPrefId;
    }

    public CrdPrefs(String crdPrefId, String crdNbr, Character smsPrefFlg, Character emailPrefFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character webhookPrefFlg) {
        this.crdPrefId = crdPrefId;
        this.crdNbr = crdNbr;
        this.smsPrefFlg = smsPrefFlg;
        this.emailPrefFlg = emailPrefFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.webhookPrefFlg = webhookPrefFlg;
    }

    public String getCrdPrefId() {
        return crdPrefId;
    }

    public void setCrdPrefId(String crdPrefId) {
        this.crdPrefId = crdPrefId;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Character getSmsPrefFlg() {
        return smsPrefFlg;
    }

    public void setSmsPrefFlg(Character smsPrefFlg) {
        this.smsPrefFlg = smsPrefFlg;
    }

    public Character getEmailPrefFlg() {
        return emailPrefFlg;
    }

    public void setEmailPrefFlg(Character emailPrefFlg) {
        this.emailPrefFlg = emailPrefFlg;
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

    public Character getWebhookPrefFlg() {
        return webhookPrefFlg;
    }

    public void setWebhookPrefFlg(Character webhookPrefFlg) {
        this.webhookPrefFlg = webhookPrefFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdPrefId != null ? crdPrefId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdPrefs)) {
            return false;
        }
        CrdPrefs other = (CrdPrefs) object;
        if ((this.crdPrefId == null && other.crdPrefId != null) || (this.crdPrefId != null && !this.crdPrefId.equals(other.crdPrefId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdPrefs[ crdPrefId=" + crdPrefId + " ]";
    }

}
