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
@Table(name = "CRD_WALLET_EMAILS", catalog = "", schema = "DBO")
public class CrdWalletEmails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdWalletEmailsPK crdWalletEmailsPK;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "AUTH_APPROV_CD")
    private int authApprovCd;
    @Basic(optional = false)
    @Column(name = "AUTH_APPROV_CD_EXPR_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authApprovCdExprTs;
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
    @Column(name = "ID_NBR")
    private int idNbr;
    @Basic(optional = false)
    @Column(name = "FIRST_NM")
    private String firstNm;
    @Basic(optional = false)
    @Column(name = "LAST_NM")
    private String lastNm;
    @Basic(optional = false)
    @Column(name = "PHONE_NBR")
    private String phoneNbr;
    @Basic(optional = false)
    @Column(name = "INVITATION_SENT_DT")
    @Temporal(TemporalType.DATE)
    private Date invitationSentDt;

    public CrdWalletEmails() {
    }

    public CrdWalletEmails(CrdWalletEmailsPK crdWalletEmailsPK) {
        this.crdWalletEmailsPK = crdWalletEmailsPK;
    }

    public CrdWalletEmails(CrdWalletEmailsPK crdWalletEmailsPK, String usrId, int authApprovCd, Date authApprovCdExprTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, int idNbr, String firstNm, String lastNm, String phoneNbr, Date invitationSentDt) {
        this.crdWalletEmailsPK = crdWalletEmailsPK;
        this.usrId = usrId;
        this.authApprovCd = authApprovCd;
        this.authApprovCdExprTs = authApprovCdExprTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.idNbr = idNbr;
        this.firstNm = firstNm;
        this.lastNm = lastNm;
        this.phoneNbr = phoneNbr;
        this.invitationSentDt = invitationSentDt;
    }

    public CrdWalletEmails(String crdTknNbr, String emailAddr) {
        this.crdWalletEmailsPK = new CrdWalletEmailsPK(crdTknNbr, emailAddr);
    }

    public CrdWalletEmailsPK getCrdWalletEmailsPK() {
        return crdWalletEmailsPK;
    }

    public void setCrdWalletEmailsPK(CrdWalletEmailsPK crdWalletEmailsPK) {
        this.crdWalletEmailsPK = crdWalletEmailsPK;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public int getAuthApprovCd() {
        return authApprovCd;
    }

    public void setAuthApprovCd(int authApprovCd) {
        this.authApprovCd = authApprovCd;
    }

    public Date getAuthApprovCdExprTs() {
        return authApprovCdExprTs;
    }

    public void setAuthApprovCdExprTs(Date authApprovCdExprTs) {
        this.authApprovCdExprTs = authApprovCdExprTs;
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

    public int getIdNbr() {
        return idNbr;
    }

    public void setIdNbr(int idNbr) {
        this.idNbr = idNbr;
    }

    public String getFirstNm() {
        return firstNm;
    }

    public void setFirstNm(String firstNm) {
        this.firstNm = firstNm;
    }

    public String getLastNm() {
        return lastNm;
    }

    public void setLastNm(String lastNm) {
        this.lastNm = lastNm;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public Date getInvitationSentDt() {
        return invitationSentDt;
    }

    public void setInvitationSentDt(Date invitationSentDt) {
        this.invitationSentDt = invitationSentDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdWalletEmailsPK != null ? crdWalletEmailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdWalletEmails)) {
            return false;
        }
        CrdWalletEmails other = (CrdWalletEmails) object;
        if ((this.crdWalletEmailsPK == null && other.crdWalletEmailsPK != null) || (this.crdWalletEmailsPK != null && !this.crdWalletEmailsPK.equals(other.crdWalletEmailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdWalletEmails[ crdWalletEmailsPK=" + crdWalletEmailsPK + " ]";
    }

}
