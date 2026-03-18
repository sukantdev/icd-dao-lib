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
@Table(name = "USR_CRD_WALLET", catalog = "", schema = "DBO")
public class UsrCrdWallet implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrCrdWalletPK usrCrdWalletPK;
    @Basic(optional = false)
    @Column(name = "NICKNAME")
    private String nickname;
    @Basic(optional = false)
    @Column(name = "CRD_TYPE")
    private Character crdType;
    @Basic(optional = false)
    @Column(name = "FAV_CRD_FLG")
    private Character favCrdFlg;
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

    public UsrCrdWallet() {
    }

    public UsrCrdWallet(UsrCrdWalletPK usrCrdWalletPK) {
        this.usrCrdWalletPK = usrCrdWalletPK;
    }

    public UsrCrdWallet(UsrCrdWalletPK usrCrdWalletPK, String nickname, Character crdType, Character favCrdFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrCrdWalletPK = usrCrdWalletPK;
        this.nickname = nickname;
        this.crdType = crdType;
        this.favCrdFlg = favCrdFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrCrdWallet(String crdNbr, String usrId) {
        this.usrCrdWalletPK = new UsrCrdWalletPK(crdNbr, usrId);
    }

    public UsrCrdWalletPK getUsrCrdWalletPK() {
        return usrCrdWalletPK;
    }

    public void setUsrCrdWalletPK(UsrCrdWalletPK usrCrdWalletPK) {
        this.usrCrdWalletPK = usrCrdWalletPK;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Character getCrdType() {
        return crdType;
    }

    public void setCrdType(Character crdType) {
        this.crdType = crdType;
    }

    public Character getFavCrdFlg() {
        return favCrdFlg;
    }

    public void setFavCrdFlg(Character favCrdFlg) {
        this.favCrdFlg = favCrdFlg;
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
        hash += (usrCrdWalletPK != null ? usrCrdWalletPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrCrdWallet)) {
            return false;
        }
        UsrCrdWallet other = (UsrCrdWallet) object;
        if ((this.usrCrdWalletPK == null && other.usrCrdWalletPK != null) || (this.usrCrdWalletPK != null && !this.usrCrdWalletPK.equals(other.usrCrdWalletPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrCrdWallet[ usrCrdWalletPK=" + usrCrdWalletPK + " ]";
    }

}
