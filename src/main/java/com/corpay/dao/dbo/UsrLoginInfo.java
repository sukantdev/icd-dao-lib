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
@Table(name = "USR_LOGIN_INFO", catalog = "", schema = "DBO")
public class UsrLoginInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrLoginInfoPK usrLoginInfoPK;
    @Basic(optional = false)
    @Column(name = "USR_FULL_NM")
    private String usrFullNm;
    @Basic(optional = false)
    @Column(name = "USR_EMAIL_ADDR")
    private String usrEmailAddr;
    @Basic(optional = false)
    @Column(name = "USR_LOGIN_NM")
    private String usrLoginNm;
    @Basic(optional = false)
    @Column(name = "USR_ACS_LVL")
    private String usrAcsLvl;
    @Basic(optional = false)
    @Column(name = "PSWD")
    private String pswd;
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

    public UsrLoginInfo() {
    }

    public UsrLoginInfo(UsrLoginInfoPK usrLoginInfoPK) {
        this.usrLoginInfoPK = usrLoginInfoPK;
    }

    public UsrLoginInfo(UsrLoginInfoPK usrLoginInfoPK, String usrFullNm, String usrEmailAddr, String usrLoginNm, String usrAcsLvl, String pswd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrLoginInfoPK = usrLoginInfoPK;
        this.usrFullNm = usrFullNm;
        this.usrEmailAddr = usrEmailAddr;
        this.usrLoginNm = usrLoginNm;
        this.usrAcsLvl = usrAcsLvl;
        this.pswd = pswd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrLoginInfo(String applNbr, String scrnId, int rcdNbr) {
        this.usrLoginInfoPK = new UsrLoginInfoPK(applNbr, scrnId, rcdNbr);
    }

    public UsrLoginInfoPK getUsrLoginInfoPK() {
        return usrLoginInfoPK;
    }

    public void setUsrLoginInfoPK(UsrLoginInfoPK usrLoginInfoPK) {
        this.usrLoginInfoPK = usrLoginInfoPK;
    }

    public String getUsrFullNm() {
        return usrFullNm;
    }

    public void setUsrFullNm(String usrFullNm) {
        this.usrFullNm = usrFullNm;
    }

    public String getUsrEmailAddr() {
        return usrEmailAddr;
    }

    public void setUsrEmailAddr(String usrEmailAddr) {
        this.usrEmailAddr = usrEmailAddr;
    }

    public String getUsrLoginNm() {
        return usrLoginNm;
    }

    public void setUsrLoginNm(String usrLoginNm) {
        this.usrLoginNm = usrLoginNm;
    }

    public String getUsrAcsLvl() {
        return usrAcsLvl;
    }

    public void setUsrAcsLvl(String usrAcsLvl) {
        this.usrAcsLvl = usrAcsLvl;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
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
        hash += (usrLoginInfoPK != null ? usrLoginInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrLoginInfo)) {
            return false;
        }
        UsrLoginInfo other = (UsrLoginInfo) object;
        if ((this.usrLoginInfoPK == null && other.usrLoginInfoPK != null) || (this.usrLoginInfoPK != null && !this.usrLoginInfoPK.equals(other.usrLoginInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrLoginInfo[ usrLoginInfoPK=" + usrLoginInfoPK + " ]";
    }

}
